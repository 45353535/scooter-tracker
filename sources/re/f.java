package re;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import ve.p;
import ve.s0;
import ve.x;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f99439a;

    static {
        KType kTypeO;
        KClass kClassB = v0.b(k.class);
        try {
            kTypeO = v0.o(k.class);
        } catch (Throwable unused) {
            kTypeO = null;
        }
        f99439a = new ze.a("ResponseAdapterAttributeKey", new ff.a(kClassB, kTypeO));
    }

    public static final ze.a a() {
        return f99439a;
    }

    public static final p b(x xVar, Function1 block) {
        Intrinsics.checkNotNullParameter(xVar, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        p headers = xVar.getHeaders();
        block.invoke(headers);
        return headers;
    }

    public static final void c(d dVar, String urlString) {
        Intrinsics.checkNotNullParameter(dVar, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        s0.l(dVar.i(), urlString);
    }
}
