package com.moloco.sdk.internal.publisher;

import android.content.Context;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdShowListener;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class f {

    public static final class a implements InterstitialAdShowListener, AdShowListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ AdShowListener f54753a;

        public a(InterstitialAdShowListener interstitialAdShowListener) {
            this.f54753a = v.a(interstitialAdShowListener);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdClicked(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54753a.onAdClicked(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdHidden(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54753a.onAdHidden(molocoAd);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowFailed(MolocoAdError molocoAdError) {
            Intrinsics.checkNotNullParameter(molocoAdError, "molocoAdError");
            this.f54753a.onAdShowFailed(molocoAdError);
        }

        @Override // com.moloco.sdk.publisher.AdShowListener
        public void onAdShowSuccess(MolocoAd molocoAd) {
            Intrinsics.checkNotNullParameter(molocoAd, "molocoAd");
            this.f54753a.onAdShowSuccess(molocoAd);
        }
    }

    public static final InterstitialAd a(Context context, com.moloco.sdk.internal.services.q appLifecycleTrackerService, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adUnitId, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, k0 adDataHolder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, n adCreateLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder) {
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
        return new d(new l0(context, appLifecycleTrackerService, customUserEventBuilderService, adUnitId, persistentHttpRequest, externalLinkHandler, new Function1() { // from class: com.moloco.sdk.internal.publisher.e
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f.d((com.moloco.sdk.internal.ortb.model.x) obj);
            }
        }, adDataHolder, AdFormatType.INTERSTITIAL, watermark, adCreateLoadTimeoutManager, metricsRecorder));
    }

    public static final InterstitialAdShowListener c(InterstitialAdShowListener interstitialAdShowListener) {
        return new a(interstitialAdShowListener);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q d(com.moloco.sdk.internal.ortb.model.x xVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q qVarJ;
        return (xVar == null || (qVarJ = com.moloco.sdk.internal.i.j(xVar)) == null) ? com.moloco.sdk.internal.i.i() : qVarJ;
    }
}
