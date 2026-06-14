package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.t7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4050t7 implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ N7 f39578a;

    public C4050t7(CoroutineScope coroutineScope, N7 n72) {
        this.f39578a = n72;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        N7 n72 = this.f39578a;
        n72.f37425x.a();
        n72.f37413l.set(EnumC4034sg.f39537f);
        return Unit.f93236a;
    }
}
