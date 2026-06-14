package com.google.android.gms.internal.ads;

import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
final class zzfzn extends kotlin.coroutines.jvm.internal.d {
    Object zza;
    /* synthetic */ Object zzb;
    final /* synthetic */ zzgaf zzc;
    int zzd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzfzn(zzgaf zzgafVar, Continuation continuation) {
        super(continuation);
        this.zzc = zzgafVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.zzb = obj;
        this.zzd |= Integer.MIN_VALUE;
        return this.zzc.zzt(this);
    }
}
