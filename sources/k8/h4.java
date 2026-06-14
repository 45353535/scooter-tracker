package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.i4;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class h4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f87955d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Expression f87956e = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f87957f = a.f87961f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f87959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f87960c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87961f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return h4.f87955d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((i4.b) BuiltInParserKt.getBuiltInParserComponent().J0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public h4(Expression expression, Expression expression2) {
        this.f87958a = expression;
        this.f87959b = expression2;
    }

    public final boolean a(h4 h4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return h4Var != null && Intrinsics.areEqual(this.f87958a.evaluate(expressionResolver), h4Var.f87958a.evaluate(expressionResolver2)) && ((Boolean) this.f87959b.evaluate(expressionResolver)).booleanValue() == ((Boolean) h4Var.f87959b.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87960c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(h4.class).hashCode() + this.f87958a.hashCode() + this.f87959b.hashCode();
        this.f87960c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((i4.b) BuiltInParserKt.getBuiltInParserComponent().J0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
