package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.pi;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ni implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f90040e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90041f = a.f90046f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kp f90042a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp f90043b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f90044c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f90045d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90046f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ni invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ni.f90040e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ni a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((pi.b) BuiltInParserKt.getBuiltInParserComponent().Y4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ni(kp kpVar, kp kpVar2, Expression expression) {
        this.f90042a = kpVar;
        this.f90043b = kpVar2;
        this.f90044c = expression;
    }

    public final boolean a(ni niVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (niVar == null) {
            return false;
        }
        kp kpVar = this.f90042a;
        if (kpVar != null ? kpVar.a(niVar.f90042a, expressionResolver, expressionResolver2) : niVar.f90042a == null) {
            kp kpVar2 = this.f90043b;
            if (kpVar2 != null ? kpVar2.a(niVar.f90043b, expressionResolver, expressionResolver2) : niVar.f90043b == null) {
                Expression expression = this.f90044c;
                Double d10 = expression != null ? (Double) expression.evaluate(expressionResolver) : null;
                Expression expression2 = niVar.f90044c;
                if (Intrinsics.areEqual(d10, expression2 != null ? (Double) expression2.evaluate(expressionResolver2) : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90045d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ni.class).hashCode();
        kp kpVar = this.f90042a;
        int iHash = iHashCode + (kpVar != null ? kpVar.hash() : 0);
        kp kpVar2 = this.f90043b;
        int iHash2 = iHash + (kpVar2 != null ? kpVar2.hash() : 0);
        Expression expression = this.f90044c;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        this.f90045d = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((pi.b) BuiltInParserKt.getBuiltInParserComponent().Y4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ni(kp kpVar, kp kpVar2, Expression expression, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : kpVar, (i10 & 2) != 0 ? null : kpVar2, (i10 & 4) != 0 ? null : expression);
    }
}
