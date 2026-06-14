package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import java.net.URI;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j {
    public static final String a(String str) throws NoSuchAlgorithmException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        URI uri = new URI(str);
        String string = new URI(uri.getScheme(), uri.getAuthority(), uri.getPath(), null, uri.getFragment()).toString();
        Intrinsics.checkNotNullExpressionValue(string, "run(...)");
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        byte[] bytes = string.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        messageDigest.update(bytes);
        byte[] bArrDigest = messageDigest.digest();
        Intrinsics.checkNotNullExpressionValue(bArrDigest, "digest(...)");
        return f0.a(bArrDigest);
    }
}
