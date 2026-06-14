package io.bidmachine.ads.networks.vast;

import ae.e;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import m9.c;
import od.k;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class VastParams extends o {

    @NonNull
    final y8.a cacheControl;
    final int companionSkipOffset;

    @Nullable
    final String creativeAdm;
    final boolean omsdkEnabled;
    final float placeholderTimeoutSec;
    final int skipOffset;
    final boolean useNativeClose;

    VastParams(@NonNull k kVar) {
        super(kVar);
        this.creativeAdm = kVar.l("creativeAdm");
        this.cacheControl = e.b(kVar.p("cacheControl"));
        this.placeholderTimeoutSec = kVar.q("placeholderTimeoutSec");
        this.skipOffset = kVar.f("skipOffset");
        this.companionSkipOffset = kVar.f("companionSkipOffset");
        this.useNativeClose = kVar.d("useNativeClose");
        this.omsdkEnabled = kVar.m("omsdk_enabled", true) && c.g();
    }

    public boolean isValid(@NonNull od.c cVar) {
        if (!TextUtils.isEmpty(this.creativeAdm)) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("creativeAdm"));
        return false;
    }
}
