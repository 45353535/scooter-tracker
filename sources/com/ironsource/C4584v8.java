package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.ironsource.v8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4584v8 implements InterfaceC4448n7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Object> f45628a = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.v8$a */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f45630b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45631c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Context f45632d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        String f45633e;

        a a(String str) {
            this.f45630b = str;
            return this;
        }

        a b(String str) {
            this.f45631c = str;
            return this;
        }

        a c(String str) {
            this.f45629a = str;
            return this;
        }

        a d(String str) {
            this.f45633e = str;
            return this;
        }

        a a(Context context) {
            this.f45632d = context;
            return this;
        }

        public C4584v8 a() {
            return new C4584v8(this);
        }
    }

    private void a(Context context) {
        f45628a.put(D5.f40558e, Y3.b(context));
        f45628a.put(D5.f40559f, Y3.d(context));
    }

    public static void b(String str) {
        f45628a.put(D5.f40559f, SDKUtils.encodeString(str));
    }

    private C4584v8(a aVar) {
        a(aVar);
        a(aVar.f45632d);
    }

    private void a(a aVar) {
        Context context = aVar.f45632d;
        Z4 z4B = Z4.b(context);
        f45628a.put(D5.f40563j, SDKUtils.encodeString(z4B.e()));
        f45628a.put(D5.f40564k, SDKUtils.encodeString(z4B.f()));
        f45628a.put(D5.f40565l, Integer.valueOf(z4B.a()));
        f45628a.put(D5.f40566m, SDKUtils.encodeString(z4B.d()));
        f45628a.put(D5.f40567n, SDKUtils.encodeString(z4B.c()));
        f45628a.put("bundleid", SDKUtils.encodeString(context.getPackageName()));
        f45628a.put(D5.f40560g, SDKUtils.encodeString(aVar.f45630b));
        f45628a.put("sessionid", SDKUtils.encodeString(aVar.f45629a));
        f45628a.put(D5.f40555b, SDKUtils.encodeString(SDKUtils.getSDKVersion()));
        f45628a.put(D5.f40568o, "prod");
        f45628a.put("origin", "n");
        if (TextUtils.isEmpty(aVar.f45633e)) {
            return;
        }
        f45628a.put(D5.f40562i, SDKUtils.encodeString(aVar.f45633e));
    }

    @Override // com.ironsource.InterfaceC4448n7
    public Map<String, Object> a() {
        return f45628a;
    }

    public static void a(String str) {
        f45628a.put(D5.f40558e, SDKUtils.encodeString(str));
    }
}
