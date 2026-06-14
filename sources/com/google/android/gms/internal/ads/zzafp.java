package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzafp {
    private final zzer zza = new zzer(10);

    private final boolean zzb(zzaev zzaevVar, int i10) throws IOException {
        int i11;
        int i12 = 0;
        do {
            int i13 = i12 % 10;
            if (i13 == 0) {
                if (i12 != 0) {
                    zzer zzerVar = this.zza;
                    System.arraycopy(zzerVar.zzi(), 10, zzerVar.zzi(), 0, 9);
                }
                i11 = 0;
            } else {
                i11 = i13;
            }
            int i14 = i12 != 0 ? 1 : 10;
            try {
                zzer zzerVar2 = this.zza;
                int i15 = i13 + 10;
                zzaevVar.zzi(zzerVar2.zzi(), i15 - i14, i14);
                zzerVar2.zzh(i11);
                zzerVar2.zzf(i15);
                if (zzerVar2.zzq() == 4801587) {
                    return true;
                }
                if (zzafs.zza(zzerVar2.zzr()) != -1) {
                    return false;
                }
                if (i12 == 0) {
                    zzerVar2.zzc(20);
                }
                i12++;
            } catch (EOFException unused) {
            }
        } while (i12 <= i10);
        return false;
    }

    @Nullable
    public final zzap zza(zzaev zzaevVar, @Nullable zzaij zzaijVar, int i10) throws IOException {
        zzap zzapVarZza = null;
        int i11 = 0;
        while (zzb(zzaevVar, i10)) {
            zzer zzerVar = this.zza;
            int iZzg = zzerVar.zzg();
            zzerVar.zzk(6);
            int iZzG = zzerVar.zzG();
            int i12 = iZzG + 10;
            if (zzapVarZza == null) {
                byte[] bArr = new byte[i12];
                System.arraycopy(zzerVar.zzi(), iZzg, bArr, 0, 10);
                zzaevVar.zzi(bArr, 10, iZzG);
                zzapVarZza = zzaim.zza(bArr, i12, zzaijVar, new zzahw());
            } else {
                zzaevVar.zzk(iZzG);
            }
            i11 += i12;
        }
        zzaevVar.zzl();
        zzaevVar.zzk(i11);
        return zzapVarZza;
    }
}
