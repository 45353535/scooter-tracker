package com.mbridge.msdk.config.component.time;

import android.os.Handler;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.d;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class TimeCpt extends com.mbridge.msdk.config.component.base.a implements d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Map<String, Object> f47283h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Map<String, Object> f47284i = new HashMap();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f47285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    long f47286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f47287l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    String f47288m;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f47289a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f47290b;

        public a(boolean z10) {
            this.f47290b = z10;
        }

        @Override // java.lang.Runnable
        public void run() {
            HashMap map = new HashMap();
            int i10 = this.f47289a;
            this.f47289a = i10 + 1;
            map.put("triggered_count", Integer.valueOf(i10));
            TimeCpt timeCpt = TimeCpt.this;
            timeCpt.a(timeCpt.a("919003", map));
            if (this.f47290b) {
                TimeCpt timeCpt2 = TimeCpt.this;
                Handler handler = (Handler) timeCpt2.f47283h.get(timeCpt2.f47285j);
                if (handler != null) {
                    handler.postDelayed(this, TimeCpt.this.f47286k);
                }
            }
        }
    }

    @Override // com.mbridge.msdk.config.component.base.d
    public boolean a(Map<?, ?> map) {
        if (map != null && !map.isEmpty()) {
            Object obj = map.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("name");
                if (obj2 instanceof String) {
                    return this.f47285j.equals(String.valueOf(obj2));
                }
            }
        }
        return false;
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void b(Map<String, Object> map) {
        this.f46644f = "919001";
        if (map == null || map.isEmpty()) {
            return;
        }
        Object obj = map.get("name");
        if (obj != null) {
            this.f47285j = String.valueOf(obj);
        }
        Object obj2 = map.get("duration");
        if (obj2 != null) {
            String strValueOf = String.valueOf(obj2);
            if (!TextUtils.isEmpty(strValueOf)) {
                this.f47286k = ((long) Integer.parseInt(strValueOf)) * 1000;
            }
        }
        Object obj3 = map.get("repeat");
        if (obj3 != null) {
            String strValueOf2 = String.valueOf(obj3);
            if (!TextUtils.isEmpty(strValueOf2)) {
                this.f47287l = Integer.parseInt(strValueOf2);
            }
        }
        Object obj4 = map.get("action");
        if (obj4 != null) {
            this.f47288m = String.valueOf(obj4);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.a
    protected void c(Map<String, Object> map) {
        super.c(map);
    }

    @Override // com.mbridge.msdk.config.component.base.a
    public void d() {
        Handler handler;
        Runnable aVar;
        super.d();
        if (this.f47283h.containsKey(this.f47285j)) {
            handler = (Handler) this.f47283h.get(this.f47285j);
        } else {
            handler = new Handler();
            this.f47283h.put(this.f47285j, handler);
        }
        if (this.f47284i.containsKey(this.f47285j)) {
            aVar = (Runnable) this.f47284i.get(this.f47285j);
        } else {
            aVar = new a(this.f47287l == 1);
            this.f47284i.put(this.f47285j, aVar);
        }
        if (handler == null || aVar == null) {
            return;
        }
        String str = this.f47288m;
        str.getClass();
        switch (str) {
            case "resume":
            case "start":
                handler.postDelayed(aVar, this.f47286k);
                break;
            case "stop":
                handler.removeCallbacks(aVar);
                this.f47283h.remove(this.f47285j);
                break;
            case "pause":
                handler.removeCallbacks(aVar);
                break;
        }
    }
}
