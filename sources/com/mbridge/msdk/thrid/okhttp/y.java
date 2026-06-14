package com.mbridge.msdk.thrid.okhttp;

import com.mbridge.msdk.thrid.okhttp.r;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final s f51704a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final String f51705b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final r f51706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final z f51707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Map<Class<?>, Object> f51708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile c f51709f;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f51710a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f51711b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        r.a f51712c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        z f51713d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Map<Class<?>, Object> f51714e;

        public a() {
            this.f51714e = Collections.EMPTY_MAP;
            this.f51711b = "GET";
            this.f51712c = new r.a();
        }

        public a a(s sVar) {
            if (sVar == null) {
                throw new NullPointerException("url == null");
            }
            this.f51710a = sVar;
            return this;
        }

        public a b(String str) {
            String str2;
            if (str == null) {
                throw new NullPointerException("url == null");
            }
            if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                str2 = "http:" + str.substring(3);
            } else if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                str2 = "https:" + str.substring(4);
            } else {
                str2 = str;
            }
            return a(s.b(str2));
        }

        public a c() {
            return a("GET", (z) null);
        }

        public a d() {
            return a("HEAD", (z) null);
        }

        public a c(z zVar) {
            return a("POST", zVar);
        }

        public a d(z zVar) {
            return a("PUT", zVar);
        }

        public a a(String str, String str2) {
            this.f51712c.a(str, str2);
            return this;
        }

        public a a(String str) {
            this.f51712c.b(str);
            return this;
        }

        a(y yVar) {
            Map<Class<?>, Object> map = Collections.EMPTY_MAP;
            this.f51714e = map;
            this.f51710a = yVar.f51704a;
            this.f51711b = yVar.f51705b;
            this.f51713d = yVar.f51707d;
            this.f51714e = yVar.f51708e.isEmpty() ? map : new LinkedHashMap<>(yVar.f51708e);
            this.f51712c = yVar.f51706c.a();
        }

        public a a(r rVar) {
            this.f51712c = rVar.a();
            return this;
        }

        public a a(c cVar) {
            String string = cVar.toString();
            return string.isEmpty() ? a("Cache-Control") : b("Cache-Control", string);
        }

        public a b(String str, String str2) {
            this.f51712c.c(str, str2);
            return this;
        }

        public a b() {
            return a(com.mbridge.msdk.thrid.okhttp.internal.c.f51204d);
        }

        public a a(z zVar) {
            return a("DELETE", zVar);
        }

        public a b(z zVar) {
            return a("PATCH", zVar);
        }

        public a a(String str, z zVar) {
            if (str != null) {
                if (str.length() != 0) {
                    if (zVar != null && !com.mbridge.msdk.thrid.okhttp.internal.http.f.a(str)) {
                        throw new IllegalArgumentException("method " + str + " must not have a request body.");
                    }
                    if (zVar == null && com.mbridge.msdk.thrid.okhttp.internal.http.f.d(str)) {
                        throw new IllegalArgumentException("method " + str + " must have a request body.");
                    }
                    this.f51711b = str;
                    this.f51713d = zVar;
                    return this;
                }
                throw new IllegalArgumentException("method.length() == 0");
            }
            throw new NullPointerException("method == null");
        }

        public y a() {
            if (this.f51710a != null) {
                return new y(this);
            }
            throw new IllegalStateException("url == null");
        }
    }

    y(a aVar) {
        this.f51704a = aVar.f51710a;
        this.f51705b = aVar.f51711b;
        this.f51706c = aVar.f51712c.a();
        this.f51707d = aVar.f51713d;
        this.f51708e = com.mbridge.msdk.thrid.okhttp.internal.c.a(aVar.f51714e);
    }

    public String a(String str) {
        return this.f51706c.b(str);
    }

    public c b() {
        c cVar = this.f51709f;
        if (cVar != null) {
            return cVar;
        }
        c cVarA = c.a(this.f51706c);
        this.f51709f = cVarA;
        return cVarA;
    }

    public r c() {
        return this.f51706c;
    }

    public boolean d() {
        return this.f51704a.h();
    }

    public String e() {
        return this.f51705b;
    }

    public a f() {
        return new a(this);
    }

    public s g() {
        return this.f51704a;
    }

    public String toString() {
        return "Request{method=" + this.f51705b + ", url=" + this.f51704a + ", tags=" + this.f51708e + '}';
    }

    public z a() {
        return this.f51707d;
    }
}
