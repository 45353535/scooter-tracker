package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f8134a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f8137d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f8135b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f8136c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f8138e = new Object();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f8136c.isEmpty()) {
                if (p.this.f8137d != null) {
                    try {
                        p.this.f8137d.sendMessageAtFrontOfQueue((Message) p.this.f8136c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f8135b.isEmpty()) {
                c cVar = (c) p.this.f8135b.poll();
                if (p.this.f8137d != null) {
                    try {
                        p.this.f8137d.sendMessageAtTime(cVar.f8143a, cVar.f8144b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f8140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f8141b;

        b(String str) {
            super(str);
            this.f8140a = 0;
            this.f8141b = false;
        }

        @Override // android.os.HandlerThread
        protected final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f8138e) {
                p.this.f8137d = new Handler();
            }
            p.this.f8137d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th2) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f8140a < 5) {
                            com.apm.insight.c.a();
                            j.a(th2, "NPTH_CATCH");
                        } else if (!this.f8141b) {
                            this.f8141b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f8140a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Message f8143a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f8144b;

        c(Message message, long j10) {
            this.f8143a = message;
            this.f8144b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public p(String str) {
        this.f8134a = new b(str);
    }

    public final void b() {
        this.f8134a.start();
    }

    public final HandlerThread c() {
        return this.f8134a;
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f8137d, runnable);
    }

    @Nullable
    public final Handler a() {
        return this.f8137d;
    }

    private boolean b(Message message, long j10) {
        if (this.f8137d == null) {
            synchronized (this.f8138e) {
                try {
                    if (this.f8137d == null) {
                        this.f8135b.add(new c(message, j10));
                        return true;
                    }
                } finally {
                }
            }
        }
        try {
            return this.f8137d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
