package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public abstract class m5 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final h f88933b = new h(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f88934c = g.f88942f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f88935a;

    public static final class a extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k1 f88936d;

        public a(k1 k1Var) {
            super(null);
            this.f88936d = k1Var;
        }

        public final k1 c() {
            return this.f88936d;
        }
    }

    public static final class b extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p1 f88937d;

        public b(p1 p1Var) {
            super(null);
            this.f88937d = p1Var;
        }

        public final p1 c() {
            return this.f88937d;
        }
    }

    public static final class c extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u1 f88938d;

        public c(u1 u1Var) {
            super(null);
            this.f88938d = u1Var;
        }

        public final u1 c() {
            return this.f88938d;
        }
    }

    public static final class d extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z1 f88939d;

        public d(z1 z1Var) {
            super(null);
            this.f88939d = z1Var;
        }

        public final z1 c() {
            return this.f88939d;
        }
    }

    public static final class e extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e2 f88940d;

        public e(e2 e2Var) {
            super(null);
            this.f88940d = e2Var;
        }

        public final e2 c() {
            return this.f88940d;
        }
    }

    public static final class f extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j2 f88941d;

        public f(j2 j2Var) {
            super(null);
            this.f88941d = j2Var;
        }

        public final j2 c() {
            return this.f88941d;
        }
    }

    static final class g extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final g f88942f = new g();

        g() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return m5.f88933b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class h {
        public /* synthetic */ h(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final m5 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((n5) BuiltInParserKt.getBuiltInParserComponent().h1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private h() {
        }
    }

    public static final class i extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final o2 f88943d;

        public i(o2 o2Var) {
            super(null);
            this.f88943d = o2Var;
        }

        public final o2 c() {
            return this.f88943d;
        }
    }

    public static final class j extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final y2 f88944d;

        public j(y2 y2Var) {
            super(null);
            this.f88944d = y2Var;
        }

        public final y2 c() {
            return this.f88944d;
        }
    }

    public static final class k extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d3 f88945d;

        public k(d3 d3Var) {
            super(null);
            this.f88945d = d3Var;
        }

        public final d3 c() {
            return this.f88945d;
        }
    }

    public static final class l extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final i3 f88946d;

        public l(i3 i3Var) {
            super(null);
            this.f88946d = i3Var;
        }

        public final i3 c() {
            return this.f88946d;
        }
    }

    public static final class m extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n3 f88947d;

        public m(n3 n3Var) {
            super(null);
            this.f88947d = n3Var;
        }

        public final n3 c() {
            return this.f88947d;
        }
    }

    public static final class n extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final w3 f88948d;

        public n(w3 w3Var) {
            super(null);
            this.f88948d = w3Var;
        }

        public final w3 c() {
            return this.f88948d;
        }
    }

    public static final class o extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e4 f88949d;

        public o(e4 e4Var) {
            super(null);
            this.f88949d = e4Var;
        }

        public final e4 c() {
            return this.f88949d;
        }
    }

    public static final class p extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h4 f88950d;

        public p(h4 h4Var) {
            super(null);
            this.f88950d = h4Var;
        }

        public final h4 c() {
            return this.f88950d;
        }
    }

    public static final class q extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final k4 f88951d;

        public q(k4 k4Var) {
            super(null);
            this.f88951d = k4Var;
        }

        public final k4 c() {
            return this.f88951d;
        }
    }

    public static final class r extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p4 f88952d;

        public r(p4 p4Var) {
            super(null);
            this.f88952d = p4Var;
        }

        public final p4 c() {
            return this.f88952d;
        }
    }

    public static final class s extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u4 f88953d;

        public s(u4 u4Var) {
            super(null);
            this.f88953d = u4Var;
        }

        public final u4 c() {
            return this.f88953d;
        }
    }

    public static final class t extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final z4 f88954d;

        public t(z4 z4Var) {
            super(null);
            this.f88954d = z4Var;
        }

        public final z4 c() {
            return this.f88954d;
        }
    }

    public static final class u extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j5 f88955d;

        public u(j5 j5Var) {
            super(null);
            this.f88955d = j5Var;
        }

        public final j5 c() {
            return this.f88955d;
        }
    }

    public static final class v extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final r5 f88956d;

        public v(r5 r5Var) {
            super(null);
            this.f88956d = r5Var;
        }

        public final r5 c() {
            return this.f88956d;
        }
    }

    public static final class w extends m5 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final v5 f88957d;

        public w(v5 v5Var) {
            super(null);
            this.f88957d = v5Var;
        }

        public final v5 c() {
            return this.f88957d;
        }
    }

    public /* synthetic */ m5(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(m5 m5Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (m5Var == null) {
            return false;
        }
        if (this instanceof a) {
            k1 k1VarC = ((a) this).c();
            Object objB = m5Var.b();
            return k1VarC.a(objB instanceof k1 ? (k1) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof b) {
            p1 p1VarC = ((b) this).c();
            Object objB2 = m5Var.b();
            return p1VarC.a(objB2 instanceof p1 ? (p1) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            u1 u1VarC = ((c) this).c();
            Object objB3 = m5Var.b();
            return u1VarC.a(objB3 instanceof u1 ? (u1) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            z1 z1VarC = ((d) this).c();
            Object objB4 = m5Var.b();
            return z1VarC.a(objB4 instanceof z1 ? (z1) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            e2 e2VarC = ((e) this).c();
            Object objB5 = m5Var.b();
            return e2VarC.a(objB5 instanceof e2 ? (e2) objB5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            j2 j2VarC = ((f) this).c();
            Object objB6 = m5Var.b();
            return j2VarC.a(objB6 instanceof j2 ? (j2) objB6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            o2 o2VarC = ((i) this).c();
            Object objB7 = m5Var.b();
            return o2VarC.a(objB7 instanceof o2 ? (o2) objB7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            y2 y2VarC = ((j) this).c();
            Object objB8 = m5Var.b();
            return y2VarC.a(objB8 instanceof y2 ? (y2) objB8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            d3 d3VarC = ((k) this).c();
            Object objB9 = m5Var.b();
            return d3VarC.a(objB9 instanceof d3 ? (d3) objB9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            i3 i3VarC = ((l) this).c();
            Object objB10 = m5Var.b();
            return i3VarC.a(objB10 instanceof i3 ? (i3) objB10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            n3 n3VarC = ((m) this).c();
            Object objB11 = m5Var.b();
            return n3VarC.a(objB11 instanceof n3 ? (n3) objB11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            w3 w3VarC = ((n) this).c();
            Object objB12 = m5Var.b();
            return w3VarC.a(objB12 instanceof w3 ? (w3) objB12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            e4 e4VarC = ((o) this).c();
            Object objB13 = m5Var.b();
            return e4VarC.a(objB13 instanceof e4 ? (e4) objB13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            h4 h4VarC = ((p) this).c();
            Object objB14 = m5Var.b();
            return h4VarC.a(objB14 instanceof h4 ? (h4) objB14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            k4 k4VarC = ((q) this).c();
            Object objB15 = m5Var.b();
            return k4VarC.a(objB15 instanceof k4 ? (k4) objB15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof r) {
            p4 p4VarC = ((r) this).c();
            Object objB16 = m5Var.b();
            return p4VarC.a(objB16 instanceof p4 ? (p4) objB16 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof s) {
            u4 u4VarC = ((s) this).c();
            Object objB17 = m5Var.b();
            return u4VarC.a(objB17 instanceof u4 ? (u4) objB17 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof t) {
            z4 z4VarC = ((t) this).c();
            Object objB18 = m5Var.b();
            return z4VarC.a(objB18 instanceof z4 ? (z4) objB18 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof u) {
            j5 j5VarC = ((u) this).c();
            Object objB19 = m5Var.b();
            return j5VarC.a(objB19 instanceof j5 ? (j5) objB19 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof v) {
            r5 r5VarC = ((v) this).c();
            Object objB20 = m5Var.b();
            return r5VarC.a(objB20 instanceof r5 ? (r5) objB20 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof w)) {
            throw new lf.m();
        }
        v5 v5VarC = ((w) this).c();
        Object objB21 = m5Var.b();
        return v5VarC.a(objB21 instanceof v5 ? (v5) objB21 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof b) {
            return ((b) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof i) {
            return ((i) this).c();
        }
        if (this instanceof j) {
            return ((j) this).c();
        }
        if (this instanceof k) {
            return ((k) this).c();
        }
        if (this instanceof l) {
            return ((l) this).c();
        }
        if (this instanceof m) {
            return ((m) this).c();
        }
        if (this instanceof n) {
            return ((n) this).c();
        }
        if (this instanceof o) {
            return ((o) this).c();
        }
        if (this instanceof p) {
            return ((p) this).c();
        }
        if (this instanceof q) {
            return ((q) this).c();
        }
        if (this instanceof r) {
            return ((r) this).c();
        }
        if (this instanceof s) {
            return ((s) this).c();
        }
        if (this instanceof t) {
            return ((t) this).c();
        }
        if (this instanceof u) {
            return ((u) this).c();
        }
        if (this instanceof v) {
            return ((v) this).c();
        }
        if (this instanceof w) {
            return ((w) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f88935a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else if (this instanceof b) {
            iHash = ((b) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).c().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).c().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).c().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).c().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).c().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).c().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).c().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).c().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).c().hash();
        } else if (this instanceof r) {
            iHash = ((r) this).c().hash();
        } else if (this instanceof s) {
            iHash = ((s) this).c().hash();
        } else if (this instanceof t) {
            iHash = ((t) this).c().hash();
        } else if (this instanceof u) {
            iHash = ((u) this).c().hash();
        } else if (this instanceof v) {
            iHash = ((v) this).c().hash();
        } else {
            if (!(this instanceof w)) {
                throw new lf.m();
            }
            iHash = ((w) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f88935a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((n5) BuiltInParserKt.getBuiltInParserComponent().h1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private m5() {
    }
}
