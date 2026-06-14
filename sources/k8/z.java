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
public final class z implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92832d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92833e = a.f92837f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92836c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92837f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final z invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return z.f92832d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final z a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((a0) BuiltInParserKt.getBuiltInParserComponent().p().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public z(String str, Expression expression) {
        this.f92834a = str;
        this.f92835b = expression;
    }

    public final boolean a(z zVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return zVar != null && Intrinsics.areEqual(this.f92834a, zVar.f92834a) && ((Number) this.f92835b.evaluate(expressionResolver)).intValue() == ((Number) zVar.f92835b.evaluate(expressionResolver2)).intValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92836c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(z.class).hashCode() + this.f92834a.hashCode() + this.f92835b.hashCode();
        this.f92836c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((a0) BuiltInParserKt.getBuiltInParserComponent().p().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
