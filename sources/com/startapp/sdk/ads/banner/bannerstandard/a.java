package com.startapp.sdk.ads.banner.bannerstandard;

import com.startapp.sdk.internal.zf;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements zf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f63723a;

    public a(BannerStandard bannerStandard) {
        this.f63723a = bannerStandard;
    }

    @Override // com.startapp.sdk.internal.zf
    public final void a(String str) {
        this.f63723a.onImpressionSent(str);
    }
}
