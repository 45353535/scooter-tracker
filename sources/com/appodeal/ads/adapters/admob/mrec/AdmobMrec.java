package com.appodeal.ads.adapters.admob.mrec;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobMrec extends UnifiedAdmobMrec<AdView, AdRequest> {
    @Override // com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec
    @NonNull
    public AdView createAdView(@NonNull Context context) {
        AdView adView = new AdView(context);
        adView.setDescendantFocusability(393216);
        return adView;
    }
}
