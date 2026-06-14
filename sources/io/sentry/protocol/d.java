package io.sentry.protocol;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.q;
import io.sentry.t1;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private q f83884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f83885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83886d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d a(m3 m3Var, ILogger iLogger) {
            d dVar = new d();
            m3Var.beginObject();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("images")) {
                    dVar.f83885c = m3Var.P(iLogger, new DebugImage.a());
                } else if (strNextName.equals("sdk_info")) {
                    dVar.f83884b = (q) m3Var.B(iLogger, new q.a());
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            dVar.f(map);
            return dVar;
        }
    }

    public static d c(d dVar, v7 v7Var) {
        ArrayList arrayList = new ArrayList();
        if (v7Var.getProguardUuid() != null) {
            DebugImage debugImage = new DebugImage();
            debugImage.setType(DebugImage.PROGUARD);
            debugImage.setUuid(v7Var.getProguardUuid());
            arrayList.add(debugImage);
        }
        for (String str : v7Var.getBundleIds()) {
            DebugImage debugImage2 = new DebugImage();
            debugImage2.setType(DebugImage.JVM);
            debugImage2.setDebugId(str);
            arrayList.add(debugImage2);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        if (dVar == null) {
            dVar = new d();
        }
        if (dVar.d() == null) {
            dVar.e(arrayList);
            return dVar;
        }
        dVar.d().addAll(arrayList);
        return dVar;
    }

    public List d() {
        return this.f83885c;
    }

    public void e(List list) {
        this.f83885c = list != null ? new ArrayList(list) : null;
    }

    public void f(Map map) {
        this.f83886d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83884b != null) {
            n3Var.e("sdk_info").j(iLogger, this.f83884b);
        }
        if (this.f83885c != null) {
            n3Var.e("images").j(iLogger, this.f83885c);
        }
        Map map = this.f83886d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83886d.get(str));
            }
        }
        n3Var.endObject();
    }
}
