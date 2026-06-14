package yads;

import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;

/* JADX INFO: loaded from: classes4.dex */
public final class cy1 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final jz1 f109653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f109654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l00 f109655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gu f109656d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm2 f109657e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uw1 f109658f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej f109659g;

    public cy1(jz1 jz1Var, wy wyVar, l00 l00Var, gu guVar, mr1 mr1Var, uw1 uw1Var, ej ejVar) {
        this.f109653a = jz1Var;
        this.f109654b = wyVar;
        this.f109655c = l00Var;
        this.f109656d = guVar;
        this.f109657e = mr1Var;
        this.f109658f = uw1Var;
        this.f109659g = ejVar;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        try {
            this.f109653a.a(this.f109659g.a((ExtendedNativeAdView) viewGroup, this.f109658f), this.f109656d);
            this.f109653a.a(this.f109655c);
        } catch (wy1 e10) {
            this.f109654b.e();
            this.f109657e.reportError("Failed to bind DivKit Native Ad", e10);
        }
    }

    @Override // yads.hf0
    public final void c() {
        this.f109653a.a((l00) null);
    }
}
