package yads;

import android.media.AudioTrack;
import android.os.Handler;
import j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class lb0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f113029a = new Handler();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kb0 f113030b = new kb0(this);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mb0 f113031c;

    public lb0(mb0 mb0Var) {
        this.f113031c = mb0Var;
    }

    public final void a(AudioTrack audioTrack) {
        Handler handler = this.f113029a;
        Objects.requireNonNull(handler);
        audioTrack.registerStreamEventCallback(new androidx.emoji2.text.a(handler), this.f113030b);
    }

    public final void b(AudioTrack audioTrack) {
        audioTrack.unregisterStreamEventCallback(this.f113030b);
        this.f113029a.removeCallbacksAndMessages(null);
    }
}
