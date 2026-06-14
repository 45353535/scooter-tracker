package pe;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeParameter;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KVariance;

/* JADX INFO: loaded from: classes3.dex */
final class e implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Function0 f98274a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function1 f98275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ze.a f98276c;

    public e(String name, Function0 createConfiguration, Function1 body) {
        KType kTypeP;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(createConfiguration, "createConfiguration");
        Intrinsics.checkNotNullParameter(body, "body");
        this.f98274a = createConfiguration;
        this.f98275b = body;
        KClass kClassB = v0.b(g.class);
        try {
            KTypeProjection.Companion companion = KTypeProjection.INSTANCE;
            KTypeParameter kTypeParameterT = v0.t(v0.b(e.class), "PluginConfigT", KVariance.INVARIANT, false);
            v0.n(kTypeParameterT, v0.o(Object.class));
            kTypeP = v0.p(g.class, companion.invariant(v0.s(kTypeParameterT)));
        } catch (Throwable unused) {
            kTypeP = null;
        }
        this.f98276c = new ze.a(name, new ff.a(kClassB, kTypeP));
    }

    @Override // oe.v
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(g plugin, ie.c scope) {
        Intrinsics.checkNotNullParameter(plugin, "plugin");
        Intrinsics.checkNotNullParameter(scope, "scope");
        plugin.q0(scope);
    }

    @Override // oe.v
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public g a(Function1 block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object objInvoke = this.f98274a.invoke();
        block.invoke(objInvoke);
        return new g(getKey(), objInvoke, this.f98275b);
    }

    @Override // oe.v
    public ze.a getKey() {
        return this.f98276c;
    }
}
