package com.mobilefuse.videoplayer.controller;

import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.model.VastPlayerCapability;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\r\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0015J\b\u0010\u0016\u001a\u00020\u0005H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0016J\b\u0010\u0018\u001a\u00020\u0013H\u0016J\b\u0010\u0019\u001a\u00020\u0013H\u0016J\u000e\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0005J\u0010\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u0005H\u0016R\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/MuteControllerImpl;", "Lcom/mobilefuse/videoplayer/controller/BaseModuleController;", "Lcom/mobilefuse/videoplayer/controller/MuteController;", "()V", "<set-?>", "", "isMuteAllowed", "()Z", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "muted", "getMuted", "mutedWhenVisible", "Ljava/lang/Boolean;", "applyMuteToPlayer", "", "enableMuteButton", "enableMuteButton$mobilefuse_video_player_release", "isMuted", "onVideoBecameInvisible", "onVideoBecameVisible", "setMuteAllowed", "setMuteFromWebView", "mutedValue", "setMuted", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class MuteControllerImpl extends BaseModuleController implements MuteController {
    private boolean isMuteAllowed;

    @Nullable
    private MuteChangedListener muteChangedListener;
    private boolean muted;
    private Boolean mutedWhenVisible;

    private final void applyMuteToPlayer() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            getVideoPlayer().getPlayer().setVolume(this.muted ? 0.0f : 1.0f);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void enableMuteButton$mobilefuse_video_player_release() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (getIsMuteAllowed()) {
                callJsBridgeCmd("vast.bridge.setMuteAllowed();");
                setMuted(this.muted);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteChangedListener;
    }

    public final boolean getMuted() {
        return this.muted;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    /* JADX INFO: renamed from: isMuteAllowed, reason: from getter */
    public boolean getIsMuteAllowed() {
        return this.isMuteAllowed;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public boolean isMuted() {
        return this.muted;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameInvisible() {
        if (!isMuted() && this.mutedWhenVisible == null) {
            setMuted(true);
            this.mutedWhenVisible = Boolean.FALSE;
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameVisible() {
        Boolean bool = this.mutedWhenVisible;
        this.mutedWhenVisible = null;
        if (bool != null) {
            setMuted(bool.booleanValue());
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteAllowed() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.isMuteAllowed = true;
            getVideoPlayer().getPlayerCapabilities().changeCapability(VastPlayerCapability.MUTE, true);
            if (getPlayerState() != VideoPlayer.PlayerState.PLAYING && getPlayerState() != VideoPlayer.PlayerState.PAUSED) {
                return;
            }
            enableMuteButton$mobilefuse_video_player_release();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteChangedListener = muteChangedListener;
    }

    public final void setMuteFromWebView(boolean mutedValue) {
        this.muted = mutedValue;
        applyMuteToPlayer();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuted(boolean muted) {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (this.muted != muted) {
                this.muted = muted;
                if (this.mutedWhenVisible != null) {
                    this.mutedWhenVisible = null;
                }
                if (getVideoPlayer().getCurrentPlaybackPositionMillis() > 0 && (getPlayerState() == VideoPlayer.PlayerState.PLAYING || getPlayerState() == VideoPlayer.PlayerState.PAUSED)) {
                    getVideoPlayer().getController().onMuteChanged();
                }
            }
            callJsBridgeCmd("vast.bridge.setMuted(" + muted + ");");
            applyMuteToPlayer();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }
}
