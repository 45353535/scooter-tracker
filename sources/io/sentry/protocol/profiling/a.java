package io.sentry.protocol.profiling;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.b0;
import io.sentry.protocol.profiling.b;
import io.sentry.protocol.profiling.c;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f84028b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f84029c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f84030d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f84031e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Map f84032f;

    public static final class b implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            a aVar = new a();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "frames":
                        List listP = m3Var.P(iLogger, new b0.a());
                        if (listP == null) {
                            break;
                        } else {
                            aVar.f84030d = listP;
                            break;
                        }
                        break;
                    case "stacks":
                        List list = (List) m3Var.B(iLogger, new c());
                        if (list == null) {
                            break;
                        } else {
                            aVar.f84029c = list;
                            break;
                        }
                        break;
                    case "samples":
                        List listP2 = m3Var.P(iLogger, new b.a());
                        if (listP2 == null) {
                            break;
                        } else {
                            aVar.f84028b = listP2;
                            break;
                        }
                        break;
                    case "thread_metadata":
                        Map mapK0 = m3Var.k0(iLogger, new c.a());
                        if (mapK0 == null) {
                            break;
                        } else {
                            aVar.f84031e = mapK0;
                            break;
                        }
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            aVar.e(concurrentHashMap);
            m3Var.endObject();
            return aVar;
        }
    }

    private static final class c implements t1 {
        private c() {
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public List a(m3 m3Var, ILogger iLogger) {
            ArrayList arrayList = new ArrayList();
            m3Var.beginArray();
            while (m3Var.hasNext()) {
                ArrayList arrayList2 = new ArrayList();
                m3Var.beginArray();
                while (m3Var.hasNext()) {
                    arrayList2.add(Integer.valueOf(m3Var.nextInt()));
                }
                m3Var.endArray();
                arrayList.add(arrayList2);
            }
            m3Var.endArray();
            return arrayList;
        }
    }

    public void e(Map map) {
        this.f84032f = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("samples").j(iLogger, this.f84028b);
        n3Var.e("stacks").j(iLogger, this.f84029c);
        n3Var.e(com.mbridge.msdk.foundation.entity.b.JSON_KEY_FRAME_ADS).j(iLogger, this.f84030d);
        n3Var.e("thread_metadata").j(iLogger, this.f84031e);
        Map map = this.f84032f;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84032f.get(str));
            }
        }
        n3Var.endObject();
    }
}
