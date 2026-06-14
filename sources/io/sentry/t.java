package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Queue;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
abstract class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b1 f84180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ILogger f84181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f84182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Queue f84183d;

    private static final class a implements io.sentry.hints.e, io.sentry.hints.k, io.sentry.hints.p, io.sentry.hints.i, io.sentry.hints.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f84184a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f84185b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final CountDownLatch f84186c = new CountDownLatch(1);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f84187d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ILogger f84188e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final String f84189f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Queue f84190g;

        public a(long j10, ILogger iLogger, String str, Queue queue) {
            this.f84187d = j10;
            this.f84189f = str;
            this.f84190g = queue;
            this.f84188e = iLogger;
        }

        @Override // io.sentry.hints.g
        public void a() {
            this.f84190g.add(this.f84189f);
        }

        @Override // io.sentry.hints.k
        public boolean b() {
            return this.f84184a;
        }

        @Override // io.sentry.hints.p
        public void c(boolean z10) {
            this.f84185b = z10;
            this.f84186c.countDown();
        }

        @Override // io.sentry.hints.k
        public void d(boolean z10) {
            this.f84184a = z10;
        }

        @Override // io.sentry.hints.i
        public boolean h() {
            try {
                return this.f84186c.await(this.f84187d, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                this.f84188e.a(g7.ERROR, "Exception while awaiting on lock.", e10);
                return false;
            }
        }

        @Override // io.sentry.hints.p
        public boolean isSuccess() {
            return this.f84185b;
        }
    }

    t(b1 b1Var, ILogger iLogger, long j10, int i10) {
        this.f84180a = b1Var;
        this.f84181b = iLogger;
        this.f84182c = j10;
        this.f84183d = z8.j(new f(i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean c(String str);

    public void d(File file) {
        try {
            ILogger iLogger = this.f84181b;
            g7 g7Var = g7.DEBUG;
            iLogger.c(g7Var, "Processing dir. %s", file.getAbsolutePath());
            File[] fileArrListFiles = file.listFiles(new FilenameFilter() { // from class: io.sentry.s
                @Override // java.io.FilenameFilter
                public final boolean accept(File file2, String str) {
                    return this.f84163a.c(str);
                }
            });
            if (fileArrListFiles == null) {
                this.f84181b.c(g7.ERROR, "Cache dir %s is null or is not a directory.", file.getAbsolutePath());
                return;
            }
            this.f84181b.c(g7Var, "Processing %d items from cache dir %s", Integer.valueOf(fileArrListFiles.length), file.getAbsolutePath());
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    String absolutePath = file2.getAbsolutePath();
                    if (this.f84183d.contains(absolutePath)) {
                        this.f84181b.c(g7.DEBUG, "File '%s' has already been processed so it will not be processed again.", absolutePath);
                    } else {
                        io.sentry.transport.b0 b0VarV = this.f84180a.v();
                        if (b0VarV != null && b0VarV.p(k.All)) {
                            this.f84181b.c(g7.INFO, "DirectoryProcessor, rate limiting active.", new Object[0]);
                            return;
                        } else {
                            this.f84181b.c(g7.DEBUG, "Processing file: %s", absolutePath);
                            e(file2, io.sentry.util.m.e(new a(this.f84182c, this.f84181b, absolutePath, this.f84183d)));
                            Thread.sleep(100L);
                        }
                    }
                } else {
                    this.f84181b.c(g7.DEBUG, "File %s is not a File.", file2.getAbsolutePath());
                }
            }
        } catch (Throwable th2) {
            this.f84181b.b(g7.ERROR, th2, "Failed processing '%s'", file.getAbsolutePath());
        }
    }

    protected abstract void e(File file, i0 i0Var);
}
