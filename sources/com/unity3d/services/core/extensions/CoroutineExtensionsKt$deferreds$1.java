package com.unity3d.services.core.extensions;

import j$.util.Map;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010'\n\u0000*\u0001\u0000\b\n\u0018\u00002&\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u0001j\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0003`\u0004J \u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\bH\u0014¨\u0006\t"}, d2 = {"com/unity3d/services/core/extensions/CoroutineExtensionsKt$deferreds$1", "Ljava/util/LinkedHashMap;", "", "Lkotlinx/coroutines/Deferred;", "Lkotlin/collections/LinkedHashMap;", "removeEldestEntry", "", "eldest", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class CoroutineExtensionsKt$deferreds$1 extends LinkedHashMap<Object, Deferred> implements Map {
    CoroutineExtensionsKt$deferreds$1() {
        super(101);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (obj instanceof Deferred) {
            return containsValue((Deferred) obj);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Map.Entry<Object, Deferred>> entrySet() {
        return getEntries();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public /* bridge */ Set<Map.Entry<Object, Deferred>> getEntries() {
        return super.entrySet();
    }

    public /* bridge */ Set<Object> getKeys() {
        return super.keySet();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public /* bridge */ int getSize() {
        return super.size();
    }

    public /* bridge */ Collection<Deferred> getValues() {
        return super.values();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Set<Object> keySet() {
        return getKeys();
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public final /* bridge */ boolean remove(Object obj, Object obj2) {
        if (obj != null && (obj2 instanceof Deferred)) {
            return remove(obj, (Deferred) obj2);
        }
        return false;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(@NotNull Map.Entry<Object, Deferred> eldest) {
        Intrinsics.checkNotNullParameter(eldest, "eldest");
        return size() > 100;
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Collection<Deferred> values() {
        return getValues();
    }

    public /* bridge */ boolean containsValue(Deferred deferred) {
        return super.containsValue((Object) deferred);
    }

    public /* bridge */ boolean remove(Object obj, Deferred deferred) {
        return Map.CC.$default$remove(this, obj, deferred);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }
}
