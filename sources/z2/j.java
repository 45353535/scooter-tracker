package z2;

import android.os.Bundle;
import android.view.View;
import com.facebook.GraphRequest;
import com.facebook.appevents.m0;
import com.facebook.internal.z;
import com.facebook.s;
import com.mbridge.msdk.MBridgeConstans;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import org.json.JSONException;
import org.json.JSONObject;
import w2.f;
import z2.j;

/* JADX INFO: loaded from: classes7.dex */
public final class j implements View.OnClickListener {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f119172f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Set f119173g = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final View.OnClickListener f119174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final WeakReference f119175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final WeakReference f119176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f119177e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void e(String str, String str2, float[] fArr) {
            if (e.f(str)) {
                new m0(s.m()).e(str, str2);
            } else if (e.e(str)) {
                h(str, str2, fArr);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean f(String str, final String str2) {
            final String strD = b.d(str);
            if (strD == null) {
                return false;
            }
            if (Intrinsics.areEqual(strD, "other")) {
                return true;
            }
            z.l0(new Runnable() { // from class: z2.i
                @Override // java.lang.Runnable
                public final void run() {
                    j.a.g(strD, str2);
                }
            });
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void g(String queriedEvent, String buttonText) {
            Intrinsics.checkNotNullParameter(queriedEvent, "$queriedEvent");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            j.f119172f.e(queriedEvent, buttonText, new float[0]);
        }

        private final void h(String str, String str2, float[] fArr) {
            Bundle bundle = new Bundle();
            try {
                bundle.putString(com.taurusx.tax.w.s.s.I, str);
                JSONObject jSONObject = new JSONObject();
                StringBuilder sb2 = new StringBuilder();
                for (float f10 : fArr) {
                    sb2.append(f10);
                    sb2.append(StringUtils.COMMA);
                }
                jSONObject.put("dense", sb2.toString());
                jSONObject.put("button_text", str2);
                bundle.putString("metadata", jSONObject.toString());
                GraphRequest.c cVar = GraphRequest.f19547n;
                a1 a1Var = a1.f93282a;
                String str3 = String.format(Locale.US, "%s/suggested_events", Arrays.copyOf(new Object[]{s.n()}, 1));
                Intrinsics.checkNotNullExpressionValue(str3, "format(locale, format, *args)");
                GraphRequest graphRequestA = cVar.A(null, str3, null, null);
                graphRequestA.G(bundle);
                graphRequestA.k();
            } catch (JSONException unused) {
            }
        }

        public final void d(View hostView, View rootView, String activityName) {
            Intrinsics.checkNotNullParameter(hostView, "hostView");
            Intrinsics.checkNotNullParameter(rootView, "rootView");
            Intrinsics.checkNotNullParameter(activityName, "activityName");
            int iHashCode = hostView.hashCode();
            if (j.b().contains(Integer.valueOf(iHashCode))) {
                return;
            }
            n2.f.r(hostView, new j(hostView, rootView, activityName, null));
            j.b().add(Integer.valueOf(iHashCode));
        }

        private a() {
        }
    }

    public /* synthetic */ j(View view, View view2, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, view2, str);
    }

    public static final /* synthetic */ Set b() {
        if (e3.a.d(j.class)) {
            return null;
        }
        try {
            return f119173g;
        } catch (Throwable th2) {
            e3.a.b(th2, j.class);
            return null;
        }
    }

    private final void c(final String str, final String str2, final JSONObject jSONObject) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            z.l0(new Runnable() { // from class: z2.h
                @Override // java.lang.Runnable
                public final void run() {
                    j.d(jSONObject, str2, this, str);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(JSONObject viewData, String buttonText, j this$0, String pathID) {
        String[] strArrQ;
        if (e3.a.d(j.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(viewData, "$viewData");
            Intrinsics.checkNotNullParameter(buttonText, "$buttonText");
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(pathID, "$pathID");
            try {
                String lowerCase = z.t(s.m()).toLowerCase();
                Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
                float[] fArrA = z2.a.a(viewData, lowerCase);
                String strC = z2.a.c(buttonText, this$0.f119177e, lowerCase);
                if (fArrA != null && (strArrQ = w2.f.q(f.a.MTML_APP_EVENT_PREDICTION, new float[][]{fArrA}, new String[]{strC})) != null) {
                    String str = strArrQ[0];
                    b.a(pathID, str);
                    if (Intrinsics.areEqual(str, "other")) {
                        return;
                    }
                    f119172f.e(str, buttonText, fArrA);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, j.class);
        }
    }

    private final void e() {
        if (e3.a.d(this)) {
            return;
        }
        try {
            View view = (View) this.f119175c.get();
            View view2 = (View) this.f119176d.get();
            if (view == null || view2 == null) {
                return;
            }
            try {
                String strD = c.d(view2);
                String strB = b.b(view2, strD);
                if (strB != null && !f119172f.f(strB, strD)) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, c.b(view, view2));
                    jSONObject.put("screenname", this.f119177e);
                    c(strB, strD, jSONObject);
                }
            } catch (Exception unused) {
            }
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        if (e3.a.d(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            View.OnClickListener onClickListener = this.f119174b;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
            e();
        } catch (Throwable th2) {
            e3.a.b(th2, this);
        }
    }

    private j(View view, View view2, String str) {
        this.f119174b = n2.f.g(view);
        this.f119175c = new WeakReference(view2);
        this.f119176d = new WeakReference(view);
        String lowerCase = str.toLowerCase();
        Intrinsics.checkNotNullExpressionValue(lowerCase, "this as java.lang.String).toLowerCase()");
        this.f119177e = StringsKt.W(lowerCase, "activity", "", false, 4, null);
    }
}
