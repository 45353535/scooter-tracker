package io.sentry;

import com.adjust.sdk.purchase.ADJPConstants;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b9 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.protocol.x f83286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f83287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f83288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f83289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f83290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f83291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f83292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f83293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f83294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final io.sentry.protocol.x f83295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map f83296l;

    public static final class a implements t1 {
        private Exception c(String str, ILogger iLogger) {
            String str2 = "Missing required field \"" + str + "\"";
            IllegalStateException illegalStateException = new IllegalStateException(str2);
            iLogger.a(g7.ERROR, str2, illegalStateException);
            return illegalStateException;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0031  */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public io.sentry.b9 a(io.sentry.m3 r20, io.sentry.ILogger r21) throws java.lang.Exception {
            /*
                Method dump skipped, instruction units count: 344
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: io.sentry.b9.a.a(io.sentry.m3, io.sentry.ILogger):io.sentry.b9");
        }
    }

    b9(io.sentry.protocol.x xVar, String str) {
        this(xVar, str, null, null, null, null, null, null, null);
    }

    public String a() {
        return this.f83293i;
    }

    public String b() {
        return this.f83292h;
    }

    public void c(Map map) {
        this.f83296l = map;
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        n3Var.e("trace_id").j(iLogger, this.f83286b);
        n3Var.e("public_key").a(this.f83287c);
        if (this.f83288d != null) {
            n3Var.e("release").a(this.f83288d);
        }
        if (this.f83289e != null) {
            n3Var.e(ADJPConstants.KEY_ENVIRONMENT).a(this.f83289e);
        }
        if (this.f83290f != null) {
            n3Var.e("user_id").a(this.f83290f);
        }
        if (this.f83291g != null) {
            n3Var.e("transaction").a(this.f83291g);
        }
        if (this.f83292h != null) {
            n3Var.e("sample_rate").a(this.f83292h);
        }
        if (this.f83293i != null) {
            n3Var.e("sample_rand").a(this.f83293i);
        }
        if (this.f83294j != null) {
            n3Var.e("sampled").a(this.f83294j);
        }
        if (this.f83295k != null) {
            n3Var.e("replay_id").j(iLogger, this.f83295k);
        }
        Map map = this.f83296l;
        if (map != null) {
            for (String str : map.keySet()) {
                Object obj = this.f83296l.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    b9(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2) {
        this(xVar, str, str2, str3, str4, str5, str6, str7, xVar2, null);
    }

    b9(io.sentry.protocol.x xVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, io.sentry.protocol.x xVar2, String str8) {
        this.f83286b = xVar;
        this.f83287c = str;
        this.f83288d = str2;
        this.f83289e = str3;
        this.f83290f = str4;
        this.f83291g = str5;
        this.f83292h = str6;
        this.f83294j = str7;
        this.f83295k = xVar2;
        this.f83293i = str8;
    }
}
