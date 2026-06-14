package com.inmobi.media;

import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.Format;
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
import com.google.common.collect.ImmutableList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class F7 implements Player.Listener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f36829a;

    public F7(N7 n72) {
        this.f36829a = n72;
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
    public final void onIsLoadingChanged(boolean z10) {
        androidx.media3.common.p.i(this, z10);
        if (z10) {
            this.f36829a.f37416o.setVisibility(0);
        } else {
            this.f36829a.f37416o.setVisibility(8);
        }
        if (this.f36829a.f37417p.getPlaybackState() == 3 && this.f36829a.f37417p.getBufferedPercentage() == 100) {
            this.f36829a.a(W7.f37935a);
        }
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
        androidx.media3.common.p.r(this, i10);
        if (i10 == 4) {
            InterfaceC3878m9 interfaceC3878m9 = this.f36829a.f37403b;
            if (interfaceC3878m9 != null) {
                ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "Playback ended");
            }
            C4074u6 c4074u6 = this.f36829a.f37425x;
            if (c4074u6.f39644g != 2) {
                c4074u6.f39644g = 2;
                eg.i.d(c4074u6.f39639b, eg.o0.c().w(), null, new C3975q6(c4074u6, c4074u6.f39638a.getDuration(), null), 2, null);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
        androidx.media3.common.p.s(this, i10);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onPlayerError(PlaybackException error) {
        Intrinsics.checkNotNullParameter(error, "error");
        InterfaceC3878m9 interfaceC3878m9 = this.f36829a.f37403b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).a("HtmlMediaPlayer", "Playback error: " + error.getErrorCodeName(), error);
        }
        this.f36829a.f37413l.set(EnumC4034sg.f39538g);
        N7 n72 = this.f36829a;
        int i10 = error.errorCode;
        String errorCodeName = error.getErrorCodeName();
        Intrinsics.checkNotNullExpressionValue(errorCodeName, "getErrorCodeName(...)");
        n72.a(new C3778i8(errorCodeName));
        this.f36829a.f();
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
    public final void onTracksChanged(Tracks tracks) {
        Tracks.Group next;
        Intrinsics.checkNotNullParameter(tracks, "tracks");
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        Intrinsics.checkNotNullExpressionValue(groups, "getGroups(...)");
        Iterator<Tracks.Group> it = groups.iterator();
        while (true) {
            if (it.hasNext()) {
                next = it.next();
                if (next.getType() == 2) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        Tracks.Group group = next;
        if (group != null) {
            N7 n72 = this.f36829a;
            int i10 = group.getMediaTrackGroup().length;
            for (int i11 = 0; i11 < i10; i11++) {
                Format format = group.getMediaTrackGroup().getFormat(i11);
                Intrinsics.checkNotNullExpressionValue(format, "getFormat(...)");
                InterfaceC3878m9 interfaceC3878m9 = n72.f37403b;
                if (interfaceC3878m9 != null) {
                    ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "Metadata loaded: " + format.width + "x" + format.height + ", " + format.sampleMimeType);
                }
                n72.a(C3753h8.f38693a);
            }
        }
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVideoSizeChanged(VideoSize videoSize) {
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        InterfaceC3878m9 interfaceC3878m9 = this.f36829a.f37403b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).b("HtmlMediaPlayer", "onVideoSizeChanged: width=" + videoSize.width + ", height=" + videoSize.height + ", ratio=" + videoSize.pixelWidthHeightRatio);
        }
        this.f36829a.f37410i = (int) (videoSize.width * videoSize.pixelWidthHeightRatio);
        this.f36829a.f37411j = videoSize.height;
        N7 n72 = this.f36829a;
        G1 g12 = n72.f37415n;
        int i10 = n72.f37410i;
        int i11 = this.f36829a.f37411j;
        g12.getClass();
        if (i10 > 0 && i11 > 0) {
            g12.f36915a = i10 / i11;
            g12.requestLayout();
        }
        this.f36829a.f37427z.f39172d.a(videoSize.width, videoSize.height);
    }

    @Override // androidx.media3.common.Player.Listener
    public final void onVolumeChanged(float f10) {
        androidx.media3.common.p.K(this, f10);
        if (f10 == 0.0f || f10 == 1.0f) {
            return;
        }
        N7 n72 = this.f36829a;
        boolean z10 = n72.f37426y.f37699e;
        n72.a(new Vn());
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
