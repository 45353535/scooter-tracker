package com.mbridge.msdk.foundation.same.buffer;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, JSONObject> f48617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f48618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f48619c;

    public a(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.f48618b = i10;
        this.f48617a = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str == null || jSONObject == null) {
            throw new NullPointerException("key == null || value == null");
        }
        synchronized (this) {
            try {
                this.f48619c += b(str, jSONObject);
                JSONObject jSONObjectPut = this.f48617a.put(str, jSONObject);
                if (jSONObjectPut != null) {
                    this.f48619c -= b(str, jSONObjectPut);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        a(this.f48618b);
        return true;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.f48618b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.f48617a.get(str);
            }
            return jSONObject;
        }
        throw new NullPointerException("key == null");
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.f48617a.keySet());
        }
        return hashSet;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0055, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f48619c     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L56
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f48617a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f48619c     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L56
            goto L14
        L12:
            r4 = move-exception
            goto L75
        L14:
            int r0 = r3.f48619c     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L54
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f48617a     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L54
        L21:
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r0 = r3.f48617a     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L55
        L35:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch: java.lang.Throwable -> L12
            int r0 = r3.b(r1, r0)     // Catch: java.lang.Throwable -> L52
            java.util.LinkedHashMap<java.lang.String, org.json.JSONObject> r2 = r3.f48617a     // Catch: java.lang.Throwable -> L52
            java.lang.Object r1 = r2.remove(r1)     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r1 = (org.json.JSONObject) r1     // Catch: java.lang.Throwable -> L52
            int r1 = r3.f48619c     // Catch: java.lang.Throwable -> L52
            int r1 = r1 - r0
            r3.f48619c = r1     // Catch: java.lang.Throwable -> L52
        L52:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L54:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
        L55:
            return
        L56:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            r0.<init>()     // Catch: java.lang.Throwable -> L12
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L12
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = ".sizeOf() is reporting inconsistent results!"
            r0.append(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L12
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r4     // Catch: java.lang.Throwable -> L12
        L75:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.buffer.a.a(int):void");
    }
}
