package k8;

import com.yandex.div.data.Hashable;
import com.yandex.div.json.JSONSerializable;
import com.yandex.div.json.ParsingEnvironment;
import com.yandex.div.json.expressions.ExpressionResolver;
import com.yandex.div.serialization.BuiltInParserKt;
import java.util.Iterator;
import java.util.List;
import k8.p6;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class n6 implements JSONSerializable, Hashable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f90001d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Function2 f90002e = a.f90006f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f90003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Integer f90004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Integer f90005c;

    static final class a extends Lambda implements Function2 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f90006f = new a();

        a() {
            super(2);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final n6 invoke(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return n6.f90001d.a(parsingEnvironment, jSONObject);
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final n6 a(ParsingEnvironment parsingEnvironment, JSONObject jSONObject) {
            return ((p6.b) BuiltInParserKt.getBuiltInParserComponent().w1().getValue()).deserialize(parsingEnvironment, jSONObject);
        }

        private b() {
        }
    }

    public n6(List list) {
        this.f90003a = list;
    }

    public final boolean a(n6 n6Var, ExpressionResolver expressionResolver, ExpressionResolver expressionResolver2) {
        if (n6Var == null) {
            return false;
        }
        List list = this.f90003a;
        List list2 = n6Var.f90003a;
        if (list.size() != list2.size()) {
            return false;
        }
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!((r6) obj).a((r6) list2.get(i10), expressionResolver, expressionResolver2)) {
                return false;
            }
            i10 = i11;
        }
        return true;
    }

    public int b() {
        Integer num = this.f90004b;
        if (num != null) {
            return num.intValue();
        }
        int iHashCode = kotlin.jvm.internal.v0.b(n6.class).hashCode();
        this.f90004b = Integer.valueOf(iHashCode);
        return iHashCode;
    }

    @Override // com.yandex.div.data.Hashable
    public int hash() {
        Integer num = this.f90005c;
        if (num != null) {
            return num.intValue();
        }
        int iB = b();
        Iterator it = this.f90003a.iterator();
        int iHash = 0;
        while (it.hasNext()) {
            iHash += ((r6) it.next()).hash();
        }
        int i10 = iB + iHash;
        this.f90005c = Integer.valueOf(i10);
        return i10;
    }

    @Override // com.yandex.div.json.JSONSerializable
    public JSONObject writeToJSON() {
        return ((p6.b) BuiltInParserKt.getBuiltInParserComponent().w1().getValue()).serialize(BuiltInParserKt.getBuiltInParsingContext(), this);
    }
}
