package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.RewardedInterstitialAd;
import com.moloco.sdk.publisher.RewardedInterstitialAdShowListener;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l {

    public static final class a implements RewardedInterstitialAdShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f54790a = "RewardedInterstitialAdShowListenerImpl";

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f54791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Function0 f54792c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ RewardedInterstitialAdShowListener f54793d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f54794e;

        public a(Function0 function0, RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, boolean z10) {
            this.f54792c = function0;
            this.f54793d = rewardedInterstitialAdShowListener;
            this.f54794e = z10;
        }

        public final void a(MolocoAd molocoAd) {
            if (this.f54791b) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f54790a, "issuing of reward is already handled", false, 4, null);
                return;
            }
            this.f54791b = true;
            if (!Intrinsics.areEqual(this.f54792c.invoke(), Boolean.FALSE)) {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f54790a, "reward can't be issued: ad was forcibly closed or ad was missing", false, 4, null);
            } else {
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, this.f54790a, "issuing of reward...", false, 4, null);
                onUserRewarded(molocoAd);
            }
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54793d.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            a(molocoAd);
            this.f54793d.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f54793d.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54793d.onAdShowSuccess(molocoAd);
            if (this.f54794e) {
                onRewardedVideoStarted(molocoAd);
            }
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoCompleted(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            a(molocoAd);
            this.f54793d.onRewardedVideoCompleted(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onRewardedVideoStarted(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54793d.onRewardedVideoStarted(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.RewardedInterstitialAdShowListener
        public void onUserRewarded(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54793d.onUserRewarded(molocoAd);
        }
    }

    public static final RewardedInterstitialAd a(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, k0 adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, n adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appLifecycleTrackerService, "appLifecycleTrackerService");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(adDataHolder, "adDataHolder");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(adCreateLoadTimeoutManager, "adCreateLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new j(new l0(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new Function1() { // from class: com.moloco.sdk.internal.publisher.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.e((com.moloco.sdk.internal.ortb.model.x) obj);
            }
        }, adDataHolder, AdFormatType.REWARDED, watermark, adCreateLoadTimeoutManager, metricsRecorder), adUnitId);
    }

    public static final RewardedInterstitialAdShowListener c(RewardedInterstitialAdShowListener rewardedInterstitialAdShowListener, Function0 provideSdkEvents) {
        Intrinsics.checkNotNullParameter(provideSdkEvents, "provideSdkEvents");
        return new m(rewardedInterstitialAdShowListener, provideSdkEvents, com.moloco.sdk.internal.l0.b());
    }

    public static final RewardedInterstitialAdShowListener d(RewardedInterstitialAdShowListener listenerTracker, boolean z10, Function0 isAdForciblyClosed) {
        Intrinsics.checkNotNullParameter(listenerTracker, "listenerTracker");
        Intrinsics.checkNotNullParameter(isAdForciblyClosed, "isAdForciblyClosed");
        return new a(isAdForciblyClosed, listenerTracker, z10);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q e(com.moloco.sdk.internal.ortb.model.x xVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVarJ;
        return (xVar == null || (qVarJ = com.moloco.sdk.internal.i.j(xVar)) == null) ? com.moloco.sdk.internal.i.i() : qVarJ;
    }
}
