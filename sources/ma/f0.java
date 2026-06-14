package ma;

import android.os.Handler;
import android.os.SystemClock;
import ma.f0;
import n9.n0;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public interface f0 {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f94555a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f0 f94556b;

        public a(Handler handler, f0 f0Var) {
            this.f94555a = f0Var != null ? (Handler) q9.a.e(handler) : null;
            this.f94556b = f0Var;
        }

        public static /* synthetic */ void i(a aVar, u9.b bVar) {
            aVar.getClass();
            bVar.c();
            ((f0) o0.i(aVar.f94556b)).d(bVar);
        }

        public void k(final String str, final long j10, final long j11) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94748b.f94556b)).onVideoDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void l(final String str) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94746b.f94556b)).onVideoDecoderReleased(str);
                    }
                });
            }
        }

        public void m(final u9.b bVar) {
            bVar.c();
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.d0
                    @Override // java.lang.Runnable
                    public final void run() {
                        f0.a.i(this.f94548b, bVar);
                    }
                });
            }
        }

        public void n(final int i10, final long j10) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94532b.f94556b)).onDroppedFrames(i10, j10);
                    }
                });
            }
        }

        public void o(final u9.b bVar) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94552b.f94556b)).g(bVar);
                    }
                });
            }
        }

        public void p(final io.bidmachine.media3.common.a aVar, final u9.c cVar) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94526b.f94556b)).e(aVar, cVar);
                    }
                });
            }
        }

        public void q(final Object obj) {
            if (this.f94555a != null) {
                final long jElapsedRealtime = SystemClock.elapsedRealtime();
                this.f94555a.post(new Runnable() { // from class: ma.w
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94743b.f94556b)).onRenderedFirstFrame(obj, jElapsedRealtime);
                    }
                });
            }
        }

        public void r(final long j10, final int i10) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94529b.f94556b)).onVideoFrameProcessingOffset(j10, i10);
                    }
                });
            }
        }

        public void s(final Exception exc) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.v
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94741b.f94556b)).onVideoCodecError(exc);
                    }
                });
            }
        }

        public void t(final n0 n0Var) {
            Handler handler = this.f94555a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: ma.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((f0) o0.i(this.f94752b.f94556b)).a(n0Var);
                    }
                });
            }
        }
    }

    void a(n0 n0Var);

    void d(u9.b bVar);

    void e(io.bidmachine.media3.common.a aVar, u9.c cVar);

    void g(u9.b bVar);

    void onDroppedFrames(int i10, long j10);

    void onRenderedFirstFrame(Object obj, long j10);

    void onVideoCodecError(Exception exc);

    void onVideoDecoderInitialized(String str, long j10, long j11);

    void onVideoDecoderReleased(String str);

    void onVideoFrameProcessingOffset(long j10, int i10);
}
