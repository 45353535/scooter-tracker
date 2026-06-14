package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.hn;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class gn implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final b f87835g = new b(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final xc f87836h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final xc f87837i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final xc f87838j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Function2 f87839k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f87840a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xc f87841b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xc f87842c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xc f87843d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ar f87844e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Integer f87845f;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87846f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gn invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return gn.f87835g.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gn a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((hn.b) BuiltInParserKt.getBuiltInParserComponent().x6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87836h = new xc(null, Expression.Companion.constant$default(companion, 5L, null, 2, null), 1, null);
        f87837i = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f87838j = new xc(null, Expression.Companion.constant$default(companion, 10L, null, 2, null), 1, null);
        f87839k = a.f87846f;
    }

    public gn(Expression expression, xc xcVar, xc xcVar2, xc xcVar3, ar arVar) {
        this.f87840a = expression;
        this.f87841b = xcVar;
        this.f87842c = xcVar2;
        this.f87843d = xcVar3;
        this.f87844e = arVar;
    }

    public final boolean a(gn gnVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (gnVar == null) {
            return false;
        }
        Expression expression = this.f87840a;
        Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
        Expression expression2 = gnVar.f87840a;
        if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) && this.f87841b.a(gnVar.f87841b, expressionResolver, expressionResolver2) && this.f87842c.a(gnVar.f87842c, expressionResolver, expressionResolver2) && this.f87843d.a(gnVar.f87843d, expressionResolver, expressionResolver2)) {
            ar arVar = this.f87844e;
            ar arVar2 = gnVar.f87844e;
            if (arVar != null ? arVar.a(arVar2, expressionResolver, expressionResolver2) : arVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87845f;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(gn.class).hashCode();
        Expression expression = this.f87840a;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f87841b.hash() + this.f87842c.hash() + this.f87843d.hash();
        ar arVar = this.f87844e;
        int iHash = iHashCode2 + (arVar != null ? arVar.hash() : 0);
        this.f87845f = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hn.b) BuiltInParserKt.getBuiltInParserComponent().x6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ gn(Expression expression, xc xcVar, xc xcVar2, xc xcVar3, ar arVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : expression, (i10 & 2) != 0 ? f87836h : xcVar, (i10 & 4) != 0 ? f87837i : xcVar2, (i10 & 8) != 0 ? f87838j : xcVar3, (i10 & 16) != 0 ? null : arVar);
    }
}
