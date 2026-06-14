package ga;

import android.os.Handler;
import com.ironsource.mediationsdk.logger.IronSourceError;
import lb.t;
import v9.c2;

/* JADX INFO: loaded from: classes12.dex */
public interface f0 {

    public interface a {
        a a(t.a aVar);

        a b(int i10);

        a c(ka.m mVar);

        a d(z9.z zVar);

        f0 e(n9.r rVar);

        a experimentalParseSubtitlesDuringExtraction(boolean z10);
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f72270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f72271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f72272c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f72273d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f72274e;

        public b(Object obj) {
            this(obj, -1L);
        }

        public b a(Object obj) {
            return this.f72270a.equals(obj) ? this : new b(obj, this.f72271b, this.f72272c, this.f72273d, this.f72274e);
        }

        public boolean b() {
            return this.f72271b != -1;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f72270a.equals(bVar.f72270a) && this.f72271b == bVar.f72271b && this.f72272c == bVar.f72272c && this.f72273d == bVar.f72273d && this.f72274e == bVar.f72274e;
        }

        public int hashCode() {
            return ((((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f72270a.hashCode()) * 31) + this.f72271b) * 31) + this.f72272c) * 31) + ((int) this.f72273d)) * 31) + this.f72274e;
        }

        public b(Object obj, long j10) {
            this(obj, -1, -1, j10, -1);
        }

        public b(Object obj, long j10, int i10) {
            this(obj, -1, -1, j10, i10);
        }

        public b(Object obj, int i10, int i11, long j10) {
            this(obj, i10, i11, j10, -1);
        }

        private b(Object obj, int i10, int i11, long j10, int i12) {
            this.f72270a = obj;
            this.f72271b = i10;
            this.f72272c = i11;
            this.f72273d = j10;
            this.f72274e = i12;
        }
    }

    public interface c {
        void a(f0 f0Var, n9.e0 e0Var);
    }

    void a(c cVar);

    void c(c0 c0Var);

    c0 e(b bVar, ka.b bVar2, long j10);

    void f(Handler handler, n0 n0Var);

    void g(c cVar);

    n9.e0 getInitialTimeline();

    n9.r getMediaItem();

    void h(n9.r rVar);

    void i(c cVar);

    boolean isSingleWindow();

    void j(c cVar, s9.y yVar, c2 c2Var);

    void k(Handler handler, z9.u uVar);

    void l(z9.u uVar);

    void m(n0 n0Var);

    void maybeThrowSourceInfoRefreshError();
}
