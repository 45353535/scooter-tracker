package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
final class zzacm implements zzbs {
    private final zzbq zza = new zzacl(false);

    public zzacm(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.zzbs
    public final zzbu zza(Context context, zzi zziVar, zzl zzlVar, zzbt zzbtVar, Executor executor, long j10, boolean z10) {
        try {
            return ((zzbs) Class.forName("androidx.media3.effect.SingleInputVideoGraph$Factory").getConstructor(zzbq.class).newInstance(this.zza)).zza(context, zziVar, zzlVar, zzbtVar, executor, 0L, false);
        } catch (Exception e10) {
            throw new IllegalStateException(e10);
        }
    }
}
