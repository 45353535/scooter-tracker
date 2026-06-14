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
public final class ri implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90736c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90737d = a.f90740f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xc f90738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90739b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90740f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ri invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ri.f90736c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ri a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((si) BuiltInParserKt.getBuiltInParserComponent().b5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ri(xc xcVar) {
        this.f90738a = xcVar;
    }

    public final boolean a(ri riVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (riVar == null) {
            return false;
        }
        return this.f90738a.a(riVar.f90738a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90739b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ri.class).hashCode() + this.f90738a.hash();
        this.f90739b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((si) BuiltInParserKt.getBuiltInParserComponent().b5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
