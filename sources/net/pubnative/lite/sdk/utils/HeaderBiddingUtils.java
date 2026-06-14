package net.pubnative.lite.sdk.utils;

import android.os.Bundle;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.utils.PrebidUtils;

/* JADX INFO: loaded from: classes3.dex */
public class HeaderBiddingUtils {
    private static final double ECPM_POINTS_DIVIDER = 1000.0d;

    public interface KEYS {
        public static final String PN_BID = "pn_bid";
    }

    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    private static String getBidECPM(Ad ad2, KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(ad2.getECPM().doubleValue() / ECPM_POINTS_DIVIDER));
    }

    public static String getBidFromPoints(Integer num, PrebidUtils.KeywordMode keywordMode) {
        return String.format(Locale.ENGLISH, keywordMode == PrebidUtils.KeywordMode.TWO_DECIMALS ? "%.2f" : "%.3f", Double.valueOf(num.doubleValue() / ECPM_POINTS_DIVIDER));
    }

    public static String getHeaderBiddingKeywords(Ad ad2) {
        return getHeaderBiddingKeywords(ad2, "");
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad2) {
        return getHeaderBiddingKeywordsBundle(ad2, "");
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad2) {
        return getHeaderBiddingKeywordsSet(ad2, "");
    }

    public static String getHeaderBiddingKeywords(Ad ad2, KeywordMode keywordMode) {
        return getHeaderBiddingKeywords(ad2, "", keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad2, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsBundle(ad2, "", keywordMode);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad2, KeywordMode keywordMode) {
        return getHeaderBiddingKeywordsSet(ad2, "", keywordMode);
    }

    public static String getHeaderBiddingKeywords(Ad ad2, String str) {
        return getHeaderBiddingKeywords(ad2, str, KeywordMode.THREE_DECIMALS);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad2, String str) {
        return getHeaderBiddingKeywordsBundle(ad2, str, KeywordMode.THREE_DECIMALS);
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad2, String str) {
        return getHeaderBiddingKeywordsSet(ad2, str, KeywordMode.THREE_DECIMALS);
    }

    public static String getHeaderBiddingKeywords(Ad ad2, String str, KeywordMode keywordMode) {
        return "pn_bid:" + getBidECPM(ad2, keywordMode);
    }

    public static Bundle getHeaderBiddingKeywordsBundle(Ad ad2, String str, KeywordMode keywordMode) {
        Bundle bundle = new Bundle();
        bundle.putString(KEYS.PN_BID, getBidECPM(ad2, keywordMode));
        return bundle;
    }

    public static Set<String> getHeaderBiddingKeywordsSet(Ad ad2, String str, KeywordMode keywordMode) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(3);
        linkedHashSet.add(KEYS.PN_BID.concat(StringUtils.PROCESS_POSTFIX_DELIMITER).concat(getBidECPM(ad2, keywordMode)));
        return linkedHashSet;
    }
}
