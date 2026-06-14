package com.applovin.impl;

import android.app.Activity;
import android.content.Context;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class d1 extends s2 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.applovin.impl.sdk.k f8552e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f8553f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f8554g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private List f8555h;

    public enum a {
        RECENT_ADS,
        COUNT
    }

    public d1(Context context) {
        super(context);
        this.f8554g = new AtomicBoolean();
        this.f8555h = new ArrayList();
    }

    public void a(List list, com.applovin.impl.sdk.k kVar) {
        Activity activityU0;
        this.f8552e = kVar;
        this.f8553f = list;
        if (!(this.f10385a instanceof Activity) && (activityU0 = kVar.u0()) != null) {
            this.f10385a = activityU0;
        }
        if (list != null && this.f8554g.compareAndSet(false, true)) {
            this.f8555h = a(this.f8553f);
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.o9
            @Override // java.lang.Runnable
            public final void run() {
                this.f10043b.notifyDataSetChanged();
            }
        });
    }

    @Override // com.applovin.impl.s2
    protected int b() {
        return a.COUNT.ordinal();
    }

    @Override // com.applovin.impl.s2
    protected List c(int i10) {
        return this.f8555h;
    }

    public List d() {
        return this.f8553f;
    }

    public com.applovin.impl.sdk.k e() {
        return this.f8552e;
    }

    public boolean f() {
        return this.f8555h.size() == 0;
    }

    public void g() {
        this.f8554g.compareAndSet(true, false);
    }

    public String toString() {
        return "CreativeDebuggerListAdapter{isInitialized=" + this.f8554g.get() + "}";
    }

    @Override // com.applovin.impl.s2
    protected int d(int i10) {
        return this.f8555h.size();
    }

    @Override // com.applovin.impl.s2
    protected r2 e(int i10) {
        return new v4("RECENT ADS");
    }

    private List a(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new p1((q1) it.next(), this.f10385a));
        }
        return arrayList;
    }
}
