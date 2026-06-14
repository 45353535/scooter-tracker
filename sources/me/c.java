package me;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import oe.w0;
import ve.u;

/* JADX INFO: loaded from: classes3.dex */
public final class c extends le.f {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g f94846f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Set f94847g;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f94848r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f94849s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f94850t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f94851u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f94852v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        /* synthetic */ Object f94853w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        int f94855y;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f94853w = obj;
            this.f94855y |= Integer.MIN_VALUE;
            return c.this.g(null, this);
        }
    }

    public static final class b implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f94856b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ HttpURLConnection f94857c;

        public b(boolean z10, HttpURLConnection httpURLConnection) {
            this.f94856b = z10;
            this.f94857c = httpURLConnection;
        }

        public final void a(String key, String value) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            if (this.f94856b && Intrinsics.areEqual(key, u.f106718a.g())) {
                return;
            }
            this.f94857c.addRequestProperty(key, value);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((String) obj, (String) obj2);
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(g config) {
        super("ktor-android");
        Intrinsics.checkNotNullParameter(config, "config");
        this.f94846f = config;
        this.f94847g = SetsKt.setOf((Object[]) new le.h[]{w0.f96943a, qe.a.f99118a});
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final re.h q(kotlin.coroutines.CoroutineContext r9, re.e r10, ye.c r11, cf.GMTDate r12, java.net.HttpURLConnection r13) throws java.io.IOException {
        /*
            java.lang.String r11 = "current"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r13, r11)
            int r11 = r13.getResponseCode()
            java.lang.String r0 = r13.getResponseMessage()
            if (r0 == 0) goto L16
            ve.c0 r1 = new ve.c0
            r1.<init>(r11, r0)
        L14:
            r3 = r1
            goto L1d
        L16:
            ve.c0$a r0 = ve.c0.f106561d
            ve.c0 r1 = r0.a(r11)
            goto L14
        L1d:
            io.ktor.utils.io.e r7 = me.h.a(r13, r11, r9)
            java.util.Map r11 = r13.getHeaderFields()
            java.lang.String r13 = "getHeaderFields(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r11, r13)
            java.util.LinkedHashMap r13 = new java.util.LinkedHashMap
            int r0 = r11.size()
            int r0 = kotlin.collections.MapsKt.mapCapacity(r0)
            r13.<init>(r0)
            java.util.Set r11 = r11.entrySet()
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.Iterator r11 = r11.iterator()
        L41:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L73
            java.lang.Object r0 = r11.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L69
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r4 = "getDefault(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r4)
            java.lang.String r1 = r1.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            if (r1 != 0) goto L6b
        L69:
            java.lang.String r1 = ""
        L6b:
            java.lang.Object r0 = r0.getValue()
            r13.put(r1, r0)
            goto L41
        L73:
            java.util.LinkedHashMap r11 = new java.util.LinkedHashMap
            r11.<init>()
            java.util.Set r13 = r13.entrySet()
            java.util.Iterator r13 = r13.iterator()
        L80:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto La4
            java.lang.Object r0 = r13.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = kotlin.text.StringsKt.y0(r1)
            if (r1 != 0) goto L80
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r11.put(r1, r0)
            goto L80
        La4:
            ve.b0$a r13 = ve.b0.f106545d
            ve.b0 r6 = r13.a()
            ve.q r5 = new ve.q
            r5.<init>(r11)
            ze.b r10 = r10.a()
            ze.a r11 = re.f.a()
            java.lang.Object r10 = r10.a(r11)
            androidx.privacysandbox.ads.adservices.topics.a.a(r10)
            re.h r2 = new re.h
            r8 = r9
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: me.c.q(kotlin.coroutines.CoroutineContext, re.e, ye.c, cf.d, java.net.HttpURLConnection):re.h");
    }

    private final HttpURLConnection w(String str) throws IOException {
        URLConnection uRLConnectionOpenConnection;
        URL url = new URL(str);
        Proxy proxyB = getConfig().b();
        if (proxyB == null || (uRLConnectionOpenConnection = url.openConnection(proxyB)) == null) {
            uRLConnectionOpenConnection = url.openConnection();
            Intrinsics.checkNotNullExpressionValue(uRLConnectionOpenConnection, "openConnection(...)");
        }
        return (HttpURLConnection) uRLConnectionOpenConnection;
    }

    @Override // le.f, le.b
    public Set D() {
        return this.f94847g;
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x01ac A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01ad A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    @Override // le.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object g(re.e r18, kotlin.coroutines.Continuation r19) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: me.c.g(re.e, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // le.b
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public g getConfig() {
        return this.f94846f;
    }
}
