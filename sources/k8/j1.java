package k8;

import android.net.Uri;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.s3;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class j1 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final b f88302m = new b(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Expression f88303n = Expression.Companion.constant$default(Expression.INSTANCE, Boolean.TRUE, null, 2, null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final Function2 f88304o = a.f88317f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xa f88305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f88306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Expression f88307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Expression f88308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f88309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final JSONObject f88310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Expression f88311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f88312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression f88313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final m5 f88314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Expression f88315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Integer f88316l;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88317f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final j1 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return j1.f88302m.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final j1 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((s3.c) BuiltInParserKt.getBuiltInParserComponent().u0().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f88318e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f88319f = a.f88324f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j1 f88320a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f88321b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Expression f88322c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f88323d;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88324f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f88318e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((t3) BuiltInParserKt.getBuiltInParserComponent().x0().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(j1 j1Var, List list, Expression expression) {
            this.f88320a = j1Var;
            this.f88321b = list;
            this.f88322c = expression;
        }

        public final boolean a(c cVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            boolean z10;
            if (cVar == null) {
                return false;
            }
            j1 j1Var = this.f88320a;
            if (j1Var != null ? j1Var.a(cVar.f88320a, expressionResolver, expressionResolver2) : cVar.f88320a == null) {
                List list = this.f88321b;
                if (list != null) {
                    List list2 = cVar.f88321b;
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
                if (cVar.f88321b != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10 && Intrinsics.areEqual(this.f88322c.evaluate(expressionResolver), cVar.f88322c.evaluate(expressionResolver2))) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f88323d;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            j1 j1Var = this.f88320a;
            int iHash = 0;
            int iHash2 = iHashCode + (j1Var != null ? j1Var.hash() : 0);
            List list = this.f88321b;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((j1) it.next()).hash();
                }
            }
            int iHashCode2 = iHash2 + iHash + this.f88322c.hashCode();
            this.f88323d = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((t3) BuiltInParserKt.getBuiltInParserComponent().x0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public enum d {
        SELF("_self"),
        BLANK("_blank");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f88325c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f88326d = b.f88333f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f88327e = a.f88332f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f88331b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f88332f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f88325c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f88333f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f88325c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.SELF;
                if (Intrinsics.areEqual(str, dVar.f88331b)) {
                    return dVar;
                }
                d dVar2 = d.BLANK;
                if (Intrinsics.areEqual(str, dVar2.f88331b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f88331b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f88331b = str;
        }
    }

    public j1(xa xaVar, Expression expression, Expression expression2, Expression expression3, List list, JSONObject jSONObject, Expression expression4, String str, Expression expression5, m5 m5Var, Expression expression6) {
        this.f88305a = xaVar;
        this.f88306b = expression;
        this.f88307c = expression2;
        this.f88308d = expression3;
        this.f88309e = list;
        this.f88310f = jSONObject;
        this.f88311g = expression4;
        this.f88312h = str;
        this.f88313i = expression5;
        this.f88314j = m5Var;
        this.f88315k = expression6;
    }

    public final boolean a(j1 j1Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        if (j1Var == null) {
            return false;
        }
        xa xaVar = this.f88305a;
        if ((xaVar != null ? xaVar.a(j1Var.f88305a, expressionResolver, expressionResolver2) : j1Var.f88305a == null) && ((Boolean) this.f88306b.evaluate(expressionResolver)).booleanValue() == ((Boolean) j1Var.f88306b.evaluate(expressionResolver2)).booleanValue() && Intrinsics.areEqual(this.f88307c.evaluate(expressionResolver), j1Var.f88307c.evaluate(expressionResolver2))) {
            Expression expression = this.f88308d;
            Uri uri = expression != null ? (Uri) expression.evaluate(expressionResolver) : null;
            Expression expression2 = j1Var.f88308d;
            if (Intrinsics.areEqual(uri, expression2 != null ? (Uri) expression2.evaluate(expressionResolver2) : null)) {
                List list = this.f88309e;
                if (list != null) {
                    List list2 = j1Var.f88309e;
                    if (list2 != null) {
                        if (list.size() == list2.size()) {
                            int i10 = 0;
                            for (Object obj : list) {
                                int i11 = i10 + 1;
                                if (i10 < 0) {
                                    CollectionsKt.throwIndexOverflow();
                                }
                                if (((c) obj).a((c) list2.get(i10), expressionResolver, expressionResolver2)) {
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
                if (j1Var.f88309e != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10 && Intrinsics.areEqual(this.f88310f, j1Var.f88310f)) {
                    Expression expression3 = this.f88311g;
                    Uri uri2 = expression3 != null ? (Uri) expression3.evaluate(expressionResolver) : null;
                    Expression expression4 = j1Var.f88311g;
                    if (Intrinsics.areEqual(uri2, expression4 != null ? (Uri) expression4.evaluate(expressionResolver2) : null) && Intrinsics.areEqual(this.f88312h, j1Var.f88312h)) {
                        Expression expression5 = this.f88313i;
                        d dVar = expression5 != null ? (d) expression5.evaluate(expressionResolver) : null;
                        Expression expression6 = j1Var.f88313i;
                        if (dVar == (expression6 != null ? (d) expression6.evaluate(expressionResolver2) : null)) {
                            m5 m5Var = this.f88314j;
                            if (m5Var != null ? m5Var.a(j1Var.f88314j, expressionResolver, expressionResolver2) : j1Var.f88314j == null) {
                                Expression expression7 = this.f88315k;
                                Uri uri3 = expression7 != null ? (Uri) expression7.evaluate(expressionResolver) : null;
                                Expression expression8 = j1Var.f88315k;
                                if (Intrinsics.areEqual(uri3, expression8 != null ? (Uri) expression8.evaluate(expressionResolver2) : null)) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f88316l;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(j1.class).hashCode();
        xa xaVar = this.f88305a;
        int iHash2 = iHashCode + (xaVar != null ? xaVar.hash() : 0) + this.f88306b.hashCode() + this.f88307c.hashCode();
        Expression expression = this.f88308d;
        int iHashCode2 = iHash2 + (expression != null ? expression.hashCode() : 0);
        List list = this.f88309e;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((c) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        JSONObject jSONObject = this.f88310f;
        int iHashCode3 = i10 + (jSONObject != null ? jSONObject.hashCode() : 0);
        Expression expression2 = this.f88311g;
        int iHashCode4 = iHashCode3 + (expression2 != null ? expression2.hashCode() : 0);
        String str = this.f88312h;
        int iHashCode5 = iHashCode4 + (str != null ? str.hashCode() : 0);
        Expression expression3 = this.f88313i;
        int iHashCode6 = iHashCode5 + (expression3 != null ? expression3.hashCode() : 0);
        m5 m5Var = this.f88314j;
        int iHash3 = iHashCode6 + (m5Var != null ? m5Var.hash() : 0);
        Expression expression4 = this.f88315k;
        int iHashCode7 = iHash3 + (expression4 != null ? expression4.hashCode() : 0);
        this.f88316l = Integer.valueOf(iHashCode7);
        return iHashCode7;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((s3.c) BuiltInParserKt.getBuiltInParserComponent().u0().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
