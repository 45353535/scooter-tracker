package com.mobilefuse.videoplayer.controller;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H&J\u0010\u0010\u0016\u001a\u00020\u00132\u0006\u0010\b\u001a\u00020\u0003H&J\b\u0010\u0017\u001a\u00020\u0013H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0012\u0010\b\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0005R\u0012\u0010\n\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\u0005R\u001a\u0010\f\u001a\u0004\u0018\u00010\rX¦\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/FullscreenController;", "", "enterFullscreenOnVideoTap", "", "getEnterFullscreenOnVideoTap", "()Z", "setEnterFullscreenOnVideoTap", "(Z)V", "fullscreen", "getFullscreen", "fullscreenAllowed", "getFullscreenAllowed", "fullscreenChangedListener", "Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "getFullscreenChangedListener", "()Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "setFullscreenChangedListener", "(Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;)V", "enableExternalFullscreenControl", "", "bridge", "Lcom/mobilefuse/videoplayer/controller/ExternalFullscreenControlBridge;", "setFullscreen", "setFullscreenAllowed", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface FullscreenController {
    void enableExternalFullscreenControl(@NotNull ExternalFullscreenControlBridge bridge);

    boolean getEnterFullscreenOnVideoTap();

    boolean getFullscreen();

    boolean getFullscreenAllowed();

    @Nullable
    FullscreenChangedListener getFullscreenChangedListener();

    void setEnterFullscreenOnVideoTap(boolean z10);

    void setFullscreen(boolean fullscreen);

    void setFullscreenAllowed();

    void setFullscreenChangedListener(@Nullable FullscreenChangedListener fullscreenChangedListener);
}
