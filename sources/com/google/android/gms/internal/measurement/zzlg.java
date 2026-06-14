package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
class zzlg extends zzlf {
    protected final byte[] zza;

    zzlg(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zza = bArr;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzlh) || zzc() != ((zzlh) obj).zzc()) {
            return false;
        }
        if (zzc() == 0) {
            return true;
        }
        if (!(obj instanceof zzlg)) {
            return obj.equals(this);
        }
        zzlg zzlgVar = (zzlg) obj;
        int iZzi = zzi();
        int iZzi2 = zzlgVar.zzi();
        if (iZzi != 0 && iZzi2 != 0 && iZzi != iZzi2) {
            return false;
        }
        int iZzc = zzc();
        if (iZzc > zzlgVar.zzc()) {
            int iZzc2 = zzc();
            StringBuilder sb2 = new StringBuilder(String.valueOf(iZzc).length() + 18 + String.valueOf(iZzc2).length());
            sb2.append("Length too large: ");
            sb2.append(iZzc);
            sb2.append(iZzc2);
            throw new IllegalArgumentException(sb2.toString());
        }
        if (iZzc > zzlgVar.zzc()) {
            int iZzc3 = zzlgVar.zzc();
            StringBuilder sb3 = new StringBuilder(String.valueOf(iZzc).length() + 27 + String.valueOf(iZzc3).length());
            sb3.append("Ran off end of other: 0, ");
            sb3.append(iZzc);
            sb3.append(", ");
            sb3.append(iZzc3);
            throw new IllegalArgumentException(sb3.toString());
        }
        byte[] bArr = this.zza;
        byte[] bArr2 = zzlgVar.zza;
        zzlgVar.zzd();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iZzc) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public byte zza(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    byte zzb(int i10) {
        return this.zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public int zzc() {
        return this.zza.length;
    }

    protected int zzd() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    public final zzlh zze(int i10, int i11) {
        int iZzj = zzlh.zzj(0, i11, zzc());
        return iZzj == 0 ? zzlh.zzb : new zzlc(this.zza, 0, iZzj);
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    final void zzf(zzkz zzkzVar) throws IOException {
        ((zzlk) zzkzVar).zzv(this.zza, 0, zzc());
    }

    @Override // com.google.android.gms.internal.measurement.zzlh
    protected final int zzg(int i10, int i11, int i12) {
        return zzmp.zzc(i10, this.zza, 0, i12);
    }
}
