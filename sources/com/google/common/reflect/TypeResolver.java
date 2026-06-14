package com.google.common.reflect;

import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.reflect.Types;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
public final class TypeResolver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TypeTable f31174a;

    private static final class TypeMappingIntrospector extends TypeVisitor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Map f31177b = Maps.newHashMap();

        private TypeMappingIntrospector() {
        }

        static ImmutableMap f(Type type) {
            Preconditions.checkNotNull(type);
            TypeMappingIntrospector typeMappingIntrospector = new TypeMappingIntrospector();
            typeMappingIntrospector.visit(type);
            return ImmutableMap.copyOf(typeMappingIntrospector.f31177b);
        }

        private void g(TypeVariableKey typeVariableKey, Type type) {
            if (this.f31177b.containsKey(typeVariableKey)) {
                return;
            }
            Type type2 = type;
            while (type2 != null) {
                if (typeVariableKey.a(type2)) {
                    while (type != null) {
                        type = (Type) this.f31177b.remove(TypeVariableKey.c(type));
                    }
                    return;
                }
                type2 = (Type) this.f31177b.get(TypeVariableKey.c(type2));
            }
            this.f31177b.put(typeVariableKey, type);
        }

        @Override // com.google.common.reflect.TypeVisitor
        void a(Class cls) {
            visit(cls.getGenericSuperclass());
            visit(cls.getGenericInterfaces());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void c(ParameterizedType parameterizedType) {
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            Preconditions.checkState(typeParameters.length == actualTypeArguments.length);
            for (int i10 = 0; i10 < typeParameters.length; i10++) {
                g(new TypeVariableKey(typeParameters[i10]), actualTypeArguments[i10]);
            }
            visit(cls);
            visit(parameterizedType.getOwnerType());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void d(TypeVariable typeVariable) {
            visit(typeVariable.getBounds());
        }

        @Override // com.google.common.reflect.TypeVisitor
        void e(WildcardType wildcardType) {
            visit(wildcardType.getUpperBounds());
        }
    }

    static final class TypeVariableKey {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeVariable f31182a;

        TypeVariableKey(TypeVariable typeVariable) {
            this.f31182a = (TypeVariable) Preconditions.checkNotNull(typeVariable);
        }

        private boolean b(TypeVariable typeVariable) {
            return this.f31182a.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) && this.f31182a.getName().equals(typeVariable.getName());
        }

        static TypeVariableKey c(Type type) {
            if (type instanceof TypeVariable) {
                return new TypeVariableKey((TypeVariable) type);
            }
            return null;
        }

        boolean a(Type type) {
            if (type instanceof TypeVariable) {
                return b((TypeVariable) type);
            }
            return false;
        }

        public boolean equals(Object obj) {
            if (obj instanceof TypeVariableKey) {
                return b(((TypeVariableKey) obj).f31182a);
            }
            return false;
        }

        public int hashCode() {
            return Objects.hashCode(this.f31182a.getGenericDeclaration(), this.f31182a.getName());
        }

        public String toString() {
            return this.f31182a.toString();
        }
    }

    private static class WildcardCapturer {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final WildcardCapturer f31183b = new WildcardCapturer();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicInteger f31184a;

        private Type c(Type type) {
            if (type == null) {
                return null;
            }
            return a(type);
        }

        private WildcardCapturer d(final TypeVariable typeVariable) {
            return new WildcardCapturer(this, this.f31184a) { // from class: com.google.common.reflect.TypeResolver.WildcardCapturer.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ WildcardCapturer f31186d;

                {
                    this.f31186d = this;
                }

                @Override // com.google.common.reflect.TypeResolver.WildcardCapturer
                TypeVariable b(Type[] typeArr) {
                    LinkedHashSet linkedHashSet = new LinkedHashSet(Arrays.asList(typeArr));
                    linkedHashSet.addAll(Arrays.asList(typeVariable.getBounds()));
                    if (linkedHashSet.size() > 1) {
                        linkedHashSet.remove(Object.class);
                    }
                    return super.b((Type[]) linkedHashSet.toArray(new Type[0]));
                }
            };
        }

        private WildcardCapturer e() {
            return new WildcardCapturer(this.f31184a);
        }

        final Type a(Type type) {
            Preconditions.checkNotNull(type);
            if ((type instanceof Class) || (type instanceof TypeVariable)) {
                return type;
            }
            if (type instanceof GenericArrayType) {
                return Types.j(e().a(((GenericArrayType) type).getGenericComponentType()));
            }
            if (!(type instanceof ParameterizedType)) {
                if (!(type instanceof WildcardType)) {
                    throw new AssertionError("must have been one of the known types");
                }
                WildcardType wildcardType = (WildcardType) type;
                return wildcardType.getLowerBounds().length == 0 ? b(wildcardType.getUpperBounds()) : type;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            Class cls = (Class) parameterizedType.getRawType();
            TypeVariable[] typeParameters = cls.getTypeParameters();
            Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
            for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                actualTypeArguments[i10] = d(typeParameters[i10]).a(actualTypeArguments[i10]);
            }
            return Types.m(e().c(parameterizedType.getOwnerType()), cls, actualTypeArguments);
        }

        TypeVariable b(Type[] typeArr) {
            return Types.k(WildcardCapturer.class, "capture#" + this.f31184a.incrementAndGet() + "-of ? extends " + Joiner.on('&').join(typeArr), typeArr);
        }

        private WildcardCapturer() {
            this(new AtomicInteger());
        }

        private WildcardCapturer(AtomicInteger atomicInteger) {
            this.f31184a = atomicInteger;
        }
    }

    static TypeResolver d(Type type) {
        return new TypeResolver().m(TypeMappingIntrospector.f(type));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object e(Class cls, Object obj) {
        try {
            return cls.cast(obj);
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException(obj + " is not a " + cls.getSimpleName());
        }
    }

    static TypeResolver f(Type type) {
        return new TypeResolver().m(TypeMappingIntrospector.f(WildcardCapturer.f31183b.a(type)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void g(final Map map, Type type, final Type type2) {
        if (type.equals(type2)) {
            return;
        }
        new TypeVisitor() { // from class: com.google.common.reflect.TypeResolver.1
            @Override // com.google.common.reflect.TypeVisitor
            void a(Class cls) {
                if (type2 instanceof WildcardType) {
                    return;
                }
                throw new IllegalArgumentException("No type mapping from " + cls + " to " + type2);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void b(GenericArrayType genericArrayType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                Type typeI = Types.i(type3);
                Preconditions.checkArgument(typeI != null, "%s is not an array type.", type2);
                TypeResolver.g(map, genericArrayType.getGenericComponentType(), typeI);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void c(ParameterizedType parameterizedType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    return;
                }
                ParameterizedType parameterizedType2 = (ParameterizedType) TypeResolver.e(ParameterizedType.class, type3);
                if (parameterizedType.getOwnerType() != null && parameterizedType2.getOwnerType() != null) {
                    TypeResolver.g(map, parameterizedType.getOwnerType(), parameterizedType2.getOwnerType());
                }
                Preconditions.checkArgument(parameterizedType.getRawType().equals(parameterizedType2.getRawType()), "Inconsistent raw type: %s vs. %s", parameterizedType, type2);
                Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();
                Type[] actualTypeArguments2 = parameterizedType2.getActualTypeArguments();
                Preconditions.checkArgument(actualTypeArguments.length == actualTypeArguments2.length, "%s not compatible with %s", parameterizedType, parameterizedType2);
                for (int i10 = 0; i10 < actualTypeArguments.length; i10++) {
                    TypeResolver.g(map, actualTypeArguments[i10], actualTypeArguments2[i10]);
                }
            }

            @Override // com.google.common.reflect.TypeVisitor
            void d(TypeVariable typeVariable) {
                map.put(new TypeVariableKey(typeVariable), type2);
            }

            @Override // com.google.common.reflect.TypeVisitor
            void e(WildcardType wildcardType) {
                Type type3 = type2;
                if (type3 instanceof WildcardType) {
                    WildcardType wildcardType2 = (WildcardType) type3;
                    Type[] upperBounds = wildcardType.getUpperBounds();
                    Type[] upperBounds2 = wildcardType2.getUpperBounds();
                    Type[] lowerBounds = wildcardType.getLowerBounds();
                    Type[] lowerBounds2 = wildcardType2.getLowerBounds();
                    Preconditions.checkArgument(upperBounds.length == upperBounds2.length && lowerBounds.length == lowerBounds2.length, "Incompatible type: %s vs. %s", wildcardType, type2);
                    for (int i10 = 0; i10 < upperBounds.length; i10++) {
                        TypeResolver.g(map, upperBounds[i10], upperBounds2[i10]);
                    }
                    for (int i11 = 0; i11 < lowerBounds.length; i11++) {
                        TypeResolver.g(map, lowerBounds[i11], lowerBounds2[i11]);
                    }
                }
            }
        }.visit(type);
    }

    private Type h(GenericArrayType genericArrayType) {
        return Types.j(resolveType(genericArrayType.getGenericComponentType()));
    }

    private ParameterizedType i(ParameterizedType parameterizedType) {
        Type ownerType = parameterizedType.getOwnerType();
        return Types.m(ownerType == null ? null : resolveType(ownerType), (Class) resolveType(parameterizedType.getRawType()), j(parameterizedType.getActualTypeArguments()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Type[] j(Type[] typeArr) {
        Type[] typeArr2 = new Type[typeArr.length];
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr2[i10] = resolveType(typeArr[i10]);
        }
        return typeArr2;
    }

    private WildcardType l(WildcardType wildcardType) {
        return new Types.WildcardTypeImpl(j(wildcardType.getLowerBounds()), j(wildcardType.getUpperBounds()));
    }

    Type[] k(Type[] typeArr) {
        for (int i10 = 0; i10 < typeArr.length; i10++) {
            typeArr[i10] = resolveType(typeArr[i10]);
        }
        return typeArr;
    }

    TypeResolver m(Map map) {
        return new TypeResolver(this.f31174a.b(map));
    }

    public Type resolveType(Type type) {
        Preconditions.checkNotNull(type);
        return type instanceof TypeVariable ? this.f31174a.a((TypeVariable) type) : type instanceof ParameterizedType ? i((ParameterizedType) type) : type instanceof GenericArrayType ? h((GenericArrayType) type) : type instanceof WildcardType ? l((WildcardType) type) : type;
    }

    public TypeResolver where(Type type, Type type2) {
        HashMap mapNewHashMap = Maps.newHashMap();
        g(mapNewHashMap, (Type) Preconditions.checkNotNull(type), (Type) Preconditions.checkNotNull(type2));
        return m(mapNewHashMap);
    }

    private static class TypeTable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableMap f31178a;

        TypeTable() {
            this.f31178a = ImmutableMap.of();
        }

        final Type a(final TypeVariable typeVariable) {
            return resolveInternal(typeVariable, new TypeTable(this) { // from class: com.google.common.reflect.TypeResolver.TypeTable.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ TypeTable f31181d;

                {
                    this.f31181d = this;
                }

                @Override // com.google.common.reflect.TypeResolver.TypeTable
                public Type resolveInternal(TypeVariable<?> typeVariable2, TypeTable typeTable) {
                    return typeVariable2.getGenericDeclaration().equals(typeVariable.getGenericDeclaration()) ? typeVariable2 : this.resolveInternal(typeVariable2, typeTable);
                }
            });
        }

        final TypeTable b(Map map) {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            builder.putAll(this.f31178a);
            for (Map.Entry entry : map.entrySet()) {
                TypeVariableKey typeVariableKey = (TypeVariableKey) entry.getKey();
                Type type = (Type) entry.getValue();
                Preconditions.checkArgument(!typeVariableKey.a(type), "Type variable %s bound to itself", typeVariableKey);
                builder.put(typeVariableKey, type);
            }
            return new TypeTable(builder.buildOrThrow());
        }

        Type resolveInternal(TypeVariable typeVariable, TypeTable typeTable) {
            Type type = (Type) this.f31178a.get(new TypeVariableKey(typeVariable));
            if (type != null) {
                return new TypeResolver(typeTable).resolveType(type);
            }
            Type[] bounds = typeVariable.getBounds();
            if (bounds.length != 0) {
                Type[] typeArrJ = new TypeResolver(typeTable).j(bounds);
                if (!Types.NativeTypeVariableEquals.f31219a || !Arrays.equals(bounds, typeArrJ)) {
                    return Types.k(typeVariable.getGenericDeclaration(), typeVariable.getName(), typeArrJ);
                }
            }
            return typeVariable;
        }

        private TypeTable(ImmutableMap immutableMap) {
            this.f31178a = immutableMap;
        }
    }

    public TypeResolver() {
        this.f31174a = new TypeTable();
    }

    private TypeResolver(TypeTable typeTable) {
        this.f31174a = typeTable;
    }
}
