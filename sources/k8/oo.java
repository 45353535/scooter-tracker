package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ro;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class oo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f90228f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f90229g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Expression f90230h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Expression f90231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final Function2 f90232j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90233a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90234b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f90235c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final zl f90236d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f90237e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90238f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final oo invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return oo.f90228f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final oo a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ro.b) BuiltInParserKt.getBuiltInParserComponent().P6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90229g = Expression.Companion.constant$default(companion, Double.valueOf(0.19d), null, 2, null);
        f90230h = Expression.Companion.constant$default(companion, 2L, null, 2, null);
        f90231i = Expression.Companion.constant$default(companion, 0, null, 2, null);
        f90232j = a.f90238f;
    }

    public oo(Expression expression, Expression expression2, Expression expression3, zl zlVar) {
        this.f90233a = expression;
        this.f90234b = expression2;
        this.f90235c = expression3;
        this.f90236d = zlVar;
    }

    public final boolean a(oo ooVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return ooVar != null && ((Number) this.f90233a.evaluate(expressionResolver)).doubleValue() == ((Number) ooVar.f90233a.evaluate(expressionResolver2)).doubleValue() && ((Number) this.f90234b.evaluate(expressionResolver)).longValue() == ((Number) ooVar.f90234b.evaluate(expressionResolver2)).longValue() && ((Number) this.f90235c.evaluate(expressionResolver)).intValue() == ((Number) ooVar.f90235c.evaluate(expressionResolver2)).intValue() && this.f90236d.a(ooVar.f90236d, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90237e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(oo.class).hashCode() + this.f90233a.hashCode() + this.f90234b.hashCode() + this.f90235c.hashCode() + this.f90236d.hash();
        this.f90237e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ro.b) BuiltInParserKt.getBuiltInParserComponent().P6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
