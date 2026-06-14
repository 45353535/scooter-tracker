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
public final class sy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f91206d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f91207e = a.f91211f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f91208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f91210c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91211f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sy invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return sy.f91206d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sy a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ty) BuiltInParserKt.getBuiltInParserComponent().R9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public sy(String str, Expression expression) {
        this.f91208a = str;
        this.f91209b = expression;
    }

    public final boolean a(sy syVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return syVar != null && Intrinsics.areEqual(this.f91208a, syVar.f91208a) && ((Number) this.f91209b.evaluate(expressionResolver)).doubleValue() == ((Number) syVar.f91209b.evaluate(expressionResolver2)).doubleValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91210c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(sy.class).hashCode() + this.f91208a.hashCode() + this.f91209b.hashCode();
        this.f91210c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ty) BuiltInParserKt.getBuiltInParserComponent().R9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
