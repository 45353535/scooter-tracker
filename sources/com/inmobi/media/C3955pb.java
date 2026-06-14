package com.inmobi.media;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: renamed from: com.inmobi.media.pb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3955pb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Mutex[] f39269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f39270b;

    public C3955pb() {
        Mutex[] mutexArr = new Mutex[16];
        for (int i10 = 0; i10 < 16; i10++) {
            mutexArr[i10] = ng.f.b(false, 1, null);
        }
        this.f39269a = mutexArr;
        this.f39270b = new LinkedHashMap();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r9, com.inmobi.media.ho r10, kotlin.coroutines.jvm.internal.d r11) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r11 instanceof com.inmobi.media.C3905nb
            if (r0 == 0) goto L13
            r0 = r11
            com.inmobi.media.nb r0 = (com.inmobi.media.C3905nb) r0
            int r1 = r0.f39093f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39093f = r1
            goto L18
        L13:
            com.inmobi.media.nb r0 = new com.inmobi.media.nb
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.f39091d
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39093f
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L4c
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L36
            java.lang.Object r9 = r0.f39089b
            kotlinx.coroutines.sync.Mutex r9 = (kotlinx.coroutines.sync.Mutex) r9
            java.lang.String r10 = r0.f39088a
            kotlin.d.b(r11)     // Catch: java.lang.Throwable -> L33
            goto L8b
        L33:
            r10 = move-exception
            goto L9a
        L36:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3e:
            kotlinx.coroutines.sync.Mutex r9 = r0.f39090c
            java.lang.Object r10 = r0.f39089b
            kotlin.jvm.functions.Function1 r10 = (kotlin.jvm.functions.Function1) r10
            java.lang.String r2 = r0.f39088a
            kotlin.d.b(r11)
            r11 = r9
            r9 = r2
            goto L70
        L4c:
            kotlin.d.b(r11)
            if (r9 == 0) goto L56
            int r11 = r9.hashCode()
            goto L57
        L56:
            r11 = 0
        L57:
            kotlinx.coroutines.sync.Mutex[] r2 = r8.f39269a
            r6 = 16
            int r11 = w3.ha.a(r11, r6)
            r11 = r2[r11]
            r0.f39088a = r9
            r0.f39089b = r10
            r0.f39090c = r11
            r0.f39093f = r4
            java.lang.Object r2 = r11.lock(r5, r0)
            if (r2 != r1) goto L70
            goto L86
        L70:
            java.util.LinkedHashMap r2 = r8.f39270b     // Catch: java.lang.Throwable -> L93
            java.lang.Object r2 = r2.get(r9)     // Catch: java.lang.Throwable -> L93
            if (r2 != 0) goto L96
            r0.f39088a = r9     // Catch: java.lang.Throwable -> L93
            r0.f39089b = r11     // Catch: java.lang.Throwable -> L93
            r0.f39090c = r5     // Catch: java.lang.Throwable -> L93
            r0.f39093f = r3     // Catch: java.lang.Throwable -> L93
            java.lang.Object r10 = r10.invoke(r0)     // Catch: java.lang.Throwable -> L93
            if (r10 != r1) goto L87
        L86:
            return r1
        L87:
            r7 = r10
            r10 = r9
            r9 = r11
            r11 = r7
        L8b:
            java.util.LinkedHashMap r0 = r8.f39270b     // Catch: java.lang.Throwable -> L33
            r0.put(r10, r11)     // Catch: java.lang.Throwable -> L33
            r2 = r11
            r11 = r9
            goto L96
        L93:
            r10 = move-exception
            r9 = r11
            goto L9a
        L96:
            r11.unlock(r5)
            return r2
        L9a:
            r9.unlock(r5)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3955pb.a(java.lang.String, com.inmobi.media.ho, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final String toString() {
        String str = this.f39270b.toString();
        Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.lang.String r7, kotlin.coroutines.jvm.internal.d r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof com.inmobi.media.C3930ob
            if (r0 == 0) goto L13
            r0 = r8
            com.inmobi.media.ob r0 = (com.inmobi.media.C3930ob) r0
            int r1 = r0.f39186e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f39186e = r1
            goto L18
        L13:
            com.inmobi.media.ob r0 = new com.inmobi.media.ob
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.f39184c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f39186e
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L2e
            kotlinx.coroutines.sync.Mutex r7 = r0.f39183b
            java.lang.String r0 = r0.f39182a
            kotlin.d.b(r8)
            goto L5a
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L36:
            kotlin.d.b(r8)
            if (r7 == 0) goto L40
            int r8 = r7.hashCode()
            goto L41
        L40:
            r8 = 0
        L41:
            kotlinx.coroutines.sync.Mutex[] r2 = r6.f39269a
            r5 = 16
            int r8 = w3.ha.a(r8, r5)
            r8 = r2[r8]
            r0.f39182a = r7
            r0.f39183b = r8
            r0.f39186e = r3
            java.lang.Object r0 = r8.lock(r4, r0)
            if (r0 != r1) goto L58
            return r1
        L58:
            r0 = r7
            r7 = r8
        L5a:
            java.util.LinkedHashMap r8 = r6.f39270b     // Catch: java.lang.Throwable -> L65
            r8.remove(r0)     // Catch: java.lang.Throwable -> L65
            r7.unlock(r4)
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L65:
            r8 = move-exception
            r7.unlock(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3955pb.a(java.lang.String, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }
}
