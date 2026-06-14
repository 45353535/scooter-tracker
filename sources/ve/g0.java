package ve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ze.w;

/* JADX INFO: loaded from: classes3.dex */
public interface g0 extends ze.w {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f106672b = a.f106673a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f106673a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final g0 f106674b = j.f106679c;

        private a() {
        }

        public final g0 a() {
            return f106674b;
        }
    }

    public static final class b {
        public static void a(g0 g0Var, Function2 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            w.a.a(g0Var, body);
        }
    }
}
