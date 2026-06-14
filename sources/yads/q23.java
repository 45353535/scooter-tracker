package yads;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public final class q23 implements pi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f114861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ByteBuffer[] f114862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ByteBuffer[] f114863c;

    public q23(MediaCodec mediaCodec) {
        this.f114861a = mediaCodec;
        if (w83.f117341a < 21) {
            this.f114862b = mediaCodec.getInputBuffers();
            this.f114863c = mediaCodec.getOutputBuffers();
        }
    }

    @Override // yads.pi1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f114861a.dequeueOutputBuffer(bufferInfo, 0L);
            if (iDequeueOutputBuffer == -3 && w83.f117341a < 21) {
                this.f114863c = this.f114861a.getOutputBuffers();
            }
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // yads.pi1
    public final int b() {
        return this.f114861a.dequeueInputBuffer(0L);
    }

    @Override // yads.pi1
    public final ByteBuffer c(int i10) {
        return w83.f117341a >= 21 ? this.f114861a.getOutputBuffer(i10) : this.f114863c[i10];
    }

    @Override // yads.pi1
    public final void flush() {
        this.f114861a.flush();
    }

    @Override // yads.pi1
    public final void release() {
        this.f114862b = null;
        this.f114863c = null;
        this.f114861a.release();
    }

    @Override // yads.pi1
    public final ByteBuffer b(int i10) {
        return w83.f117341a >= 21 ? this.f114861a.getInputBuffer(i10) : this.f114862b[i10];
    }

    @Override // yads.pi1
    public final MediaFormat a() {
        return this.f114861a.getOutputFormat();
    }

    public final void a(oi1 oi1Var, MediaCodec mediaCodec, long j10, long j11) {
        mj1 mj1Var = (mj1) oi1Var;
        mj1Var.getClass();
        if (w83.f117341a < 30) {
            mj1Var.f113533b.sendMessageAtFrontOfQueue(Message.obtain(mj1Var.f113533b, 0, (int) (j10 >> 32), (int) j10));
            return;
        }
        nj1 nj1Var = mj1Var.f113534c;
        if (mj1Var != nj1Var.f113939n1) {
            return;
        }
        if (j10 == Long.MAX_VALUE) {
            nj1Var.f118230z0 = true;
            return;
        }
        try {
            nj1Var.b(j10);
            nj1Var.D();
            nj1Var.B0.f109299e++;
            nj1Var.V0 = true;
            if (!nj1Var.T0) {
                nj1Var.T0 = true;
                nj1Var.I0.a(nj1Var.P0);
                nj1Var.R0 = true;
            }
            nj1Var.a(j10);
        } catch (lm0 e10) {
            mj1Var.f113534c.A0 = e10;
        }
    }

    @Override // yads.pi1
    public final void a(int i10, int i11, long j10, int i12) {
        this.f114861a.queueInputBuffer(i10, 0, i11, j10, i12);
    }

    @Override // yads.pi1
    public final void a(int i10, y10 y10Var, long j10) {
        this.f114861a.queueSecureInputBuffer(i10, 0, y10Var.f118056i, j10, 0);
    }

    @Override // yads.pi1
    public final void a(int i10, long j10) {
        this.f114861a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.pi1
    public final void a(boolean z10, int i10) {
        this.f114861a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.pi1
    public final void a(final oi1 oi1Var, Handler handler) {
        this.f114861a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: yads.gd0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f111148a.a(oi1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.pi1
    public final void a(Surface surface) {
        this.f114861a.setOutputSurface(surface);
    }

    @Override // yads.pi1
    public final void a(Bundle bundle) {
        this.f114861a.setParameters(bundle);
    }

    @Override // yads.pi1
    public final void a(int i10) {
        this.f114861a.setVideoScalingMode(i10);
    }
}
