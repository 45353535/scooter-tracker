package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import android.content.Context;
import android.os.Looper;
import android.view.InflateException;
import androidx.lifecycle.Lifecycle;
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
import com.google.android.exoplayer2.s2;
import com.google.android.exoplayer2.source.DefaultMediaSourceFactory;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.video.VideoSize;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import eg.k0;
import hg.l0;
import java.util.List;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f58674b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58675c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f58676d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f58677e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final CoroutineScope f58678f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MutableStateFlow f58679g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final StateFlow f58680h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f58681i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f58682j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f58683k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StateFlow f58684l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StyledPlayerView f58685m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f58686n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f58687o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Looper f58688p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ExoPlayer f58689q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b f58690r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f58691s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C0774d f58692t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f f58693u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long f58694v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Job f58695w;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58696r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f58697s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a aVar, Continuation continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f58697s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58696r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a) this.f58697s).d()) {
                d.this.p();
            } else {
                Job job = d.this.f58695w;
                if (job != null) {
                    Job.a.a(job, null, 1, null);
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class b implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f58699b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ c f58700c;

        public b(ExoPlayer exoPlayer, c cVar) {
            this.f58699b = exoPlayer;
            this.f58700c = cVar;
        }

        public final void a(Throwable th2) {
            this.f58699b.removeListener(this.f58700c);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((Throwable) obj);
            return Unit.f93236a;
        }
    }

    public static final class c implements Player.Listener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f58701b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ExoPlayer f58702c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ CancellableContinuation f58703d;

        public c(int i10, ExoPlayer exoPlayer, CancellableContinuation cancellableContinuation) {
            this.f58701b = i10;
            this.f58702c = exoPlayer;
            this.f58703d = cancellableContinuation;
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            s2.a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            s2.b(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            s2.c(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            s2.d(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            s2.f(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            s2.g(this, i10, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            s2.h(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            s2.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            s2.j(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            s2.k(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            s2.l(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
            s2.m(this, mediaItem, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            s2.n(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            s2.o(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            s2.p(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            s2.q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            if (i10 == this.f58701b) {
                this.f58702c.removeListener(this);
                CancellableContinuation cancellableContinuation = this.f58703d;
                Result.Companion companion = Result.f93230c;
                cancellableContinuation.resumeWith(Result.b(Unit.f93236a));
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            s2.s(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            s2.t(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            s2.u(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            s2.v(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            s2.w(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            s2.x(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            s2.z(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            s2.A(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            s2.B(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            s2.C(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            s2.D(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            s2.E(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            s2.F(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            s2.G(this, i10, i11);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
            s2.H(this, timeline, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            s2.I(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            s2.J(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            s2.K(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f10) {
            s2.L(this, f10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            s2.e(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            s2.y(this, positionInfo, positionInfo2, i10);
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.d$d, reason: collision with other inner class name */
    public static final class C0774d implements Player.Listener {
        public C0774d() {
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            s2.a(this, audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            s2.b(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            s2.c(this, commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            s2.d(this, cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            s2.f(this, deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            s2.g(this, i10, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            s2.h(this, player, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            s2.i(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z10) {
            s2.j(this, z10);
            ExoPlayer exoPlayerK = d.this.K();
            long duration = exoPlayerK != null ? exoPlayerK.getDuration() : 0L;
            ExoPlayer exoPlayerK2 = d.this.K();
            d.this.f58681i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(z10, true, duration - (exoPlayerK2 != null ? exoPlayerK2.getCurrentPosition() : 0L) > 0));
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            s2.k(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            s2.l(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
            s2.m(this, mediaItem, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            s2.n(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            s2.o(this, metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayWhenReadyChanged(boolean z10, int i10) {
            s2.p(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            s2.q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            s2.r(this, i10);
            if (i10 == 4) {
                d dVar = d.this;
                ExoPlayer exoPlayerK = d.this.K();
                dVar.y(new i.a(exoPlayerK != null ? exoPlayerK.getDuration() : 1L));
                d.this.k();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            s2.s(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException error) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar;
            Intrinsics.checkNotNullParameter(error, "error");
            s2.t(this, error);
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.error$default(molocoLogger, d.this.f58677e, "Exoplayer error (streaming enabled = " + d.this.f58675c + ')', error, false, 8, null);
            if (d.this.f58675c && (bVar = d.this.f58690r) != null && bVar.g()) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i) d.this.f58679g.getValue();
                if ((iVar instanceof i.a) || (iVar instanceof i.c)) {
                    MolocoLogger.info$default(molocoLogger, d.this.f58677e, "Ignoring exoplayer streaming error as the user has viewed some of the ad already", null, false, 12, null);
                    return;
                } else {
                    if (!(iVar instanceof i.d) && !Intrinsics.areEqual(iVar, i.b.f58219a)) {
                        throw new lf.m();
                    }
                    MolocoLogger.info$default(molocoLogger, d.this.f58677e, "Exoplayer streaming failed before any playback started, so report that as error", null, false, 12, null);
                }
            }
            d.this.f58683k.setValue(l.f56091b);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            s2.u(this, playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            s2.v(this, z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            s2.w(this, mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            s2.x(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            s2.z(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            s2.A(this, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            s2.B(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            s2.C(this, j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSeekProcessed() {
            s2.D(this);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            s2.E(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            s2.F(this, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            s2.G(this, i10, i11);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
            s2.H(this, timeline, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            s2.I(this, trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            s2.J(this, tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            s2.K(this, videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f10) {
            s2.L(this, f10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            s2.e(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            s2.y(this, positionInfo, positionInfo2, i10);
        }
    }

    public /* synthetic */ class e extends y implements Function0 {
        public e(Object obj) {
            super(0, obj, d.class, "initOrResumeExoPlayer", "initOrResumeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).S();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class f extends y implements Function0 {
        public f(Object obj) {
            super(0, obj, d.class, "disposeExoPlayer", "disposeExoPlayer()V", 0);
        }

        public final void a() {
            ((d) this.receiver).I();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class g extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58705r;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return d.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58705r;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            do {
                ExoPlayer exoPlayerK = d.this.K();
                if (exoPlayerK != null) {
                    d.this.y(new i.c(exoPlayerK.getCurrentPosition(), exoPlayerK.getDuration()));
                }
                this.f58705r = 1;
            } while (k0.a(500L, this) != objG);
            return objG;
        }
    }

    public d(Context context, boolean z10, m mediaCacheRepository, Lifecycle lifecycle) {
        StyledPlayerView styledPlayerView;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediaCacheRepository, "mediaCacheRepository");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        this.f58674b = context;
        this.f58675c = z10;
        this.f58676d = mediaCacheRepository;
        this.f58677e = "SimplifiedExoPlayer";
        this.f58678f = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        MutableStateFlow mutableStateFlowA = l0.a(i.b.f58219a);
        this.f58679g = mutableStateFlowA;
        this.f58680h = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, false, 6, null));
        this.f58681i = mutableStateFlowA2;
        this.f58682j = mutableStateFlowA2;
        MutableStateFlow mutableStateFlowA3 = l0.a(null);
        this.f58683k = mutableStateFlowA3;
        this.f58684l = mutableStateFlowA3;
        try {
            styledPlayerView = new StyledPlayerView(context);
            styledPlayerView.setUseController(false);
        } catch (InflateException e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f58677e, "ExoPlayerView could not be instantiated.", e10, false, 8, null);
            this.f58683k.setValue(l.f56092c);
            styledPlayerView = null;
        }
        this.f58685m = styledPlayerView;
        this.f58688p = Looper.getMainLooper();
        hg.i.F(hg.i.K(isPlaying(), new a(null)), this.f58678f);
        this.f58692t = new C0774d();
        this.f58693u = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.f(lifecycle, new e(this), new f(this));
    }

    public static final DataSource q(String str, d dVar) {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.b(str, dVar.f58676d);
        dVar.f58690r = bVar;
        return bVar;
    }

    public final void A(ExoPlayer exoPlayer) {
        this.f58694v = exoPlayer.getCurrentPosition();
    }

    public final void I() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58677e, "Disposing exo player", null, false, 12, null);
        StyledPlayerView styledPlayerViewN = N();
        if (styledPlayerViewN != null) {
            styledPlayerViewN.onPause();
            styledPlayerViewN.setPlayer(null);
        }
        ExoPlayer exoPlayer = this.f58689q;
        long duration = exoPlayer != null ? exoPlayer.getDuration() : 0L;
        ExoPlayer exoPlayer2 = this.f58689q;
        boolean z10 = duration - (exoPlayer2 != null ? exoPlayer2.getCurrentPosition() : 0L) > 0;
        ExoPlayer exoPlayer3 = this.f58689q;
        if (exoPlayer3 != null) {
            A(exoPlayer3);
            exoPlayer3.removeListener(this.f58692t);
            exoPlayer3.release();
        }
        this.f58689q = null;
        this.f58681i.setValue(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.a(false, false, z10));
    }

    public final ExoPlayer K() {
        return this.f58689q;
    }

    public String P() {
        return this.f58686n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public StyledPlayerView N() {
        return this.f58685m;
    }

    public final void S() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58677e, "Init exo player", null, false, 12, null);
        StyledPlayerView styledPlayerViewN = N();
        if (styledPlayerViewN == null) {
            return;
        }
        if (this.f58689q == null) {
            ExoPlayer exoPlayerBuild = new ExoPlayer.Builder(this.f58674b).setLooper(this.f58688p).setPauseAtEndOfMediaItems(true).build();
            Intrinsics.checkNotNullExpressionValue(exoPlayerBuild, "build(...)");
            styledPlayerViewN.setPlayer(exoPlayerBuild);
            this.f58689q = exoPlayerBuild;
            exoPlayerBuild.setPlayWhenReady(false);
            exoPlayerBuild.addListener(this.f58692t);
            x(exoPlayerBuild);
            if (Intrinsics.areEqual(o().getValue(), i.b.f58219a)) {
                y(new i.d(exoPlayerBuild.getDuration()));
            }
        }
        styledPlayerViewN.onResume();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void a(String str) {
        this.f58686n = str;
        ExoPlayer exoPlayer = this.f58689q;
        if (exoPlayer != null) {
            s(exoPlayer, str);
        }
        k();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void b(boolean z10) {
        this.f58687o = z10;
        ExoPlayer exoPlayer = this.f58689q;
        if (exoPlayer != null) {
            t(exoPlayer, z10);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f58678f, null, 1, null);
        this.f58693u.destroy();
        I();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow f() {
        return this.f58684l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow isPlaying() {
        return this.f58682j;
    }

    public final void k() {
        this.f58691s = false;
        this.f58694v = 0L;
    }

    public boolean m() {
        return this.f58687o;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public StateFlow o() {
        return this.f58680h;
    }

    public final void p() {
        Job job = this.f58695w;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f58695w = eg.i.d(this.f58678f, null, null, new g(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void pause() {
        this.f58691s = false;
        ExoPlayer exoPlayer = this.f58689q;
        if (exoPlayer != null) {
            exoPlayer.pause();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void play() {
        this.f58691s = true;
        ExoPlayer exoPlayer = this.f58689q;
        if (exoPlayer != null) {
            exoPlayer.play();
        }
    }

    public final Object r(ExoPlayer exoPlayer, int i10, Continuation continuation) {
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(continuation), 1);
        eVar.I();
        c cVar = new c(i10, exoPlayer, eVar);
        exoPlayer.addListener(cVar);
        eVar.v(new b(exoPlayer, cVar));
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(continuation);
        }
        return objC == pf.b.g() ? objC : Unit.f93236a;
    }

    public final void s(ExoPlayer exoPlayer, final String str) {
        if (str == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58677e, "URI Source is empty", null, false, 12, null);
            return;
        }
        try {
            if (this.f58675c) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58677e, "Streaming is enabled", null, false, 12, null);
                DefaultMediaSourceFactory defaultMediaSourceFactory = new DefaultMediaSourceFactory(new DataSource.Factory() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.c
                    @Override // com.google.android.exoplayer2.upstream.DataSource.Factory
                    public final DataSource createDataSource() {
                        return d.q(str, this);
                    }
                });
                MediaItem mediaItemFromUri = MediaItem.fromUri(str);
                Intrinsics.checkNotNullExpressionValue(mediaItemFromUri, "fromUri(...)");
                exoPlayer.setMediaSource(defaultMediaSourceFactory.createMediaSource(mediaItemFromUri));
            } else {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f58677e, "Streaming is disabled", null, false, 12, null);
                exoPlayer.setMediaItem(MediaItem.fromUri(str));
            }
            exoPlayer.prepare();
        } catch (Exception e10) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f58677e, "ExoPlayer setMediaItem exception", e10, false, 8, null);
            this.f58683k.setValue(l.f56093d);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public void seekTo(long j10) {
        this.f58694v = j10;
        ExoPlayer exoPlayer = this.f58689q;
        if (exoPlayer != null) {
            exoPlayer.seekTo(j10);
        }
    }

    public final void t(ExoPlayer exoPlayer, boolean z10) {
        exoPlayer.setVolume(z10 ? 0.0f : 1.0f);
    }

    public final void x(ExoPlayer exoPlayer) {
        t(exoPlayer, m());
        s(exoPlayer, P());
        exoPlayer.seekTo(this.f58694v);
        if (this.f58691s) {
            exoPlayer.play();
        } else {
            exoPlayer.pause();
        }
    }

    public final void y(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i iVar) {
        this.f58679g.setValue(iVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer.g
    public Object a(Continuation continuation) {
        Object objR;
        ExoPlayer exoPlayer = this.f58689q;
        return (exoPlayer == null || (objR = r(exoPlayer, 3, continuation)) != pf.b.g()) ? Unit.f93236a : objR;
    }
}
