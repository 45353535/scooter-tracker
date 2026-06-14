package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes8.dex */
public final class zzguq extends zzgul {
    public final zzguq zzb(Object obj, Object... objArr) {
        List listAsList = Arrays.asList(objArr);
        if (obj == null) {
            Iterator it = listAsList.iterator();
            StringBuilder sb2 = new StringBuilder();
            sb2.append('[');
            boolean z10 = true;
            while (it.hasNext()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(it.next());
                z10 = false;
            }
            sb2.append(']');
            throw new NullPointerException("null key in entry: null=".concat(sb2.toString()));
        }
        Iterator it2 = listAsList.iterator();
        if (it2.hasNext()) {
            zzgua zzguaVarZzs = (zzgua) zza().get(obj);
            if (zzguaVarZzs == null) {
                zzguaVarZzs = zzgup.zzs(listAsList instanceof Set ? Math.max(4, ((Set) listAsList).size()) : 4);
                zza().put(obj, zzguaVarZzs);
            }
            while (it2.hasNext()) {
                Object next = it2.next();
                zzgtb.zza(obj, next);
                zzguaVarZzs.zzd(next);
            }
        }
        return this;
    }

    public final zzgus zzc() {
        Map map = this.zza;
        if (map == null) {
            return zzgtt.zza;
        }
        Set<Map.Entry> setEntrySet = map.entrySet();
        if (setEntrySet.isEmpty()) {
            return zzgtt.zza;
        }
        zzguh zzguhVar = new zzguh(setEntrySet.size());
        int size = 0;
        for (Map.Entry entry : setEntrySet) {
            Object key = entry.getKey();
            zzgup zzgupVarZzo = zzgup.zzo(((zzguo) entry.getValue()).zzi());
            if (!zzgupVarZzo.isEmpty()) {
                zzguhVar.zza(key, zzgupVarZzo);
                size += zzgupVarZzo.size();
            }
        }
        return new zzgus(zzguhVar.zzc(), size, null);
    }
}
