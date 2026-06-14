package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes8.dex */
final class zzate extends ThreadLocal {
    zzate(zzatf zzatfVar) {
    }

    @Override // java.lang.ThreadLocal
    protected final /* synthetic */ Object initialValue() {
        return ByteBuffer.allocate(32);
    }
}
