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
public final class p implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90286d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90287e = a.f90291f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90288a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90289b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90290c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90291f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p.f90286d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((q) BuiltInParserKt.getBuiltInParserComponent().j().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public p(String str, Expression expression) {
        this.f90288a = str;
        this.f90289b = expression;
    }

    public final boolean a(p pVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return pVar != null && Intrinsics.areEqual(this.f90288a, pVar.f90288a) && ((Boolean) this.f90289b.evaluate(expressionResolver)).booleanValue() == ((Boolean) pVar.f90289b.evaluate(expressionResolver2)).booleanValue();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90290c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(p.class).hashCode() + this.f90288a.hashCode() + this.f90289b.hashCode();
        this.f90290c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((q) BuiltInParserKt.getBuiltInParserComponent().j().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
