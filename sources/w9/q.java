package w9;

import android.os.Handler;
import q9.o0;
import w9.q;
import w9.s;

/* JADX INFO: loaded from: classes12.dex */
public interface q {

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Handler f107744a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final q f107745b;

        public a(Handler handler, q qVar) {
            this.f107744a = qVar != null ? (Handler) q9.a.e(handler) : null;
            this.f107745b = qVar;
        }

        public static /* synthetic */ void b(a aVar, u9.b bVar) {
            aVar.getClass();
            bVar.c();
            ((q) o0.i(aVar.f107745b)).i(bVar);
        }

        public void m(final Exception exc) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107687b.f107745b)).onAudioCodecError(exc);
                    }
                });
            }
        }

        public void n(final Exception exc) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.n
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107738b.f107745b)).onAudioSinkError(exc);
                    }
                });
            }
        }

        public void o(final s.a aVar) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107694b.f107745b)).b(aVar);
                    }
                });
            }
        }

        public void p(final s.a aVar) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107742b.f107745b)).c(aVar);
                    }
                });
            }
        }

        public void q(final String str, final long j10, final long j11) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107703b.f107745b)).onAudioDecoderInitialized(str, j10, j11);
                    }
                });
            }
        }

        public void r(final String str) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107701b.f107745b)).onAudioDecoderReleased(str);
                    }
                });
            }
        }

        public void s(final u9.b bVar) {
            bVar.c();
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        q.a.b(this.f107721b, bVar);
                    }
                });
            }
        }

        public void t(final u9.b bVar) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107733b.f107745b)).k(bVar);
                    }
                });
            }
        }

        public void u(final io.bidmachine.media3.common.a aVar, final u9.c cVar) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107735b.f107745b)).l(aVar, cVar);
                    }
                });
            }
        }

        public void v(final long j10) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107724b.f107745b)).onAudioPositionAdvancing(j10);
                    }
                });
            }
        }

        public void w(final boolean z10) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.o
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107740b.f107745b)).onSkipSilenceEnabledChanged(z10);
                    }
                });
            }
        }

        public void x(final int i10, final long j10, final long j11) {
            Handler handler = this.f107744a;
            if (handler != null) {
                handler.post(new Runnable() { // from class: w9.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        ((q) o0.i(this.f107689b.f107745b)).onAudioUnderrun(i10, j10, j11);
                    }
                });
            }
        }
    }

    void b(s.a aVar);

    void c(s.a aVar);

    void i(u9.b bVar);

    void k(u9.b bVar);

    void l(io.bidmachine.media3.common.a aVar, u9.c cVar);

    void onAudioCodecError(Exception exc);

    void onAudioDecoderInitialized(String str, long j10, long j11);

    void onAudioDecoderReleased(String str);

    void onAudioPositionAdvancing(long j10);

    void onAudioSinkError(Exception exc);

    void onAudioUnderrun(int i10, long j10, long j11);

    void onSkipSilenceEnabledChanged(boolean z10);
}
