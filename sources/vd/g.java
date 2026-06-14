package vd;

import android.os.SystemClock;
import eg.e0;
import eg.m1;
import eg.o0;
import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.time.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final b f106499u = new b(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final wd.e f106500v = new xd.b();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final wd.e f106501w = new xd.a(new e0("NetworkTimeOutTaskManager").plus(m1.b(null, 1, null)).plus(o0.b()));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vd.d f106503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f106504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f106505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j f106506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Long f106507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Integer f106508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Integer f106509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m f106510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final c f106511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private kotlin.time.b f106512k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final AtomicBoolean f106513l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final AtomicBoolean f106514m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final AtomicBoolean f106515n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final AtomicBoolean f106516o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private wd.e f106517p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private wd.b f106518q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private wd.b f106519r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private byte[] f106520s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f106521t;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f106522a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final vd.d f106523b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f106524c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f106525d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private j f106526e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Long f106527f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Integer f106528g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private Integer f106529h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private m f106530i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private c f106531j;

        public a(String url, vd.d method) {
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(method, "method");
            this.f106522a = url;
            this.f106523b = method;
            this.f106524c = new HashMap();
            this.f106525d = new HashMap();
            this.f106526e = j.Manual;
        }

        public final g a() {
            return new g(this.f106522a, this.f106523b, this.f106524c, this.f106525d, this.f106526e, this.f106527f, this.f106528g, this.f106529h, null, this.f106530i, this.f106531j);
        }

        public final a b(c cVar) {
            this.f106531j = cVar;
            return this;
        }

        public final a c(m mVar) {
            this.f106530i = mVar;
            return this;
        }

        public final a d(Long l10) {
            this.f106527f = l10;
            return this;
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    public interface c {
        void a(vd.e eVar);

        void onSuccess(Object obj);
    }

    private final class d extends wd.b {
        public d() {
        }

        @Override // wd.b
        public void d() {
            g.this.s();
        }
    }

    private final class e extends wd.b {
        public e() {
        }

        @Override // wd.b
        public void d() {
            g.this.o();
        }
    }

    static final class f extends Lambda implements Function0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f106535g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(long j10) {
            super(0);
            this.f106535g = j10;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m8686invoke();
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m8686invoke() {
            if (g.this.g() == null) {
                g gVar = g.this;
                b.a aVar = kotlin.time.b.f93560c;
                gVar.f106512k = kotlin.time.b.g(kotlin.time.c.t(SystemClock.elapsedRealtime() - this.f106535g, cg.b.f6838e));
            }
        }
    }

    public g(String url, vd.d method, Map headers, Map queryParameters, j redirect, Long l10, Integer num, Integer num2, l lVar, m mVar, c cVar) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(queryParameters, "queryParameters");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.f106502a = url;
        this.f106503b = method;
        this.f106504c = headers;
        this.f106505d = queryParameters;
        this.f106506e = redirect;
        this.f106507f = l10;
        this.f106508g = num;
        this.f106509h = num2;
        this.f106510i = mVar;
        this.f106511j = cVar;
        this.f106513l = new AtomicBoolean(false);
        this.f106514m = new AtomicBoolean(false);
        this.f106515n = new AtomicBoolean(false);
        this.f106516o = new AtomicBoolean(false);
    }

    private final void j(boolean z10, Throwable th2) {
        k(z10, new vd.e(th2));
    }

    private final void k(boolean z10, vd.e eVar) {
        c cVarH;
        if (this.f106514m.compareAndSet(false, true) || z10) {
            if ((!i() || z10) && (cVarH = h()) != null) {
                cVarH.a(eVar);
            }
        }
    }

    static /* synthetic */ void l(g gVar, boolean z10, Throwable th2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        gVar.j(z10, th2);
    }

    private final void m(Object obj) {
        c cVarH;
        if (!this.f106514m.compareAndSet(false, true) || i() || (cVarH = h()) == null) {
            return;
        }
        cVarH.onSuccess(obj);
    }

    private final HttpURLConnection n(URL url) throws Throwable {
        HttpURLConnection httpURLConnection;
        int i10 = this.f106521t + 1;
        this.f106521t = i10;
        if (i10 > 20) {
            throw new IllegalStateException("The maximum number of connections for one request has been reached");
        }
        if (i()) {
            throw new k();
        }
        HttpURLConnection httpURLConnection2 = null;
        try {
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
            httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
            httpURLConnection.setInstanceFollowRedirects(this.f106506e == j.Native);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setAllowUserInteraction(false);
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            httpURLConnection.setRequestMethod(this.f106503b.g());
            for (Map.Entry entry : this.f106504c.entrySet()) {
                httpURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
            }
            Integer num = this.f106508g;
            if (num != null && num.intValue() >= 0) {
                httpURLConnection.setConnectTimeout(this.f106508g.intValue());
            }
            Integer num2 = this.f106509h;
            if (num2 != null && num2.intValue() >= 0) {
                httpURLConnection.setReadTimeout(this.f106509h.intValue());
            }
            if (this.f106516o.compareAndSet(false, true)) {
                this.f106520s = null;
            }
            byte[] bArr = this.f106520s;
            if (bArr != null) {
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream = httpURLConnection.getOutputStream();
                Intrinsics.checkNotNullExpressionValue(outputStream, "httpURLConnection.outputStream");
                BufferedOutputStream bufferedOutputStream = outputStream instanceof BufferedOutputStream ? (BufferedOutputStream) outputStream : new BufferedOutputStream(outputStream, 8192);
                try {
                    bufferedOutputStream.write(bArr);
                    Unit unit = Unit.f93236a;
                    uf.c.a(bufferedOutputStream, null);
                } finally {
                }
            }
            if (i()) {
                throw new k();
            }
            if (this.f106506e == j.Manual) {
                int responseCode = httpURLConnection.getResponseCode();
                switch (responseCode) {
                    case 301:
                    case 302:
                    case 303:
                    case 305:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection.getHeaderField("Location");
                        i.a(httpURLConnection);
                        if (headerField == null || headerField.length() == 0) {
                            throw new IllegalArgumentException("Location header url could not be null or empty when server responds with " + responseCode + " code");
                        }
                        URL url2 = new URL(url, headerField);
                        if (i.b(url2)) {
                            return n(url2);
                        }
                        throw new IllegalArgumentException("Location header url is not http or https, but has " + url2.getProtocol() + " protocol");
                }
            }
            return httpURLConnection;
        } catch (Throwable th3) {
            th = th3;
            httpURLConnection2 = httpURLConnection;
            i.a(httpURLConnection2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void o() {
        if (i()) {
            return;
        }
        f();
        wd.e eVar = this.f106517p;
        if (eVar == null) {
            eVar = f106500v;
        }
        eVar.b(new Runnable() { // from class: vd.f
            @Override // java.lang.Runnable
            public final void run() {
                g.p(this.f106498b);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(g this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.k(true, new vd.e(new TimeoutException("NetworkRequest timeout reached")));
    }

    public static /* synthetic */ void r(g gVar, wd.e eVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = f106500v;
        }
        gVar.q(eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        HttpURLConnection httpURLConnectionN;
        f fVar = new f(SystemClock.elapsedRealtime());
        HttpURLConnection httpURLConnection = null;
        try {
            httpURLConnectionN = n(new URL(h.a(this.f106502a, this.f106505d)));
            try {
                if (!i()) {
                    int responseCode = httpURLConnectionN.getResponseCode();
                    if (!i()) {
                        if (responseCode == 200) {
                            m mVar = this.f106510i;
                            Object objA = mVar != null ? mVar.a(httpURLConnectionN) : null;
                            fVar.invoke();
                            m(objA);
                        } else if (responseCode != 204) {
                            fVar.invoke();
                            l(this, false, new vd.c(responseCode), 1, null);
                        } else {
                            fVar.invoke();
                            m(null);
                        }
                    }
                }
            } catch (k unused) {
                httpURLConnection = httpURLConnectionN;
            } catch (Throwable th2) {
                th = th2;
                try {
                    l(this, false, th, 1, null);
                } finally {
                    fVar.invoke();
                    i.a(httpURLConnectionN);
                }
            }
        } catch (k unused2) {
        } catch (Throwable th3) {
            th = th3;
            httpURLConnectionN = null;
        }
    }

    private final void t() {
        u();
        Long l10 = this.f106507f;
        if (l10 == null || l10.longValue() <= 0) {
            return;
        }
        try {
            e eVar = new e();
            f106501w.a(eVar, this.f106507f.longValue());
            this.f106519r = eVar;
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    private final void u() {
        wd.b bVar = this.f106519r;
        if (bVar != null) {
            f106501w.cancel(bVar);
        }
        this.f106519r = null;
    }

    public final void f() {
        wd.e eVar;
        this.f106515n.set(true);
        u();
        wd.b bVar = this.f106518q;
        if (bVar != null && (eVar = this.f106517p) != null) {
            eVar.cancel(bVar);
        }
        this.f106517p = null;
        this.f106518q = null;
        this.f106520s = null;
    }

    public final kotlin.time.b g() {
        return this.f106512k;
    }

    public final c h() {
        return this.f106511j;
    }

    public final boolean i() {
        return this.f106515n.get();
    }

    public final void q(wd.e taskManager) {
        Intrinsics.checkNotNullParameter(taskManager, "taskManager");
        if (i()) {
            j(true, new IllegalStateException("The Send method was called, but NetworkRequest has already been destroyed"));
            return;
        }
        if (this.f106513l.compareAndSet(false, true)) {
            t();
            try {
                d dVar = new d();
                taskManager.execute(dVar);
                this.f106517p = taskManager;
                this.f106518q = dVar;
            } catch (Throwable th2) {
                l(this, false, th2, 1, null);
            }
        }
    }
}
