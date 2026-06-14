package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.td, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4056td implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Dd f39593a;

    public C4056td(CoroutineScope coroutineScope, Dd dd2) {
        this.f39593a = dd2;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3603bc abstractC3603bc = (AbstractC3603bc) obj;
        AbstractC3669e1 abstractC3669e1 = this.f39593a.f36727d;
        Intrinsics.checkNotNull(abstractC3603bc, "null cannot be cast to non-null type com.inmobi.media.ads.common.models.VideoEvent");
        abstractC3669e1.a((Rl) abstractC3603bc);
        return Unit.f93236a;
    }
}
