package k8;

import com.ironsource.C4240b4;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.fv;
import k8.gv;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class dv implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f87078m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f87079n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Expression f87080o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final gv.c f87081p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final Function2 f87082q;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a6 f87083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a6 f87084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f87085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f87086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final y0 f87087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Expression f87088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f87089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final gv f87090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final zl f87091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Expression f87092j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final List f87093k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f87094l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87095f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final dv invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return dv.f87078m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final dv a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((fv.c) BuiltInParserKt.getBuiltInParserComponent().P8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public enum c {
        LEFT("left"),
        TOP_LEFT(C4240b4.e.f42563c),
        TOP("top"),
        TOP_RIGHT(C4240b4.e.f42562b),
        RIGHT("right"),
        BOTTOM_RIGHT(C4240b4.e.f42564d),
        BOTTOM("bottom"),
        BOTTOM_LEFT(C4240b4.e.f42565e),
        CENTER("center");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1034c f87096c = new C1034c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f87097d = b.f87111f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f87098e = a.f87110f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f87109b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87110f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final c invoke(String str) {
                return c.f87096c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f87111f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(c cVar) {
                return c.f87096c.b(cVar);
            }
        }

        /* JADX INFO: renamed from: k8.dv$c$c, reason: collision with other inner class name */
        public static final class C1034c {
            public /* synthetic */ C1034c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(String str) {
                c cVar = c.LEFT;
                if (Intrinsics.areEqual(str, cVar.f87109b)) {
                    return cVar;
                }
                c cVar2 = c.TOP_LEFT;
                if (Intrinsics.areEqual(str, cVar2.f87109b)) {
                    return cVar2;
                }
                c cVar3 = c.TOP;
                if (Intrinsics.areEqual(str, cVar3.f87109b)) {
                    return cVar3;
                }
                c cVar4 = c.TOP_RIGHT;
                if (Intrinsics.areEqual(str, cVar4.f87109b)) {
                    return cVar4;
                }
                c cVar5 = c.RIGHT;
                if (Intrinsics.areEqual(str, cVar5.f87109b)) {
                    return cVar5;
                }
                c cVar6 = c.BOTTOM_RIGHT;
                if (Intrinsics.areEqual(str, cVar6.f87109b)) {
                    return cVar6;
                }
                c cVar7 = c.BOTTOM;
                if (Intrinsics.areEqual(str, cVar7.f87109b)) {
                    return cVar7;
                }
                c cVar8 = c.BOTTOM_LEFT;
                if (Intrinsics.areEqual(str, cVar8.f87109b)) {
                    return cVar8;
                }
                c cVar9 = c.CENTER;
                if (Intrinsics.areEqual(str, cVar9.f87109b)) {
                    return cVar9;
                }
                return null;
            }

            public final String b(c cVar) {
                return cVar.f87109b;
            }

            private C1034c() {
            }
        }

        c(String str) {
            this.f87109b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        f87079n = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f87080o = Expression.Companion.constant$default(companion, 5000L, null, 2, null);
        f87081p = new gv.c(new kv());
        f87082q = a.f87095f;
    }

    public dv(a6 a6Var, a6 a6Var2, Expression expression, Expression expression2, y0 y0Var, Expression expression3, String str, gv gvVar, zl zlVar, Expression expression4, List list) {
        this.f87083a = a6Var;
        this.f87084b = a6Var2;
        this.f87085c = expression;
        this.f87086d = expression2;
        this.f87087e = y0Var;
        this.f87088f = expression3;
        this.f87089g = str;
        this.f87090h = gvVar;
        this.f87091i = zlVar;
        this.f87092j = expression4;
        this.f87093k = list;
    }

    public final boolean a(dv dvVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (dvVar == null) {
            return false;
        }
        a6 a6Var = this.f87083a;
        if (a6Var != null ? a6Var.a(dvVar.f87083a, expressionResolver, expressionResolver2) : dvVar.f87083a == null) {
            a6 a6Var2 = this.f87084b;
            if (a6Var2 != null ? a6Var2.a(dvVar.f87084b, expressionResolver, expressionResolver2) : dvVar.f87084b == null) {
                Expression expression = this.f87085c;
                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Expression expression2 = dvVar.f87085c;
                if (Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && ((Boolean) this.f87086d.evaluate(expressionResolver)).booleanValue() == ((Boolean) dvVar.f87086d.evaluate(expressionResolver2)).booleanValue() && this.f87087e.a(dvVar.f87087e, expressionResolver, expressionResolver2) && ((Number) this.f87088f.evaluate(expressionResolver)).longValue() == ((Number) dvVar.f87088f.evaluate(expressionResolver2)).longValue() && Intrinsics.areEqual(this.f87089g, dvVar.f87089g) && this.f87090h.a(dvVar.f87090h, expressionResolver, expressionResolver2)) {
                    zl zlVar = this.f87091i;
                    if ((zlVar != null ? zlVar.a(dvVar.f87091i, expressionResolver, expressionResolver2) : dvVar.f87091i == null) && this.f87092j.evaluate(expressionResolver) == dvVar.f87092j.evaluate(expressionResolver2)) {
                        List list = this.f87093k;
                        List list2 = dvVar.f87093k;
                        if (list != null) {
                            if (list2 != null) {
                                if (list.size() == list2.size()) {
                                    int i10 = 0;
                                    for (Object obj : list) {
                                        int i11 = i10 + 1;
                                        if (i10 < 0) {
                                            CollectionsKt.throwIndexOverflow();
                                        }
                                        if (((j1) obj).a((j1) list2.get(i10), expressionResolver, expressionResolver2)) {
                                            i10 = i11;
                                        }
                                    }
                                    z10 = true;
                                }
                                z10 = false;
                                break;
                            }
                            return false;
                        }
                        if (list2 != null) {
                            z10 = false;
                            break;
                        }
                        z10 = true;
                        if (z10) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f87094l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(dv.class).hashCode();
        a6 a6Var = this.f87083a;
        int iHash = 0;
        int iHash2 = iHashCode + (a6Var != null ? a6Var.hash() : 0);
        a6 a6Var2 = this.f87084b;
        int iHash3 = iHash2 + (a6Var2 != null ? a6Var2.hash() : 0);
        Expression expression = this.f87085c;
        int iHashCode2 = iHash3 + (expression != null ? expression.hashCode() : 0) + this.f87086d.hashCode() + this.f87087e.hash() + this.f87088f.hashCode() + this.f87089g.hashCode() + this.f87090h.hash();
        zl zlVar = this.f87091i;
        int iHash4 = iHashCode2 + (zlVar != null ? zlVar.hash() : 0) + this.f87092j.hashCode();
        List list = this.f87093k;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        }
        int i10 = iHash4 + iHash;
        this.f87094l = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((fv.c) BuiltInParserKt.getBuiltInParserComponent().P8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
