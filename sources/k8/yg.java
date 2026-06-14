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
public abstract class yg implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f92738b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f92739c = a.f92741f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92740a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92741f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final yg invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return yg.f92738b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final yg a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ah) BuiltInParserKt.getBuiltInParserComponent().v4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends yg {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final s9 f92742d;

        public c(s9 s9Var) {
            super(null);
            this.f92742d = s9Var;
        }

        public final s9 c() {
            return this.f92742d;
        }
    }

    public static final class d extends yg {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final qc f92743d;

        public d(qc qcVar) {
            super(null);
            this.f92743d = qcVar;
        }

        public final qc c() {
            return this.f92743d;
        }
    }

    public static final class e extends yg {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final hl f92744d;

        public e(hl hlVar) {
            super(null);
            this.f92744d = hlVar;
        }

        public final hl c() {
            return this.f92744d;
        }
    }

    public /* synthetic */ yg(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(yg ygVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (ygVar == null) {
            return false;
        }
        if (this instanceof d) {
            qc qcVarC = ((d) this).c();
            zg zgVarB = ygVar.b();
            return qcVarC.b(zgVarB instanceof qc ? (qc) zgVarB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            s9 s9VarC = ((c) this).c();
            zg zgVarB2 = ygVar.b();
            return s9VarC.b(zgVarB2 instanceof s9 ? (s9) zgVarB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof e)) {
            throw new lf.m();
        }
        hl hlVarC = ((e) this).c();
        zg zgVarB3 = ygVar.b();
        return hlVarC.b(zgVarB3 instanceof hl ? (hl) zgVarB3 : null, expressionResolver, expressionResolver2);
    }

    public final zg b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92740a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new lf.m();
            }
            iHash = ((e) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f92740a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ah) BuiltInParserKt.getBuiltInParserComponent().v4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private yg() {
    }
}
