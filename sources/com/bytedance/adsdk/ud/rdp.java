package com.bytedance.adsdk.ud;

import com.ironsource.C4240b4;
import java.util.LinkedHashMap;
import java.util.Locale;

/* JADX INFO: loaded from: classes6.dex */
public class rdp<K, V> {
    private int jpc;
    private int lnr;
    private int mml;
    private int mo;
    private int mzz;
    private final LinkedHashMap<K, V> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16114ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f16115wd;

    public rdp(int i10) {
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
        V vPut;
        if (k10 == null) {
            throw new NullPointerException("key == null");
        }
        synchronized (this) {
            try {
                V v10 = this.qdl.get(k10);
                if (v10 != null) {
                    this.f16115wd++;
                    return v10;
                }
                this.jpc++;
                V vUd = ud(k10);
                if (vUd == null) {
                    return null;
                }
                synchronized (this) {
                    try {
                        this.mzz++;
                        vPut = this.qdl.put(k10, vUd);
                        if (vPut != null) {
                            this.qdl.put(k10, vPut);
                        } else {
                            this.f16114ud += lnr(k10, vUd);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (vPut != null) {
                    return vPut;
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
            i10 = this.f16115wd;
            i11 = this.jpc + i10;
        } catch (Throwable th2) {
            throw th2;
        }
        return String.format(Locale.US, "LruCache[maxSize=%d,hits=%d,misses=%d,hitRate=%d%%]", Integer.valueOf(this.lnr), Integer.valueOf(this.f16115wd), Integer.valueOf(this.jpc), Integer.valueOf(i11 != 0 ? (i10 * 100) / i11 : 0));
    }

    protected int ud(K k10, V v10) {
        return 1;
    }

    protected V ud(K k10) {
        return null;
    }

    public final V qdl(K k10, V v10) {
        V vPut;
        if (k10 != null && v10 != null) {
            synchronized (this) {
                try {
                    this.mml++;
                    this.f16114ud += lnr(k10, v10);
                    vPut = this.qdl.put(k10, v10);
                    if (vPut != null) {
                        this.f16114ud -= lnr(k10, vPut);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            qdl(this.lnr);
            return vPut;
        }
        throw new NullPointerException("key == null || value == null");
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
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
            int r0 = r3.f16114ud     // Catch: java.lang.Throwable -> L12
            if (r0 < 0) goto L51
            java.util.LinkedHashMap<K, V> r0 = r3.qdl     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            int r0 = r3.f16114ud     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L51
            goto L14
        L12:
            r4 = move-exception
            goto L70
        L14:
            int r0 = r3.f16114ud     // Catch: java.lang.Throwable -> L12
            if (r0 <= r4) goto L4f
            java.util.LinkedHashMap<K, V> r0 = r3.qdl     // Catch: java.lang.Throwable -> L12
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L21
            goto L4f
        L21:
            java.util.LinkedHashMap<K, V> r0 = r3.qdl     // Catch: java.lang.Throwable -> L12
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L12
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.next()     // Catch: java.lang.Throwable -> L12
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L12
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L12
            java.util.LinkedHashMap<K, V> r2 = r3.qdl     // Catch: java.lang.Throwable -> L12
            r2.remove(r1)     // Catch: java.lang.Throwable -> L12
            int r2 = r3.f16114ud     // Catch: java.lang.Throwable -> L12
            int r0 = r3.lnr(r1, r0)     // Catch: java.lang.Throwable -> L12
            int r2 = r2 - r0
            r3.f16114ud = r2     // Catch: java.lang.Throwable -> L12
            int r0 = r3.mo     // Catch: java.lang.Throwable -> L12
            int r0 = r0 + 1
            r3.mo = r0     // Catch: java.lang.Throwable -> L12
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            goto L0
        L4f:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L12
            return
        L51:
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
        L70:
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.adsdk.ud.rdp.qdl(int):void");
    }
}
