package com.unity3d.ads.core.data.datasource;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.os.SystemClock;
import android.os.ext.SdkExtensions;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.webkit.WebSettings;
import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.ironsource.C4240b4;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.core.data.model.StorageType;
import com.unity3d.ads.core.utils.GetMemoryValueFromStringKt;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.device.AdvertisingId;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.device.OpenAdvertisingId;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.preferences.AndroidPreferences;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.MadeWithUnityDetector;
import com.unity3d.services.core.properties.SdkProperties;
import gatewayprotocol.v1.StaticDeviceInfoKt;
import gatewayprotocol.v1.StaticDeviceInfoOuterClass;
import io.appmetrica.analytics.BuildConfig;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import javax.security.auth.x500.X500Principal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.c;
import uf.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 n2\u00020\u0001:\u0001nB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\u001f\u0010\u0017\u001a\u00020\u00162\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0016H\u0016J\u0006\u0010\u001e\u001a\u00020\u0010J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0010H\u0016J\b\u0010\"\u001a\u00020#H\u0002J\b\u0010$\u001a\u00020\u0010H\u0002J\u0013\u0010%\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\u0006\u0010'\u001a\u00020\u0010J\u0006\u0010(\u001a\u00020\u0010J\u0006\u0010)\u001a\u00020\u0010J\b\u0010*\u001a\u0004\u0018\u00010\u0010J\b\u0010+\u001a\u0004\u0018\u00010\u0010J\b\u0010,\u001a\u00020#H\u0002J\b\u0010-\u001a\u00020\u0010H\u0002J\b\u0010.\u001a\u00020\u0010H\u0003J\u0006\u0010/\u001a\u00020\u0010J\u0006\u00100\u001a\u00020\u0010J\b\u00101\u001a\u000202H\u0002J\b\u00103\u001a\u00020 H\u0002J\u0012\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u000207H\u0002J\b\u00108\u001a\u00020\u0010H\u0002J\u0013\u00109\u001a\u0004\u0018\u00010\u0010H\u0082@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010:\u001a\u00020\u0010H\u0002J\u0006\u0010;\u001a\u00020\u0010J\u0006\u0010<\u001a\u00020\u0010J\u0011\u0010=\u001a\u00020\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010>\u001a\u00020\u0010H\u0003J\b\u0010?\u001a\u00020\u0010H\u0016J\u0010\u0010@\u001a\u00020#2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020\u0010H\u0016J\u000e\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00100EH\u0003J\u000e\u0010F\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\b\u0010G\u001a\u00020\u0010H\u0002J\b\u0010H\u001a\u00020\u0010H\u0016J\b\u0010I\u001a\u00020 H\u0002J\b\u0010J\u001a\u00020\u0010H\u0002J\u0006\u0010K\u001a\u00020\u0010J\b\u0010L\u001a\u00020 H\u0002J\b\u0010M\u001a\u00020 H\u0002J\b\u0010N\u001a\u00020 H\u0002J\b\u0010O\u001a\u00020 H\u0002J\f\u0010P\u001a\b\u0012\u0004\u0012\u00020Q0\u0019J\b\u0010R\u001a\u00020\u0010H\u0002J\u001e\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00100\u00192\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019H\u0002J\f\u0010T\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019J\b\u0010U\u001a\u00020#H\u0016J\u0006\u0010V\u001a\u00020#J\u0010\u0010W\u001a\u00020#2\b\u0010X\u001a\u0004\u0018\u000105J\u0013\u0010Y\u001a\u0004\u0018\u00010\u0010H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010&J\b\u0010Z\u001a\u00020 H\u0002J\b\u0010[\u001a\u00020\u0010H\u0002J\b\u0010\\\u001a\u00020\u0010H\u0002J\u0006\u0010]\u001a\u00020^J\u0006\u0010_\u001a\u00020^J\b\u0010`\u001a\u00020^H\u0002J\u001a\u0010a\u001a\u00020^2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010e\u001a\u00020^2\u0006\u0010b\u001a\u00020cH\u0003J\u0006\u0010f\u001a\u00020^J\b\u0010g\u001a\u00020^H\u0002J\u001a\u0010h\u001a\u00020^2\u0006\u0010b\u001a\u00020c2\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002J\u0010\u0010i\u001a\u00020^2\u0006\u0010b\u001a\u00020cH\u0003J\b\u0010j\u001a\u00020^H\u0002J\u0010\u0010k\u001a\u00020^2\u0006\u0010l\u001a\u00020\u0010H\u0002J\u0018\u0010m\u001a\b\u0012\u0004\u0012\u00020c0\u00192\b\u0010d\u001a\u0004\u0018\u00010\u0010H\u0002R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006o"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/AndroidStaticDeviceInfoDataSource;", "Lcom/unity3d/ads/core/data/datasource/StaticDeviceInfoDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "glInfoStore", "Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;", "analyticsDataSource", "Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;", "storeDataSource", "Lcom/unity3d/ads/core/data/datasource/StoreDataSource;", "unityBootConfigDataSource", "Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;", "(Landroid/content/Context;Lcom/unity3d/ads/core/data/datasource/ByteStringDataSource;Lcom/unity3d/ads/core/data/datasource/AnalyticsDataSource;Lcom/unity3d/ads/core/data/datasource/StoreDataSource;Lcom/unity3d/ads/core/data/datasource/UnityBootConfigDataSource;)V", "DEBUG_CERT", "Ljavax/security/auth/x500/X500Principal;", "analyticsUserId", "", "getAnalyticsUserId", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "staticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo;", RemoteConfigComponent.FETCH_FILE_NAME, "additionalStores", "", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchAndroidStaticDeviceInfo", "Lgatewayprotocol/v1/StaticDeviceInfoOuterClass$StaticDeviceInfo$Android;", "fetchCached", "getAdvertisingTrackingId", "getApiLevel", "", "getAppName", "getAppStartTime", "", "getAppVersion", "getAuid", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getBoard", "getBootloader", "getBrand", "getBuildId", "getBuildVersionIncremental", "getCPUCount", "getCPUModel", "getCertificateFingerprint", "getDevice", "getDisplay", "getDisplayMetricDensity", "", "getExtensionVersion", "getFileForStorageType", "Ljava/io/File;", "storageType", "Lcom/unity3d/ads/core/data/model/StorageType;", "getFingerprint", "getGPUModel", "getGameId", "getHardware", "getHost", "getIdfi", "getInstallerPackageName", "getManufacturer", "getMemoryInfo", "infoType", "Lcom/unity3d/services/core/device/Device$MemoryInfoType;", "getModel", "getNewAbiList", "Ljava/util/ArrayList;", "getOldAbiList", "getOpenAdvertisingTrackingId", "getOsVersion", "getPhoneType", "getPlatform", "getProduct", "getScreenDensity", "getScreenHeight", "getScreenLayout", "getScreenWidth", "getSensorList", "Landroid/hardware/Sensor;", "getSimOperator", "getStores", "getSupportedAbis", "getSystemBootTime", "getTotalMemory", "getTotalSpace", C4240b4.i.f42616b, "getUnityBuildGuid", "getVersionCode", "getVersionName", "getWebViewUserAgent", "hasX264Decoder", "", "hasX265Decoder", "isAppDebuggable", "isHardwareAccelerated", "codecInfo", "Landroid/media/MediaCodecInfo;", "mimeType", "isHardwareAcceleratedV29", "isLimitOpenAdTrackingEnabled", "isRooted", "isSoftwareOnly", "isSoftwareOnlyV29", "isTestMode", "searchPathForBinary", BuildConfig.SDK_DEPENDENCY, "selectAllDecodeCodecs", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidStaticDeviceInfoDataSource implements StaticDeviceInfoDataSource {

    @NotNull
    public static final String ALGORITHM_SHA1 = "SHA-1";

    @NotNull
    public static final String APP_VERSION_FAKE = "FakeVersionName";

    @NotNull
    public static final String BINARY_SU = "su";

    @NotNull
    public static final String CERTIFICATE_TYPE_X509 = "X.509";

    @NotNull
    public static final String ENVIRONMENT_VARIABLE_PATH = "PATH";

    @NotNull
    public static final String PLATFORM_ANDROID = "android";

    @NotNull
    public static final String STORE_GOOGLE = "google";

    @NotNull
    private final X500Principal DEBUG_CERT;

    @NotNull
    private final AnalyticsDataSource analyticsDataSource;

    @NotNull
    private final Context context;

    @NotNull
    private final ByteStringDataSource glInfoStore;

    @NotNull
    private StaticDeviceInfoOuterClass.StaticDeviceInfo staticDeviceInfo;

    @NotNull
    private final StoreDataSource storeDataSource;

    @NotNull
    private final UnityBootConfigDataSource unityBootConfigDataSource;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Device.MemoryInfoType.values().length];
            try {
                iArr[Device.MemoryInfoType.TOTAL_MEMORY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Device.MemoryInfoType.FREE_MEMORY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[StorageType.values().length];
            try {
                iArr2[StorageType.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[StorageType.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {101}, m = RemoteConfigComponent.FETCH_FILE_NAME)
    static final class AnonymousClass1 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.fetch(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource", f = "AndroidStaticDeviceInfoDataSource.kt", l = {500}, m = "getGPUModel")
    static final class C47661 extends d {
        int label;
        /* synthetic */ Object result;

        C47661(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidStaticDeviceInfoDataSource.this.getGPUModel(this);
        }
    }

    public AndroidStaticDeviceInfoDataSource(@NotNull Context context, @NotNull ByteStringDataSource glInfoStore, @NotNull AnalyticsDataSource analyticsDataSource, @NotNull StoreDataSource storeDataSource, @NotNull UnityBootConfigDataSource unityBootConfigDataSource) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(glInfoStore, "glInfoStore");
        Intrinsics.checkNotNullParameter(analyticsDataSource, "analyticsDataSource");
        Intrinsics.checkNotNullParameter(storeDataSource, "storeDataSource");
        Intrinsics.checkNotNullParameter(unityBootConfigDataSource, "unityBootConfigDataSource");
        this.context = context;
        this.glInfoStore = glInfoStore;
        this.analyticsDataSource = analyticsDataSource;
        this.storeDataSource = storeDataSource;
        this.unityBootConfigDataSource = unityBootConfigDataSource;
        this.DEBUG_CERT = new X500Principal("CN=Android Debug,O=Android,C=US");
        StaticDeviceInfoKt.Dsl.Companion companion = StaticDeviceInfoKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setBundleId(getAppName());
        dsl_create.setBundleVersion(getAppVersion());
        dsl_create.setAppDebuggable(isAppDebuggable());
        dsl_create.setRooted(isRooted());
        dsl_create.setOsVersion(getOsVersion());
        dsl_create.setDeviceMake(getManufacturer());
        dsl_create.setDeviceModel(getModel());
        dsl_create.setWebviewUa(getWebViewUserAgent());
        dsl_create.setScreenDensity(getScreenDensity());
        dsl_create.setScreenWidth(getScreenWidth());
        dsl_create.setScreenHeight(getScreenHeight());
        dsl_create.setScreenSize(getScreenLayout());
        dsl_create.addAllStores(dsl_create.getStores(), getStores$default(this, null, 1, null));
        dsl_create.setTotalDiskSpace(getTotalSpace(getFileForStorageType(StorageType.EXTERNAL)));
        dsl_create.setTotalRamMemory(getTotalMemory());
        dsl_create.setCpuModel(getCPUModel());
        dsl_create.setCpuCount(getCPUCount());
        dsl_create.setAndroid(fetchAndroidStaticDeviceInfo());
        dsl_create.setMadeWithUnity(MadeWithUnityDetector.isMadeWithUnity());
        this.staticDeviceInfo = dsl_create._build();
    }

    private final StaticDeviceInfoOuterClass.StaticDeviceInfo.Android fetchAndroidStaticDeviceInfo() {
        StaticDeviceInfoKt staticDeviceInfoKt = StaticDeviceInfoKt.INSTANCE;
        StaticDeviceInfoKt.AndroidKt.Dsl.Companion companion = StaticDeviceInfoKt.AndroidKt.Dsl.INSTANCE;
        StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.Builder builderNewBuilder = StaticDeviceInfoOuterClass.StaticDeviceInfo.Android.newBuilder();
        Intrinsics.checkNotNullExpressionValue(builderNewBuilder, "newBuilder()");
        StaticDeviceInfoKt.AndroidKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setApiLevel(getApiLevel());
        dsl_create.setVersionCode(getVersionCode());
        dsl_create.setAndroidFingerprint(getFingerprint());
        dsl_create.setAppInstaller(getInstallerPackageName());
        dsl_create.setApkDeveloperSigningCertificateHash(getCertificateFingerprint());
        dsl_create.setBuildBoard(getBoard());
        dsl_create.setBuildBrand(getBrand());
        dsl_create.setBuildDevice(getDevice());
        dsl_create.setBuildDisplay(getDisplay());
        dsl_create.setBuildFingerprint(getFingerprint());
        dsl_create.setBuildHardware(getHardware());
        dsl_create.setBuildHost(getHost());
        dsl_create.setBuildBootloader(getBootloader());
        dsl_create.setBuildProduct(getProduct());
        dsl_create.setExtensionVersion(getExtensionVersion());
        String buildId = getBuildId();
        if (buildId != null) {
            dsl_create.setBuildId(buildId);
        }
        dsl_create.setPhoneType(getPhoneType());
        dsl_create.setSimOperator(getSimOperator());
        return dsl_create._build();
    }

    private final int getApiLevel() {
        return Build.VERSION.SDK_INT;
    }

    private final long getAppStartTime() {
        return SdkProperties.getInitializationTimeEpoch();
    }

    private final String getAppVersion() {
        String packageName = this.context.getPackageName();
        PackageManager packageManager = this.context.getPackageManager();
        try {
            String str = packageManager.getPackageInfo(packageName, 0).versionName == null ? APP_VERSION_FAKE : packageManager.getPackageInfo(packageName, 0).versionName;
            Intrinsics.checkNotNullExpressionValue(str, "{\n            if (pm.get…e\n            }\n        }");
            return str;
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Error getting package info", e10);
            return "";
        }
    }

    private final long getCPUCount() {
        return Runtime.getRuntime().availableProcessors();
    }

    private final String getCPUModel() {
        if (Build.VERSION.SDK_INT >= 31) {
            String str = Build.SOC_MODEL;
            Intrinsics.checkNotNullExpressionValue(str, "{\n            Build.SOC_MODEL\n        }");
            return str;
        }
        try {
            return (String) CollectionsKt.last(i.j(new File("/proc/cpuinfo"), null, 1, null));
        } catch (FileNotFoundException e10) {
            DeviceLog.exception("Error reading CPU model", e10);
            return "";
        }
    }

    @SuppressLint({"PackageManagerGetSignatures"})
    private final String getCertificateFingerprint() {
        try {
            Signature[] signatureArr = this.context.getPackageManager().getPackageInfo(this.context.getPackageName(), 64).signatures;
            if (signatureArr == null) {
                return "";
            }
            if (signatureArr.length == 0) {
                return "";
            }
            Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signatureArr[0].toByteArray()));
            Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
            String hexString = Utilities.toHexString(MessageDigest.getInstance(ALGORITHM_SHA1).digest(((X509Certificate) certificateGenerateCertificate).getEncoded()));
            Intrinsics.checkNotNullExpressionValue(hexString, "toHexString(publicKey)");
            return hexString;
        } catch (Exception e10) {
            DeviceLog.exception("Exception when signing certificate fingerprint", e10);
            return "";
        }
    }

    private final float getDisplayMetricDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return 0.0f;
        }
        return displayMetrics.density;
    }

    private final int getExtensionVersion() {
        if (Build.VERSION.SDK_INT >= 30) {
            return SdkExtensions.getExtensionVersion(30);
        }
        return -1;
    }

    private final File getFileForStorageType(StorageType storageType) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[storageType.ordinal()];
        if (i10 == 1) {
            return this.context.getCacheDir();
        }
        if (i10 == 2) {
            return this.context.getExternalCacheDir();
        }
        DeviceLog.error("Unhandled storagetype: " + storageType);
        return null;
    }

    private final String getFingerprint() {
        String str = Build.FINGERPRINT;
        return str == null ? "" : str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getGPUModel(kotlin.coroutines.Continuation r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C47661
            if (r0 == 0) goto L13
            r0 = r5
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.C47661) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$getGPUModel$1
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            kotlin.d.b(r5)
            com.unity3d.ads.core.data.datasource.ByteStringDataSource r5 = r4.glInfoStore
            r0.label = r3
            java.lang.Object r5 = r5.get(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            com.unity3d.ads.datastore.ByteStringStoreOuterClass$ByteStringStore r5 = (com.unity3d.ads.datastore.ByteStringStoreOuterClass.ByteStringStore) r5
            com.google.protobuf.ByteString r5 = r5.getData()
            java.nio.charset.Charset r0 = kotlin.text.Charsets.UTF_8
            java.lang.String r5 = r5.toString(r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.getGPUModel(kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final String getGameId() {
        String gameId = ClientProperties.getGameId();
        return gameId == null ? "" : gameId;
    }

    private final String getInstallerPackageName() {
        String installerPackageName = this.context.getPackageManager().getInstallerPackageName(this.context.getPackageName());
        return installerPackageName == null ? "" : installerPackageName;
    }

    private final long getMemoryInfo(Device.MemoryInfoType infoType) throws IOException {
        int i10;
        String line;
        FileNotFoundException e10;
        int i11 = WhenMappings.$EnumSwitchMapping$0[infoType.ordinal()];
        if (i11 != 1) {
            i10 = 2;
            if (i11 != 2) {
                throw new m();
            }
        } else {
            i10 = 1;
        }
        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile(AndroidDynamicDeviceInfoDataSource.DIRECTORY_MEM_INFO, "r");
            line = null;
            for (int i12 = 0; i12 < i10; i12++) {
                try {
                    try {
                        line = randomAccessFile.readLine();
                    } finally {
                    }
                } catch (FileNotFoundException e11) {
                    e10 = e11;
                    DeviceLog.exception("Error reading memory info", e10);
                    return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
                }
            }
            Unit unit = Unit.f93236a;
            c.a(randomAccessFile, null);
        } catch (FileNotFoundException e12) {
            line = null;
            e10 = e12;
        }
        return GetMemoryValueFromStringKt.getMemoryValueFromString(line);
    }

    @TargetApi(21)
    private final ArrayList<String> getNewAbiList() {
        ArrayList<String> arrayList = new ArrayList<>();
        String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
        Intrinsics.checkNotNullExpressionValue(SUPPORTED_ABIS, "SUPPORTED_ABIS");
        arrayList.addAll(CollectionsKt.listOf(Arrays.copyOf(SUPPORTED_ABIS, SUPPORTED_ABIS.length)));
        return arrayList;
    }

    private final List<String> getOldAbiList() {
        ArrayList arrayList = new ArrayList();
        String CPU_ABI = Build.CPU_ABI;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI, "CPU_ABI");
        arrayList.add(CPU_ABI);
        String CPU_ABI2 = Build.CPU_ABI2;
        Intrinsics.checkNotNullExpressionValue(CPU_ABI2, "CPU_ABI2");
        arrayList.add(CPU_ABI2);
        return arrayList;
    }

    private final String getOpenAdvertisingTrackingId() {
        String openAdvertisingTrackingId = OpenAdvertisingId.getOpenAdvertisingTrackingId();
        return openAdvertisingTrackingId == null ? "" : openAdvertisingTrackingId;
    }

    private final int getPhoneType() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        return ((TelephonyManager) systemService).getPhoneType();
    }

    private final String getPlatform() {
        return "android";
    }

    private final int getScreenDensity() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.densityDpi;
    }

    private final int getScreenHeight() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.heightPixels;
    }

    private final int getScreenLayout() {
        return this.context.getResources().getConfiguration().screenLayout;
    }

    private final int getScreenWidth() {
        DisplayMetrics displayMetrics;
        Resources resources = this.context.getResources();
        if (resources == null || (displayMetrics = resources.getDisplayMetrics()) == null) {
            return -1;
        }
        return displayMetrics.widthPixels;
    }

    private final String getSimOperator() {
        Object systemService = this.context.getSystemService("phone");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.telephony.TelephonyManager");
        String simOperator = ((TelephonyManager) systemService).getSimOperator();
        Intrinsics.checkNotNullExpressionValue(simOperator, "telephonyManager.simOperator");
        return simOperator;
    }

    private final List<String> getStores(List<String> additionalStores) {
        return this.storeDataSource.fetchStores(additionalStores);
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ List getStores$default(AndroidStaticDeviceInfoDataSource androidStaticDeviceInfoDataSource, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            list = CollectionsKt.emptyList();
        }
        return androidStaticDeviceInfoDataSource.getStores(list);
    }

    private final int getVersionCode() {
        return 41604;
    }

    private final String getVersionName() {
        return "4.16.4";
    }

    private final String getWebViewUserAgent() {
        try {
            String defaultUserAgent = WebSettings.getDefaultUserAgent(this.context);
            Intrinsics.checkNotNullExpressionValue(defaultUserAgent, "{\n        WebSettings.ge…tUserAgent(context)\n    }");
            return defaultUserAgent;
        } catch (Exception e10) {
            DeviceLog.exception("Exception getting webview user agent", e10);
            return "";
        }
    }

    private final boolean isAppDebuggable() {
        boolean zAreEqual;
        PackageManager packageManager = this.context.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "context.packageManager");
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        boolean z10 = true;
        try {
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 0);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "pm.getApplicationInfo(pkgName, 0)");
            int i10 = applicationInfo.flags & 2;
            applicationInfo.flags = i10;
            if (i10 != 0) {
                zAreEqual = true;
                z10 = false;
            } else {
                z10 = false;
                zAreEqual = false;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            DeviceLog.exception("Could not find name", e10);
            zAreEqual = false;
        }
        if (z10) {
            try {
                Signature[] signatures = packageManager.getPackageInfo(packageName, 64).signatures;
                Intrinsics.checkNotNullExpressionValue(signatures, "signatures");
                for (Signature signature : signatures) {
                    Certificate certificateGenerateCertificate = CertificateFactory.getInstance(CERTIFICATE_TYPE_X509).generateCertificate(new ByteArrayInputStream(signature.toByteArray()));
                    Intrinsics.checkNotNull(certificateGenerateCertificate, "null cannot be cast to non-null type java.security.cert.X509Certificate");
                    zAreEqual = Intrinsics.areEqual(((X509Certificate) certificateGenerateCertificate).getSubjectX500Principal(), this.DEBUG_CERT);
                    if (zAreEqual) {
                        break;
                    }
                }
            } catch (PackageManager.NameNotFoundException e11) {
                DeviceLog.exception("Could not find name", e11);
            } catch (CertificateException e12) {
                DeviceLog.exception("Certificate exception", e12);
            }
        }
        return zAreEqual;
    }

    private final boolean isHardwareAccelerated(MediaCodecInfo codecInfo, String mimeType) {
        return getApiLevel() >= 29 ? isHardwareAcceleratedV29(codecInfo) : !isSoftwareOnly(codecInfo, mimeType);
    }

    @TargetApi(29)
    private final boolean isHardwareAcceleratedV29(MediaCodecInfo codecInfo) {
        return codecInfo.isHardwareAccelerated();
    }

    private final boolean isRooted() {
        try {
            return searchPathForBinary("su");
        } catch (Exception e10) {
            DeviceLog.exception("Rooted check failed", e10);
            return false;
        }
    }

    private final boolean isSoftwareOnly(MediaCodecInfo codecInfo, String mimeType) {
        if (getApiLevel() >= 29) {
            return isSoftwareOnlyV29(codecInfo);
        }
        String name = codecInfo.getName();
        Intrinsics.checkNotNullExpressionValue(name, "codecInfo.name");
        Locale ROOT = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(ROOT, "ROOT");
        String lowerCase = name.toLowerCase(ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase(locale)");
        if (StringsKt.a0(lowerCase, "arc.", false, 2, null)) {
            return false;
        }
        if (StringsKt.a0(lowerCase, "omx.google.", false, 2, null) || StringsKt.a0(lowerCase, "omx.ffmpeg.", false, 2, null)) {
            return true;
        }
        if ((StringsKt.a0(lowerCase, "omx.sec.", false, 2, null) && StringsKt.g0(lowerCase, ".sw.", false, 2, null)) || Intrinsics.areEqual(lowerCase, "omx.qcom.video.decoder.hevcswvdec") || StringsKt.a0(lowerCase, "c2.android.", false, 2, null) || StringsKt.a0(lowerCase, "c2.google.", false, 2, null)) {
            return true;
        }
        return (StringsKt.a0(lowerCase, "omx.", false, 2, null) || StringsKt.a0(lowerCase, "c2.", false, 2, null)) ? false : true;
    }

    @TargetApi(29)
    private final boolean isSoftwareOnlyV29(MediaCodecInfo codecInfo) {
        return codecInfo.isSoftwareOnly();
    }

    private final boolean isTestMode() {
        return SdkProperties.isTestMode();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean searchPathForBinary(java.lang.String r10) {
        /*
            r9 = this;
            java.lang.String r0 = "PATH"
            java.lang.String r0 = java.lang.System.getenv(r0)
            r1 = 0
            if (r0 == 0) goto L8a
            kotlin.text.Regex r2 = new kotlin.text.Regex
            java.lang.String r3 = ":"
            r2.<init>(r3)
            java.util.List r0 = r2.j(r0, r1)
            if (r0 == 0) goto L8a
            boolean r2 = r0.isEmpty()
            r3 = 1
            if (r2 != 0) goto L44
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L25:
            boolean r4 = r2.hasPrevious()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r2.previous()
            java.lang.String r4 = (java.lang.String) r4
            int r4 = r4.length()
            if (r4 != 0) goto L38
            goto L25
        L38:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            int r2 = r2.nextIndex()
            int r2 = r2 + r3
            java.util.List r0 = kotlin.collections.CollectionsKt.take(r0, r2)
            goto L48
        L44:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L48:
            if (r0 == 0) goto L8a
            java.util.Collection r0 = (java.util.Collection) r0
            java.lang.String[] r2 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r2)
            java.lang.String[] r0 = (java.lang.String[]) r0
            if (r0 == 0) goto L8a
            int r2 = r0.length
            r4 = r1
        L58:
            if (r4 >= r2) goto L8a
            r5 = r0[r4]
            java.io.File r6 = new java.io.File
            r6.<init>(r5)
            boolean r5 = r6.exists()
            if (r5 == 0) goto L87
            boolean r5 = r6.isDirectory()
            if (r5 == 0) goto L87
            java.io.File[] r5 = r6.listFiles()
            if (r5 == 0) goto L87
            int r6 = r5.length
            r7 = r1
        L75:
            if (r7 >= r6) goto L87
            r8 = r5[r7]
            java.lang.String r8 = r8.getName()
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r10)
            if (r8 == 0) goto L84
            return r3
        L84:
            int r7 = r7 + 1
            goto L75
        L87:
            int r4 = r4 + 1
            goto L58
        L8a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.searchPathForBinary(java.lang.String):boolean");
    }

    private final List<MediaCodecInfo> selectAllDecodeCodecs(String mimeType) {
        ArrayList arrayList = new ArrayList();
        int codecCount = MediaCodecList.getCodecCount();
        for (int i10 = 0; i10 < codecCount; i10++) {
            MediaCodecInfo codecInfo = MediaCodecList.getCodecInfoAt(i10);
            if (!codecInfo.isEncoder()) {
                for (String str : codecInfo.getSupportedTypes()) {
                    if (StringsKt.N(str, mimeType, true)) {
                        Intrinsics.checkNotNullExpressionValue(codecInfo, "codecInfo");
                        if (isHardwareAccelerated(codecInfo, mimeType)) {
                            arrayList.add(codecInfo);
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object fetch(@org.jetbrains.annotations.NotNull java.util.List<java.lang.String> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1 r0 = new com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource$fetch$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            java.lang.Object r5 = r0.L$1
            java.util.List r5 = (java.util.List) r5
            java.lang.Object r0 = r0.L$0
            com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource r0 = (com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource) r0
            kotlin.d.b(r6)
            goto L5c
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.d.b(r6)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r6 = r4.staticDeviceInfo
            java.lang.String r6 = r6.getGpuModel()
            if (r6 == 0) goto L4e
            int r6 = r6.length()
            if (r6 != 0) goto L4b
            goto L4e
        L4b:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r4.staticDeviceInfo
            return r5
        L4e:
            r0.L$0 = r4
            r0.L$1 = r5
            r0.label = r3
            java.lang.Object r6 = r4.getGPUModel(r0)
            if (r6 != r1) goto L5b
            return r1
        L5b:
            r0 = r4
        L5c:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L98
            int r1 = r6.length()
            if (r1 != 0) goto L67
            goto L98
        L67:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r1 = r0.staticDeviceInfo
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl$Companion r2 = gatewayprotocol.v1.StaticDeviceInfoKt.Dsl.INSTANCE
            com.google.protobuf.GeneratedMessageLite$Builder r1 = r1.toBuilder()
            java.lang.String r3 = "this.toBuilder()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r3)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo$Builder r1 = (gatewayprotocol.v1.StaticDeviceInfoOuterClass.StaticDeviceInfo.Builder) r1
            gatewayprotocol.v1.StaticDeviceInfoKt$Dsl r1 = r2._create(r1)
            r1.setGpuModel(r6)
            com.google.protobuf.kotlin.DslList r6 = r1.getStores()
            r1.clearStores(r6)
            com.google.protobuf.kotlin.DslList r6 = r1.getStores()
            java.util.List r5 = r0.getStores(r5)
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r1.addAllStores(r6, r5)
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r1._build()
            r0.staticDeviceInfo = r5
            return r5
        L98:
            gatewayprotocol.v1.StaticDeviceInfoOuterClass$StaticDeviceInfo r5 = r0.staticDeviceInfo
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource.fetch(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    /* JADX INFO: renamed from: fetchCached, reason: from getter */
    public StaticDeviceInfoOuterClass.StaticDeviceInfo getStaticDeviceInfo() {
        return this.staticDeviceInfo;
    }

    @NotNull
    public final String getAdvertisingTrackingId() {
        String advertisingTrackingId = AdvertisingId.getAdvertisingTrackingId();
        return advertisingTrackingId == null ? "" : advertisingTrackingId;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public String getAnalyticsUserId() {
        return this.analyticsDataSource.getUserId();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getAppName() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "context.packageName");
        return packageName;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getAuid(@NotNull Continuation continuation) {
        String string = AndroidPreferences.getString("supersonic_shared_preferen", "auid");
        if (string == null) {
            return null;
        }
        return string;
    }

    @NotNull
    public final String getBoard() {
        String str = Build.BOARD;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBootloader() {
        String str = Build.BOOTLOADER;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getBrand() {
        String str = Build.BRAND;
        return str == null ? "" : str;
    }

    @Nullable
    public final String getBuildId() {
        return Build.ID;
    }

    @Nullable
    public final String getBuildVersionIncremental() {
        return Build.VERSION.INCREMENTAL;
    }

    @NotNull
    public final Context getContext() {
        return this.context;
    }

    @NotNull
    public final String getDevice() {
        String str = Build.DEVICE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getDisplay() {
        String str = Build.DISPLAY;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHardware() {
        String str = Build.HARDWARE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getHost() {
        String str = Build.HOST;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getIdfi(@NotNull Continuation continuation) {
        String string = AndroidPreferences.getString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI);
        if (string == null) {
            string = null;
        }
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        AndroidPreferences.setString("unityads-installinfo", UnityAdsConstants.Preferences.PREF_KEY_IDFI, string2);
        return string2;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getManufacturer() {
        String str = Build.MANUFACTURER;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getModel() {
        String str = Build.MODEL;
        return str == null ? "" : str;
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @NotNull
    public String getOsVersion() {
        String str = Build.VERSION.RELEASE;
        return str == null ? "" : str;
    }

    @NotNull
    public final String getProduct() {
        String str = Build.PRODUCT;
        return str == null ? "" : str;
    }

    @NotNull
    public final List<Sensor> getSensorList() {
        Object systemService = this.context.getSystemService("sensor");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
        List<Sensor> sensorList = ((SensorManager) systemService).getSensorList(-1);
        Intrinsics.checkNotNullExpressionValue(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
        return sensorList;
    }

    @NotNull
    public final List<String> getSupportedAbis() {
        return getApiLevel() < 21 ? getOldAbiList() : getNewAbiList();
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    public long getSystemBootTime() {
        return (System.currentTimeMillis() - SystemClock.elapsedRealtime()) / ((long) 1000);
    }

    public final long getTotalMemory() {
        return getMemoryInfo(Device.MemoryInfoType.TOTAL_MEMORY);
    }

    public final long getTotalSpace(@Nullable File file) {
        if (file == null || !file.exists()) {
            return -1L;
        }
        return zf.a.d(file.getTotalSpace() / ((long) 1024));
    }

    @Override // com.unity3d.ads.core.data.datasource.StaticDeviceInfoDataSource
    @Nullable
    public Object getUnityBuildGuid(@NotNull Continuation continuation) {
        return this.unityBootConfigDataSource.getValue("build-guid");
    }

    public final boolean hasX264Decoder() {
        return !selectAllDecodeCodecs("video/avc").isEmpty();
    }

    public final boolean hasX265Decoder() {
        return !selectAllDecodeCodecs("video/hevc").isEmpty();
    }

    public final boolean isLimitOpenAdTrackingEnabled() {
        return OpenAdvertisingId.getLimitedOpenAdTracking();
    }
}
