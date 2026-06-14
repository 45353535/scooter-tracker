package eg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    private static final CoroutineContext d(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, final boolean z10) {
        boolean zH = h(coroutineContext);
        boolean zH2 = h(coroutineContext2);
        if (!zH && !zH2) {
            return coroutineContext.plus(coroutineContext2);
        }
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = coroutineContext2;
        kotlin.coroutines.e eVar = kotlin.coroutines.e.f93267b;
        CoroutineContext coroutineContext3 = (CoroutineContext) coroutineContext.fold(eVar, new Function2() { // from class: eg.y
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return a0.e(ref$ObjectRef, z10, (CoroutineContext) obj, (CoroutineContext.Element) obj2);
            }
        });
        if (zH2) {
            ref$ObjectRef.f93280b = ((CoroutineContext) ref$ObjectRef.f93280b).fold(eVar, new Function2() { // from class: eg.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a0.f((CoroutineContext) obj, (CoroutineContext.Element) obj2);
                }
            });
        }
        return coroutineContext3.plus((CoroutineContext) ref$ObjectRef.f93280b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext e(Ref$ObjectRef ref$ObjectRef, boolean z10, CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CoroutineContext f(CoroutineContext coroutineContext, CoroutineContext.Element element) {
        return coroutineContext.plus(element);
    }

    public static final String g(CoroutineContext coroutineContext) {
        return null;
    }

    private static final boolean h(CoroutineContext coroutineContext) {
        return ((Boolean) coroutineContext.fold(Boolean.FALSE, new Function2() { // from class: eg.x
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Boolean.valueOf(a0.i(((Boolean) obj).booleanValue(), (CoroutineContext.Element) obj2));
            }
        })).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean i(boolean z10, CoroutineContext.Element element) {
        return z10;
    }

    public static final CoroutineContext j(CoroutineContext coroutineContext, CoroutineContext coroutineContext2) {
        return !h(coroutineContext2) ? coroutineContext.plus(coroutineContext2) : d(coroutineContext, coroutineContext2, false);
    }

    public static final CoroutineContext k(CoroutineScope coroutineScope, CoroutineContext coroutineContext) {
        CoroutineContext coroutineContextD = d(coroutineScope.getCoroutineContext(), coroutineContext, true);
        return (coroutineContextD == o0.a() || coroutineContextD.get(kotlin.coroutines.d.M8) != null) ? coroutineContextD : coroutineContextD.plus(o0.a());
    }

    public static final y1 l(CoroutineStackFrame coroutineStackFrame) {
        while (!(coroutineStackFrame instanceof kotlinx.coroutines.l) && (coroutineStackFrame = coroutineStackFrame.getCallerFrame()) != null) {
            if (coroutineStackFrame instanceof y1) {
                return (y1) coroutineStackFrame;
            }
        }
        return null;
    }

    public static final y1 m(Continuation continuation, CoroutineContext coroutineContext, Object obj) {
        if (!(continuation instanceof CoroutineStackFrame) || coroutineContext.get(z1.f69193b) == null) {
            return null;
        }
        y1 y1VarL = l((CoroutineStackFrame) continuation);
        if (y1VarL != null) {
            y1VarL.e1(coroutineContext, obj);
        }
        return y1VarL;
    }
}
