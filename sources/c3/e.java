package c3;

import b3.c;
import b3.k;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.internal.z;
import com.facebook.s;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f6507a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f6508b = new AtomicBoolean(false);

    private e() {
    }

    public static final synchronized void c() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            if (f6508b.getAndSet(true)) {
                return;
            }
            if (s.q()) {
                d();
            }
            b.d();
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    public static final void d() {
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            if (z.U()) {
                return;
            }
            File[] fileArrL = k.l();
            ArrayList arrayList = new ArrayList(fileArrL.length);
            for (File file : fileArrL) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((b3.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: c3.c
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return e.e((b3.c) obj2, (b3.c) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.v(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            k.s("anr_reports", jSONArray, new GraphRequest.b() { // from class: c3.d
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    e.f(listSortedWith, a0Var);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(b3.c cVar, b3.c o22) {
        if (e3.a.d(e.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(List validReports, a0 response) {
        JSONObject jSONObjectD;
        if (e3.a.d(e.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(validReports, "$validReports");
            Intrinsics.checkNotNullParameter(response, "response");
            try {
                if (response.b() == null && (jSONObjectD = response.d()) != null && jSONObjectD.getBoolean("success")) {
                    Iterator it = validReports.iterator();
                    while (it.hasNext()) {
                        ((b3.c) it.next()).a();
                    }
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, e.class);
        }
    }
}
