package com.pgl.ssdk;

import android.content.Context;
import com.vungle.ads.internal.protos.Sdk;

/* JADX INFO: loaded from: classes11.dex */
public class ap extends am {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Context f62104n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final int f62105o;

    public ap(Context context, int i10) {
        super(context);
        this.f62104n = context;
        this.f62105o = i10;
    }

    @Override // com.pgl.ssdk.am
    public String a() {
        int i10 = this.f62105o;
        if (i10 == 222) {
            return "/ssdk/v2/r?os=0&ver=7.7.0.0.overseas-rc.1&mode=1&app_ver=" + ab.h(this.f62104n) + "&region=" + ad.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&aid=" + com.pgl.ssdk.ces.b.a();
        }
        if (i10 != 301) {
            return null;
        }
        return "/ssdk/sd/token?os=android&app_id=" + com.pgl.ssdk.ces.b.a() + "&did=" + com.pgl.ssdk.ces.b.b() + "&app_ver=" + ab.h(this.f62104n) + "&platform=android&ver=7.7.0.0.overseas-rc.1&mode=1";
    }

    @Override // com.pgl.ssdk.am
    public void a(int i10, byte[] bArr) {
        try {
            if (i10 == 200) {
                int i11 = this.f62105o;
                if (i11 == 222) {
                    ((Integer) com.pgl.ssdk.ces.a.meta(Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, null, bArr)).getClass();
                    return;
                }
                if (i11 == 301) {
                    Object objA = a5.a(bArr);
                    au.b("write token result = ".concat(String.valueOf(objA)));
                    if ((objA instanceof Integer) && ((Integer) objA).intValue() == 0) {
                        au.b("write token succ");
                        a5.f62037a = 200;
                        return;
                    } else {
                        if (objA instanceof String) {
                            a5.f62039c = (String) objA;
                            a5.f62037a = 200;
                            return;
                        }
                        return;
                    }
                }
                return;
            }
            an.b(this.f62104n);
        } catch (Throwable unused) {
        }
    }
}
