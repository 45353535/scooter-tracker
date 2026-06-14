package io.sentry.protocol;

import com.google.common.base.Ascii;
import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.h7;
import io.sentry.m3;
import io.sentry.n3;
import io.sentry.t1;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class b0 implements d2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f83855b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f83856c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f83857d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List f83858e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f83859f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f83860g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f83861h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f83862i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Integer f83863j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private String f83864k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private String f83865l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Boolean f83866m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private String f83867n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private Boolean f83868o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f83869p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f83870q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private String f83871r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private String f83872s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f83873t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private String f83874u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Map f83875v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f83876w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private h7 f83877x;

    public static final class a implements t1 {
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        @Override // io.sentry.t1
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0 a(m3 m3Var, ILogger iLogger) {
            b0 b0Var = new b0();
            m3Var.beginObject();
            ConcurrentHashMap concurrentHashMap = null;
            while (m3Var.peek() == io.sentry.vendor.gson.stream.b.NAME) {
                String strNextName = m3Var.nextName();
                strNextName.getClass();
                byte b10 = -1;
                switch (strNextName.hashCode()) {
                    case -1641491184:
                        if (strNextName.equals("post_context")) {
                            b10 = 0;
                        }
                        break;
                    case -1443345323:
                        if (strNextName.equals("image_addr")) {
                            b10 = 1;
                        }
                        break;
                    case -1184392185:
                        if (strNextName.equals("in_app")) {
                            b10 = 2;
                        }
                        break;
                    case -1113875953:
                        if (strNextName.equals("raw_function")) {
                            b10 = 3;
                        }
                        break;
                    case -1102671691:
                        if (strNextName.equals("lineno")) {
                            b10 = 4;
                        }
                        break;
                    case -1068784020:
                        if (strNextName.equals("module")) {
                            b10 = 5;
                        }
                        break;
                    case -1052618729:
                        if (strNextName.equals("native")) {
                            b10 = 6;
                        }
                        break;
                    case -887523944:
                        if (strNextName.equals("symbol")) {
                            b10 = 7;
                        }
                        break;
                    case -807062458:
                        if (strNextName.equals("package")) {
                            b10 = 8;
                        }
                        break;
                    case -734768633:
                        if (strNextName.equals("filename")) {
                            b10 = 9;
                        }
                        break;
                    case -330260936:
                        if (strNextName.equals("symbol_addr")) {
                            b10 = 10;
                        }
                        break;
                    case 3327275:
                        if (strNextName.equals("lock")) {
                            b10 = Ascii.VT;
                        }
                        break;
                    case 3612204:
                        if (strNextName.equals("vars")) {
                            b10 = Ascii.FF;
                        }
                        break;
                    case 94842689:
                        if (strNextName.equals("colno")) {
                            b10 = 13;
                        }
                        break;
                    case 410194178:
                        if (strNextName.equals("instruction_addr")) {
                            b10 = Ascii.SO;
                        }
                        break;
                    case 822688787:
                        if (strNextName.equals("pre_context")) {
                            b10 = Ascii.SI;
                        }
                        break;
                    case 868820273:
                        if (strNextName.equals("addr_mode")) {
                            b10 = Ascii.DLE;
                        }
                        break;
                    case 1116694660:
                        if (strNextName.equals("context_line")) {
                            b10 = 17;
                        }
                        break;
                    case 1380938712:
                        if (strNextName.equals("function")) {
                            b10 = Ascii.DC2;
                        }
                        break;
                    case 1713445842:
                        if (strNextName.equals("abs_path")) {
                            b10 = 19;
                        }
                        break;
                    case 1874684019:
                        if (strNextName.equals("platform")) {
                            b10 = Ascii.DC4;
                        }
                        break;
                }
                switch (b10) {
                    case 0:
                        b0Var.f83856c = (List) m3Var.p0();
                        break;
                    case 1:
                        b0Var.f83870q = m3Var.G();
                        break;
                    case 2:
                        b0Var.f83866m = m3Var.x();
                        break;
                    case 3:
                        b0Var.f83876w = m3Var.G();
                        break;
                    case 4:
                        b0Var.f83862i = m3Var.d0();
                        break;
                    case 5:
                        b0Var.f83861h = m3Var.G();
                        break;
                    case 6:
                        b0Var.f83868o = m3Var.x();
                        break;
                    case 7:
                        b0Var.f83874u = m3Var.G();
                        break;
                    case 8:
                        b0Var.f83867n = m3Var.G();
                        break;
                    case 9:
                        b0Var.f83859f = m3Var.G();
                        break;
                    case 10:
                        b0Var.f83871r = m3Var.G();
                        break;
                    case 11:
                        b0Var.f83877x = (h7) m3Var.B(iLogger, new h7.a());
                        break;
                    case 12:
                        b0Var.f83857d = (Map) m3Var.p0();
                        break;
                    case 13:
                        b0Var.f83863j = m3Var.d0();
                        break;
                    case 14:
                        b0Var.f83872s = m3Var.G();
                        break;
                    case 15:
                        b0Var.f83855b = (List) m3Var.p0();
                        break;
                    case 16:
                        b0Var.f83873t = m3Var.G();
                        break;
                    case 17:
                        b0Var.f83865l = m3Var.G();
                        break;
                    case 18:
                        b0Var.f83860g = m3Var.G();
                        break;
                    case 19:
                        b0Var.f83864k = m3Var.G();
                        break;
                    case 20:
                        b0Var.f83869p = m3Var.G();
                        break;
                    default:
                        if (concurrentHashMap == null) {
                            concurrentHashMap = new ConcurrentHashMap();
                        }
                        m3Var.l0(iLogger, concurrentHashMap, strNextName);
                        break;
                }
            }
            b0Var.I(concurrentHashMap);
            m3Var.endObject();
            return b0Var;
        }
    }

    public void A(Boolean bool) {
        this.f83866m = bool;
    }

    public void B(String str) {
        this.f83872s = str;
    }

    public void C(Integer num) {
        this.f83862i = num;
    }

    public void D(h7 h7Var) {
        this.f83877x = h7Var;
    }

    public void E(String str) {
        this.f83861h = str;
    }

    public void F(Boolean bool) {
        this.f83868o = bool;
    }

    public void G(String str) {
        this.f83867n = str;
    }

    public void H(String str) {
        this.f83869p = str;
    }

    public void I(Map map) {
        this.f83875v = map;
    }

    public boolean equals(Object obj) {
        if (obj != null && b0.class == obj.getClass()) {
            b0 b0Var = (b0) obj;
            if (Objects.equals(this.f83855b, b0Var.f83855b) && Objects.equals(this.f83856c, b0Var.f83856c) && Objects.equals(this.f83857d, b0Var.f83857d) && Objects.equals(this.f83858e, b0Var.f83858e) && Objects.equals(this.f83859f, b0Var.f83859f) && Objects.equals(this.f83860g, b0Var.f83860g) && Objects.equals(this.f83861h, b0Var.f83861h) && Objects.equals(this.f83862i, b0Var.f83862i) && Objects.equals(this.f83863j, b0Var.f83863j) && Objects.equals(this.f83864k, b0Var.f83864k) && Objects.equals(this.f83865l, b0Var.f83865l) && Objects.equals(this.f83866m, b0Var.f83866m) && Objects.equals(this.f83867n, b0Var.f83867n) && Objects.equals(this.f83868o, b0Var.f83868o) && Objects.equals(this.f83869p, b0Var.f83869p) && Objects.equals(this.f83870q, b0Var.f83870q) && Objects.equals(this.f83871r, b0Var.f83871r) && Objects.equals(this.f83872s, b0Var.f83872s) && Objects.equals(this.f83873t, b0Var.f83873t) && Objects.equals(this.f83874u, b0Var.f83874u) && Objects.equals(this.f83875v, b0Var.f83875v) && Objects.equals(this.f83876w, b0Var.f83876w) && Objects.equals(this.f83877x, b0Var.f83877x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f83855b, this.f83856c, this.f83857d, this.f83858e, this.f83859f, this.f83860g, this.f83861h, this.f83862i, this.f83863j, this.f83864k, this.f83865l, this.f83866m, this.f83867n, this.f83868o, this.f83869p, this.f83870q, this.f83871r, this.f83872s, this.f83873t, this.f83874u, this.f83875v, this.f83876w, this.f83877x);
    }

    @Override // io.sentry.d2
    public void serialize(n3 n3Var, ILogger iLogger) {
        n3Var.beginObject();
        if (this.f83859f != null) {
            n3Var.e("filename").a(this.f83859f);
        }
        if (this.f83860g != null) {
            n3Var.e("function").a(this.f83860g);
        }
        if (this.f83861h != null) {
            n3Var.e("module").a(this.f83861h);
        }
        if (this.f83862i != null) {
            n3Var.e("lineno").i(this.f83862i);
        }
        if (this.f83863j != null) {
            n3Var.e("colno").i(this.f83863j);
        }
        if (this.f83864k != null) {
            n3Var.e("abs_path").a(this.f83864k);
        }
        if (this.f83865l != null) {
            n3Var.e("context_line").a(this.f83865l);
        }
        if (this.f83866m != null) {
            n3Var.e("in_app").k(this.f83866m);
        }
        if (this.f83867n != null) {
            n3Var.e("package").a(this.f83867n);
        }
        if (this.f83868o != null) {
            n3Var.e("native").k(this.f83868o);
        }
        if (this.f83869p != null) {
            n3Var.e("platform").a(this.f83869p);
        }
        if (this.f83870q != null) {
            n3Var.e("image_addr").a(this.f83870q);
        }
        if (this.f83871r != null) {
            n3Var.e("symbol_addr").a(this.f83871r);
        }
        if (this.f83872s != null) {
            n3Var.e("instruction_addr").a(this.f83872s);
        }
        if (this.f83873t != null) {
            n3Var.e("addr_mode").a(this.f83873t);
        }
        if (this.f83876w != null) {
            n3Var.e("raw_function").a(this.f83876w);
        }
        if (this.f83874u != null) {
            n3Var.e("symbol").a(this.f83874u);
        }
        if (this.f83877x != null) {
            n3Var.e("lock").j(iLogger, this.f83877x);
        }
        List list = this.f83855b;
        if (list != null && !list.isEmpty()) {
            n3Var.e("pre_context").j(iLogger, this.f83855b);
        }
        List list2 = this.f83856c;
        if (list2 != null && !list2.isEmpty()) {
            n3Var.e("post_context").j(iLogger, this.f83856c);
        }
        Map map = this.f83857d;
        if (map != null && !map.isEmpty()) {
            n3Var.e("vars").j(iLogger, this.f83857d);
        }
        Map map2 = this.f83875v;
        if (map2 != null) {
            for (String str : map2.keySet()) {
                Object obj = this.f83875v.get(str);
                n3Var.e(str);
                n3Var.j(iLogger, obj);
            }
        }
        n3Var.endObject();
    }

    public String v() {
        return this.f83861h;
    }

    public String w() {
        return this.f83867n;
    }

    public void x(String str) {
        this.f83873t = str;
    }

    public void y(String str) {
        this.f83859f = str;
    }

    public void z(String str) {
        this.f83860g = str;
    }
}
