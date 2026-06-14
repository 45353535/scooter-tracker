package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.startapp.json.TypeInfo;
import com.startapp.sdk.ads.external.config.ExternalAdConfig;
import com.startapp.sdk.ads.external.config.ExternalConfig;
import com.startapp.sdk.adsbase.b;
import com.startapp.sdk.adsbase.consent.ConsentConfig;
import com.startapp.sdk.adsbase.crashreport.ANRRemoteConfig;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.adsbase.remoteconfig.EnabledConfig;
import com.startapp.sdk.components.a;
import com.startapp.sdk.insight.NetworkTestsMetaData;
import com.startapp.sdk.internal.c8;
import com.startapp.sdk.internal.g2;
import com.startapp.sdk.internal.g7;
import com.startapp.sdk.internal.g9;
import com.startapp.sdk.internal.h9;
import com.startapp.sdk.internal.i0;
import com.startapp.sdk.internal.i6;
import com.startapp.sdk.internal.ic;
import com.startapp.sdk.internal.jc;
import com.startapp.sdk.internal.k2;
import com.startapp.sdk.internal.k7;
import com.startapp.sdk.internal.kc;
import com.startapp.sdk.internal.lb;
import com.startapp.sdk.internal.lc;
import com.startapp.sdk.internal.q0;
import com.startapp.sdk.internal.uf;
import com.startapp.sdk.internal.vf;
import com.startapp.sdk.internal.vi;
import com.startapp.sdk.internal.y6;
import com.startapp.sdk.internal.z6;
import com.startapp.sdk.sensors.SensorsData;
import com.startapp.sdk.triggeredlinks.TriggeredLinksMetadata;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public class MetaData implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f64133d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final AtomicBoolean f64134e = new AtomicBoolean();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final HashSet f64135f = new HashSet(Collections.singletonList(i6.f64678a));

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final List f64136g = Arrays.asList("https://adsmetadata.startappservice.com/adsmetadata/api/v1.0/", "https://adsmetadata.mobileadexchange.net/adsmetadata/api/v1.0/", "https://d26xw8rp6mlgfg.cloudfront.net/adsmetadata/api/v1.0/");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f64137h = "https://req.startappservice.com/1.5/";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f64138i = {60, 60, 240};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final HashSet f64139j = new HashSet(Arrays.asList("com.facebook.katana", "com.yandex.browser"));

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static volatile MetaData f64140k = new MetaData();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final AtomicInteger f64141l = new AtomicInteger();
    private static final long serialVersionUID = 4682036570588775049L;
    private long IABDisplayImpressionDelayInSeconds;
    private long IABVideoImpressionDelayInSeconds;
    private boolean SupportIABViewability;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private transient boolean f64142a;

    @Nullable
    private String adClickURL;

    @Nullable
    @TypeInfo(complex = true, name = "debug")
    private AdDebuggerMetadata adDebugger;

    @Nullable
    @TypeInfo(complex = true, parser = EnabledConfig.Parser.class)
    private EnabledConfig adLoadWaitForMetadata;
    private String adPlatformBannerHostSecured;

    @Nullable
    private String adPlatformHostSecured;
    private String adPlatformNativeHostSecured;
    private String adPlatformOverlayHostSecured;
    private boolean adsPreCachingEnabled;

    @Nullable
    @TypeInfo(complex = true)
    private AdvertisingIdResolverMetadata air;
    private boolean alwaysSendToken;

    @Nullable
    @TypeInfo(complex = true)
    private AnalyticsConfig analytics;

    @Nullable
    @TypeInfo(complex = true)
    private ANRRemoteConfig anrConfig;

    @Nullable
    @TypeInfo(complex = true)
    private AppSessionConfig appSession;
    private String assetsBaseUrlSecured;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient boolean f64143b;

    @TypeInfo(complex = true)
    private BluetoothConfig btConfig;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ArrayList f64144c;

    @Nullable
    private String calcProd;
    private boolean chromeCustomeTabsExternal;
    private boolean chromeCustomeTabsInternal;
    private boolean closeAdAfterClick;
    private boolean compressionEnabled;

    @Nullable
    @TypeInfo(complex = true)
    private ConnectivityHelperMetadata connectivity;

    @Nullable
    @TypeInfo(complex = true)
    private ConsentConfig consentDetails;
    private boolean disableSendAdvertisingId;
    private boolean dns;

    @Nullable
    @TypeInfo(complex = true, name = "tracer")
    private EventTracerMetadata eventTracerMetadata;

    @Nullable
    @TypeInfo(complex = true)
    private ExternalConfig external;
    private double flh;

    @Nullable
    @TypeInfo(complex = true, name = "http")
    private HttpClientConfig httpClientConfig;
    private double httpPost;

    @Nullable
    private String impressionURL;

    @Nullable
    @TypeInfo(complex = true)
    private ImpressionsTrackingMetadata impressionsTracking;
    private boolean inAppBrowser;

    @TypeInfo(type = HashSet.class)
    private Set<String> installersList;
    private boolean isToken1Mandatory;

    @Nullable
    private String lastVersion;

    @Nullable
    @TypeInfo(complex = true)
    private LocationMetadata location;
    private String metadataUpdateVersion;

    @Nullable
    @TypeInfo(complex = true)
    private MotionMetadata motion;

    @Nullable
    @TypeInfo(complex = true)
    private MraidMetadata mraid;

    @TypeInfo(complex = true)
    private NetworkTestsMetaData networkTests;
    private int notVisibleBannerReloadInterval;
    private boolean omSdkEnabled;
    private long omSdkTimeout;
    private int[] periodicEventIntMin;
    private int[] periodicForegroundEventSec;
    private boolean periodicInfoEventEnabled;
    private boolean periodicMetaDataEnabled;
    private int periodicMetaDataIntervalInMinutes;

    @TypeInfo(type = HashSet.class)
    private Set<String> preInstalledPackages;
    private String profileId;

    @Nullable
    @TypeInfo(complex = true)
    private RcdMetadata rcd;

    @Nullable
    @TypeInfo(complex = true)
    private RscMetadata rsc;

    @TypeInfo(complex = true)
    private SensorsConfig sensorsConfig;

    @Nullable
    @TypeInfo(complex = true)
    private SensorsData sensorsData;
    private int sessionMaxBackgroundTime;
    private boolean simpleToken2;

    @Nullable
    @TypeInfo(complex = true)
    private StaleDcConfig staleDc;
    private int stopAutoLoadAmount;
    private int stopAutoLoadPreCacheAmount;

    @Nullable
    @TypeInfo(complex = true)
    private TelephonyMetadata telephony;

    @Nullable
    @TypeInfo(complex = true)
    private TopicsClientMetadata topics;

    @Nullable
    private String trackDownloadHost;

    @Nullable
    @TypeInfo(complex = true)
    private TriggeredLinksMetadata triggeredLinks;
    private boolean trueNetEnabled;

    @Nullable
    private String vastRecorderHost;

    @Nullable
    @TypeInfo(complex = true, name = "wvf")
    private WvfMetadata webViewFactory;
    private boolean webViewSecured;

    @TypeInfo(complex = true)
    private SimpleTokenConfig SimpleToken = new SimpleTokenConfig();

    @Nullable
    @TypeInfo(type = ArrayList.class)
    private List<String> metaDataHosts = f64136g;

    @VisibleForTesting
    public MetaData() {
        String str = f64137h;
        this.adPlatformHostSecured = str;
        this.trackDownloadHost = str;
        this.sessionMaxBackgroundTime = 1800;
        this.profileId = null;
        this.installersList = f64135f;
        this.preInstalledPackages = f64139j;
        this.simpleToken2 = true;
        this.alwaysSendToken = true;
        this.isToken1Mandatory = true;
        this.compressionEnabled = false;
        this.periodicMetaDataEnabled = false;
        this.periodicMetaDataIntervalInMinutes = 360;
        this.periodicInfoEventEnabled = false;
        this.periodicEventIntMin = f64138i;
        this.inAppBrowser = true;
        this.SupportIABViewability = true;
        this.IABDisplayImpressionDelayInSeconds = 1L;
        this.IABVideoImpressionDelayInSeconds = 2L;
        this.sensorsConfig = new SensorsConfig();
        this.btConfig = new BluetoothConfig();
        this.assetsBaseUrlSecured = "";
        this.notVisibleBannerReloadInterval = 3600;
        this.analytics = new AnalyticsConfig();
        this.f64142a = false;
        this.f64143b = false;
        this.f64144c = new ArrayList();
        this.metadataUpdateVersion = "5.2.4";
        this.dns = false;
        this.stopAutoLoadAmount = 3;
        this.stopAutoLoadPreCacheAmount = 3;
        this.trueNetEnabled = false;
        this.webViewSecured = true;
        this.omSdkEnabled = false;
        this.omSdkTimeout = 5000L;
        this.chromeCustomeTabsInternal = true;
        this.chromeCustomeTabsExternal = true;
        this.disableSendAdvertisingId = false;
        this.networkTests = new NetworkTestsMetaData();
        this.staleDc = new StaleDcConfig();
        this.telephony = new TelephonyMetadata();
        this.anrConfig = new ANRRemoteConfig();
        this.impressionsTracking = null;
        this.connectivity = new ConnectivityHelperMetadata();
        this.webViewFactory = null;
        this.appSession = new AppSessionConfig();
        this.topics = null;
        this.mraid = null;
        this.eventTracerMetadata = null;
    }

    public static MetaData E() {
        return f64140k;
    }

    public static Object H() {
        return f64133d;
    }

    private static void a(MetaData metaData) {
        synchronized (f64133d) {
            metaData.f64144c.addAll(f64140k.f64144c);
            f64140k = metaData;
        }
    }

    public static boolean c(Context context) {
        if (f64134e.getAndSet(true)) {
            return false;
        }
        MetaData metaData = (MetaData) g7.c(context, "StartappMetadata");
        MetaData metaData2 = new MetaData();
        if (metaData != null) {
            boolean zA = vi.a((Serializable) metaData, (Serializable) metaData2);
            if ("5.2.4".equals(metaData.metadataUpdateVersion) && zA) {
                g9 g9Var = new g9(h9.f64610e);
                g9Var.f64553d = "metadata_null";
                g9Var.a();
            }
            metaData.f64142a = false;
            metaData.f64143b = false;
            metaData.f64144c = new ArrayList();
            a(metaData);
        } else {
            a(metaData2);
        }
        f64140k.a();
        return true;
    }

    public final long A() {
        return this.IABVideoImpressionDelayInSeconds;
    }

    public final String B() {
        return this.impressionURL;
    }

    public final ImpressionsTrackingMetadata C() {
        return this.impressionsTracking;
    }

    public final Set D() {
        return this.installersList;
    }

    public final String F() {
        return this.lastVersion;
    }

    public final LocationMetadata G() {
        return this.location;
    }

    public final List I() {
        List<String> list = this.metaDataHosts;
        if (list == null || list.isEmpty()) {
            list = f64136g;
        }
        return DesugarCollections.unmodifiableList(list);
    }

    public final MotionMetadata J() {
        return this.motion;
    }

    public final MraidMetadata K() {
        return this.mraid;
    }

    public final NetworkTestsMetaData L() {
        return this.networkTests;
    }

    public final int M() {
        return this.notVisibleBannerReloadInterval;
    }

    public final long N() {
        return Math.max(0L, this.omSdkTimeout);
    }

    public final int O() {
        return this.periodicMetaDataIntervalInMinutes;
    }

    public final Set P() {
        Set set = this.preInstalledPackages;
        if (set == null) {
            set = f64139j;
        }
        return DesugarCollections.unmodifiableSet(set);
    }

    public final String Q() {
        return this.profileId;
    }

    public final RcdMetadata R() {
        return this.rcd;
    }

    public final RscMetadata S() {
        return this.rsc;
    }

    public final SensorsConfig T() {
        return this.sensorsConfig;
    }

    public final SensorsData U() {
        return this.sensorsData;
    }

    public final long V() {
        return TimeUnit.SECONDS.toMillis(this.sessionMaxBackgroundTime);
    }

    public final SimpleTokenConfig W() {
        return this.SimpleToken;
    }

    public final StaleDcConfig X() {
        return this.staleDc;
    }

    public final int Y() {
        return this.stopAutoLoadAmount;
    }

    public final int Z() {
        return this.stopAutoLoadPreCacheAmount;
    }

    public final TelephonyMetadata a0() {
        return this.telephony;
    }

    public final int b(Context context) {
        return a(context, this.periodicEventIntMin);
    }

    public final TopicsClientMetadata b0() {
        return this.topics;
    }

    public final String c0() {
        String str = this.trackDownloadHost;
        if (str != null) {
            return str;
        }
        String str2 = this.adPlatformHostSecured;
        return str2 != null ? str2 : f64137h;
    }

    public final AdDebuggerMetadata d() {
        return this.adDebugger;
    }

    public final String d0() {
        return this.vastRecorderHost;
    }

    public final EnabledConfig e() {
        return this.adLoadWaitForMetadata;
    }

    public final WvfMetadata e0() {
        return this.webViewFactory;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            MetaData metaData = (MetaData) obj;
            if (this.sessionMaxBackgroundTime == metaData.sessionMaxBackgroundTime && this.simpleToken2 == metaData.simpleToken2 && this.alwaysSendToken == metaData.alwaysSendToken && this.isToken1Mandatory == metaData.isToken1Mandatory && this.compressionEnabled == metaData.compressionEnabled && Double.compare(this.httpPost, metaData.httpPost) == 0 && this.periodicMetaDataEnabled == metaData.periodicMetaDataEnabled && this.periodicMetaDataIntervalInMinutes == metaData.periodicMetaDataIntervalInMinutes && this.periodicInfoEventEnabled == metaData.periodicInfoEventEnabled && this.inAppBrowser == metaData.inAppBrowser && this.SupportIABViewability == metaData.SupportIABViewability && this.IABDisplayImpressionDelayInSeconds == metaData.IABDisplayImpressionDelayInSeconds && this.IABVideoImpressionDelayInSeconds == metaData.IABVideoImpressionDelayInSeconds && this.notVisibleBannerReloadInterval == metaData.notVisibleBannerReloadInterval && this.dns == metaData.dns && this.adsPreCachingEnabled == metaData.adsPreCachingEnabled && this.stopAutoLoadAmount == metaData.stopAutoLoadAmount && this.stopAutoLoadPreCacheAmount == metaData.stopAutoLoadPreCacheAmount && this.trueNetEnabled == metaData.trueNetEnabled && this.webViewSecured == metaData.webViewSecured && this.omSdkEnabled == metaData.omSdkEnabled && this.omSdkTimeout == metaData.omSdkTimeout && this.chromeCustomeTabsInternal == metaData.chromeCustomeTabsInternal && this.chromeCustomeTabsExternal == metaData.chromeCustomeTabsExternal && this.closeAdAfterClick == metaData.closeAdAfterClick && this.disableSendAdvertisingId == metaData.disableSendAdvertisingId && Double.compare(this.flh, metaData.flh) == 0 && vi.a((Object) this.SimpleToken, (Object) metaData.SimpleToken) && vi.a((Object) this.consentDetails, (Object) metaData.consentDetails) && vi.a((Object) this.calcProd, (Object) metaData.calcProd) && vi.a(this.metaDataHosts, metaData.metaDataHosts) && vi.a((Object) this.adPlatformHostSecured, (Object) metaData.adPlatformHostSecured) && vi.a((Object) this.trackDownloadHost, (Object) metaData.trackDownloadHost) && vi.a((Object) this.vastRecorderHost, (Object) metaData.vastRecorderHost) && vi.a((Object) this.adPlatformBannerHostSecured, (Object) metaData.adPlatformBannerHostSecured) && vi.a((Object) this.adPlatformOverlayHostSecured, (Object) metaData.adPlatformOverlayHostSecured) && vi.a((Object) this.adPlatformNativeHostSecured, (Object) metaData.adPlatformNativeHostSecured) && vi.a((Object) this.profileId, (Object) metaData.profileId) && vi.a(this.installersList, metaData.installersList) && vi.a(this.preInstalledPackages, metaData.preInstalledPackages) && Arrays.equals(this.periodicEventIntMin, metaData.periodicEventIntMin) && Arrays.equals(this.periodicForegroundEventSec, metaData.periodicForegroundEventSec) && vi.a((Object) this.sensorsConfig, (Object) metaData.sensorsConfig) && vi.a((Object) this.btConfig, (Object) metaData.btConfig) && vi.a((Object) this.external, (Object) metaData.external) && vi.a((Object) this.impressionURL, (Object) metaData.impressionURL) && vi.a((Object) this.adClickURL, (Object) metaData.adClickURL) && vi.a((Object) this.assetsBaseUrlSecured, (Object) metaData.assetsBaseUrlSecured) && vi.a((Object) this.httpClientConfig, (Object) metaData.httpClientConfig) && vi.a((Object) this.analytics, (Object) metaData.analytics) && vi.a((Object) this.metadataUpdateVersion, (Object) metaData.metadataUpdateVersion) && vi.a((Object) this.adLoadWaitForMetadata, (Object) metaData.adLoadWaitForMetadata) && vi.a((Object) this.networkTests, (Object) metaData.networkTests) && vi.a((Object) this.triggeredLinks, (Object) metaData.triggeredLinks) && vi.a((Object) this.rsc, (Object) metaData.rsc) && vi.a((Object) this.rcd, (Object) metaData.rcd) && vi.a((Object) this.staleDc, (Object) metaData.staleDc) && vi.a((Object) this.motion, (Object) metaData.motion) && vi.a((Object) this.sensorsData, (Object) metaData.sensorsData) && vi.a((Object) this.air, (Object) metaData.air) && vi.a((Object) this.telephony, (Object) metaData.telephony) && vi.a((Object) this.anrConfig, (Object) metaData.anrConfig) && vi.a((Object) this.location, (Object) metaData.location) && vi.a((Object) this.impressionsTracking, (Object) metaData.impressionsTracking) && vi.a((Object) this.connectivity, (Object) metaData.connectivity) && vi.a((Object) this.adDebugger, (Object) metaData.adDebugger) && vi.a((Object) this.webViewFactory, (Object) metaData.webViewFactory) && vi.a((Object) this.appSession, (Object) metaData.appSession) && vi.a((Object) this.topics, (Object) metaData.topics) && vi.a((Object) this.mraid, (Object) metaData.mraid) && vi.a((Object) this.eventTracerMetadata, (Object) metaData.eventTracerMetadata) && vi.a((Object) this.lastVersion, (Object) metaData.lastVersion)) {
                return true;
            }
        }
        return false;
    }

    public final String f() {
        String str = this.adPlatformHostSecured;
        return str != null ? str : f64137h;
    }

    public final boolean f0() {
        return this.adsPreCachingEnabled;
    }

    public final AdvertisingIdResolverMetadata g() {
        return this.air;
    }

    public final boolean g0() {
        return this.alwaysSendToken;
    }

    public final AnalyticsConfig h() {
        return this.analytics;
    }

    public final boolean h0() {
        return this.compressionEnabled;
    }

    public final int hashCode() {
        Object[] objArr = {this.SimpleToken, this.consentDetails, this.calcProd, this.metaDataHosts, this.adPlatformHostSecured, this.trackDownloadHost, this.vastRecorderHost, this.adPlatformBannerHostSecured, this.adPlatformOverlayHostSecured, this.adPlatformNativeHostSecured, Integer.valueOf(this.sessionMaxBackgroundTime), this.profileId, this.installersList, this.preInstalledPackages, Boolean.valueOf(this.simpleToken2), Boolean.valueOf(this.alwaysSendToken), Boolean.valueOf(this.isToken1Mandatory), Boolean.valueOf(this.compressionEnabled), Double.valueOf(this.httpPost), Boolean.valueOf(this.periodicMetaDataEnabled), Integer.valueOf(this.periodicMetaDataIntervalInMinutes), Boolean.valueOf(this.periodicInfoEventEnabled), this.periodicEventIntMin, this.periodicForegroundEventSec, Boolean.valueOf(this.inAppBrowser), Boolean.valueOf(this.SupportIABViewability), Long.valueOf(this.IABDisplayImpressionDelayInSeconds), Long.valueOf(this.IABVideoImpressionDelayInSeconds), this.sensorsConfig, this.btConfig, this.external, this.impressionURL, this.adClickURL, this.assetsBaseUrlSecured, this.httpClientConfig, Integer.valueOf(this.notVisibleBannerReloadInterval), this.analytics, this.metadataUpdateVersion, Boolean.valueOf(this.dns), Boolean.valueOf(this.adsPreCachingEnabled), Integer.valueOf(this.stopAutoLoadAmount), Integer.valueOf(this.stopAutoLoadPreCacheAmount), Boolean.valueOf(this.trueNetEnabled), Boolean.valueOf(this.webViewSecured), Boolean.valueOf(this.omSdkEnabled), Long.valueOf(this.omSdkTimeout), Boolean.valueOf(this.chromeCustomeTabsInternal), Boolean.valueOf(this.chromeCustomeTabsExternal), Boolean.valueOf(this.closeAdAfterClick), Boolean.valueOf(this.disableSendAdvertisingId), this.adLoadWaitForMetadata, Double.valueOf(this.flh), this.networkTests, this.triggeredLinks, this.rsc, this.rcd, this.staleDc, this.motion, this.sensorsData, this.air, this.telephony, this.anrConfig, this.location, this.impressionsTracking, this.connectivity, this.adDebugger, this.webViewFactory, this.appSession, this.topics, this.mraid, this.eventTracerMetadata, this.lastVersion};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public final ANRRemoteConfig i() {
        return this.anrConfig;
    }

    public final boolean i0() {
        WeakHashMap weakHashMap = vi.f65408a;
        return this.inAppBrowser;
    }

    public final AppSessionConfig j() {
        return this.appSession;
    }

    public final boolean j0() {
        return this.omSdkEnabled;
    }

    public final String k() {
        String str = this.assetsBaseUrlSecured;
        return str != null ? str : "";
    }

    public final boolean k0() {
        return this.periodicForegroundEventSec != null;
    }

    public final BluetoothConfig l() {
        return this.btConfig;
    }

    public final boolean l0() {
        return this.periodicInfoEventEnabled;
    }

    public final String m() {
        return this.calcProd;
    }

    public final boolean m0() {
        return this.periodicMetaDataEnabled;
    }

    public final boolean n() {
        return this.chromeCustomeTabsExternal;
    }

    public final boolean n0() {
        return this.f64143b;
    }

    public final boolean o() {
        return this.chromeCustomeTabsInternal;
    }

    public final boolean o0() {
        return this.SupportIABViewability;
    }

    public final boolean p() {
        return this.closeAdAfterClick;
    }

    public final boolean p0() {
        return this.isToken1Mandatory;
    }

    public final ConnectivityHelperMetadata q() {
        return this.connectivity;
    }

    public final void q0() {
        this.f64143b = true;
    }

    public final ConsentConfig r() {
        return this.consentDetails;
    }

    public final boolean s() {
        return this.disableSendAdvertisingId;
    }

    public final EventTracerMetadata t() {
        return this.eventTracerMetadata;
    }

    public final ExternalConfig u() {
        return this.external;
    }

    public final ExternalAdConfig v() {
        ExternalConfig externalConfig = this.external;
        if (externalConfig != null) {
            return externalConfig.getGoogleads();
        }
        return null;
    }

    public final String w() {
        int iIndexOf;
        String str = f64140k.adPlatformHostSecured;
        if (str == null) {
            str = f64137h;
        }
        String str2 = (Build.VERSION.SDK_INT > 26 || this.webViewSecured) ? "https" : "http";
        if (str.startsWith(str2.concat("://")) || (iIndexOf = str.indexOf(58)) == -1) {
            return str;
        }
        return str2 + str.substring(iIndexOf);
    }

    public final HttpClientConfig x() {
        return this.httpClientConfig;
    }

    public final double y() {
        return this.httpPost;
    }

    public final long z() {
        return this.IABDisplayImpressionDelayInSeconds;
    }

    public final boolean b() {
        return !this.dns;
    }

    public static void a(Context context, MetaData metaData, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10) {
        ArrayList<lc> arrayList;
        WeakHashMap weakHashMap = vi.f65408a;
        synchronized (f64133d) {
            try {
                arrayList = new ArrayList(f64140k.f64144c);
                f64140k.f64144c.clear();
                metaData.f64144c = f64140k.f64144c;
                metaData.a();
                metaData.metadataUpdateVersion = "5.2.4";
                g7.b(context, "StartappMetadata", metaData);
                metaData.f64142a = false;
                metaData.f64143b = true;
                if (!vi.a((Object) f64140k, (Object) metaData)) {
                    z10 = true;
                }
                f64140k = metaData;
                if (vi.c(context)) {
                    try {
                        vf vfVar = (vf) a.a(context).G.a();
                        int i10 = vfVar.getInt("totalSessions", 0);
                        uf ufVarEdit = vfVar.edit();
                        int i11 = i10 + 1;
                        ufVarEdit.a("totalSessions", Integer.valueOf(i11));
                        ufVarEdit.f65346a.putInt("totalSessions", i11);
                        ufVarEdit.apply();
                    } catch (Throwable th2) {
                        g9.a(th2);
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
        boolean z11 = Math.random() < f64140k.flh;
        Handler handler = z11 ? new Handler(Looper.getMainLooper()) : null;
        for (lc lcVar : arrayList) {
            if (z11) {
                handler.post(new ic(lcVar, metaDataRequest$RequestReason, z10));
            } else {
                lcVar.a(metaDataRequest$RequestReason, z10);
            }
        }
    }

    public final String c() {
        return this.adClickURL;
    }

    public static void a(MetaDataRequest$RequestReason metaDataRequest$RequestReason) {
        ArrayList arrayList;
        synchronized (f64133d) {
            arrayList = new ArrayList(f64140k.f64144c);
            f64140k.f64144c.clear();
            f64140k.f64142a = false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((lc) it.next()).a();
        }
    }

    public final void a(Context context, AdPreferences adPreferences, MetaDataRequest$RequestReason metaDataRequest$RequestReason, boolean z10, b bVar, boolean z11) {
        if (context == null) {
            if (bVar != null) {
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            return;
        }
        if (!z10 && bVar != null) {
            bVar.a(metaDataRequest$RequestReason, false);
        }
        synchronized (f64133d) {
            if (f64140k.f64143b && !z11) {
                if (!z10 || bVar == null) {
                    return;
                }
                bVar.a(metaDataRequest$RequestReason, false);
                return;
            }
            if (!f64140k.f64142a || z11) {
                this.f64142a = true;
                this.f64143b = false;
                lb lbVar = a.a(context).K;
                final AtomicInteger atomicInteger = f64141l;
                Objects.requireNonNull(atomicInteger);
                c8 c8Var = new c8(context, lbVar, adPreferences, metaDataRequest$RequestReason, new k7() { // from class: x5.a
                    @Override // com.startapp.sdk.internal.k7
                    public final Object a() {
                        return Integer.valueOf(atomicInteger.get());
                    }
                }, atomicInteger.incrementAndGet());
                if (bVar != null) {
                    ((z6) ((y6) lbVar.a())).a(bVar, c8Var);
                }
                c8Var.b();
            }
            if (z10 && bVar != null) {
                f64140k.a(bVar);
            }
        }
    }

    public final void a(lc lcVar) {
        synchronized (f64133d) {
            this.f64144c.add(lcVar);
        }
    }

    public final int a(Context context) {
        return a(context, this.periodicForegroundEventSec);
    }

    private static int a(Context context, int[] iArr) {
        if (iArr == null || iArr.length < 3) {
            iArr = f64138i;
        }
        if (q0.a(context, "android.permission.ACCESS_FINE_LOCATION")) {
            int i10 = iArr[0];
            return i10 <= 0 ? f64138i[0] : i10;
        }
        if (q0.a(context, "android.permission.ACCESS_COARSE_LOCATION")) {
            int i11 = iArr[1];
            return i11 <= 0 ? f64138i[1] : i11;
        }
        return iArr[2];
    }

    public final String a(AdPreferences.Placement placement) {
        int i10 = jc.f64757a[placement.ordinal()];
        if (i10 == 1) {
            String str = this.adPlatformBannerHostSecured;
            if (str != null) {
                return str;
            }
            String str2 = this.adPlatformHostSecured;
            return str2 != null ? str2 : f64137h;
        }
        if (i10 == 2) {
            String str3 = this.adPlatformOverlayHostSecured;
            if (str3 != null) {
                return str3;
            }
            String str4 = this.adPlatformHostSecured;
            return str4 != null ? str4 : f64137h;
        }
        if (i10 != 3) {
            String str5 = this.adPlatformHostSecured;
            return str5 != null ? str5 : f64137h;
        }
        String str6 = this.adPlatformNativeHostSecured;
        if (str6 != null) {
            return str6;
        }
        String str7 = this.adPlatformHostSecured;
        return str7 != null ? str7 : f64137h;
    }

    public final void a() {
        ArrayList arrayList;
        String str = this.adPlatformHostSecured;
        String strReplace = f64137h;
        if (str != null) {
            strReplace = str.replace("%AdPlatformProtocol%", "1.5");
        }
        this.adPlatformHostSecured = strReplace;
        List<String> list = this.metaDataHosts;
        if (list != null) {
            arrayList = new ArrayList(list.size());
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                String next = it.next();
                String strReplace2 = next != null ? next.replace("%AdPlatformProtocol%", "1.5") : null;
                if (strReplace2 != null) {
                    arrayList.add(strReplace2);
                }
            }
        } else {
            arrayList = null;
        }
        this.metaDataHosts = arrayList;
        String str2 = this.adPlatformBannerHostSecured;
        this.adPlatformBannerHostSecured = str2 != null ? str2.replace("%AdPlatformProtocol%", "1.5") : null;
        String str3 = this.adPlatformOverlayHostSecured;
        this.adPlatformOverlayHostSecured = str3 != null ? str3.replace("%AdPlatformProtocol%", "1.5") : null;
        String str4 = this.adPlatformNativeHostSecured;
        this.adPlatformNativeHostSecured = str4 != null ? str4.replace("%AdPlatformProtocol%", "1.5") : null;
    }

    public static void a(Context context, String str) {
        if (str == null || str.isEmpty()) {
            return;
        }
        if (!g2.a(context, "close_button")) {
            WeakHashMap weakHashMap = vi.f65408a;
            new k2(context, str.concat("close_button.png"), new kc(context, "close_button"), 0).a();
        }
        WeakHashMap weakHashMap2 = vi.f65408a;
        for (String str2 : i0.f64672l) {
            if (!g2.a(context, str2)) {
                new k2(context, str + str2 + ".png", new kc(context, str2), 0).a();
            }
        }
        WeakHashMap weakHashMap3 = vi.f65408a;
        for (String str3 : i0.f64673m) {
            if (!g2.a(context, str3)) {
                new k2(context, str + str3 + ".png", new kc(context, str3), 0).a();
            }
        }
        if (g2.a(context, "logo")) {
            return;
        }
        new k2(context, str.concat("logo.png"), new kc(context, "logo"), 0).a();
    }
}
