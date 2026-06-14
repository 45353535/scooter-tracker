package ie;

import java.util.Iterator;
import java.util.ServiceLoader;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final le.k f74723a;

    static {
        le.k factory;
        Iterator it = ServiceLoader.load(j.class, j.class.getClassLoader()).iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        j jVar = (j) kotlin.sequences.k.I(kotlin.sequences.k.h(it));
        if (jVar == null || (factory = jVar.getFactory()) == null) {
            throw new IllegalStateException("Failed to find HTTP client engine implementation: consider adding client engine dependency. See https://ktor.io/docs/http-client-engines.html");
        }
        f74723a = factory;
    }

    public static final c a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return m.b(f74723a, block);
    }
}
