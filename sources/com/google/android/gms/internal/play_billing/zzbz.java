package com.google.android.gms.internal.play_billing;

import com.ironsource.D5;
import j$.util.Map;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes8.dex */
public abstract class zzbz implements Map, Serializable, j$.util.Map {
    private transient zzca zza;
    private transient zzca zzb;
    private transient zzbt zzc;

    zzbz() {
    }

    public static zzbz zzc(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        zzbr.zza("com.android.vending.billing.PURCHASES_UPDATED", obj2);
        zzbr.zza("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4);
        zzbr.zza("com.android.vending.billing.ALTERNATIVE_BILLING", obj6);
        return zzci.zzg(3, new Object[]{"com.android.vending.billing.PURCHASES_UPDATED", obj2, "com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED", obj4, "com.android.vending.billing.ALTERNATIVE_BILLING", obj6}, null);
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
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
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
        return zzcj.zza(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        zzca zzcaVar = this.zzb;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzcaVarZze = zze();
        this.zzb = zzcaVarZze;
        return zzcaVarZze;
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
        if (size < 0) {
            throw new IllegalArgumentException("size cannot be negative but was: " + size);
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824L));
        sb2.append('{');
        boolean z10 = true;
        for (Map.Entry entry : entrySet()) {
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

    abstract zzbt zza();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final zzbt values() {
        zzbt zzbtVar = this.zzc;
        if (zzbtVar != null) {
            return zzbtVar;
        }
        zzbt zzbtVarZza = zza();
        this.zzc = zzbtVarZza;
        return zzbtVarZza;
    }

    abstract zzca zzd();

    abstract zzca zze();

    @Override // java.util.Map
    /* JADX INFO: renamed from: zzf, reason: merged with bridge method [inline-methods] */
    public final zzca entrySet() {
        zzca zzcaVar = this.zza;
        if (zzcaVar != null) {
            return zzcaVar;
        }
        zzca zzcaVarZzd = zzd();
        this.zza = zzcaVarZzd;
        return zzcaVarZzd;
    }

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
