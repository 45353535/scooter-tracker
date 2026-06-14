package com.startapp.sdk.ads.banner.bannerstandard;

/* JADX INFO: loaded from: classes11.dex */
public final class d implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f63733a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerStandard f63734b;

    public d(BannerStandard bannerStandard, String str) {
        this.f63734b = bannerStandard;
        this.f63733a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63734b.reloadImpl(this.f63733a);
    }
}
