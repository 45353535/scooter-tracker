package yads;

import android.app.Activity;
import com.yandex.mobile.ads.common.AdInfo;
import com.yandex.mobile.ads.rewarded.RewardedAd;
import com.yandex.mobile.ads.rewarded.RewardedAdEventListener;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class er3 implements RewardedAd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final yo2 f110451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dn3 f110452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final dk f110453c;

    public er3(yo2 yo2Var, dn3 dn3Var, dk dkVar) {
        this.f110451a = yo2Var;
        this.f110452b = dn3Var;
        this.f110453c = dkVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof er3) && Intrinsics.areEqual(((er3) obj).f110451a, this.f110451a);
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final List getAdAttributes() {
        List<ec> list = this.f110451a.f118311g;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (ec ecVar : list) {
            this.f110453c.getClass();
            arrayList.add(new ck(ecVar));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final AdInfo getInfo() {
        dn3 dn3Var = this.f110452b;
        oz ozVar = this.f110451a.f118310f;
        dn3Var.getClass();
        return dn3.a(ozVar);
    }

    public final int hashCode() {
        return this.f110451a.hashCode();
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void setAdEventListener(RewardedAdEventListener rewardedAdEventListener) {
        lr3 lr3Var = new lr3(rewardedAdEventListener);
        yo2 yo2Var = this.f110451a;
        yo2Var.f118307c.a();
        yo2Var.f118306b.f115460c = lr3Var;
    }

    @Override // com.yandex.mobile.ads.rewarded.RewardedAd
    public final void show(Activity activity) {
        this.f110451a.a(activity);
    }
}
