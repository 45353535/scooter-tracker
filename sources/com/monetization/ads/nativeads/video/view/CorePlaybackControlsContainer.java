package com.monetization.ads.nativeads.video.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.mobile.ads.R$id;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import yads.sj1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/monetization/ads/nativeads/video/view/CorePlaybackControlsContainer;", "Landroid/widget/FrameLayout;", "Lyads/sj1;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
public class CorePlaybackControlsContainer extends FrameLayout implements sj1 {
    public CorePlaybackControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // yads.sj1
    public TextView getCountDownProgress() {
        return (TextView) findViewById(R$id.video_count_down_control);
    }

    @Override // yads.sj1
    public CheckBox getMuteControl() {
        return (CheckBox) findViewById(R$id.video_mute_control);
    }

    @Override // yads.sj1
    public ProgressBar getVideoProgress() {
        return (ProgressBar) findViewById(R$id.video_progress_control);
    }
}
