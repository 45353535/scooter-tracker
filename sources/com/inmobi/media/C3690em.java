package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.em, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3690em implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f38532a;

    public C3690em(CoroutineScope coroutineScope, C3941om c3941om) {
        this.f38532a = c3941om;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        Object objEmit = this.f38532a.f39217d.emit((AbstractC3603bc) obj, continuation);
        return objEmit == pf.b.g() ? objEmit : Unit.f93236a;
    }
}
