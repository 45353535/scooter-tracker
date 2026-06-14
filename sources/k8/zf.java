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
public abstract class zf implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f92926b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f92927c = a.f92929f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f92928a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f92929f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zf invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return zf.f92926b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zf a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((fg) BuiltInParserKt.getBuiltInParserComponent().m4().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends zf {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ag f92930d;

        public c(ag agVar) {
            super(null);
            this.f92930d = agVar;
        }

        public final ag c() {
            return this.f92930d;
        }
    }

    public static final class d extends zf {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ig f92931d;

        public d(ig igVar) {
            super(null);
            this.f92931d = igVar;
        }

        public final ig c() {
            return this.f92931d;
        }
    }

    public /* synthetic */ zf(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(zf zfVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (zfVar == null) {
            return false;
        }
        if (this instanceof d) {
            ig igVarC = ((d) this).c();
            Object objB = zfVar.b();
            return igVarC.a(objB instanceof ig ? (ig) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        ag agVarC = ((c) this).c();
        Object objB2 = zfVar.b();
        return agVarC.a(objB2 instanceof ag ? (ag) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f92928a;
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
        this.f92928a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fg) BuiltInParserKt.getBuiltInParserComponent().m4().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private zf() {
    }
}
