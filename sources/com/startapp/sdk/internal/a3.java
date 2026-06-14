package com.startapp.sdk.internal;

import android.content.Context;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.SoftReference;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public final class a3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f64244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f64245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f64246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Class[] f64247d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object[] f64248e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String[] f64249f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public transient SoftReference f64250g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final transient ConcurrentHashMap f64251h = new ConcurrentHashMap();

    public a3(String str, String str2, String[] strArr, Class[] clsArr, Object[] objArr, String[] strArr2) {
        this.f64244a = str;
        this.f64245b = str2;
        this.f64246c = strArr;
        this.f64247d = clsArr;
        this.f64248e = objArr;
        this.f64249f = strArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.ArrayList, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.List] */
    public final JSONArray a(Context context, int[] iArr, Integer num) {
        Comparator d6Var;
        try {
            c3 c3VarA = a(context);
            Object objInvoke = c3VarA.f64335b.invoke(c3VarA.f64334a, this.f64248e);
            Iterator it = objInvoke == null ? z2.f65665a : objInvoke instanceof Collection ? ((Collection) objInvoke).iterator() : objInvoke.getClass().isArray() ? new y2(Array.getLength(objInvoke), objInvoke) : Collections.singleton(objInvoke).iterator();
            ?? arrayList = new ArrayList();
            while (true) {
                d6Var = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (next != null) {
                    JSONObject jSONObject = new JSONObject();
                    Class<?> cls = next.getClass();
                    SoftReference softReference = (SoftReference) this.f64251h.get(cls.getName());
                    Map mapA = softReference != null ? (Map) softReference.get() : null;
                    if (mapA == null) {
                        mapA = a(cls, this.f64249f);
                        this.f64251h.put(cls.getName(), new SoftReference(mapA));
                    }
                    if (mapA.isEmpty()) {
                        try {
                            jSONObject.put("", next.toString());
                        } catch (Throwable unused) {
                        }
                    } else {
                        for (Map.Entry entry : mapA.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            try {
                                if (value instanceof Field) {
                                    jSONObject.put(str, a(((Field) value).get(next)));
                                } else if (value instanceof Method) {
                                    jSONObject.put(str, a(((Method) value).invoke(next, null)));
                                } else {
                                    boolean z10 = value instanceof Throwable;
                                }
                            } catch (Throwable unused2) {
                            }
                        }
                    }
                    arrayList.add(jSONObject);
                }
            }
            if (iArr != null && iArr.length > 0) {
                int length = this.f64249f.length;
                for (int i10 : iArr) {
                    if (i10 != 0 && Math.abs(i10) <= length) {
                        Comparator abVar = new ab(this.f64249f[Math.abs(i10) - 1]);
                        if (i10 < 0) {
                            abVar = Collections.reverseOrder(abVar);
                        }
                        d6Var = d6Var == null ? abVar : new d6(d6Var, abVar);
                    }
                }
                if (d6Var != null) {
                    Collections.sort(arrayList, d6Var);
                }
            }
            if (num != null && num.intValue() > 0) {
                arrayList = arrayList.subList(0, Math.min(num.intValue(), arrayList.size()));
            }
            JSONArray jSONArray = new JSONArray();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jSONArray.put((JSONObject) it2.next());
            }
            return jSONArray;
        } catch (IllegalAccessException e10) {
            throw new RuntimeException(String.valueOf(5), e10);
        } catch (InvocationTargetException e11) {
            throw new RuntimeException(String.valueOf(5), e11);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && a3.class == obj.getClass()) {
            a3 a3Var = (a3) obj;
            if (vi.a((Object) this.f64244a, (Object) a3Var.f64244a) && vi.a((Object) this.f64245b, (Object) a3Var.f64245b) && Arrays.equals(this.f64246c, a3Var.f64246c) && Arrays.equals(this.f64248e, a3Var.f64248e) && Arrays.equals(this.f64249f, a3Var.f64249f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Object[] objArr = {this.f64244a, this.f64245b, this.f64246c, this.f64248e, this.f64249f};
        WeakHashMap weakHashMap = vi.f65408a;
        return Arrays.deepHashCode(objArr);
    }

    public static Object a(Object obj) {
        if (obj instanceof Short) {
            return Integer.valueOf(((Short) obj).intValue());
        }
        if ((obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if ((obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof String)) {
            return obj;
        }
        if (obj != null) {
            return obj.toString();
        }
        return null;
    }

    public final c3 a(Context context) {
        Object objInvoke;
        SoftReference softReference = this.f64250g;
        c3 c3Var = softReference != null ? (c3) softReference.get() : null;
        if (c3Var != null) {
            return c3Var;
        }
        Object systemService = context.getSystemService(this.f64244a);
        if (systemService == null) {
            try {
                Object obj = a(Context.class, new String[]{this.f64244a}).get(this.f64244a);
                if (obj instanceof Method) {
                    objInvoke = ((Method) obj).invoke(context, null);
                } else if (obj instanceof Field) {
                    objInvoke = ((Field) obj).get(context);
                } else {
                    boolean z10 = obj instanceof Throwable;
                }
                systemService = objInvoke;
            } catch (Throwable unused) {
            }
        }
        if (systemService != null) {
            try {
                Method methodA = a(systemService.getClass(), this.f64245b, this.f64247d);
                if (!methodA.isAccessible()) {
                    try {
                        methodA.setAccessible(true);
                    } catch (SecurityException e10) {
                        throw new RuntimeException(String.valueOf(4), e10);
                    }
                }
                c3 c3Var2 = new c3(systemService, methodA);
                this.f64250g = new SoftReference(c3Var2);
                return c3Var2;
            } catch (NoSuchMethodException e11) {
                throw new RuntimeException(String.valueOf(3), e11);
            }
        }
        throw new RuntimeException(String.valueOf(1));
    }

    public static Method a(Class cls, String str, Class[] clsArr) throws NoSuchMethodException {
        NoSuchMethodException noSuchMethodException = null;
        while (cls != null) {
            try {
                return cls.getDeclaredMethod(str, clsArr);
            } catch (NoSuchMethodException e10) {
                if (noSuchMethodException == null) {
                    noSuchMethodException = e10;
                }
                cls = cls.getSuperclass();
            }
        }
        throw noSuchMethodException;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        r5.setAccessible(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0023, code lost:
    
        r0.put(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0019, code lost:
    
        if (r5.isAccessible() != false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069 A[Catch: NoSuchMethodException -> 0x0070, NoSuchMethodException | SecurityException -> 0x0094, TryCatch #1 {NoSuchMethodException -> 0x0070, blocks: (B:22:0x004c, B:24:0x0069, B:25:0x006c), top: B:37:0x004c, outer: #3 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.util.LinkedHashMap a(java.lang.Class r10, java.lang.String[] r11) {
        /*
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            int r1 = r11.length
            r2 = 0
            r3 = r2
        L8:
            if (r3 >= r1) goto L9b
            r4 = r11[r3]
            r5 = 0
            r6 = r10
        Le:
            r7 = 1
            if (r6 == 0) goto L30
            java.lang.reflect.Field r5 = r6.getDeclaredField(r4)     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L27
            boolean r6 = r5.isAccessible()     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L21
            if (r6 != 0) goto L23
            r5.setAccessible(r7)     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L21
            goto L23
        L1f:
            r5 = move-exception
            goto L31
        L21:
            r5 = move-exception
            goto L31
        L23:
            r0.put(r4, r5)     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L21
            goto L97
        L27:
            r8 = move-exception
            if (r5 != 0) goto L2b
            r5 = r8
        L2b:
            java.lang.Class r6 = r6.getSuperclass()     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L21
            goto Le
        L30:
            throw r5     // Catch: java.lang.SecurityException -> L1f java.lang.NoSuchFieldException -> L21
        L31:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            char r8 = r4.charAt(r2)
            char r8 = java.lang.Character.toUpperCase(r8)
            r6.append(r8)
            java.lang.String r8 = r4.substring(r7)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            java.lang.String r9 = "get"
            r8.append(r9)     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            r8.append(r6)     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            java.lang.String r8 = r8.toString()     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            java.lang.reflect.Method r8 = a(r10, r8, r9)     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            boolean r9 = r8.isAccessible()     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            if (r9 != 0) goto L6c
            r8.setAccessible(r7)     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
        L6c:
            r0.put(r4, r8)     // Catch: java.lang.NoSuchMethodException -> L70 java.lang.Throwable -> L94
            goto L97
        L70:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L94
            r8.<init>()     // Catch: java.lang.Throwable -> L94
            java.lang.String r9 = "is"
            r8.append(r9)     // Catch: java.lang.Throwable -> L94
            r8.append(r6)     // Catch: java.lang.Throwable -> L94
            java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L94
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L94
            java.lang.reflect.Method r6 = a(r10, r6, r8)     // Catch: java.lang.Throwable -> L94
            boolean r8 = r6.isAccessible()     // Catch: java.lang.Throwable -> L94
            if (r8 != 0) goto L90
            r6.setAccessible(r7)     // Catch: java.lang.Throwable -> L94
        L90:
            r0.put(r4, r6)     // Catch: java.lang.Throwable -> L94
            goto L97
        L94:
            r0.put(r4, r5)
        L97:
            int r3 = r3 + 1
            goto L8
        L9b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.startapp.sdk.internal.a3.a(java.lang.Class, java.lang.String[]):java.util.LinkedHashMap");
    }
}
