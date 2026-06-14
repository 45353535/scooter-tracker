package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaos implements zzaon {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    @Nullable
    private final zzaqf zzb;
    private zzaor zzg;
    private long zzh;
    private String zzi;
    private zzagh zzj;
    private boolean zzk;
    private final boolean[] zzd = new boolean[4];
    private final zzaoq zze = new zzaoq(128);
    private long zzl = -9223372036854775807L;

    @Nullable
    private final zzape zzf = new zzape(178, 128);

    @Nullable
    private final zzer zzc = new zzer();

    zzaos(@Nullable zzaqf zzaqfVar, String str) {
        this.zzb = zzaqfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        zzgm.zzj(this.zzd);
        this.zze.zza();
        zzaor zzaorVar = this.zzg;
        if (zzaorVar != null) {
            zzaorVar.zza();
        }
        this.zzf.zza();
        this.zzh = 0L;
        this.zzl = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzi = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 2);
        this.zzj = zzaghVarZzu;
        this.zzg = new zzaor(zzaghVarZzu);
        this.zzb.zza(zzaexVar, zzaqbVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzl = j10;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzd(zzer zzerVar) {
        int i10;
        int i11 = 3;
        this.zzg.getClass();
        this.zzj.getClass();
        int iZzg = zzerVar.zzg();
        int iZze = zzerVar.zze();
        byte[] bArrZzi = zzerVar.zzi();
        this.zzh += (long) zzerVar.zzd();
        this.zzj.zzc(zzerVar, zzerVar.zzd());
        while (true) {
            int iZzi = zzgm.zzi(bArrZzi, iZzg, iZze, this.zzd);
            if (iZzi == iZze) {
                break;
            }
            int i12 = iZzi + 3;
            int i13 = zzerVar.zzi()[i12] & 255;
            int i14 = iZzi - iZzg;
            if (!this.zzk) {
                if (i14 > 0) {
                    this.zze.zzc(bArrZzi, iZzg, iZzi);
                }
                int i15 = i14 < 0 ? -i14 : 0;
                zzaoq zzaoqVar = this.zze;
                if (zzaoqVar.zzb(i13, i15)) {
                    zzagh zzaghVar = this.zzj;
                    int i16 = zzaoqVar.zzb;
                    String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = Arrays.copyOf(zzaoqVar.zzc, zzaoqVar.zza);
                    zzeq zzeqVar = new zzeq(bArrCopyOf, bArrCopyOf.length);
                    zzeqVar.zzo(i16);
                    zzeqVar.zzo(4);
                    zzeqVar.zzg();
                    zzeqVar.zzh(8);
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(4);
                        zzeqVar.zzh(i11);
                    }
                    int iZzj = zzeqVar.zzj(4);
                    float f10 = 1.0f;
                    if (iZzj == 15) {
                        int iZzj2 = zzeqVar.zzj(8);
                        int iZzj3 = zzeqVar.zzj(8);
                        if (iZzj3 == 0) {
                            zzee.zzc("H263Reader", "Invalid aspect ratio");
                        } else {
                            f10 = iZzj2 / iZzj3;
                        }
                    } else if (iZzj < 7) {
                        f10 = zza[iZzj];
                    } else {
                        zzee.zzc("H263Reader", "Invalid aspect ratio");
                    }
                    float f11 = f10;
                    if (zzeqVar.zzi()) {
                        zzeqVar.zzh(2);
                        zzeqVar.zzh(1);
                        if (zzeqVar.zzi()) {
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                            zzeqVar.zzh(3);
                            zzeqVar.zzh(11);
                            zzeqVar.zzg();
                            zzeqVar.zzh(15);
                            zzeqVar.zzg();
                        }
                    }
                    if (zzeqVar.zzj(2) != 0) {
                        zzee.zzc("H263Reader", "Unhandled video object layer shape");
                    }
                    zzeqVar.zzg();
                    int iZzj4 = zzeqVar.zzj(16);
                    zzeqVar.zzg();
                    if (zzeqVar.zzi()) {
                        if (iZzj4 == 0) {
                            zzee.zzc("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i17 = iZzj4 - 1;
                            int i18 = 0;
                            while (i17 > 0) {
                                i17 >>= 1;
                                i18++;
                            }
                            zzeqVar.zzh(i18);
                        }
                    }
                    zzeqVar.zzg();
                    int iZzj5 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    int iZzj6 = zzeqVar.zzj(13);
                    zzeqVar.zzg();
                    zzeqVar.zzg();
                    zzt zztVar = new zzt();
                    zztVar.zza(str);
                    zztVar.zzl("video/mp2t");
                    zztVar.zzm("video/mp4v-es");
                    zztVar.zzt(iZzj5);
                    zztVar.zzu(iZzj6);
                    zztVar.zzz(f11);
                    zztVar.zzp(Collections.singletonList(bArrCopyOf));
                    zzaghVar.zzz(zztVar.zzM());
                    this.zzk = true;
                }
            }
            this.zzg.zzc(bArrZzi, iZzg, iZzi);
            zzape zzapeVar = this.zzf;
            if (i14 > 0) {
                zzapeVar.zzd(bArrZzi, iZzg, iZzi);
                i10 = 0;
            } else {
                i10 = -i14;
            }
            if (zzapeVar.zze(i10)) {
                int iZza = zzgm.zza(zzapeVar.zza, zzapeVar.zzb);
                zzer zzerVar2 = this.zzc;
                String str2 = zzfj.zza;
                zzerVar2.zzb(zzapeVar.zza, iZza);
                this.zzb.zzb(this.zzl, zzerVar2);
            }
            if (i13 == 178) {
                if (zzerVar.zzi()[iZzi + 2] == 1) {
                    zzapeVar.zzc(178);
                }
                i13 = 178;
            }
            int i19 = iZze - iZzi;
            this.zzg.zzd(this.zzh - ((long) i19), i19, this.zzk);
            this.zzg.zzb(i13, this.zzl);
            iZzg = i12;
            i11 = 3;
        }
        if (!this.zzk) {
            this.zze.zzc(bArrZzi, iZzg, iZze);
        }
        this.zzg.zzc(bArrZzi, iZzg, iZze);
        this.zzf.zzd(bArrZzi, iZzg, iZze);
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
        zzaor zzaorVar = this.zzg;
        zzaorVar.getClass();
        if (z10) {
            zzaorVar.zzd(this.zzh, 0, this.zzk);
            this.zzg.zza();
        }
    }
}
