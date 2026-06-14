package com.startapp.sdk.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.startapp.sdk.ads.external.config.AdUnitConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class p7 implements h7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f65084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AdUnitConfig f65085b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public com.startapp.sdk.adsbase.l f65086c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public AdManagerInterstitialAd f65087d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RewardedAd f65088e;

    static {
        Intrinsics.checkNotNullExpressionValue(p7.class.getSimpleName(), "getSimpleName(...)");
    }

    public p7(Context context, AdUnitConfig config) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f65084a = context;
        this.f65085b = config;
    }

    public static final void a(p7 this$0, RewardItem it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "it");
        com.startapp.sdk.adsbase.l lVar = this$0.f65086c;
        if (lVar != null) {
            lVar.f();
        }
    }

    public final void a(Activity activity) {
        RewardedAd rewardedAd = this.f65088e;
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new o7(this));
        }
        RewardedAd rewardedAd2 = this.f65088e;
        if (rewardedAd2 != null) {
            rewardedAd2.show(activity, new OnUserEarnedRewardListener() { // from class: com.startapp.sdk.internal.om
                @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                public final void onUserEarnedReward(RewardItem rewardItem) {
                    p7.a(this.f65055b, rewardItem);
                }
            });
        }
    }
}
