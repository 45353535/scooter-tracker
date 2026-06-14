package com.taurusx.tax.c;

import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.d0;
import com.taurusx.tax.g.r;
import com.taurusx.tax.log.LogUtil;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;

/* JADX INFO: loaded from: classes11.dex */
public abstract class s extends HttpURLConnection {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f65964w = 20000;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f65965z = 20000;

    public s(URL url) {
        super(url);
    }

    public static String c(String str) throws Exception {
        r.z(str);
        if (!w(str)) {
            return (y(str) ? z(str) : new URI(str)).toURL().toString();
        }
        throw new UnsupportedEncodingException("URL is improperly encoded: " + str);
    }

    public static boolean w(String str) {
        try {
            URLDecoder.decode(str, "UTF-8");
            return false;
        } catch (UnsupportedEncodingException unused) {
            LogUtil.v("taurusx", "Url is improperly encoded: " + str);
            return true;
        }
    }

    public static boolean y(String str) {
        try {
            new URI(str);
            return false;
        } catch (URISyntaxException unused) {
            return true;
        }
    }

    public static HttpURLConnection z(String str, long j10, long j11) throws IOException {
        r.z(str);
        if (w(str)) {
            throw new IllegalArgumentException("URL is improperly encoded: " + str);
        }
        try {
            str = c(str);
        } catch (Exception unused) {
        }
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestProperty("user-agent", d0.w(TaurusXAds.getContext()));
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setReadTimeout(20000);
        return httpURLConnection;
    }

    public static URI z(String str) throws Exception {
        try {
            URL url = new URL(str);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef());
        } catch (Exception e10) {
            LogUtil.v("taurusx", "Failed to encode url: " + str);
            throw e10;
        }
    }
}
