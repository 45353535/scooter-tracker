package da;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.common.base.Supplier;
import da.b;
import da.n;
import java.nio.ByteBuffer;
import q9.k0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
final class b implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f68465a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f68466b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p f68467c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f68468d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f68469e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f68470f;

    /* JADX INFO: renamed from: da.b$b, reason: collision with other inner class name */
    public static final class C0854b implements n.b {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Supplier f68471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Supplier f68472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f68473d;

        public C0854b(final int i10) {
            this(new Supplier() { // from class: da.c
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return b.C0854b.c(i10);
                }
            }, new Supplier() { // from class: da.d
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return b.C0854b.b(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(b.j(i10));
        }

        public static /* synthetic */ HandlerThread c(int i10) {
            return new HandlerThread(b.i(i10));
        }

        private static boolean f(io.bidmachine.media3.common.a aVar) {
            int i10 = o0.f98837a;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || n9.w.t(aVar.f80561o);
        }

        @Override // da.n.b
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public b a(n.a aVar) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            p eVar;
            int i10;
            b bVar;
            String str = aVar.f68532a.f68542a;
            b bVar2 = null;
            try {
                k0.a("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    if (this.f68473d && f(aVar.f68534c)) {
                        eVar = new f0(mediaCodecCreateByCodecName);
                        i10 = 4;
                    } else {
                        eVar = new e(mediaCodecCreateByCodecName, (HandlerThread) this.f68472c.get());
                        i10 = 0;
                    }
                    bVar = new b(mediaCodecCreateByCodecName, (HandlerThread) this.f68471b.get(), eVar, aVar.f68537f);
                } catch (Exception e10) {
                    exc = e10;
                }
            } catch (Exception e11) {
                exc = e11;
                mediaCodecCreateByCodecName = null;
            }
            try {
                k0.b();
                Surface surface = aVar.f68535d;
                if (surface == null && aVar.f68532a.f68552k && o0.f98837a >= 35) {
                    i10 |= 8;
                }
                bVar.l(aVar.f68533b, surface, aVar.f68536e, i10);
                return bVar;
            } catch (Exception e12) {
                exc = e12;
                bVar2 = bVar;
                if (bVar2 != null) {
                    bVar2.release();
                    throw exc;
                }
                if (mediaCodecCreateByCodecName == null) {
                    throw exc;
                }
                mediaCodecCreateByCodecName.release();
                throw exc;
            }
        }

        public void e(boolean z10) {
            this.f68473d = z10;
        }

        public C0854b(Supplier supplier, Supplier supplier2) {
            this.f68471b = supplier;
            this.f68472c = supplier2;
            this.f68473d = false;
        }
    }

    public static /* synthetic */ void e(b bVar, n.d dVar, MediaCodec mediaCodec, long j10, long j11) {
        bVar.getClass();
        dVar.a(bVar, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String i(int i10) {
        return k(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String j(int i10) {
        return k(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String k(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i10) {
        j jVar;
        this.f68466b.h(this.f68465a);
        k0.a("configureCodec");
        this.f68465a.configure(mediaFormat, surface, mediaCrypto, i10);
        k0.b();
        this.f68467c.start();
        k0.a("startCodec");
        this.f68465a.start();
        k0.b();
        if (o0.f98837a >= 35 && (jVar = this.f68468d) != null) {
            jVar.b(this.f68465a);
        }
        this.f68470f = 1;
    }

    @Override // da.n
    public void a(int i10, int i11, t9.c cVar, long j10, int i12) {
        this.f68467c.a(i10, i11, cVar, j10, i12);
    }

    @Override // da.n
    public void b(final n.d dVar, Handler handler) {
        this.f68465a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: da.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                b.e(this.f68462a, dVar, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // da.n
    public void c() {
        this.f68465a.detachOutputSurface();
    }

    @Override // da.n
    public boolean d(n.c cVar) {
        this.f68466b.p(cVar);
        return true;
    }

    @Override // da.n
    public int dequeueInputBufferIndex() {
        this.f68467c.maybeThrowException();
        return this.f68466b.c();
    }

    @Override // da.n
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.f68467c.maybeThrowException();
        return this.f68466b.d(bufferInfo);
    }

    @Override // da.n
    public void flush() {
        this.f68467c.flush();
        this.f68465a.flush();
        this.f68466b.e();
        this.f68465a.start();
    }

    @Override // da.n
    public ByteBuffer getInputBuffer(int i10) {
        return this.f68465a.getInputBuffer(i10);
    }

    @Override // da.n
    public ByteBuffer getOutputBuffer(int i10) {
        return this.f68465a.getOutputBuffer(i10);
    }

    @Override // da.n
    public MediaFormat getOutputFormat() {
        return this.f68466b.g();
    }

    @Override // da.n
    public boolean needsReconfiguration() {
        return false;
    }

    @Override // da.n
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f68467c.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // da.n
    public void release() {
        j jVar;
        j jVar2;
        try {
            if (this.f68470f == 1) {
                this.f68467c.shutdown();
                this.f68466b.q();
            }
            this.f68470f = 2;
            if (this.f68469e) {
                return;
            }
            try {
                int i10 = o0.f98837a;
                if (i10 >= 30 && i10 < 33) {
                    this.f68465a.stop();
                }
                if (i10 >= 35 && (jVar2 = this.f68468d) != null) {
                    jVar2.d(this.f68465a);
                }
                this.f68465a.release();
                this.f68469e = true;
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.f68469e) {
                try {
                    int i11 = o0.f98837a;
                    if (i11 >= 30 && i11 < 33) {
                        this.f68465a.stop();
                    }
                    if (i11 >= 35 && (jVar = this.f68468d) != null) {
                        jVar.d(this.f68465a);
                    }
                    this.f68465a.release();
                    this.f68469e = true;
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // da.n
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.f68465a.releaseOutputBuffer(i10, z10);
    }

    @Override // da.n
    public void setOutputSurface(Surface surface) {
        this.f68465a.setOutputSurface(surface);
    }

    @Override // da.n
    public void setParameters(Bundle bundle) {
        this.f68467c.setParameters(bundle);
    }

    @Override // da.n
    public void setVideoScalingMode(int i10) {
        this.f68465a.setVideoScalingMode(i10);
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, p pVar, j jVar) {
        this.f68465a = mediaCodec;
        this.f68466b = new g(handlerThread);
        this.f68467c = pVar;
        this.f68468d = jVar;
        this.f68470f = 0;
    }

    @Override // da.n
    public void releaseOutputBuffer(int i10, long j10) {
        this.f68465a.releaseOutputBuffer(i10, j10);
    }
}
