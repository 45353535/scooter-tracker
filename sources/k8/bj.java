package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ej;
import k8.n9;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class bj implements JSONSerializable, Hashable, i6 {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f86524m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f86525n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f86526o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final n9.c f86527p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Expression f86528q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Function2 f86529r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f86530a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Expression f86531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Expression f86532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List f86533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f86534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f86535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f86536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final n9 f86537h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Expression f86538i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f86539j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f86540k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f86541l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f86542f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final bj invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return bj.f86524m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final bj a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ej.d) BuiltInParserKt.getBuiltInParserComponent().h5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f86525n = Expression.Companion.constant$default(companion, b6.NORMAL, null, 2, null);
        f86526o = Expression.Companion.constant$default(companion, c6.LINEAR, null, 2, null);
        f86527p = new n9.c(new mc(Expression.Companion.constant$default(companion, 1L, null, 2, null)));
        f86528q = Expression.Companion.constant$default(companion, 0L, null, 2, null);
        f86529r = a.f86542f;
    }

    public bj(List list, Expression expression, Expression expression2, List list2, Expression expression3, String str, Expression expression4, n9 n9Var, Expression expression5, Expression expression6, String str2) {
        this.f86530a = list;
        this.f86531b = expression;
        this.f86532c = expression2;
        this.f86533d = list2;
        this.f86534e = expression3;
        this.f86535f = str;
        this.f86536g = expression4;
        this.f86537h = n9Var;
        this.f86538i = expression5;
        this.f86539j = expression6;
        this.f86540k = str2;
    }

    @Override // k8.i6
    public List a() {
        return this.f86530a;
    }

    @Override // k8.i6
    public n9 b() {
        return this.f86537h;
    }

    @Override // k8.i6
    public Expression c() {
        return this.f86536g;
    }

    @Override // k8.i6
    public List d() {
        return this.f86533d;
    }

    @Override // k8.i6
    public Expression e() {
        return this.f86538i;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0143  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean f(k8.bj r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: k8.bj.f(k8.bj, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
    }

    public String g() {
        return this.f86540k;
    }

    @Override // k8.i6
    public Expression getDirection() {
        return this.f86531b;
    }

    @Override // k8.i6
    public Expression getDuration() {
        return this.f86532c;
    }

    @Override // k8.i6
    public String getId() {
        return this.f86535f;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        Integer num = this.f86541l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(bj.class).hashCode();
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
        int iHashCode3 = iHashCode2 + iHash2 + this.f86534e.hashCode() + getId().hashCode() + c().hashCode() + b().hash() + e().hashCode();
        Expression expression = this.f86539j;
        int iHashCode4 = iHashCode3 + (expression != null ? expression.hashCode() : 0) + g().hashCode();
        this.f86541l = Integer.valueOf(iHashCode4);
        return iHashCode4;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ej.d) BuiltInParserKt.getBuiltInParserComponent().h5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
