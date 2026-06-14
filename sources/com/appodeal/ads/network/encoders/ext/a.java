package com.appodeal.ads.network.encoders.ext;

import com.appodeal.ads.network.encoders.c;
import com.appodeal.ads.network.encoders.d;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class a {
    public static final byte[] a(byte[] bArr, String str, List decoders) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(decoders, "decoders");
        Iterator it = decoders.iterator();
        while (it.hasNext()) {
            bArr = ((c) it.next()).a(str, bArr);
        }
        return bArr;
    }

    public static final byte[] b(byte[] bArr, List encoders) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        Intrinsics.checkNotNullParameter(encoders, "encoders");
        Iterator it = encoders.iterator();
        while (it.hasNext()) {
            bArr = ((d) it.next()).a(bArr);
        }
        return bArr;
    }
}
