package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.legacy.content.WakefulBroadcastReceiver;
import com.google.android.gms.measurement.internal.zznp;
import com.google.android.gms.measurement.internal.zznt;

/* JADX INFO: loaded from: classes8.dex */
public final class AppMeasurementService extends Service implements zznp {
    private zznt zza;

    private final zznt zzd() {
        if (this.zza == null) {
            this.zza = new zznt(this);
        }
        return this.zza;
    }

    @Override // android.app.Service
    @Nullable
    @MainThread
    public IBinder onBind(@NonNull Intent intent) {
        return zzd().zzd(intent);
    }

    @Override // android.app.Service
    @MainThread
    public void onCreate() {
        super.onCreate();
        zzd().zza();
    }

    @Override // android.app.Service
    @MainThread
    public void onDestroy() {
        zzd().zzb();
        super.onDestroy();
    }

    @Override // android.app.Service
    @MainThread
    public void onRebind(@NonNull Intent intent) {
        zzd();
        zznt.zzi(intent);
    }

    @Override // android.app.Service
    @MainThread
    public int onStartCommand(@NonNull Intent intent, int i10, int i11) {
        zzd().zzc(intent, i10, i11);
        return 2;
    }

    @Override // android.app.Service
    @MainThread
    public boolean onUnbind(@NonNull Intent intent) {
        zzd();
        zznt.zzj(intent);
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final boolean zza(int i10) {
        return stopSelfResult(i10);
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzb(@NonNull JobParameters jobParameters, boolean z10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.zznp
    public final void zzc(@NonNull Intent intent) {
        WakefulBroadcastReceiver.completeWakefulIntent(intent);
    }
}
