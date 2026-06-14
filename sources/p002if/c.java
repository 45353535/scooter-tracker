package p002if;

import eg.o0;
import io.ktor.utils.io.e;
import java.io.InputStream;
import jf.a;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import pg.g;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final e a(InputStream inputStream, CoroutineContext context, jf.e pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new b(g.a(inputStream), context);
    }

    public static final e b(InputStream inputStream, CoroutineContext context, jf.e pool) {
        Intrinsics.checkNotNullParameter(inputStream, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(pool, "pool");
        return new b(g.a(inputStream), context);
    }

    public static /* synthetic */ e c(InputStream inputStream, CoroutineContext coroutineContext, jf.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            coroutineContext = o0.b();
        }
        if ((i10 & 2) != 0) {
            eVar = a.a();
        }
        return b(inputStream, coroutineContext, eVar);
    }
}
