package io.appmetrica.analytics.idsync.impl;

import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;
import io.appmetrica.analytics.idsync.internal.model.IdSyncConfig;
import io.appmetrica.analytics.idsync.internal.model.RequestConfig;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class f extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h f75401a;

    public f(h hVar) {
        this.f75401a = hVar;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        IdSyncConfig idSyncConfig;
        if (this.f75401a.f75408f && (idSyncConfig = this.f75401a.f75407e) != null) {
            this.f75401a.getClass();
            if (h.a(idSyncConfig)) {
                List<RequestConfig> requests = idSyncConfig.getRequests();
                h hVar = this.f75401a;
                Iterator<T> it = requests.iterator();
                while (it.hasNext()) {
                    hVar.f75406d.a((RequestConfig) it.next());
                }
                h hVar2 = this.f75401a;
                IHandlerExecutor iHandlerExecutor = hVar2.f75405c;
                f fVar = hVar2.f75409g;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("syncRunnable");
                    fVar = null;
                }
                iHandlerExecutor.executeDelayed(fVar, this.f75401a.f75404b);
            }
        }
    }
}
