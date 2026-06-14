package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.t5;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class r5 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f90629e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90630f = a.f90635f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90631a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final fw f90632b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f90633c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f90634d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90635f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r5 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return r5.f90629e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r5 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((t5.b) BuiltInParserKt.getBuiltInParserComponent().k1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public r5(Expression expression, fw fwVar, Expression expression2) {
        this.f90631a = expression;
        this.f90632b = fwVar;
        this.f90633c = expression2;
    }

    public final boolean a(r5 r5Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return r5Var != null && Intrinsics.areEqual(this.f90631a.evaluate(expressionResolver), r5Var.f90631a.evaluate(expressionResolver2)) && this.f90632b.a(r5Var.f90632b, expressionResolver, expressionResolver2) && Intrinsics.areEqual(this.f90633c.evaluate(expressionResolver), r5Var.f90633c.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90634d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(r5.class).hashCode() + this.f90631a.hashCode() + this.f90632b.hash() + this.f90633c.hashCode();
        this.f90634d = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((t5.b) BuiltInParserKt.getBuiltInParserComponent().k1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
