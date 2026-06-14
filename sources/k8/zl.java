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
public final class zl implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92956d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92957e = a.f92961f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final oa f92958a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final oa f92959b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92960c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92961f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return zl.f92956d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((am) BuiltInParserKt.getBuiltInParserComponent().Z5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public zl(oa oaVar, oa oaVar2) {
        this.f92958a = oaVar;
        this.f92959b = oaVar2;
    }

    public final boolean a(zl zlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return zlVar != null && this.f92958a.a(zlVar.f92958a, expressionResolver, expressionResolver2) && this.f92959b.a(zlVar.f92959b, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92960c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(zl.class).hashCode() + this.f92958a.hash() + this.f92959b.hash();
        this.f92960c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((am) BuiltInParserKt.getBuiltInParserComponent().Z5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
