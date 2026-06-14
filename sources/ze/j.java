package ze;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements Map, yf.e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f119351b = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry e(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new r(((k) DelegatingMutableSet.getKey()).a(), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map.Entry f(Map.Entry DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return new r(c0.a((String) DelegatingMutableSet.getKey()), DelegatingMutableSet.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String g(k DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return DelegatingMutableSet.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k h(String DelegatingMutableSet) {
        Intrinsics.checkNotNullParameter(DelegatingMutableSet, "$this$DelegatingMutableSet");
        return c0.a(DelegatingMutableSet);
    }

    @Override // java.util.Map
    public void clear() {
        this.f119351b.clear();
    }

    @Override // java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (obj instanceof String) {
            return i((String) obj);
        }
        return false;
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        if (obj == null) {
            return false;
        }
        return this.f119351b.containsValue(obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return k();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof j)) {
            return false;
        }
        return Intrinsics.areEqual(((j) obj).f119351b, this.f119351b);
    }

    @Override // java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (obj instanceof String) {
            return j((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f119351b.hashCode();
    }

    public boolean i(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f119351b.containsKey(new k(key));
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f119351b.isEmpty();
    }

    public Object j(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f119351b.get(c0.a(key));
    }

    public Set k() {
        return new q(this.f119351b.entrySet(), new Function1() { // from class: ze.f
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.e((Map.Entry) obj);
            }
        }, new Function1() { // from class: ze.g
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.f((Map.Entry) obj);
            }
        });
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return l();
    }

    public Set l() {
        return new q(this.f119351b.keySet(), new Function1() { // from class: ze.h
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.g((k) obj);
            }
        }, new Function1() { // from class: ze.i
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return j.h((String) obj);
            }
        });
    }

    public int m() {
        return this.f119351b.size();
    }

    public Collection n() {
        return this.f119351b.values();
    }

    @Override // java.util.Map
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Object put(String key, Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        return this.f119351b.put(c0.a(key), value);
    }

    public Object p(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f119351b.remove(c0.a(key));
    }

    @Override // java.util.Map
    public void putAll(Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry entry : from.entrySet()) {
            put((String) entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (obj instanceof String) {
            return p((String) obj);
        }
        return null;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return m();
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return n();
    }
}
