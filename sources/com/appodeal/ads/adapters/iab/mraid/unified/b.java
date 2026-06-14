package com.appodeal.ads.adapters.iab.mraid.unified;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends p {
    public b(c cVar) {
        super(cVar);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.appodeal.ads.adapters.iab.mraid.unified.m, com.appodeal.ads.unified.UnifiedViewAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.p, com.appodeal.ads.adapters.iab.mraid.unified.n
    public final void a(Context context, UnifiedAdParams unifiedAdParams, a aVar, UnifiedAdCallback unifiedAdCallback, String str) {
        UnifiedBannerParams unifiedBannerParams = (UnifiedBannerParams) unifiedAdParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedAdCallback;
        int i10 = aVar.f12238j;
        int i11 = aVar.f12239k;
        if ((i10 > unifiedBannerParams.getMaxWidth(context) || i11 > unifiedBannerParams.getMaxHeight(context)) && ((i10 * 50) / i11 > unifiedBannerParams.getMaxWidth(context) || 50 > unifiedBannerParams.getMaxHeight(context))) {
            unifiedBannerCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
        } else {
            this.f12251a.a(context, unifiedBannerParams, aVar, unifiedBannerCallback, str);
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.appodeal.ads.adapters.iab.mraid.unified.m, com.appodeal.ads.unified.UnifiedViewAd] */
    @Override // com.appodeal.ads.adapters.iab.mraid.unified.p
    /* JADX INFO: renamed from: k */
    public final void a(Context context, UnifiedViewAdParams unifiedViewAdParams, a aVar, UnifiedViewAdCallback unifiedViewAdCallback, String str) {
        UnifiedBannerParams unifiedBannerParams = (UnifiedBannerParams) unifiedViewAdParams;
        UnifiedBannerCallback unifiedBannerCallback = (UnifiedBannerCallback) unifiedViewAdCallback;
        int i10 = aVar.f12238j;
        int i11 = aVar.f12239k;
        if ((i10 > unifiedBannerParams.getMaxWidth(context) || i11 > unifiedBannerParams.getMaxHeight(context)) && ((i10 * 50) / i11 > unifiedBannerParams.getMaxWidth(context) || 50 > unifiedBannerParams.getMaxHeight(context))) {
            unifiedBannerCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
        } else {
            this.f12251a.a(context, unifiedBannerParams, aVar, unifiedBannerCallback, str);
        }
    }

    @Override // com.appodeal.ads.adapters.iab.mraid.unified.p
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final void c(Context context, UnifiedBannerParams unifiedBannerParams, a aVar, UnifiedBannerCallback unifiedBannerCallback) {
        int i10 = aVar.f12238j;
        int i11 = aVar.f12239k;
        if (i10 <= unifiedBannerParams.getMaxWidth(context) && i11 <= unifiedBannerParams.getMaxHeight(context)) {
            super.c(context, unifiedBannerParams, aVar, unifiedBannerCallback);
            return;
        }
        int i12 = (i10 * 50) / i11;
        if (i12 > unifiedBannerParams.getMaxWidth(context) || 50 > unifiedBannerParams.getMaxHeight(context)) {
            unifiedBannerCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
        } else {
            super.c(context, unifiedBannerParams, new a(aVar.f12229a, aVar.f12230b, aVar.f12231c, aVar.f12232d, aVar.f12233e, aVar.f12234f, aVar.f12235g, aVar.f12236h, aVar.f12237i, i12, 50, aVar.f12240l), unifiedBannerCallback);
        }
    }
}
