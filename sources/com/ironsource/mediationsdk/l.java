package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.ironsource.A5;
import com.ironsource.B3;
import com.ironsource.C4324g3;
import com.ironsource.C4462o4;
import com.ironsource.C4649z5;
import com.ironsource.G9;
import com.ironsource.V7;
import com.ironsource.environment.ContextProvider;
import com.ironsource.environment.thread.IronSourceThreadManager;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.adapters.levelplay.LevelPlayBaseAdapter;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44061a = "BANNER";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44062b = "LARGE";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44063c = "RECTANGLE";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44064d = "LEADERBOARD";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44065e = "SMART";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44066f = "CUSTOM";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44067g = "MEDIUM_RECTANGLE";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44068h = "bannerAdSize";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f44069i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f44070j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f44071k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f44072l = 3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f44073m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f44074n = 5;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f44075o = 6;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f44076p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final String f44077q = "Adaptive=true";

    interface a {
        void a(Map<String, Object> map, List<String> list, StringBuilder sb2);
    }

    interface b {
        void a();

        void a(String str);
    }

    static void a(q qVar, C4324g3 c4324g3, b bVar) {
        String str;
        if (c(qVar)) {
            str = null;
        } else {
            str = String.format("can't load banner - %s", qVar == null ? "banner is null" : "banner is destroyed");
        }
        if (c4324g3 == null || TextUtils.isEmpty(c4324g3.c())) {
            str = String.format("can't load banner - %s", c4324g3 == null ? "placement is null" : "placement name is empty");
        }
        if (TextUtils.isEmpty(str)) {
            bVar.a();
        } else {
            IronLog.INTERNAL.error(str);
            bVar.a(str);
        }
    }

    static boolean c(q qVar) {
        return (qVar == null || qVar.b()) ? false : true;
    }

    public static ISBannerSize b() {
        if (AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
            a(f44065e, 728, 90);
        }
        return a(f44065e, 320, 50);
    }

    public static int b(int i10) {
        if (!r.m().O()) {
            IronLog.API.error("The mediation must be successfully initiated before calling this API");
            return -1;
        }
        return a(i10);
    }

    public static void b(q qVar) {
        ISBannerSize size;
        if (qVar == null || (size = qVar.getSize()) == null || !size.isSmart()) {
            return;
        }
        ISBannerSize iSBannerSizeB = b();
        o.f44146a.a(iSBannerSizeB, size.f43747e);
        iSBannerSizeB.setAdaptive(size.isAdaptive());
        qVar.setBannerSize(iSBannerSizeB);
    }

    static void a(q qVar, b bVar) {
        if (qVar != null && !qVar.b()) {
            bVar.a();
        } else {
            bVar.a(String.format("can't destroy banner - %s", qVar == null ? "banner is null" : "banner is destroyed"));
        }
    }

    static long a(long j10, long j11) {
        return j11 - (new Date().getTime() - j10);
    }

    public static ISBannerSize a(String str, int i10, int i11) {
        return new ISBannerSize(str, i10, i11);
    }

    public static ISBannerSize a() {
        return new ISBannerSize(f44064d, 728, 90);
    }

    public static void a(q qVar) {
        if (qVar != null) {
            qVar.a();
        }
    }

    public static void a(final q qVar, final View view, final FrameLayout.LayoutParams layoutParams, final B3 b32) {
        if (qVar == null || view == null || layoutParams == null) {
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final ISBannerSize size = qVar.getSize();
        IronSourceThreadManager.INSTANCE.postOnUiThreadTask(new Runnable() { // from class: com.ironsource.mediationsdk.e0
            @Override // java.lang.Runnable
            public final void run() {
                l.a(qVar, view, size, applicationContext, layoutParams, b32);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(q qVar, View view, ISBannerSize iSBannerSize, Context context, FrameLayout.LayoutParams layoutParams, B3 b32) {
        try {
            qVar.removeAllViews();
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
            if (iSBannerSize != null) {
                if (iSBannerSize.isAdaptive()) {
                    a(qVar, view, context, iSBannerSize);
                } else {
                    qVar.addView(view, 0, layoutParams);
                }
            }
            if (b32 != null) {
                b32.a();
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Error while binding a banner - " + Log.getStackTraceString(e10));
        }
    }

    public static void a(q qVar, View view, FrameLayout.LayoutParams layoutParams) {
        a(qVar, view, layoutParams, (B3) null);
    }

    private static void a(q qVar, View view, Context context, ISBannerSize iSBannerSize) {
        int iDpToPixels = AdapterUtils.dpToPixels(context, iSBannerSize.f43747e.d());
        int iDpToPixels2 = AdapterUtils.dpToPixels(context, iSBannerSize.f43747e.c());
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        RelativeLayout relativeLayout = new RelativeLayout(context);
        relativeLayout.setLayoutParams(layoutParams);
        relativeLayout.setGravity(17);
        relativeLayout.addView(view, 0);
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) qVar.getLayoutParams();
        if (layoutParams2 == null) {
            layoutParams2 = new FrameLayout.LayoutParams(iDpToPixels, iDpToPixels2);
        }
        layoutParams2.height = iDpToPixels2;
        layoutParams2.width = iDpToPixels;
        layoutParams2.gravity = 17;
        qVar.setLayoutParams(layoutParams2);
        IronLog.INTERNAL.verbose("containerParams height - " + iSBannerSize.f43747e.c() + " width - " + iSBannerSize.f43747e.d());
        qVar.addView(relativeLayout, 0, layoutParams2);
    }

    public static int a(int i10) {
        int iA = -1;
        try {
            iA = a(a(c.b()), i10);
            a(i10, iA);
            IronLog.API.verbose("Maximal height - " + iA + " for width - " + i10);
            return iA;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error("Failed to get adaptive height: " + e10.getMessage());
            return iA;
        }
    }

    private static Map<String, Object> a(c cVar) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(cVar.a());
        concurrentHashMap.putAll(cVar.c());
        return concurrentHashMap;
    }

    private static int a(Map<String, Object> map, int i10) {
        int iMax = -1;
        for (Object obj : map.values()) {
            try {
                iMax = Math.max(iMax, a(obj, i10));
            } catch (Throwable th2) {
                a(obj, th2);
            }
        }
        return iMax;
    }

    private static int a(Object obj, int i10) {
        if (obj instanceof AbstractAdapter) {
            return ((AbstractAdapter) obj).getAdaptiveHeight(i10);
        }
        if (obj instanceof LevelPlayBaseAdapter) {
            return ((LevelPlayBaseAdapter) obj).getAdaptiveHeight(i10);
        }
        return -1;
    }

    private static void a(Object obj, Throwable th2) {
        String simpleName = obj != null ? obj.getClass().getSimpleName() : "unknown";
        C4462o4.d().a(th2);
        IronLog.INTERNAL.error("Exception while calling getAdaptiveHeight for adapter - " + simpleName + ": " + th2.getMessage());
    }

    private static void a(int i10, int i11) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
            if (i11 == -1) {
                jSONObject.put("errorCode", 2);
                jSONObject.put("reason", "No networks found supporting adaptive banners");
            } else {
                jSONObject.put(IronSourceConstants.EVENTS_EXT1, "w:" + i10 + ",h:" + i11);
            }
            G9.i().a(new C4649z5(A5.BN_GET_MAXIMAL_ADAPTIVE_HEIGHT, jSONObject));
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0051  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void a(java.util.Map<java.lang.String, java.lang.Object> r8, com.ironsource.mediationsdk.ISBannerSize r9) {
        /*
            Method dump skipped, instruction units count: 270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.l.a(java.util.Map, com.ironsource.mediationsdk.ISBannerSize):void");
    }

    public static String a(ISBannerSize iSBannerSize) {
        return "Adaptive=true, size: " + iSBannerSize.f43747e.d() + "x" + iSBannerSize.f43747e.c() + "; fallback: " + iSBannerSize.getDescription() + ", size: " + iSBannerSize.getWidth() + "x" + iSBannerSize.getHeight() + ";";
    }

    public static boolean a(V7 v72, int i10, int i11) {
        if (v72 != null && v72.d() > 0 && v72.c() > 0) {
            if (v72.d() >= i10 && v72.c() >= i11) {
                return true;
            }
            IronLog.API.warning("Container size too small: Banner may not display correctly.");
            return true;
        }
        IronLog.API.warning("Container size is invalid: Default banner size will be used.");
        return false;
    }
}
