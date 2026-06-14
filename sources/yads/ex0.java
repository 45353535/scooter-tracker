package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class ex0 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz1 f110509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f110510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l00 f110511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final dm2 f110512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ej f110513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final vw1 f110514f;

    public ex0(jz1 jz1Var, wy wyVar, l00 l00Var, dm2 dm2Var, ej ejVar, vw1 vw1Var) {
        this.f110509a = jz1Var;
        this.f110510b = wyVar;
        this.f110511c = l00Var;
        this.f110512d = dm2Var;
        this.f110513e = ejVar;
        this.f110514f = vw1Var;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f110509a.a(this.f110513e.a((ExtendedNativeAdView) viewGroup, this.f110514f));
            this.f110509a.a(this.f110511c);
        } catch (wy1 e10) {
            this.f110510b.e();
            this.f110512d.reportError("Failed to bind DivKit Fullscreen Native Ad", e10);
        }
    }

    @Override // yads.hf0
    public final void c() {
        this.f110509a.a((l00) null);
    }
}
