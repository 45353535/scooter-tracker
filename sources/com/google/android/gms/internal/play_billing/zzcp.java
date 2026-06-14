package com.google.android.gms.internal.play_billing;

import com.google.android.gms.internal.ads.y0;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class zzcp {
    public static /* synthetic */ boolean zza(Unsafe unsafe, Object obj, long j10, Object obj2, Object obj3) {
        while (!y0.a(unsafe, obj, j10, obj2, obj3)) {
            if (unsafe.getObject(obj, j10) != obj2) {
                return false;
            }
        }
        return true;
    }
}
