package com.appodeal.ads.adapters.admobmediation.mrec;

import com.appodeal.ads.adapters.admob.mrec.AdmobMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.BaseAdView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends AdmobMrec {
    @Override // com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec
    public final AdListener createListener(BaseAdView baseAdView, UnifiedMrecCallback callback) {
        AdView adView = (AdView) baseAdView;
        Intrinsics.checkNotNullParameter(adView, "adView");
        Intrinsics.checkNotNullParameter(callback, "callback");
        return new a(adView, callback);
    }
}
