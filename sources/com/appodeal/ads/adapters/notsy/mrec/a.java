package com.appodeal.ads.adapters.notsy.mrec;

import android.content.Context;
import com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdView;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends UnifiedAdmobMrec {
    @Override // com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec
    public final BaseAdView createAdView(Context context) {
        new AdManagerAdView(context).setDescendantFocusability(393216);
        return new AdManagerAdView(context);
    }
}
