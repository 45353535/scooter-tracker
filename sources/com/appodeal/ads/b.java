package com.appodeal.ads;

import android.app.Activity;
import android.util.TypedValue;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class b extends s7 {
    public b(i iVar, AdNetwork adNetwork, x2 x2Var) {
        super(iVar, adNetwork, x2Var);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createMrec();
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdCallback b() {
        return new df(this);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdParams i() {
        return new hf();
    }

    @Override // com.appodeal.ads.s7
    public final int r(Activity activity) {
        HashMap map = j2.f13491a;
        return Math.round(TypedValue.applyDimension(1, 250.0f, activity.getResources().getDisplayMetrics()));
    }

    @Override // com.appodeal.ads.s7
    public final int s(Activity activity) {
        HashMap map = j2.f13491a;
        return Math.round(TypedValue.applyDimension(1, 300.0f, activity.getResources().getDisplayMetrics()));
    }
}
