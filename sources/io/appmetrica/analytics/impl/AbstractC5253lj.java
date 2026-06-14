package io.appmetrica.analytics.impl;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.lj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5253lj {
    public static byte[] a(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.reset();
        messageDigest.update(str.getBytes("UTF-8"));
        return messageDigest.digest();
    }
}
