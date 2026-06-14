package com.inmobi.media;

import android.os.Build;
import com.inmobi.media.ads.network.common.model.AdResponse;
import com.inmobi.media.ads.network.common.model.AdSet;
import com.inmobi.media.core.config.models.AdConfig;
import com.inmobi.media.core.config.models.CrashConfig;
import com.inmobi.media.core.config.models.RootConfig;
import com.inmobi.media.core.config.models.SignalsConfig;
import com.inmobi.media.core.config.models.TelemetryConfig;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.telemetry.TelemetryCategory;
import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.d0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3643d0 {
    public static void a(String str, String str2, AdResponse adResponse, C3903n9 c3903n9) {
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        if (c3903n9 == null) {
            return;
        }
        try {
            int i10 = 0;
            AdSet adSet = adResponse.getAdSets().get(0);
            String value = adResponse.getRequestId();
            Intrinsics.checkNotNullParameter("requestID", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value, "value");
            Gh gh2 = c3903n9.f39085a;
            if (gh2 != null) {
                gh2.a("requestID", value);
            }
            String value2 = String.valueOf(adResponse.getPlacementId());
            Intrinsics.checkNotNullParameter("placementID", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value2, "value");
            Gh gh3 = c3903n9.f39085a;
            if (gh3 != null) {
                gh3.a("placementID", value2);
            }
            String value3 = String.valueOf(str);
            Intrinsics.checkNotNullParameter("adType", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value3, "value");
            Gh gh4 = c3903n9.f39085a;
            if (gh4 != null) {
                gh4.a("adType", value3);
            }
            String value4 = String.valueOf(str2);
            Intrinsics.checkNotNullParameter("placementType", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value4, "value");
            Gh gh5 = c3903n9.f39085a;
            if (gh5 != null) {
                gh5.a("placementType", value4);
            }
            String value5 = String.valueOf(A1.f36539a);
            Intrinsics.checkNotNullParameter("bundleID", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value5, "value");
            Gh gh6 = c3903n9.f39085a;
            if (gh6 != null) {
                gh6.a("bundleID", value5);
            }
            C4148x5.f39893a.getClass();
            String value6 = (String) C4148x5.f39901i.getSecond();
            Intrinsics.checkNotNullParameter(C4240b4.j.f42692n, C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value6, "value");
            Gh gh7 = c3903n9.f39085a;
            if (gh7 != null) {
                gh7.a(C4240b4.j.f42692n, value6);
            }
            String value7 = C4148x5.m();
            Intrinsics.checkNotNullParameter("networkType", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value7, "value");
            Gh gh8 = c3903n9.f39085a;
            if (gh8 != null) {
                gh8.a("networkType", value7);
            }
            String value8 = Build.MODEL;
            Intrinsics.checkNotNullExpressionValue(value8, "MODEL");
            Intrinsics.checkNotNullParameter("deviceModel", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value8, "value");
            Gh gh9 = c3903n9.f39085a;
            if (gh9 != null) {
                gh9.a("deviceModel", value8);
            }
            String value9 = String.valueOf(Ji.f37159c);
            Intrinsics.checkNotNullParameter("publisherID", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value9, "value");
            Gh gh10 = c3903n9.f39085a;
            if (gh10 != null) {
                gh10.a("publisherID", value9);
            }
            Intrinsics.checkNotNullParameter("sdkVersion", C4240b4.i.W);
            Intrinsics.checkNotNullParameter("11.1.0", "value");
            Gh gh11 = c3903n9.f39085a;
            if (gh11 != null) {
                gh11.a("sdkVersion", "11.1.0");
            }
            String value10 = String.valueOf(Ki.f37226b);
            Intrinsics.checkNotNullParameter("tpName", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value10, "value");
            Gh gh12 = c3903n9.f39085a;
            if (gh12 != null) {
                gh12.a("tpName", value10);
            }
            String value11 = String.valueOf(Ki.f37225a);
            Intrinsics.checkNotNullParameter("tpVersion", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value11, "value");
            Gh gh13 = c3903n9.f39085a;
            if (gh13 != null) {
                gh13.a("tpVersion", value11);
            }
            Intrinsics.checkNotNullParameter("source", C4240b4.i.W);
            Intrinsics.checkNotNullParameter("sdk_android", "value");
            Gh gh14 = c3903n9.f39085a;
            if (gh14 != null) {
                gh14.a("source", "sdk_android");
            }
            String value12 = Ki.a();
            Intrinsics.checkNotNullParameter("mkVersion", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value12, "value");
            Gh gh15 = c3903n9.f39085a;
            if (gh15 != null) {
                gh15.a("mkVersion", value12);
            }
            String value13 = Ji.c();
            Intrinsics.checkNotNullParameter("webViewUserAgent", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value13, "value");
            Gh gh16 = c3903n9.f39085a;
            if (gh16 != null) {
                gh16.a("webViewUserAgent", value13);
            }
            String value14 = String.valueOf(adSet.getIsPod());
            Intrinsics.checkNotNullParameter("sdkAdPod", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value14, "value");
            Gh gh17 = c3903n9.f39085a;
            if (gh17 != null) {
                gh17.a("sdkAdPod", value14);
            }
            String value15 = String.valueOf(adSet.getLogEnabled());
            Intrinsics.checkNotNullParameter("isServerSideLogging", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value15, "value");
            Gh gh18 = c3903n9.f39085a;
            if (gh18 != null) {
                gh18.a("isServerSideLogging", value15);
            }
            String value16 = adSet.getTransactionId();
            if (value16 == null) {
                value16 = "Not Set";
            }
            Intrinsics.checkNotNullParameter("transactionID", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value16, "value");
            Gh gh19 = c3903n9.f39085a;
            if (gh19 != null) {
                gh19.a("transactionID", value16);
            }
            String value17 = a();
            Intrinsics.checkNotNullParameter("configData", C4240b4.i.W);
            Intrinsics.checkNotNullParameter(value17, "value");
            Gh gh20 = c3903n9.f39085a;
            if (gh20 != null) {
                gh20.a("configData", value17);
            }
            if (adSet.getIsPod()) {
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                if (adSet.getAds().isEmpty()) {
                    c3903n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
                } else {
                    for (Object obj : adSet.getAds()) {
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        com.inmobi.media.ads.network.common.model.Ad ad2 = (com.inmobi.media.ads.network.common.model.Ad) obj;
                        arrayList.add(i10, ad2.getCreativeId());
                        arrayList2.add(i10, ad2.getImpressionId());
                        i10 = i11;
                    }
                    String value18 = CollectionsKt.joinToString$default(arrayList, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("creativeID", C4240b4.i.W);
                    Intrinsics.checkNotNullParameter(value18, "value");
                    Gh gh21 = c3903n9.f39085a;
                    if (gh21 != null) {
                        gh21.a("creativeID", value18);
                    }
                    String value19 = CollectionsKt.joinToString$default(arrayList2, " , ", null, null, 0, null, null, 62, null);
                    Intrinsics.checkNotNullParameter("impressionID", C4240b4.i.W);
                    Intrinsics.checkNotNullParameter(value19, "value");
                    Gh gh22 = c3903n9.f39085a;
                    if (gh22 != null) {
                        gh22.a("impressionID", value19);
                    }
                }
            } else if (adSet.getAds().isEmpty()) {
                c3903n9.b("AdLogResponseHandler", "no ads. cannot update vitals");
            } else {
                com.inmobi.media.ads.network.common.model.Ad ad3 = adSet.getAds().get(0);
                String value20 = ad3.getCreativeId();
                Intrinsics.checkNotNullParameter("creativeID", C4240b4.i.W);
                Intrinsics.checkNotNullParameter(value20, "value");
                Gh gh23 = c3903n9.f39085a;
                if (gh23 != null) {
                    gh23.a("creativeID", value20);
                }
                String value21 = ad3.getImpressionId();
                Intrinsics.checkNotNullParameter("impressionID", C4240b4.i.W);
                Intrinsics.checkNotNullParameter(value21, "value");
                Gh gh24 = c3903n9.f39085a;
                if (gh24 != null) {
                    gh24.a("impressionID", value21);
                }
            }
        } catch (JSONException e10) {
            c3903n9.a("AdLogResponseHandler", "error while update vitals", e10);
        }
        a(adResponse, c3903n9);
    }

    public static void a(AdResponse adResponse, C3903n9 c3903n9) {
        try {
            boolean logEnabled = adResponse.getAdSets().get(0).getLogEnabled();
            c3903n9.a("AdLogResponseHandler", "server side logger lever - " + logEnabled);
            c3903n9.a(logEnabled);
        } catch (JSONException e10) {
            c3903n9.a("AdLogResponseHandler", "error while setting server-side lever", e10);
            c3903n9.a(false);
        }
    }

    public static String a() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C3774i4 c3774i4 = Y3.f38021a;
        Intrinsics.checkNotNullParameter(RootConfig.class, "clazz");
        C3774i4 c3774i42 = Y3.f38021a;
        jSONObject.put("root", ((RootConfig) c3774i42.a(RootConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(AdConfig.class, "clazz");
        jSONObject.put(com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, ((AdConfig) c3774i42.a(AdConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(TelemetryConfig.class, "clazz");
        jSONObject.put(TelemetryCategory.TELEMETRY, ((TelemetryConfig) c3774i42.a(TelemetryConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(CrashConfig.class, "clazz");
        jSONObject.put("crashReporting", ((CrashConfig) c3774i42.a(CrashConfig.class)).getLastUpdateTimeStamp());
        Intrinsics.checkNotNullParameter(SignalsConfig.class, "clazz");
        jSONObject.put("signals", ((SignalsConfig) c3774i42.a(SignalsConfig.class)).getLastUpdateTimeStamp());
        String string = jSONObject.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
