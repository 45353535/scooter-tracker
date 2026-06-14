package k8;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.lx;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class hx implements JSONSerializable, Hashable, dp {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f88137m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f88138n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f88139o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final Expression f88140p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Expression f88141q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Function2 f88142r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final xa f88143a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f88144b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f88145c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Expression f88146d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final JSONObject f88147e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f88148f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final String f88149g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final m5 f88150h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Expression f88151i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f88152j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f88153k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f88154l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88155f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hx invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return hx.f88137m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hx a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((lx.b) BuiltInParserKt.getBuiltInParserComponent().w9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f88138n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f88139o = Expression.Companion.constant$default(companion, 1L, null, 2, null);
        f88140p = Expression.Companion.constant$default(companion, 800L, null, 2, null);
        f88141q = Expression.Companion.constant$default(companion, 50L, null, 2, null);
        f88142r = a.f88155f;
    }

    public hx(xa xaVar, Expression expression, Expression expression2, Expression expression3, JSONObject jSONObject, Expression expression4, String str, m5 m5Var, Expression expression5, Expression expression6, Expression expression7) {
        this.f88143a = xaVar;
        this.f88144b = expression;
        this.f88145c = expression2;
        this.f88146d = expression3;
        this.f88147e = jSONObject;
        this.f88148f = expression4;
        this.f88149g = str;
        this.f88150h = m5Var;
        this.f88151i = expression5;
        this.f88152j = expression6;
        this.f88153k = expression7;
    }

    @Override // k8.dp
    public xa a() {
        return this.f88143a;
    }

    @Override // k8.dp
    public Expression b() {
        return this.f88145c;
    }

    @Override // k8.dp
    public Expression c() {
        return this.f88146d;
    }

    @Override // k8.dp
    public m5 d() {
        return this.f88150h;
    }

    @Override // k8.dp
    public String e() {
        return this.f88149g;
    }

    @Override // k8.dp
    public Expression f() {
        return this.f88148f;
    }

    public final boolean g(hx hxVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (hxVar == null) {
            return false;
        }
        xa xaVarA = a();
        if ((xaVarA != null ? xaVarA.a(hxVar.a(), expressionResolver, expressionResolver2) : hxVar.a() == null) && ((Boolean) isEnabled().evaluate(expressionResolver)).booleanValue() == ((Boolean) hxVar.isEnabled().evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(b().evaluate(expressionResolver), hxVar.b().evaluate(expressionResolver2)) && ((Number) c().evaluate(expressionResolver)).longValue() == ((Number) hxVar.c().evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(getPayload(), hxVar.getPayload())) {
            Expression expressionF = f();
            Uri uri = expressionF != null ? (Uri) expressionF.evaluate(expressionResolver) : null;
            Expression expressionF2 = hxVar.f();
            if (Intrinsics.areEqual(uri, expressionF2 != null ? (Uri) expressionF2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(e(), hxVar.e())) {
                m5 m5VarD = d();
                if (m5VarD != null ? m5VarD.a(hxVar.d(), expressionResolver, expressionResolver2) : hxVar.d() == null) {
                    Expression url = getUrl();
                    Uri uri2 = url != null ? (Uri) url.evaluate(expressionResolver) : null;
                    Expression url2 = hxVar.getUrl();
                    if (Intrinsics.areEqual(uri2, url2 != null ? (Uri) url2.evaluate(expressionResolver2) : null) && ((Number) this.f88152j.evaluate(expressionResolver)).longValue() == ((Number) hxVar.f88152j.evaluate(expressionResolver2)).longValue() && ((Number) this.f88153k.evaluate(expressionResolver)).longValue() == ((Number) hxVar.f88153k.evaluate(expressionResolver2)).longValue()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // k8.dp
    public JSONObject getPayload() {
        return this.f88147e;
    }

    @Override // k8.dp
    public Expression getUrl() {
        return this.f88151i;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88154l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(hx.class).hashCode();
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
        int iHashCode5 = iHash2 + (url != null ? url.hashCode() : 0) + this.f88152j.hashCode() + this.f88153k.hashCode();
        this.f88154l = Integer.valueOf(iHashCode5);
        return iHashCode5;
    }

    @Override // k8.dp
    public Expression isEnabled() {
        return this.f88144b;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((lx.b) BuiltInParserKt.getBuiltInParserComponent().w9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
