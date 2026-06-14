package d3;

import android.util.Log;
import b3.c;
import b3.k;
import com.facebook.GraphRequest;
import com.facebook.a0;
import com.facebook.internal.z;
import com.facebook.s;
import d3.c;
import java.io.File;
import java.lang.Thread;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.g;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Thread.UncaughtExceptionHandler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f68423c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f68424d = c.class.getCanonicalName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static c f68425e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f68426b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final void d() {
            if (z.U()) {
                return;
            }
            File[] fileArrP = k.p();
            ArrayList arrayList = new ArrayList(fileArrP.length);
            for (File file : fileArrP) {
                arrayList.add(c.a.d(file));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                if (((b3.c) obj).f()) {
                    arrayList2.add(obj);
                }
            }
            final List listSortedWith = CollectionsKt.sortedWith(arrayList2, new Comparator() { // from class: d3.a
                @Override // java.util.Comparator
                public final int compare(Object obj2, Object obj3) {
                    return c.a.e((b3.c) obj2, (b3.c) obj3);
                }
            });
            JSONArray jSONArray = new JSONArray();
            Iterator it = g.v(0, Math.min(listSortedWith.size(), 5)).iterator();
            while (it.hasNext()) {
                jSONArray.put(listSortedWith.get(((IntIterator) it).nextInt()));
            }
            k.s("crash_reports", jSONArray, new GraphRequest.b() { // from class: d3.b
                @Override // com.facebook.GraphRequest.b
                public final void a(a0 a0Var) {
                    c.a.f(listSortedWith, a0Var);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final int e(b3.c cVar, b3.c o22) {
            Intrinsics.checkNotNullExpressionValue(o22, "o2");
            return cVar.b(o22);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(List validReports, a0 response) {
            JSONObject jSONObjectD;
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
        }

        public final synchronized void c() {
            try {
                if (s.q()) {
                    d();
                }
                if (c.f68425e != null) {
                    Log.w(c.f68424d, "Already enabled!");
                } else {
                    c.f68425e = new c(Thread.getDefaultUncaughtExceptionHandler(), null);
                    Thread.setDefaultUncaughtExceptionHandler(c.f68425e);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        private a() {
        }
    }

    public /* synthetic */ c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, DefaultConstructorMarker defaultConstructorMarker) {
        this(uncaughtExceptionHandler);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread t10, Throwable e10) {
        Intrinsics.checkNotNullParameter(t10, "t");
        Intrinsics.checkNotNullParameter(e10, "e");
        if (k.j(e10)) {
            b3.b.c(e10);
            c.a.b(e10, c.EnumC0126c.CrashReport).g();
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f68426b;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(t10, e10);
        }
    }

    private c(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f68426b = uncaughtExceptionHandler;
    }
}
