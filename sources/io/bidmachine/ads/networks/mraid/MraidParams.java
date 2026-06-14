package io.bidmachine.ads.networks.mraid;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b9.k;
import io.bidmachine.protobuf.AdExtension;
import od.o;

/* JADX INFO: loaded from: classes12.dex */
class MraidParams extends o {

    @NonNull
    final y8.a cacheControl;

    @Nullable
    final k closeableViewStyle;

    @Nullable
    final k countDownStyle;

    @Nullable
    final String creativeAdm;
    final int height;
    final boolean omsdkEnabled;
    final float placeholderTimeoutSec;
    final int progressDuration;

    @Nullable
    final k progressStyle;

    /* JADX INFO: renamed from: r1, reason: collision with root package name */
    final boolean f79422r1;

    /* JADX INFO: renamed from: r2, reason: collision with root package name */
    final boolean f79423r2;
    final int skipOffset;

    @Nullable
    final String storeUrl;
    final boolean useNativeClose;
    final int width;

    MraidParams(@NonNull od.k kVar) {
        super(kVar);
        this.creativeAdm = kVar.l("creativeAdm");
        this.width = kVar.f("width");
        this.height = kVar.f("height");
        this.cacheControl = ae.e.b(kVar.p("cacheControl"));
        this.placeholderTimeoutSec = kVar.q("placeholderTimeoutSec");
        this.skipOffset = kVar.f("skipOffset");
        this.useNativeClose = kVar.d("useNativeClose");
        this.omsdkEnabled = kVar.m("omsdk_enabled", true) && m9.c.g();
        this.f79422r1 = kVar.d("r1");
        this.f79423r2 = kVar.d("r2");
        this.storeUrl = kVar.l("store_url");
        this.progressDuration = kVar.f("progress_duration");
        Object objP = kVar.p("close_button_control_asset");
        this.closeableViewStyle = objP instanceof AdExtension.ControlAsset ? ae.e.c((AdExtension.ControlAsset) objP) : null;
        Object objP2 = kVar.p("countdown_control_asset");
        this.countDownStyle = objP2 instanceof AdExtension.ControlAsset ? ae.e.c((AdExtension.ControlAsset) objP2) : null;
        Object objP3 = kVar.p("progress_control_asset");
        this.progressStyle = objP3 instanceof AdExtension.ControlAsset ? ae.e.c((AdExtension.ControlAsset) objP3) : null;
    }

    public boolean isValid(@NonNull od.c cVar) {
        if (TextUtils.isEmpty(this.creativeAdm)) {
            cVar.onAdLoadFailed(ae.a.k("creativeAdm"));
            return false;
        }
        if (this.width == 0) {
            cVar.onAdLoadFailed(ae.a.k("width"));
            return false;
        }
        if (this.height != 0) {
            return true;
        }
        cVar.onAdLoadFailed(ae.a.k("height"));
        return false;
    }
}
