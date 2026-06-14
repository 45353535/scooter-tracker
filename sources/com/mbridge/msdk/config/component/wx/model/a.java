package com.mbridge.msdk.config.component.wx.model;

import android.content.Context;
import com.mbridge.msdk.foundation.entity.DomainCampaignEx;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f47352f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("app_id");
            if (obj != null) {
                e(String.valueOf(obj));
            }
            Object obj2 = map.get("user_name");
            if (obj2 != null) {
                c(String.valueOf(obj2));
            }
            Object obj3 = map.get("path");
            if (obj3 != null) {
                d(String.valueOf(obj3));
            }
            Object obj4 = map.get(DomainCampaignEx.KEY_BIND_ID);
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
            Object obj5 = map.get("universal_link");
            if (obj5 != null) {
                b(String.valueOf(obj5));
            }
        }
    }

    public Context b() {
        return this.f47347a;
    }

    public String c() {
        return this.f47349c;
    }

    public String d() {
        return this.f47350d;
    }

    public String e() {
        return this.f47348b;
    }

    public void b(String str) {
        this.f47352f = str;
    }

    public void c(String str) {
        this.f47349c = str;
    }

    public void d(String str) {
        this.f47350d = str;
    }

    public void e(String str) {
        this.f47348b = str;
    }

    public void a(Context context) {
        this.f47347a = context;
    }

    public String a() {
        return this.f47351e;
    }

    public void a(String str) {
        this.f47351e = str;
    }
}
