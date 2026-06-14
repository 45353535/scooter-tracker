package io.sentry;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import com.taurusx.tax.y.z.w.s;
import io.sentry.rrweb.a;
import io.sentry.rrweb.d;
import io.sentry.rrweb.e;
import io.sentry.rrweb.f;
import io.sentry.rrweb.g;
import io.sentry.rrweb.i;
import io.sentry.rrweb.j;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class d4 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f83404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f83405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83406d;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f83407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f83408b;

        static {
            int[] iArr = new int[io.sentry.rrweb.c.values().length];
            f83408b = iArr;
            try {
                iArr[io.sentry.rrweb.c.IncrementalSnapshot.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f83408b[io.sentry.rrweb.c.Meta.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f83408b[io.sentry.rrweb.c.Custom.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[d.b.values().length];
            f83407a = iArr2;
            try {
                iArr2[d.b.MouseInteraction.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f83407a[d.b.TouchMove.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public static final class b implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public d4 a(m3 m3Var, ILogger iLogger) {
            char c10;
            char c11 = 0;
            d4 d4Var = new d4();
            m3Var.beginObject();
            ArrayList arrayList = null;
            HashMap map = null;
            Integer numD0 = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                if (strNextName.equals("segment_id")) {
                    numD0 = m3Var.d0();
                } else {
                    if (map == null) {
                        map = new HashMap();
                    }
                    m3Var.l0(iLogger, map, strNextName);
                }
            }
            m3Var.endObject();
            m3Var.setLenient(true);
            List list = (List) m3Var.p0();
            m3Var.setLenient(false);
            if (list != null) {
                arrayList = new ArrayList(list.size());
                for (Object obj : list) {
                    if (obj instanceof Map) {
                        Map map2 = (Map) obj;
                        io.sentry.util.v vVar = new io.sentry.util.v(map2);
                        for (Map.Entry entry : map2.entrySet()) {
                            String str = (String) entry.getKey();
                            Object value = entry.getValue();
                            if (str.equals("type")) {
                                io.sentry.rrweb.c cVar = io.sentry.rrweb.c.values()[((Integer) value).intValue()];
                                int i10 = a.f83408b[cVar.ordinal()];
                                if (i10 == 1) {
                                    c10 = c11;
                                    Map map3 = (Map) map2.get("data");
                                    if (map3 == null) {
                                        map3 = Collections.EMPTY_MAP;
                                    }
                                    Integer num = (Integer) map3.get("source");
                                    if (num != null) {
                                        d.b bVar = d.b.values()[num.intValue()];
                                        int i11 = a.f83407a[bVar.ordinal()];
                                        if (i11 == 1) {
                                            arrayList.add(new e.a().a(vVar, iLogger));
                                        } else if (i11 != 2) {
                                            g7 g7Var = g7.DEBUG;
                                            Object[] objArr = new Object[1];
                                            objArr[c10] = bVar;
                                            iLogger.c(g7Var, "Unsupported rrweb incremental snapshot type %s", objArr);
                                        } else {
                                            arrayList.add(new f.a().a(vVar, iLogger));
                                        }
                                    }
                                } else if (i10 != 2) {
                                    c10 = c11;
                                    if (i10 != 3) {
                                        g7 g7Var2 = g7.DEBUG;
                                        Object[] objArr2 = new Object[1];
                                        objArr2[c10] = cVar;
                                        iLogger.c(g7Var2, "Unsupported rrweb event type %s", objArr2);
                                    } else {
                                        Map map4 = (Map) map2.get("data");
                                        if (map4 == null) {
                                            map4 = Collections.EMPTY_MAP;
                                        }
                                        String str2 = (String) map4.get(s.z.f67720z);
                                        if (str2 != null) {
                                            byte b10 = -1;
                                            switch (str2.hashCode()) {
                                                case -226040934:
                                                    if (str2.equals("performanceSpan")) {
                                                        b10 = c10;
                                                    }
                                                    break;
                                                case 112202875:
                                                    if (str2.equals("video")) {
                                                        b10 = 1;
                                                    }
                                                    break;
                                                case 1106718723:
                                                    if (str2.equals("breadcrumb")) {
                                                        b10 = 2;
                                                    }
                                                    break;
                                            }
                                            switch (b10) {
                                                case 0:
                                                    arrayList.add(new i.a().a(vVar, iLogger));
                                                    break;
                                                case 1:
                                                    arrayList.add(new j.a().a(vVar, iLogger));
                                                    break;
                                                case 2:
                                                    arrayList.add(new a.C1013a().a(vVar, iLogger));
                                                    break;
                                                default:
                                                    g7 g7Var3 = g7.DEBUG;
                                                    Object[] objArr3 = new Object[1];
                                                    objArr3[c10] = cVar;
                                                    iLogger.c(g7Var3, "Unsupported rrweb event type %s", objArr3);
                                                    break;
                                            }
                                        }
                                    }
                                } else {
                                    c10 = c11;
                                    arrayList.add(new g.a().a(vVar, iLogger));
                                }
                            } else {
                                c10 = c11;
                            }
                            c11 = c10;
                        }
                    }
                    c11 = c11;
                }
            }
            d4Var.c(numD0);
            d4Var.b(arrayList);
            d4Var.d(map);
            return d4Var;
        }
    }

    public List a() {
        return this.f83405c;
    }

    public void b(List list) {
        this.f83405c = list;
    }

    public void c(Integer num) {
        this.f83404b = num;
    }

    public void d(Map map) {
        this.f83406d = map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d4.class == obj.getClass()) {
            d4 d4Var = (d4) obj;
            if (io.sentry.util.w.a(this.f83404b, d4Var.f83404b) && io.sentry.util.w.a(this.f83405c, d4Var.f83405c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return io.sentry.util.w.b(this.f83404b, this.f83405c);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83404b != null) {
            n3Var.e("segment_id").i(this.f83404b);
        }
        Map map = this.f83406d;
        if (map != null) {
            for (String str : map.keySet()) {
                n3Var.e(str).j(iLogger, this.f83406d.get(str));
            }
        }
        n3Var.endObject();
        n3Var.setLenient(true);
        if (this.f83404b != null) {
            n3Var.g(IOUtils.LINE_SEPARATOR_UNIX);
        }
        List list = this.f83405c;
        if (list != null) {
            n3Var.j(iLogger, list);
        }
        n3Var.setLenient(false);
    }
}
