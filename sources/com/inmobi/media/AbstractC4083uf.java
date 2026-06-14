package com.inmobi.media;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.iab.omid.library.inmobi.adsession.AdSessionContext;
import com.iab.omid.library.inmobi.adsession.ImpressionType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.uf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4083uf {
    public static C3809jf a(String creativeType, GestureDetectorOnGestureListenerC3635ci webView, boolean z10, String str, byte b10, String str2) {
        Intrinsics.checkNotNullParameter(creativeType, "creativeType");
        Cf cf2 = Bf.f36629a;
        cf2.getClass();
        Intrinsics.checkNotNullParameter(webView, "webView");
        AdSessionContext adSessionContextCreateHtmlAdSessionContext = AdSessionContext.createHtmlAdSessionContext(cf2.f36677b, webView, str, str2);
        Intrinsics.checkNotNullExpressionValue(adSessionContextCreateHtmlAdSessionContext, "createHtmlAdSessionContext(...)");
        ImpressionType impressionType = b10 == 1 ? ImpressionType.DEFINED_BY_JAVASCRIPT : b10 == 2 ? ImpressionType.UNSPECIFIED : b10 == 3 ? ImpressionType.LOADED : b10 == 4 ? ImpressionType.BEGIN_TO_RENDER : b10 == 5 ? ImpressionType.ONE_PIXEL : b10 == 6 ? ImpressionType.VIEWABLE : b10 == 7 ? ImpressionType.AUDIBLE : b10 == 0 ? ImpressionType.OTHER : ImpressionType.OTHER;
        int iHashCode = creativeType.hashCode();
        if (iHashCode != -284840886) {
            if (iHashCode != 93166550) {
                if (iHashCode != 112202875) {
                    if (iHashCode == 1425678798 && creativeType.equals("nonvideo")) {
                        return new C3809jf("html_display_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, false);
                    }
                } else if (creativeType.equals("video")) {
                    return new C3809jf("html_video_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
                }
            } else if (creativeType.equals("audio")) {
                return new C3809jf("html_audio_ad", impressionType, adSessionContextCreateHtmlAdSessionContext, z10);
            }
        } else if (creativeType.equals("unknown")) {
            Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "access$getTAG$cp(...)");
            return null;
        }
        Intrinsics.checkNotNullExpressionValue(ApsMetricsDataMap.APSMETRICS_FIELD_VIDEOFLAG, "access$getTAG$cp(...)");
        return null;
    }
}
