package z9;

import android.os.Looper;
import v9.c2;
import z9.n;
import z9.u;

/* JADX INFO: loaded from: classes12.dex */
public interface w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final w f119322a = new a();

    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f119323a = new b() { // from class: z9.x
            @Override // z9.w.b
            public final void release() {
                y.a();
            }
        };

        void release();
    }

    n a(u.a aVar, io.bidmachine.media3.common.a aVar2);

    b b(u.a aVar, io.bidmachine.media3.common.a aVar2);

    void c(Looper looper, c2 c2Var);

    int d(io.bidmachine.media3.common.a aVar);

    void prepare();

    void release();

    class a implements w {
        a() {
        }

        @Override // z9.w
        public n a(u.a aVar, io.bidmachine.media3.common.a aVar2) {
            if (aVar2.f80565s == null) {
                return null;
            }
            return new c0(new n.a(new p0(1), 6001));
        }

        @Override // z9.w
        public /* synthetic */ b b(u.a aVar, io.bidmachine.media3.common.a aVar2) {
            return v.a(this, aVar, aVar2);
        }

        @Override // z9.w
        public int d(io.bidmachine.media3.common.a aVar) {
            return aVar.f80565s != null ? 1 : 0;
        }

        @Override // z9.w
        public /* synthetic */ void prepare() {
            v.b(this);
        }

        @Override // z9.w
        public /* synthetic */ void release() {
            v.c(this);
        }

        @Override // z9.w
        public void c(Looper looper, c2 c2Var) {
        }
    }
}
