package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class uo implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final b f91701e = new b(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Function2 f91702f = a.f91707f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91703a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final to f91704b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ar f91705c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Integer f91706d;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91707f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uo invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return uo.f91701e.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uo a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((vo) BuiltInParserKt.getBuiltInParserComponent().S6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public uo(Expression expression, to toVar, ar arVar) {
        this.f91703a = expression;
        this.f91704b = toVar;
        this.f91705c = arVar;
    }

    public final boolean a(uo uoVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (uoVar != null && ((Number) this.f91703a.evaluate(expressionResolver)).intValue() == ((Number) uoVar.f91703a.evaluate(expressionResolver2)).intValue() && this.f91704b.a(uoVar.f91704b, expressionResolver, expressionResolver2)) {
            ar arVar = this.f91705c;
            ar arVar2 = uoVar.f91705c;
            if (arVar != null ? arVar.a(arVar2, expressionResolver, expressionResolver2) : arVar2 == null) {
                return true;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91706d;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(uo.class).hashCode() + this.f91703a.hashCode() + this.f91704b.hash();
        ar arVar = this.f91705c;
        int iHash = iHashCode + (arVar != null ? arVar.hash() : 0);
        this.f91706d = Integer.valueOf(iHash);
        return iHash;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((vo) BuiltInParserKt.getBuiltInParserComponent().S6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
