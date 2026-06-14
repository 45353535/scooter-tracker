package io.sentry;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class j7 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f83655c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83656d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public j7 a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            String strG = null;
            Object objP0 = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("type")) {
                    strG = m3Var.G();
                } else if (strNextName.equals("value")) {
                    objP0 = m3Var.p0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            if (strG != null) {
                j7 j7Var = new j7(strG, objP0);
                j7Var.a(map);
                return j7Var;
            }
            IllegalStateException illegalStateException = new IllegalStateException("Missing required field \"type\"");
            iLogger.a(g7.ERROR, "Missing required field \"type\"", illegalStateException);
            throw illegalStateException;
        }
    }

    public j7(String str, Object obj) {
        this.f83654b = str;
        if (obj == null || !str.equals(TypedValues.Custom.S_STRING)) {
            this.f83655c = obj;
        } else {
            this.f83655c = obj.toString();
        }
    }

    public void a(Map map) {
        this.f83656d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("type").j(iLogger, this.f83654b);
        n3Var.e("value").j(iLogger, this.f83655c);
        Map map = this.f83656d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83656d.get(str));
            }
        }
        n3Var.endObject();
    }
}
