package com.mobilefuse.videoplayer.controller;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007H&¨\u0006\b"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/ExternalFullscreenControlBridge;", "", "onFullscreenChangeStarted", "", "changeToFullscreen", "", "completedFullscreenAction", "Lkotlin/Function0;", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface ExternalFullscreenControlBridge {
    void onFullscreenChangeStarted(boolean changeToFullscreen, @NotNull Function0<Unit> completedFullscreenAction);
}
