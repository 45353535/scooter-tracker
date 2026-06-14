package com.ironsource.sdk.controller;

import com.ironsource.C4462o4;
import com.ironsource.Gb;
import com.ironsource.mediationsdk.logger.IronLog;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes10.dex */
final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f45243b = "MD5";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f45244a;

    s(String str) {
        this.f45244a = str;
    }

    static String a() {
        return UUID.randomUUID().toString();
    }

    private String b(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(str.getBytes());
            return a(messageDigest.digest());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return "";
        }
    }

    private String a(String str) {
        try {
            return Gb.a(str);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return b(str);
        }
    }

    private String a(byte[] bArr) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() < 2) {
                hexString = "0" + hexString;
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    String b() {
        return this.f45244a;
    }

    boolean a(String str, String str2, String str3) {
        try {
            return str3.equalsIgnoreCase(a(str + str2 + this.f45244a));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return false;
        }
    }
}
