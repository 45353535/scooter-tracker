package jg;

import eg.n1;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e0 f85891a = new e0("NO_THREAD_ELEMENTS");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f85892b = new Function2() { // from class: jg.i0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.d(obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f85893c = new Function2() { // from class: jg.j0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.e((n1) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f85894d = new Function2() { // from class: jg.k0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return l0.h((r0) obj, (CoroutineContext.Element) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj, CoroutineContext.Element element) {
        if (!(element instanceof n1)) {
            return obj;
        }
        Integer num = obj instanceof Integer ? (Integer) obj : null;
        int iIntValue = num != null ? num.intValue() : 1;
        return iIntValue == 0 ? element : Integer.valueOf(iIntValue + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n1 e(n1 n1Var, CoroutineContext.Element element) {
        if (n1Var != null) {
            return n1Var;
        }
        if (element instanceof n1) {
            return (n1) element;
        }
        return null;
    }

    public static final void f(CoroutineContext coroutineContext, Object obj) {
        if (obj == f85891a) {
            return;
        }
        if (obj instanceof r0) {
            ((r0) obj).b(coroutineContext);
            return;
        }
        Object objFold = coroutineContext.fold(null, f85893c);
        Intrinsics.checkNotNull(objFold, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        ((n1) objFold).restoreThreadContext(coroutineContext, obj);
    }

    public static final Object g(CoroutineContext coroutineContext) {
        Object objFold = coroutineContext.fold(0, f85892b);
        Intrinsics.checkNotNull(objFold);
        return objFold;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 h(r0 r0Var, CoroutineContext.Element element) {
        if (element instanceof n1) {
            n1 n1Var = (n1) element;
            r0Var.a(n1Var, n1Var.updateThreadContext(r0Var.f85915a));
        }
        return r0Var;
    }

    public static final Object i(CoroutineContext coroutineContext, Object obj) {
        if (obj == null) {
            obj = g(coroutineContext);
        }
        if (obj == 0) {
            return f85891a;
        }
        if (obj instanceof Integer) {
            return coroutineContext.fold(new r0(coroutineContext, ((Number) obj).intValue()), f85894d);
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        return ((n1) obj).updateThreadContext(coroutineContext);
    }
}
