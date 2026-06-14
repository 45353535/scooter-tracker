package com.google.common.reflect;

import com.applovin.shadow.okhttp3.HttpUrl;
import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.UnmodifiableIterator;
import j$.util.Objects;
import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.AccessControlException;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class Types {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Joiner f31212a = Joiner.on(", ").useForNull("null");

    private enum ClassOwnership {
        OWNED_BY_ENCLOSING_CLASS { // from class: com.google.common.reflect.Types.ClassOwnership.1
            @Override // com.google.common.reflect.Types.ClassOwnership
            Class h(Class cls) {
                return cls.getEnclosingClass();
            }
        },
        LOCAL_CLASS_HAS_NO_OWNER { // from class: com.google.common.reflect.Types.ClassOwnership.2
            @Override // com.google.common.reflect.Types.ClassOwnership
            Class h(Class cls) {
                if (cls.isLocalClass()) {
                    return null;
                }
                return cls.getEnclosingClass();
            }
        };


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final ClassOwnership f31214b = g();

        private static ClassOwnership g() {
            new C1LocalClass<String>() { // from class: com.google.common.reflect.Types.ClassOwnership.3
            };
            ParameterizedType parameterizedType = (ParameterizedType) AnonymousClass3.class.getGenericSuperclass();
            Objects.requireNonNull(parameterizedType);
            ParameterizedType parameterizedType2 = parameterizedType;
            for (ClassOwnership classOwnership : values()) {
                if (classOwnership.h(C1LocalClass.class) == parameterizedType2.getOwnerType()) {
                    return classOwnership;
                }
            }
            throw new AssertionError();
        }

        abstract Class h(Class cls);
    }

    private static final class GenericArrayTypeImpl implements GenericArrayType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f31216b;

        GenericArrayTypeImpl(Type type) {
            this.f31216b = JavaVersion.f31217b.k(type);
        }

        public boolean equals(Object obj) {
            if (obj instanceof GenericArrayType) {
                return com.google.common.base.Objects.equal(getGenericComponentType(), ((GenericArrayType) obj).getGenericComponentType());
            }
            return false;
        }

        @Override // java.lang.reflect.GenericArrayType
        public Type getGenericComponentType() {
            return this.f31216b;
        }

        public int hashCode() {
            return this.f31216b.hashCode();
        }

        public String toString() {
            return Types.s(this.f31216b) + HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
        }
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 com.google.common.reflect.Types$JavaVersion, still in use, count: 1, list:
  (r0v0 com.google.common.reflect.Types$JavaVersion) from 0x0063: SPUT (r0v0 com.google.common.reflect.Types$JavaVersion) (LINE:100) com.google.common.reflect.Types.JavaVersion.b com.google.common.reflect.Types$JavaVersion
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:99)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:98)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:252)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    static abstract class JavaVersion {
        JAVA6 { // from class: com.google.common.reflect.Types.JavaVersion.1
            @Override // com.google.common.reflect.Types.JavaVersion
            Type k(Type type) {
                Preconditions.checkNotNull(type);
                if (!(type instanceof Class)) {
                    return type;
                }
                Class cls = (Class) type;
                return cls.isArray() ? new GenericArrayTypeImpl(cls.getComponentType()) : type;
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.reflect.Types.JavaVersion
            /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
            public GenericArrayType h(Type type) {
                return new GenericArrayTypeImpl(type);
            }
        },
        JAVA7 { // from class: com.google.common.reflect.Types.JavaVersion.2
            @Override // com.google.common.reflect.Types.JavaVersion
            Type h(Type type) {
                return type instanceof Class ? Types.h((Class) type) : new GenericArrayTypeImpl(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type k(Type type) {
                return (Type) Preconditions.checkNotNull(type);
            }
        },
        JAVA8 { // from class: com.google.common.reflect.Types.JavaVersion.3
            @Override // com.google.common.reflect.Types.JavaVersion
            Type h(Type type) {
                return JavaVersion.JAVA7.h(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String i(Type type) {
                try {
                    return (String) Type.class.getMethod("getTypeName", null).invoke(type, null);
                } catch (IllegalAccessException e10) {
                    e = e10;
                    throw new RuntimeException(e);
                } catch (NoSuchMethodException unused) {
                    throw new AssertionError("Type.getTypeName should be available in Java 8");
                } catch (InvocationTargetException e11) {
                    e = e11;
                    throw new RuntimeException(e);
                }
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type k(Type type) {
                return JavaVersion.JAVA7.k(type);
            }
        },
        JAVA9 { // from class: com.google.common.reflect.Types.JavaVersion.4
            @Override // com.google.common.reflect.Types.JavaVersion
            boolean g() {
                return false;
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type h(Type type) {
                return JavaVersion.JAVA8.h(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            String i(Type type) {
                return JavaVersion.JAVA8.i(type);
            }

            @Override // com.google.common.reflect.Types.JavaVersion
            Type k(Type type) {
                return JavaVersion.JAVA8.k(type);
            }
        };


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final JavaVersion f31217b;

        static {
            if (AnnotatedElement.class.isAssignableFrom(TypeVariable.class)) {
                if (new TypeCapture<Map.Entry<String, int[][]>>() { // from class: com.google.common.reflect.Types.JavaVersion.5
                }.d().toString().contains("java.util.Map.java.util.Map")) {
                    f31217b = javaVersion;
                    return;
                } else {
                    f31217b = javaVersion;
                    return;
                }
            }
            if (new TypeCapture<int[]>() { // from class: com.google.common.reflect.Types.JavaVersion.6
            }.d() instanceof Class) {
                f31217b = javaVersion;
            } else {
                f31217b = javaVersion;
            }
        }

        private JavaVersion() {
        }

        public static JavaVersion valueOf(String str) {
            return (JavaVersion) Enum.valueOf(JavaVersion.class, str);
        }

        public static JavaVersion[] values() {
            return (JavaVersion[]) f31218c.clone();
        }

        boolean g() {
            return true;
        }

        abstract Type h(Type type);

        String i(Type type) {
            return Types.s(type);
        }

        final ImmutableList j(Type[] typeArr) {
            ImmutableList.Builder builder = ImmutableList.builder();
            for (Type type : typeArr) {
                builder.add(k(type));
            }
            return builder.build();
        }

        abstract Type k(Type type);
    }

    static final class NativeTypeVariableEquals<X> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final boolean f31219a = !NativeTypeVariableEquals.class.getTypeParameters()[0].equals(Types.k(NativeTypeVariableEquals.class, "X", new Type[0]));
    }

    private static final class ParameterizedTypeImpl implements ParameterizedType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Type f31220b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList f31221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Class f31222d;

        ParameterizedTypeImpl(Type type, Class cls, Type[] typeArr) {
            Preconditions.checkNotNull(cls);
            Preconditions.checkArgument(typeArr.length == cls.getTypeParameters().length);
            Types.f(typeArr, "type parameter");
            this.f31220b = type;
            this.f31222d = cls;
            this.f31221c = JavaVersion.f31217b.j(typeArr);
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof ParameterizedType)) {
                return false;
            }
            ParameterizedType parameterizedType = (ParameterizedType) obj;
            return getRawType().equals(parameterizedType.getRawType()) && com.google.common.base.Objects.equal(getOwnerType(), parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments());
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type[] getActualTypeArguments() {
            return Types.r(this.f31221c);
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getOwnerType() {
            return this.f31220b;
        }

        @Override // java.lang.reflect.ParameterizedType
        public Type getRawType() {
            return this.f31222d;
        }

        public int hashCode() {
            Type type = this.f31220b;
            return ((type == null ? 0 : type.hashCode()) ^ this.f31221c.hashCode()) ^ this.f31222d.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            if (this.f31220b != null) {
                JavaVersion javaVersion = JavaVersion.f31217b;
                if (javaVersion.g()) {
                    sb2.append(javaVersion.i(this.f31220b));
                    sb2.append('.');
                }
            }
            sb2.append(this.f31222d.getName());
            sb2.append('<');
            Joiner joiner = Types.f31212a;
            ImmutableList immutableList = this.f31221c;
            final JavaVersion javaVersion2 = JavaVersion.f31217b;
            Objects.requireNonNull(javaVersion2);
            sb2.append(joiner.join(Iterables.transform(immutableList, new Function() { // from class: com.google.common.reflect.d
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return javaVersion2.i((Type) obj);
                }
            })));
            sb2.append('>');
            return sb2.toString();
        }
    }

    private static final class TypeVariableImpl<D extends GenericDeclaration> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final GenericDeclaration f31223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f31224b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList f31225c;

        TypeVariableImpl(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
            Types.f(typeArr, "bound for type variable");
            this.f31223a = (GenericDeclaration) Preconditions.checkNotNull(genericDeclaration);
            this.f31224b = (String) Preconditions.checkNotNull(str);
            this.f31225c = ImmutableList.copyOf(typeArr);
        }

        public boolean equals(Object obj) {
            if (!NativeTypeVariableEquals.f31219a) {
                if (obj instanceof TypeVariable) {
                    TypeVariable typeVariable = (TypeVariable) obj;
                    if (this.f31224b.equals(typeVariable.getName()) && this.f31223a.equals(typeVariable.getGenericDeclaration())) {
                        return true;
                    }
                }
                return false;
            }
            if (obj != null && Proxy.isProxyClass(obj.getClass()) && (Proxy.getInvocationHandler(obj) instanceof TypeVariableInvocationHandler)) {
                TypeVariableImpl typeVariableImpl = ((TypeVariableInvocationHandler) Proxy.getInvocationHandler(obj)).f31227a;
                if (this.f31224b.equals(typeVariableImpl.getName()) && this.f31223a.equals(typeVariableImpl.getGenericDeclaration()) && this.f31225c.equals(typeVariableImpl.f31225c)) {
                    return true;
                }
            }
            return false;
        }

        public Type[] getBounds() {
            return Types.r(this.f31225c);
        }

        public D getGenericDeclaration() {
            return (D) this.f31223a;
        }

        public String getName() {
            return this.f31224b;
        }

        public String getTypeName() {
            return this.f31224b;
        }

        public int hashCode() {
            return this.f31223a.hashCode() ^ this.f31224b.hashCode();
        }

        public String toString() {
            return this.f31224b;
        }
    }

    private static final class TypeVariableInvocationHandler implements InvocationHandler {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final ImmutableMap f31226b;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final TypeVariableImpl f31227a;

        static {
            ImmutableMap.Builder builder = ImmutableMap.builder();
            for (Method method : TypeVariableImpl.class.getMethods()) {
                if (method.getDeclaringClass().equals(TypeVariableImpl.class)) {
                    try {
                        method.setAccessible(true);
                    } catch (AccessControlException unused) {
                    }
                    builder.put(method.getName(), method);
                }
            }
            f31226b = builder.buildKeepingLast();
        }

        TypeVariableInvocationHandler(TypeVariableImpl typeVariableImpl) {
            this.f31227a = typeVariableImpl;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            String name = method.getName();
            Method method2 = (Method) f31226b.get(name);
            if (method2 == null) {
                throw new UnsupportedOperationException(name);
            }
            try {
                return method2.invoke(this.f31227a, objArr);
            } catch (InvocationTargetException e10) {
                throw e10.getCause();
            }
        }
    }

    static final class WildcardTypeImpl implements WildcardType, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList f31228b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ImmutableList f31229c;

        WildcardTypeImpl(Type[] typeArr, Type[] typeArr2) {
            Types.f(typeArr, "lower bound for wildcard");
            Types.f(typeArr2, "upper bound for wildcard");
            JavaVersion javaVersion = JavaVersion.f31217b;
            this.f31228b = javaVersion.j(typeArr);
            this.f31229c = javaVersion.j(typeArr2);
        }

        public boolean equals(Object obj) {
            if (obj instanceof WildcardType) {
                WildcardType wildcardType = (WildcardType) obj;
                if (this.f31228b.equals(Arrays.asList(wildcardType.getLowerBounds())) && this.f31229c.equals(Arrays.asList(wildcardType.getUpperBounds()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getLowerBounds() {
            return Types.r(this.f31228b);
        }

        @Override // java.lang.reflect.WildcardType
        public Type[] getUpperBounds() {
            return Types.r(this.f31229c);
        }

        public int hashCode() {
            return this.f31228b.hashCode() ^ this.f31229c.hashCode();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("?");
            UnmodifiableIterator it = this.f31228b.iterator();
            while (it.hasNext()) {
                Type type = (Type) it.next();
                sb2.append(" super ");
                sb2.append(JavaVersion.f31217b.i(type));
            }
            for (Type type2 : Types.g(this.f31229c)) {
                sb2.append(" extends ");
                sb2.append(JavaVersion.f31217b.i(type2));
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void f(Type[] typeArr, String str) {
        for (Type type : typeArr) {
            if (type instanceof Class) {
                Preconditions.checkArgument(!r2.isPrimitive(), "Primitive type '%s' used as %s", (Class) type, str);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterable g(Iterable iterable) {
        return Iterables.filter(iterable, Predicates.not(Predicates.equalTo(Object.class)));
    }

    static Class h(Class cls) {
        return Array.newInstance((Class<?>) cls, 0).getClass();
    }

    static Type i(Type type) {
        Preconditions.checkNotNull(type);
        final AtomicReference atomicReference = new AtomicReference();
        new TypeVisitor() { // from class: com.google.common.reflect.Types.1
            @Override // com.google.common.reflect.TypeVisitor
            void a(Class cls) {
                atomicReference.set(cls.getComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void b(GenericArrayType genericArrayType) {
                atomicReference.set(genericArrayType.getGenericComponentType());
            }

            @Override // com.google.common.reflect.TypeVisitor
            void d(TypeVariable typeVariable) {
                atomicReference.set(Types.p(typeVariable.getBounds()));
            }

            @Override // com.google.common.reflect.TypeVisitor
            void e(WildcardType wildcardType) {
                atomicReference.set(Types.p(wildcardType.getUpperBounds()));
            }
        }.visit(type);
        return (Type) atomicReference.get();
    }

    static Type j(Type type) {
        if (!(type instanceof WildcardType)) {
            return JavaVersion.f31217b.h(type);
        }
        WildcardType wildcardType = (WildcardType) type;
        Type[] lowerBounds = wildcardType.getLowerBounds();
        Preconditions.checkArgument(lowerBounds.length <= 1, "Wildcard cannot have more than one lower bounds.");
        if (lowerBounds.length == 1) {
            return q(j(lowerBounds[0]));
        }
        Type[] upperBounds = wildcardType.getUpperBounds();
        Preconditions.checkArgument(upperBounds.length == 1, "Wildcard should have only one upper bound.");
        return o(j(upperBounds[0]));
    }

    static TypeVariable k(GenericDeclaration genericDeclaration, String str, Type... typeArr) {
        if (typeArr.length == 0) {
            typeArr = new Type[]{Object.class};
        }
        return n(genericDeclaration, str, typeArr);
    }

    static ParameterizedType l(Class cls, Type... typeArr) {
        return new ParameterizedTypeImpl(ClassOwnership.f31214b.h(cls), cls, typeArr);
    }

    static ParameterizedType m(Type type, Class cls, Type... typeArr) {
        if (type == null) {
            return l(cls, typeArr);
        }
        Preconditions.checkNotNull(typeArr);
        Preconditions.checkArgument(cls.getEnclosingClass() != null, "Owner type for unenclosed %s", cls);
        return new ParameterizedTypeImpl(type, cls, typeArr);
    }

    private static TypeVariable n(GenericDeclaration genericDeclaration, String str, Type[] typeArr) {
        return (TypeVariable) Reflection.newProxy(TypeVariable.class, new TypeVariableInvocationHandler(new TypeVariableImpl(genericDeclaration, str, typeArr)));
    }

    static WildcardType o(Type type) {
        return new WildcardTypeImpl(new Type[0], new Type[]{type});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type p(Type[] typeArr) {
        for (Type type : typeArr) {
            Type typeI = i(type);
            if (typeI != null) {
                if (typeI instanceof Class) {
                    Class cls = (Class) typeI;
                    if (cls.isPrimitive()) {
                        return cls;
                    }
                }
                return o(typeI);
            }
        }
        return null;
    }

    static WildcardType q(Type type) {
        return new WildcardTypeImpl(new Type[]{type}, new Type[]{Object.class});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Type[] r(Collection collection) {
        return (Type[]) collection.toArray(new Type[0]);
    }

    static String s(Type type) {
        return type instanceof Class ? ((Class) type).getName() : type.toString();
    }
}
