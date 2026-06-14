package com.inmobi.media;

import android.content.Context;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class Ii extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f37076b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Ii(Function1 function1, Continuation continuation) {
        super(2, continuation);
        this.f37076b = (kotlin.coroutines.jvm.internal.k) function1;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Ii(this.f37076b, continuation);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ii(this.f37076b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function1] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37075a;
        try {
            if (i10 == 0) {
                kotlin.d.b(obj);
                ?? r42 = this.f37076b;
                this.f37075a = 1;
                if (r42.invoke(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
        } catch (Exception e10) {
            Context context = Ji.f37157a;
            e10.getMessage();
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
        }
        return Unit.f93236a;
    }
}
