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
public final class j0 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88297c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88298d = a.f88301f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88300b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88301f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j0 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return j0.f88297c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j0 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((k0) BuiltInParserKt.getBuiltInParserComponent().v().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public j0(Expression expression) {
        this.f88299a = expression;
    }

    public final boolean a(j0 j0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (j0Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f88299a.evaluate(expressionResolver), j0Var.f88299a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88300b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(j0.class).hashCode() + this.f88299a.hashCode();
        this.f88300b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((k0) BuiltInParserKt.getBuiltInParserComponent().v().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
