package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.co, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3641co extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f38412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f38413c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3641co(String str, InterfaceC3878m9 interfaceC3878m9, Continuation continuation) {
        super(2, continuation);
        this.f38412b = str;
        this.f38413c = interfaceC3878m9;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3641co(this.f38412b, this.f38413c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3641co(this.f38412b, this.f38413c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Object objG = pf.b.g();
        int i10 = this.f38411a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        jo joVar = jo.f38842a;
        String str = this.f38412b;
        InterfaceC3878m9 interfaceC3878m9 = this.f38413c;
        this.f38411a = 1;
        Object objA = joVar.a(str, interfaceC3878m9, this);
        return objA == objG ? objG : objA;
    }
}
