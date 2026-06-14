package io.sentry;

import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.sentry.f7;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes3.dex */
public final class v6 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f84340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Integer f84341c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f84342d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f84343e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final f7 f84344f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f84345g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Callable f84346h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f84347i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map f84348j;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public v6 a(m3 m3Var, ILogger iLogger) throws Exception {
            String strNextName;
            m3Var.beginObject();
            HashMap map = null;
            f7 f7Var = null;
            String strG = null;
            String strG2 = null;
            String strG3 = null;
            String strG4 = null;
            Integer numD0 = null;
            int iNextInt = 0;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                strNextName = m3Var.nextName();
                strNextName.getClass();
                switch (strNextName) {
                    case "item_count":
                        numD0 = m3Var.d0();
                        break;
                    case "length":
                        iNextInt = m3Var.nextInt();
                        break;
                    case "filename":
                        strG2 = m3Var.G();
                        break;
                    case "attachment_type":
                        strG3 = m3Var.G();
                        break;
                    case "type":
                        f7Var = (f7) m3Var.B(iLogger, new f7.a());
                        break;
                    case "content_type":
                        strG = m3Var.G();
                        break;
                    case "platform":
                        strG4 = m3Var.G();
                        break;
                    default:
                        if (map == null) {
                            map = new HashMap();
                        }
                        m3Var.l0(iLogger, map, strNextName);
                        break;
                }
            }
            if (f7Var == null) {
                throw c("type", iLogger);
            }
            v6 v6Var = new v6(f7Var, iNextInt, strG, strG2, strG3, strG4, numD0);
            v6Var.c(map);
            m3Var.endObject();
            return v6Var;
        }
    }

    public v6(f7 f7Var, int i10, String str, String str2, String str3, String str4, Integer num) {
        this.f84344f = (f7) io.sentry.util.w.c(f7Var, "type is required");
        this.f84340b = str;
        this.f84345g = i10;
        this.f84342d = str2;
        this.f84346h = null;
        this.f84347i = str3;
        this.f84343e = str4;
        this.f84341c = num;
    }

    public int a() {
        Callable callable = this.f84346h;
        if (callable == null) {
            return this.f84345g;
        }
        try {
            return ((Integer) callable.call()).intValue();
        } catch (Throwable unused) {
            return -1;
        }
    }

    public f7 b() {
        return this.f84344f;
    }

    public void c(Map map) {
        this.f84348j = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f84340b != null) {
            n3Var.e(FirebaseAnalytics.Param.CONTENT_TYPE).a(this.f84340b);
        }
        if (this.f84342d != null) {
            n3Var.e("filename").a(this.f84342d);
        }
        n3Var.e("type").j(iLogger, this.f84344f);
        if (this.f84347i != null) {
            n3Var.e("attachment_type").a(this.f84347i);
        }
        if (this.f84343e != null) {
            n3Var.e("platform").a(this.f84343e);
        }
        if (this.f84341c != null) {
            n3Var.e("item_count").i(this.f84341c);
        }
        n3Var.e(SessionDescription.ATTR_LENGTH).b(a());
        Map map = this.f84348j;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f84348j.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    v6(f7 f7Var, Callable callable, String str, String str2, String str3) {
        this(f7Var, callable, str, str2, str3, (String) null, (Integer) null);
    }

    v6(f7 f7Var, Callable callable, String str, String str2, String str3, String str4, Integer num) {
        this.f84344f = (f7) io.sentry.util.w.c(f7Var, "type is required");
        this.f84340b = str;
        this.f84345g = -1;
        this.f84342d = str2;
        this.f84346h = callable;
        this.f84347i = str3;
        this.f84343e = str4;
        this.f84341c = num;
    }

    v6(f7 f7Var, Callable callable, String str, String str2) {
        this(f7Var, callable, str, str2, null);
    }
}
