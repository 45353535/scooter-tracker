package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Arrays;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes8.dex */
public final class zzayz implements zzazc {

    @Nullable
    private static zzayz zzb;
    private final Context zzc;
    private final zzfwr zzd;
    private final zzfwy zze;
    private final zzfxa zzf;
    private final zzbae zzg;
    private final zzfvh zzh;
    private final Executor zzi;
    private final zzbch zzj;
    private final zzfwx zzk;
    private final zzbat zzm;

    @Nullable
    private final zzbal zzn;

    @Nullable
    private final zzbac zzo;
    private volatile boolean zzq;
    private volatile boolean zzr;

    @VisibleForTesting
    volatile long zza = 0;
    private final Object zzp = new Object();
    private final CountDownLatch zzl = new CountDownLatch(1);

    @VisibleForTesting
    zzayz(@NonNull Context context, @NonNull zzfvh zzfvhVar, @NonNull zzfwr zzfwrVar, @NonNull zzfwy zzfwyVar, @NonNull zzfxa zzfxaVar, @NonNull zzbae zzbaeVar, @NonNull Executor executor, @NonNull zzfvc zzfvcVar, zzbch zzbchVar, @Nullable zzbat zzbatVar, @Nullable zzbal zzbalVar, @Nullable zzbac zzbacVar) {
        this.zzr = false;
        this.zzc = context;
        this.zzh = zzfvhVar;
        this.zzd = zzfwrVar;
        this.zze = zzfwyVar;
        this.zzf = zzfxaVar;
        this.zzg = zzbaeVar;
        this.zzi = executor;
        this.zzj = zzbchVar;
        this.zzm = zzbatVar;
        this.zzn = zzbalVar;
        this.zzo = zzbacVar;
        this.zzr = false;
        this.zzk = new zzayx(this, zzfvcVar);
    }

    public static synchronized zzayz zza(@NonNull Context context, @NonNull zzavi zzaviVar, boolean z10) {
        zzfvi zzfviVarZzh;
        zzfviVarZzh = zzfvj.zzh();
        zzfviVarZzh.zza(zzaviVar.zza());
        zzfviVarZzh.zzb(zzaviVar.zzb());
        return zzs(context, Executors.newCachedThreadPool(), zzfviVarZzh.zzh(), z10);
    }

    private static synchronized zzayz zzs(@NonNull Context context, @NonNull Executor executor, zzfvj zzfvjVar, boolean z10) {
        try {
            if (zzb == null) {
                zzfvh zzfvhVarZza = zzfvh.zza(context, executor, z10);
                zzazn zzaznVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzej)).booleanValue() ? zzazn.zza(context) : null;
                zzbat zzbatVarZza = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzek)).booleanValue() ? zzbat.zza(context, executor) : null;
                zzbal zzbalVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue() ? new zzbal() : null;
                zzbac zzbacVar = ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdB)).booleanValue() ? new zzbac() : null;
                zzfvx zzfvxVarZza = zzfvx.zza(context, executor, zzfvhVarZza, zzfvjVar);
                zzbad zzbadVar = new zzbad(context);
                zzbae zzbaeVar = new zzbae(zzfvjVar, zzfvxVarZza, new zzbar(context, zzbadVar), zzbadVar, zzaznVarZza, zzbatVarZza, zzbalVar, zzbacVar);
                zzbch zzbchVarZzb = zzfwe.zzb(context, zzfvhVarZza);
                zzfvc zzfvcVar = new zzfvc();
                zzayz zzayzVar = new zzayz(context, zzfvhVarZza, new zzfwr(context, zzbchVarZzb), new zzfwy(context, zzbchVarZzb, new zzayw(zzfvhVarZza), ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzdc)).booleanValue()), new zzfxa(context, zzbaeVar, zzfvhVarZza, zzfvcVar, false), zzbaeVar, executor, zzfvcVar, zzbchVarZzb, zzbatVarZza, zzbalVar, zzbacVar);
                zzb = zzayzVar;
                zzayzVar.zzc();
                zzb.zzm();
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return zzb;
    }

    private final void zzt() {
        zzbat zzbatVar = this.zzm;
        if (zzbatVar != null) {
            zzbatVar.zzb();
        }
    }

    private final zzfwq zzu(int i10) {
        if (zzfwe.zza(this.zzj)) {
            return ((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue() ? this.zze.zzc(1) : this.zzd.zzb(1);
        }
        return null;
    }

    public final synchronized boolean zzb() {
        return this.zzr;
    }

    final synchronized void zzc() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarZzu = zzu(1);
        if (zzfwqVarZzu == null) {
            this.zzh.zzb(4013, System.currentTimeMillis() - jCurrentTimeMillis);
        } else if (this.zzf.zza(zzfwqVarZzu)) {
            this.zzr = true;
            this.zzl.countDown();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzd(@Nullable MotionEvent motionEvent) {
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb != null) {
            try {
                zzfvkVarZzb.zzd(null, motionEvent);
            } catch (zzfwz e10) {
                this.zzh.zzc(e10.zza(), -1L, e10);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zze(int i10, int i11, int i12) {
        DisplayMetrics displayMetrics;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zznu)).booleanValue() || (displayMetrics = this.zzc.getResources().getDisplayMetrics()) == null) {
            return;
        }
        float f10 = i10;
        float f11 = displayMetrics.density;
        float f12 = i11;
        MotionEvent motionEventObtain = MotionEvent.obtain(0L, 0L, 0, f10 * f11, f12 * f11, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain);
        motionEventObtain.recycle();
        float f13 = displayMetrics.density;
        MotionEvent motionEventObtain2 = MotionEvent.obtain(0L, 0L, 2, f10 * f13, f12 * f13, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain2);
        motionEventObtain2.recycle();
        float f14 = displayMetrics.density;
        MotionEvent motionEventObtain3 = MotionEvent.obtain(0L, i12, 1, f10 * f14, f12 * f14, 0.0f, 0.0f, 0, 0.0f, 0.0f, 0, 0);
        zzd(motionEventObtain3);
        motionEventObtain3.recycle();
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzf(Context context, String str, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzc();
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzc = zzfvkVarZzb.zzc(context, null, str, view, activity);
        this.zzh.zzd(5000, System.currentTimeMillis() - jCurrentTimeMillis, strZzc, null);
        return strZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzg(Context context, @Nullable String str, @Nullable View view) {
        return zzf(context, str, view, null);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzh(@Nullable View view) {
        this.zzg.zza(view);
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final void zzi(StackTraceElement[] stackTraceElementArr) {
        zzbac zzbacVar = this.zzo;
        if (zzbacVar != null) {
            zzbacVar.zza(Arrays.asList(stackTraceElementArr));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzj(Context context, @Nullable View view, @Nullable Activity activity) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zzb(context, view);
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZzb = zzfvkVarZzb.zzb(context, null, view, activity);
        this.zzh.zzd(5002, System.currentTimeMillis() - jCurrentTimeMillis, strZzb, null);
        return strZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzk(Context context) {
        return "19";
    }

    @Override // com.google.android.gms.internal.ads.zzazc
    public final String zzl(Context context) {
        zzt();
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzds)).booleanValue()) {
            this.zzn.zza();
        }
        zzm();
        zzfvk zzfvkVarZzb = this.zzf.zzb();
        if (zzfvkVarZzb == null) {
            return "";
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strZza = zzfvkVarZzb.zza(context, null);
        this.zzh.zzd(5001, System.currentTimeMillis() - jCurrentTimeMillis, strZza, null);
        return strZza;
    }

    public final void zzm() {
        if (this.zzq) {
            return;
        }
        synchronized (this.zzp) {
            try {
                if (!this.zzq) {
                    if ((System.currentTimeMillis() / 1000) - this.zza < 3600) {
                        return;
                    }
                    zzfwq zzfwqVarZzc = this.zzf.zzc();
                    if ((zzfwqVarZzc == null || zzfwqVarZzc.zze(3600L)) && zzfwe.zza(this.zzj)) {
                        this.zzi.execute(new zzayy(this));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void zzn() {
        String str;
        String strZzb;
        int length;
        zzfwq zzfwqVarZzu;
        zzbcp zzbcpVarZza;
        boolean zZza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        zzfwq zzfwqVarZzu2 = zzu(1);
        if (zzfwqVarZzu2 != null) {
            String strZza = zzfwqVarZzu2.zza().zza();
            strZzb = zzfwqVarZzu2.zza().zzb();
            str = strZza;
        } else {
            str = null;
            strZzb = null;
        }
        try {
            try {
                Context context = this.zzc;
                zzbch zzbchVar = this.zzj;
                zzfvh zzfvhVar = this.zzh;
                zzfwv zzfwvVarZza = zzfvq.zza(context, 1, zzbchVar, str, strZzb, "1", zzfvhVar);
                byte[] bArr = zzfwvVarZza.zzb;
                if (bArr == null || (length = bArr.length) == 0) {
                    zzfvhVar.zzb(IronSourceConstants.errorCode_adClosed, System.currentTimeMillis() - jCurrentTimeMillis);
                } else {
                    try {
                        zzbcj zzbcjVarZzd = zzbcj.zzd(zzian.zzs(bArr, 0, length), zzibb.zza());
                        if (zzbcjVarZzd.zza().zza().isEmpty() || zzbcjVarZzd.zza().zzb().isEmpty() || zzbcjVarZzd.zzc().zzy().length == 0 || ((zzfwqVarZzu = zzu(1)) != null && (zzbcpVarZza = zzfwqVarZzu.zza()) != null && zzbcjVarZzd.zza().zza().equals(zzbcpVarZza.zza()) && zzbcjVarZzd.zza().zzb().equals(zzbcpVarZza.zzb()))) {
                            this.zzh.zzb(IronSourceConstants.errorCode_destroy, System.currentTimeMillis() - jCurrentTimeMillis);
                        } else {
                            zzfwx zzfwxVar = this.zzk;
                            int i10 = zzfwvVarZza.zzc;
                            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzd(zzbhe.zzda)).booleanValue()) {
                                zZza = this.zzd.zza(zzbcjVarZzd, zzfwxVar);
                            } else if (i10 == 3) {
                                zZza = this.zze.zzb(zzbcjVarZzd);
                            } else {
                                if (i10 == 4) {
                                    zZza = this.zze.zza(zzbcjVarZzd, zzfwxVar);
                                }
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                            if (zZza) {
                                zzfwq zzfwqVarZzu3 = zzu(1);
                                if (zzfwqVarZzu3 != null) {
                                    if (this.zzf.zza(zzfwqVarZzu3)) {
                                        this.zzr = true;
                                    }
                                    this.zza = System.currentTimeMillis() / 1000;
                                }
                            } else {
                                this.zzh.zzb(4009, System.currentTimeMillis() - jCurrentTimeMillis);
                            }
                        }
                    } catch (NullPointerException unused) {
                        this.zzh.zzb(IronSourceError.ERROR_OLD_API_INIT_IN_PROGRESS, System.currentTimeMillis() - jCurrentTimeMillis);
                    }
                }
            } catch (zzicg e10) {
                this.zzh.zzc(4002, System.currentTimeMillis() - jCurrentTimeMillis, e10);
            }
            this.zzl.countDown();
        } catch (Throwable th2) {
            this.zzl.countDown();
            throw th2;
        }
    }

    final /* synthetic */ zzfvh zzo() {
        return this.zzh;
    }

    final /* synthetic */ Object zzp() {
        return this.zzp;
    }

    final /* synthetic */ boolean zzq() {
        return this.zzq;
    }

    final /* synthetic */ void zzr(boolean z10) {
        this.zzq = z10;
    }
}
