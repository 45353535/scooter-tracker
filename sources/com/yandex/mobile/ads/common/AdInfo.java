package com.yandex.mobile.ads.common;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0010\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0010R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/yandex/mobile/ads/common/AdInfo;", "", "", "adUnitId", "Lcom/yandex/mobile/ads/common/AdSize;", C4240b4.i.O, "data", "", "Lcom/yandex/mobile/ads/common/Creative;", "creatives", "<init>", "(Ljava/lang/String;Lcom/yandex/mobile/ads/common/AdSize;Ljava/lang/String;Ljava/util/List;)V", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAdUnitId", "b", "Lcom/yandex/mobile/ads/common/AdSize;", "getAdSize", "()Lcom/yandex/mobile/ads/common/AdSize;", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "getData", "d", "Ljava/util/List;", "getCreatives", "()Ljava/util/List;", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public final class AdInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final AdSize adSize;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String data;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List creatives;

    public AdInfo(@NotNull String str, @Nullable AdSize adSize, @Nullable String str2, @NotNull List<Creative> list) {
        this.adUnitId = str;
        this.adSize = adSize;
        this.data = str2;
        this.creatives = list;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AdInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) other;
        return Intrinsics.areEqual(this.adUnitId, adInfo.adUnitId) && Intrinsics.areEqual(this.adSize, adInfo.adSize) && Intrinsics.areEqual(this.data, adInfo.data) && Intrinsics.areEqual(this.creatives, adInfo.creatives);
    }

    @NotNull
    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public int hashCode() {
        int iHashCode = this.adUnitId.hashCode() * 31;
        AdSize adSize = this.adSize;
        int iHashCode2 = (iHashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.data;
        return this.creatives.hashCode() + ((iHashCode2 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        String str = this.adUnitId;
        AdSize adSize = this.adSize;
        String string = adSize != null ? adSize.toString() : null;
        if (string == null) {
            string = "";
        }
        String str2 = this.data;
        return "AdSize (adUnitId: " + str + ", adSize: " + string + ", data: " + (str2 != null ? str2 : "") + ", creatives: " + this.creatives.size() + ")";
    }
}
