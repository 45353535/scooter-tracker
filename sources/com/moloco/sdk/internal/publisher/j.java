package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements RewardedInterstitialAd, i0, FullscreenAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f54774b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f54775c;

    public j(l0 fullscreenAd, String adUnitId) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.f54774b = fullscreenAd;
        this.f54775c = adUnitId;
    }

    public static final com.moloco.sdk.internal.ortb.model.z a(j jVar) {
        return jVar.f54774b.q();
    }

    public static final Unit b(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, j jVar, boolean z10) {
        rewardedInterstitialAdShowListener.onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(jVar.f54775c, null, null, 6, null));
        return Unit.f93236a;
    }

    public static final Boolean c(j jVar) {
        return jVar.f54774b.v();
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void show(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener) {
        final RewardedInterstitialAdShowListener rewardedInterstitialAdShowListenerD = l.d(l.c(rewardedInterstitialAdShowListener, new Function0() { // from class: com.moloco.sdk.internal.publisher.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.a(this.f54770b);
            }
        }), this.f54774b.p() == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b, new Function0() { // from class: com.moloco.sdk.internal.publisher.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.c(this.f54771b);
            }
        });
        this.f54774b.l(new Function1() { // from class: com.moloco.sdk.internal.publisher.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.b(rewardedInterstitialAdShowListenerD, this, ((Boolean) obj).booleanValue());
            }
        });
        this.f54774b.show(rewardedInterstitialAdShowListenerD);
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f54774b.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f54774b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f54774b.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54774b.setCreateAdObjectStartTime(j10);
    }
}
