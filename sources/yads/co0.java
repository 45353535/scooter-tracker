package yads;

import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class co0 implements oc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f109494a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f109495b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f109496c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ do0 f109497d;

    public co0(do0 do0Var) {
        this.f109497d = do0Var;
    }

    @Override // yads.oc2
    public /* synthetic */ void a(int i10) {
        nz.a(this, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void b(lm0 lm0Var) {
        nz.n(this, lm0Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void onCues(List list) {
        nz.o(this, list);
    }

    @Override // yads.oc2
    public /* synthetic */ void onIsLoadingChanged(boolean z10) {
        nz.p(this, z10);
    }

    @Override // yads.oc2
    public final void onIsPlayingChanged(boolean z10) {
        if (!z10) {
            if (this.f109495b) {
                return;
            }
            this.f109496c = true;
            do0 do0Var = this.f109497d;
            yc3 yc3Var = do0Var.f110000k;
            qc3 qc3Var = do0Var.f109999j;
            if (yc3Var == null || qc3Var == null) {
                return;
            }
            yc3Var.i();
            return;
        }
        if (!this.f109494a) {
            do0 do0Var2 = this.f109497d;
            yc3 yc3Var2 = do0Var2.f110000k;
            qc3 qc3Var2 = do0Var2.f109999j;
            if (yc3Var2 == null || qc3Var2 == null) {
                return;
            }
            this.f109494a = true;
            yc3Var2.c();
            return;
        }
        if (this.f109496c) {
            this.f109496c = false;
            do0 do0Var3 = this.f109497d;
            yc3 yc3Var3 = do0Var3.f110000k;
            qc3 qc3Var3 = do0Var3.f109999j;
            if (yc3Var3 == null || qc3Var3 == null) {
                return;
            }
            yc3Var3.f();
        }
    }

    @Override // yads.oc2
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        nz.r(this, z10, i10);
    }

    @Override // yads.oc2
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 2) {
            this.f109495b = true;
            do0 do0Var = this.f109497d;
            yc3 yc3Var = do0Var.f110000k;
            qc3 qc3Var = do0Var.f109999j;
            if (yc3Var == null || qc3Var == null) {
                return;
            }
            yc3Var.b();
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            this.f109494a = false;
            do0 do0Var2 = this.f109497d;
            yc3 yc3Var2 = do0Var2.f110000k;
            qc3 qc3Var2 = do0Var2.f109999j;
            if (yc3Var2 == null || qc3Var2 == null) {
                return;
            }
            yc3Var2.d();
            return;
        }
        ((ma2) this.f109497d.f109996g.f112398b).a();
        do0 do0Var3 = this.f109497d;
        yc3 yc3Var3 = do0Var3.f110000k;
        qc3 qc3Var3 = do0Var3.f109999j;
        if (yc3Var3 != null && qc3Var3 != null) {
            yc3Var3.h();
        }
        if (this.f109495b) {
            this.f109495b = false;
            do0 do0Var4 = this.f109497d;
            yc3 yc3Var4 = do0Var4.f110000k;
            qc3 qc3Var4 = do0Var4.f109999j;
            if (yc3Var4 == null || qc3Var4 == null) {
                return;
            }
            yc3Var4.a();
        }
    }

    @Override // yads.oc2
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        nz.t(this, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        nz.u(this, z10, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void onRenderedFirstFrame() {
        nz.v(this);
    }

    @Override // yads.oc2
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        nz.w(this, z10);
    }

    @Override // yads.oc2
    public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        nz.x(this, i10, i11);
    }

    @Override // yads.oc2
    public /* synthetic */ void onVolumeChanged(float f10) {
        nz.y(this, f10);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(b63 b63Var) {
        nz.b(this, b63Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(c20 c20Var) {
        nz.c(this, c20Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(fr1 fr1Var) {
        nz.d(this, fr1Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(gc2 gc2Var) {
        nz.e(this, gc2Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(nc2 nc2Var) {
        nz.g(this, nc2Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(pc2 pc2Var, pc2 pc2Var2, int i10) {
        nz.h(this, pc2Var, pc2Var2, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(qf0 qf0Var) {
        nz.i(this, qf0Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(rk1 rk1Var, int i10) {
        nz.j(this, rk1Var, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(tg3 tg3Var) {
        nz.k(this, tg3Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(vk1 vk1Var) {
        nz.l(this, vk1Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(boolean z10, int i10) {
        nz.m(this, z10, i10);
    }

    @Override // yads.oc2
    public final void a(lm0 lm0Var) {
        do0 do0Var = this.f109497d;
        a52 a52Var = do0Var.f109997h;
        a52 a52Var2 = do0Var.f109998i;
        Pair pair = (a52Var == null || a52Var2 == null) ? null : TuplesKt.to(a52Var, a52Var2);
        if (pair != null && !this.f109497d.f110001l.contains(pair)) {
            this.f109497d.f110001l.add(pair);
            this.f109497d.a((qc3) pair.getSecond());
            return;
        }
        this.f109494a = false;
        ((ma2) this.f109497d.f109996g.f112398b).a();
        ((vm0) this.f109497d.f109990a).r();
        String message = lm0Var.getMessage();
        ag3 ag3Var = this.f109497d.f109992c;
        am2 am2VarA = ag3Var.f108685b.a();
        am2VarA.b(message, "error_message");
        xl2 xl2Var = xl2.f117866c;
        ag3Var.f108684a.a(new zl2("video_ad_player_error", MapsKt.toMutableMap(am2VarA.f108722a), am2VarA.f108723b));
        do0 do0Var2 = this.f109497d;
        yc3 yc3Var = do0Var2.f110000k;
        qc3 qc3Var = do0Var2.f109999j;
        if (yc3Var == null || qc3Var == null) {
            return;
        }
        do0Var2.f109993d.getClass();
        yc3Var.a(new xc3(e42.a(lm0Var), lm0Var));
    }
}
