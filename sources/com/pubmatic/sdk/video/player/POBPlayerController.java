package com.pubmatic.sdk.video.player;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.pubmatic.sdk.video.player.POBVideoPlayerView;

/* JADX INFO: loaded from: classes11.dex */
public abstract class POBPlayerController extends FrameLayout implements POBVideoPlayerView.POBVideoPlayerListener {
    public POBPlayerController(@NonNull Context context) {
        super(context);
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onBufferUpdate(int i10) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onClick() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onCompletion() {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onFailure(int i10, @NonNull String str) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onMute(boolean z10);

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onPause();

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onProgressUpdate(int i10);

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public void onReadyToPlay(@NonNull POBVideoPlayerView pOBVideoPlayerView) {
    }

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onResume();

    @Override // com.pubmatic.sdk.video.player.POBVideoPlayerView.POBVideoPlayerListener
    public abstract /* synthetic */ void onStart();

    abstract void setVideoPlayerEvents(@NonNull POBVideoPlayer pOBVideoPlayer);
}
