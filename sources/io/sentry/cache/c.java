package io.sentry.cache;

import io.sentry.f7;
import io.sentry.g7;
import io.sentry.h1;
import io.sentry.k8;
import io.sentry.u5;
import io.sentry.u6;
import io.sentry.util.q;
import io.sentry.util.w;
import io.sentry.v7;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes3.dex */
public abstract class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected static final Charset f83313f = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected v7 f83314b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final io.sentry.util.q f83315c = new io.sentry.util.q(new q.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.q.a
        public final Object a() {
            return this.f83312a.f83314b.getSerializer();
        }
    });

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected final File f83316d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f83317e;

    c(v7 v7Var, String str, int i10) {
        w.c(str, "Directory is required.");
        this.f83314b = (v7) w.c(v7Var, "SentryOptions is required.");
        this.f83316d = new File(str);
        this.f83317e = i10;
    }

    private u5 e(u5 u5Var, u6 u6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = u5Var.c().iterator();
        while (it.hasNext()) {
            arrayList.add((u6) it.next());
        }
        arrayList.add(u6Var);
        return new u5(u5Var.b(), arrayList);
    }

    private k8 f(u5 u5Var) {
        for (u6 u6Var : u5Var.c()) {
            if (i(u6Var)) {
                return n(u6Var);
            }
        }
        return null;
    }

    private boolean i(u6 u6Var) {
        if (u6Var == null) {
            return false;
        }
        return u6Var.J().b().equals(f7.Session);
    }

    private boolean j(u5 u5Var) {
        return u5Var.c().iterator().hasNext();
    }

    private boolean k(k8 k8Var) {
        return k8Var.l().equals(k8.b.Ok) && k8Var.j() != null;
    }

    private void l(File file, File[] fileArr) {
        Boolean boolG;
        u6 u6VarG;
        k8 k8VarN;
        u5 u5VarM = m(file);
        if (u5VarM == null || !j(u5VarM)) {
            return;
        }
        this.f83314b.getClientReportRecorder().d(io.sentry.clientreport.f.CACHE_OVERFLOW, u5VarM);
        k8 k8VarF = f(u5VarM);
        if (k8VarF == null || !k(k8VarF) || (boolG = k8VarF.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            u5 u5VarM2 = m(file2);
            if (u5VarM2 != null && j(u5VarM2)) {
                Iterator it = u5VarM2.c().iterator();
                while (true) {
                    u6VarG = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    u6 u6Var = (u6) it.next();
                    if (i(u6Var) && (k8VarN = n(u6Var)) != null && k(k8VarN)) {
                        Boolean boolG2 = k8VarN.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f83314b.getLogger().c(g7.ERROR, "Session %s has 2 times the init flag.", k8VarF.j());
                            return;
                        }
                        if (k8VarF.j() != null && k8VarF.j().equals(k8VarN.j())) {
                            k8VarN.n();
                            try {
                                u6VarG = u6.G((h1) this.f83315c.a(), k8VarN);
                                it.remove();
                                break;
                            } catch (IOException e10) {
                                this.f83314b.getLogger().b(g7.ERROR, e10, "Failed to create new envelope item for the session %s", k8VarF.j());
                            }
                        }
                    }
                }
                if (u6VarG != null) {
                    u5 u5VarE = e(u5VarM2, u6VarG);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f83314b.getLogger().c(g7.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    p(u5VarE, file2, jLastModified);
                    return;
                }
            }
        }
    }

    private u5 m(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                u5 u5VarE = ((h1) this.f83315c.a()).e(bufferedInputStream);
                bufferedInputStream.close();
                return u5VarE;
            } finally {
            }
        } catch (IOException e10) {
            this.f83314b.getLogger().a(g7.ERROR, "Failed to deserialize the envelope.", e10);
            return null;
        }
    }

    private k8 n(u6 u6Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u6Var.I()), f83313f));
            try {
                k8 k8Var = (k8) ((h1) this.f83315c.a()).c(bufferedReader, k8.class);
                bufferedReader.close();
                return k8Var;
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Failed to deserialize the session.", th2);
            return null;
        }
    }

    private void p(u5 u5Var, File file, long j10) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((h1) this.f83315c.a()).b(u5Var, fileOutputStream);
                file.setLastModified(j10);
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Failed to serialize the new envelope to the disk.", th2);
        }
    }

    private void q(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    protected boolean g() {
        if (this.f83316d.isDirectory() && this.f83316d.canWrite() && this.f83316d.canRead()) {
            return true;
        }
        this.f83314b.getLogger().c(g7.ERROR, "The directory for caching files is inaccessible.: %s", this.f83316d.getAbsolutePath());
        return false;
    }

    protected void o(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f83317e) {
            this.f83314b.getLogger().c(g7.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i10 = (length - this.f83317e) + 1;
            q(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i10, length);
            for (int i11 = 0; i11 < i10; i11++) {
                File file = fileArr[i11];
                l(file, fileArr2);
                if (!file.delete()) {
                    this.f83314b.getLogger().c(g7.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
