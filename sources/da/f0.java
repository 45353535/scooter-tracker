package da;

import android.media.MediaCodec;
import android.os.Bundle;

/* JADX INFO: loaded from: classes12.dex */
class f0 implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final MediaCodec f68503a;

    public f0(MediaCodec mediaCodec) {
        this.f68503a = mediaCodec;
    }

    @Override // da.p
    public void a(int i10, int i11, t9.c cVar, long j10, int i12) {
        this.f68503a.queueSecureInputBuffer(i10, i11, cVar.a(), j10, i12);
    }

    @Override // da.p
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.f68503a.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // da.p
    public void setParameters(Bundle bundle) {
        this.f68503a.setParameters(bundle);
    }

    @Override // da.p
    public void flush() {
    }

    @Override // da.p
    public void maybeThrowException() {
    }

    @Override // da.p
    public void shutdown() {
    }

    @Override // da.p
    public void start() {
    }
}
