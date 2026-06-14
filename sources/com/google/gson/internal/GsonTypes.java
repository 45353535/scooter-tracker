package com.google.gson.internal;

import com.applovin.shadow.okhttp3.HttpUrl;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Properties;

/* JADX INFO: loaded from: classes9.dex */
public final class GsonTypes {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Type[] f33552a = new Type[0];

    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f33553b;

        public GenericArrayTypeImpl(Type type) {
            Objects.requireNonNull(type);
            this.f33553b = GsonTypes.canonicalize(type);
        }

        public boolean equals(Object obj) {
            return (obj instanceof GenericArrayType) && GsonTypes.equals(this, (GenericArrayType) obj);
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f33553b;
        }

        public int hashCode() {
            return this.f33553b.hashCode();
        }

        public String toString() {
            return GsonTypes.typeToString(this.f33553b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f33554b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type f33555c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Type[] f33556d;

        public ParameterizedTypeImpl(Type type, Class<?> cls, Type... typeArr) {
            Objects.requireNonNull(cls);
            if (type == null && GsonTypes.requiresOwnerType(cls)) {
                throw new IllegalArgumentException("Must specify owner type for " + cls);
            }
            this.f33554b = type == null ? null : GsonTypes.canonicalize(type);
            this.f33555c = GsonTypes.canonicalize(cls);
            Type[] typeArr2 = (Type[]) typeArr.clone();
            this.f33556d = typeArr2;
            int length = typeArr2.length;
            for (int i10 = 0; i10 < length; i10++) {
                Objects.requireNonNull(this.f33556d[i10]);
                GsonTypes.a(this.f33556d[i10]);
                Type[] typeArr3 = this.f33556d;
                typeArr3[i10] = GsonTypes.canonicalize(typeArr3[i10]);
            }
        }

        private static int a(Object obj) {
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public boolean equals(Object obj) {
            return (obj instanceof ParameterizedType) && GsonTypes.equals(this, (ParameterizedType) obj);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return (Type[]) this.f33556d.clone();
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f33554b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f33555c;
        }

        public int hashCode() {
            return (Arrays.hashCode(this.f33556d) ^ this.f33555c.hashCode()) ^ a(this.f33554b);
        }

        public String toString() {
            int length = this.f33556d.length;
            if (length == 0) {
                return GsonTypes.typeToString(this.f33555c);
            }
            StringBuilder sb2 = new StringBuilder((length + 1) * 30);
            sb2.append(GsonTypes.typeToString(this.f33555c));
            sb2.append("<");
            sb2.append(GsonTypes.typeToString(this.f33556d[0]));
            for (int i10 = 1; i10 < length; i10++) {
                sb2.append(", ");
                sb2.append(GsonTypes.typeToString(this.f33556d[i10]));
            }
            sb2.append(">");
            return sb2.toString();
        }
    }

    private static final class WildcardTypeImpl implements WildcardType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f33557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Type f33558c;

        public WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            GsonPreconditions.checkArgument(typeArr2.length <= 1);
            GsonPreconditions.checkArgument(typeArr.length == 1);
            if (typeArr2.length != 1) {
                Objects.requireNonNull(typeArr[0]);
                GsonTypes.a(typeArr[0]);
                this.f33558c = null;
                this.f33557b = GsonTypes.canonicalize(typeArr[0]);
                return;
            }
            Objects.requireNonNull(typeArr2[0]);
            GsonTypes.a(typeArr2[0]);
            GsonPreconditions.checkArgument(typeArr[0] == Object.class);
            this.f33558c = GsonTypes.canonicalize(typeArr2[0]);
            this.f33557b = Object.class;
        }

        public boolean equals(Object obj) {
            return (obj instanceof WildcardType) && GsonTypes.equals(this, (WildcardType) obj);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            Type type = this.f33558c;
            return type != null ? new Type[]{type} : GsonTypes.f33552a;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return new Type[]{this.f33557b};
        }

        public int hashCode() {
            Type type = this.f33558c;
            return (type != null ? type.hashCode() + 31 : 1) ^ (this.f33557b.hashCode() + 31);
        }

        public String toString() {
            if (this.f33558c != null) {
                return "? super " + GsonTypes.typeToString(this.f33558c);
            }
            if (this.f33557b == Object.class) {
                return "?";
            }
            return "? extends " + GsonTypes.typeToString(this.f33557b);
        }
    }

    static void a(Type type) {
        GsonPreconditions.checkArgument(((type instanceof Class) && ((Class) type).isPrimitive()) ? false : true);
    }

    public static GenericArrayType arrayOf(Type type) {
        return new GenericArrayTypeImpl(type);
    }

    private static Class b(TypeVariable typeVariable) {
        GenericDeclaration genericDeclaration = typeVariable.getGenericDeclaration();
        if (genericDeclaration instanceof Class) {
            return (Class) genericDeclaration;
        }
        return null;
    }

    private static boolean c(Object obj, Object obj2) {
        return Objects.equals(obj, obj2);
    }

    public static Type canonicalize(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            return cls.isArray() ? new GenericArrayTypeImpl(canonicalize(cls.getComponentType())) : cls;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            return new ParameterizedTypeImpl(parameterizedType.getOwnerType(), (Class) parameterizedType.getRawType(), parameterizedType.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            return new GenericArrayTypeImpl(((GenericArrayType) type).getGenericComponentType());
        }
        if (!(type instanceof WildcardType)) {
            return type;
        }
        WildcardType wildcardType = (WildcardType) type;
        return new WildcardTypeImpl(wildcardType.getUpperBounds(), wildcardType.getLowerBounds());
    }

    private static Type d(Type type, Class cls, Class cls2) {
        if (cls2 == cls) {
            return type;
        }
        if (cls2.isInterface()) {
            Class<?>[] interfaces = cls.getInterfaces();
            int length = interfaces.length;
            for (int i10 = 0; i10 < length; i10++) {
                Class<?> cls3 = interfaces[i10];
                if (cls3 == cls2) {
                    return cls.getGenericInterfaces()[i10];
                }
                if (cls2.isAssignableFrom(cls3)) {
                    return d(cls.getGenericInterfaces()[i10], interfaces[i10], cls2);
                }
            }
        }
        if (!cls.isInterface()) {
            while (cls != Object.class) {
                Class<?> superclass = cls.getSuperclass();
                if (superclass == cls2) {
                    return cls.getGenericSuperclass();
                }
                if (cls2.isAssignableFrom(superclass)) {
                    return d(cls.getGenericSuperclass(), superclass, cls2);
                }
                cls = superclass;
            }
        }
        return cls2;
    }

    private static Type e(Type type, Class cls, Class cls2) {
        if (type instanceof WildcardType) {
            type = ((WildcardType) type).getUpperBounds()[0];
        }
        GsonPreconditions.checkArgument(cls2.isAssignableFrom(cls));
        return resolve(type, cls, d(type, cls, cls2));
    }

    public static boolean equals(Type type, Type type2) {
        if (type == type2) {
            return true;
        }
        if (type instanceof Class) {
            return type.equals(type2);
        }
        if (type instanceof ParameterizedType) {
            if (!(type2 instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) type;
            ParameterizedType parameterizedType2 = (ParameterizedType) type2;
            return c(parameterizedType.getOwnerType(), parameterizedType2.getOwnerType()) && parameterizedType.getRawType().equals(parameterizedType2.getRawType()) && Arrays.equals(parameterizedType.getActualTypeArguments(), parameterizedType2.getActualTypeArguments());
        }
        if (type instanceof GenericArrayType) {
            if (type2 instanceof GenericArrayType) {
                return equals(((GenericArrayType) type).getGenericComponentType(), ((GenericArrayType) type2).getGenericComponentType());
            }
            return false;
        }
        if (type instanceof WildcardType) {
            if (!(type2 instanceof WildcardType)) {
                return false;
            }
            WildcardType wildcardType = (WildcardType) type;
            WildcardType wildcardType2 = (WildcardType) type2;
            return Arrays.equals(wildcardType.getUpperBounds(), wildcardType2.getUpperBounds()) && Arrays.equals(wildcardType.getLowerBounds(), wildcardType2.getLowerBounds());
        }
        if (!(type instanceof TypeVariable) || !(type2 instanceof TypeVariable)) {
            return false;
        }
        TypeVariable typeVariable = (TypeVariable) type;
        TypeVariable typeVariable2 = (TypeVariable) type2;
        return Objects.equals(typeVariable.getGenericDeclaration(), typeVariable2.getGenericDeclaration()) && typeVariable.getName().equals(typeVariable2.getName());
    }

    private static int f(Object[] objArr, Object obj) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (obj.equals(objArr[i10])) {
                return i10;
            }
        }
        throw new NoSuchElementException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0049  */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.lang.Object, java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v11, types: [java.lang.reflect.Type] */
    /* JADX WARN: Type inference failed for: r12v2, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v4, types: [java.lang.reflect.WildcardType] */
    /* JADX WARN: Type inference failed for: r12v5, types: [java.lang.reflect.ParameterizedType] */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.reflect.GenericArrayType] */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0, types: [java.util.Map] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.reflect.Type g(java.lang.reflect.Type r10, java.lang.Class r11, java.lang.reflect.Type r12, java.util.Map r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.GsonTypes.g(java.lang.reflect.Type, java.lang.Class, java.lang.reflect.Type, java.util.Map):java.lang.reflect.Type");
    }

    public static Type getArrayComponentType(Type type) {
        return type instanceof GenericArrayType ? ((GenericArrayType) type).getGenericComponentType() : ((Class) type).getComponentType();
    }

    public static Type getCollectionElementType(Type type, Class<?> cls) {
        Type typeE = e(type, cls, Collection.class);
        return typeE instanceof ParameterizedType ? ((ParameterizedType) typeE).getActualTypeArguments()[0] : Object.class;
    }

    public static Type[] getMapKeyAndValueTypes(Type type, Class<?> cls) {
        if (Properties.class.isAssignableFrom(cls)) {
            return new Type[]{String.class, String.class};
        }
        Type typeE = e(type, cls, Map.class);
        return typeE instanceof ParameterizedType ? ((ParameterizedType) typeE).getActualTypeArguments() : new Type[]{Object.class, Object.class};
    }

    public static Class<?> getRawType(Type type) {
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            GsonPreconditions.checkArgument(rawType instanceof Class);
            return (Class) rawType;
        }
        if (type instanceof GenericArrayType) {
            return Array.newInstance(getRawType(((GenericArrayType) type).getGenericComponentType()), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            return getRawType(((WildcardType) type).getUpperBounds()[0]);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + (type == null ? "null" : type.getClass().getName()));
    }

    private static Type h(Type type, Class cls, TypeVariable typeVariable) {
        Class clsB = b(typeVariable);
        if (clsB != null) {
            Type typeD = d(type, cls, clsB);
            if (typeD instanceof ParameterizedType) {
                return ((ParameterizedType) typeD).getActualTypeArguments()[f(clsB.getTypeParameters(), typeVariable)];
            }
        }
        return typeVariable;
    }

    public static ParameterizedType newParameterizedTypeWithOwner(Type type, Class<?> cls, Type... typeArr) {
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    public static boolean requiresOwnerType(Type type) {
        if (type instanceof Class) {
            Class cls = (Class) type;
            if (!Modifier.isStatic(cls.getModifiers()) && cls.getDeclaringClass() != null) {
                return true;
            }
        }
        return false;
    }

    public static Type resolve(Type type, Class<?> cls, Type type2) {
        return g(type, cls, type2, new HashMap());
    }

    public static WildcardType subtypeOf(Type type) {
        return new WildcardTypeImpl(type instanceof WildcardType ? ((WildcardType) type).getUpperBounds() : new Type[]{type}, f33552a);
    }

    public static WildcardType supertypeOf(Type type) {
        return new WildcardTypeImpl(new Type[]{Object.class}, type instanceof WildcardType ? ((WildcardType) type).getLowerBounds() : new Type[]{type});
    }

    public static String typeToString(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
