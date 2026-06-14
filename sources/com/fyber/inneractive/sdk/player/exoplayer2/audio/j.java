package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f21603a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r f21604b;

    public j(r rVar, AudioTrack audioTrack) {
        this.f21604b = rVar;
        this.f21603a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f21603a.flush();
            this.f21603a.release();
        } finally {
            this.f21604b.f21628e.open();
        }
    }
}
