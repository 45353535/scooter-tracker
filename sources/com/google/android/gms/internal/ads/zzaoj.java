package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import androidx.core.view.MotionEventCompat;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaoj implements zzaon {
    private static final byte[] zza = {73, 68, 51};
    private final boolean zzb;

    @Nullable
    private final String zze;
    private final int zzf;
    private final String zzg;
    private String zzh;
    private zzagh zzi;
    private zzagh zzj;
    private int zzk;
    private int zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private int zzr;
    private boolean zzs;
    private int zzu;
    private zzagh zzw;
    private long zzx;
    private final zzeq zzc = new zzeq(new byte[7], 7);
    private final zzer zzd = new zzer(Arrays.copyOf(zza, 10));
    private int zzp = -1;
    private int zzq = -1;
    private long zzt = -9223372036854775807L;
    private long zzv = -9223372036854775807L;

    public zzaoj(boolean z10, @Nullable String str, int i10, String str2) {
        this.zzb = z10;
        this.zze = str;
        this.zzf = i10;
        this.zzg = str2;
        zzi();
    }

    public static boolean zzf(int i10) {
        return (i10 & 65526) == 65520;
    }

    private final void zzg() {
        this.zzo = false;
        zzi();
    }

    private final boolean zzh(zzer zzerVar, byte[] bArr, int i10) {
        int iMin = Math.min(zzerVar.zzd(), i10 - this.zzl);
        zzerVar.zzm(bArr, this.zzl, iMin);
        int i11 = this.zzl + iMin;
        this.zzl = i11;
        return i11 == i10;
    }

    private final void zzi() {
        this.zzk = 0;
        this.zzl = 0;
        this.zzm = 256;
    }

    private final void zzj(zzagh zzaghVar, long j10, int i10, int i11) {
        this.zzk = 4;
        this.zzl = i10;
        this.zzw = zzaghVar;
        this.zzx = j10;
        this.zzu = i11;
    }

    private final void zzk() {
        this.zzk = 3;
        this.zzl = 0;
    }

    private static final boolean zzl(byte b10, byte b11) {
        return zzf((b11 & 255) | MotionEventCompat.ACTION_POINTER_INDEX_MASK);
    }

    private static final boolean zzm(zzer zzerVar, byte[] bArr, int i10) {
        if (zzerVar.zzd() < i10) {
            return false;
        }
        zzerVar.zzm(bArr, 0, i10);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zza() {
        this.zzv = -9223372036854775807L;
        zzg();
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzb(zzaex zzaexVar, zzaqb zzaqbVar) {
        zzaqbVar.zza();
        this.zzh = zzaqbVar.zzc();
        zzagh zzaghVarZzu = zzaexVar.zzu(zzaqbVar.zzb(), 1);
        this.zzi = zzaghVarZzu;
        this.zzw = zzaghVarZzu;
        if (!this.zzb) {
            this.zzj = new zzaer();
            return;
        }
        zzaqbVar.zza();
        zzagh zzaghVarZzu2 = zzaexVar.zzu(zzaqbVar.zzb(), 5);
        this.zzj = zzaghVarZzu2;
        zzt zztVar = new zzt();
        zztVar.zza(zzaqbVar.zzc());
        zztVar.zzl(this.zzg);
        zztVar.zzm("application/id3");
        zzaghVarZzu2.zzz(zztVar.zzM());
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zzc(long j10, int i10) {
        this.zzv = j10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0260, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0261, code lost:
    
        r20.zzn = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0265, code lost:
    
        if (r20.zzo != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0267, code lost:
    
        r20.zzk = 1;
        r20.zzl = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x026d, code lost:
    
        zzk();
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0270, code lost:
    
        r21.zzh(r13);
        r9 = r19;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01ec, code lost:
    
        r19 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0253, code lost:
    
        r20.zzr = (r14 & 8) >> 3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x025c, code lost:
    
        if (1 == ((r14 & 1) ^ 1)) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x025e, code lost:
    
        r1 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01ce  */
    @Override // com.google.android.gms.internal.ads.zzaon
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(com.google.android.gms.internal.ads.zzer r21) throws com.google.android.gms.internal.ads.zzat {
        /*
            Method dump skipped, instruction units count: 743
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzd(com.google.android.gms.internal.ads.zzer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaon
    public final void zze(boolean z10) {
    }
}
