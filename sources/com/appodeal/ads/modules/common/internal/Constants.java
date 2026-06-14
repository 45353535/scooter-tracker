package com.appodeal.ads.modules.common.internal;

import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087D¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0014\u0010\n\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0018R\u0014\u0010\u001e\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0018R\u0014\u0010 \u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0018R\u0014\u0010!\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0018R\u0014\u0010#\u001a\u00020\"8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0018R\u0014\u0010&\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0018R\u0014\u0010'\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0018R\u0014\u0010(\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b(\u0010\u0018R\u0014\u0010)\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b)\u0010\u0018R\u0014\u0010*\u001a\u00020\u00168\u0006X\u0086T¢\u0006\u0006\n\u0004\b*\u0010\u0018¨\u0006+"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/Constants;", "", "", "SDK_VERSION", "Ljava/lang/String;", "Ljava/util/Date;", "BUILD_DATE", "Ljava/util/Date;", "INTERSTITIAL", "BANNER", "NON_REWARDED_VIDEO", "REWARDED_VIDEO", "MREC", MobileFuseNativeAdKt.AD_TYPE, "STATS", "REPORT", "SHARED_PREFERENCES_NAME", "CAMPAIGN_FREQUENCY", "PLACEMENT_FREQUENCY", "APP_KEY", "APPODEAL_VERSION", "APPODEAL_FIRST_INSTALL", "", "LOADING_TIMEOUT_MS", "I", "FAILED_REQUEST_MS", "MAX_FAILED_REQUEST_MS", "BANNER_LOAD_TIMEOUT_MS", "MREC_LOAD_TIMEOUT_MS", "INTERSTITIAL_LOAD_TIMEOUT_MS", "REWARDED_VIDEO_LOAD_TIMEOUT_MS", "NATIVE_LOAD_TIMEOUT_MS", "PAUSE_TIMEOUT_MS", "VIEW_AD_IMPRESSION_INTERVAL", "", "DEFAULT_EXPIRED_TIME", "J", "MAX_NATIVE_AD_CONTAINER_SIZE", "MIN_NATIVE_AD_CONTAINER_SIZE", "VIDEO_MAX_DURATION", "FULLSCREEN_AD_SHOW_RESET_INTERVAL", "FULLSCREEN_AD_SHOWN_CALLBACK_INTERVAL", "DEFAULT_WATERFALL_VALIDITY_PERIOD", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Constants {
    public static final String APPODEAL_FIRST_INSTALL = "appodealFirstInstall";
    public static final String APPODEAL_VERSION = "appodealVersion";
    public static final String APP_KEY = "appKey";
    public static final String BANNER = "banner_320";
    public static final int BANNER_LOAD_TIMEOUT_MS = 5000;
    public static final Date BUILD_DATE;
    public static final String CAMPAIGN_FREQUENCY = "freq";
    public static final long DEFAULT_EXPIRED_TIME = 0;
    public static final int DEFAULT_WATERFALL_VALIDITY_PERIOD = 86400000;
    public static final int FAILED_REQUEST_MS = 5000;
    public static final int FULLSCREEN_AD_SHOWN_CALLBACK_INTERVAL = 3000;
    public static final int FULLSCREEN_AD_SHOW_RESET_INTERVAL = 15000;
    public static final Constants INSTANCE = new Constants();
    public static final String INTERSTITIAL = "banner";
    public static final int INTERSTITIAL_LOAD_TIMEOUT_MS = 10000;
    public static final int LOADING_TIMEOUT_MS = 120000;
    public static final int MAX_FAILED_REQUEST_MS = 100000;
    public static final int MAX_NATIVE_AD_CONTAINER_SIZE = 5;
    public static final int MIN_NATIVE_AD_CONTAINER_SIZE = 2;
    public static final String MREC = "banner_mrec";
    public static final int MREC_LOAD_TIMEOUT_MS = 5000;
    public static final String NATIVE = "native";
    public static final int NATIVE_LOAD_TIMEOUT_MS = 5000;
    public static final String NON_REWARDED_VIDEO = "video";
    public static final int PAUSE_TIMEOUT_MS = 1000;
    public static final String PLACEMENT_FREQUENCY = "placements_freq";
    public static final String REPORT = "report";
    public static final String REWARDED_VIDEO = "rewarded_video";
    public static final int REWARDED_VIDEO_LOAD_TIMEOUT_MS = 10000;
    public static final String SDK_VERSION = "3.12.0";
    public static final String SHARED_PREFERENCES_NAME = "appodeal";
    public static final String STATS = "stats";
    public static final int VIDEO_MAX_DURATION = 90000;
    public static final int VIEW_AD_IMPRESSION_INTERVAL = 15000;

    static {
        Date BUILD_DATE2 = BuildConfig.BUILD_DATE;
        Intrinsics.checkNotNullExpressionValue(BUILD_DATE2, "BUILD_DATE");
        BUILD_DATE = BUILD_DATE2;
    }
}
