package com.mobilefuse.videoplayer.controller;

import android.os.Handler;
import android.os.Looper;
import com.ironsource.C4240b4;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.VideoPlayerController;
import com.mobilefuse.videoplayer.controller.PlaybackController;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00020\u00062\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u0003J\u001d\u0010\r\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R$\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00058\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/PlaybackController;", "Lcom/mobilefuse/videoplayer/controller/BaseModuleController;", "<init>", "()V", "Lkotlin/Function2;", "", "", "updateBlock", "startUpdating", "(Lkotlin/jvm/functions/Function2;)V", "stopUpdating", C4240b4.i.L, "duration", "onVideoProgress", "(JJ)V", "Landroid/os/Handler;", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "<set-?>", "videoDuration", "J", "getVideoDuration", "()J", "videoPosition", "getVideoPosition", "", "firstQuartile", "Z", "midpoint", "thirdQuartile", "Ljava/util/Timer;", "videoWatcher", "Ljava/util/Timer;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class PlaybackController extends BaseModuleController {
    private boolean firstQuartile;
    private boolean midpoint;
    private boolean thirdQuartile;
    private long videoPosition;
    private Timer videoWatcher;

    @NotNull
    private final Handler handler = new Handler(Looper.getMainLooper());
    private long videoDuration = -1;

    /* JADX INFO: renamed from: com.mobilefuse.videoplayer.controller.PlaybackController$startUpdating$1, reason: invalid class name */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/mobilefuse/videoplayer/controller/PlaybackController$startUpdating$1", "Ljava/util/TimerTask;", "run", "", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static final class AnonymousClass1 extends TimerTask {
        final /* synthetic */ Function2 $updateBlock;

        AnonymousClass1(Function2 function2) {
            this.$updateBlock = function2;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            PlaybackController.this.getHandler().post(new Runnable() { // from class: com.mobilefuse.videoplayer.controller.PlaybackController$startUpdating$1$run$1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        if (PlaybackController.this.getPlayerState() != VideoPlayer.PlayerState.PLAYING) {
                            return;
                        }
                        PlaybackController playbackController = PlaybackController.this;
                        playbackController.onVideoProgress(playbackController.getVideoPlayer().getCurrentPlaybackPositionMillis(), PlaybackController.this.getVideoPlayer().getPlaybackDurationMillis());
                        PlaybackController.AnonymousClass1 anonymousClass1 = this.this$0;
                        anonymousClass1.$updateBlock.invoke(Long.valueOf(PlaybackController.this.getVideoPosition()), Long.valueOf(PlaybackController.this.getVideoDuration()));
                    } catch (Throwable th2) {
                        StabilityHelper.logException(this.this$0, th2);
                    }
                }
            });
        }
    }

    @NotNull
    public final Handler getHandler() {
        return this.handler;
    }

    public final long getVideoDuration() {
        return this.videoDuration;
    }

    public final long getVideoPosition() {
        return this.videoPosition;
    }

    public final void onVideoProgress(long position, long duration) {
        this.videoPosition = position;
        VideoPlayerController controller = getVideoPlayer().getController();
        if (this.videoDuration == -1) {
            this.videoDuration = duration;
            controller.prepareProgressTrackingEvents();
        }
        controller.onPlaying(this.videoPosition);
        float f10 = this.videoPosition / duration;
        if (f10 > 0.25f && !this.firstQuartile) {
            this.firstQuartile = true;
            controller.sendTrackingEvent(VastTrackingEventType.firstQuartile);
            VideoPlayer.PlaybackListener playbackListener = getVideoPlayer().getPlaybackListener();
            if (playbackListener != null) {
                playbackListener.onVideoFirstQuartile();
            }
        }
        if (f10 > 0.5f && !this.midpoint) {
            this.midpoint = true;
            controller.sendTrackingEvent(VastTrackingEventType.midpoint);
            VideoPlayer.PlaybackListener playbackListener2 = getVideoPlayer().getPlaybackListener();
            if (playbackListener2 != null) {
                playbackListener2.onVideoMidpoint();
            }
        }
        if (f10 <= 0.75f || this.thirdQuartile) {
            return;
        }
        this.thirdQuartile = true;
        controller.sendTrackingEvent(VastTrackingEventType.thirdQuartile);
        VideoPlayer.PlaybackListener playbackListener3 = getVideoPlayer().getPlaybackListener();
        if (playbackListener3 != null) {
            playbackListener3.onVideoThirdQuartile();
        }
    }

    public final void startUpdating(@NotNull Function2<? super Long, ? super Long, Unit> updateBlock) {
        Intrinsics.checkNotNullParameter(updateBlock, "updateBlock");
        Timer timer = new Timer();
        this.videoWatcher = timer;
        timer.schedule(new AnonymousClass1(updateBlock), 0L, 50L);
    }

    public final void stopUpdating() {
        Timer timer = this.videoWatcher;
        if (timer != null) {
            timer.cancel();
            timer.purge();
        }
        this.videoWatcher = null;
    }
}
