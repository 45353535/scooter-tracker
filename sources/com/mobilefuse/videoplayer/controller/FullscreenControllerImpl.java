package com.mobilefuse.videoplayer.controller;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.WebView;
import android.widget.PopupWindow;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.model.VastPlayerCapability;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u00012\u00020\u0002B\u0005¢\u0006\u0002\u0010\u0003J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0010\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020\fH\u0016J\r\u0010!\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\"J\b\u0010#\u001a\u00020\u001cH\u0002J\r\u0010$\u001a\u00020\u001cH\u0000¢\u0006\u0002\b%J\u0010\u0010&\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010'\u001a\u00020\u001c2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\b\u0010(\u001a\u00020\u001cH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0005X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005@RX\u0096\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0007R$\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0005@PX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/FullscreenControllerImpl;", "Lcom/mobilefuse/videoplayer/controller/BaseModuleController;", "Lcom/mobilefuse/videoplayer/controller/FullscreenController;", "()V", "enterFullscreenOnVideoTap", "", "getEnterFullscreenOnVideoTap", "()Z", "setEnterFullscreenOnVideoTap", "(Z)V", "externalFullscreenControl", "externalFullscreenControlBridge", "Lcom/mobilefuse/videoplayer/controller/ExternalFullscreenControlBridge;", "<set-?>", "fullscreen", "getFullscreen", "fullscreenAllowed", "getFullscreenAllowed", "setFullscreenAllowed$mobilefuse_video_player_release", "fullscreenChangedListener", "Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "getFullscreenChangedListener", "()Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "setFullscreenChangedListener", "(Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;)V", "fullscreenWindow", "Landroid/widget/PopupWindow;", "applyFullscreenToPlayer", "", "changeFullscreenState", "changedToFullscreen", "enableExternalFullscreenControl", "bridge", "enableFullscreenButton", "enableFullscreenButton$mobilefuse_video_player_release", "executeFullscreenEnter", "executeFullscreenExit", "executeFullscreenExit$mobilefuse_video_player_release", "setExternalFullscreen", "setFullscreen", "setFullscreenAllowed", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class FullscreenControllerImpl extends BaseModuleController implements FullscreenController {
    private boolean enterFullscreenOnVideoTap;
    private boolean externalFullscreenControl;
    private ExternalFullscreenControlBridge externalFullscreenControlBridge;
    private boolean fullscreen;
    private boolean fullscreenAllowed;

    @Nullable
    private FullscreenChangedListener fullscreenChangedListener;
    private PopupWindow fullscreenWindow;

    private final void applyFullscreenToPlayer() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            DebuggingKt.logDebug$default(this, "Apply fullscreen: " + getFullscreen(), null, 2, null);
            if (getVideoPlayer().getPlayer().getCanApplyFullscreen()) {
                if (getFullscreen()) {
                    executeFullscreenEnter();
                } else {
                    executeFullscreenExit$mobilefuse_video_player_release();
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeFullscreenState(boolean changedToFullscreen) {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (getFullscreen() == changedToFullscreen) {
                return;
            }
            this.fullscreen = changedToFullscreen;
            getVideoPlayer().getController().onFullscreenChanged();
            EndCardPresenter endCardPresenter = getEndCardPresenter();
            if (endCardPresenter != null) {
                endCardPresenter.onFullscreenChanged$mobilefuse_video_player_release(changedToFullscreen);
            }
            FullscreenChangedListener fullscreenChangedListener = getFullscreenChangedListener();
            if (fullscreenChangedListener != null) {
                fullscreenChangedListener.onFullscreenChanged(getFullscreen());
            }
            callJsBridgeCmd("vast.bridge.setFullscreen(" + getFullscreen() + ");");
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void executeFullscreenEnter() {
        Activity renderingActivity;
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (this.fullscreenWindow == null && (renderingActivity = getVideoPlayer().getRenderingActivity()) != null) {
                VideoPlayer videoPlayer = getVideoPlayer();
                ViewGroup.LayoutParams layoutParams = getVideoPlayer().getMainContainer().getLayoutParams();
                Intrinsics.checkNotNullExpressionValue(layoutParams, "videoPlayer.mainContainer.layoutParams");
                videoPlayer.setMainContainerParams$mobilefuse_video_player_release(layoutParams);
                getVideoPlayer().removeView(getVideoPlayer().getMainContainer());
                PopupWindow popupWindow = new PopupWindow(getVideoPlayer().getMainContainer(), -1, -1);
                this.fullscreenWindow = popupWindow;
                Window window = renderingActivity.getWindow();
                Intrinsics.checkNotNullExpressionValue(window, "renderingActivity.window");
                View decorView = window.getDecorView();
                Intrinsics.checkNotNullExpressionValue(decorView, "renderingActivity.window.decorView");
                View rootView = decorView.getRootView();
                Intrinsics.checkNotNullExpressionValue(rootView, "renderingActivity.window.decorView.rootView");
                popupWindow.showAtLocation(rootView, 48, 0, 0);
                getVideoPlayer().setVisibility(4);
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void setExternalFullscreen(final boolean fullscreen) {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (this.externalFullscreenControlBridge == null) {
                return;
            }
            WebView webView = getWebView();
            if (webView != null) {
                webView.setVisibility(4);
            }
            ExternalFullscreenControlBridge externalFullscreenControlBridge = this.externalFullscreenControlBridge;
            if (externalFullscreenControlBridge != null) {
                externalFullscreenControlBridge.onFullscreenChangeStarted(fullscreen, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.controller.FullscreenControllerImpl$setExternalFullscreen$$inlined$let$lambda$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        try {
                            if (this.this$0.getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
                                return;
                            }
                            this.this$0.changeFullscreenState(fullscreen);
                            WebView webView2 = this.this$0.getWebView();
                            if (webView2 != null) {
                                webView2.setAlpha(0.0f);
                                webView2.setVisibility(0);
                            }
                            this.this$0.getVideoPlayer().getPlayerHandler().postDelayed(new Runnable() { // from class: com.mobilefuse.videoplayer.controller.FullscreenControllerImpl$setExternalFullscreen$$inlined$let$lambda$1.1
                                @Override // java.lang.Runnable
                                public final void run() {
                                    try {
                                        WebView webView3 = FullscreenControllerImpl$setExternalFullscreen$$inlined$let$lambda$1.this.this$0.getWebView();
                                        if (webView3 != null) {
                                            webView3.setAlpha(1.0f);
                                        }
                                    } catch (Throwable th2) {
                                        StabilityHelper.logException(FullscreenControllerImpl$setExternalFullscreen$$inlined$let$lambda$1.this.this$0, th2);
                                    }
                                }
                            }, 300L);
                        } catch (Throwable th2) {
                            StabilityHelper.logException(this.this$0, th2);
                        }
                    }
                });
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void enableExternalFullscreenControl(@NotNull ExternalFullscreenControlBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.externalFullscreenControl = true;
        this.externalFullscreenControlBridge = bridge;
    }

    public final void enableFullscreenButton$mobilefuse_video_player_release() {
        try {
            if (!getVideoPlayer().isDestroyed$mobilefuse_video_player_release() && getFullscreenAllowed()) {
                callJsBridgeCmd("vast.bridge.setFullscreenAllowed();");
                if (getFullscreen()) {
                    setFullscreen(getFullscreen());
                }
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void executeFullscreenExit$mobilefuse_video_player_release() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            PopupWindow popupWindow = this.fullscreenWindow;
            if (popupWindow == null) {
                return;
            }
            popupWindow.dismiss();
            this.fullscreenWindow = null;
            getVideoPlayer().addView(getVideoPlayer().getMainContainer(), getVideoPlayer().getMainContainerParams());
            getVideoPlayer().setVisibility(0);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getEnterFullscreenOnVideoTap() {
        return this.enterFullscreenOnVideoTap;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreen() {
        return this.fullscreen;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreenAllowed() {
        return this.fullscreenAllowed;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    @Nullable
    public FullscreenChangedListener getFullscreenChangedListener() {
        return this.fullscreenChangedListener;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setEnterFullscreenOnVideoTap(boolean z10) {
        this.enterFullscreenOnVideoTap = z10;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreen(boolean fullscreen) {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        if (fullscreen) {
            try {
                if (getEndCardPresenter() != null) {
                    return;
                }
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
                return;
            }
        }
        if (this.externalFullscreenControl) {
            setExternalFullscreen(fullscreen);
        } else {
            changeFullscreenState(fullscreen);
            applyFullscreenToPlayer();
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenAllowed() {
        if (getVideoPlayer().isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            setFullscreenAllowed$mobilefuse_video_player_release(true);
            getVideoPlayer().getPlayerCapabilities().changeCapability(VastPlayerCapability.FULLSCREEN, true);
            if (getPlayerState() != VideoPlayer.PlayerState.PLAYING && getPlayerState() != VideoPlayer.PlayerState.PAUSED) {
                return;
            }
            enableFullscreenButton$mobilefuse_video_player_release();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public void setFullscreenAllowed$mobilefuse_video_player_release(boolean z10) {
        this.fullscreenAllowed = z10;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenChangedListener(@Nullable FullscreenChangedListener fullscreenChangedListener) {
        this.fullscreenChangedListener = fullscreenChangedListener;
    }
}
