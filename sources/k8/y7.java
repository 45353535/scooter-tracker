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
public abstract class y7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f92635b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f92636c = b.f92639f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92637a;

    public static final class a extends y7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p7 f92638d;

        public a(p7 p7Var) {
            super(null);
            this.f92638d = p7Var;
        }

        public final p7 c() {
            return this.f92638d;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92639f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final y7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return y7.f92635b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final y7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((z7) BuiltInParserKt.getBuiltInParserComponent().U1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends y7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final u7 f92640d;

        public d(u7 u7Var) {
            super(null);
            this.f92640d = u7Var;
        }

        public final u7 c() {
            return this.f92640d;
        }
    }

    public /* synthetic */ y7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(y7 y7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (y7Var == null) {
            return false;
        }
        if (this instanceof d) {
            u7 u7VarC = ((d) this).c();
            Object objB = y7Var.b();
            return u7VarC.a(objB instanceof u7 ? (u7) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new lf.m();
        }
        p7 p7VarC = ((a) this).c();
        Object objB2 = y7Var.b();
        return p7VarC.a(objB2 instanceof p7 ? (p7) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof a) {
            return ((a) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92637a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else {
            if (!(this instanceof a)) {
                throw new lf.m();
            }
            iHash = ((a) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f92637a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((z7) BuiltInParserKt.getBuiltInParserComponent().U1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private y7() {
    }
}
