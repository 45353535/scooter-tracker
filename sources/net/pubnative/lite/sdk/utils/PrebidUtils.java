package net.pubnative.lite.sdk.utils;

import android.os.Bundle;
import java.util.Set;
import net.pubnative.lite.sdk.models.Ad;
import net.pubnative.lite.sdk.utils.HeaderBiddingUtils;

/* JADX INFO: loaded from: classes3.dex */
public class PrebidUtils {

    public enum KeywordMode {
        TWO_DECIMALS,
        THREE_DECIMALS
    }

    public static String getBidFromPoints(Integer num, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getBidFromPoints(num, keywordMode);
    }

    public static String getPrebidKeywords(Ad ad2) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad2);
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad2) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad2);
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad2) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad2);
    }

    private static HeaderBiddingUtils.KeywordMode mapKeywordMode(KeywordMode keywordMode) {
        return keywordMode == KeywordMode.TWO_DECIMALS ? HeaderBiddingUtils.KeywordMode.TWO_DECIMALS : HeaderBiddingUtils.KeywordMode.THREE_DECIMALS;
    }

    public static String getPrebidKeywords(Ad ad2, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad2, mapKeywordMode(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad2, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad2, mapKeywordMode(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad2, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad2, mapKeywordMode(keywordMode));
    }

    public static String getPrebidKeywords(Ad ad2, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad2, str);
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad2, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad2, str);
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad2, String str) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad2, str);
    }

    public static String getPrebidKeywords(Ad ad2, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywords(ad2, str, mapKeywordMode(keywordMode));
    }

    public static Bundle getPrebidKeywordsBundle(Ad ad2, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsBundle(ad2, str, mapKeywordMode(keywordMode));
    }

    public static Set<String> getPrebidKeywordsSet(Ad ad2, String str, KeywordMode keywordMode) {
        return HeaderBiddingUtils.getHeaderBiddingKeywordsSet(ad2, str, mapKeywordMode(keywordMode));
    }
}
