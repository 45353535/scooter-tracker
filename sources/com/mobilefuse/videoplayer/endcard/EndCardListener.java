package com.mobilefuse.videoplayer.endcard;

import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH&J\b\u0010\u000b\u001a\u00020\u0003H&J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH&J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H&¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/EndCardListener;", "", "onClicked", "", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "clickThrough", "Lcom/mobilefuse/videoplayer/model/VastClickThrough;", "onClosed", "closeTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "onCompleted", "onError", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "onTrackingEvent", "eventType", "Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface EndCardListener {
    void onClicked(@NotNull VastCompanion companion, @Nullable VastClickThrough clickThrough);

    void onClosed(@NotNull VastCompanion companion, @NotNull ViewCloseTrigger closeTrigger);

    void onCompleted();

    void onError(@NotNull VastError error);

    void onTrackingEvent(@NotNull VastCompanion companion, @NotNull VastTrackingEventType eventType);
}
