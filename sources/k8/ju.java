package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import k8.ku;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ju implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88517c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Expression f88518d = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f88519e = a.f88522f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88521b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88522f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ju invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ju.f88517c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ju a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ku.b) BuiltInParserKt.getBuiltInParserComponent().B8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ju(Expression expression) {
        this.f88520a = expression;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88521b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ju.class).hashCode() + this.f88520a.hashCode();
        this.f88521b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ku.b) BuiltInParserKt.getBuiltInParserComponent().B8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
