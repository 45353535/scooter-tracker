package sg.bigo.ads.core.player.a;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import sg.bigo.ads.common.m;

/* JADX INFO: loaded from: classes4.dex */
final class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f104546d = Pattern.compile("[R,r]ange:[ ]?bytes=(\\d*)-");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f104547e = Pattern.compile("GET /(.*) HTTP");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f104548a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f104549b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f104550c;

    private b(String str) {
        m.a(str);
        Matcher matcher = f104546d.matcher(str);
        long j10 = matcher.find() ? Long.parseLong(matcher.group(1)) : -1L;
        this.f104549b = Math.max(0L, j10);
        this.f104550c = j10 >= 0;
        Matcher matcher2 = f104547e.matcher(str);
        this.f104548a = matcher2.find() ? matcher2.group(1) : new String();
    }

    public static b a(InputStream inputStream) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
            StringBuilder sb2 = new StringBuilder();
            while (true) {
                String line = bufferedReader.readLine();
                if (TextUtils.isEmpty(line)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "ProxyCache", "GetRequest stringRequest=" + sb2.toString());
                    return new b(sb2.toString());
                }
                sb2.append(line);
                sb2.append('\n');
            }
        } catch (IOException e10) {
            sg.bigo.ads.common.t.a.a(0, "ProxyCache", "GetRequest#read, error message is : " + e10.toString());
            return null;
        }
    }

    public final String toString() {
        return "GetRequest{rangeOffset=" + this.f104549b + ", partial=" + this.f104550c + ", uri='" + this.f104548a + "'}";
    }
}
