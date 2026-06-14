package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.n9;
import k8.s8;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class p8 implements JSONSerializable, Hashable, i6 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f90327m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f90328n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f90329o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final n9.c f90330p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Expression f90331q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Function2 f90332r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f90333a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f90334b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f90335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f90336d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f90337e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f90338f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f90339g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n9 f90340h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Expression f90341i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f90342j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f90343k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f90344l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90345f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final p8 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return p8.f90327m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final p8 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((s8.d) BuiltInParserKt.getBuiltInParserComponent().j2().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f90328n = Expression.Companion.constant$default(companion, b6.NORMAL, null, 2, null);
        f90329o = Expression.Companion.constant$default(companion, c6.LINEAR, null, 2, null);
        f90330p = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f90331q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f90332r = a.f90345f;
    }

    public p8(List list, Expression expression, Expression expression2, List list2, Expression expression3, String str, Expression expression4, n9 n9Var, Expression expression5, Expression expression6, String str2) {
        this.f90333a = list;
        this.f90334b = expression;
        this.f90335c = expression2;
        this.f90336d = list2;
        this.f90337e = expression3;
        this.f90338f = str;
        this.f90339g = expression4;
        this.f90340h = n9Var;
        this.f90341i = expression5;
        this.f90342j = expression6;
        this.f90343k = str2;
    }

    @Override // k8.i6
    public List a() {
        return this.f90333a;
    }

    @Override // k8.i6
    public n9 b() {
        return this.f90340h;
    }

    @Override // k8.i6
    public Expression c() {
        return this.f90339g;
    }

    @Override // k8.i6
    public List d() {
        return this.f90336d;
    }

    @Override // k8.i6
    public Expression e() {
        return this.f90341i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0141  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(k8.p8 r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            Method dump skipped, instruction units count: 351
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.p8.f(k8.p8, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public String g() {
        return this.f90343k;
    }

    @Override // k8.i6
    public Expression getDirection() {
        return this.f90334b;
    }

    @Override // k8.i6
    public Expression getDuration() {
        return this.f90335c;
    }

    @Override // k8.i6
    public String getId() {
        return this.f90338f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f90344l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(p8.class).hashCode();
        List listA = a();
        if (listA != null) {
            Iterator it = listA.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + getDirection().hashCode() + getDuration().hashCode();
        List listD = d();
        if (listD != null) {
            Iterator it2 = listD.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((j1) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = iHashCode2 + iHash2 + this.f90337e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression expression = this.f90342j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f90344l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s8.d) BuiltInParserKt.getBuiltInParserComponent().j2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
