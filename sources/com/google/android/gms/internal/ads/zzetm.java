package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzetm implements zzfax {
    private final Set zza;

    zzetm(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final ListenableFuture zza() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.zza.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        return zzgzo.zza(new zzetl(arrayList, null));
    }

    @Override // com.google.android.gms.internal.ads.zzfax
    public final int zzb() {
        return 8;
    }
}
