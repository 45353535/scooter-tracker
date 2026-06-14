package com.mobilefuse.videoplayer.media;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u00108\u001a\u00020\u0018H\u0002J\u0010\u00109\u001a\u00020\u00062\u0006\u0010:\u001a\u00020\u001eH\u0002J\u0006\u0010;\u001a\u00020\u0018J\u0006\u0010<\u001a\u00020\u0018J\u0006\u0010=\u001a\u00020\u0018J\b\u0010>\u001a\u00020\u0018H\u0002J\u0006\u0010?\u001a\u00020\u0018J\u0006\u0010@\u001a\u00020\u0018J&\u0010A\u001a\u00020\u00182\u0006\u0010B\u001a\u00020C2\b\b\u0002\u0010+\u001a\u00020*2\f\u0010D\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\n\u0010\bR\u0011\u0010\u000b\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\f\u0010\bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0013\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\bR\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R(\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0018\u0018\u00010 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010+\u001a\u00020*2\u0006\u0010)\u001a\u00020*@FX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R$\u00103\u001a\u0002022\u0006\u0010)\u001a\u000202@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107¨\u0006E"}, d2 = {"Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "Landroid/widget/FrameLayout;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "canApplyFullscreen", "", "getCanApplyFullscreen", "()Z", "canPause", "getCanPause", "canPlay", "getCanPlay", "currentPosition", "", "getCurrentPosition", "()I", "duration", "getDuration", "isDestroyed", "mediaPlayer", "Landroid/media/MediaPlayer;", "playbackCompletionListener", "Lkotlin/Function0;", "", "getPlaybackCompletionListener", "()Lkotlin/jvm/functions/Function0;", "setPlaybackCompletionListener", "(Lkotlin/jvm/functions/Function0;)V", "playerState", "Lcom/mobilefuse/videoplayer/media/MediaPlayerState;", "playerStateChangeListener", "Lkotlin/Function1;", "getPlayerStateChangeListener", "()Lkotlin/jvm/functions/Function1;", "setPlayerStateChangeListener", "(Lkotlin/jvm/functions/Function1;)V", "videoView", "Lcom/mobilefuse/videoplayer/media/VideoViewInterface;", "videoViewParams", "Landroid/widget/FrameLayout$LayoutParams;", "value", "Lcom/mobilefuse/videoplayer/media/ViewType;", "viewType", "getViewType$annotations", "()V", "getViewType", "()Lcom/mobilefuse/videoplayer/media/ViewType;", "setViewType", "(Lcom/mobilefuse/videoplayer/media/ViewType;)V", "", "volume", "getVolume", "()F", "setVolume", "(F)V", "applyViewType", "changePlayerState", "newState", "destroy", "onBecameInvisible", "onBecameVisible", "onMediaPlayerPrepared", "pause", "play", "prepare", "videoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "prepareCompletedAction", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class MobileFusePlayer extends FrameLayout {
    private final MediaPlayer mediaPlayer;

    @Nullable
    private Function0<Unit> playbackCompletionListener;
    private MediaPlayerState playerState;

    @Nullable
    private Function1<? super MediaPlayerState, Unit> playerStateChangeListener;
    private VideoViewInterface videoView;
    private final FrameLayout.LayoutParams videoViewParams;

    @NotNull
    private ViewType viewType;
    private float volume;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MobileFusePlayer(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.playerState = MediaPlayerState.IDLE;
        this.mediaPlayer = new MediaPlayer();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        Unit unit = Unit.f93236a;
        this.videoViewParams = layoutParams;
        this.viewType = ViewType.SURFACE_VIEW;
        this.volume = 1.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void applyViewType() {
        VideoViewInterface mobileFuseVideoTextureView;
        if (getCanPlay() || getCanPause()) {
            VideoViewInterface videoViewInterface = this.videoView;
            if (videoViewInterface != 0) {
                this.mediaPlayer.setDisplay(null);
                this.mediaPlayer.setSurface(null);
                videoViewInterface.destroy();
                removeView((View) videoViewInterface);
                this.videoView = null;
            }
            if (this.viewType == ViewType.SURFACE_VIEW) {
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                mobileFuseVideoTextureView = new MobileFuseVideoSurfaceView(context, this.mediaPlayer);
            } else {
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "context");
                mobileFuseVideoTextureView = new MobileFuseVideoTextureView(context2, this.mediaPlayer);
            }
            this.videoView = mobileFuseVideoTextureView;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean changePlayerState(MediaPlayerState newState) {
        if (newState == this.playerState) {
            return false;
        }
        DebuggingKt.logDebug$default(this, "Changed Player state from " + this.playerState + " to " + newState, null, 2, null);
        this.playerState = newState;
        Function1<? super MediaPlayerState, Unit> function1 = this.playerStateChangeListener;
        if (function1 == null) {
            return true;
        }
        function1.invoke(newState);
        return true;
    }

    public static /* synthetic */ void getViewType$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaPlayerPrepared() {
        if (changePlayerState(MediaPlayerState.PREPARED)) {
            applyViewType();
        }
    }

    public static /* synthetic */ void prepare$default(MobileFusePlayer mobileFusePlayer, VideoSource videoSource, ViewType viewType, Function0 function0, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            viewType = ViewType.SURFACE_VIEW;
        }
        mobileFusePlayer.prepare(videoSource, viewType, function0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void destroy() {
        try {
            if (changePlayerState(MediaPlayerState.DESTROYED)) {
                this.mediaPlayer.reset();
                this.mediaPlayer.release();
                VideoViewInterface videoViewInterface = this.videoView;
                if (videoViewInterface != 0) {
                    videoViewInterface.destroy();
                    removeView((View) videoViewInterface);
                    this.videoView = null;
                }
            }
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
    }

    public final boolean getCanApplyFullscreen() {
        return getCanPlay() || getCanPause();
    }

    public final boolean getCanPause() {
        MediaPlayerState mediaPlayerState = this.playerState;
        return mediaPlayerState == MediaPlayerState.PREPARED || mediaPlayerState == MediaPlayerState.PLAYING;
    }

    public final boolean getCanPlay() {
        MediaPlayerState mediaPlayerState = this.playerState;
        return mediaPlayerState == MediaPlayerState.PREPARED || mediaPlayerState == MediaPlayerState.PAUSED;
    }

    public final int getCurrentPosition() {
        try {
            return this.mediaPlayer.getCurrentPosition();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    public final int getDuration() {
        try {
            return this.mediaPlayer.getDuration();
        } catch (Exception e10) {
            e10.printStackTrace();
            return 0;
        }
    }

    @Nullable
    public final Function0<Unit> getPlaybackCompletionListener() {
        return this.playbackCompletionListener;
    }

    @Nullable
    public final Function1<MediaPlayerState, Unit> getPlayerStateChangeListener() {
        return this.playerStateChangeListener;
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }

    public final float getVolume() {
        return this.volume;
    }

    public final boolean isDestroyed() {
        return this.playerState == MediaPlayerState.DESTROYED;
    }

    public final void onBecameInvisible() {
        Object obj = this.videoView;
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = (ViewGroup) (parent instanceof ViewGroup ? parent : null);
        if (viewGroup != null) {
            viewGroup.removeView(view);
        }
    }

    public final void onBecameVisible() {
        Object obj = this.videoView;
        if (!(obj instanceof View)) {
            obj = null;
        }
        View view = (View) obj;
        if (view != null && view.getParent() == null) {
            Object obj2 = this.videoView;
            if (obj2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            addView((View) obj2, this.videoViewParams);
        }
    }

    public final void pause() {
        if (getCanPause()) {
            this.mediaPlayer.pause();
            changePlayerState(MediaPlayerState.PAUSED);
        }
    }

    public final void play() {
        if (getCanPlay()) {
            this.mediaPlayer.start();
            changePlayerState(MediaPlayerState.PLAYING);
        }
    }

    public final void prepare(@NotNull final VideoSource videoSource, @NotNull ViewType viewType, @NotNull final Function0<Unit> prepareCompletedAction) {
        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
        Intrinsics.checkNotNullParameter(viewType, "viewType");
        Intrinsics.checkNotNullParameter(prepareCompletedAction, "prepareCompletedAction");
        if (changePlayerState(MediaPlayerState.PREPARING)) {
            setViewType(viewType);
            try {
                this.mediaPlayer.setAudioAttributes(new AudioAttributes.Builder().setContentType(3).setUsage(1).build());
                this.mediaPlayer.setOnErrorListener(new MediaPlayer.OnErrorListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer.prepare.1
                    @Override // android.media.MediaPlayer.OnErrorListener
                    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
                        DebuggingKt.logDebug$default(MobileFusePlayer.this, "MediaPlayer onError", null, 2, null);
                        return MobileFusePlayer.this.changePlayerState(MediaPlayerState.ERROR);
                    }
                });
                this.mediaPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer.prepare.2
                    @Override // android.media.MediaPlayer.OnCompletionListener
                    public final void onCompletion(MediaPlayer mediaPlayer) {
                        MobileFusePlayer.this.changePlayerState(MediaPlayerState.COMPLETED);
                        Function0<Unit> playbackCompletionListener = MobileFusePlayer.this.getPlaybackCompletionListener();
                        if (playbackCompletionListener != null) {
                            playbackCompletionListener.invoke();
                        }
                    }
                });
                this.mediaPlayer.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer.prepare.3
                    @Override // android.media.MediaPlayer.OnPreparedListener
                    public final void onPrepared(MediaPlayer mediaPlayer) {
                        if (MobileFusePlayer.this.isDestroyed()) {
                            return;
                        }
                        MobileFusePlayer.this.onMediaPlayerPrepared();
                        prepareCompletedAction.invoke();
                    }
                });
                this.mediaPlayer.setScreenOnWhilePlaying(true);
                SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.media.MobileFusePlayer.prepare.4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() throws IOException {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:13:0x0045  */
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final void invoke2() throws java.io.IOException {
                        /*
                            r5 = this;
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            com.mobilefuse.videoplayer.media.MediaPlayerState r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.access$getPlayerState$p(r0)
                            com.mobilefuse.videoplayer.media.MediaPlayerState r1 = com.mobilefuse.videoplayer.media.MediaPlayerState.PREPARING
                            if (r0 == r1) goto L14
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            java.lang.String r1 = "Can't set Media Player data source because the Video Player has been already destroyed."
                            r2 = 2
                            r3 = 0
                            com.mobilefuse.sdk.DebuggingKt.logDebug$default(r0, r1, r3, r2, r3)
                            return
                        L14:
                            com.mobilefuse.videoplayer.model.VideoSource r0 = r2
                            boolean r0 = r0.getVideoStreamEnabled()
                            if (r0 != 0) goto L4c
                            com.mobilefuse.videoplayer.model.VideoSource r0 = r2
                            java.lang.String r0 = r0.getLocalFileCacheKey()
                            com.mobilefuse.videoplayer.VideoCache r1 = com.mobilefuse.videoplayer.VideoCache.INSTANCE
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r2 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            android.content.Context r2 = r2.getContext()
                            java.lang.String r3 = "context"
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
                            java.lang.String r2 = r1.getCachedFilePath(r2, r0)
                            if (r2 == 0) goto L45
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r4 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            android.content.Context r4 = r4.getContext()
                            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r3)
                            boolean r0 = r1.cachedFileExists(r4, r0)
                            if (r0 == 0) goto L45
                            goto L52
                        L45:
                            com.mobilefuse.videoplayer.model.VideoSource r0 = r2
                            java.lang.String r2 = r0.getRemoteUrl()
                            goto L52
                        L4c:
                            com.mobilefuse.videoplayer.model.VideoSource r0 = r2
                            java.lang.String r2 = r0.getRemoteUrl()
                        L52:
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            android.media.MediaPlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.access$getMediaPlayer$p(r0)
                            r0.setDataSource(r2)
                            com.mobilefuse.videoplayer.media.MobileFusePlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.this
                            android.media.MediaPlayer r0 = com.mobilefuse.videoplayer.media.MobileFusePlayer.access$getMediaPlayer$p(r0)
                            r0.prepareAsync()
                            return
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.videoplayer.media.MobileFusePlayer.AnonymousClass4.invoke2():void");
                    }
                }, 1, null);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    }

    public final void setPlaybackCompletionListener(@Nullable Function0<Unit> function0) {
        this.playbackCompletionListener = function0;
    }

    public final void setPlayerStateChangeListener(@Nullable Function1<? super MediaPlayerState, Unit> function1) {
        this.playerStateChangeListener = function1;
    }

    public final void setViewType(@NotNull ViewType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.viewType == value) {
            return;
        }
        this.viewType = value;
        applyViewType();
    }

    public final void setVolume(float f10) {
        try {
            this.volume = f10;
            this.mediaPlayer.setVolume(f10, f10);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }
}
