package yads;

import com.ironsource.D5;
import j$.util.Map;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b41 implements Map, Serializable, j$.util.Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient pk2 f108904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public transient qk2 f108905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public transient rk2 f108906d;

    public static b41 a(HashMap map) {
        Set<Map.Entry> setEntrySet = map.entrySet();
        boolean z10 = setEntrySet instanceof Collection;
        z31 z31Var = new z31(z10 ? setEntrySet.size() : 4);
        if (z10) {
            z31Var.a(setEntrySet.size());
        }
        for (Map.Entry entry : setEntrySet) {
            z31Var.a(entry.getKey(), entry.getValue());
        }
        return sk2.a(z31Var.f118534b, z31Var.f118533a);
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final d41 entrySet() {
        pk2 pk2Var = this.f108904b;
        if (pk2Var != null) {
            return pk2Var;
        }
        sk2 sk2Var = (sk2) this;
        pk2 pk2Var2 = new pk2(sk2Var, sk2Var.f115842f, sk2Var.f115843g);
        this.f108904b = pk2Var2;
        return pk2Var2;
    }

    @Override // java.util.Map
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
        rk2 rk2Var = this.f108906d;
        if (rk2Var == null) {
            sk2 sk2Var = (sk2) this;
            rk2 rk2Var2 = new rk2(sk2Var.f115842f, 1, sk2Var.f115843g);
            this.f108906d = rk2Var2;
            rk2Var = rk2Var2;
        }
        return rk2Var.contains(obj);
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        return ((d41) entrySet()).equals(((java.util.Map) obj).entrySet());
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
        return yv2.a(entrySet());
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return ((sk2) this).size() == 0;
    }

    @Override // java.util.Map
    public final Set keySet() {
        qk2 qk2Var = this.f108905c;
        if (qk2Var != null) {
            return qk2Var;
        }
        sk2 sk2Var = (sk2) this;
        qk2 qk2Var2 = new qk2(sk2Var, new rk2(sk2Var.f115842f, 0, sk2Var.f115843g));
        this.f108905c = qk2Var2;
        return qk2Var2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
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
        int size = ((sk2) this).size();
        uw.a(size, "size");
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

    @Override // java.util.Map
    public final Collection values() {
        rk2 rk2Var = this.f108906d;
        if (rk2Var != null) {
            return rk2Var;
        }
        sk2 sk2Var = (sk2) this;
        rk2 rk2Var2 = new rk2(sk2Var.f115842f, 1, sk2Var.f115843g);
        this.f108906d = rk2Var2;
        return rk2Var2;
    }

    public Object writeReplace() {
        return new a41(this);
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    public static z31 a() {
        return new z31(4);
    }
}
