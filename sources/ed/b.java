package ed;

import ed.a;
import eg.m1;
import ic.j;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements CoroutineScope, a.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a f69065b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CoroutineContext f69066c;

    public b(a adState, j coroutineDispatchers) {
        Intrinsics.checkNotNullParameter(adState, "adState");
        Intrinsics.checkNotNullParameter(coroutineDispatchers, "coroutineDispatchers");
        this.f69065b = adState;
        this.f69066c = m1.b(null, 1, null).plus(coroutineDispatchers.i());
        if (adState.h()) {
            i.f(this, null, 1, null);
        } else {
            adState.a(this);
        }
    }

    @Override // ed.a.b
    public void a(a source, a.EnumC0868a event) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        if (event == a.EnumC0868a.Destroyed && Intrinsics.areEqual(this.f69065b, source)) {
            i.f(this, null, 1, null);
            source.b(this);
        }
    }

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.f69066c;
    }
}
