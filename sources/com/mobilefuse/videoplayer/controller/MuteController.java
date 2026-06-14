package com.mobilefuse.videoplayer.controller;

import com.mobilefuse.sdk.MuteChangedListener;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\b\u0010\u000b\u001a\u00020\u0003H&J\b\u0010\f\u001a\u00020\rH&J\b\u0010\u000e\u001a\u00020\rH&J\b\u0010\u000f\u001a\u00020\rH&J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0003H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004R\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u0006X¦\u000e¢\u0006\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/mobilefuse/videoplayer/controller/MuteController;", "", "isMuteAllowed", "", "()Z", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "isMuted", "onVideoBecameInvisible", "", "onVideoBecameVisible", "setMuteAllowed", "setMuted", "muted", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public interface MuteController {
    @Nullable
    MuteChangedListener getMuteChangedListener();

    boolean isMuteAllowed();

    boolean isMuted();

    void onVideoBecameInvisible();

    void onVideoBecameVisible();

    void setMuteAllowed();

    void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener);

    void setMuted(boolean muted);
}
