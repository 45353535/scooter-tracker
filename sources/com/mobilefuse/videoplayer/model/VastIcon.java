package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import com.my.target.common.menu.MenuActionType;
import com.taurusx.tax.f.y;
import com.taurusx.tax.g.e0;
import com.taurusx.tax.g.n;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u0000 32\u00020\u0001:\u00013BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0002\u0010\u0011J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003J\u0010\u0010'\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u0010\u0010(\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003Jr\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010,J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100HÖ\u0003J\t\u00101\u001a\u00020\fHÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0011\u0010 \u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001dR\u0015\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\"\u0010\u0019¨\u00064"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastIcon;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "program", "", "clickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", n.f66163g, "Lcom/mobilefuse/videoplayer/model/VastBaseResource;", "width", "", "height", "offset", "Lcom/mobilefuse/videoplayer/model/VastTime;", "duration", "(Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastClickThrough;Ljava/util/Set;Lcom/mobilefuse/videoplayer/model/VastBaseResource;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/mobilefuse/videoplayer/model/VastTime;Lcom/mobilefuse/videoplayer/model/VastTime;)V", "getClickThrough", "()Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "getDuration", "()Lcom/mobilefuse/videoplayer/model/VastTime;", "getEvents", "()Ljava/util/Set;", "getHeight", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getOffset", "getProgram", "()Ljava/lang/String;", "getResource", "()Lcom/mobilefuse/videoplayer/model/VastBaseResource;", e0.f66120c, "getUid", "getWidth", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", MenuActionType.COPY, "(Ljava/lang/String;Lcom/mobilefuse/videoplayer/model/VastClickThrough;Ljava/util/Set;Lcom/mobilefuse/videoplayer/model/VastBaseResource;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/mobilefuse/videoplayer/model/VastTime;Lcom/mobilefuse/videoplayer/model/VastTime;)Lcom/mobilefuse/videoplayer/model/VastIcon;", "equals", "", "other", "", "hashCode", "toString", y.f66058y, "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastIcon implements VastEventOwner {
    private static int NEXT_ICON_ID = 1;

    @Nullable
    private final VastClickThrough clickThrough;

    @Nullable
    private final VastTime duration;

    @NotNull
    private final Set<VastEvent> events;

    @Nullable
    private final Integer height;

    @Nullable
    private final VastTime offset;

    @Nullable
    private final String program;

    @Nullable
    private final VastBaseResource resource;

    @NotNull
    private final String uid;

    @Nullable
    private final Integer width;

    public VastIcon(@Nullable String str, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource vastBaseResource, @Nullable Integer num, @Nullable Integer num2, @Nullable VastTime vastTime, @Nullable VastTime vastTime2) {
        Intrinsics.checkNotNullParameter(events, "events");
        this.program = str;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.resource = vastBaseResource;
        this.width = num;
        this.height = num2;
        this.offset = vastTime;
        this.duration = vastTime2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("icon-");
        int i10 = NEXT_ICON_ID;
        NEXT_ICON_ID = i10 + 1;
        sb2.append(i10);
        this.uid = sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastIcon copy$default(VastIcon vastIcon, String str, VastClickThrough vastClickThrough, Set set, VastBaseResource vastBaseResource, Integer num, Integer num2, VastTime vastTime, VastTime vastTime2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastIcon.program;
        }
        if ((i10 & 2) != 0) {
            vastClickThrough = vastIcon.clickThrough;
        }
        if ((i10 & 4) != 0) {
            set = vastIcon.getEvents();
        }
        if ((i10 & 8) != 0) {
            vastBaseResource = vastIcon.resource;
        }
        if ((i10 & 16) != 0) {
            num = vastIcon.width;
        }
        if ((i10 & 32) != 0) {
            num2 = vastIcon.height;
        }
        if ((i10 & 64) != 0) {
            vastTime = vastIcon.offset;
        }
        if ((i10 & 128) != 0) {
            vastTime2 = vastIcon.duration;
        }
        VastTime vastTime3 = vastTime;
        VastTime vastTime4 = vastTime2;
        Integer num3 = num;
        Integer num4 = num2;
        return vastIcon.copy(str, vastClickThrough, set, vastBaseResource, num3, num4, vastTime3, vastTime4);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProgram() {
        return this.program;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component3() {
        return getEvents();
    }

    @Nullable
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @Nullable
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    @Nullable
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @Nullable
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final VastTime getDuration() {
        return this.duration;
    }

    @NotNull
    public final VastIcon copy(@Nullable String program, @Nullable VastClickThrough clickThrough, @NotNull Set<VastEvent> events, @Nullable VastBaseResource resource, @Nullable Integer width, @Nullable Integer height, @Nullable VastTime offset, @Nullable VastTime duration) {
        Intrinsics.checkNotNullParameter(events, "events");
        return new VastIcon(program, clickThrough, events, resource, width, height, offset, duration);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastIcon)) {
            return false;
        }
        VastIcon vastIcon = (VastIcon) other;
        return Intrinsics.areEqual(this.program, vastIcon.program) && Intrinsics.areEqual(this.clickThrough, vastIcon.clickThrough) && Intrinsics.areEqual(getEvents(), vastIcon.getEvents()) && Intrinsics.areEqual(this.resource, vastIcon.resource) && Intrinsics.areEqual(this.width, vastIcon.width) && Intrinsics.areEqual(this.height, vastIcon.height) && Intrinsics.areEqual(this.offset, vastIcon.offset) && Intrinsics.areEqual(this.duration, vastIcon.duration);
    }

    @Nullable
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @Nullable
    public final VastTime getDuration() {
        return this.duration;
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
    public final VastTime getOffset() {
        return this.offset;
    }

    @Nullable
    public final String getProgram() {
        return this.program;
    }

    @Nullable
    public final VastBaseResource getResource() {
        return this.resource;
    }

    @NotNull
    public final String getUid() {
        return this.uid;
    }

    @Nullable
    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.program;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        int iHashCode2 = (iHashCode + (vastClickThrough != null ? vastClickThrough.hashCode() : 0)) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode3 = (iHashCode2 + (events != null ? events.hashCode() : 0)) * 31;
        VastBaseResource vastBaseResource = this.resource;
        int iHashCode4 = (iHashCode3 + (vastBaseResource != null ? vastBaseResource.hashCode() : 0)) * 31;
        Integer num = this.width;
        int iHashCode5 = (iHashCode4 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.height;
        int iHashCode6 = (iHashCode5 + (num2 != null ? num2.hashCode() : 0)) * 31;
        VastTime vastTime = this.offset;
        int iHashCode7 = (iHashCode6 + (vastTime != null ? vastTime.hashCode() : 0)) * 31;
        VastTime vastTime2 = this.duration;
        return iHashCode7 + (vastTime2 != null ? vastTime2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastIcon(program=" + this.program + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", resource=" + this.resource + ", width=" + this.width + ", height=" + this.height + ", offset=" + this.offset + ", duration=" + this.duration + ")";
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
