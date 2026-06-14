package com.mobilefuse.videoplayer.model;

import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.w;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J<\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastAd;", "", "id", "", w.f66047c, "", "adType", "content", "Lcom/mobilefuse/videoplayer/model/VastAdContent;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastAdContent;)V", "getAdType", "()Ljava/lang/String;", "getContent", "()Lcom/mobilefuse/videoplayer/model/VastAdContent;", "getId", "getSequence", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastAdContent;)Lcom/mobilefuse/videoplayer/model/VastAd;", "equals", "", "other", "hashCode", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastAd {

    @NotNull
    private final String adType;

    @Nullable
    private final VastAdContent content;

    @Nullable
    private final String id;

    @Nullable
    private final Integer sequence;

    public VastAd(@Nullable String str, @Nullable Integer num, @NotNull String adType, @Nullable VastAdContent vastAdContent) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        this.id = str;
        this.sequence = num;
        this.adType = adType;
        this.content = vastAdContent;
    }

    public static /* synthetic */ VastAd copy$default(VastAd vastAd, String str, Integer num, String str2, VastAdContent vastAdContent, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastAd.id;
        }
        if ((i10 & 2) != 0) {
            num = vastAd.sequence;
        }
        if ((i10 & 4) != 0) {
            str2 = vastAd.adType;
        }
        if ((i10 & 8) != 0) {
            vastAdContent = vastAd.content;
        }
        return vastAd.copy(str, num, str2, vastAdContent);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getSequence() {
        return this.sequence;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VastAdContent getContent() {
        return this.content;
    }

    @NotNull
    public final VastAd copy(@Nullable String id2, @Nullable Integer sequence, @NotNull String adType, @Nullable VastAdContent content) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        return new VastAd(id2, sequence, adType, content);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastAd)) {
            return false;
        }
        VastAd vastAd = (VastAd) other;
        return Intrinsics.areEqual(this.id, vastAd.id) && Intrinsics.areEqual(this.sequence, vastAd.sequence) && Intrinsics.areEqual(this.adType, vastAd.adType) && Intrinsics.areEqual(this.content, vastAd.content);
    }

    @NotNull
    public final String getAdType() {
        return this.adType;
    }

    @Nullable
    public final VastAdContent getContent() {
        return this.content;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final Integer getSequence() {
        return this.sequence;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.sequence;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str2 = this.adType;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        VastAdContent vastAdContent = this.content;
        return iHashCode3 + (vastAdContent != null ? vastAdContent.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastAd(id=" + this.id + ", sequence=" + this.sequence + ", adType=" + this.adType + ", content=" + this.content + ")";
    }
}
