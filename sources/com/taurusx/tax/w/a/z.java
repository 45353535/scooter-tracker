package com.taurusx.tax.w.a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.adjust.sdk.Constants;
import com.iab.omid.library.taurusx.adsession.AdEvents;
import com.iab.omid.library.taurusx.adsession.AdSession;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.e;
import com.taurusx.tax.g.f0;
import com.taurusx.tax.g.h0;
import com.taurusx.tax.g.k0;
import com.taurusx.tax.g.l;
import com.taurusx.tax.g.m;
import com.taurusx.tax.log.LogUtil;
import com.taurusx.tax.ui.TaxWebViewActivity;
import com.taurusx.tax.w.s.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class z extends y {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f67241e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f67242f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f67243g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f67244i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f67245k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f67246l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public AdSession f67247m;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public AdEvents f67248p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f67249t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f67250u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f67251v;

    public class w implements f0.z {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ View f67252w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public final /* synthetic */ boolean f67254z;

        /* JADX INFO: renamed from: com.taurusx.tax.w.a.z$w$z, reason: collision with other inner class name */
        public class RunnableC0821z implements Runnable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public final /* synthetic */ Intent f67255w;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public final /* synthetic */ Context f67257z;

            public RunnableC0821z(Context context, Intent intent) {
                this.f67257z = context;
                this.f67255w = intent;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f67257z.startActivity(this.f67255w);
            }
        }

        public w(boolean z10, View view) {
            this.f67254z = z10;
            this.f67252w = view;
        }

        @Override // com.taurusx.tax.g.f0.z
        public void z(Context context, Intent intent) {
            if (this.f67254z) {
                context.startActivity(intent);
            } else {
                k0.z(this.f67252w, new RunnableC0821z(context, intent));
            }
        }
    }

    /* JADX INFO: renamed from: com.taurusx.tax.w.a.z$z, reason: collision with other inner class name */
    public class RunnableC0822z implements Runnable {
        public RunnableC0822z() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                z zVar = z.this;
                if (zVar.f67247m == null || zVar.f67244i) {
                    return;
                }
                zVar.f67244i = true;
                com.taurusx.tax.s.z.z(zVar.f67248p, zVar.f67240z);
            } catch (Throwable th2) {
                th2.printStackTrace();
            }
        }
    }

    public z(String str, com.taurusx.tax.w.c.y yVar) {
        super(str, yVar);
        this.f67250u = false;
    }

    public void a() {
        if (this.f67249t || this.f67238w == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.i(), "ad-imp");
        JSONObject jSONObject = new JSONObject();
        if ("html".equalsIgnoreCase(this.f67238w.w())) {
            try {
                jSONObject.put("html_imp_load", this.f67250u);
            } catch (JSONException unused) {
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67530c, 0L, this.f67235c, jSONObject, (c.a) null);
        this.f67249t = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67530c, this.f67239y);
    }

    public void o() {
        LogUtil.d("taurusx", "onImpression");
        m.c(new RunnableC0822z());
        a();
        s();
        c cVar = this.f67236o;
        if (cVar != null) {
            cVar.onAdImpression();
        }
    }

    public void s() {
        if (this.f67243g || this.f67238w == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.c(), "ad-bill");
        JSONObject jSONObject = new JSONObject();
        if ("html".equalsIgnoreCase(this.f67238w.w())) {
            try {
                jSONObject.put("html_imp_load", this.f67250u);
            } catch (JSONException unused) {
            }
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67533m, 0L, this.f67235c, jSONObject, (c.a) null);
        this.f67243g = true;
    }

    public abstract void z(ViewGroup viewGroup);

    public void z(ViewGroup viewGroup, ArrayList<View> arrayList) {
        for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
            View childAt = viewGroup.getChildAt(i10);
            if (childAt instanceof ViewGroup) {
                z((ViewGroup) childAt, arrayList);
            }
            arrayList.add(childAt);
        }
    }

    public void z(ArrayList<View> arrayList, List<View> list, View.OnTouchListener onTouchListener) {
        if (list != null) {
            for (View view : list) {
                if (arrayList.contains(view)) {
                    view.setOnTouchListener(onTouchListener);
                }
            }
            return;
        }
        Iterator<View> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().setOnTouchListener(onTouchListener);
        }
    }

    public boolean z(Context context, View view, String str, boolean z10) {
        String strA = this.f67238w.a();
        String strM = this.f67238w.m();
        if (!TextUtils.isEmpty(strA)) {
            if (h0.z(context, strA)) {
                h0.z(context, strA, Constants.DEEPLINK);
                return true;
            }
            if (!TextUtils.isEmpty(strM)) {
                h0.z(context, strM, POBCoreNativeConstants.NATIVE_FALLBACK_URL);
                return true;
            }
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            w wVar = new w(z10, view);
            if (!f0.z(context, null, str, wVar)) {
                if (str == null || !str.startsWith("http")) {
                    return false;
                }
                z(context, str, wVar);
            }
            return true;
        } catch (Throwable th2) {
            LogUtil.v(y.f67233n, "onClick throwable:" + th2.getMessage());
            return false;
        }
    }

    public void z(ArrayList<String> arrayList, com.taurusx.tax.w.s.z zVar, com.taurusx.tax.w.s.a aVar) {
        if (this.f67242f || this.f67238w == null) {
            return;
        }
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), e.z(arrayList, zVar), "ad-click");
        com.taurusx.tax.w.s.c.z(TaurusXAds.getContext(), this.f67238w.k(), com.taurusx.tax.w.s.w.f67535o, 0L, this.f67235c, com.taurusx.tax.w.s.c.z(zVar), (c.a) null);
        this.f67242f = true;
        com.taurusx.tax.w.z.t().a().z(com.taurusx.tax.w.s.w.f67535o, this.f67239y);
    }

    private void z(Context context, String str) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(Uri.parse(str));
        intent.setFlags(268435456);
        context.startActivity(intent);
    }

    public void z(Context context, String str, f0.z zVar) {
        Intent intent;
        if (l.z()) {
            intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addCategory("android.intent.category.BROWSABLE");
        } else {
            intent = new Intent(context, (Class<?>) TaxWebViewActivity.class);
            intent.putExtra("url", str);
            String string = UUID.randomUUID().toString();
            com.taurusx.tax.g.n0.c.z().z(string, this.f67235c);
            intent.putExtra(TaxWebViewActivity.f66910a, string);
            intent.putExtra(TaxWebViewActivity.f66911n, this.f67239y);
        }
        intent.setFlags(268435456);
        if (zVar != null) {
            zVar.z(context, intent);
        } else {
            context.startActivity(intent);
        }
    }
}
