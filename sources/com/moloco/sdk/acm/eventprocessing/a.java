package com.moloco.sdk.acm.eventprocessing;

import com.google.protobuf.GeneratedMessageLite;
import com.moloco.sdk.MetricsRequest$PostMetricsRequest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import lf.m;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f54001a;

    /* JADX INFO: renamed from: com.moloco.sdk.acm.eventprocessing.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0656a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f54002a;

        static {
            int[] iArr = new int[com.moloco.sdk.acm.db.c.values().length];
            try {
                iArr[com.moloco.sdk.acm.db.c.f53965c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.acm.db.c.f53964b.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f54002a = iArr;
        }
    }

    public a(e dataAgeChecker) {
        Intrinsics.checkNotNullParameter(dataAgeChecker, "dataAgeChecker");
        this.f54001a = dataAgeChecker;
    }

    public com.moloco.sdk.acm.http.h a(List events) {
        Intrinsics.checkNotNullParameter(events, "events");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = events.iterator();
        while (it.hasNext()) {
            com.moloco.sdk.acm.db.b bVar = (com.moloco.sdk.acm.db.b) it.next();
            if (!this.f54001a.a(bVar)) {
                int i10 = C0656a.f54002a[bVar.b().ordinal()];
                if (i10 == 1) {
                    MetricsRequest$PostMetricsRequest.CountEvent.a aVarA = MetricsRequest$PostMetricsRequest.CountEvent.newBuilder().c(bVar.d()).a(bVar.e());
                    Long lA = bVar.a();
                    if (lA != null) {
                        aVarA.b((int) lA.longValue());
                    }
                    GeneratedMessageLite generatedMessageLiteBuild = aVarA.build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild, "build(...)");
                    arrayList2.add(generatedMessageLiteBuild);
                } else {
                    if (i10 != 2) {
                        throw new m();
                    }
                    MetricsRequest$PostMetricsRequest.TimerEvent.a aVarA2 = MetricsRequest$PostMetricsRequest.TimerEvent.newBuilder().c(bVar.d()).a(bVar.e());
                    Long lA2 = bVar.a();
                    if (lA2 != null) {
                        aVarA2.b(lA2.longValue());
                    }
                    GeneratedMessageLite generatedMessageLiteBuild2 = aVarA2.build();
                    Intrinsics.checkNotNullExpressionValue(generatedMessageLiteBuild2, "build(...)");
                    arrayList.add(generatedMessageLiteBuild2);
                }
            }
        }
        return new com.moloco.sdk.acm.http.h(arrayList2, arrayList);
    }
}
