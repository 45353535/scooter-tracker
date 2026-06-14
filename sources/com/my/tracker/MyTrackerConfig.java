package com.my.tracker;

import android.content.pm.PackageInfo;
import androidx.annotation.AnyThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.my.tracker.config.AntiFraudConfig;
import com.my.tracker.obfuscated.y2;
import hh.x;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class MyTrackerConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y2 f61202a;

    public interface InstalledPackagesProvider {
        @Nullable
        @WorkerThread
        List<PackageInfo> getInstalledPackages();
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface LocationTrackingMode {
        public static final int ACTIVE = 2;
        public static final int CACHED = 1;
        public static final int NONE = 0;
    }

    public interface OkHttpClientProvider {
        @NonNull
        @WorkerThread
        x getOkHttpClient();
    }

    private MyTrackerConfig(y2 y2Var) {
        this.f61202a = y2Var;
    }

    static MyTrackerConfig a(y2 y2Var) {
        return new MyTrackerConfig(y2Var);
    }

    @NonNull
    @AnyThread
    public AntiFraudConfig getAntiFraudConfig() {
        return this.f61202a.a();
    }

    @Nullable
    @AnyThread
    public String getApkPreinstallParams() {
        return this.f61202a.b();
    }

    @AnyThread
    public int getBufferingPeriod() {
        return this.f61202a.e();
    }

    @AnyThread
    public int getForcingPeriod() {
        return this.f61202a.f();
    }

    @NonNull
    @AnyThread
    public String getId() {
        return this.f61202a.g();
    }

    @AnyThread
    public int getLaunchTimeout() {
        return this.f61202a.i();
    }

    @AnyThread
    public int getLocationTrackingMode() {
        return this.f61202a.j();
    }

    @Nullable
    @AnyThread
    @Deprecated
    public String getVendorAppPackage() {
        return this.f61202a.r();
    }

    @AnyThread
    public boolean isAutotrackingPurchaseEnabled() {
        return this.f61202a.s();
    }

    @AnyThread
    public boolean isKidMode() {
        return this.f61202a.t();
    }

    @AnyThread
    public boolean isTrackingEnvironmentEnabled() {
        return this.f61202a.u();
    }

    @AnyThread
    public boolean isTrackingLaunchEnabled() {
        return this.f61202a.v();
    }

    @AnyThread
    @Deprecated
    public boolean isTrackingLocationEnabled() {
        int iJ = this.f61202a.j();
        return iJ == 1 || iJ == 2;
    }

    @AnyThread
    public boolean isTrackingPreinstallEnabled() {
        return this.f61202a.w();
    }

    @AnyThread
    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.f61202a.x();
    }

    @AnyThread
    public void setAntiFraudConfig(@NonNull AntiFraudConfig antiFraudConfig) {
        this.f61202a.a(antiFraudConfig);
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setApkPreinstallParams(@Nullable String str) {
        this.f61202a.a(str);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z10) {
        this.f61202a.b(z10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setBufferingPeriod(int i10) {
        this.f61202a.a(i10);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.f61202a.A();
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setForcingPeriod(int i10) {
        this.f61202a.b(i10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setInstalledPackagesProvider(@Nullable InstalledPackagesProvider installedPackagesProvider) {
        this.f61202a.a(installedPackagesProvider);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setKidMode(boolean z10) {
        this.f61202a.c(z10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setLaunchTimeout(int i10) {
        this.f61202a.c(i10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setLocationTrackingMode(int i10) {
        this.f61202a.d(i10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setOkHttpClientProvider(@Nullable OkHttpClientProvider okHttpClientProvider) {
        this.f61202a.a(okHttpClientProvider);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setProxyHost(@Nullable String str) {
        this.f61202a.c(str);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z10) {
        this.f61202a.d(z10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingLaunchEnabled(boolean z10) {
        this.f61202a.e(z10);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setTrackingLocationEnabled(boolean z10) {
        if (z10) {
            this.f61202a.d(1);
            return this;
        }
        this.f61202a.d(0);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z10) {
        this.f61202a.f(z10);
        return this;
    }

    @NonNull
    @AnyThread
    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z10) {
        this.f61202a.g(z10);
        return this;
    }

    @NonNull
    @AnyThread
    @Deprecated
    public MyTrackerConfig setVendorAppPackage(@Nullable String str) {
        this.f61202a.e(str);
        return this;
    }
}
