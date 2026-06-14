package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.networktasks.internal.BaseRequestConfig;
import java.util.Map;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5301nh extends T5 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C5058e5 f77839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC5276mh f77840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final K3 f77841d;

    public C5301nh(@NonNull C5058e5 c5058e5, @NonNull InterfaceC5276mh interfaceC5276mh) {
        this(c5058e5, interfaceC5276mh, new K3());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.appmetrica.analytics.impl.T5, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader, io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
    @NonNull
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final C5351ph load(@NonNull S5 s52) {
        C5351ph c5351ph = (C5351ph) super.load(s52);
        c5351ph.f77992m = ((C5225kh) s52.componentArguments).f77607a;
        c5351ph.f77997r = this.f77839b.f77081t.a();
        c5351ph.f78002w = this.f77839b.f77078q.a();
        C5225kh c5225kh = (C5225kh) s52.componentArguments;
        c5351ph.f77983d = c5225kh.f77608b;
        c5351ph.f77984e = c5225kh.f77609c;
        c5351ph.f77985f = c5225kh.f77610d;
        c5351ph.f77988i = c5225kh.f77611e;
        c5351ph.f77986g = c5225kh.f77612f;
        c5351ph.f77987h = c5225kh.f77613g;
        Boolean boolValueOf = Boolean.valueOf(c5225kh.f77614h);
        InterfaceC5276mh interfaceC5276mh = this.f77840c;
        c5351ph.f77989j = boolValueOf;
        c5351ph.f77990k = interfaceC5276mh;
        C5225kh c5225kh2 = (C5225kh) s52.componentArguments;
        c5351ph.f78001v = c5225kh2.f77616j;
        C5204jm c5204jm = s52.f76392a;
        C5412s4 c5412s4 = c5204jm.f77553n;
        c5351ph.f77993n = c5412s4.f78208a;
        De de2 = c5204jm.f77558s;
        if (de2 != null) {
            c5351ph.f77998s = de2.f75670a;
            c5351ph.f77999t = de2.f75671b;
        }
        c5351ph.f77994o = c5412s4.f78209b;
        c5351ph.f77996q = c5204jm.f77544e;
        c5351ph.f77995p = c5204jm.f77550k;
        K3 k32 = this.f77841d;
        Map<String, String> map = c5225kh2.f77615i;
        H3 h3F = C5468ua.H.f();
        k32.getClass();
        c5351ph.f78000u = K3.a(map, c5204jm, h3F);
        c5351ph.f78003x = this.f77839b.f77083v.f78549e.keySet();
        return c5351ph;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.ComponentLoader
    @NonNull
    public final BaseRequestConfig createBlankConfig() {
        return new C5351ph(this.f77839b);
    }

    public C5301nh(C5058e5 c5058e5, InterfaceC5276mh interfaceC5276mh, K3 k32) {
        super(c5058e5.getContext(), c5058e5.b().c());
        this.f77839b = c5058e5;
        this.f77840c = interfaceC5276mh;
        this.f77841d = k32;
    }

    @NonNull
    public final C5351ph a() {
        return new C5351ph(this.f77839b);
    }
}
