package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.ads.banner.bannerstandard.BannerStandard;
import com.startapp.sdk.internal.lk;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard.a f63735a;

    public e(BannerStandard.a aVar) {
        this.f63735a = aVar;
    }

    public final void a(boolean z10, lk lkVar) {
        this.f63735a.fireViewableChangeEvent(z10);
        this.f63735a.fireExposureChangeEvent(lkVar);
        if (z10) {
            BannerStandard.this.proceedWithImpression();
        }
    }
}
