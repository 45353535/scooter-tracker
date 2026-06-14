package bf;

import j$.util.Map;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import yf.e;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements Map, e, j$.util.Map {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f6403b;

    public a(int i10) {
        this.f6403b = new ConcurrentHashMap(i10);
    }

    public Set a() {
        Set setEntrySet = this.f6403b.entrySet();
        Intrinsics.checkNotNullExpressionValue(setEntrySet, "<get-entries>(...)");
        return setEntrySet;
    }

    public Set b() {
        Set setKeySet = this.f6403b.keySet();
        Intrinsics.checkNotNullExpressionValue(setKeySet, "<get-keys>(...)");
        return setKeySet;
    }

    public int c() {
        return this.f6403b.size();
    }

    @Override // java.util.Map
    public void clear() {
        this.f6403b.clear();
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
    public boolean containsKey(Object obj) {
        return this.f6403b.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f6403b.containsValue(obj);
    }

    public Collection d() {
        Collection collectionValues = this.f6403b.values();
        Intrinsics.checkNotNullExpressionValue(collectionValues, "<get-values>(...)");
        return collectionValues;
    }

    @Override // java.util.Map
    public final /* bridge */ Set entrySet() {
        return a();
    }

    @Override // java.util.Map
    public boolean equals(Object obj) {
        if (obj instanceof java.util.Map) {
            return Intrinsics.areEqual(obj, this.f6403b);
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map
    public Object get(Object obj) {
        return this.f6403b.get(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.Map
    public int hashCode() {
        return this.f6403b.hashCode();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f6403b.isEmpty();
    }

    @Override // java.util.Map
    public final /* bridge */ Set keySet() {
        return b();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map
    public Object put(Object obj, Object obj2) {
        return this.f6403b.put(obj, obj2);
    }

    @Override // java.util.Map
    public void putAll(java.util.Map from) {
        Intrinsics.checkNotNullParameter(from, "from");
        this.f6403b.putAll(from);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map
    public Object remove(Object obj) {
        return this.f6403b.remove(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return c();
    }

    public String toString() {
        return "ConcurrentMapJvm by " + this.f6403b;
    }

    @Override // java.util.Map
    public final /* bridge */ Collection values() {
        return d();
    }

    @Override // java.util.Map, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        return this.f6403b.remove(obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    public /* synthetic */ a(int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 32 : i10);
    }
}
