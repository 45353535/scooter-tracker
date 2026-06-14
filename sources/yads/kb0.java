package yads;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: loaded from: classes4.dex */
public final class kb0 extends AudioTrack$StreamEventCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lb0 f112670a;

    public kb0(lb0 lb0Var) {
        this.f112670a = lb0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        gl2 gl2Var;
        mb0 mb0Var = this.f112670a.f113031c;
        if (audioTrack != mb0Var.f113393u) {
            throw new IllegalStateException();
        }
        yk ykVar = mb0Var.f113390r;
        if (ykVar == null || !mb0Var.U || (gl2Var = ((qi1) ykVar).f115012a.Q0) == null) {
            return;
        }
        ((wm0) gl2Var).f117517a.f109471i.f116471a.sendEmptyMessage(2);
    }

    public final void onTearDown(AudioTrack audioTrack) {
        gl2 gl2Var;
        mb0 mb0Var = this.f112670a.f113031c;
        if (audioTrack != mb0Var.f113393u) {
            throw new IllegalStateException();
        }
        yk ykVar = mb0Var.f113390r;
        if (ykVar == null || !mb0Var.U || (gl2Var = ((qi1) ykVar).f115012a.Q0) == null) {
            return;
        }
        ((wm0) gl2Var).f117517a.f109471i.f116471a.sendEmptyMessage(2);
    }
}
