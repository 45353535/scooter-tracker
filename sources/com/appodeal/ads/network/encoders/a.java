package com.appodeal.ads.network.encoders;

import android.util.Base64;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements d, c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f13950a = new a();

    @Override // com.appodeal.ads.network.encoders.d
    public final Map a() {
        return MapsKt.emptyMap();
    }

    @Override // com.appodeal.ads.network.encoders.d
    public final byte[] a(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrEncode = Base64.encode(data, 0);
        Intrinsics.checkNotNullExpressionValue(bArrEncode, "encode(...)");
        return bArrEncode;
    }

    @Override // com.appodeal.ads.network.encoders.c
    public final byte[] a(String str, byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        byte[] bArrDecode = Base64.decode(data, 0);
        Intrinsics.checkNotNullExpressionValue(bArrDecode, "decode(...)");
        return bArrDecode;
    }
}
