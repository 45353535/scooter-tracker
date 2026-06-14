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
public final class o0 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90123c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90124d = a.f90127f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90125a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90126b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90127f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o0 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return o0.f90123c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o0 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((p0) BuiltInParserKt.getBuiltInParserComponent().y().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public o0(Expression expression) {
        this.f90125a = expression;
    }

    public final boolean a(o0 o0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (o0Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f90125a.evaluate(expressionResolver), o0Var.f90125a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90126b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(o0.class).hashCode() + this.f90125a.hashCode();
        this.f90126b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((p0) BuiltInParserKt.getBuiltInParserComponent().y().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
