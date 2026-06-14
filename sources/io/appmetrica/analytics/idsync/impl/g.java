package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class g implements ActivationBarrierCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f75402a;

    public g(h hVar) {
        this.f75402a = hVar;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ActivationBarrierCallback
    public final void onWaitFinished() {
        f fVar = this.f75402a.f75409g;
        if (fVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
            fVar = null;
        }
        fVar.run();
    }
}
