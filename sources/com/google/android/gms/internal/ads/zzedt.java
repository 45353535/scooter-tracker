package com.google.android.gms.internal.ads;

import android.os.Binder;
import android.os.Bundle;
import com.google.common.util.concurrent.ListenableFuture;
import java.io.InputStream;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes8.dex */
public final class zzedt {
    private final ScheduledExecutorService zza;
    private final zzgzy zzb;
    private final zzgzy zzc;
    private final zzees zzd;
    private final zzika zze;

    public zzedt(ScheduledExecutorService scheduledExecutorService, zzgzy zzgzyVar, zzgzy zzgzyVar2, zzees zzeesVar, zzika zzikaVar) {
        this.zza = scheduledExecutorService;
        this.zzb = zzgzyVar;
        this.zzc = zzgzyVar2;
        this.zzd = zzeesVar;
        this.zze = zzikaVar;
    }

    public final ListenableFuture zza(final zzbzu zzbzuVar) {
        ListenableFuture listenableFutureZzc;
        String str = zzbzuVar.zzd;
        com.google.android.gms.ads.internal.zzt.zzc();
        if (com.google.android.gms.ads.internal.util.zzs.zzH(str)) {
            listenableFutureZzc = zzgzo.zzc(new zzeff(1));
        } else {
            listenableFutureZzc = (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zziv)).booleanValue() || ((Boolean) zzbjp.zza.zze()).booleanValue()) ? this.zzc.zzc(new Callable() { // from class: com.google.android.gms.internal.ads.zzedq
                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
                    return this.zza.zzc(zzbzuVar);
                }
            }) : this.zzd.zza(zzbzuVar);
        }
        final int callingUid = Binder.getCallingUid();
        return (zzgzg) zzgzo.zzh((zzgzg) zzgzo.zzi(zzgzg.zzw(listenableFutureZzc), ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS, this.zza), Throwable.class, new zzgyw() { // from class: com.google.android.gms.internal.ads.zzeds
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzb(zzbzuVar, callingUid, (Throwable) obj);
            }
        }, this.zzb);
    }

    final /* synthetic */ ListenableFuture zzb(final zzbzu zzbzuVar, int i10, Throwable th2) {
        Bundle bundle;
        if (zzbzuVar != null && (bundle = zzbzuVar.zzm) != null) {
            bundle.putBoolean("ls", true);
        }
        return zzgzo.zzj(((zzegw) this.zze.zzb()).zzk(zzbzuVar, i10), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzedr
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return zzgzo.zza(new zzefg((InputStream) obj, zzbzuVar));
            }
        }, this.zzb);
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ zzefg zzc(zzbzu zzbzuVar) {
        return (zzefg) this.zzd.zza(zzbzuVar).get(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzgC)).intValue(), TimeUnit.SECONDS);
    }
}
