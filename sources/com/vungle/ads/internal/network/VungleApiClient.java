package com.vungle.ads.internal.network;

import android.app.UiModeManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.URLUtil;
import androidx.annotation.VisibleForTesting;
import androidx.core.content.ContextCompat;
import androidx.core.util.Consumer;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.D5;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.f.y;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.AnalyticsClient;
import com.vungle.ads.ServiceLocator;
import com.vungle.ads.TimeIntervalMetric;
import com.vungle.ads.UserAgentError;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleAds;
import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.internal.ConfigManager;
import com.vungle.ads.internal.model.AdPayload;
import com.vungle.ads.internal.model.AdvertisingInfo;
import com.vungle.ads.internal.model.AppNode;
import com.vungle.ads.internal.model.CommonRequestBody;
import com.vungle.ads.internal.model.ConfigPayload;
import com.vungle.ads.internal.model.Cookie;
import com.vungle.ads.internal.model.DeviceNode;
import com.vungle.ads.internal.model.ErrorInfo;
import com.vungle.ads.internal.model.Placement;
import com.vungle.ads.internal.persistence.FilePreferences;
import com.vungle.ads.internal.platform.AndroidPlatform;
import com.vungle.ads.internal.platform.Platform;
import com.vungle.ads.internal.privacy.COPPA;
import com.vungle.ads.internal.privacy.PrivacyManager;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.signals.SignalManager;
import com.vungle.ads.internal.util.FileUtility;
import com.vungle.ads.internal.util.LogEntry;
import com.vungle.ads.internal.util.Logger;
import hh.a0;
import hh.b0;
import hh.c0;
import hh.v;
import hh.w;
import hh.x;
import hh.z;
import io.bidmachine.ads.networks.nast.NastAdapter;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URL;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.json.e;
import lf.i;
import lf.l;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import vh.f;
import vh.q;
import vh.x;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \u009c\u00012\u00020\u0001:\u0006\u009c\u0001\u009d\u0001\u009e\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001b\u0010%\u001a\u0004\u0018\u00010$2\b\b\u0002\u0010#\u001a\u00020\u001eH\u0002¢\u0006\u0004\b%\u0010&J\u0011\u0010'\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020\u0011¢\u0006\u0004\b*\u0010+J\u0015\u0010-\u001a\u00020,2\u0006\u0010)\u001a\u00020\u0011¢\u0006\u0004\b-\u0010.J\u0015\u00100\u001a\u00020\u00152\u0006\u0010/\u001a\u00020\u0011¢\u0006\u0004\b0\u00101J\u0015\u00104\u001a\n\u0012\u0004\u0012\u000203\u0018\u000102¢\u0006\u0004\b4\u00105J'\u0010:\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001022\u0006\u00106\u001a\u00020\u00112\b\u00108\u001a\u0004\u0018\u000107¢\u0006\u0004\b:\u0010;J\u001d\u0010>\u001a\n\u0012\u0004\u0012\u00020=\u0018\u0001022\u0006\u0010\u000b\u001a\u00020<¢\u0006\u0004\b>\u0010?JQ\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010@\u001a\u00020\u00112\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010A2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010E\u001a\u00020D2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010F¢\u0006\u0004\bI\u0010JJ#\u0010P\u001a\u00020\u00152\f\u0010M\u001a\b\u0012\u0004\u0012\u00020L0K2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ#\u0010T\u001a\u00020\u00152\f\u0010S\u001a\b\u0012\u0004\u0012\u00020R0K2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bT\u0010QJ\u001d\u0010W\u001a\u00020\u00152\u0006\u0010U\u001a\u00020\u00112\u0006\u0010V\u001a\u00020\u0011¢\u0006\u0004\bW\u0010XJ\u0017\u0010Z\u001a\u00020\u00152\u0006\u0010Y\u001a\u00020\u001eH\u0007¢\u0006\u0004\bZ\u0010[J\u0011\u0010\\\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b\\\u0010]J\u0011\u0010^\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b^\u0010]J!\u0010C\u001a\u00020_2\b\b\u0002\u0010#\u001a\u00020\u001e2\b\b\u0002\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bC\u0010`J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010a\u001a\u00020\u001eH\u0001¢\u0006\u0004\bb\u0010cJ\u0015\u0010f\u001a\u00020\u00112\u0006\u0010e\u001a\u00020d¢\u0006\u0004\bf\u0010gJ\u0011\u0010h\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\bh\u0010]J\u0011\u0010f\u001a\u0004\u0018\u00010\u0011H\u0000¢\u0006\u0004\bi\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010jR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010kR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010lR(\u0010n\u001a\u00020m8\u0000@\u0000X\u0081\u000e¢\u0006\u0018\n\u0004\bn\u0010o\u0012\u0004\bt\u0010\u0017\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR\u0016\u0010u\u001a\u00020m8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bu\u0010oR\u0018\u0010v\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\u0018\u0010y\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010zR-\u0010|\u001a\u0004\u0018\u00010{8\u0000@\u0000X\u0081\u000e¢\u0006\u001b\n\u0004\b|\u0010}\u0012\u0005\b\u0082\u0001\u0010\u0017\u001a\u0004\b~\u0010\u007f\"\u0006\b\u0080\u0001\u0010\u0081\u0001R\u001b\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0019\u0010h\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bh\u0010\u0085\u0001R!\u0010\u008b\u0001\u001a\u00030\u0086\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001R=\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020,0\u008c\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u008d\u0001\u0010\u008e\u0001\u0012\u0005\b\u0093\u0001\u0010\u0017\u001a\u0006\b\u008f\u0001\u0010\u0090\u0001\"\u0006\b\u0091\u0001\u0010\u0092\u0001R1\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\b\u0095\u0001\u0010\u0096\u0001\u0012\u0005\b\u009b\u0001\u0010\u0017\u001a\u0006\b\u0097\u0001\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001¨\u0006\u009f\u0001"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient;", "", "Landroid/content/Context;", "applicationContext", "Lcom/vungle/ads/internal/platform/Platform;", "platform", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "filePreferences", "<init>", "(Landroid/content/Context;Lcom/vungle/ads/internal/platform/Platform;Lcom/vungle/ads/internal/persistence/FilePreferences;)V", "Lhh/z;", "request", "Lhh/b0;", "defaultErrorResponse", "(Lhh/z;)Lhh/b0;", "Lhh/a0;", "body", "", "getPlacementID", "(Lhh/a0;)Ljava/lang/String;", "bodyToString", "", "initUserAgentLazy", "()V", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/vungle/ads/internal/model/DeviceNode;", "getBasicDeviceBody", "(Landroid/content/Context;)Lcom/vungle/ads/internal/model/DeviceNode;", "getDeviceBody", "()Lcom/vungle/ads/internal/model/DeviceNode;", "", "withFirstPartyData", "Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "getUserBody", "(Z)Lcom/vungle/ads/internal/model/CommonRequestBody$User;", "withSignals", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getExtBody", "(Z)Lcom/vungle/ads/internal/model/CommonRequestBody$RequestExt;", "getConnectionType", "()Ljava/lang/String;", "placementID", "checkIsRetryAfterActive", "(Ljava/lang/String;)Z", "", "getRetryAfterHeaderValue", "(Ljava/lang/String;)J", RemoteConfigConstants.RequestFieldKey.APP_ID, MobileAdsBridgeBase.initializeMethodName, "(Ljava/lang/String;)V", "Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/ConfigPayload;", "config", "()Lcom/vungle/ads/internal/network/Call;", "placement", "Lcom/vungle/ads/VungleAdSize;", C4240b4.i.O, "Lcom/vungle/ads/internal/model/AdPayload;", "requestAd", "(Ljava/lang/String;Lcom/vungle/ads/VungleAdSize;)Lcom/vungle/ads/internal/network/Call;", "Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;", "Ljava/lang/Void;", "ri", "(Lcom/vungle/ads/internal/model/CommonRequestBody$RequestParam;)Lcom/vungle/ads/internal/network/Call;", "url", "", "headers", "requestBody", "Lcom/vungle/ads/internal/network/HttpMethod;", "requestType", "Lcom/vungle/ads/internal/util/LogEntry;", "logEntry", "Lcom/vungle/ads/internal/model/ErrorInfo;", "pingTPAT", "(Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/vungle/ads/internal/network/HttpMethod;Lcom/vungle/ads/internal/util/LogEntry;)Lcom/vungle/ads/internal/model/ErrorInfo;", "Ljava/util/concurrent/BlockingQueue;", "Lcom/vungle/ads/internal/protos/Sdk$SDKMetric$Builder;", "metrics", "Lcom/vungle/ads/AnalyticsClient$RequestListener;", "requestListener", "reportMetrics", "(Ljava/util/concurrent/BlockingQueue;Lcom/vungle/ads/AnalyticsClient$RequestListener;)V", "Lcom/vungle/ads/internal/protos/Sdk$SDKError$Builder;", "errors", "reportErrors", "adMarkup", D5.f40571r, "sendAdMarkup", "(Ljava/lang/String;Ljava/lang/String;)V", Cookie.IS_PLAY_SERVICE_AVAILABLE, "addPlaySvcAvailabilityInCookie", "(Z)V", "getPlayServicesAvailabilityFromCookie", "()Ljava/lang/Boolean;", "getPlayServicesAvailabilityFromAPI", "Lcom/vungle/ads/internal/model/CommonRequestBody;", "(ZZ)Lcom/vungle/ads/internal/model/CommonRequestBody;", "explicitBlock", "getDeviceBody$vungle_ads_release", "(Z)Lcom/vungle/ads/internal/model/DeviceNode;", "", "type", "getConnectionTypeDetail", "(I)Ljava/lang/String;", "isGooglePlayServicesAvailable", "getConnectionTypeDetail$vungle_ads_release", "Landroid/content/Context;", "Lcom/vungle/ads/internal/platform/Platform;", "Lcom/vungle/ads/internal/persistence/FilePreferences;", "Lcom/vungle/ads/internal/network/VungleApi;", "gzipApi", "Lcom/vungle/ads/internal/network/VungleApi;", "getGzipApi$vungle_ads_release", "()Lcom/vungle/ads/internal/network/VungleApi;", "setGzipApi$vungle_ads_release", "(Lcom/vungle/ads/internal/network/VungleApi;)V", "getGzipApi$vungle_ads_release$annotations", "api", "baseDeviceInfo", "Lcom/vungle/ads/internal/model/DeviceNode;", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "advertisingInfo", "Lcom/vungle/ads/internal/model/AdvertisingInfo;", "Lcom/vungle/ads/internal/model/AppNode;", "appBody", "Lcom/vungle/ads/internal/model/AppNode;", "getAppBody$vungle_ads_release", "()Lcom/vungle/ads/internal/model/AppNode;", "setAppBody$vungle_ads_release", "(Lcom/vungle/ads/internal/model/AppNode;)V", "getAppBody$vungle_ads_release$annotations", "uaString", "Ljava/lang/String;", "Ljava/lang/Boolean;", "Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager$delegate", "Lkotlin/Lazy;", "getSignalManager", "()Lcom/vungle/ads/internal/signals/SignalManager;", "signalManager", "", "retryAfterDataMap", "Ljava/util/Map;", "getRetryAfterDataMap$vungle_ads_release", "()Ljava/util/Map;", "setRetryAfterDataMap$vungle_ads_release", "(Ljava/util/Map;)V", "getRetryAfterDataMap$vungle_ads_release$annotations", "Lhh/v;", "responseInterceptor", "Lhh/v;", "getResponseInterceptor$vungle_ads_release", "()Lhh/v;", "setResponseInterceptor$vungle_ads_release", "(Lhh/v;)V", "getResponseInterceptor$vungle_ads_release$annotations", y.f66058y, "ConnectionTypeDetail", "GzipRequestInterceptor", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class VungleApiClient {

    @NotNull
    private static final String TAG = "VungleApiClient";

    @Nullable
    private AdvertisingInfo advertisingInfo;

    @NotNull
    private VungleApi api;

    @Nullable
    private AppNode appBody;

    @NotNull
    private final Context applicationContext;

    @Nullable
    private DeviceNode baseDeviceInfo;

    @NotNull
    private final FilePreferences filePreferences;

    @NotNull
    private VungleApi gzipApi;

    @Nullable
    private Boolean isGooglePlayServicesAvailable;

    @NotNull
    private final Platform platform;

    @NotNull
    private v responseInterceptor;

    @NotNull
    private Map<String, Long> retryAfterDataMap;

    /* JADX INFO: renamed from: signalManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy signalManager;

    @Nullable
    private String uaString;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String BASE_URL = "https://config.ads.vungle.com/";

    @NotNull
    private static final Set<v> networkInterceptors = new HashSet();

    @NotNull
    private static final Set<v> logInterceptors = new HashSet();

    @NotNull
    private static final kotlinx.serialization.json.b json = kotlinx.serialization.json.v.b(null, new Function1<e, Unit>() { // from class: com.vungle.ads.internal.network.VungleApiClient$Companion$json$1
        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(e eVar) {
            invoke2(eVar);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull e Json) {
            Intrinsics.checkNotNullParameter(Json, "$this$Json");
            Json.f(true);
            Json.d(true);
            Json.e(false);
        }
    }, 1, null);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0005\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00078\u0000X\u0080D¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013¨\u0006\u0015"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$Companion;", "", "<init>", "()V", "", "reset$vungle_ads_release", "reset", "", "BASE_URL", "Ljava/lang/String;", "getBASE_URL$vungle_ads_release", "()Ljava/lang/String;", "TAG", "Lkotlinx/serialization/json/b;", "json", "Lkotlinx/serialization/json/b;", "", "Lhh/v;", "logInterceptors", "Ljava/util/Set;", "networkInterceptors", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getBASE_URL$vungle_ads_release() {
            return VungleApiClient.BASE_URL;
        }

        public final void reset$vungle_ads_release() {
            VungleHeader.INSTANCE.reset();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0002\b\u0002\b\u0087\u0002\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002B\u0000¨\u0006\u0003"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail;", "", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConnectionTypeDetail {

        @NotNull
        public static final String CDMA_1XRTT = "cdma_1xrtt";

        @NotNull
        public static final String CDMA_EVDO_0 = "cdma_evdo_0";

        @NotNull
        public static final String CDMA_EVDO_A = "cdma_evdo_a";

        @NotNull
        public static final String CDMA_EVDO_B = "cdma_evdo_b";

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = Companion.$$INSTANCE;

        @NotNull
        public static final String EDGE = "edge";

        @NotNull
        public static final String FIFTH_G = "5g";

        @NotNull
        public static final String GPRS = "gprs";

        @NotNull
        public static final String HRPD = "hrpd";

        @NotNull
        public static final String HSDPA = "hsdpa";

        @NotNull
        public static final String HSUPA = "hsupa";

        @NotNull
        public static final String LTE = "lte";

        @NotNull
        public static final String UNKNOWN = "unknown";

        @NotNull
        public static final String WCDMA = "wcdma";

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$ConnectionTypeDetail$Companion;", "", "()V", "CDMA_1XRTT", "", "CDMA_EVDO_0", "CDMA_EVDO_A", "CDMA_EVDO_B", "EDGE", "FIFTH_G", "GPRS", "HRPD", "HSDPA", "HSUPA", "LTE", "UNKNOWN", "WCDMA", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ Companion $$INSTANCE = new Companion();

            @NotNull
            public static final String CDMA_1XRTT = "cdma_1xrtt";

            @NotNull
            public static final String CDMA_EVDO_0 = "cdma_evdo_0";

            @NotNull
            public static final String CDMA_EVDO_A = "cdma_evdo_a";

            @NotNull
            public static final String CDMA_EVDO_B = "cdma_evdo_b";

            @NotNull
            public static final String EDGE = "edge";

            @NotNull
            public static final String FIFTH_G = "5g";

            @NotNull
            public static final String GPRS = "gprs";

            @NotNull
            public static final String HRPD = "hrpd";

            @NotNull
            public static final String HSDPA = "hsdpa";

            @NotNull
            public static final String HSUPA = "hsupa";

            @NotNull
            public static final String LTE = "lte";

            @NotNull
            public static final String UNKNOWN = "unknown";

            @NotNull
            public static final String WCDMA = "wcdma";

            private Companion() {
            }
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/vungle/ads/internal/network/VungleApiClient$GzipRequestInterceptor;", "Lhh/v;", "<init>", "()V", "Lhh/a0;", "requestBody", GzipRequestInterceptor.GZIP, "(Lhh/a0;)Lhh/a0;", "Lhh/v$a;", "chain", "Lhh/b0;", "intercept", "(Lhh/v$a;)Lhh/b0;", y.f66058y, "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class GzipRequestInterceptor implements v {

        @NotNull
        private static final String CONTENT_ENCODING = "Content-Encoding";

        @NotNull
        private static final String GZIP = "gzip";

        private final a0 gzip(final a0 requestBody) throws IOException {
            final vh.e eVar = new vh.e();
            f fVarC = x.c(new q(eVar));
            requestBody.writeTo(fVarC);
            fVarC.close();
            return new a0() { // from class: com.vungle.ads.internal.network.VungleApiClient$GzipRequestInterceptor$gzip$1
                @Override // hh.a0
                public long contentLength() {
                    return eVar.e0();
                }

                @Override // hh.a0
                @Nullable
                public w contentType() {
                    return requestBody.contentType();
                }

                @Override // hh.a0
                public void writeTo(@NotNull f sink) throws IOException {
                    Intrinsics.checkNotNullParameter(sink, "sink");
                    sink.r(eVar.i0());
                }
            };
        }

        @Override // hh.v
        @NotNull
        public b0 intercept(@NotNull v.a chain) throws IOException {
            Intrinsics.checkNotNullParameter(chain, "chain");
            z zVarRequest = chain.request();
            a0 a0VarA = zVarRequest.a();
            return (a0VarA == null || zVarRequest.d("Content-Encoding") != null) ? chain.a(zVarRequest) : chain.a(zVarRequest.i().f("Content-Encoding", GZIP).h(zVarRequest.h(), gzip(a0VarA)).b());
        }
    }

    public VungleApiClient(@NotNull final Context applicationContext, @NotNull Platform platform, @NotNull FilePreferences filePreferences) {
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(platform, "platform");
        Intrinsics.checkNotNullParameter(filePreferences, "filePreferences");
        this.applicationContext = applicationContext;
        this.platform = platform;
        this.filePreferences = filePreferences;
        this.uaString = System.getProperty("http.agent");
        ServiceLocator.Companion companion = ServiceLocator.INSTANCE;
        this.signalManager = i.b(l.f94209b, new Function0<SignalManager>() { // from class: com.vungle.ads.internal.network.VungleApiClient$special$$inlined$inject$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.vungle.ads.internal.signals.SignalManager, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final SignalManager invoke() {
                return ServiceLocator.INSTANCE.getInstance(applicationContext).getService(SignalManager.class);
            }
        });
        this.retryAfterDataMap = new ConcurrentHashMap();
        this.responseInterceptor = new v() { // from class: com.vungle.ads.internal.network.b
            @Override // hh.v
            public final b0 intercept(v.a aVar) {
                return VungleApiClient.m7539responseInterceptor$lambda0(this.f68048a, aVar);
            }
        };
        x.a aVar = new x.a();
        TimeUnit timeUnit = TimeUnit.SECONDS;
        x.a aVarN = aVar.O(60L, timeUnit).e(60L, timeUnit).a(this.responseInterceptor).N(new ProxySelector() { // from class: com.vungle.ads.internal.network.VungleApiClient$builder$1
            @Override // java.net.ProxySelector
            public void connectFailed(@Nullable URI uri, @Nullable SocketAddress sa2, @Nullable IOException ioe) {
                try {
                    ProxySelector.getDefault().connectFailed(uri, sa2, ioe);
                } catch (Exception unused) {
                }
            }

            @Override // java.net.ProxySelector
            @NotNull
            public List<Proxy> select(@Nullable URI uri) {
                try {
                    List<Proxy> listSelect = ProxySelector.getDefault().select(uri);
                    Intrinsics.checkNotNullExpressionValue(listSelect, "{\n                      …ri)\n                    }");
                    return listSelect;
                } catch (Exception unused) {
                    return CollectionsKt.listOf(Proxy.NO_PROXY);
                }
            }
        });
        hh.x xVarC = aVarN.c();
        hh.x xVarC2 = aVarN.a(new GzipRequestInterceptor()).c();
        this.api = new VungleApiImpl(xVarC);
        this.gzipApi = new VungleApiImpl(xVarC2);
    }

    private final String bodyToString(a0 request) {
        try {
            vh.e eVar = new vh.e();
            if (request != null) {
                request.writeTo(eVar);
                return eVar.readUtf8();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    private final b0 defaultErrorResponse(z request) {
        return new b0.a().r(request).g(500).p(hh.y.HTTP_1_1).m("Server is busy").b(c0.Companion.e("{\"Error\":\"Server is busy\"}", w.f73770e.b(D5.L))).c();
    }

    @VisibleForTesting
    public static /* synthetic */ void getAppBody$vungle_ads_release$annotations() {
    }

    private final DeviceNode getBasicDeviceBody(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        String MANUFACTURER = Build.MANUFACTURER;
        Intrinsics.checkNotNullExpressionValue(MANUFACTURER, "MANUFACTURER");
        String MODEL = Build.MODEL;
        Intrinsics.checkNotNullExpressionValue(MODEL, "MODEL");
        String RELEASE = Build.VERSION.RELEASE;
        Intrinsics.checkNotNullExpressionValue(RELEASE, "RELEASE");
        DeviceNode deviceNode = new DeviceNode(MANUFACTURER, MODEL, RELEASE, AndroidPlatform.INSTANCE.getCarrierName$vungle_ads_release(context), Intrinsics.areEqual("Amazon", MANUFACTURER) ? "amazon" : "android", displayMetrics.widthPixels, displayMetrics.heightPixels, this.uaString, (String) null, (Integer) null, (DeviceNode.VungleExt) null, 1792, (DefaultConstructorMarker) null);
        try {
            String userAgent = this.platform.getUserAgent();
            this.uaString = userAgent;
            deviceNode.setUa(userAgent);
            initUserAgentLazy();
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            return deviceNode;
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Cannot Get UserAgent. Setting Default Device UserAgent." + e10.getLocalizedMessage());
            return deviceNode;
        }
    }

    private final String getConnectionType() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            return "NONE";
        }
        int type = activeNetworkInfo.getType();
        return type != 0 ? (type == 1 || type == 6) ? "WIFI" : type != 7 ? type != 9 ? "UNKNOWN" : "ETHERNET" : "BLUETOOTH" : "MOBILE";
    }

    private final DeviceNode getDeviceBody() throws IllegalStateException {
        return getDeviceBody$vungle_ads_release(false);
    }

    private final CommonRequestBody.RequestExt getExtBody(boolean withSignals) {
        String strGenerateSignals;
        String configExtension = ConfigManager.INSTANCE.getConfigExtension();
        if (configExtension != null && configExtension.length() == 0) {
            configExtension = this.filePreferences.getString(Cookie.CONFIG_EXTENSION);
        }
        if (withSignals) {
            try {
                strGenerateSignals = getSignalManager().generateSignals();
            } catch (Exception e10) {
                Logger.INSTANCE.e(TAG, "Couldn't convert signals for sending. Error: " + e10.getMessage());
                strGenerateSignals = null;
            }
        } else {
            strGenerateSignals = null;
        }
        if ((configExtension == null || configExtension.length() == 0) && (strGenerateSignals == null || strGenerateSignals.length() == 0)) {
            return null;
        }
        return new CommonRequestBody.RequestExt(configExtension, strGenerateSignals, Long.valueOf(ConfigManager.INSTANCE.configLastValidatedTimestamp()));
    }

    static /* synthetic */ CommonRequestBody.RequestExt getExtBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getExtBody(z10);
    }

    @VisibleForTesting
    public static /* synthetic */ void getGzipApi$vungle_ads_release$annotations() {
    }

    private final String getPlacementID(a0 body) {
        List<String> placements;
        try {
            kotlinx.serialization.json.b bVar = json;
            String strBodyToString = bodyToString(body);
            KSerializer kSerializerB = ug.v.b(bVar.a(), v0.o(CommonRequestBody.class));
            Intrinsics.checkNotNull(kSerializerB, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
            CommonRequestBody.RequestParam request = ((CommonRequestBody) bVar.c(kSerializerB, strBodyToString)).getRequest();
            if (request != null && (placements = request.getPlacements()) != null) {
                String str = placements.get(0);
                if (str != null) {
                    return str;
                }
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @VisibleForTesting
    public static /* synthetic */ void getResponseInterceptor$vungle_ads_release$annotations() {
    }

    @VisibleForTesting
    public static /* synthetic */ void getRetryAfterDataMap$vungle_ads_release$annotations() {
    }

    private final SignalManager getSignalManager() {
        return (SignalManager) this.signalManager.getValue();
    }

    private final CommonRequestBody.User getUserBody(boolean withFirstPartyData) {
        CommonRequestBody.User user = new CommonRequestBody.User((CommonRequestBody.GDPR) null, (CommonRequestBody.CCPA) null, (CommonRequestBody.COPPA) null, (FirstPartyData) null, (CommonRequestBody.IAB) null, 31, (DefaultConstructorMarker) null);
        PrivacyManager privacyManager = PrivacyManager.INSTANCE;
        user.setGdpr(new CommonRequestBody.GDPR(privacyManager.getConsentStatus(), privacyManager.getConsentSource(), privacyManager.getConsentTimestamp(), privacyManager.getConsentMessageVersion()));
        user.setCcpa(new CommonRequestBody.CCPA(privacyManager.getCcpaStatus()));
        if (privacyManager.getCoppaStatus() != COPPA.COPPA_NOTSET) {
            user.setCoppa(new CommonRequestBody.COPPA(privacyManager.getCoppaStatus().getValue()));
        }
        if (privacyManager.shouldSendTCFString()) {
            user.setIab(new CommonRequestBody.IAB(privacyManager.getIABTCFString()));
        }
        if (withFirstPartyData) {
            user.setFpd(VungleAds.firstPartyData);
        }
        return user;
    }

    static /* synthetic */ CommonRequestBody.User getUserBody$default(VungleApiClient vungleApiClient, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return vungleApiClient.getUserBody(z10);
    }

    private final void initUserAgentLazy() {
        final TimeIntervalMetric timeIntervalMetric = new TimeIntervalMetric(Sdk.SDKMetric.SDKMetricType.USER_AGENT_LOAD_DURATION_MS);
        timeIntervalMetric.markStart();
        this.platform.getUserAgentLazy(new Consumer<String>() { // from class: com.vungle.ads.internal.network.VungleApiClient.initUserAgentLazy.1
            @Override // androidx.core.util.Consumer
            public void accept(@Nullable String uaString) throws Throwable {
                String str;
                if ((uaString == null || uaString.length() == 0) && ((str = VungleApiClient.this.uaString) == null || str.length() == 0)) {
                    uaString = VungleApiClient.this.platform.getUserAgent();
                }
                if (uaString == null || uaString.length() == 0) {
                    Logger.INSTANCE.e(VungleApiClient.TAG, "All UA sources failed, logging USER_AGENT_ERROR");
                    new UserAgentError().logErrorNoReturnValue$vungle_ads_release();
                } else {
                    timeIntervalMetric.markEnd();
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, timeIntervalMetric, (LogEntry) null, (String) null, 6, (Object) null);
                    VungleApiClient.this.uaString = uaString;
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ErrorInfo pingTPAT$default(VungleApiClient vungleApiClient, String str, Map map, String str2, HttpMethod httpMethod, LogEntry logEntry, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            map = null;
        }
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            httpMethod = HttpMethod.GET;
        }
        if ((i10 & 16) != 0) {
            logEntry = null;
        }
        return vungleApiClient.pingTPAT(str, map, str2, httpMethod, logEntry);
    }

    public static /* synthetic */ CommonRequestBody requestBody$default(VungleApiClient vungleApiClient, boolean z10, boolean z11, int i10, Object obj) throws IllegalStateException {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        return vungleApiClient.requestBody(z10, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: responseInterceptor$lambda-0, reason: not valid java name */
    public static final b0 m7539responseInterceptor$lambda0(VungleApiClient this$0, v.a chain) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(chain, "chain");
        z zVarRequest = chain.request();
        try {
            try {
                b0 b0VarA = chain.a(zVarRequest);
                String strA = b0VarA.R().a("Retry-After");
                if (strA != null && strA.length() != 0) {
                    try {
                        long j10 = Long.parseLong(strA);
                        if (j10 > 0) {
                            String strD = zVarRequest.l().d();
                            long jCurrentTimeMillis = (j10 * ((long) 1000)) + System.currentTimeMillis();
                            if (StringsKt.M(strD, com.mbridge.msdk.foundation.entity.b.JSON_KEY_ADS, false, 2, null)) {
                                String placementID = this$0.getPlacementID(zVarRequest.a());
                                if (placementID.length() > 0) {
                                    this$0.retryAfterDataMap.put(placementID, Long.valueOf(jCurrentTimeMillis));
                                }
                            }
                        }
                    } catch (Exception unused) {
                        Logger.INSTANCE.d(TAG, "Retry-After value is not an valid value");
                    }
                }
                return b0VarA;
            } catch (OutOfMemoryError unused2) {
                Logger.INSTANCE.e(TAG, "OOM for " + zVarRequest.l());
                return this$0.defaultErrorResponse(zVarRequest);
            }
        } catch (Exception e10) {
            Logger.INSTANCE.e(TAG, "Exception: " + e10.getMessage() + " for " + zVarRequest.l());
            return this$0.defaultErrorResponse(zVarRequest);
        }
    }

    @VisibleForTesting
    public final void addPlaySvcAvailabilityInCookie(boolean isPlaySvcAvailable) {
        this.filePreferences.put(Cookie.IS_PLAY_SERVICE_AVAILABLE, isPlaySvcAvailable).apply();
    }

    public final boolean checkIsRetryAfterActive(@NotNull String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if ((l10 != null ? l10.longValue() : 0L) > System.currentTimeMillis()) {
            return true;
        }
        this.retryAfterDataMap.remove(placementID);
        return false;
    }

    @Nullable
    public final Call<ConfigPayload> config() throws IOException {
        AppNode appNode = this.appBody;
        if (appNode == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody$vungle_ads_release(true), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        FileUtility fileUtility = FileUtility.INSTANCE;
        String str = BASE_URL;
        if (!fileUtility.isValidUrl(str)) {
            str = "https://config.ads.vungle.com/";
        }
        if (!StringsKt.M(str, "/", false, 2, null)) {
            str = str + IOUtils.DIR_SEPARATOR_UNIX;
        }
        return this.api.config(VungleHeader.INSTANCE.getHeaderUa(), str + "config", commonRequestBody);
    }

    @Nullable
    /* JADX INFO: renamed from: getAppBody$vungle_ads_release, reason: from getter */
    public final AppNode getAppBody() {
        return this.appBody;
    }

    @NotNull
    public final String getConnectionTypeDetail(int type) {
        if (type == 1) {
            return "gprs";
        }
        if (type == 2) {
            return "edge";
        }
        if (type == 20) {
            return "5g";
        }
        switch (type) {
            case 4:
                return "wcdma";
            case 5:
                return "cdma_evdo_0";
            case 6:
                return "cdma_evdo_a";
            case 7:
                return "cdma_1xrtt";
            case 8:
                return "hsdpa";
            case 9:
                return "hsupa";
            default:
                switch (type) {
                    case 12:
                        return "cdma_evdo_b";
                    case 13:
                        return "lte";
                    case 14:
                        return "hrpd";
                    default:
                        return "unknown";
                }
        }
    }

    @Nullable
    public final String getConnectionTypeDetail$vungle_ads_release() {
        if (ContextCompat.checkSelfPermission(this.applicationContext, "android.permission.ACCESS_NETWORK_STATE") != 0) {
            return null;
        }
        Object systemService = this.applicationContext.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
        return activeNetworkInfo != null ? getConnectionTypeDetail(activeNetworkInfo.getSubtype()) : "unknown";
    }

    @VisibleForTesting
    @NotNull
    public final synchronized DeviceNode getDeviceBody$vungle_ads_release(boolean explicitBlock) throws IllegalStateException {
        DeviceNode deviceNodeCopy$default;
        String str;
        try {
            DeviceNode basicDeviceBody = this.baseDeviceInfo;
            if (basicDeviceBody == null) {
                basicDeviceBody = getBasicDeviceBody(this.applicationContext);
                this.baseDeviceInfo = basicDeviceBody;
            }
            deviceNodeCopy$default = DeviceNode.copy$default(basicDeviceBody, null, null, null, null, null, 0, 0, null, null, null, null, 2047, null);
            DeviceNode.VungleExt vungleExt = new DeviceNode.VungleExt(false, (String) null, (Integer) null, 0.0f, (String) null, 0, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false, 0, false, (String) null, (String) null, (Long) null, (Long) null, (Long) null, (Long) null, 4194303, (DefaultConstructorMarker) null);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            Object systemService = this.applicationContext.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
            if (defaultDisplay != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            deviceNodeCopy$default.setH(displayMetrics.heightPixels);
            deviceNodeCopy$default.setW(displayMetrics.widthPixels);
            AdvertisingInfo advertisingInfo = this.advertisingInfo;
            if (advertisingInfo == null) {
                advertisingInfo = this.platform.getAdvertisingInfo();
            }
            this.advertisingInfo = advertisingInfo;
            String advertisingId = advertisingInfo != null ? advertisingInfo.getAdvertisingId() : null;
            AdvertisingInfo advertisingInfo2 = this.advertisingInfo;
            Boolean boolValueOf = advertisingInfo2 != null ? Boolean.valueOf(advertisingInfo2.getLimitAdTracking()) : null;
            PrivacyManager privacyManager = PrivacyManager.INSTANCE;
            if (privacyManager.shouldSendAdIds()) {
                if (advertisingId != null) {
                    if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                        vungleExt.setAmazonAdvertisingId(advertisingId);
                    } else {
                        vungleExt.setGaid(advertisingId);
                    }
                    deviceNodeCopy$default.setIfa(advertisingId);
                } else {
                    deviceNodeCopy$default.setIfa("");
                }
            }
            if (explicitBlock || !privacyManager.shouldSendAdIds()) {
                deviceNodeCopy$default.setIfa(null);
                vungleExt.setGaid(null);
                vungleExt.setAmazonAdvertisingId(null);
            }
            Boolean bool = Boolean.TRUE;
            boolean zHasSystemFeature = false;
            deviceNodeCopy$default.setLmt(Intrinsics.areEqual(boolValueOf, bool) ? 1 : 0);
            vungleExt.setGooglePlayServicesAvailable(Intrinsics.areEqual(bool, isGooglePlayServicesAvailable()));
            if (privacyManager.allowDeviceIDFromTCF() != PrivacyManager.DeviceIdAllowed.DISABLE_ID) {
                String appSetId = this.platform.getAppSetId();
                if (appSetId != null) {
                    vungleExt.setAppSetId(appSetId);
                }
                Integer appSetIdScope = this.platform.getAppSetIdScope();
                if (appSetIdScope != null) {
                    vungleExt.setAppSetIdScope(Integer.valueOf(appSetIdScope.intValue()));
                }
            }
            Intent intentRegisterReceiver = this.applicationContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                int intExtra = intentRegisterReceiver.getIntExtra("level", -1);
                int intExtra2 = intentRegisterReceiver.getIntExtra("scale", -1);
                if (intExtra > 0 && intExtra2 > 0) {
                    vungleExt.setBatteryLevel(intExtra / intExtra2);
                }
                int intExtra3 = intentRegisterReceiver.getIntExtra("status", -1);
                if (intExtra3 == -1) {
                    str = "UNKNOWN";
                } else if (intExtra3 == 2 || intExtra3 == 5) {
                    int intExtra4 = intentRegisterReceiver.getIntExtra("plugged", -1);
                    str = intExtra4 != 1 ? intExtra4 != 2 ? intExtra4 != 4 ? "BATTERY_PLUGGED_OTHERS" : "BATTERY_PLUGGED_WIRELESS" : "BATTERY_PLUGGED_USB" : "BATTERY_PLUGGED_AC";
                } else {
                    str = "NOT_CHARGING";
                }
            } else {
                str = "UNKNOWN";
            }
            vungleExt.setBatteryState(str);
            vungleExt.setBatterySaverEnabled(this.platform.isBatterySaverEnabled() ? 1 : 0);
            String connectionType = getConnectionType();
            if (connectionType != null) {
                vungleExt.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                vungleExt.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            vungleExt.setLocale(Locale.getDefault().toString());
            vungleExt.setLanguage(Locale.getDefault().getLanguage());
            vungleExt.setTimeZone(TimeZone.getDefault().getID());
            vungleExt.setVolumeLevel(this.platform.getVolumeLevel());
            vungleExt.setSoundEnabled(this.platform.isSoundEnabled() ? 1 : 0);
            if (Intrinsics.areEqual("Amazon", Build.MANUFACTURER)) {
                zHasSystemFeature = this.applicationContext.getPackageManager().hasSystemFeature("amazon.hardware.fire_tv");
            } else {
                Object systemService2 = this.applicationContext.getSystemService("uimode");
                Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.app.UiModeManager");
                if (((UiModeManager) systemService2).getCurrentModeType() == 4) {
                    zHasSystemFeature = true;
                }
            }
            vungleExt.setTv(zHasSystemFeature);
            vungleExt.setSideloadEnabled(this.platform.getIsSideLoaded());
            vungleExt.setSdCardAvailable(this.platform.isSdCardPresent() ? 1 : 0);
            if (ConfigManager.INSTANCE.otEnabled()) {
                vungleExt.setSit(Long.valueOf(this.platform.getSDKInstallationTime()));
                vungleExt.setOit(Long.valueOf(this.platform.getOSInstallationTime()));
                vungleExt.setOrt(Long.valueOf(this.platform.getLastBootTime()));
                vungleExt.setObt(Long.valueOf(this.platform.getBuildTime()));
            }
            deviceNodeCopy$default.setUa(this.uaString);
            deviceNodeCopy$default.setExt(vungleExt);
        } catch (Throwable th2) {
            throw th2;
        }
        return deviceNodeCopy$default;
    }

    @NotNull
    /* JADX INFO: renamed from: getGzipApi$vungle_ads_release, reason: from getter */
    public final VungleApi getGzipApi() {
        return this.gzipApi;
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getPlayServicesAvailabilityFromAPI() {
        Boolean boolValueOf = null;
        try {
            GoogleApiAvailabilityLight googleApiAvailabilityLight = GoogleApiAvailabilityLight.getInstance();
            Intrinsics.checkNotNullExpressionValue(googleApiAvailabilityLight, "getInstance()");
            boolean z10 = googleApiAvailabilityLight.isGooglePlayServicesAvailable(this.applicationContext) == 0;
            boolValueOf = Boolean.valueOf(z10);
            addPlaySvcAvailabilityInCookie(z10);
            return boolValueOf;
        } catch (Exception unused) {
            Logger.INSTANCE.w(TAG, "Unexpected exception from Play services lib.");
            return boolValueOf;
        } catch (NoClassDefFoundError unused2) {
            Logger.INSTANCE.w(TAG, "Play services Not available");
            boolValueOf = Boolean.FALSE;
            try {
                addPlaySvcAvailabilityInCookie(false);
            } catch (Exception unused3) {
                Logger.INSTANCE.w(TAG, "Failure to write GPS availability to DB");
            }
            return boolValueOf;
        }
    }

    @VisibleForTesting
    @Nullable
    public final Boolean getPlayServicesAvailabilityFromCookie() {
        return this.filePreferences.getBoolean(Cookie.IS_PLAY_SERVICE_AVAILABLE);
    }

    @NotNull
    /* JADX INFO: renamed from: getResponseInterceptor$vungle_ads_release, reason: from getter */
    public final v getResponseInterceptor() {
        return this.responseInterceptor;
    }

    @NotNull
    public final Map<String, Long> getRetryAfterDataMap$vungle_ads_release() {
        return this.retryAfterDataMap;
    }

    public final long getRetryAfterHeaderValue(@NotNull String placementID) {
        Intrinsics.checkNotNullParameter(placementID, "placementID");
        Long l10 = this.retryAfterDataMap.get(placementID);
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    public final synchronized void initialize(@NotNull String appId) {
        PackageInfo packageInfo;
        try {
            Intrinsics.checkNotNullParameter(appId, "appId");
            VungleHeader.INSTANCE.setAppId(appId);
            String str = NastAdapter.ADAPTER_SDK_VERSION_NAME;
            try {
                if (Build.VERSION.SDK_INT >= 33) {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                } else {
                    packageInfo = this.applicationContext.getPackageManager().getPackageInfo(this.applicationContext.getPackageName(), 0);
                    Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n                    ap…      )\n                }");
                }
                String str2 = packageInfo.versionName;
                Intrinsics.checkNotNullExpressionValue(str2, "packageInfo.versionName");
                str = str2;
            } catch (Exception unused) {
            }
            VungleHeader.INSTANCE.setAppVersion(str);
            this.baseDeviceInfo = getBasicDeviceBody(this.applicationContext);
            String packageName = this.applicationContext.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "applicationContext.packageName");
            this.appBody = new AppNode(packageName, str, appId);
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @VisibleForTesting
    @Nullable
    public final Boolean isGooglePlayServicesAvailable() {
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromCookie();
        }
        if (this.isGooglePlayServicesAvailable == null) {
            this.isGooglePlayServicesAvailable = getPlayServicesAvailabilityFromAPI();
        }
        return this.isGooglePlayServicesAvailable;
    }

    @Nullable
    public final ErrorInfo pingTPAT(@NotNull String url, @Nullable Map<String, String> headers, @Nullable String requestBody, @NotNull HttpMethod requestType, @Nullable LogEntry logEntry) {
        b0 rawResponse;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(requestType, "requestType");
        if (!FileUtility.INSTANCE.isValidUrl(url)) {
            return new ErrorInfo("Invalid URL", true, false, 4, null);
        }
        try {
            if (!(Build.VERSION.SDK_INT >= 24 ? NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(new URL(url).getHost()) : NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted()) && URLUtil.isHttpUrl(url)) {
                return new ErrorInfo("Clear Text Traffic is blocked", false, false, 6, null);
            }
            try {
                String str = this.uaString;
                if (str == null) {
                    str = "";
                }
                Response<Void> responseExecute = this.api.pingTPAT(str, url, requestType, headers, requestBody != null ? a0.Companion.h(requestBody, w.f73770e.b(D5.L)) : null).execute();
                if (responseExecute != null && responseExecute.isSuccessful()) {
                    return null;
                }
                Integer numValueOf = (responseExecute == null || (rawResponse = responseExecute.getRawResponse()) == null) ? null : Integer.valueOf(rawResponse.q());
                if (CollectionsKt.contains(CollectionsKt.listOf((Object[]) new Integer[]{301, 302, 307, 308}), numValueOf)) {
                    AnalyticsClient.logMetric$vungle_ads_release$default(AnalyticsClient.INSTANCE, Sdk.SDKMetric.SDKMetricType.NOTIFICATION_REDIRECT, 0L, logEntry, url, 2, null);
                    return null;
                }
                boolean z10 = numValueOf != null && new IntRange(500, CommonGatewayClient.CODE_599).k(numValueOf.intValue());
                StringBuilder sb2 = new StringBuilder();
                sb2.append("unsuccessful response, error code: ");
                sb2.append(numValueOf);
                sb2.append(", message: ");
                sb2.append(responseExecute != null ? responseExecute.message() : null);
                return new ErrorInfo(sb2.toString(), false, z10, 2, null);
            } catch (Throwable th2) {
                String localizedMessage = th2.getLocalizedMessage();
                if (localizedMessage == null) {
                    localizedMessage = "IOException";
                }
                return new ErrorInfo(localizedMessage, false, true, 2, null);
            }
        } catch (MalformedURLException e10) {
            String localizedMessage2 = e10.getLocalizedMessage();
            if (localizedMessage2 == null) {
                localizedMessage2 = "MalformedURLException";
            }
            return new ErrorInfo(localizedMessage2, true, false, 4, null);
        }
    }

    public final void reportErrors(@NotNull BlockingQueue<Sdk.SDKError.Builder> errors, @NotNull final AnalyticsClient.RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(errors, "errors");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String errorLoggingEndpoint = ConfigManager.INSTANCE.getErrorLoggingEndpoint();
        if (errorLoggingEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKError.Builder builder : errors) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKError sDKErrorBuild = builder.build();
            Logger.INSTANCE.e(TAG, "Sending Error: " + sDKErrorBuild.getReason());
            linkedBlockingQueue.add(sDKErrorBuild);
        }
        Sdk.SDKErrorBatch sDKErrorBatchBuild = Sdk.SDKErrorBatch.newBuilder().addAllErrors(linkedBlockingQueue).build();
        a0.a aVar = a0.Companion;
        byte[] byteArray = sDKErrorBatchBuild.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendErrors(VungleHeader.INSTANCE.getHeaderUa(), errorLoggingEndpoint, aVar.m(byteArray, w.f73770e.b(CommonGatewayClient.HEADER_PROTOBUF), 0, sDKErrorBatchBuild.toByteArray().length)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportErrors.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(@Nullable Call<Void> call, @Nullable Throwable t10) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(@Nullable Call<Void> call, @Nullable Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    public final void reportMetrics(@NotNull BlockingQueue<Sdk.SDKMetric.Builder> metrics, @NotNull final AnalyticsClient.RequestListener requestListener) {
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(requestListener, "requestListener");
        String metricsEndpoint = ConfigManager.INSTANCE.getMetricsEndpoint();
        if (metricsEndpoint.length() == 0) {
            requestListener.onFailure();
            return;
        }
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        for (Sdk.SDKMetric.Builder builder : metrics) {
            builder.setSessionId(getSignalManager().getUuid());
            Placement placement = ConfigManager.INSTANCE.getPlacement(builder.getPlacementReferenceId());
            if (placement != null) {
                builder.setIsHbPlacement(placement.getHeaderBidding() ? 1L : 0L);
                String type = placement.getType();
                if (type == null) {
                    type = "";
                }
                builder.setPlacementType(type);
            }
            String connectionType = getConnectionType();
            if (connectionType != null) {
                builder.setConnectionType(connectionType);
            }
            String connectionTypeDetail$vungle_ads_release = getConnectionTypeDetail$vungle_ads_release();
            if (connectionTypeDetail$vungle_ads_release != null) {
                builder.setConnectionTypeDetail(connectionTypeDetail$vungle_ads_release);
            }
            Sdk.SDKMetric sDKMetricBuild = builder.build();
            Logger.INSTANCE.e(TAG, "Sending Metric: " + sDKMetricBuild.getType());
            linkedBlockingQueue.add(sDKMetricBuild);
        }
        Sdk.MetricBatch metricBatchBuild = Sdk.MetricBatch.newBuilder().addAllMetrics(linkedBlockingQueue).build();
        a0.a aVar = a0.Companion;
        w wVarB = w.f73770e.b(CommonGatewayClient.HEADER_PROTOBUF);
        byte[] byteArray = metricBatchBuild.toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray, "batch.toByteArray()");
        this.api.sendMetrics(VungleHeader.INSTANCE.getHeaderUa(), metricsEndpoint, a0.a.n(aVar, wVarB, byteArray, 0, 0, 12, null)).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.reportMetrics.2
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(@Nullable Call<Void> call, @Nullable Throwable t10) {
                requestListener.onFailure();
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(@Nullable Call<Void> call, @Nullable Response<Void> response) {
                requestListener.onSuccess();
            }
        });
    }

    @Nullable
    public final Call<AdPayload> requestAd(@NotNull String placement, @Nullable VungleAdSize adSize) throws IllegalStateException {
        Intrinsics.checkNotNullParameter(placement, "placement");
        ConfigManager configManager = ConfigManager.INSTANCE;
        String adsEndpoint = configManager.getAdsEndpoint();
        CommonRequestBody commonRequestBodyRequestBody = requestBody(!configManager.signalsDisabled(), configManager.fpdEnabled());
        CommonRequestBody.RequestParam requestParam = new CommonRequestBody.RequestParam(CollectionsKt.listOf(placement), (CommonRequestBody.AdSizeParam) null, (Long) null, (String) null, (String) null, (String) null, 62, (DefaultConstructorMarker) null);
        if (adSize != null) {
            requestParam.setAdSize(new CommonRequestBody.AdSizeParam(adSize.getWidth(), adSize.getHeight()));
        }
        commonRequestBodyRequestBody.setRequest(requestParam);
        return this.gzipApi.ads(VungleHeader.INSTANCE.getHeaderUa(), adsEndpoint, commonRequestBodyRequestBody);
    }

    @NotNull
    public final CommonRequestBody requestBody(boolean withSignals, boolean withFirstPartyData) throws IllegalStateException {
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), this.appBody, getUserBody(withFirstPartyData), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        CommonRequestBody.RequestExt extBody = getExtBody(withSignals);
        if (extBody != null) {
            commonRequestBody.setExt(extBody);
        }
        return commonRequestBody;
    }

    @Nullable
    public final Call<Void> ri(@NotNull CommonRequestBody.RequestParam request) {
        AppNode appNode;
        Intrinsics.checkNotNullParameter(request, "request");
        String riEndpoint = ConfigManager.INSTANCE.getRiEndpoint();
        if (riEndpoint == null || riEndpoint.length() == 0 || (appNode = this.appBody) == null) {
            return null;
        }
        CommonRequestBody commonRequestBody = new CommonRequestBody(getDeviceBody(), appNode, getUserBody$default(this, false, 1, null), (CommonRequestBody.RequestExt) null, (CommonRequestBody.RequestParam) null, 24, (DefaultConstructorMarker) null);
        commonRequestBody.setRequest(request);
        CommonRequestBody.RequestExt extBody$default = getExtBody$default(this, false, 1, null);
        if (extBody$default != null) {
            commonRequestBody.setExt(extBody$default);
        }
        return this.api.ri(VungleHeader.INSTANCE.getHeaderUa(), riEndpoint, commonRequestBody);
    }

    public final void sendAdMarkup(@NotNull String adMarkup, @NotNull String endpoint) {
        Intrinsics.checkNotNullParameter(adMarkup, "adMarkup");
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        this.api.sendAdMarkup(endpoint, a0.Companion.h(adMarkup, w.f73770e.b(D5.L))).enqueue(new Callback<Void>() { // from class: com.vungle.ads.internal.network.VungleApiClient.sendAdMarkup.1
            @Override // com.vungle.ads.internal.network.Callback
            public void onFailure(@Nullable Call<Void> call, @Nullable Throwable t10) {
            }

            @Override // com.vungle.ads.internal.network.Callback
            public void onResponse(@Nullable Call<Void> call, @Nullable Response<Void> response) {
            }
        });
    }

    public final void setAppBody$vungle_ads_release(@Nullable AppNode appNode) {
        this.appBody = appNode;
    }

    public final void setGzipApi$vungle_ads_release(@NotNull VungleApi vungleApi) {
        Intrinsics.checkNotNullParameter(vungleApi, "<set-?>");
        this.gzipApi = vungleApi;
    }

    public final void setResponseInterceptor$vungle_ads_release(@NotNull v vVar) {
        Intrinsics.checkNotNullParameter(vVar, "<set-?>");
        this.responseInterceptor = vVar;
    }

    public final void setRetryAfterDataMap$vungle_ads_release(@NotNull Map<String, Long> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.retryAfterDataMap = map;
    }
}
