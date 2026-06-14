package yads;

import android.graphics.Matrix;
import android.view.TextureView;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class mg3 implements oc2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public kx2 f113465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public kx2 f113466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextureView f113467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public pg3 f113468d;

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
    public /* synthetic */ void onIsPlayingChanged(boolean z10) {
        nz.q(this, z10);
    }

    @Override // yads.oc2
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        nz.r(this, z10, i10);
    }

    @Override // yads.oc2
    public /* synthetic */ void onPlaybackStateChanged(int i10) {
        nz.s(this, i10);
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
    public final void onSurfaceSizeChanged(int i10, int i11) {
        this.f113466b = new kx2(i10, i11);
        a();
    }

    @Override // yads.oc2
    public /* synthetic */ void onVolumeChanged(float f10) {
        nz.y(this, f10);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(b63 b63Var) {
        nz.b(this, b63Var);
    }

    public final void b() {
        TextureView textureView = this.f113467c;
        if (this.f113468d == null || textureView == null) {
            return;
        }
        Matrix matrix = new Matrix();
        matrix.setScale(0.0f, 0.0f, 0.0f, 0.0f);
        textureView.setTransform(matrix);
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
    public /* synthetic */ void a(lm0 lm0Var) {
        nz.f(this, lm0Var);
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
    public /* synthetic */ void a(vk1 vk1Var) {
        nz.l(this, vk1Var);
    }

    @Override // yads.oc2
    public /* synthetic */ void a(boolean z10, int i10) {
        nz.m(this, z10, i10);
    }

    public final void a() {
        Matrix matrixA;
        kx2 kx2Var = this.f113466b;
        pg3 pg3Var = this.f113468d;
        kx2 kx2Var2 = this.f113465a;
        TextureView textureView = this.f113467c;
        if (kx2Var2 == null || kx2Var == null || pg3Var == null || textureView == null) {
            return;
        }
        og3 og3Var = new og3(kx2Var, kx2Var2);
        if (kx2Var2.f112887b <= 0 || kx2Var2.f112888c <= 0 || kx2Var.f112887b <= 0 || kx2Var.f112888c <= 0) {
            matrixA = null;
        } else {
            int iOrdinal = pg3Var.ordinal();
            if (iOrdinal == 0) {
                matrixA = og3Var.a(1.0f, 1.0f, ng3.f113871b);
            } else if (iOrdinal == 1) {
                float f10 = kx2Var.f112887b / kx2Var2.f112887b;
                float f11 = kx2Var.f112888c / kx2Var2.f112888c;
                float fMin = Math.min(f10, f11);
                matrixA = og3Var.a(fMin / f10, fMin / f11, ng3.f113872c);
            } else if (iOrdinal == 2) {
                float f12 = kx2Var.f112887b / kx2Var2.f112887b;
                float f13 = kx2Var.f112888c / kx2Var2.f112888c;
                float fMax = Math.max(f12, f13);
                matrixA = og3Var.a(fMax / f12, fMax / f13, ng3.f113872c);
            } else {
                throw new lf.m();
            }
        }
        if (matrixA != null) {
            textureView.setTransform(matrixA);
        }
    }

    @Override // yads.oc2
    public final void a(tg3 tg3Var) {
        int iD = tg3Var.f116240b;
        float f10 = tg3Var.f116243e;
        if (f10 > 0.0f) {
            iD = zf.a.d(iD * f10);
        }
        this.f113465a = new kx2(iD, tg3Var.f116241c);
        a();
    }
}
