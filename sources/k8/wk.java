package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.bl;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class wk implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f92192f = new c(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Expression f92193g = Expression.Companion.constant$default(Expression.INSTANCE, d.PARTIAL, null, 2, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Function2 f92194h = b.f92207f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f92195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Expression f92196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f92197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f92198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f92199e;

    public static final class a implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final b f92200e = new b(null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Function2 f92201f = C1055a.f92206f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f92202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f92203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f92204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Integer f92205d;

        /* JADX INFO: renamed from: k8.wk$a$a, reason: collision with other inner class name */
        static final class C1055a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final C1055a f92206f = new C1055a();

            C1055a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final a invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return a.f92200e.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final a a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((xk) BuiltInParserKt.getBuiltInParserComponent().F5().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public a(String str, List list) {
            this.f92202a = str;
            this.f92203b = list;
        }

        public int a() {
            Integer num = this.f92204c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(a.class).hashCode() + this.f92202a.hashCode();
            this.f92204c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f92205d;
            if (num != null) {
                return num.intValue();
            }
            int iA = a();
            List list = this.f92203b;
            int iHash = 0;
            if (list != null) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    iHash += ((y0) it.next()).hash();
                }
            }
            int i10 = iA + iHash;
            this.f92205d = Integer.valueOf(i10);
            return i10;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((xk) BuiltInParserKt.getBuiltInParserComponent().F5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    static final class b extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final b f92207f = new b();

        b() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final wk invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return wk.f92192f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final wk a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((bl.c) BuiltInParserKt.getBuiltInParserComponent().I5().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private c() {
        }
    }

    public enum d {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");


        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final c f92208c = new c(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final Function1 f92209d = b.f92216f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final Function1 f92210e = a.f92215f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92214b;

        static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f92215f = new a();

            a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final d invoke(String str) {
                return d.f92208c.a(str);
            }
        }

        static final class b extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final b f92216f = new b();

            b() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(d dVar) {
                return d.f92208c.b(dVar);
            }
        }

        public static final class c {
            public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final d a(String str) {
                d dVar = d.TRANSACTIONAL;
                if (Intrinsics.areEqual(str, dVar.f92214b)) {
                    return dVar;
                }
                d dVar2 = d.PARTIAL;
                if (Intrinsics.areEqual(str, dVar2.f92214b)) {
                    return dVar2;
                }
                return null;
            }

            public final String b(d dVar) {
                return dVar.f92214b;
            }

            private c() {
            }
        }

        d(String str) {
            this.f92214b = str;
        }
    }

    public wk(List list, Expression expression, List list2, List list3) {
        this.f92195a = list;
        this.f92196b = expression;
        this.f92197c = list2;
        this.f92198d = list3;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        Integer num = this.f92199e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(wk.class).hashCode();
        Iterator it = this.f92195a.iterator();
        int iHash2 = 0;
        int iHash3 = 0;
        while (it.hasNext()) {
            iHash3 += ((a) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash3 + this.f92196b.hashCode();
        List list = this.f92197c;
        if (list != null) {
            Iterator it2 = list.iterator();
            iHash = 0;
            while (it2.hasNext()) {
                iHash += ((j1) it2.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int i10 = iHashCode2 + iHash;
        List list2 = this.f92198d;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            while (it3.hasNext()) {
                iHash2 += ((j1) it3.next()).hash();
            }
        }
        int i11 = i10 + iHash2;
        this.f92199e = Integer.valueOf(i11);
        return i11;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((bl.c) BuiltInParserKt.getBuiltInParserComponent().I5().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
