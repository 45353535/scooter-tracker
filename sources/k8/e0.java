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
public final class e0 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f87138c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f87139d = a.f87142f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87140a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f87141b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87142f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final e0 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return e0.f87138c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final e0 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((f0) BuiltInParserKt.getBuiltInParserComponent().s().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public e0(Expression expression) {
        this.f87140a = expression;
    }

    public final boolean a(e0 e0Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (e0Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f87140a.evaluate(expressionResolver), e0Var.f87140a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87141b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(e0.class).hashCode() + this.f87140a.hashCode();
        this.f87141b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((f0) BuiltInParserKt.getBuiltInParserComponent().s().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
