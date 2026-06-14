package hg;

import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public interface g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f73226a = a.f73227a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f73227a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g0 f73228b = new h0();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final g0 f73229c = new i0();

        private a() {
        }

        public static /* synthetic */ g0 b(a aVar, long j10, long j11, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                j10 = 0;
            }
            if ((i10 & 2) != 0) {
                j11 = Long.MAX_VALUE;
            }
            return aVar.a(j10, j11);
        }

        public final g0 a(long j10, long j11) {
            return new j0(j10, j11);
        }

        public final g0 c() {
            return f73228b;
        }

        public final g0 d() {
            return f73229c;
        }
    }

    Flow a(StateFlow stateFlow);
}
