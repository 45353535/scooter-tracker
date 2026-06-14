package com.google.android.gms.internal.consent_sdk;

import com.amazon.aps.shared.util.APSSharedUtil;
import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzpm implements Iterable, Serializable {
    public static final zzpm zzb = new zzpk(zzqs.zzb);
    private int zza = 0;

    static {
        int i10 = zzpc.zza;
    }

    zzpm() {
    }

    static int zzi(int i10, int i11, int i12) {
        if (((i12 - 47) | 47) >= 0) {
            return 47;
        }
        throw new IndexOutOfBoundsException("End index: 47 >= " + i12);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzpm)) {
            return false;
        }
        zzpm zzpmVar = (zzpm) obj;
        int iZzd = zzd();
        if (iZzd != zzpmVar.zzd()) {
            return false;
        }
        if (iZzd == 0) {
            return true;
        }
        int i10 = this.zza;
        int i11 = zzpmVar.zza;
        if (i10 == 0 || i11 == 0 || i10 == i11) {
            return zzh(zzpmVar);
        }
        return false;
    }

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzpf(this);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(zzd()), zzd() <= 50 ? zzsk.zza(this) : zzsk.zza(zzf(0, 47)).concat(APSSharedUtil.TRUNCATE_SEPARATOR));
    }

    public abstract byte zza(int i10);

    abstract byte zzb(int i10);

    public abstract int zzd();

    protected abstract int zze(int i10, int i11, int i12);

    public abstract zzpm zzf(int i10, int i11);

    abstract void zzg(zzpe zzpeVar) throws IOException;

    protected abstract boolean zzh(zzpm zzpmVar);
}
