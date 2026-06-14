package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiInterstitial;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.ka, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3829ka extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public WeakReference<InMobiInterstitial> f38871a;

    public C3829ka(InMobiInterstitial interstitial) {
        Intrinsics.checkNotNullParameter(interstitial, "interstitial");
        this.f38871a = new WeakReference<>(interstitial);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        AbstractC3755ha mPubListener$media_release;
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((C3780ia) mPubListener$media_release).f38753a.onAdDismissed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayFailed() {
        AbstractC3755ha mPubListener$media_release;
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((C3780ia) mPubListener$media_release).f38753a.onAdDisplayFailed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo info) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(info, "info");
        ((C3780ia) mPubListener$media_release).f38753a.onAdDisplayed(ad2, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3780ia) mPubListener$media_release).f38753a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable C3740gk c3740gk) {
        InMobiInterstitial ad2 = this.f38871a.get();
        AbstractC3755ha mPubListener$media_release = ad2 != null ? ad2.getMPubListener$media_release() : null;
        if (mPubListener$media_release == null) {
            if (c3740gk != null) {
                c3740gk.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            ((C3780ia) mPubListener$media_release).f38753a.onAdImpression(ad2);
            if (c3740gk != null) {
                c3740gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.b(inMobiInterstitial, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdWillDisplay() {
        AbstractC3755ha mPubListener$media_release;
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((C3780ia) mPubListener$media_release).f38753a.onAdWillDisplay(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        mPubListener$media_release.a(inMobiInterstitial, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] request) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        ((C3780ia) mPubListener$media_release).f38753a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiInterstitial inMobiInterstitial = this.f38871a.get();
        if (inMobiInterstitial == null || (mPubListener$media_release = inMobiInterstitial.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((C3780ia) mPubListener$media_release).f38753a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        AbstractC3755ha mPubListener$media_release;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((C3780ia) mPubListener$media_release).f38753a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        AbstractC3755ha mPubListener$media_release;
        InMobiInterstitial ad2 = this.f38871a.get();
        if (ad2 == null || (mPubListener$media_release = ad2.getMPubListener$media_release()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((C3780ia) mPubListener$media_release).f38753a.onUserLeftApplication(ad2);
    }
}
