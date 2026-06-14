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
public final class s9 implements JSONSerializable, Hashable, zg {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90975d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90976e = a.f90980f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f90978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90979c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90980f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final s9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return s9.f90975d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final s9 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((t9) BuiltInParserKt.getBuiltInParserComponent().y2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public s9(Expression expression, String str) {
        this.f90977a = expression;
        this.f90978b = str;
    }

    @Override // k8.zg
    public String a() {
        return this.f90978b;
    }

    public final boolean b(s9 s9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (s9Var == null) {
            return false;
        }
        Expression expression = this.f90977a;
        String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
        Expression expression2 = s9Var.f90977a;
        return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(a(), s9Var.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90979c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(s9.class).hashCode();
        Expression expression = this.f90977a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + a().hashCode();
        this.f90979c = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((t9) BuiltInParserKt.getBuiltInParserComponent().y2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
