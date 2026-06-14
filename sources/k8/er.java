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
public final class er implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87364b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87365c = a.f87367f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87366a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87367f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final er invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return er.f87364b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final er a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((fr) BuiltInParserKt.getBuiltInParserComponent().F7().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public final boolean a(er erVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return erVar != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87366a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(er.class).hashCode();
        this.f87366a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fr) BuiltInParserKt.getBuiltInParserComponent().F7().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
