package io.bidmachine.ads.networks.vungle;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import net.pubnative.lite.sdk.analytics.Reporting;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class VungleParams extends o {

    @Nullable
    final String markup;

    @Nullable
    final String placementId;

    VungleParams(@NonNull k kVar) {
        super(kVar);
        this.placementId = kVar.l(Reporting.Key.PLACEMENT_ID);
        this.markup = kVar.l("markup");
    }

    public boolean isValid(@NonNull c cVar) {
        if (TextUtils.isEmpty(this.placementId)) {
            cVar.onAdLoadFailed(ae.a.k(Reporting.Key.PLACEMENT_ID));
            return false;
        }
        if (!TextUtils.isEmpty(this.markup)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("markup"));
        return false;
    }
}
