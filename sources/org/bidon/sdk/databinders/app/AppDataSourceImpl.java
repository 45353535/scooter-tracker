package org.bidon.sdk.databinders.app;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.bidon.sdk.utils.keyvaluestorage.KeyValueStorage;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0004\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\n\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\u000e\u001a\u00020\u000bH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000bH\u0016J\n\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lorg/bidon/sdk/databinders/app/AppDataSourceImpl;", "Lorg/bidon/sdk/databinders/app/AppDataSource;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "keyValueStorage", "Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;", "<init>", "(Landroid/content/Context;Lorg/bidon/sdk/utils/keyvaluestorage/KeyValueStorage;)V", "getAppVersionCode", "", "getBundleId", "", "getAppVersionName", "getAppKey", "getFramework", "getFrameworkVersion", "getPluginVersion", "getPackageInfo", "Landroid/content/pm/PackageInfo;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppDataSourceImpl implements AppDataSource {

    @NotNull
    private final Context context;

    @NotNull
    private final KeyValueStorage keyValueStorage;

    public AppDataSourceImpl(@NotNull Context context, @NotNull KeyValueStorage keyValueStorage) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(keyValueStorage, "keyValueStorage");
        this.context = context;
        this.keyValueStorage = keyValueStorage;
    }

    private final PackageInfo getPackageInfo(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (Throwable th2) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            LogExtKt.logError("AppDataSource", message, th2);
            return null;
        }
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @Nullable
    public String getAppKey() {
        return this.keyValueStorage.getAppKey();
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @Nullable
    public Number getAppVersionCode() {
        PackageInfo packageInfo = getPackageInfo(this.context);
        if (Build.VERSION.SDK_INT >= 28) {
            if (packageInfo != null) {
                return Long.valueOf(packageInfo.getLongVersionCode());
            }
            return null;
        }
        if (packageInfo != null) {
            return Integer.valueOf(packageInfo.versionCode);
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @Nullable
    public String getAppVersionName() {
        PackageInfo packageInfo = getPackageInfo(this.context);
        if (packageInfo != null) {
            return packageInfo.versionName;
        }
        return null;
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @NotNull
    public String getBundleId() {
        String packageName = this.context.getPackageName();
        Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @NotNull
    public String getFramework() {
        return UnitySpecificInfo.INSTANCE.getFrameworkName();
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @Nullable
    public String getFrameworkVersion() {
        return UnitySpecificInfo.INSTANCE.getFrameworkVersion();
    }

    @Override // org.bidon.sdk.databinders.app.AppDataSource
    @Nullable
    public String getPluginVersion() {
        return UnitySpecificInfo.INSTANCE.getPluginVersion();
    }
}
