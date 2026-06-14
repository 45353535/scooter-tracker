package yg;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c2 {
    private static final Object a(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(null);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static final KSerializer b(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return d(kClass, new KSerializer[0]);
    }

    public static final KSerializer c(Class cls, KSerializer... args) throws IllegalAccessException, InvocationTargetException {
        Intrinsics.checkNotNullParameter(cls, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if (cls.isEnum() && m(cls)) {
            return e(cls);
        }
        KSerializer kSerializerK = k(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerK != null) {
            return kSerializerK;
        }
        KSerializer kSerializerH = h(cls);
        if (kSerializerH != null) {
            return kSerializerH;
        }
        KSerializer kSerializerF = f(cls, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (kSerializerF != null) {
            return kSerializerF;
        }
        if (n(cls)) {
            return new ug.h(xf.a.e(cls));
        }
        return null;
    }

    public static final KSerializer d(KClass kClass, KSerializer... args) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return c(xf.a.b(kClass), (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    private static final KSerializer e(Class cls) {
        Object[] enumConstants = cls.getEnumConstants();
        String canonicalName = cls.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new i0(canonicalName, (Enum[]) enumConstants);
    }

    private static final KSerializer f(Class cls, KSerializer... kSerializerArr) {
        Field field;
        KSerializer kSerializerJ;
        Object objG = g(cls);
        if (objG != null && (kSerializerJ = j(objG, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length))) != null) {
            return kSerializerJ;
        }
        try {
            Class<?>[] declaredClasses = cls.getDeclaredClasses();
            Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
            int length = declaredClasses.length;
            int i10 = 0;
            Class<?> cls2 = null;
            boolean z10 = false;
            while (true) {
                if (i10 < length) {
                    Class<?> cls3 = declaredClasses[i10];
                    if (Intrinsics.areEqual(cls3.getSimpleName(), "$serializer")) {
                        if (z10) {
                            break;
                        }
                        z10 = true;
                        cls2 = cls3;
                    }
                    i10++;
                } else if (!z10) {
                }
            }
            cls2 = null;
            Object obj = (cls2 == null || (field = cls2.getField("INSTANCE")) == null) ? null : field.get(null);
            if (obj instanceof KSerializer) {
                return (KSerializer) obj;
            }
        } catch (NoSuchFieldException unused) {
        }
        return null;
    }

    private static final Object g(Class cls) {
        Class<?> cls2;
        Class<?>[] declaredClasses = cls.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        int length = declaredClasses.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                cls2 = null;
                break;
            }
            cls2 = declaredClasses[i10];
            if (cls2.getAnnotation(o1.class) != null) {
                break;
            }
            i10++;
        }
        if (cls2 == null) {
            return null;
        }
        String simpleName = cls2.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return a(cls, simpleName);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
    
        r5 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlinx.serialization.KSerializer h(java.lang.Class r11) throws java.lang.IllegalAccessException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.String r0 = r11.getCanonicalName()
            r1 = 0
            if (r0 == 0) goto Lae
            java.lang.String r2 = "java."
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.StringsKt.a0(r0, r2, r3, r4, r1)
            if (r2 != 0) goto Lae
            java.lang.String r2 = "kotlin."
            boolean r0 = kotlin.text.StringsKt.a0(r0, r2, r3, r4, r1)
            if (r0 == 0) goto L1b
            goto Lae
        L1b:
            java.lang.reflect.Field[] r0 = r11.getDeclaredFields()
            java.lang.String r2 = "getDeclaredFields(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            int r2 = r0.length
            r6 = r1
            r4 = r3
            r5 = r4
        L28:
            r7 = 1
            if (r4 >= r2) goto L56
            r8 = r0[r4]
            java.lang.String r9 = r8.getName()
            java.lang.String r10 = "INSTANCE"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r10)
            if (r9 == 0) goto L53
            java.lang.Class r9 = r8.getType()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r11)
            if (r9 == 0) goto L53
            int r9 = r8.getModifiers()
            boolean r9 = java.lang.reflect.Modifier.isStatic(r9)
            if (r9 == 0) goto L53
            if (r5 == 0) goto L51
        L4f:
            r6 = r1
            goto L59
        L51:
            r5 = r7
            r6 = r8
        L53:
            int r4 = r4 + 1
            goto L28
        L56:
            if (r5 != 0) goto L59
            goto L4f
        L59:
            if (r6 != 0) goto L5c
            return r1
        L5c:
            java.lang.Object r0 = r6.get(r1)
            java.lang.reflect.Method[] r11 = r11.getMethods()
            java.lang.String r2 = "getMethods(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r2)
            int r2 = r11.length
            r5 = r1
            r4 = r3
        L6c:
            if (r3 >= r2) goto L9d
            r6 = r11[r3]
            java.lang.String r8 = r6.getName()
            java.lang.String r9 = "serializer"
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            java.lang.Class[] r8 = r6.getParameterTypes()
            java.lang.String r9 = "getParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r9)
            int r8 = r8.length
            if (r8 != 0) goto L9a
            java.lang.Class r8 = r6.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r9 = kotlinx.serialization.KSerializer.class
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r9)
            if (r8 == 0) goto L9a
            if (r4 == 0) goto L98
        L96:
            r5 = r1
            goto La0
        L98:
            r5 = r6
            r4 = r7
        L9a:
            int r3 = r3 + 1
            goto L6c
        L9d:
            if (r4 != 0) goto La0
            goto L96
        La0:
            if (r5 != 0) goto La3
            return r1
        La3:
            java.lang.Object r11 = r5.invoke(r0, r1)
            boolean r0 = r11 instanceof kotlinx.serialization.KSerializer
            if (r0 == 0) goto Lae
            kotlinx.serialization.KSerializer r11 = (kotlinx.serialization.KSerializer) r11
            return r11
        Lae:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: yg.c2.h(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final Map i() {
        Map mapCreateMapBuilder = MapsKt.createMapBuilder();
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(String.class), vg.a.E(kotlin.jvm.internal.a1.f93282a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Character.TYPE), vg.a.y(kotlin.jvm.internal.p.f93319a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(char[].class), vg.a.d());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Double.TYPE), vg.a.z(kotlin.jvm.internal.t.f93330a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(double[].class), vg.a.e());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Float.TYPE), vg.a.A(kotlin.jvm.internal.u.f93332a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(float[].class), vg.a.f());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Long.TYPE), vg.a.C(kotlin.jvm.internal.c0.f93287a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(long[].class), vg.a.i());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.v.class), vg.a.I(lf.v.f94232c));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Integer.TYPE), vg.a.B(kotlin.jvm.internal.a0.f93281a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(int[].class), vg.a.g());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.t.class), vg.a.H(lf.t.f94227c));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Short.TYPE), vg.a.D(kotlin.jvm.internal.y0.f93336a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(short[].class), vg.a.n());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.y.class), vg.a.J(lf.y.f94238c));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Byte.TYPE), vg.a.x(kotlin.jvm.internal.n.f93317a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(byte[].class), vg.a.c());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.r.class), vg.a.G(lf.r.f94222c));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Boolean.TYPE), vg.a.w(kotlin.jvm.internal.m.f93316a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(boolean[].class), vg.a.b());
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Unit.class), vg.a.v(Unit.f93236a));
        mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(Void.class), vg.a.l());
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(kotlin.time.b.class), vg.a.F(kotlin.time.b.f93560c));
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.w.class), vg.a.r());
        } catch (ClassNotFoundException | NoClassDefFoundError unused2) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.u.class), vg.a.q());
        } catch (ClassNotFoundException | NoClassDefFoundError unused3) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.z.class), vg.a.s());
        } catch (ClassNotFoundException | NoClassDefFoundError unused4) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(lf.s.class), vg.a.p());
        } catch (ClassNotFoundException | NoClassDefFoundError unused5) {
        }
        try {
            mapCreateMapBuilder.put(kotlin.jvm.internal.v0.b(dg.a.class), vg.a.u(dg.a.f68665d));
        } catch (ClassNotFoundException | NoClassDefFoundError unused6) {
        }
        return MapsKt.build(mapCreateMapBuilder);
    }

    private static final KSerializer j(Object obj, KSerializer... kSerializerArr) throws IllegalAccessException, InvocationTargetException {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i10 = 0; i10 < length; i10++) {
                    clsArr2[i10] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object objInvoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (objInvoke instanceof KSerializer) {
                return (KSerializer) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                throw e10;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e10.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    private static final KSerializer k(Class cls, KSerializer... kSerializerArr) {
        Object objA = a(cls, com.taurusx.tax.f.y.f66058y);
        if (objA == null) {
            return null;
        }
        return j(objA, (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    public static final boolean l(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        return xf.a.b(kClass).isInterface();
    }

    private static final boolean m(Class cls) {
        return cls.getAnnotation(ug.l.class) == null && cls.getAnnotation(ug.e.class) == null;
    }

    private static final boolean n(Class cls) {
        if (cls.getAnnotation(ug.e.class) != null) {
            return true;
        }
        ug.l lVar = (ug.l) cls.getAnnotation(ug.l.class);
        return lVar != null && Intrinsics.areEqual(kotlin.jvm.internal.v0.b(lVar.with()), kotlin.jvm.internal.v0.b(ug.h.class));
    }

    public static final boolean o(KClass rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return xf.a.b(rootClass).isArray();
    }

    public static final Void p(KClass kClass) {
        Intrinsics.checkNotNullParameter(kClass, "<this>");
        d2.f(kClass);
        throw new lf.g();
    }

    public static final Object[] q(ArrayList arrayList, KClass eClass) {
        Intrinsics.checkNotNullParameter(arrayList, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object objNewInstance = Array.newInstance((Class<?>) xf.a.b(eClass), arrayList.size());
        Intrinsics.checkNotNull(objNewInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        Object[] array = arrayList.toArray((Object[]) objNewInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }
}
