package hg;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function1 f73287a = new Function1() { // from class: hg.n
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return p.d(obj);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Function2 f73288b = new Function2() { // from class: hg.o
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return Boolean.valueOf(p.c(obj, obj2));
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(Object obj, Object obj2) {
        return Intrinsics.areEqual(obj, obj2);
    }

    public static final Flow e(Flow flow) {
        return flow instanceof StateFlow ? flow : f(flow, f73287a, f73288b);
    }

    private static final Flow f(Flow flow, Function1 function1, Function2 function2) {
        if (flow instanceof g) {
            g gVar = (g) flow;
            if (gVar.f73218c == function1 && gVar.f73219d == function2) {
                return flow;
            }
        }
        return new g(flow, function1, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Object obj) {
        return obj;
    }
}
