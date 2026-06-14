package com.mobilefuse.sdk.config;

import com.mobilefuse.sdk.StabilityHelperBridge;
import com.taurusx.tax.f.y;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/mobilefuse/sdk/config/ExternalUsageInfo;", "", "()V", y.f66058y, "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class ExternalUsageInfo {

    @NotNull
    public static final String SDK_MODULE_UNITY = "Unity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static Map<UsageInfoType, UsageInfo> usageInfoMap = new LinkedHashMap();

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0004H\u0007J\b\u0010\u000e\u001a\u00020\nH\u0007J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u000b\u001a\u00020\u0007H\u0007J\u001c\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/sdk/config/ExternalUsageInfo$Companion;", "", "()V", "SDK_MODULE_UNITY", "", "usageInfoMap", "", "Lcom/mobilefuse/sdk/config/UsageInfoType;", "Lcom/mobilefuse/sdk/config/UsageInfo;", "addUsageInfo", "", "type", "name", "version", "clear", "getUsageInfoName", "getUsageInfoVersion", "hasUsageInfo", "", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ boolean hasUsageInfo$default(Companion companion, UsageInfoType usageInfoType, String str, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                str = null;
            }
            return companion.hasUsageInfo(usageInfoType, str);
        }

        public final void addUsageInfo(@NotNull UsageInfoType type, @NotNull String name, @NotNull String version) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(version, "version");
            ExternalUsageInfo.usageInfoMap.put(type, new UsageInfo(type, name, version));
            try {
                StabilityHelperBridge stabilityHelperBridge = StabilityHelperBridge.INSTANCE;
                Function2<String, String, Unit> registerExceptionHandlerVariableFn = stabilityHelperBridge.getRegisterExceptionHandlerVariableFn();
                if (registerExceptionHandlerVariableFn != null) {
                    registerExceptionHandlerVariableFn.invoke(type.getTelemetryPrefix() + ".name", name);
                }
                Function2<String, String, Unit> registerExceptionHandlerVariableFn2 = stabilityHelperBridge.getRegisterExceptionHandlerVariableFn();
                if (registerExceptionHandlerVariableFn2 != null) {
                    registerExceptionHandlerVariableFn2.invoke(type.getTelemetryPrefix() + ".version", 'v' + version);
                }
            } catch (Throwable unused) {
            }
        }

        public final void clear() {
            ExternalUsageInfo.usageInfoMap.clear();
        }

        @Nullable
        public final String getUsageInfoName(@NotNull UsageInfoType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            UsageInfo usageInfo = (UsageInfo) ExternalUsageInfo.usageInfoMap.get(type);
            if (usageInfo != null) {
                return usageInfo.getName();
            }
            return null;
        }

        @Nullable
        public final String getUsageInfoVersion(@NotNull UsageInfoType type) {
            Intrinsics.checkNotNullParameter(type, "type");
            UsageInfo usageInfo = (UsageInfo) ExternalUsageInfo.usageInfoMap.get(type);
            if (usageInfo != null) {
                return usageInfo.getVersion();
            }
            return null;
        }

        public final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType) {
            return hasUsageInfo$default(this, usageInfoType, null, 2, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean hasUsageInfo(@NotNull UsageInfoType type, @Nullable String name) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (name == null) {
                return ExternalUsageInfo.usageInfoMap.containsKey(type);
            }
            UsageInfo usageInfo = (UsageInfo) ExternalUsageInfo.usageInfoMap.get(type);
            return Intrinsics.areEqual(usageInfo != null ? usageInfo.getName() : null, name);
        }
    }

    public static final void addUsageInfo(@NotNull UsageInfoType usageInfoType, @NotNull String str, @NotNull String str2) {
        INSTANCE.addUsageInfo(usageInfoType, str, str2);
    }

    public static final void clear() {
        INSTANCE.clear();
    }

    @Nullable
    public static final String getUsageInfoName(@NotNull UsageInfoType usageInfoType) {
        return INSTANCE.getUsageInfoName(usageInfoType);
    }

    @Nullable
    public static final String getUsageInfoVersion(@NotNull UsageInfoType usageInfoType) {
        return INSTANCE.getUsageInfoVersion(usageInfoType);
    }

    public static final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType) {
        return Companion.hasUsageInfo$default(INSTANCE, usageInfoType, null, 2, null);
    }

    public static final boolean hasUsageInfo(@NotNull UsageInfoType usageInfoType, @Nullable String str) {
        return INSTANCE.hasUsageInfo(usageInfoType, str);
    }
}
