package com.google.common.reflect;

import com.google.common.collect.ForwardingMap;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public final class ImmutableTypeToInstanceMap<B> extends ForwardingMap<TypeToken<? extends B>, B> implements TypeToInstanceMap<B> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ImmutableMap f31158b;

    public static final class Builder<B> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap.Builder f31159a;

        public ImmutableTypeToInstanceMap<B> build() {
            return new ImmutableTypeToInstanceMap<>(this.f31159a.buildOrThrow());
        }

        @CanIgnoreReturnValue
        public <T extends B> Builder<B> put(Class<T> cls, T t10) {
            this.f31159a.put(TypeToken.of((Class) cls), t10);
            return this;
        }

        private Builder() {
            this.f31159a = ImmutableMap.builder();
        }

        @CanIgnoreReturnValue
        public <T extends B> Builder<B> put(TypeToken<T> typeToken, T t10) {
            this.f31159a.put(typeToken.N(), t10);
            return this;
        }
    }

    private Object a(TypeToken typeToken) {
        return this.f31158b.get(typeToken);
    }

    public static <B> Builder<B> builder() {
        return new Builder<>();
    }

    public static <B> ImmutableTypeToInstanceMap<B> of() {
        return new ImmutableTypeToInstanceMap<>(ImmutableMap.of());
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(TypeToken<T> typeToken) {
        return (T) a(typeToken.N());
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void putAll(Map<? extends TypeToken<? extends B>, ? extends B> map) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public <T extends B> T putInstance(TypeToken<T> typeToken, T t10) {
        throw new UnsupportedOperationException();
    }

    private ImmutableTypeToInstanceMap(ImmutableMap immutableMap) {
        this.f31158b = immutableMap;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public Map n() {
        return this.f31158b;
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    public <T extends B> T getInstance(Class<T> cls) {
        return (T) a(TypeToken.of((Class) cls));
    }

    @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public B put(TypeToken<? extends B> typeToken, B b10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.reflect.TypeToInstanceMap
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public <T extends B> T putInstance(Class<T> cls, T t10) {
        throw new UnsupportedOperationException();
    }
}
