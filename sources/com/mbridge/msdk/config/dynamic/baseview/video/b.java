package com.mbridge.msdk.config.dynamic.baseview.video;

import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.SurfaceHolder;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultRenderersFactory;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlaybackException;
import com.mbridge.msdk.playercommon.exoplayer2.ExoPlayerFactory;
import com.mbridge.msdk.playercommon.exoplayer2.PlaybackParameters;
import com.mbridge.msdk.playercommon.exoplayer2.Player;
import com.mbridge.msdk.playercommon.exoplayer2.SimpleExoPlayer;
import com.mbridge.msdk.playercommon.exoplayer2.Timeline;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.MediaSource;
import com.mbridge.msdk.playercommon.exoplayer2.source.TrackGroupArray;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.DefaultTrackSelector;
import com.mbridge.msdk.playercommon.exoplayer2.trackselection.TrackSelectionArray;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultDataSourceFactory;

/* JADX INFO: loaded from: classes10.dex */
public class b implements Player.EventListener {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f47527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f47528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Context f47529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private SimpleExoPlayer f47530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private MediaSource f47531i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile com.mbridge.msdk.config.dynamic.baseview.video.a f47533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    SurfaceHolder f47534l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private c f47535m;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f47523a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f47524b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f47525c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47526d = 5;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Handler f47532j = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Runnable f47536n = new a();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            long duration;
            try {
                if (b.this.f47530h == null || !b.this.b()) {
                    return;
                }
                b bVar = b.this;
                bVar.f47527e = bVar.f47530h.getCurrentPosition();
                float f10 = b.this.f47527e % 1000;
                int iRound = Math.round(b.this.f47527e / 1000.0f);
                q0.c("ComponentVideoPlayer", "currentPosition:" + iRound + " mCurrentPosition:" + b.this.f47527e);
                if (b.this.f47530h == null || b.this.f47530h.getDuration() <= 0) {
                    duration = 0;
                } else {
                    duration = b.this.f47530h.getDuration() / 1000;
                    if (f10 > 0.0f && f10 < 500.0f) {
                        iRound++;
                    }
                }
                if (iRound >= 0 && duration > 0) {
                    long j10 = iRound;
                    if (j10 < 1 + duration && b.this.f47533k != null) {
                        b.this.f47533k.a(j10, duration);
                    }
                }
                b.this.f47523a = false;
                b.this.f47532j.postDelayed(this, 1000L);
            } catch (Exception e10) {
                q0.b("ComponentVideoPlayer", e10.getMessage());
            }
        }
    }

    private void r() {
        try {
            a();
            this.f47532j.post(this.f47536n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public float e() {
        SimpleExoPlayer simpleExoPlayer = this.f47530h;
        if (simpleExoPlayer != null) {
            return simpleExoPlayer.getVolume();
        }
        return 0.0f;
    }

    public boolean f() {
        return this.f47524b;
    }

    public boolean g() {
        return this.f47523a;
    }

    public boolean h() {
        return this.f47530h != null && b();
    }

    public boolean i() {
        return this.f47528f;
    }

    public void j() {
        SimpleExoPlayer simpleExoPlayer = this.f47530h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(0.0f);
        this.f47528f = true;
    }

    public void k() {
        try {
            this.f47523a = true;
            this.f47527e = 0L;
            if (this.f47533k != null) {
                this.f47533k.onPlayCompleted();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void l() {
        try {
            this.f47524b = true;
            if (this.f47530h != null && !this.f47525c) {
                this.f47525c = true;
                if (this.f47533k != null) {
                    this.f47533k.a(this.f47530h.getDuration() / 1000);
                }
            }
            r();
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void m() {
        try {
            if (this.f47524b && this.f47530h != null && b()) {
                this.f47530h.setPlayWhenReady(false);
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void n() {
        try {
            if (this.f47524b) {
                r();
            } else {
                this.f47530h.prepare(this.f47531i);
            }
            this.f47530h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public void o() {
        SimpleExoPlayer simpleExoPlayer;
        try {
            if (this.f47524b || (simpleExoPlayer = this.f47530h) == null) {
                return;
            }
            simpleExoPlayer.prepare(this.f47531i);
            this.f47524b = true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onLoadingChanged(boolean z10) {
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        q0.b("ComponentVideoPlayer", "onPlaybackParametersChanged : " + playbackParameters.speed);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerError(ExoPlaybackException exoPlaybackException) {
        c cVar = this.f47535m;
        if ((cVar == null || !cVar.a(exoPlaybackException)) && exoPlaybackException != null) {
            int i10 = exoPlaybackException.type;
            String message = i10 != 0 ? i10 != 1 ? i10 != 2 ? "Play error and ExoPlayer have not message." : "Play error, because have a UnexpectedException." : "Play error, because have a RendererException." : "Play error, because have a SourceException.";
            if (exoPlaybackException.getCause() != null && !TextUtils.isEmpty(exoPlaybackException.getCause().getMessage())) {
                message = exoPlaybackException.getCause().getMessage();
            }
            q0.b("ComponentVideoPlayer", "onPlayerError : " + message);
            a(message);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPlayerStateChanged(boolean z10, int i10) {
        q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : " + i10);
        if (i10 == 1) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : IDLE");
            return;
        }
        if (i10 == 2) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Buffering");
            return;
        }
        if (i10 == 3) {
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : READY");
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            q0.b("ComponentVideoPlayer", "onPlaybackStateChanged : Ended : PLAY ENDED");
            a();
            k();
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.Player.EventListener
    public void onPositionDiscontinuity(int i10) {
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

    public void p() {
        try {
            a();
            if (this.f47530h != null) {
                s();
                this.f47530h.removeListener(this);
                this.f47530h.release();
                this.f47533k = null;
            }
            c cVar = this.f47535m;
            if (cVar != null) {
                cVar.c();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void q() {
        SimpleExoPlayer simpleExoPlayer = this.f47530h;
        if (simpleExoPlayer != null) {
            simpleExoPlayer.seekTo(simpleExoPlayer.getCurrentPosition() - 500);
        }
    }

    public void s() {
        try {
            if (this.f47524b && this.f47530h != null && b()) {
                this.f47530h.stop();
                a();
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void t() {
        SimpleExoPlayer simpleExoPlayer = this.f47530h;
        if (simpleExoPlayer == null) {
            return;
        }
        simpleExoPlayer.setVolume(1.0f);
        this.f47528f = false;
    }

    public void b(int i10) {
        this.f47526d = i10;
    }

    public void c(String str) {
        if (TextUtils.isEmpty(str)) {
            b("play url is illegal");
            return;
        }
        try {
            this.f47530h = ExoPlayerFactory.newSimpleInstance(new DefaultRenderersFactory(this.f47529g), new DefaultTrackSelector(), new DefaultLoadControl());
            this.f47531i = new ExtractorMediaSource.Factory(new DefaultDataSourceFactory(this.f47529g, "MBridge_ExoPlayer")).createMediaSource(Uri.parse(str));
            this.f47530h.setRepeatMode(0);
            this.f47530h.prepare(this.f47531i);
            this.f47530h.addListener(this);
            SurfaceHolder surfaceHolder = this.f47534l;
            if (surfaceHolder != null) {
                a(surfaceHolder);
            }
            c cVar = new c(this.f47529g, this.f47530h);
            this.f47535m = cVar;
            cVar.a(str, this.f47533k, this.f47526d);
        } catch (Throwable unused) {
            b("Player init error");
        }
    }

    public int d() {
        SimpleExoPlayer simpleExoPlayer = this.f47530h;
        if (simpleExoPlayer != null) {
            return (int) (simpleExoPlayer.getDuration() / 1000);
        }
        return 0;
    }

    private void b(String str) {
        if (this.f47533k != null) {
            this.f47533k.onPlayError(str);
        }
    }

    public void a(Context context, SurfaceHolder surfaceHolder) {
        try {
            this.f47529g = context;
            this.f47534l = surfaceHolder;
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public boolean b() {
        return this.f47530h.getPlaybackState() == 3 && this.f47530h.getPlayWhenReady();
    }

    public void a(SurfaceHolder surfaceHolder) {
        Player.VideoComponent videoComponent;
        try {
            SimpleExoPlayer simpleExoPlayer = this.f47530h;
            if (simpleExoPlayer == null || (videoComponent = simpleExoPlayer.getVideoComponent()) == null) {
                return;
            }
            videoComponent.setVideoSurfaceHolder(surfaceHolder);
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
            b(th2.toString());
        }
    }

    public void a(long j10) {
        try {
            if (!this.f47524b) {
                this.f47530h.prepare(this.f47531i);
            } else {
                r();
            }
            this.f47530h.seekTo(j10);
            this.f47530h.setPlayWhenReady(true);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            p();
            b("play error");
        }
    }

    public long c() {
        return this.f47527e;
    }

    public void a(int i10) {
        long j10 = i10;
        try {
            this.f47527e = j10;
            if (!this.f47524b) {
                q0.a("ComponentVideoPlayer", "seekTo return mHasPrepare false");
                return;
            }
            SimpleExoPlayer simpleExoPlayer = this.f47530h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.seekTo(j10);
            }
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    private void a() {
        try {
            this.f47532j.removeCallbacks(this.f47536n);
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
        }
    }

    public void a(com.mbridge.msdk.config.dynamic.baseview.video.a aVar) {
        this.f47533k = aVar;
    }

    public boolean a(String str) {
        try {
            this.f47524b = false;
            b(str);
            return true;
        } catch (Exception e10) {
            q0.b("ComponentVideoPlayer", e10.getMessage());
            return true;
        }
    }

    public void a(float f10, float f11) {
        try {
            SimpleExoPlayer simpleExoPlayer = this.f47530h;
            if (simpleExoPlayer != null) {
                simpleExoPlayer.setVolume(f11);
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }

    public void a(float f10) {
        try {
            if (b()) {
                this.f47530h.setPlaybackParameters(new PlaybackParameters(f10));
            } else {
                this.f47530h.setPlaybackParameters(new PlaybackParameters(f10));
                this.f47530h.stop();
            }
        } catch (Throwable th2) {
            q0.b("ComponentVideoPlayer", th2.getMessage());
        }
    }
}
