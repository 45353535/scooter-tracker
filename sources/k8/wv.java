package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ml;
import k8.xv;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wv implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f92243e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final ml.d f92244f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final ml.d f92245g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f92246h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ml f92247a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ml f92248b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f92249c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f92250d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92251f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return wv.f92243e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wv a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((xv.b) BuiltInParserKt.getBuiltInParserComponent().b9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Double dValueOf = Double.valueOf(50.0d);
        f92244f = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f92245g = new ml.d(new tl(Expression.Companion.constant$default(companion, dValueOf, null, 2, null)));
        f92246h = a.f92251f;
    }

    public wv(ml mlVar, ml mlVar2, Expression expression) {
        this.f92247a = mlVar;
        this.f92248b = mlVar2;
        this.f92249c = expression;
    }

    public final boolean a(wv wvVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (wvVar != null && this.f92247a.a(wvVar.f92247a, expressionResolver, expressionResolver2) && this.f92248b.a(wvVar.f92248b, expressionResolver, expressionResolver2)) {
            Expression expression = this.f92249c;
            Double d10 = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
            Expression expression2 = wvVar.f92249c;
            if (Intrinsics.areEqual(d10, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92250d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(wv.class).hashCode() + this.f92247a.hash() + this.f92248b.hash();
        Expression expression = this.f92249c;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f92250d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((xv.b) BuiltInParserKt.getBuiltInParserComponent().b9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
