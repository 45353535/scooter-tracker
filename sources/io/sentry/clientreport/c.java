package io.sentry.clientreport;

import io.sentry.ILogger;
import io.sentry.clientreport.g;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.l;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class c implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Date f83372b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List f83373c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83374d;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public c a(m3 m3Var, ILogger iLogger) throws Exception {
            ArrayList arrayList = new ArrayList();
            m3Var.beginObject();
            Date dateL = null;
            HashMap map = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("discarded_events")) {
                    arrayList.addAll(m3Var.P(iLogger, new g.a()));
                } else if (strNextName.equals("timestamp")) {
                    dateL = m3Var.l(iLogger);
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            if (dateL == null) {
                throw c("timestamp", iLogger);
            }
            if (arrayList.isEmpty()) {
                throw c("discarded_events", iLogger);
            }
            c cVar = new c(dateL, arrayList);
            cVar.b(map);
            return cVar;
        }
    }

    public c(Date date, List list) {
        this.f83372b = date;
        this.f83373c = list;
    }

    public List a() {
        return this.f83373c;
    }

    public void b(Map map) {
        this.f83374d = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("timestamp").a(l.h(this.f83372b));
        n3Var.e("discarded_events").j(iLogger, this.f83373c);
        Map map = this.f83374d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83374d.get(str));
            }
        }
        n3Var.endObject();
    }
}
