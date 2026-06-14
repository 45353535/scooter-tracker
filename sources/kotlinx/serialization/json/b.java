package kotlinx.serialization.json;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import zg.d1;
import zg.g1;
import zg.h1;
import zg.k1;
import zg.n1;
import zg.p0;
import zg.r0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class b implements ug.y {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f93658d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g f93659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ah.b f93660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final zg.z f93661c;

    public static final class a extends b {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
            super(new g(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null), ah.c.a(), null);
        }
    }

    public /* synthetic */ b(g gVar, ah.b bVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(gVar, bVar);
    }

    @Override // ug.k
    public ah.b a() {
        return this.f93660b;
    }

    @Override // ug.y
    public final String b(ug.n serializer, Object obj) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        r0 r0Var = new r0();
        try {
            p0.b(this, r0Var, serializer, obj);
            return r0Var.toString();
        } finally {
            r0Var.g();
        }
    }

    @Override // ug.y
    public final Object c(ug.c deserializer, String string) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(string, "string");
        g1 g1VarA = h1.a(this, string);
        Object objK = new d1(this, n1.f119451d, g1VarA, deserializer.getDescriptor(), null).k(deserializer);
        g1VarA.x();
        return objK;
    }

    public final Object d(ug.c deserializer, JsonElement element) {
        Intrinsics.checkNotNullParameter(deserializer, "deserializer");
        Intrinsics.checkNotNullParameter(element, "element");
        return k1.a(this, element, deserializer);
    }

    public final g e() {
        return this.f93659a;
    }

    public final zg.z f() {
        return this.f93661c;
    }

    private b(g gVar, ah.b bVar) {
        this.f93659a = gVar;
        this.f93660b = bVar;
        this.f93661c = new zg.z();
    }
}
