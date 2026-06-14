package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Random;
import org.json.JSONException;

/* JADX INFO: renamed from: com.ironsource.m5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4427m5 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f43685d = 1;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f43686e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f43687f = "C38FB23A402222A0C17D34A92F971D1F";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f43688g = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQDaUZaiASqhU4+s3JiQaIzVYtC+rZiPX2K+ZRg4C21kBZDNQM5+SEkp5GT5a9W/IR2oz6Q/ucifXcc7QEo5Xl5GX1BAhFI+8KaxPmn5Km5zFdH0aCvrrpDYQpH239Q+2uuUC79G5MpfSIw0zixU4VkF0WbVdHDpgQDds39cPl6cTwIDAQAB";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f43689h = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&'()*+,-./:;<=>?@[\\]^_`{|}~";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f43690i = 32;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final C4427m5 f43691j = new C4427m5();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f43692a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f43693b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f43694c = "";

    private String a(String str, int i10) {
        StringBuilder sb2 = new StringBuilder();
        Random random = new Random();
        for (int i11 = 0; i11 < i10; i11++) {
            sb2.append(str.charAt(random.nextInt(str.length())));
        }
        return sb2.toString();
    }

    public static C4427m5 b() {
        return f43691j;
    }

    public String c() {
        if (TextUtils.isEmpty(this.f43692a)) {
            this.f43692a = f43687f;
        }
        return this.f43692a;
    }

    public synchronized String d() {
        try {
            if (TextUtils.isEmpty(this.f43693b)) {
                this.f43693b = a(f43689h, 32);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f43693b;
    }

    public String a() throws JSONException {
        if (TextUtils.isEmpty(this.f43694c)) {
            try {
                this.f43694c = C4228aa.a(d(), f43688g);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                String str = "Session key encryption exception: " + e10.getLocalizedMessage();
                IronLog.INTERNAL.error(str);
                throw new JSONException(str);
            }
        }
        return this.f43694c;
    }
}
