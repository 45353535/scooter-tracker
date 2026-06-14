package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzo extends kotlin.coroutines.jvm.internal.k implements Function2 {
    zzfzo(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfzo(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzo) create((zzfyy) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        zzfyy zzfyyVarZzd = zzfyy.zzd();
        Intrinsics.checkNotNullExpressionValue(zzfyyVarZzd, "getDefaultInstance(...)");
        return zzfyyVarZzd;
    }
}
