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
public abstract class n9 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90018b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90019c = a.f90021f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f90020a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90021f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n9 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return n9.f90018b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n9 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((o9) BuiltInParserKt.getBuiltInParserComponent().v2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends n9 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final mc f90022d;

        public c(mc mcVar) {
            super(null);
            this.f90022d = mcVar;
        }

        public final mc c() {
            return this.f90022d;
        }
    }

    public static final class d extends n9 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final tf f90023d;

        public d(tf tfVar) {
            super(null);
            this.f90023d = tfVar;
        }

        public final tf c() {
            return this.f90023d;
        }
    }

    public /* synthetic */ n9(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(n9 n9Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (n9Var == null) {
            return false;
        }
        if (this instanceof d) {
            tf tfVarC = ((d) this).c();
            Object objB = n9Var.b();
            return tfVarC.a(objB instanceof tf ? (tf) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        mc mcVarC = ((c) this).c();
        Object objB2 = n9Var.b();
        return mcVarC.a(objB2 instanceof mc ? (mc) objB2 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof c) {
            return ((c) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f90020a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else {
            if (!(this instanceof c)) {
                throw new lf.m();
            }
            iHash = ((c) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f90020a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((o9) BuiltInParserKt.getBuiltInParserComponent().v2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private n9() {
    }
}
