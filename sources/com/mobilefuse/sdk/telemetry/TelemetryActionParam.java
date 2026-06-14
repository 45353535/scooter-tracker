package com.mobilefuse.sdk.telemetry;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/telemetry/TelemetryActionParam;", "", "type", "Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "value", "includeToBreadcrumb", "", "(Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;Ljava/lang/Object;Z)V", "getIncludeToBreadcrumb", "()Z", "setIncludeToBreadcrumb", "(Z)V", "getType", "()Lcom/mobilefuse/sdk/telemetry/TelemetryParamType;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "", "mobilefuse-sdk-telemetry_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class TelemetryActionParam {
    private boolean includeToBreadcrumb;

    @NotNull
    private final TelemetryParamType type;

    @NotNull
    private final Object value;

    public TelemetryActionParam(@NotNull TelemetryParamType type, @NotNull Object value, boolean z10) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type;
        this.value = value;
        this.includeToBreadcrumb = z10;
    }

    public static /* synthetic */ TelemetryActionParam copy$default(TelemetryActionParam telemetryActionParam, TelemetryParamType telemetryParamType, Object obj, boolean z10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            telemetryParamType = telemetryActionParam.type;
        }
        if ((i10 & 2) != 0) {
            obj = telemetryActionParam.value;
        }
        if ((i10 & 4) != 0) {
            z10 = telemetryActionParam.includeToBreadcrumb;
        }
        return telemetryActionParam.copy(telemetryParamType, obj, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final TelemetryParamType getType() {
        return this.type;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIncludeToBreadcrumb() {
        return this.includeToBreadcrumb;
    }

    @NotNull
    public final TelemetryActionParam copy(@NotNull TelemetryParamType type, @NotNull Object value, boolean includeToBreadcrumb) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new TelemetryActionParam(type, value, includeToBreadcrumb);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TelemetryActionParam)) {
            return false;
        }
        TelemetryActionParam telemetryActionParam = (TelemetryActionParam) other;
        return Intrinsics.areEqual(this.type, telemetryActionParam.type) && Intrinsics.areEqual(this.value, telemetryActionParam.value) && this.includeToBreadcrumb == telemetryActionParam.includeToBreadcrumb;
    }

    public final boolean getIncludeToBreadcrumb() {
        return this.includeToBreadcrumb;
    }

    @NotNull
    public final TelemetryParamType getType() {
        return this.type;
    }

    @NotNull
    public final Object getValue() {
        return this.value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v6 */
    public int hashCode() {
        TelemetryParamType telemetryParamType = this.type;
        int iHashCode = (telemetryParamType != null ? telemetryParamType.hashCode() : 0) * 31;
        Object obj = this.value;
        int iHashCode2 = (iHashCode + (obj != null ? obj.hashCode() : 0)) * 31;
        boolean z10 = this.includeToBreadcrumb;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode2 + r12;
    }

    public final void setIncludeToBreadcrumb(boolean z10) {
        this.includeToBreadcrumb = z10;
    }

    @NotNull
    public String toString() {
        return "TelemetryActionParam(type=" + this.type + ", value=" + this.value + ", includeToBreadcrumb=" + this.includeToBreadcrumb + ")";
    }

    public /* synthetic */ TelemetryActionParam(TelemetryParamType telemetryParamType, Object obj, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(telemetryParamType, obj, (i10 & 4) != 0 ? true : z10);
    }
}
