package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.k0;
import io.sentry.t1;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f83969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f83970c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83971d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j0 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            String strG = null;
            List listP = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("rendering_system")) {
                    strG = m3Var.G();
                } else if (strNextName.equals("windows")) {
                    listP = m3Var.P(iLogger, new k0.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            j0 j0Var = new j0(strG, listP);
            j0Var.b(map);
            return j0Var;
        }
    }

    public j0(String str, List list) {
        this.f83969b = str;
        this.f83970c = list;
    }

    public List a() {
        return this.f83970c;
    }

    public void b(Map map) {
        this.f83971d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83969b != null) {
            n3Var.e("rendering_system").a(this.f83969b);
        }
        if (this.f83970c != null) {
            n3Var.e("windows").j(iLogger, this.f83970c);
        }
        Map map = this.f83971d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83971d.get(str));
            }
        }
        n3Var.endObject();
    }
}
