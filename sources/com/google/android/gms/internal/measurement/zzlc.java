package com.google.android.gms.internal.measurement;

/* JADX INFO: loaded from: classes8.dex */
final class zzlc extends zzlg {
    private final int zzc;

    zzlc(byte[] bArr, int i10, int i11) {
        super(bArr);
        zzlh.zzj(0, i11, bArr.length);
        this.zzc = i11;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final byte zza(int i10) {
        int i11 = this.zzc;
        if (((i11 - (i10 + 1)) | i10) >= 0) {
            return ((zzlg) this).zza[i10];
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 11);
            sb2.append("Index < 0: ");
            sb2.append(i10);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 18 + String.valueOf(i11).length());
        sb3.append("Index > length: ");
        sb3.append(i10);
        sb3.append(", ");
        sb3.append(i11);
        throw new ArrayIndexOutOfBoundsException(sb3.toString());
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    final byte zzb(int i10) {
        return ((zzlg) this).zza[i10];
    }

    @Override // com.google.android.gms.internal.measurement.zzlg, com.google.android.gms.internal.measurement.zzlh
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlg
    protected final int zzd() {
        return 0;
    }
}
