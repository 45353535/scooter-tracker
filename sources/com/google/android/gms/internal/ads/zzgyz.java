package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
abstract class zzgyz extends zzgyq {
    private List zza;

    zzgyz(zzgub zzgubVar, boolean z10) {
        super(zzgubVar, z10, true);
        List listZzb = zzgubVar.isEmpty() ? Collections.EMPTY_LIST : zzgvf.zzb(zzgubVar.size());
        for (int i10 = 0; i10 < zzgubVar.size(); i10++) {
            listZzb.add(null);
        }
        this.zza = listZzb;
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzA(int i10) {
        super.zzA(i10);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzw(int i10, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i10, new zzgyy(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgyq
    final void zzx() {
        List list = this.zza;
        if (list != null) {
            zza(zzD(list));
        }
    }
}
