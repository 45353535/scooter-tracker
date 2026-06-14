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
public final class zh implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f92932d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f92933e = a.f92937f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f92934a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f92935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f92936c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92937f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zh invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return zh.f92932d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zh a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ai) BuiltInParserKt.getBuiltInParserComponent().P4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public zh(String str, String str2) {
        this.f92934a = str;
        this.f92935b = str2;
    }

    public final boolean a(zh zhVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        return zhVar != null && Intrinsics.areEqual(this.f92934a, zhVar.f92934a) && Intrinsics.areEqual(this.f92935b, zhVar.f92935b);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f92936c;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(zh.class).hashCode();
        String str = this.f92934a;
        int iHashCode2 = iHashCode + (str != null ? str.hashCode() : 0);
        String str2 = this.f92935b;
        int iHashCode3 = iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        this.f92936c = Integer.valueOf(iHashCode3);
        return iHashCode3;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ai) BuiltInParserKt.getBuiltInParserComponent().P4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
