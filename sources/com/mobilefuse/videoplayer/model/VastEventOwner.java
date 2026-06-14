package com.mobilefuse.videoplayer.model;

import com.ironsource.C4240b4;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0016\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u0016J \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016R\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/mobilefuse/videoplayer/model/VastEventOwner;", "", "events", "", "Lcom/mobilefuse/videoplayer/model/VastEvent;", "getEvents", "()Ljava/util/Set;", "eventType", "Lcom/mobilefuse/videoplayer/model/EventType;", C4240b4.i.f42633j0, "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface VastEventOwner {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastEventOwner vastEventOwner, @NotNull EventType eventType) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            return vastEventOwner.getEvents(eventType, null);
        }

        @NotNull
        public static Set<VastEvent> getEvents(@NotNull VastEventOwner vastEventOwner, @NotNull EventType eventType, @Nullable String str) {
            Intrinsics.checkNotNullParameter(eventType, "eventType");
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            for (VastEvent vastEvent : vastEventOwner.getEvents()) {
                if (vastEvent.getEventType() == eventType) {
                    if (str == null) {
                        linkedHashSet.add(vastEvent);
                    } else if (vastEvent.getEventName() != null && Intrinsics.areEqual(vastEvent.getEventName(), str)) {
                        linkedHashSet.add(vastEvent);
                    }
                }
            }
            return linkedHashSet;
        }
    }

    @NotNull
    Set<VastEvent> getEvents();

    @NotNull
    Set<VastEvent> getEvents(@NotNull EventType eventType);

    @NotNull
    Set<VastEvent> getEvents(@NotNull EventType eventType, @Nullable String eventName);
}
