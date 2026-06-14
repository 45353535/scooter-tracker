package sg.bigo.ads.controller.landing;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.taurusx.tax.ui.CircularProgressBar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONArray;
import sg.bigo.ads.a.a;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.controller.form.AdFormActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> f103799a = new WeakHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f103800b = 0;

    public static int a(int i10) {
        if (i10 == 0) {
            return 2;
        }
        if (i10 != 1) {
            return i10 != 2 ? 5 : 4;
        }
        return 3;
    }

    @Nullable
    public static sg.bigo.ads.ad.c<?, ?> b(int i10) {
        sg.bigo.ads.ad.c<?, ?> key;
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f103799a;
        synchronized (weakHashMap) {
            try {
                Iterator<Map.Entry<sg.bigo.ads.ad.c<?, ?>, Integer>> it = weakHashMap.entrySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        key = null;
                        break;
                    }
                    Map.Entry<sg.bigo.ads.ad.c<?, ?>, Integer> next = it.next();
                    if (next.getValue().intValue() == i10) {
                        key = next.getKey();
                        break;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return key;
    }

    public static String a(String str, int i10, int i11) {
        try {
            if (str.contains("ad_imp_indx=__ad_imp_indx__")) {
                str = q.a(str, "ad_imp_indx=__ad_imp_indx__", "ad_imp_indx=".concat(String.valueOf(i10)), true);
            }
            return str.contains("ad_click_indx=__ad_click_indx__") ? q.a(str, "ad_click_indx=__ad_click_indx__", "ad_click_indx=".concat(String.valueOf(i11)), true) : str;
        } catch (Throwable unused) {
            return str;
        }
    }

    public static sg.bigo.ads.api.core.d a(Context context, Activity activity, String str, String str2, String str3, boolean z10, int i10, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, boolean z11, boolean z12) {
        ArrayList arrayList;
        if (str != null) {
            arrayList = new ArrayList();
            arrayList.add(str);
        } else {
            arrayList = null;
        }
        return a(context, activity, arrayList, str2, str3, z10, i10, jSONArray, cVar, z11, z12);
    }

    public static sg.bigo.ads.api.core.d a(Context context, Activity activity, @Nullable List<String> list, String str, String str2, boolean z10, int i10, @Nullable JSONArray jSONArray, @Nullable sg.bigo.ads.ad.c<?, ?> cVar, boolean z11, boolean z12) {
        sg.bigo.ads.ad.c<?, ?> cVar2;
        int i11;
        int i12;
        a aVar;
        sg.bigo.ads.api.core.d dVar = new sg.bigo.ads.api.core.d();
        boolean zA = false;
        dVar.f102157a = 0;
        if (cVar != null && (aVar = cVar.f100346m) != null && !aVar.b()) {
            aVar.a();
        }
        if (list != null) {
            int i13 = 0;
            while (true) {
                if (i13 >= list.size()) {
                    break;
                }
                String str3 = list.get(i13);
                if (!TextUtils.isEmpty(str3)) {
                    zA = sg.bigo.ads.core.landing.a.a(Uri.parse(str3), context, activity, dVar, str2, z12, cVar != null ? cVar.f().n() : null, true);
                    if (zA) {
                        if (cVar != null && (i12 = dVar.f102160d) >= 0) {
                            cVar.a(new c(i12, dVar.f102161e));
                        }
                        dVar.f102157a = 1;
                    }
                }
                i13++;
            }
        }
        if (!zA && z10 && !TextUtils.isEmpty(str2) && (zA = sg.bigo.ads.core.landing.a.a(context, str2))) {
            dVar.f102157a = 4;
        }
        if (zA || TextUtils.isEmpty(str)) {
            cVar2 = cVar;
        } else {
            Uri uri = Uri.parse(str);
            if (sg.bigo.ads.core.landing.a.a(str)) {
                dVar.f102157a = 2;
                zA = sg.bigo.ads.core.landing.a.a(uri, context, activity, dVar, z12, cVar != null ? cVar.f().n() : null, true);
                if (cVar != null && (i11 = dVar.f102160d) >= 0) {
                    cVar.a(new c(i11, dVar.f102161e));
                }
            } else {
                dVar.f102157a = 3;
                if (i10 == 1) {
                    zA = sg.bigo.ads.core.landing.a.a(context, str, jSONArray);
                } else if (i10 == 2) {
                    zA = a(context, str, cVar, dVar, z11);
                } else {
                    cVar2 = cVar;
                    zA = a(context, str, cVar2, dVar, 0, z11);
                }
            }
            cVar2 = cVar;
        }
        dVar.f102168l = zA;
        if (zA && cVar2 != null) {
            sg.bigo.ads.api.core.b bVarF = cVar2.f();
            if (cVar2.f100355v != bVarF.y()) {
                cVar2.f100353t = -1;
                cVar2.f100355v = bVarF.y();
            }
            cVar2.f100354u = System.currentTimeMillis();
            cVar2.f100353t++;
        }
        if (dVar.f102160d == 1) {
            dVar.f102157a = 5;
        }
        return dVar;
    }

    public static void a() {
    }

    private static void a(int i10, @NonNull sg.bigo.ads.ad.c<?, ?> cVar) {
        WeakHashMap<sg.bigo.ads.ad.c<?, ?>, Integer> weakHashMap = f103799a;
        synchronized (weakHashMap) {
            weakHashMap.put(cVar, Integer.valueOf(i10));
        }
    }

    public static void a(Activity activity, final sg.bigo.ads.ad.c cVar) {
        if (activity == null || activity.getWindow() == null || cVar == null || cVar.y() == null) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        if (jElapsedRealtime - f103800b < 2000) {
            return;
        }
        f103800b = jElapsedRealtime;
        final c cVarY = cVar.y();
        cVar.a((c) null);
        final View decorView = activity.getWindow().getDecorView();
        decorView.postDelayed(new Runnable() { // from class: sg.bigo.ads.controller.landing.e.2
            @Override // java.lang.Runnable
            public final void run() {
                final boolean zIsShown = decorView.isShown();
                sg.bigo.ads.common.n.d.a(1, new Runnable() { // from class: sg.bigo.ads.controller.landing.e.2.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        sg.bigo.ads.api.core.b bVarF = cVar.f();
                        c cVar2 = cVarY;
                        sg.bigo.ads.core.d.b.b(bVarF, cVar2.f103769a, zIsShown ? 1 : 2, cVar2.f103770b);
                    }
                });
            }
        }, CircularProgressBar.E);
    }

    public static void a(Context context, Activity activity, String str, @Nullable sg.bigo.ads.ad.c<?, ?> cVar) {
        int iC;
        sg.bigo.ads.api.core.d dVar = new sg.bigo.ads.api.core.d();
        dVar.f102157a = 0;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        Uri uri = Uri.parse(str);
        JSONArray jSONArrayD = null;
        if (sg.bigo.ads.core.landing.a.a(str)) {
            dVar.f102157a = 2;
            sg.bigo.ads.core.landing.a.a(uri, context, activity, dVar, false, cVar != null ? cVar.f().n() : null, true);
            return;
        }
        dVar.f102157a = 3;
        if (cVar != null) {
            iC = cVar.f().N().c();
            jSONArrayD = cVar.f().N().d();
        } else {
            iC = 0;
        }
        if (iC == 1) {
            sg.bigo.ads.core.landing.a.a(context, str, jSONArrayD);
        } else if (iC == 2) {
            a(context, str, cVar, dVar, false);
        } else {
            a(context, str, cVar, dVar, 0, false);
        }
    }

    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.controller.e.b<?>> cls, @NonNull sg.bigo.ads.ad.c<?, ?> cVar) {
        if (Build.VERSION.SDK_INT == 26) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, "android 8.0 cannot show popup");
            return false;
        }
        try {
            Intent intentB = AdActivity.b(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentB.putExtra("ad_identifier", iHashCode);
            context.startActivity(intentB);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e10));
            return false;
        }
    }

    public static boolean a(Context context, @NonNull Class<? extends sg.bigo.ads.controller.e.b<?>> cls, @NonNull sg.bigo.ads.ad.c<?, ?> cVar, boolean z10) {
        try {
            Intent intentE = z10 ? AdActivity.e(context, cls) : AdActivity.d(context, cls);
            int iHashCode = cVar.hashCode();
            a(iHashCode, cVar);
            intentE.putExtra("ad_identifier", iHashCode);
            context.startActivity(intentE);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10116, Log.getStackTraceString(e10));
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(android.content.Context r8, java.lang.String r9, @androidx.annotation.Nullable sg.bigo.ads.ad.c<?, ?> r10, @androidx.annotation.NonNull sg.bigo.ads.api.core.d r11, int r12, boolean r13) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.controller.landing.e.a(android.content.Context, java.lang.String, sg.bigo.ads.ad.c, sg.bigo.ads.api.core.d, int, boolean):boolean");
    }

    private static boolean a(Context context, final String str, @Nullable final sg.bigo.ads.ad.c<?, ?> cVar, @NonNull final sg.bigo.ads.api.core.d dVar, final boolean z10) {
        final b bVar = new b(str, cVar == null ? null : cVar.f(), cVar, cVar != null ? cVar.f100346m : null);
        a.C1201a c1201a = new a.C1201a();
        c1201a.f100067a = str;
        c1201a.f100068b = bVar;
        c1201a.f100069c = new a.b() { // from class: sg.bigo.ads.controller.landing.e.1
            @Override // sg.bigo.ads.a.a.b
            public final void a(Context context2, String str2, int i10, String str3) {
                sg.bigo.ads.common.t.a.a(0, 3, "WebViewStatHelper", "Open landing page by chrome tabs failed, using webView.");
                e.a(context2, str, cVar, dVar, e.a(i10), z10);
                if (TextUtils.isEmpty(str3)) {
                    return;
                }
                sg.bigo.ads.ad.c cVar2 = cVar;
                sg.bigo.ads.core.d.b.a(cVar2 == null ? null : cVar2.f(), 3002, 10114, str3);
            }

            @Override // sg.bigo.ads.a.a.b
            public final void a(String str2, String str3, String str4) {
                b bVar2 = bVar;
                bVar2.f103750a = str2;
                bVar2.f103751b = str3;
                bVar2.f103752c = str4;
            }
        };
        c1201a.a().a(context);
        return true;
    }

    public static boolean a(Context context, sg.bigo.ads.ad.c<?, ?> cVar) {
        if (cVar == null) {
            sg.bigo.ads.core.d.b.a((sg.bigo.ads.api.core.b) null, 3000, 10221, "ad == null, launchFormActivity failed");
            return false;
        }
        try {
            Intent intentA = AdFormActivity.a(context);
            int iHashCode = cVar.hashCode();
            int iZ = cVar.z();
            a(iHashCode, cVar);
            intentA.putExtra("ad_identifier", iHashCode);
            intentA.putExtra("open_form_time", iZ);
            context.startActivity(intentA);
            return true;
        } catch (Exception e10) {
            sg.bigo.ads.core.d.b.a(cVar.f(), 3000, 10221, Log.getStackTraceString(e10));
            return false;
        }
    }
}
