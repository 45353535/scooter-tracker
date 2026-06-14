package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.sc;
import k8.vc;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class qc implements JSONSerializable, Hashable, zg {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f90560f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f90561g = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.FALSE, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f90562h = a.f90568f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Expression f90563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f90564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f90565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f90566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f90567e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90568f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qc invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return qc.f90560f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final qc a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((sc.b) BuiltInParserKt.getBuiltInParserComponent().q3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f90569e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Expression f90570f = Expression.Companion.constant$default(Expression.INSTANCE, "_", null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f90571g = a.f90576f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Expression f90572a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f90573b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f90574c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f90575d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f90576f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f90569e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((vc.b) BuiltInParserKt.getBuiltInParserComponent().t3().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(Expression expression, Expression expression2, Expression expression3) {
            this.f90572a = expression;
            this.f90573b = expression2;
            this.f90574c = expression3;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (cVar != null && Intrinsics.areEqual(this.f90572a.evaluate(expressionResolver), cVar.f90572a.evaluate(expressionResolver2)) && Intrinsics.areEqual(this.f90573b.evaluate(expressionResolver), cVar.f90573b.evaluate(expressionResolver2))) {
                Expression expression = this.f90574c;
                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Expression expression2 = cVar.f90574c;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f90575d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f90572a.hashCode() + this.f90573b.hashCode();
            Expression expression = this.f90574c;
            int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0);
            this.f90575d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((vc.b) BuiltInParserKt.getBuiltInParserComponent().t3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public qc(Expression expression, Expression expression2, List list, String str) {
        this.f90563a = expression;
        this.f90564b = expression2;
        this.f90565c = list;
        this.f90566d = str;
    }

    @Override // k8.zg
    public String a() {
        return this.f90566d;
    }

    public final boolean b(qc qcVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (qcVar != null && ((Boolean) this.f90563a.evaluate(expressionResolver)).booleanValue() == ((Boolean) qcVar.f90563a.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f90564b.evaluate(expressionResolver), qcVar.f90564b.evaluate(expressionResolver2))) {
            List list = this.f90565c;
            List list2 = qcVar.f90565c;
            if (list.size() == list2.size()) {
                Iterator it = list.iterator();
                int i10 = 0;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        int i11 = i10 + 1;
                        if (i10 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        if (!((c) next).a((c) list2.get(i10), expressionResolver, expressionResolver2)) {
                            break;
                        }
                        i10 = i11;
                    } else if (Intrinsics.areEqual(a(), qcVar.a())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90567e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(qc.class).hashCode() + this.f90563a.hashCode() + this.f90564b.hashCode();
        Iterator it = this.f90565c.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((c) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + a().hashCode();
        this.f90567e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((sc.b) BuiltInParserKt.getBuiltInParserComponent().q3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
