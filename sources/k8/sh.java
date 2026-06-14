package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.th;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class sh implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f91058f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f91059g = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f91060h = a.f91066f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f91062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f91063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f91064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f91065e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91066f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return sh.f91058f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sh a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((th.b) BuiltInParserKt.getBuiltInParserComponent().J4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public sh(Expression expression, Expression expression2, Expression expression3, String str) {
        this.f91061a = expression;
        this.f91062b = expression2;
        this.f91063c = expression3;
        this.f91064d = str;
    }

    public final boolean a(sh shVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return shVar != null && ((Boolean) this.f91061a.evaluate(expressionResolver)).booleanValue() == ((Boolean) shVar.f91061a.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f91062b.evaluate(expressionResolver), shVar.f91062b.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f91063c.evaluate(expressionResolver), shVar.f91063c.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f91064d, shVar.f91064d);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91065e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(sh.class).hashCode() + this.f91061a.hashCode() + this.f91062b.hashCode() + this.f91063c.hashCode() + this.f91064d.hashCode();
        this.f91065e = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((th.b) BuiltInParserKt.getBuiltInParserComponent().J4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
