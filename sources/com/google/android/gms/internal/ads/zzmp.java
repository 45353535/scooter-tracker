package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.Objects;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
final class zzmp {
    private final zzml zza;
    private final int zzb;

    @Nullable
    private final zzml zzc;
    private int zzd = 0;
    private boolean zze = false;
    private boolean zzf = false;

    public zzmp(zzml zzmlVar, @Nullable zzml zzmlVar2, int i10) {
        this.zza = zzmlVar;
        this.zzb = i10;
        this.zzc = zzmlVar2;
    }

    private final boolean zzN() {
        int i10 = this.zzd;
        return i10 == 2 || i10 == 4;
    }

    private final boolean zzO() {
        return this.zzd == 3;
    }

    private final boolean zzP(zzln zzlnVar, @Nullable zzml zzmlVar) {
        if (zzmlVar == null) {
            return true;
        }
        zzyc[] zzycVarArr = zzlnVar.zzc;
        int i10 = this.zzb;
        zzyc zzycVar = zzycVarArr[i10];
        if (zzmlVar.zzcV() != null) {
            if (zzmlVar.zzcV() == zzycVar) {
                if (zzycVar != null && !zzmlVar.zzcW()) {
                    zzlnVar.zzp();
                    boolean z10 = zzlnVar.zzg.zzg;
                }
            }
            zzln zzlnVarZzp = zzlnVar.zzp();
            return zzlnVarZzp != null && zzlnVarZzp.zzc[i10] == zzmlVar.zzcV();
        }
        return true;
    }

    private final void zzQ(boolean z10) throws zziw {
        if (z10) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzx(17, this.zza);
        } else {
            zzml zzmlVar2 = this.zza;
            zzml zzmlVar3 = this.zzc;
            zzmlVar3.getClass();
            zzmlVar2.zzx(17, zzmlVar3);
        }
    }

    private final void zzR(zzml zzmlVar, zzyc zzycVar, zziu zziuVar, long j10, boolean z10) throws zziw {
        if (zzW(zzmlVar)) {
            if (zzycVar != zzmlVar.zzcV()) {
                zzS(zzmlVar, zziuVar);
            } else if (z10) {
                zzmlVar.zzp(j10, true);
            }
        }
    }

    private final void zzS(zzml zzmlVar, zziu zziuVar) {
        boolean z10 = true;
        if (this.zza != zzmlVar && this.zzc != zzmlVar) {
            z10 = false;
        }
        zzgrc.zzi(z10);
        if (zzW(zzmlVar)) {
            zziuVar.zze(zzmlVar);
            zzY(zzmlVar);
            zzmlVar.zzr();
        }
    }

    private final void zzT(boolean z10) {
        if (z10) {
            if (this.zze) {
                this.zza.zzs();
                this.zze = false;
                return;
            }
            return;
        }
        if (this.zzf) {
            zzml zzmlVar = this.zzc;
            zzmlVar.getClass();
            zzmlVar.zzs();
            this.zzf = false;
        }
    }

    private final int zzU(@Nullable zzml zzmlVar, zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        if (zzmlVar != null && zzW(zzmlVar)) {
            zzml zzmlVar2 = this.zza;
            boolean z10 = zzmlVar != zzmlVar2;
            if ((zzmlVar != zzmlVar2 || !zzN()) && (zzmlVar != this.zzc || !zzO())) {
                zzyc zzycVarZzcV = zzmlVar.zzcV();
                zzyc[] zzycVarArr = zzlnVar.zzc;
                int i10 = this.zzb;
                zzyc zzycVar = zzycVarArr[i10];
                boolean zZza = zzaakVar.zza(i10);
                if (zZza && zzycVarZzcV == zzycVar) {
                    return 1;
                }
                if (!zzmlVar.zzm()) {
                    zzv[] zzvVarArrZzV = zzV(zzaakVar.zzc[i10]);
                    zzyc zzycVar2 = zzycVarArr[i10];
                    zzycVar2.getClass();
                    zzmlVar.zzcU(zzvVarArrZzV, zzycVar2, zzlnVar.zzc(), zzlnVar.zza(), zzlnVar.zzg.zza);
                    return 3;
                }
                if (!zzmlVar.zzZ()) {
                    return 0;
                }
                zzS(zzmlVar, zziuVar);
                if (!zZza || zzc()) {
                    zzT(!z10);
                }
                return 1;
            }
        }
        return 1;
    }

    private static zzv[] zzV(@Nullable zzaac zzaacVar) {
        int iZze = zzaacVar != null ? zzaacVar.zze() : 0;
        zzv[] zzvVarArr = new zzv[iZze];
        for (int i10 = 0; i10 < iZze; i10++) {
            zzaacVar.getClass();
            zzvVarArr[i10] = zzaacVar.zzb(i10);
        }
        return zzvVarArr;
    }

    private static boolean zzW(zzml zzmlVar) {
        return zzmlVar.zze() != 0;
    }

    @Nullable
    private final zzml zzX(@Nullable zzln zzlnVar) {
        if (zzlnVar != null) {
            int i10 = this.zzb;
            zzyc[] zzycVarArr = zzlnVar.zzc;
            if (zzycVarArr[i10] != null) {
                zzml zzmlVar = this.zza;
                zzyc zzycVarZzcV = zzmlVar.zzcV();
                zzyc zzycVar = zzycVarArr[i10];
                if (zzycVarZzcV == zzycVar) {
                    return zzmlVar;
                }
                zzml zzmlVar2 = this.zzc;
                if (zzmlVar2 != null && zzmlVar2.zzcV() == zzycVar) {
                    return zzmlVar2;
                }
            }
        }
        return null;
    }

    private static final void zzY(zzml zzmlVar) {
        if (zzmlVar.zze() == 2) {
            zzmlVar.zzq();
        }
    }

    private static final void zzZ(zzml zzmlVar, long j10) {
        zzmlVar.zzl();
        if (zzmlVar instanceof zzyr) {
            throw null;
        }
    }

    public final void zzA(zziu zziuVar) throws zziw {
        zzS(this.zza, zziuVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            boolean z10 = zzW(zzmlVar) && this.zzd != 3;
            zzS(zzmlVar, zziuVar);
            zzT(false);
            if (z10) {
                zzQ(true);
            }
        }
        this.zzd = 0;
    }

    public final void zzB() throws zziw {
        int i10 = this.zzd;
        if (i10 == 3 || i10 == 4) {
            zzQ(i10 == 4);
            this.zzd = this.zzd != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.zzd = 0;
        }
    }

    public final void zzC(zziu zziuVar) {
        boolean z10;
        zzml zzmlVar;
        if (zzc()) {
            int i10 = this.zzd;
            if (i10 == 4) {
                z10 = true;
            } else if (i10 == 2) {
                i10 = 2;
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                zzmlVar = this.zza;
            } else {
                zzmlVar = this.zzc;
                zzmlVar.getClass();
            }
            zzS(zzmlVar, zziuVar);
            zzT(z10);
            this.zzd = i10 == 4 ? 1 : 0;
        }
    }

    public final void zzD(zzyc zzycVar, zziu zziuVar, long j10, boolean z10) throws zziw {
        zzR(this.zza, zzycVar, zziuVar, j10, z10);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzR(zzmlVar, zzycVar, zziuVar, j10, z10);
        }
    }

    public final void zzE(zzln zzlnVar, long j10, boolean z10) throws zziw {
        zzml zzmlVarZzX = zzX(zzlnVar);
        if (zzmlVarZzX != null) {
            zzmlVarZzX.zzp(j10, z10);
        }
    }

    public final boolean zzF(zzln zzlnVar, long j10) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        return zzmlVarZzX != null && zzmlVarZzX.zzU(j10);
    }

    public final void zzG() {
        if (!zzW(this.zza)) {
            zzT(true);
        }
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || zzW(zzmlVar)) {
            return;
        }
        zzT(false);
    }

    public final int zzH(zzln zzlnVar, zzaak zzaakVar, zziu zziuVar) throws zziw {
        int iZzU = zzU(this.zza, zzlnVar, zzaakVar, zziuVar);
        return iZzU == 1 ? zzU(this.zzc, zzlnVar, zzaakVar, zziuVar) : iZzU;
    }

    public final void zzI() {
        this.zza.zzt();
        this.zze = false;
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzt();
            this.zzf = false;
        }
    }

    public final void zzJ(@Nullable Object obj) throws zziw {
        if (zze() != 2) {
            return;
        }
        int i10 = this.zzd;
        if (i10 != 4 && i10 != 1) {
            this.zza.zzx(1, obj);
            return;
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        zzmlVar.zzx(1, obj);
    }

    public final void zzK(zzacp zzacpVar) throws zziw {
        if (zze() != 2) {
            zze();
            return;
        }
        this.zza.zzx(7, zzacpVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(7, zzacpVar);
        }
    }

    public final void zzL(float f10) throws zziw {
        if (zze() != 1) {
            return;
        }
        zzml zzmlVar = this.zza;
        Float fValueOf = Float.valueOf(f10);
        zzmlVar.zzx(2, fValueOf);
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 != null) {
            zzmlVar2.zzx(2, fValueOf);
        }
    }

    public final boolean zzM() {
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            return zzW(this.zza);
        }
        zzml zzmlVar = this.zzc;
        zzmlVar.getClass();
        return zzW(zzmlVar);
    }

    public final boolean zza() {
        return this.zzc != null;
    }

    public final void zzb() {
        int i10;
        zzgrc.zzi(!zzc());
        if (zzW(this.zza)) {
            i10 = 3;
        } else {
            zzml zzmlVar = this.zzc;
            i10 = (zzmlVar == null || !zzW(zzmlVar)) ? 2 : 4;
        }
        this.zzd = i10;
    }

    public final boolean zzc() {
        return zzN() || zzO();
    }

    public final int zzd() {
        zzml zzmlVar = this.zzc;
        boolean zZzW = zzW(this.zza);
        int i10 = 0;
        if (zzmlVar != null && zzW(zzmlVar)) {
            i10 = 1;
        }
        return (zZzW ? 1 : 0) + i10;
    }

    public final int zze() {
        return this.zza.zza();
    }

    public final long zzf(@Nullable zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        Objects.requireNonNull(zzmlVarZzX);
        return zzmlVarZzX.zzk();
    }

    public final boolean zzg(zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        return zzmlVarZzX.zzcW();
    }

    public final void zzh(zzln zzlnVar, long j10) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzZ(zzmlVarZzX, j10);
    }

    public final void zzi(zzaak zzaakVar, zzaak zzaakVar2, long j10) {
        int i10;
        int i11 = this.zzb;
        boolean zZza = zzaakVar.zza(i11);
        boolean zZza2 = zzaakVar2.zza(i11);
        zzml zzmlVar = this.zzc;
        if (zzmlVar == null || (i10 = this.zzd) == 3 || (i10 == 0 && zzW(this.zza))) {
            zzmlVar = this.zza;
        }
        if (!zZza || zzmlVar.zzm()) {
            return;
        }
        zze();
        zzmo zzmoVar = zzaakVar.zzb[i11];
        zzmo zzmoVar2 = zzaakVar2.zzb[i11];
        if (zZza2 && Objects.equals(zzmoVar2, zzmoVar) && !zzc()) {
            return;
        }
        zzZ(zzmlVar, j10);
    }

    public final void zzj(long j10) {
        int i10;
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar) && (i10 = this.zzd) != 4 && i10 != 2) {
            zzZ(zzmlVar, j10);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2) || this.zzd == 3) {
            return;
        }
        zzZ(zzmlVar2, j10);
    }

    public final long zzk(long j10, long j11) {
        zzml zzmlVar = this.zza;
        long jZzT = zzW(zzmlVar) ? zzmlVar.zzT(j10, j11) : Long.MAX_VALUE;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? jZzT : Math.min(jZzT, zzmlVar2.zzT(j10, j11));
    }

    public final void zzl() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzW();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzW();
    }

    public final void zzm(float f10, float f11) throws zziw {
        this.zza.zzV(f10, f11);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzV(f10, f11);
        }
    }

    public final void zzn(zzbf zzbfVar) {
        this.zza.zzo(zzbfVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzo(zzbfVar);
        }
    }

    public final boolean zzo() {
        zzml zzmlVar = this.zza;
        boolean zZzZ = zzW(zzmlVar) ? zzmlVar.zzZ() : true;
        zzml zzmlVar2 = this.zzc;
        return (zzmlVar2 == null || !zzW(zzmlVar2)) ? zZzZ : zZzZ & zzmlVar2.zzZ();
    }

    public final boolean zzp(@Nullable zzln zzlnVar) {
        return zzX(zzlnVar) != null;
    }

    public final boolean zzq(zzln zzlnVar) {
        return (zzN() && zzX(zzlnVar) == this.zza) || (zzO() && zzX(zzlnVar) == this.zzc);
    }

    public final boolean zzr(zzln zzlnVar) {
        return zzP(zzlnVar, this.zza) && zzP(zzlnVar, this.zzc);
    }

    public final void zzs(long j10, long j11) throws zziw {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzmlVar.zzX(j10, j11);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzmlVar2.zzX(j10, j11);
    }

    public final boolean zzt(zzln zzlnVar) {
        zzml zzmlVarZzX = zzX(zzlnVar);
        return zzmlVarZzX == null || zzmlVarZzX.zzcW() || zzmlVarZzX.zzY() || zzmlVarZzX.zzZ();
    }

    public final void zzu(zzln zzlnVar) throws IOException {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzmlVarZzX.zzn();
    }

    public final void zzv() throws zziw {
        zzml zzmlVar = this.zza;
        if (zzmlVar.zze() == 1 && this.zzd != 4) {
            zzmlVar.zzcT();
            return;
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || zzmlVar2.zze() != 1 || this.zzd == 3) {
            return;
        }
        zzmlVar2.zzcT();
    }

    public final void zzw() {
        zzml zzmlVar = this.zza;
        if (zzW(zzmlVar)) {
            zzY(zzmlVar);
        }
        zzml zzmlVar2 = this.zzc;
        if (zzmlVar2 == null || !zzW(zzmlVar2)) {
            return;
        }
        zzY(zzmlVar2);
    }

    public final void zzx(zzmo zzmoVar, zzaac zzaacVar, zzyc zzycVar, long j10, boolean z10, boolean z11, long j11, long j12, zzwk zzwkVar, zziu zziuVar) throws zziw {
        zzv[] zzvVarArrZzV = zzV(zzaacVar);
        int i10 = this.zzd;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.zze = true;
            zzml zzmlVar = this.zza;
            zzmlVar.zzf(zzmoVar, zzvVarArrZzV, zzycVar, j10, z10, z11, j11, j12, zzwkVar);
            zziuVar.zzd(zzmlVar);
            return;
        }
        this.zzf = true;
        zzml zzmlVar2 = this.zzc;
        zzmlVar2.getClass();
        zzmlVar2.zzf(zzmoVar, zzvVarArrZzV, zzycVar, j10, z10, z11, j11, j12, zzwkVar);
        zziuVar.zzd(zzmlVar2);
    }

    public final void zzy(int i10, @Nullable Object obj, zzln zzlnVar) throws zziw {
        zzml zzmlVarZzX = zzX(zzlnVar);
        zzmlVarZzX.getClass();
        zzmlVarZzX.zzx(11, obj);
    }

    public final void zzz(@Nullable zzms zzmsVar) throws zziw {
        this.zza.zzx(18, zzmsVar);
        zzml zzmlVar = this.zzc;
        if (zzmlVar != null) {
            zzmlVar.zzx(18, zzmsVar);
        }
    }
}
