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
public abstract class p2 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90298b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90299c = a.f90301f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f90300a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90301f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p2 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p2.f90298b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p2 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((q2) BuiltInParserKt.getBuiltInParserComponent().c0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends p2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final e0 f90302d;

        public c(e0 e0Var) {
            super(null);
            this.f90302d = e0Var;
        }

        public final e0 c() {
            return this.f90302d;
        }
    }

    public static final class d extends p2 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final j0 f90303d;

        public d(j0 j0Var) {
            super(null);
            this.f90303d = j0Var;
        }

        public final j0 c() {
            return this.f90303d;
        }
    }

    public /* synthetic */ p2(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(p2 p2Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (p2Var == null) {
            return false;
        }
        if (this instanceof c) {
            e0 e0VarC = ((c) this).c();
            Object objB = p2Var.b();
            return e0VarC.a(objB instanceof e0 ? (e0) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        j0 j0VarC = ((d) this).c();
        Object objB2 = p2Var.b();
        return j0VarC.a(objB2 instanceof j0 ? (j0) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f90300a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f90300a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((q2) BuiltInParserKt.getBuiltInParserComponent().c0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private p2() {
    }
}
