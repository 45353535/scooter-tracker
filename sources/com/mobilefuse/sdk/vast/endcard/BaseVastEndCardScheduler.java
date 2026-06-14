package com.mobilefuse.sdk.vast.endcard;

import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardConfig;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J:\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/vast/endcard/BaseVastEndCardScheduler;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "closeButtonDelaySeconds", "", "isLastEndCardCloseable", "", "(FZ)V", "getCloseButtonDelaySeconds", "()F", "()Z", "getNextEndCardConfig", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "presenter", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "earlierViewCloseTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "isLastCompanion", "allowClickthroughWithoutTap", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
public final class BaseVastEndCardScheduler implements EndCardScheduler {
    private final float closeButtonDelaySeconds;
    private final boolean isLastEndCardCloseable;

    public BaseVastEndCardScheduler(float f10, boolean z10) {
        this.closeButtonDelaySeconds = f10;
        this.isLastEndCardCloseable = z10;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    public float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    @NotNull
    public EndCardConfig getNextEndCardConfig(@NotNull EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean isLastCompanion, boolean allowClickthroughWithoutTap, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(companion, "companion");
        return new EndCardConfig(companion, isLastCompanion ? this.isLastEndCardCloseable : true, getCloseButtonDelaySeconds(), false, new Function0<Boolean>() { // from class: com.mobilefuse.sdk.vast.endcard.BaseVastEndCardScheduler.getNextEndCardConfig.1
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return false;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }
        }, -1L, allowClickthroughWithoutTap, closeConfigResponse);
    }

    /* JADX INFO: renamed from: isLastEndCardCloseable, reason: from getter */
    public final boolean getIsLastEndCardCloseable() {
        return this.isLastEndCardCloseable;
    }
}
