package jd;

import android.net.Uri;
import android.text.TextUtils;
import id.a0;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import pd.f0;

/* JADX INFO: loaded from: classes3.dex */
public class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final wd.e f85788k = new xd.b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f85789a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e f85790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f85791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map f85792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Integer f85793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Integer f85794f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final f f85795g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final d f85796h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private wd.e f85797i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private kd.b f85798j;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f85799a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final e f85800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map f85801c = new HashMap();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f85802d = new HashMap();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f85803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Integer f85804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private f f85805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private d f85806h;

        public a(String str, e eVar) {
            this.f85799a = str;
            this.f85800b = eVar;
        }

        public a a(String str, String str2) {
            this.f85801c.put(str, str2);
            return this;
        }

        public c b() {
            return new c(this.f85799a, this.f85800b, this.f85801c, this.f85802d, this.f85803e, this.f85804f, null, null, this.f85805g, this.f85806h);
        }

        public c c() {
            c cVarB = b();
            cVarB.i();
            return cVarB;
        }

        public a d(d dVar) {
            this.f85806h = dVar;
            return this;
        }

        public a e(f fVar) {
            this.f85805g = fVar;
            return this;
        }

        public a f(String str) {
            if (!TextUtils.isEmpty(str)) {
                a("User-Agent", str);
            }
            return this;
        }
    }

    public static abstract class b implements f, g {
        @Override // jd.c.f
        public Object a(URLConnection uRLConnection) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            InputStream inputStream = null;
            try {
                InputStream inputStream2 = uRLConnection.getInputStream();
                try {
                    byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        l.c(inputStream2, byteArrayOutputStream);
                        Object objB = b(byteArrayOutputStream.toByteArray());
                        f0.h(byteArrayOutputStream);
                        f0.b(byteArrayOutputStream);
                        f0.b(inputStream2);
                        return objB;
                    } catch (Throwable th2) {
                        inputStream = inputStream2;
                        th = th2;
                        f0.h(byteArrayOutputStream);
                        f0.b(byteArrayOutputStream);
                        f0.b(inputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    inputStream = inputStream2;
                    th = th3;
                    byteArrayOutputStream = null;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }
    }

    /* JADX INFO: renamed from: jd.c$c, reason: collision with other inner class name */
    public interface InterfaceC1024c {
    }

    public interface d {
        void onError(a0 a0Var);

        void onSuccess(Object obj);
    }

    public enum e {
        Get("GET"),
        Post("POST");


        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f85810b;

        e(String str) {
            this.f85810b = str;
        }

        public String g() {
            return this.f85810b;
        }
    }

    public interface f {
        Object a(URLConnection uRLConnection);
    }

    public interface g {
        Object b(Object obj);
    }

    public static class h extends b {
        @Override // jd.c.g
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public String b(byte[] bArr) {
            return new String(bArr, StandardCharsets.UTF_8);
        }
    }

    public interface i {
    }

    private class k extends kd.b {
        private k() {
        }

        @Override // kd.b
        public void d() {
            c.this.g();
        }
    }

    public c(String str, e eVar, Map map, Map map2, Integer num, Integer num2, i iVar, InterfaceC1024c interfaceC1024c, f fVar, d dVar) {
        this.f85789a = str;
        this.f85790b = eVar;
        this.f85793e = num;
        this.f85794f = num2;
        this.f85795g = fVar;
        this.f85791c = map;
        this.f85792d = map2;
        this.f85796h = dVar;
    }

    private String a(String str, Map map) {
        if (map.isEmpty()) {
            return str;
        }
        Uri.Builder builderBuildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            builderBuildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        return builderBuildUpon.build().toString();
    }

    private HttpURLConnection b(String str) throws Throwable {
        URL url = new URL(str);
        HttpURLConnection httpURLConnection = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) url.openConnection();
            try {
                httpURLConnection2.setInstanceFollowRedirects(false);
                httpURLConnection2.setUseCaches(false);
                httpURLConnection2.setRequestMethod(this.f85790b.g());
                for (Map.Entry entry : this.f85791c.entrySet()) {
                    httpURLConnection2.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                }
                Integer num = this.f85793e;
                if (num != null && num.intValue() >= 0) {
                    httpURLConnection2.setConnectTimeout(this.f85793e.intValue());
                }
                Integer num2 = this.f85794f;
                if (num2 != null && num2.intValue() >= 0) {
                    httpURLConnection2.setReadTimeout(this.f85794f.intValue());
                }
                switch (httpURLConnection2.getResponseCode()) {
                    case 301:
                    case 302:
                    case 303:
                    case 305:
                    case 307:
                    case 308:
                        String headerField = httpURLConnection2.getHeaderField("Location");
                        if (!TextUtils.isEmpty(headerField) && f0.r(headerField)) {
                            vd.h.b(httpURLConnection2);
                            return b(headerField);
                        }
                        return httpURLConnection2;
                    case 304:
                    case 306:
                    default:
                        return httpURLConnection2;
                }
            } catch (Throwable th2) {
                th = th2;
                httpURLConnection = httpURLConnection2;
                vd.h.b(httpURLConnection);
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private void c() {
        this.f85797i = null;
        this.f85798j = null;
    }

    private void d(a0 a0Var) {
        d dVar = this.f85796h;
        if (dVar != null) {
            dVar.onError(a0Var);
        }
    }

    private void e(Object obj) {
        d dVar = this.f85796h;
        if (dVar != null) {
            dVar.onSuccess(obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        HttpURLConnection httpURLConnectionB;
        Throwable th2;
        try {
            httpURLConnectionB = b(a(this.f85789a, this.f85792d));
        } catch (Throwable th3) {
            httpURLConnectionB = null;
            th2 = th3;
        }
        try {
            int responseCode = httpURLConnectionB.getResponseCode();
            if (responseCode == 200) {
                f fVar = this.f85795g;
                if (fVar == null) {
                    e(null);
                } else {
                    try {
                        e(fVar.a(httpURLConnectionB));
                    } catch (Throwable th4) {
                        d(a0.a(th4));
                    }
                }
            } else if (responseCode == 204) {
                e(null);
            } else {
                d(new a0("Server response code - " + responseCode + " " + httpURLConnectionB.getResponseMessage()));
            }
        } catch (Throwable th5) {
            th2 = th5;
            try {
                d(a0.a(th2));
            } finally {
                vd.h.b(httpURLConnectionB);
            }
        }
    }

    public void h() {
        wd.e eVar = this.f85797i;
        kd.b bVar = this.f85798j;
        if (eVar != null && bVar != null) {
            eVar.cancel(bVar);
        }
        c();
    }

    public void i() {
        j(f85788k);
    }

    public void j(wd.e eVar) {
        h();
        this.f85797i = eVar;
        k kVar = new k();
        this.f85798j = kVar;
        try {
            eVar.execute(kVar);
        } catch (Throwable th2) {
            d(a0.a(th2));
        }
    }
}
