package io.appmetrica.analytics.impl;

import androidx.annotation.VisibleForTesting;
import java.util.HashMap;
import java.util.LinkedList;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5062e9 extends Kf {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5526wi f77100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f77101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C5537x4 f77102c;

    public C5062e9(C5058e5 c5058e5) {
        C5526wi c5526wi = new C5526wi(c5058e5);
        this.f77100a = c5526wi;
        this.f77102c = new C5537x4(c5526wi);
        this.f77101b = a();
    }

    public final HashMap a() {
        HashMap map = new HashMap();
        map.put(EnumC5168ib.EVENT_TYPE_ACTIVATION, new C5130h(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_START, new Il(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_REGULAR, new Lg(this.f77100a));
        C5345pb c5345pb = new C5345pb(this.f77100a);
        map.put(EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_PROTOBUF, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_SEND_REFERRER, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_CUSTOM_EVENT, c5345pb);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_SET_SESSION_EXTRA;
        C5526wi c5526wi = this.f77100a;
        map.put(enumC5168ib, new Dl(c5526wi, c5526wi.f78531t));
        map.put(EnumC5168ib.EVENT_TYPE_APP_OPEN, new Sg(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_PURGE_BUFFER, new Wf(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF, new C5589z6(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF, new Af(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE, new Xn(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE, new Bf(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF, new Wn(this.f77100a));
        map.put(EnumC5168ib.EVENT_TYPE_ANR, c5345pb);
        EnumC5168ib enumC5168ib2 = EnumC5168ib.EVENT_TYPE_APP_ENVIRONMENT_UPDATED;
        C5526wi c5526wi2 = this.f77100a;
        map.put(enumC5168ib2, new Dl(c5526wi2, c5526wi2.f78516e));
        EnumC5168ib enumC5168ib3 = EnumC5168ib.EVENT_TYPE_APP_ENVIRONMENT_CLEARED;
        C5526wi c5526wi3 = this.f77100a;
        map.put(enumC5168ib3, new Dl(c5526wi3, c5526wi3.f78517f));
        map.put(EnumC5168ib.EVENT_TYPE_SEND_USER_PROFILE, c5345pb);
        EnumC5168ib enumC5168ib4 = EnumC5168ib.EVENT_TYPE_SET_USER_PROFILE_ID;
        C5526wi c5526wi4 = this.f77100a;
        map.put(enumC5168ib4, new Dl(c5526wi4, c5526wi4.f78522k));
        map.put(EnumC5168ib.EVENT_TYPE_SEND_REVENUE_EVENT, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_SEND_AD_REVENUE_EVENT, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_CLEANUP, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_SEND_ECOMMERCE_EVENT, c5345pb);
        map.put(EnumC5168ib.EVENT_TYPE_WEBVIEW_SYNC, c5345pb);
        map.put(EnumC5168ib.EVENT_CLIENT_EXTERNAL_ATTRIBUTION, new L9(this.f77100a));
        return map;
    }

    public final C5526wi b() {
        return this.f77100a;
    }

    public final void a(EnumC5168ib enumC5168ib, AbstractC5493va abstractC5493va) {
        this.f77101b.put(enumC5168ib, abstractC5493va);
    }

    @Override // io.appmetrica.analytics.impl.Kf
    public final AbstractC5037d9 a(int i10) {
        LinkedList linkedList = new LinkedList();
        EnumC5168ib enumC5168ibA = EnumC5168ib.a(i10);
        C5537x4 c5537x4 = this.f77102c;
        if (c5537x4 != null) {
            c5537x4.a(enumC5168ibA, linkedList);
        }
        AbstractC5493va abstractC5493va = (AbstractC5493va) this.f77101b.get(enumC5168ibA);
        if (abstractC5493va != null) {
            abstractC5493va.a(linkedList);
        }
        return new C5011c9(linkedList);
    }

    @VisibleForTesting
    public final AbstractC5493va a(EnumC5168ib enumC5168ib) {
        return (AbstractC5493va) this.f77101b.get(enumC5168ib);
    }
}
