package com.inmobi.media;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.i6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3776i6 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3850l6 f38749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3674e6 f38750c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3776i6(C3850l6 c3850l6, C3674e6 c3674e6, Continuation continuation) {
        super(2, continuation);
        this.f38749b = c3850l6;
        this.f38750c = c3674e6;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3776i6(this.f38749b, this.f38750c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3776i6(this.f38749b, this.f38750c, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38748a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            AbstractC3649d6 abstractC3649d6 = this.f38749b.f38946b;
            ArrayList arrayList = this.f38750c.f38502a;
            this.f38748a = 1;
            if (abstractC3649d6.a(arrayList, this) == objG) {
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
