package io.sentry.cache;

import io.sentry.ILogger;
import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.f7;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.h1;
import io.sentry.i0;
import io.sentry.i8;
import io.sentry.k8;
import io.sentry.r5;
import io.sentry.transport.t;
import io.sentry.u5;
import io.sentry.u6;
import io.sentry.util.w;
import io.sentry.v7;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final CountDownLatch f83319g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Map f83320h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected final io.sentry.util.a f83321i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final io.sentry.util.a f83322j;

    public f(v7 v7Var, String str, int i10) {
        super(v7Var, str, i10);
        this.f83320h = new WeakHashMap();
        this.f83321i = new io.sentry.util.a();
        this.f83322j = new io.sentry.util.a();
        this.f83319g = new CountDownLatch(1);
    }

    private void A(i0 i0Var) {
        Date dateE;
        Object objG = io.sentry.util.m.g(i0Var);
        if (objG instanceof io.sentry.hints.a) {
            File fileX = x(this.f83316d.getAbsolutePath());
            if (!fileX.exists()) {
                this.f83314b.getLogger().c(g7.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            ILogger logger = this.f83314b.getLogger();
            g7 g7Var = g7.WARNING;
            logger.c(g7Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileX), c.f83313f));
                try {
                    k8 k8Var = (k8) ((h1) this.f83315c.a()).c(bufferedReader, k8.class);
                    if (k8Var != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lB = aVar.b();
                        if (lB != null) {
                            dateE = io.sentry.l.e(lB.longValue());
                            Date dateK = k8Var.k();
                            if (dateK == null || dateE.before(dateK)) {
                                this.f83314b.getLogger().c(g7Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateE = null;
                        }
                        k8Var.q(k8.b.Abnormal, null, true, aVar.d());
                        k8Var.d(dateE);
                        F(fileX, k8Var);
                    }
                    bufferedReader.close();
                } finally {
                }
            } catch (Throwable th2) {
                this.f83314b.getLogger().a(g7.ERROR, "Error processing previous session.", th2);
            }
        }
    }

    private void B(File file, u5 u5Var) {
        Iterable iterableC = u5Var.c();
        if (!iterableC.iterator().hasNext()) {
            this.f83314b.getLogger().c(g7.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        u6 u6Var = (u6) iterableC.iterator().next();
        if (!f7.Session.equals(u6Var.J().b())) {
            this.f83314b.getLogger().c(g7.INFO, "Current envelope has a different envelope type %s", u6Var.J().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(u6Var.I()), c.f83313f));
            try {
                k8 k8Var = (k8) ((h1) this.f83315c.a()).c(bufferedReader, k8.class);
                if (k8Var == null) {
                    this.f83314b.getLogger().c(g7.ERROR, "Item of type %s returned null by the parser.", u6Var.J().b());
                } else {
                    F(file, k8Var);
                }
                bufferedReader.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Item failed to process.", th2);
        }
    }

    private void D() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f83314b.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(io.sentry.l.h(io.sentry.l.d()).getBytes(c.f83313f));
                fileOutputStream.flush();
                fileOutputStream.close();
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().a(g7.ERROR, "Error writing the crash marker file to the disk", th2);
        }
    }

    private boolean E(File file, u5 u5Var) {
        if (file.exists()) {
            this.f83314b.getLogger().c(g7.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f83314b.getLogger().c(g7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                ((h1) this.f83315c.a()).b(u5Var, fileOutputStream);
                fileOutputStream.close();
                return true;
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().b(g7.ERROR, th2, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void F(File file, k8 k8Var) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f83313f));
                try {
                    this.f83314b.getLogger().c(g7.DEBUG, "Overwriting session to offline storage: %s", k8Var.j());
                    ((h1) this.f83315c.a()).a(k8Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            this.f83314b.getLogger().b(g7.ERROR, th2, "Error writing Session to offline storage: %s", k8Var.j());
        }
    }

    private File[] s() {
        File[] fileArrListFiles;
        return (!g() || (fileArrListFiles = this.f83316d.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    public static g t(v7 v7Var) {
        String cacheDirPath = v7Var.getCacheDirPath();
        int maxCacheItems = v7Var.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(v7Var, cacheDirPath, maxCacheItems);
        }
        v7Var.getLogger().c(g7.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return t.e();
    }

    public static File v(String str) {
        return new File(str, "session.json");
    }

    private File w(u5 u5Var) {
        String str;
        g1 g1VarD = this.f83321i.d();
        try {
            if (this.f83320h.containsKey(u5Var)) {
                str = (String) this.f83320h.get(u5Var);
            } else {
                String str2 = i8.a() + ".envelope";
                this.f83320h.put(u5Var, str2);
                str = str2;
            }
            File file = new File(this.f83316d.getAbsolutePath(), str);
            if (g1VarD != null) {
                g1VarD.close();
            }
            return file;
        } catch (Throwable th2) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
            }
            throw th2;
        }
    }

    public static File x(String str) {
        return new File(str, "previous_session.json");
    }

    private boolean z(u5 u5Var, i0 i0Var) {
        w.c(u5Var, "Envelope is required.");
        o(s());
        File fileV = v(this.f83316d.getAbsolutePath());
        File fileX = x(this.f83316d.getAbsolutePath());
        if (io.sentry.util.m.h(i0Var, io.sentry.hints.l.class) && !fileV.delete()) {
            this.f83314b.getLogger().c(g7.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.m.h(i0Var, io.sentry.hints.a.class)) {
            A(i0Var);
        }
        if (io.sentry.util.m.h(i0Var, io.sentry.hints.n.class)) {
            y(fileV, fileX);
            B(fileV, u5Var);
            boolean zExists = new File(this.f83314b.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f83314b.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f83314b.getLogger().c(g7.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f83314b.getLogger().c(g7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            r5.a().b(zExists);
            u();
        }
        File fileW = w(u5Var);
        if (fileW.exists()) {
            this.f83314b.getLogger().c(g7.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileW.getAbsolutePath());
            return true;
        }
        this.f83314b.getLogger().c(g7.DEBUG, "Adding Envelope to offline storage: %s", fileW.getAbsolutePath());
        boolean zE = E(fileW, u5Var);
        if (io.sentry.util.m.h(i0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            D();
        }
        return zE;
    }

    public boolean C() {
        try {
            return this.f83319g.await(this.f83314b.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f83314b.getLogger().c(g7.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    @Override // io.sentry.cache.g
    public void d(u5 u5Var) {
        w.c(u5Var, "Envelope is required.");
        File fileW = w(u5Var);
        if (fileW.delete()) {
            this.f83314b.getLogger().c(g7.DEBUG, "Discarding envelope from cache: %s", fileW.getAbsolutePath());
        } else {
            this.f83314b.getLogger().c(g7.DEBUG, "Envelope was not cached or could not be deleted: %s", fileW.getAbsolutePath());
        }
    }

    public boolean h(u5 u5Var, i0 i0Var) {
        return z(u5Var, i0Var);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        BufferedInputStream bufferedInputStream;
        File[] fileArrS = s();
        ArrayList arrayList = new ArrayList(fileArrS.length);
        for (File file : fileArrS) {
            try {
                bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            } catch (FileNotFoundException unused) {
                this.f83314b.getLogger().c(g7.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e10) {
                this.f83314b.getLogger().a(g7.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e10);
            }
            try {
                arrayList.add(((h1) this.f83315c.a()).e(bufferedInputStream));
                bufferedInputStream.close();
            } catch (Throwable th2) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                }
                throw th2;
            }
        }
        return arrayList.iterator();
    }

    public void u() {
        this.f83319g.countDown();
    }

    public void y(File file, File file2) {
        g1 g1VarD = this.f83322j.d();
        try {
            if (file2.exists()) {
                this.f83314b.getLogger().c(g7.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f83314b.getLogger().c(g7.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                this.f83314b.getLogger().c(g7.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        this.f83314b.getLogger().c(g7.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th2) {
                    this.f83314b.getLogger().a(g7.ERROR, "Error moving current session to previous session.", th2);
                }
            }
            if (g1VarD != null) {
                g1VarD.close();
            }
        } catch (Throwable th3) {
            if (g1VarD != null) {
                try {
                    g1VarD.close();
                } catch (Throwable th4) {
                    th3.addSuppressed(th4);
                }
            }
            throw th3;
        }
    }
}
