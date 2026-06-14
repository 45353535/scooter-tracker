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
public final class hl implements JSONSerializable, Hashable, zg {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f88088c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f88089d = a.f88092f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f88090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f88091b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88092f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final hl invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return hl.f88088c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final hl a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((il) BuiltInParserKt.getBuiltInParserComponent().N5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public hl(String str) {
        this.f88090a = str;
    }

    @Override // k8.zg
    public String a() {
        return this.f88090a;
    }

    public final boolean b(hl hlVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (hlVar == null) {
            return false;
        }
        return Intrinsics.areEqual(a(), hlVar.a());
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88091b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(hl.class).hashCode() + a().hashCode();
        this.f88091b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((il) BuiltInParserKt.getBuiltInParserComponent().N5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
