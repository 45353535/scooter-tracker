package androidx.media3.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.media3.common.AudioAttributes;
import androidx.media3.common.DeviceInfo;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaLibraryInfo;
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
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.RepeatModeUtil;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.ui.TimeBar;
import java.util.Arrays;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes5.dex */
@UnstableApi
public class LegacyPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;
    private final Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;

    @Nullable
    private final View nextButton;

    @Nullable
    private final View pauseButton;
    private final Timeline.Period period;

    @Nullable
    private final View playButton;
    private boolean[] playedAdGroups;

    @Nullable
    private Player player;

    @Nullable
    private final TextView positionView;

    @Nullable
    private final View previousButton;

    @Nullable
    private ProgressUpdateListener progressUpdateListener;
    private final String repeatAllButtonContentDescription;
    private final Drawable repeatAllButtonDrawable;
    private final String repeatOffButtonContentDescription;
    private final Drawable repeatOffButtonDrawable;
    private final String repeatOneButtonContentDescription;
    private final Drawable repeatOneButtonDrawable;

    @Nullable
    private final ImageView repeatToggleButton;
    private int repeatToggleModes;

    @Nullable
    private final View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPlayButtonIfSuppressed;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    @RequiresApi(21)
    private static final class Api21 {
        private Api21() {
        }

        @DoNotInline
        public static boolean isAccessibilityFocused(View view) {
            return view.isAccessibilityFocused();
        }
    }

    private final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener {
        private ComponentListener() {
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = LegacyPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (LegacyPlayerControlView.this.nextButton == view) {
                player.seekToNext();
                return;
            }
            if (LegacyPlayerControlView.this.previousButton == view) {
                player.seekToPrevious();
                return;
            }
            if (LegacyPlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                    return;
                }
                return;
            }
            if (LegacyPlayerControlView.this.rewindButton == view) {
                player.seekBack();
                return;
            }
            if (LegacyPlayerControlView.this.playButton == view) {
                Util.handlePlayButtonAction(player);
                return;
            }
            if (LegacyPlayerControlView.this.pauseButton == view) {
                Util.handlePauseButtonAction(player);
            } else if (LegacyPlayerControlView.this.repeatToggleButton == view) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), LegacyPlayerControlView.this.repeatToggleModes));
            } else if (LegacyPlayerControlView.this.shuffleButton == view) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
            }
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
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                LegacyPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                LegacyPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                LegacyPlayerControlView.this.updateTimeline();
            }
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
        public /* synthetic */ void onPlayerError(PlaybackException playbackException) {
            androidx.media3.common.p.t(this, playbackException);
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

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j10) {
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j10));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j10) {
            LegacyPlayerControlView.this.scrubbing = true;
            if (LegacyPlayerControlView.this.positionView != null) {
                LegacyPlayerControlView.this.positionView.setText(Util.getStringForTime(LegacyPlayerControlView.this.formatBuilder, LegacyPlayerControlView.this.formatter, j10));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j10, boolean z10) {
            LegacyPlayerControlView.this.scrubbing = false;
            if (z10 || LegacyPlayerControlView.this.player == null) {
                return;
            }
            LegacyPlayerControlView legacyPlayerControlView = LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j10);
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

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j10, long j11);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i10);
    }

    static {
        MediaLibraryInfo.registerModule("media3.ui");
    }

    public LegacyPlayerControlView(Context context) {
        this(context, null);
    }

    private static boolean canShowMultiWindowTimeBar(Timeline timeline, Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i10 = 0; i10 < windowCount; i10++) {
            if (timeline.getWindow(i10, window).durationUs == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs <= 0) {
            this.hideAtMs = -9223372036854775807L;
            return;
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        int i10 = this.showTimeoutMs;
        this.hideAtMs = jUptimeMillis + ((long) i10);
        if (this.isAttachedToWindow) {
            postDelayed(this.hideAction, i10);
        }
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    private void requestPlayPauseAccessibilityFocus() {
        View view;
        View view2;
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void requestPlayPauseFocus() {
        View view;
        View view2;
        boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void seekTo(Player player, int i10, long j10) {
        player.seekTo(i10, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(Player player, long j10) {
        int currentMediaItemIndex;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j10 < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j10 = durationMs;
                    break;
                } else {
                    j10 -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j10);
        updateProgress();
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    private void updateButton(boolean z10, boolean z11, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z11);
        view.setAlpha(z11 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z10 ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            updateButton(this.showPreviousButton, zIsCommandAvailable3, this.previousButton);
            updateButton(this.showRewindButton, zIsCommandAvailable4, this.rewindButton);
            updateButton(this.showFastForwardButton, zIsCommandAvailable5, this.fastForwardButton);
            updateButton(this.showNextButton, zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z10;
        boolean z11;
        if (isVisible() && this.isAttachedToWindow) {
            boolean zShouldShowPlayButton = Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            View view = this.playButton;
            boolean z12 = true;
            if (view != null) {
                z10 = !zShouldShowPlayButton && view.isFocused();
                z11 = Util.SDK_INT < 21 ? z10 : !zShouldShowPlayButton && Api21.isAccessibilityFocused(this.playButton);
                this.playButton.setVisibility(zShouldShowPlayButton ? 0 : 8);
            } else {
                z10 = false;
                z11 = false;
            }
            View view2 = this.pauseButton;
            if (view2 != null) {
                z10 |= zShouldShowPlayButton && view2.isFocused();
                if (Util.SDK_INT < 21) {
                    z12 = z10;
                } else if (!zShouldShowPlayButton || !Api21.isAccessibilityFocused(this.pauseButton)) {
                    z12 = false;
                }
                z11 |= z12;
                this.pauseButton.setVisibility(zShouldShowPlayButton ? 8 : 0);
            }
            if (z10) {
                requestPlayPauseFocus();
            }
            if (z11) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            Player player = this.player;
            if (player != null) {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z10 = contentPosition != this.currentPosition;
            boolean z11 = contentBufferedPosition != this.currentBufferedPosition;
            this.currentPosition = contentPosition;
            this.currentBufferedPosition = contentBufferedPosition;
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z10) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z10 || z11)) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            TimeBar timeBar2 = this.timeBar;
            long jMin = Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f10 = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, Util.constrainValue(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, true, imageView);
                this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(player.getShuffleModeEnabled() ? this.shuffleOnContentDescription : this.shuffleOffContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTimeline() {
        int i10;
        Timeline.Window window;
        long j10;
        Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z10 = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        long j11 = 0;
        this.currentWindowOffset = 0L;
        Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            i10 = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z11 = this.multiWindowTimeBar;
            int i11 = z11 ? 0 : currentMediaItemIndex;
            int windowCount = z11 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            i10 = 0;
            long j12 = 0;
            while (true) {
                if (i11 > windowCount) {
                    break;
                }
                if (i11 == currentMediaItemIndex) {
                    this.currentWindowOffset = Util.usToMs(j12);
                }
                currentTimeline.getWindow(i11, this.window);
                Timeline.Window window2 = this.window;
                if (window2.durationUs == -9223372036854775807L) {
                    Assertions.checkState(this.multiWindowTimeBar ^ z10);
                    break;
                }
                int i12 = window2.firstPeriodIndex;
                while (true) {
                    window = this.window;
                    if (i12 <= window.lastPeriodIndex) {
                        currentTimeline.getPeriod(i12, this.period);
                        int removedAdGroupCount = this.period.getRemovedAdGroupCount();
                        int adGroupCount = this.period.getAdGroupCount();
                        while (removedAdGroupCount < adGroupCount) {
                            long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                            if (adGroupTimeUs == Long.MIN_VALUE) {
                                j10 = j11;
                                long j13 = this.period.durationUs;
                                if (j13 == -9223372036854775807L) {
                                    removedAdGroupCount++;
                                    j11 = j10;
                                } else {
                                    adGroupTimeUs = j13;
                                }
                            } else {
                                j10 = j11;
                            }
                            long positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= j10) {
                                long[] jArr = this.adGroupTimesMs;
                                if (i10 == jArr.length) {
                                    int length = jArr.length == 0 ? 1 : jArr.length * 2;
                                    this.adGroupTimesMs = Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i10] = Util.usToMs(j12 + positionInWindowUs);
                                this.playedAdGroups[i10] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i10++;
                            }
                            removedAdGroupCount++;
                            j11 = j10;
                        }
                        i12++;
                    }
                }
                j12 += window.durationUs;
                i11++;
                j11 = j11;
                z10 = true;
            }
            j11 = j12;
        }
        long jUsToMs = Util.usToMs(j11);
        TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i13 = i10 + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i13 > jArr2.length) {
                this.adGroupTimesMs = Arrays.copyOf(jArr2, i13);
                this.playedAdGroups = Arrays.copyOf(this.playedAdGroups, i13);
            }
            System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i10, length2);
            System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i10, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i13);
        }
        updateProgress();
    }

    public void addVisibilityListener(VisibilityListener visibilityListener) {
        Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        Util.handlePauseButtonAction(player);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = -9223372036854775807L;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j10 = this.hideAtMs;
        if (j10 != -9223372036854775807L) {
            long jUptimeMillis = j10 - SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, jUptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) Assertions.checkNotNull(zArr);
            Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void setPlayer(@Nullable Player player) {
        Assertions.checkState(Looper.myLooper() == Looper.getMainLooper());
        Assertions.checkArgument(player == null || player.getApplicationLooper() == Looper.getMainLooper());
        Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    public void setProgressUpdateListener(@Nullable ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setRepeatToggleModes(int i10) {
        this.repeatToggleModes = i10;
        Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i10 == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i10 == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i10 == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.showFastForwardButton = z10;
        updateNavigation();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.showMultiWindowTimeBar = z10;
        updateTimeline();
    }

    public void setShowNextButton(boolean z10) {
        this.showNextButton = z10;
        updateNavigation();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.showPlayButtonIfSuppressed = z10;
        updatePlayPauseButton();
    }

    public void setShowPreviousButton(boolean z10) {
        this.showPreviousButton = z10;
        updateNavigation();
    }

    public void setShowRewindButton(boolean z10) {
        this.showRewindButton = z10;
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z10) {
        this.showShuffleButton = z10;
        updateShuffleButton();
    }

    public void setShowTimeoutMs(int i10) {
        this.showTimeoutMs = i10;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public void setShowVrButton(boolean z10) {
        View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z10 ? 0 : 8);
        }
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.LegacyPlayerControlView_repeat_toggle_modes, i10);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    public LegacyPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) {
        super(context, attributeSet, i10);
        int resourceId = R.layout.exo_legacy_player_control_view;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = -9223372036854775807L;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.LegacyPlayerControlView, i10, 0);
            try {
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.LegacyPlayerControlView_show_timeout, this.showTimeoutMs);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = typedArrayObtainStyledAttributes.getBoolean(R.styleable.LegacyPlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.LegacyPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
            } finally {
                typedArrayObtainStyledAttributes.recycle();
            }
        }
        this.visibilityListeners = new CopyOnWriteArrayList<>();
        this.period = new Timeline.Period();
        this.window = new Timeline.Window();
        StringBuilder sb2 = new StringBuilder();
        this.formatBuilder = sb2;
        this.formatter = new Formatter(sb2, Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new Runnable() { // from class: androidx.media3.ui.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f5325b.updateProgress();
            }
        };
        this.hideAction = new Runnable() { // from class: androidx.media3.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f5326b.hide();
            }
        };
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        int i11 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i11);
        View viewFindViewById = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
        } else if (viewFindViewById != null) {
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        View viewFindViewById2 = findViewById(R.id.exo_play);
        this.playButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(R.id.exo_pause);
        this.pauseButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        View viewFindViewById4 = findViewById(R.id.exo_prev);
        this.previousButton = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(componentListener);
        }
        View viewFindViewById5 = findViewById(R.id.exo_next);
        this.nextButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(R.id.exo_rew);
        this.rewindButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(R.id.exo_ffwd);
        this.fastForwardButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        ImageView imageView = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.vrButton = viewFindViewById8;
        setShowVrButton(false);
        updateButton(false, false, viewFindViewById8);
        Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_off);
        this.repeatOneButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_one);
        this.repeatAllButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_repeat_all);
        this.shuffleOnButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_shuffle_on);
        this.shuffleOffButtonDrawable = Util.getDrawable(context, resources, R.drawable.exo_legacy_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(R.string.exo_controls_shuffle_off_description);
        this.currentPosition = -9223372036854775807L;
        this.currentBufferedPosition = -9223372036854775807L;
    }
}
