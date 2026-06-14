package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ld implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f88781d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f88782e = a.f88786f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f88783a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qb f88784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f88785c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88786f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ld invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ld.f88781d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ld a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((md) BuiltInParserKt.getBuiltInParserComponent().F3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public ld(String str, qb qbVar) {
        this.f88783a = str;
        this.f88784b = qbVar;
    }

    public final boolean a(ld ldVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return ldVar != null && Intrinsics.areEqual(this.f88783a, ldVar.f88783a) && this.f88784b == ldVar.f88784b;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88785c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ld.class).hashCode() + this.f88783a.hashCode() + this.f88784b.hashCode();
        this.f88785c = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((md) BuiltInParserKt.getBuiltInParserComponent().F3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
