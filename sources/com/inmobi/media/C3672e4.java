package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.e4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3672e4 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3774i4 f38496a;

    public C3672e4(C3774i4 c3774i4) {
        this.f38496a = c3774i4;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Config config = (Config) obj;
        this.f38496a.f38739a.f38854b.put(config.getType(), config);
        C3774i4 c3774i4 = this.f38496a;
        ConcurrentLinkedQueue concurrentLinkedQueue = (ConcurrentLinkedQueue) c3774i4.f38739a.f38855c.get(config.getType());
        if (concurrentLinkedQueue != null) {
            Iterator it = concurrentLinkedQueue.iterator();
            while (it.hasNext()) {
                InterfaceC4022s4 interfaceC4022s4 = (InterfaceC4022s4) ((WeakReference) it.next()).get();
                if (interfaceC4022s4 != null) {
                    interfaceC4022s4.a(config);
                }
            }
        }
        c3774i4.f38739a.f38855c.remove(config.getType());
        return Unit.f93236a;
    }
}
