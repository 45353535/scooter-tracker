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
public final class nx implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f90106e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f90107f = a.f90112f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90108a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kp f90109b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final kp f90110c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f90111d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90112f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final nx invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return nx.f90106e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final nx a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ox) BuiltInParserKt.getBuiltInParserComponent().z9().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public nx(Expression expression, kp kpVar, kp kpVar2) {
        this.f90108a = expression;
        this.f90109b = kpVar;
        this.f90110c = kpVar2;
    }

    public final boolean a(nx nxVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (nxVar == null) {
            return false;
        }
        Expression expression = this.f90108a;
        Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
        Expression expression2 = nxVar.f90108a;
        if (Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null)) {
            kp kpVar = this.f90109b;
            if (kpVar != null ? kpVar.a(nxVar.f90109b, expressionResolver, expressionResolver2) : nxVar.f90109b == null) {
                kp kpVar2 = this.f90110c;
                kp kpVar3 = nxVar.f90110c;
                if (kpVar2 != null ? kpVar2.a(kpVar3, expressionResolver, expressionResolver2) : kpVar3 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90111d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(nx.class).hashCode();
        Expression expression = this.f90108a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        kp kpVar = this.f90109b;
        int iHash = iHashCode2 + (kpVar != null ? kpVar.hash() : 0);
        kp kpVar2 = this.f90110c;
        int iHash2 = iHash + (kpVar2 != null ? kpVar2.hash() : 0);
        this.f90111d = Integer.valueOf(iHash2);
        return iHash2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ox) BuiltInParserKt.getBuiltInParserComponent().z9().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ nx(Expression expression, kp kpVar, kp kpVar2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? null : kpVar, (i10 & 4) != 0 ? null : kpVar2);
    }
}
