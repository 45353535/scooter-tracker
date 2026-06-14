package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Objects;

/* JADX INFO: loaded from: classes8.dex */
final class zzgis {
    private final zzgmu zza;
    private final zzgkg zzb;
    private final zzgkx zzc;
    private final zzgoe zzd;
    private final zzgcl zze;
    private final boolean zzf;
    private final long zzg;
    private final long zzh;

    zzgis(zzgmu zzgmuVar, zzgkg zzgkgVar, zzgkx zzgkxVar, zzgoe zzgoeVar, zzgcl zzgclVar, boolean z10, long j10, long j11) {
        this.zza = zzgmuVar;
        this.zzb = zzgkgVar;
        this.zzc = zzgkxVar;
        this.zzd = zzgoeVar;
        this.zze = zzgclVar;
        this.zzf = z10;
        this.zzg = j10;
        this.zzh = j11;
    }

    private final ListenableFuture zzh(final int i10) {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzg((zzgzg) zzgzo.zzk((zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzg.zzw(this.zzb.zza()), new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgij
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                zzgds zzgdsVar = (zzgds) obj;
                this.zza.zzd(zzgdsVar);
                return zzgdsVar;
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgik
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zze((zzgds) obj);
            }
        }, zzhaf.zza()), zzgil.zza, zzhaf.zza()), zzgie.class, zzgim.zza, zzhaf.zza()), zzgif.class, zzgin.zza, zzhaf.zza()), zzgid.class, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgio
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return this.zza.zzf(i10, (zzgid) obj);
            }
        }, zzhaf.zza());
        this.zzd.zze(1002, zzgzgVar);
        return zzgzgVar;
    }

    final void zza(long j10) {
        if (j10 > 0) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgiq
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzb();
                }
            }, j10);
        } else {
            zzb();
        }
    }

    final ListenableFuture zzb() {
        zzgzg zzgzgVar = (zzgzg) zzgzo.zzg(zzgzg.zzw(this.zzc.zzb()), Throwable.class, zzgih.zza, zzhaf.zza());
        final zzgmu zzgmuVar = this.zza;
        Objects.requireNonNull(zzgmuVar);
        return (zzgzg) zzgzo.zzj((zzgzg) zzgzo.zzk(zzgzgVar, new zzgqt() { // from class: com.google.android.gms.internal.ads.zzgig
            @Override // com.google.android.gms.internal.ads.zzgqt
            public final /* synthetic */ Object apply(Object obj) {
                return new Boolean(zzgmuVar.zza((zzgdu) obj));
            }
        }, zzhaf.zza()), new zzgyw() { // from class: com.google.android.gms.internal.ads.zzgii
            @Override // com.google.android.gms.internal.ads.zzgyw
            public final /* synthetic */ ListenableFuture zza(Object obj) {
                return this.zza.zzc((Boolean) obj);
            }
        }, zzhaf.zza());
    }

    final /* synthetic */ ListenableFuture zzc(Boolean bool) {
        if (bool.booleanValue()) {
            return zzh(0);
        }
        this.zzd.zzb(1003);
        return zzgzo.zza(zzgir.RESULT_NOOP_LOCAL_PROGRAM_STILL_VALID);
    }

    final /* synthetic */ zzgds zzd(zzgds zzgdsVar) {
        int iZzj = zzgdsVar.zzj() - 1;
        if (iZzj == 1 || iZzj == 2) {
            return zzgdsVar;
        }
        if (iZzj == 3) {
            zzgoe zzgoeVar = this.zzd;
            int iZzj2 = zzgdsVar.zzj() - 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzj2).length());
            sb2.append(iZzj2);
            zzgoeVar.zzc(1004, sb2.toString());
            throw new zzgif(zzgdsVar.zzj() - 1);
        }
        if (iZzj != 12) {
            zzgoe zzgoeVar2 = this.zzd;
            int iZzj3 = zzgdsVar.zzj() - 1;
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzj3).length());
            sb3.append(iZzj3);
            zzgoeVar2.zzc(1005, sb3.toString());
            throw new zzgie(zzgdsVar.zzj() - 1);
        }
        zzgoe zzgoeVar3 = this.zzd;
        int iZzj4 = zzgdsVar.zzj() - 1;
        StringBuilder sb4 = new StringBuilder(String.valueOf(iZzj4).length());
        sb4.append(iZzj4);
        zzgoeVar3.zzc(1005, sb4.toString());
        throw new zzgid(zzgdsVar.zzj() - 1);
    }

    final /* synthetic */ ListenableFuture zze(zzgds zzgdsVar) {
        if (zzgdsVar.zzj() == 2) {
            return this.zzc.zzd(zzgdsVar.zza(), zzgdsVar.zzb().zzy());
        }
        if (zzgdsVar.zzj() == 3) {
            return this.zzc.zzc(zzgdsVar.zza(), zzgdsVar.zzc().zzy(), zzgdsVar.zzb().zzy());
        }
        throw new AssertionError("Unreachable");
    }

    final /* synthetic */ zzgir zzf(final int i10, zzgid zzgidVar) {
        if (this.zzf && i10 < this.zzg) {
            this.zze.zza(new Runnable() { // from class: com.google.android.gms.internal.ads.zzgip
                @Override // java.lang.Runnable
                public final /* synthetic */ void run() {
                    this.zza.zzg(i10);
                }
            }, this.zzh * ((long) Math.pow(2.0d, i10)));
        }
        return zzgir.RESULT_FAILURE_FETCHER_HTTP_RUNTIME_EXCEPTION;
    }

    final /* synthetic */ void zzg(int i10) {
        zzh(i10 + 1);
    }
}
