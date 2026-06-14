package com.mbridge.msdk.dycreator.baseview.videoview;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ConcatenatingMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: loaded from: classes10.dex */
public class MBVideoView extends FrameLayout implements Player.EventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ExoPlayer f47970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final long f47971d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String[] f47972e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private VideoViewEventListener f47973f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final SurfaceHolder.Callback f47974g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Runnable f47975h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Runnable f47976i;

    /* JADX INFO: renamed from: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView$1, reason: invalid class name */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ MBVideoView f47977a;

        @Override // java.lang.Runnable
        public void run() {
            if (this.f47977a.f47973f != null) {
                this.f47977a.f47973f.onBufferingFail("Buffering timeout");
            }
        }
    }

    public MBVideoView(@NonNull Context context) {
        super(context);
        this.f47968a = "MBVideoView";
        this.f47969b = 1000;
        this.f47971d = 5000L;
        this.f47974g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f47970c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.f47975h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f47973f != null) {
                    MBVideoView.this.f47973f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f47976i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f47970c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f47970c.getCurrentPosition();
                    long duration = MBVideoView.this.f47970c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f47973f != null) {
                        MBVideoView.this.f47973f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public boolean isPlaying() {
        ExoPlayer exoPlayer = this.f47970c;
        return exoPlayer != null && exoPlayer.getPlaybackState() == 3 && this.f47970c.getPlayWhenReady();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("MBVideoView", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0016  */
    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L16
            int r0 = r4.type
            if (r0 == 0) goto L13
            r1 = 1
            if (r0 == r1) goto L10
            r1 = 2
            if (r0 == r1) goto Ld
            goto L16
        Ld:
            java.lang.String r0 = "Play error, because have a UnexpectedException."
            goto L18
        L10:
            java.lang.String r0 = "Play error, because have a RendererException."
            goto L18
        L13:
            java.lang.String r0 = "Play error, because have a SourceException."
            goto L18
        L16:
            java.lang.String r0 = "Play error and ExoPlayer have not message."
        L18:
            java.lang.Throwable r1 = r4.getCause()
            if (r1 == 0) goto L34
            java.lang.Throwable r1 = r4.getCause()
            java.lang.String r1 = r1.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L34
            java.lang.Throwable r0 = r4.getCause()
            java.lang.String r0 = r0.getMessage()
        L34:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "onPlayerError : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "MBVideoView"
            com.mbridge.msdk.foundation.tools.q0.b(r2, r1)
            com.mbridge.msdk.dycreator.baseview.videoview.listener.VideoViewEventListener r1 = r3.f47973f
            if (r1 == 0) goto L53
            int r4 = r4.type
            r1.onPlayerError(r4, r0)
        L53:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.onPlayerError(com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException):void");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("MBVideoView", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("MBVideoView", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("MBVideoView", "onPlaybackStateChanged : Buffering");
        } else if (i10 == 3) {
            q0.b("MBVideoView", "onPlaybackStateChanged : READY");
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("MBVideoView", "onPlaybackStateChanged : Ended : PLAY ENDED");
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
        this.f47970c.getCurrentWindowIndex();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onRepeatModeChanged(int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onSeekProcessed() {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onShuffleModeEnabledChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTimelineChanged(Timeline timeline, @Nullable Object obj, int i10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onTracksChanged(TrackGroupArray trackGroupArray, TrackSelectionArray trackSelectionArray) {
    }

    public void pause() {
    }

    public void play() {
    }

    public void setVideoUrl(String... strArr) {
        if (strArr == null || strArr.length <= 0) {
            return;
        }
        this.f47972e = strArr;
        a();
    }

    public void setVideoViewEventLister(VideoViewEventListener videoViewEventListener) {
        this.f47973f = videoViewEventListener;
    }

    public void stop() {
    }

    private void a() {
        try {
            this.f47970c = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(getContext()), new DefaultTrackSelector(), new DefaultLoadControl());
            ConcatenatingMediaSource concatenatingMediaSource = new ConcatenatingMediaSource();
            for (String str : this.f47972e) {
                concatenatingMediaSource.addMediaSource(new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(getContext(), "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str)));
            }
            this.f47970c.setRepeatMode(0);
            this.f47970c.prepare(concatenatingMediaSource);
            this.f47970c.addListener(this);
        } catch (Throwable th2) {
            q0.b("MBVideoView", th2.getMessage());
            th2.toString();
        }
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f47968a = "MBVideoView";
        this.f47969b = 1000;
        this.f47971d = 5000L;
        this.f47974g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f47970c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.f47975h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f47973f != null) {
                    MBVideoView.this.f47973f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f47976i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f47970c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f47970c.getCurrentPosition();
                    long duration = MBVideoView.this.f47970c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f47973f != null) {
                        MBVideoView.this.f47973f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f47968a = "MBVideoView";
        this.f47969b = 1000;
        this.f47971d = 5000L;
        this.f47974g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i102, int i11, int i12) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f47970c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.f47975h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f47973f != null) {
                    MBVideoView.this.f47973f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f47976i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f47970c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f47970c.getCurrentPosition();
                    long duration = MBVideoView.this.f47970c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f47973f != null) {
                        MBVideoView.this.f47973f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }

    @RequiresApi(api = 21)
    public MBVideoView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f47968a = "MBVideoView";
        this.f47969b = 1000;
        this.f47971d = 5000L;
        this.f47974g = new SurfaceHolder.Callback() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.2
            @Override // android.view.SurfaceHolder.Callback
            public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i102, int i112, int i12) {
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
                try {
                    Player.VideoComponent videoComponent = MBVideoView.this.f47970c.getVideoComponent();
                    if (videoComponent != null) {
                        videoComponent.setVideoSurfaceHolder(surfaceHolder);
                    }
                } catch (Throwable th2) {
                    q0.b("MBVideoView", th2.getMessage());
                }
            }

            @Override // android.view.SurfaceHolder.Callback
            public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
            }
        };
        this.f47975h = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.3
            @Override // java.lang.Runnable
            public void run() {
                if (MBVideoView.this.f47973f != null) {
                    MBVideoView.this.f47973f.onBufferingFail("Buffering fail.");
                }
            }
        };
        this.f47976i = new Runnable() { // from class: com.mbridge.msdk.dycreator.baseview.videoview.MBVideoView.4
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (MBVideoView.this.f47970c == null || !MBVideoView.this.isPlaying()) {
                        return;
                    }
                    long currentPosition = MBVideoView.this.f47970c.getCurrentPosition();
                    long duration = MBVideoView.this.f47970c.getDuration();
                    int iRound = Math.round(currentPosition / 1000.0f);
                    int iRound2 = Math.round(duration / 1000.0f);
                    q0.c("MBVideoView", "currentPosition:" + iRound + " duration:" + duration);
                    if (MBVideoView.this.f47973f != null) {
                        MBVideoView.this.f47973f.onPlayProgress(iRound, iRound2);
                    }
                    MBVideoView.this.getHandler().postDelayed(this, 1000L);
                } catch (Exception e10) {
                    q0.b("MBVideoView", e10.getMessage());
                }
            }
        };
    }
}
