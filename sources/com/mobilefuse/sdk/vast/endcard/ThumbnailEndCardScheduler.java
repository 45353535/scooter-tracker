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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J<\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\f2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u000b\u001a\u00020\f*\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/mobilefuse/sdk/vast/endcard/ThumbnailEndCardScheduler;", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "closeButtonDelaySeconds", "", "autoCloseDelayMillis", "", "(FJ)V", "getAutoCloseDelayMillis", "()J", "getCloseButtonDelaySeconds", "()F", "isThumbnailModeActive", "", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "(Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;)Z", "getNextEndCardConfig", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardConfig;", "presenter", "earlierViewCloseTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "companion", "Lcom/mobilefuse/videoplayer/model/VastCompanion;", "isLastCompanion", "allowClickthroughWithoutTap", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "mobilefuse-sdk-vast_release"}, k = 1, mv = {1, 4, 3})
public final class ThumbnailEndCardScheduler implements EndCardScheduler {
    private final long autoCloseDelayMillis;
    private final float closeButtonDelaySeconds;

    public ThumbnailEndCardScheduler(float f10, long j10) {
        this.closeButtonDelaySeconds = f10;
        this.autoCloseDelayMillis = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isThumbnailModeActive(EndCardPresenter endCardPresenter) {
        return !endCardPresenter.getFullscreenMode();
    }

    public final long getAutoCloseDelayMillis() {
        return this.autoCloseDelayMillis;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    public float getCloseButtonDelaySeconds() {
        return this.closeButtonDelaySeconds;
    }

    @Override // com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler
    @Nullable
    public EndCardConfig getNextEndCardConfig(@NotNull final EndCardPresenter presenter, @NotNull ViewCloseTrigger earlierViewCloseTrigger, @NotNull VastCompanion companion, boolean isLastCompanion, boolean allowClickthroughWithoutTap, @Nullable CloseConfigResponse closeConfigResponse) {
        Intrinsics.checkNotNullParameter(presenter, "presenter");
        Intrinsics.checkNotNullParameter(earlierViewCloseTrigger, "earlierViewCloseTrigger");
        Intrinsics.checkNotNullParameter(companion, "companion");
        if (isThumbnailModeActive(presenter) && earlierViewCloseTrigger == ViewCloseTrigger.USER) {
            return null;
        }
        return new EndCardConfig(companion, true, getCloseButtonDelaySeconds(), isThumbnailModeActive(presenter), new Function0<Boolean>() { // from class: com.mobilefuse.sdk.vast.endcard.ThumbnailEndCardScheduler.getNextEndCardConfig.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Boolean invoke() {
                return Boolean.valueOf(invoke2());
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final boolean invoke2() {
                return ThumbnailEndCardScheduler.this.isThumbnailModeActive(presenter);
            }
        }, this.autoCloseDelayMillis, allowClickthroughWithoutTap, closeConfigResponse);
    }
}
