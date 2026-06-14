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
public abstract class sm implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f91071b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f91072c = a.f91074f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f91073a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91074f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final sm invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return sm.f91071b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final sm a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((tm) BuiltInParserKt.getBuiltInParserComponent().o6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends sm {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xc f91075d;

        public c(xc xcVar) {
            super(null);
            this.f91075d = xcVar;
        }

        public final xc c() {
            return this.f91075d;
        }
    }

    public static final class d extends sm {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final cn f91076d;

        public d(cn cnVar) {
            super(null);
            this.f91076d = cnVar;
        }

        public final cn c() {
            return this.f91076d;
        }
    }

    public /* synthetic */ sm(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(sm smVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (smVar == null) {
            return false;
        }
        if (this instanceof c) {
            xc xcVarC = ((c) this).c();
            Object objB = smVar.b();
            return xcVarC.a(objB instanceof xc ? (xc) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        cn cnVarC = ((d) this).c();
        Object objB2 = smVar.b();
        return cnVarC.a(objB2 instanceof cn ? (cn) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f91073a;
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
        this.f91073a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((tm) BuiltInParserKt.getBuiltInParserComponent().o6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private sm() {
    }
}
