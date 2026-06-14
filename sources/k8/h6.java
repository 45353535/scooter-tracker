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
public abstract class h6 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f87981b = new c(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Function2 f87982c = b.f87985f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Integer f87983a;

    public static final class a extends h6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final p8 f87984d;

        public a(p8 p8Var) {
            super(null);
            this.f87984d = p8Var;
        }

        public final p8 c() {
            return this.f87984d;
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f87985f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final h6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return h6.f87981b.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final h6 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((j6) BuiltInParserKt.getBuiltInParserComponent().t1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public static final class d extends h6 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final bj f87986d;

        public d(bj bjVar) {
            super(null);
            this.f87986d = bjVar;
        }

        public final bj c() {
            return this.f87986d;
        }
    }

    public /* synthetic */ h6(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public final boolean a(h6 h6Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (h6Var == null) {
            return false;
        }
        if (this instanceof a) {
            p8 p8VarC = ((a) this).c();
            i6 i6VarB = h6Var.b();
            return p8VarC.f(i6VarB instanceof p8 ? (p8) i6VarB : null, expressionResolver, expressionResolver2);
        }
        if (!(this instanceof d)) {
            throw new lf.m();
        }
        bj bjVarC = ((d) this).c();
        i6 i6VarB2 = h6Var.b();
        return bjVarC.f(i6VarB2 instanceof bj ? (bj) i6VarB2 : null, expressionResolver, expressionResolver2);
    }

    public final i6 b() {
        if (this instanceof a) {
            return ((a) this).c();
        }
        if (this instanceof d) {
            return ((d) this).c();
        }
        throw new lf.m();
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f87983a;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(getClass()).hashCode();
        if (this instanceof a) {
            iHash = ((a) this).c().hash();
        } else {
            if (!(this instanceof d)) {
                throw new lf.m();
            }
            iHash = ((d) this).c().hash();
        }
        int i10 = iHashCode + iHash;
        this.f87983a = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((j6) BuiltInParserKt.getBuiltInParserComponent().t1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    private h6() {
    }
}
