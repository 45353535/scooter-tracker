package com.appodeal.ads;

import android.app.Activity;
import android.util.TypedValue;
import com.appodeal.ads.unified.UnifiedAd;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class cf extends s7 {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13183s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13184t;

    public cf(gf gfVar, AdNetwork adNetwork, x2 x2Var) {
        super(gfVar, adNetwork, x2Var);
        this.f13184t = -1;
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAd a(AdNetwork adNetwork) {
        return adNetwork.createBanner();
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdCallback b() {
        return new ue(this);
    }

    @Override // com.appodeal.ads.uc
    public final UnifiedAdParams i() {
        return new ye();
    }

    @Override // com.appodeal.ads.s7
    public final int r(Activity activity) {
        float f10 = this.f13183s;
        HashMap map = j2.f13491a;
        return Math.round(TypedValue.applyDimension(1, f10, activity.getResources().getDisplayMetrics()));
    }

    @Override // com.appodeal.ads.s7
    public final int s(Activity activity) {
        if (ee.f13290b && this.f14936b.getIsSupportSmartBanners()) {
            return -1;
        }
        if (ee.b(activity)) {
            HashMap map = j2.f13491a;
            return Math.round(TypedValue.applyDimension(1, 728.0f, activity.getResources().getDisplayMetrics()));
        }
        HashMap map2 = j2.f13491a;
        return Math.round(TypedValue.applyDimension(1, 320.0f, activity.getResources().getDisplayMetrics()));
    }
}
