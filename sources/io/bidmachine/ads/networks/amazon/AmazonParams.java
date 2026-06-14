package io.bidmachine.ads.networks.amazon;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import od.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class AmazonParams extends o {

    @Nullable
    final String bidInfo;

    public AmazonParams(@NonNull k kVar) {
        super(kVar);
        this.bidInfo = kVar.l("bid_info");
    }

    public boolean isValid(@NonNull c cVar) {
        if (!TextUtils.isEmpty(this.bidInfo)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("bid_info"));
        return false;
    }
}
