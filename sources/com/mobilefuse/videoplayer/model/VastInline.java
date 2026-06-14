package com.mobilefuse.videoplayer.model;

import com.ironsource.C4240b4;
import com.mobilefuse.videoplayer.model.VastAdContent;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\f¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\tHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0003Ju\u0010$\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017¨\u0006,"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastInline;", "Lcom/mobilefuse/videoplayer/model/VastAdContent;", "adSystem", "", "adTitle", "adServingId", "description", C4240b4.i.F0, "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "creativeList", "", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "verificationList", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;Ljava/util/List;Ljava/util/List;)V", "getAdServingId", "()Ljava/lang/String;", "getAdSystem", "getAdTitle", "getAdvertiser", "getCreativeList", "()Ljava/util/List;", "getDescription", "getEvents", "()Ljava/util/Set;", "getVerificationList", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastInline implements VastAdContent {

    @Nullable
    private final String adServingId;

    @Nullable
    private final String adSystem;

    @Nullable
    private final String adTitle;

    @Nullable
    private final String advertiser;

    @NotNull
    private final List<VastCreative> creativeList;

    @Nullable
    private final String description;

    @NotNull
    private final Set<VastEvent> events;

    @NotNull
    private final List<VastVerification> verificationList;

    public VastInline(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @NotNull Set<VastEvent> events, @NotNull List<VastCreative> creativeList, @NotNull List<VastVerification> verificationList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(creativeList, "creativeList");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        this.adSystem = str;
        this.adTitle = str2;
        this.adServingId = str3;
        this.description = str4;
        this.advertiser = str5;
        this.events = events;
        this.creativeList = creativeList;
        this.verificationList = verificationList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastInline copy$default(VastInline vastInline, String str, String str2, String str3, String str4, String str5, Set set, List list, List list2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastInline.getAdSystem();
        }
        if ((i10 & 2) != 0) {
            str2 = vastInline.getAdTitle();
        }
        if ((i10 & 4) != 0) {
            str3 = vastInline.getAdServingId();
        }
        if ((i10 & 8) != 0) {
            str4 = vastInline.getDescription();
        }
        if ((i10 & 16) != 0) {
            str5 = vastInline.getAdvertiser();
        }
        if ((i10 & 32) != 0) {
            set = vastInline.getEvents();
        }
        if ((i10 & 64) != 0) {
            list = vastInline.getCreativeList();
        }
        if ((i10 & 128) != 0) {
            list2 = vastInline.getVerificationList();
        }
        List list3 = list;
        List list4 = list2;
        String str6 = str5;
        Set set2 = set;
        return vastInline.copy(str, str2, str3, str4, str6, set2, list3, list4);
    }

    @Nullable
    public final String component1() {
        return getAdSystem();
    }

    @Nullable
    public final String component2() {
        return getAdTitle();
    }

    @Nullable
    public final String component3() {
        return getAdServingId();
    }

    @Nullable
    public final String component4() {
        return getDescription();
    }

    @Nullable
    public final String component5() {
        return getAdvertiser();
    }

    @NotNull
    public final Set<VastEvent> component6() {
        return getEvents();
    }

    @NotNull
    public final List<VastCreative> component7() {
        return getCreativeList();
    }

    @NotNull
    public final List<VastVerification> component8() {
        return getVerificationList();
    }

    @NotNull
    public final VastInline copy(@Nullable String adSystem, @Nullable String adTitle, @Nullable String adServingId, @Nullable String description, @Nullable String advertiser, @NotNull Set<VastEvent> events, @NotNull List<VastCreative> creativeList, @NotNull List<VastVerification> verificationList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(creativeList, "creativeList");
        Intrinsics.checkNotNullParameter(verificationList, "verificationList");
        return new VastInline(adSystem, adTitle, adServingId, description, advertiser, events, creativeList, verificationList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastInline)) {
            return false;
        }
        VastInline vastInline = (VastInline) other;
        return Intrinsics.areEqual(getAdSystem(), vastInline.getAdSystem()) && Intrinsics.areEqual(getAdTitle(), vastInline.getAdTitle()) && Intrinsics.areEqual(getAdServingId(), vastInline.getAdServingId()) && Intrinsics.areEqual(getDescription(), vastInline.getDescription()) && Intrinsics.areEqual(getAdvertiser(), vastInline.getAdvertiser()) && Intrinsics.areEqual(getEvents(), vastInline.getEvents()) && Intrinsics.areEqual(getCreativeList(), vastInline.getCreativeList()) && Intrinsics.areEqual(getVerificationList(), vastInline.getVerificationList());
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdServingId() {
        return this.adServingId;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdSystem() {
        return this.adSystem;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdTitle() {
        return this.adTitle;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdvertiser() {
        return this.advertiser;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastCreative> getCreativeList() {
        return this.creativeList;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getDescription() {
        return this.description;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastAdContent.DefaultImpls.getEvents(this, eventType);
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastVerification> getVerificationList() {
        return this.verificationList;
    }

    public int hashCode() {
        String adSystem = getAdSystem();
        int iHashCode = (adSystem != null ? adSystem.hashCode() : 0) * 31;
        String adTitle = getAdTitle();
        int iHashCode2 = (iHashCode + (adTitle != null ? adTitle.hashCode() : 0)) * 31;
        String adServingId = getAdServingId();
        int iHashCode3 = (iHashCode2 + (adServingId != null ? adServingId.hashCode() : 0)) * 31;
        String description = getDescription();
        int iHashCode4 = (iHashCode3 + (description != null ? description.hashCode() : 0)) * 31;
        String advertiser = getAdvertiser();
        int iHashCode5 = (iHashCode4 + (advertiser != null ? advertiser.hashCode() : 0)) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode6 = (iHashCode5 + (events != null ? events.hashCode() : 0)) * 31;
        List<VastCreative> creativeList = getCreativeList();
        int iHashCode7 = (iHashCode6 + (creativeList != null ? creativeList.hashCode() : 0)) * 31;
        List<VastVerification> verificationList = getVerificationList();
        return iHashCode7 + (verificationList != null ? verificationList.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastInline(adSystem=" + getAdSystem() + ", adTitle=" + getAdTitle() + ", adServingId=" + getAdServingId() + ", description=" + getDescription() + ", advertiser=" + getAdvertiser() + ", events=" + getEvents() + ", creativeList=" + getCreativeList() + ", verificationList=" + getVerificationList() + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastAdContent.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
