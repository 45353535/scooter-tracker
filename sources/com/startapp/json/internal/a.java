package com.startapp.json.internal;

import com.startapp.json.JsonException;
import com.startapp.json.TypeInfo;
import java.lang.annotation.Annotation;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map<String, Class<?>> f63660a;

    static {
        HashMap map = new HashMap();
        f63660a = map;
        map.put("int[]", Integer.class);
        map.put("long[]", Long.class);
        map.put("double[]", Double.class);
        map.put("float[]", Float.class);
        map.put("bool[]", Boolean.class);
        map.put("char[]", Character.class);
        map.put("byte[]", Byte.class);
        map.put("void[]", Void.class);
        map.put("short[]", Short.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0119  */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <T> T a(java.lang.Class<T> r20, org.json.JSONObject r21) throws com.startapp.json.JsonException {
        /*
            Method dump skipped, instruction units count: 624
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.json.internal.a.a(java.lang.Class, org.json.JSONObject):java.lang.Object");
    }

    public static <V> Set<V> b(Class<V> cls, JSONArray jSONArray) {
        HashSet hashSet = new HashSet();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            hashSet.add(jSONObjectOptJSONObject == null ? jSONArray.get(i10) : a(cls, jSONObjectOptJSONObject));
        }
        return hashSet;
    }

    public static boolean b(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations == null || declaredAnnotations.length == 0) {
            return false;
        }
        Annotation annotation = field.getDeclaredAnnotations()[0];
        if (annotation.annotationType().equals(TypeInfo.class)) {
            return ((TypeInfo) annotation).complex();
        }
        return false;
    }

    public static Object a(Object obj, Class<?> cls) {
        return obj.getClass().equals(cls) ? obj : cls.equals(Integer.class) ? obj.getClass().equals(Double.class) ? Integer.valueOf(((Double) obj).intValue()) : obj.getClass().equals(Long.class) ? Integer.valueOf(((Long) obj).intValue()) : obj : (cls.equals(Long.class) && obj.getClass().equals(Integer.class)) ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }

    public static Object a(JSONObject jSONObject, Field field, Object obj, Class<?> cls) {
        if (!obj.getClass().equals(cls)) {
            boolean zEquals = obj.getClass().equals(String.class);
            Class cls2 = Integer.TYPE;
            if (zEquals) {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(jSONObject.getInt(a(field)));
                }
            } else {
                if (cls.equals(cls2)) {
                    return Integer.valueOf(((Number) obj).intValue());
                }
                if (cls.equals(Float.TYPE)) {
                    return Float.valueOf(((Number) obj).floatValue());
                }
                if (cls.equals(Long.TYPE)) {
                    return Long.valueOf(((Number) obj).longValue());
                }
                if (cls.equals(Double.TYPE)) {
                    return Double.valueOf(((Number) obj).doubleValue());
                }
            }
        }
        return obj;
    }

    public static String a(Field field) {
        Annotation[] declaredAnnotations = field.getDeclaredAnnotations();
        if (declaredAnnotations != null && declaredAnnotations.length > 0) {
            Annotation annotation = field.getDeclaredAnnotations()[0];
            if (annotation.annotationType().equals(TypeInfo.class)) {
                TypeInfo typeInfo = (TypeInfo) annotation;
                if (!"".equals(typeInfo.name())) {
                    return typeInfo.name();
                }
            }
        }
        return field.getName();
    }

    public static <V> List<V> a(Class<V> cls, JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
            arrayList.add(jSONObjectOptJSONObject == null ? jSONArray.get(i10) : a(cls, jSONObjectOptJSONObject));
        }
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.HashMap, java.util.Map<java.lang.String, java.lang.Class<?>>] */
    public static <T> Object a(JSONObject jSONObject, Class<T> cls, Field field) throws JSONException, NoSuchMethodException {
        if (cls != null) {
            JSONArray jSONArray = jSONObject.getJSONArray(a(field));
            int length = jSONArray.length();
            Object objNewInstance = Array.newInstance((Class<?>) cls, length);
            for (int i10 = 0; i10 < length; i10++) {
                Array.set(objNewInstance, i10, a(cls, jSONArray.getJSONObject(i10)));
            }
            return (Object[]) objNewInstance;
        }
        JSONArray jSONArray2 = jSONObject.getJSONArray(a(field));
        int length2 = jSONArray2.length();
        Class cls2 = (Class) f63660a.get(field.getType().getSimpleName());
        Object objNewInstance2 = Array.newInstance((Class<?>) cls2.getField("TYPE").get(null), length2);
        for (int i11 = 0; i11 < length2; i11++) {
            String string = jSONArray2.getString(i11);
            Constructor<T> constructor = cls2.getConstructor(cls2.equals(Character.class) ? Character.TYPE : String.class);
            Array.set(objNewInstance2, i11, cls2.equals(Character.class) ? constructor.newInstance(Character.valueOf(string.charAt(0))) : constructor.newInstance(string));
        }
        return objNewInstance2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Map a(Class cls, Class cls2, Class cls3, JSONObject jSONObject, Iterator it) throws JsonException {
        Object objA;
        HashMap map = new HashMap();
        while (it.hasNext()) {
            Object next = it.next();
            Object objCast = cls.equals(Integer.class) ? cls.cast(Integer.valueOf(Integer.parseInt((String) next))) : next;
            if (cls.isEnum()) {
                objCast = Enum.valueOf(cls, objCast.toString());
            }
            String str = (String) next;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(str);
            if (jSONObjectOptJSONObject == null) {
                JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(str);
                if (jSONArrayOptJSONArray == null) {
                    objA = cls2.isEnum() ? Enum.valueOf(cls2, (String) jSONObject.get(str)) : jSONObject.get(str);
                } else {
                    objA = a(cls3, jSONArrayOptJSONArray);
                }
            } else {
                objA = a((Class<Object>) cls2, jSONObjectOptJSONObject);
            }
            map.put(objCast, objA);
        }
        return map;
    }
}
