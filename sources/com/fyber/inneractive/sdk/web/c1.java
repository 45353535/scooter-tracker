package com.fyber.inneractive.sdk.web;

import android.text.TextUtils;
import com.google.common.net.HttpHeaders;
import io.appmetrica.analytics.BuildConfig;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public final class c1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final Pattern f23934g = Pattern.compile("max-age=(\\d+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final SimpleDateFormat f23935h = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss zzz", Locale.ENGLISH);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte[] f23936a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f23937b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f23938c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f23939d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f23940e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f23941f;

    public c1(byte[] bArr, HashMap map, String str, String str2, int i10, String str3) {
        this.f23936a = bArr;
        this.f23937b = map;
        this.f23938c = str;
        this.f23939d = str2;
        this.f23940e = i10;
        this.f23941f = str3;
    }

    public final boolean a() {
        boolean z10;
        String str;
        if (TextUtils.isEmpty(this.f23941f)) {
            return false;
        }
        loop0: while (true) {
            z10 = true;
            for (String str2 : this.f23937b.keySet()) {
                if (!z10) {
                    break loop0;
                }
                if (str2 == null || !str2.equalsIgnoreCase("Cache-Control")) {
                    if (str2 == null || !str2.equalsIgnoreCase(HttpHeaders.VARY)) {
                        if (str2 != null && str2.equalsIgnoreCase(HttpHeaders.PRAGMA)) {
                            String str3 = (String) this.f23937b.get(str2);
                            if (str3 != null) {
                                z10 = !str3.equalsIgnoreCase("no-cache");
                            }
                        } else if (str2 != null && str2.equalsIgnoreCase("Expires") && (str = (String) this.f23937b.get(str2)) != null) {
                            try {
                                Date date = f23935h.parse(str);
                                if (date != null && date.getTime() + TimeUnit.MILLISECONDS.convert(1L, TimeUnit.HOURS) > System.currentTimeMillis()) {
                                    break;
                                }
                            } catch (ParseException unused) {
                                continue;
                            }
                        }
                    }
                    z10 = false;
                } else {
                    String str4 = (String) this.f23937b.get(str2);
                    if (str4 != null) {
                        Pattern pattern = f23934g;
                        Locale locale = Locale.ENGLISH;
                        Matcher matcher = pattern.matcher(str4.toLowerCase(locale));
                        int iA = (matcher.find() && matcher.groupCount() == 1) ? com.fyber.inneractive.sdk.util.v.a(matcher.group(1), 0) : 0;
                        if ((str4.toLowerCase(locale).contains(BuildConfig.SDK_BUILD_FLAVOR) || str4.toLowerCase(locale).contains("private") || iA > TimeUnit.SECONDS.convert(1L, TimeUnit.HOURS)) && !str4.toLowerCase(locale).contains("no-") && !str4.toLowerCase(locale).contains("must-")) {
                            break;
                        }
                        z10 = false;
                    } else {
                        continue;
                    }
                }
            }
        }
        return z10;
    }
}
