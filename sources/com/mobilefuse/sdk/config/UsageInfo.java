package com.mobilefuse.sdk.config;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J'\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/sdk/config/UsageInfo;", "", "type", "Lcom/mobilefuse/sdk/config/UsageInfoType;", "name", "", "version", "(Lcom/mobilefuse/sdk/config/UsageInfoType;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getType", "()Lcom/mobilefuse/sdk/config/UsageInfoType;", "getVersion", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
final /* data */ class UsageInfo {

    @NotNull
    private final String name;

    @NotNull
    private final UsageInfoType type;

    @NotNull
    private final String version;

    public UsageInfo(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        this.type = type;
        this.name = name;
        this.version = version;
    }

    public static /* synthetic */ UsageInfo copy$default(UsageInfo usageInfo, UsageInfoType usageInfoType, String str, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            usageInfoType = usageInfo.type;
        }
        if ((i10 & 2) != 0) {
            str = usageInfo.name;
        }
        if ((i10 & 4) != 0) {
            str2 = usageInfo.version;
        }
        return usageInfo.copy(usageInfoType, str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final UsageInfoType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getVersion() {
        return this.version;
    }

    @NotNull
    public final UsageInfo copy(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(version, "version");
        return new UsageInfo(type, name, version);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UsageInfo)) {
            return false;
        }
        UsageInfo usageInfo = (UsageInfo) other;
        return Intrinsics.areEqual(this.type, usageInfo.type) && Intrinsics.areEqual(this.name, usageInfo.name) && Intrinsics.areEqual(this.version, usageInfo.version);
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final UsageInfoType getType() {
        return this.type;
    }

    @NotNull
    public final String getVersion() {
        return this.version;
    }

    public int hashCode() {
        UsageInfoType usageInfoType = this.type;
        int iHashCode = (usageInfoType != null ? usageInfoType.hashCode() : 0) * 31;
        String str = this.name;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.version;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "UsageInfo(type=" + this.type + ", name=" + this.name + ", version=" + this.version + ")";
    }
}
