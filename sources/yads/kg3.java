package yads;

import android.os.Handler;
import android.os.SystemClock;
import android.view.Surface;

/* JADX INFO: loaded from: classes4.dex */
public final class kg3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f112702a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final lg3 f112703b;

    public kg3(Handler handler, sm0 sm0Var) {
        this.f112702a = (Handler) fi.a(handler);
        this.f112703b = sm0Var;
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.hh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111587b.b(str, j10, j11);
                }
            });
        }
    }

    public final void b(final ca0 ca0Var) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ch
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109402b.d(ca0Var);
                }
            });
        }
    }

    public final void c(ca0 ca0Var) {
        synchronized (ca0Var) {
        }
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        sm0 sm0Var = (sm0) lg3Var;
        ((xa0) sm0Var.f115875a.f117108o).c(ca0Var);
        sm0Var.f115875a.getClass();
        sm0Var.f115875a.getClass();
    }

    public final void d(ca0 ca0Var) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        sm0 sm0Var = (sm0) lg3Var;
        sm0Var.f115875a.getClass();
        ((xa0) sm0Var.f115875a.f117108o).d(ca0Var);
    }

    public final void a(final String str) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.gh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111184b.b(str);
                }
            });
        }
    }

    public final void b(String str, long j10, long j11) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) lg3Var).f115875a.f117108o).b(str, j10, j11);
    }

    public final void a(final ca0 ca0Var) {
        synchronized (ca0Var) {
        }
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.fh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110721b.c(ca0Var);
                }
            });
        }
    }

    public final void b(String str) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) lg3Var).f115875a.f117108o).b(str);
    }

    public final void a(final int i10, final long j10) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.lc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113033b.b(i10, j10);
                }
            });
        }
    }

    public final void c(final int i10, final long j10) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.jc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112290b.a(j10, i10);
                }
            });
        }
    }

    public final void a(final yv0 yv0Var, final ia0 ia0Var) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.eh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110370b.b(yv0Var, ia0Var);
                }
            });
        }
    }

    public final void b(int i10, long j10) {
        lg3 lg3Var = this.f112703b;
        int i11 = w83.f117341a;
        ((xa0) ((sm0) lg3Var).f115875a.f117108o).a(i10, j10);
    }

    public final void a(Object obj, long j10) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        ((sm0) lg3Var).a(obj, j10);
    }

    public final void a(long j10, int i10) {
        lg3 lg3Var = this.f112703b;
        int i11 = w83.f117341a;
        ((xa0) ((sm0) lg3Var).f115875a.f117108o).b(i10, j10);
    }

    public final void b(yv0 yv0Var, ia0 ia0Var) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        lg3Var.getClass();
        sm0 sm0Var = (sm0) this.f112703b;
        sm0Var.f115875a.getClass();
        ((xa0) sm0Var.f115875a.f117108o).b(yv0Var, ia0Var);
    }

    public final void a(Exception exc) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) lg3Var).f115875a.f117108o).c(exc);
    }

    public final void b(final Exception exc) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.mc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113399b.a(exc);
                }
            });
        }
    }

    public final void a(tg3 tg3Var) {
        lg3 lg3Var = this.f112703b;
        int i10 = w83.f117341a;
        ((sm0) lg3Var).a(tg3Var);
    }

    public final void b(final tg3 tg3Var) {
        Handler handler = this.f112702a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.kc
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112674b.a(tg3Var);
                }
            });
        }
    }

    public final void a(final Surface surface) {
        if (this.f112702a != null) {
            final long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f112702a.post(new Runnable() { // from class: yads.dh
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109921b.a(surface, jElapsedRealtime);
                }
            });
        }
    }
}
