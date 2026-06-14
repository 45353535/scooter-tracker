package pd;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o {
    public static final Set c(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri uriA = e0.a(urlString);
        if (uriA == null) {
            return SetsKt.emptySet();
        }
        String queryParameter = uriA.getQueryParameter("bmcp");
        if (queryParameter == null) {
            queryParameter = "";
        }
        List listSplit$default = StringsKt.split$default(queryParameter, new String[]{"_"}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSplit$default) {
            if (!StringsKt.y0((String) obj)) {
                arrayList.add(obj);
            }
        }
        return CollectionsKt.toSet(arrayList);
    }

    public static final boolean d(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        ComponentName componentNameE = e(context, intent);
        if (componentNameE == null) {
            return false;
        }
        intent.setComponent(componentNameE);
        return true;
    }

    public static final ComponentName e(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        List listH = h(context, intent);
        if (listH.isEmpty()) {
            return null;
        }
        ComponentName componentNameC = l.c(listH);
        return componentNameC == null ? new ComponentName(((ResolveInfo) listH.get(0)).activityInfo.packageName, ((ResolveInfo) listH.get(0)).activityInfo.name) : componentNameC;
    }

    public static final boolean f(Context context, String str, final h hVar) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            if (hVar != null) {
                hVar.execute(Boolean.FALSE);
            }
            return false;
        }
        final Context applicationContext = context.getApplicationContext();
        final String strN = f0.n(str);
        if (strN == null || strN.length() == 0) {
            if (hVar != null) {
                hVar.execute(Boolean.FALSE);
            }
            return false;
        }
        Set setC = c(strN);
        if (setC.contains("lraw")) {
            if (setC.contains("rcp")) {
                str = m(str);
            }
            return i(context, str, hVar);
        }
        if (f0.r(strN)) {
            Executors.newSingleThreadExecutor().execute(new Runnable() { // from class: pd.m
                @Override // java.lang.Runnable
                public final void run() {
                    o.g(applicationContext, strN, hVar);
                }
            });
            return true;
        }
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        return k(applicationContext, strN, hVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(Context applicationContext, String str, h hVar) {
        Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
        k(applicationContext, vd.h.d(str, 0, 2, null), hVar);
    }

    public static final List h(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(intent, "intent");
        List<ResolveInfo> listQueryIntentActivities = context.getPackageManager().queryIntentActivities(intent, 0);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "packageManager.queryIntentActivities(intent, 0)");
        return listQueryIntentActivities;
    }

    public static final boolean i(Context context, String urlString, h hVar) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri uriA = e0.a(urlString);
        if (uriA == null) {
            if (hVar != null) {
                hVar.execute(Boolean.FALSE);
            }
            return false;
        }
        try {
            Result.Companion companion = Result.f93230c;
            Unit unit = null;
            context.startActivity(o(uriA, false, 1, null));
            if (hVar != null) {
                hVar.execute(Boolean.TRUE);
                unit = Unit.f93236a;
            }
            objB = Result.b(unit);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.g(objB) != null && hVar != null) {
            hVar.execute(Boolean.FALSE);
        }
        return Result.j(objB);
    }

    public static final boolean j(Context context, String str) {
        Boolean bool;
        Intrinsics.checkNotNullParameter(context, "<this>");
        if (str == null || str.length() == 0) {
            return false;
        }
        try {
            Intent intentF = l.f(str);
            if (!l.a(context, intentF)) {
                String decodedUrl = URLDecoder.decode(str, Charsets.UTF_8.name());
                Intrinsics.checkNotNullExpressionValue(decodedUrl, "decodedUrl");
                intentF = l.f(decodedUrl);
                l.a(context, intentF);
            }
            context.startActivity(intentF);
            bool = Boolean.TRUE;
        } catch (Throwable unused) {
            bool = null;
        }
        return Intrinsics.areEqual(bool, Boolean.TRUE);
    }

    public static final boolean k(Context context, String str, final h hVar) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        final boolean zJ = j(context, str);
        b0.b(new Runnable() { // from class: pd.n
            @Override // java.lang.Runnable
            public final void run() {
                o.l(hVar, zJ);
            }
        });
        return zJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(h hVar, boolean z10) {
        if (hVar != null) {
            hVar.execute(Boolean.valueOf(z10));
        }
    }

    public static final String m(String urlString) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        Uri uriA = e0.a(urlString);
        if (uriA == null) {
            return urlString;
        }
        String string = e0.b(uriA, "bmcp").toString();
        Intrinsics.checkNotNullExpressionValue(string, "uri.removeQueryParameter…CUSTOM_PARAMS).toString()");
        return string;
    }

    public static final Intent n(Uri uri, boolean z10) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intent intent = new Intent("android.intent.action.VIEW", uri);
        if (z10) {
            intent.setFlags(268435456);
        }
        return intent;
    }

    public static /* synthetic */ Intent o(Uri uri, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        return n(uri, z10);
    }
}
