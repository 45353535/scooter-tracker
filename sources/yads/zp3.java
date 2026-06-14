package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.interstitial.InterstitialAd;
import com.yandex.mobile.ads.interstitial.InterstitialAdEventListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class zp3 implements InterstitialAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ub1 f118756a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dn3 f118757b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dk f118758c;

    public zp3(ub1 ub1Var, dn3 dn3Var, dk dkVar) {
        this.f118756a = ub1Var;
        this.f118757b = dn3Var;
        this.f118758c = dkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zp3) && Intrinsics.areEqual(((zp3) obj).f118756a, this.f118756a);
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final List getAdAttributes() {
        List<ec> listA = this.f118756a.f116596a.f109633f.a();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listA, 10));
        for (ec ecVar : listA) {
            this.f118758c.getClass();
            arrayList.add(new ck(ecVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final AdInfo getInfo() {
        dn3 dn3Var = this.f118757b;
        oz ozVarD = this.f118756a.f116596a.d();
        dn3Var.getClass();
        return dn3.a(ozVarD);
    }

    public final int hashCode() {
        return this.f118756a.hashCode();
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void setAdEventListener(InterstitialAdEventListener interstitialAdEventListener) {
        fq3 fq3Var = new fq3(interstitialAdEventListener);
        ub1 ub1Var = this.f118756a;
        ub1Var.f116598c.a();
        ub1Var.f116597b.f114685c = fq3Var;
    }

    @Override // com.yandex.mobile.ads.interstitial.InterstitialAd
    public final void show(Activity activity) {
        this.f118756a.a(activity);
    }
}
