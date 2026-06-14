package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
final class zzalq extends zzalt {
    private static final byte[] zza = {79, 112, 117, 115, 72, 101, 97, 100};
    private static final byte[] zzb = {79, 112, 117, 115, 84, 97, 103, 115};
    private boolean zzc;

    zzalq() {
    }

    public static boolean zzd(zzer zzerVar) {
        return zzk(zzerVar, zza);
    }

    private static boolean zzk(zzer zzerVar, byte[] bArr) {
        if (zzerVar.zzd() < 8) {
            return false;
        }
        int iZzg = zzerVar.zzg();
        byte[] bArr2 = new byte[8];
        zzerVar.zzm(bArr2, 0, 8);
        zzerVar.zzh(iZzg);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final void zza(boolean z10) {
        super.zza(z10);
        if (z10) {
            this.zzc = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final long zzb(zzer zzerVar) {
        return zzi(zzafu.zzd(zzerVar.zzi()));
    }

    @Override // com.google.android.gms.internal.ads.zzalt
    protected final boolean zzc(zzer zzerVar, long j10, zzalr zzalrVar) throws zzat {
        if (zzk(zzerVar, zza)) {
            byte[] bArrCopyOf = Arrays.copyOf(zzerVar.zzi(), zzerVar.zze());
            int i10 = bArrCopyOf[9] & 255;
            List listZza = zzafu.zza(bArrCopyOf);
            if (zzalrVar.zza != null) {
                return true;
            }
            zzt zztVar = new zzt();
            zztVar.zzl("audio/ogg");
            zztVar.zzm("audio/opus");
            zztVar.zzE(i10);
            zztVar.zzF(48000);
            zztVar.zzp(listZza);
            zzalrVar.zza = zztVar.zzM();
            return true;
        }
        if (!zzk(zzerVar, zzb)) {
            zzalrVar.zza.getClass();
            return false;
        }
        zzalrVar.zza.getClass();
        if (this.zzc) {
            return true;
        }
        this.zzc = true;
        zzerVar.zzk(8);
        zzap zzapVarZzc = zzagn.zzc(zzguf.zzr(zzagn.zzb(zzerVar, false, false).zza));
        if (zzapVarZzc == null) {
            return true;
        }
        zzt zztVarZza = zzalrVar.zza.zza();
        zztVarZza.zzk(zzapVarZzc.zzf(zzalrVar.zza.zzl));
        zzalrVar.zza = zztVarZza.zzM();
        return true;
    }
}
