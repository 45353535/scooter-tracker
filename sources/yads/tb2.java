package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes4.dex */
public final class tb2 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public nk0 f116160b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f116161c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f116162d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f116163e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ub2 f116164f;

    public tb2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final ub2 a(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f116161c = handler;
        this.f116160b = new nk0(handler);
        synchronized (this) {
            z10 = false;
            this.f116161c.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f116164f == null && this.f116163e == null && this.f116162d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f116163e;
        if (runtimeException != null) {
            throw runtimeException;
        }
        Error error = this.f116162d;
        if (error != null) {
            throw error;
        }
        ub2 ub2Var = this.f116164f;
        ub2Var.getClass();
        return ub2Var;
    }

    public final void b(int i10) {
        this.f116160b.getClass();
        this.f116160b.a(i10);
        this.f116164f = new ub2(this, this.f116160b.a(), i10 != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    this.f116160b.getClass();
                    this.f116160b.b();
                } finally {
                    try {
                    } finally {
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e10) {
                    uf1.b("PlaceholderSurface", uf1.a("Failed to initialize placeholder surface", e10));
                    this.f116163e = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (Error e11) {
                uf1.b("PlaceholderSurface", uf1.a("Failed to initialize placeholder surface", e11));
                this.f116162d = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th2) {
            synchronized (this) {
                notify();
                throw th2;
            }
        }
    }
}
