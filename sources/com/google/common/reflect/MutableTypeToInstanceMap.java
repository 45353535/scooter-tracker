package com.google.common.reflect;

import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ForwardingMapEntry;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Maps;
import com.google.common.reflect.MutableTypeToInstanceMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public final class MutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f31165b = Maps.newHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    static final class UnmodifiableEntry<K, V> extends ForwardingMapEntry<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map.Entry f31166b;

        private UnmodifiableEntry(Map.Entry entry) {
            this.f31166b = (Map.Entry) Preconditions.checkNotNull(entry);
        }

        public static /* synthetic */ UnmodifiableEntry i(Map.Entry entry) {
            return new UnmodifiableEntry(entry);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Iterator k(Iterator it) {
            return Iterators.transform(it, new Function() { // from class: com.google.common.reflect.b
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return MutableTypeToInstanceMap.UnmodifiableEntry.i((Map.Entry) obj);
                }
            });
        }

        static Set l(final Set set) {
            return new ForwardingSet<Map.Entry<Object, Object>>() { // from class: com.google.common.reflect.MutableTypeToInstanceMap.UnmodifiableEntry.1
                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<Object, Object>> iterator() {
                    return UnmodifiableEntry.k(super.iterator());
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
                public Set n() {
                    return set;
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public Object[] toArray() {
                    return l();
                }

                @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
                public <T> T[] toArray(T[] tArr) {
                    return (T[]) m(tArr);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Map.Entry n() {
            return this.f31166b;
        }

        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
        @ParametricNullness
        public V setValue(@ParametricNullness V v10) {
            throw new UnsupportedOperationException();
        }
    }

    private Object a(TypeToken typeToken) {
        return this.f31165b.get(typeToken);
    }

    private Object g(TypeToken typeToken, Object obj) {
        return this.f31165b.put(typeToken, obj);
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map
    public Set<Map.Entry<TypeToken<? extends B>, B>> entrySet() {
        return UnmodifiableEntry.l(super.entrySet());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) a(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    public <T extends B> T putInstance(Class<T> cls, @ParametricNullness T t10) {
        return (T) g(TypeToken.of((Class) cls), t10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public Map n() {
        return this.f31165b;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(TypeToken<T> typeToken) {
        return (T) a(typeToken.N());
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public B put(TypeToken<? extends B> typeToken, @ParametricNullness B b10) {
        throw new UnsupportedOperationException("Please use putInstance() instead.");
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    public <T extends B> T putInstance(TypeToken<T> typeToken, @ParametricNullness T t10) {
        return (T) g(typeToken.N(), t10);
    }
}
