package com.facebook.appevents;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.adjust.sdk.Constants;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.appevents.o;
import com.facebook.internal.r;
import com.inmobi.unification.sdk.InitializationStatus;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import org.json.JSONArray;
import org.json.JSONException;

/* JADX INFO: loaded from: classes7.dex */
public final class m {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static ScheduledFuture f19687f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m f19682a = new m();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f19683b = m.class.getName();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f19684c = 100;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile e f19685d = new e();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ScheduledExecutorService f19686e = Executors.newSingleThreadScheduledExecutor();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Runnable f19688g = new Runnable() { // from class: com.facebook.appevents.h
        @Override // java.lang.Runnable
        public final void run() {
            m.o();
        }
    };

    private m() {
    }

    public static final void g(final a accessTokenAppId, final d appEvent) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "appEvent");
            f19686e.execute(new Runnable() { // from class: com.facebook.appevents.i
                @Override // java.lang.Runnable
                public final void run() {
                    m.h(accessTokenAppId, appEvent);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(a accessTokenAppId, d appEvent) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvent, "$appEvent");
            f19685d.a(accessTokenAppId, appEvent);
            if (o.f19698b.c() != o.b.EXPLICIT_ONLY && f19685d.d() > f19684c) {
                n(j0.EVENT_THRESHOLD);
            } else if (f19687f == null) {
                f19687f = f19686e.schedule(f19688g, 15L, TimeUnit.SECONDS);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final GraphRequest i(final a accessTokenAppId, final r0 appEvents, boolean z10, final l0 flushState) {
        if (e3.a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            String strG = accessTokenAppId.g();
            com.facebook.internal.i iVarU = com.facebook.internal.m.u(strG, false);
            GraphRequest.c cVar = GraphRequest.f19547n;
            a1 a1Var = a1.f93282a;
            String str = String.format("%s/activities", Arrays.copyOf(new Object[]{strG}, 1));
            Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            final GraphRequest graphRequestA = cVar.A(null, str, null, null);
            graphRequestA.D(true);
            Bundle bundleU = graphRequestA.u();
            if (bundleU == null) {
                bundleU = new Bundle();
            }
            bundleU.putString("access_token", accessTokenAppId.d());
            String strD = m0.f19689b.d();
            if (strD != null) {
                bundleU.putString("device_token", strD);
            }
            String strL = r.f19718c.l();
            if (strL != null) {
                bundleU.putString(Constants.INSTALL_REFERRER, strL);
            }
            graphRequestA.G(bundleU);
            int iE = appEvents.e(graphRequestA, com.facebook.s.m(), iVarU != null ? iVarU.w() : false, z10);
            if (iE == 0) {
                return null;
            }
            flushState.c(flushState.a() + iE);
            graphRequestA.C(new GraphRequest.b() { // from class: com.facebook.appevents.k
                @Override // com.facebook.GraphRequest.b
                public final void a(com.facebook.a0 a0Var) {
                    m.j(accessTokenAppId, graphRequestA, appEvents, flushState, a0Var);
                }
            });
            return graphRequestA;
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(a accessTokenAppId, GraphRequest postRequest, r0 appEvents, l0 flushState, com.facebook.a0 response) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(postRequest, "$postRequest");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            Intrinsics.checkNotNullParameter(flushState, "$flushState");
            Intrinsics.checkNotNullParameter(response, "response");
            q(accessTokenAppId, postRequest, response, appEvents, flushState);
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final List k(e appEventCollection, l0 flushResults) {
        if (e3.a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            Intrinsics.checkNotNullParameter(flushResults, "flushResults");
            boolean zX = com.facebook.s.x(com.facebook.s.m());
            ArrayList arrayList = new ArrayList();
            for (a aVar : appEventCollection.f()) {
                r0 r0VarC = appEventCollection.c(aVar);
                if (r0VarC == null) {
                    throw new IllegalStateException("Required value was null.");
                }
                GraphRequest graphRequestI = i(aVar, r0VarC, zX, flushResults);
                if (graphRequestI != null) {
                    arrayList.add(graphRequestI);
                    if (l2.d.f93896a.f()) {
                        l2.g.l(graphRequestI);
                    }
                }
            }
            return arrayList;
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
            return null;
        }
    }

    public static final void l(final j0 reason) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f19686e.execute(new Runnable() { // from class: com.facebook.appevents.g
                @Override // java.lang.Runnable
                public final void run() {
                    m.m(reason);
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(j0 reason) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "$reason");
            n(reason);
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final void n(j0 reason) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            f19685d.b(f.a());
            try {
                l0 l0VarU = u(reason, f19685d);
                if (l0VarU != null) {
                    Intent intent = new Intent("com.facebook.sdk.APP_EVENTS_FLUSHED");
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_NUM_EVENTS_FLUSHED", l0VarU.a());
                    intent.putExtra("com.facebook.sdk.APP_EVENTS_FLUSH_RESULT", l0VarU.b());
                    LocalBroadcastManager.getInstance(com.facebook.s.m()).sendBroadcast(intent);
                }
            } catch (Exception e10) {
                Log.w(f19683b, "Caught unexpected exception while flushing app events: ", e10);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o() {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            f19687f = null;
            if (o.f19698b.c() != o.b.EXPLICIT_ONLY) {
                n(j0.TIMER);
            }
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final Set p() {
        if (e3.a.d(m.class)) {
            return null;
        }
        try {
            return f19685d.f();
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
            return null;
        }
    }

    public static final void q(final a accessTokenAppId, GraphRequest request, com.facebook.a0 response, final r0 appEvents, l0 flushState) {
        boolean z10;
        String string;
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "accessTokenAppId");
            Intrinsics.checkNotNullParameter(request, "request");
            Intrinsics.checkNotNullParameter(response, "response");
            Intrinsics.checkNotNullParameter(appEvents, "appEvents");
            Intrinsics.checkNotNullParameter(flushState, "flushState");
            FacebookRequestError facebookRequestErrorB = response.b();
            String str = InitializationStatus.SUCCESS;
            k0 k0Var = k0.SUCCESS;
            if (facebookRequestErrorB != null) {
                if (facebookRequestErrorB.getErrorCode() == -1) {
                    str = "Failed: No Connectivity";
                    k0Var = k0.NO_CONNECTIVITY;
                } else {
                    a1 a1Var = a1.f93282a;
                    str = String.format("Failed:\n  Response: %s\n  Error %s", Arrays.copyOf(new Object[]{response.toString(), facebookRequestErrorB.toString()}, 2));
                    Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
                    k0Var = k0.SERVER_ERROR;
                }
            }
            if (com.facebook.s.F(com.facebook.d0.APP_EVENTS)) {
                try {
                    string = new JSONArray((String) request.w()).toString(2);
                    Intrinsics.checkNotNullExpressionValue(string, "{\n            val jsonAr…y.toString(2)\n          }");
                } catch (JSONException unused) {
                    string = "<Can't encode events for debug logging>";
                }
                r.a aVar = com.facebook.internal.r.f19964e;
                com.facebook.d0 d0Var = com.facebook.d0.APP_EVENTS;
                String TAG = f19683b;
                Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
                z10 = true;
                aVar.c(d0Var, TAG, "Flush completed\nParams: %s\n  Result: %s\n  Events JSON: %s", String.valueOf(request.q()), str, string);
            } else {
                z10 = true;
            }
            appEvents.b(facebookRequestErrorB != null ? z10 : false);
            k0 k0Var2 = k0.NO_CONNECTIVITY;
            if (k0Var == k0Var2) {
                com.facebook.s.t().execute(new Runnable() { // from class: com.facebook.appevents.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.r(accessTokenAppId, appEvents);
                    }
                });
            }
            if (k0Var == k0.SUCCESS || flushState.b() == k0Var2) {
                return;
            }
            flushState.d(k0Var);
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(a accessTokenAppId, r0 appEvents) {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(accessTokenAppId, "$accessTokenAppId");
            Intrinsics.checkNotNullParameter(appEvents, "$appEvents");
            n.a(accessTokenAppId, appEvents);
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final void s() {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            f19686e.execute(new Runnable() { // from class: com.facebook.appevents.j
                @Override // java.lang.Runnable
                public final void run() {
                    m.t();
                }
            });
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t() {
        if (e3.a.d(m.class)) {
            return;
        }
        try {
            n.b(f19685d);
            f19685d = new e();
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
        }
    }

    public static final l0 u(j0 reason, e appEventCollection) {
        if (e3.a.d(m.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(reason, "reason");
            Intrinsics.checkNotNullParameter(appEventCollection, "appEventCollection");
            l0 l0Var = new l0();
            List listK = k(appEventCollection, l0Var);
            if (listK.isEmpty()) {
                return null;
            }
            r.a aVar = com.facebook.internal.r.f19964e;
            com.facebook.d0 d0Var = com.facebook.d0.APP_EVENTS;
            String TAG = f19683b;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            aVar.c(d0Var, TAG, "Flushing %d events due to %s.", Integer.valueOf(l0Var.a()), reason.toString());
            Iterator it = listK.iterator();
            while (it.hasNext()) {
                ((GraphRequest) it.next()).k();
            }
            return l0Var;
        } catch (Throwable th2) {
            e3.a.b(th2, m.class);
            return null;
        }
    }
}
