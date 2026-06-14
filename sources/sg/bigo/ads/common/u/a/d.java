package sg.bigo.ads.common.u.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import sg.bigo.ads.common.utils.h;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    final HttpURLConnection f102717a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f102718b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final h<List<String>> f102719c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final c f102720d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f102721e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f102722f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final URL f102723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f102724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f102725c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f102726d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f102727e;

        private a(URL url, String str, int i10, String str2, int i11) {
            this.f102723a = url;
            this.f102724b = str;
            this.f102725c = i10;
            this.f102726d = str2;
            this.f102727e = i11;
        }

        /* synthetic */ a(URL url, String str, int i10, String str2, int i11, byte b10) {
            this(url, str, i10, str2, i11);
        }
    }

    public d(@NonNull c cVar) throws IOException {
        this.f102720d = cVar;
        HttpURLConnection httpURLConnectionA = cVar.a();
        this.f102717a = httpURLConnectionA;
        this.f102718b = httpURLConnectionA.getResponseCode();
        this.f102721e = httpURLConnectionA.getRequestMethod();
        h<List<String>> hVar = new h<>();
        this.f102719c = hVar;
        Map<String, List<String>> headerFields = httpURLConnectionA.getHeaderFields();
        if (headerFields != null) {
            hVar.a(headerFields);
        }
        boolean zEqualsIgnoreCase = "gzip".equalsIgnoreCase(httpURLConnectionA.getContentEncoding());
        this.f102722f = zEqualsIgnoreCase;
        if (zEqualsIgnoreCase && cVar.f102711c) {
            hVar.b("Content-Encoding");
            hVar.b("Content-Length");
        }
    }

    public final InputStream a() throws IOException {
        InputStream inputStream = this.f102717a.getInputStream();
        return (this.f102722f && this.f102720d.f102711c) ? new GZIPInputStream(inputStream) : inputStream;
    }

    @Nullable
    public final a b() {
        int i10 = this.f102718b;
        if (i10 == 307 || i10 == 308) {
            String strA = a("Location");
            if (this.f102721e.equalsIgnoreCase("GET") || this.f102721e.equalsIgnoreCase("HEAD")) {
                return new a(null, strA, 0, "", this.f102718b, (byte) 0);
            }
            return new a(null, strA, 706, "redirect code(" + this.f102718b + ") is only available for GET or HEAD method, current request method is " + this.f102721e, this.f102718b, (byte) 0);
        }
        switch (i10) {
            case 300:
            case 301:
            case 302:
            case 303:
                String strA2 = a("Location");
                if (TextUtils.isEmpty(strA2)) {
                    return new a(null, strA2, 707, "empty location.", this.f102718b, (byte) 0);
                }
                try {
                    URL url = new URL(this.f102717a.getURL(), strA2);
                    String string = url.toString();
                    if (TextUtils.equals(string, this.f102717a.getURL().toString())) {
                        return new a(url, strA2, 705, "redirect to the same url, location is " + strA2 + ", redirectURL is " + string, this.f102718b, (byte) 0);
                    }
                    URL url2 = this.f102720d.f102710b;
                    if (url2 == null || !TextUtils.equals(string, url2.toString())) {
                        return new a(url, strA2, 0, "", this.f102718b, (byte) 0);
                    }
                    return new a(url, strA2, 704, "redirect to origin url, location is " + strA2 + ", redirectURL is " + string, this.f102718b, (byte) 0);
                } catch (Exception unused) {
                    return new a(null, strA2, 708, "location->\"" + strA2 + "\" is not a network url.", this.f102718b, (byte) 0);
                }
            default:
                return null;
        }
    }

    @Nullable
    private String a(String str) {
        List<String> listA = this.f102719c.a(str);
        int size = listA != null ? listA.size() : 0;
        String str2 = "";
        while (TextUtils.isEmpty(str2) && size > 0) {
            str2 = listA.get(0);
        }
        return str2;
    }
}
