package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzees extends zzeeq {
    private final Context zzg;
    private final Executor zzh;

    zzees(Context context, Executor executor) {
        this.zzg = context;
        this.zzh = executor;
        this.zzf = new zzbyw(context, com.google.android.gms.ads.internal.zzt.zzs().zza(), this, this);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        synchronized (this.zzb) {
            try {
                if (!this.zzd) {
                    this.zzd = true;
                    try {
                        this.zzf.zzp().zzf(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeff(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteSignalsClientTask.onConnected");
                        this.zza.zzd(new zzeff(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    public final ListenableFuture zza(zzbzu zzbzuVar) {
        synchronized (this.zzb) {
            try {
                if (this.zzc) {
                    return this.zza;
                }
                this.zzc = true;
                this.zze = zzbzuVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcen zzcenVar = this.zza;
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeer
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        this.zza.zzb();
                    }
                }, zzcei.zzg);
                zzeeq.zzc(this.zzg, zzcenVar, this.zzh);
                return zzcenVar;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
