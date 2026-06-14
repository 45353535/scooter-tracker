package com.mobilefuse.sdk.controllers;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\r\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/sdk/controllers/ParsedPlacementId;", "", "placemenId", "", "isTestMode", "", "(Ljava/lang/String;Z)V", "()Z", "getPlacemenId", "()Ljava/lang/String;", "component1", "component2", MenuActionType.COPY, "equals", "other", "hashCode", "", "toString", "mobilefuse-sdk-core_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class ParsedPlacementId {
    private final boolean isTestMode;

    @NotNull
    private final String placemenId;

    public ParsedPlacementId(@NotNull String placemenId, boolean z10) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        this.placemenId = placemenId;
        this.isTestMode = z10;
    }

    public static /* synthetic */ ParsedPlacementId copy$default(ParsedPlacementId parsedPlacementId, String str, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = parsedPlacementId.placemenId;
        }
        if ((i10 & 2) != 0) {
            z10 = parsedPlacementId.isTestMode;
        }
        return parsedPlacementId.copy(str, z10);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getPlacemenId() {
        return this.placemenId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getIsTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public final ParsedPlacementId copy(@NotNull String placemenId, boolean isTestMode) {
        Intrinsics.checkNotNullParameter(placemenId, "placemenId");
        return new ParsedPlacementId(placemenId, isTestMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParsedPlacementId)) {
            return false;
        }
        ParsedPlacementId parsedPlacementId = (ParsedPlacementId) other;
        return Intrinsics.areEqual(this.placemenId, parsedPlacementId.placemenId) && this.isTestMode == parsedPlacementId.isTestMode;
    }

    @NotNull
    public final String getPlacemenId() {
        return this.placemenId;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    public int hashCode() {
        String str = this.placemenId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        boolean z10 = this.isTestMode;
        ?? r12 = z10;
        if (z10) {
            r12 = 1;
        }
        return iHashCode + r12;
    }

    public final boolean isTestMode() {
        return this.isTestMode;
    }

    @NotNull
    public String toString() {
        return "ParsedPlacementId(placemenId=" + this.placemenId + ", isTestMode=" + this.isTestMode + ")";
    }
}
