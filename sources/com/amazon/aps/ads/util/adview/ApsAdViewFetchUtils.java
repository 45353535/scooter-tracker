package com.amazon.aps.ads.util.adview;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.webkit.WebView;
import com.amazon.aps.ads.util.ApsAdExtensionsKt;
import com.amazon.aps.shared.ApsMetrics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.DTBAdBannerListener;
import com.amazon.device.ads.DTBAdMRAIDBannerController;
import com.amazon.device.ads.DTBAdMRAIDController;
import com.amazon.device.ads.DTBExpectedSizeProvider;
import com.amazon.device.ads.DTBMetricsConfiguration;
import com.amazon.device.ads.DtbCommonUtils;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.DtbDeviceData;
import com.amazon.device.ads.DtbOmSdkSessionManager;
import com.amazon.device.ads.DtbSharedPreferences;
import com.amazon.device.ads.WebResourceService;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewFetchUtils;", "", "<init>", "()V", y.f66058y, "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApsAdViewFetchUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ0\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\r\u001a\u0004\u0018\u00010\u00072\u0016\u0010\u0012\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0013J*\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\tJ*\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\u001c\u001a\u00020\u0007H\u0007J\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0007J,\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010 \u001a\u00020\u00072\n\u0010!\u001a\u00060\"j\u0002`#H\u0007¨\u0006$"}, d2 = {"Lcom/amazon/aps/ads/util/adview/ApsAdViewFetchUtils$Companion;", "", "<init>", "()V", "getAdInfo", "", "adhtml", "", "adInfoBundle", "Landroid/os/Bundle;", "getBundleForFetchAd", "mraidHandler", "Lcom/amazon/device/ads/DTBAdMRAIDController;", "adHtml", "extraData", "fetchAd", "webView", "Lcom/amazon/aps/ads/util/adview/ApsAdViewImpl;", "extra", "", "mraidListener", "fetchAdWithLocation", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "Landroid/webkit/WebView;", "localOnly", "", "url", "getMobileDeviceInfo", "getEnvironment", HandleInvocationsFromAdViewer.KEY_EXTRAS, "loadLocalFile", "name", "sb", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "aps-sdk_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void fetchAd(@NotNull ApsAdViewImpl webView, @Nullable String adHtml, @Nullable Map<String, ? extends Object> extra) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            try {
                Bundle bundleInitializeEmptyBundle = DtbCommonUtils.initializeEmptyBundle();
                if (extra != null) {
                    for (Map.Entry<String, ? extends Object> entry : extra.entrySet()) {
                        String key = entry.getKey();
                        Object value = entry.getValue();
                        if (value instanceof String) {
                            bundleInitializeEmptyBundle.putString(key, (String) value);
                        } else if (value instanceof Boolean) {
                            bundleInitializeEmptyBundle.putBoolean(key, ((Boolean) value).booleanValue());
                        } else if (value instanceof Integer) {
                            bundleInitializeEmptyBundle.putInt(key, ((Number) value).intValue());
                        } else if (value instanceof Long) {
                            bundleInitializeEmptyBundle.putLong(key, ((Number) value).longValue());
                        }
                    }
                }
                webView.fetchAd(adHtml, bundleInitializeEmptyBundle);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with map bundle", e10);
            }
        }

        public final void fetchAdWithLocation(@NotNull Context context, @NotNull WebView webView, boolean localOnly, @Nullable String url) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(webView, "webView");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<script>");
                sb2.append(getEnvironment(context, null));
                sb2.append("</script>");
                loadLocalFile(context, localOnly, "aps-mraid", sb2);
                sb2.append("<script>");
                sb2.append("window.location=\"");
                sb2.append(url);
                sb2.append("\";");
                sb2.append("</script>");
                webView.loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", "UTF-8", null);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAdWithLocation method", e10);
            }
        }

        public final void getAdInfo(@Nullable String adhtml, @NotNull Bundle adInfoBundle) {
            Intrinsics.checkNotNullParameter(adInfoBundle, "adInfoBundle");
            if (adhtml == null || !StringsKt.g0(adhtml, "amzn.dtb.loadAd", false, 2, null)) {
                return;
            }
            Matcher matcher = Pattern.compile("amzn.dtb.loadAd\\(\\\"(.*)\\\", \\\"(.*)\\\", \\\"(.*)\\\".*isv: (\\w+)").matcher(adhtml);
            if (matcher.find() && matcher.groupCount() == 4) {
                adInfoBundle.putString("event_server_parameter", matcher.group(1));
                adInfoBundle.putString("bid_identifier", matcher.group(2));
                adInfoBundle.putString("hostname_identifier", matcher.group(3));
                adInfoBundle.putBoolean("video_flag", Boolean.parseBoolean(matcher.group(4)));
            }
        }

        @Nullable
        public final Bundle getBundleForFetchAd(@NotNull DTBAdMRAIDController mraidHandler, @Nullable String adHtml, @Nullable Bundle extraData) {
            Intrinsics.checkNotNullParameter(mraidHandler, "mraidHandler");
            if (adHtml == null && extraData != null) {
                adHtml = extraData.getString("bid_html_template", null);
            }
            if (extraData != null && (mraidHandler instanceof DTBAdMRAIDBannerController)) {
                DTBAdBannerListener dTBAdBannerListener = ((DTBAdMRAIDBannerController) mraidHandler).bannerListener;
                int i10 = extraData.getInt("expected_width", 0);
                int i11 = extraData.getInt("expected_height", 0);
                if (i11 > 0 && i10 > 0 && (dTBAdBannerListener instanceof DTBExpectedSizeProvider)) {
                    DTBExpectedSizeProvider dTBExpectedSizeProvider = (DTBExpectedSizeProvider) dTBAdBannerListener;
                    dTBExpectedSizeProvider.setExpectedWidth(i10);
                    dTBExpectedSizeProvider.setExpectedHeight(i11);
                }
            }
            if (!DTBMetricsConfiguration.getInstance().isFeatureEnabled("webviewAdInfo_feature") || extraData != null) {
                return extraData;
            }
            Bundle bundle = new Bundle();
            getAdInfo(adHtml, bundle);
            a1 a1Var = a1.f93282a;
            String str = String.format("{bidID:'%s',aaxHost:'%s',pricePoint:'%s'}", Arrays.copyOf(new Object[]{bundle.getString("bid_identifier"), bundle.getString("hostname_identifier"), bundle.getString("event_server_parameter")}, 3));
            Intrinsics.checkNotNullExpressionValue(str, "format(...)");
            bundle.putString("amazon_ad_info", str);
            return bundle;
        }

        @Nullable
        public final String getEnvironment(@NotNull Context context, @Nullable Bundle extras) throws JSONException {
            CharSequence applicationLabel;
            Intrinsics.checkNotNullParameter(context, "context");
            String string = extras != null ? extras.getString("amazon_ad_info") : null;
            PackageManager packageManager = context.getPackageManager();
            String str = (packageManager == null || (applicationLabel = packageManager.getApplicationLabel(context.getApplicationInfo())) == null) ? "" : (String) applicationLabel;
            String idfa = DtbSharedPreferences.getInstance().getIdfa();
            if (DtbCommonUtils.isNullOrEmpty(idfa)) {
                idfa = "unknown";
            }
            Boolean optOut = DtbSharedPreferences.getInstance().getOptOut();
            if (optOut == null) {
                optOut = Boolean.FALSE;
            }
            Boolean bool = optOut;
            String mobileDeviceInfo = getMobileDeviceInfo();
            if (string == null) {
                a1 a1Var = a1.f93282a;
                String str2 = String.format("window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,impFired:true,mobileDeviceInfo:%s};", Arrays.copyOf(new Object[]{"3.0", DtbCommonUtils.getSDKMRAIDVersion(), DtbConstants.SDK_VERSION, StringsKt.W(str, "'", "\\'", false, 4, null), idfa, bool, Boolean.FALSE, mobileDeviceInfo}, 8));
                Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
                return str2;
            }
            a1 a1Var2 = a1.f93282a;
            String str3 = String.format("window.MRAID_ENV={version:'%s',sdk:'%s',sdkVersion:'%s',appId:'%s',ifa:'%s',limitAdTracking:%b,coppa:%b,amznAdInfo:%s,impFired:true,mobileDeviceInfo:%s};", Arrays.copyOf(new Object[]{"3.0", DtbCommonUtils.getSDKMRAIDVersion(), DtbConstants.SDK_VERSION, StringsKt.W(str, "'", "\\'", false, 4, null), idfa, bool, Boolean.FALSE, string, mobileDeviceInfo}, 9));
            Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
            return str3;
        }

        @NotNull
        public final String getMobileDeviceInfo() throws JSONException {
            String string;
            String string2;
            String string3;
            String str;
            JSONObject paramsJson;
            String str2 = "";
            try {
                paramsJson = DtbDeviceData.getDeviceDataInstance().getParamsJson();
            } catch (RuntimeException e10) {
                e = e10;
                string = "";
                string2 = string;
                string3 = string2;
            }
            if (paramsJson == null) {
                str = "";
                string = str;
                string2 = string;
                a1 a1Var = a1.f93282a;
                String str3 = String.format("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", Arrays.copyOf(new Object[]{"android", DtbCommonUtils.getSDKFramework(), str2, string2, string, str}, 6));
                Intrinsics.checkNotNullExpressionValue(str3, "format(...)");
                return str3;
            }
            if (paramsJson.has(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY)) {
                string3 = paramsJson.getString(DtbDeviceData.DEVICE_DATA_OS_VERSION_KEY);
                Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
            } else {
                string3 = "";
            }
            try {
                if (paramsJson.has("model")) {
                    string2 = paramsJson.getString("model");
                    Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
                } else {
                    string2 = "";
                }
                try {
                    if (paramsJson.has(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY)) {
                        string = paramsJson.getString(DtbDeviceData.DEVICE_DATA_SCREEN_SIZE_KEY);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    } else {
                        string = "";
                    }
                } catch (RuntimeException e11) {
                    e = e11;
                    string = "";
                }
            } catch (RuntimeException e12) {
                e = e12;
                string = "";
                string2 = string;
            }
            try {
                if (paramsJson.has("orientation")) {
                    String string4 = paramsJson.getString("orientation");
                    Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
                    str2 = string4;
                }
            } catch (RuntimeException e13) {
                e = e13;
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to parse deviceData in getMobileDeviceInfo method", e);
            }
            str = str2;
            str2 = string3;
            a1 a1Var2 = a1.f93282a;
            String str32 = String.format("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", Arrays.copyOf(new Object[]{"android", DtbCommonUtils.getSDKFramework(), str2, string2, string, str}, 6));
            Intrinsics.checkNotNullExpressionValue(str32, "format(...)");
            return str32;
            ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to parse deviceData in getMobileDeviceInfo method", e);
            str = str2;
            str2 = string3;
            a1 a1Var22 = a1.f93282a;
            String str322 = String.format("{os:'%s',fwk:'%s',osVersion:'%s',model:'%s',screenSize:'%s',orientation:'%s'}", Arrays.copyOf(new Object[]{"android", DtbCommonUtils.getSDKFramework(), str2, string2, string, str}, 6));
            Intrinsics.checkNotNullExpressionValue(str322, "format(...)");
            return str322;
        }

        public final void loadLocalFile(@NotNull Context context, boolean localOnly, @NotNull String name, @NotNull StringBuilder sb2) {
            InputStream inputStreamOpen;
            BufferedReader bufferedReader;
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(sb2, "sb");
            if (!localOnly) {
                try {
                    String strLoadFile = WebResourceService.getInstance().loadFile(name);
                    if (strLoadFile != null) {
                        sb2.append("<script>");
                        sb2.append(strLoadFile);
                        sb2.append("</script>");
                        return;
                    }
                } catch (Exception unused) {
                    ApsAdExtensionsKt.e(this, "Failed to read local file");
                }
            }
            sb2.append("<script>");
            try {
                inputStreamOpen = context.getAssets().open(name + ".js");
                Intrinsics.checkNotNullExpressionValue(inputStreamOpen, "open(...)");
                bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            } catch (Exception unused2) {
                ApsAdExtensionsKt.e(this, "Error reading file:" + name);
            }
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                sb2.append(StringsKt.v1(line).toString());
                sb2.append(IOUtils.LINE_SEPARATOR_UNIX);
                sb2.append("</script>");
            }
            bufferedReader.close();
            inputStreamOpen.close();
            sb2.append("</script>");
        }

        private Companion() {
        }

        public final void fetchAd(@NotNull ApsAdViewImpl webView, @NotNull DTBAdMRAIDController mraidListener, @Nullable String adHtml, @Nullable Bundle extraData) {
            Intrinsics.checkNotNullParameter(webView, "webView");
            Intrinsics.checkNotNullParameter(mraidListener, "mraidListener");
            try {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("<!DOCTYPE html><html><head>");
                sb2.append("<script>");
                sb2.append(getEnvironment(webView.getAdViewContext(), extraData));
                sb2.append("</script>");
                Context context = webView.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                loadLocalFile(context, webView.getLocalOnly(), "aps-mraid", sb2);
                Context context2 = webView.getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                loadLocalFile(context2, webView.getLocalOnly(), "dtb-m", sb2);
                if (DtbOmSdkSessionManager.getFeatureEnableFlag()) {
                    Context context3 = webView.getContext();
                    Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
                    loadLocalFile(context3, webView.getLocalOnly(), "omsdk-v1", sb2);
                }
                sb2.append("</head>");
                sb2.append("<body style='margin:0;padding:0;'>");
                sb2.append(adHtml);
                sb2.append("</body></html>");
                if (DTBMetricsConfiguration.getInstance().isFeatureEnabled("additional_webview_metric", false)) {
                    if (mraidListener instanceof DTBAdMRAIDBannerController) {
                        ApsMetrics.INSTANCE.customEvent("bannerCreativeRenderingStart", webView.getBidId(), null);
                    } else {
                        ApsMetrics.INSTANCE.customEvent("interstitialCreativeRenderingStart", webView.getBidId(), null);
                    }
                }
                webView.loadDataWithBaseURL("https://c.amazon-adsystem.com/", sb2.toString(), "text/html", "UTF-8", null);
            } catch (RuntimeException e10) {
                ApsAdExtensionsKt.logEvent(this, APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Fail to execute fetchAd method with bundle", e10);
            }
        }
    }

    private ApsAdViewFetchUtils() {
    }

    public static final void fetchAdWithLocation(@NotNull Context context, @NotNull WebView webView, boolean z10, @Nullable String str) {
        INSTANCE.fetchAdWithLocation(context, webView, z10, str);
    }

    public static final void getAdInfo(@Nullable String str, @NotNull Bundle bundle) {
        INSTANCE.getAdInfo(str, bundle);
    }

    @Nullable
    public static final String getEnvironment(@NotNull Context context, @Nullable Bundle bundle) {
        return INSTANCE.getEnvironment(context, bundle);
    }

    @NotNull
    public static final String getMobileDeviceInfo() {
        return INSTANCE.getMobileDeviceInfo();
    }

    public static final void loadLocalFile(@NotNull Context context, boolean z10, @NotNull String str, @NotNull StringBuilder sb2) {
        INSTANCE.loadLocalFile(context, z10, str, sb2);
    }
}
