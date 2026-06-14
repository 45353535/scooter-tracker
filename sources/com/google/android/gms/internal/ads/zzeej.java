package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public final class zzeej extends zzeeq {
    private final Context zzg;
    private final Executor zzh;

    public zzeej(Context context, Executor executor) {
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
                        this.zzf.zzp().zze(this.zze, ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzou)).booleanValue() ? new zzeep(this.zza, this.zze) : new zzeeo(this));
                    } catch (RemoteException | IllegalArgumentException unused) {
                        this.zza.zzd(new zzeff(1));
                    } catch (Throwable th2) {
                        com.google.android.gms.ads.internal.zzt.zzh().zzg(th2, "RemoteAdRequestClientTask.onConnected");
                        this.zza.zzd(new zzeff(1));
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeeq, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzeff(1));
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
                zzcenVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzeei
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
