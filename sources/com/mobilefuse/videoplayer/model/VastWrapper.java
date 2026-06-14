package com.mobilefuse.videoplayer.model;

import com.ironsource.C4240b4;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\t\u0010*\u001a\u00020\u0001HÆ\u0003J\u0010\u0010+\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010,\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\u0010\u0010-\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0014J\u000b\u0010.\u001a\u0004\u0018\u00010\bHÆ\u0003JH\u0010/\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u00100J\u0013\u00101\u001a\u00020\u00042\b\u00102\u001a\u0004\u0018\u000103HÖ\u0003J\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00104\u001a\u000205H\u0096\u0001J!\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e2\u0006\u00104\u001a\u0002052\b\u00106\u001a\u0004\u0018\u00010\bH\u0096\u0001J\t\u00107\u001a\u000208HÖ\u0001J\t\u00109\u001a\u00020\bHÖ\u0001R\u0014\u0010\n\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\fR\u0014\u0010\u000f\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\fR\u0014\u0010\u0011\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\fR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u0004\u0018\u00010\bX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\fR\u0018\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b\"\u0010\u0014R\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0004¢\u0006\n\n\u0002\u0010\u0015\u001a\u0004\b#\u0010\u0014R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0018\u0010'\u001a\b\u0012\u0004\u0012\u00020(0\u0017X\u0096\u0005¢\u0006\u0006\u001a\u0004\b)\u0010\u001a¨\u0006:"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastWrapper;", "Lcom/mobilefuse/videoplayer/model/VastAdContent;", "vastInline", "followAdditionalWrappers", "", "allowMultipleAds", "fallbackOnNoAd", "vastAdTagUri", "", "(Lcom/mobilefuse/videoplayer/model/VastAdContent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)V", "adServingId", "getAdServingId", "()Ljava/lang/String;", "adSystem", "getAdSystem", "adTitle", "getAdTitle", C4240b4.i.F0, "getAdvertiser", "getAllowMultipleAds", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "creativeList", "", "Lcom/mobilefuse/videoplayer/model/VastCreative;", "getCreativeList", "()Ljava/util/List;", "description", "getDescription", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "getEvents", "()Ljava/util/Set;", "getFallbackOnNoAd", "getFollowAdditionalWrappers", "getVastAdTagUri", "getVastInline", "()Lcom/mobilefuse/videoplayer/model/VastAdContent;", "verificationList", "Lcom/mobilefuse/videoplayer/model/VastVerification;", "getVerificationList", "component1", "component2", "component3", "component4", "component5", MenuActionType.COPY, "(Lcom/mobilefuse/videoplayer/model/VastAdContent;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/mobilefuse/videoplayer/model/VastWrapper;", "equals", "other", "", "eventType", "Lcom/mobilefuse/videoplayer/model/EventType;", C4240b4.i.f42633j0, "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastWrapper implements VastAdContent {

    @Nullable
    private final Boolean allowMultipleAds;

    @Nullable
    private final Boolean fallbackOnNoAd;

    @Nullable
    private final Boolean followAdditionalWrappers;

    @Nullable
    private final String vastAdTagUri;

    @NotNull
    private final VastAdContent vastInline;

    public VastWrapper(@NotNull VastAdContent vastInline, @Nullable Boolean bool, @Nullable Boolean bool2, @Nullable Boolean bool3, @Nullable String str) {
        Intrinsics.checkNotNullParameter(vastInline, "vastInline");
        this.vastInline = vastInline;
        this.followAdditionalWrappers = bool;
        this.allowMultipleAds = bool2;
        this.fallbackOnNoAd = bool3;
        this.vastAdTagUri = str;
    }

    public static /* synthetic */ VastWrapper copy$default(VastWrapper vastWrapper, VastAdContent vastAdContent, Boolean bool, Boolean bool2, Boolean bool3, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vastAdContent = vastWrapper.vastInline;
        }
        if ((i10 & 2) != 0) {
            bool = vastWrapper.followAdditionalWrappers;
        }
        if ((i10 & 4) != 0) {
            bool2 = vastWrapper.allowMultipleAds;
        }
        if ((i10 & 8) != 0) {
            bool3 = vastWrapper.fallbackOnNoAd;
        }
        if ((i10 & 16) != 0) {
            str = vastWrapper.vastAdTagUri;
        }
        String str2 = str;
        Boolean bool4 = bool2;
        return vastWrapper.copy(vastAdContent, bool, bool4, bool3, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VastAdContent getVastInline() {
        return this.vastInline;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getFollowAdditionalWrappers() {
        return this.followAdditionalWrappers;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Boolean getAllowMultipleAds() {
        return this.allowMultipleAds;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Boolean getFallbackOnNoAd() {
        return this.fallbackOnNoAd;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getVastAdTagUri() {
        return this.vastAdTagUri;
    }

    @NotNull
    public final VastWrapper copy(@NotNull VastAdContent vastInline, @Nullable Boolean followAdditionalWrappers, @Nullable Boolean allowMultipleAds, @Nullable Boolean fallbackOnNoAd, @Nullable String vastAdTagUri) {
        Intrinsics.checkNotNullParameter(vastInline, "vastInline");
        return new VastWrapper(vastInline, followAdditionalWrappers, allowMultipleAds, fallbackOnNoAd, vastAdTagUri);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastWrapper)) {
            return false;
        }
        VastWrapper vastWrapper = (VastWrapper) other;
        return Intrinsics.areEqual(this.vastInline, vastWrapper.vastInline) && Intrinsics.areEqual(this.followAdditionalWrappers, vastWrapper.followAdditionalWrappers) && Intrinsics.areEqual(this.allowMultipleAds, vastWrapper.allowMultipleAds) && Intrinsics.areEqual(this.fallbackOnNoAd, vastWrapper.fallbackOnNoAd) && Intrinsics.areEqual(this.vastAdTagUri, vastWrapper.vastAdTagUri);
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdServingId() {
        return this.vastInline.getAdServingId();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdSystem() {
        return this.vastInline.getAdSystem();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdTitle() {
        return this.vastInline.getAdTitle();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getAdvertiser() {
        return this.vastInline.getAdvertiser();
    }

    @Nullable
    public final Boolean getAllowMultipleAds() {
        return this.allowMultipleAds;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastCreative> getCreativeList() {
        return this.vastInline.getCreativeList();
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @Nullable
    public String getDescription() {
        return this.vastInline.getDescription();
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.vastInline.getEvents();
    }

    @Nullable
    public final Boolean getFallbackOnNoAd() {
        return this.fallbackOnNoAd;
    }

    @Nullable
    public final Boolean getFollowAdditionalWrappers() {
        return this.followAdditionalWrappers;
    }

    @Nullable
    public final String getVastAdTagUri() {
        return this.vastAdTagUri;
    }

    @NotNull
    public final VastAdContent getVastInline() {
        return this.vastInline;
    }

    @Override // com.mobilefuse.videoplayer.model.VastAdContent
    @NotNull
    public List<VastVerification> getVerificationList() {
        return this.vastInline.getVerificationList();
    }

    public int hashCode() {
        VastAdContent vastAdContent = this.vastInline;
        int iHashCode = (vastAdContent != null ? vastAdContent.hashCode() : 0) * 31;
        Boolean bool = this.followAdditionalWrappers;
        int iHashCode2 = (iHashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.allowMultipleAds;
        int iHashCode3 = (iHashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        Boolean bool3 = this.fallbackOnNoAd;
        int iHashCode4 = (iHashCode3 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        String str = this.vastAdTagUri;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastWrapper(vastInline=" + this.vastInline + ", followAdditionalWrappers=" + this.followAdditionalWrappers + ", allowMultipleAds=" + this.allowMultipleAds + ", fallbackOnNoAd=" + this.fallbackOnNoAd + ", vastAdTagUri=" + this.vastAdTagUri + ")";
    }

    public /* synthetic */ VastWrapper(VastAdContent vastAdContent, Boolean bool, Boolean bool2, Boolean bool3, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(vastAdContent, bool, bool2, bool3, (i10 & 16) != 0 ? null : str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return this.vastInline.getEvents(eventType);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String eventName) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return this.vastInline.getEvents(eventType, eventName);
    }
}
