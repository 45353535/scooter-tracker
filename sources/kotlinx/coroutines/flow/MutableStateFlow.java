package kotlinx.coroutines.flow;

/* JADX INFO: loaded from: classes3.dex */
public interface MutableStateFlow extends StateFlow, MutableSharedFlow {
    boolean b(Object obj, Object obj2);

    @Override // kotlinx.coroutines.flow.StateFlow
    Object getValue();

    void setValue(Object obj);
}
