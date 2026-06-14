package com.applovin.impl;

import android.text.TextUtils;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPostbackListener;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class q5 extends i5 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final com.applovin.impl.sdk.network.e f10231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AppLovinPostbackListener f10232h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final d6.b f10233i;

    class a implements AppLovinPostbackListener {
        a() {
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackFailure(String str, int i10) {
            q5.this.e();
        }

        @Override // com.applovin.sdk.AppLovinPostbackListener
        public void onPostbackSuccess(String str) {
            if (q5.this.f10232h != null) {
                q5.this.f10232h.onPostbackSuccess(q5.this.f10231g.f());
            }
        }
    }

    public q5(com.applovin.impl.sdk.network.e eVar, d6.b bVar, com.applovin.impl.sdk.k kVar, AppLovinPostbackListener appLovinPostbackListener) {
        super("TaskDispatchPostback", kVar);
        if (eVar == null) {
            throw new IllegalArgumentException("No request specified");
        }
        this.f10231g = eVar;
        this.f10232h = appLovinPostbackListener;
        this.f10233i = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        b bVar = new b(this.f10231g, b());
        bVar.a(this.f10233i);
        b().q0().a(bVar);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (StringUtils.isValidString(this.f10231g.f())) {
            if (this.f10231g.u()) {
                b().x0().a(this.f10231g, new a());
                return;
            } else {
                e();
                return;
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.d(this.f9072b, "Requested URL is not valid; nothing to do...");
        }
        AppLovinPostbackListener appLovinPostbackListener = this.f10232h;
        if (appLovinPostbackListener != null) {
            appLovinPostbackListener.onPostbackFailure(this.f10231g.f(), AppLovinErrorCodes.INVALID_URL);
        }
    }

    class b extends l6 {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final String f10235m;

        b(com.applovin.impl.sdk.network.a aVar, com.applovin.impl.sdk.k kVar) {
            super(aVar, kVar);
            this.f10235m = q5.this.f10231g.f();
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, Object obj, int i10) {
            if (obj instanceof String) {
                for (String str2 : this.f9071a.c(x4.f11332i0)) {
                    if (str2.startsWith(str2)) {
                        String str3 = (String) obj;
                        if (TextUtils.isEmpty(str3)) {
                            continue;
                        } else {
                            try {
                                JSONObject jSONObject = new JSONObject(str3);
                                r0.c(jSONObject, this.f9071a);
                                r0.b(jSONObject, this.f9071a);
                                r0.a(jSONObject, this.f9071a);
                                break;
                            } catch (JSONException unused) {
                                continue;
                            }
                        }
                    }
                }
            }
            if (q5.this.f10232h != null) {
                q5.this.f10232h.onPostbackSuccess(this.f10235m);
            }
            if (q5.this.f10231g.t()) {
                this.f9071a.t().a(q5.this.f10231g.s(), this.f10235m, i10, obj, null, true);
            }
        }

        @Override // com.applovin.impl.l6, com.applovin.impl.q0.e
        public void a(String str, int i10, String str2, Object obj) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.b(this.f9072b, "Failed to dispatch postback. Error code: " + i10 + " URL: " + this.f10235m);
            }
            if (q5.this.f10232h != null) {
                q5.this.f10232h.onPostbackFailure(this.f10235m, i10);
            }
            if (q5.this.f10231g.t()) {
                this.f9071a.t().a(q5.this.f10231g.s(), this.f10235m, i10, obj, str2, false);
            }
        }
    }
}
