package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzgbm implements zzgbc {
    private ExecutorService zza;
    private Context zzb;
    private zzgbf zzc;

    private zzgbm() {
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzgbc
    public final zzgbd zza() {
        zziko.zzc(this.zza, ExecutorService.class);
        zziko.zzc(this.zzb, Context.class);
        zziko.zzc(this.zzc, zzgbf.class);
        return new zzgbl(new zzghk(), new zzghm(), new zzgho(), this.zza, this.zzb, this.zzc);
    }

    public final zzgbm zzb(ExecutorService executorService) {
        executorService.getClass();
        this.zza = executorService;
        return this;
    }

    public final zzgbm zzc(Context context) {
        context.getClass();
        this.zzb = context;
        return this;
    }

    public final zzgbm zzd(zzgbf zzgbfVar) {
        zzgbfVar.getClass();
        this.zzc = zzgbfVar;
        return this;
    }

    /* synthetic */ zzgbm(byte[] bArr) {
    }
}
