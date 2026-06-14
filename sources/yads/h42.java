package yads;

import kotlin.Pair;
import kotlin.TuplesKt;

/* JADX INFO: loaded from: classes4.dex */
public final class h42 implements vc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f42 f111477a;

    public h42(f42 f42Var) {
        this.f111477a = f42Var;
    }

    @Override // yads.vc3
    public final void a(xb3 xb3Var) {
        f42 f42Var = this.f111477a;
        a52 a52Var = (a52) xb3Var.f117779d;
        a52 a52Var2 = (a52) xb3Var.f117780e;
        do0 do0Var = (do0) f42Var;
        do0Var.f109997h = a52Var;
        do0Var.f109998i = a52Var2;
        Pair pair = a52Var2 != null ? TuplesKt.to(a52Var, a52Var2) : null;
        if (pair == null || !do0Var.f110001l.contains(pair)) {
            do0Var.a(a52Var);
        } else {
            do0Var.a(a52Var2);
        }
    }

    @Override // yads.vc3
    public final long c() {
        return ((vm0) ((do0) this.f111477a).f109990a).l();
    }

    @Override // yads.vc3
    public final void d() {
        do0 do0Var = (do0) this.f111477a;
        if (!do0Var.f110002m) {
            ((vm0) do0Var.f109990a).a(true);
        }
        if (!do0Var.f110003n || do0Var.f110002m) {
            return;
        }
        ((vm0) do0Var.f109990a).a(false);
    }

    @Override // yads.vc3
    public final long getAdPosition() {
        vm0 vm0Var = (vm0) ((do0) this.f111477a).f109990a;
        vm0Var.u();
        return w83.b(vm0Var.a(vm0Var.Z));
    }

    @Override // yads.vc3
    public final float getVolume() {
        vm0 vm0Var = (vm0) ((do0) this.f111477a).f109990a;
        vm0Var.u();
        return vm0Var.T;
    }

    @Override // yads.vc3
    public final boolean isPlayingAd() {
        return ((io) ((do0) this.f111477a).f109990a).b();
    }

    @Override // yads.vc3
    public final void pauseAd() {
        do0 do0Var = (do0) this.f111477a;
        if (do0Var.f110002m) {
            return;
        }
        ((vm0) do0Var.f109990a).a(false);
    }

    @Override // yads.vc3
    public final void resumeAd() {
        do0 do0Var = (do0) this.f111477a;
        if (do0Var.f110002m || do0Var.f110003n) {
            return;
        }
        ((vm0) do0Var.f109990a).a(true);
    }

    @Override // yads.vc3
    public final void a(nc3 nc3Var) {
        ((do0) this.f111477a).f110000k = nc3Var;
    }
}
