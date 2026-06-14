package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.FullscreenAd;
import com.moloco.sdk.publisher.InterstitialAd;
import com.moloco.sdk.publisher.InterstitialAdShowListener;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements InterstitialAd, i0, FullscreenAd {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l0 f54704b;

    public d(l0 fullscreenAd) {
        Intrinsics.checkNotNullParameter(fullscreenAd, "fullscreenAd");
        this.f54704b = fullscreenAd;
    }

    @Override // com.moloco.sdk.publisher.FullscreenAd
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void show(InterstitialAdShowListener interstitialAdShowListener) {
        this.f54704b.show(f.c(interstitialAdShowListener));
    }

    @Override // com.moloco.sdk.publisher.Destroyable
    public void destroy() {
        this.f54704b.destroy();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f54704b.isLoaded();
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        this.f54704b.load(bidResponseJson, listener);
    }

    @Override // com.moloco.sdk.internal.publisher.i0
    public void setCreateAdObjectStartTime(long j10) {
        this.f54704b.setCreateAdObjectStartTime(j10);
    }
}
