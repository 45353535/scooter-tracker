package com.ironsource.mediationsdk;

import com.ironsource.C4246ba;
import com.ironsource.C4424m2;
import com.ironsource.C4638yb;
import com.ironsource.W8;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdInfo;
import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.HashSet;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashSet<ImpressionDataListener> f44094a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected com.ironsource.r f44095b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected C4246ba f44096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected AdInfo f44097d;

    public m(HashSet<ImpressionDataListener> hashSet, C4246ba c4246ba) {
        new HashSet();
        this.f44094a = hashSet;
        this.f44095b = new com.ironsource.r();
        this.f44096c = c4246ba;
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f44094a.remove(impressionDataListener);
        }
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.f44094a.add(impressionDataListener);
        }
    }

    public void c() {
        synchronized (this) {
            this.f44094a.clear();
        }
    }

    protected String e() {
        return "fallback_" + System.currentTimeMillis();
    }

    public void f() {
        this.f44097d = null;
    }

    public void a(C4246ba c4246ba) {
        this.f44096c = c4246ba;
    }

    public void a(W8 w82, C4638yb c4638yb) {
        if (w82 != null) {
            this.f44097d = new AdInfo(w82, c4638yb);
        }
    }

    protected void a(C4424m2 c4424m2, String str) {
        HashSet<ImpressionDataListener> hashSet;
        if (c4424m2 != null) {
            W8 w8A = c4424m2.a(str);
            if (w8A != null) {
                synchronized (this) {
                    hashSet = (HashSet) this.f44094a.clone();
                }
                for (ImpressionDataListener impressionDataListener : hashSet) {
                    IronLog.CALLBACK.info("onImpressionSuccess " + impressionDataListener.getClass().getSimpleName() + ": " + w8A);
                    impressionDataListener.onImpressionSuccess(w8A);
                }
                return;
            }
            return;
        }
        IronLog.INTERNAL.verbose("no auctionResponseItem or listener");
    }

    protected void a(JSONObject jSONObject, IronSource.a aVar) {
        this.f44095b.a(aVar, jSONObject != null ? jSONObject.optBoolean(d.f43817f, false) : false);
    }

    protected void a(IronSource.a aVar) {
        this.f44095b.a(aVar, false);
    }
}
