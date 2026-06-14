package org.bidon.sdk.ads;

import com.taurusx.tax.g.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0011¨\u0006\u001e"}, d2 = {"Lorg/bidon/sdk/ads/AdUnitInfo;", "", "demandId", "", "label", "price", "", e0.f66120c, "bidType", "fillStartTs", "", "fillFinishTs", "status", "ext", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getDemandId", "()Ljava/lang/String;", "getLabel", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getUid", "getBidType", "getFillStartTs", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getFillFinishTs", "getStatus", "getExt", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdUnitInfo {

    @Nullable
    private final String bidType;

    @NotNull
    private final String demandId;

    @Nullable
    private final String ext;

    @Nullable
    private final Long fillFinishTs;

    @Nullable
    private final Long fillStartTs;

    @Nullable
    private final String label;

    @Nullable
    private final Double price;

    @Nullable
    private final String status;

    @Nullable
    private final String uid;

    public AdUnitInfo(@NotNull String demandId, @Nullable String str, @Nullable Double d10, @Nullable String str2, @Nullable String str3, @Nullable Long l10, @Nullable Long l11, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(demandId, "demandId");
        this.demandId = demandId;
        this.label = str;
        this.price = d10;
        this.uid = str2;
        this.bidType = str3;
        this.fillStartTs = l10;
        this.fillFinishTs = l11;
        this.status = str4;
        this.ext = str5;
    }

    @Nullable
    public final String getBidType() {
        return this.bidType;
    }

    @NotNull
    public final String getDemandId() {
        return this.demandId;
    }

    @Nullable
    public final String getExt() {
        return this.ext;
    }

    @Nullable
    public final Long getFillFinishTs() {
        return this.fillFinishTs;
    }

    @Nullable
    public final Long getFillStartTs() {
        return this.fillStartTs;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final Double getPrice() {
        return this.price;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    public final String getUid() {
        return this.uid;
    }
}
