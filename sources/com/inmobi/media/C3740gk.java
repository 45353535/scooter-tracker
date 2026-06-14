package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdSet;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.gk, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3740gk {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3994r1 f38657a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f38658b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f38659c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f38660d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f38661e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f38662f;

    public C3740gk(C3994r1 c3994r1, String str, String str2, String str3, String markupType) {
        Intrinsics.checkNotNullParameter(markupType, "markupType");
        this.f38657a = c3994r1;
        this.f38658b = str;
        this.f38659c = str2;
        this.f38660d = str3;
        this.f38661e = markupType;
    }

    public final LinkedHashMap a() {
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C3994r1 c3994r1 = this.f38657a;
        if (c3994r1 != null) {
            linkedHashMap.put("adType", c3994r1.f39423a.l());
        }
        C3994r1 c3994r12 = this.f38657a;
        if (c3994r12 != null) {
            linkedHashMap.put("plId", Long.valueOf(c3994r12.f39423a.f38926l.f39711a));
        }
        C3994r1 c3994r13 = this.f38657a;
        if (c3994r13 != null && (str = c3994r13.f39423a.f38926l.f39716f) != null) {
            linkedHashMap.put("plType", str);
        }
        C3994r1 c3994r14 = this.f38657a;
        String str2 = null;
        if (c3994r14 != null) {
            AdSet adSetR = c3994r14.f39423a.r();
            Boolean boolValueOf = adSetR != null ? Boolean.valueOf(adSetR.getIsRewarded()) : null;
            if (boolValueOf != null) {
                linkedHashMap.put("isRewarded", boolValueOf);
            }
        }
        String str3 = this.f38659c;
        if (str3 != null) {
            linkedHashMap.put("creativeId", str3);
        }
        String str4 = this.f38658b;
        if (str4 != null) {
            linkedHashMap.put("creativeType", str4);
        }
        linkedHashMap.put("markupType", this.f38661e);
        String str5 = this.f38662f;
        if (str5 != null) {
            str2 = str5;
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("triggerSource");
        }
        linkedHashMap.put("trigger", str2);
        C3994r1 c3994r15 = this.f38657a;
        if (c3994r15 != null && c3994r15.a().length() > 0) {
            linkedHashMap.put("metadataBlob", this.f38657a.a());
        }
        return linkedHashMap;
    }

    public final void b() {
        C3765hk c3765hk;
        AtomicBoolean atomicBoolean;
        C3994r1 c3994r1 = this.f38657a;
        if (c3994r1 == null || (c3765hk = c3994r1.f39424b) == null || (atomicBoolean = c3765hk.f38721a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C4148x5.m());
            linkedHashMapA.put("errorCode", (short) 2177);
            String str = this.f38660d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.f37959a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3585ak.f38215a);
        }
    }

    public final void c() {
        C3765hk c3765hk;
        AtomicBoolean atomicBoolean;
        C3994r1 c3994r1 = this.f38657a;
        if (c3994r1 == null || (c3765hk = c3994r1.f39424b) == null || (atomicBoolean = c3765hk.f38721a) == null || !atomicBoolean.getAndSet(true)) {
            LinkedHashMap linkedHashMapA = a();
            linkedHashMapA.put("networkType", C4148x5.m());
            linkedHashMapA.put("errorCode", (short) 0);
            String str = this.f38660d;
            if (str == null) {
                str = "";
            }
            linkedHashMapA.put("impressionId", str);
            Wj wj = Wj.f37959a;
            Wj.b("AdImpressionSuccessful", linkedHashMapA, EnumC3585ak.f38215a);
        }
    }
}
