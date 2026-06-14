package com.amazon.aps.ads;

import com.amazon.aps.ads.listeners.ApsAdListener;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.ads.util.ApsUtils;
import com.ironsource.Df;
import com.mobilefuse.sdk.telemetry.TelemetryAdLifecycleEvent;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\t\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\r"}, d2 = {"com/amazon/aps/ads/ApsAdController$apsAdListenerInternal$1", "Lcom/amazon/aps/ads/listeners/ApsAdListener;", "onAdLoaded", "", "apsAd", "Lcom/amazon/aps/ads/ApsAd;", "onAdFailedToLoad", Df.f40645f, "onImpressionFired", TelemetryAdLifecycleEvent.AD_ERROR, "onAdOpen", Df.f40646g, "onVideoCompleted", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsAdController$apsAdListenerInternal$1 implements ApsAdListener {
    final /* synthetic */ ApsAdController this$0;

    ApsAdController$apsAdListenerInternal$1(ApsAdController apsAdController) {
        this.this$0 = apsAdController;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdClicked$lambda$2(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdClicked called");
        apsAdController.apsAdListener.onAdClicked(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdClosed$lambda$7(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdClosed called");
        apsAdController.apsAdListener.onAdClosed(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdError$lambda$5(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdError called");
        apsAdController.apsAdListener.onAdError(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdFailedToLoad$lambda$1(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdFailedToLoad called");
        apsAdController.apsAdListener.onAdFailedToLoad(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdLoaded$lambda$0(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdLoaded called");
        apsAdController.apsAdListener.onAdLoaded(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAdOpen$lambda$6(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onAdOpen called");
        apsAdController.apsAdListener.onAdOpen(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onImpressionFired$lambda$4(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onImpressionFired called");
        if (apsAd != null && (apsAd.getApsAdFormat() == ApsAdFormat.INTERSTITIAL || apsAd.getApsAdFormat() == ApsAdFormat.REWARDED_VIDEO)) {
            ApsUtils.INSTANCE.fireAAXImpressionPixel(apsAd);
        }
        apsAdController.apsAdListener.onImpressionFired(apsAd);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onVideoCompleted$lambda$8(ApsAdController apsAdController, ApsAd apsAd) {
        ApsLog.d(apsAdController.TAG, "onVideoCompleted called");
        apsAdController.apsAdListener.onVideoCompleted(apsAd);
        return Unit.f93236a;
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdClicked(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdClicked$lambda$2(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdClosed(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdClosed$lambda$7(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdError(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdError$lambda$5(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdFailedToLoad(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdFailedToLoad$lambda$1(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdLoaded(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdLoaded$lambda$0(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onAdOpen(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onAdOpen$lambda$6(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onImpressionFired(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onImpressionFired$lambda$4(apsAdController, apsAd);
            }
        });
    }

    @Override // com.amazon.aps.ads.listeners.ApsAdListener
    public void onVideoCompleted(final ApsAd apsAd) {
        final ApsAdController apsAdController = this.this$0;
        apsAdController.safeCall(new Function0() { // from class: com.amazon.aps.ads.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApsAdController$apsAdListenerInternal$1.onVideoCompleted$lambda$8(apsAdController, apsAd);
            }
        });
    }
}
