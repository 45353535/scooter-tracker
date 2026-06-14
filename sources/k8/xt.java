package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.zt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class xt implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92413d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92414e = a.f92418f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f92415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ar f92416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92417c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92418f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final xt invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return xt.f92413d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final xt a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zt.b) BuiltInParserKt.getBuiltInParserComponent().v8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public xt(Expression expression, ar arVar) {
        this.f92415a = expression;
        this.f92416b = arVar;
    }

    public final boolean a(xt xtVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (xtVar == null) {
            return false;
        }
        Expression expression = this.f92415a;
        Long l10 = expression != null ? (Long) expression.evaluate(expressionResolver) : null;
        Expression expression2 = xtVar.f92415a;
        if (Intrinsics.areEqual(l10, expression2 != null ? (Long) expression2.evaluate(expressionResolver2) : null)) {
            ar arVar = this.f92416b;
            ar arVar2 = xtVar.f92416b;
            if (arVar != null ? arVar.a(arVar2, expressionResolver, expressionResolver2) : arVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92417c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(xt.class).hashCode();
        Expression expression = this.f92415a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        ar arVar = this.f92416b;
        int iHash = iHashCode2 + (arVar != null ? arVar.hash() : 0);
        this.f92417c = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zt.b) BuiltInParserKt.getBuiltInParserComponent().v8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
