package com.startapp.sdk.internal;

import android.media.MediaPlayer;

/* JADX INFO: loaded from: classes11.dex */
public final class rd implements MediaPlayer.OnBufferingUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sd f65215a;

    public rd(sd sdVar) {
        this.f65215a = sdVar;
    }

    @Override // android.media.MediaPlayer.OnBufferingUpdateListener
    public final void onBufferingUpdate(MediaPlayer mediaPlayer, int i10) {
        yj yjVar = this.f65215a.f64333f;
        if (yjVar != null) {
            yjVar.a(i10);
        }
    }
}
