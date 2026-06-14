package androidx.media3.exoplayer.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.ColorInfo;
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
import androidx.media3.common.p;
import androidx.media3.common.text.CueGroup;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.DecoderCounters;
import androidx.media3.exoplayer.ExoPlayer;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes5.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    private final class Updater implements Player.Listener, Runnable {
        private Updater() {
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            p.a(this, audioAttributes);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAudioSessionIdChanged(int i10) {
            p.b(this, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onAvailableCommandsChanged(Player.Commands commands) {
            p.c(this, commands);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onCues(CueGroup cueGroup) {
            p.d(this, cueGroup);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            p.f(this, deviceInfo);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onDeviceVolumeChanged(int i10, boolean z10) {
            p.g(this, i10, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onEvents(Player player, Player.Events events) {
            p.h(this, player, events);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onIsLoadingChanged(boolean z10) {
            p.i(this, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onIsPlayingChanged(boolean z10) {
            p.j(this, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onLoadingChanged(boolean z10) {
            p.k(this, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMaxSeekToPreviousPositionChanged(long j10) {
            p.l(this, j10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMediaItemTransition(MediaItem mediaItem, int i10) {
            p.m(this, mediaItem, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            p.n(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onMetadata(Metadata metadata) {
            p.o(this, metadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            p.q(this, playbackParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaybackSuppressionReasonChanged(int i10) {
            p.s(this, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            p.t(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerErrorChanged(PlaybackException playbackException) {
            p.u(this, playbackException);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlayerStateChanged(boolean z10, int i10) {
            p.v(this, z10, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            p.w(this, mediaMetadata);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onPositionDiscontinuity(int i10) {
            p.x(this, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onRenderedFirstFrame() {
            p.z(this);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onRepeatModeChanged(int i10) {
            p.A(this, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSeekBackIncrementChanged(long j10) {
            p.B(this, j10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSeekForwardIncrementChanged(long j10) {
            p.C(this, j10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onShuffleModeEnabledChanged(boolean z10) {
            p.D(this, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSkipSilenceEnabledChanged(boolean z10) {
            p.E(this, z10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onSurfaceSizeChanged(int i10, int i11) {
            p.F(this, i10, i11);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTimelineChanged(Timeline timeline, int i10) {
            p.G(this, timeline, i10);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            p.H(this, trackSelectionParameters);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onTracksChanged(Tracks tracks) {
            p.I(this, tracks);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onVideoSizeChanged(VideoSize videoSize) {
            p.J(this, videoSize);
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f10) {
            p.K(this, f10);
        }

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // androidx.media3.common.Player.Listener
        public /* synthetic */ void onCues(List list) {
            p.e(this, list);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            DebugTextViewHelper.this.updateAndPost();
        }
    }

    public DebugTextViewHelper(ExoPlayer exoPlayer, TextView textView) {
        Assertions.checkArgument(exoPlayer.getApplicationLooper() == Looper.getMainLooper());
        this.player = exoPlayer;
        this.textView = textView;
        this.updater = new Updater();
    }

    private static String getColorInfoString(@Nullable ColorInfo colorInfo) {
        if (colorInfo == null || !colorInfo.isValid()) {
            return "";
        }
        return " colr:" + colorInfo.toLogString();
    }

    private static String getDecoderCountersBufferCountString(DecoderCounters decoderCounters) {
        if (decoderCounters == null) {
            return "";
        }
        decoderCounters.ensureUpdated();
        return " sib:" + decoderCounters.skippedInputBufferCount + " sb:" + decoderCounters.skippedOutputBufferCount + " rb:" + decoderCounters.renderedOutputBufferCount + " db:" + decoderCounters.droppedBufferCount + " mcdb:" + decoderCounters.maxConsecutiveDroppedBufferCount + " dk:" + decoderCounters.droppedToKeyframeCount;
    }

    private static String getPixelAspectRatioString(float f10) {
        if (f10 == -1.0f || f10 == 1.0f) {
            return "";
        }
        return " par:" + String.format(Locale.US, "%.02f", Float.valueOf(f10));
    }

    private static String getVideoFrameProcessingOffsetAverageString(long j10, int i10) {
        return i10 == 0 ? "N/A" : String.valueOf((long) (j10 / ((double) i10)));
    }

    @UnstableApi
    protected String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        return IOUtils.LINE_SEPARATOR_UNIX + audioFormat.sampleMimeType + "(id:" + audioFormat.f4631id + " hz:" + audioFormat.sampleRate + " ch:" + audioFormat.channelCount + getDecoderCountersBufferCountString(audioDecoderCounters) + ")";
    }

    @UnstableApi
    protected String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    @UnstableApi
    protected String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : C4240b4.i.f42627g0 : C4240b4.i.f42650s : "buffering" : "idle", Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    @UnstableApi
    protected String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        VideoSize videoSize = this.player.getVideoSize();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        return IOUtils.LINE_SEPARATOR_UNIX + videoFormat.sampleMimeType + "(id:" + videoFormat.f4631id + " r:" + videoSize.width + "x" + videoSize.height + getColorInfoString(videoFormat.colorInfo) + getPixelAspectRatioString(videoSize.pixelWidthHeightRatio) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount) + ")";
    }

    public final void start() {
        if (this.started) {
            return;
        }
        this.started = true;
        this.player.addListener(this.updater);
        updateAndPost();
    }

    public final void stop() {
        if (this.started) {
            this.started = false;
            this.player.removeListener(this.updater);
            this.textView.removeCallbacks(this.updater);
        }
    }

    @SuppressLint({"SetTextI18n"})
    @UnstableApi
    protected final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
