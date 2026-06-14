package org.bidon.sdk.config.models;

import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.utils.serializer.JsonName;
import org.bidon.sdk.utils.serializer.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003JM\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR\u001e\u0010\u0005\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\f\"\u0004\b\u0012\u0010\u000eR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000e¨\u0006'"}, d2 = {"Lorg/bidon/sdk/config/models/App;", "Lorg/bidon/sdk/utils/serializer/Serializable;", "bundle", "", C4240b4.i.W, "framework", "version", "frameworkVersion", "pluginVersion", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBundle", "()Ljava/lang/String;", "setBundle", "(Ljava/lang/String;)V", "getKey", "setKey", "getFramework", "setFramework", "getVersion", "setVersion", "getFrameworkVersion", "setFrameworkVersion", "getPluginVersion", "setPluginVersion", "component1", "component2", "component3", "component4", "component5", "component6", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class App implements Serializable {

    @JsonName(key = "bundle")
    @NotNull
    private String bundle;

    @JsonName(key = "framework")
    @NotNull
    private String framework;

    @JsonName(key = "framework_version")
    @Nullable
    private String frameworkVersion;

    @JsonName(key = C4240b4.i.W)
    @Nullable
    private String key;

    @JsonName(key = "plugin_version")
    @Nullable
    private String pluginVersion;

    @JsonName(key = "version")
    @Nullable
    private String version;

    public App(@NotNull String bundle, @Nullable String str, @NotNull String framework, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(framework, "framework");
        this.bundle = bundle;
        this.key = str;
        this.framework = framework;
        this.version = str2;
        this.frameworkVersion = str3;
        this.pluginVersion = str4;
    }

    public static /* synthetic */ App copy$default(App app, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = app.bundle;
        }
        if ((i10 & 2) != 0) {
            str2 = app.key;
        }
        if ((i10 & 4) != 0) {
            str3 = app.framework;
        }
        if ((i10 & 8) != 0) {
            str4 = app.version;
        }
        if ((i10 & 16) != 0) {
            str5 = app.frameworkVersion;
        }
        if ((i10 & 32) != 0) {
            str6 = app.pluginVersion;
        }
        String str7 = str5;
        String str8 = str6;
        return app.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBundle() {
        return this.bundle;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getFramework() {
        return this.framework;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    @NotNull
    public final App copy(@NotNull String bundle, @Nullable String key, @NotNull String framework, @Nullable String version, @Nullable String frameworkVersion, @Nullable String pluginVersion) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(framework, "framework");
        return new App(bundle, key, framework, version, frameworkVersion, pluginVersion);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof App)) {
            return false;
        }
        App app = (App) other;
        return Intrinsics.areEqual(this.bundle, app.bundle) && Intrinsics.areEqual(this.key, app.key) && Intrinsics.areEqual(this.framework, app.framework) && Intrinsics.areEqual(this.version, app.version) && Intrinsics.areEqual(this.frameworkVersion, app.frameworkVersion) && Intrinsics.areEqual(this.pluginVersion, app.pluginVersion);
    }

    @NotNull
    public final String getBundle() {
        return this.bundle;
    }

    @NotNull
    public final String getFramework() {
        return this.framework;
    }

    @Nullable
    public final String getFrameworkVersion() {
        return this.frameworkVersion;
    }

    @Nullable
    public final String getKey() {
        return this.key;
    }

    @Nullable
    public final String getPluginVersion() {
        return this.pluginVersion;
    }

    @Nullable
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        int iHashCode = this.bundle.hashCode() * 31;
        String str = this.key;
        int iHashCode2 = (((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.framework.hashCode()) * 31;
        String str2 = this.version;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.frameworkVersion;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.pluginVersion;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setBundle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.bundle = str;
    }

    public final void setFramework(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.framework = str;
    }

    public final void setFrameworkVersion(@Nullable String str) {
        this.frameworkVersion = str;
    }

    public final void setKey(@Nullable String str) {
        this.key = str;
    }

    public final void setPluginVersion(@Nullable String str) {
        this.pluginVersion = str;
    }

    public final void setVersion(@Nullable String str) {
        this.version = str;
    }

    @NotNull
    public String toString() {
        return "App(bundle=" + this.bundle + ", key=" + this.key + ", framework=" + this.framework + ", version=" + this.version + ", frameworkVersion=" + this.frameworkVersion + ", pluginVersion=" + this.pluginVersion + ")";
    }
}
