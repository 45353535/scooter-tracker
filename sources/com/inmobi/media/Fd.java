package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: loaded from: classes9.dex */
public final class Fd implements InterfaceC4176y8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC4176y8 f36846a;

    public Fd(CoroutineScope scope, Vb mrC50Model, MutableStateFlow lifecycleObserver) {
        InterfaceC4176y8 jd2;
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(mrC50Model, "mrC50Model");
        Intrinsics.checkNotNullParameter(lifecycleObserver, "lifecycleObserver");
        if (mrC50Model instanceof K5) {
            jd2 = new Ed(scope, (K5) mrC50Model, lifecycleObserver);
        } else {
            if (!(mrC50Model instanceof Nm)) {
                throw new lf.m();
            }
            jd2 = new Jd((Nm) mrC50Model);
        }
        this.f36846a = jd2;
    }

    @Override // com.inmobi.media.InterfaceC4176y8
    public final void a() {
        this.f36846a.a();
    }

    @Override // com.inmobi.media.InterfaceC4176y8
    public final Flow b() {
        return this.f36846a.b();
    }
}
