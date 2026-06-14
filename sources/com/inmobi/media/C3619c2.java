package com.inmobi.media;

import com.inmobi.ads.AdMetaInfo;
import com.inmobi.ads.AudioStatus;
import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.ads.InMobiBanner;
import com.inmobi.ads.banner.AudioListener;
import com.inmobi.ads.controllers.PublisherCallbacks;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.inmobi.media.c2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3619c2 extends PublisherCallbacks {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private WeakReference<InMobiBanner> f38316a;

    public C3619c2(InMobiBanner banner) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.f38316a = new WeakReference<>(banner);
    }

    @NotNull
    public final WeakReference<InMobiBanner> a() {
        return this.f38316a;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public byte getType() {
        return (byte) 1;
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdClicked(@NotNull Map<Object, ? extends Object> params) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(params, "params");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, params);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDismissed() {
        InMobiBanner ad2 = this.f38316a.get();
        if (ad2 == null) {
            return;
        }
        Y1 mPubListener = ad2.getMPubListener();
        if (mPubListener != null) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            ((Z1) mPubListener).f38088a.onAdDismissed(ad2);
        }
        ad2.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdDisplayed(@NotNull AdMetaInfo info) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner ad2 = this.f38316a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((Z1) mPubListener).f38088a.onAdDisplayed(ad2);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchFailed(InMobiAdRequestStatus status) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(status, "status");
        InMobiBanner ad2 = this.f38316a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(status, "status");
        ((Z1) mPubListener).f38088a.onAdFetchFailed(ad2, status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdFetchSuccessful(AdMetaInfo info) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, info);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdImpression(@Nullable C3740gk c3740gk) {
        InMobiBanner ad2 = this.f38316a.get();
        Y1 mPubListener = ad2 != null ? ad2.getMPubListener() : null;
        if (mPubListener == null) {
            if (c3740gk != null) {
                c3740gk.b();
            }
        } else {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            ((Z1) mPubListener).f38088a.onAdImpression(ad2);
            if (c3740gk != null) {
                c3740gk.c();
            }
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadFailed(@NotNull InMobiAdRequestStatus status) {
        Intrinsics.checkNotNullParameter(status, "status");
        Intrinsics.checkNotNullExpressionValue(C3619c2.class.getSimpleName(), "getSimpleName(...)");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null) {
            return;
        }
        Y1 mPubListener = inMobiBanner.getMPubListener();
        if (mPubListener != null) {
            mPubListener.a(inMobiBanner, status);
        }
        inMobiBanner.scheduleRefresh$media_release();
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAdLoadSucceeded(@NotNull AdMetaInfo info) {
        C3670e2 mAdManager;
        Intrinsics.checkNotNullParameter(info, "info");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mAdManager = inMobiBanner.getMAdManager()) == null) {
            return;
        }
        if (!mAdManager.l()) {
            mAdManager.h();
            inMobiBanner.swapAdUnitsAndDisplayAd$media_release();
            Y1 mPubListener = inMobiBanner.getMPubListener();
            if (mPubListener != null) {
                mPubListener.b(inMobiBanner, info);
            }
            inMobiBanner.scheduleRefresh$media_release();
            return;
        }
        if (mAdManager.l()) {
            AbstractC3845l1 abstractC3845l1F = mAdManager.f();
            if (abstractC3845l1F != null) {
                abstractC3845l1F.c((short) 2173);
                return;
            }
            return;
        }
        AbstractC3845l1 abstractC3845l1F2 = mAdManager.f();
        if (abstractC3845l1F2 != null) {
            abstractC3845l1F2.c((short) 2174);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onAudioStatusChanged(@NotNull V1 item) {
        Intrinsics.checkNotNullParameter(item, "audioStatusInternal");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null) {
            return;
        }
        inMobiBanner.setAudioStatusInternal$media_release(item);
        AudioListener mAudioListener = inMobiBanner.getMAudioListener();
        if (mAudioListener != null) {
            V1.f37869b.getClass();
            Intrinsics.checkNotNullParameter(item, "item");
            int iOrdinal = item.ordinal();
            mAudioListener.onAudioStatusChanged(inMobiBanner, iOrdinal != 1 ? iOrdinal != 2 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING);
        }
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onImraidLog(@NotNull String log) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(log, "log");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        mPubListener.a(inMobiBanner, log);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreated(@NotNull byte[] request) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(request, "request");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        ((Z1) mPubListener).f38088a.onRequestPayloadCreated(request);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRequestPayloadCreationFailed(@NotNull InMobiAdRequestStatus status) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(status, "reason");
        InMobiBanner inMobiBanner = this.f38316a.get();
        if (inMobiBanner == null || (mPubListener = inMobiBanner.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(status, "status");
        ((Z1) mPubListener).f38088a.onRequestPayloadCreationFailed(status);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onRewardsUnlocked(@NotNull Map<Object, ? extends Object> rewards) {
        Y1 mPubListener;
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        InMobiBanner ad2 = this.f38316a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(rewards, "rewards");
        ((Z1) mPubListener).f38088a.onRewardsUnlocked(ad2, rewards);
    }

    @Override // com.inmobi.ads.controllers.PublisherCallbacks
    public void onUserLeftApplication() {
        Y1 mPubListener;
        InMobiBanner ad2 = this.f38316a.get();
        if (ad2 == null || (mPubListener = ad2.getMPubListener()) == null) {
            return;
        }
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ((Z1) mPubListener).f38088a.onUserLeftApplication(ad2);
    }

    public final void a(@NotNull WeakReference<InMobiBanner> weakReference) {
        Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
        this.f38316a = weakReference;
    }
}
