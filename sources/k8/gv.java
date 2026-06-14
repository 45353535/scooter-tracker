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
public abstract class gv implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87915b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87916c = a.f87918f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87917a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87918f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final gv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return gv.f87915b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final gv a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((hv) BuiltInParserKt.getBuiltInParserComponent().S8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends gv {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final kv f87919d;

        public c(kv kvVar) {
            super(null);
            this.f87919d = kvVar;
        }

        public final kv c() {
            return this.f87919d;
        }
    }

    public static final class d extends gv {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final pv f87920d;

        public d(pv pvVar) {
            super(null);
            this.f87920d = pvVar;
        }

        public final pv c() {
            return this.f87920d;
        }
    }

    public /* synthetic */ gv(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(gv gvVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (gvVar == null) {
            return false;
        }
        if (this instanceof d) {
            pv pvVarC = ((d) this).c();
            Object objB = gvVar.b();
            return pvVarC.a(objB instanceof pv ? (pv) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        kv kvVarC = ((c) this).c();
        Object objB2 = gvVar.b();
        return kvVarC.a(objB2 instanceof kv ? (kv) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f87917a;
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
        this.f87917a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((hv) BuiltInParserKt.getBuiltInParserComponent().S8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private gv() {
    }
}
