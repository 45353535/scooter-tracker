package ma;

import android.view.Surface;
import io.bidmachine.media3.exoplayer.i2;
import java.util.List;
import java.util.concurrent.Executor;
import n9.n0;

/* JADX INFO: loaded from: classes12.dex */
public interface g0 {

    public interface b {
        void a();

        void b(long j10);
    }

    public static final class c extends Exception {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final io.bidmachine.media3.common.a f94559b;

        public c(Throwable th2, io.bidmachine.media3.common.a aVar) {
            super(th2);
            this.f94559b = aVar;
        }
    }

    void a();

    void b(int i10, io.bidmachine.media3.common.a aVar, List list);

    boolean c(long j10, boolean z10, b bVar);

    void clearOutputSurfaceInfo();

    boolean d(io.bidmachine.media3.common.a aVar);

    void e(Surface surface, q9.f0 f0Var);

    void enableMayRenderStartOfStream();

    void f(int i10);

    void flush(boolean z10);

    void g(i2.a aVar);

    Surface getInputSurface();

    void h(r rVar);

    void i(long j10, long j11);

    boolean isEnded();

    boolean isInitialized();

    void j(a aVar, Executor executor);

    boolean k(boolean z10);

    void l(boolean z10);

    void onRendererDisabled();

    void onRendererEnabled(boolean z10);

    void onRendererStarted();

    void onRendererStopped();

    void release();

    void render(long j10, long j11);

    void setPlaybackSpeed(float f10);

    void setVideoEffects(List list);

    public interface a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94558a = new C1087a();

        void a(g0 g0Var);

        void b(g0 g0Var, n0 n0Var);

        void c(g0 g0Var);

        /* JADX INFO: renamed from: ma.g0$a$a, reason: collision with other inner class name */
        class C1087a implements a {
            C1087a() {
            }

            @Override // ma.g0.a
            public void a(g0 g0Var) {
            }

            @Override // ma.g0.a
            public void c(g0 g0Var) {
            }

            @Override // ma.g0.a
            public void b(g0 g0Var, n0 n0Var) {
            }
        }
    }
}
