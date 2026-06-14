package com.applovin.impl;

import android.content.Context;
import com.applovin.impl.d6;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public abstract class i5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final com.applovin.impl.sdk.k f9071a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final String f9072b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final com.applovin.impl.sdk.o f9073c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f9074d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f9075e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f9076f;

    public i5(String str, com.applovin.impl.sdk.k kVar) {
        this(str, kVar, false, null);
    }

    public com.applovin.impl.sdk.k b() {
        return this.f9071a;
    }

    public String c() {
        return this.f9072b;
    }

    public boolean d() {
        return this.f9076f;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10) {
        this(str, kVar, z10, null);
    }

    public Context a() {
        return this.f9074d;
    }

    public ScheduledFuture b(final Thread thread, final long j10) {
        if (j10 <= 0) {
            return null;
        }
        return this.f9071a.q0().b(new r6(this.f9071a, "timeout:" + this.f9072b, new Runnable() { // from class: com.applovin.impl.db
            @Override // java.lang.Runnable
            public final void run() {
                this.f8684b.a(thread, j10);
            }
        }), d6.b.TIMEOUT, j10);
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, String str2) {
        this(str, kVar, false, str2);
    }

    public void a(String str) {
        this.f9075e = str;
    }

    public i5(String str, com.applovin.impl.sdk.k kVar, boolean z10, String str2) {
        this.f9072b = str;
        this.f9071a = kVar;
        this.f9073c = kVar.O();
        this.f9074d = com.applovin.impl.sdk.k.o();
        this.f9076f = z10;
        this.f9075e = str2;
    }

    public void a(boolean z10) {
        this.f9076f = z10;
    }

    public void a(Throwable th2) {
        Map map = CollectionUtils.map("source", this.f9072b);
        map.put("top_main_method", th2.toString());
        map.put("details", StringUtils.emptyIfNull(this.f9075e));
        this.f9071a.D().d(d2.X0, map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(Thread thread, long j10) {
        HashMap<String, String> mapHashMap = CollectionUtils.hashMap("name", thread.getState().name());
        if (StringUtils.isValidString(this.f9075e)) {
            mapHashMap.put("details", this.f9075e);
        }
        this.f9071a.D().a(d2.Y0, this.f9072b, mapHashMap);
        if (com.applovin.impl.sdk.o.a()) {
            this.f9073c.k(this.f9072b, "Task has been executing for over " + TimeUnit.MILLISECONDS.toSeconds(j10) + " seconds");
        }
    }
}
