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
public abstract class y0 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f92566c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f92567d = a.f92570f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f92569b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92570f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y0 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return y0.f92566c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y0 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((wh) BuiltInParserKt.getBuiltInParserComponent().M4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final u8 f92571e;

        public c(u8 u8Var) {
            super(null);
            this.f92571e = u8Var;
        }

        public final u8 d() {
            return this.f92571e;
        }
    }

    public static final class d extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final x9 f92572e;

        public d(x9 x9Var) {
            super(null);
            this.f92572e = x9Var;
        }

        public final x9 d() {
            return this.f92572e;
        }
    }

    public static final class e extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final td f92573e;

        public e(td tdVar) {
            super(null);
            this.f92573e = tdVar;
        }

        public final td d() {
            return this.f92573e;
        }
    }

    public static final class f extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ee f92574e;

        public f(ee eeVar) {
            super(null);
            this.f92574e = eeVar;
        }

        public final ee d() {
            return this.f92574e;
        }
    }

    public static final class g extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final le f92575e;

        public g(le leVar) {
            super(null);
            this.f92575e = leVar;
        }

        public final le d() {
            return this.f92575e;
        }
    }

    public static final class h extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final te f92576e;

        public h(te teVar) {
            super(null);
            this.f92576e = teVar;
        }

        public final te d() {
            return this.f92576e;
        }
    }

    public static final class i extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ff f92577e;

        public i(ff ffVar) {
            super(null);
            this.f92577e = ffVar;
        }

        public final ff d() {
            return this.f92577e;
        }
    }

    public static final class j extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final yf f92578e;

        public j(yf yfVar) {
            super(null);
            this.f92578e = yfVar;
        }

        public final yf d() {
            return this.f92578e;
        }
    }

    public static final class k extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final jk f92579e;

        public k(jk jkVar) {
            super(null);
            this.f92579e = jkVar;
        }

        public final jk d() {
            return this.f92579e;
        }
    }

    public static final class l extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final rn f92580e;

        public l(rn rnVar) {
            super(null);
            this.f92580e = rnVar;
        }

        public final rn d() {
            return this.f92580e;
        }
    }

    public static final class m extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final go f92581e;

        public m(go goVar) {
            super(null);
            this.f92581e = goVar;
        }

        public final go d() {
            return this.f92581e;
        }
    }

    public static final class n extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final tp f92582e;

        public n(tp tpVar) {
            super(null);
            this.f92582e = tpVar;
        }

        public final tp d() {
            return this.f92582e;
        }
    }

    public static final class o extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final lq f92583e;

        public o(lq lqVar) {
            super(null);
            this.f92583e = lqVar;
        }

        public final lq d() {
            return this.f92583e;
        }
    }

    public static final class p extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final tr f92584e;

        public p(tr trVar) {
            super(null);
            this.f92584e = trVar;
        }

        public final tr d() {
            return this.f92584e;
        }
    }

    public static final class q extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final as f92585e;

        public q(as asVar) {
            super(null);
            this.f92585e = asVar;
        }

        public final as d() {
            return this.f92585e;
        }
    }

    public static final class r extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final us f92586e;

        public r(us usVar) {
            super(null);
            this.f92586e = usVar;
        }

        public final us d() {
            return this.f92586e;
        }
    }

    public static final class s extends y0 {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final pw f92587e;

        public s(pw pwVar) {
            super(null);
            this.f92587e = pwVar;
        }

        public final pw d() {
            return this.f92587e;
        }
    }

    public /* synthetic */ y0(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(y0 y0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y0Var == null) {
            return false;
        }
        if (this instanceof h) {
            te teVarD = ((h) this).d();
            f7 f7VarC = y0Var.c();
            return teVarD.A(f7VarC instanceof te ? (te) f7VarC : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            ee eeVarD = ((f) this).d();
            f7 f7VarC2 = y0Var.c();
            return eeVarD.A(f7VarC2 instanceof ee ? (ee) f7VarC2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof r) {
            us usVarD = ((r) this).d();
            f7 f7VarC3 = y0Var.c();
            return usVarD.A(f7VarC3 instanceof us ? (us) f7VarC3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof m) {
            go goVarD = ((m) this).d();
            f7 f7VarC4 = y0Var.c();
            return goVarD.A(f7VarC4 instanceof go ? (go) f7VarC4 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            u8 u8VarD = ((c) this).d();
            f7 f7VarC5 = y0Var.c();
            return u8VarD.A(f7VarC5 instanceof u8 ? (u8) f7VarC5 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            le leVarD = ((g) this).d();
            f7 f7VarC6 = y0Var.c();
            return leVarD.A(f7VarC6 instanceof le ? (le) f7VarC6 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof e) {
            td tdVarD = ((e) this).d();
            f7 f7VarC7 = y0Var.c();
            return tdVarD.A(f7VarC7 instanceof td ? (td) f7VarC7 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof k) {
            jk jkVarD = ((k) this).d();
            f7 f7VarC8 = y0Var.c();
            return jkVarD.A(f7VarC8 instanceof jk ? (jk) f7VarC8 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof q) {
            as asVarD = ((q) this).d();
            f7 f7VarC9 = y0Var.c();
            return asVarD.A(f7VarC9 instanceof as ? (as) f7VarC9 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof o) {
            lq lqVarD = ((o) this).d();
            f7 f7VarC10 = y0Var.c();
            return lqVarD.A(f7VarC10 instanceof lq ? (lq) f7VarC10 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            x9 x9VarD = ((d) this).d();
            f7 f7VarC11 = y0Var.c();
            return x9VarD.A(f7VarC11 instanceof x9 ? (x9) f7VarC11 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof i) {
            ff ffVarD = ((i) this).d();
            f7 f7VarC12 = y0Var.c();
            return ffVarD.A(f7VarC12 instanceof ff ? (ff) f7VarC12 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof n) {
            tp tpVarD = ((n) this).d();
            f7 f7VarC13 = y0Var.c();
            return tpVarD.A(f7VarC13 instanceof tp ? (tp) f7VarC13 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof p) {
            tr trVarD = ((p) this).d();
            f7 f7VarC14 = y0Var.c();
            return trVarD.A(f7VarC14 instanceof tr ? (tr) f7VarC14 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof j) {
            yf yfVarD = ((j) this).d();
            f7 f7VarC15 = y0Var.c();
            return yfVarD.A(f7VarC15 instanceof yf ? (yf) f7VarC15 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof l) {
            rn rnVarD = ((l) this).d();
            f7 f7VarC16 = y0Var.c();
            return rnVarD.A(f7VarC16 instanceof rn ? (rn) f7VarC16 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof s)) {
            throw new lf.m();
        }
        pw pwVarD = ((s) this).d();
        f7 f7VarC17 = y0Var.c();
        return pwVarD.A(f7VarC17 instanceof pw ? (pw) f7VarC17 : null, expressionResolver, expressionResolver2);
    }

    public int b() {
        int iB;
        Integer num = this.f92568a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof h) {
            iB = ((h) this).d().B();
        } else if (this instanceof f) {
            iB = ((f) this).d().B();
        } else if (this instanceof r) {
            iB = ((r) this).d().B();
        } else if (this instanceof m) {
            iB = ((m) this).d().B();
        } else if (this instanceof c) {
            iB = ((c) this).d().B();
        } else if (this instanceof g) {
            iB = ((g) this).d().B();
        } else if (this instanceof e) {
            iB = ((e) this).d().B();
        } else if (this instanceof k) {
            iB = ((k) this).d().B();
        } else if (this instanceof q) {
            iB = ((q) this).d().B();
        } else if (this instanceof o) {
            iB = ((o) this).d().B();
        } else if (this instanceof d) {
            iB = ((d) this).d().B();
        } else if (this instanceof i) {
            iB = ((i) this).d().B();
        } else if (this instanceof n) {
            iB = ((n) this).d().B();
        } else if (this instanceof p) {
            iB = ((p) this).d().B();
        } else if (this instanceof j) {
            iB = ((j) this).d().B();
        } else if (this instanceof l) {
            iB = ((l) this).d().B();
        } else {
            if (!(this instanceof s)) {
                throw new lf.m();
            }
            iB = ((s) this).d().B();
        }
        int i10 = iHashCode + iB;
        this.f92568a = Integer.valueOf(i10);
        return i10;
    }

    public final f7 c() {
        if (this instanceof h) {
            return ((h) this).d();
        }
        if (this instanceof f) {
            return ((f) this).d();
        }
        if (this instanceof r) {
            return ((r) this).d();
        }
        if (this instanceof m) {
            return ((m) this).d();
        }
        if (this instanceof c) {
            return ((c) this).d();
        }
        if (this instanceof g) {
            return ((g) this).d();
        }
        if (this instanceof e) {
            return ((e) this).d();
        }
        if (this instanceof k) {
            return ((k) this).d();
        }
        if (this instanceof q) {
            return ((q) this).d();
        }
        if (this instanceof o) {
            return ((o) this).d();
        }
        if (this instanceof d) {
            return ((d) this).d();
        }
        if (this instanceof i) {
            return ((i) this).d();
        }
        if (this instanceof n) {
            return ((n) this).d();
        }
        if (this instanceof p) {
            return ((p) this).d();
        }
        if (this instanceof j) {
            return ((j) this).d();
        }
        if (this instanceof l) {
            return ((l) this).d();
        }
        if (this instanceof s) {
            return ((s) this).d();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92569b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof h) {
            iHash = ((h) this).d().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).d().hash();
        } else if (this instanceof r) {
            iHash = ((r) this).d().hash();
        } else if (this instanceof m) {
            iHash = ((m) this).d().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).d().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).d().hash();
        } else if (this instanceof e) {
            iHash = ((e) this).d().hash();
        } else if (this instanceof k) {
            iHash = ((k) this).d().hash();
        } else if (this instanceof q) {
            iHash = ((q) this).d().hash();
        } else if (this instanceof o) {
            iHash = ((o) this).d().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).d().hash();
        } else if (this instanceof i) {
            iHash = ((i) this).d().hash();
        } else if (this instanceof n) {
            iHash = ((n) this).d().hash();
        } else if (this instanceof p) {
            iHash = ((p) this).d().hash();
        } else if (this instanceof j) {
            iHash = ((j) this).d().hash();
        } else if (this instanceof l) {
            iHash = ((l) this).d().hash();
        } else {
            if (!(this instanceof s)) {
                throw new lf.m();
            }
            iHash = ((s) this).d().hash();
        }
        int i10 = iHashCode + iHash;
        this.f92569b = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((wh) BuiltInParserKt.getBuiltInParserComponent().M4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private y0() {
    }
}
