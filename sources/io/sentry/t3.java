package io.sentry;

import io.sentry.k8;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes3.dex */
final class t3 implements Runnable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Charset f84191d = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f84192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f84193c;

    t3(v7 v7Var, b1 b1Var) {
        this.f84192b = v7Var;
        this.f84193c = b1Var;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f84191d));
            try {
                String line = bufferedReader.readLine();
                this.f84192b.getLogger().c(g7.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateF = l.f(line);
                bufferedReader.close();
                return dateF;
            } finally {
            }
        } catch (IOException e10) {
            this.f84192b.getLogger().a(g7.ERROR, "Error reading the crash marker file.", e10);
            return null;
        } catch (IllegalArgumentException e11) {
            this.f84192b.getLogger().b(g7.ERROR, e11, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f84192b.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f84192b.getLogger().c(g7.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f84192b.isEnableAutoSessionTracking()) {
            this.f84192b.getLogger().c(g7.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f84192b.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).C()) {
            this.f84192b.getLogger().c(g7.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileX = io.sentry.cache.f.x(cacheDirPath);
        h1 serializer = this.f84192b.getSerializer();
        if (fileX.exists()) {
            this.f84192b.getLogger().c(g7.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileX), f84191d));
                try {
                    k8 k8Var = (k8) serializer.c(bufferedReader, k8.class);
                    if (k8Var == null) {
                        this.f84192b.getLogger().c(g7.ERROR, "Stream from path %s resulted in a null envelope.", fileX.getAbsolutePath());
                    } else {
                        File file = new File(this.f84192b.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f84192b.getLogger().c(g7.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f84192b.getLogger().c(g7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            k8Var.p(k8.b.Crashed, null, true);
                            date = dateA;
                        }
                        if (k8Var.f() == null) {
                            k8Var.d(date);
                        }
                        this.f84193c.z(u5.a(serializer, k8Var, this.f84192b.getSdkVersion()));
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                this.f84192b.getLogger().a(g7.ERROR, "Error processing previous session.", th2);
            }
            if (fileX.delete()) {
                return;
            }
            this.f84192b.getLogger().c(g7.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
