package com.google.android.gms.internal.ads;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzu extends kotlin.coroutines.jvm.internal.k implements Function2 {
    int zza;
    final /* synthetic */ zzgaf zzb;
    final /* synthetic */ String zzc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzu(zzgaf zzgafVar, String str, Continuation continuation) {
        super(2, continuation);
        this.zzb = zzgafVar;
        this.zzc = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new zzfzu(this.zzb, this.zzc, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((zzfzu) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.zza;
        kotlin.d.b(obj);
        if (i10 == 0) {
            zzgaf zzgafVar = this.zzb;
            String str = this.zzc;
            this.zza = 1;
            if (zzgafVar.zzi(str, this) == objG) {
                return objG;
            }
        }
        return Unit.f93236a;
    }
}
