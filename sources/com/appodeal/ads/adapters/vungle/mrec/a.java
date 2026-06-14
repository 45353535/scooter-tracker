package com.appodeal.ads.adapters.vungle.mrec;

import com.appodeal.ads.adapters.vungle.e;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.vungle.ads.BannerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(UnifiedMrecCallback callback) {
        super(callback);
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    @Override // com.appodeal.ads.adapters.vungle.e
    public final void a(BannerView view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ((UnifiedMrecCallback) this.f12601b).onAdLoaded(view);
    }
}
