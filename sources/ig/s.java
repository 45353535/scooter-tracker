package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class s implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final s f74820b = new s();

    private s() {
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        return Unit.f93236a;
    }
}
