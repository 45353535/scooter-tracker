package k8;

import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.adjust.sdk.Constants;
import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.a6;
import k8.ep;
import k8.et;
import k8.gt;
import k8.hu;
import k8.rt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class us implements JSONSerializable, Hashable, f7 {
    private static final Expression A0;
    private static final Expression B0;
    private static final Expression C0;
    private static final Expression D0;
    private static final Expression E0;
    private static final Expression F0;
    private static final Expression G0;
    private static final Expression H0;
    private static final Expression I0;
    private static final ep.d J0;
    private static final Function2 K0;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public static final b f91709s0 = new b(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final a6 f91710t0;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final Expression f91711u0;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final Expression f91712v0;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final Expression f91713w0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final Expression f91714x0;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final ep.e f91715y0;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    private static final Expression f91716z0;
    private final List A;
    private final ep B;
    public final List C;
    public final List D;
    private final String E;
    public final List F;
    private final zh G;
    public final Expression H;
    public final Expression I;
    public final List J;
    private final hb K;
    public final Expression L;
    public final Expression M;
    private final hb N;
    public final List O;
    public final List P;
    public final List Q;
    private final Expression R;
    private final Expression S;
    public final Expression T;
    private final List U;
    public final Expression V;
    public final Expression W;
    public final Expression X;
    public final Expression Y;
    public final Expression Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g1 f91717a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final zs f91718a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final j1 f91719b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final oo f91720b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a6 f91721c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final Expression f91722c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f91723d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    private final List f91724d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Expression f91725e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    private final wv f91726e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Expression f91727f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    private final y7 f91728f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Expression f91729g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    private final r6 f91730g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List f91731h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    private final r6 f91732h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Expression f91733i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    private final List f91734i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final List f91735j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final Expression f91736j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final l7 f91737k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public final Expression f91738k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Expression f91739l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    private final List f91740l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Expression f91741m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    private final List f91742m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f91743n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    private final Expression f91744n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final List f91745o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    private final hx f91746o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final c f91747p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final List f91748p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final List f91749q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    private final ep f91750q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final bd f91751r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    private Integer f91752r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Expression f91753s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Expression f91754t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final Expression f91755u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final Expression f91756v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Expression f91757w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Expression f91758x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final Expression f91759y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Expression f91760z;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f91761f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final us invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return us.f91709s0.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final us a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rt.l) BuiltInParserKt.getBuiltInParserComponent().p8().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f91762f = new b(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final Function2 f91763g = a.f91769f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f91764a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f91765b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List f91766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f91767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Integer f91768e;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91769f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f91762f.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((ws) BuiltInParserKt.getBuiltInParserComponent().d8().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(List list, List list2, List list3, Expression expression) {
            this.f91764a = list;
            this.f91765b = list2;
            this.f91766c = list3;
            this.f91767d = expression;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x004b  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0085  */
        /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x00c6  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x00dc A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(k8.us.c r7, com.yandex.div.json.expressions.ExpressionResolver r8, com.yandex.div.json.expressions.ExpressionResolver r9) {
            /*
                Method dump skipped, instruction units count: 223
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.us.c.a(k8.us$c, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            int iHash2;
            Integer num = this.f91768e;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode();
            List list = this.f91764a;
            int iHash3 = 0;
            if (list != null) {
                Iterator it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((j1) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            List list2 = this.f91765b;
            if (list2 != null) {
                Iterator it2 = list2.iterator();
                iHash2 = 0;
                while (it2.hasNext()) {
                    iHash2 += ((d) it2.next()).hash();
                }
            } else {
                iHash2 = 0;
            }
            int i11 = i10 + iHash2;
            List list3 = this.f91766c;
            if (list3 != null) {
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    iHash3 += ((e) it3.next()).hash();
                }
            }
            int iHashCode2 = i11 + iHash3 + this.f91767d.hashCode();
            this.f91768e = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ws) BuiltInParserKt.getBuiltInParserComponent().d8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public static final class d implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static final c f91770l = new c(null);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final Expression f91771m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final xc f91772n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final Expression f91773o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final Expression f91774p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Expression f91775q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private static final xc f91776r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private static final Function2 f91777s;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final a f91778a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f91779b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final xc f91780c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f91781d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Expression f91782e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression f91783f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression f91784g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Expression f91785h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression f91786i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final xc f91787j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Integer f91788k;

        public static final class a implements JSONSerializable, Hashable {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final b f91789d = new b(null);

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private static final c f91790e = c.AUTO;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private static final Function2 f91791f = C1049a.f91795f;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Expression f91792a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final c f91793b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private Integer f91794c;

            /* JADX INFO: renamed from: k8.us$d$a$a, reason: collision with other inner class name */
            static final class C1049a extends Lambda implements Function2 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final C1049a f91795f = new C1049a();

                C1049a() {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return a.f91789d.a(parsingEnvironment, jSONObject);
                }
            }

            public static final class b {
                public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final a a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                    return ((et.b) BuiltInParserKt.getBuiltInParserComponent().j8().getValue()).deserialize(parsingEnvironment, jSONObject);
                }

                private b() {
                }
            }

            public enum c {
                NONE("none"),
                BUTTON("button"),
                IMAGE("image"),
                TEXT("text"),
                AUTO("auto");


                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public static final C1051c f91796c = new C1051c(null);

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public static final Function1 f91797d = b.f91807f;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public static final Function1 f91798e = C1050a.f91806f;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final String f91805b;

                /* JADX INFO: renamed from: k8.us$d$a$c$a, reason: collision with other inner class name */
                static final class C1050a extends Lambda implements Function1 {

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public static final C1050a f91806f = new C1050a();

                    C1050a() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final c invoke(String str) {
                        return c.f91796c.a(str);
                    }
                }

                static final class b extends Lambda implements Function1 {

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    public static final b f91807f = new b();

                    b() {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke(c cVar) {
                        return c.f91796c.b(cVar);
                    }
                }

                /* JADX INFO: renamed from: k8.us$d$a$c$c, reason: collision with other inner class name */
                public static final class C1051c {
                    public /* synthetic */ C1051c(DefaultConstructorMarker defaultConstructorMarker) {
                        this();
                    }

                    public final c a(String str) {
                        c cVar = c.NONE;
                        if (Intrinsics.areEqual(str, cVar.f91805b)) {
                            return cVar;
                        }
                        c cVar2 = c.BUTTON;
                        if (Intrinsics.areEqual(str, cVar2.f91805b)) {
                            return cVar2;
                        }
                        c cVar3 = c.IMAGE;
                        if (Intrinsics.areEqual(str, cVar3.f91805b)) {
                            return cVar3;
                        }
                        c cVar4 = c.TEXT;
                        if (Intrinsics.areEqual(str, cVar4.f91805b)) {
                            return cVar4;
                        }
                        c cVar5 = c.AUTO;
                        if (Intrinsics.areEqual(str, cVar5.f91805b)) {
                            return cVar5;
                        }
                        return null;
                    }

                    public final String b(c cVar) {
                        return cVar.f91805b;
                    }

                    private C1051c() {
                    }
                }

                c(String str) {
                    this.f91805b = str;
                }
            }

            public a(Expression expression, c cVar) {
                this.f91792a = expression;
                this.f91793b = cVar;
            }

            public final boolean a(a aVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
                if (aVar == null) {
                    return false;
                }
                Expression expression = this.f91792a;
                String str = expression != null ? (String) expression.evaluate(expressionResolver) : null;
                Expression expression2 = aVar.f91792a;
                return Intrinsics.areEqual(str, expression2 != null ? (String) expression2.evaluate(expressionResolver2) : null) && this.f91793b == aVar.f91793b;
            }

            @Override // com.yandex.div.data.Hashable
            public int hash() {
                Integer num = this.f91794c;
                if (num != null) {
                    return num.intValue();
                }
                int iHashCode = kotlin.jvm.internal.v0.b(a.class).hashCode();
                Expression expression = this.f91792a;
                int iHashCode2 = iHashCode + (expression != null ? expression.hashCode() : 0) + this.f91793b.hashCode();
                this.f91794c = Integer.valueOf(iHashCode2);
                return iHashCode2;
            }

            @Override // com.yandex.div.json.JSONSerializable
            public JSONObject writeToJSON() {
                return ((et.b) BuiltInParserKt.getBuiltInParserComponent().j8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
            }
        }

        static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91808f = new b();

            b() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return d.f91770l.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((gt.e) BuiltInParserKt.getBuiltInParserComponent().m8().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private c() {
            }
        }

        /* JADX INFO: renamed from: k8.us$d$d, reason: collision with other inner class name */
        public enum EnumC1052d {
            NORMAL(Constants.NORMAL),
            REVERSED("reversed");


            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final c f91809c = new c(null);

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final Function1 f91810d = b.f91817f;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final Function1 f91811e = a.f91816f;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private final String f91815b;

            /* JADX INFO: renamed from: k8.us$d$d$a */
            static final class a extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final a f91816f = new a();

                a() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final EnumC1052d invoke(String str) {
                    return EnumC1052d.f91809c.a(str);
                }
            }

            /* JADX INFO: renamed from: k8.us$d$d$b */
            static final class b extends Lambda implements Function1 {

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public static final b f91817f = new b();

                b() {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(EnumC1052d enumC1052d) {
                    return EnumC1052d.f91809c.b(enumC1052d);
                }
            }

            /* JADX INFO: renamed from: k8.us$d$d$c */
            public static final class c {
                public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                    this();
                }

                public final EnumC1052d a(String str) {
                    EnumC1052d enumC1052d = EnumC1052d.NORMAL;
                    if (Intrinsics.areEqual(str, enumC1052d.f91815b)) {
                        return enumC1052d;
                    }
                    EnumC1052d enumC1052d2 = EnumC1052d.REVERSED;
                    if (Intrinsics.areEqual(str, enumC1052d2.f91815b)) {
                        return enumC1052d2;
                    }
                    return null;
                }

                public final String b(EnumC1052d enumC1052d) {
                    return enumC1052d.f91815b;
                }

                private c() {
                }
            }

            EnumC1052d(String str) {
                this.f91815b = str;
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f91771m = Expression.Companion.constant$default(companion, vs.CENTER, null, 2, null);
            int i10 = 1;
            f91772n = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, 0 == true ? 1 : 0);
            f91773o = Expression.Companion.constant$default(companion, EnumC1052d.NORMAL, null, 2, null);
            f91774p = Expression.Companion.constant$default(companion, Boolean.FALSE, null, 2, null);
            f91775q = Expression.Companion.constant$default(companion, g7.SOURCE_IN, null, 2, null);
            f91776r = new xc(0 == true ? 1 : 0, Expression.Companion.constant$default(companion, 20L, null, 2, null), i10, 0 == true ? 1 : 0);
            f91777s = b.f91808f;
        }

        public d(a aVar, Expression expression, xc xcVar, Expression expression2, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, xc xcVar2) {
            this.f91778a = aVar;
            this.f91779b = expression;
            this.f91780c = xcVar;
            this.f91781d = expression2;
            this.f91782e = expression3;
            this.f91783f = expression4;
            this.f91784g = expression5;
            this.f91785h = expression6;
            this.f91786i = expression7;
            this.f91787j = xcVar2;
        }

        public final boolean a(d dVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
            if (dVar == null) {
                return false;
            }
            a aVar = this.f91778a;
            if ((aVar != null ? aVar.a(dVar.f91778a, expressionResolver, expressionResolver2) : dVar.f91778a == null) && this.f91779b.evaluate(expressionResolver) == dVar.f91779b.evaluate(expressionResolver2) && this.f91780c.a(dVar.f91780c, expressionResolver, expressionResolver2) && this.f91781d.evaluate(expressionResolver) == dVar.f91781d.evaluate(expressionResolver2) && ((Boolean) this.f91782e.evaluate(expressionResolver)).booleanValue() == ((Boolean) dVar.f91782e.evaluate(expressionResolver2)).booleanValue() && ((Number) this.f91783f.evaluate(expressionResolver)).longValue() == ((Number) dVar.f91783f.evaluate(expressionResolver2)).longValue()) {
                Expression expression = this.f91784g;
                Integer num = expression != null ? (Integer) expression.evaluate(expressionResolver) : null;
                Expression expression2 = dVar.f91784g;
                if (Intrinsics.areEqual(num, expression2 != null ? (Integer) expression2.evaluate(expressionResolver2) : null) && this.f91785h.evaluate(expressionResolver) == dVar.f91785h.evaluate(expressionResolver2) && Intrinsics.areEqual(this.f91786i.evaluate(expressionResolver), dVar.f91786i.evaluate(expressionResolver2)) && this.f91787j.a(dVar.f91787j, expressionResolver, expressionResolver2)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f91788k;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(d.class).hashCode();
            a aVar = this.f91778a;
            int iHash = iHashCode + (aVar != null ? aVar.hash() : 0) + this.f91779b.hashCode() + this.f91780c.hash() + this.f91781d.hashCode() + this.f91782e.hashCode() + this.f91783f.hashCode();
            Expression expression = this.f91784g;
            int iHashCode2 = iHash + (expression != null ? expression.hashCode() : 0) + this.f91785h.hashCode() + this.f91786i.hashCode() + this.f91787j.hash();
            this.f91788k = Integer.valueOf(iHashCode2);
            return iHashCode2;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((gt.e) BuiltInParserKt.getBuiltInParserComponent().m8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public static final class e implements JSONSerializable, Hashable {
        private static final Expression A;
        private static final Function2 B;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public static final b f91818x = new b(null);

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final Expression f91819y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Expression f91820z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f91821a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Expression f91822b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final st f91823c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Expression f91824d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final xt f91825e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Expression f91826f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final Expression f91827g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Expression f91828h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final Expression f91829i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final Expression f91830j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final Expression f91831k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final Expression f91832l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public final Expression f91833m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public final Expression f91834n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public final Expression f91835o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public final iu f91836p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final Expression f91837q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final Expression f91838r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final Expression f91839s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final oo f91840t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final Expression f91841u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final Expression f91842v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private Integer f91843w;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91844f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final e invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return e.f91818x.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final e a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((hu.g) BuiltInParserKt.getBuiltInParserComponent().y8().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        static {
            Expression.Companion companion = Expression.INSTANCE;
            f91819y = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
            f91820z = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
            A = Expression.Companion.constant$default(companion, 0L, null, 2, null);
            B = a.f91844f;
        }

        public e(List list, Expression expression, st stVar, Expression expression2, xt xtVar, Expression expression3, Expression expression4, Expression expression5, Expression expression6, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, iu iuVar, Expression expression13, Expression expression14, Expression expression15, oo ooVar, Expression expression16, Expression expression17) {
            this.f91821a = list;
            this.f91822b = expression;
            this.f91823c = stVar;
            this.f91824d = expression2;
            this.f91825e = xtVar;
            this.f91826f = expression3;
            this.f91827g = expression4;
            this.f91828h = expression5;
            this.f91829i = expression6;
            this.f91830j = expression7;
            this.f91831k = expression8;
            this.f91832l = expression9;
            this.f91833m = expression10;
            this.f91834n = expression11;
            this.f91835o = expression12;
            this.f91836p = iuVar;
            this.f91837q = expression13;
            this.f91838r = expression14;
            this.f91839s = expression15;
            this.f91840t = ooVar;
            this.f91841u = expression16;
            this.f91842v = expression17;
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
        /* JADX WARN: Removed duplicated region for block: B:28:0x0053  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x0062  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final boolean a(k8.us.e r9, com.yandex.div.json.expressions.ExpressionResolver r10, com.yandex.div.json.expressions.ExpressionResolver r11) {
            /*
                Method dump skipped, instruction units count: 633
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: k8.us.e.a(k8.us$e, com.yandex.div.json.expressions.ExpressionResolver, com.yandex.div.json.expressions.ExpressionResolver):boolean");
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            int iHash;
            Integer num = this.f91843w;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(e.class).hashCode();
            List list = this.f91821a;
            if (list != null) {
                Iterator it = list.iterator();
                iHash = 0;
                while (it.hasNext()) {
                    iHash += ((j1) it.next()).hash();
                }
            } else {
                iHash = 0;
            }
            int i10 = iHashCode + iHash;
            Expression expression = this.f91822b;
            int iHashCode2 = i10 + (expression != null ? expression.hashCode() : 0);
            st stVar = this.f91823c;
            int iHash2 = iHashCode2 + (stVar != null ? stVar.hash() : 0) + this.f91824d.hashCode();
            xt xtVar = this.f91825e;
            int iHash3 = iHash2 + (xtVar != null ? xtVar.hash() : 0);
            Expression expression2 = this.f91826f;
            int iHashCode3 = iHash3 + (expression2 != null ? expression2.hashCode() : 0);
            Expression expression3 = this.f91827g;
            int iHashCode4 = iHashCode3 + (expression3 != null ? expression3.hashCode() : 0);
            Expression expression4 = this.f91828h;
            int iHashCode5 = iHashCode4 + (expression4 != null ? expression4.hashCode() : 0);
            Expression expression5 = this.f91829i;
            int iHashCode6 = iHashCode5 + (expression5 != null ? expression5.hashCode() : 0) + this.f91830j.hashCode();
            Expression expression6 = this.f91831k;
            int iHashCode7 = iHashCode6 + (expression6 != null ? expression6.hashCode() : 0);
            Expression expression7 = this.f91832l;
            int iHashCode8 = iHashCode7 + (expression7 != null ? expression7.hashCode() : 0);
            Expression expression8 = this.f91833m;
            int iHashCode9 = iHashCode8 + (expression8 != null ? expression8.hashCode() : 0);
            Expression expression9 = this.f91834n;
            int iHashCode10 = iHashCode9 + (expression9 != null ? expression9.hashCode() : 0);
            Expression expression10 = this.f91835o;
            int iHashCode11 = iHashCode10 + (expression10 != null ? expression10.hashCode() : 0);
            iu iuVar = this.f91836p;
            int iHash4 = iHashCode11 + (iuVar != null ? iuVar.hash() : 0) + this.f91837q.hashCode();
            Expression expression11 = this.f91838r;
            int iHashCode12 = iHash4 + (expression11 != null ? expression11.hashCode() : 0);
            Expression expression12 = this.f91839s;
            int iHashCode13 = iHashCode12 + (expression12 != null ? expression12.hashCode() : 0);
            oo ooVar = this.f91840t;
            int iHash5 = iHashCode13 + (ooVar != null ? ooVar.hash() : 0);
            Expression expression13 = this.f91841u;
            int iHashCode14 = iHash5 + (expression13 != null ? expression13.hashCode() : 0);
            Expression expression14 = this.f91842v;
            int iHashCode15 = iHashCode14 + (expression14 != null ? expression14.hashCode() : 0);
            this.f91843w = Integer.valueOf(iHashCode15);
            return iHashCode15;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((hu.g) BuiltInParserKt.getBuiltInParserComponent().y8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public enum f {
        NONE("none"),
        START("start"),
        END("end"),
        MIDDLE("middle");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f91845c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f91846d = b.f91855f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f91847e = a.f91854f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f91853b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f91854f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final f invoke(String str) {
                return f.f91845c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f91855f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(f fVar) {
                return f.f91845c.b(fVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final f a(String str) {
                f fVar = f.NONE;
                if (Intrinsics.areEqual(str, fVar.f91853b)) {
                    return fVar;
                }
                f fVar2 = f.START;
                if (Intrinsics.areEqual(str, fVar2.f91853b)) {
                    return fVar2;
                }
                f fVar3 = f.END;
                if (Intrinsics.areEqual(str, fVar3.f91853b)) {
                    return fVar3;
                }
                f fVar4 = f.MIDDLE;
                if (Intrinsics.areEqual(str, fVar4.f91853b)) {
                    return fVar4;
                }
                return null;
            }

            public final String b(f fVar) {
                return fVar.f91853b;
            }

            private c() {
            }
        }

        f(String str) {
            this.f91853b = str;
        }
    }

    static {
        Expression.Companion companion = Expression.INSTANCE;
        Expression expressionConstant$default = Expression.Companion.constant$default(companion, 100L, null, 2, null);
        Expression expressionConstant$default2 = Expression.Companion.constant$default(companion, Double.valueOf(0.6d), null, 2, null);
        Expression expressionConstant$default3 = Expression.Companion.constant$default(companion, a6.c.FADE, null, 2, null);
        Double dValueOf = Double.valueOf(1.0d);
        f91710t0 = new a6(expressionConstant$default, expressionConstant$default2, null, null, expressionConstant$default3, null, null, Expression.Companion.constant$default(companion, dValueOf, null, 2, null), 108, null);
        f91711u0 = Expression.Companion.constant$default(companion, dValueOf, null, 2, null);
        f91712v0 = Expression.Companion.constant$default(companion, Boolean.TRUE, null, 2, null);
        f91713w0 = Expression.Companion.constant$default(companion, 12L, null, 2, null);
        f91714x0 = Expression.Companion.constant$default(companion, jp.SP, null, 2, null);
        f91715y0 = new ep.e(new nx(null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 7, 0 == true ? 1 : 0));
        f91716z0 = Expression.Companion.constant$default(companion, Double.valueOf(0.0d), null, 2, null);
        Boolean bool = Boolean.FALSE;
        A0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        ei eiVar = ei.NONE;
        B0 = Expression.Companion.constant$default(companion, eiVar, null, 2, null);
        C0 = Expression.Companion.constant$default(companion, y5.START, null, 2, null);
        D0 = Expression.Companion.constant$default(companion, z5.TOP, null, 2, null);
        E0 = Expression.Companion.constant$default(companion, Integer.valueOf(ViewCompat.MEASURED_STATE_MASK), null, 2, null);
        F0 = Expression.Companion.constant$default(companion, bool, null, 2, null);
        G0 = Expression.Companion.constant$default(companion, f.END, null, 2, null);
        H0 = Expression.Companion.constant$default(companion, eiVar, null, 2, null);
        I0 = Expression.Companion.constant$default(companion, gx.VISIBLE, null, 2, null);
        J0 = new ep.d(new ni(null, null, null, 7, 0 == true ? 1 : 0));
        K0 = a.f91761f;
    }

    public us(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, l7 l7Var, Expression expression5, Expression expression6, List list4, List list5, c cVar, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, Expression expression15, Expression expression16, List list11, hb hbVar, Expression expression17, Expression expression18, hb hbVar2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, zs zsVar, oo ooVar, Expression expression27, List list16, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, hx hxVar, List list20, ep epVar2) {
        this.f91717a = g1Var;
        this.f91719b = j1Var;
        this.f91721c = a6Var;
        this.f91723d = list;
        this.f91725e = expression;
        this.f91727f = expression2;
        this.f91729g = expression3;
        this.f91731h = list2;
        this.f91733i = expression4;
        this.f91735j = list3;
        this.f91737k = l7Var;
        this.f91739l = expression5;
        this.f91741m = expression6;
        this.f91743n = list4;
        this.f91745o = list5;
        this.f91747p = cVar;
        this.f91749q = list6;
        this.f91751r = bdVar;
        this.f91753s = expression7;
        this.f91754t = expression8;
        this.f91755u = expression9;
        this.f91756v = expression10;
        this.f91757w = expression11;
        this.f91758x = expression12;
        this.f91759y = expression13;
        this.f91760z = expression14;
        this.A = list7;
        this.B = epVar;
        this.C = list8;
        this.D = list9;
        this.E = str;
        this.F = list10;
        this.G = zhVar;
        this.H = expression15;
        this.I = expression16;
        this.J = list11;
        this.K = hbVar;
        this.L = expression17;
        this.M = expression18;
        this.N = hbVar2;
        this.O = list12;
        this.P = list13;
        this.Q = list14;
        this.R = expression19;
        this.S = expression20;
        this.T = expression21;
        this.U = list15;
        this.V = expression22;
        this.W = expression23;
        this.X = expression24;
        this.Y = expression25;
        this.Z = expression26;
        this.f91718a0 = zsVar;
        this.f91720b0 = ooVar;
        this.f91722c0 = expression27;
        this.f91724d0 = list16;
        this.f91726e0 = wvVar;
        this.f91728f0 = y7Var;
        this.f91730g0 = r6Var;
        this.f91732h0 = r6Var2;
        this.f91734i0 = list17;
        this.f91736j0 = expression28;
        this.f91738k0 = expression29;
        this.f91740l0 = list18;
        this.f91742m0 = list19;
        this.f91744n0 = expression30;
        this.f91746o0 = hxVar;
        this.f91748p0 = list20;
        this.f91750q0 = epVar2;
    }

    public static /* synthetic */ us z(us usVar, g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, l7 l7Var, Expression expression5, Expression expression6, List list4, List list5, c cVar, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, Expression expression15, Expression expression16, List list11, hb hbVar, Expression expression17, Expression expression18, hb hbVar2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, zs zsVar, oo ooVar, Expression expression27, List list16, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, hx hxVar, List list20, ep epVar2, int i10, int i11, int i12, Object obj) {
        g1 g1VarO = (i10 & 1) != 0 ? usVar.o() : g1Var;
        j1 j1Var2 = (i10 & 2) != 0 ? usVar.f91719b : j1Var;
        a6 a6Var2 = (i10 & 4) != 0 ? usVar.f91721c : a6Var;
        List list21 = (i10 & 8) != 0 ? usVar.f91723d : list;
        Expression expressionG = (i10 & 16) != 0 ? usVar.g() : expression;
        Expression expressionM = (i10 & 32) != 0 ? usVar.m() : expression2;
        Expression alpha = (i10 & 64) != 0 ? usVar.getAlpha() : expression3;
        List listW = (i10 & 128) != 0 ? usVar.w() : list2;
        Expression expression31 = (i10 & 256) != 0 ? usVar.f91733i : expression4;
        List background = (i10 & 512) != 0 ? usVar.getBackground() : list3;
        l7 l7VarX = (i10 & 1024) != 0 ? usVar.x() : l7Var;
        Expression expression32 = (i10 & 2048) != 0 ? usVar.f91739l : expression5;
        Expression expressionB = (i10 & 4096) != 0 ? usVar.b() : expression6;
        g1 g1Var2 = g1VarO;
        List listK = (i10 & 8192) != 0 ? usVar.k() : list4;
        List list22 = (i10 & 16384) != 0 ? usVar.f91745o : list5;
        c cVar2 = (i10 & 32768) != 0 ? usVar.f91747p : cVar;
        List extensions = (i10 & 65536) != 0 ? usVar.getExtensions() : list6;
        bd bdVarN = (i10 & 131072) != 0 ? usVar.n() : bdVar;
        c cVar3 = cVar2;
        Expression expression33 = (i10 & 262144) != 0 ? usVar.f91753s : expression7;
        Expression expression34 = (i10 & 524288) != 0 ? usVar.f91754t : expression8;
        Expression expression35 = (i10 & 1048576) != 0 ? usVar.f91755u : expression9;
        Expression expression36 = (i10 & 2097152) != 0 ? usVar.f91756v : expression10;
        Expression expression37 = (i10 & 4194304) != 0 ? usVar.f91757w : expression11;
        Expression expression38 = (i10 & 8388608) != 0 ? usVar.f91758x : expression12;
        Expression expression39 = (i10 & 16777216) != 0 ? usVar.f91759y : expression13;
        Expression expression40 = (i10 & 33554432) != 0 ? usVar.f91760z : expression14;
        List listU = (i10 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? usVar.u() : list7;
        ep height = (i10 & 134217728) != 0 ? usVar.getHeight() : epVar;
        Expression expression41 = expression40;
        List list23 = (i10 & 268435456) != 0 ? usVar.C : list8;
        List list24 = (i10 & 536870912) != 0 ? usVar.D : list9;
        String id2 = (i10 & 1073741824) != 0 ? usVar.getId() : str;
        List list25 = list24;
        List list26 = (i10 & Integer.MIN_VALUE) != 0 ? usVar.F : list10;
        zh zhVarR = (i11 & 1) != 0 ? usVar.r() : zhVar;
        List list27 = list26;
        Expression expression42 = (i11 & 2) != 0 ? usVar.H : expression15;
        Expression expression43 = (i11 & 4) != 0 ? usVar.I : expression16;
        List list28 = (i11 & 8) != 0 ? usVar.J : list11;
        return usVar.y(g1Var2, j1Var2, a6Var2, list21, expressionG, expressionM, alpha, listW, expression31, background, l7VarX, expression32, expressionB, listK, list22, cVar3, extensions, bdVarN, expression33, expression34, expression35, expression36, expression37, expression38, expression39, expression41, listU, height, list23, list25, id2, list27, zhVarR, expression42, expression43, list28, (i11 & 16) != 0 ? usVar.d() : hbVar, (i11 & 32) != 0 ? usVar.L : expression17, (i11 & 64) != 0 ? usVar.M : expression18, (i11 & 128) != 0 ? usVar.p() : hbVar2, (i11 & 256) != 0 ? usVar.O : list12, (i11 & 512) != 0 ? usVar.P : list13, (i11 & 1024) != 0 ? usVar.Q : list14, (i11 & 2048) != 0 ? usVar.f() : expression19, (i11 & 4096) != 0 ? usVar.e() : expression20, (i11 & 8192) != 0 ? usVar.T : expression21, (i11 & 16384) != 0 ? usVar.q() : list15, (i11 & 32768) != 0 ? usVar.V : expression22, (i11 & 65536) != 0 ? usVar.W : expression23, (i11 & 131072) != 0 ? usVar.X : expression24, (i11 & 262144) != 0 ? usVar.Y : expression25, (i11 & 524288) != 0 ? usVar.Z : expression26, (i11 & 1048576) != 0 ? usVar.f91718a0 : zsVar, (i11 & 2097152) != 0 ? usVar.f91720b0 : ooVar, (i11 & 4194304) != 0 ? usVar.f91722c0 : expression27, (i11 & 8388608) != 0 ? usVar.h() : list16, (i11 & 16777216) != 0 ? usVar.getTransform() : wvVar, (i11 & 33554432) != 0 ? usVar.j() : y7Var, (i11 & AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL) != 0 ? usVar.v() : r6Var, (i11 & 134217728) != 0 ? usVar.i() : r6Var2, (i11 & 268435456) != 0 ? usVar.l() : list17, (i11 & 536870912) != 0 ? usVar.f91736j0 : expression28, (i11 & 1073741824) != 0 ? usVar.f91738k0 : expression29, (i11 & Integer.MIN_VALUE) != 0 ? usVar.s() : list18, (i12 & 1) != 0 ? usVar.c() : list19, (i12 & 2) != 0 ? usVar.getVisibility() : expression30, (i12 & 4) != 0 ? usVar.t() : hxVar, (i12 & 8) != 0 ? usVar.a() : list20, (i12 & 16) != 0 ? usVar.getWidth() : epVar2);
    }

    public final boolean A(us usVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        boolean z19;
        boolean z20;
        boolean z21;
        boolean z22;
        boolean z23;
        boolean z24;
        boolean z25;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        if (usVar == null) {
            return false;
        }
        g1 g1VarO = o();
        if (g1VarO != null ? g1VarO.a(usVar.o(), expressionResolver, expressionResolver2) : usVar.o() == null) {
            j1 j1Var = this.f91719b;
            if ((j1Var != null ? j1Var.a(usVar.f91719b, expressionResolver, expressionResolver2) : usVar.f91719b == null) && this.f91721c.a(usVar.f91721c, expressionResolver, expressionResolver2)) {
                List list = this.f91723d;
                if (list != null) {
                    List list2 = usVar.f91723d;
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
                if (usVar.f91723d != null) {
                    z10 = false;
                    break;
                }
                z10 = true;
                if (z10) {
                    Expression expressionG = g();
                    y5 y5Var = expressionG != null ? (y5) expressionG.evaluate(expressionResolver) : null;
                    Expression expressionG2 = usVar.g();
                    if (y5Var == (expressionG2 != null ? (y5) expressionG2.evaluate(expressionResolver2) : null)) {
                        Expression expressionM = m();
                        z5 z5Var = expressionM != null ? (z5) expressionM.evaluate(expressionResolver) : null;
                        Expression expressionM2 = usVar.m();
                        if (z5Var == (expressionM2 != null ? (z5) expressionM2.evaluate(expressionResolver2) : null)) {
                            if (((Number) getAlpha().evaluate(expressionResolver)).doubleValue() == ((Number) usVar.getAlpha().evaluate(expressionResolver2)).doubleValue()) {
                                List listW = w();
                                if (listW != null) {
                                    List listW2 = usVar.w();
                                    if (listW2 != null) {
                                        if (listW.size() == listW2.size()) {
                                            int i12 = 0;
                                            for (Object obj2 : listW) {
                                                int i13 = i12 + 1;
                                                if (i12 < 0) {
                                                    CollectionsKt.throwIndexOverflow();
                                                }
                                                if (((h6) obj2).a((h6) listW2.get(i12), expressionResolver, expressionResolver2)) {
                                                    i12 = i13;
                                                }
                                            }
                                            z11 = true;
                                        }
                                        z11 = false;
                                        break;
                                    }
                                    return false;
                                }
                                if (usVar.w() != null) {
                                    z11 = false;
                                    break;
                                }
                                z11 = true;
                                if (z11) {
                                    Expression expression = this.f91733i;
                                    Boolean bool = expression != null ? (Boolean) expression.evaluate(expressionResolver) : null;
                                    Expression expression2 = usVar.f91733i;
                                    if (Intrinsics.areEqual(bool, expression2 != null ? (Boolean) expression2.evaluate(expressionResolver2) : null)) {
                                        List background = getBackground();
                                        if (background != null) {
                                            List background2 = usVar.getBackground();
                                            if (background2 != null) {
                                                if (background.size() == background2.size()) {
                                                    int i14 = 0;
                                                    for (Object obj3 : background) {
                                                        int i15 = i14 + 1;
                                                        if (i14 < 0) {
                                                            CollectionsKt.throwIndexOverflow();
                                                        }
                                                        if (((a7) obj3).a((a7) background2.get(i14), expressionResolver, expressionResolver2)) {
                                                            i14 = i15;
                                                        }
                                                    }
                                                    z12 = true;
                                                }
                                                z12 = false;
                                                break;
                                            }
                                            return false;
                                        }
                                        if (usVar.getBackground() != null) {
                                            z12 = false;
                                            break;
                                        }
                                        z12 = true;
                                        if (z12) {
                                            l7 l7VarX = x();
                                            if ((l7VarX != null ? l7VarX.a(usVar.x(), expressionResolver, expressionResolver2) : usVar.x() == null) && ((Boolean) this.f91739l.evaluate(expressionResolver)).booleanValue() == ((Boolean) usVar.f91739l.evaluate(expressionResolver2)).booleanValue()) {
                                                Expression expressionB = b();
                                                Long l10 = expressionB != null ? (Long) expressionB.evaluate(expressionResolver) : null;
                                                Expression expressionB2 = usVar.b();
                                                if (Intrinsics.areEqual(l10, expressionB2 != null ? (Long) expressionB2.evaluate(expressionResolver2) : null)) {
                                                    List listK = k();
                                                    if (listK != null) {
                                                        List listK2 = usVar.k();
                                                        if (listK2 != null) {
                                                            if (listK.size() == listK2.size()) {
                                                                int i16 = 0;
                                                                for (Object obj4 : listK) {
                                                                    int i17 = i16 + 1;
                                                                    if (i16 < 0) {
                                                                        CollectionsKt.throwIndexOverflow();
                                                                    }
                                                                    if (((ra) obj4).g((ra) listK2.get(i16), expressionResolver, expressionResolver2)) {
                                                                        i16 = i17;
                                                                    }
                                                                }
                                                                z13 = true;
                                                            }
                                                            z13 = false;
                                                            break;
                                                        }
                                                        return false;
                                                    }
                                                    if (usVar.k() != null) {
                                                        z13 = false;
                                                        break;
                                                    }
                                                    z13 = true;
                                                    if (z13) {
                                                        List list3 = this.f91745o;
                                                        if (list3 != null) {
                                                            List list4 = usVar.f91745o;
                                                            if (list4 != null) {
                                                                if (list3.size() == list4.size()) {
                                                                    int i18 = 0;
                                                                    for (Object obj5 : list3) {
                                                                        int i19 = i18 + 1;
                                                                        if (i18 < 0) {
                                                                            CollectionsKt.throwIndexOverflow();
                                                                        }
                                                                        if (((j1) obj5).a((j1) list4.get(i18), expressionResolver, expressionResolver2)) {
                                                                            i18 = i19;
                                                                        }
                                                                    }
                                                                    z14 = true;
                                                                }
                                                                z14 = false;
                                                                break;
                                                            }
                                                            return false;
                                                        }
                                                        if (usVar.f91745o != null) {
                                                            z14 = false;
                                                            break;
                                                        }
                                                        z14 = true;
                                                        if (z14) {
                                                            c cVar = this.f91747p;
                                                            if (cVar != null ? cVar.a(usVar.f91747p, expressionResolver, expressionResolver2) : usVar.f91747p == null) {
                                                                List extensions = getExtensions();
                                                                if (extensions != null) {
                                                                    List extensions2 = usVar.getExtensions();
                                                                    if (extensions2 != null) {
                                                                        if (extensions.size() == extensions2.size()) {
                                                                            int i20 = 0;
                                                                            for (Object obj6 : extensions) {
                                                                                int i21 = i20 + 1;
                                                                                if (i20 < 0) {
                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                }
                                                                                if (((rb) obj6).a((rb) extensions2.get(i20), expressionResolver, expressionResolver2)) {
                                                                                    i20 = i21;
                                                                                }
                                                                            }
                                                                            z15 = true;
                                                                        }
                                                                        z15 = false;
                                                                        break;
                                                                    }
                                                                    return false;
                                                                }
                                                                if (usVar.getExtensions() != null) {
                                                                    z15 = false;
                                                                    break;
                                                                }
                                                                z15 = true;
                                                                if (z15) {
                                                                    bd bdVarN = n();
                                                                    if (bdVarN != null ? bdVarN.a(usVar.n(), expressionResolver, expressionResolver2) : usVar.n() == null) {
                                                                        Expression expression3 = this.f91753s;
                                                                        Integer num = expression3 != null ? (Integer) expression3.evaluate(expressionResolver) : null;
                                                                        Expression expression4 = usVar.f91753s;
                                                                        if (Intrinsics.areEqual(num, expression4 != null ? (Integer) expression4.evaluate(expressionResolver2) : null)) {
                                                                            Expression expression5 = this.f91754t;
                                                                            String str = expression5 != null ? (String) expression5.evaluate(expressionResolver) : null;
                                                                            Expression expression6 = usVar.f91754t;
                                                                            if (Intrinsics.areEqual(str, expression6 != null ? (String) expression6.evaluate(expressionResolver2) : null)) {
                                                                                Expression expression7 = this.f91755u;
                                                                                String str2 = expression7 != null ? (String) expression7.evaluate(expressionResolver) : null;
                                                                                Expression expression8 = usVar.f91755u;
                                                                                if (Intrinsics.areEqual(str2, expression8 != null ? (String) expression8.evaluate(expressionResolver2) : null) && ((Number) this.f91756v.evaluate(expressionResolver)).longValue() == ((Number) usVar.f91756v.evaluate(expressionResolver2)).longValue() && this.f91757w.evaluate(expressionResolver) == usVar.f91757w.evaluate(expressionResolver2)) {
                                                                                    Expression expression9 = this.f91758x;
                                                                                    JSONObject jSONObject = expression9 != null ? (JSONObject) expression9.evaluate(expressionResolver) : null;
                                                                                    Expression expression10 = usVar.f91758x;
                                                                                    if (Intrinsics.areEqual(jSONObject, expression10 != null ? (JSONObject) expression10.evaluate(expressionResolver2) : null)) {
                                                                                        Expression expression11 = this.f91759y;
                                                                                        jd jdVar = expression11 != null ? (jd) expression11.evaluate(expressionResolver) : null;
                                                                                        Expression expression12 = usVar.f91759y;
                                                                                        if (jdVar == (expression12 != null ? (jd) expression12.evaluate(expressionResolver2) : null)) {
                                                                                            Expression expression13 = this.f91760z;
                                                                                            Long l11 = expression13 != null ? (Long) expression13.evaluate(expressionResolver) : null;
                                                                                            Expression expression14 = usVar.f91760z;
                                                                                            if (Intrinsics.areEqual(l11, expression14 != null ? (Long) expression14.evaluate(expressionResolver2) : null)) {
                                                                                                List listU = u();
                                                                                                if (listU != null) {
                                                                                                    List listU2 = usVar.u();
                                                                                                    if (listU2 != null) {
                                                                                                        if (listU.size() == listU2.size()) {
                                                                                                            int i22 = 0;
                                                                                                            for (Object obj7 : listU) {
                                                                                                                int i23 = i22 + 1;
                                                                                                                if (i22 < 0) {
                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                }
                                                                                                                if (((kd) obj7).a((kd) listU2.get(i22), expressionResolver, expressionResolver2)) {
                                                                                                                    i22 = i23;
                                                                                                                }
                                                                                                            }
                                                                                                            z16 = true;
                                                                                                        }
                                                                                                        z16 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    return false;
                                                                                                }
                                                                                                if (usVar.u() != null) {
                                                                                                    z16 = false;
                                                                                                    break;
                                                                                                }
                                                                                                z16 = true;
                                                                                                if (z16 && getHeight().a(usVar.getHeight(), expressionResolver, expressionResolver2)) {
                                                                                                    List list5 = this.C;
                                                                                                    if (list5 != null) {
                                                                                                        List list6 = usVar.C;
                                                                                                        if (list6 != null) {
                                                                                                            if (list5.size() == list6.size()) {
                                                                                                                int i24 = 0;
                                                                                                                for (Object obj8 : list5) {
                                                                                                                    int i25 = i24 + 1;
                                                                                                                    if (i24 < 0) {
                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                    }
                                                                                                                    if (((j1) obj8).a((j1) list6.get(i24), expressionResolver, expressionResolver2)) {
                                                                                                                        i24 = i25;
                                                                                                                    }
                                                                                                                }
                                                                                                                z17 = true;
                                                                                                            }
                                                                                                            z17 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        return false;
                                                                                                    }
                                                                                                    if (usVar.C != null) {
                                                                                                        z17 = false;
                                                                                                        break;
                                                                                                    }
                                                                                                    z17 = true;
                                                                                                    if (z17) {
                                                                                                        List list7 = this.D;
                                                                                                        if (list7 != null) {
                                                                                                            List list8 = usVar.D;
                                                                                                            if (list8 != null) {
                                                                                                                if (list7.size() == list8.size()) {
                                                                                                                    int i26 = 0;
                                                                                                                    for (Object obj9 : list7) {
                                                                                                                        int i27 = i26 + 1;
                                                                                                                        if (i26 < 0) {
                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                        }
                                                                                                                        if (((j1) obj9).a((j1) list8.get(i26), expressionResolver, expressionResolver2)) {
                                                                                                                            i26 = i27;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    z18 = true;
                                                                                                                }
                                                                                                                z18 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            return false;
                                                                                                        }
                                                                                                        if (usVar.D != null) {
                                                                                                            z18 = false;
                                                                                                            break;
                                                                                                        }
                                                                                                        z18 = true;
                                                                                                        if (z18 && Intrinsics.areEqual(getId(), usVar.getId())) {
                                                                                                            List list9 = this.F;
                                                                                                            if (list9 != null) {
                                                                                                                List list10 = usVar.F;
                                                                                                                if (list10 != null) {
                                                                                                                    if (list9.size() == list10.size()) {
                                                                                                                        int i28 = 0;
                                                                                                                        for (Object obj10 : list9) {
                                                                                                                            int i29 = i28 + 1;
                                                                                                                            if (i28 < 0) {
                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                            }
                                                                                                                            if (((d) obj10).a((d) list10.get(i28), expressionResolver, expressionResolver2)) {
                                                                                                                                i28 = i29;
                                                                                                                            }
                                                                                                                        }
                                                                                                                        z19 = true;
                                                                                                                    }
                                                                                                                    z19 = false;
                                                                                                                    break;
                                                                                                                }
                                                                                                                return false;
                                                                                                            }
                                                                                                            if (usVar.F != null) {
                                                                                                                z19 = false;
                                                                                                                break;
                                                                                                            }
                                                                                                            z19 = true;
                                                                                                            if (z19) {
                                                                                                                zh zhVarR = r();
                                                                                                                if (zhVarR != null ? zhVarR.a(usVar.r(), expressionResolver, expressionResolver2) : usVar.r() == null) {
                                                                                                                    if (((Number) this.H.evaluate(expressionResolver)).doubleValue() == ((Number) usVar.H.evaluate(expressionResolver2)).doubleValue()) {
                                                                                                                        Expression expression15 = this.I;
                                                                                                                        Long l12 = expression15 != null ? (Long) expression15.evaluate(expressionResolver) : null;
                                                                                                                        Expression expression16 = usVar.I;
                                                                                                                        if (Intrinsics.areEqual(l12, expression16 != null ? (Long) expression16.evaluate(expressionResolver2) : null)) {
                                                                                                                            List list11 = this.J;
                                                                                                                            if (list11 != null) {
                                                                                                                                List list12 = usVar.J;
                                                                                                                                if (list12 != null) {
                                                                                                                                    if (list11.size() == list12.size()) {
                                                                                                                                        int i30 = 0;
                                                                                                                                        for (Object obj11 : list11) {
                                                                                                                                            int i31 = i30 + 1;
                                                                                                                                            if (i30 < 0) {
                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                            }
                                                                                                                                            if (((j1) obj11).a((j1) list12.get(i30), expressionResolver, expressionResolver2)) {
                                                                                                                                                i30 = i31;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        z20 = true;
                                                                                                                                    }
                                                                                                                                    z20 = false;
                                                                                                                                    break;
                                                                                                                                }
                                                                                                                                return false;
                                                                                                                            }
                                                                                                                            if (usVar.J != null) {
                                                                                                                                z20 = false;
                                                                                                                                break;
                                                                                                                            }
                                                                                                                            z20 = true;
                                                                                                                            if (z20) {
                                                                                                                                hb hbVarD = d();
                                                                                                                                if (hbVarD != null ? hbVarD.a(usVar.d(), expressionResolver, expressionResolver2) : usVar.d() == null) {
                                                                                                                                    Expression expression17 = this.L;
                                                                                                                                    Long l13 = expression17 != null ? (Long) expression17.evaluate(expressionResolver) : null;
                                                                                                                                    Expression expression18 = usVar.L;
                                                                                                                                    if (Intrinsics.areEqual(l13, expression18 != null ? (Long) expression18.evaluate(expressionResolver2) : null)) {
                                                                                                                                        Expression expression19 = this.M;
                                                                                                                                        Long l14 = expression19 != null ? (Long) expression19.evaluate(expressionResolver) : null;
                                                                                                                                        Expression expression20 = usVar.M;
                                                                                                                                        if (Intrinsics.areEqual(l14, expression20 != null ? (Long) expression20.evaluate(expressionResolver2) : null)) {
                                                                                                                                            hb hbVarP = p();
                                                                                                                                            if (hbVarP != null ? hbVarP.a(usVar.p(), expressionResolver, expressionResolver2) : usVar.p() == null) {
                                                                                                                                                List list13 = this.O;
                                                                                                                                                if (list13 != null) {
                                                                                                                                                    List list14 = usVar.O;
                                                                                                                                                    if (list14 != null) {
                                                                                                                                                        if (list13.size() == list14.size()) {
                                                                                                                                                            int i32 = 0;
                                                                                                                                                            for (Object obj12 : list13) {
                                                                                                                                                                int i33 = i32 + 1;
                                                                                                                                                                if (i32 < 0) {
                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                }
                                                                                                                                                                if (((j1) obj12).a((j1) list14.get(i32), expressionResolver, expressionResolver2)) {
                                                                                                                                                                    i32 = i33;
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            z21 = true;
                                                                                                                                                        }
                                                                                                                                                        z21 = false;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    return false;
                                                                                                                                                }
                                                                                                                                                if (usVar.O != null) {
                                                                                                                                                    z21 = false;
                                                                                                                                                    break;
                                                                                                                                                }
                                                                                                                                                z21 = true;
                                                                                                                                                if (z21) {
                                                                                                                                                    List list15 = this.P;
                                                                                                                                                    if (list15 != null) {
                                                                                                                                                        List list16 = usVar.P;
                                                                                                                                                        if (list16 != null) {
                                                                                                                                                            if (list15.size() == list16.size()) {
                                                                                                                                                                int i34 = 0;
                                                                                                                                                                for (Object obj13 : list15) {
                                                                                                                                                                    int i35 = i34 + 1;
                                                                                                                                                                    if (i34 < 0) {
                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                    }
                                                                                                                                                                    if (((j1) obj13).a((j1) list16.get(i34), expressionResolver, expressionResolver2)) {
                                                                                                                                                                        i34 = i35;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                z22 = true;
                                                                                                                                                            }
                                                                                                                                                            z22 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        return false;
                                                                                                                                                    }
                                                                                                                                                    if (usVar.P != null) {
                                                                                                                                                        z22 = false;
                                                                                                                                                        break;
                                                                                                                                                    }
                                                                                                                                                    z22 = true;
                                                                                                                                                    if (z22) {
                                                                                                                                                        List list17 = this.Q;
                                                                                                                                                        if (list17 != null) {
                                                                                                                                                            List list18 = usVar.Q;
                                                                                                                                                            if (list18 != null) {
                                                                                                                                                                if (list17.size() == list18.size()) {
                                                                                                                                                                    int i36 = 0;
                                                                                                                                                                    for (Object obj14 : list17) {
                                                                                                                                                                        int i37 = i36 + 1;
                                                                                                                                                                        if (i36 < 0) {
                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                        }
                                                                                                                                                                        if (((e) obj14).a((e) list18.get(i36), expressionResolver, expressionResolver2)) {
                                                                                                                                                                            i36 = i37;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                    z23 = true;
                                                                                                                                                                }
                                                                                                                                                                z23 = false;
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            return false;
                                                                                                                                                        }
                                                                                                                                                        if (usVar.Q != null) {
                                                                                                                                                            z23 = false;
                                                                                                                                                            break;
                                                                                                                                                        }
                                                                                                                                                        z23 = true;
                                                                                                                                                        if (z23) {
                                                                                                                                                            Expression expressionF = f();
                                                                                                                                                            String str3 = expressionF != null ? (String) expressionF.evaluate(expressionResolver) : null;
                                                                                                                                                            Expression expressionF2 = usVar.f();
                                                                                                                                                            if (Intrinsics.areEqual(str3, expressionF2 != null ? (String) expressionF2.evaluate(expressionResolver2) : null)) {
                                                                                                                                                                Expression expressionE = e();
                                                                                                                                                                Long l15 = expressionE != null ? (Long) expressionE.evaluate(expressionResolver) : null;
                                                                                                                                                                Expression expressionE2 = usVar.e();
                                                                                                                                                                if (Intrinsics.areEqual(l15, expressionE2 != null ? (Long) expressionE2.evaluate(expressionResolver2) : null) && ((Boolean) this.T.evaluate(expressionResolver)).booleanValue() == ((Boolean) usVar.T.evaluate(expressionResolver2)).booleanValue()) {
                                                                                                                                                                    List listQ = q();
                                                                                                                                                                    if (listQ != null) {
                                                                                                                                                                        List listQ2 = usVar.q();
                                                                                                                                                                        if (listQ2 != null) {
                                                                                                                                                                            if (listQ.size() == listQ2.size()) {
                                                                                                                                                                                int i38 = 0;
                                                                                                                                                                                for (Object obj15 : listQ) {
                                                                                                                                                                                    int i39 = i38 + 1;
                                                                                                                                                                                    if (i38 < 0) {
                                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                    }
                                                                                                                                                                                    if (((j1) obj15).a((j1) listQ2.get(i38), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                        i38 = i39;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                                z24 = true;
                                                                                                                                                                            }
                                                                                                                                                                            z24 = false;
                                                                                                                                                                            break;
                                                                                                                                                                        }
                                                                                                                                                                        return false;
                                                                                                                                                                    }
                                                                                                                                                                    if (usVar.q() != null) {
                                                                                                                                                                        z24 = false;
                                                                                                                                                                        break;
                                                                                                                                                                    }
                                                                                                                                                                    z24 = true;
                                                                                                                                                                    if (z24 && this.V.evaluate(expressionResolver) == usVar.V.evaluate(expressionResolver2) && Intrinsics.areEqual(this.W.evaluate(expressionResolver), usVar.W.evaluate(expressionResolver2)) && this.X.evaluate(expressionResolver) == usVar.X.evaluate(expressionResolver2) && this.Y.evaluate(expressionResolver) == usVar.Y.evaluate(expressionResolver2) && ((Number) this.Z.evaluate(expressionResolver)).intValue() == ((Number) usVar.Z.evaluate(expressionResolver2)).intValue()) {
                                                                                                                                                                        zs zsVar = this.f91718a0;
                                                                                                                                                                        if (zsVar != null ? zsVar.a(usVar.f91718a0, expressionResolver, expressionResolver2) : usVar.f91718a0 == null) {
                                                                                                                                                                            oo ooVar = this.f91720b0;
                                                                                                                                                                            if ((ooVar != null ? ooVar.a(usVar.f91720b0, expressionResolver, expressionResolver2) : usVar.f91720b0 == null) && ((Boolean) this.f91722c0.evaluate(expressionResolver)).booleanValue() == ((Boolean) usVar.f91722c0.evaluate(expressionResolver2)).booleanValue()) {
                                                                                                                                                                                List listH = h();
                                                                                                                                                                                if (listH != null) {
                                                                                                                                                                                    List listH2 = usVar.h();
                                                                                                                                                                                    if (listH2 != null) {
                                                                                                                                                                                        if (listH.size() == listH2.size()) {
                                                                                                                                                                                            int i40 = 0;
                                                                                                                                                                                            for (Object obj16 : listH) {
                                                                                                                                                                                                int i41 = i40 + 1;
                                                                                                                                                                                                if (i40 < 0) {
                                                                                                                                                                                                    CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                }
                                                                                                                                                                                                if (((dv) obj16).a((dv) listH2.get(i40), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                                    i40 = i41;
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                            z25 = true;
                                                                                                                                                                                        }
                                                                                                                                                                                        z25 = false;
                                                                                                                                                                                        break;
                                                                                                                                                                                    }
                                                                                                                                                                                    return false;
                                                                                                                                                                                }
                                                                                                                                                                                if (usVar.h() != null) {
                                                                                                                                                                                    z25 = false;
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                z25 = true;
                                                                                                                                                                                if (z25) {
                                                                                                                                                                                    wv transform = getTransform();
                                                                                                                                                                                    if (transform != null ? transform.a(usVar.getTransform(), expressionResolver, expressionResolver2) : usVar.getTransform() == null) {
                                                                                                                                                                                        y7 y7VarJ = j();
                                                                                                                                                                                        if (y7VarJ != null ? y7VarJ.a(usVar.j(), expressionResolver, expressionResolver2) : usVar.j() == null) {
                                                                                                                                                                                            r6 r6VarV = v();
                                                                                                                                                                                            if (r6VarV != null ? r6VarV.a(usVar.v(), expressionResolver, expressionResolver2) : usVar.v() == null) {
                                                                                                                                                                                                r6 r6VarI = i();
                                                                                                                                                                                                if (r6VarI != null ? r6VarI.a(usVar.i(), expressionResolver, expressionResolver2) : usVar.i() == null) {
                                                                                                                                                                                                    List listL = l();
                                                                                                                                                                                                    if (listL != null) {
                                                                                                                                                                                                        List listL2 = usVar.l();
                                                                                                                                                                                                        if (listL2 != null) {
                                                                                                                                                                                                            if (listL.size() == listL2.size()) {
                                                                                                                                                                                                                int i42 = 0;
                                                                                                                                                                                                                for (Object obj17 : listL) {
                                                                                                                                                                                                                    int i43 = i42 + 1;
                                                                                                                                                                                                                    if (i42 < 0) {
                                                                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (((aw) obj17) == ((aw) listL2.get(i42))) {
                                                                                                                                                                                                                        i42 = i43;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                                z26 = true;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            z26 = false;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        return false;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    if (usVar.l() != null) {
                                                                                                                                                                                                        z26 = false;
                                                                                                                                                                                                        break;
                                                                                                                                                                                                    }
                                                                                                                                                                                                    z26 = true;
                                                                                                                                                                                                    if (z26 && this.f91736j0.evaluate(expressionResolver) == usVar.f91736j0.evaluate(expressionResolver2) && this.f91738k0.evaluate(expressionResolver) == usVar.f91738k0.evaluate(expressionResolver2)) {
                                                                                                                                                                                                        List listS = s();
                                                                                                                                                                                                        if (listS != null) {
                                                                                                                                                                                                            List listS2 = usVar.s();
                                                                                                                                                                                                            if (listS2 != null) {
                                                                                                                                                                                                                if (listS.size() == listS2.size()) {
                                                                                                                                                                                                                    int i44 = 0;
                                                                                                                                                                                                                    for (Object obj18 : listS) {
                                                                                                                                                                                                                        int i45 = i44 + 1;
                                                                                                                                                                                                                        if (i44 < 0) {
                                                                                                                                                                                                                            CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        if (((bw) obj18).a((bw) listS2.get(i44), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                                                            i44 = i45;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    z27 = true;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                z27 = false;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            return false;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        if (usVar.s() != null) {
                                                                                                                                                                                                            z27 = false;
                                                                                                                                                                                                            break;
                                                                                                                                                                                                        }
                                                                                                                                                                                                        z27 = true;
                                                                                                                                                                                                        if (z27) {
                                                                                                                                                                                                            List listC = c();
                                                                                                                                                                                                            if (listC != null) {
                                                                                                                                                                                                                List listC2 = usVar.c();
                                                                                                                                                                                                                if (listC2 != null) {
                                                                                                                                                                                                                    if (listC.size() == listC2.size()) {
                                                                                                                                                                                                                        int i46 = 0;
                                                                                                                                                                                                                        for (Object obj19 : listC) {
                                                                                                                                                                                                                            int i47 = i46 + 1;
                                                                                                                                                                                                                            if (i46 < 0) {
                                                                                                                                                                                                                                CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            if (((kw) obj19).a((kw) listC2.get(i46), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                                                                i46 = i47;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        z28 = true;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    z28 = false;
                                                                                                                                                                                                                    break;
                                                                                                                                                                                                                }
                                                                                                                                                                                                                return false;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            if (usVar.c() != null) {
                                                                                                                                                                                                                z28 = false;
                                                                                                                                                                                                                break;
                                                                                                                                                                                                            }
                                                                                                                                                                                                            z28 = true;
                                                                                                                                                                                                            if (z28 && getVisibility().evaluate(expressionResolver) == usVar.getVisibility().evaluate(expressionResolver2)) {
                                                                                                                                                                                                                hx hxVarT = t();
                                                                                                                                                                                                                if (hxVarT != null ? hxVarT.g(usVar.t(), expressionResolver, expressionResolver2) : usVar.t() == null) {
                                                                                                                                                                                                                    List listA = a();
                                                                                                                                                                                                                    if (listA != null) {
                                                                                                                                                                                                                        List listA2 = usVar.a();
                                                                                                                                                                                                                        if (listA2 != null) {
                                                                                                                                                                                                                            if (listA.size() == listA2.size()) {
                                                                                                                                                                                                                                int i48 = 0;
                                                                                                                                                                                                                                for (Object obj20 : listA) {
                                                                                                                                                                                                                                    int i49 = i48 + 1;
                                                                                                                                                                                                                                    if (i48 < 0) {
                                                                                                                                                                                                                                        CollectionsKt.throwIndexOverflow();
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                    if (((hx) obj20).g((hx) listA2.get(i48), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                                                                        i48 = i49;
                                                                                                                                                                                                                                    }
                                                                                                                                                                                                                                }
                                                                                                                                                                                                                                z29 = true;
                                                                                                                                                                                                                            }
                                                                                                                                                                                                                            z29 = false;
                                                                                                                                                                                                                            break;
                                                                                                                                                                                                                        }
                                                                                                                                                                                                                        return false;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    if (usVar.a() != null) {
                                                                                                                                                                                                                        z29 = false;
                                                                                                                                                                                                                        break;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                    z29 = true;
                                                                                                                                                                                                                    if (z29 && getWidth().a(usVar.getWidth(), expressionResolver, expressionResolver2)) {
                                                                                                                                                                                                                        return true;
                                                                                                                                                                                                                    }
                                                                                                                                                                                                                }
                                                                                                                                                                                                            }
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public /* synthetic */ int B() {
        return v7.b.a(this);
    }

    @Override // k8.f7
    public List a() {
        return this.f91748p0;
    }

    @Override // k8.f7
    public Expression b() {
        return this.f91741m;
    }

    @Override // k8.f7
    public List c() {
        return this.f91742m0;
    }

    @Override // k8.f7
    public hb d() {
        return this.K;
    }

    @Override // k8.f7
    public Expression e() {
        return this.S;
    }

    @Override // k8.f7
    public Expression f() {
        return this.R;
    }

    @Override // k8.f7
    public Expression g() {
        return this.f91725e;
    }

    @Override // k8.f7
    public Expression getAlpha() {
        return this.f91729g;
    }

    @Override // k8.f7
    public List getBackground() {
        return this.f91735j;
    }

    @Override // k8.f7
    public List getExtensions() {
        return this.f91749q;
    }

    @Override // k8.f7
    public ep getHeight() {
        return this.B;
    }

    @Override // k8.f7
    public String getId() {
        return this.E;
    }

    @Override // k8.f7
    public wv getTransform() {
        return this.f91726e0;
    }

    @Override // k8.f7
    public Expression getVisibility() {
        return this.f91744n0;
    }

    @Override // k8.f7
    public ep getWidth() {
        return this.f91750q0;
    }

    @Override // k8.f7
    public List h() {
        return this.f91724d0;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        int iHash4;
        int iHash5;
        int iHash6;
        int iHash7;
        int iHash8;
        int iHash9;
        int iHash10;
        int iHash11;
        int iHash12;
        int iHash13;
        int iHash14;
        int iHash15;
        int iHash16;
        int iHash17;
        int iHash18;
        Integer num = this.f91752r0;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(us.class).hashCode();
        g1 g1VarO = o();
        int iHash19 = 0;
        int iHash20 = iHashCode + (g1VarO != null ? g1VarO.hash() : 0);
        j1 j1Var = this.f91719b;
        int iHash21 = iHash20 + (j1Var != null ? j1Var.hash() : 0) + this.f91721c.hash();
        List list = this.f91723d;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((j1) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHash21 + iHash;
        Expression expressionG = g();
        int iHashCode2 = i10 + (expressionG != null ? expressionG.hashCode() : 0);
        Expression expressionM = m();
        int iHashCode3 = iHashCode2 + (expressionM != null ? expressionM.hashCode() : 0) + getAlpha().hashCode();
        List listW = w();
        if (listW != null) {
            Iterator it2 = listW.iterator();
            iHash2 = 0;
            while (it2.hasNext()) {
                iHash2 += ((h6) it2.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int i11 = iHashCode3 + iHash2;
        Expression expression = this.f91733i;
        int iHashCode4 = i11 + (expression != null ? expression.hashCode() : 0);
        List background = getBackground();
        if (background != null) {
            Iterator it3 = background.iterator();
            iHash3 = 0;
            while (it3.hasNext()) {
                iHash3 += ((a7) it3.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i12 = iHashCode4 + iHash3;
        l7 l7VarX = x();
        int iHash22 = i12 + (l7VarX != null ? l7VarX.hash() : 0) + this.f91739l.hashCode();
        Expression expressionB = b();
        int iHashCode5 = iHash22 + (expressionB != null ? expressionB.hashCode() : 0);
        List listK = k();
        if (listK != null) {
            Iterator it4 = listK.iterator();
            iHash4 = 0;
            while (it4.hasNext()) {
                iHash4 += ((ra) it4.next()).hash();
            }
        } else {
            iHash4 = 0;
        }
        int i13 = iHashCode5 + iHash4;
        List list2 = this.f91745o;
        if (list2 != null) {
            Iterator it5 = list2.iterator();
            iHash5 = 0;
            while (it5.hasNext()) {
                iHash5 += ((j1) it5.next()).hash();
            }
        } else {
            iHash5 = 0;
        }
        int i14 = i13 + iHash5;
        c cVar = this.f91747p;
        int iHash23 = i14 + (cVar != null ? cVar.hash() : 0);
        List extensions = getExtensions();
        if (extensions != null) {
            Iterator it6 = extensions.iterator();
            iHash6 = 0;
            while (it6.hasNext()) {
                iHash6 += ((rb) it6.next()).hash();
            }
        } else {
            iHash6 = 0;
        }
        int i15 = iHash23 + iHash6;
        bd bdVarN = n();
        int iHash24 = i15 + (bdVarN != null ? bdVarN.hash() : 0);
        Expression expression2 = this.f91753s;
        int iHashCode6 = iHash24 + (expression2 != null ? expression2.hashCode() : 0);
        Expression expression3 = this.f91754t;
        int iHashCode7 = iHashCode6 + (expression3 != null ? expression3.hashCode() : 0);
        Expression expression4 = this.f91755u;
        int iHashCode8 = iHashCode7 + (expression4 != null ? expression4.hashCode() : 0) + this.f91756v.hashCode() + this.f91757w.hashCode();
        Expression expression5 = this.f91758x;
        int iHashCode9 = iHashCode8 + (expression5 != null ? expression5.hashCode() : 0);
        Expression expression6 = this.f91759y;
        int iHashCode10 = iHashCode9 + (expression6 != null ? expression6.hashCode() : 0);
        Expression expression7 = this.f91760z;
        int iHashCode11 = iHashCode10 + (expression7 != null ? expression7.hashCode() : 0);
        List listU = u();
        if (listU != null) {
            Iterator it7 = listU.iterator();
            iHash7 = 0;
            while (it7.hasNext()) {
                iHash7 += ((kd) it7.next()).hash();
            }
        } else {
            iHash7 = 0;
        }
        int iHash25 = iHashCode11 + iHash7 + getHeight().hash();
        List list3 = this.C;
        if (list3 != null) {
            Iterator it8 = list3.iterator();
            iHash8 = 0;
            while (it8.hasNext()) {
                iHash8 += ((j1) it8.next()).hash();
            }
        } else {
            iHash8 = 0;
        }
        int i16 = iHash25 + iHash8;
        List list4 = this.D;
        if (list4 != null) {
            Iterator it9 = list4.iterator();
            iHash9 = 0;
            while (it9.hasNext()) {
                iHash9 += ((j1) it9.next()).hash();
            }
        } else {
            iHash9 = 0;
        }
        int i17 = i16 + iHash9;
        String id2 = getId();
        int iHashCode12 = i17 + (id2 != null ? id2.hashCode() : 0);
        List list5 = this.F;
        if (list5 != null) {
            Iterator it10 = list5.iterator();
            iHash10 = 0;
            while (it10.hasNext()) {
                iHash10 += ((d) it10.next()).hash();
            }
        } else {
            iHash10 = 0;
        }
        int i18 = iHashCode12 + iHash10;
        zh zhVarR = r();
        int iHash26 = i18 + (zhVarR != null ? zhVarR.hash() : 0) + this.H.hashCode();
        Expression expression8 = this.I;
        int iHashCode13 = iHash26 + (expression8 != null ? expression8.hashCode() : 0);
        List list6 = this.J;
        if (list6 != null) {
            Iterator it11 = list6.iterator();
            iHash11 = 0;
            while (it11.hasNext()) {
                iHash11 += ((j1) it11.next()).hash();
            }
        } else {
            iHash11 = 0;
        }
        int i19 = iHashCode13 + iHash11;
        hb hbVarD = d();
        int iHash27 = i19 + (hbVarD != null ? hbVarD.hash() : 0);
        Expression expression9 = this.L;
        int iHashCode14 = iHash27 + (expression9 != null ? expression9.hashCode() : 0);
        Expression expression10 = this.M;
        int iHashCode15 = iHashCode14 + (expression10 != null ? expression10.hashCode() : 0);
        hb hbVarP = p();
        int iHash28 = iHashCode15 + (hbVarP != null ? hbVarP.hash() : 0);
        List list7 = this.O;
        if (list7 != null) {
            Iterator it12 = list7.iterator();
            iHash12 = 0;
            while (it12.hasNext()) {
                iHash12 += ((j1) it12.next()).hash();
            }
        } else {
            iHash12 = 0;
        }
        int i20 = iHash28 + iHash12;
        List list8 = this.P;
        if (list8 != null) {
            Iterator it13 = list8.iterator();
            iHash13 = 0;
            while (it13.hasNext()) {
                iHash13 += ((j1) it13.next()).hash();
            }
        } else {
            iHash13 = 0;
        }
        int i21 = i20 + iHash13;
        List list9 = this.Q;
        if (list9 != null) {
            Iterator it14 = list9.iterator();
            iHash14 = 0;
            while (it14.hasNext()) {
                iHash14 += ((e) it14.next()).hash();
            }
        } else {
            iHash14 = 0;
        }
        int i22 = i21 + iHash14;
        Expression expressionF = f();
        int iHashCode16 = i22 + (expressionF != null ? expressionF.hashCode() : 0);
        Expression expressionE = e();
        int iHashCode17 = iHashCode16 + (expressionE != null ? expressionE.hashCode() : 0) + this.T.hashCode();
        List listQ = q();
        if (listQ != null) {
            Iterator it15 = listQ.iterator();
            iHash15 = 0;
            while (it15.hasNext()) {
                iHash15 += ((j1) it15.next()).hash();
            }
        } else {
            iHash15 = 0;
        }
        int iHashCode18 = iHashCode17 + iHash15 + this.V.hashCode() + this.W.hashCode() + this.X.hashCode() + this.Y.hashCode() + this.Z.hashCode();
        zs zsVar = this.f91718a0;
        int iHash29 = iHashCode18 + (zsVar != null ? zsVar.hash() : 0);
        oo ooVar = this.f91720b0;
        int iHash30 = iHash29 + (ooVar != null ? ooVar.hash() : 0) + this.f91722c0.hashCode();
        List listH = h();
        if (listH != null) {
            Iterator it16 = listH.iterator();
            iHash16 = 0;
            while (it16.hasNext()) {
                iHash16 += ((dv) it16.next()).hash();
            }
        } else {
            iHash16 = 0;
        }
        int i23 = iHash30 + iHash16;
        wv transform = getTransform();
        int iHash31 = i23 + (transform != null ? transform.hash() : 0);
        y7 y7VarJ = j();
        int iHash32 = iHash31 + (y7VarJ != null ? y7VarJ.hash() : 0);
        r6 r6VarV = v();
        int iHash33 = iHash32 + (r6VarV != null ? r6VarV.hash() : 0);
        r6 r6VarI = i();
        int iHash34 = iHash33 + (r6VarI != null ? r6VarI.hash() : 0);
        List listL = l();
        int iHashCode19 = iHash34 + (listL != null ? listL.hashCode() : 0) + this.f91736j0.hashCode() + this.f91738k0.hashCode();
        List listS = s();
        if (listS != null) {
            Iterator it17 = listS.iterator();
            iHash17 = 0;
            while (it17.hasNext()) {
                iHash17 += ((bw) it17.next()).hash();
            }
        } else {
            iHash17 = 0;
        }
        int i24 = iHashCode19 + iHash17;
        List listC = c();
        if (listC != null) {
            Iterator it18 = listC.iterator();
            iHash18 = 0;
            while (it18.hasNext()) {
                iHash18 += ((kw) it18.next()).hash();
            }
        } else {
            iHash18 = 0;
        }
        int iHashCode20 = i24 + iHash18 + getVisibility().hashCode();
        hx hxVarT = t();
        int iHash35 = iHashCode20 + (hxVarT != null ? hxVarT.hash() : 0);
        List listA = a();
        if (listA != null) {
            Iterator it19 = listA.iterator();
            while (it19.hasNext()) {
                iHash19 += ((hx) it19.next()).hash();
            }
        }
        int iHash36 = iHash35 + iHash19 + getWidth().hash();
        this.f91752r0 = Integer.valueOf(iHash36);
        return iHash36;
    }

    @Override // k8.f7
    public r6 i() {
        return this.f91732h0;
    }

    @Override // k8.f7
    public y7 j() {
        return this.f91728f0;
    }

    @Override // k8.f7
    public List k() {
        return this.f91743n;
    }

    @Override // k8.f7
    public List l() {
        return this.f91734i0;
    }

    @Override // k8.f7
    public Expression m() {
        return this.f91727f;
    }

    @Override // k8.f7
    public bd n() {
        return this.f91751r;
    }

    @Override // k8.f7
    public g1 o() {
        return this.f91717a;
    }

    @Override // k8.f7
    public hb p() {
        return this.N;
    }

    @Override // k8.f7
    public List q() {
        return this.U;
    }

    @Override // k8.f7
    public zh r() {
        return this.G;
    }

    @Override // k8.f7
    public List s() {
        return this.f91740l0;
    }

    @Override // k8.f7
    public hx t() {
        return this.f91746o0;
    }

    @Override // k8.f7
    public List u() {
        return this.A;
    }

    @Override // k8.f7
    public r6 v() {
        return this.f91730g0;
    }

    @Override // k8.f7
    public List w() {
        return this.f91731h;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rt.l) BuiltInParserKt.getBuiltInParserComponent().p8().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    @Override // k8.f7
    public l7 x() {
        return this.f91737k;
    }

    public final us y(g1 g1Var, j1 j1Var, a6 a6Var, List list, Expression expression, Expression expression2, Expression expression3, List list2, Expression expression4, List list3, l7 l7Var, Expression expression5, Expression expression6, List list4, List list5, c cVar, List list6, bd bdVar, Expression expression7, Expression expression8, Expression expression9, Expression expression10, Expression expression11, Expression expression12, Expression expression13, Expression expression14, List list7, ep epVar, List list8, List list9, String str, List list10, zh zhVar, Expression expression15, Expression expression16, List list11, hb hbVar, Expression expression17, Expression expression18, hb hbVar2, List list12, List list13, List list14, Expression expression19, Expression expression20, Expression expression21, List list15, Expression expression22, Expression expression23, Expression expression24, Expression expression25, Expression expression26, zs zsVar, oo ooVar, Expression expression27, List list16, wv wvVar, y7 y7Var, r6 r6Var, r6 r6Var2, List list17, Expression expression28, Expression expression29, List list18, List list19, Expression expression30, hx hxVar, List list20, ep epVar2) {
        return new us(g1Var, j1Var, a6Var, list, expression, expression2, expression3, list2, expression4, list3, l7Var, expression5, expression6, list4, list5, cVar, list6, bdVar, expression7, expression8, expression9, expression10, expression11, expression12, expression13, expression14, list7, epVar, list8, list9, str, list10, zhVar, expression15, expression16, list11, hbVar, expression17, expression18, hbVar2, list12, list13, list14, expression19, expression20, expression21, list15, expression22, expression23, expression24, expression25, expression26, zsVar, ooVar, expression27, list16, wvVar, y7Var, r6Var, r6Var2, list17, expression28, expression29, list18, list19, expression30, hxVar, list20, epVar2);
    }
}
