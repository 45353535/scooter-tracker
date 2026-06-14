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
public final class a implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f86175c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f86176d = C1028a.f86179f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f86177a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f86178b;

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    static final class C1028a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final C1028a f86179f = new C1028a();

        C1028a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return a.f86175c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((k8.b) BuiltInParserKt.getBuiltInParserComponent().a().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public a(Expression expression) {
        this.f86177a = expression;
    }

    public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (aVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f86177a.evaluate(expressionResolver), aVar.f86177a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f86178b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(a.class).hashCode() + this.f86177a.hashCode();
        this.f86178b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((k8.b) BuiltInParserKt.getBuiltInParserComponent().a().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
