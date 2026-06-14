package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class zzapm implements zzaeu {
    private boolean zze;
    private boolean zzf;
    private boolean zzg;
    private long zzh;

    @Nullable
    private zzapi zzi;
    private zzaex zzj;
    private boolean zzk;
    private final zzfg zza = new zzfg(0);
    private final zzer zzc = new zzer(4096);
    private final SparseArray zzb = new SparseArray();
    private final zzapj zzd = new zzapj();

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zza(zzaev zzaevVar) throws IOException {
        byte[] bArr = new byte[14];
        zzael zzaelVar = (zzael) zzaevVar;
        zzaelVar.zzh(bArr, 0, 14, false);
        if ((((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) != 442 || (bArr[4] & 196) != 68 || (bArr[6] & 4) != 4 || (bArr[8] & 4) != 4 || (bArr[9] & 1) != 1 || (bArr[12] & 3) != 3) {
            return false;
        }
        zzaelVar.zzj(bArr[13] & 7, false);
        zzaelVar.zzh(bArr, 0, 3, false);
        return ((((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8)) | (bArr[2] & 255)) == 1;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ List zzb() {
        return k.a(this);
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzc(zzaex zzaexVar) {
        this.zzj = zzaexVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:64:0x0130  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int zzd(com.google.android.gms.internal.ads.zzaev r14, com.google.android.gms.internal.ads.zzafv r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapm.zzd(com.google.android.gms.internal.ads.zzaev, com.google.android.gms.internal.ads.zzafv):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zze(long r5, long r7) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzfg r5 = r4.zza
            long r0 = r5.zzc()
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L21
            long r0 = r5.zza()
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 == 0) goto L24
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 == 0) goto L24
        L21:
            r5.zzd(r7)
        L24:
            com.google.android.gms.internal.ads.zzapi r5 = r4.zzi
            r6 = 0
            if (r5 == 0) goto L2c
            r5.zzb(r7)
        L2c:
            android.util.SparseArray r5 = r4.zzb
            int r7 = r5.size()
            if (r6 >= r7) goto L40
            java.lang.Object r5 = r5.valueAt(r6)
            com.google.android.gms.internal.ads.zzapk r5 = (com.google.android.gms.internal.ads.zzapk) r5
            r5.zza()
            int r6 = r6 + 1
            goto L2c
        L40:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapm.zze(long, long):void");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final void zzf() {
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public /* synthetic */ zzaeu zzg() {
        return k.b(this);
    }
}
