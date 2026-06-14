package com.mbridge.msdk.config.component.load.model;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47098a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47100c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47103f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f47099b = 1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47101d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47102e = 0;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("url");
            if (obj != null) {
                this.f47098a = String.valueOf(obj);
            }
            Object obj2 = map.get(SessionDescription.ATTR_RANGE);
            if (obj2 != null) {
                float f10 = Float.parseFloat(String.valueOf(obj2));
                if (f10 <= 0.0f || f10 > 1.0f) {
                    f10 = 1.0f;
                }
                this.f47099b = f10;
            }
            Object obj3 = map.get("action");
            if (obj3 != null) {
                this.f47100c = String.valueOf(obj3);
            }
            Object obj4 = map.get("timeout");
            if (obj4 != null) {
                int i10 = Integer.parseInt(String.valueOf(obj4));
                if (i10 == 0) {
                    i10 = 30;
                }
                this.f47101d = i10;
            }
            Object obj5 = map.get("retry");
            if (obj5 != null) {
                this.f47102e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get("max_concurrent");
            if (obj6 != null) {
                this.f47103f = Integer.parseInt(String.valueOf(obj6));
            }
        }
    }

    public float b() {
        return this.f47099b;
    }

    public int c() {
        return this.f47103f;
    }

    public String d() {
        return this.f47098a;
    }

    public int e() {
        return this.f47102e;
    }

    public int f() {
        return this.f47101d * 1000;
    }

    public String a() {
        return this.f47100c;
    }
}
