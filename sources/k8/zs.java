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
public abstract class zs implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f92999b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f93000c = a.f93002f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f93001a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f93002f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final zs invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return zs.f92999b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final zs a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((at) BuiltInParserKt.getBuiltInParserComponent().g8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends zs {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final fi f93003d;

        public c(fi fiVar) {
            super(null);
            this.f93003d = fiVar;
        }

        public final fi c() {
            return this.f93003d;
        }
    }

    public static final class d extends zs {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final em f93004d;

        public d(em emVar) {
            super(null);
            this.f93004d = emVar;
        }

        public final em c() {
            return this.f93004d;
        }
    }

    public /* synthetic */ zs(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(zs zsVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (zsVar == null) {
            return false;
        }
        if (this instanceof c) {
            fi fiVarC = ((c) this).c();
            Object objB = zsVar.b();
            return fiVarC.a(objB instanceof fi ? (fi) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        em emVarC = ((d) this).c();
        Object objB2 = zsVar.b();
        return emVarC.a(objB2 instanceof em ? (em) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f93001a;
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
        this.f93001a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((at) BuiltInParserKt.getBuiltInParserComponent().g8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private zs() {
    }
}
