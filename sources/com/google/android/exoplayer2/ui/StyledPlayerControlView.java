package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.exoplayer2.DeviceInfo;
import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.Format;
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
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionOverride;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.ui.TimeBar;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.RepeatModeUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class StyledPlayerControlView extends FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;

    @Nullable
    private final View audioTrackButton;
    private final AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final ComponentListener componentListener;
    private final StyledPlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;

    @Nullable
    private final TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;

    @Nullable
    private final View fastForwardButton;

    @Nullable
    private final TextView fastForwardButtonTextView;
    private final StringBuilder formatBuilder;
    private final Formatter formatter;

    @Nullable
    private final ImageView fullScreenButton;
    private final String fullScreenEnterContentDescription;
    private final Drawable fullScreenEnterDrawable;
    private final String fullScreenExitContentDescription;
    private final Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;

    @Nullable
    private final ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;

    @Nullable
    private final View nextButton;

    @Nullable
    private OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final Timeline.Period period;

    @Nullable
    private final View playPauseButton;
    private final PlaybackSpeedAdapter playbackSpeedAdapter;

    @Nullable
    private final View playbackSpeedButton;
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
    private final Resources resources;

    @Nullable
    private final View rewindButton;

    @Nullable
    private final TextView rewindButtonTextView;
    private boolean scrubbing;
    private final SettingsAdapter settingsAdapter;

    @Nullable
    private final View settingsButton;
    private final RecyclerView settingsView;
    private final PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private int showTimeoutMs;

    @Nullable
    private final ImageView shuffleButton;
    private final Drawable shuffleOffButtonDrawable;
    private final String shuffleOffContentDescription;
    private final Drawable shuffleOnButtonDrawable;
    private final String shuffleOnContentDescription;

    @Nullable
    private final ImageView subtitleButton;
    private final Drawable subtitleOffButtonDrawable;
    private final String subtitleOffContentDescription;
    private final Drawable subtitleOnButtonDrawable;
    private final String subtitleOnContentDescription;
    private final TextTrackSelectionAdapter textTrackSelectionAdapter;

    @Nullable
    private final TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final TrackNameProvider trackNameProvider;
    private final Runnable updateProgressAction;
    private final CopyOnWriteArrayList<VisibilityListener> visibilityListeners;

    @Nullable
    private final View vrButton;
    private final Timeline.Window window;

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioTrackSelectionAdapter extends TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        public static /* synthetic */ void b(AudioTrackSelectionAdapter audioTrackSelectionAdapter, View view) {
            if (StyledPlayerControlView.this.player == null) {
                return;
            }
            ((Player) Util.castNonNull(StyledPlayerControlView.this.player)).setTrackSelectionParameters(StyledPlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        private boolean hasSelectionOverride(TrackSelectionParameters trackSelectionParameters) {
            for (int i10 = 0; i10 < this.tracks.size(); i10++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i10).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            this.tracks = list;
            TrackSelectionParameters trackSelectionParameters = ((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, StyledPlayerControlView.this.getResources().getString(R.string.exo_track_selection_auto));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                TrackInformation trackInformation = list.get(i10);
                if (trackInformation.isSelected()) {
                    StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((Player) Assertions.checkNotNull(StyledPlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.AudioTrackSelectionAdapter.b(this.f25181b, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
            StyledPlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }
    }

    private final class ComponentListener implements Player.Listener, TimeBar.OnScrubListener, View.OnClickListener, PopupWindow.OnDismissListener {
        private ComponentListener() {
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

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Player player = StyledPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (StyledPlayerControlView.this.nextButton == view) {
                player.seekToNext();
                return;
            }
            if (StyledPlayerControlView.this.previousButton == view) {
                player.seekToPrevious();
                return;
            }
            if (StyledPlayerControlView.this.fastForwardButton == view) {
                if (player.getPlaybackState() != 4) {
                    player.seekForward();
                    return;
                }
                return;
            }
            if (StyledPlayerControlView.this.rewindButton == view) {
                player.seekBack();
                return;
            }
            if (StyledPlayerControlView.this.playPauseButton == view) {
                StyledPlayerControlView.this.dispatchPlayPause(player);
                return;
            }
            if (StyledPlayerControlView.this.repeatToggleButton == view) {
                player.setRepeatMode(RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), StyledPlayerControlView.this.repeatToggleModes));
                return;
            }
            if (StyledPlayerControlView.this.shuffleButton == view) {
                player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                return;
            }
            if (StyledPlayerControlView.this.settingsButton == view) {
                StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.displaySettingsWindow(styledPlayerControlView.settingsAdapter, StyledPlayerControlView.this.settingsButton);
                return;
            }
            if (StyledPlayerControlView.this.playbackSpeedButton == view) {
                StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView2 = StyledPlayerControlView.this;
                styledPlayerControlView2.displaySettingsWindow(styledPlayerControlView2.playbackSpeedAdapter, StyledPlayerControlView.this.playbackSpeedButton);
            } else if (StyledPlayerControlView.this.audioTrackButton == view) {
                StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView3 = StyledPlayerControlView.this;
                styledPlayerControlView3.displaySettingsWindow(styledPlayerControlView3.audioTrackSelectionAdapter, StyledPlayerControlView.this.audioTrackButton);
            } else if (StyledPlayerControlView.this.subtitleButton == view) {
                StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                StyledPlayerControlView styledPlayerControlView4 = StyledPlayerControlView.this;
                styledPlayerControlView4.displaySettingsWindow(styledPlayerControlView4.textTrackSelectionAdapter, StyledPlayerControlView.this.subtitleButton);
            }
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

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (StyledPlayerControlView.this.needToHideBars) {
                StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            if (events.containsAny(4, 5)) {
                StyledPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                StyledPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                StyledPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                StyledPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                StyledPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                StyledPlayerControlView.this.updateTimeline();
            }
            if (events.contains(12)) {
                StyledPlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.contains(2)) {
                StyledPlayerControlView.this.updateTrackLists();
            }
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
        public /* synthetic */ void onPlaybackStateChanged(int i10) {
            s2.r(this, i10);
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

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubMove(TimeBar timeBar, long j10) {
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j10));
            }
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStart(TimeBar timeBar, long j10) {
            StyledPlayerControlView.this.scrubbing = true;
            if (StyledPlayerControlView.this.positionView != null) {
                StyledPlayerControlView.this.positionView.setText(Util.getStringForTime(StyledPlayerControlView.this.formatBuilder, StyledPlayerControlView.this.formatter, j10));
            }
            StyledPlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // com.google.android.exoplayer2.ui.TimeBar.OnScrubListener
        public void onScrubStop(TimeBar timeBar, long j10, boolean z10) {
            StyledPlayerControlView.this.scrubbing = false;
            if (!z10 && StyledPlayerControlView.this.player != null) {
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                styledPlayerControlView.seekToTimeBarPosition(styledPlayerControlView.player, j10);
            }
            StyledPlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
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

    @Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class PlaybackSpeedAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        private final String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public static /* synthetic */ void a(PlaybackSpeedAdapter playbackSpeedAdapter, int i10, View view) {
            if (i10 != playbackSpeedAdapter.selectedIndex) {
                StyledPlayerControlView.this.setPlaybackSpeed(playbackSpeedAdapter.playbackSpeeds[i10]);
            }
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }

        public String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        public void updateSelectedIndex(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i10 >= fArr.length) {
                    this.selectedIndex = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, final int i10) {
            String[] strArr = this.playbackSpeedTexts;
            if (i10 < strArr.length) {
                subSettingViewHolder.textView.setText(strArr[i10]);
            }
            if (i10 == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.p
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.PlaybackSpeedAdapter.a(this.f25182b, i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j10, long j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SettingViewHolder extends RecyclerView.ViewHolder {
        private final ImageView iconView;
        private final TextView mainTextView;
        private final TextView subTextView;

        public SettingViewHolder(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (TextView) view.findViewById(R.id.exo_main_text);
            this.subTextView = (TextView) view.findViewById(R.id.exo_sub_text);
            this.iconView = (ImageView) view.findViewById(R.id.exo_icon);
            view.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    StyledPlayerControlView.SettingViewHolder settingViewHolder = this.f25184b;
                    StyledPlayerControlView.this.onSettingViewClicked(settingViewHolder.getAdapterPosition());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class SettingsAdapter extends RecyclerView.Adapter<SettingViewHolder> {
        private final Drawable[] iconIds;
        private final String[] mainTexts;
        private final String[] subTexts;

        public SettingsAdapter(String[] strArr, Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new String[strArr.length];
            this.iconIds = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i10) {
            return i10;
        }

        public void setSubTextAtPosition(int i10, String str) {
            this.subTexts[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SettingViewHolder settingViewHolder, int i10) {
            settingViewHolder.mainTextView.setText(this.mainTexts[i10]);
            if (this.subTexts[i10] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i10]);
            }
            if (this.iconIds[i10] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return StyledPlayerControlView.this.new SettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_settings_list_item, viewGroup, false));
        }
    }

    private static class SubSettingViewHolder extends RecyclerView.ViewHolder {
        public final View checkView;
        public final TextView textView;

        public SubSettingViewHolder(View view) {
            super(view);
            if (Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (TextView) view.findViewById(R.id.exo_text);
            this.checkView = view.findViewById(R.id.exo_check);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class TextTrackSelectionAdapter extends TrackSelectionAdapter {
        private TextTrackSelectionAdapter() {
            super();
        }

        public static /* synthetic */ void b(TextTrackSelectionAdapter textTrackSelectionAdapter, View view) {
            if (StyledPlayerControlView.this.player != null) {
                StyledPlayerControlView.this.player.setTrackSelectionParameters(StyledPlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
                StyledPlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void init(List<TrackInformation> list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).isSelected()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (StyledPlayerControlView.this.subtitleButton != null) {
                ImageView imageView = StyledPlayerControlView.this.subtitleButton;
                StyledPlayerControlView styledPlayerControlView = StyledPlayerControlView.this;
                imageView.setImageDrawable(z10 ? styledPlayerControlView.subtitleOnButtonDrawable : styledPlayerControlView.subtitleOffButtonDrawable);
                StyledPlayerControlView.this.subtitleButton.setContentDescription(z10 ? StyledPlayerControlView.this.subtitleOnContentDescription : StyledPlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder) {
            boolean z10;
            subSettingViewHolder.textView.setText(R.string.exo_track_selection_none);
            int i10 = 0;
            while (true) {
                if (i10 >= this.tracks.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.tracks.get(i10).isSelected()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z10 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.s
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.TextTrackSelectionAdapter.b(this.f25185b, view);
                }
            });
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(String str) {
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i10) {
            super.onBindViewHolder(subSettingViewHolder, i10);
            if (i10 > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i10 + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInformation {
        public final Tracks.Group trackGroup;
        public final int trackIndex;
        public final String trackName;

        public TrackInformation(Tracks tracks, int i10, int i11, String str) {
            this.trackGroup = tracks.getGroups().get(i10);
            this.trackIndex = i11;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class TrackSelectionAdapter extends RecyclerView.Adapter<SubSettingViewHolder> {
        protected List<TrackInformation> tracks = new ArrayList();

        protected TrackSelectionAdapter() {
        }

        public static /* synthetic */ void a(TrackSelectionAdapter trackSelectionAdapter, Player player, TrackGroup trackGroup, TrackInformation trackInformation, View view) {
            trackSelectionAdapter.getClass();
            player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new TrackSelectionOverride(trackGroup, ImmutableList.of(Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
            trackSelectionAdapter.onTrackSelection(trackInformation.trackName);
            StyledPlayerControlView.this.settingsWindow.dismiss();
        }

        protected void clear() {
            this.tracks = Collections.EMPTY_LIST;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        public abstract void init(List<TrackInformation> list);

        protected abstract void onBindViewHolderAtZeroPosition(SubSettingViewHolder subSettingViewHolder);

        protected abstract void onTrackSelection(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(SubSettingViewHolder subSettingViewHolder, int i10) {
            final Player player = StyledPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i10 == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final TrackInformation trackInformation = this.tracks.get(i10 - 1);
            final TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z10 = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z10 ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.t
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    StyledPlayerControlView.TrackSelectionAdapter.a(this.f25186b, player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public SubSettingViewHolder onCreateViewHolder(ViewGroup viewGroup, int i10) {
            return new SubSettingViewHolder(LayoutInflater.from(StyledPlayerControlView.this.getContext()).inflate(R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }
    }

    @Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i10);
    }

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public StyledPlayerControlView(Context context) {
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

    private void dispatchPause(Player player) {
        player.pause();
    }

    private void dispatchPlay(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1) {
            player.prepare();
        } else if (playbackState == 4) {
            seekTo(player, player.getCurrentMediaItemIndex(), -9223372036854775807L);
        }
        player.play();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dispatchPlayPause(Player player) {
        int playbackState = player.getPlaybackState();
        if (playbackState == 1 || playbackState == 4 || !player.getPlayWhenReady()) {
            dispatchPlay(player);
        } else {
            dispatchPause(player);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(RecyclerView.Adapter<?> adapter, View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    private ImmutableList<TrackInformation> gatherSupportedTrackInfosOfType(Tracks tracks, int i10) {
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Tracks.Group> groups = tracks.getGroups();
        for (int i11 = 0; i11 < groups.size(); i11++) {
            Tracks.Group group = groups.get(i11);
            if (group.getType() == i10) {
                for (int i12 = 0; i12 < group.length; i12++) {
                    if (group.isTrackSupported(i12)) {
                        Format trackFormat = group.getTrackFormat(i12);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add(new TrackInformation(tracks, i11, i12, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(ImmutableList.of());
            }
        }
    }

    private static void initializeFullScreenButton(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean isHandledMediaKey(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullScreenButtonClicked(View view) {
        if (this.onFullScreenModeChangedListener == null) {
            return;
        }
        boolean z10 = !this.isFullScreen;
        this.isFullScreen = z10;
        updateFullScreenButtonForState(this.fullScreenButton, z10);
        updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
        OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.isFullScreen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i10) {
        if (i10 == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else if (i10 == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (View) Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
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

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        Player player = this.player;
        if (player == null) {
            return;
        }
        player.setPlaybackParameters(player.getPlaybackParameters().withSpeed(f10));
    }

    private boolean shouldShowPauseButton() {
        Player player = this.player;
        return (player == null || player.getPlaybackState() == 4 || this.player.getPlaybackState() == 1 || !this.player.getPlayWhenReady()) ? false : true;
    }

    private void updateButton(boolean z10, @Nullable View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    private void updateFastForwardButton() {
        Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : 15000L) / 1000);
        TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekForwardIncrement));
        }
        View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, Integer.valueOf(seekForwardIncrement)));
        }
    }

    private void updateFullScreenButtonForState(@Nullable ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.fullScreenExitDrawable);
            imageView.setContentDescription(this.fullScreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    private static void updateFullScreenButtonVisibility(@Nullable View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
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
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            if (shouldShowPauseButton()) {
                ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_pause));
                this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_pause_description));
            } else {
                ((ImageView) this.playPauseButton).setImageDrawable(this.resources.getDrawable(R.drawable.exo_styled_controls_play));
                this.playPauseButton.setContentDescription(this.resources.getString(R.string.exo_controls_play_description));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
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
            TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
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
                updateButton(false, imageView);
                return;
            }
            Player player = this.player;
            if (player == null) {
                updateButton(false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    private void updateRewindButton() {
        Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(String.valueOf(seekBackIncrement));
        }
        View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
            } else {
                updateButton(true, this.shuffleButton);
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
    }

    @Deprecated
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
            dispatchPlayPause(player);
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
            dispatchPlay(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        dispatchPause(player);
        return true;
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    void notifyOnVisibilityChange() {
        Iterator<VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.controlViewLayoutManager.onLayout(z10, i10, i11, i12, i13);
    }

    @Deprecated
    public void removeVisibilityListener(VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    void requestPlayPauseFocus() {
        View view = this.playPauseButton;
        if (view != null) {
            view.requestFocus();
        }
    }

    public void setAnimationEnabled(boolean z10) {
        this.controlViewLayoutManager.setAnimationEnabled(z10);
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

    @Deprecated
    public void setOnFullScreenModeChangedListener(@Nullable OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener != null);
        updateFullScreenButtonVisibility(this.minimalFullScreenButton, onFullScreenModeChangedListener != null);
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
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i10 != 0);
        updateRepeatModeButton();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z10);
        updateNavigation();
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        this.showMultiWindowTimeBar = z10;
        updateTimeline();
    }

    public void setShowNextButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z10);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z10);
        updateNavigation();
    }

    public void setShowRewindButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z10);
        updateNavigation();
    }

    public void setShowShuffleButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z10);
        updateShuffleButton();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.showTimeoutMs = i10;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.timeBarMinUpdateIntervalMs = Util.constrainValue(i10, 16, 1000);
    }

    public void setVrButtonListener(@Nullable View.OnClickListener onClickListener) {
        View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static int getRepeatToggleModes(TypedArray typedArray, int i10) {
        return typedArray.getInt(R.styleable.StyledPlayerControlView_repeat_toggle_modes, i10);
    }

    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.view.LayoutInflater] */
    /* JADX WARN: Type inference failed for: r4v33, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v34, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v36, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v37, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r4v58 */
    /* JADX WARN: Type inference failed for: r4v59 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14, types: [android.widget.TextView] */
    /* JADX WARN: Type inference failed for: r5v35 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v3, types: [android.view.ViewGroup, com.google.android.exoplayer2.ui.StyledPlayerControlView$1] */
    /* JADX WARN: Type inference failed for: r9v4 */
    public StyledPlayerControlView(Context context, @Nullable AttributeSet attributeSet, int i10, @Nullable AttributeSet attributeSet2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        char c10;
        ?? r92;
        boolean z20;
        super(context, attributeSet, i10);
        int resourceId = R.layout.exo_styled_player_control_view;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, R.styleable.StyledPlayerControlView, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerControlView_controller_layout_id, resourceId);
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_show_timeout, this.showTimeoutMs);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_rewind_button, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_fastforward_button, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_previous_button, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_next_button, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_shuffle_button, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_subtitle_button, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_show_vr_button, false);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerControlView_animation_enabled, true);
                typedArrayObtainStyledAttributes.recycle();
                z11 = z25;
                z12 = z26;
                z10 = z27;
                z14 = z21;
                z15 = z22;
                z16 = z23;
                z13 = z28;
                z17 = z24;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            z10 = false;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
            z15 = true;
            z16 = true;
            z17 = true;
        }
        LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
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
        this.updateProgressAction = new Runnable() { // from class: com.google.android.exoplayer2.ui.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f25177b.updateProgress();
            }
        };
        this.durationView = (TextView) findViewById(R.id.exo_duration);
        this.positionView = (TextView) findViewById(R.id.exo_position);
        ImageView imageView = (ImageView) findViewById(R.id.exo_subtitle);
        this.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_fullscreen);
        this.fullScreenButton = imageView2;
        initializeFullScreenButton(imageView2, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25179b.onFullScreenButtonClicked(view);
            }
        });
        ImageView imageView3 = (ImageView) findViewById(R.id.exo_minimal_fullscreen);
        this.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new View.OnClickListener() { // from class: com.google.android.exoplayer2.ui.m
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f25179b.onFullScreenButtonClicked(view);
            }
        });
        View viewFindViewById = findViewById(R.id.exo_settings);
        this.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        View viewFindViewById2 = findViewById(R.id.exo_playback_speed);
        this.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        View viewFindViewById3 = findViewById(R.id.exo_audio_track);
        this.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        int i11 = R.id.exo_progress;
        TimeBar timeBar = (TimeBar) findViewById(i11);
        View viewFindViewById4 = findViewById(R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
            z18 = z10;
            z19 = z13;
            c10 = 1;
            r92 = 0;
        } else if (viewFindViewById4 != null) {
            z19 = z13;
            c10 = 1;
            z18 = z10;
            r92 = 0;
            DefaultTimeBar defaultTimeBar = new DefaultTimeBar(context, null, 0, attributeSet2, R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(i11);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            z18 = z10;
            z19 = z13;
            c10 = 1;
            r92 = 0;
            this.timeBar = null;
        }
        TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        View viewFindViewById5 = findViewById(R.id.exo_play_pause);
        this.playPauseButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        View viewFindViewById6 = findViewById(R.id.exo_prev);
        this.previousButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        View viewFindViewById7 = findViewById(R.id.exo_next);
        this.nextButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        Typeface font = ResourcesCompat.getFont(context, R.font.roboto_medium_numbers);
        ?? FindViewById = findViewById(R.id.exo_rew);
        ?? r52 = FindViewById == 0 ? (TextView) findViewById(R.id.exo_rew_with_amount) : r92;
        this.rewindButtonTextView = r52;
        if (r52 != 0) {
            r52.setTypeface(font);
        }
        FindViewById = FindViewById == 0 ? r52 : FindViewById;
        this.rewindButton = FindViewById;
        if (FindViewById != 0) {
            FindViewById.setOnClickListener(componentListener);
        }
        ?? FindViewById2 = findViewById(R.id.exo_ffwd);
        ?? r53 = FindViewById2 == 0 ? (TextView) findViewById(R.id.exo_ffwd_with_amount) : r92;
        this.fastForwardButtonTextView = r53;
        if (r53 != 0) {
            r53.setTypeface(font);
        }
        FindViewById2 = FindViewById2 == 0 ? r53 : FindViewById2;
        this.fastForwardButton = FindViewById2;
        if (FindViewById2 != 0) {
            FindViewById2.setOnClickListener(componentListener);
        }
        ImageView imageView4 = (ImageView) findViewById(R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        ImageView imageView5 = (ImageView) findViewById(R.id.exo_shuffle);
        this.shuffleButton = imageView5;
        if (imageView5 != null) {
            imageView5.setOnClickListener(componentListener);
        }
        Resources resources = context.getResources();
        this.resources = resources;
        this.buttonAlphaEnabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        View viewFindViewById8 = findViewById(R.id.exo_vr);
        this.vrButton = viewFindViewById8;
        if (viewFindViewById8 != null) {
            updateButton(false, viewFindViewById8);
        }
        StyledPlayerControlViewLayoutManager styledPlayerControlViewLayoutManager = new StyledPlayerControlViewLayoutManager(this);
        this.controlViewLayoutManager = styledPlayerControlViewLayoutManager;
        styledPlayerControlViewLayoutManager.setAnimationEnabled(z19);
        String string = resources.getString(R.string.exo_controls_playback_speed);
        Drawable drawable = resources.getDrawable(R.drawable.exo_styled_controls_speed);
        String[] strArr = {string, resources.getString(R.string.exo_track_selection_title_audio)};
        Drawable drawable2 = resources.getDrawable(R.drawable.exo_styled_controls_audiotrack);
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = drawable;
        drawableArr[c10] = drawable2;
        SettingsAdapter settingsAdapter = new SettingsAdapter(strArr, drawableArr);
        this.settingsAdapter = settingsAdapter;
        this.settingsWindowMargin = resources.getDimensionPixelSize(R.dimen.exo_settings_offset);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(R.layout.exo_styled_settings_list, r92);
        this.settingsView = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        ?? r62 = c10;
        PopupWindow popupWindow = new PopupWindow(recyclerView, -2, -2, (boolean) r62);
        this.settingsWindow = popupWindow;
        if (Util.SDK_INT < 23) {
            z20 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z20 = false;
        }
        popupWindow.setOnDismissListener(componentListener);
        this.needToHideBars = r62;
        this.trackNameProvider = new DefaultTrackNameProvider(getResources());
        this.subtitleOnButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_on);
        this.subtitleOffButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_subtitle_off);
        this.subtitleOnContentDescription = resources.getString(R.string.exo_controls_cc_enabled_description);
        this.subtitleOffContentDescription = resources.getString(R.string.exo_controls_cc_disabled_description);
        this.textTrackSelectionAdapter = new TextTrackSelectionAdapter();
        this.audioTrackSelectionAdapter = new AudioTrackSelectionAdapter();
        this.playbackSpeedAdapter = new PlaybackSpeedAdapter(resources.getStringArray(R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        this.fullScreenExitDrawable = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_exit);
        this.fullScreenEnterDrawable = resources.getDrawable(R.drawable.exo_styled_controls_fullscreen_enter);
        this.repeatOffButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_repeat_off);
        this.repeatOneButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_repeat_one);
        this.repeatAllButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_repeat_all);
        this.shuffleOnButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_on);
        this.shuffleOffButtonDrawable = resources.getDrawable(R.drawable.exo_styled_controls_shuffle_off);
        this.fullScreenExitContentDescription = resources.getString(R.string.exo_controls_fullscreen_exit_description);
        this.fullScreenEnterContentDescription = resources.getString(R.string.exo_controls_fullscreen_enter_description);
        this.repeatOffButtonContentDescription = resources.getString(R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = this.resources.getString(R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = this.resources.getString(R.string.exo_controls_shuffle_off_description);
        this.controlViewLayoutManager.setShowButton((ViewGroup) findViewById(R.id.exo_bottom_bar), true);
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z15);
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z14);
        this.controlViewLayoutManager.setShowButton(this.previousButton, z16);
        this.controlViewLayoutManager.setShowButton(this.nextButton, z17);
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z11);
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z12);
        this.controlViewLayoutManager.setShowButton(this.vrButton, z18);
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, this.repeatToggleModes != 0 ? true : z20);
        addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.google.android.exoplayer2.ui.n
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                this.f25180b.onLayoutChange(view, i12, i13, i14, i15, i16, i17, i18, i19);
            }
        });
    }
}
