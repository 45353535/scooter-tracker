package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes8.dex */
public final class zzguy {
    static Object zza(Iterator it) {
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        it.remove();
        return next;
    }

    static void zzb(Iterator it) {
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }
}
