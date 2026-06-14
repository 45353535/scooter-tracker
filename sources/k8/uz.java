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
public final class uz implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f91869c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f91870d = a.f91873f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f91871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f91872b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91873f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final uz invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return uz.f91869c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final uz a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((vz) BuiltInParserKt.getBuiltInParserComponent().ja().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public uz(Expression expression) {
        this.f91871a = expression;
    }

    public final boolean a(uz uzVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (uzVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f91871a.evaluate(expressionResolver), uzVar.f91871a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f91872b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(uz.class).hashCode() + this.f91871a.hashCode();
        this.f91872b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((vz) BuiltInParserKt.getBuiltInParserComponent().ja().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
