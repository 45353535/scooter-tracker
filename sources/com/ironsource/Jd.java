package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.rewarded.RewardedAd;
import com.unity3d.ironsourceads.rewarded.RewardedAdLoaderListener;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class Jd implements T<RewardedAd> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Kf f41176a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final RewardedAdLoaderListener f41177b;

    public Jd(@NotNull Kf threadManager, @NotNull RewardedAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f41176a = threadManager;
        this.f41177b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(@NotNull final RewardedAd adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f41176a.a(new Runnable() { // from class: com.ironsource.ii
            @Override // java.lang.Runnable
            public final void run() {
                Jd.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.T
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoadFailed error: " + error);
        this.f41176a.a(new Runnable() { // from class: com.ironsource.hi
            @Override // java.lang.Runnable
            public final void run() {
                Jd.a(this.f43283b, error);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(RewardedAd adObject, Jd this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("RewardedAdLoaderListener.onRewardedAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f41177b.onRewardedAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(Jd this$0, IronSourceError error) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(error, "$error");
        this$0.f41177b.onRewardedAdLoadFailed(error);
    }
}
