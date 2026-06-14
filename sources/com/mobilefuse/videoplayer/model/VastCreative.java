package com.mobilefuse.videoplayer.model;

import com.ironsource.sdk.controller.f;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.w;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B]\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0\tHÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jv\u0010&\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010'J\u0013\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0006HÖ\u0001J\t\u0010,\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016¨\u0006-"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastCreative;", "", "id", "", f.b.f45109c, w.f66047c, "", "apiFramework", "universalAdIdList", "", "Lcom/mobilefuse/videoplayer/model/VastUniversalAdId;", "linear", "Lcom/mobilefuse/videoplayer/model/VastLinear;", "companionList", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "companionAdsRequiredMode", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/mobilefuse/videoplayer/model/VastLinear;Ljava/util/List;Ljava/lang/String;)V", "getAdId", "()Ljava/lang/String;", "getApiFramework", "getCompanionAdsRequiredMode", "getCompanionList", "()Ljava/util/List;", "getId", "getLinear", "()Lcom/mobilefuse/videoplayer/model/VastLinear;", "getSequence", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getUniversalAdIdList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/List;Lcom/mobilefuse/videoplayer/model/VastLinear;Ljava/util/List;Ljava/lang/String;)Lcom/mobilefuse/videoplayer/model/VastCreative;", "equals", "", "other", "hashCode", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastCreative {

    @Nullable
    private final String adId;

    @Nullable
    private final String apiFramework;

    @Nullable
    private final String companionAdsRequiredMode;

    @NotNull
    private final List<VastCompanion> companionList;

    @Nullable
    private final String id;

    @Nullable
    private final VastLinear linear;

    @Nullable
    private final Integer sequence;

    @NotNull
    private final List<VastUniversalAdId> universalAdIdList;

    public VastCreative(@Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear vastLinear, @NotNull List<VastCompanion> companionList, @Nullable String str4) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        this.id = str;
        this.adId = str2;
        this.sequence = num;
        this.apiFramework = str3;
        this.universalAdIdList = universalAdIdList;
        this.linear = vastLinear;
        this.companionList = companionList;
        this.companionAdsRequiredMode = str4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastCreative copy$default(VastCreative vastCreative, String str, String str2, Integer num, String str3, List list, VastLinear vastLinear, List list2, String str4, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastCreative.id;
        }
        if ((i10 & 2) != 0) {
            str2 = vastCreative.adId;
        }
        if ((i10 & 4) != 0) {
            num = vastCreative.sequence;
        }
        if ((i10 & 8) != 0) {
            str3 = vastCreative.apiFramework;
        }
        if ((i10 & 16) != 0) {
            list = vastCreative.universalAdIdList;
        }
        if ((i10 & 32) != 0) {
            vastLinear = vastCreative.linear;
        }
        if ((i10 & 64) != 0) {
            list2 = vastCreative.companionList;
        }
        if ((i10 & 128) != 0) {
            str4 = vastCreative.companionAdsRequiredMode;
        }
        List list3 = list2;
        String str5 = str4;
        List list4 = list;
        VastLinear vastLinear2 = vastLinear;
        return vastCreative.copy(str, str2, num, str3, list4, vastLinear2, list3, str5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @NotNull
    public final List<VastUniversalAdId> component5() {
        return this.universalAdIdList;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final VastLinear getLinear() {
        return this.linear;
    }

    @NotNull
    public final List<VastCompanion> component7() {
        return this.companionList;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCompanionAdsRequiredMode() {
        return this.companionAdsRequiredMode;
    }

    @NotNull
    public final VastCreative copy(@Nullable String id2, @Nullable String adId, @Nullable Integer sequence, @Nullable String apiFramework, @NotNull List<VastUniversalAdId> universalAdIdList, @Nullable VastLinear linear, @NotNull List<VastCompanion> companionList, @Nullable String companionAdsRequiredMode) {
        Intrinsics.checkNotNullParameter(universalAdIdList, "universalAdIdList");
        Intrinsics.checkNotNullParameter(companionList, "companionList");
        return new VastCreative(id2, adId, sequence, apiFramework, universalAdIdList, linear, companionList, companionAdsRequiredMode);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastCreative)) {
            return false;
        }
        VastCreative vastCreative = (VastCreative) other;
        return Intrinsics.areEqual(this.id, vastCreative.id) && Intrinsics.areEqual(this.adId, vastCreative.adId) && Intrinsics.areEqual(this.sequence, vastCreative.sequence) && Intrinsics.areEqual(this.apiFramework, vastCreative.apiFramework) && Intrinsics.areEqual(this.universalAdIdList, vastCreative.universalAdIdList) && Intrinsics.areEqual(this.linear, vastCreative.linear) && Intrinsics.areEqual(this.companionList, vastCreative.companionList) && Intrinsics.areEqual(this.companionAdsRequiredMode, vastCreative.companionAdsRequiredMode);
    }

    @Nullable
    public final String getAdId() {
        return this.adId;
    }

    @Nullable
    public final String getApiFramework() {
        return this.apiFramework;
    }

    @Nullable
    public final String getCompanionAdsRequiredMode() {
        return this.companionAdsRequiredMode;
    }

    @NotNull
    public final List<VastCompanion> getCompanionList() {
        return this.companionList;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final VastLinear getLinear() {
        return this.linear;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    @NotNull
    public final List<VastUniversalAdId> getUniversalAdIdList() {
        return this.universalAdIdList;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.adId;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.sequence;
        int iHashCode3 = (iHashCode2 + (num != null ? num.hashCode() : 0)) * 31;
        String str3 = this.apiFramework;
        int iHashCode4 = (iHashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        List<VastUniversalAdId> list = this.universalAdIdList;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        VastLinear vastLinear = this.linear;
        int iHashCode6 = (iHashCode5 + (vastLinear != null ? vastLinear.hashCode() : 0)) * 31;
        List<VastCompanion> list2 = this.companionList;
        int iHashCode7 = (iHashCode6 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str4 = this.companionAdsRequiredMode;
        return iHashCode7 + (str4 != null ? str4.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastCreative(id=" + this.id + ", adId=" + this.adId + ", sequence=" + this.sequence + ", apiFramework=" + this.apiFramework + ", universalAdIdList=" + this.universalAdIdList + ", linear=" + this.linear + ", companionList=" + this.companionList + ", companionAdsRequiredMode=" + this.companionAdsRequiredMode + ")";
    }
}
