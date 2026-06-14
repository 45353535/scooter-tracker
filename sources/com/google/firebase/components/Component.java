package com.google.firebase.components;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public final class Component<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f31764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f31765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Set f31766c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f31767d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f31768e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ComponentFactory f31769f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f31770g;

    public static /* synthetic */ Object a(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object b(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static <T> Builder<T> builder(Class<T> cls) {
        return new Builder<>(cls, new Class[0]);
    }

    public static /* synthetic */ Object c(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object d(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static /* synthetic */ Object e(Object obj, ComponentContainer componentContainer) {
        return obj;
    }

    public static <T> Component<T> intoSet(final T t10, Class<T> cls) {
        return intoSetBuilder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.c
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.d(t10, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Class<T> cls) {
        return builder(cls).b();
    }

    @Deprecated
    public static <T> Component<T> of(Class<T> cls, final T t10) {
        return builder(cls).factory(new ComponentFactory() { // from class: com.google.firebase.components.d
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.b(t10, componentContainer);
            }
        }).build();
    }

    public Set<Dependency> getDependencies() {
        return this.f31766c;
    }

    public ComponentFactory<T> getFactory() {
        return this.f31769f;
    }

    @Nullable
    public String getName() {
        return this.f31764a;
    }

    public Set<Qualified<? super T>> getProvidedInterfaces() {
        return this.f31765b;
    }

    public Set<Class<?>> getPublishedEvents() {
        return this.f31770g;
    }

    public boolean isAlwaysEager() {
        return this.f31767d == 1;
    }

    public boolean isEagerInDefaultApp() {
        return this.f31767d == 2;
    }

    public boolean isLazy() {
        return this.f31767d == 0;
    }

    public boolean isValue() {
        return this.f31768e == 0;
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f31765b.toArray()) + ">{" + this.f31767d + ", type=" + this.f31768e + ", deps=" + Arrays.toString(this.f31766c.toArray()) + "}";
    }

    public Component<T> withFactory(ComponentFactory<T> componentFactory) {
        return new Component<>(this.f31764a, this.f31765b, this.f31766c, this.f31767d, this.f31768e, componentFactory, this.f31770g);
    }

    public static class Builder<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f31771a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f31772b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Set f31773c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f31774d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f31775e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private ComponentFactory f31776f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final Set f31777g;

        /* JADX INFO: Access modifiers changed from: private */
        public Builder b() {
            this.f31775e = 1;
            return this;
        }

        private Builder c(int i10) {
            Preconditions.checkState(this.f31774d == 0, "Instantiation type has already been set.");
            this.f31774d = i10;
            return this;
        }

        private void d(Qualified qualified) {
            Preconditions.checkArgument(!this.f31772b.contains(qualified), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        @CanIgnoreReturnValue
        public Builder<T> add(Dependency dependency) {
            Preconditions.checkNotNull(dependency, "Null dependency");
            d(dependency.getInterface());
            this.f31773c.add(dependency);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> alwaysEager() {
            return c(1);
        }

        public Component<T> build() {
            Preconditions.checkState(this.f31776f != null, "Missing required property: factory.");
            return new Component<>(this.f31771a, new HashSet(this.f31772b), new HashSet(this.f31773c), this.f31774d, this.f31775e, this.f31776f, this.f31777g);
        }

        @CanIgnoreReturnValue
        public Builder<T> eagerInDefaultApp() {
            return c(2);
        }

        @CanIgnoreReturnValue
        public Builder<T> factory(ComponentFactory<T> componentFactory) {
            this.f31776f = (ComponentFactory) Preconditions.checkNotNull(componentFactory, "Null factory");
            return this;
        }

        public Builder<T> name(@NonNull String str) {
            this.f31771a = str;
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<T> publishes(Class<?> cls) {
            this.f31777g.add(cls);
            return this;
        }

        private Builder(Class cls, Class... clsArr) {
            this.f31771a = null;
            HashSet hashSet = new HashSet();
            this.f31772b = hashSet;
            this.f31773c = new HashSet();
            this.f31774d = 0;
            this.f31775e = 0;
            this.f31777g = new HashSet();
            Preconditions.checkNotNull(cls, "Null interface");
            hashSet.add(Qualified.unqualified(cls));
            for (Class cls2 : clsArr) {
                Preconditions.checkNotNull(cls2, "Null interface");
                this.f31772b.add(Qualified.unqualified(cls2));
            }
        }

        private Builder(Qualified qualified, Qualified... qualifiedArr) {
            this.f31771a = null;
            HashSet hashSet = new HashSet();
            this.f31772b = hashSet;
            this.f31773c = new HashSet();
            this.f31774d = 0;
            this.f31775e = 0;
            this.f31777g = new HashSet();
            Preconditions.checkNotNull(qualified, "Null interface");
            hashSet.add(qualified);
            for (Qualified qualified2 : qualifiedArr) {
                Preconditions.checkNotNull(qualified2, "Null interface");
            }
            Collections.addAll(this.f31772b, qualifiedArr);
        }
    }

    private Component(String str, Set set, Set set2, int i10, int i11, ComponentFactory componentFactory, Set set3) {
        this.f31764a = str;
        this.f31765b = DesugarCollections.unmodifiableSet(set);
        this.f31766c = DesugarCollections.unmodifiableSet(set2);
        this.f31767d = i10;
        this.f31768e = i11;
        this.f31769f = componentFactory;
        this.f31770g = DesugarCollections.unmodifiableSet(set3);
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Class<T> cls, Class<? super T>... clsArr) {
        return new Builder<>(cls, clsArr);
    }

    public static <T> Component<T> intoSet(final T t10, Qualified<T> qualified) {
        return intoSetBuilder(qualified).factory(new ComponentFactory() { // from class: com.google.firebase.components.b
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.e(t10, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> intoSetBuilder(Qualified<T> qualified) {
        return builder(qualified).b();
    }

    @SafeVarargs
    public static <T> Component<T> of(final T t10, Class<T> cls, Class<? super T>... clsArr) {
        return builder(cls, clsArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.e
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.a(t10, componentContainer);
            }
        }).build();
    }

    public static <T> Builder<T> builder(Qualified<T> qualified) {
        return new Builder<>(qualified, new Qualified[0]);
    }

    @SafeVarargs
    public static <T> Component<T> of(final T t10, Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return builder(qualified, qualifiedArr).factory(new ComponentFactory() { // from class: com.google.firebase.components.a
            @Override // com.google.firebase.components.ComponentFactory
            public final Object create(ComponentContainer componentContainer) {
                return Component.c(t10, componentContainer);
            }
        }).build();
    }

    @SafeVarargs
    public static <T> Builder<T> builder(Qualified<T> qualified, Qualified<? super T>... qualifiedArr) {
        return new Builder<>(qualified, qualifiedArr);
    }
}
