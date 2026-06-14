package io.sentry.protocol;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f83999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f84000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f84001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map f84002e;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public m a(m3 m3Var, ILogger iLogger) {
            String strNextName;
            m3Var.beginObject();
            m mVar = new m();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "params":
                        List list = (List) m3Var.p0();
                        if (list == null) {
                            break;
                        } else {
                            mVar.f84001d = list;
                            break;
                        }
                        break;
                    case "message":
                        mVar.f84000c = m3Var.G();
                        break;
                    case "formatted":
                        mVar.f83999b = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            mVar.g(concurrentHashMap);
            m3Var.endObject();
            return mVar;
        }
    }

    public String d() {
        return this.f83999b;
    }

    public String e() {
        return this.f84000c;
    }

    public void f(String str) {
        this.f83999b = str;
    }

    public void g(Map map) {
        this.f84002e = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83999b != null) {
            n3Var.e("formatted").a(this.f83999b);
        }
        if (this.f84000c != null) {
            n3Var.e(PglCryptUtils.KEY_MESSAGE).a(this.f84000c);
        }
        List list = this.f84001d;
        if (list != null && !list.isEmpty()) {
            n3Var.e("params").j(iLogger, this.f84001d);
        }
        Map map = this.f84002e;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84002e.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }
}
