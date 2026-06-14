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
public final class ig implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88242c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88243d = a.f88246f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88245b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88246f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ig invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ig.f88242c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ig a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((jg) BuiltInParserKt.getBuiltInParserComponent().p4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ig(Expression expression) {
        this.f88244a = expression;
    }

    public final boolean a(ig igVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (igVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f88244a.evaluate(expressionResolver), igVar.f88244a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88245b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ig.class).hashCode() + this.f88244a.hashCode();
        this.f88245b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((jg) BuiltInParserKt.getBuiltInParserComponent().p4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
