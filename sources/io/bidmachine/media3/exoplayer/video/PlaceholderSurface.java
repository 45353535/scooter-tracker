package io.bidmachine.media3.exoplayer.video;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import q9.n;
import q9.p;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class PlaceholderSurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static int f81379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f81380f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f81381b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f81382c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f81383d;

    private static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private n f81384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Handler f81385c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Error f81386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private RuntimeException f81387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PlaceholderSurface f81388f;

        public b() {
            super("ExoPlayer:PlaceholderSurface");
        }

        private void b(int i10) throws p.a {
            q9.a.e(this.f81384b);
            this.f81384b.i(i10);
            this.f81388f = new PlaceholderSurface(this, this.f81384b.h(), i10 != 0);
        }

        private void e() {
            q9.a.e(this.f81384b);
            this.f81384b.j();
        }

        public PlaceholderSurface a(int i10) {
            boolean z10;
            start();
            this.f81385c = new Handler(getLooper(), this);
            this.f81384b = new n(this.f81385c);
            synchronized (this) {
                z10 = false;
                this.f81385c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f81388f == null && this.f81387e == null && this.f81386d == null) {
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
            RuntimeException runtimeException = this.f81387e;
            if (runtimeException != null) {
                throw runtimeException;
            }
            Error error = this.f81386d;
            if (error == null) {
                return (PlaceholderSurface) q9.a.e(this.f81388f);
            }
            throw error;
        }

        public void d() {
            q9.a.e(this.f81385c);
            this.f81385c.sendEmptyMessage(2);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        e();
                    } finally {
                        try {
                        } finally {
                        }
                    }
                    return true;
                }
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e10);
                    this.f81386d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e11);
                    this.f81387e = e11;
                    synchronized (this) {
                        notify();
                    }
                } catch (p.a e12) {
                    u.d("PlaceholderSurface", "Failed to initialize placeholder surface", e12);
                    this.f81387e = new IllegalStateException(e12);
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

    private static int a(Context context) {
        if (p.i(context)) {
            return p.j() ? 1 : 2;
        }
        return 0;
    }

    public static synchronized boolean b(Context context) {
        try {
            if (!f81380f) {
                f81379e = a(context);
                f81380f = true;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f81379e != 0;
    }

    public static PlaceholderSurface c(Context context, boolean z10) {
        q9.a.g(!z10 || b(context));
        return new b().a(z10 ? f81379e : 0);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f81382c) {
            try {
                if (!this.f81383d) {
                    this.f81382c.d();
                    this.f81383d = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private PlaceholderSurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f81382c = bVar;
        this.f81381b = z10;
    }
}
