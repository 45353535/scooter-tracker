package com.inmobi.media;

import com.inmobi.media.D4;
import com.inmobi.media.ads.network.common.model.ContextData;
import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class D4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ContextData f36701a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36702b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f36703c = D4.class.getSimpleName();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L4 f36704d = new L4();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f36705e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicBoolean f36706f = new AtomicBoolean();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f36707g = new AtomicBoolean();

    public D4(ContextData contextData, long j10) {
        this.f36701a = contextData;
        this.f36702b = j10;
    }

    public final void a() {
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
        ContextData contextData = this.f36701a;
        if (contextData != null) {
            K4.f37202a.a(contextData.getEnabled());
        }
        if (K4.e() && !this.f36706f.getAndSet(true)) {
            this.f36705e = System.currentTimeMillis();
            c();
            d();
            i();
            e();
            a(this.f36705e / ((long) 1000));
        }
    }

    public final void b() {
        if (!K4.e()) {
            String TAG = this.f36703c;
            Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
            return;
        }
        if (!this.f36706f.get()) {
            String TAG2 = this.f36703c;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            return;
        }
        a((int) (System.currentTimeMillis() - this.f36705e));
        if (this.f36707g.getAndSet(true)) {
            String TAG3 = this.f36703c;
            Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
            return;
        }
        String TAG4 = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG4, "TAG");
        Runnable runnable = new Runnable() { // from class: w3.j
            @Override // java.lang.Runnable
            public final void run() {
                D4.a(this.f107109b);
            }
        };
        Intrinsics.checkNotNullParameter(runnable, "runnable");
        Ji.f37163g.submit(runnable);
    }

    public final void c() {
        ContextData contextData;
        String advertisedContent;
        if (this.f36707g.get() || (contextData = this.f36701a) == null || (advertisedContent = contextData.getAdvertisedContent()) == null) {
            return;
        }
        L4 l42 = this.f36704d;
        l42.getClass();
        Intrinsics.checkNotNullParameter(advertisedContent, "<set-?>");
        l42.f37256a = advertisedContent;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void d() {
        ContextData contextData;
        Long bidderId;
        if (this.f36707g.get() || (contextData = this.f36701a) == null || (bidderId = contextData.getBidderId()) == null) {
            return;
        }
        this.f36704d.f37257b = bidderId.longValue();
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void e() {
        ContextData contextData;
        if (this.f36707g.get() || (contextData = this.f36701a) == null) {
            return;
        }
        this.f36704d.f37261f = contextData.getCasAdTypeId();
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void f() {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37262g = 1;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void g() {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37264i = 1;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void h() {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37263h = 1;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void i() {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37260e = this.f36702b;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void a(long j10) {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37258c = j10;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public final void a(int i10) {
        if (this.f36707g.get()) {
            return;
        }
        this.f36704d.f37259d = i10;
        String TAG = this.f36703c;
        Intrinsics.checkNotNullExpressionValue(TAG, "TAG");
    }

    public static final void a(D4 d42) {
        K4 k42 = K4.f37202a;
        L4 contextualDataModel = d42.f36704d;
        Intrinsics.checkNotNullParameter(contextualDataModel, "contextualDataModel");
        synchronized (k42) {
            Intrinsics.checkNotNullExpressionValue("K4", "TAG");
            long jCurrentTimeMillis = System.currentTimeMillis();
            long expiryTime = jCurrentTimeMillis - ((long) (K4.c().getContextualData().getExpiryTime() * 1000));
            K4.a(expiryTime, K4.c().getContextualData().getMaxAdRecords() - 1);
            String string = M4.a(contextualDataModel, K4.c().getContextualData().getSkipFields()).toString();
            Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            W5 w52 = new W5(X5.a(string, K4.f37206e), jCurrentTimeMillis);
            K4.f37204c.add(w52);
            Object objClone = K4.f37204c.clone();
            Intrinsics.checkNotNull(objClone, "null cannot be cast to non-null type java.util.LinkedList<com.inmobi.signals.contextualdata.EncryptedContextualData>");
            K4.f37205d = (LinkedList) objClone;
            eg.h.b(null, new I4(w52, expiryTime, null), 1, null);
            Unit unit = Unit.f93236a;
        }
    }
}
