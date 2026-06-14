package ve;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ze.w;

/* JADX INFO: loaded from: classes3.dex */
public interface o extends ze.w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f106704a = a.f106705a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f106705a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final o f106706b = i.f106677c;

        private a() {
        }

        public final o a() {
            return f106706b;
        }
    }

    public static final class b {
        public static void a(o oVar, Function2 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            w.a.a(oVar, body);
        }

        public static String b(o oVar, String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            return w.a.b(oVar, name);
        }
    }
}
