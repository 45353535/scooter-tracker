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
public abstract class r6 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90636b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90637c = a.f90639f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f90638a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90639f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final r6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return r6.f90636b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final r6 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((s6) BuiltInParserKt.getBuiltInParserComponent().z1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends r6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final wb f90640d;

        public c(wb wbVar) {
            super(null);
            this.f90640d = wbVar;
        }

        public final wb c() {
            return this.f90640d;
        }
    }

    public static final class d extends r6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final jn f90641d;

        public d(jn jnVar) {
            super(null);
            this.f90641d = jnVar;
        }

        public final jn c() {
            return this.f90641d;
        }
    }

    public static final class e extends r6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final n6 f90642d;

        public e(n6 n6Var) {
            super(null);
            this.f90642d = n6Var;
        }

        public final n6 c() {
            return this.f90642d;
        }
    }

    public static final class f extends r6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final op f90643d;

        public f(op opVar) {
            super(null);
            this.f90643d = opVar;
        }

        public final op c() {
            return this.f90643d;
        }
    }

    public /* synthetic */ r6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(r6 r6Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (r6Var == null) {
            return false;
        }
        if (this instanceof e) {
            n6 n6VarC = ((e) this).c();
            Object objB = r6Var.b();
            return n6VarC.a(objB instanceof n6 ? (n6) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            wb wbVarC = ((c) this).c();
            Object objB2 = r6Var.b();
            return wbVarC.a(objB2 instanceof wb ? (wb) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            jn jnVarC = ((d) this).c();
            Object objB3 = r6Var.b();
            return jnVarC.a(objB3 instanceof jn ? (jn) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof f)) {
            throw new lf.m();
        }
        op opVarC = ((f) this).c();
        Object objB4 = r6Var.b();
        return opVarC.a(objB4 instanceof op ? (op) objB4 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof e) {
            return ((e) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f90638a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else {
            if (!(this instanceof f)) {
                throw new lf.m();
            }
            iHash = ((f) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f90638a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s6) BuiltInParserKt.getBuiltInParserComponent().z1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private r6() {
    }
}
