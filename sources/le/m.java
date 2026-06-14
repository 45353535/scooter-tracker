package le;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements CoroutineContext.Element {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f94196c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f94197b;

    public static final class a implements CoroutineContext.b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public m(CoroutineContext callContext) {
        Intrinsics.checkNotNullParameter(callContext, "callContext");
        this.f94197b = callContext;
    }

    public final CoroutineContext a() {
        return this.f94197b;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return CoroutineContext.Element.a.a(this, obj, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.b(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public CoroutineContext.b getKey() {
        return f94196c;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.b bVar) {
        return CoroutineContext.Element.a.c(this, bVar);
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(this, coroutineContext);
    }
}
