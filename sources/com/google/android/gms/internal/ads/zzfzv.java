package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzv extends kotlin.coroutines.jvm.internal.d {
    long zza;
    Object zzb;
    /* synthetic */ Object zzc;
    final /* synthetic */ zzgaf zzd;
    int zze;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzv(zzgaf zzgafVar, Continuation continuation) {
        super(continuation);
        this.zzd = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzc = obj;
        this.zze |= Integer.MIN_VALUE;
        return this.zzd.zzn(this);
    }
}
