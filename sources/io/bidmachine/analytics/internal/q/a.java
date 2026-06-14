package io.bidmachine.analytics.internal.q;

import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import lf.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f79731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C0960a f79732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C0960a f79733c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Lazy f79734d = i.a(new c());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Lazy f79735e = i.a(new b());

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.q.a$a, reason: collision with other inner class name */
    public static final class C0960a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f79736a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final List f79737b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final List f79738c;

        public C0960a(List list, List list2, List list3) {
            this.f79736a = list;
            this.f79737b = list2;
            this.f79738c = list3;
        }

        public final C0960a a(List list, List list2, List list3) {
            return new C0960a(list, list2, list3);
        }

        public final List b() {
            return this.f79738c;
        }

        public final List c() {
            return this.f79737b;
        }

        public final boolean d() {
            return this.f79736a.isEmpty() && this.f79737b.isEmpty() && this.f79738c.isEmpty();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0960a)) {
                return false;
            }
            C0960a c0960a = (C0960a) obj;
            return Intrinsics.areEqual(this.f79736a, c0960a.f79736a) && Intrinsics.areEqual(this.f79737b, c0960a.f79737b) && Intrinsics.areEqual(this.f79738c, c0960a.f79738c);
        }

        public int hashCode() {
            return (((this.f79736a.hashCode() * 31) + this.f79737b.hashCode()) * 31) + this.f79738c.hashCode();
        }

        public String toString() {
            return super.toString();
        }

        public static /* synthetic */ C0960a a(C0960a c0960a, List list, List list2, List list3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                list = c0960a.f79736a;
            }
            if ((i10 & 2) != 0) {
                list2 = c0960a.f79737b;
            }
            if ((i10 & 4) != 0) {
                list3 = c0960a.f79738c;
            }
            return c0960a.a(list, list2, list3);
        }

        public final List a() {
            return this.f79736a;
        }

        public /* synthetic */ C0960a(List list, List list2, List list3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this((i10 & 1) != 0 ? CollectionsKt.emptyList() : list, (i10 & 2) != 0 ? CollectionsKt.emptyList() : list2, (i10 & 4) != 0 ? CollectionsKt.emptyList() : list3);
        }
    }

    static final class b extends Lambda implements Function0 {
        b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return a.this.d().hashCode() + '_' + CollectionsKt.joinToString$default(CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(a.this.c().a().size()), Integer.valueOf(a.this.c().c().size()), Integer.valueOf(a.this.c().b().size()), Integer.valueOf(a.this.e().a().size()), Integer.valueOf(a.this.e().c().size()), Integer.valueOf(a.this.e().b().size())}), "_", null, null, 0, null, null, 62, null);
        }
    }

    static final class c extends Lambda implements Function0 {
        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() throws JSONException {
            JSONObject jSONObject = new JSONObject();
            a aVar = a.this;
            jSONObject.put(POBCoreNativeConstants.NATIVE_VERSION, aVar.a());
            jSONObject.put("iaa", new JSONArray((Collection) aVar.c().a()));
            jSONObject.put("iah", new JSONArray((Collection) aVar.c().c()));
            jSONObject.put("iad", new JSONArray((Collection) aVar.c().b()));
            jSONObject.put("sua", new JSONArray((Collection) aVar.e().a()));
            jSONObject.put("suh", new JSONArray((Collection) aVar.e().c()));
            jSONObject.put("sud", new JSONArray((Collection) aVar.e().b()));
            return jSONObject.toString();
        }
    }

    public a(String str, C0960a c0960a, C0960a c0960a2) {
        this.f79731a = str;
        this.f79732b = c0960a;
        this.f79733c = c0960a2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String d() {
        return (String) this.f79734d.getValue();
    }

    public final String b() {
        return (String) this.f79735e.getValue();
    }

    public final C0960a c() {
        return this.f79732b;
    }

    public final C0960a e() {
        return this.f79733c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return Intrinsics.areEqual(this.f79731a, aVar.f79731a) && Intrinsics.areEqual(this.f79732b, aVar.f79732b) && Intrinsics.areEqual(this.f79733c, aVar.f79733c);
    }

    public final boolean f() {
        return this.f79732b.d() && this.f79733c.d();
    }

    public int hashCode() {
        return (((this.f79731a.hashCode() * 31) + this.f79732b.hashCode()) * 31) + this.f79733c.hashCode();
    }

    public String toString() {
        return d();
    }

    public final String a() {
        return this.f79731a;
    }
}
