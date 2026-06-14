package f1;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import kotlin.Result;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
public final class gc {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function1 f69932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SSLSocketFactory f69933b;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f69934b = new a();

        public a() {
            super(1, URL.class, "<init>", "<init>(Ljava/lang/String;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final URL invoke(String str) {
            return new URL(str);
        }
    }

    public static abstract class b extends Exception {

        public static final class a extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f69935b = new a();

            public a() {
                super("Empty or null URL", null, 2, 0 == true ? 1 : 0);
            }
        }

        /* JADX INFO: renamed from: f1.gc$b$b, reason: collision with other inner class name */
        public static final class C0872b extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final int f69936b;

            public C0872b(int i10) {
                super("Failed with HTTP code " + i10, null, 2, 0 == true ? 1 : 0);
                this.f69936b = i10;
            }
        }

        public static final class c extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final c f69937b = new c();

            public c() {
                super("Returned connection is null", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class d extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f69938b = new d();

            public d() {
                super("Too many redirects", null, 2, 0 == true ? 1 : 0);
            }
        }

        public static final class e extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f69939b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(String url, Throwable cause) {
                super("Uncontrolled error", cause, null);
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(cause, "cause");
                this.f69939b = url;
            }

            public final String d() {
                return this.f69939b;
            }

            @Override // f1.gc.b, java.lang.Throwable
            public String toString() {
                String string;
                Throwable cause = getCause();
                return (cause == null || (string = cause.toString()) == null) ? "No cause" : string;
            }
        }

        public b(String str, Throwable th2) {
            super(str, th2);
        }

        @Override // java.lang.Throwable
        public String toString() {
            String message = getMessage();
            return message == null ? "No message" : message;
        }

        public /* synthetic */ b(String str, Throwable th2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i10 & 2) != 0 ? null : th2, null);
        }

        public /* synthetic */ b(String str, Throwable th2, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, th2);
        }
    }

    public gc(Function1 urlFactory, SSLSocketFactory sslSocket) {
        Intrinsics.checkNotNullParameter(urlFactory, "urlFactory");
        Intrinsics.checkNotNullParameter(sslSocket, "sslSocket");
        this.f69932a = urlFactory;
        this.f69933b = sslSocket;
    }

    public static /* synthetic */ Object b(gc gcVar, String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = 10;
        }
        return gcVar.c(str, i10);
    }

    public final Object a(b bVar) {
        Result.Companion companion = Result.f93230c;
        return Result.b(kotlin.d.a(bVar));
    }

    public final Object c(String str, int i10) throws Throwable {
        Object objA;
        HttpsURLConnection httpsURLConnectionD;
        HttpsURLConnection httpsURLConnection = null;
        eg.e("Attempting to redirect url: " + str + ", limit: " + i10, null, 2, null);
        if (str == null || str.length() == 0) {
            Object objA2 = a(b.a.f69935b);
            eg.p("Url is null or empty.", null, 2, null);
            return objA2;
        }
        try {
            if (i10 < 0) {
                Object objA3 = a(b.d.f69938b);
                eg.p("Too many redirects for url: " + str, null, 2, null);
                return objA3;
            }
            try {
                URL url = (URL) this.f69932a.invoke(str);
                httpsURLConnectionD = d(url);
                try {
                    if (httpsURLConnectionD == null) {
                        objA = a(b.c.f69937b);
                        eg.p("Null connection for url: " + str, null, 2, null);
                    } else if (f(httpsURLConnectionD.getResponseCode())) {
                        objA = Result.b(str);
                        eg.e("Successfully fetched url: " + str, null, 2, null);
                    } else if (e(httpsURLConnectionD.getResponseCode())) {
                        String headerField = httpsURLConnectionD.getHeaderField("Location");
                        Intrinsics.checkNotNull(headerField);
                        if (StringsKt.a0(headerField, "/", false, 2, null)) {
                            headerField = url.getProtocol() + "://" + url.getHost() + headerField;
                        }
                        eg.e("Redirecting to: " + headerField, null, 2, null);
                        objA = c(headerField, i10 + (-1));
                    } else {
                        objA = a(new b.C0872b(httpsURLConnectionD.getResponseCode()));
                        eg.p("Failed with HTTP code " + httpsURLConnectionD.getResponseCode() + " for url: " + str, null, 2, null);
                    }
                    if (httpsURLConnectionD == null) {
                        return objA;
                    }
                } catch (Exception e10) {
                    e = e10;
                    httpsURLConnection = httpsURLConnectionD;
                    eg.i("Cannot redirect " + str, e);
                    objA = a(new b.e(str, e));
                    if (httpsURLConnection != null) {
                        httpsURLConnectionD = httpsURLConnection;
                    }
                    return objA;
                } catch (Throwable th2) {
                    th = th2;
                    httpsURLConnection = httpsURLConnectionD;
                }
            } catch (Exception e11) {
                e = e11;
            }
            httpsURLConnectionD.disconnect();
            return objA;
        } catch (Throwable th3) {
            th = th3;
        }
        if (httpsURLConnection != null) {
            httpsURLConnection.disconnect();
        }
        throw th;
    }

    public final HttpsURLConnection d(URL url) throws IOException {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        HttpsURLConnection httpsURLConnection = uRLConnectionOpenConnection instanceof HttpsURLConnection ? (HttpsURLConnection) uRLConnectionOpenConnection : null;
        if (httpsURLConnection == null) {
            return null;
        }
        httpsURLConnection.setSSLSocketFactory(this.f69933b);
        httpsURLConnection.setInstanceFollowRedirects(false);
        httpsURLConnection.setConnectTimeout(10000);
        httpsURLConnection.setReadTimeout(10000);
        return httpsURLConnection;
    }

    public final boolean e(int i10) {
        return i10 <= t8.f71151f.g() && t8.f71150e.g() <= i10;
    }

    public final boolean f(int i10) {
        return i10 <= t8.f71149d.g() && t8.f71148c.g() <= i10;
    }

    public /* synthetic */ gc(Function1 function1, SSLSocketFactory sSLSocketFactory, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? a.f69934b : function1, (i10 & 2) != 0 ? g1.f69890a.a() : sSLSocketFactory);
    }
}
