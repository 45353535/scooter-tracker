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
public abstract class qj implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final b f90584b = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f90585c = a.f90587f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f90586a;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90587f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qj invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return qj.f90584b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qj a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rj) BuiltInParserKt.getBuiltInParserComponent().q5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c extends qj {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final uj f90588d;

        public c(uj ujVar) {
            super(null);
            this.f90588d = ujVar;
        }

        public final uj c() {
            return this.f90588d;
        }
    }

    public static final class d extends qj {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final bk f90589d;

        public d(bk bkVar) {
            super(null);
            this.f90589d = bkVar;
        }

        public final bk c() {
            return this.f90589d;
        }
    }

    public /* synthetic */ qj(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(qj qjVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (qjVar == null) {
            return false;
        }
        if (this instanceof d) {
            bk bkVarC = ((d) this).c();
            Object objB = qjVar.b();
            return bkVarC.a(objB instanceof bk ? (bk) objB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof c)) {
            throw new lf.m();
        }
        uj ujVarC = ((c) this).c();
        Object objB2 = qjVar.b();
        return ujVarC.a(objB2 instanceof uj ? (uj) objB2 : null, expressionResolver, expressionResolver2);
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
        Integer num = this.f90586a;
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
        this.f90586a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rj) BuiltInParserKt.getBuiltInParserComponent().q5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private qj() {
    }
}
