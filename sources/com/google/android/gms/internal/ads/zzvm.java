package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public final class zzvm implements zzxd {
    private final zzafa zza;

    @Nullable
    private zzaeu zzb;

    @Nullable
    private zzaev zzc;

    public zzvm(zzafa zzafaVar) {
        this.zza = zzafaVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // com.google.android.gms.internal.ads.zzxd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zza(com.google.android.gms.internal.ads.zzj r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzaex r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzael r1 = new com.google.android.gms.internal.ads.zzael
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.zzc = r1
            com.google.android.gms.internal.ads.zzaeu r8 = r7.zzb
            if (r8 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzafa r8 = r7.zza
            com.google.android.gms.internal.ads.zzaeu[] r8 = r8.zzb(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzguc r11 = com.google.android.gms.internal.ads.zzguf.zzv(r10)
            r12 = 0
            r13 = 1
            if (r10 != r13) goto L23
            r8 = r8[r12]
            r7.zzb = r8
            goto L7f
        L23:
            r14 = r12
        L24:
            if (r14 >= r10) goto L7b
            r0 = r8[r14]
            boolean r2 = r0.zza(r1)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            if (r2 == 0) goto L3a
            r7.zzb = r0     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.zzgrc.zzi(r13)
            r1.zzl()
            goto L7b
        L37:
            r0 = move-exception
            r8 = r0
            goto L57
        L3a:
            java.util.List r0 = r0.zzb()     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            r11.zzh(r0)     // Catch: java.lang.Throwable -> L37 java.io.EOFException -> L6b
            com.google.android.gms.internal.ads.zzaeu r0 = r7.zzb
            if (r0 != 0) goto L4d
            long r5 = r1.zzn()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
        L4d:
            r0 = r13
            goto L50
        L4f:
            r0 = r12
        L50:
            com.google.android.gms.internal.ads.zzgrc.zzi(r0)
            r1.zzl()
            goto L78
        L57:
            com.google.android.gms.internal.ads.zzaeu r9 = r7.zzb
            if (r9 != 0) goto L63
            long r9 = r1.zzn()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L64
        L63:
            r12 = r13
        L64:
            com.google.android.gms.internal.ads.zzgrc.zzi(r12)
            r1.zzl()
            throw r8
        L6b:
            com.google.android.gms.internal.ads.zzaeu r0 = r7.zzb
            if (r0 != 0) goto L4d
            long r5 = r1.zzn()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L4f
            goto L4d
        L78:
            int r14 = r14 + 1
            goto L24
        L7b:
            com.google.android.gms.internal.ads.zzaeu r10 = r7.zzb
            if (r10 == 0) goto L85
        L7f:
            com.google.android.gms.internal.ads.zzaeu r8 = r7.zzb
            r8.zzc(r15)
            return
        L85:
            com.google.android.gms.internal.ads.zzyo r10 = new com.google.android.gms.internal.ads.zzyo
            com.google.android.gms.internal.ads.zzguf r8 = com.google.android.gms.internal.ads.zzguf.zzr(r8)
            com.google.android.gms.internal.ads.zzvl r12 = com.google.android.gms.internal.ads.zzvl.zza
            java.util.List r8 = com.google.android.gms.internal.ads.zzgvf.zzc(r8, r12)
            java.lang.String r12 = ", "
            java.lang.String r8 = com.google.android.gms.internal.ads.zzgqw.zzd(r8, r12)
            int r12 = r8.length()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            int r12 = r12 + 58
            r13.<init>(r12)
            java.lang.String r12 = "None of the available extractors ("
            r13.append(r12)
            r13.append(r8)
            java.lang.String r8 = ") could read the stream."
            r13.append(r8)
            java.lang.String r8 = r13.toString()
            com.google.android.gms.internal.ads.zzguf r11 = r11.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzvm.zza(com.google.android.gms.internal.ads.zzj, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzaex):void");
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzb() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null) {
            zzaeuVar.zzf();
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zzc() {
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar != null && (zzaeuVar instanceof zzajp)) {
            ((zzajp) zzaeuVar).zzh();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final long zzd() {
        zzaev zzaevVar = this.zzc;
        if (zzaevVar != null) {
            return zzaevVar.zzn();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final void zze(long j10, long j11) {
        zzaeu zzaeuVar = this.zzb;
        zzaeuVar.getClass();
        zzaeuVar.zze(j10, j11);
    }

    @Override // com.google.android.gms.internal.ads.zzxd
    public final int zzf(zzafv zzafvVar) throws IOException {
        zzaev zzaevVar;
        zzaeu zzaeuVar = this.zzb;
        if (zzaeuVar == null || (zzaevVar = this.zzc) == null) {
            throw null;
        }
        return zzaeuVar.zzd(zzaevVar, zzafvVar);
    }
}
