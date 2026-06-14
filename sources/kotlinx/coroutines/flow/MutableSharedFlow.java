package kotlinx.coroutines.flow;

import kotlin.coroutines.Continuation;

/* JADX INFO: loaded from: classes3.dex */
public interface MutableSharedFlow extends SharedFlow, FlowCollector {
    void d();

    Object emit(Object obj, Continuation continuation);

    boolean g(Object obj);

    StateFlow h();
}
