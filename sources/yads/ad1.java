package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$dimen;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public final class ad1 implements hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0 f108640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f108641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final nn2 f108642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final bx f108643d;

    public ad1(aw awVar, mr1 mr1Var, nn2 nn2Var, bx bxVar) {
        this.f108640a = awVar;
        this.f108641b = mr1Var;
        this.f108642c = nn2Var;
        this.f108643d = bxVar;
    }

    @Override // yads.hx0
    public final dd1 a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, l00 l00Var) {
        k00 adAssets = jz1Var.getAdAssets();
        nn2 nn2Var = this.f108642c;
        int i10 = R$dimen.monetization_ads_internal_landscape_vertical_icon_size;
        nn2Var.getClass();
        ux uxVar = new ux(adAssets, zf.a.d(context.getResources().getDimension(i10)));
        bx bxVar = this.f108643d;
        hf0 hf0Var = this.f108640a;
        dm2 dm2Var = this.f108641b;
        bxVar.getClass();
        sx sxVar = new sx(uxVar, bx.a(jz1Var, wyVar, l00Var, hf0Var, dm2Var), new bi1(adAssets), new sb2(adAssets), new mk3(), new os(jz1Var));
        k00 adAssets2 = jz1Var.getAdAssets();
        nn2 nn2Var2 = this.f108642c;
        int i11 = R$dimen.monetization_ads_internal_landscape_vertical_media_content_min_width;
        nn2Var2.getClass();
        return new dd1(R$layout.monetization_ads_internal_native_interstitial_landscape_vetrical_media, sxVar, new tx(new h92(2), new ii1(zf.a.d(context.getResources().getDimension(i11)), new ci1(adAssets2))));
    }
}
