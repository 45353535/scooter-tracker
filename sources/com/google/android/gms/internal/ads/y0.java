package com.google.android.gms.internal.ads;

import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public abstract /* synthetic */ class y0 {
    public static /* synthetic */ boolean a(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!unsafe.compareAndSwapObject(obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
