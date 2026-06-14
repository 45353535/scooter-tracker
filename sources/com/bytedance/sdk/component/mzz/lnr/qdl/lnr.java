package com.bytedance.sdk.component.mzz.lnr.qdl;

import com.ironsource.C4240b4;
import java.lang.ref.SoftReference;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class lnr<K, V> {
    private int jpc;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final LinkedHashMap<K, SoftReference<V>> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16587ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16588wd;

    public lnr(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        this.lnr = i10;
        this.qdl = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int lnr(K k10, V v10) {
        int iUd = ud(k10, v10);
        if (iUd >= 0) {
            return iUd;
        }
        throw new IllegalStateException("Negative size: " + k10 + C4240b4.j.f42668b + v10);
    }

    public final V qdl(K k10) {
        V v10;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                SoftReference<V> softReference = this.qdl.get(k10);
                if (softReference != null) {
                    v10 = softReference.get();
                    if (v10 != null) {
                        this.f16588wd++;
                        return v10;
                    }
                    this.qdl.remove(k10);
                } else {
                    v10 = null;
                }
                this.jpc++;
                V vUd = ud(k10);
                if (vUd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.mzz++;
                        SoftReference<V> softReferencePut = this.qdl.put(k10, new SoftReference<>(vUd));
                        if (softReferencePut != null) {
                            v10 = softReferencePut.get();
                        }
                        if (v10 != null) {
                            this.qdl.put(k10, softReferencePut);
                        } else {
                            this.f16587ud += lnr(k10, vUd);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (v10 != null) {
                    return v10;
                }
                qdl(this.lnr);
                return vUd;
            } finally {
            }
        }
    }

    public final synchronized String toString() {
        int i10;
        int i11;
        try {
            i10 = this.f16588wd;
            i11 = this.jpc + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format("LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.lnr), Integer.valueOf(this.f16588wd), Integer.valueOf(this.jpc), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    protected int ud(K k10, V v10) {
        return 1;
    }

    protected V ud(K k10) {
        return null;
    }

    public final V qdl(K k10, V v10) {
        V v11;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.mml++;
                    this.f16587ud += lnr(k10, v10);
                    SoftReference<V> softReferencePut = this.qdl.put(k10, new SoftReference<>(v10));
                    if (softReferencePut != null) {
                        v11 = softReferencePut.get();
                        if (v11 != null) {
                            this.f16587ud -= lnr(k10, v11);
                        }
                    } else {
                        v11 = null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qdl(this.lnr);
            return v11;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        android.util.Log.e("LruCache", "oom maybe occured, clear cache. size= " + r3.f16587ud + ", maxSize: " + r4);
        r3.f16587ud = 0;
        r3.qdl.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void qdl(int r4) {
        /*
            r3 = this;
        L0:
            monitor-enter(r3)
            int r0 = r3.f16587ud     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L54
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.qdl     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f16587ud     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            goto L54
        L12:
            r4 = move-exception
            goto L7b
        L14:
            int r0 = r3.f16587ud     // Catch: java.lang.Throwable -> L12
            if (r0 > r4) goto L1a
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L1a:
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r0 = r3.qdl     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L2e
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L2e:
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.lang.ref.SoftReference r0 = (java.lang.ref.SoftReference) r0     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r2 = r3.qdl     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L4c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f16587ud     // Catch: java.lang.Throwable -> L12
            int r0 = r3.lnr(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f16587ud = r2     // Catch: java.lang.Throwable -> L12
        L4c:
            int r0 = r3.mo     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.mo = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L54:
            java.lang.String r0 = "LruCache"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "oom maybe occured, clear cache. size= "
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f16587ud     // Catch: java.lang.Throwable -> L12
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = ", maxSize: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L12
            r1.append(r4)     // Catch: java.lang.Throwable -> L12
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L12
            android.util.Log.e(r0, r4)     // Catch: java.lang.Throwable -> L12
            r4 = 0
            r3.f16587ud = r4     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, java.lang.ref.SoftReference<V>> r4 = r3.qdl     // Catch: java.lang.Throwable -> L12
            r4.clear()     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L7b:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.mzz.lnr.qdl.lnr.qdl(int):void");
    }
}
