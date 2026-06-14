package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzl extends kotlin.coroutines.jvm.internal.k implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ String zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzl(String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        zzfzl zzfzlVar = new zzfzl(this.zzb, continuation);
        zzfzlVar.zza = obj;
        return zzfzlVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzl) create((zzfyy) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zzfzaVarZza.zzd(zzfzaVarZza.zzb(), this.zzb);
        return zzfzaVarZza.zza();
    }
}
