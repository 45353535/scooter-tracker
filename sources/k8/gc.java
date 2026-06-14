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
public final class gc implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87798b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87799c = a.f87801f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87800a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87801f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return gc.f87798b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gc a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((hc) BuiltInParserKt.getBuiltInParserComponent().k3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public final boolean a(gc gcVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return gcVar != null;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87800a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(gc.class).hashCode();
        this.f87800a = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hc) BuiltInParserKt.getBuiltInParserComponent().k3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
