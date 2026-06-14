package com.google.android.gms.internal.ads;

import android.content.Context;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import j$.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes8.dex */
final class zzgkn implements zzgkg {
    private final Context zza;
    private final zzika zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final ExecutorService zze;
    private final zzgje zzf;
    private final zzfvh zzg;

    zzgkn(Context context, zzika zzikaVar, zzgkx zzgkxVar, zzgoe zzgoeVar, ExecutorService executorService, zzgje zzgjeVar, zzfvh zzfvhVar) {
        this.zza = context;
        this.zzb = zzikaVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = executorService;
        this.zzf = zzgjeVar;
        this.zzg = zzfvhVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static zzgds zzf(int i10) {
        zzgdr zzgdrVarZzd = zzgds.zzd();
        zzgdrVarZzd.zze(i10);
        return (zzgds) zzgdrVarZzd.zzbu();
    }

    @Override // com.google.android.gms.internal.ads.zzgkg
    public final ListenableFuture zza() {
        final zzika zzikaVar = this.zzb;
        Objects.requireNonNull(zzikaVar);
        Callable callable = new Callable() { // from class: com.google.android.gms.internal.ads.zzgki
            @Override // java.util.concurrent.Callable
            public final /* synthetic */ Object call() {
                return zzikaVar.zzb();
            }
        };
        ExecutorService executorService = this.zze;
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(zzgzo.zzd(callable, executorService)), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkm
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                this.zza.zzb((zzbch) obj);
                return new Integer(0);
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgkj
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Integer) obj);
            }
        }, zzhaf.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgkk
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzd((zzgdu) obj);
            }
        }, executorService), zzgkh.class, zzgkl.zza, zzhaf.zza());
        this.zzd.zze(15202, zzgzgVar);
        return zzgzgVar;
    }

    final /* synthetic */ int zzb(zzbch zzbchVar) {
        if (zzfwe.zza(zzbchVar)) {
            return 0;
        }
        this.zzd.zzc(15204, zzbchVar.name());
        throw new zzgkh(null);
    }

    final /* synthetic */ ListenableFuture zzc(Integer num) {
        return this.zzc.zzb();
    }

    final /* synthetic */ zzgds zzd(zzgdu zzgduVar) {
        String strZza = zzgduVar.zza().zza();
        String strZzb = zzgduVar.zza().zzb();
        zzgoc zzgocVarZza = this.zzd.zza(15203);
        try {
            zzgocVarZza.zza();
            zzfwv zzfwvVarZza = zzfvq.zza(this.zza, 1, (zzbch) this.zzb.zzb(), strZza, strZzb, "1", this.zzg);
            zzgocVarZza.zzc();
            int i10 = 2;
            if (zzfwvVarZza.zzc == 2) {
                this.zzd.zzb(15208);
                return zzf(4);
            }
            byte[] bArr = zzfwvVarZza.zzb;
            if (bArr == null || bArr.length == 0) {
                this.zzd.zzb(IronSourceConstants.errorCode_destroy);
                return zzf(8);
            }
            try {
                zzbcj zzbcjVarZze = zzbcj.zze(bArr, zzibb.zzb());
                if (zzbcjVarZze.zza().zza().isEmpty() || zzbcjVarZze.zza().zzb().isEmpty() || zzbcjVarZze.zzc().zzy().length == 0) {
                    this.zzd.zzb(15207);
                } else {
                    if (zzgduVar.equals(zzgdu.zzg()) || !TextUtils.equals(zzgduVar.zza().zza(), zzbcjVarZze.zza().zza()) || !TextUtils.equals(zzgduVar.zza().zzb(), zzbcjVarZze.zza().zzb())) {
                        int i11 = zzfwvVarZza.zzc;
                        if (i11 == 4) {
                            if (!this.zzf.zza(zzbcjVarZze.zzb().zzy())) {
                                this.zzd.zzb(15206);
                                return zzf(12);
                            }
                            i11 = 4;
                        }
                        zzgdr zzgdrVarZzd = zzgds.zzd();
                        if (i11 == 2) {
                            i10 = 4;
                        } else if (i11 != 3) {
                            i10 = i11 != 4 ? i11 != 6 ? 1 : 5 : 3;
                        }
                        zzgdrVarZzd.zze(i10);
                        zzgdt zzgdtVarZze = zzgdu.zze();
                        zzgdtVarZze.zza(zzbcjVarZze.zza());
                        zzgdtVarZze.zzc((zzbch) this.zzb.zzb());
                        zzgdrVarZzd.zza((zzgdu) zzgdtVarZze.zzbu());
                        zzgdrVarZzd.zzd(zzbcjVarZze.zzb());
                        zzgdrVarZzd.zzc(zzbcjVarZze.zzc());
                        return (zzgds) zzgdrVarZzd.zzbu();
                    }
                    this.zzd.zzb(15209);
                }
                return zzf(11);
            } catch (zzicg e10) {
                this.zzd.zzd(15205, e10);
                return zzf(9);
            } catch (NullPointerException unused) {
                this.zzd.zzb(15210);
                return zzf(10);
            }
        } catch (Throwable th2) {
            try {
                zzgocVarZza.zzb(th2);
                throw th2;
            } catch (Throwable th3) {
                zzgocVarZza.zzc();
                throw th3;
            }
        }
    }
}
