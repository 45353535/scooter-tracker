package com.google.android.gms.internal.ads;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zziks implements zzikg {
    private final List zza;
    private final List zzb;

    static {
        zzikh.zza(Collections.EMPTY_SET);
    }

    /* synthetic */ zziks(List list, List list2, zzikq zzikqVar) {
        this.zza = list;
        this.zzb = list2;
    }

    public static zzikr zza(int i10, int i11) {
        return new zzikr(i10, i11, null);
    }

    @Override // com.google.android.gms.internal.ads.zzikv, com.google.android.gms.internal.ads.zziku
    /* JADX INFO: renamed from: zzc, reason: merged with bridge method [inline-methods] */
    public final Set zzb() {
        List list = this.zza;
        int size = list.size();
        List list2 = this.zzb;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i10 = 0; i10 < size2; i10++) {
            Collection collection = (Collection) ((zzikp) list2.get(i10)).zzb();
            size += collection.size();
            arrayList.add(collection);
        }
        HashSet hashSetZzb = zzikd.zzb(size);
        int size3 = list.size();
        for (int i11 = 0; i11 < size3; i11++) {
            Object objZzb = ((zzikp) list.get(i11)).zzb();
            objZzb.getClass();
            hashSetZzb.add(objZzb);
        }
        int size4 = arrayList.size();
        for (int i12 = 0; i12 < size4; i12++) {
            for (Object obj : (Collection) arrayList.get(i12)) {
                obj.getClass();
                hashSetZzb.add(obj);
            }
        }
        return DesugarCollections.unmodifiableSet(hashSetZzb);
    }
}
