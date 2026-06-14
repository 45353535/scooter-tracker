package com.google.android.gms.internal.play_billing;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzev implements Iterable, Serializable {
    public static final zzev zza = new zzet(zzga.zzb);
    private int zzb = 0;

    static {
        int i10 = zzei.zza;
    }

    zzev() {
    }

    static int zzj(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static zzev zzk(byte[] bArr, int i10, int i11) {
        try {
            zzj(i10, i10 + i11, bArr.length);
            byte[] bArr2 = new byte[i11];
            System.arraycopy(bArr, i10, bArr2, 0, i11);
            return new zzet(bArr2);
        } catch (zzgc e10) {
            throw new AssertionError("Expected no InvalidProtocolBufferException as data UTF8 validity is not checked.", e10);
        }
    }

    static /* bridge */ /* synthetic */ boolean zzl(byte[] bArr, int i10, byte[] bArr2, int i11, int i12) {
        int i13 = i10 + i12;
        zzj(i10, i13, bArr.length);
        zzj(i11, i12 + i11, bArr2.length);
        while (i10 < i13) {
            if (bArr[i10] != bArr2[i11]) {
                return false;
            }
            i10++;
            i11++;
        }
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzev)) {
            return false;
        }
        zzev zzevVar = (zzev) obj;
        int iZze = zze();
        if (iZze != zzevVar.zze()) {
            return false;
        }
        if (iZze == 0) {
            return true;
        }
        int i10 = this.zzb;
        int i11 = zzevVar.zzb;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzevVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZzd = this.zzb;
        if (iZzd == 0) {
            int iZze = zze();
            iZzd = zzd(iZze, 0, iZze);
            if (iZzd == 0) {
                iZzd = 1;
            }
            this.zzb = iZzd;
        }
        return iZzd;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzen(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zze()), zze() <= 50 ? zzhz.zza(this) : zzhz.zza(zzf(0, 47)).concat(APSSharedUtil.TRUNCATE_SEPARATOR));
    }

    public abstract byte zza(int i10);

    abstract byte zzb(int i10);

    protected abstract int zzd(int i10, int i11, int i12);

    public abstract int zze();

    public abstract zzev zzf(int i10, int i11);

    abstract void zzg(zzem zzemVar) throws IOException;

    protected abstract boolean zzh(zzev zzevVar);
}
