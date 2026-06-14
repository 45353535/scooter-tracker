package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzs extends kotlin.coroutines.jvm.internal.k implements Function2 {
    /* synthetic */ Object zza;
    final /* synthetic */ zzfyu zzb;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzs(zzfyu zzfyuVar, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzfyuVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        zzfzs zzfzsVar = new zzfzs(this.zzb, continuation);
        zzfzsVar.zza = obj;
        return zzfzsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzs) create((zzfyy) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        pf.b.g();
        kotlin.d.b(obj);
        zzfza zzfzaVarZza = zzfyz.zza((zzfyw) ((zzfyy) this.zza).zzcc());
        zziev zzievVarZzb = zzfzaVarZza.zzb();
        zzfyu zzfyuVar = this.zzb;
        String strZza = zzfyuVar.zza();
        Intrinsics.checkNotNullExpressionValue(strZza, "getGwsQueryId(...)");
        zzfzaVarZza.zzc(zzievVarZzb, strZza, zzfyuVar);
        return zzfzaVarZza.zza();
    }
}
