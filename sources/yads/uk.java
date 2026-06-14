package yads;

import android.os.Handler;

/* JADX INFO: loaded from: classes4.dex */
public final class uk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f116675a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vk f116676b;

    public uk(Handler handler, sm0 sm0Var) {
        this.f116675a = (Handler) fi.a(handler);
        this.f116676b = sm0Var;
    }

    public final void a(final Exception exc) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.dr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110032b.c(exc);
                }
            });
        }
    }

    public final void b(final Exception exc) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.gr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111314b.d(exc);
                }
            });
        }
    }

    public final void c(Exception exc) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).a(exc);
    }

    public final void d(Exception exc) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).b(exc);
    }

    public final void a(final String str, final long j10, final long j11) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.ir0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112107b.b(str, j10, j11);
                }
            });
        }
    }

    public final void b(final ca0 ca0Var) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.fr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110833b.d(ca0Var);
                }
            });
        }
    }

    public final void a(final String str) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.lr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113191b.b(str);
                }
            });
        }
    }

    public final void b(String str, long j10, long j11) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).a(str, j10, j11);
    }

    public final void c(ca0 ca0Var) {
        synchronized (ca0Var) {
        }
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        sm0 sm0Var = (sm0) vkVar;
        ((xa0) sm0Var.f115875a.f117108o).a(ca0Var);
        sm0Var.f115875a.getClass();
        sm0Var.f115875a.getClass();
    }

    public final void d(ca0 ca0Var) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        sm0 sm0Var = (sm0) vkVar;
        sm0Var.f115875a.getClass();
        ((xa0) sm0Var.f115875a.f117108o).b(ca0Var);
    }

    public final void a(final ca0 ca0Var) {
        synchronized (ca0Var) {
        }
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.hr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111712b.c(ca0Var);
                }
            });
        }
    }

    public final void b(String str) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).a(str);
    }

    public final void a(final yv0 yv0Var, final ia0 ia0Var) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.cr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109531b.b(yv0Var, ia0Var);
                }
            });
        }
    }

    public final void a(long j10) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).a(j10);
    }

    public final void b(yv0 yv0Var, ia0 ia0Var) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        vkVar.getClass();
        sm0 sm0Var = (sm0) this.f116676b;
        sm0Var.f115875a.getClass();
        ((xa0) sm0Var.f115875a.f117108o).a(yv0Var, ia0Var);
    }

    public final void a(boolean z10) {
        vk vkVar = this.f116676b;
        int i10 = w83.f117341a;
        ((sm0) vkVar).a(z10);
    }

    public final void a(int i10, long j10, long j11) {
        vk vkVar = this.f116676b;
        int i11 = w83.f117341a;
        ((xa0) ((sm0) vkVar).f115875a.f117108o).a(i10, j10, j11);
    }

    public final void b(final long j10) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.er0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110441b.a(j10);
                }
            });
        }
    }

    public final void b(final boolean z10) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.kr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112815b.a(z10);
                }
            });
        }
    }

    public final void b(final int i10, final long j10, final long j11) {
        Handler handler = this.f116675a;
        if (handler != null) {
            handler.post(new Runnable() { // from class: yads.jr0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f112438b.a(i10, j10, j11);
                }
            });
        }
    }
}
