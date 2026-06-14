package com.mbridge.msdk.thrid.okhttp;

import com.ironsource.D5;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes10.dex */
public final class u {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f51627e = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Pattern f51628f = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f51629a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f51630b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f51631c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f51632d;

    private u(String str, String str2, String str3, String str4) {
        this.f51629a = str;
        this.f51630b = str2;
        this.f51631c = str3;
        this.f51632d = str4;
    }

    public static u a(String str) {
        Matcher matcher = f51627e.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String strGroup = matcher.group(1);
        Locale locale = Locale.US;
        String lowerCase = strGroup.toLowerCase(locale);
        String lowerCase2 = matcher.group(2).toLowerCase(locale);
        Matcher matcher2 = f51628f.matcher(str);
        String str2 = null;
        for (int iEnd = matcher.end(); iEnd < str.length(); iEnd = matcher2.end()) {
            matcher2.region(iEnd, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(iEnd) + "\" for: \"" + str + '\"');
            }
            String strGroup2 = matcher2.group(1);
            if (strGroup2 != null && strGroup2.equalsIgnoreCase(D5.M)) {
                String strGroup3 = matcher2.group(2);
                if (strGroup3 == null) {
                    strGroup3 = matcher2.group(3);
                } else if (strGroup3.startsWith("'") && strGroup3.endsWith("'") && strGroup3.length() > 2) {
                    strGroup3 = strGroup3.substring(1, strGroup3.length() - 1);
                }
                if (str2 != null && !strGroup3.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + strGroup3 + "\" for: \"" + str + '\"');
                }
                str2 = strGroup3;
            }
        }
        return new u(str, lowerCase, lowerCase2, str2);
    }

    public static u b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof u) && ((u) obj).f51629a.equals(this.f51629a);
    }

    public int hashCode() {
        return this.f51629a.hashCode();
    }

    public String toString() {
        return this.f51629a;
    }

    public Charset a(Charset charset) {
        try {
            String str = this.f51632d;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }
}
