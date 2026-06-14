package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.c7, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3624c7 extends kotlin.jvm.internal.y implements Function2 {
    public C3624c7(Object obj) {
        super(2, obj, C3876m7.class, "handleResultInternal", "handleResultInternal(Lcom/inmobi/media/pingsv2/executor/PingExecutor$PingResult;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object objA = ((C3876m7) this.receiver).f38121b.a((Xf) obj, (Continuation) obj2);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }
}
