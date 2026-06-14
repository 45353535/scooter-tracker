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
public abstract class cc implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f86662b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f86663c = b.f86666f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f86664a;

    public static final class a extends cc {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final h7 f86665d;

        public a(h7 h7Var) {
            super(null);
            this.f86665d = h7Var;
        }

        public final h7 c() {
            return this.f86665d;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f86666f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final cc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return cc.f86662b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final cc a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((dc) BuiltInParserKt.getBuiltInParserComponent().h3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends cc {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gc f86667d;

        public d(gc gcVar) {
            super(null);
            this.f86667d = gcVar;
        }

        public final gc c() {
            return this.f86667d;
        }
    }

    public /* synthetic */ cc(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(cc ccVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (ccVar == null) {
            return false;
        }
        if (this instanceof a) {
            h7 h7VarC = ((a) this).c();
            Object objB = ccVar.b();
            return h7VarC.a(objB instanceof h7 ? (h7) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        gc gcVarC = ((d) this).c();
        Object objB2 = ccVar.b();
        return gcVarC.a(objB2 instanceof gc ? (gc) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f86664a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f86664a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((dc) BuiltInParserKt.getBuiltInParserComponent().h3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private cc() {
    }
}
