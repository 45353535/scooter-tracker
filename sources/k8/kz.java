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
public final class kz implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88736c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88737d = a.f88740f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f88738a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88739b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88740f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kz invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return kz.f88736c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kz a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((lz) BuiltInParserKt.getBuiltInParserComponent().da().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public kz(Expression expression) {
        this.f88738a = expression;
    }

    public final boolean a(kz kzVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (kzVar == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f88738a.evaluate(expressionResolver), kzVar.f88738a.evaluate(expressionResolver2));
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88739b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(kz.class).hashCode() + this.f88738a.hashCode();
        this.f88739b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((lz) BuiltInParserKt.getBuiltInParserComponent().da().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
