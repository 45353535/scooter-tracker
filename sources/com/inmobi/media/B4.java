package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class B4 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36606a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4 f36607b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W5 f36608c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f36609d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f36610e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B4(C4 c42, W5 w52, long j10, int i10, Continuation continuation) {
        super(2, continuation);
        this.f36607b = c42;
        this.f36608c = w52;
        this.f36609d = j10;
        this.f36610e = i10;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new B4(this.f36607b, this.f36608c, this.f36609d, this.f36610e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((B4) create((C3729g9) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r1.a(r8, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r7.f36606a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r8)
            goto L7e
        L12:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1a:
            kotlin.d.b(r8)
            goto L4f
        L1e:
            kotlin.d.b(r8)
            com.inmobi.media.C4 r8 = r7.f36607b
            com.inmobi.media.g9 r8 = r8.f36655a
            com.inmobi.media.W5 r1 = r7.f36608c
            java.lang.String r4 = "<this>"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r4)
            android.content.ContentValues r4 = new android.content.ContentValues
            r4.<init>()
            java.lang.String r5 = r1.f37931a
            java.lang.String r6 = "e_data"
            r4.put(r6, r5)
            long r5 = r1.f37932b
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            java.lang.String r5 = "timestamp"
            r4.put(r5, r1)
            r7.f36606a = r3
            r1 = 4
            java.lang.String r3 = "c_data"
            java.lang.Object r8 = r8.a(r3, r4, r1, r7)
            if (r8 != r0) goto L4f
            goto L7d
        L4f:
            long r3 = r7.f36609d
            int r8 = r7.f36610e
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r5 = "DELETE FROM c_data WHERE id NOT IN (SELECT id FROM (SELECT id FROM c_data WHERE timestamp > "
            r1.append(r5)
            r1.append(r3)
            java.lang.String r3 = " ORDER BY timestamp DESC LIMIT "
            r1.append(r3)
            r1.append(r8)
            java.lang.String r8 = ") foo);"
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            com.inmobi.media.C4 r1 = r7.f36607b
            com.inmobi.media.g9 r1 = r1.f36655a
            r7.f36606a = r2
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r0) goto L7e
        L7d:
            return r0
        L7e:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.B4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
