package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.Expression;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.ga;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class ea implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final b f87200j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final Expression f87201k = Expression.Companion.constant$default(Expression.INSTANCE, zv.NONE, null, 2, null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final Function2 f87202l = a.f87212f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f87203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f87204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f87205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f87206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Expression f87207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List f87208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f87209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f87210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Integer f87211i;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f87212f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ea invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ea.f87200j.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ea a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((ga.c) BuiltInParserKt.getBuiltInParserComponent().E2().getValue()).a(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public static final class c implements JSONSerializable, Hashable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f87213d = new b(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Function2 f87214e = a.f87218f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final y0 f87215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f87216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Integer f87217c;

        static final class a extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public static final a f87218f = new a();

            a() {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final c invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return c.f87213d.a(parsingEnvironment, jSONObject);
            }
        }

        public static final class b {
            public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final c a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
                return ((ha) BuiltInParserKt.getBuiltInParserComponent().G2().getValue()).deserialize(parsingEnvironment, jSONObject);
            }

            private b() {
            }
        }

        public c(y0 y0Var, long j10) {
            this.f87215a = y0Var;
            this.f87216b = j10;
        }

        @Override // com.yandex.div.data.Hashable
        public int hash() {
            Integer num = this.f87217c;
            if (num != null) {
                return num.intValue();
            }
            int iHashCode = kotlin.jvm.internal.v0.b(c.class).hashCode() + this.f87215a.hash() + androidx.collection.b.a(this.f87216b);
            this.f87217c = Integer.valueOf(iHashCode);
            return iHashCode;
        }

        @Override // com.yandex.div.json.JSONSerializable
        public JSONObject writeToJSON() {
            return ((ha) BuiltInParserKt.getBuiltInParserComponent().G2().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
        }
    }

    public ea(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6) {
        this.f87203a = list;
        this.f87204b = str;
        this.f87205c = list2;
        this.f87206d = list3;
        this.f87207e = expression;
        this.f87208f = list4;
        this.f87209g = list5;
        this.f87210h = list6;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        int iHash;
        int iHash2;
        int iHash3;
        Integer num = this.f87211i;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(ea.class).hashCode();
        List list = this.f87203a;
        int iHash4 = 0;
        if (list != null) {
            Iterator it = list.iterator();
            iHash = 0;
            while (it.hasNext()) {
                iHash += ((kd) it.next()).hash();
            }
        } else {
            iHash = 0;
        }
        int iHashCode2 = iHashCode + iHash + this.f87204b.hashCode();
        Iterator it2 = this.f87205c.iterator();
        int iHash5 = 0;
        while (it2.hasNext()) {
            iHash5 += ((c) it2.next()).hash();
        }
        int i10 = iHashCode2 + iHash5;
        List list2 = this.f87206d;
        if (list2 != null) {
            Iterator it3 = list2.iterator();
            iHash2 = 0;
            while (it3.hasNext()) {
                iHash2 += ((yu) it3.next()).hash();
            }
        } else {
            iHash2 = 0;
        }
        int iHashCode3 = i10 + iHash2 + this.f87207e.hashCode();
        List list3 = this.f87208f;
        if (list3 != null) {
            Iterator it4 = list3.iterator();
            iHash3 = 0;
            while (it4.hasNext()) {
                iHash3 += ((bw) it4.next()).hash();
            }
        } else {
            iHash3 = 0;
        }
        int i11 = iHashCode3 + iHash3;
        List list4 = this.f87209g;
        if (list4 != null) {
            Iterator it5 = list4.iterator();
            while (it5.hasNext()) {
                iHash4 += ((kw) it5.next()).hash();
            }
        }
        int i12 = i11 + iHash4;
        this.f87211i = Integer.valueOf(i12);
        return i12;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((ga.c) BuiltInParserKt.getBuiltInParserComponent().E2().getValue()).b(BuiltInParserKt.getBuiltInParsingContext(), this);
    }

    public /* synthetic */ ea(List list, String str, List list2, List list3, Expression expression, List list4, List list5, List list6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : list, str, list2, (i10 & 8) != 0 ? null : list3, (i10 & 16) != 0 ? f87201k : expression, (i10 & 32) != 0 ? null : list4, (i10 & 64) != 0 ? null : list5, (i10 & 128) != 0 ? null : list6);
    }
}
