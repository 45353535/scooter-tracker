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
public final class n3 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f89994c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f89995d = a.f89998f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f89996a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f89997b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f89998f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n3 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return n3.f89994c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n3 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((o3) BuiltInParserKt.getBuiltInParserComponent().r0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public n3(Expression expression) {
        this.f89996a = expression;
    }

    public final boolean a(n3 n3Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (n3Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f89996a.evaluate(expressionResolver), n3Var.f89996a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f89997b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(n3.class).hashCode() + this.f89996a.hashCode();
        this.f89997b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((o3) BuiltInParserKt.getBuiltInParserComponent().r0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
