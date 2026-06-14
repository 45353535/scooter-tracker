package com.inmobi.media;

import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.b0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3591b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f38230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f38232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AtomicBoolean f38233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38234e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3903n9 f38235f;

    public C3591b0(WeakReference adUnitEventListener, String adtype, boolean z10) {
        Intrinsics.checkNotNullParameter(adUnitEventListener, "adUnitEventListener");
        Intrinsics.checkNotNullParameter(adtype, "adtype");
        this.f38230a = adUnitEventListener;
        this.f38231b = adtype;
        this.f38232c = z10;
        this.f38233d = new AtomicBoolean(false);
        this.f38234e = String.valueOf(kotlin.jvm.internal.v0.b(C3591b0.class).getSimpleName());
    }

    public final void a(C3740gk c3740gk) {
        Gh gh2;
        C3765hk c3765hk;
        AtomicBoolean atomicBoolean;
        if (!this.f38233d.getAndSet(true)) {
            Qi qi = Qi.f37598a;
            String str = this.f38231b;
            Boolean boolValueOf = Boolean.valueOf(this.f38232c);
            qi.getClass();
            Qi.a(str, boolValueOf);
            AbstractC3721g1 abstractC3721g1 = (AbstractC3721g1) this.f38230a.get();
            if (abstractC3721g1 != null) {
                abstractC3721g1.a(c3740gk);
            } else if (c3740gk != null) {
                c3740gk.b();
            }
            C3903n9 c3903n9 = this.f38235f;
            if (c3903n9 != null) {
                c3903n9.a(this.f38234e, "==== CHECKPOINT REACHED - IMPRESSION FIRED ====");
            }
            C3903n9 c3903n92 = this.f38235f;
            if (c3903n92 == null || (gh2 = c3903n92.f39085a) == null) {
                return;
            }
            gh2.a();
            return;
        }
        C3903n9 c3903n93 = this.f38235f;
        if (c3903n93 != null) {
            c3903n93.c(this.f38234e, "skipping as Impression is already Called");
        }
        if (c3740gk != null) {
            C3994r1 c3994r1 = c3740gk.f38657a;
            if (c3994r1 == null || (c3765hk = c3994r1.f39424b) == null || (atomicBoolean = c3765hk.f38721a) == null || !atomicBoolean.getAndSet(true)) {
                LinkedHashMap linkedHashMapA = c3740gk.a();
                linkedHashMapA.put("networkType", C4148x5.m());
                linkedHashMapA.put("errorCode", (short) 2179);
                String str2 = c3740gk.f38660d;
                if (str2 == null) {
                    str2 = "";
                }
                linkedHashMapA.put("impressionId", str2);
                Wj wj = Wj.f37959a;
                Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3585ak.f38215a);
            }
        }
    }
}
