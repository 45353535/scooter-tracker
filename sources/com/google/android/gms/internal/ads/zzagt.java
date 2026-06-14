package com.google.android.gms.internal.ads;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzagt implements zzaeu {
    private final zzer zza;
    private final zzags zzb;
    private final boolean zzc;
    private final zzamd zzd;
    private int zze;
    private zzaex zzf;
    private zzagu zzg;
    private long zzh;
    private zzagw[] zzi;
    private long zzj;

    @Nullable
    private zzagw zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzagt() {
        this(1, zzamd.zza);
    }

    @Nullable
    private final zzagw zzi(int i10) {
        for (zzagw zzagwVar : this.zzi) {
            if (zzagwVar.zzc(i10)) {
                return zzagwVar;
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        zzer zzerVar = this.zza;
        zzaevVar.zzi(zzerVar.zzi(), 0, 12);
        zzerVar.zzh(0);
        if (zzerVar.zzC() != 1179011410) {
            return false;
        }
        zzerVar.zzk(4);
        return zzerVar.zzC() == 541677121;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zze = 0;
        if (this.zzc) {
            zzaexVar = new zzamg(zzaexVar, this.zzd);
        }
        this.zzf = zzaexVar;
        this.zzj = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzaeu
    public final int zzd(zzaev zzaevVar, zzafv zzafvVar) throws IOException {
        boolean z10;
        int i10;
        long j10;
        long j11 = this.zzj;
        if (j11 != -1) {
            long jZzn = zzaevVar.zzn();
            if (j11 < jZzn || j11 > PlaybackStateCompat.ACTION_SET_REPEAT_MODE + jZzn) {
                zzafvVar.zza = j11;
                z10 = true;
            } else {
                zzaevVar.zzf((int) (j11 - jZzn));
                z10 = false;
            }
        } else {
            z10 = false;
        }
        this.zzj = -1L;
        if (z10) {
            return 1;
        }
        int i11 = this.zze;
        zzagw zzagwVar = null;
        if (i11 == 0) {
            if (!zza(zzaevVar)) {
                throw zzat.zzb("AVI Header List not found", null);
            }
            zzaevVar.zzf(12);
            this.zze = 1;
            return 0;
        }
        if (i11 == 1) {
            zzer zzerVar = this.zza;
            zzaevVar.zzc(zzerVar.zzi(), 0, 12);
            zzerVar.zzh(0);
            zzags zzagsVar = this.zzb;
            zzagsVar.zza(zzerVar);
            int i12 = zzagsVar.zza;
            if (i12 != 1414744396) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i12).length() + 22);
                sb2.append("LIST expected, found: ");
                sb2.append(i12);
                throw zzat.zzb(sb2.toString(), null);
            }
            int iZzC = zzerVar.zzC();
            if (iZzC == 1819436136) {
                this.zzl = zzagsVar.zzb;
                this.zze = 2;
                return 0;
            }
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzC).length() + 22);
            sb3.append("hdrl expected, found: ");
            sb3.append(iZzC);
            throw zzat.zzb(sb3.toString(), null);
        }
        if (i11 == 2) {
            int i13 = this.zzl - 4;
            zzer zzerVar2 = new zzer(i13);
            zzaevVar.zzc(zzerVar2.zzi(), 0, i13);
            zzagx zzagxVarZzb = zzagx.zzb(1819436136, zzerVar2);
            if (zzagxVarZzb.zza() != 1819436136) {
                int iZza = zzagxVarZzb.zza();
                StringBuilder sb4 = new StringBuilder(String.valueOf(iZza).length() + 28);
                sb4.append("Unexpected header list type ");
                sb4.append(iZza);
                throw zzat.zzb(sb4.toString(), null);
            }
            zzagu zzaguVar = (zzagu) zzagxVarZzb.zzc(zzagu.class);
            if (zzaguVar == null) {
                throw zzat.zzb("AviHeader not found", null);
            }
            this.zzg = zzaguVar;
            this.zzh = ((long) zzaguVar.zzc) * ((long) zzaguVar.zza);
            ArrayList arrayList = new ArrayList();
            zzguf zzgufVar = zzagxVarZzb.zza;
            int size = zzgufVar.size();
            int i14 = 0;
            int i15 = 0;
            while (i14 < size) {
                zzagq zzagqVar = (zzagq) zzgufVar.get(i14);
                if (zzagqVar.zza() == 1819440243) {
                    zzagx zzagxVar = (zzagx) zzagqVar;
                    int i16 = i15 + 1;
                    zzagv zzagvVar = (zzagv) zzagxVar.zzc(zzagv.class);
                    zzagy zzagyVar = (zzagy) zzagxVar.zzc(zzagy.class);
                    if (zzagvVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Header");
                    } else if (zzagyVar == null) {
                        zzee.zzc("AviExtractor", "Missing Stream Format");
                    } else {
                        long jZzd = zzagvVar.zzd();
                        zzv zzvVar = zzagyVar.zza;
                        zzt zztVarZza = zzvVar.zza();
                        zztVarZza.zzb(i15);
                        int i17 = zzagvVar.zze;
                        if (i17 != 0) {
                            zztVarZza.zzn(i17);
                        }
                        zzagz zzagzVar = (zzagz) zzagxVar.zzc(zzagz.class);
                        if (zzagzVar != null) {
                            zztVarZza.zzc(zzagzVar.zza);
                        }
                        int iZzf = zzas.zzf(zzvVar.zzo);
                        if (iZzf == 1) {
                            zzagh zzaghVarZzu = this.zzf.zzu(i15, iZzf);
                            zzaghVarZzu.zzz(zztVarZza.zzM());
                            zzaghVarZzu.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i15, zzagvVar, zzaghVarZzu);
                        } else if (iZzf == 2) {
                            iZzf = 2;
                            zzagh zzaghVarZzu2 = this.zzf.zzu(i15, iZzf);
                            zzaghVarZzu2.zzz(zztVarZza.zzM());
                            zzaghVarZzu2.zzN(jZzd);
                            this.zzh = Math.max(this.zzh, jZzd);
                            zzagwVar = new zzagw(i15, zzagvVar, zzaghVarZzu2);
                        } else {
                            zzagwVar = null;
                        }
                    }
                    if (zzagwVar != null) {
                        arrayList.add(zzagwVar);
                    }
                    i15 = i16;
                }
                i14++;
                zzagwVar = null;
            }
            this.zzi = (zzagw[]) arrayList.toArray(new zzagw[0]);
            this.zzf.zzv();
            this.zze = 3;
            return 0;
        }
        if (i11 == 3) {
            long j12 = this.zzm;
            if (j12 != -1 && zzaevVar.zzn() != j12) {
                this.zzj = j12;
                return 0;
            }
            zzer zzerVar3 = this.zza;
            zzaevVar.zzi(zzerVar3.zzi(), 0, 12);
            zzaevVar.zzl();
            zzerVar3.zzh(0);
            zzags zzagsVar2 = this.zzb;
            zzagsVar2.zza(zzerVar3);
            int iZzC2 = zzerVar3.zzC();
            int i18 = zzagsVar2.zza;
            if (i18 == 1179011410) {
                zzaevVar.zzf(12);
                return 0;
            }
            if (i18 != 1414744396 || iZzC2 != 1769369453) {
                this.zzj = zzaevVar.zzn() + ((long) zzagsVar2.zzb) + 8;
                return 0;
            }
            long jZzn2 = zzaevVar.zzn();
            this.zzm = jZzn2;
            long j13 = jZzn2 + ((long) zzagsVar2.zzb) + 8;
            this.zzn = j13;
            if (!this.zzp) {
                zzagu zzaguVar2 = this.zzg;
                zzaguVar2.getClass();
                if ((zzaguVar2.zzb & 16) == 16) {
                    this.zze = 4;
                    this.zzj = j13;
                    return 0;
                }
                this.zzf.zzw(new zzafx(this.zzh, 0L));
                this.zzp = true;
            }
            this.zzj = zzaevVar.zzn() + 12;
            this.zze = 6;
            return 0;
        }
        if (i11 == 4) {
            zzer zzerVar4 = this.zza;
            zzaevVar.zzc(zzerVar4.zzi(), 0, 8);
            zzerVar4.zzh(0);
            int iZzC3 = zzerVar4.zzC();
            int iZzC4 = zzerVar4.zzC();
            if (iZzC3 != 829973609) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC4);
                return 0;
            }
            this.zze = 5;
            this.zzo = iZzC4;
            return 0;
        }
        if (i11 != 5) {
            if (zzaevVar.zzn() >= this.zzn) {
                return -1;
            }
            zzagw zzagwVar2 = this.zzk;
            if (zzagwVar2 != null) {
                if (!zzagwVar2.zze(zzaevVar)) {
                    return 0;
                }
                this.zzk = null;
                return 0;
            }
            if ((zzaevVar.zzn() & 1) == 1) {
                zzaevVar.zzf(1);
            }
            zzer zzerVar5 = this.zza;
            zzaevVar.zzi(zzerVar5.zzi(), 0, 12);
            zzerVar5.zzh(0);
            int iZzC5 = zzerVar5.zzC();
            if (iZzC5 == 1414744396) {
                zzerVar5.zzh(8);
                zzaevVar.zzf(zzerVar5.zzC() != 1769369453 ? 8 : 12);
                zzaevVar.zzl();
                return 0;
            }
            int iZzC6 = zzerVar5.zzC();
            if (iZzC5 == 1263424842) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC6) + 8;
                return 0;
            }
            zzaevVar.zzf(8);
            zzaevVar.zzl();
            zzagw zzagwVarZzi = zzi(iZzC5);
            if (zzagwVarZzi == null) {
                this.zzj = zzaevVar.zzn() + ((long) iZzC6);
                return 0;
            }
            zzagwVarZzi.zzd(iZzC6);
            this.zzk = zzagwVarZzi;
            return 0;
        }
        zzer zzerVar6 = new zzer(this.zzo);
        zzaevVar.zzc(zzerVar6.zzi(), 0, this.zzo);
        if (zzerVar6.zzd() < 16) {
            i10 = 0;
            j10 = 0;
        } else {
            int iZzg = zzerVar6.zzg();
            zzerVar6.zzk(8);
            long jZzC = zzerVar6.zzC();
            i10 = 0;
            long j14 = this.zzm;
            j10 = jZzC > j14 ? 0L : j14 + 8;
            zzerVar6.zzh(iZzg);
        }
        while (zzerVar6.zzd() >= 16) {
            int iZzC7 = zzerVar6.zzC();
            int iZzC8 = zzerVar6.zzC();
            long jZzC2 = ((long) zzerVar6.zzC()) + j10;
            zzerVar6.zzk(4);
            zzagw zzagwVarZzi2 = zzi(iZzC7);
            if (zzagwVarZzi2 != null) {
                zzagwVarZzi2.zza(jZzC2, (iZzC8 & 16) == 16 ? 1 : i10);
            }
        }
        zzagw[] zzagwVarArr = this.zzi;
        int length = zzagwVarArr.length;
        for (int i19 = i10; i19 < length; i19++) {
            zzagwVarArr[i19].zzb();
        }
        this.zzp = true;
        if (this.zzi.length == 0) {
            this.zzf.zzw(new zzafx(this.zzh, 0L));
        } else {
            this.zzf.zzw(new zzagr(this, this.zzh));
        }
        this.zze = 6;
        this.zzj = this.zzm;
        return i10;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zze(long j10, long j11) {
        this.zzj = -1L;
        this.zzk = null;
        for (zzagw zzagwVar : this.zzi) {
            zzagwVar.zzf(j10);
        }
        if (j10 == 0) {
            this.zze = this.zzi.length != 0 ? 3 : 0;
        } else {
            this.zze = 6;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }

    final /* synthetic */ zzagw[] zzh() {
        return this.zzi;
    }

    public zzagt(int i10, zzamd zzamdVar) {
        this.zzd = zzamdVar;
        this.zzc = 1 == (i10 ^ 1);
        this.zza = new zzer(12);
        this.zzb = new zzags(null);
        this.zzf = new zzaft();
        this.zzi = new zzagw[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }
}
