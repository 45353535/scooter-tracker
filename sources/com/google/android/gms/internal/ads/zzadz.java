package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzadz {
    public final List zza;
    public final int zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final int zzf;
    public final int zzg;
    public final int zzh;
    public final int zzi;
    public final int zzj;
    public final float zzk;

    @Nullable
    public final String zzl;

    private zzadz(List list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, float f10, @Nullable String str) {
        this.zza = list;
        this.zzb = i10;
        this.zzc = i11;
        this.zzd = i12;
        this.zze = i13;
        this.zzf = i14;
        this.zzg = i15;
        this.zzh = i16;
        this.zzi = i17;
        this.zzj = i18;
        this.zzk = f10;
        this.zzl = str;
    }

    public static zzadz zza(zzer zzerVar) throws zzat {
        String strZza;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float f10;
        int i16;
        int i17;
        try {
            zzerVar.zzk(4);
            int iZzs = (zzerVar.zzs() & 3) + 1;
            if (iZzs == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int iZzs2 = zzerVar.zzs() & 31;
            for (int i18 = 0; i18 < iZzs2; i18++) {
                arrayList.add(zzb(zzerVar));
            }
            int iZzs3 = zzerVar.zzs();
            for (int i19 = 0; i19 < iZzs3; i19++) {
                arrayList.add(zzb(zzerVar));
            }
            if (iZzs2 > 0) {
                byte[] bArr = (byte[]) arrayList.get(0);
                byte[] bArr2 = (byte[]) arrayList.get(0);
                byte[] bArr3 = zzgm.zza;
                zzgl zzglVarZze = zzgm.zze(bArr2, 5, bArr.length);
                int i20 = zzglVarZze.zze;
                int i21 = zzglVarZze.zzf;
                int i22 = zzglVarZze.zzh + 8;
                int i23 = zzglVarZze.zzi + 8;
                int i24 = zzglVarZze.zzj;
                int i25 = zzglVarZze.zzk;
                int i26 = zzglVarZze.zzl;
                int i27 = zzglVarZze.zzm;
                float f11 = zzglVarZze.zzg;
                strZza = zzdo.zza(zzglVarZze.zza, zzglVarZze.zzb, zzglVarZze.zzc);
                i14 = i26;
                i15 = i27;
                f10 = f11;
                i13 = i23;
                i16 = i24;
                i17 = i25;
                i10 = i20;
                i11 = i21;
                i12 = i22;
            } else {
                strZza = null;
                i10 = -1;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = 16;
                f10 = 1.0f;
                i16 = -1;
                i17 = -1;
            }
            return new zzadz(arrayList, iZzs, i10, i11, i12, i13, i16, i17, i14, i15, f10, strZza);
        } catch (ArrayIndexOutOfBoundsException e10) {
            throw zzat.zzb("Error parsing AVC config", e10);
        }
    }

    private static byte[] zzb(zzer zzerVar) {
        int iZzt = zzerVar.zzt();
        int iZzg = zzerVar.zzg();
        zzerVar.zzk(iZzt);
        return zzdo.zzf(zzerVar.zzi(), iZzg, iZzt);
    }
}
