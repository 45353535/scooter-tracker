package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ny implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90113c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90114d = a.f90117f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90115a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90116b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90117f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ny invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ny.f90113c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ny a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((oy) BuiltInParserKt.getBuiltInParserComponent().O9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ny(Expression expression) {
        this.f90115a = expression;
    }

    public final boolean a(ny nyVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return nyVar != null && ((Number) this.f90115a.evaluate(expressionResolver)).doubleValue() == ((Number) nyVar.f90115a.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90116b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ny.class).hashCode() + this.f90115a.hashCode();
        this.f90116b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((oy) BuiltInParserKt.getBuiltInParserComponent().O9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
