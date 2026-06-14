package yads;

import android.content.Context;
import com.yandex.mobile.ads.R$layout;

/* JADX INFO: loaded from: classes4.dex */
public final class zd2 implements hx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hf0 f118632a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dm2 f118633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bx f118634c;

    public zd2(aw awVar, mr1 mr1Var, bx bxVar) {
        this.f118632a = awVar;
        this.f118633b = mr1Var;
        this.f118634c = bxVar;
    }

    @Override // yads.hx0
    public final dd1 a(Context context, t9 t9Var, jz1 jz1Var, wy wyVar, l00 l00Var) {
        k00 adAssets = jz1Var.getAdAssets();
        bx bxVar = this.f118634c;
        hf0 hf0Var = this.f118632a;
        dm2 dm2Var = this.f118633b;
        bxVar.getClass();
        return new dd1(R$layout.monetization_ads_internal_native_interstitial_portrait, new sx(bx.a(jz1Var, wyVar, l00Var, hf0Var, dm2Var), new sk1(new nx1(), new ci1(adAssets)), new mk3(), new os(jz1Var), new ms(new vw1(), new ls(context))), new h92(1));
    }
}
