package com.mobilefuse.sdk.service.impl.ifa;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/mobilefuse/sdk/service/impl/ifa/IfaDetails;", "", "advertisingId", "", "isLimitTrackingEnabled", "", "ifaSource", "Lcom/mobilefuse/sdk/service/impl/ifa/IfaSource;", "(Ljava/lang/String;ZLcom/mobilefuse/sdk/service/impl/ifa/IfaSource;)V", "getAdvertisingId", "()Ljava/lang/String;", "getIfaSource", "()Lcom/mobilefuse/sdk/service/impl/ifa/IfaSource;", "()Z", "component1", "component2", "component3", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class IfaDetails {

    @Nullable
    private final String advertisingId;

    @Nullable
    private final IfaSource ifaSource;
    private final boolean isLimitTrackingEnabled;

    public IfaDetails(@Nullable String str, boolean z10, @Nullable IfaSource ifaSource) {
        this.advertisingId = str;
        this.isLimitTrackingEnabled = z10;
        this.ifaSource = ifaSource;
    }

    public static /* synthetic */ IfaDetails copy$default(IfaDetails ifaDetails, String str, boolean z10, IfaSource ifaSource, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = ifaDetails.advertisingId;
        }
        if ((i10 & 2) != 0) {
            z10 = ifaDetails.isLimitTrackingEnabled;
        }
        if ((i10 & 4) != 0) {
            ifaSource = ifaDetails.ifaSource;
        }
        return ifaDetails.copy(str, z10, ifaSource);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsLimitTrackingEnabled() {
        return this.isLimitTrackingEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final IfaSource getIfaSource() {
        return this.ifaSource;
    }

    @NotNull
    public final IfaDetails copy(@Nullable String advertisingId, boolean isLimitTrackingEnabled, @Nullable IfaSource ifaSource) {
        return new IfaDetails(advertisingId, isLimitTrackingEnabled, ifaSource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IfaDetails)) {
            return false;
        }
        IfaDetails ifaDetails = (IfaDetails) other;
        return Intrinsics.areEqual(this.advertisingId, ifaDetails.advertisingId) && this.isLimitTrackingEnabled == ifaDetails.isLimitTrackingEnabled && Intrinsics.areEqual(this.ifaSource, ifaDetails.ifaSource);
    }

    @Nullable
    public final String getAdvertisingId() {
        return this.advertisingId;
    }

    @Nullable
    public final IfaSource getIfaSource() {
        return this.ifaSource;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        String str = this.advertisingId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.isLimitTrackingEnabled;
        ?? r22 = z10;
        if (z10) {
            r22 = 1;
        }
        int i10 = (iHashCode + r22) * 31;
        IfaSource ifaSource = this.ifaSource;
        return i10 + (ifaSource != null ? ifaSource.hashCode() : 0);
    }

    public final boolean isLimitTrackingEnabled() {
        return this.isLimitTrackingEnabled;
    }

    @NotNull
    public String toString() {
        return "IfaDetails(advertisingId=" + this.advertisingId + ", isLimitTrackingEnabled=" + this.isLimitTrackingEnabled + ", ifaSource=" + this.ifaSource + ")";
    }
}
