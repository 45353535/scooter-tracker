package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.ironsourceads.banner.BannerAdLoaderListener;
import com.unity3d.ironsourceads.banner.BannerAdView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: com.ironsource.d3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4273d3 implements T<BannerAdView> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Kf f42854a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final BannerAdLoaderListener f42855b;

    public C4273d3(@NotNull Kf threadManager, @NotNull BannerAdLoaderListener publisherListener) {
        Intrinsics.checkNotNullParameter(threadManager, "threadManager");
        Intrinsics.checkNotNullParameter(publisherListener, "publisherListener");
        this.f42854a = threadManager;
        this.f42855b = publisherListener;
    }

    @Override // com.ironsource.T
    public void a(@NotNull final BannerAdView adObject) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        this.f42854a.a(new Runnable() { // from class: com.ironsource.nk
            @Override // java.lang.Runnable
            public final void run() {
                C4273d3.a(adObject, this);
            }
        });
    }

    @Override // com.ironsource.T
    public void b(@NotNull final IronSourceError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f42854a.a(new Runnable() { // from class: com.ironsource.ok
            @Override // java.lang.Runnable
            public final void run() {
                C4273d3.a(error, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(BannerAdView adObject, C4273d3 this$0) {
        Intrinsics.checkNotNullParameter(adObject, "$adObject");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoaded adInfo: " + adObject.getAdInfo());
        this$0.f42855b.onBannerAdLoaded(adObject);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(IronSourceError error, C4273d3 this$0) {
        Intrinsics.checkNotNullParameter(error, "$error");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.CALLBACK.info("BannerAdLoaderListener.onBannerAdLoadFailed error: " + error);
        this$0.f42855b.onBannerAdLoadFailed(error);
    }
}
