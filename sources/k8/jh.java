package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.kh;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class jh implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f88422e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Expression f88423f = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f88424g = a.f88429f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f88428d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88429f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final jh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return jh.f88422e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final jh a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((kh.b) BuiltInParserKt.getBuiltInParserComponent().B4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public jh(Expression expression, Expression expression2, String str) {
        this.f88425a = expression;
        this.f88426b = expression2;
        this.f88427c = str;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88428d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(jh.class).hashCode() + this.f88425a.hashCode();
        Expression expression = this.f88426b;
        int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
        String str = this.f88427c;
        int iHashCode3 = iHashCode2 + (str != null ? str.hashCode() : 0);
        this.f88428d = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((kh.b) BuiltInParserKt.getBuiltInParserComponent().B4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
