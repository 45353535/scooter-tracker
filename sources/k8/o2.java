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
public final class o2 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final b f90139c = new b(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Function2 f90140d = a.f90143f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p2 f90141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90142b;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90143f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final o2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return o2.f90139c.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final o2 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((u2) BuiltInParserKt.getBuiltInParserComponent().f0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public o2(p2 p2Var) {
        this.f90141a = p2Var;
    }

    public final boolean a(o2 o2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (o2Var == null) {
            return false;
        }
        return this.f90141a.a(o2Var.f90141a, expressionResolver, expressionResolver2);
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90142b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(o2.class).hashCode() + this.f90141a.hash();
        this.f90142b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((u2) BuiltInParserKt.getBuiltInParserComponent().f0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
