package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class V2 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37875a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f37876b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ W2 f37877c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ S2 f37878d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(int i10, W2 w22, S2 s22, Continuation continuation) {
        super(2, continuation);
        this.f37876b = i10;
        this.f37877c = w22;
        this.f37878d = s22;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new V2(this.f37876b, this.f37877c, this.f37878d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((V2) create((C3729g9) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005a, code lost:
    
        if (r6.a("click", r1, 5, r5) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r5.f37875a
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L12
            kotlin.d.b(r6)
            goto L5d
        L12:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L1a:
            kotlin.d.b(r6)
            goto L47
        L1e:
            kotlin.d.b(r6)
            int r6 = r5.f37876b
            int r6 = r6 - r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = "DELETE FROM click WHERE ts = (SELECT ts FROM click ORDER BY ts ASC LIMIT 1) AND (SELECT COUNT(*) FROM click) > "
            r1.append(r4)
            r1.append(r6)
            java.lang.String r6 = ";"
            r1.append(r6)
            java.lang.String r6 = r1.toString()
            com.inmobi.media.W2 r1 = r5.f37877c
            com.inmobi.media.g9 r1 = r1.f37928a
            r5.f37875a = r3
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r0) goto L47
            goto L5c
        L47:
            com.inmobi.media.W2 r6 = r5.f37877c
            com.inmobi.media.g9 r6 = r6.f37928a
            com.inmobi.media.S2 r1 = r5.f37878d
            android.content.ContentValues r1 = com.inmobi.media.Y2.a(r1)
            r5.f37875a = r2
            java.lang.String r2 = "click"
            r3 = 5
            java.lang.Object r6 = r6.a(r2, r1, r3, r5)
            if (r6 != r0) goto L5d
        L5c:
            return r0
        L5d:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.V2.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
