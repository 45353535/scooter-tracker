package com.inmobi.media;

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
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Lm implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.e f37319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K2 f37320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f37321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f37322d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ExoPlayer f37323e;

    public Lm(kotlinx.coroutines.e eVar, K2 k22, String str, InterfaceC3878m9 interfaceC3878m9, ExoPlayer exoPlayer) {
        this.f37319a = eVar;
        this.f37320b = k22;
        this.f37321c = str;
        this.f37322d = interfaceC3878m9;
        this.f37323e = exoPlayer;
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
    public final void onPlaybackStateChanged(int i10) {
        if (i10 == 3) {
            if (this.f37319a.isActive()) {
                int iA = this.f37320b.a(this.f37321c);
                InterfaceC3878m9 interfaceC3878m9 = this.f37322d;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).a("VideoLoaderHelper", "Media loaded successfully from URL with cache progress: " + iA);
                }
                P4.a(this.f37319a, new C3702f8(iA, this.f37323e.getDuration(), this.f37321c));
            }
            this.f37323e.removeListener(this);
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        androidx.media3.common.p.s(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC3878m9 interfaceC3878m9 = this.f37322d;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("VideoLoaderHelper", "Failed to load URL (" + this.f37321c + "): " + error.getMessage());
        }
        if (this.f37319a.isActive()) {
            P4.a(this.f37319a, new C3625c8(Am.f36590d));
        }
        this.f37323e.removeListener(this);
        this.f37323e.stop();
        this.f37323e.clearMediaItems();
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
        androidx.media3.common.p.u(this, playbackException);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
        androidx.media3.common.p.v(this, z10, i10);
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

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onCues(List list) {
        androidx.media3.common.p.e(this, list);
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
        androidx.media3.common.p.y(this, positionInfo, positionInfo2, i10);
    }
}
