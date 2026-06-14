package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.n1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class k1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f88545j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f88546k = a.f88556f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final fw f88550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f88551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final n9 f88552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f88553g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final fw f88554h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f88555i;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88556f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final k1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return k1.f88545j.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final k1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((n1.d) BuiltInParserKt.getBuiltInParserComponent().K().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public k1(String str, Expression expression, Expression expression2, fw fwVar, Expression expression3, n9 n9Var, Expression expression4, fw fwVar2) {
        this.f88547a = str;
        this.f88548b = expression;
        this.f88549c = expression2;
        this.f88550d = fwVar;
        this.f88551e = expression3;
        this.f88552f = n9Var;
        this.f88553g = expression4;
        this.f88554h = fwVar2;
    }

    public final boolean a(k1 k1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (k1Var != null && Intrinsics.areEqual(this.f88547a, k1Var.f88547a)) {
            Expression expression = this.f88548b;
            b6 b6Var = expression != null ? (b6) expression.evaluate(expressionResolver) : null;
            Expression expression2 = k1Var.f88548b;
            if (b6Var == (expression2 != null ? (b6) expression2.evaluate(expressionResolver2) : null)) {
                Expression expression3 = this.f88549c;
                Long l10 = expression3 != null ? (Long) expression3.evaluate(expressionResolver) : null;
                Expression expression4 = k1Var.f88549c;
                if (Intrinsics.areEqual(l10, expression4 != null ? (Long) expression4.evaluate(expressionResolver2) : null)) {
                    fw fwVar = this.f88550d;
                    if (fwVar != null ? fwVar.a(k1Var.f88550d, expressionResolver, expressionResolver2) : k1Var.f88550d == null) {
                        Expression expression5 = this.f88551e;
                        c6 c6Var = expression5 != null ? (c6) expression5.evaluate(expressionResolver) : null;
                        Expression expression6 = k1Var.f88551e;
                        if (c6Var == (expression6 != null ? (c6) expression6.evaluate(expressionResolver2) : null)) {
                            n9 n9Var = this.f88552f;
                            if (n9Var != null ? n9Var.a(k1Var.f88552f, expressionResolver, expressionResolver2) : k1Var.f88552f == null) {
                                Expression expression7 = this.f88553g;
                                Long l11 = expression7 != null ? (Long) expression7.evaluate(expressionResolver) : null;
                                Expression expression8 = k1Var.f88553g;
                                if (Intrinsics.areEqual(l11, expression8 != null ? (Long) expression8.evaluate(expressionResolver2) : null)) {
                                    fw fwVar2 = this.f88554h;
                                    fw fwVar3 = k1Var.f88554h;
                                    if (fwVar2 != null ? fwVar2.a(fwVar3, expressionResolver, expressionResolver2) : fwVar3 == null) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88555i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(k1.class).hashCode() + this.f88547a.hashCode();
        Expression expression = this.f88548b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        Expression expression2 = this.f88549c;
        int iHashCode3 = iHashCode2 + (expression2 != null ? expression2.hashCode() : 0);
        fw fwVar = this.f88550d;
        int iHash = iHashCode3 + (fwVar != null ? fwVar.hash() : 0);
        Expression expression3 = this.f88551e;
        int iHashCode4 = iHash + (expression3 != null ? expression3.hashCode() : 0);
        n9 n9Var = this.f88552f;
        int iHash2 = iHashCode4 + (n9Var != null ? n9Var.hash() : 0);
        Expression expression4 = this.f88553g;
        int iHashCode5 = iHash2 + (expression4 != null ? expression4.hashCode() : 0);
        fw fwVar2 = this.f88554h;
        int iHash3 = iHashCode5 + (fwVar2 != null ? fwVar2.hash() : 0);
        this.f88555i = Integer.valueOf(iHash3);
        return iHash3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((n1.d) BuiltInParserKt.getBuiltInParserComponent().K().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
