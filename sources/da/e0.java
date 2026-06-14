package da;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import da.n;
import java.io.IOException;
import java.nio.ByteBuffer;
import q9.k0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f68500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j f68501b;

    public static class b implements n.b {
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:22:0x0045  */
        /* JADX WARN: Type inference failed for: r0v0, types: [da.e0$a] */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v3 */
        @Override // da.n.b
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public da.n a(da.n.a r7) throws java.lang.Throwable {
            /*
                r6 = this;
                r0 = 0
                android.media.MediaCodec r1 = r6.b(r7)     // Catch: java.lang.RuntimeException -> L40 java.io.IOException -> L42
                java.lang.String r2 = "configureCodec"
                q9.k0.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.view.Surface r2 = r7.f68535d     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r2 != 0) goto L22
                da.r r3 = r7.f68532a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                boolean r3 = r3.f68552k     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                if (r3 == 0) goto L22
                int r3 = q9.o0.f98837a     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r4 = 35
                if (r3 < r4) goto L22
                r3 = 8
                goto L23
            L1d:
                r7 = move-exception
            L1e:
                r0 = r1
                goto L43
            L20:
                r7 = move-exception
                goto L1e
            L22:
                r3 = 0
            L23:
                android.media.MediaFormat r4 = r7.f68533b     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                android.media.MediaCrypto r5 = r7.f68536e     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.configure(r4, r2, r5, r3)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                q9.k0.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                java.lang.String r2 = "startCodec"
                q9.k0.a(r2)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r1.start()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                q9.k0.b()     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                da.e0 r2 = new da.e0     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                da.j r7 = r7.f68537f     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                r2.<init>(r1, r7)     // Catch: java.lang.RuntimeException -> L1d java.io.IOException -> L20
                return r2
            L40:
                r7 = move-exception
                goto L43
            L42:
                r7 = move-exception
            L43:
                if (r0 == 0) goto L48
                r0.release()
            L48:
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: da.e0.b.a(da.n$a):da.n");
        }

        protected MediaCodec b(n.a aVar) throws IOException {
            q9.a.e(aVar.f68532a);
            String str = aVar.f68532a.f68542a;
            k0.a("createCodec:" + str);
            MediaCodec mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
            k0.b();
            return mediaCodecCreateByCodecName;
        }
    }

    public static /* synthetic */ void e(e0 e0Var, n.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        e0Var.getClass();
        dVar.a(e0Var, j10, j11);
    }

    @Override // da.n
    public void a(int i10, int i11, t9.c cVar, long j10, int i12) {
        this.f68500a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // da.n
    public void b(final n.d dVar, Handler handler) {
        this.f68500a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: da.d0
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                e0.e(this.f68483a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // da.n
    public void c() {
        this.f68500a.detachOutputSurface();
    }

    @Override // da.n
    public /* synthetic */ boolean d(n.c cVar) {
        return m.a(this, cVar);
    }

    @Override // da.n
    public int dequeueInputBufferIndex() {
        return this.f68500a.dequeueInputBuffer(0L);
    }

    @Override // da.n
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = this.f68500a.dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // da.n
    public void flush() {
        this.f68500a.flush();
    }

    @Override // da.n
    public ByteBuffer getInputBuffer(int i10) {
        return this.f68500a.getInputBuffer(i10);
    }

    @Override // da.n
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f68500a.getOutputBuffer(i10);
    }

    @Override // da.n
    public MediaFormat getOutputFormat() {
        return this.f68500a.getOutputFormat();
    }

    @Override // da.n
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // da.n
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f68500a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // da.n
    public void release() {
        j jVar;
        j jVar2;
        try {
            int i10 = o0.f98837a;
            if (i10 >= 30 && i10 < 33) {
                this.f68500a.stop();
            }
            if (i10 >= 35 && (jVar2 = this.f68501b) != null) {
                jVar2.d(this.f68500a);
            }
            this.f68500a.release();
        } catch (Throwable th2) {
            if (o0.f98837a >= 35 && (jVar = this.f68501b) != null) {
                jVar.d(this.f68500a);
            }
            this.f68500a.release();
            throw th2;
        }
    }

    @Override // da.n
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f68500a.releaseOutputBuffer(i10, z10);
    }

    @Override // da.n
    public void setOutputSurface(Surface surface) {
        this.f68500a.setOutputSurface(surface);
    }

    @Override // da.n
    public void setParameters(Bundle bundle) {
        this.f68500a.setParameters(bundle);
    }

    @Override // da.n
    public void setVideoScalingMode(int i10) {
        this.f68500a.setVideoScalingMode(i10);
    }

    private e0(MediaCodec mediaCodec, j jVar) {
        this.f68500a = mediaCodec;
        this.f68501b = jVar;
        if (o0.f98837a < 35 || jVar == null) {
            return;
        }
        jVar.b(mediaCodec);
    }

    @Override // da.n
    public void releaseOutputBuffer(int i10, long j10) {
        this.f68500a.releaseOutputBuffer(i10, j10);
    }
}
