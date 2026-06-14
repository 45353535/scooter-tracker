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
public final class p1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90293c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90294d = a.f90297f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f90295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90296b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90297f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p1.f90293c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((q1) BuiltInParserKt.getBuiltInParserComponent().N().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public p1(String str) {
        this.f90295a = str;
    }

    public final boolean a(p1 p1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (p1Var == null) {
            return false;
        }
        return Intrinsics.areEqual(this.f90295a, p1Var.f90295a);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90296b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(p1.class).hashCode() + this.f90295a.hashCode();
        this.f90296b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((q1) BuiltInParserKt.getBuiltInParserComponent().N().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
