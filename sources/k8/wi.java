package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wi implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92186d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92187e = a.f92191f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92188a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z0 f92189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92190c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92191f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wi invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return wi.f92186d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wi a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((xi) BuiltInParserKt.getBuiltInParserComponent().e5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public wi(Expression expression, z0 z0Var) {
        this.f92188a = expression;
        this.f92189b = z0Var;
    }

    public final boolean a(wi wiVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return wiVar != null && Intrinsics.areEqual(this.f92188a.evaluate(expressionResolver), wiVar.f92188a.evaluate(expressionResolver2)) && this.f92189b.a(wiVar.f92189b, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92190c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(wi.class).hashCode() + this.f92188a.hashCode() + this.f92189b.hash();
        this.f92190c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((xi) BuiltInParserKt.getBuiltInParserComponent().e5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
