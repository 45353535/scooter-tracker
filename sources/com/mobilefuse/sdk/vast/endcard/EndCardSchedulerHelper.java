package com.mobilefuse.sdk.vast.endcard;

import com.mobilefuse.videoplayer.VideoPlayer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0007J \u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\rH\u0007¨\u0006\u000e"}, d2 = {"Lcom/mobilefuse/sdk/vast/endcard/EndCardSchedulerHelper;", "", "()V", "applyBaseVastScheduler", "", "player", "Lcom/mobilefuse/videoplayer/VideoPlayer;", "closeButtonDelaySeconds", "", "lastEndCardCloseable", "", "applyThumbnailScheduler", "autoCloseDelayMillis", "", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
public final class EndCardSchedulerHelper {

    @NotNull
    public static final EndCardSchedulerHelper INSTANCE = new EndCardSchedulerHelper();

    private EndCardSchedulerHelper() {
    }

    public static final void applyBaseVastScheduler(@NotNull VideoPlayer player, float closeButtonDelaySeconds, boolean lastEndCardCloseable) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setEndCardScheduler(new BaseVastEndCardScheduler(closeButtonDelaySeconds, lastEndCardCloseable));
    }

    public static final void applyThumbnailScheduler(@NotNull VideoPlayer player, float closeButtonDelaySeconds, long autoCloseDelayMillis) {
        Intrinsics.checkNotNullParameter(player, "player");
        player.setEndCardScheduler(new ThumbnailEndCardScheduler(closeButtonDelaySeconds, autoCloseDelayMillis));
    }
}
