package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ma;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class la implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88770c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final xc f88771d = new xc(null, Expression.Companion.constant$default(Expression.INSTANCE, 15L, null, 2, null), 1, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f88772e = a.f88775f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc f88773a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88774b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88775f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final la invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return la.f88770c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final la a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ma.b) BuiltInParserKt.getBuiltInParserComponent().J2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public la(xc xcVar) {
        this.f88773a = xcVar;
    }

    public final boolean a(la laVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (laVar == null) {
            return false;
        }
        return this.f88773a.a(laVar.f88773a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88774b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(la.class).hashCode() + this.f88773a.hash();
        this.f88774b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ma.b) BuiltInParserKt.getBuiltInParserComponent().J2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
