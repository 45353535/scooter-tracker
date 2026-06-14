package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.pa;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class oa implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90176d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f90177e = Expression.Companion.constant$default(Expression.INSTANCE, jp.DP, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90178f = a.f90182f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90181c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90182f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final oa invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return oa.f90176d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oa a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((pa.c) BuiltInParserKt.getBuiltInParserComponent().M2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public oa(Expression expression, Expression expression2) {
        this.f90179a = expression;
        this.f90180b = expression2;
    }

    public final boolean a(oa oaVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return oaVar != null && this.f90179a.evaluate(expressionResolver) == oaVar.f90179a.evaluate(expressionResolver2) && ((Number) this.f90180b.evaluate(expressionResolver)).doubleValue() == ((Number) oaVar.f90180b.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90181c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(oa.class).hashCode() + this.f90179a.hashCode() + this.f90180b.hashCode();
        this.f90181c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((pa.c) BuiltInParserKt.getBuiltInParserComponent().M2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
