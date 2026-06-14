package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ForwardingSet;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.google.common.collect.Ordering;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.primitives.Primitives;
import com.google.common.reflect.Invokable;
import com.google.common.reflect.TypeResolver;
import com.google.common.reflect.Types;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public abstract class TypeToken<T> extends TypeCapture<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Type f31187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient TypeResolver f31188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient TypeResolver f31189d;

    private static class Bounds {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Type[] f31195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f31196b;

        Bounds(Type[] typeArr, boolean z10) {
            this.f31195a = typeArr;
            this.f31196b = z10;
        }

        boolean a(Type type) {
            for (Type type2 : this.f31195a) {
                boolean zIsSubtypeOf = TypeToken.of(type2).isSubtypeOf(type);
                boolean z10 = this.f31196b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f31196b;
        }

        boolean b(Type type) {
            TypeToken<?> typeTokenOf = TypeToken.of(type);
            for (Type type2 : this.f31195a) {
                boolean zIsSubtypeOf = typeTokenOf.isSubtypeOf(type2);
                boolean z10 = this.f31196b;
                if (zIsSubtypeOf == z10) {
                    return z10;
                }
            }
            return !this.f31196b;
        }
    }

    private final class ClassSet extends TypeToken<T>.TypeSet {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private transient ImmutableSet f31197d;

        private ClassSet() {
            super();
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().classes();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            return this;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            throw new UnsupportedOperationException("classes().interfaces() not supported.");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            ImmutableSet immutableSet = this.f31197d;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet set = FluentIterable.from(TypeCollector.f31202a.a().d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.f31197d = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) TypeCollector.f31203b.a().c(TypeToken.this.D()));
        }
    }

    private final class InterfaceSet extends TypeToken<T>.TypeSet {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient TypeSet f31199d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private transient ImmutableSet f31200e;

        InterfaceSet(TypeSet typeSet) {
            super();
            this.f31199d = typeSet;
        }

        private Object readResolve() {
            return TypeToken.this.getTypes().interfaces();
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet classes() {
            throw new UnsupportedOperationException("interfaces().classes() not supported.");
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public TypeToken<T>.TypeSet interfaces() {
            return this;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.reflect.TypeToken.TypeSet, com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            ImmutableSet immutableSet = this.f31200e;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet set = FluentIterable.from(this.f31199d).filter(TypeFilter.INTERFACE_ONLY).toSet();
            this.f31200e = set;
            return set;
        }

        @Override // com.google.common.reflect.TypeToken.TypeSet
        public Set<Class<? super T>> rawTypes() {
            return FluentIterable.from(TypeCollector.f31203b.c(TypeToken.this.D())).filter(new Predicate() { // from class: com.google.common.reflect.c
                @Override // com.google.common.base.Predicate
                public final boolean apply(Object obj) {
                    return ((Class) obj).isInterface();
                }
            }).toSet();
        }
    }

    private static final class SimpleTypeToken<T> extends TypeToken<T> {
        SimpleTypeToken(Type type) {
            super(type);
        }
    }

    private static abstract class TypeCollector<K> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final TypeCollector f31202a = new TypeCollector<TypeToken<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable e(TypeToken typeToken) {
                return typeToken.x();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class f(TypeToken typeToken) {
                return typeToken.getRawType();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public TypeToken g(TypeToken typeToken) {
                return typeToken.A();
            }
        };

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final TypeCollector f31203b = new TypeCollector<Class<?>>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
            public Iterable e(Class cls) {
                return Arrays.asList(cls.getInterfaces());
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
            public Class f(Class cls) {
                return cls;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.TypeToken.TypeCollector
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Class g(Class cls) {
                return cls.getSuperclass();
            }
        };

        private static class ForwardingTypeCollector<K> extends TypeCollector<K> {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private final TypeCollector f31207c;

            ForwardingTypeCollector(TypeCollector typeCollector) {
                super();
                this.f31207c = typeCollector;
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            Iterable e(Object obj) {
                return this.f31207c.e(obj);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            Class f(Object obj) {
                return this.f31207c.f(obj);
            }

            @Override // com.google.common.reflect.TypeToken.TypeCollector
            Object g(Object obj) {
                return this.f31207c.g(obj);
            }
        }

        private TypeCollector() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        private int b(Object obj, Map map) {
            Integer num = (Integer) map.get(obj);
            if (num != null) {
                return num.intValue();
            }
            boolean zIsInterface = f(obj).isInterface();
            Iterator<T> it = e(obj).iterator();
            int iMax = zIsInterface;
            while (it.hasNext()) {
                iMax = Math.max(iMax, b(it.next(), map));
            }
            Object objG = g(obj);
            int iMax2 = iMax;
            if (objG != null) {
                iMax2 = Math.max(iMax, b(objG, map));
            }
            int i10 = iMax2 + 1;
            map.put(obj, Integer.valueOf(i10));
            return i10;
        }

        private static ImmutableList h(final Map map, final Comparator comparator) {
            return new Ordering<Object>() { // from class: com.google.common.reflect.TypeToken.TypeCollector.4
                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.collect.Ordering, java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    Comparator comparator2 = comparator;
                    Object obj3 = map.get(obj);
                    Objects.requireNonNull(obj3);
                    Object obj4 = map.get(obj2);
                    Objects.requireNonNull(obj4);
                    return comparator2.compare(obj3, obj4);
                }
            }.immutableSortedCopy(map.keySet());
        }

        final TypeCollector a() {
            return new ForwardingTypeCollector<K>(this) { // from class: com.google.common.reflect.TypeToken.TypeCollector.3
                @Override // com.google.common.reflect.TypeToken.TypeCollector
                ImmutableList c(Iterable iterable) {
                    ImmutableList.Builder builder = ImmutableList.builder();
                    for (T t10 : iterable) {
                        if (!f(t10).isInterface()) {
                            builder.add(t10);
                        }
                    }
                    return super.c(builder.build());
                }

                @Override // com.google.common.reflect.TypeToken.TypeCollector.ForwardingTypeCollector, com.google.common.reflect.TypeToken.TypeCollector
                Iterable e(Object obj) {
                    return ImmutableSet.of();
                }
            };
        }

        ImmutableList c(Iterable iterable) {
            HashMap mapNewHashMap = Maps.newHashMap();
            Iterator<T> it = iterable.iterator();
            while (it.hasNext()) {
                b(it.next(), mapNewHashMap);
            }
            return h(mapNewHashMap, Ordering.natural().reverse());
        }

        final ImmutableList d(Object obj) {
            return c(ImmutableList.of(obj));
        }

        abstract Iterable e(Object obj);

        abstract Class f(Object obj);

        abstract Object g(Object obj);
    }

    private enum TypeFilter implements Predicate<TypeToken<?>> {
        IGNORE_TYPE_VARIABLE_OR_WILDCARD { // from class: com.google.common.reflect.TypeToken.TypeFilter.1
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return ((((TypeToken) typeToken).f31187b instanceof TypeVariable) || (((TypeToken) typeToken).f31187b instanceof WildcardType)) ? false : true;
            }
        },
        INTERFACE_ONLY { // from class: com.google.common.reflect.TypeToken.TypeFilter.2
            @Override // com.google.common.base.Predicate
            public boolean apply(TypeToken<?> typeToken) {
                return typeToken.getRawType().isInterface();
            }
        }
    }

    public class TypeSet extends ForwardingSet<TypeToken<? super T>> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient ImmutableSet f31209b;

        TypeSet() {
        }

        public TypeToken<T>.TypeSet classes() {
            return new ClassSet();
        }

        public TypeToken<T>.TypeSet interfaces() {
            return new InterfaceSet(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
        public Set n() {
            ImmutableSet immutableSet = this.f31209b;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet set = FluentIterable.from(TypeCollector.f31202a.d(TypeToken.this)).filter(TypeFilter.IGNORE_TYPE_VARIABLE_OR_WILDCARD).toSet();
            this.f31209b = set;
            return set;
        }

        public Set<Class<? super T>> rawTypes() {
            return ImmutableSet.copyOf((Collection) TypeCollector.f31203b.c(TypeToken.this.D()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver B() {
        TypeResolver typeResolver = this.f31188c;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver typeResolverF = TypeResolver.f(this.f31187b);
        this.f31188c = typeResolverF;
        return typeResolverF;
    }

    private Type C() {
        Type type = this.f31187b;
        if (type instanceof ParameterizedType) {
            return ((ParameterizedType) type).getOwnerType();
        }
        if (type instanceof Class) {
            return ((Class) type).getEnclosingClass();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public ImmutableSet D() {
        final ImmutableSet.Builder builder = ImmutableSet.builder();
        new TypeVisitor(this) { // from class: com.google.common.reflect.TypeToken.4

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ TypeToken f31194c;

            {
                this.f31194c = this;
            }

            @Override // com.google.common.reflect.TypeVisitor
            void a(Class cls) {
                builder.add(cls);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void b(GenericArrayType genericArrayType) {
                builder.add(Types.h(TypeToken.of(genericArrayType.getGenericComponentType()).getRawType()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void c(ParameterizedType parameterizedType) {
                builder.add((Class) parameterizedType.getRawType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void d(TypeVariable typeVariable) {
                visit(typeVariable.getBounds());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void e(WildcardType wildcardType) {
                visit(wildcardType.getUpperBounds());
            }
        }.visit(this.f31187b);
        return builder.build();
    }

    private TypeToken E(Class cls, Type[] typeArr) {
        if (typeArr.length > 0) {
            return of(typeArr[0]).getSubtype(cls);
        }
        throw new IllegalArgumentException(cls + " isn't a subclass of " + this);
    }

    private TypeToken F(Class cls, Type[] typeArr) {
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.isSubtypeOf(cls)) {
                return typeTokenOf.getSupertype(cls);
            }
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    private boolean G(Type type, TypeVariable typeVariable) {
        if (this.f31187b.equals(type)) {
            return true;
        }
        if (!(type instanceof WildcardType)) {
            return r(this.f31187b).equals(r(type));
        }
        WildcardType wildcardTypeO = o(typeVariable, (WildcardType) type);
        return s(wildcardTypeO.getUpperBounds()).b(this.f31187b) && s(wildcardTypeO.getLowerBounds()).a(this.f31187b);
    }

    private boolean H(Type type) {
        Iterator<TypeToken<? super T>> it = getTypes().iterator();
        while (it.hasNext()) {
            Type typeC = it.next().C();
            if (typeC != null && of(typeC).isSubtypeOf(type)) {
                return true;
            }
        }
        return false;
    }

    private boolean I(GenericArrayType genericArrayType) {
        Type type = this.f31187b;
        if (!(type instanceof Class)) {
            if (type instanceof GenericArrayType) {
                return of(((GenericArrayType) type).getGenericComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
            }
            return false;
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            return of((Class) cls.getComponentType()).isSubtypeOf(genericArrayType.getGenericComponentType());
        }
        return false;
    }

    private boolean J(ParameterizedType parameterizedType) {
        Class<? super Object> rawType = of(parameterizedType).getRawType();
        if (!Q(rawType)) {
            return false;
        }
        TypeVariable<Class<? super Object>>[] typeParameters = rawType.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < typeParameters.length; i10++) {
            if (!of(v().resolveType(typeParameters[i10])).G(actualTypeArguments[i10], typeParameters[i10])) {
                return false;
            }
        }
        return Modifier.isStatic(((Class) parameterizedType.getRawType()).getModifiers()) || parameterizedType.getOwnerType() == null || H(parameterizedType.getOwnerType());
    }

    private boolean K(GenericArrayType genericArrayType) {
        Type type = this.f31187b;
        if (type instanceof Class) {
            Class cls = (Class) type;
            return !cls.isArray() ? cls.isAssignableFrom(Object[].class) : of(genericArrayType.getGenericComponentType()).isSubtypeOf(cls.getComponentType());
        }
        if (type instanceof GenericArrayType) {
            return of(genericArrayType.getGenericComponentType()).isSubtypeOf(((GenericArrayType) this.f31187b).getGenericComponentType());
        }
        return false;
    }

    private boolean L() {
        return Primitives.allWrapperTypes().contains(this.f31187b);
    }

    private static Type M(Type type) {
        return Types.JavaVersion.JAVA7.h(type);
    }

    private TypeToken O(Type type) {
        TypeToken<?> typeTokenOf = of(v().resolveType(type));
        typeTokenOf.f31189d = this.f31189d;
        typeTokenOf.f31188c = this.f31188c;
        return typeTokenOf;
    }

    private Type P(Class cls) {
        if ((this.f31187b instanceof Class) && (cls.getTypeParameters().length == 0 || getRawType().getTypeParameters().length != 0)) {
            return cls;
        }
        TypeToken typeTokenS = S(cls);
        return new TypeResolver().where(typeTokenS.getSupertype(getRawType()).f31187b, this.f31187b).resolveType(typeTokenS.f31187b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private boolean Q(Class cls) {
        UnmodifiableIterator it = D().iterator();
        while (it.hasNext()) {
            if (cls.isAssignableFrom((Class) it.next())) {
                return true;
            }
        }
        return false;
    }

    static TypeToken S(Class cls) {
        if (cls.isArray()) {
            return of(Types.j(S(cls.getComponentType()).f31187b));
        }
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type type = (!cls.isMemberClass() || Modifier.isStatic(cls.getModifiers())) ? null : S(cls.getEnclosingClass()).f31187b;
        return (typeParameters.length > 0 || !(type == null || type == cls.getEnclosingClass())) ? of(Types.m(type, cls, typeParameters)) : of(cls);
    }

    private static Bounds k(Type[] typeArr) {
        return new Bounds(typeArr, true);
    }

    private TypeToken l(Type type) {
        TypeToken<?> typeTokenOf = of(type);
        if (typeTokenOf.getRawType().isInterface()) {
            return null;
        }
        return typeTokenOf;
    }

    private ImmutableList m(Type[] typeArr) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type : typeArr) {
            TypeToken<?> typeTokenOf = of(type);
            if (typeTokenOf.getRawType().isInterface()) {
                builder.add(typeTokenOf);
            }
        }
        return builder.build();
    }

    private static Type n(TypeVariable typeVariable, Type type) {
        return type instanceof WildcardType ? o(typeVariable, (WildcardType) type) : r(type);
    }

    private static WildcardType o(TypeVariable typeVariable, WildcardType wildcardType) {
        Type[] bounds = typeVariable.getBounds();
        ArrayList arrayList = new ArrayList();
        for (Type type : wildcardType.getUpperBounds()) {
            if (!k(bounds).a(type)) {
                arrayList.add(r(type));
            }
        }
        return new Types.WildcardTypeImpl(wildcardType.getLowerBounds(), (Type[]) arrayList.toArray(new Type[0]));
    }

    public static <T> TypeToken<T> of(Class<T> cls) {
        return new SimpleTypeToken(cls);
    }

    private static ParameterizedType q(ParameterizedType parameterizedType) {
        Class cls = (Class) parameterizedType.getRawType();
        TypeVariable<Class<T>>[] typeParameters = cls.getTypeParameters();
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
        for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
            actualTypeArguments[i10] = n(typeParameters[i10], actualTypeArguments[i10]);
        }
        return Types.m(parameterizedType.getOwnerType(), cls, actualTypeArguments);
    }

    private static Type r(Type type) {
        return type instanceof ParameterizedType ? q((ParameterizedType) type) : type instanceof GenericArrayType ? Types.j(r(((GenericArrayType) type).getGenericComponentType())) : type;
    }

    private static Bounds s(Type[] typeArr) {
        return new Bounds(typeArr, false);
    }

    private TypeToken t(Class cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType != null) {
            TypeToken<?> componentType2 = getComponentType();
            Objects.requireNonNull(componentType2);
            return of(M(componentType2.getSubtype(componentType).f31187b));
        }
        throw new IllegalArgumentException(cls + " does not appear to be a subtype of " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TypeToken u(Class cls) {
        TypeToken<?> componentType = getComponentType();
        if (componentType != 0) {
            Class<?> componentType2 = cls.getComponentType();
            Objects.requireNonNull(componentType2);
            return of(M(componentType.getSupertype(componentType2).f31187b));
        }
        throw new IllegalArgumentException(cls + " isn't a super type of " + this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public TypeResolver v() {
        TypeResolver typeResolver = this.f31189d;
        if (typeResolver != null) {
            return typeResolver;
        }
        TypeResolver typeResolverD = TypeResolver.d(this.f31187b);
        this.f31189d = typeResolverD;
        return typeResolverD;
    }

    final TypeToken A() {
        Type type = this.f31187b;
        if (type instanceof TypeVariable) {
            return l(((TypeVariable) type).getBounds()[0]);
        }
        if (type instanceof WildcardType) {
            return l(((WildcardType) type).getUpperBounds()[0]);
        }
        Type genericSuperclass = getRawType().getGenericSuperclass();
        if (genericSuperclass == null) {
            return null;
        }
        return O(genericSuperclass);
    }

    final TypeToken N() {
        new TypeVisitor() { // from class: com.google.common.reflect.TypeToken.3
            @Override // com.google.common.reflect.TypeVisitor
            void b(GenericArrayType genericArrayType) {
                visit(genericArrayType.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void c(ParameterizedType parameterizedType) {
                visit(parameterizedType.getActualTypeArguments());
                visit(parameterizedType.getOwnerType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void d(TypeVariable typeVariable) {
                throw new IllegalArgumentException(TypeToken.this.f31187b + "contains a type variable and is not safe for the operation");
            }

            @Override // com.google.common.reflect.TypeVisitor
            void e(WildcardType wildcardType) {
                visit(wildcardType.getLowerBounds());
                visit(wildcardType.getUpperBounds());
            }
        }.visit(this.f31187b);
        return this;
    }

    public final Invokable<T, T> constructor(Constructor<?> constructor) {
        Preconditions.checkArgument(constructor.getDeclaringClass() == getRawType(), "%s not declared by %s", constructor, getRawType());
        return new Invokable.ConstructorInvokable<T>(constructor) { // from class: com.google.common.reflect.TypeToken.2
            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            Type[] a() {
                return TypeToken.this.v().k(super.a());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            Type[] b() {
                return TypeToken.this.B().k(super.b());
            }

            @Override // com.google.common.reflect.Invokable.ConstructorInvokable, com.google.common.reflect.Invokable
            Type c() {
                return TypeToken.this.v().resolveType(super.c());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                return getOwnerType() + "(" + Joiner.on(", ").join(b()) + ")";
            }
        };
    }

    public boolean equals(Object obj) {
        if (obj instanceof TypeToken) {
            return this.f31187b.equals(((TypeToken) obj).f31187b);
        }
        return false;
    }

    public final TypeToken<?> getComponentType() {
        Type typeI = Types.i(this.f31187b);
        if (typeI == null) {
            return null;
        }
        return of(typeI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Class<? super T> getRawType() {
        return (Class) D().iterator().next();
    }

    public final TypeToken<? extends T> getSubtype(Class<?> cls) {
        Preconditions.checkArgument(!(this.f31187b instanceof TypeVariable), "Cannot get subtype of type variable <%s>", this);
        Type type = this.f31187b;
        if (type instanceof WildcardType) {
            return E(cls, ((WildcardType) type).getLowerBounds());
        }
        if (isArray()) {
            return t(cls);
        }
        Preconditions.checkArgument(getRawType().isAssignableFrom(cls), "%s isn't a subclass of %s", cls, this);
        TypeToken<? extends T> typeToken = (TypeToken<? extends T>) of(P(cls));
        Preconditions.checkArgument(typeToken.isSubtypeOf((TypeToken<?>) this), "%s does not appear to be a subtype of %s", typeToken, this);
        return typeToken;
    }

    public final TypeToken<? super T> getSupertype(Class<? super T> cls) {
        Preconditions.checkArgument(Q(cls), "%s is not a super class of %s", cls, this);
        Type type = this.f31187b;
        return type instanceof TypeVariable ? F(cls, ((TypeVariable) type).getBounds()) : type instanceof WildcardType ? F(cls, ((WildcardType) type).getUpperBounds()) : cls.isArray() ? u(cls) : O(S(cls).f31187b);
    }

    public final Type getType() {
        return this.f31187b;
    }

    public final TypeToken<T>.TypeSet getTypes() {
        return new TypeSet();
    }

    public int hashCode() {
        return this.f31187b.hashCode();
    }

    public final boolean isArray() {
        return getComponentType() != null;
    }

    public final boolean isPrimitive() {
        Type type = this.f31187b;
        return (type instanceof Class) && ((Class) type).isPrimitive();
    }

    public final boolean isSubtypeOf(TypeToken<?> typeToken) {
        return isSubtypeOf(typeToken.getType());
    }

    public final boolean isSupertypeOf(TypeToken<?> typeToken) {
        return typeToken.isSubtypeOf(getType());
    }

    public final Invokable<T, Object> method(Method method) {
        Preconditions.checkArgument(Q(method.getDeclaringClass()), "%s not declared by %s", method, this);
        return new Invokable.MethodInvokable<T>(method) { // from class: com.google.common.reflect.TypeToken.1
            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            Type[] a() {
                return TypeToken.this.v().k(super.a());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            Type[] b() {
                return TypeToken.this.B().k(super.b());
            }

            @Override // com.google.common.reflect.Invokable.MethodInvokable, com.google.common.reflect.Invokable
            Type c() {
                return TypeToken.this.v().resolveType(super.c());
            }

            @Override // com.google.common.reflect.Invokable
            public TypeToken<T> getOwnerType() {
                return TypeToken.this;
            }

            @Override // com.google.common.reflect.Invokable
            public String toString() {
                return getOwnerType() + "." + super.toString();
            }
        };
    }

    public final TypeToken<?> resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return of(B().resolveType(type));
    }

    public String toString() {
        return Types.s(this.f31187b);
    }

    public final TypeToken<T> unwrap() {
        return L() ? of(Primitives.unwrap((Class) this.f31187b)) : this;
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, TypeToken<X> typeToken) {
        return new SimpleTypeToken(new TypeResolver().m(ImmutableMap.of(new TypeResolver.TypeVariableKey(typeParameter.f31173b), typeToken.f31187b)).resolveType(this.f31187b));
    }

    public final TypeToken<T> wrap() {
        return isPrimitive() ? of(Primitives.wrap((Class) this.f31187b)) : this;
    }

    protected Object writeReplace() {
        return of(new TypeResolver().resolveType(this.f31187b));
    }

    final ImmutableList x() {
        Type type = this.f31187b;
        if (type instanceof TypeVariable) {
            return m(((TypeVariable) type).getBounds());
        }
        if (type instanceof WildcardType) {
            return m(((WildcardType) type).getUpperBounds());
        }
        ImmutableList.Builder builder = ImmutableList.builder();
        for (Type type2 : getRawType().getGenericInterfaces()) {
            builder.add(O(type2));
        }
        return builder.build();
    }

    private TypeToken(Type type) {
        this.f31187b = (Type) Preconditions.checkNotNull(type);
    }

    public static TypeToken<?> of(Type type) {
        return new SimpleTypeToken(type);
    }

    public final boolean isSubtypeOf(Type type) {
        Preconditions.checkNotNull(type);
        if (type instanceof WildcardType) {
            return k(((WildcardType) type).getLowerBounds()).b(this.f31187b);
        }
        Type type2 = this.f31187b;
        if (type2 instanceof WildcardType) {
            return k(((WildcardType) type2).getUpperBounds()).a(type);
        }
        if (type2 instanceof TypeVariable) {
            return type2.equals(type) || k(((TypeVariable) this.f31187b).getBounds()).a(type);
        }
        if (type2 instanceof GenericArrayType) {
            return of(type).K((GenericArrayType) this.f31187b);
        }
        if (type instanceof Class) {
            return Q((Class) type);
        }
        if (type instanceof ParameterizedType) {
            return J((ParameterizedType) type);
        }
        if (type instanceof GenericArrayType) {
            return I((GenericArrayType) type);
        }
        return false;
    }

    public final boolean isSupertypeOf(Type type) {
        return of(type).isSubtypeOf(getType());
    }

    public final <X> TypeToken<T> where(TypeParameter<X> typeParameter, Class<X> cls) {
        return where(typeParameter, of((Class) cls));
    }
}
