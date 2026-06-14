package com.pubmatic.sdk.video.player;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.Looper;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.video.player.POBPlayer;
import com.pubmatic.sdk.video.player.POBVideoPlayer;

/* JADX INFO: loaded from: classes11.dex */
@SuppressLint({"LongLogTag"})
@MainThread
public class POBVideoPlayerView extends FrameLayout implements POBVideoPlayer, SurfaceHolder.Callback, POBPlayer.POBPlayerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f63136a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SurfaceView f63137b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private POBPlayer f63138c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private POBVideoPlayerListener f63139d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private POBPlayerController f63140e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f63141f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f63142g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private POBVideoPlayer.VideoPlayerState f63143h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f63144i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final View.OnClickListener f63145j;

    public interface POBVideoPlayerListener {
        void onBufferUpdate(int i10);

        void onClick();

        void onCompletion();

        void onFailure(int i10, @NonNull String str);

        void onMute(boolean z10);

        void onPause();

        void onProgressUpdate(int i10);

        void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView);

        void onResume();

        void onStart();
    }

    class a implements View.OnClickListener {
        a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (POBVideoPlayerView.this.f63139d != null) {
                POBVideoPlayerView.this.f63139d.onClick();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (POBVideoPlayerView.this.f63138c != null) {
                POBVideoPlayerView pOBVideoPlayerView = POBVideoPlayerView.this;
                pOBVideoPlayerView.setVideoSize(pOBVideoPlayerView.f63138c);
            }
        }
    }

    public POBVideoPlayerView(@NonNull Context context) {
        super(context);
        this.f63136a = 20000;
        this.f63145j = new a();
        this.f63137b = new SurfaceView(getContext());
        a();
        this.f63143h = POBVideoPlayer.VideoPlayerState.UNKNOWN;
    }

    private void setPlayerState(@NonNull POBVideoPlayer.VideoPlayerState videoPlayerState) {
        this.f63143h = videoPlayerState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVideoSize(@NonNull POBPlayer pOBPlayer) {
        float videoWidth = pOBPlayer.getVideoWidth() / pOBPlayer.getVideoHeight();
        int width = getWidth();
        int height = getHeight();
        float f10 = width;
        float f11 = height;
        float f12 = f10 / f11;
        ViewGroup.LayoutParams layoutParams = this.f63137b.getLayoutParams();
        if (videoWidth > f12) {
            layoutParams.width = width;
            layoutParams.height = (int) (f10 / videoWidth);
        } else {
            layoutParams.width = (int) (videoWidth * f11);
            layoutParams.height = height;
        }
        this.f63137b.setLayoutParams(layoutParams);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void destroy() {
        removeAllViews();
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer != null) {
            pOBPlayer.destroy();
            this.f63138c = null;
        }
        this.f63139d = null;
        this.f63140e = null;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    @Nullable
    public POBPlayerController getControllerView() {
        return this.f63140e;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public int getMediaDuration() {
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer != null) {
            return pOBPlayer.getDuration();
        }
        return 0;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    @NonNull
    public POBVideoPlayer.VideoPlayerState getPlayerState() {
        return this.f63143h;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public boolean isMute() {
        return this.f63142g;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void load(@NonNull String str) {
        POBMediaPlayer pOBMediaPlayer = new POBMediaPlayer(str, new Handler(Looper.getMainLooper()));
        this.f63138c = pOBMediaPlayer;
        pOBMediaPlayer.setPlayerListener(this);
        this.f63138c.setPrepareTimeout(this.f63136a);
        this.f63138c.setStallTimeout(15000);
        this.f63144i = false;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void mute() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onMute(true);
        }
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer == null) {
            POBLog.warn("POBVideoPlayerView", "Media player is null", new Object[0]);
        } else {
            this.f63142g = true;
            pOBPlayer.setVolume(0, 0);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onBufferUpdate(int i10) {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onBufferUpdate(i10);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onCompletion() {
        setPlayerState(POBVideoPlayer.VideoPlayerState.COMPLETE);
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onProgressUpdate(getMediaDuration());
            this.f63139d.onCompletion();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        POBLog.info("POBVideoPlayerView", "onConfigurationChanged", new Object[0]);
        postDelayed(new b(), 5L);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onFailure(int i10, @NonNull String str) {
        a(i10, str);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onPause() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onPause();
        }
        POBPlayerController pOBPlayerController = this.f63140e;
        if (pOBPlayerController != null) {
            pOBPlayerController.onPause();
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onPrepared() {
        POBPlayer pOBPlayer;
        if (this.f63139d != null) {
            if (this.f63142g && (pOBPlayer = this.f63138c) != null) {
                pOBPlayer.setVolume(0, 0);
            }
            setPlayerState(POBVideoPlayer.VideoPlayerState.LOADED);
            this.f63139d.onReadyToPlay(this);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onProgressUpdate(int i10) {
        a(i10);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onResume() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null && this.f63143h == POBVideoPlayer.VideoPlayerState.PAUSED) {
            pOBVideoPlayerListener.onResume();
        }
        setPlayerState(POBVideoPlayer.VideoPlayerState.PLAYING);
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onStart() {
        if (this.f63144i) {
            return;
        }
        b();
        this.f63144i = true;
    }

    @Override // com.pubmatic.sdk.video.player.POBPlayer.POBPlayerListener
    public void onStop() {
        setPlayerState(POBVideoPlayer.VideoPlayerState.STOPPED);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void pause() {
        if (this.f63138c != null && this.f63143h == POBVideoPlayer.VideoPlayerState.PLAYING) {
            setPlayerState(POBVideoPlayer.VideoPlayerState.PAUSED);
            this.f63138c.pause();
        } else {
            POBLog.warn("POBVideoPlayerView", "mediaPlayer :" + this.f63138c, new Object[0]);
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void play() {
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer != null && this.f63143h != POBVideoPlayer.VideoPlayerState.ERROR) {
            pOBPlayer.start();
            return;
        }
        POBLog.warn("POBVideoPlayerView", "mediaPlayer :" + ((Object) null), new Object[0]);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void playOnMute(boolean z10) {
        this.f63142g = z10;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setAutoPlayOnForeground(boolean z10) {
        this.f63141f = z10;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setControllerView(@NonNull POBPlayerController pOBPlayerController, @NonNull FrameLayout.LayoutParams layoutParams) {
        this.f63140e = pOBPlayerController;
        pOBPlayerController.setVideoPlayerEvents(this);
        addView(pOBPlayerController, layoutParams);
    }

    void setFSCEnabled(boolean z10) {
        setOnClickListener(z10 ? this.f63145j : null);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setListener(@NonNull POBVideoPlayerListener pOBVideoPlayerListener) {
        this.f63139d = pOBVideoPlayerListener;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void setPrepareTimeout(int i10) {
        this.f63136a = i10;
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void stop() {
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer != null) {
            pOBPlayer.stop();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(@NonNull SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(@NonNull SurfaceHolder surfaceHolder) {
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer == null || this.f63143h == POBVideoPlayer.VideoPlayerState.ERROR) {
            return;
        }
        setVideoSize(pOBPlayer);
        this.f63138c.onSurfaceCreated(surfaceHolder.getSurface());
        if (!this.f63141f || this.f63143h == POBVideoPlayer.VideoPlayerState.COMPLETE) {
            return;
        }
        play();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(@NonNull SurfaceHolder surfaceHolder) {
        if (this.f63143h != POBVideoPlayer.VideoPlayerState.ERROR) {
            pause();
        }
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer != null) {
            pOBPlayer.onSurfaceDestroyed(surfaceHolder.getSurface());
        }
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayer
    public void unMute() {
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onMute(false);
        }
        POBPlayer pOBPlayer = this.f63138c;
        if (pOBPlayer == null) {
            POBLog.warn("POBVideoPlayerView", "Media player is null", new Object[0]);
        } else {
            this.f63142g = false;
            pOBPlayer.setVolume(1, 1);
        }
    }

    private void b() {
        POBPlayerController pOBPlayerController = this.f63140e;
        if (pOBPlayerController != null) {
            pOBPlayerController.onStart();
        }
        POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
        if (pOBVideoPlayerListener != null) {
            pOBVideoPlayerListener.onStart();
        }
    }

    private void a() {
        this.f63137b.getHolder().addCallback(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        addView(this.f63137b, layoutParams);
        setBackgroundColor(getResources().getColor(R.color.black));
    }

    private void a(int i10, String str) {
        POBVideoPlayer.VideoPlayerState videoPlayerState = this.f63143h;
        POBVideoPlayer.VideoPlayerState videoPlayerState2 = POBVideoPlayer.VideoPlayerState.ERROR;
        if (videoPlayerState != videoPlayerState2) {
            setPlayerState(videoPlayerState2);
            POBLog.error("POBVideoPlayerView", "errorCode: " + i10 + ", errorMsg:" + str, new Object[0]);
            POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
            if (pOBVideoPlayerListener != null) {
                if (i10 != -1) {
                    i10 = -2;
                }
                pOBVideoPlayerListener.onFailure(i10, str);
            }
        }
    }

    private void a(int i10) {
        if (this.f63138c != null) {
            POBPlayerController pOBPlayerController = this.f63140e;
            if (pOBPlayerController != null) {
                pOBPlayerController.onProgressUpdate(i10);
            }
            POBVideoPlayerListener pOBVideoPlayerListener = this.f63139d;
            if (pOBVideoPlayerListener != null) {
                pOBVideoPlayerListener.onProgressUpdate(i10);
            }
        }
    }
}
