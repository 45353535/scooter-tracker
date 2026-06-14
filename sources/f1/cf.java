package f1;

import android.content.Context;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import f1.lg;
import java.util.List;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class cf implements x, SurfaceHolder.Callback, Player.Listener, lg.b, df {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s8 f69532b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SurfaceView f69533c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n0 f69534d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f69535e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Lazy f69536f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f69537g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f69538h;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ y5 f69539f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ cf f69540g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(y5 y5Var, cf cfVar) {
            super(0);
            this.f69539f = y5Var;
            this.f69540g = cfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final ExoPlayer invoke() {
            ExoPlayer exoPlayerA = this.f69539f.a();
            exoPlayerA.addListener(this.f69540g);
            return exoPlayerA;
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Function3 f69541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ cf f69542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ t6 f69543h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function3 function3, cf cfVar, t6 t6Var) {
            super(0);
            this.f69541f = function3;
            this.f69542g = cfVar;
            this.f69543h = t6Var;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final lg invoke() {
            return (lg) this.f69541f.invoke(this.f69542g.f69534d, this.f69542g, this.f69543h);
        }
    }

    public cf(Context context, y5 exoPlayerFactory, s8 exoPlayerMediaItemFactory, SurfaceView surfaceView, n0 n0Var, t6 uiPoster, Function3 videoProgressFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(exoPlayerFactory, "exoPlayerFactory");
        Intrinsics.checkNotNullParameter(exoPlayerMediaItemFactory, "exoPlayerMediaItemFactory");
        Intrinsics.checkNotNullParameter(surfaceView, "surfaceView");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(videoProgressFactory, "videoProgressFactory");
        this.f69532b = exoPlayerMediaItemFactory;
        this.f69533c = surfaceView;
        this.f69534d = n0Var;
        this.f69535e = lf.i.a(new a(exoPlayerFactory, this));
        this.f69536f = lf.i.a(new b(videoProgressFactory, this, uiPoster));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0039  */
    @Override // f1.x
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(f1.c9 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "asset"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "asset() - asset: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r1 = 0
            r2 = 2
            f1.eg.e(r0, r1, r2, r1)
            com.google.android.exoplayer2.MediaItem r4 = r3.d(r4)
            if (r4 == 0) goto L39
            com.google.android.exoplayer2.ExoPlayer r0 = r3.i()
            r0.addMediaItem(r4)
            r0.prepare()
            android.view.SurfaceView r4 = r3.f69533c
            android.view.SurfaceHolder r4 = r4.getHolder()
            if (r4 == 0) goto L39
            r4.addCallback(r3)
            kotlin.Unit r4 = kotlin.Unit.f93236a
            goto L3a
        L39:
            r4 = r1
        L3a:
            if (r4 != 0) goto L48
            f1.n0 r4 = r3.f69534d
            java.lang.String r0 = "Error retrieving media item"
            if (r4 == 0) goto L45
            r4.a(r0)
        L45:
            f1.eg.j(r0, r1, r2, r1)
        L48:
            r4 = 0
            r3.f69537g = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.cf.a(f1.c9):void");
    }

    @Override // f1.df
    public void c() {
        this.f69538h = true;
    }

    public final MediaItem d(c9 c9Var) {
        MediaItem mediaItemA = this.f69532b.a(c9Var);
        eg.e("VideoAsset.toMediaItem() - " + mediaItemA, null, 2, null);
        return mediaItemA;
    }

    public final void e(int i10, int i11) {
        g4.a(this.f69533c, aa.b(i()), aa.a(i()), i10, i11);
    }

    @Override // f1.x
    public void f() {
        i().setVolume(0.0f);
    }

    @Override // f1.x
    public float g() {
        return i().getVolume();
    }

    @Override // f1.x
    public boolean h() {
        return this.f69537g;
    }

    public final ExoPlayer i() {
        return (ExoPlayer) this.f69535e.getValue();
    }

    public final lg j() {
        return (lg) this.f69536f.getValue();
    }

    public final void k() {
        stop();
        n();
        n0 n0Var = this.f69534d;
        if (n0Var != null) {
            n0Var.b();
        }
    }

    public final void l() {
        c(this, 0, 0, 3, null);
        n0 n0Var = this.f69534d;
        if (n0Var != null) {
            n0Var.d();
        }
        n0 n0Var2 = this.f69534d;
        if (n0Var2 != null) {
            n0Var2.b(i().getDuration());
        }
    }

    public final void m() {
        lg.a.a(j(), 0L, 1, null);
    }

    public final void n() {
        j().a();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
        com.google.android.exoplayer2.s2.a(this, audioAttributes);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAudioSessionIdChanged(int i10) {
        com.google.android.exoplayer2.s2.b(this, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
        com.google.android.exoplayer2.s2.c(this, commands);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(CueGroup cueGroup) {
        com.google.android.exoplayer2.s2.d(this, cueGroup);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
        com.google.android.exoplayer2.s2.f(this, deviceInfo);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
        com.google.android.exoplayer2.s2.g(this, i10, z10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onEvents(Player player, Player.Events events) {
        com.google.android.exoplayer2.s2.h(this, player, events);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onIsLoadingChanged(boolean z10) {
        com.google.android.exoplayer2.s2.i(this, z10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onIsPlayingChanged(boolean z10) {
        eg.e("onIsPlayingChanged() - isPlaying: " + z10, null, 2, null);
        if (!z10) {
            n();
            return;
        }
        this.f69537g = true;
        n0 n0Var = this.f69534d;
        if (n0Var != null) {
            n0Var.a();
        }
        m();
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onLoadingChanged(boolean z10) {
        com.google.android.exoplayer2.s2.k(this, z10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
        com.google.android.exoplayer2.s2.l(this, j10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
        com.google.android.exoplayer2.s2.m(this, mediaItem, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.s2.n(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onMetadata(Metadata metadata) {
        com.google.android.exoplayer2.s2.o(this, metadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
        com.google.android.exoplayer2.s2.p(this, z10, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
        com.google.android.exoplayer2.s2.q(this, playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlaybackStateChanged(int i10) {
        eg.e("onPlaybackStateChanged() - playbackState: " + uf.b(i10), null, 2, null);
        if (i10 == 2) {
            n0 n0Var = this.f69534d;
            if (n0Var != null) {
                n0Var.c();
                return;
            }
            return;
        }
        if (i10 == 3) {
            l();
        } else {
            if (i10 != 4) {
                return;
            }
            k();
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        com.google.android.exoplayer2.s2.s(this, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        eg.i("ExoPlayer error", error);
        stop();
        n0 n0Var = this.f69534d;
        if (n0Var != null) {
            String message = error.getMessage();
            if (message == null) {
                message = "No error message from ExoPlayer";
            }
            n0Var.a(message);
        }
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        com.google.android.exoplayer2.s2.u(this, playbackException);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        com.google.android.exoplayer2.s2.v(this, z10, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
        com.google.android.exoplayer2.s2.w(this, mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(int i10) {
        com.google.android.exoplayer2.s2.x(this, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRenderedFirstFrame() {
        com.google.android.exoplayer2.s2.z(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onRepeatModeChanged(int i10) {
        com.google.android.exoplayer2.s2.A(this, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekBackIncrementChanged(long j10) {
        com.google.android.exoplayer2.s2.B(this, j10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
        com.google.android.exoplayer2.s2.C(this, j10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSeekProcessed() {
        com.google.android.exoplayer2.s2.D(this);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
        com.google.android.exoplayer2.s2.E(this, z10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
        com.google.android.exoplayer2.s2.F(this, z10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
        com.google.android.exoplayer2.s2.G(this, i10, i11);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
        com.google.android.exoplayer2.s2.H(this, timeline, i10);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
        com.google.android.exoplayer2.s2.I(this, trackSelectionParameters);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onTracksChanged(Tracks tracks) {
        com.google.android.exoplayer2.s2.J(this, tracks);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
        com.google.android.exoplayer2.s2.K(this, videoSize);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onVolumeChanged(float f10) {
        com.google.android.exoplayer2.s2.L(this, f10);
    }

    @Override // f1.x
    public void pause() {
        eg.e("pause()", null, 2, null);
        i().pause();
    }

    @Override // f1.x
    public void play() {
        eg.e("play()", null, 2, null);
        i().setVideoSurfaceView(this.f69533c);
        i().play();
        this.f69538h = false;
    }

    @Override // f1.x
    public void stop() {
        eg.e("stop()", null, 2, null);
        if (i().isPlaying()) {
            i().stop();
        }
        i().release();
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder holder, int i10, int i11, int i12) {
        Intrinsics.checkNotNullParameter(holder, "holder");
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        eg.e("surfaceCreated()", null, 2, null);
        if (this.f69538h) {
            play();
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(SurfaceHolder holder) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        eg.e("surfaceDestroyed()", null, 2, null);
    }

    public static /* synthetic */ void c(cf cfVar, int i10, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = cfVar.f69533c.getWidth();
        }
        if ((i12 & 2) != 0) {
            i11 = cfVar.f69533c.getHeight();
        }
        cfVar.e(i10, i11);
    }

    @Override // f1.x
    public void b() {
        i().setVolume(1.0f);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onCues(List list) {
        com.google.android.exoplayer2.s2.e(this, list);
    }

    @Override // com.google.android.exoplayer2.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        com.google.android.exoplayer2.s2.y(this, positionInfo, positionInfo2, i10);
    }

    public /* synthetic */ cf(Context context, y5 y5Var, s8 s8Var, SurfaceView surfaceView, n0 n0Var, t6 t6Var, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i10 & 2) != 0 ? new y5(context, null, null, null, 14, null) : y5Var, s8Var, surfaceView, (i10 & 16) != 0 ? null : n0Var, t6Var, function3);
    }

    @Override // f1.lg.b
    public long a() {
        return i().getCurrentPosition();
    }

    @Override // f1.a9
    public void a(int i10, int i11) {
    }
}
