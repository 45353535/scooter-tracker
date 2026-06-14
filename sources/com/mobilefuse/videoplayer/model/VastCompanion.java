package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.g.n;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u009f\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\u0002\u0010\u0017J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010(\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0011HÆ\u0003J\u000f\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u0010\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010/\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00100\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00101\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00102\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u00103\u001a\u0004\u0018\u00010\u0005HÂ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÂ\u0003JÆ\u0001\u00106\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0002\u00107J\u0013\u00108\u001a\u0002092\b\u0010:\u001a\u0004\u0018\u00010;HÖ\u0003J\t\u0010<\u001a\u00020\u0005HÖ\u0001J\t\u0010=\u001a\u00020\u0003HÖ\u0001R\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0015\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u001b\u0010\u0019R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b \u0010\u0019R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0012\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u001aR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b&\u0010\u0019¨\u0006>"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastCompanion;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "id", "", "width", "", "height", "assetWidth", "assetHeight", "expandedWidth", "expandedHeight", "apiFramework", "adSlotId", "pxratio", "renderingMode", "altText", "clickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", n.f66163g, "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastClickThrough;Ljava/util/Set;Lcom/mobilefuse/videoplayer/model/VastBaseResource;)V", "getAssetHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getAssetWidth", "getClickThrough", "()Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "getEvents", "()Ljava/util/Set;", "getHeight", "getId", "()Ljava/lang/String;", "getRenderingMode", "getResource", "()Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "getWidth", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", MenuActionType.COPY, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastClickThrough;Ljava/util/Set;Lcom/mobilefuse/videoplayer/model/VastBaseResource;)Lcom/mobilefuse/videoplayer/model/VastCompanion;", "equals", "", "other", "", "hashCode", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastCompanion implements VastEventOwner {
    private final String adSlotId;
    private final String altText;
    private final String apiFramework;

    @Nullable
    private final Integer assetHeight;

    @Nullable
    private final Integer assetWidth;

    @Nullable
    private final VastClickThrough clickThrough;

    @NotNull
    private final Set<VastEvent> events;
    private final Integer expandedHeight;
    private final Integer expandedWidth;

    @Nullable
    private final Integer height;

    @Nullable
    private final String id;
    private final Integer pxratio;

    @Nullable
    private final String renderingMode;

    @Nullable
    private final VastBaseResource resource;

    @Nullable
    private final Integer width;

    public VastCompanion(@Nullable String str, @Nullable Integer num, @Nullable Integer num2, @Nullable Integer num3, @Nullable Integer num4, @Nullable Integer num5, @Nullable Integer num6, @Nullable String str2, @Nullable String str3, @Nullable Integer num7, @Nullable String str4, @Nullable String str5, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.id = str;
        this.width = num;
        this.height = num2;
        this.assetWidth = num3;
        this.assetHeight = num4;
        this.expandedWidth = num5;
        this.expandedHeight = num6;
        this.apiFramework = str2;
        this.adSlotId = str3;
        this.pxratio = num7;
        this.renderingMode = str4;
        this.altText = str5;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.resource = vastBaseResource;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    private final Integer getPxratio() {
        return this.pxratio;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    private final String getAltText() {
        return this.altText;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    private final Integer getExpandedWidth() {
        return this.expandedWidth;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    private final Integer getExpandedHeight() {
        return this.expandedHeight;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    private final String getApiFramework() {
        return this.apiFramework;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    private final String getAdSlotId() {
        return this.adSlotId;
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getRenderingMode() {
        return this.renderingMode;
    }

    @Nullable
    /* JADX INFO: renamed from: component13, reason: from getter */
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component14() {
        return getEvents();
    }

    @Nullable
    /* JADX INFO: renamed from: component15, reason: from getter */
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getAssetWidth() {
        return this.assetWidth;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getAssetHeight() {
        return this.assetHeight;
    }

    @NotNull
    public final VastCompanion copy(@Nullable String id2, @Nullable Integer width, @Nullable Integer height, @Nullable Integer assetWidth, @Nullable Integer assetHeight, @Nullable Integer expandedWidth, @Nullable Integer expandedHeight, @Nullable String apiFramework, @Nullable String adSlotId, @Nullable Integer pxratio, @Nullable String renderingMode, @Nullable String altText, @Nullable VastClickThrough clickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource resource) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastCompanion(id2, width, height, assetWidth, assetHeight, expandedWidth, expandedHeight, apiFramework, adSlotId, pxratio, renderingMode, altText, clickThrough, events, resource);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastCompanion)) {
            return false;
        }
        VastCompanion vastCompanion = (VastCompanion) other;
        return Intrinsics.areEqual(this.id, vastCompanion.id) && Intrinsics.areEqual(this.width, vastCompanion.width) && Intrinsics.areEqual(this.height, vastCompanion.height) && Intrinsics.areEqual(this.assetWidth, vastCompanion.assetWidth) && Intrinsics.areEqual(this.assetHeight, vastCompanion.assetHeight) && Intrinsics.areEqual(this.expandedWidth, vastCompanion.expandedWidth) && Intrinsics.areEqual(this.expandedHeight, vastCompanion.expandedHeight) && Intrinsics.areEqual(this.apiFramework, vastCompanion.apiFramework) && Intrinsics.areEqual(this.adSlotId, vastCompanion.adSlotId) && Intrinsics.areEqual(this.pxratio, vastCompanion.pxratio) && Intrinsics.areEqual(this.renderingMode, vastCompanion.renderingMode) && Intrinsics.areEqual(this.altText, vastCompanion.altText) && Intrinsics.areEqual(this.clickThrough, vastCompanion.clickThrough) && Intrinsics.areEqual(getEvents(), vastCompanion.getEvents()) && Intrinsics.areEqual(this.resource, vastCompanion.resource);
    }

    @Nullable
    public final Integer getAssetHeight() {
        return this.assetHeight;
    }

    @Nullable
    public final Integer getAssetWidth() {
        return this.assetWidth;
    }

    @Nullable
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    @Nullable
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getRenderingMode() {
        return this.renderingMode;
    }

    @Nullable
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.width;
        int iHashCode2 = (iHashCode + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int iHashCode3 = (iHashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.assetWidth;
        int iHashCode4 = (iHashCode3 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.assetHeight;
        int iHashCode5 = (iHashCode4 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Integer num5 = this.expandedWidth;
        int iHashCode6 = (iHashCode5 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Integer num6 = this.expandedHeight;
        int iHashCode7 = (iHashCode6 + (num6 != null ? num6.hashCode() : 0)) * 31;
        String str2 = this.apiFramework;
        int iHashCode8 = (iHashCode7 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.adSlotId;
        int iHashCode9 = (iHashCode8 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num7 = this.pxratio;
        int iHashCode10 = (iHashCode9 + (num7 != null ? num7.hashCode() : 0)) * 31;
        String str4 = this.renderingMode;
        int iHashCode11 = (iHashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.altText;
        int iHashCode12 = (iHashCode11 + (str5 != null ? str5.hashCode() : 0)) * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        int iHashCode13 = (iHashCode12 + (vastClickThrough != null ? vastClickThrough.hashCode() : 0)) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode14 = (iHashCode13 + (events != null ? events.hashCode() : 0)) * 31;
        VastBaseResource vastBaseResource = this.resource;
        return iHashCode14 + (vastBaseResource != null ? vastBaseResource.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastCompanion(id=" + this.id + ", width=" + this.width + ", height=" + this.height + ", assetWidth=" + this.assetWidth + ", assetHeight=" + this.assetHeight + ", expandedWidth=" + this.expandedWidth + ", expandedHeight=" + this.expandedHeight + ", apiFramework=" + this.apiFramework + ", adSlotId=" + this.adSlotId + ", pxratio=" + this.pxratio + ", renderingMode=" + this.renderingMode + ", altText=" + this.altText + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", resource=" + this.resource + ")";
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType, str);
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents() {
        return this.events;
    }
}
