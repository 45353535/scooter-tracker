package hh;

import hh.t;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes10.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final u f73837a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f73838b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t f73839c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a0 f73840d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map f73841e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f73842f;

    public z(u url, String method, t headers, a0 a0Var, Map tags) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(headers, "headers");
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.f73837a = url;
        this.f73838b = method;
        this.f73839c = headers;
        this.f73840d = a0Var;
        this.f73841e = tags;
    }

    public final a0 a() {
        return this.f73840d;
    }

    public final d b() {
        d dVar = this.f73842f;
        if (dVar != null) {
            return dVar;
        }
        d dVarB = d.f73576n.b(this.f73839c);
        this.f73842f = dVarB;
        return dVarB;
    }

    public final Map c() {
        return this.f73841e;
    }

    public final String d(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f73839c.a(name);
    }

    public final t e() {
        return this.f73839c;
    }

    public final List f(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.f73839c.j(name);
    }

    public final boolean g() {
        return this.f73837a.i();
    }

    public final String h() {
        return this.f73838b;
    }

    public final a i() {
        return new a(this);
    }

    public final Object j() {
        return k(Object.class);
    }

    public final Object k(Class type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return type.cast(this.f73841e.get(type));
    }

    public final u l() {
        return this.f73837a;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.f73838b);
        sb2.append(", url=");
        sb2.append(this.f73837a);
        if (this.f73839c.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Object obj : this.f73839c) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                Pair pair = (Pair) obj;
                String str = (String) pair.component1();
                String str2 = (String) pair.component2();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(':');
                sb2.append(str2);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.f73841e.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.f73841e);
        }
        sb2.append('}');
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f73843a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f73844b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t.a f73845c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a0 f73846d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Map f73847e;

        public a() {
            this.f73847e = new LinkedHashMap();
            this.f73844b = "GET";
            this.f73845c = new t.a();
        }

        public a a(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73845c.a(name, value);
            return this;
        }

        public z b() {
            u uVar = this.f73843a;
            if (uVar != null) {
                return new z(uVar, this.f73844b, this.f73845c.e(), this.f73846d, ih.d.U(this.f73847e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(d cacheControl) {
            Intrinsics.checkNotNullParameter(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? j("Cache-Control") : f("Cache-Control", string);
        }

        public a d() {
            return h("GET", null);
        }

        public a e() {
            return h("HEAD", null);
        }

        public a f(String name, String value) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(value, "value");
            this.f73845c.i(name, value);
            return this;
        }

        public a g(t headers) {
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f73845c = headers.f();
            return this;
        }

        public a h(String method, a0 a0Var) {
            Intrinsics.checkNotNullParameter(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (a0Var == null) {
                if (nh.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!nh.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f73844b = method;
            this.f73846d = a0Var;
            return this;
        }

        public a i(a0 body) {
            Intrinsics.checkNotNullParameter(body, "body");
            return h("POST", body);
        }

        public a j(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f73845c.h(name);
            return this;
        }

        public a k(Class type, Object obj) {
            Intrinsics.checkNotNullParameter(type, "type");
            if (obj == null) {
                this.f73847e.remove(type);
                return this;
            }
            if (this.f73847e.isEmpty()) {
                this.f73847e = new LinkedHashMap();
            }
            Map map = this.f73847e;
            Object objCast = type.cast(obj);
            Intrinsics.checkNotNull(objCast);
            map.put(type, objCast);
            return this;
        }

        public a l(Object obj) {
            return k(Object.class, obj);
        }

        public a m(u url) {
            Intrinsics.checkNotNullParameter(url, "url");
            this.f73843a = url;
            return this;
        }

        public a n(String url) {
            Intrinsics.checkNotNullParameter(url, "url");
            if (StringsKt.Y(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (StringsKt.Y(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                Intrinsics.checkNotNullExpressionValue(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return m(u.f73749k.d(url));
        }

        public a(z request) {
            Map mutableMap;
            Intrinsics.checkNotNullParameter(request, "request");
            this.f73847e = new LinkedHashMap();
            this.f73843a = request.l();
            this.f73844b = request.h();
            this.f73846d = request.a();
            if (request.c().isEmpty()) {
                mutableMap = new LinkedHashMap();
            } else {
                mutableMap = MapsKt.toMutableMap(request.c());
            }
            this.f73847e = mutableMap;
            this.f73845c = request.e().f();
        }
    }
}
