package vh;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vh.c0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f106874a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final l f106875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c0 f106876c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final l f106877d;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    static {
        l vVar;
        try {
            Class.forName("java.nio.file.Files");
            vVar = new w();
        } catch (ClassNotFoundException unused) {
            vVar = new v();
        }
        f106875b = vVar;
        c0.a aVar = c0.f106805c;
        String property = System.getProperty("java.io.tmpdir");
        Intrinsics.checkNotNullExpressionValue(property, "getProperty(...)");
        f106876c = c0.a.e(aVar, property, false, 1, null);
        ClassLoader classLoader = wh.h.class.getClassLoader();
        Intrinsics.checkNotNullExpressionValue(classLoader, "getClassLoader(...)");
        f106877d = new wh.h(classLoader, false, null, 4, null);
    }

    public final j0 a(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return b(file, false);
    }

    public abstract j0 b(c0 c0Var, boolean z10);

    public abstract void c(c0 c0Var, c0 c0Var2);

    public final void d(c0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        e(dir, false);
    }

    public final void e(c0 dir, boolean z10) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        wh.c.a(this, dir, z10);
    }

    public final void f(c0 dir) {
        Intrinsics.checkNotNullParameter(dir, "dir");
        g(dir, false);
    }

    public abstract void g(c0 c0Var, boolean z10);

    public final void h(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        i(path, false);
    }

    public abstract void i(c0 c0Var, boolean z10);

    public final boolean j(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return wh.c.b(this, path);
    }

    public abstract List k(c0 c0Var);

    public final k l(c0 path) {
        Intrinsics.checkNotNullParameter(path, "path");
        return wh.c.c(this, path);
    }

    public abstract k m(c0 c0Var);

    public abstract j n(c0 c0Var);

    public final j o(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return p(file, false, false);
    }

    public abstract j p(c0 c0Var, boolean z10, boolean z11);

    public final j0 q(c0 file) {
        Intrinsics.checkNotNullParameter(file, "file");
        return r(file, false);
    }

    public abstract j0 r(c0 c0Var, boolean z10);

    public abstract l0 s(c0 c0Var);
}
