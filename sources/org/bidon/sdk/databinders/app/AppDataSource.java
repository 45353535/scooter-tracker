package org.bidon.sdk.databinders.app;

import kotlin.Metadata;
import org.bidon.sdk.databinders.DataSource;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0004\n\u0002\b\u0005\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\n\u0010\u0004\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\n\u0010\u0007\u001a\u0004\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\u0003H&J\n\u0010\t\u001a\u0004\u0018\u00010\u0003H&J\n\u0010\n\u001a\u0004\u0018\u00010\u0003H&¨\u0006\u000b"}, d2 = {"Lorg/bidon/sdk/databinders/app/AppDataSource;", "Lorg/bidon/sdk/databinders/DataSource;", "getBundleId", "", "getAppVersionName", "getAppVersionCode", "", "getAppKey", "getFramework", "getFrameworkVersion", "getPluginVersion", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface AppDataSource extends DataSource {
    @Nullable
    String getAppKey();

    @Nullable
    Number getAppVersionCode();

    @Nullable
    String getAppVersionName();

    @NotNull
    String getBundleId();

    @NotNull
    String getFramework();

    @Nullable
    String getFrameworkVersion();

    @Nullable
    String getPluginVersion();
}
