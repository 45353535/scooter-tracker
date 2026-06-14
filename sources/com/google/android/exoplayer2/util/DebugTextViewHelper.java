package com.google.android.exoplayer2.util;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayer;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.PlaybackParameters;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.Tracks;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.decoder.DecoderCounters;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.s2;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.video.VideoSize;
import com.ironsource.C4240b4;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public class DebugTextViewHelper {
    private static final int REFRESH_INTERVAL_MS = 1000;
    private final ExoPlayer player;
    private boolean started;
    private final TextView textView;
    private final Updater updater;

    private final class Updater implements Player.Listener, Runnable {
        private Updater() {
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
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            s2.q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            DebugTextViewHelper.this.updateAndPost();
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

        @Override // java.lang.Runnable
        public void run() {
            DebugTextViewHelper.this.updateAndPost();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            s2.e(this, list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
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

    protected String getAudioString() {
        Format audioFormat = this.player.getAudioFormat();
        DecoderCounters audioDecoderCounters = this.player.getAudioDecoderCounters();
        if (audioFormat == null || audioDecoderCounters == null) {
            return "";
        }
        return IOUtils.LINE_SEPARATOR_UNIX + audioFormat.sampleMimeType + "(id:" + audioFormat.f24619id + " hz:" + audioFormat.sampleRate + " ch:" + audioFormat.channelCount + getDecoderCountersBufferCountString(audioDecoderCounters) + ")";
    }

    protected String getDebugString() {
        return getPlayerStateString() + getVideoString() + getAudioString();
    }

    protected String getPlayerStateString() {
        int playbackState = this.player.getPlaybackState();
        return String.format("playWhenReady:%s playbackState:%s item:%s", Boolean.valueOf(this.player.getPlayWhenReady()), playbackState != 1 ? playbackState != 2 ? playbackState != 3 ? playbackState != 4 ? "unknown" : C4240b4.i.f42627g0 : C4240b4.i.f42650s : "buffering" : "idle", Integer.valueOf(this.player.getCurrentMediaItemIndex()));
    }

    protected String getVideoString() {
        Format videoFormat = this.player.getVideoFormat();
        DecoderCounters videoDecoderCounters = this.player.getVideoDecoderCounters();
        if (videoFormat == null || videoDecoderCounters == null) {
            return "";
        }
        return IOUtils.LINE_SEPARATOR_UNIX + videoFormat.sampleMimeType + "(id:" + videoFormat.f24619id + " r:" + videoFormat.width + "x" + videoFormat.height + getPixelAspectRatioString(videoFormat.pixelWidthHeightRatio) + getDecoderCountersBufferCountString(videoDecoderCounters) + " vfpo: " + getVideoFrameProcessingOffsetAverageString(videoDecoderCounters.totalVideoFrameProcessingOffsetUs, videoDecoderCounters.videoFrameProcessingOffsetCount) + ")";
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
    protected final void updateAndPost() {
        this.textView.setText(getDebugString());
        this.textView.removeCallbacks(this.updater);
        this.textView.postDelayed(this.updater, 1000L);
    }
}
