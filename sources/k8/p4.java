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
public final class p4 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90305d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90306e = a.f90310f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final fw f90307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90309c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90310f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p4 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p4.f90305d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p4 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((q4) BuiltInParserKt.getBuiltInParserComponent().P0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public p4(fw fwVar, Expression expression) {
        this.f90307a = fwVar;
        this.f90308b = expression;
    }

    public final boolean a(p4 p4Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return p4Var != null && this.f90307a.a(p4Var.f90307a, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f90308b.evaluate(expressionResolver), p4Var.f90308b.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90309c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(p4.class).hashCode() + this.f90307a.hash() + this.f90308b.hashCode();
        this.f90309c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((q4) BuiltInParserKt.getBuiltInParserComponent().P0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
