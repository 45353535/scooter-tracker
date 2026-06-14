package yads;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes4.dex */
public final class ij implements pi1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final MediaCodec f112003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mj f112004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final lj f112005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f112006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f112007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f112008f = 0;

    public ij(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.f112003a = mediaCodec;
        this.f112004b = new mj(handlerThread);
        this.f112005c = new lj(mediaCodec, handlerThread2);
        this.f112006d = z10;
    }

    @Override // yads.pi1
    public final int a(MediaCodec.BufferInfo bufferInfo) {
        return this.f112004b.a(bufferInfo);
    }

    @Override // yads.pi1
    public final int b() {
        mj mjVar = this.f112004b;
        synchronized (mjVar.f113519a) {
            try {
                int i10 = -1;
                if (mjVar.f113529k <= 0 && !mjVar.f113530l) {
                    IllegalStateException illegalStateException = mjVar.f113531m;
                    if (illegalStateException != null) {
                        mjVar.f113531m = null;
                        throw illegalStateException;
                    }
                    MediaCodec.CodecException codecException = mjVar.f113528j;
                    if (codecException != null) {
                        mjVar.f113528j = null;
                        throw codecException;
                    }
                    da1 da1Var = mjVar.f113522d;
                    int i11 = da1Var.f109858c;
                    if (i11 != 0) {
                        if (i11 == 0) {
                            throw new NoSuchElementException();
                        }
                        int[] iArr = da1Var.f109859d;
                        int i12 = da1Var.f109856a;
                        i10 = iArr[i12];
                        da1Var.f109856a = (i12 + 1) & da1Var.f109860e;
                        da1Var.f109858c = i11 - 1;
                    }
                    return i10;
                }
                return -1;
            } finally {
            }
        }
    }

    @Override // yads.pi1
    public final ByteBuffer c(int i10) {
        return this.f112003a.getOutputBuffer(i10);
    }

    @Override // yads.pi1
    public final void flush() {
        this.f112005c.a();
        this.f112003a.flush();
        this.f112004b.a();
        this.f112003a.start();
    }

    @Override // yads.pi1
    public final void release() {
        try {
            if (this.f112008f == 1) {
                lj ljVar = this.f112005c;
                if (ljVar.f113116f) {
                    ljVar.a();
                    ljVar.f113112b.quit();
                }
                ljVar.f113116f = false;
                mj mjVar = this.f112004b;
                synchronized (mjVar.f113519a) {
                    try {
                        mjVar.f113530l = true;
                        mjVar.f113520b.quit();
                        if (!mjVar.f113525g.isEmpty()) {
                            mjVar.f113527i = (MediaFormat) mjVar.f113525g.getLast();
                        }
                        da1 da1Var = mjVar.f113522d;
                        da1Var.f109856a = 0;
                        da1Var.f109857b = -1;
                        da1Var.f109858c = 0;
                        da1 da1Var2 = mjVar.f113523e;
                        da1Var2.f109856a = 0;
                        da1Var2.f109857b = -1;
                        da1Var2.f109858c = 0;
                        mjVar.f113524f.clear();
                        mjVar.f113525g.clear();
                        mjVar.f113528j = null;
                    } finally {
                    }
                }
            }
            this.f112008f = 2;
            if (this.f112007e) {
                return;
            }
            this.f112003a.release();
            this.f112007e = true;
        } catch (Throwable th2) {
            if (!this.f112007e) {
                this.f112003a.release();
                this.f112007e = true;
            }
            throw th2;
        }
    }

    @Override // yads.pi1
    public final MediaFormat a() {
        MediaFormat mediaFormat;
        mj mjVar = this.f112004b;
        synchronized (mjVar.f113519a) {
            try {
                mediaFormat = mjVar.f113526h;
                if (mediaFormat == null) {
                    throw new IllegalStateException();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mediaFormat;
    }

    public final void c() {
        if (this.f112006d) {
            try {
                lj ljVar = this.f112005c;
                hy hyVar = ljVar.f113115e;
                synchronized (hyVar) {
                    hyVar.f111800a = false;
                }
                jj jjVar = ljVar.f113113c;
                jjVar.getClass();
                jjVar.obtainMessage(2).sendToTarget();
                ljVar.f113115e.a();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public final void a(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto) {
        this.f112004b.a(this.f112003a);
        q43.a("configureCodec");
        this.f112003a.configure(mediaFormat, surface, mediaCrypto, 0);
        q43.a();
        lj ljVar = this.f112005c;
        if (!ljVar.f113116f) {
            ljVar.f113112b.start();
            ljVar.f113113c = new jj(ljVar, ljVar.f113112b.getLooper());
            ljVar.f113116f = true;
        }
        q43.a("startCodec");
        this.f112003a.start();
        q43.a();
        this.f112008f = 1;
    }

    @Override // yads.pi1
    public final ByteBuffer b(int i10) {
        return this.f112003a.getInputBuffer(i10);
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
        lj ljVar = this.f112005c;
        RuntimeException runtimeException = (RuntimeException) ljVar.f113114d.getAndSet(null);
        if (runtimeException == null) {
            kj kjVarB = lj.b();
            kjVarB.f112719a = i10;
            kjVarB.f112720b = 0;
            kjVarB.f112721c = i11;
            kjVarB.f112723e = j10;
            kjVarB.f112724f = i12;
            jj jjVar = ljVar.f113113c;
            int i13 = w83.f117341a;
            jjVar.obtainMessage(0, kjVarB).sendToTarget();
            return;
        }
        throw runtimeException;
    }

    @Override // yads.pi1
    public final void a(int i10, y10 y10Var, long j10) {
        this.f112005c.a(i10, y10Var, j10);
    }

    @Override // yads.pi1
    public final void a(int i10, long j10) {
        this.f112003a.releaseOutputBuffer(i10, j10);
    }

    @Override // yads.pi1
    public final void a(boolean z10, int i10) {
        this.f112003a.releaseOutputBuffer(i10, z10);
    }

    @Override // yads.pi1
    public final void a(final oi1 oi1Var, Handler handler) {
        c();
        this.f112003a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: yads.g8
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                this.f111101a.a(oi1Var, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // yads.pi1
    public final void a(Surface surface) {
        c();
        this.f112003a.setOutputSurface(surface);
    }

    @Override // yads.pi1
    public final void a(Bundle bundle) {
        c();
        this.f112003a.setParameters(bundle);
    }

    @Override // yads.pi1
    public final void a(int i10) {
        c();
        this.f112003a.setVideoScalingMode(i10);
    }
}
