package com.google.android.exoplayer2;

import android.os.Looper;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.TextureView;
import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.audio.AudioAttributes;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.util.Size;
import com.google.android.exoplayer2.video.VideoSize;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ForwardingPlayer implements Player {
    private final Player player;

    private static final class ForwardingListener implements Player.Listener {
        private final ForwardingPlayer forwardingPlayer;
        private final Player.Listener listener;

        public ForwardingListener(ForwardingPlayer forwardingPlayer, Player.Listener listener) {
            this.forwardingPlayer = forwardingPlayer;
            this.listener = listener;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ForwardingListener)) {
                return false;
            }
            ForwardingListener forwardingListener = (ForwardingListener) obj;
            if (this.forwardingPlayer.equals(forwardingListener.forwardingPlayer)) {
                return this.listener.equals(forwardingListener.listener);
            }
            return false;
        }

        public int hashCode() {
            return (this.forwardingPlayer.hashCode() * 31) + this.listener.hashCode();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioAttributesChanged(AudioAttributes audioAttributes) {
            this.listener.onAudioAttributesChanged(audioAttributes);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAudioSessionIdChanged(int i10) {
            this.listener.onAudioSessionIdChanged(i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onAvailableCommandsChanged(Player.Commands commands) {
            this.listener.onAvailableCommandsChanged(commands);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(List<Cue> list) {
            this.listener.onCues(list);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceInfoChanged(DeviceInfo deviceInfo) {
            this.listener.onDeviceInfoChanged(deviceInfo);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onDeviceVolumeChanged(int i10, boolean z10) {
            this.listener.onDeviceVolumeChanged(i10, z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onEvents(Player player, Player.Events events) {
            this.listener.onEvents(this.forwardingPlayer, events);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsLoadingChanged(boolean z10) {
            this.listener.onIsLoadingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onIsPlayingChanged(boolean z10) {
            this.listener.onIsPlayingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onLoadingChanged(boolean z10) {
            this.listener.onIsLoadingChanged(z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMaxSeekToPreviousPositionChanged(long j10) {
            this.listener.onMaxSeekToPreviousPositionChanged(j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaItemTransition(@Nullable MediaItem mediaItem, int i10) {
            this.listener.onMediaItemTransition(mediaItem, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMediaMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onMediaMetadataChanged(mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onMetadata(Metadata metadata) {
            this.listener.onMetadata(metadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayWhenReadyChanged(boolean z10, int i10) {
            this.listener.onPlayWhenReadyChanged(z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            this.listener.onPlaybackParametersChanged(playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            this.listener.onPlaybackStateChanged(i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackSuppressionReasonChanged(int i10) {
            this.listener.onPlaybackSuppressionReasonChanged(i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerError(PlaybackException playbackException) {
            this.listener.onPlayerError(playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerErrorChanged(@Nullable PlaybackException playbackException) {
            this.listener.onPlayerErrorChanged(playbackException);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlayerStateChanged(boolean z10, int i10) {
            this.listener.onPlayerStateChanged(z10, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaylistMetadataChanged(MediaMetadata mediaMetadata) {
            this.listener.onPlaylistMetadataChanged(mediaMetadata);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(int i10) {
            this.listener.onPositionDiscontinuity(i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRenderedFirstFrame() {
            this.listener.onRenderedFirstFrame();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onRepeatModeChanged(int i10) {
            this.listener.onRepeatModeChanged(i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekBackIncrementChanged(long j10) {
            this.listener.onSeekBackIncrementChanged(j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekForwardIncrementChanged(long j10) {
            this.listener.onSeekForwardIncrementChanged(j10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSeekProcessed() {
            this.listener.onSeekProcessed();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onShuffleModeEnabledChanged(boolean z10) {
            this.listener.onShuffleModeEnabledChanged(z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSkipSilenceEnabledChanged(boolean z10) {
            this.listener.onSkipSilenceEnabledChanged(z10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onSurfaceSizeChanged(int i10, int i11) {
            this.listener.onSurfaceSizeChanged(i10, i11);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTimelineChanged(Timeline timeline, int i10) {
            this.listener.onTimelineChanged(timeline, i10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTrackSelectionParametersChanged(TrackSelectionParameters trackSelectionParameters) {
            this.listener.onTrackSelectionParametersChanged(trackSelectionParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onTracksChanged(Tracks tracks) {
            this.listener.onTracksChanged(tracks);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            this.listener.onVideoSizeChanged(videoSize);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVolumeChanged(float f10) {
            this.listener.onVolumeChanged(f10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(CueGroup cueGroup) {
            this.listener.onCues(cueGroup);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            this.listener.onPositionDiscontinuity(positionInfo, positionInfo2, i10);
        }
    }

    public ForwardingPlayer(Player player) {
        this.player = player;
    }

    @Override // com.google.android.exoplayer2.Player
    @CallSuper
    public void addListener(Player.Listener listener) {
        this.player.addListener(new ForwardingListener(this, listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(MediaItem mediaItem) {
        this.player.addMediaItem(mediaItem);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(List<MediaItem> list) {
        this.player.addMediaItems(list);
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean canAdvertiseSession() {
        return this.player.canAdvertiseSession();
    }

    @Override // com.google.android.exoplayer2.Player
    public void clearMediaItems() {
        this.player.clearMediaItems();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface() {
        this.player.clearVideoSurface();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.clearVideoSurfaceHolder(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.clearVideoSurfaceView(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoTextureView(@Nullable TextureView textureView) {
        this.player.clearVideoTextureView(textureView);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void decreaseDeviceVolume() {
        this.player.decreaseDeviceVolume();
    }

    @Override // com.google.android.exoplayer2.Player
    public Looper getApplicationLooper() {
        return this.player.getApplicationLooper();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public AudioAttributes getAudioAttributes() {
        return this.player.getAudioAttributes();
    }

    @Override // com.google.android.exoplayer2.Player
    public Player.Commands getAvailableCommands() {
        return this.player.getAvailableCommands();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getBufferedPercentage() {
        return this.player.getBufferedPercentage();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getBufferedPosition() {
        return this.player.getBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentBufferedPosition() {
        return this.player.getContentBufferedPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentDuration() {
        return this.player.getContentDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getContentPosition() {
        return this.player.getContentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdGroupIndex() {
        return this.player.getCurrentAdGroupIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentAdIndexInAdGroup() {
        return this.player.getCurrentAdIndexInAdGroup();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.TextComponent
    public CueGroup getCurrentCues() {
        return this.player.getCurrentCues();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentLiveOffset() {
        return this.player.getCurrentLiveOffset();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public Object getCurrentManifest() {
        return this.player.getCurrentManifest();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public MediaItem getCurrentMediaItem() {
        return this.player.getCurrentMediaItem();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentMediaItemIndex() {
        return this.player.getCurrentMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getCurrentPeriodIndex() {
        return this.player.getCurrentPeriodIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getCurrentPosition() {
        return this.player.getCurrentPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public Timeline getCurrentTimeline() {
        return this.player.getCurrentTimeline();
    }

    @Override // com.google.android.exoplayer2.Player
    public Tracks getCurrentTracks() {
        return this.player.getCurrentTracks();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public int getCurrentWindowIndex() {
        return this.player.getCurrentWindowIndex();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public DeviceInfo getDeviceInfo() {
        return this.player.getDeviceInfo();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public int getDeviceVolume() {
        return this.player.getDeviceVolume();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getDuration() {
        return this.player.getDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getMaxSeekToPreviousPosition() {
        return this.player.getMaxSeekToPreviousPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaItem getMediaItemAt(int i10) {
        return this.player.getMediaItemAt(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public int getMediaItemCount() {
        return this.player.getMediaItemCount();
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getMediaMetadata() {
        return this.player.getMediaMetadata();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getNextMediaItemIndex() {
        return this.player.getNextMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public int getNextWindowIndex() {
        return this.player.getNextWindowIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getPlayWhenReady() {
        return this.player.getPlayWhenReady();
    }

    @Override // com.google.android.exoplayer2.Player
    public PlaybackParameters getPlaybackParameters() {
        return this.player.getPlaybackParameters();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackState() {
        return this.player.getPlaybackState();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPlaybackSuppressionReason() {
        return this.player.getPlaybackSuppressionReason();
    }

    @Override // com.google.android.exoplayer2.Player
    @Nullable
    public PlaybackException getPlayerError() {
        return this.player.getPlayerError();
    }

    @Override // com.google.android.exoplayer2.Player
    public MediaMetadata getPlaylistMetadata() {
        return this.player.getPlaylistMetadata();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getPreviousMediaItemIndex() {
        return this.player.getPreviousMediaItemIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public int getPreviousWindowIndex() {
        return this.player.getPreviousWindowIndex();
    }

    @Override // com.google.android.exoplayer2.Player
    public int getRepeatMode() {
        return this.player.getRepeatMode();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekBackIncrement() {
        return this.player.getSeekBackIncrement();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getSeekForwardIncrement() {
        return this.player.getSeekForwardIncrement();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean getShuffleModeEnabled() {
        return this.player.getShuffleModeEnabled();
    }

    @Override // com.google.android.exoplayer2.Player
    public Size getSurfaceSize() {
        return this.player.getSurfaceSize();
    }

    @Override // com.google.android.exoplayer2.Player
    public long getTotalBufferedDuration() {
        return this.player.getTotalBufferedDuration();
    }

    @Override // com.google.android.exoplayer2.Player
    public TrackSelectionParameters getTrackSelectionParameters() {
        return this.player.getTrackSelectionParameters();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public VideoSize getVideoSize() {
        return this.player.getVideoSize();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public float getVolume() {
        return this.player.getVolume();
    }

    public Player getWrappedPlayer() {
        return this.player;
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasNext() {
        return this.player.hasNext();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasNextMediaItem() {
        return this.player.hasNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasNextWindow() {
        return this.player.hasNextWindow();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasPrevious() {
        return this.player.hasPrevious();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean hasPreviousMediaItem() {
        return this.player.hasPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean hasPreviousWindow() {
        return this.player.hasPreviousWindow();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void increaseDeviceVolume() {
        this.player.increaseDeviceVolume();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCommandAvailable(int i10) {
        return this.player.isCommandAvailable(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemDynamic() {
        return this.player.isCurrentMediaItemDynamic();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemLive() {
        return this.player.isCurrentMediaItemLive();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isCurrentMediaItemSeekable() {
        return this.player.isCurrentMediaItemSeekable();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean isCurrentWindowDynamic() {
        return this.player.isCurrentWindowDynamic();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean isCurrentWindowLive() {
        return this.player.isCurrentWindowLive();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public boolean isCurrentWindowSeekable() {
        return this.player.isCurrentWindowSeekable();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public boolean isDeviceMuted() {
        return this.player.isDeviceMuted();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isLoading() {
        return this.player.isLoading();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlaying() {
        return this.player.isPlaying();
    }

    @Override // com.google.android.exoplayer2.Player
    public boolean isPlayingAd() {
        return this.player.isPlayingAd();
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItem(int i10, int i11) {
        this.player.moveMediaItem(i10, i11);
    }

    @Override // com.google.android.exoplayer2.Player
    public void moveMediaItems(int i10, int i11, int i12) {
        this.player.moveMediaItems(i10, i11, i12);
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void next() {
        this.player.next();
    }

    @Override // com.google.android.exoplayer2.Player
    public void pause() {
        this.player.pause();
    }

    @Override // com.google.android.exoplayer2.Player
    public void play() {
        this.player.play();
    }

    @Override // com.google.android.exoplayer2.Player
    public void prepare() {
        this.player.prepare();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void previous() {
        this.player.previous();
    }

    @Override // com.google.android.exoplayer2.Player
    public void release() {
        this.player.release();
    }

    @Override // com.google.android.exoplayer2.Player
    @CallSuper
    public void removeListener(Player.Listener listener) {
        this.player.removeListener(new ForwardingListener(this, listener));
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItem(int i10) {
        this.player.removeMediaItem(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void removeMediaItems(int i10, int i11) {
        this.player.removeMediaItems(i10, i11);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekBack() {
        this.player.seekBack();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekForward() {
        this.player.seekForward();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(long j10) {
        this.player.seekTo(j10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition() {
        this.player.seekToDefaultPosition();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNext() {
        this.player.seekToNext();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToNextMediaItem() {
        this.player.seekToNextMediaItem();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void seekToNextWindow() {
        this.player.seekToNextWindow();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPrevious() {
        this.player.seekToPrevious();
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToPreviousMediaItem() {
        this.player.seekToPreviousMediaItem();
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void seekToPreviousWindow() {
        this.player.seekToPreviousWindow();
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceMuted(boolean z10) {
        this.player.setDeviceMuted(z10);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.DeviceComponent
    public void setDeviceVolume(int i10) {
        this.player.setDeviceVolume(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem) {
        this.player.setMediaItem(mediaItem);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> list) {
        this.player.setMediaItems(list);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlayWhenReady(boolean z10) {
        this.player.setPlayWhenReady(z10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackParameters(PlaybackParameters playbackParameters) {
        this.player.setPlaybackParameters(playbackParameters);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaybackSpeed(float f10) {
        this.player.setPlaybackSpeed(f10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setPlaylistMetadata(MediaMetadata mediaMetadata) {
        this.player.setPlaylistMetadata(mediaMetadata);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setRepeatMode(int i10) {
        this.player.setRepeatMode(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setShuffleModeEnabled(boolean z10) {
        this.player.setShuffleModeEnabled(z10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setTrackSelectionParameters(TrackSelectionParameters trackSelectionParameters) {
        this.player.setTrackSelectionParameters(trackSelectionParameters);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurface(@Nullable Surface surface) {
        this.player.setVideoSurface(surface);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceHolder(@Nullable SurfaceHolder surfaceHolder) {
        this.player.setVideoSurfaceHolder(surfaceHolder);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoSurfaceView(@Nullable SurfaceView surfaceView) {
        this.player.setVideoSurfaceView(surfaceView);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void setVideoTextureView(@Nullable TextureView textureView) {
        this.player.setVideoTextureView(textureView);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.AudioComponent
    public void setVolume(float f10) {
        this.player.setVolume(f10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void stop() {
        this.player.stop();
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItem(int i10, MediaItem mediaItem) {
        this.player.addMediaItem(i10, mediaItem);
    }

    @Override // com.google.android.exoplayer2.Player
    public void addMediaItems(int i10, List<MediaItem> list) {
        this.player.addMediaItems(i10, list);
    }

    @Override // com.google.android.exoplayer2.Player, com.google.android.exoplayer2.ExoPlayer.VideoComponent
    public void clearVideoSurface(@Nullable Surface surface) {
        this.player.clearVideoSurface(surface);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekTo(int i10, long j10) {
        this.player.seekTo(i10, j10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void seekToDefaultPosition(int i10) {
        this.player.seekToDefaultPosition(i10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem, long j10) {
        this.player.setMediaItem(mediaItem, j10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> list, boolean z10) {
        this.player.setMediaItems(list, z10);
    }

    @Override // com.google.android.exoplayer2.Player
    @Deprecated
    public void stop(boolean z10) {
        this.player.stop(z10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItem(MediaItem mediaItem, boolean z10) {
        this.player.setMediaItem(mediaItem, z10);
    }

    @Override // com.google.android.exoplayer2.Player
    public void setMediaItems(List<MediaItem> list, int i10, long j10) {
        this.player.setMediaItems(list, i10, j10);
    }
}
