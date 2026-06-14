package com.pubmatic.sdk.openwrap.core.nativead;

import androidx.media3.common.MimeTypes;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0015\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020-X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/pubmatic/sdk/openwrap/core/nativead/POBCoreNativeConstants;", "", "()V", "CUSTOM_TEMPLATE_NULL_ASSETS", "", "MIMES", "", "NATIVE_ASSETS", "NATIVE_CLICK_TRACKER", "NATIVE_CONTEXT", "NATIVE_CONTEXT_SUBTYPE", "NATIVE_DATA", "NATIVE_DEFAULT_VERSION", "NATIVE_EVENT", "NATIVE_EVENT_TRACKERS", "NATIVE_EXT", "NATIVE_FALLBACK_URL", "NATIVE_ID", "NATIVE_IMAGE", "NATIVE_IMAGE_HEIGHT", "NATIVE_IMAGE_MIN_HEIGHT", "NATIVE_IMAGE_MIN_WIDTH", "NATIVE_IMAGE_WIDTH", "NATIVE_IMPRESSION_TRACKER", "NATIVE_LENGTH", "NATIVE_LINK", "NATIVE_LINK_URL", "NATIVE_MAIN_TAG", "NATIVE_METHOD", "NATIVE_METHODS", "NATIVE_MIMES", "NATIVE_PLACEMENT_TYPE", "NATIVE_PRIVACY", "NATIVE_PRIVACY_URL", "NATIVE_REQUEST", "NATIVE_REQUIRED_FIELD", "NATIVE_TEXT", "NATIVE_TITLE", "NATIVE_TRACKER_JAVASCRIPT", "NATIVE_TYPE", "NATIVE_VALUE", "NATIVE_VENDOR_KEY", "NATIVE_VERIFICATION_PARAMETERS", "NATIVE_VERSION", "POB_NATIVE_AD_ICON_H", "", "POB_NATIVE_AD_ICON_W", "POB_NATIVE_CTA_LEN", "POB_NATIVE_DESC_LEN", "POB_NATIVE_ICON_H", "POB_NATIVE_ICON_W", "POB_NATIVE_ID_ADVERTISER", "POB_NATIVE_ID_CTA", "POB_NATIVE_ID_DESC", "POB_NATIVE_ID_DSA", "POB_NATIVE_ID_ICON", "POB_NATIVE_ID_MAIN_IMG", "POB_NATIVE_ID_PRICE", "POB_NATIVE_ID_PRIVACY", "POB_NATIVE_ID_STAR_RATING", "POB_NATIVE_ID_TITLE", "POB_NATIVE_MAIN_IMG_H", "POB_NATIVE_MAIN_IMG_W", "POB_NATIVE_TITLE_LEN", "PRIVACY", "PUBMATIC_CLICK_TRACKERS_IDENTIFIER", "openwrapcore_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class POBCoreNativeConstants {

    @NotNull
    public static final String CUSTOM_TEMPLATE_NULL_ASSETS = "Please set assets for specified template type as custom.";

    @NotNull
    public static final POBCoreNativeConstants INSTANCE = new POBCoreNativeConstants();

    @NotNull
    public static final List<String> MIMES = CollectionsKt.listOf((Object[]) new String[]{"image/jpg", "image/jpeg", MimeTypes.IMAGE_PNG});

    @NotNull
    public static final String NATIVE_ASSETS = "assets";

    @NotNull
    public static final String NATIVE_CLICK_TRACKER = "clicktrackers";

    @NotNull
    public static final String NATIVE_CONTEXT = "context";

    @NotNull
    public static final String NATIVE_CONTEXT_SUBTYPE = "contextsubtype";

    @NotNull
    public static final String NATIVE_DATA = "data";

    @NotNull
    public static final String NATIVE_DEFAULT_VERSION = "1.2";

    @NotNull
    public static final String NATIVE_EVENT = "event";

    @NotNull
    public static final String NATIVE_EVENT_TRACKERS = "eventtrackers";

    @NotNull
    public static final String NATIVE_EXT = "ext";

    @NotNull
    public static final String NATIVE_FALLBACK_URL = "fallback";

    @NotNull
    public static final String NATIVE_ID = "id";

    @NotNull
    public static final String NATIVE_IMAGE = "img";

    @NotNull
    public static final String NATIVE_IMAGE_HEIGHT = "h";

    @NotNull
    public static final String NATIVE_IMAGE_MIN_HEIGHT = "hmin";

    @NotNull
    public static final String NATIVE_IMAGE_MIN_WIDTH = "wmin";

    @NotNull
    public static final String NATIVE_IMAGE_WIDTH = "w";

    @NotNull
    public static final String NATIVE_IMPRESSION_TRACKER = "imptrackers";

    @NotNull
    public static final String NATIVE_LENGTH = "len";

    @NotNull
    public static final String NATIVE_LINK = "link";

    @NotNull
    public static final String NATIVE_LINK_URL = "url";

    @NotNull
    public static final String NATIVE_MAIN_TAG = "native";

    @NotNull
    public static final String NATIVE_METHOD = "method";

    @NotNull
    public static final String NATIVE_METHODS = "methods";

    @NotNull
    public static final String NATIVE_MIMES = "mimes";

    @NotNull
    public static final String NATIVE_PLACEMENT_TYPE = "plcmttype";

    @NotNull
    public static final String NATIVE_PRIVACY = "privacy";

    @NotNull
    public static final String NATIVE_PRIVACY_URL = "privacy";

    @NotNull
    public static final String NATIVE_REQUEST = "request";

    @NotNull
    public static final String NATIVE_REQUIRED_FIELD = "required";

    @NotNull
    public static final String NATIVE_TEXT = "text";

    @NotNull
    public static final String NATIVE_TITLE = "title";

    @NotNull
    public static final String NATIVE_TRACKER_JAVASCRIPT = "jstracker";

    @NotNull
    public static final String NATIVE_TYPE = "type";

    @NotNull
    public static final String NATIVE_VALUE = "value";

    @NotNull
    public static final String NATIVE_VENDOR_KEY = "vendorKey";

    @NotNull
    public static final String NATIVE_VERIFICATION_PARAMETERS = "verification_parameters";

    @NotNull
    public static final String NATIVE_VERSION = "ver";
    public static final int POB_NATIVE_AD_ICON_H = 20;
    public static final int POB_NATIVE_AD_ICON_W = 25;
    public static final int POB_NATIVE_CTA_LEN = 15;
    public static final int POB_NATIVE_DESC_LEN = 90;
    public static final int POB_NATIVE_ICON_H = 50;
    public static final int POB_NATIVE_ICON_W = 50;
    public static final int POB_NATIVE_ID_ADVERTISER = 8;
    public static final int POB_NATIVE_ID_CTA = 4;
    public static final int POB_NATIVE_ID_DESC = 3;

    @NotNull
    public static final String POB_NATIVE_ID_DSA = "dsa_icon";
    public static final int POB_NATIVE_ID_ICON = 2;
    public static final int POB_NATIVE_ID_MAIN_IMG = 5;
    public static final int POB_NATIVE_ID_PRICE = 7;

    @NotNull
    public static final String POB_NATIVE_ID_PRIVACY = "privacy_icon";
    public static final int POB_NATIVE_ID_STAR_RATING = 6;
    public static final int POB_NATIVE_ID_TITLE = 1;
    public static final int POB_NATIVE_MAIN_IMG_H = 146;
    public static final int POB_NATIVE_MAIN_IMG_W = 278;
    public static final int POB_NATIVE_TITLE_LEN = 25;
    public static final int PRIVACY = 1;

    @NotNull
    public static final String PUBMATIC_CLICK_TRACKERS_IDENTIFIER = "clicktrack.pubmatic.com";

    private POBCoreNativeConstants() {
    }
}
