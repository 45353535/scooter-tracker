package ig;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function3 f74829a;

    /* synthetic */ class a extends kotlin.jvm.internal.y implements Function3 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f74830b = new a();

        a() {
            super(3, FlowCollector.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
            return flowCollector.emit(obj, continuation);
        }
    }

    static {
        a aVar = a.f74830b;
        Intrinsics.checkNotNull(aVar, "null cannot be cast to non-null type kotlin.Function3<kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>, kotlin.Any?, kotlin.coroutines.Continuation<kotlin.Unit>, kotlin.Any?>");
        f74829a = (Function3) b1.g(aVar, 3);
    }
}
