package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes7.dex */
public final class o implements MediaPlayer.OnCompletionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f20154a;

    public o(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f20154a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f20154a.finish();
    }
}
