package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* JADX INFO: loaded from: classes12.dex */
public class BaseRequestConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f78842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SdkEnvironment f78843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private SdkIdentifiers f78844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AppSetId f78845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RetryPolicyConfig f78846e;

    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f78847a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f78848b;

        protected ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f78847a = context;
            this.f78848b = str;
        }

        @NonNull
        protected abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f78847a;
        }

        @NonNull
        public String getPackageName() {
            return this.f78848b;
        }

        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public T load(@NonNull D d10) {
            T t10 = (T) createBlankConfig();
            t10.setSdkIdentifiers(d10.sdkIdentifiers);
            t10.setSdkEnvironment(d10.sdkEnvironmentProvider.getSdkEnvironment());
            t10.setAppSetId(d10.platformIdentifiers.getAppSetIdProvider().getAppSetId());
            t10.setPackageName(this.f78848b);
            return t10;
        }
    }

    public static class DataSource<A> {

        @NonNull
        public final A componentArguments;

        @NonNull
        public final PlatformIdentifiers platformIdentifiers;

        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;

        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a10) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a10;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d10);
    }

    protected BaseRequestConfig() {
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        AppSetId appSetId;
        try {
            appSetId = this.f78845d;
        } finally {
        }
        return (appSetId == null || appSetId.getId() == null) ? "" : this.f78845d.getId();
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        AppSetId appSetId;
        try {
            appSetId = this.f78845d;
        } finally {
        }
        return appSetId == null ? "" : appSetId.getScope().getValue();
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment == null ? "" : sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String deviceIdHash;
        deviceIdHash = "";
        SdkIdentifiers sdkIdentifiers = this.f78844c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            deviceIdHash = this.f78844c.getDeviceIdHash();
        }
        return deviceIdHash;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String deviceId;
        deviceId = "";
        SdkIdentifiers sdkIdentifiers = this.f78844c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            deviceId = this.f78844c.getDeviceId();
        }
        return deviceId;
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        return sdkEnvironment != null ? sdkEnvironment.getDeviceType() : "phone";
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f78843b;
        return (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) ? "" : str;
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f78842a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f78846e;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f78843b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    @NonNull
    public synchronized String getUuid() {
        String uuid;
        uuid = "";
        SdkIdentifiers sdkIdentifiers = this.f78844c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            uuid = this.f78844c.getUuid();
        }
        return uuid;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public synchronized boolean isIdentifiersValid() {
        /*
            r2 = this;
            monitor-enter(r2)
            io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers r0 = r2.f78844c     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            java.lang.String r1 = r0.getUuid()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L12
            goto L30
        L12:
            java.lang.String r1 = r0.getDeviceId()     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto L30
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L1f
            goto L30
        L1f:
            java.lang.String r0 = r0.getDeviceIdHash()     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto L30
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L2e
            if (r0 != 0) goto L2c
            goto L30
        L2c:
            r0 = 1
            goto L31
        L2e:
            r0 = move-exception
            goto L33
        L30:
            r0 = 0
        L31:
            monitor-exit(r2)
            return r0
        L33:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.isIdentifiersValid():boolean");
    }

    protected void setAppSetId(@NonNull AppSetId appSetId) {
        this.f78845d = appSetId;
    }

    protected void setPackageName(String str) {
        this.f78842a = str;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f78846e = retryPolicyConfig;
    }

    protected void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f78843b = sdkEnvironment;
    }

    protected void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.f78844c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f78842a + "', sdkEnvironment=" + this.f78843b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f78844c + ", retryPolicyConfig=" + this.f78846e + '}';
    }
}
