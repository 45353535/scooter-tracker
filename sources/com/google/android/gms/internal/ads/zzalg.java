package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class zzalg implements zzagc {
    public final int zza;
    public final zzgxx zzb;

    public zzalg(int i10, @Nullable int[] iArr) {
        this.zza = i10;
        this.zzb = iArr != null ? zzgxx.zzb(iArr) : zzgxx.zza();
    }

    public final String toString() {
        zzgxx zzgxxVar = this.zzb;
        ArrayList arrayList = new ArrayList(zzgxxVar.zzc());
        for (int i10 = 0; i10 < zzgxxVar.zzc(); i10++) {
            arrayList.add(zzfj.zzx(zzgxxVar.zzd(i10)));
        }
        String strZzx = zzfj.zzx(this.zza);
        String string = arrayList.toString();
        StringBuilder sb2 = new StringBuilder(strZzx.length() + 37 + string.length() + 1);
        sb2.append("UnsupportedBrands{major=");
        sb2.append(strZzx);
        sb2.append(", compatible=");
        sb2.append(string);
        sb2.append("}");
        return sb2.toString();
    }
}
