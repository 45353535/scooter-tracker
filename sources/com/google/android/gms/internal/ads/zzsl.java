package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.Arrays;

/* JADX INFO: loaded from: classes8.dex */
public final class zzsl extends zzcp {

    @Nullable
    private int[] zzd;

    @Nullable
    private int[] zze;

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00f3  */
    @Override // com.google.android.gms.internal.ads.zzco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void zzd(java.nio.ByteBuffer r17) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzsl.zzd(java.nio.ByteBuffer):void");
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    public final zzcl zzm(zzcl zzclVar) throws zzcn {
        int[] iArr = this.zzd;
        if (iArr == null) {
            return zzcl.zza;
        }
        int i10 = zzclVar.zzd;
        if (!zzfj.zzA(i10)) {
            throw new zzcn("Unhandled input format:", zzclVar);
        }
        int i11 = zzclVar.zzc;
        boolean z10 = i11 != iArr.length;
        int i12 = 0;
        while (true) {
            int length = iArr.length;
            if (i12 >= length) {
                return z10 ? new zzcl(zzclVar.zzb, length, i10) : zzcl.zza;
            }
            int i13 = iArr[i12];
            if (i13 >= i11) {
                String string = Arrays.toString(iArr);
                StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 59);
                sb2.append("Channel map (");
                sb2.append(string);
                sb2.append(") trying to access non-existent input channel.");
                throw new zzcn(sb2.toString(), zzclVar);
            }
            z10 |= i13 != i12;
            i12++;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzo() {
        this.zze = this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzcp
    protected final void zzp() {
        this.zze = null;
        this.zzd = null;
    }

    public final void zzq(@Nullable int[] iArr) {
        this.zzd = iArr;
    }
}
