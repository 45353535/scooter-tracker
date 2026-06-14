package com.android.billingclient.api;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.play_billing.zziu;
import com.google.android.gms.internal.play_billing.zziw;
import com.google.android.gms.internal.play_billing.zziy;
import com.google.android.gms.internal.play_billing.zzja;
import com.google.android.gms.internal.play_billing.zzjb;
import com.google.android.gms.internal.play_billing.zzjd;
import com.google.android.gms.internal.play_billing.zzjf;
import com.google.android.gms.internal.play_billing.zzji;
import com.google.android.gms.internal.play_billing.zzkl;
import com.google.android.gms.internal.play_billing.zzkn;
import com.google.android.gms.internal.play_billing.zzkr;
import com.google.android.gms.internal.play_billing.zzks;
import com.google.android.gms.internal.play_billing.zzku;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
final class zzbw implements ServiceConnection {
    final /* synthetic */ BillingClientImpl zza;
    private final BillingClientStateListener zzb;
    private final com.google.android.gms.internal.play_billing.zzbl zzc;
    private final com.google.android.gms.internal.play_billing.zzbl zzd;
    private final int zze;

    /* synthetic */ zzbw(BillingClientImpl billingClientImpl, BillingClientStateListener billingClientStateListener, int i10, zzch zzchVar) {
        Objects.requireNonNull(billingClientImpl);
        this.zza = billingClientImpl;
        this.zzc = com.google.android.gms.internal.play_billing.zzbl.zzc(billingClientImpl.zzK);
        this.zzd = com.google.android.gms.internal.play_billing.zzbl.zzc(billingClientImpl.zzK);
        this.zzb = billingClientStateListener;
        this.zze = i10;
    }

    public static /* synthetic */ Object zza(zzbw zzbwVar) {
        Bundle bundle;
        com.google.android.gms.internal.play_billing.zzap zzapVar;
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb != 3) {
                    boolean z10 = true;
                    if (billingClientImpl.zzb != 1) {
                        z10 = false;
                    }
                    if (TextUtils.isEmpty(null)) {
                        bundle = null;
                    } else {
                        bundle = new Bundle();
                        bundle.putString("accountName", null);
                        com.google.android.gms.internal.play_billing.zzc.zzc(bundle, billingClientImpl.zzc, billingClientImpl.zzd, billingClientImpl.zzJ.longValue());
                    }
                    zzjd zzjdVar = zzjd.REASON_UNSPECIFIED;
                    synchronized (billingClientImpl.zza) {
                        zzapVar = billingClientImpl.zzi;
                    }
                    if (zzapVar == null) {
                        BillingClientImpl billingClientImpl2 = zzbwVar.zza;
                        billingClientImpl2.zzbg(0);
                        int i10 = zzbwVar.zze;
                        zzjd zzjdVar2 = zzjd.SERVICE_RESET_TO_NULL;
                        BillingResult billingResult = zzdc.zzj;
                        billingClientImpl2.zzbf(zzjdVar2, billingResult, i10);
                        zzbwVar.zzg(billingResult);
                    } else {
                        BillingClientImpl billingClientImpl3 = zzbwVar.zza;
                        String packageName = billingClientImpl3.zzg.getPackageName();
                        int i11 = 27;
                        int iZzb = 3;
                        int i12 = 27;
                        while (true) {
                            if (i12 < 3) {
                                i12 = 0;
                                break;
                            }
                            try {
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying subs apiVersion: " + i12);
                                iZzb = bundle == null ? zzapVar.zzb(i12, packageName, "subs") : zzapVar.zzc(i12, packageName, "subs", bundle);
                                if (iZzb == 0) {
                                    com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "highestLevelSupportedForSubs: " + i12);
                                    break;
                                }
                                i12--;
                            } catch (Exception e10) {
                                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while checking if billing is supported; try to reconnect", e10);
                                zzjd zzjdVar3 = e10 instanceof DeadObjectException ? zzjd.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION : e10 instanceof RemoteException ? zzjd.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION : e10 instanceof SecurityException ? zzjd.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION : zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
                                String strZza = zzjdVar3.equals(zzjd.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION) ? zzcy.zza(e10) : null;
                                zzbwVar.zza.zzbg(0);
                                zzbwVar.zzf(BillingClientImpl.zzm(e10), zzjdVar3, strZza, z10, 0);
                                zzbwVar.zzg(BillingClientImpl.zzm(e10));
                            }
                        }
                        billingClientImpl3.zzl = i12 >= 5;
                        billingClientImpl3.zzk = i12 >= 3;
                        if (i12 < 3) {
                            zzjdVar = zzjd.SUBSCRIPTIONS_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "In-app billing API does not support subscription on this device.");
                        }
                        while (true) {
                            if (i11 < 3) {
                                break;
                            }
                            com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "trying inapp apiVersion: " + i11);
                            iZzb = bundle == null ? zzapVar.zzb(i11, packageName, "inapp") : zzapVar.zzc(i11, packageName, "inapp", bundle);
                            if (iZzb == 0) {
                                billingClientImpl3.zzm = i11;
                                com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "mHighestLevelSupportedForInApp: " + billingClientImpl3.zzm);
                                break;
                            }
                            i11--;
                        }
                        BillingClientImpl.zzak(billingClientImpl3, billingClientImpl3.zzm);
                        if (billingClientImpl3.zzm < 3) {
                            zzjdVar = zzjd.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                            com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "In-app billing API version 3 is not supported on this device.");
                        }
                        zzjd zzjdVar4 = zzjdVar;
                        BillingClientImpl.zzam(billingClientImpl3, iZzb);
                        if (iZzb != 0) {
                            BillingResult billingResult2 = zzdc.zzb;
                            zzbwVar.zzf(billingResult2, zzjdVar4, null, z10, 0);
                            zzbwVar.zzg(billingResult2);
                        } else {
                            try {
                                Long lZze = zzbwVar.zze(z10);
                                if (z10) {
                                    zziy zziyVarZza = zzja.zza();
                                    zziyVarZza.zze(6);
                                    zzks zzksVarZza = zzku.zza();
                                    int i13 = zzbwVar.zze;
                                    zzksVarZza.zza(i13 > 0);
                                    zzksVarZza.zzb(i13);
                                    zzksVarZza.zzd(0);
                                    if (lZze != null) {
                                        zzksVarZza.zzc(lZze.longValue());
                                    }
                                    BillingClientImpl billingClientImpl4 = zzbwVar.zza;
                                    zziyVarZza.zzd(zzksVarZza);
                                    billingClientImpl4.zzbe((zzja) zziyVarZza.zzi());
                                } else {
                                    zzkl zzklVarZza = zzkn.zza();
                                    zzjb zzjbVarZza = zzjf.zza();
                                    zzjbVarZza.zzp(0);
                                    zzjbVarZza.zzc(0);
                                    zzklVarZza.zza(zzjbVarZza);
                                    if (lZze != null) {
                                        zzklVarZza.zzb(lZze.longValue());
                                    }
                                    zzbwVar.zza.zzh.zzj((zzkn) zzklVarZza.zzi());
                                }
                            } catch (Throwable th2) {
                                com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
                            }
                            zzbwVar.zzg(zzdc.zzi);
                        }
                    }
                }
            } finally {
            }
        }
        return null;
    }

    public static /* synthetic */ void zzb(zzbw zzbwVar) {
        BillingClientImpl billingClientImpl = zzbwVar.zza;
        billingClientImpl.zzbg(0);
        zzjd zzjdVar = zzjd.EXECUTE_ASYNC_TIMEOUT;
        BillingResult billingResult = zzdc.zzk;
        billingClientImpl.zzbf(zzjdVar, billingResult, zzbwVar.zze);
        zzbwVar.zzg(billingResult);
    }

    @Nullable
    private final Long zze(boolean z10) {
        try {
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th2);
        }
        if (z10) {
            synchronized (this.zza.zza) {
                try {
                    com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzc;
                    if (!zzblVar.zzg()) {
                        return null;
                    }
                    zzblVar.zzf();
                    return Long.valueOf(zzblVar.zza(TimeUnit.MILLISECONDS));
                } finally {
                }
            }
        }
        synchronized (this.zza.zza) {
            try {
                com.google.android.gms.internal.play_billing.zzbl zzblVar2 = this.zzd;
                if (!zzblVar2.zzg()) {
                    return null;
                }
                zzblVar2.zzf();
                return Long.valueOf(zzblVar2.zza(TimeUnit.MILLISECONDS));
            } finally {
            }
        }
        com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception getting connection establishment duration.", th2);
        return null;
    }

    private final void zzf(BillingResult billingResult, zzjd zzjdVar, @Nullable String str, boolean z10, int i10) {
        try {
            zzjb zzjbVarZza = zzjf.zza();
            zzjbVarZza.zzp(billingResult.getResponseCode());
            zzjbVarZza.zzb(billingResult.getDebugMessage());
            zzjbVarZza.zze(zzjdVar);
            zzjbVarZza.zzc(0);
            if (str != null) {
                zzjbVarZza.zza(str);
            }
            Long lZze = zze(z10);
            if (!z10) {
                zzkl zzklVarZza = zzkn.zza();
                zzklVarZza.zza(zzjbVarZza);
                if (lZze != null) {
                    zzklVarZza.zzb(lZze.longValue());
                }
                this.zza.zzh.zzj((zzkn) zzklVarZza.zzi());
                return;
            }
            zzks zzksVarZza = zzku.zza();
            int i11 = this.zze;
            zzksVarZza.zza(i11 > 0);
            zzksVarZza.zzb(i11);
            zzksVarZza.zzd(0);
            if (lZze != null) {
                zzksVarZza.zzc(lZze.longValue());
            }
            BillingClientImpl billingClientImpl = this.zza;
            zziu zziuVarZza = zziw.zza();
            zziuVarZza.zzb(zzjbVarZza);
            zziuVarZza.zzp(6);
            zziuVarZza.zze(zzksVarZza);
            billingClientImpl.zzbc((zziw) zziuVarZza.zzi());
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
    }

    private final void zzg(BillingResult billingResult) {
        BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb == 3) {
                    return;
                }
                try {
                    this.zzb.onBillingSetupFinished(billingResult);
                } catch (Throwable th2) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingSetupFinished.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service died.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzaq(billingClientImpl)) {
                zzcz zzczVar = billingClientImpl.zzh;
                zziu zziuVarZza = zziw.zza();
                zziuVarZza.zzp(6);
                zzjb zzjbVarZza = zzjf.zza();
                zzjbVarZza.zze(zzjd.BINDING_DIED);
                zziuVarZza.zzb(zzjbVarZza);
                zzks zzksVarZza = zzku.zza();
                int i10 = this.zze;
                zzksVarZza.zza(i10 > 0);
                zzksVarZza.zzb(i10);
                zziuVarZza.zze(zzksVarZza);
                zzczVar.zza((zziw) zziuVarZza.zzi());
            } else {
                billingClientImpl.zzh.zzi(zzji.zzb());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            if (billingClientImpl2.zzb != 3 && billingClientImpl2.zzb != 0) {
                billingClientImpl2.zzbg(0);
                billingClientImpl2.zzbj();
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        com.google.android.gms.internal.play_billing.zzc.zzn("BillingClient", "Billing service connected.");
        BillingClientImpl billingClientImpl = this.zza;
        synchronized (billingClientImpl.zza) {
            try {
                if (billingClientImpl.zzb == 3) {
                    return;
                }
                billingClientImpl.zzi = com.google.android.gms.internal.play_billing.zzao.zzt(iBinder);
                if (BillingClientImpl.zzK(new Callable() { // from class: com.android.billingclient.api.zzbu
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        zzbw.zza(this.zza);
                        return null;
                    }
                }, 30000L, new Runnable() { // from class: com.android.billingclient.api.zzbv
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzbw.zzb(this.zza);
                    }
                }, billingClientImpl.zzav(), billingClientImpl.zzJ()) == null) {
                    int i10 = this.zze;
                    BillingResult billingResultZzay = billingClientImpl.zzay();
                    billingClientImpl.zzbf(zzjd.MISSING_RESULT_FROM_EXECUTE_ASYNC, billingResultZzay, i10);
                    zzg(billingResultZzay);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.internal.play_billing.zzc.zzo("BillingClient", "Billing service disconnected.");
        try {
            BillingClientImpl billingClientImpl = this.zza;
            if (BillingClientImpl.zzaq(billingClientImpl)) {
                zzcz zzczVar = billingClientImpl.zzh;
                zziu zziuVarZza = zziw.zza();
                zziuVarZza.zzp(6);
                zzjb zzjbVarZza = zzjf.zza();
                zzjbVarZza.zze(zzjd.SERVICE_DISCONNECTED);
                zziuVarZza.zzb(zzjbVarZza);
                zzks zzksVarZza = zzku.zza();
                int i10 = this.zze;
                zzksVarZza.zza(i10 > 0);
                zzksVarZza.zzb(i10);
                zziuVarZza.zze(zzksVarZza);
                zzczVar.zza((zziw) zziuVarZza.zzi());
            } else {
                billingClientImpl.zzh.zzk(zzkr.zzb());
            }
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Unable to log.", th2);
        }
        BillingClientImpl billingClientImpl2 = this.zza;
        synchronized (billingClientImpl2.zza) {
            try {
                com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzd;
                zzblVar.zzd();
                zzblVar.zze();
                if (billingClientImpl2.zzb == 3) {
                    return;
                }
                billingClientImpl2.zzbg(0);
                try {
                    this.zzb.onBillingServiceDisconnected();
                } catch (Throwable th3) {
                    com.google.android.gms.internal.play_billing.zzc.zzp("BillingClient", "Exception while calling onBillingServiceDisconnected.", th3);
                }
            } finally {
            }
        }
    }

    public final void zzc() {
        synchronized (this.zza.zza) {
            com.google.android.gms.internal.play_billing.zzbl zzblVar = this.zzc;
            zzblVar.zzd();
            zzblVar.zze();
        }
    }

    final boolean zzd() {
        return this.zze > 0;
    }
}
