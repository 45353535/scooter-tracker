package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.android.gms.dynamic.ObjectWrapper;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes8.dex */
public final class zzbet extends AppOpenAd {

    @Nullable
    FullScreenContentCallback zza;
    private final zzbex zzb;
    private final AtomicReference zzc;
    private final zzbeu zzd;

    @Nullable
    private OnPaidEventListener zze;
    private final AtomicLong zzf;

    public zzbet(zzbex zzbexVar) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference();
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final String getAdUnitId() {
        String strZzj;
        String str;
        AtomicReference atomicReference = this.zzc;
        if (atomicReference.get() != null) {
            return (String) atomicReference.get();
        }
        synchronized (this) {
            try {
                strZzj = this.zzb.zzj();
            } catch (RemoteException e10) {
                com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                strZzj = null;
            }
            if (strZzj == null) {
                this.zzc.set("");
            } else {
                this.zzc.set(strZzj);
            }
            str = (String) this.zzc.get();
        }
        return str;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final FullScreenContentCallback getFullScreenContentCallback() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @Nullable
    public final OnPaidEventListener getOnPaidEventListener() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final long getPlacementId() {
        long j10;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long jZzk = this.zzb.zzk();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(jZzk);
                    j10 = atomicLong2.get();
                } catch (RemoteException e10) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
                    return 0L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return j10;
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    @NonNull
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVarZzg;
        try {
            zzeaVarZzg = this.zzb.zzg();
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
            zzeaVarZzg = null;
        }
        return ResponseInfo.zzc(zzeaVarZzg);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setFullScreenContentCallback(@Nullable FullScreenContentCallback fullScreenContentCallback) {
        this.zza = fullScreenContentCallback;
        this.zzd.zzb(fullScreenContentCallback);
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setImmersiveMode(boolean z10) {
        try {
            this.zzb.zzh(z10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setOnPaidEventListener(@Nullable OnPaidEventListener onPaidEventListener) {
        this.zze = onPaidEventListener;
        try {
            this.zzb.zzi(new com.google.android.gms.ads.internal.client.zzfs(onPaidEventListener));
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void setPlacementId(long j10) {
        try {
            this.zzb.zzl(j10);
            this.zzf.set(j10);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    @Override // com.google.android.gms.ads.appopen.AppOpenAd
    public final void show(@NonNull Activity activity) {
        try {
            this.zzb.zzf(ObjectWrapper.wrap(activity), this.zzd);
        } catch (RemoteException e10) {
            com.google.android.gms.ads.internal.util.client.zzo.zzl("#007 Could not call remote method.", e10);
        }
    }

    public zzbet(zzbex zzbexVar, String str) {
        this.zzd = new zzbeu();
        this.zzf = new AtomicLong();
        this.zzb = zzbexVar;
        this.zzc = new AtomicReference(str);
    }
}
