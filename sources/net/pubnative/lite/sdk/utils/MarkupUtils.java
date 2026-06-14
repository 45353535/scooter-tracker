package net.pubnative.lite.sdk.utils;

import net.pubnative.lite.sdk.HyBid;
import net.pubnative.lite.sdk.vpaid.models.vast.Vast;
import net.pubnative.lite.sdk.vpaid.xml.XmlParser;

/* JADX INFO: loaded from: classes3.dex */
public class MarkupUtils {
    public static boolean isVastXml(String str) {
        try {
            Vast vast = (Vast) XmlParser.parse(str, Vast.class);
            if (vast == null) {
                return false;
            }
            if (vast.getAds() == null && vast.getErrors() == null && vast.getStatus() == null) {
                return vast.getVersion() != null;
            }
            return true;
        } catch (Exception e10) {
            HyBid.reportException(e10);
            Logger.e("MarkupUtils", e10.getMessage());
            return false;
        }
    }
}
