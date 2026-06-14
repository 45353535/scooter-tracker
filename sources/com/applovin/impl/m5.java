package com.applovin.impl;

import android.net.Uri;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.e0;
import com.applovin.impl.l5;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public class m5 extends l5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final com.applovin.impl.sdk.ad.a f9335q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f9336r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f9337s;

    class a implements e0.a {
        a() {
        }

        @Override // com.applovin.impl.e0.a
        public void a(Uri uri) {
            if (uri != null) {
                m5.this.f9335q.m1();
                m5.this.f9335q.c(uri);
            }
        }
    }

    class b implements l5.e {
        b() {
        }

        @Override // com.applovin.impl.l5.e
        public void a(String str) {
            m5.this.f9335q.d(m5.this.d(str));
            m5.this.f9335q.b(true);
            com.applovin.impl.sdk.o oVar = m5.this.f9073c;
            if (com.applovin.impl.sdk.o.a()) {
                m5 m5Var = m5.this;
                m5Var.f9073c.a(m5Var.f9072b, "Finish caching non-video resources for ad #" + m5.this.f9335q.getAdIdNumber());
            }
            m5 m5Var2 = m5.this;
            m5Var2.f9073c.f(m5Var2.f9072b, "Ad updated with cachedHTML = " + m5.this.f9335q.g1());
        }
    }

    public m5(com.applovin.impl.sdk.ad.a aVar, com.applovin.impl.sdk.k kVar, AppLovinAdLoadListener appLovinAdLoadListener) {
        super("TaskCacheAppLovinAd", aVar, kVar, appLovinAdLoadListener);
        this.f9335q = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String d(String str) {
        if (n7.j(com.applovin.impl.sdk.k.o())) {
            str = n7.c(str);
        }
        if (!this.f9335q.isOpenMeasurementEnabled()) {
            return str;
        }
        return this.f9071a.e0().a(str, f2.a((AppLovinAdImpl) this.f9246g));
    }

    private void m() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching non-optional HTML resources...");
        }
        this.f9335q.d(d(a(this.f9335q.g1(), this.f9335q.S(), this.f9335q)));
        this.f9335q.b(true);
        a(this.f9335q);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Finish caching non-optional HTML resources for ad #" + this.f9335q.getAdIdNumber());
        }
        this.f9073c.f(this.f9072b, "Ad HTML updated to reference locally cached non-optional resources = " + this.f9335q.g1());
    }

    private void n() {
        Uri uriC;
        if (l() || (uriC = c(this.f9335q.k1())) == null) {
            return;
        }
        this.f9335q.m1();
        this.f9335q.c(uriC);
    }

    private d0 o() {
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching HTML resources...");
        }
        return a(this.f9335q.g1(), this.f9335q.S(), new b());
    }

    private e0 p() {
        return b(this.f9335q.k1(), new a());
    }

    private void q() {
        List<String> listH = this.f9335q.H();
        if (CollectionUtils.isEmpty(listH)) {
            return;
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Caching optional HTML resources...");
        }
        String strG1 = this.f9335q.g1();
        for (String str : listH) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Caching optional resource: " + str);
            }
            int iA = this.f9071a.G().a(str, this.f9246g);
            Map mapA = f2.a((AppLovinAdImpl) this.f9246g);
            String strA = this.f9071a.G().a(com.applovin.impl.sdk.k.o(), str, this.f9335q.getCachePrefix(), this.f9335q.S(), true, true, iA, this.f9248i, mapA);
            if (StringUtils.isValidString(strA)) {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.a(this.f9072b, "Updating HTML with cached optional resource: " + strA);
                }
                this.f9335q.a(strA, str);
                strG1 = strG1.replace(str, strA);
                this.f9335q.d(strG1);
            } else {
                if (com.applovin.impl.sdk.o.a()) {
                    this.f9073c.b(this.f9072b, "Failed to cache optional resource: " + str);
                }
                a(str, "cacheOptionalHtmlResource", mapA);
            }
        }
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.a(this.f9072b, "Finish caching optional HTML resources for ad #" + this.f9335q.getAdIdNumber());
        }
    }

    public void b(boolean z10) {
        this.f9337s = z10;
    }

    public void c(boolean z10) {
        this.f9336r = z10;
    }

    @Override // com.applovin.impl.l5, java.lang.Runnable
    public void run() {
        super.run();
        boolean zC0 = this.f9335q.C0();
        boolean z10 = this.f9337s;
        if (zC0 || z10) {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Begin caching for streaming ad #" + this.f9335q.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            if (((Boolean) this.f9071a.a(x4.I0)).booleanValue()) {
                if (!o0.d()) {
                    a(e());
                }
                ArrayList arrayList = new ArrayList();
                if (!zC0) {
                    f();
                    d0 d0VarO = o();
                    if (d0VarO != null) {
                        arrayList.add(d0VarO);
                    }
                } else if (this.f9336r) {
                    f();
                    d0 d0VarO2 = o();
                    if (d0VarO2 != null) {
                        arrayList.add(d0VarO2);
                    }
                    e0 e0VarP = p();
                    if (e0VarP != null) {
                        arrayList.add(e0VarP);
                    }
                } else {
                    d0 d0VarO3 = o();
                    if (d0VarO3 != null) {
                        a(Arrays.asList(d0VarO3));
                    }
                    f();
                    e0 e0VarP2 = p();
                    if (e0VarP2 != null) {
                        arrayList.add(e0VarP2);
                    }
                }
                a(arrayList);
                f();
            } else {
                j();
                if (zC0) {
                    if (this.f9336r) {
                        f();
                    }
                    m();
                    if (!this.f9336r) {
                        f();
                    }
                    n();
                } else {
                    f();
                    m();
                }
            }
        } else {
            if (com.applovin.impl.sdk.o.a()) {
                this.f9073c.a(this.f9072b, "Begin processing for non-streaming ad #" + this.f9335q.getAdIdNumber() + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            if (((Boolean) this.f9071a.a(x4.I0)).booleanValue()) {
                ArrayList arrayList2 = new ArrayList();
                if (!o0.d()) {
                    arrayList2.addAll(e());
                }
                d0 d0VarO4 = o();
                if (d0VarO4 != null) {
                    arrayList2.add(d0VarO4);
                }
                e0 e0VarP3 = p();
                if (e0VarP3 != null) {
                    arrayList2.add(e0VarP3);
                }
                a(arrayList2);
                f();
                q();
            } else {
                j();
                m();
                n();
                f();
                q();
            }
        }
        k();
    }
}
