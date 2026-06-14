package com.inmobi.media;

import java.util.Collection;
import java.util.LinkedList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class F4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36824a;

    public F4(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new F4(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new F4((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36824a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C4 c42 = (C4) K4.f37203b.getValue();
            this.f36824a = 1;
            obj = c42.a(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        LinkedList linkedList = new LinkedList((Collection) obj);
        K4.f37204c = linkedList;
        Object objClone = linkedList.clone();
        Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
        K4.f37205d = (LinkedList) objClone;
        return Unit.f93236a;
    }
}
