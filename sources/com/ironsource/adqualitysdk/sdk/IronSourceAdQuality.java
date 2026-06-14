package com.ironsource.adqualitysdk.sdk;

import android.content.Context;
import com.ironsource.adqualitysdk.sdk.i.s;

/* JADX INFO: loaded from: classes10.dex */
public abstract class IronSourceAdQuality {
    public static final String TAG = "ISAdQuality Agent SDK";
    public static final String VERSION = "9.1.1";

    public static IronSourceAdQuality getInstance() {
        return s.m7239();
    }

    public static String getSDKVersion() {
        return "9.1.1";
    }

    public abstract void changeUserId(String str);

    public abstract void initialize(Context context, String str);

    public abstract void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig);

    public abstract void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue);

    public abstract void setAdListener(ISAdQualityAdListener iSAdQualityAdListener);

    public abstract void setConfig(ISAdQualityConfig iSAdQualityConfig);

    public abstract void setSegment(ISAdQualitySegment iSAdQualitySegment);

    @Deprecated
    public abstract void setUserConsent(boolean z10);

    @Deprecated
    public abstract void shutdown();
}
