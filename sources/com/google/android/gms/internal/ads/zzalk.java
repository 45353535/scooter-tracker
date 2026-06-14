package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import com.google.common.base.Ascii;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzalk extends zzalt {

    @Nullable
    private zzafh zza;

    @Nullable
    private zzalj zzb;

    zzalk() {
    }

    private static boolean zzd(byte[] bArr) {
        return bArr[0] == -1;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zza = null;
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        if (!zzd(zzerVar.zzi())) {
            return -1L;
        }
        int i10 = (zzerVar.zzi()[2] & 255) >> 4;
        if (i10 == 6) {
            zzerVar.zzk(4);
            zzerVar.zzO();
        } else if (i10 == 7) {
            i10 = 7;
            zzerVar.zzk(4);
            zzerVar.zzO();
        }
        int iZzc = zzafc.zzc(zzerVar, i10);
        zzerVar.zzh(0);
        return iZzc;
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) {
        byte[] bArrZzi = zzerVar.zzi();
        zzafh zzafhVar = this.zza;
        if (zzafhVar == null) {
            zzafh zzafhVar2 = new zzafh(bArrZzi, 17);
            this.zza = zzafhVar2;
            zzt zztVarZza = zzafhVar2.zzc(Arrays.copyOfRange(bArrZzi, 9, zzerVar.zze()), null).zza();
            zztVarZza.zzl("audio/ogg");
            zzalrVar.zza = zztVarZza.zzM();
            return true;
        }
        if ((bArrZzi[0] & Ascii.DEL) == 3) {
            zzafg zzafgVarZzc = zzafe.zzc(zzerVar);
            zzafh zzafhVarZze = zzafhVar.zze(zzafgVarZzc);
            this.zza = zzafhVarZze;
            this.zzb = new zzalj(zzafhVarZze, zzafgVarZzc);
            return true;
        }
        if (!zzd(bArrZzi)) {
            return true;
        }
        zzalj zzaljVar = this.zzb;
        if (zzaljVar != null) {
            zzaljVar.zzd(j10);
            zzalrVar.zzb = this.zzb;
        }
        zzalrVar.zza.getClass();
        return false;
    }
}
