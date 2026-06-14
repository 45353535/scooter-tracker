package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.b0;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f83880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f83881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Boolean f83882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f83883e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c0 a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            c0 c0Var = new c0();
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        c0Var.f83880b = m3Var.P(iLogger, new b0.a());
                        break;
                    case "registers":
                        c0Var.f83881c = io.sentry.util.c.b((Map) m3Var.p0());
                        break;
                    case "snapshot":
                        c0Var.f83882d = m3Var.x();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            c0Var.f(concurrentHashMap);
            m3Var.endObject();
            return c0Var;
        }
    }

    public c0() {
    }

    public List d() {
        return this.f83880b;
    }

    public void e(Boolean bool) {
        this.f83882d = bool;
    }

    public void f(Map map) {
        this.f83883e = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83880b != null) {
            n3Var.e(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS).j(iLogger, this.f83880b);
        }
        if (this.f83881c != null) {
            n3Var.e("registers").j(iLogger, this.f83881c);
        }
        if (this.f83882d != null) {
            n3Var.e("snapshot").k(this.f83882d);
        }
        Map map = this.f83883e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83883e.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public c0(List list) {
        this.f83880b = list;
    }
}
