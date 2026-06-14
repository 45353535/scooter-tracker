package com.google.android.exoplayer2.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.exoplayer2.DeviceInfo;
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
import com.google.android.exoplayer2.text.CueGroup;
import com.google.android.exoplayer2.trackselection.TrackSelectionParameters;
import com.google.android.exoplayer2.ui.AspectRatioFrameLayout;
import com.google.android.exoplayer2.ui.StyledPlayerControlView;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ErrorMessageProvider;
import com.google.android.exoplayer2.util.Util;
import com.google.android.exoplayer2.video.VideoDecoderGLSurfaceView;
import com.google.android.exoplayer2.video.VideoSize;
import com.google.android.exoplayer2.video.spherical.SphericalGLSurfaceView;
import com.google.common.collect.ImmutableList;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class StyledPlayerView extends FrameLayout implements AdViewProvider {
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;

    @Nullable
    private final FrameLayout adOverlayFrameLayout;

    @Nullable
    private final ImageView artworkView;

    @Nullable
    private final View bufferingView;
    private final ComponentListener componentListener;

    @Nullable
    private final AspectRatioFrameLayout contentFrame;

    @Nullable
    private final StyledPlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;

    @Nullable
    private ControllerVisibilityListener controllerVisibilityListener;

    @Nullable
    private CharSequence customErrorMessage;

    @Nullable
    private Drawable defaultArtwork;

    @Nullable
    private ErrorMessageProvider<? super PlaybackException> errorMessageProvider;

    @Nullable
    private final TextView errorMessageView;

    @Nullable
    private FullscreenButtonClickListener fullscreenButtonClickListener;
    private boolean isTouching;
    private boolean keepContentOnPlayerReset;

    @Nullable
    private StyledPlayerControlView.VisibilityListener legacyControllerVisibilityListener;

    @Nullable
    private final FrameLayout overlayFrameLayout;

    @Nullable
    private Player player;
    private int showBuffering;

    @Nullable
    private final View shutterView;

    @Nullable
    private final SubtitleView subtitleView;

    @Nullable
    private final View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useArtwork;
    private boolean useController;

    private final class ComponentListener implements Player.Listener, View.OnLayoutChangeListener, View.OnClickListener, StyledPlayerControlView.VisibilityListener, StyledPlayerControlView.OnFullScreenModeChangedListener {

        @Nullable
        private Object lastPeriodUidWithTracks;
        private final Timeline.Period period = new Timeline.Period();

        public ComponentListener() {
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
            StyledPlayerView.this.toggleControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onCues(List list) {
            s2.e(this, list);
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

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.OnFullScreenModeChangedListener
        public void onFullScreenModeChanged(boolean z10) {
            if (StyledPlayerView.this.fullscreenButtonClickListener != null) {
                StyledPlayerView.this.fullscreenButtonClickListener.onFullscreenButtonClick(z10);
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

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
            StyledPlayerView.applyTextureViewRotation((TextureView) view, StyledPlayerView.this.textureViewRotation);
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
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateControllerVisibility();
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onPlaybackParametersChanged(PlaybackParameters playbackParameters) {
            s2.q(this, playbackParameters);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPlaybackStateChanged(int i10) {
            StyledPlayerView.this.updateBuffering();
            StyledPlayerView.this.updateErrorMessage();
            StyledPlayerView.this.updateControllerVisibility();
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
        public void onRenderedFirstFrame() {
            if (StyledPlayerView.this.shutterView != null) {
                StyledPlayerView.this.shutterView.setVisibility(4);
            }
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
        public void onTracksChanged(Tracks tracks) {
            Player player = (Player) Assertions.checkNotNull(StyledPlayerView.this.player);
            Timeline currentTimeline = player.getCurrentTimeline();
            if (currentTimeline.isEmpty()) {
                this.lastPeriodUidWithTracks = null;
            } else if (player.getCurrentTracks().isEmpty()) {
                Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (player.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, this.period).windowIndex) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            } else {
                this.lastPeriodUidWithTracks = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), this.period, true).uid;
            }
            StyledPlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onVideoSizeChanged(VideoSize videoSize) {
            StyledPlayerView.this.updateAspectRatio();
        }

        @Override // com.google.android.exoplayer2.ui.StyledPlayerControlView.VisibilityListener
        public void onVisibilityChange(int i10) {
            StyledPlayerView.this.updateContentDescription();
            if (StyledPlayerView.this.controllerVisibilityListener != null) {
                StyledPlayerView.this.controllerVisibilityListener.onVisibilityChanged(i10);
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public /* synthetic */ void onVolumeChanged(float f10) {
            s2.L(this, f10);
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onCues(CueGroup cueGroup) {
            if (StyledPlayerView.this.subtitleView != null) {
                StyledPlayerView.this.subtitleView.setCues(cueGroup.cues);
            }
        }

        @Override // com.google.android.exoplayer2.Player.Listener
        public void onPositionDiscontinuity(Player.PositionInfo positionInfo, Player.PositionInfo positionInfo2, int i10) {
            if (StyledPlayerView.this.isPlayingAd() && StyledPlayerView.this.controllerHideDuringAds) {
                StyledPlayerView.this.hideController();
            }
        }
    }

    public interface ControllerVisibilityListener {
        void onVisibilityChanged(int i10);
    }

    public interface FullscreenButtonClickListener {
        void onFullscreenButtonClick(boolean z10);
    }

    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    public StyledPlayerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(TextureView textureView, int i10) {
        Matrix matrix = new Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i10 != 0) {
            float f10 = width / 2.0f;
            float f11 = height / 2.0f;
            matrix.postRotate(i10, f10, f11);
            RectF rectF = new RectF(0.0f, 0.0f, width, height);
            RectF rectF2 = new RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f10, f11);
        }
        textureView.setTransform(matrix);
    }

    private void closeShutter() {
        View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void configureEditModeLogo(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color));
    }

    @RequiresApi(23)
    private static void configureEditModeLogoV23(Resources resources, ImageView imageView) {
        imageView.setImageDrawable(resources.getDrawable(R.drawable.exo_edit_mode_logo, null));
        imageView.setBackgroundColor(resources.getColor(R.color.exo_edit_mode_background_color, null));
    }

    private void hideArtwork() {
        ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean isDpadKey(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        Player player = this.player;
        return player != null && player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    private void maybeShowController(boolean z10) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z11 = this.controller.isFullyVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z10 || z11 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    private boolean setArtworkFromMediaMetadata(MediaMetadata mediaMetadata) {
        byte[] bArr = mediaMetadata.artworkData;
        if (bArr == null) {
            return false;
        }
        return setDrawableArtwork(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean setDrawableArtwork(@Nullable Drawable drawable) {
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                onContentAspectRatioChanged(this.contentFrame, intrinsicWidth / intrinsicHeight);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void setResizeModeRaw(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean shouldShowControllerIndefinitely() {
        Player player = this.player;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        if (!this.controllerAutoShow || this.player.getCurrentTimeline().isEmpty()) {
            return false;
        }
        return playbackState == 1 || playbackState == 4 || !((Player) Assertions.checkNotNull(this.player)).getPlayWhenReady();
    }

    public static void switchTargetView(Player player, @Nullable StyledPlayerView styledPlayerView, @Nullable StyledPlayerView styledPlayerView2) {
        if (styledPlayerView == styledPlayerView2) {
            return;
        }
        if (styledPlayerView2 != null) {
            styledPlayerView2.setPlayer(player);
        }
        if (styledPlayerView != null) {
            styledPlayerView.setPlayer(null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.isFullyVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.hide();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        Player player = this.player;
        VideoSize videoSize = player != null ? player.getVideoSize() : VideoSize.UNKNOWN;
        int i10 = videoSize.width;
        int i11 = videoSize.height;
        int i12 = videoSize.unappliedRotationDegrees;
        float f10 = (i11 == 0 || i10 == 0) ? 0.0f : (i10 * videoSize.pixelWidthHeightRatio) / i11;
        View view = this.surfaceView;
        if (view instanceof TextureView) {
            if (f10 > 0.0f && (i12 == 90 || i12 == 270)) {
                f10 = 1.0f / f10;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i12;
            if (i12 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((TextureView) this.surfaceView, this.textureViewRotation);
        }
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void updateBuffering() {
        /*
            r4 = this;
            android.view.View r0 = r4.bufferingView
            if (r0 == 0) goto L2b
            com.google.android.exoplayer2.Player r0 = r4.player
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.getPlaybackState()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.showBuffering
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            com.google.android.exoplayer2.Player r0 = r4.player
            boolean r0 = r0.getPlayWhenReady()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.bufferingView
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.StyledPlayerView.updateBuffering():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (styledPlayerControlView.isFullyVisible()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        ErrorMessageProvider<? super PlaybackException> errorMessageProvider;
        TextView textView = this.errorMessageView;
        if (textView != null) {
            CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            Player player = this.player;
            PlaybackException playerError = player != null ? player.getPlayerError() : null;
            if (playerError == null || (errorMessageProvider = this.errorMessageProvider) == null) {
                this.errorMessageView.setVisibility(8);
            } else {
                this.errorMessageView.setText((CharSequence) errorMessageProvider.getErrorMessage(playerError).second);
                this.errorMessageView.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z10) {
        Player player = this.player;
        if (player == null || player.getCurrentTracks().isEmpty()) {
            if (this.keepContentOnPlayerReset) {
                return;
            }
            hideArtwork();
            closeShutter();
            return;
        }
        if (z10 && !this.keepContentOnPlayerReset) {
            closeShutter();
        }
        if (player.getCurrentTracks().isTypeSelected(2)) {
            hideArtwork();
            return;
        }
        closeShutter();
        if (useArtwork() && (setArtworkFromMediaMetadata(player.getMediaMetadata()) || setDrawableArtwork(this.defaultArtwork))) {
            return;
        }
        hideArtwork();
    }

    private boolean useArtwork() {
        if (!this.useArtwork) {
            return false;
        }
        Assertions.checkStateNotNull(this.artworkView);
        return true;
    }

    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        Assertions.checkStateNotNull(this.controller);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        Player player = this.player;
        if (player != null && player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.isFullyVisible()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (zIsDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public List<AdOverlayInfo> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.overlayFrameLayout;
        if (frameLayout != null) {
            arrayList.add(new AdOverlayInfo(frameLayout, 4, "Transparent overlay does not impact viewability"));
        }
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView != null) {
            arrayList.add(new AdOverlayInfo(styledPlayerControlView, 1));
        }
        return ImmutableList.copyOf((Collection) arrayList);
    }

    @Override // com.google.android.exoplayer2.ui.AdViewProvider
    public ViewGroup getAdViewGroup() {
        return (ViewGroup) Assertions.checkStateNotNull(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    @Nullable
    public Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    @Nullable
    public FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    @Nullable
    public Player getPlayer() {
        return this.player;
    }

    public int getResizeMode() {
        Assertions.checkStateNotNull(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    @Nullable
    public SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    public boolean getUseArtwork() {
        return this.useArtwork;
    }

    public boolean getUseController() {
        return this.useController;
    }

    @Nullable
    public View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public void hideController() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        if (styledPlayerControlView != null) {
            styledPlayerControlView.hide();
        }
    }

    public boolean isControllerFullyVisible() {
        StyledPlayerControlView styledPlayerControlView = this.controller;
        return styledPlayerControlView != null && styledPlayerControlView.isFullyVisible();
    }

    protected void onContentAspectRatioChanged(@Nullable AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void onPause() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void onResume() {
        View view = this.surfaceView;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onResume();
        }
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    public void setAspectRatioListener(@Nullable AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setAspectRatioListener(aspectRatioListener);
    }

    public void setControllerAutoShow(boolean z10) {
        this.controllerAutoShow = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.controllerHideDuringAds = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controllerHideOnTouch = z10;
        updateContentDescription();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(@Nullable StyledPlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        Assertions.checkStateNotNull(this.controller);
        this.fullscreenButtonClickListener = null;
        this.controller.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    public void setControllerShowTimeoutMs(int i10) {
        Assertions.checkStateNotNull(this.controller);
        this.controllerShowTimeoutMs = i10;
        if (this.controller.isFullyVisible()) {
            showController();
        }
    }

    public void setControllerVisibilityListener(@Nullable ControllerVisibilityListener controllerVisibilityListener) {
        this.controllerVisibilityListener = controllerVisibilityListener;
        setControllerVisibilityListener((StyledPlayerControlView.VisibilityListener) null);
    }

    public void setCustomErrorMessage(@Nullable CharSequence charSequence) {
        Assertions.checkState(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    public void setDefaultArtwork(@Nullable Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setErrorMessageProvider(@Nullable ErrorMessageProvider<? super PlaybackException> errorMessageProvider) {
        if (this.errorMessageProvider != errorMessageProvider) {
            this.errorMessageProvider = errorMessageProvider;
            updateErrorMessage();
        }
    }

    public void setExtraAdGroupMarkers(@Nullable long[] jArr, @Nullable boolean[] zArr) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setFullscreenButtonClickListener(@Nullable FullscreenButtonClickListener fullscreenButtonClickListener) {
        Assertions.checkStateNotNull(this.controller);
        this.fullscreenButtonClickListener = fullscreenButtonClickListener;
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.keepContentOnPlayerReset != z10) {
            this.keepContentOnPlayerReset = z10;
            updateForCurrentTrackSelections(false);
        }
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
            View view = this.surfaceView;
            if (view instanceof TextureView) {
                player2.clearVideoTextureView((TextureView) view);
            } else if (view instanceof SurfaceView) {
                player2.clearVideoSurfaceView((SurfaceView) view);
            }
        }
        SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = player;
        if (useController()) {
            this.controller.setPlayer(player);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (player == null) {
            hideController();
            return;
        }
        if (player.isCommandAvailable(27)) {
            View view2 = this.surfaceView;
            if (view2 instanceof TextureView) {
                player.setVideoTextureView((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                player.setVideoSurfaceView((SurfaceView) view2);
            }
            updateAspectRatio();
        }
        if (this.subtitleView != null && player.isCommandAvailable(28)) {
            this.subtitleView.setCues(player.getCurrentCues().cues);
        }
        player.addListener(this.componentListener);
        maybeShowController(false);
    }

    public void setRepeatToggleModes(int i10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.showBuffering != i10) {
            this.showBuffering = i10;
            updateBuffering();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowFastForwardButton(z10);
    }

    public void setShowMultiWindowTimeBar(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowNextButton(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        Assertions.checkStateNotNull(this.controller);
        this.controller.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(@ColorInt int i10) {
        View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    public void setUseArtwork(boolean z10) {
        Assertions.checkState((z10 && this.artworkView == null) ? false : true);
        if (this.useArtwork != z10) {
            this.useArtwork = z10;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        Assertions.checkState((z10 && this.controller == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.useController == z10) {
            return;
        }
        this.useController = z10;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            StyledPlayerControlView styledPlayerControlView = this.controller;
            if (styledPlayerControlView != null) {
                styledPlayerControlView.hide();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.surfaceView;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private void showController(boolean z10) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z10 ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StyledPlayerView(Context context, @Nullable AttributeSet attributeSet, int i10) {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        boolean z12;
        int i14;
        int i15;
        boolean z13;
        int i16;
        boolean z14;
        boolean z15;
        boolean z16;
        int i17;
        boolean z17;
        super(context, attributeSet, i10);
        ComponentListener componentListener = new ComponentListener();
        this.componentListener = componentListener;
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            ImageView imageView = new ImageView(context);
            if (Util.SDK_INT >= 23) {
                configureEditModeLogoV23(getResources(), imageView);
            } else {
                configureEditModeLogo(getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i18 = R.layout.exo_styled_player_view;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R.styleable.StyledPlayerView, i10, 0);
            try {
                int i19 = R.styleable.StyledPlayerView_shutter_background_color;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i19);
                int color = typedArrayObtainStyledAttributes.getColor(i19, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_player_layout_id, i18);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_artwork, true);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.StyledPlayerView_default_artwork, 0);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_use_controller, true);
                int i20 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_surface_type, 1);
                int i21 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_resize_mode, 0);
                int i22 = typedArrayObtainStyledAttributes.getInt(R.styleable.StyledPlayerView_show_timeout, 5000);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_on_touch, true);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(R.styleable.StyledPlayerView_show_buffering, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.StyledPlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i18 = resourceId;
                z12 = z20;
                i11 = i22;
                z11 = z22;
                i13 = i21;
                z10 = z21;
                i12 = integer;
                z15 = zHasValue;
                i15 = color;
                i14 = i20;
                z14 = z19;
                i16 = resourceId2;
                z13 = z18;
            } catch (Throwable th2) {
                typedArrayObtainStyledAttributes.recycle();
                throw th2;
            }
        } else {
            i11 = 5000;
            i12 = 0;
            z10 = true;
            z11 = true;
            i13 = 0;
            z12 = true;
            i14 = 1;
            i15 = 0;
            z13 = true;
            i16 = 0;
            z14 = true;
            z15 = false;
        }
        LayoutInflater.from(context).inflate(i18, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i13);
        }
        View viewFindViewById = findViewById(R.id.exo_shutter);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && z15) {
            viewFindViewById.setBackgroundColor(i15);
        }
        if (aspectRatioFrameLayout != null && i14 != 0) {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i14 == 2) {
                this.surfaceView = new TextureView(context);
            } else if (i14 == 3) {
                try {
                    int i23 = SphericalGLSurfaceView.f25253b;
                    this.surfaceView = (View) SphericalGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                    z17 = true;
                    this.surfaceView.setLayoutParams(layoutParams);
                    this.surfaceView.setOnClickListener(componentListener);
                    this.surfaceView.setClickable(false);
                    aspectRatioFrameLayout.addView(this.surfaceView, 0);
                    z16 = z17;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i14 != 4) {
                this.surfaceView = new SurfaceView(context);
            } else {
                try {
                    int i24 = VideoDecoderGLSurfaceView.f25225b;
                    this.surfaceView = (View) VideoDecoderGLSurfaceView.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z17 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(componentListener);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
            z16 = z17;
        } else {
            this.surfaceView = null;
            z16 = false;
        }
        this.surfaceViewIgnoresVideoAspectRatio = z16;
        this.adOverlayFrameLayout = (FrameLayout) findViewById(R.id.exo_ad_overlay);
        this.overlayFrameLayout = (FrameLayout) findViewById(R.id.exo_overlay);
        ImageView imageView2 = (ImageView) findViewById(R.id.exo_artwork);
        this.artworkView = imageView2;
        this.useArtwork = z13 && imageView2 != null;
        if (i16 != 0) {
            this.defaultArtwork = ContextCompat.getDrawable(getContext(), i16);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        View viewFindViewById2 = findViewById(R.id.exo_buffering);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i12;
        TextView textView = (TextView) findViewById(R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i25 = R.id.exo_controller;
        StyledPlayerControlView styledPlayerControlView = (StyledPlayerControlView) findViewById(i25);
        View viewFindViewById3 = findViewById(R.id.exo_controller_placeholder);
        if (styledPlayerControlView != null) {
            this.controller = styledPlayerControlView;
            i17 = 0;
        } else if (viewFindViewById3 != null) {
            i17 = 0;
            StyledPlayerControlView styledPlayerControlView2 = new StyledPlayerControlView(context, null, 0, attributeSet);
            this.controller = styledPlayerControlView2;
            styledPlayerControlView2.setId(i25);
            styledPlayerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(styledPlayerControlView2, iIndexOfChild);
        } else {
            i17 = 0;
            this.controller = null;
        }
        StyledPlayerControlView styledPlayerControlView3 = this.controller;
        this.controllerShowTimeoutMs = styledPlayerControlView3 != null ? i11 : i17;
        this.controllerHideOnTouch = z12;
        this.controllerAutoShow = z10;
        this.controllerHideDuringAds = z11;
        this.useController = (!z14 || styledPlayerControlView3 == null) ? i17 : 1;
        if (styledPlayerControlView3 != null) {
            styledPlayerControlView3.hideImmediately();
            this.controller.addVisibilityListener(componentListener);
        }
        if (z14) {
            setClickable(true);
        }
        updateContentDescription();
    }

    @Deprecated
    public void setControllerVisibilityListener(@Nullable StyledPlayerControlView.VisibilityListener visibilityListener) {
        Assertions.checkStateNotNull(this.controller);
        StyledPlayerControlView.VisibilityListener visibilityListener2 = this.legacyControllerVisibilityListener;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            this.controller.removeVisibilityListener(visibilityListener2);
        }
        this.legacyControllerVisibilityListener = visibilityListener;
        if (visibilityListener != null) {
            this.controller.addVisibilityListener(visibilityListener);
        }
        setControllerVisibilityListener((ControllerVisibilityListener) null);
    }
}
