package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgyg extends zzgzf implements Runnable {
    public static final /* synthetic */ int zzd = 0;
    ListenableFuture zza;
    Class zzb;
    Object zzc;

    zzgyg(ListenableFuture listenableFuture, Class cls, Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof zzhaq ? ((zzhaq) listenableFuture).zzl() : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                String strValueOf = String.valueOf(listenableFuture.getClass());
                String strValueOf2 = String.valueOf(e10.getClass());
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 19 + strValueOf2.length() + 16);
                sb2.append("Future type ");
                sb2.append(strValueOf);
                sb2.append(" threw ");
                sb2.append(strValueOf2);
                sb2.append(" without a cause");
                cause = new NullPointerException(sb2.toString());
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object objZzs = th == null ? zzgzo.zzs(listenableFuture) : null;
        if (th == null) {
            zza(objZzs);
            return;
        }
        if (!cls.isInstance(th)) {
            zzk(listenableFuture);
            return;
        }
        try {
            Object objZzf = zzf(obj, th);
            this.zzb = null;
            this.zzc = null;
            zze(objZzf);
        } catch (Throwable th3) {
            try {
                zzhag.zza(th3);
                zzb(th3);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final void zzc() {
        zzm(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzgyh
    protected final String zzd() {
        String string;
        ListenableFuture listenableFuture = this.zza;
        Class cls = this.zzb;
        Object obj = this.zzc;
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
        if (cls == null || obj == null) {
            if (strZzd != null) {
                return string.concat(strZzd);
            }
            return null;
        }
        int length = string.length();
        String string3 = cls.toString();
        int length2 = string3.length();
        String string4 = obj.toString();
        StringBuilder sb3 = new StringBuilder(length + 15 + length2 + 13 + string4.length() + 1);
        sb3.append(string);
        sb3.append("exceptionType=[");
        sb3.append(string3);
        sb3.append("], fallback=[");
        sb3.append(string4);
        sb3.append(C4240b4.j.f42674e);
        return sb3.toString();
    }

    abstract void zze(Object obj);

    abstract Object zzf(Object obj, Throwable th2) throws Exception;
}
