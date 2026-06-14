package org.bidon.sdk.adapter;

import com.my.target.common.menu.MenuActionType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0010"}, d2 = {"Lorg/bidon/sdk/adapter/DemandId;", "", "demandId", "", "<init>", "(Ljava/lang/String;)V", "getDemandId", "()Ljava/lang/String;", "component1", MenuActionType.COPY, "equals", "", "other", "hashCode", "", "toString", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class DemandId {

    @NotNull
    private final String demandId;

    public DemandId(@NotNull String demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.demandId = demandId;
    }

    public static /* synthetic */ DemandId copy$default(DemandId demandId, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = demandId.demandId;
        }
        return demandId.copy(str);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDemandId() {
        return this.demandId;
    }

    @NotNull
    public final DemandId copy(@NotNull String demandId) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        return new DemandId(demandId);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DemandId) && Intrinsics.areEqual(this.demandId, ((DemandId) other).demandId);
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    public int hashCode() {
        return this.demandId.hashCode();
    }

    @NotNull
    public String toString() {
        return "DemandId(demandId=" + this.demandId + ")";
    }
}
