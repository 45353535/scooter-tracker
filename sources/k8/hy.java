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
public final class hy implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f88156d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f88157e = a.f88161f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88158a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88159b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f88160c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88161f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hy invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return hy.f88156d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hy a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((iy) BuiltInParserKt.getBuiltInParserComponent().L9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public hy(String str, Expression expression) {
        this.f88158a = str;
        this.f88159b = expression;
    }

    public final boolean a(hy hyVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return hyVar != null && Intrinsics.areEqual(this.f88158a, hyVar.f88158a) && ((Number) this.f88159b.evaluate(expressionResolver)).longValue() == ((Number) hyVar.f88159b.evaluate(expressionResolver2)).longValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88160c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(hy.class).hashCode() + this.f88158a.hashCode() + this.f88159b.hashCode();
        this.f88160c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((iy) BuiltInParserKt.getBuiltInParserComponent().L9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
