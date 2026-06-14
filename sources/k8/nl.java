package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ol;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class nl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90048d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f90049e = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90050f = a.f90054f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90051a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90052b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90053c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90054f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return nl.f90048d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ol.c) BuiltInParserKt.getBuiltInParserComponent().Q5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public nl(Expression expression, Expression expression2) {
        this.f90051a = expression;
        this.f90052b = expression2;
    }

    public final boolean a(nl nlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (nlVar != null && this.f90051a.evaluate(expressionResolver) == nlVar.f90051a.evaluate(expressionResolver2)) {
            Expression expression = this.f90052b;
            Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
            Expression expression2 = nlVar.f90052b;
            if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90053c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(nl.class).hashCode() + this.f90051a.hashCode();
        Expression expression = this.f90052b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        this.f90053c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ol.c) BuiltInParserKt.getBuiltInParserComponent().Q5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
