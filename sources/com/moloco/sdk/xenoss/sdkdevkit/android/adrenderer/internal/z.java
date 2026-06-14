package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final z f58866a = new z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f58867b = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f58868c = 8;

    public final int a(d0 wv) {
        Intrinsics.checkNotNullParameter(wv, "wv");
        int iHashCode = wv.hashCode();
        f58867b.put(Integer.valueOf(iHashCode), wv);
        return iHashCode;
    }

    public final void c(int i10) {
        f58867b.remove(Integer.valueOf(i10));
    }
}
