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
public abstract class to implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f91408b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f91409c = b.f91412f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f91410a;

    public static final class a extends to {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final d8 f91411d;

        public a(d8 d8Var) {
            super(null);
            this.f91411d = d8Var;
        }

        public final d8 c() {
            return this.f91411d;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f91412f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final to invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return to.f91408b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final to a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((zo) BuiltInParserKt.getBuiltInParserComponent().V6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends to {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gn f91413d;

        public d(gn gnVar) {
            super(null);
            this.f91413d = gnVar;
        }

        public final gn c() {
            return this.f91413d;
        }
    }

    public /* synthetic */ to(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(to toVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (toVar == null) {
            return false;
        }
        if (this instanceof d) {
            gn gnVarC = ((d) this).c();
            Object objB = toVar.b();
            return gnVarC.a(objB instanceof gn ? (gn) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new lf.m();
        }
        d8 d8VarC = ((a) this).c();
        Object objB2 = toVar.b();
        return d8VarC.a(objB2 instanceof d8 ? (d8) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f91410a;
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
        this.f91410a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((zo) BuiltInParserKt.getBuiltInParserComponent().V6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private to() {
    }
}
