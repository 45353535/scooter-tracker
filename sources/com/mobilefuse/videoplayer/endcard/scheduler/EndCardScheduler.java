package com.mobilefuse.videoplayer.endcard.scheduler;

import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J>\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "", "closeButtonDelaySeconds", "", "getCloseButtonDelaySeconds", "()F", "getNextEndCardConfig", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "presenter", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "earlierViewCloseTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "isLastCompanion", "", "allowClickthroughWithoutTap", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface EndCardScheduler {

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public static final class DefaultImpls {
        public static /* synthetic */ EndCardConfig getNextEndCardConfig$default(EndCardScheduler endCardScheduler, EndCardPresenter endCardPresenter, ViewCloseTrigger viewCloseTrigger, VastCompanion vastCompanion, boolean z10, boolean z11, CloseConfigResponse closeConfigResponse, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getNextEndCardConfig");
            }
            if ((i10 & 16) != 0) {
                z11 = false;
            }
            return endCardScheduler.getNextEndCardConfig(endCardPresenter, viewCloseTrigger, vastCompanion, z10, z11, closeConfigResponse);
        }
    }

    float getCloseButtonDelaySeconds();

    @Nullable
    EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean isLastCompanion, boolean allowClickthroughWithoutTap, @Nullable CloseConfigResponse closeConfigResponse);
}
