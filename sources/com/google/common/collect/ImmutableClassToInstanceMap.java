package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.primitives.Primitives;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"B"})
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableClassToInstanceMap<B> extends ForwardingMap<Class<? extends B>, B> implements ClassToInstanceMap<B>, Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final ImmutableClassToInstanceMap f29547c = new ImmutableClassToInstanceMap(ImmutableMap.of());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap f29548b;

    public static final class Builder<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap.Builder f29549a = ImmutableMap.builder();

        private static Object a(Class cls, Object obj) {
            return Primitives.wrap(cls).cast(obj);
        }

        public ImmutableClassToInstanceMap<B> build() {
            ImmutableMap immutableMapBuildOrThrow = this.f29549a.buildOrThrow();
            return immutableMapBuildOrThrow.isEmpty() ? ImmutableClassToInstanceMap.of() : new ImmutableClassToInstanceMap<>(immutableMapBuildOrThrow);
        }

        @CanIgnoreReturnValue
        public <T extends B> Builder<B> put(Class<T> cls, T t10) {
            this.f29549a.put(cls, t10);
            return this;
        }

        @CanIgnoreReturnValue
        public <T extends B> Builder<B> putAll(Map<? extends Class<? extends T>, ? extends T> map) {
            for (Map.Entry<? extends Class<? extends T>, ? extends T> entry : map.entrySet()) {
                Class<? extends T> key = entry.getKey();
                this.f29549a.put(key, a(key, entry.getValue()));
            }
            return this;
        }
    }

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static <B, S extends B> ImmutableClassToInstanceMap<B> copyOf(Map<? extends Class<? extends S>, ? extends S> map) {
        return map instanceof ImmutableClassToInstanceMap ? (ImmutableClassToInstanceMap) map : new Builder().putAll(map).build();
    }

    public static <B> ImmutableClassToInstanceMap<B> of() {
        return f29547c;
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) this.f29548b.get(Preconditions.checkNotNull(cls));
    }

    @Override // com.google.common.collect.ClassToInstanceMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t10) {
        throw new UnsupportedOperationException();
    }

    Object readResolve() {
        return isEmpty() ? of() : this;
    }

    private ImmutableClassToInstanceMap(ImmutableMap immutableMap) {
        this.f29548b = immutableMap;
    }

    public static <B, T extends B> ImmutableClassToInstanceMap<B> of(Class<T> cls, T t10) {
        return new ImmutableClassToInstanceMap<>(ImmutableMap.of(cls, t10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public Map n() {
        return this.f29548b;
    }
}
