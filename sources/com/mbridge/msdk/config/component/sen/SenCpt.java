package com.mbridge.msdk.config.component.sen;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class SenCpt extends com.mbridge.msdk.config.component.base.a {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static b f47225k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static Map<String, a> f47226l;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f47227h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f47228i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f47229j;

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(com.mbridge.msdk.config.component.base.b bVar) {
        a(a(bVar.c(), bVar.b()));
    }

    private void h() {
        if (f47225k == null) {
            f47225k = new b();
        }
        if (f47226l == null) {
            f47226l = new HashMap();
        }
        a aVar = new a() { // from class: com.mbridge.msdk.config.component.sen.c
            @Override // com.mbridge.msdk.config.component.sen.a
            public final void a(com.mbridge.msdk.config.component.base.b bVar) {
                this.f47234a.c(bVar);
            }
        };
        f47226l.put(this.f47228i, aVar);
        f47225k.a(aVar);
        f47225k.a(g(), this.f47228i, this.f47229j);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "917001";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            String key = entry.getKey();
            if (!TextUtils.isEmpty(key)) {
                key.getClass();
                switch (key) {
                    case "action":
                        this.f47227h = String.valueOf(entry.getValue());
                        break;
                    case "frequency":
                        double d10 = Double.parseDouble(String.valueOf(entry.getValue()));
                        if (d10 > 0.0d) {
                            this.f47229j = (int) (d10 * 1000.0d * 1000.0d);
                            break;
                        } else {
                            break;
                        }
                        break;
                    case "sensor_type":
                        this.f47228i = String.valueOf(entry.getValue());
                        break;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Map<String, a> map;
        super.d();
        if (this.f47227h.equals("start")) {
            h();
        }
        if (!this.f47227h.equals("end") || f47225k == null || (map = f47226l) == null) {
            return;
        }
        f47225k.b(map.get(this.f47228i));
        f47226l.remove(this.f47228i);
        if (f47226l.isEmpty()) {
            f47225k.a();
            f47225k = null;
        }
    }

    private int g() {
        String str = this.f47228i;
        str.getClass();
        switch (str) {
            case "magnetic":
                return 2;
            case "rotation":
                return 11;
            case "gyroscope":
                return 4;
            case "accelerometer":
                return 1;
            default:
                return -1;
        }
    }
}
