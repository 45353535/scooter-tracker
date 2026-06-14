package com.mobilefuse.videoplayer.model;

import com.mobilefuse.videoplayer.model.VastEventOwner;
import com.my.target.common.menu.MenuActionType;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B[\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000f\u0010 \u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0003Jm\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020+HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0018¨\u0006,"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastLinear;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "skipOffset", "Lcom/mobilefuse/videoplayer/model/VastTime;", "duration", "clickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "mediaFiles", "", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "verifiedMediaFiles", "icons", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "(Lcom/mobilefuse/videoplayer/model/VastTime;Lcom/mobilefuse/videoplayer/model/VastTime;Lcom/mobilefuse/videoplayer/model/VastClickThrough;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getClickThrough", "()Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "getDuration", "()Lcom/mobilefuse/videoplayer/model/VastTime;", "getEvents", "()Ljava/util/Set;", "getIcons", "()Ljava/util/List;", "getMediaFiles", "getSkipOffset", "getVerifiedMediaFiles", "component1", "component2", "component3", "component4", "component5", "component6", "component7", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastLinear implements VastEventOwner {

    @Nullable
    private final VastClickThrough clickThrough;

    @Nullable
    private final VastTime duration;

    @NotNull
    private final Set<VastEvent> events;

    @NotNull
    private final List<VastIcon> icons;

    @NotNull
    private final List<VastMediaFile> mediaFiles;

    @Nullable
    private final VastTime skipOffset;

    @NotNull
    private final List<VastMediaFile> verifiedMediaFiles;

    public VastLinear(@Nullable VastTime vastTime, @Nullable VastTime vastTime2, @Nullable VastClickThrough vastClickThrough, @NotNull Set<VastEvent> events, @NotNull List<VastMediaFile> mediaFiles, @NotNull List<VastMediaFile> verifiedMediaFiles, @NotNull List<VastIcon> icons) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(verifiedMediaFiles, "verifiedMediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        this.skipOffset = vastTime;
        this.duration = vastTime2;
        this.clickThrough = vastClickThrough;
        this.events = events;
        this.mediaFiles = mediaFiles;
        this.verifiedMediaFiles = verifiedMediaFiles;
        this.icons = icons;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastLinear copy$default(VastLinear vastLinear, VastTime vastTime, VastTime vastTime2, VastClickThrough vastClickThrough, Set set, List list, List list2, List list3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            vastTime = vastLinear.skipOffset;
        }
        if ((i10 & 2) != 0) {
            vastTime2 = vastLinear.duration;
        }
        if ((i10 & 4) != 0) {
            vastClickThrough = vastLinear.clickThrough;
        }
        if ((i10 & 8) != 0) {
            set = vastLinear.getEvents();
        }
        if ((i10 & 16) != 0) {
            list = vastLinear.mediaFiles;
        }
        if ((i10 & 32) != 0) {
            list2 = vastLinear.verifiedMediaFiles;
        }
        if ((i10 & 64) != 0) {
            list3 = vastLinear.icons;
        }
        List list4 = list2;
        List list5 = list3;
        List list6 = list;
        VastClickThrough vastClickThrough2 = vastClickThrough;
        return vastLinear.copy(vastTime, vastTime2, vastClickThrough2, set, list6, list4, list5);
    }

    @Nullable
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final VastTime getSkipOffset() {
        return this.skipOffset;
    }

    @Nullable
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final VastTime getDuration() {
        return this.duration;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final VastClickThrough getClickThrough() {
        return this.clickThrough;
    }

    @NotNull
    public final Set<VastEvent> component4() {
        return getEvents();
    }

    @NotNull
    public final List<VastMediaFile> component5() {
        return this.mediaFiles;
    }

    @NotNull
    public final List<VastMediaFile> component6() {
        return this.verifiedMediaFiles;
    }

    @NotNull
    public final List<VastIcon> component7() {
        return this.icons;
    }

    @NotNull
    public final VastLinear copy(@Nullable VastTime skipOffset, @Nullable VastTime duration, @Nullable VastClickThrough clickThrough, @NotNull Set<VastEvent> events, @NotNull List<VastMediaFile> mediaFiles, @NotNull List<VastMediaFile> verifiedMediaFiles, @NotNull List<VastIcon> icons) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(verifiedMediaFiles, "verifiedMediaFiles");
        Intrinsics.checkNotNullParameter(icons, "icons");
        return new VastLinear(skipOffset, duration, clickThrough, events, mediaFiles, verifiedMediaFiles, icons);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastLinear)) {
            return false;
        }
        VastLinear vastLinear = (VastLinear) other;
        return Intrinsics.areEqual(this.skipOffset, vastLinear.skipOffset) && Intrinsics.areEqual(this.duration, vastLinear.duration) && Intrinsics.areEqual(this.clickThrough, vastLinear.clickThrough) && Intrinsics.areEqual(getEvents(), vastLinear.getEvents()) && Intrinsics.areEqual(this.mediaFiles, vastLinear.mediaFiles) && Intrinsics.areEqual(this.verifiedMediaFiles, vastLinear.verifiedMediaFiles) && Intrinsics.areEqual(this.icons, vastLinear.icons);
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

    @NotNull
    public final List<VastIcon> getIcons() {
        return this.icons;
    }

    @NotNull
    public final List<VastMediaFile> getMediaFiles() {
        return this.mediaFiles;
    }

    @Nullable
    public final VastTime getSkipOffset() {
        return this.skipOffset;
    }

    @NotNull
    public final List<VastMediaFile> getVerifiedMediaFiles() {
        return this.verifiedMediaFiles;
    }

    public int hashCode() {
        VastTime vastTime = this.skipOffset;
        int iHashCode = (vastTime != null ? vastTime.hashCode() : 0) * 31;
        VastTime vastTime2 = this.duration;
        int iHashCode2 = (iHashCode + (vastTime2 != null ? vastTime2.hashCode() : 0)) * 31;
        VastClickThrough vastClickThrough = this.clickThrough;
        int iHashCode3 = (iHashCode2 + (vastClickThrough != null ? vastClickThrough.hashCode() : 0)) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode4 = (iHashCode3 + (events != null ? events.hashCode() : 0)) * 31;
        List<VastMediaFile> list = this.mediaFiles;
        int iHashCode5 = (iHashCode4 + (list != null ? list.hashCode() : 0)) * 31;
        List<VastMediaFile> list2 = this.verifiedMediaFiles;
        int iHashCode6 = (iHashCode5 + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<VastIcon> list3 = this.icons;
        return iHashCode6 + (list3 != null ? list3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastLinear(skipOffset=" + this.skipOffset + ", duration=" + this.duration + ", clickThrough=" + this.clickThrough + ", events=" + getEvents() + ", mediaFiles=" + this.mediaFiles + ", verifiedMediaFiles=" + this.verifiedMediaFiles + ", icons=" + this.icons + ")";
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
