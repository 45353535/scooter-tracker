package sg.bigo.ads.common.u.a;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.common.net.HttpHeaders;
import com.mbridge.msdk.MBridgeConstans;
import com.taurusx.tax.f.z;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HttpsURLConnection;
import sg.bigo.ads.common.g;
import sg.bigo.ads.common.u.f;
import sg.bigo.ads.common.utils.k;

/* JADX INFO: loaded from: classes4.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final sg.bigo.ads.common.u.b.c<? extends sg.bigo.ads.common.u.a> f102709a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    URL f102710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f102711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b f102712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final g f102713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private final URL f102714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f102715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private HttpURLConnection f102716h;

    private c(@NonNull sg.bigo.ads.common.u.b.c cVar, @Nullable URL url, @Nullable URL url2, @NonNull b bVar, @Nullable g gVar) {
        this.f102711c = false;
        this.f102709a = cVar;
        this.f102710b = url;
        this.f102714f = url2;
        this.f102712d = bVar;
        this.f102713e = gVar;
        sg.bigo.ads.common.t.a.a(0, 3, "HttpRequest", "request, " + cVar + ", redirectURL= " + url2 + ", content=" + cVar.d());
    }

    public final HttpURLConnection a() throws IOException {
        String str;
        BufferedOutputStream bufferedOutputStream;
        g gVar;
        URL urlA = this.f102714f;
        if (urlA == null) {
            this.f102709a.a("PreHost");
            T t10 = this.f102709a.f102748k;
            String strA = t10.a();
            String strF = t10.f();
            String strD = t10.d();
            if (!TextUtils.isEmpty(strF) && !TextUtils.isEmpty(strD) && !TextUtils.equals(strF, strD)) {
                this.f102709a.a("PreHost", strF);
            }
            if (t10.e()) {
                this.f102709a.a(HttpHeaders.HOST, strD);
            }
            this.f102709a.h();
            urlA = a(Uri.parse(strA));
            this.f102710b = urlA;
        } else if (urlA != null && this.f102713e != null && this.f102709a.f102752o) {
            urlA = a(Uri.parse(urlA.toString()));
        }
        boolean zEqualsIgnoreCase = "HTTPS".equalsIgnoreCase(urlA.getProtocol());
        URLConnection uRLConnectionOpenConnection = urlA.openConnection();
        this.f102716h = zEqualsIgnoreCase ? (HttpsURLConnection) uRLConnectionOpenConnection : (HttpURLConnection) uRLConnectionOpenConnection;
        this.f102716h.setInstanceFollowRedirects(false);
        this.f102716h.setDoInput(true);
        this.f102716h.setUseCaches(false);
        this.f102716h.setConnectTimeout((int) this.f102709a.f102750m);
        this.f102716h.setReadTimeout((int) this.f102709a.f102750m);
        this.f102716h.setRequestMethod(this.f102709a.a());
        Map<String, Set<String>> map = this.f102709a.f102751n;
        if (!map.containsKey("Connection")) {
            map.put("Connection", new HashSet(Collections.singletonList(HttpHeaders.KEEP_ALIVE)));
        }
        Set<String> set = map.get("Range");
        Set<String> set2 = map.get(HttpHeaders.ACCEPT_ENCODING);
        if (k.a(set) && k.a(set2)) {
            this.f102711c = true;
            map.put(HttpHeaders.ACCEPT_ENCODING, new HashSet(Collections.singletonList("gzip")));
        }
        if (!map.containsKey(HttpHeaders.HOST)) {
            try {
                b bVar = this.f102712d;
                String host = this.f102716h.getURL().getHost();
                str = TextUtils.isEmpty(host) ? "" : bVar.f102708a.get(host);
            } catch (Exception unused) {
                str = null;
            }
            if (!TextUtils.isEmpty(str)) {
                map.put(HttpHeaders.HOST, new HashSet(Collections.singletonList(str)));
            }
        }
        for (Map.Entry<String, Set<String>> entry : map.entrySet()) {
            String key = entry.getKey();
            Set<String> value = entry.getValue();
            if (!TextUtils.isEmpty(key) && !k.a(value)) {
                for (String str2 : value) {
                    if (!TextUtils.isEmpty(str2)) {
                        this.f102716h.addRequestProperty(key, str2);
                    }
                }
            }
        }
        byte[] bArrC = this.f102709a.c();
        if (bArrC != null && bArrC.length > 0) {
            f fVarB = this.f102709a.b();
            if (fVarB != null) {
                this.f102716h.setRequestProperty("Content-Type", fVarB.toString());
            }
            this.f102716h.setDoOutput(true);
            if (!(this.f102709a instanceof sg.bigo.ads.common.u.b.b) || (gVar = this.f102713e) == null || !gVar.ax() || sg.bigo.ads.common.x.a.F()) {
                this.f102716h.setRequestProperty("Content-Length", Long.toString(this.f102709a.e()));
                bufferedOutputStream = new BufferedOutputStream(this.f102716h.getOutputStream());
                bufferedOutputStream.write(bArrC);
            } else {
                this.f102716h.setRequestProperty("Content-Encoding", "gzip");
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                gZIPOutputStream.write(bArrC);
                gZIPOutputStream.flush();
                gZIPOutputStream.close();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                int length = byteArray.length;
                this.f102716h.setRequestProperty("Content-Length", String.valueOf(length));
                ((sg.bigo.ads.common.u.b.b) this.f102709a).f102745i = length;
                bufferedOutputStream = new BufferedOutputStream(this.f102716h.getOutputStream());
                bufferedOutputStream.write(byteArray);
            }
            bufferedOutputStream.flush();
            bufferedOutputStream.close();
        }
        return this.f102716h;
    }

    public final boolean b() {
        return this.f102714f != null;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        if (this.f102714f != null) {
            sb2.append("originUrl=");
            sb2.append(this.f102709a.g());
            sb2.append(", redirectURL=");
            sb2.append(this.f102714f);
            sb2.append(", redirectCount=");
            sb2.append(this.f102715g);
        } else {
            sb2.append("requestUrl=");
            sb2.append(this.f102709a.g());
        }
        return sb2.toString();
    }

    public c(@NonNull sg.bigo.ads.common.u.b.c cVar, @NonNull b bVar, @Nullable g gVar) {
        this(cVar, null, null, bVar, gVar);
    }

    private URL a(Uri uri) {
        if (uri == null) {
            return null;
        }
        if (this.f102713e == null || !this.f102709a.f102752o) {
            return new URL(uri.toString());
        }
        Uri.Builder builderBuildUpon = Uri.parse(uri.toString()).buildUpon();
        a(builderBuildUpon, "sdk_ver", this.f102713e.y());
        a(builderBuildUpon, "sdk_vc", "50602");
        a(builderBuildUpon, "country", this.f102713e.U());
        a(builderBuildUpon, MBridgeConstans.APP_KEY, this.f102713e.a());
        a(builderBuildUpon, "pkg_ver", this.f102713e.c());
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f102713e.d());
        a(builderBuildUpon, "pkg_vc", sb2.toString());
        a(builderBuildUpon, "os", this.f102713e.i());
        a(builderBuildUpon, "os_ver", this.f102713e.j());
        a(builderBuildUpon, "os_lang", this.f102713e.k());
        a(builderBuildUpon, z.f66061c, this.f102713e.l());
        a(builderBuildUpon, "model", this.f102713e.m());
        StringBuilder sb3 = new StringBuilder();
        sb3.append(this.f102713e.p());
        a(builderBuildUpon, "dpi", sb3.toString());
        a(builderBuildUpon, "dpi_f", this.f102713e.q());
        a(builderBuildUpon, "resolution", this.f102713e.o());
        a(builderBuildUpon, "net", this.f102713e.r());
        a(builderBuildUpon, "tz", this.f102713e.s());
        if (this.f102709a.f()) {
            a(builderBuildUpon, "enc", "1");
        }
        return new URL(builderBuildUpon.build().toString());
    }

    @NonNull
    public final c a(@NonNull URL url) {
        c cVar = new c(this.f102709a, this.f102710b, url, this.f102712d, this.f102713e);
        cVar.f102715g = this.f102715g + 1;
        return cVar;
    }

    private static void a(Uri.Builder builder, String str, String str2) {
        if (builder == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }
}
