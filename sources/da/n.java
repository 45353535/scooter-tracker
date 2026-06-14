package da;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes12.dex */
public interface n {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r f68532a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MediaFormat f68533b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f68534c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Surface f68535d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final MediaCrypto f68536e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final j f68537f;

        private a(r rVar, MediaFormat mediaFormat, io.bidmachine.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto, j jVar) {
            this.f68532a = rVar;
            this.f68533b = mediaFormat;
            this.f68534c = aVar;
            this.f68535d = surface;
            this.f68536e = mediaCrypto;
            this.f68537f = jVar;
        }

        public static a a(r rVar, MediaFormat mediaFormat, io.bidmachine.media3.common.a aVar, MediaCrypto mediaCrypto, j jVar) {
            return new a(rVar, mediaFormat, aVar, null, mediaCrypto, jVar);
        }

        public static a b(r rVar, MediaFormat mediaFormat, io.bidmachine.media3.common.a aVar, Surface surface, MediaCrypto mediaCrypto) {
            return new a(rVar, mediaFormat, aVar, surface, mediaCrypto, null);
        }
    }

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f68538a = new i();

        n a(a aVar);
    }

    public interface c {
        void onInputBufferAvailable();

        void onOutputBufferAvailable();
    }

    public interface d {
        void a(n nVar, long j10, long j11);
    }

    void a(int i10, int i11, t9.c cVar, long j10, int i12);

    void b(d dVar, Handler handler);

    void c();

    boolean d(c cVar);

    int dequeueInputBufferIndex();

    int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo);

    void flush();

    ByteBuffer getInputBuffer(int i10);

    ByteBuffer getOutputBuffer(int i10);

    MediaFormat getOutputFormat();

    boolean needsReconfiguration();

    void queueInputBuffer(int i10, int i11, int i12, long j10, int i13);

    void release();

    void releaseOutputBuffer(int i10, long j10);

    void releaseOutputBuffer(int i10, boolean z10);

    void setOutputSurface(Surface surface);

    void setParameters(Bundle bundle);

    void setVideoScalingMode(int i10);
}
