package io.bidmachine.ads.networks.gam;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: loaded from: classes12.dex */
class GAMParams extends od.o {

    @Nullable
    final String adUnitId;

    @Nullable
    final String price;

    @Nullable
    final String score;

    GAMParams(@NonNull od.k kVar) {
        super(kVar);
        this.adUnitId = kVar.l("ad_unit_id");
        this.score = kVar.l(FirebaseAnalytics.Param.SCORE);
        this.price = kVar.l("price");
    }

    public boolean isValid(@NonNull od.c cVar) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            cVar.onAdLoadFailed(ae.a.k("ad_unit_id"));
            return false;
        }
        if (TextUtils.isEmpty(this.score)) {
            cVar.onAdLoadFailed(ae.a.k(FirebaseAnalytics.Param.SCORE));
            return false;
        }
        if (!TextUtils.isEmpty(this.price)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("price"));
        return false;
    }
}
