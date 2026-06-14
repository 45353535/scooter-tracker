package yads;

import android.os.Handler;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class ol1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f114365a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kl1 f114366b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f114367c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f114368d;

    public ol1() {
        this(new CopyOnWriteArrayList(), 0, null, 0L);
    }

    public final void a(Handler handler, pl1 pl1Var) {
        handler.getClass();
        pl1Var.getClass();
        this.f114367c.add(new nl1(handler, pl1Var));
    }

    public final /* synthetic */ void b(pl1 pl1Var, ge1 ge1Var, tk1 tk1Var) {
        pl1Var.a(this.f114365a, this.f114366b, ge1Var, tk1Var);
    }

    public final /* synthetic */ void c(pl1 pl1Var, ge1 ge1Var, tk1 tk1Var) {
        pl1Var.b(this.f114365a, this.f114366b, ge1Var, tk1Var);
    }

    public ol1(CopyOnWriteArrayList copyOnWriteArrayList, int i10, kl1 kl1Var, long j10) {
        this.f114367c = copyOnWriteArrayList;
        this.f114365a = i10;
        this.f114366b = kl1Var;
        this.f114368d = j10;
    }

    public final void b(final ge1 ge1Var, final tk1 tk1Var) {
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.c00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109167b.b(pl1Var, ge1Var, tk1Var);
                }
            });
        }
    }

    public final void c(final ge1 ge1Var, final tk1 tk1Var) {
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.b00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f108876b.c(pl1Var, ge1Var, tk1Var);
                }
            });
        }
    }

    public final long a(long j10) {
        long jB = w83.b(j10);
        if (jB == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f114368d + jB;
    }

    public final void b(final tk1 tk1Var) {
        final kl1 kl1Var = this.f114366b;
        kl1Var.getClass();
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.f00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110538b.a(pl1Var, kl1Var, tk1Var);
                }
            });
        }
    }

    public final void a(final tk1 tk1Var) {
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.g00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f111008b.a(pl1Var, tk1Var);
                }
            });
        }
    }

    public final /* synthetic */ void a(pl1 pl1Var, tk1 tk1Var) {
        pl1Var.b(this.f114365a, this.f114366b, tk1Var);
    }

    public final /* synthetic */ void a(pl1 pl1Var, ge1 ge1Var, tk1 tk1Var) {
        pl1Var.c(this.f114365a, this.f114366b, ge1Var, tk1Var);
    }

    public final /* synthetic */ void a(pl1 pl1Var, ge1 ge1Var, tk1 tk1Var, IOException iOException, boolean z10) {
        pl1Var.a(this.f114365a, this.f114366b, ge1Var, tk1Var, iOException, z10);
    }

    public final /* synthetic */ void a(pl1 pl1Var, kl1 kl1Var, tk1 tk1Var) {
        pl1Var.a(this.f114365a, kl1Var, tk1Var);
    }

    public final void a(final ge1 ge1Var, final tk1 tk1Var) {
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.e00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f110125b.a(pl1Var, ge1Var, tk1Var);
                }
            });
        }
    }

    public final void a(final ge1 ge1Var, final tk1 tk1Var, final IOException iOException, final boolean z10) {
        for (nl1 nl1Var : this.f114367c) {
            final pl1 pl1Var = nl1Var.f113956b;
            w83.a(nl1Var.f113955a, new Runnable() { // from class: yads.d00
                @Override // java.lang.Runnable
                public final void run() {
                    this.f109671b.a(pl1Var, ge1Var, tk1Var, iOException, z10);
                }
            });
        }
    }
}
