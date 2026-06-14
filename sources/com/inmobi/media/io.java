package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Deferred;

/* JADX INFO: loaded from: classes9.dex */
public final class io extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38776a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3878m9 f38777b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38778c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Deferred f38779d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public io(InterfaceC3878m9 interfaceC3878m9, String str, Deferred deferred, Continuation continuation) {
        super(2, continuation);
        this.f38777b = interfaceC3878m9;
        this.f38778c = str;
        this.f38779d = deferred;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new io(this.f38777b, this.f38778c, this.f38779d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((io) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38776a;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        InterfaceC3878m9 interfaceC3878m9 = this.f38777b;
        if (interfaceC3878m9 != null) {
            ((C3903n9) interfaceC3878m9).c("WebResourceHandler", "Waiting for response to finish download: " + this.f38778c);
        }
        Deferred deferred = this.f38779d;
        this.f38776a = 1;
        Object objAwait = deferred.await(this);
        return objAwait == objG ? objG : objAwait;
    }
}
