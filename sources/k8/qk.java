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
public abstract class qk implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90590b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90591c = a.f90593f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f90592a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90593f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return qk.f90590b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qk a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rk) BuiltInParserKt.getBuiltInParserComponent().C5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends qk {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ri f90594d;

        public c(ri riVar) {
            super(null);
            this.f90594d = riVar;
        }

        public final ri c() {
            return this.f90594d;
        }
    }

    public static final class d extends qk {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final gj f90595d;

        public d(gj gjVar) {
            super(null);
            this.f90595d = gjVar;
        }

        public final gj c() {
            return this.f90595d;
        }
    }

    public static final class e extends qk {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final lj f90596d;

        public e(lj ljVar) {
            super(null);
            this.f90596d = ljVar;
        }

        public final lj c() {
            return this.f90596d;
        }
    }

    public /* synthetic */ qk(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(qk qkVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (qkVar == null) {
            return false;
        }
        if (this instanceof e) {
            lj ljVarC = ((e) this).c();
            Object objB = qkVar.b();
            return ljVarC.a(objB instanceof lj ? (lj) objB : null, expressionResolver, expressionResolver2);
        }
        if (this instanceof c) {
            ri riVarC = ((c) this).c();
            Object objB2 = qkVar.b();
            return riVarC.a(objB2 instanceof ri ? (ri) objB2 : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        gj gjVarC = ((d) this).c();
        Object objB3 = qkVar.b();
        return gjVarC.a(objB3 instanceof gj ? (gj) objB3 : null, expressionResolver, expressionResolver2);
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
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f90592a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof e) {
            iHash = ((e) this).c().hash();
        } else if (this instanceof c) {
            iHash = ((c) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f90592a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rk) BuiltInParserKt.getBuiltInParserComponent().C5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private qk() {
    }
}
