package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.cg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3633cg extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38340a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3684eg f38341b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f38342c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3633cg(C3684eg c3684eg, String str, Continuation continuation) {
        super(2, continuation);
        this.f38341b = c3684eg;
        this.f38342c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3633cg(this.f38341b, this.f38342c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3633cg(this.f38341b, this.f38342c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38340a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            C3684eg c3684eg = this.f38341b;
            String str = this.f38342c;
            this.f38340a = 1;
            if (c3684eg.a(str, this) == objG) {
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
