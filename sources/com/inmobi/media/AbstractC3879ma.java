package com.inmobi.media;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.inmobi.media.ma, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC3879ma {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f39025a = 0;

    public static JSONObject a(Object obj, Class cls) {
        JSONObject jSONObject;
        try {
            cls.getSimpleName();
            Class superclass = cls.getSuperclass();
            if (superclass == null || Intrinsics.areEqual(Object.class, superclass)) {
                jSONObject = null;
            } else {
                Class superclass2 = cls.getSuperclass();
                superclass2.getSimpleName();
                Intrinsics.checkNotNull(superclass2);
                jSONObject = a(obj, superclass2);
            }
            if (jSONObject == null) {
                jSONObject = new JSONObject();
            }
            Iterator itA = kotlin.jvm.internal.i.a(cls.getDeclaredFields());
            while (itA.hasNext()) {
                Field field = (Field) itA.next();
                field.setAccessible(true);
                if (field.get(obj) == null) {
                    field.getName();
                } else {
                    Class<?> type = field.getType();
                    if (!Modifier.isStatic(field.getModifiers()) && !field.isAnnotationPresent(A8.class)) {
                        Intrinsics.checkNotNull(type);
                        if (Modifier.isStatic(cls.getModifiers()) || !Intrinsics.areEqual(cls.getEnclosingClass(), type)) {
                            String name = field.getName();
                            Class cls2 = Integer.TYPE;
                            if (Intrinsics.areEqual(cls2, type) || Intrinsics.areEqual(cls2, type) || Intrinsics.areEqual(Integer.class, type)) {
                                Object obj2 = field.get(obj);
                                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
                                jSONObject.put(name, ((Integer) obj2).intValue());
                            } else {
                                Class cls3 = Boolean.TYPE;
                                if (Intrinsics.areEqual(cls3, type) || Intrinsics.areEqual(cls3, type) || Intrinsics.areEqual(Boolean.class, type)) {
                                    Object obj3 = field.get(obj);
                                    Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Boolean");
                                    jSONObject.put(name, ((Boolean) obj3).booleanValue());
                                } else {
                                    Class cls4 = Double.TYPE;
                                    if (Intrinsics.areEqual(cls4, type) || Intrinsics.areEqual(cls4, type) || Intrinsics.areEqual(Double.class, type)) {
                                        Object obj4 = field.get(obj);
                                        Intrinsics.checkNotNull(obj4, "null cannot be cast to non-null type kotlin.Double");
                                        jSONObject.put(name, ((Double) obj4).doubleValue());
                                    } else {
                                        Class cls5 = Float.TYPE;
                                        if (Intrinsics.areEqual(cls5, type) || Intrinsics.areEqual(cls5, type) || Intrinsics.areEqual(Float.class, type)) {
                                            Object obj5 = field.get(obj);
                                            Intrinsics.checkNotNull(obj5, "null cannot be cast to non-null type kotlin.Float");
                                            jSONObject.put(name, (Float) obj5);
                                        } else {
                                            Class cls6 = Long.TYPE;
                                            if (Intrinsics.areEqual(cls6, type) || Intrinsics.areEqual(cls6, type) || Intrinsics.areEqual(Long.class, type)) {
                                                Object obj6 = field.get(obj);
                                                Intrinsics.checkNotNull(obj6, "null cannot be cast to non-null type kotlin.Long");
                                                jSONObject.put(name, ((Long) obj6).longValue());
                                            } else {
                                                Class cls7 = Byte.TYPE;
                                                if (Intrinsics.areEqual(cls7, type) || Intrinsics.areEqual(cls7, type) || Intrinsics.areEqual(Byte.class, type)) {
                                                    Object obj7 = field.get(obj);
                                                    Intrinsics.checkNotNull(obj7, "null cannot be cast to non-null type kotlin.Byte");
                                                    jSONObject.put(name, (Byte) obj7);
                                                } else if (Intrinsics.areEqual(String.class, type) || Intrinsics.areEqual(JSONObject.class, type) || Intrinsics.areEqual(JSONArray.class, type)) {
                                                    jSONObject.put(name, field.get(obj));
                                                } else {
                                                    Class cls8 = Short.TYPE;
                                                    if (Intrinsics.areEqual(cls8, type) || Intrinsics.areEqual(cls8, type) || Intrinsics.areEqual(Short.class, type)) {
                                                        Object obj8 = field.get(obj);
                                                        Intrinsics.checkNotNull(obj8, "null cannot be cast to non-null type kotlin.Short");
                                                        jSONObject.put(name, (Short) obj8);
                                                    } else if (Map.class.isAssignableFrom(type)) {
                                                        JSONObject jSONObject2 = new JSONObject();
                                                        Object obj9 = field.get(obj);
                                                        if (obj9 != null) {
                                                            Map map = (Map) obj9;
                                                            for (Object obj10 : map.keySet()) {
                                                                Object objA = map.get(obj10);
                                                                if (objA != null) {
                                                                    if (!a(objA.getClass())) {
                                                                        objA = a(objA, objA.getClass());
                                                                    }
                                                                    jSONObject2.put(String.valueOf(obj10), objA);
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONObject2);
                                                    } else if (List.class.isAssignableFrom(type)) {
                                                        JSONArray jSONArray = new JSONArray();
                                                        Object obj11 = field.get(obj);
                                                        if (obj11 != null) {
                                                            for (Object obj12 : (List) obj11) {
                                                                if (obj12 != null) {
                                                                    Object objA2 = a(obj12.getClass()) ? obj12 : a(obj12, obj12.getClass());
                                                                    if (objA2 == null) {
                                                                        obj12.getClass().toString();
                                                                    } else {
                                                                        jSONArray.put(objA2);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray);
                                                    } else if (type.isArray()) {
                                                        JSONArray jSONArray2 = new JSONArray();
                                                        Object obj13 = field.get(obj);
                                                        if (obj13 != null) {
                                                            int length = Array.getLength(obj13);
                                                            for (int i10 = 0; i10 < length; i10++) {
                                                                Object obj14 = Array.get(obj13, i10);
                                                                if (obj14 != null) {
                                                                    Object objA3 = a(obj14.getClass()) ? obj14 : a(obj14, obj14.getClass());
                                                                    if (objA3 == null) {
                                                                        obj14.getClass().toString();
                                                                    } else {
                                                                        jSONArray2.put(objA3);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        jSONObject.put(name, jSONArray2);
                                                    } else {
                                                        Object obj15 = field.get(obj);
                                                        if (obj15 != null) {
                                                            jSONObject.put(name, a(obj15, obj15.getClass()));
                                                        } else {
                                                            Unit unit = Unit.f93236a;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return jSONObject;
        } catch (Exception e10) {
            e10.getMessage();
            return null;
        }
    }

    public static void b(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        double d10 = jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Double.TYPE) {
                field.getName();
                field.setDouble(obj, d10);
            } else {
                field.getName();
                field.set(obj, Double.valueOf(d10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void c(Field field, Object obj, JSONObject jSONObject) {
        float f10 = (float) jSONObject.getDouble(field.getName());
        try {
            if (field.getType() == Float.TYPE) {
                field.getName();
                field.setFloat(obj, f10);
            } else {
                field.getName();
                field.set(obj, Float.valueOf(f10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void d(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        int i10 = jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Integer.TYPE) {
                field.getName();
                field.setInt(obj, i10);
            } else {
                field.getName();
                field.set(obj, Integer.valueOf(i10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void e(Field field, Object obj, JSONObject jSONObject) throws JSONException {
        long j10 = jSONObject.getLong(field.getName());
        try {
            if (field.getType() == Long.TYPE) {
                field.getName();
                field.setLong(obj, j10);
            } else {
                field.getName();
                field.set(obj, Long.valueOf(j10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static void f(Field field, Object obj, JSONObject jSONObject) {
        short s10 = (short) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Short.TYPE) {
                field.getName();
                field.setShort(obj, s10);
            } else {
                field.getName();
                field.set(obj, Short.valueOf(s10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0354 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1 */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(org.json.JSONObject r22, java.lang.Class r23, java.lang.Object r24, java.lang.Object r25) throws java.lang.IllegalAccessException, org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 1268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.AbstractC3879ma.a(org.json.JSONObject, java.lang.Class, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public static Boolean a(JSONObject jSONObject, Field field) {
        boolean z10;
        String name = field.getName();
        try {
            z10 = jSONObject.getBoolean(name);
        } catch (JSONException unused) {
            z10 = jSONObject.getInt(name) != 0;
        }
        return Boolean.valueOf(z10);
    }

    public static void a(Field field, Object obj, Boolean bool) {
        try {
            if (field.getType() == Boolean.TYPE) {
                field.setBoolean(obj, bool.booleanValue());
            } else {
                field.set(obj, bool);
            }
        } catch (Exception unused) {
            field.getName();
        }
    }

    public static void a(Field field, Object obj, JSONObject jSONObject) {
        byte b10 = (byte) jSONObject.getInt(field.getName());
        try {
            if (field.getType() == Byte.TYPE) {
                field.getName();
                field.setByte(obj, b10);
            } else {
                field.getName();
                field.set(obj, Byte.valueOf(b10));
            }
        } catch (Exception e10) {
            field.getName();
            e10.getMessage();
        }
    }

    public static boolean a(Class cls) {
        Class cls2 = Integer.TYPE;
        if (Intrinsics.areEqual(cls2, cls) || Intrinsics.areEqual(cls2, cls) || Intrinsics.areEqual(Integer.class, cls)) {
            return true;
        }
        Class cls3 = Boolean.TYPE;
        if (Intrinsics.areEqual(cls3, cls) || Intrinsics.areEqual(cls3, cls) || Intrinsics.areEqual(Boolean.class, cls)) {
            return true;
        }
        Class cls4 = Double.TYPE;
        if (Intrinsics.areEqual(cls4, cls) || Intrinsics.areEqual(cls4, cls) || Intrinsics.areEqual(Double.class, cls)) {
            return true;
        }
        Class cls5 = Float.TYPE;
        if (Intrinsics.areEqual(cls5, cls) || Intrinsics.areEqual(cls5, cls) || Intrinsics.areEqual(Float.class, cls)) {
            return true;
        }
        Class cls6 = Long.TYPE;
        if (Intrinsics.areEqual(cls6, cls) || Intrinsics.areEqual(cls6, cls) || Intrinsics.areEqual(Long.class, cls) || Intrinsics.areEqual(String.class, cls)) {
            return true;
        }
        Class cls7 = Byte.TYPE;
        if (Intrinsics.areEqual(cls7, cls) || Intrinsics.areEqual(cls7, cls) || Intrinsics.areEqual(Byte.class, cls)) {
            return true;
        }
        Class cls8 = Short.TYPE;
        return Intrinsics.areEqual(cls8, cls) || Intrinsics.areEqual(cls8, cls) || Intrinsics.areEqual(Short.class, cls);
    }

    public static Object a(JSONArray jSONArray, int i10, Class cls) throws JSONException {
        Object objValueOf;
        if (Intrinsics.areEqual(Integer.TYPE, cls)) {
            objValueOf = Integer.valueOf(jSONArray.getInt(i10));
        } else if (Intrinsics.areEqual(Double.TYPE, cls)) {
            objValueOf = Double.valueOf(jSONArray.getDouble(i10));
        } else if (Intrinsics.areEqual(Float.TYPE, cls)) {
            objValueOf = Float.valueOf((float) jSONArray.getDouble(i10));
        } else if (Intrinsics.areEqual(Long.TYPE, cls)) {
            objValueOf = Long.valueOf(jSONArray.getLong(i10));
        } else if (Intrinsics.areEqual(Byte.TYPE, cls)) {
            objValueOf = Byte.valueOf((byte) jSONArray.getInt(i10));
        } else if (Intrinsics.areEqual(Short.TYPE, cls)) {
            objValueOf = Short.valueOf((short) jSONArray.getInt(i10));
        } else {
            objValueOf = jSONArray.get(i10);
        }
        Intrinsics.checkNotNull(objValueOf);
        return objValueOf;
    }
}
