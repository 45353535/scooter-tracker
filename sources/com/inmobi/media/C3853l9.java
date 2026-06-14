package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import j$.util.Objects;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.l9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3853l9 implements Gg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InMobiJsonResponse f38962b;

    public C3853l9(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        this.f38961a = content;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    @Override // com.inmobi.media.Gg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            r0 = 1
            java.lang.String r1 = "type"
            boolean r2 = r7 instanceof com.inmobi.media.C3828k9
            if (r2 == 0) goto L16
            r2 = r7
            com.inmobi.media.k9 r2 = (com.inmobi.media.C3828k9) r2
            int r3 = r2.f38870d
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f38870d = r3
            goto L1d
        L16:
            com.inmobi.media.k9 r2 = new com.inmobi.media.k9
            kotlin.coroutines.jvm.internal.d r7 = (kotlin.coroutines.jvm.internal.d) r7
            r2.<init>(r6, r7)
        L1d:
            java.lang.Object r7 = r2.f38868b
            java.lang.Object r3 = pf.b.g()
            int r4 = r2.f38870d
            if (r4 == 0) goto L39
            if (r4 != r0) goto L31
            com.inmobi.media.l9 r1 = r2.f38867a
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2f
            goto L66
        L2f:
            r7 = move-exception
            goto L6d
        L31:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L39:
            kotlin.d.b(r7)
            java.lang.Class<com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse> r7 = com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse.class
            java.lang.String r4 = "clazz"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r4)     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = r6.f38961a     // Catch: java.lang.Throwable -> L2f
            r2.f38867a = r6     // Catch: java.lang.Throwable -> L2f
            r2.f38870d = r0     // Catch: java.lang.Throwable -> L2f
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2f
            java.lang.String r4 = "jsonObject"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r4)     // Catch: java.lang.Throwable -> L2f
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r1)     // Catch: java.lang.Throwable -> L2f
            r1 = 0
            java.lang.Object r1 = com.inmobi.media.AbstractC3879ma.a(r2, r7, r1, r1)     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r7 = r7.cast(r1)     // Catch: java.lang.Throwable -> L2f
            if (r7 != r3) goto L65
            return r3
        L65:
            r1 = r6
        L66:
            com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse r7 = (com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse) r7     // Catch: java.lang.Throwable -> L2f
            r1.f38962b = r7     // Catch: java.lang.Throwable -> L2f
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L6d:
            lf.c.b(r7)
            boolean r1 = r7 instanceof org.json.JSONException
            if (r1 != 0) goto L7e
            boolean r7 = r7 instanceof java.lang.ClassCastException
            if (r7 == 0) goto L7b
            r7 = 2310(0x906, float:3.237E-42)
            goto L80
        L7b:
            r7 = 2311(0x907, float:3.238E-42)
            goto L80
        L7e:
            r7 = 2309(0x905, float:3.236E-42)
        L80:
            short r7 = (short) r7
            java.lang.Short r7 = kotlin.coroutines.jvm.internal.b.f(r7)
            java.lang.String r1 = "errorCode"
            kotlin.Pair r7 = kotlin.TuplesKt.to(r1, r7)
            kotlin.Pair[] r0 = new kotlin.Pair[r0]
            r1 = 0
            r0[r1] = r7
            java.util.Map r7 = kotlin.collections.MapsKt.mutableMapOf(r0)
            com.inmobi.media.Y r0 = new com.inmobi.media.Y
            com.inmobi.ads.InMobiAdRequestStatus r1 = new com.inmobi.ads.InMobiAdRequestStatus
            com.inmobi.ads.InMobiAdRequestStatus$StatusCode r2 = com.inmobi.ads.InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR
            r1.<init>(r2)
            com.inmobi.media.Ni r2 = new com.inmobi.media.Ni
            r2.<init>(r7)
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3853l9.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.inmobi.media.Gg
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InMobiJsonResponse b() {
        Objects.toString(this.f38962b);
        return this.f38962b;
    }

    @Override // com.inmobi.media.Gg
    public final void a() {
        if (this.f38962b == null || this.f38961a.length() == 0) {
            throw new Ig(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), new Ni(MapsKt.mutableMapOf(TuplesKt.to("errorCode", (short) 3))));
        }
    }
}
