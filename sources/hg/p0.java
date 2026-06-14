package hg;

import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class p0 implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f73289b;

    public p0(Throwable th2) {
        this.f73289b = th2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) throws Throwable {
        throw this.f73289b;
    }
}
