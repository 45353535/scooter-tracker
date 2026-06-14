package com.applovin.impl;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.TextView;
import com.applovin.impl.privacy.cmp.CmpServiceImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.u0;
import com.applovin.impl.v0;
import com.applovin.impl.x0;
import com.applovin.sdk.AppLovinCmpError;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinWebViewActivity;
import com.applovin.sdk.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public class z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11574b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List f11576d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f11577e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private v0 f11578f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private u0.c f11579g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private v0 f11580h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Dialog f11581i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f11582j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f11583k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f11584l;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final t0 f11575c = new t0();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private u0.b f11585m = new u0.b();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final com.applovin.impl.b f11586n = new a();

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            if ((activity instanceof AppLovinWebViewActivity) || z0.this.f11580h == null) {
                return;
            }
            if (z0.this.f11581i != null) {
                z0 z0Var = z0.this;
                if (!com.applovin.impl.d.d(z0Var.a(z0Var.f11581i))) {
                    z0.this.f11581i.dismiss();
                }
                z0.this.f11581i = null;
            }
            v0 v0Var = z0.this.f11580h;
            z0.this.f11580h = null;
            z0 z0Var2 = z0.this;
            z0Var2.a(z0Var2.f11578f, v0Var, activity);
        }
    }

    class b implements DialogInterface.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f11588a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ x0 f11589b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ v0 f11590c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Activity f11591d;

        b(boolean z10, x0 x0Var, v0 v0Var, Activity activity) {
            this.f11588a = z10;
            this.f11589b = x0Var;
            this.f11590c = v0Var;
            this.f11591d = activity;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface dialogInterface, int i10) {
            z0.this.f11580h = null;
            z0.this.f11581i = null;
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - z0.this.f11584l));
            CollectionUtils.putStringIfValid("details", String.valueOf(this.f11588a), mapHashMap);
            z0.this.f11573a.v0().d(d2.f8589p, mapHashMap);
            v0 v0VarA = z0.this.a(this.f11589b.a());
            if (v0VarA == null) {
                z0.this.a("Destination state for TOS/PP alert is null");
                return;
            }
            z0.this.a(this.f11590c, v0VarA, this.f11591d);
            if (v0VarA.d() != v0.b.ALERT) {
                dialogInterface.dismiss();
            }
        }
    }

    class c extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f11593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f11594b;

        c(Uri uri, Activity activity) {
            this.f11593a = uri;
            this.f11594b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f11593a, this.f11594b, z0.this.f11573a);
        }
    }

    class d extends ClickableSpan {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Uri f11596a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Activity f11597b;

        d(Uri uri, Activity activity) {
            this.f11596a = uri;
            this.f11597b = activity;
        }

        @Override // android.text.style.ClickableSpan
        public void onClick(View view) {
            n7.a(this.f11596a, this.f11597b, z0.this.f11573a);
        }
    }

    class e implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11599a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f11600b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f11601c;

        e(long j10, v0 v0Var, Activity activity) {
            this.f11599a = j10;
            this.f11600b = v0Var;
            this.f11601c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f11585m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f11599a);
            z0.this.a(this.f11600b, this.f11601c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class f implements CmpServiceImpl.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11603a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f11604b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f11605c;

        f(long j10, v0 v0Var, Activity activity) {
            this.f11603a = j10;
            this.f11604b = v0Var;
            this.f11605c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.e
        public void a(AppLovinCmpError appLovinCmpError) {
            z0.this.f11585m.a(appLovinCmpError);
            z0.this.a(appLovinCmpError, SystemClock.elapsedRealtime() - this.f11603a);
            z0.this.a(this.f11604b, this.f11605c, Boolean.valueOf(appLovinCmpError == null));
        }
    }

    class g implements CmpServiceImpl.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f11607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v0 f11608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f11609c;

        g(long j10, v0 v0Var, Activity activity) {
            this.f11607a = j10;
            this.f11608b = v0Var;
            this.f11609c = activity;
        }

        @Override // com.applovin.impl.privacy.cmp.CmpServiceImpl.f
        public void a(AppLovinCmpError appLovinCmpError) {
            HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f11607a));
            if (appLovinCmpError != null) {
                z0.this.f11585m.a(appLovinCmpError);
                mapHashMap.putAll(z0.this.a(appLovinCmpError));
                z0.this.f11573a.v0().d(d2.f8599u, mapHashMap);
            } else {
                z0.this.f11585m.c();
                z0.this.f11573a.v0().d(d2.f8601v, mapHashMap);
            }
            z0.this.b(this.f11608b, this.f11609c);
        }
    }

    class h implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ v0 f11611a;

        h(v0 v0Var) {
            this.f11611a = v0Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            z0 z0Var = z0.this;
            z0Var.a(z0Var.f11578f, this.f11611a, z0.this.f11573a.u0());
        }
    }

    public z0(com.applovin.impl.sdk.k kVar) {
        this.f11573a = kVar;
        this.f11574b = ((Integer) kVar.a(x4.f11268a7)).intValue();
    }

    private void c(final v0 v0Var, final Activity activity) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.rg
            @Override // java.lang.Runnable
            public final void run() {
                this.f10373b.a(v0Var, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(v0 v0Var, Activity activity) {
        a(v0Var, activity, (Boolean) null);
    }

    private void b() {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(SystemClock.elapsedRealtime() - this.f11582j));
        CollectionUtils.putStringIfValid("details", this.f11575c.toString(), mapHashMap);
        this.f11573a.v0().d(d2.f8603w, mapHashMap);
        this.f11576d = null;
        this.f11578f = null;
        this.f11582j = 0L;
        this.f11583k = 0L;
        this.f11584l = 0L;
        this.f11575c.a();
        this.f11573a.e().b(this.f11586n);
        u0.c cVar = this.f11579g;
        if (cVar != null) {
            cVar.a(this.f11585m);
            this.f11579g = null;
        }
        this.f11585m = new u0.b();
    }

    public void a(Activity activity, u0.c cVar) {
        a(v0.a.IS_AL_GDPR.b(), activity, cVar);
    }

    public void a(int i10, Activity activity, u0.c cVar) {
        if (this.f11576d != null) {
            this.f11573a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11573a.O().a("ConsentFlowStateMachine", "Unable to start states: " + this.f11576d);
            }
            this.f11573a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11573a.O().a("ConsentFlowStateMachine", "Consent flow already in progress for states: " + this.f11576d);
            }
            cVar.a(new u0.b(new s0(s0.f10377d, "Consent flow is already in progress.")));
            return;
        }
        List listA = a1.a(this.f11573a);
        this.f11576d = listA;
        this.f11577e = String.valueOf(listA);
        this.f11579g = cVar;
        v0 v0VarA = a(i10);
        this.f11573a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11573a.O().a("ConsentFlowStateMachine", "Starting consent flow with states: " + this.f11576d + "\nInitial state: " + v0VarA);
        }
        com.applovin.impl.sdk.k.a(activity).a(this.f11586n);
        this.f11573a.v0().a(d2.f8585n);
        this.f11582j = SystemClock.elapsedRealtime();
        a((v0) null, v0VarA, activity);
    }

    public boolean a() {
        return this.f11576d != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, Activity activity, Boolean bool) {
        a(v0Var, a(v0Var.a(bool)), activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(v0 v0Var, v0 v0Var2, Activity activity) {
        this.f11578f = v0Var;
        c(v0Var2, activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(v0 v0Var, final Activity activity) {
        boolean z10;
        SpannableString spannableString;
        if (v0Var == null) {
            a("Consent flow state is null");
            return;
        }
        this.f11573a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11573a.O().a("ConsentFlowStateMachine", "Transitioning to state: " + v0Var);
        }
        long jElapsedRealtime = this.f11578f != null ? SystemClock.elapsedRealtime() - this.f11583k : 0L;
        this.f11583k = SystemClock.elapsedRealtime();
        this.f11575c.a(v0Var, jElapsedRealtime);
        if (v0Var.d() == v0.b.ALERT) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            this.f11573a.F().trackEvent("cf_start");
            w0 w0Var = (w0) v0Var;
            this.f11580h = w0Var;
            AlertDialog.Builder builder = new AlertDialog.Builder(activity);
            builder.setCancelable(false);
            Uri uriH = this.f11573a.x().h();
            final boolean z11 = uriH != null;
            for (x0 x0Var : w0Var.f()) {
                b bVar = new b(z11, x0Var, v0Var, activity);
                if (x0Var.c() == x0.a.POSITIVE) {
                    builder.setPositiveButton(x0Var.d(), bVar);
                } else if (x0Var.c() == x0.a.NEGATIVE) {
                    builder.setNegativeButton(x0Var.d(), bVar);
                } else {
                    builder.setNeutralButton(x0Var.d(), bVar);
                }
            }
            String strH = w0Var.h();
            if (StringUtils.isValidString(strH)) {
                spannableString = new SpannableString(strH);
                String strA = com.applovin.impl.sdk.k.a(R.string.applovin_terms_of_service_text);
                String strA2 = com.applovin.impl.sdk.k.a(R.string.applovin_privacy_policy_text);
                if (StringUtils.containsAtLeastOneSubstring(strH, Arrays.asList(strA, strA2))) {
                    if (z11) {
                        StringUtils.addLinks(spannableString, Pattern.compile(strA), new c(uriH, activity), true);
                    }
                    StringUtils.addLinks(spannableString, Pattern.compile(strA2), new d(this.f11573a.x().f(), activity), true);
                }
            } else {
                spannableString = null;
            }
            final AlertDialog alertDialogCreate = builder.setTitle(spannableString).setMessage(w0Var.g()).create();
            alertDialogCreate.setOnShowListener(new DialogInterface.OnShowListener() { // from class: com.applovin.impl.qg
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    this.f10261a.a(alertDialogCreate, activity, z11, dialogInterface);
                }
            });
            this.f11581i = alertDialogCreate;
            alertDialogCreate.show();
            this.f11585m.d();
            return;
        }
        if (v0Var.d() == v0.b.POST_ALERT) {
            if (this.f11573a.x().k() && this.f11573a.x().m()) {
                if (com.applovin.impl.d.d(activity)) {
                    a(v0Var);
                    return;
                } else {
                    this.f11573a.v0().a(d2.f8591q);
                    this.f11573a.s().loadCmp(activity, new e(SystemClock.elapsedRealtime(), v0Var, activity));
                    return;
                }
            }
            a(v0Var, activity, Boolean.FALSE);
            return;
        }
        if (v0Var.d() == v0.b.EVENT) {
            y0 y0Var = (y0) v0Var;
            String strG = y0Var.g();
            Map<String, ?> mapF = y0Var.f();
            if (mapF == null) {
                mapF = new HashMap<>(1);
            }
            mapF.put("flow_type", "unified");
            this.f11573a.F().trackEvent(strG, mapF);
            b(y0Var, activity);
            return;
        }
        if (v0Var.d() == v0.b.CMP_LOAD) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            } else if (this.f11573a.x().m()) {
                this.f11573a.s().preloadCmp(activity);
                a(v0Var, activity, Boolean.FALSE);
                return;
            } else {
                this.f11573a.v0().a(d2.f8591q);
                this.f11573a.s().loadCmp(activity, new f(SystemClock.elapsedRealtime(), v0Var, activity));
                return;
            }
        }
        if (v0Var.d() == v0.b.CMP_SHOW) {
            if (com.applovin.impl.d.d(activity)) {
                a(v0Var);
                return;
            }
            if (!this.f11573a.x().m()) {
                this.f11573a.F().trackEvent("cf_start");
            }
            this.f11573a.v0().a(d2.f8597t);
            this.f11573a.s().showCmp(activity, new g(SystemClock.elapsedRealtime(), v0Var, activity));
            return;
        }
        if (v0Var.d() == v0.b.DECISION) {
            v0.a aVarA = v0Var.a();
            if (aVarA == v0.a.IS_AL_GDPR) {
                boolean zK = this.f11573a.x().k();
                this.f11575c.a(v0Var, zK, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(zK));
                return;
            } else if (aVarA == v0.a.IS_ELIGIBLE_FOR_TERMS_AND_PRIVACY_POLICY_ALERT) {
                z10 = !this.f11573a.z0() || ((Boolean) this.f11573a.a(z4.f11635t, Boolean.FALSE)).booleanValue();
                this.f11575c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
                return;
            } else {
                if (aVarA != v0.a.HAS_TERMS_OF_SERVICE_URI) {
                    a("Invalid consent flow decision type: " + aVarA);
                    return;
                }
                z10 = this.f11573a.x().h() != null;
                this.f11575c.a(v0Var, z10, jElapsedRealtime);
                a(v0Var, activity, Boolean.valueOf(z10));
                return;
            }
        }
        if (v0Var.d() == v0.b.REINIT) {
            b();
            return;
        }
        a("Invalid consent flow destination state: " + v0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(AlertDialog alertDialog, Activity activity, boolean z10, DialogInterface dialogInterface) {
        TextView textView = (TextView) alertDialog.findViewById(alertDialog.getContext().getResources().getIdentifier("android:id/alertTitle", null, null));
        textView.setLinkTextColor(textView.getCurrentTextColor());
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setMaxLines(this.f11574b);
        textView.setMinHeight(AppLovinSdkUtils.dpToPx(activity, 48));
        this.f11584l = SystemClock.elapsedRealtime();
        this.f11573a.v0().d(d2.f8587o, CollectionUtils.hashMap("details", String.valueOf(z10)));
    }

    private void a(v0 v0Var) {
        this.f11575c.b();
        AppLovinSdkUtils.runOnUiThreadDelayed(new h(v0Var), TimeUnit.SECONDS.toMillis(1L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        l1.a(str, new Object[0]);
        this.f11573a.D().a(d2.O0, str, CollectionUtils.hashMap("details", "Last started states: " + this.f11577e + "\nLast successful state: " + this.f11578f));
        this.f11575c.b(str);
        u0.b bVar = this.f11585m;
        if (bVar != null) {
            bVar.a(new s0(s0.f10378e, str));
        }
        b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public v0 a(int i10) {
        List<v0> list = this.f11576d;
        if (list == null) {
            return null;
        }
        for (v0 v0Var : list) {
            if (i10 == v0Var.c()) {
                return v0Var;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Activity a(Dialog dialog) {
        Context context = dialog.getContext();
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (!(context instanceof ContextWrapper)) {
            return null;
        }
        Context baseContext = ((ContextWrapper) context).getBaseContext();
        if (baseContext instanceof Activity) {
            return (Activity) baseContext;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AppLovinCmpError appLovinCmpError, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("duration_ms", String.valueOf(j10));
        if (appLovinCmpError == null) {
            this.f11573a.v0().d(d2.f8593r, mapHashMap);
        } else {
            mapHashMap.putAll(a(appLovinCmpError));
            this.f11573a.v0().d(d2.f8595s, mapHashMap);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public HashMap a(AppLovinCmpError appLovinCmpError) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("error_message", appLovinCmpError.getMessage());
        CollectionUtils.putStringIfValid("mediated_network_error_message", appLovinCmpError.getCmpMessage(), mapHashMap);
        CollectionUtils.putStringIfValid("error_code", String.valueOf(appLovinCmpError.getCode().getValue()), mapHashMap);
        CollectionUtils.putStringIfValid("mediated_network_error_code", String.valueOf(appLovinCmpError.getCmpCode()), mapHashMap);
        return mapHashMap;
    }
}
