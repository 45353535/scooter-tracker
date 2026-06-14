package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgyn extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzc = 0;
    ListenableFuture zza;
    Object zzb;

    zzgyn(ListenableFuture listenableFuture, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzk(listenableFuture);
            return;
        }
        try {
            try {
                Object objZzf = zzf(obj, zzgzo.zzs(listenableFuture));
                this.zzb = null;
                zze(objZzf);
            } catch (Throwable th2) {
                try {
                    zzhag.zza(th2);
                    zzb(th2);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (Error e10) {
            zzb(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            zzb(e11.getCause());
        } catch (Exception e12) {
            zzb(e12);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        String string;
        ListenableFuture listenableFuture = this.zza;
        Object obj = this.zzb;
        String strZzd = super.zzd();
        if (listenableFuture != null) {
            String string2 = listenableFuture.toString();
            StringBuilder sb2 = new StringBuilder(string2.length() + 16);
            sb2.append("inputFuture=[");
            sb2.append(string2);
            sb2.append("], ");
            string = sb2.toString();
        } else {
            string = "";
        }
        if (obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 10 + string3.length() + 1);
        sb3.append(string);
        sb3.append("function=[");
        sb3.append(string3);
        sb3.append(C4240b4.j.f42674e);
        return sb3.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Object obj2) throws Exception;
}
