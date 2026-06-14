package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h f93269a = new h();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final a f93270b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f93271c;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f93272a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f93273b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f93274c;

        public a(Method method, Method method2, Method method3) {
            this.f93272a = method;
            this.f93273b = method2;
            this.f93274c = method3;
        }
    }

    private h() {
    }

    private final a a(kotlin.coroutines.jvm.internal.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f93271c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f93270b;
            f93271c = aVar3;
            return aVar3;
        }
    }

    public final String b(kotlin.coroutines.jvm.internal.a continuation) {
        Method method;
        Object objInvoke;
        Method method2;
        Object objInvoke2;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        a aVarA = f93271c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA != f93270b && (method = aVarA.f93272a) != null && (objInvoke = method.invoke(continuation.getClass(), null)) != null && (method2 = aVarA.f93273b) != null && (objInvoke2 = method2.invoke(objInvoke, null)) != null) {
            Method method3 = aVarA.f93274c;
            Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
            if (objInvoke3 instanceof String) {
                return (String) objInvoke3;
            }
        }
        return null;
    }
}
