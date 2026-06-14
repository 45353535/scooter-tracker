package com.google.gson.internal;

import com.google.gson.InstanceCreator;
import com.google.gson.JsonIOException;
import com.google.gson.ReflectionAccessFilter;
import com.google.gson.internal.reflect.ReflectionHelper;
import com.google.gson.reflect.TypeToken;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentSkipListMap;

/* JADX INFO: loaded from: classes9.dex */
public final class ConstructorConstructor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f33537a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f33538b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f33539c;

    public ConstructorConstructor(Map<Type, InstanceCreator<?>> map, boolean z10, List<ReflectionAccessFilter> list) {
        this.f33537a = map;
        this.f33538b = z10;
        this.f33539c = list;
    }

    private static ObjectConstructor A(Type type, Class cls) {
        if (cls.isAssignableFrom(LinkedTreeMap.class) && w(type)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.e
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.p();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.f
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.c();
                }
            };
        }
        if (cls.isAssignableFrom(TreeMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.g
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.j();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentHashMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.h
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.a();
                }
            };
        }
        if (cls.isAssignableFrom(ConcurrentSkipListMap.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.i
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.h();
                }
            };
        }
        return null;
    }

    private static ObjectConstructor B(final Type type, Class cls) {
        if (EnumSet.class.isAssignableFrom(cls)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.c
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.m(type);
                }
            };
        }
        if (cls == EnumMap.class) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.d
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.f(type);
                }
            };
        }
        return null;
    }

    private ObjectConstructor C(final Class cls) {
        if (this.f33538b) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.u
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.e(cls);
                }
            };
        }
        final String str = "Unable to create instance of " + cls + "; usage of JDK Unsafe is disabled. Registering an InstanceCreator or a TypeAdapter for this type, adding a no-args constructor, or enabling usage of JDK Unsafe may fix this problem.";
        if (cls.getDeclaredConstructors().length == 0) {
            str = str + " Or adjust your R8 configuration to keep the no-args constructor of the class.";
        }
        return new ObjectConstructor() { // from class: com.google.gson.internal.b
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object construct() {
                return ConstructorConstructor.o(str);
            }
        };
    }

    public static /* synthetic */ Map a() {
        return new ConcurrentHashMap();
    }

    public static /* synthetic */ Collection b() {
        return new ArrayList();
    }

    public static /* synthetic */ Map c() {
        return new LinkedHashMap();
    }

    public static /* synthetic */ Object d(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object e(Class cls) {
        try {
            return UnsafeAllocator.INSTANCE.newInstance(cls);
        } catch (Exception e10) {
            throw new RuntimeException("Unable to create instance of " + cls + ". Registering an InstanceCreator or a TypeAdapter for this type, or adding a no-args constructor may fix this problem.", e10);
        }
    }

    public static /* synthetic */ Object f(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new JsonIOException("Invalid EnumMap type: " + type.toString());
    }

    public static /* synthetic */ Map h() {
        return new ConcurrentSkipListMap();
    }

    public static /* synthetic */ Map j() {
        return new TreeMap();
    }

    public static /* synthetic */ Object k(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection l() {
        return new LinkedHashSet();
    }

    public static /* synthetic */ Object m(Type type) {
        if (!(type instanceof ParameterizedType)) {
            throw new JsonIOException("Invalid EnumSet type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return EnumSet.noneOf((Class) type2);
        }
        throw new JsonIOException("Invalid EnumSet type: " + type.toString());
    }

    public static /* synthetic */ Object n(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Object o(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Map p() {
        return new LinkedTreeMap();
    }

    public static /* synthetic */ Object q(String str) {
        throw new JsonIOException(str);
    }

    public static /* synthetic */ Collection r() {
        return new TreeSet();
    }

    public static /* synthetic */ Object s(Constructor constructor) {
        try {
            return constructor.newInstance(null);
        } catch (IllegalAccessException e10) {
            throw ReflectionHelper.createExceptionForUnexpectedIllegalAccess(e10);
        } catch (InstantiationException e11) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("Failed to invoke constructor '" + ReflectionHelper.constructorToString(constructor) + "' with no args", e12.getCause());
        }
    }

    public static /* synthetic */ Collection t() {
        return new ArrayDeque();
    }

    public static /* synthetic */ Object u(String str) {
        throw new JsonIOException(str);
    }

    static String v(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: " + cls.getName();
        }
        if (!Modifier.isAbstract(modifiers)) {
            return null;
        }
        return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + TroubleshootingGuide.createUrl("r8-abstract-class");
    }

    private static boolean w(Type type) {
        if (!(type instanceof ParameterizedType)) {
            return true;
        }
        Type[] actualTypeArguments = ((ParameterizedType) type).getActualTypeArguments();
        return actualTypeArguments.length != 0 && GsonTypes.getRawType(actualTypeArguments[0]) == String.class;
    }

    private static ObjectConstructor x(Class cls) {
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.q
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.b();
                }
            };
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.r
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.l();
                }
            };
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.s
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.r();
                }
            };
        }
        if (cls.isAssignableFrom(ArrayDeque.class)) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.t
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.t();
                }
            };
        }
        return null;
    }

    private static ObjectConstructor y(Class cls, ReflectionAccessFilter.FilterResult filterResult) {
        final String strTryMakeAccessible;
        if (Modifier.isAbstract(cls.getModifiers())) {
            return null;
        }
        try {
            final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
            ReflectionAccessFilter.FilterResult filterResult2 = ReflectionAccessFilter.FilterResult.ALLOW;
            if (filterResult == filterResult2 || (ReflectionAccessFilterHelper.canAccess(declaredConstructor, null) && (filterResult != ReflectionAccessFilter.FilterResult.BLOCK_ALL || Modifier.isPublic(declaredConstructor.getModifiers())))) {
                return (filterResult != filterResult2 || (strTryMakeAccessible = ReflectionHelper.tryMakeAccessible(declaredConstructor)) == null) ? new ObjectConstructor() { // from class: com.google.gson.internal.m
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final Object construct() {
                        return ConstructorConstructor.s(declaredConstructor);
                    }
                } : new ObjectConstructor() { // from class: com.google.gson.internal.k
                    @Override // com.google.gson.internal.ObjectConstructor
                    public final Object construct() {
                        return ConstructorConstructor.k(strTryMakeAccessible);
                    }
                };
            }
            final String str = "Unable to invoke no-args constructor of " + cls + "; constructor is not accessible and ReflectionAccessFilter does not permit making it accessible. Register an InstanceCreator or a TypeAdapter for this type, change the visibility of the constructor or adjust the access filter.";
            return new ObjectConstructor() { // from class: com.google.gson.internal.j
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.n(str);
                }
            };
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private static ObjectConstructor z(Type type, Class cls) {
        if (Collection.class.isAssignableFrom(cls)) {
            return x(cls);
        }
        if (Map.class.isAssignableFrom(cls)) {
            return A(type, cls);
        }
        return null;
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken) {
        return get(typeToken, true);
    }

    public String toString() {
        return this.f33537a.toString();
    }

    public <T> ObjectConstructor<T> get(TypeToken<T> typeToken, boolean z10) {
        final Type type = typeToken.getType();
        Class<? super T> rawType = typeToken.getRawType();
        final InstanceCreator instanceCreator = (InstanceCreator) this.f33537a.get(type);
        if (instanceCreator != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.a
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator.createInstance(type);
                }
            };
        }
        final InstanceCreator instanceCreator2 = (InstanceCreator) this.f33537a.get(rawType);
        if (instanceCreator2 != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.l
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return instanceCreator2.createInstance(type);
                }
            };
        }
        ObjectConstructor<T> objectConstructorB = B(type, rawType);
        if (objectConstructorB != null) {
            return objectConstructorB;
        }
        ReflectionAccessFilter.FilterResult filterResult = ReflectionAccessFilterHelper.getFilterResult(this.f33539c, rawType);
        ObjectConstructor<T> objectConstructorY = y(rawType, filterResult);
        if (objectConstructorY != null) {
            return objectConstructorY;
        }
        ObjectConstructor<T> objectConstructorZ = z(type, rawType);
        if (objectConstructorZ != null) {
            return objectConstructorZ;
        }
        final String strV = v(rawType);
        if (strV != null) {
            return new ObjectConstructor() { // from class: com.google.gson.internal.n
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.q(strV);
                }
            };
        }
        if (!z10) {
            final String str = "Unable to create instance of " + rawType + "; Register an InstanceCreator or a TypeAdapter for this type.";
            return new ObjectConstructor() { // from class: com.google.gson.internal.o
                @Override // com.google.gson.internal.ObjectConstructor
                public final Object construct() {
                    return ConstructorConstructor.d(str);
                }
            };
        }
        if (filterResult == ReflectionAccessFilter.FilterResult.ALLOW) {
            return C(rawType);
        }
        final String str2 = "Unable to create instance of " + rawType + "; ReflectionAccessFilter does not permit using reflection or Unsafe. Register an InstanceCreator or a TypeAdapter for this type or adjust the access filter to allow using reflection.";
        return new ObjectConstructor() { // from class: com.google.gson.internal.p
            @Override // com.google.gson.internal.ObjectConstructor
            public final Object construct() {
                return ConstructorConstructor.u(str2);
            }
        };
    }
}
