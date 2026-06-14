package io.bidmachine.analytics.internal.r;

import io.bidmachine.analytics.internal.q.a;
import io.bidmachine.analytics.internal.r.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlin.ranges.IntRange;
import lf.i;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f79881a = new b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Lazy f79882b = i.a(C0966b.f79887a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lazy f79883c = i.a(c.f79888a);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Lazy f79884d = i.a(d.f79889a);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Lazy f79885e = i.a(a.f79886a);

    static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f79886a = new a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("YXV0b1JlbmV3aW5n");
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.r.b$b, reason: collision with other inner class name */
    static final class C0966b extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0966b f79887a = new C0966b();

        C0966b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("cHJvZHVjdElk");
        }
    }

    static final class c extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f79888a = new c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("cHVyY2hhc2VUaW1l");
        }
    }

    static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f79889a = new d();

        d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final String invoke() {
            return io.bidmachine.analytics.internal.a.e.a("cXVhbnRpdHk=");
        }
    }

    public static final class e implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return mf.a.d(((io.bidmachine.analytics.internal.r.a) obj2).a(), ((io.bidmachine.analytics.internal.r.a) obj).a());
        }
    }

    static final class f extends Lambda implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f79890a = new f();

        f() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z10) {
            return b.f79881a.a(jSONObject, z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    static final class g extends Lambda implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f79891a = new g();

        g() {
            super(2);
        }

        public final List a(JSONObject jSONObject, boolean z10) {
            return b.f79881a.b(jSONObject, z10);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return a((JSONObject) obj, ((Boolean) obj2).booleanValue());
        }
    }

    private b() {
    }

    public final String c() {
        return (String) f79883c.getValue();
    }

    public final String d() {
        return (String) f79884d.getValue();
    }

    public final String a() {
        return (String) f79885e.getValue();
    }

    public final String b() {
        return (String) f79882b.getValue();
    }

    private final List b(a.C0960a c0960a) {
        return a(c0960a, g.f79891a);
    }

    public final List a(io.bidmachine.analytics.internal.q.a aVar) {
        return CollectionsKt.sortedWith(CollectionsKt.plus((Collection) b(aVar.e()), (Iterable) a(aVar.c())), new e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List b(JSONObject jSONObject, boolean z10) throws JSONException {
        a.EnumC0965a enumC0965a;
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int iOptInt = jSONObject.optInt(d(), 1);
        if (jSONObject.optBoolean(a(), false)) {
            enumC0965a = a.EnumC0965a.SUBS_AUTO_RENEWABLE;
        } else {
            enumC0965a = a.EnumC0965a.SUBS_NON_AUTO_RENEWABLE;
        }
        io.bidmachine.analytics.internal.r.a aVar = new io.bidmachine.analytics.internal.r.a(string, enumC0965a, date, z10);
        IntRange intRangeV = kotlin.ranges.g.v(0, iOptInt);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.r.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }

    private final List a(a.C0960a c0960a) {
        return a(c0960a, f.f79890a);
    }

    private final List a(a.C0960a c0960a, Function2 function2) {
        Object objB;
        Object objB2;
        Object objB3;
        Object objB4;
        List listA = c0960a.a();
        ArrayList<JSONObject> arrayList = new ArrayList();
        Iterator it = listA.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            try {
                Result.Companion companion = Result.f93230c;
                objB4 = Result.b(new JSONObject(str));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.f93230c;
                objB4 = Result.b(kotlin.d.a(th2));
            }
            JSONObject jSONObject = (JSONObject) (Result.i(objB4) ? null : objB4);
            if (jSONObject != null) {
                arrayList.add(jSONObject);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (JSONObject jSONObject2 : arrayList) {
            try {
                Result.Companion companion3 = Result.f93230c;
                objB3 = Result.b((List) function2.invoke(jSONObject2, Boolean.TRUE));
            } catch (Throwable th3) {
                Result.Companion companion4 = Result.f93230c;
                objB3 = Result.b(kotlin.d.a(th3));
            }
            if (Result.i(objB3)) {
                objB3 = null;
            }
            List list = (List) objB3;
            if (list != null) {
                arrayList2.add(list);
            }
        }
        List<String> listC = c0960a.c();
        ArrayList<JSONObject> arrayList3 = new ArrayList();
        for (String str2 : listC) {
            try {
                Result.Companion companion5 = Result.f93230c;
                objB2 = Result.b(new JSONObject(str2));
            } catch (Throwable th4) {
                Result.Companion companion6 = Result.f93230c;
                objB2 = Result.b(kotlin.d.a(th4));
            }
            if (Result.i(objB2)) {
                objB2 = null;
            }
            JSONObject jSONObject3 = (JSONObject) objB2;
            if (jSONObject3 != null) {
                arrayList3.add(jSONObject3);
            }
        }
        ArrayList arrayList4 = new ArrayList();
        for (JSONObject jSONObject4 : arrayList3) {
            try {
                Result.Companion companion7 = Result.f93230c;
                objB = Result.b((List) function2.invoke(jSONObject4, Boolean.FALSE));
            } catch (Throwable th5) {
                Result.Companion companion8 = Result.f93230c;
                objB = Result.b(kotlin.d.a(th5));
            }
            if (Result.i(objB)) {
                objB = null;
            }
            List list2 = (List) objB;
            if (list2 != null) {
                arrayList4.add(list2);
            }
        }
        return CollectionsKt.plus((Collection) CollectionsKt.flatten(arrayList2), (Iterable) CollectionsKt.flatten(arrayList4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List a(JSONObject jSONObject, boolean z10) throws JSONException {
        String string = jSONObject.getString(b());
        Date date = new Date(jSONObject.getLong(c()));
        int iOptInt = jSONObject.optInt(d(), 1);
        io.bidmachine.analytics.internal.r.a aVar = new io.bidmachine.analytics.internal.r.a(string, a.EnumC0965a.INAPP_CONSUMABLE, date, z10);
        IntRange intRangeV = kotlin.ranges.g.v(0, iOptInt);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeV, 10));
        Iterator it = intRangeV.iterator();
        while (it.hasNext()) {
            ((IntIterator) it).nextInt();
            arrayList.add(io.bidmachine.analytics.internal.r.a.a(aVar, null, null, null, false, 15, null));
        }
        return arrayList;
    }
}
