package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes9.dex */
public final class ho extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38724a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38725b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f38726c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ho(String str, InterfaceC3878m9 interfaceC3878m9, Continuation continuation) {
        super(1, continuation);
        this.f38725b = str;
        this.f38726c = interfaceC3878m9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new ho(this.f38725b, this.f38726c, continuation);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new ho(this.f38725b, this.f38726c, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38724a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        jo joVar = jo.f38842a;
        String str = this.f38725b;
        InterfaceC3878m9 interfaceC3878m9 = this.f38726c;
        this.f38724a = 1;
        Deferred deferredB = eg.i.b(A9.f36558d, null, eg.f0.f69149e, new C3718fo(str, interfaceC3878m9, null), 1, null);
        return deferredB == objG ? objG : deferredB;
    }
}
