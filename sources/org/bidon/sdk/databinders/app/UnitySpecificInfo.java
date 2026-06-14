package org.bidon.sdk.databinders.app;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\t¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/databinders/app/UnitySpecificInfo;", "", "<init>", "()V", "frameworkName", "", "getFrameworkName", "()Ljava/lang/String;", "setFrameworkName", "(Ljava/lang/String;)V", "frameworkVersion", "getFrameworkVersion", "setFrameworkVersion", "pluginVersion", "getPluginVersion", "setPluginVersion", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnitySpecificInfo {

    @NotNull
    public static final UnitySpecificInfo INSTANCE = new UnitySpecificInfo();

    @NotNull
    private static String frameworkName = "android";

    @Nullable
    private static String frameworkVersion;

    @Nullable
    private static String pluginVersion;

    private UnitySpecificInfo() {
    }

    @NotNull
    public final String getFrameworkName() {
        return frameworkName;
    }

    @Nullable
    public final String getFrameworkVersion() {
        return frameworkVersion;
    }

    @Nullable
    public final String getPluginVersion() {
        return pluginVersion;
    }

    public final void setFrameworkName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        frameworkName = str;
    }

    public final void setFrameworkVersion(@Nullable String str) {
        frameworkVersion = str;
    }

    public final void setPluginVersion(@Nullable String str) {
        pluginVersion = str;
    }
}
