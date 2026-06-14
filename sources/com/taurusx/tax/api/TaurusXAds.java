package com.taurusx.tax.api;

import android.content.Context;
import android.text.TextUtils;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.w.z;

/* JADX INFO: loaded from: classes11.dex */
public class TaurusXAds {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final String f65786z = "TaurusXAds";

    public static String getAppId() {
        return z.t().w();
    }

    public static Context getContext() {
        return z.t().o();
    }

    public static String getSdkVersion() {
        return "1.12.2";
    }

    public static void init(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e(f65786z, "The appId is null, please recheck");
        } else {
            if (z.t().f()) {
                return;
            }
            z.t().z(context, str);
        }
    }

    public static boolean isInitialized() {
        return z.t().f();
    }

    public static void setAppIcon(int i10) {
        z.t().z(i10);
    }

    public static void setCCPADoNotSell(int i10) {
        z.t().w(i10);
    }

    public static void setCOPPAIsAgeRestrictedUser(int i10) {
        z.t().y(i10);
    }

    public static void setChannel(String str) {
        z.t().z(str);
    }

    public static void setGDPRDataCollection(int i10) {
        z.t().c(i10);
    }

    public static void setLGPDConsent(int i10) {
        z.t().o(i10);
    }

    public static void setTestMode(boolean z10) {
        z.t().z(z10);
    }
}
