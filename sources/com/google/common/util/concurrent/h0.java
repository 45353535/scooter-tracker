package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: classes9.dex */
public abstract /* synthetic */ class h0 {
    public static /* synthetic */ boolean a(AtomicReferenceArray atomicReferenceArray, int i10, Object obj, Object obj2) {
        while (!atomicReferenceArray.compareAndSet(i10, obj, obj2)) {
            if (atomicReferenceArray.get(i10) != obj) {
                return false;
            }
        }
        return true;
    }
}
