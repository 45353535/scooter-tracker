package com.inmobi.media;

import android.database.sqlite.SQLiteDatabase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.f9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3703f9 extends kotlin.coroutines.jvm.internal.k implements Function1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SQLiteDatabase f38564a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f38565b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C3729g9 f38566c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.jvm.internal.k f38567d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C3703f9(C3729g9 c3729g9, Function2 function2, Continuation continuation) {
        super(1, continuation);
        this.f38566c = c3729g9;
        this.f38567d = (kotlin.coroutines.jvm.internal.k) function2;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Continuation continuation) {
        return new C3703f9(this.f38566c, this.f38567d, continuation);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new C3703f9(this.f38566c, this.f38567d, (Continuation) obj).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0058  */
    /* JADX WARN: Type inference failed for: r3v0, types: [kotlin.coroutines.jvm.internal.k, kotlin.jvm.functions.Function2] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            java.lang.Object r0 = pf.b.g()
            int r1 = r6.f38565b
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            android.database.sqlite.SQLiteDatabase r0 = r6.f38564a
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L11
            goto L40
        L11:
            r7 = move-exception
            goto L4f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.d.b(r7)
            com.inmobi.media.g9 r7 = r6.f38566c
            android.database.sqlite.SQLiteDatabase r1 = r7.f38624c
            if (r1 == 0) goto L5c
            kotlin.coroutines.jvm.internal.k r3 = r6.f38567d
            com.inmobi.media.k5 r4 = r7.f38623b
            int r4 = r4.f38858c
            r5 = 2
            if (r4 != r5) goto L31
            r1.beginTransactionNonExclusive()
            goto L34
        L31:
            r1.beginTransaction()
        L34:
            r6.f38564a = r1     // Catch: java.lang.Throwable -> L51
            r6.f38565b = r2     // Catch: java.lang.Throwable -> L51
            java.lang.Object r7 = r3.invoke(r7, r6)     // Catch: java.lang.Throwable -> L51
            if (r7 != r0) goto L3f
            return r0
        L3f:
            r0 = r1
        L40:
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L11
            boolean r7 = r0.inTransaction()
            if (r7 == 0) goto L4c
            r0.endTransaction()
        L4c:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L4f:
            r1 = r0
            goto L52
        L51:
            r7 = move-exception
        L52:
            boolean r0 = r1.inTransaction()
            if (r0 == 0) goto L5b
            r1.endTransaction()
        L5b:
            throw r7
        L5c:
            r7 = 0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3703f9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
