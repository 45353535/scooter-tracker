package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public final class zc1 implements hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0 f118609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f118610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nn2 f118611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx f118612d;

    public zc1(aw awVar, mr1 mr1Var, nn2 nn2Var, bx bxVar) {
        this.f118609a = awVar;
        this.f118610b = mr1Var;
        this.f118611c = nn2Var;
        this.f118612d = bxVar;
    }

    @Override // yads.hx0
    public final dd1 a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, l00 l00Var) {
        k00 adAssets = jz1Var.getAdAssets();
        nn2 nn2Var = this.f118611c;
        int i10 = R$dimen.monetization_ads_internal_landscape_horizontal_icon_size;
        nn2Var.getClass();
        ux uxVar = new ux(adAssets, zf.a.d(context.getResources().getDimension(i10)));
        bx bxVar = this.f118612d;
        hf0 hf0Var = this.f118609a;
        dm2 dm2Var = this.f118610b;
        bxVar.getClass();
        return new dd1(R$layout.monetization_ads_internal_native_interstitial_landscape_horizontal_media, new sx(uxVar, bx.a(jz1Var, wyVar, l00Var, hf0Var, dm2Var), new bi1(adAssets), new sb2(adAssets), new mk3(), new os(jz1Var)), new h92(2));
    }
}
