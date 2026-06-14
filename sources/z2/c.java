package z2;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TimePicker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f119154a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List f119155b = CollectionsKt.listOf((Object[]) new Class[]{Switch.class, Spinner.class, DatePicker.class, TimePicker.class, RadioGroup.class, RatingBar.class, EditText.class, AdapterView.class});

    private c() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (r5.isClickable() == false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        r1.add(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0038, code lost:
    
        r5 = n2.f.b(r5).iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r5.hasNext() == false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r1.addAll(a((android.view.View) r5.next()));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.util.List a(android.view.View r5) {
        /*
            java.lang.Class<z2.c> r0 = z2.c.class
            boolean r1 = e3.a.d(r0)
            r2 = 0
            if (r1 == 0) goto La
            return r2
        La:
            java.lang.String r1 = "view"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r1)     // Catch: java.lang.Throwable -> L2d
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r1.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.List r3 = z2.c.f119155b     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> L2d
        L1a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> L2d
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> L2d
            boolean r4 = r4.isInstance(r5)     // Catch: java.lang.Throwable -> L2d
            if (r4 == 0) goto L1a
            goto L56
        L2d:
            r5 = move-exception
            goto L57
        L2f:
            boolean r3 = r5.isClickable()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L38
            r1.add(r5)     // Catch: java.lang.Throwable -> L2d
        L38:
            java.util.List r5 = n2.f.b(r5)     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L2d
        L40:
            boolean r3 = r5.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L56
            java.lang.Object r3 = r5.next()     // Catch: java.lang.Throwable -> L2d
            android.view.View r3 = (android.view.View) r3     // Catch: java.lang.Throwable -> L2d
            java.util.List r3 = a(r3)     // Catch: java.lang.Throwable -> L2d
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.Throwable -> L2d
            r1.addAll(r3)     // Catch: java.lang.Throwable -> L2d
            goto L40
        L56:
            return r1
        L57:
            e3.a.b(r5, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.c.a(android.view.View):java.util.List");
    }

    public static final JSONObject b(View view, View clickedView) {
        if (e3.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(clickedView, "clickedView");
            JSONObject jSONObject = new JSONObject();
            if (view == clickedView) {
                try {
                    jSONObject.put("is_interacted", true);
                } catch (JSONException unused) {
                }
            }
            e(view, jSONObject);
            JSONArray jSONArray = new JSONArray();
            Iterator it = n2.f.b(view).iterator();
            while (it.hasNext()) {
                jSONArray.put(b((View) it.next(), clickedView));
            }
            jSONObject.put("childviews", jSONArray);
            return jSONObject;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return null;
        }
    }

    private final List c(View view) {
        if (e3.a.d(this)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            for (View view2 : n2.f.b(view)) {
                String strK = n2.f.k(view2);
                if (strK.length() > 0) {
                    arrayList.add(strK);
                }
                arrayList.addAll(c(view2));
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return null;
        }
    }

    public static final String d(View hostView) {
        if (e3.a.d(c.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            String strK = n2.f.k(hostView);
            if (strK.length() > 0) {
                return strK;
            }
            String strJoin = TextUtils.join(" ", f119154a.c(hostView));
            Intrinsics.checkNotNullExpressionValue(strJoin, "join(\" \", childrenText)");
            return strJoin;
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
            return null;
        }
    }

    public static final void e(View view, JSONObject json) {
        if (e3.a.d(c.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String strK = n2.f.k(view);
                String strI = n2.f.i(view);
                json.put("classname", view.getClass().getSimpleName());
                json.put("classtypebitmask", n2.f.c(view));
                if (strK.length() > 0) {
                    json.put("text", strK);
                }
                if (strI.length() > 0) {
                    json.put("hint", strI);
                }
                if (view instanceof EditText) {
                    json.put("inputtype", ((EditText) view).getInputType());
                }
            } catch (JSONException unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, c.class);
        }
    }
}
