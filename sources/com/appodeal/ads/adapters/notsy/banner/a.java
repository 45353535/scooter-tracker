package com.appodeal.ads.adapters.notsy.banner;

import android.content.Context;
import com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedAdmobBanner {
    @Override // com.appodeal.ads.adapters.admob.banner.UnifiedAdmobBanner
    public final BaseAdView createAdView(Context context) {
        new AdManagerAdView(context).setDescendantFocusability(393216);
        return new AdManagerAdView(context);
    }
}
