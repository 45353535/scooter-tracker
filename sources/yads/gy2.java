package yads;

import android.view.View;
import android.view.ViewGroup;
import com.monetization.ads.nativeads.ExtendedNativeAdView;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class gy2 implements hf0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final i12 f111400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f111401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final l00 f111402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final gu f111403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final dm2 f111404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final uw1 f111405f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ej f111406g;

    public gy2(i12 i12Var, wy wyVar, l00 l00Var, gu guVar, mr1 mr1Var, uw1 uw1Var, ej ejVar) {
        this.f111400a = i12Var;
        this.f111401b = wyVar;
        this.f111402c = l00Var;
        this.f111403d = guVar;
        this.f111404e = mr1Var;
        this.f111405f = uw1Var;
        this.f111406g = ejVar;
    }

    @Override // yads.hf0
    public final void a(ViewGroup viewGroup) {
        try {
            e02 e02VarA = this.f111406g.a((ExtendedNativeAdView) viewGroup, this.f111405f);
            i12 i12Var = this.f111400a;
            gu guVar = this.f111403d;
            i12Var.getClass();
            View view = e02VarA.f110133c;
            m02 m02Var = new m02(e02VarA);
            hg2 hg2Var = i12Var.Q;
            su.f115947a.getClass();
            i12Var.a(view, hg2Var, m02Var, ru.f115596b, guVar);
            a23 a23Var = new a23(this.f111402c);
            Iterator it = this.f111400a.i().iterator();
            while (it.hasNext()) {
                ((jz1) it.next()).a(a23Var);
            }
            this.f111400a.b(this.f111402c);
        } catch (wy1 e10) {
            this.f111401b.e();
            this.f111404e.reportError("Failed to bind DivKit Slider Ad", e10);
        }
    }

    @Override // yads.hf0
    public final void c() {
        this.f111400a.b((l00) null);
        Iterator it = this.f111400a.i().iterator();
        while (it.hasNext()) {
            ((jz1) it.next()).a((l00) null);
        }
    }
}
