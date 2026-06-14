package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class lj implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88836c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88837d = a.f88840f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dl f88838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88839b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88840f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final lj invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return lj.f88836c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final lj a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((mj) BuiltInParserKt.getBuiltInParserComponent().n5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public lj(dl dlVar) {
        this.f88838a = dlVar;
    }

    public final boolean a(lj ljVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (ljVar == null) {
            return false;
        }
        return this.f88838a.a(ljVar.f88838a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88839b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(lj.class).hashCode() + this.f88838a.hash();
        this.f88839b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((mj) BuiltInParserKt.getBuiltInParserComponent().n5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
