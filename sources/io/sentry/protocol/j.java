package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f83960c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f83961d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f83962e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f83963f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83964g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Boolean f83965h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private String f83966i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f83967j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Map f83968k;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            j jVar = new j();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "npot_support":
                        jVar.f83967j = m3Var.G();
                        break;
                    case "vendor_id":
                        jVar.f83961d = m3Var.G();
                        break;
                    case "multi_threaded_rendering":
                        jVar.f83965h = m3Var.x();
                        break;
                    case "id":
                        jVar.f83960c = m3Var.d0();
                        break;
                    case "name":
                        jVar.f83959b = m3Var.G();
                        break;
                    case "vendor_name":
                        jVar.f83962e = m3Var.G();
                        break;
                    case "version":
                        jVar.f83966i = m3Var.G();
                        break;
                    case "api_type":
                        jVar.f83964g = m3Var.G();
                        break;
                    case "memory_size":
                        jVar.f83963f = m3Var.d0();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            jVar.j(concurrentHashMap);
            m3Var.endObject();
            return jVar;
        }
    }

    public j() {
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && j.class == obj.getClass()) {
            j jVar = (j) obj;
            if (io.sentry.util.w.a(this.f83959b, jVar.f83959b) && io.sentry.util.w.a(this.f83960c, jVar.f83960c) && io.sentry.util.w.a(this.f83961d, jVar.f83961d) && io.sentry.util.w.a(this.f83962e, jVar.f83962e) && io.sentry.util.w.a(this.f83963f, jVar.f83963f) && io.sentry.util.w.a(this.f83964g, jVar.f83964g) && io.sentry.util.w.a(this.f83965h, jVar.f83965h) && io.sentry.util.w.a(this.f83966i, jVar.f83966i) && io.sentry.util.w.a(this.f83967j, jVar.f83967j)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83959b, this.f83960c, this.f83961d, this.f83962e, this.f83963f, this.f83964g, this.f83965h, this.f83966i, this.f83967j);
    }

    public void j(Map map) {
        this.f83968k = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83959b != null) {
            n3Var.e("name").a(this.f83959b);
        }
        if (this.f83960c != null) {
            n3Var.e("id").i(this.f83960c);
        }
        if (this.f83961d != null) {
            n3Var.e("vendor_id").a(this.f83961d);
        }
        if (this.f83962e != null) {
            n3Var.e("vendor_name").a(this.f83962e);
        }
        if (this.f83963f != null) {
            n3Var.e("memory_size").i(this.f83963f);
        }
        if (this.f83964g != null) {
            n3Var.e("api_type").a(this.f83964g);
        }
        if (this.f83965h != null) {
            n3Var.e("multi_threaded_rendering").k(this.f83965h);
        }
        if (this.f83966i != null) {
            n3Var.e("version").a(this.f83966i);
        }
        if (this.f83967j != null) {
            n3Var.e("npot_support").a(this.f83967j);
        }
        Map map = this.f83968k;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83968k.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    j(j jVar) {
        this.f83959b = jVar.f83959b;
        this.f83960c = jVar.f83960c;
        this.f83961d = jVar.f83961d;
        this.f83962e = jVar.f83962e;
        this.f83963f = jVar.f83963f;
        this.f83964g = jVar.f83964g;
        this.f83965h = jVar.f83965h;
        this.f83966i = jVar.f83966i;
        this.f83967j = jVar.f83967j;
        this.f83968k = io.sentry.util.c.b(jVar.f83968k);
    }
}
