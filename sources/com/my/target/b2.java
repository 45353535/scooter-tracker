package com.my.target;

import android.content.Context;
import android.net.Uri;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaMetadata;
import androidx.media3.common.Metadata;
import androidx.media3.common.PlaybackException;
import androidx.media3.common.PlaybackParameters;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.TrackSelectionParameters;
import androidx.media3.common.Tracks;
import androidx.media3.common.VideoSize;
import androidx.media3.common.text.CueGroup;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.source.MediaSource;
import com.my.target.y;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class b2 implements Player.Listener, y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u9 f59249a = u9.a(200);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ExoPlayer f59250b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f59251c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y.a f59252d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public MediaSource f59253e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Uri f59254f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f59255g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f59256h;

    public static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f59257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ExoPlayer f59258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public y.a f59259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f59260d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f59261e;

        public a(int i10, ExoPlayer exoPlayer) {
            this.f59257a = i10;
            this.f59258b = exoPlayer;
        }

        public void a(y.a aVar) {
            this.f59259c = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                float currentPosition = this.f59258b.getCurrentPosition() / 1000.0f;
                float duration = this.f59258b.getDuration() / 1000.0f;
                if (this.f59261e == currentPosition) {
                    this.f59260d++;
                } else {
                    y.a aVar = this.f59259c;
                    if (aVar != null) {
                        aVar.a(currentPosition, duration);
                    }
                    this.f59261e = currentPosition;
                    if (this.f59260d > 0) {
                        this.f59260d = 0;
                    }
                }
                if (this.f59260d > this.f59257a) {
                    y.a aVar2 = this.f59259c;
                    if (aVar2 != null) {
                        aVar2.n();
                    }
                    this.f59260d = 0;
                }
            } catch (Throwable th2) {
                String str = "ExoVideoPlayer: Error - " + th2.getMessage();
                gb.a(str);
                y.a aVar3 = this.f59259c;
                if (aVar3 != null) {
                    aVar3.a(str);
                }
            }
        }
    }

    public b2(Context context) {
        ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(context).build();
        this.f59250b = exoPlayerBuild;
        exoPlayerBuild.addListener(this);
        this.f59251c = new a(50, exoPlayerBuild);
    }

    public static b2 a(Context context) {
        return new b2(context);
    }

    @Override // com.my.target.y
    public boolean b() {
        return this.f59255g && this.f59256h;
    }

    @Override // com.my.target.y
    public void c() {
        try {
            this.f59250b.setVolume(0.2f);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
        }
    }

    @Override // com.my.target.y
    public void d() {
        try {
            this.f59250b.setVolume(0.0f);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
        }
        y.a aVar = this.f59252d;
        if (aVar != null) {
            aVar.a(0.0f);
        }
    }

    @Override // com.my.target.y
    public void destroy() {
        this.f59254f = null;
        this.f59255g = false;
        this.f59256h = false;
        this.f59252d = null;
        this.f59249a.b(this.f59251c);
        try {
            this.f59250b.setVideoTextureView(null);
            this.f59250b.stop();
            this.f59250b.release();
            this.f59250b.removeListener(this);
        } catch (Throwable unused) {
        }
    }

    @Override // com.my.target.y
    public boolean e() {
        return this.f59255g;
    }

    @Override // com.my.target.y
    public void f() {
        try {
            this.f59250b.seekTo(0L);
            this.f59250b.setPlayWhenReady(true);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // com.my.target.y
    public boolean g() {
        try {
            return this.f59250b.getVolume() == 0.0f;
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
            return false;
        }
    }

    @Override // com.my.target.y
    public float getDuration() {
        try {
            return this.f59250b.getDuration() / 1000.0f;
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
            return 0.0f;
        }
    }

    @Override // com.my.target.y
    public Uri getUri() {
        return this.f59254f;
    }

    @Override // com.my.target.y
    public void h() {
        try {
            this.f59250b.setVolume(1.0f);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
        }
        y.a aVar = this.f59252d;
        if (aVar != null) {
            aVar.a(1.0f);
        }
    }

    @Override // com.my.target.y
    public long i() {
        try {
            return this.f59250b.getCurrentPosition();
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
            return 0L;
        }
    }

    @Override // com.my.target.y
    public boolean isPlaying() {
        return this.f59255g && !this.f59256h;
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        androidx.media3.common.p.a(this, audioAttributes);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i10) {
        androidx.media3.common.p.b(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        androidx.media3.common.p.c(this, commands);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onCues(CueGroup cueGroup) {
        androidx.media3.common.p.d(this, cueGroup);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        androidx.media3.common.p.f(this, deviceInfo);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        androidx.media3.common.p.g(this, i10, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        androidx.media3.common.p.h(this, player, events);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onIsLoadingChanged(boolean z10) {
        androidx.media3.common.p.i(this, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onIsPlayingChanged(boolean z10) {
        androidx.media3.common.p.j(this, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onLoadingChanged(boolean z10) {
        androidx.media3.common.p.k(this, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        androidx.media3.common.p.l(this, j10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
        androidx.media3.common.p.m(this, mediaItem, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        androidx.media3.common.p.n(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onMetadata(Metadata metadata) {
        androidx.media3.common.p.o(this, metadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        androidx.media3.common.p.p(this, z10, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        androidx.media3.common.p.q(this, playbackParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackStateChanged(int i10) {
        androidx.media3.common.p.r(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        androidx.media3.common.p.s(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerError(PlaybackException playbackException) {
        this.f59256h = false;
        this.f59255g = false;
        if (this.f59252d != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("ExoVideoPlayer: Error - ");
            sb2.append(playbackException != null ? playbackException.getMessage() : "unknown video error");
            this.f59252d.a(sb2.toString());
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        androidx.media3.common.p.u(this, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public void onPlayerStateChanged(boolean z10, int i10) {
        if (i10 == 1) {
            gb.a("ExoVideoPlayer: Player state is changed to IDLE");
            if (this.f59255g) {
                this.f59255g = false;
                y.a aVar = this.f59252d;
                if (aVar != null) {
                    aVar.l();
                }
            }
            this.f59249a.b(this.f59251c);
            return;
        }
        if (i10 == 2) {
            gb.a("ExoVideoPlayer: Player state is changed to BUFFERING");
            if (!z10 || this.f59255g) {
                return;
            }
            this.f59249a.a(this.f59251c);
            return;
        }
        if (i10 != 3) {
            if (i10 != 4) {
                return;
            }
            gb.a("ExoVideoPlayer: Player state is changed to ENDED");
            this.f59256h = false;
            this.f59255g = false;
            float duration = getDuration();
            y.a aVar2 = this.f59252d;
            if (aVar2 != null) {
                aVar2.a(duration, duration);
            }
            y.a aVar3 = this.f59252d;
            if (aVar3 != null) {
                aVar3.b();
            }
            this.f59249a.b(this.f59251c);
            return;
        }
        gb.a("ExoVideoPlayer: Player state is changed to READY");
        if (!z10) {
            if (!this.f59256h) {
                this.f59256h = true;
                y.a aVar4 = this.f59252d;
                if (aVar4 != null) {
                    aVar4.d();
                }
            }
            this.f59249a.b(this.f59251c);
            return;
        }
        y.a aVar5 = this.f59252d;
        if (aVar5 != null) {
            aVar5.p();
        }
        if (!this.f59255g) {
            this.f59255g = true;
        } else if (this.f59256h) {
            this.f59256h = false;
            y.a aVar6 = this.f59252d;
            if (aVar6 != null) {
                aVar6.f();
            }
        }
        this.f59249a.a(this.f59251c);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        androidx.media3.common.p.w(this, mediaMetadata);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i10) {
        androidx.media3.common.p.x(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        androidx.media3.common.p.z(this);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i10) {
        androidx.media3.common.p.A(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        androidx.media3.common.p.B(this, j10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        androidx.media3.common.p.C(this, j10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        androidx.media3.common.p.D(this, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        androidx.media3.common.p.E(this, z10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        androidx.media3.common.p.F(this, i10, i11);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
        androidx.media3.common.p.G(this, timeline, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        androidx.media3.common.p.H(this, trackSelectionParameters);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onTracksChanged(Tracks tracks) {
        androidx.media3.common.p.I(this, tracks);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        androidx.media3.common.p.J(this, videoSize);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onVolumeChanged(float f10) {
        androidx.media3.common.p.K(this, f10);
    }

    @Override // com.my.target.y
    public void pause() {
        if (!this.f59255g || this.f59256h) {
            return;
        }
        try {
            this.f59250b.setPlayWhenReady(false);
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // com.my.target.y
    public void resume() {
        try {
            if (this.f59255g) {
                this.f59250b.setPlayWhenReady(true);
                return;
            }
            MediaSource mediaSource = this.f59253e;
            if (mediaSource != null) {
                this.f59250b.setMediaSource(mediaSource, true);
                this.f59250b.prepare();
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // com.my.target.y
    public void seekTo(long j10) {
        try {
            this.f59250b.seekTo(j10);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
        }
    }

    @Override // com.my.target.y
    public void setVolume(float f10) {
        try {
            this.f59250b.setVolume(f10);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: Error - " + th2.getMessage());
        }
        y.a aVar = this.f59252d;
        if (aVar != null) {
            aVar.a(f10);
        }
    }

    @Override // com.my.target.y
    public void stop() {
        try {
            this.f59250b.stop();
            this.f59250b.clearMediaItems();
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // com.my.target.y
    public void a(y.a aVar) {
        this.f59252d = aVar;
        this.f59251c.a(aVar);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onCues(List list) {
        androidx.media3.common.p.e(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        androidx.media3.common.p.y(this, positionInfo, positionInfo2, i10);
    }

    @Override // com.my.target.y
    public void a(z zVar) {
        try {
            if (zVar != null) {
                zVar.setExoPlayer(this.f59250b);
            } else {
                this.f59250b.setVideoTextureView(null);
            }
        } catch (Throwable th2) {
            a(th2);
        }
    }

    @Override // com.my.target.y
    public void a(Uri uri, z zVar) {
        a(zVar);
        a(uri, zVar.getContext());
    }

    @Override // com.my.target.y
    public void a(Uri uri, Context context) {
        gb.a("ExoVideoPlayer: prepare to play video in ExoPlayer");
        this.f59254f = uri;
        this.f59256h = false;
        y.a aVar = this.f59252d;
        if (aVar != null) {
            aVar.e();
        }
        try {
            this.f59249a.a(this.f59251c);
            this.f59250b.setPlayWhenReady(true);
            if (!this.f59255g) {
                MediaSource mediaSourceA = x6.a(uri, context);
                this.f59253e = mediaSourceA;
                this.f59250b.setMediaSource(mediaSourceA);
                this.f59250b.prepare();
                gb.a("ExoVideoPlayer: Play new video in ExoPlayer");
                return;
            }
            gb.b("ExoVideoPlayer: New source url not set! Will play previous video! started = true");
        } catch (Throwable th2) {
            String str = "ExoVideoPlayer: Error - " + th2.getMessage();
            gb.a(str);
            y.a aVar2 = this.f59252d;
            if (aVar2 != null) {
                aVar2.a(str);
            }
        }
    }

    @Override // com.my.target.y
    public void a() {
        try {
            setVolume(((double) this.f59250b.getVolume()) == 1.0d ? 0.0f : 1.0f);
        } catch (Throwable th2) {
            gb.a("ExoVideoPlayer: error - " + th2.getMessage());
        }
    }

    public final void a(Throwable th2) {
        String str = "ExoVideoPlayer: Error - " + th2.getMessage();
        gb.a(str);
        y.a aVar = this.f59252d;
        if (aVar != null) {
            aVar.a(str);
        }
    }
}
