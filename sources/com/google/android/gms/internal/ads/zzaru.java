package com.google.android.gms.internal.ads;

import androidx.annotation.Nullable;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes8.dex */
public final class zzaru {
    public final int zza;
    public final byte[] zzb;

    @Nullable
    public final Map zzc;

    @Nullable
    public final List zzd;
    public final boolean zze;

    private zzaru(int i10, byte[] bArr, @Nullable Map map, @Nullable List list, boolean z10, long j10) {
        this.zza = i10;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : DesugarCollections.unmodifiableList(list);
        this.zze = z10;
    }

    @Nullable
    private static List zza(@Nullable Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzarq((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzaru(int i10, byte[] bArr, @Nullable Map map, boolean z10, long j10) {
        this(i10, bArr, map, zza(map), z10, j10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public zzaru(int i10, byte[] bArr, boolean z10, long j10, @Nullable List list) {
        Map treeMap;
        if (list == null) {
            treeMap = null;
        } else if (list.isEmpty()) {
            treeMap = Collections.EMPTY_MAP;
        } else {
            treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                zzarq zzarqVar = (zzarq) it.next();
                treeMap.put(zzarqVar.zza(), zzarqVar.zzb());
            }
        }
        this(i10, bArr, treeMap, list, z10, j10);
    }

    @Deprecated
    public zzaru(byte[] bArr, @Nullable Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
