package hg;

import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final jg.e0 f73272a = new jg.e0("NONE");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final jg.e0 f73273b = new jg.e0("PENDING");

    public static final MutableStateFlow a(Object obj) {
        if (obj == null) {
            obj = ig.t.f74821a;
        }
        return new k0(obj);
    }

    public static final Flow d(StateFlow stateFlow, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return (((i10 < 0 || i10 >= 2) && i10 != -2) || aVar != gg.a.f72766c) ? c0.e(stateFlow, coroutineContext, i10, aVar) : stateFlow;
    }
}
