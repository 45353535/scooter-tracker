package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.nn, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3917nn extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39119a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Vm f39121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C3967pn f39122d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3917nn(Vm vm, Continuation continuation, C3967pn c3967pn) {
        super(2, continuation);
        this.f39121c = vm;
        this.f39122d = c3967pn;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3917nn c3917nn = new C3917nn(this.f39121c, continuation, this.f39122d);
        c3917nn.f39120b = obj;
        return c3917nn;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3917nn) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39119a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f39120b;
            Vm vm = this.f39121c;
            C3892mn c3892mn = new C3892mn(coroutineScope, this.f39122d);
            this.f39119a = 1;
            if (vm.collect(c3892mn, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
