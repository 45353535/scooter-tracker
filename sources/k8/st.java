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
public abstract class st implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f91183b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f91184c = b.f91187f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f91185a;

    public static final class a extends st {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final g8 f91186d;

        public a(g8 g8Var) {
            super(null);
            this.f91186d = g8Var;
        }

        public final g8 c() {
            return this.f91186d;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f91187f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final st invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return st.f91183b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final st a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((tt) BuiltInParserKt.getBuiltInParserComponent().s8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends st {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gq f91188d;

        public d(gq gqVar) {
            super(null);
            this.f91188d = gqVar;
        }

        public final gq c() {
            return this.f91188d;
        }
    }

    public /* synthetic */ st(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(st stVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (stVar == null) {
            return false;
        }
        if (this instanceof d) {
            gq gqVarC = ((d) this).c();
            Object objB = stVar.b();
            return gqVarC.a(objB instanceof gq ? (gq) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof a)) {
            throw new lf.m();
        }
        g8 g8VarC = ((a) this).c();
        Object objB2 = stVar.b();
        return g8VarC.a(objB2 instanceof g8 ? (g8) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f91185a;
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
        this.f91185a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((tt) BuiltInParserKt.getBuiltInParserComponent().s8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private st() {
    }
}
