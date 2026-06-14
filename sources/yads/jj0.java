package yads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class jj0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f112362a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f112363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f112364c;

    public jj0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(Handler handler, kj0 kj0Var) {
        handler.getClass();
        kj0Var.getClass();
        this.f112364c.add(new ij0(handler, kj0Var));
    }

    public final void b() {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.ua
                @Override // java.lang.Runnable
                public final void run() {
                    this.f116582b.b(kj0Var);
                }
            });
        }
    }

    public final void c() {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.ra
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115379b.c(kj0Var);
                }
            });
        }
    }

    public final void d() {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.oa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114241b.d(kj0Var);
                }
            });
        }
    }

    public jj0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, kl1 kl1Var) {
        this.f112364c = copyOnWriteArrayList;
        this.f112362a = i10;
        this.f112363b = kl1Var;
    }

    public final void a() {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.sa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115725b.a(kj0Var);
                }
            });
        }
    }

    public final /* synthetic */ void b(kj0 kj0Var) {
        kj0Var.d(this.f112362a, this.f112363b);
    }

    public final /* synthetic */ void c(kj0 kj0Var) {
        kj0Var.c(this.f112362a, this.f112363b);
    }

    public final /* synthetic */ void d(kj0 kj0Var) {
        kj0Var.b(this.f112362a, this.f112363b);
    }

    public final void a(final int i10) {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.qa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114893b.a(kj0Var, i10);
                }
            });
        }
    }

    public final void a(final Exception exc) {
        for (ij0 ij0Var : this.f112364c) {
            final kj0 kj0Var = ij0Var.f112010b;
            w83.a(ij0Var.f112009a, new Runnable() { // from class: yads.pa
                @Override // java.lang.Runnable
                public final void run() {
                    this.f114581b.a(kj0Var, exc);
                }
            });
        }
    }

    public final /* synthetic */ void a(kj0 kj0Var) {
        kj0Var.a(this.f112362a, this.f112363b);
    }

    public final /* synthetic */ void a(kj0 kj0Var, int i10) {
        kj0Var.getClass();
        kj0Var.a(this.f112362a, this.f112363b, i10);
    }

    public final /* synthetic */ void a(kj0 kj0Var, Exception exc) {
        kj0Var.a(this.f112362a, this.f112363b, exc);
    }
}
