package com.ironsource;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.h8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4346h8 extends FrameLayout implements H8 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43246b = "IronSourceAdContainer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4430m8 f43247a;

    /* JADX INFO: renamed from: com.ironsource.h8$a */
    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f43248a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f43249b;

        a(String str, String str2) {
            this.f43248a = str;
            this.f43249b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4346h8 c4346h8 = C4346h8.this;
            c4346h8.removeView(c4346h8.f43247a.getPresentingView());
            C4346h8.this.f43247a.a(this.f43248a, this.f43249b);
            C4346h8.this.f43247a = null;
        }
    }

    public C4346h8(Context context) {
        super(context);
    }

    @Override // com.ironsource.H8
    public void c(JSONObject jSONObject, String str, String str2) throws JSONException {
        this.f43247a.c(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public WebView getPresentingView() {
        return this.f43247a.getPresentingView();
    }

    public C4312f8 getSize() {
        C4430m8 c4430m8 = this.f43247a;
        return c4430m8 != null ? c4430m8.c() : new C4312f8();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i10) {
        Logger.i(f43246b, "onVisibilityChanged: " + i10);
        C4430m8 c4430m8 = this.f43247a;
        if (c4430m8 == null) {
            return;
        }
        try {
            c4430m8.b().a(C4329g8.f43166k, i10, isShown());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        Logger.i(f43246b, "onWindowVisibilityChanged: " + i10);
        C4430m8 c4430m8 = this.f43247a;
        if (c4430m8 == null) {
            return;
        }
        try {
            c4430m8.b().a(C4329g8.f43167l, i10, isShown());
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public C4346h8(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    private void b() throws Exception {
        JSONObject jSONObject;
        try {
            jSONObject = this.f43247a.b().a().getJSONObject(C4329g8.f43171p).getJSONObject(C4329g8.f43174s);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            jSONObject = new JSONObject();
        }
        jSONObject.put("adViewId", this.f43247a.a());
        this.f43247a.b().a(C4240b4.h.S, jSONObject);
    }

    public void a() throws Exception {
        C4430m8 c4430m8 = this.f43247a;
        if (c4430m8 == null || c4430m8.b() == null) {
            throw new Exception("mAdPresenter or mAdPresenter.getAdViewLogic() are null");
        }
        b();
    }

    public C4346h8(C4430m8 c4430m8, Context context) {
        super(context);
        setLayoutParams(new FrameLayout.LayoutParams(c4430m8.c().c(), c4430m8.c().a()));
        this.f43247a = c4430m8;
        addView(c4430m8.getPresentingView());
    }

    @Override // com.ironsource.H8
    public void a(JSONObject jSONObject, String str, String str2) {
        this.f43247a.a(jSONObject, str, str2);
    }

    @Override // com.ironsource.H8
    public synchronized void a(String str, String str2) {
        C4430m8 c4430m8 = this.f43247a;
        if (c4430m8 != null && c4430m8.b() != null && this.f43247a.getPresentingView() != null) {
            this.f43247a.b().e();
            S7.f41731a.d(new a(str, str2));
        }
    }

    @Override // com.ironsource.H8
    public void a(String str, String str2, String str3) {
        C4430m8 c4430m8 = this.f43247a;
        if (c4430m8 == null) {
            return;
        }
        c4430m8.a(str, str2, str3);
    }

    @Override // com.ironsource.H8
    public void b(JSONObject jSONObject, String str, String str2) {
        this.f43247a.b(jSONObject, str, str2);
    }
}
