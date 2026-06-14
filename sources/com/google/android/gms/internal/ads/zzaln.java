package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
final class zzaln {
    private final zzalo zza = new zzalo();
    private final zzer zzb = new zzer(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    zzaln() {
    }

    private final int zzf(int i10) {
        int i11;
        int i12 = 0;
        this.zzd = 0;
        do {
            int i13 = this.zzd;
            int i14 = i10 + i13;
            zzalo zzaloVar = this.zza;
            if (i14 >= zzaloVar.zzc) {
                break;
            }
            this.zzd = i13 + 1;
            i11 = zzaloVar.zzf[i14];
            i12 += i11;
        } while (i11 == 255);
        return i12;
    }

    public final void zza() {
        this.zza.zza();
        this.zzb.zza(0);
        this.zzc = -1;
        this.zze = false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0049, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean zzb(com.google.android.gms.internal.ads.zzaev r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.zze = r1
            com.google.android.gms.internal.ads.zzer r0 = r7.zzb
            r0.zza(r1)
        Ld:
            boolean r0 = r7.zze
            r2 = 1
            if (r0 != 0) goto L91
            int r0 = r7.zzc
            if (r0 >= 0) goto L4a
            com.google.android.gms.internal.ads.zzalo r0 = r7.zza
            r3 = -1
            boolean r3 = r0.zzb(r8, r3)
            if (r3 == 0) goto L49
            boolean r3 = r0.zzc(r8, r2)
            if (r3 != 0) goto L27
            goto L49
        L27:
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L3e
            com.google.android.gms.internal.ads.zzer r0 = r7.zzb
            int r0 = r0.zze()
            if (r0 != 0) goto L3e
            int r0 = r7.zzf(r1)
            int r3 = r3 + r0
            int r0 = r7.zzd
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.google.android.gms.internal.ads.zzaey.zzd(r8, r3)
            if (r3 != 0) goto L46
            return r1
        L46:
            r7.zzc = r0
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r7.zzf(r0)
            int r3 = r7.zzc
            int r4 = r7.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L86
            com.google.android.gms.internal.ads.zzer r4 = r7.zzb
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzc(r5)
            byte[] r5 = r4.zzi()
            int r6 = r4.zze()
            boolean r5 = com.google.android.gms.internal.ads.zzaey.zzc(r8, r5, r6, r0)
            if (r5 != 0) goto L6e
            return r1
        L6e:
            int r5 = r4.zze()
            int r5 = r5 + r0
            r4.zzf(r5)
            com.google.android.gms.internal.ads.zzalo r0 = r7.zza
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L83
            goto L84
        L83:
            r2 = r1
        L84:
            r7.zze = r2
        L86:
            com.google.android.gms.internal.ads.zzalo r0 = r7.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L8d
            r3 = -1
        L8d:
            r7.zzc = r3
            goto Ld
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaln.zzb(com.google.android.gms.internal.ads.zzaev):boolean");
    }

    public final zzalo zzc() {
        return this.zza;
    }

    public final zzer zzd() {
        return this.zzb;
    }

    public final void zze() {
        zzer zzerVar = this.zzb;
        if (zzerVar.zzi().length == 65025) {
            return;
        }
        zzerVar.zzb(Arrays.copyOf(zzerVar.zzi(), Math.max(65025, zzerVar.zze())), zzerVar.zze());
    }
}
