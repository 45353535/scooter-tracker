package com.inmobi.unifiedId;

import androidx.annotation.VisibleForTesting;
import com.adjust.sdk.Constants;
import com.inmobi.ads.exceptions.SdkNotInitializedException;
import com.inmobi.media.A9;
import com.inmobi.media.F9;
import com.inmobi.media.G9;
import com.inmobi.media.I9;
import com.inmobi.media.Ji;
import com.inmobi.media.Jk;
import com.inmobi.media.K9;
import com.inmobi.media.Ok;
import eg.i;
import j$.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\r\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0081@¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u00020\u00108FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/inmobi/unifiedId/InMobiUnifiedIdService;", "", "Lcom/inmobi/unifiedId/InMobiUserDataModel;", "inMobiUserDataModel", "", Constants.PUSH, "(Lcom/inmobi/unifiedId/InMobiUserDataModel;)V", "Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;", "inMobiUnifiedIdInterface", "fetchUnifiedIds", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;)V", "fetchUnifiedIdsInternal$media_release", "(Lcom/inmobi/unifiedId/InMobiUnifiedIdInterface;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchUnifiedIdsInternal", "reset", "()V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isPushCalled$annotations", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InMobiUnifiedIdService {

    @NotNull
    public static final InMobiUnifiedIdService INSTANCE = new InMobiUnifiedIdService();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final AtomicBoolean f40086a = new AtomicBoolean();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Mutex f40087b = f.b(false, 1, null);

    public static final Object a(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        JSONObject jSONObjectB = F9.b();
        if (!Ok.b(jSONObjectB) && jSONObjectB != null && Ok.c(jSONObjectB)) {
            Object objA = Jk.a(inMobiUnifiedIdInterface, continuation);
            return objA == b.g() ? objA : Unit.f93236a;
        }
        if (inMobiUnifiedIdInterface != null) {
            if (!Ok.b(jSONObjectB)) {
                Ok.a(inMobiUnifiedIdInterface, jSONObjectB, null);
            } else {
                if (f40086a.get()) {
                    Object objA2 = Jk.a(inMobiUnifiedIdInterface, continuation);
                    return objA2 == b.g() ? objA2 : Unit.f93236a;
                }
                Ok.a(inMobiUnifiedIdInterface, null, new Error(InMobiUnifiedIdInterface.PUSH_NEEDS_TO_BE_CALLED_FIRST));
            }
        }
        return Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x006a, code lost:
    
        if (r7 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object access$resetInternal(kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof com.inmobi.media.L9
            if (r0 == 0) goto L13
            r0 = r7
            com.inmobi.media.L9 r0 = (com.inmobi.media.L9) r0
            int r1 = r0.f37272b
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37272b = r1
            goto L18
        L13:
            com.inmobi.media.L9 r0 = new com.inmobi.media.L9
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f37271a
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f37272b
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            kotlin.d.b(r7)
            goto L6d
        L2e:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L36:
            kotlin.d.b(r7)
            goto L52
        L3a:
            kotlin.d.b(r7)
            java.lang.String r7 = "InMobiUnifiedIdService"
            java.lang.String r2 = "TAG"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r7, r2)
            java.util.concurrent.atomic.AtomicBoolean r7 = com.inmobi.unifiedId.InMobiUnifiedIdService.f40086a
            r7.set(r5)
            r0.f37272b = r4
            java.lang.Object r7 = com.inmobi.media.C3572a7.a(r6, r0)
            if (r7 != r1) goto L52
            goto L6c
        L52:
            com.inmobi.media.Jk r7 = com.inmobi.media.Jk.f37166a
            r0.f37272b = r3
            com.inmobi.media.qh r7 = com.inmobi.media.Jk.f37167b
            com.inmobi.media.Ik r2 = new com.inmobi.media.Ik
            r2.<init>(r6)
            java.lang.Object r7 = com.inmobi.media.F3.a(r7, r2, r0)
            java.lang.Object r0 = pf.b.g()
            if (r7 != r0) goto L68
            goto L6a
        L68:
            kotlin.Unit r7 = kotlin.Unit.f93236a
        L6a:
            if (r7 != r1) goto L6d
        L6c:
            return r1
        L6d:
            com.inmobi.media.F9.b(r6)
            com.inmobi.media.F9.a(r6)
            com.inmobi.media.F9.f36834d = r5
            com.inmobi.media.F9.f36833c = r5
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.access$resetInternal(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final void fetchUnifiedIds(@Nullable InMobiUnifiedIdInterface inMobiUnifiedIdInterface) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            i.d(A9.f36557c, null, null, new G9(inMobiUnifiedIdInterface, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x012c, code lost:
    
        if (a(r12, r0) == r1) goto L67;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @androidx.annotation.WorkerThread
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object fetchUnifiedIdsInternal$media_release(@org.jetbrains.annotations.Nullable com.inmobi.unifiedId.InMobiUnifiedIdInterface r12, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(com.inmobi.unifiedId.InMobiUnifiedIdInterface, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @VisibleForTesting(otherwise = 5)
    public static /* synthetic */ void isPushCalled$annotations() {
    }

    public static final void push(@Nullable InMobiUserDataModel inMobiUserDataModel) {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        Objects.toString(inMobiUserDataModel);
        if (Ji.d()) {
            i.d(A9.f36557c, null, null, new I9(inMobiUserDataModel, null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    public static final void reset() {
        Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
        if (Ji.d()) {
            i.d(A9.f36557c, null, null, new K9(null), 3, null);
        } else {
            Intrinsics.checkNotNullExpressionValue("InMobiUnifiedIdService", "TAG");
            throw new SdkNotInitializedException("InMobiUnifiedIdService");
        }
    }

    @NotNull
    public final AtomicBoolean isPushCalled() {
        return f40086a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00f3, code lost:
    
        if (r9.a((kotlin.coroutines.jvm.internal.d) r0) == r1) goto L58;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(com.inmobi.unifiedId.InMobiUserDataModel r9, kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 249
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.unifiedId.InMobiUnifiedIdService.a(com.inmobi.unifiedId.InMobiUserDataModel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
