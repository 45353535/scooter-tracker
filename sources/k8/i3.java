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
public final class i3 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88187c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88188d = a.f88191f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88189a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88190b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88191f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return i3.f88187c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final i3 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((j3) BuiltInParserKt.getBuiltInParserComponent().o0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public i3(Expression expression) {
        this.f88189a = expression;
    }

    public final boolean a(i3 i3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (i3Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f88189a.evaluate(expressionResolver), i3Var.f88189a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88190b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(i3.class).hashCode() + this.f88189a.hashCode();
        this.f88190b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((j3) BuiltInParserKt.getBuiltInParserComponent().o0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
