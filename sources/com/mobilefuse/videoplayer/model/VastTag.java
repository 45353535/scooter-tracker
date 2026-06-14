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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J5\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastTag;", "Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "vastVersion", "", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "adList", "", "Lcom/mobilefuse/videoplayer/model/VastAd;", "(Ljava/lang/String;Ljava/util/Set;Ljava/util/List;)V", "getAdList", "()Ljava/util/List;", "getEvents", "()Ljava/util/Set;", "component1", "component2", "component3", MenuActionType.COPY, "equals", "", "other", "", "hashCode", "", "toString", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final /* data */ class VastTag implements VastEventOwner {

    @NotNull
    private final List<VastAd> adList;

    @NotNull
    private final Set<VastEvent> events;
    private final String vastVersion;

    public VastTag(@Nullable String str, @NotNull Set<VastEvent> events, @NotNull List<VastAd> adList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adList, "adList");
        this.vastVersion = str;
        this.events = events;
        this.adList = adList;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    private final String getVastVersion() {
        return this.vastVersion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastTag copy$default(VastTag vastTag, String str, Set set, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = vastTag.vastVersion;
        }
        if ((i10 & 2) != 0) {
            set = vastTag.getEvents();
        }
        if ((i10 & 4) != 0) {
            list = vastTag.adList;
        }
        return vastTag.copy(str, set, list);
    }

    @NotNull
    public final Set<VastEvent> component2() {
        return getEvents();
    }

    @NotNull
    public final List<VastAd> component3() {
        return this.adList;
    }

    @NotNull
    public final VastTag copy(@Nullable String vastVersion, @NotNull Set<VastEvent> events, @NotNull List<VastAd> adList) {
        Intrinsics.checkNotNullParameter(events, "events");
        Intrinsics.checkNotNullParameter(adList, "adList");
        return new VastTag(vastVersion, events, adList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VastTag)) {
            return false;
        }
        VastTag vastTag = (VastTag) other;
        return Intrinsics.areEqual(this.vastVersion, vastTag.vastVersion) && Intrinsics.areEqual(getEvents(), vastTag.getEvents()) && Intrinsics.areEqual(this.adList, vastTag.adList);
    }

    @NotNull
    public final List<VastAd> getAdList() {
        return this.adList;
    }

    @Override // com.mobilefuse.videoplayer.model.VastEventOwner
    @NotNull
    public Set<VastEvent> getEvents(@NotNull EventType eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        return VastEventOwner.DefaultImpls.getEvents(this, eventType);
    }

    public int hashCode() {
        String str = this.vastVersion;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Set<VastEvent> events = getEvents();
        int iHashCode2 = (iHashCode + (events != null ? events.hashCode() : 0)) * 31;
        List<VastAd> list = this.adList;
        return iHashCode2 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "VastTag(vastVersion=" + this.vastVersion + ", events=" + getEvents() + ", adList=" + this.adList + ")";
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
