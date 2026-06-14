package com.appsflyer.internal;

import android.app.Activity;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFi1nSDK implements AFi1kSDK {

    @Nullable
    private String getMonetizationNetwork;

    private static String getRevenue(Activity activity) {
        Uri uriK_ = AFb1tSDK.k_(activity != null ? activity.getIntent() : null);
        String string = uriK_ != null ? uriK_.toString() : null;
        if (string == null) {
            string = "";
        }
        if (getRevenue(string)) {
            return null;
        }
        return string;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    @NotNull
    public final String getCurrencyIso4217Code(@Nullable Activity activity) {
        Uri referrer = (activity == null || activity.getIntent() == null) ? null : activity.getReferrer();
        String string = referrer != null ? referrer.toString() : null;
        return string == null ? "" : string;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    @Nullable
    public final String getMediationNetwork(@Nullable Activity activity) {
        String str = this.getMonetizationNetwork;
        this.getMonetizationNetwork = null;
        return (str == null || str.length() == 0) ? getRevenue(activity) : str;
    }

    @Override // com.appsflyer.internal.AFi1kSDK
    public final void getMonetizationNetwork(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "");
        String str = this.getMonetizationNetwork;
        if (str == null || str.length() == 0) {
            this.getMonetizationNetwork = getRevenue(activity);
        }
    }

    private static boolean getRevenue(String str) {
        return StringsKt.a0(str, "android-app://", false, 2, null);
    }
}
