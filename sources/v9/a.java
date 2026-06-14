package v9;

import android.os.Looper;
import ga.f0;
import java.util.List;
import ka.e;
import n9.a0;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public interface a extends a0.d, ga.n0, e.a, z9.u {
    void C(n9.a0 a0Var, Looper looper);

    void H(int i10, int i11, boolean z10);

    void b(s.a aVar);

    void c(s.a aVar);

    void d(u9.b bVar);

    void e(io.bidmachine.media3.common.a aVar, u9.c cVar);

    void g(u9.b bVar);

    void i(u9.b bVar);

    void k(u9.b bVar);

    void l(io.bidmachine.media3.common.a aVar, u9.c cVar);

    void notifySeekStarted();

    void o(List list, f0.b bVar);

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioPositionAdvancing(long j10);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j10, long j11);

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Object obj, long j10);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoFrameProcessingOffset(long j10, int i10);

    void q(c cVar);

    void release();
}
