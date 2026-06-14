package le;

import java.util.Map;
import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import oe.w0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ze.a f94189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Set f94190b;

    static {
        KType kTypeD;
        KClass kClassB = v0.b(Map.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            kTypeD = v0.d(v0.q(Map.class, companion.invariant(v0.p(h.class, companion.getSTAR())), companion.invariant(v0.o(Object.class))));
        } catch (Throwable unused) {
            kTypeD = null;
        }
        f94189a = new ze.a("EngineCapabilities", new ff.a(kClassB, kTypeD));
        f94190b = SetsKt.setOf(w0.f96943a);
    }

    public static final ze.a a() {
        return f94189a;
    }
}
