package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzt extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    long zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgaf zzd;
    int zze;
    String zzf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzt(zzgaf zzgafVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzi(null, this);
    }
}
