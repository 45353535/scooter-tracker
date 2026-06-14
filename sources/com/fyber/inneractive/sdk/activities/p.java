package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class p implements MediaPlayer.OnErrorListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f20155a;

    public p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f20155a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(MediaPlayer mediaPlayer, int i10, int i11) {
        IAlog.a("Error: video can not be played.", new Object[0]);
        this.f20155a.finish();
        return false;
    }
}
