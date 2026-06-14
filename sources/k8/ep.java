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
public abstract class ep implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f87357b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87358c = a.f87360f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87359a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87360f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ep invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ep.f87357b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ep a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((fp) BuiltInParserKt.getBuiltInParserComponent().Y6().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends ep {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final xc f87361d;

        public c(xc xcVar) {
            super(null);
            this.f87361d = xcVar;
        }

        public final xc c() {
            return this.f87361d;
        }
    }

    public static final class d extends ep {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ni f87362d;

        public d(ni niVar) {
            super(null);
            this.f87362d = niVar;
        }

        public final ni c() {
            return this.f87362d;
        }
    }

    public static final class e extends ep {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final nx f87363d;

        public e(nx nxVar) {
            super(null);
            this.f87363d = nxVar;
        }

        public final nx c() {
            return this.f87363d;
        }
    }

    public /* synthetic */ ep(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(ep epVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (epVar == null) {
            return false;
        }
        if (this instanceof c) {
            xc xcVarC = ((c) this).c();
            Object objB = epVar.b();
            return xcVarC.a(objB instanceof xc ? (xc) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof d) {
            ni niVarC = ((d) this).c();
            Object objB2 = epVar.b();
            return niVarC.a(objB2 instanceof ni ? (ni) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof e)) {
            throw new lf.m();
        }
        nx nxVarC = ((e) this).c();
        Object objB3 = epVar.b();
        return nxVarC.a(objB3 instanceof nx ? (nx) objB3 : null, expressionResolver, expressionResolver2);
    }

    public final Object b() {
        if (this instanceof c) {
            return ((c) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        if (this instanceof e) {
            return ((e) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87359a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else if (this instanceof d) {
            iHash = ((d) this).c().hash();
        } else {
            if (!(this instanceof e)) {
                throw new lf.m();
            }
            iHash = ((e) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87359a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fp) BuiltInParserKt.getBuiltInParserComponent().Y6().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private ep() {
    }
}
