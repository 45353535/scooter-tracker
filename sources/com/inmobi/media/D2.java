package com.inmobi.media;

import android.util.Base64;
import java.util.BitSet;
import kotlin.Lazy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class D2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public BitSet f36698a;

    public final void a(String b64String) {
        byte[] value;
        BitSet bitSetValueOf;
        Intrinsics.checkNotNullParameter(b64String, "b64String");
        try {
            value = Base64.decode(b64String, 0);
        } catch (Exception e10) {
            Lazy lazy = P9.f37527a;
            AbstractC3779i9.a(e10);
            value = null;
        }
        if (value != null) {
            Intrinsics.checkNotNullParameter(value, "value");
            C4148x5.f39893a.getClass();
            if (C4148x5.u()) {
                bitSetValueOf = BitSet.valueOf(value);
            } else {
                Intrinsics.checkNotNullParameter(value, "<this>");
                BitSet bitSet = new BitSet(value.length * 8);
                int i10 = 0;
                for (byte b10 : value) {
                    int i11 = 0;
                    while (i11 < 8) {
                        int i12 = i10 + 1;
                        bitSet.set(i10, ((b10 >> ((byte) i11)) & 1) == 1);
                        i11++;
                        i10 = i12;
                    }
                }
                bitSetValueOf = bitSet;
            }
            this.f36698a = bitSetValueOf;
        }
    }
}
