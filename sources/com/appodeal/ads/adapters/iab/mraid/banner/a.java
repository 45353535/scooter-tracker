package com.appodeal.ads.adapters.iab.mraid.banner;

import android.content.Context;
import com.appodeal.ads.adapters.iab.unified.u;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerParams f12214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerCallback f12215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ b f12216c;

    public a(b bVar, UnifiedBannerParams unifiedBannerParams, UnifiedBannerCallback unifiedBannerCallback) {
        this.f12216c = bVar;
        this.f12214a = unifiedBannerParams;
        this.f12215b = unifiedBannerCallback;
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void a(Context context, Object obj) {
        b bVar = this.f12216c;
        UnifiedBannerParams unifiedBannerParams = this.f12214a;
        UnifiedBannerCallback unifiedBannerCallback = this.f12215b;
        com.appodeal.ads.adapters.iab.mraid.unified.b bVar2 = bVar.f12241a;
        bVar2.getClass();
        bVar2.c(context, unifiedBannerParams, (com.appodeal.ads.adapters.iab.mraid.unified.a) obj, unifiedBannerCallback);
    }

    @Override // com.appodeal.ads.adapters.iab.unified.u
    public final void b(LoadingError loadingError) {
        this.f12215b.onAdLoadFailed(loadingError);
    }
}
