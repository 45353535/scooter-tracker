package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.rd;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class kd implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final b f88612f = new b(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Function2 f88613g = a.f88619f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f88614a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f88615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f88616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final qb f88617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Integer f88618e;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f88619f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final kd invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return kd.f88612f.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final kd a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((rd.b) BuiltInParserKt.getBuiltInParserComponent().I3().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public kd(List list, String str, String str2, qb qbVar) {
        this.f88614a = list;
        this.f88615b = str;
        this.f88616c = str2;
        this.f88617d = qbVar;
    }

    public final boolean a(kd kdVar, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (kdVar == null) {
            return false;
        }
        List list = this.f88614a;
        List list2 = kdVar.f88614a;
        if (list.size() == list2.size()) {
            Iterator it = list.iterator();
            int i10 = 0;
            while (true) {
                if (!it.hasNext()) {
                    if (!Intrinsics.areEqual(this.f88615b, kdVar.f88615b) || !Intrinsics.areEqual(this.f88616c, kdVar.f88616c) || this.f88617d != kdVar.f88617d) {
                        break;
                    }
                    return true;
                }
                Object next = it.next();
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                if (!((ld) next).a((ld) list2.get(i10), expressionResolver, expressionResolver2)) {
                    break;
                }
                i10 = i11;
            }
        }
        return false;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f88618e;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(kd.class).hashCode();
        Iterator it = this.f88614a.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((ld) it.next()).hash();
        }
        int iHashCode2 = iHashCode + iHash + this.f88615b.hashCode() + this.f88616c.hashCode() + this.f88617d.hashCode();
        this.f88618e = Integer.valueOf(iHashCode2);
        return iHashCode2;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((rd.b) BuiltInParserKt.getBuiltInParserComponent().I3().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
