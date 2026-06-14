package io.sentry.protocol.profiling;

import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f84037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f84038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f84039d;

    public static final class a implements t1 {
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(m3 m3Var, ILogger iLogger) {
            m3Var.beginObject();
            c cVar = new c();
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY)) {
                    cVar.f84038c = m3Var.nextInt();
                } else if (strNextName.equals("name")) {
                    cVar.f84037b = m3Var.G();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            cVar.c(map);
            m3Var.endObject();
            return cVar;
        }
    }

    public void c(Map map) {
        this.f84039d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84037b != null) {
            n3Var.e("name").j(iLogger, this.f84037b);
        }
        n3Var.e(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY).j(iLogger, Integer.valueOf(this.f84038c));
        Map map = this.f84039d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f84039d.get(str));
            }
        }
        n3Var.endObject();
    }
}
