package com.google.android.gms.internal.ads;

import com.ironsource.D5;
import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzgui<K, V> implements Map<K, V>, Serializable, j$.util.Map {
    private transient zzgup zza;
    private transient zzgup zzb;
    private transient zzgub zzc;

    zzgui() {
    }

    public static zzgui zza() {
        return zzgwf.zza;
    }

    public static zzgui zzb(Object obj, Object obj2) {
        zzgtb.zza("dialog_not_shown_reason", obj2);
        return zzgwf.zzk(1, new Object[]{"dialog_not_shown_reason", obj2}, null);
    }

    public static zzgui zzc(Map map) {
        if ((map instanceof zzgui) && !(map instanceof SortedMap)) {
            zzgui zzguiVar = (zzgui) map;
            zzguiVar.zzj();
            return zzguiVar;
        }
        Set<Map.Entry<K, V>> setEntrySet = map.entrySet();
        zzguh zzguhVar = new zzguh(setEntrySet instanceof Collection ? setEntrySet.size() : 4);
        zzguhVar.zzb(setEntrySet);
        return zzguhVar.zzc();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        return zzgvm.zzb(this, obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public abstract Object get(Object obj);

    @Override // java.util.Map, j$.util.Map
    public final Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 != null ? obj3 : obj2;
    }

    @Override // java.util.Map
    public final int hashCode() {
        return zzgwp.zzc(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    @Deprecated
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(java.util.Map map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        zzgtb.zzb(size, "size");
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z10) {
                sb2.append(", ");
            }
            sb2.append(entry.getKey());
            sb2.append(D5.T);
            sb2.append(entry.getValue());
            z10 = false;
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final zzgup entrySet() {
        zzgup zzgupVar = this.zza;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zzgupVarZze = zze();
        this.zza = zzgupVarZze;
        return zzgupVarZze;
    }

    abstract zzgup zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzgup keySet() {
        zzgup zzgupVar = this.zzb;
        if (zzgupVar != null) {
            return zzgupVar;
        }
        zzgup zzgupVarZzg = zzg();
        this.zzb = zzgupVarZzg;
        return zzgupVarZzg;
    }

    abstract zzgup zzg();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzh, reason: merged with bridge method [inline-methods] */
    public final zzgub values() {
        zzgub zzgubVar = this.zzc;
        if (zzgubVar != null) {
            return zzgubVar;
        }
        zzgub zzgubVarZzi = zzi();
        this.zzc = zzgubVarZzi;
        return zzgubVarZzi;
    }

    abstract zzgub zzi();

    abstract boolean zzj();

    @Override // java.util.Map
    @Deprecated
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
