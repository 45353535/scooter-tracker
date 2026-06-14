package k8;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.va;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ra implements JSONSerializable, Hashable, dp {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f90649m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f90650n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f90651o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f90652p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Expression f90653q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Function2 f90654r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final xa f90656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f90657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f90658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f90659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final JSONObject f90660f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f90661g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f90662h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final m5 f90663i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Expression f90664j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f90665k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f90666l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90667f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ra invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ra.f90649m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ra a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((va.b) BuiltInParserKt.getBuiltInParserComponent().P2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90650n = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f90651o = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f90652p = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f90653q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90654r = a.f90667f;
    }

    public ra(Expression expression, xa xaVar, Expression expression2, Expression expression3, Expression expression4, JSONObject jSONObject, Expression expression5, String str, m5 m5Var, Expression expression6, Expression expression7) {
        this.f90655a = expression;
        this.f90656b = xaVar;
        this.f90657c = expression2;
        this.f90658d = expression3;
        this.f90659e = expression4;
        this.f90660f = jSONObject;
        this.f90661g = expression5;
        this.f90662h = str;
        this.f90663i = m5Var;
        this.f90664j = expression6;
        this.f90665k = expression7;
    }

    @Override // k8.dp
    public xa a() {
        return this.f90656b;
    }

    @Override // k8.dp
    public Expression b() {
        return this.f90658d;
    }

    @Override // k8.dp
    public Expression c() {
        return this.f90659e;
    }

    @Override // k8.dp
    public m5 d() {
        return this.f90663i;
    }

    @Override // k8.dp
    public String e() {
        return this.f90662h;
    }

    @Override // k8.dp
    public Expression f() {
        return this.f90661g;
    }

    public final boolean g(ra raVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (raVar != null && ((Number) this.f90655a.evaluate(expressionResolver)).longValue() == ((Number) raVar.f90655a.evaluate(expressionResolver2)).longValue()) {
            xa xaVarA = a();
            if ((xaVarA != null ? xaVarA.a(raVar.a(), expressionResolver, expressionResolver2) : raVar.a() == null) && ((Boolean) isEnabled().evaluate(expressionResolver)).booleanValue() == ((Boolean) raVar.isEnabled().evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(b().evaluate(expressionResolver), raVar.b().evaluate(expressionResolver2)) && ((Number) c().evaluate(expressionResolver)).longValue() == ((Number) raVar.c().evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(getPayload(), raVar.getPayload())) {
                Expression expressionF = f();
                Uri uri = expressionF != null ? (Uri) expressionF.evaluate(expressionResolver) : null;
                Expression expressionF2 = raVar.f();
                if (Intrinsics.areEqual(uri, expressionF2 != null ? (Uri) expressionF2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(e(), raVar.e())) {
                    m5 m5VarD = d();
                    if (m5VarD != null ? m5VarD.a(raVar.d(), expressionResolver, expressionResolver2) : raVar.d() == null) {
                        Expression url = getUrl();
                        Uri uri2 = url != null ? (Uri) url.evaluate(expressionResolver) : null;
                        Expression url2 = raVar.getUrl();
                        if (Intrinsics.areEqual(uri2, url2 != null ? (Uri) url2.evaluate(expressionResolver2) : null) && ((Number) this.f90665k.evaluate(expressionResolver)).longValue() == ((Number) raVar.f90665k.evaluate(expressionResolver2)).longValue()) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // k8.dp
    public JSONObject getPayload() {
        return this.f90660f;
    }

    @Override // k8.dp
    public Expression getUrl() {
        return this.f90664j;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90666l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ra.class).hashCode() + this.f90655a.hashCode();
        xa xaVarA = a();
        int iHash = iHashCode + (xaVarA != null ? xaVarA.hash() : 0) + isEnabled().hashCode() + b().hashCode() + c().hashCode();
        JSONObject payload = getPayload();
        int iHashCode2 = iHash + (payload != null ? payload.hashCode() : 0);
        Expression expressionF = f();
        int iHashCode3 = iHashCode2 + (expressionF != null ? expressionF.hashCode() : 0);
        String strE = e();
        int iHashCode4 = iHashCode3 + (strE != null ? strE.hashCode() : 0);
        m5 m5VarD = d();
        int iHash2 = iHashCode4 + (m5VarD != null ? m5VarD.hash() : 0);
        Expression url = getUrl();
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f90665k.hashCode();
        this.f90666l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // k8.dp
    public Expression isEnabled() {
        return this.f90657c;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((va.b) BuiltInParserKt.getBuiltInParserComponent().P2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
