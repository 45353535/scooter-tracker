package com.inmobi.media;

import java.util.BitSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public abstract class I6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final D2 f37053a;

    public I6(String b64feature) {
        Intrinsics.checkNotNullParameter(b64feature, "b64feature");
        D2 d22 = new D2();
        this.f37053a = d22;
        d22.a(b64feature);
    }

    public final boolean a(boolean z10) {
        BitSet bitSet = this.f37053a.f36698a;
        return bitSet != null ? bitSet.get(0) : z10;
    }
}
