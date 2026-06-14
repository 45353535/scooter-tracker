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
public abstract class a7 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f86216b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f86217c = a.f86219f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f86218a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86219f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final a7 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return a7.f86216b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a7 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((b7) BuiltInParserKt.getBuiltInParserComponent().F1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends a7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ue f86220d;

        public c(ue ueVar) {
            super(null);
            this.f86220d = ueVar;
        }

        public final ue c() {
            return this.f86220d;
        }
    }

    public static final class d extends a7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final fi f86221d;

        public d(fi fiVar) {
            super(null);
            this.f86221d = fiVar;
        }

        public final fi c() {
            return this.f86221d;
        }
    }

    public static final class e extends a7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final wi f86222d;

        public e(wi wiVar) {
            super(null);
            this.f86222d = wiVar;
        }

        public final wi c() {
            return this.f86222d;
        }
    }

    public static final class f extends a7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final em f86223d;

        public f(em emVar) {
            super(null);
            this.f86223d = emVar;
        }

        public final em c() {
            return this.f86223d;
        }
    }

    public static final class g extends a7 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gq f86224d;

        public g(gq gqVar) {
            super(null);
            this.f86224d = gqVar;
        }

        public final gq c() {
            return this.f86224d;
        }
    }

    public /* synthetic */ a7(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(a7 a7Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (a7Var == null) {
            return false;
        }
        if (this instanceof d) {
            fi fiVarC = ((d) this).c();
            Object objB = a7Var.b();
            return fiVarC.a(objB instanceof fi ? (fi) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof f) {
            em emVarC = ((f) this).c();
            Object objB2 = a7Var.b();
            return emVarC.a(objB2 instanceof em ? (em) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            ue ueVarC = ((c) this).c();
            Object objB3 = a7Var.b();
            return ueVarC.a(objB3 instanceof ue ? (ue) objB3 : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof g) {
            gq gqVarC = ((g) this).c();
            Object objB4 = a7Var.b();
            return gqVarC.a(objB4 instanceof gq ? (gq) objB4 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof e)) {
            throw new lf.m();
        }
        wi wiVarC = ((e) this).c();
        Object objB5 = a7Var.b();
        return wiVarC.a(objB5 instanceof wi ? (wi) objB5 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof f) {
            return ((f) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof g) {
            return ((g) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f86218a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else if (this instanceof f) {
            iHash = ((f) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof g) {
            iHash = ((g) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new lf.m();
            }
            iHash = ((e) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f86218a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((b7) BuiltInParserKt.getBuiltInParserComponent().F1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private a7() {
    }
}
