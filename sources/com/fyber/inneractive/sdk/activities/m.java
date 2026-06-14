package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class m implements MediaPlayer.OnPreparedListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f20152a;

    public m(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f20152a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f20152a;
        inneractiveRichMediaVideoPlayerActivityCore.f20134a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.f20135b);
        this.f20152a.f20134a.start();
    }
}
