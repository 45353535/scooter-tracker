package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Binder;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzeeq implements BaseGmsClient.BaseConnectionCallbacks, BaseGmsClient.BaseOnConnectionFailedListener {
    protected final zzcen zza = new zzcen();
    protected final Object zzb = new Object();
    protected boolean zzc = false;
    protected boolean zzd = false;
    protected zzbzu zze;

    @GuardedBy("lock")
    @VisibleForTesting(otherwise = 3)
    protected zzbyw zzf;

    static void zzc(Context context, ListenableFuture listenableFuture, Executor executor) {
        if (((Boolean) zzbiw.zzj.zze()).booleanValue() || ((Boolean) zzbiw.zzh.zze()).booleanValue()) {
            zzgzo.zzr(listenableFuture, new zzeen(context), executor);
        }
    }

    public void onConnectionFailed(@NonNull ConnectionResult connectionResult) {
        int i10 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Disconnected from remote ad request service.");
        this.zza.zzd(new zzeff(1));
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public void onConnectionSuspended(int i10) {
        int i11 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzd("Cannot connect to remote service, fallback to local instance.");
    }

    protected final void zzb() {
        synchronized (this.zzb) {
            try {
                this.zzd = true;
                if (this.zzf.isConnected() || this.zzf.isConnecting()) {
                    this.zzf.disconnect();
                }
                Binder.flushPendingCommands();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
