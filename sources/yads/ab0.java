package yads;

import android.media.AudioTrack;

/* JADX INFO: loaded from: classes4.dex */
public final class ab0 extends Thread {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f108617b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb0 f108618c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ab0(mb0 mb0Var, AudioTrack audioTrack) {
        super("ExoPlayer:AudioTrackReleaseThread");
        this.f108618c = mb0Var;
        this.f108617b = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f108617b.flush();
            this.f108617b.release();
        } finally {
            this.f108618c.f113380h.d();
        }
    }
}
