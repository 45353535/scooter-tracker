package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes9.dex */
public final class Ce implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f36676a;

    public Ce(CoroutineScope coroutineScope, Function1 function1) {
        this.f36676a = function1;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        this.f36676a.invoke(kotlin.coroutines.jvm.internal.b.a(((Boolean) obj).booleanValue()));
        return Unit.f93236a;
    }
}
