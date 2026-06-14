package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes10.dex */
public class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f51719h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f51720i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    static a f51721j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51722e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private a f51723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f51724g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    class C0580a implements r, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ r f51725a;

        C0580a(r rVar) {
            this.f51725a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f51733b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f51732a;
                while (true) {
                    if (j11 >= PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                        break;
                    }
                    j11 += (long) (oVar.f51767c - oVar.f51766b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f51770f;
                }
                a.this.h();
                try {
                    try {
                        this.f51725a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f51725a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f51725a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f51725a + ")";
        }
    }

    private static final class c extends Thread {
        c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0017, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> Lb
                if (r1 != 0) goto Ld
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                goto L0
            Lb:
                r1 = move-exception
                goto L1b
            Ld:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.a.f51721j     // Catch: java.lang.Throwable -> Lb
                if (r1 != r2) goto L16
                r1 = 0
                com.mbridge.msdk.thrid.okio.a.f51721j = r1     // Catch: java.lang.Throwable -> Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                return
            L16:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                r1.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L1b:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f51719h = millis;
        f51720i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        try {
            if (f51721j == null) {
                f51721j = new a();
                new c().start();
            }
            long jNanoTime = System.nanoTime();
            if (j10 != 0 && z10) {
                aVar.f51724g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
            } else if (j10 != 0) {
                aVar.f51724g = j10 + jNanoTime;
            } else {
                if (!z10) {
                    throw new AssertionError();
                }
                aVar.f51724g = aVar.c();
            }
            long jB = aVar.b(jNanoTime);
            a aVar2 = f51721j;
            while (true) {
                a aVar3 = aVar2.f51723f;
                if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                    break;
                } else {
                    aVar2 = aVar2.f51723f;
                }
            }
            aVar.f51723f = aVar2.f51723f;
            aVar2.f51723f = aVar;
            if (aVar2 == f51721j) {
                a.class.notify();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private long b(long j10) {
        return this.f51724g - j10;
    }

    @Nullable
    static a g() throws InterruptedException {
        a aVar = f51721j.f51723f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f51719h);
            if (f51721j.f51723f != null || System.nanoTime() - jNanoTime < f51720i) {
                return null;
            }
            return f51721j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f51721j.f51723f = aVar.f51723f;
        aVar.f51723f = null;
        return aVar;
    }

    public final void h() {
        if (this.f51722e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f51722e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f51722e) {
            return false;
        }
        this.f51722e = false;
        return a(this);
    }

    protected void j() {
    }

    protected IOException b(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    class b implements s, AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ s f51727a;

        b(s sVar) {
            this.f51727a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f51727a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f51727a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f51727a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    private static synchronized boolean a(a aVar) {
        a aVar2 = f51721j;
        while (aVar2 != null) {
            a aVar3 = aVar2.f51723f;
            if (aVar3 == aVar) {
                aVar2.f51723f = aVar.f51723f;
                aVar.f51723f = null;
                return false;
            }
            aVar2 = aVar3;
        }
        return true;
    }

    public final r a(r rVar) {
        return new C0580a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }
}
