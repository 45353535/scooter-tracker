package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;

/* JADX INFO: loaded from: classes4.dex */
public final class hf3 implements Choreographer.FrameCallback, Handler.Callback {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final hf3 f111569f = new hf3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile long f111570b = -9223372036854775807L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Handler f111571c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Choreographer f111572d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f111573e;

    public hf3() {
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        Handler handlerA = w83.a(handlerThread.getLooper(), (Handler.Callback) this);
        this.f111571c = handlerA;
        handlerA.sendEmptyMessage(0);
    }

    public static hf3 a() {
        return f111569f;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j10) {
        this.f111570b = j10;
        Choreographer choreographer = this.f111572d;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed(this, 500L);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 0) {
            try {
                this.f111572d = Choreographer.getInstance();
            } catch (RuntimeException e10) {
                uf1.d("VideoFrameReleaseHelper", uf1.a("Vsync sampling disabled due to platform error", e10));
            }
            return true;
        }
        if (i10 == 1) {
            Choreographer choreographer = this.f111572d;
            if (choreographer != null) {
                int i11 = this.f111573e + 1;
                this.f111573e = i11;
                if (i11 == 1) {
                    choreographer.postFrameCallback(this);
                }
            }
            return true;
        }
        if (i10 != 2) {
            return false;
        }
        Choreographer choreographer2 = this.f111572d;
        if (choreographer2 != null) {
            int i12 = this.f111573e - 1;
            this.f111573e = i12;
            if (i12 == 0) {
                choreographer2.removeFrameCallback(this);
                this.f111570b = -9223372036854775807L;
            }
        }
        return true;
    }
}
