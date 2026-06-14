package com.mbridge.msdk.thrid.okhttp.internal.http;

import com.mbridge.msdk.thrid.okhttp.w;
import java.io.IOException;
import java.net.ProtocolException;

/* JADX INFO: loaded from: classes10.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final w f51312a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f51313b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f51314c;

    public k(w wVar, int i10, String str) {
        this.f51312a = wVar;
        this.f51313b = i10;
        this.f51314c = str;
    }

    public static k a(String str) throws IOException {
        w wVar;
        int i10;
        String strSubstring;
        if (str.startsWith("HTTP/1.")) {
            i10 = 9;
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            int iCharAt = str.charAt(7) - '0';
            if (iCharAt == 0) {
                wVar = w.HTTP_1_0;
            } else {
                if (iCharAt != 1) {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                wVar = w.HTTP_1_1;
            }
        } else {
            if (!str.startsWith("ICY ")) {
                throw new ProtocolException("Unexpected status line: " + str);
            }
            wVar = w.HTTP_1_0;
            i10 = 4;
        }
        int i11 = i10 + 3;
        if (str.length() < i11) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
        try {
            int i12 = Integer.parseInt(str.substring(i10, i11));
            if (str.length() <= i11) {
                strSubstring = "";
            } else {
                if (str.charAt(i11) != ' ') {
                    throw new ProtocolException("Unexpected status line: " + str);
                }
                strSubstring = str.substring(i10 + 4);
            }
            return new k(wVar, i12, strSubstring);
        } catch (NumberFormatException unused) {
            throw new ProtocolException("Unexpected status line: " + str);
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f51312a == w.HTTP_1_0 ? "HTTP/1.0" : "HTTP/1.1");
        sb2.append(' ');
        sb2.append(this.f51313b);
        if (this.f51314c != null) {
            sb2.append(' ');
            sb2.append(this.f51314c);
        }
        return sb2.toString();
    }
}
