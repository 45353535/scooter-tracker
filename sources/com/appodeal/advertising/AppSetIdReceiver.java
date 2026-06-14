package com.appodeal.advertising;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.x1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.sync.Mutex;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0005\u0010\u0006J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0086@¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/appodeal/advertising/AppSetIdReceiver;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "getAppSetId", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdScope", "advertising_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppSetIdReceiver {

    @NotNull
    public static final AppSetIdReceiver INSTANCE = new AppSetIdReceiver();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicReference f15329a = new AtomicReference(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Mutex f15330b = ng.f.b(false, 1, null);

    public static final Object access$fetchAppSetIdInfo(AppSetIdReceiver appSetIdReceiver, Context context, long j10, Continuation continuation) {
        appSetIdReceiver.getClass();
        return x1.e(j10, new k(context, null), continuation);
    }

    public static final boolean access$isDeveloperScope(AppSetIdReceiver appSetIdReceiver, int i10) {
        appSetIdReceiver.getClass();
        return i10 == 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ba, code lost:
    
        if (r9 == r1) goto L38;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v4, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r8v0, types: [android.content.Context, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11, types: [kotlinx.coroutines.sync.Mutex] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v4, types: [kotlinx.coroutines.sync.Mutex] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r8, kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.AppSetIdReceiver.a(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAppSetId(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.advertising.l
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.advertising.l r0 = (com.appodeal.advertising.l) r0
            int r1 = r0.f15345t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15345t = r1
            goto L18
        L13:
            com.appodeal.advertising.l r0 = new com.appodeal.advertising.l
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15343r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15345t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.d.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L2a
            r0.f15345t = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L42
            return r1
        L42:
            com.google.android.gms.appset.AppSetIdInfo r7 = (com.google.android.gms.appset.AppSetIdInfo) r7     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L4b
            java.lang.String r6 = r7.getId()     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L4b:
            r6 = r3
        L4c:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L51:
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L5b:
            boolean r7 = kotlin.Result.i(r6)
            if (r7 == 0) goto L62
            goto L63
        L62:
            r3 = r6
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.AppSetIdReceiver.getAppSetId(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAppSetIdScope(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.appodeal.advertising.m
            if (r0 == 0) goto L13
            r0 = r7
            com.appodeal.advertising.m r0 = (com.appodeal.advertising.m) r0
            int r1 = r0.f15348t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f15348t = r1
            goto L18
        L13:
            com.appodeal.advertising.m r0 = new com.appodeal.advertising.m
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f15346r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f15348t
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            kotlin.d.b(r7)
            kotlin.Result$Companion r7 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L2a
            r0.f15348t = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r7 = r5.a(r6, r0)     // Catch: java.lang.Throwable -> L2a
            if (r7 != r1) goto L42
            return r1
        L42:
            com.google.android.gms.appset.AppSetIdInfo r7 = (com.google.android.gms.appset.AppSetIdInfo) r7     // Catch: java.lang.Throwable -> L2a
            if (r7 == 0) goto L4f
            int r6 = r7.getScope()     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.d(r6)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L4f:
            r6 = r3
        L50:
            if (r6 != 0) goto L53
            goto L5d
        L53:
            int r7 = r6.intValue()     // Catch: java.lang.Throwable -> L2a
            r0 = 2
            if (r7 != r0) goto L5d
            java.lang.String r6 = "developer"
            goto L6a
        L5d:
            if (r6 != 0) goto L60
            goto L69
        L60:
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L2a
            if (r6 != r4) goto L69
            java.lang.String r6 = "app"
            goto L6a
        L69:
            r6 = r3
        L6a:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L79
        L6f:
            kotlin.Result$Companion r7 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L79:
            boolean r7 = kotlin.Result.i(r6)
            if (r7 == 0) goto L80
            goto L81
        L80:
            r3 = r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.advertising.AppSetIdReceiver.getAppSetIdScope(android.content.Context, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
