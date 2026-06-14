package org.bidon.sdk.databinders.user.impl;

import android.content.Context;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.x1;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;
import ng.f;
import org.bidon.sdk.logs.logging.impl.LogExtKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0002\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\bH\u0082@¢\u0006\u0002\u0010\rJ\u001a\u0010\u0014\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u0015\u001a\u00020\u0016H\u0082@¢\u0006\u0002\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lorg/bidon/sdk/databinders/user/impl/AppSetIdReceiver;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "cachedAppSetIdInfo", "Ljava/util/concurrent/atomic/AtomicReference;", "Lcom/google/android/gms/appset/AppSetIdInfo;", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "getAppSetId", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAppSetIdScope", "isDeveloperScope", "", "scope", "", "getOrFetchAppSetIdInfo", "fetchAppSetIdInfo", "timeoutMs", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppSetIdReceiver {

    @NotNull
    private final AtomicReference<AppSetIdInfo> cachedAppSetIdInfo;

    @NotNull
    private final Context context;

    @NotNull
    private final Mutex mutex;

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$fetchAppSetIdInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Lcom/google/android/gms/appset/AppSetIdInfo;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$fetchAppSetIdInfo$2", f = "AppSetIdReceiver.kt", l = {95}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        Object L$0;
        int label;

        AnonymousClass2(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return AppSetIdReceiver.this.new AnonymousClass2(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            final AppSetIdReceiver appSetIdReceiver = AppSetIdReceiver.this;
            this.L$0 = appSetIdReceiver;
            this.label = 1;
            final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(b.d(this), 1);
            eVar.I();
            try {
                Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(appSetIdReceiver.context).getAppSetIdInfo();
                final Function1<AppSetIdInfo, Unit> function1 = new Function1<AppSetIdInfo, Unit>() { // from class: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$fetchAppSetIdInfo$2$1$1
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AppSetIdInfo appSetIdInfo2) {
                        invoke2(appSetIdInfo2);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AppSetIdInfo appSetIdInfo2) {
                        if (eVar.isActive()) {
                            LogExtKt.logInfo("AppSetIdInfoManager", "AppSetId: Id: " + appSetIdInfo2.getId() + ", isDeveloperScope: " + appSetIdReceiver.isDeveloperScope(appSetIdInfo2.getScope()));
                            eVar.resumeWith(Result.b(appSetIdInfo2));
                        }
                    }
                };
                Intrinsics.checkNotNull(appSetIdInfo.addOnSuccessListener(new OnSuccessListener(function1) { // from class: org.bidon.sdk.databinders.user.impl.AppSetIdReceiverKt$sam$com_google_android_gms_tasks_OnSuccessListener$0
                    private final /* synthetic */ Function1 function;

                    {
                        Intrinsics.checkNotNullParameter(function1, "function");
                        this.function = function1;
                    }

                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final /* synthetic */ void onSuccess(@RecentlyNonNull Object obj2) {
                        this.function.invoke(obj2);
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$fetchAppSetIdInfo$2$1$2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exc) {
                        if (eVar.isActive()) {
                            LogExtKt.logError("AppSetIdInfoManager", "AppSetId wasn't received. Exception", exc);
                            CancellableContinuation cancellableContinuation = eVar;
                            Result.Companion companion = Result.f93230c;
                            Intrinsics.checkNotNull(exc);
                            cancellableContinuation.resumeWith(Result.b(d.a(exc)));
                        }
                    }
                }));
            } catch (Exception e10) {
                if (eVar.isActive()) {
                    LogExtKt.logError("AppSetIdInfoManager", "AppSetId wasn't received. Exception", e10);
                    Result.Companion companion = Result.f93230c;
                    eVar.resumeWith(Result.b(d.a(e10)));
                }
            }
            Object objC = eVar.C();
            if (objC == b.g()) {
                g.c(this);
            }
            return objC == objG ? objG : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetId$1, reason: invalid class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.impl.AppSetIdReceiver", f = "AppSetIdReceiver.kt", l = {24}, m = "getAppSetId")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdReceiver.this.getAppSetId(this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetIdScope$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.impl.AppSetIdReceiver", f = "AppSetIdReceiver.kt", l = {30}, m = "getAppSetIdScope")
    static final class C58221 extends kotlin.coroutines.jvm.internal.d {
        int label;
        /* synthetic */ Object result;

        C58221(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdReceiver.this.getAppSetIdScope(this);
        }
    }

    /* JADX INFO: renamed from: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getOrFetchAppSetIdInfo$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    @e(c = "org.bidon.sdk.databinders.user.impl.AppSetIdReceiver", f = "AppSetIdReceiver.kt", l = {100, 51}, m = "getOrFetchAppSetIdInfo")
    static final class C58231 extends kotlin.coroutines.jvm.internal.d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C58231(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AppSetIdReceiver.this.getOrFetchAppSetIdInfo(this);
        }
    }

    public AppSetIdReceiver(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.cachedAppSetIdInfo = new AtomicReference<>(null);
        this.mutex = f.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object fetchAppSetIdInfo(long j10, Continuation continuation) {
        return x1.e(j10, new AnonymousClass2(null), continuation);
    }

    static /* synthetic */ Object fetchAppSetIdInfo$default(AppSetIdReceiver appSetIdReceiver, long j10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = 500;
        }
        return appSetIdReceiver.fetchAppSetIdInfo(j10, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00be A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #2 {all -> 0x003b, blocks: (B:14:0x0036, B:37:0x00ba, B:39:0x00be), top: B:59:0x0036 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getOrFetchAppSetIdInfo(kotlin.coroutines.Continuation r10) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.getOrFetchAppSetIdInfo(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isDeveloperScope(int scope) {
        return scope == 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAppSetId(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r6
            org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetId$1 r0 = (org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetId$1 r0 = new org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetId$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L51
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r5.getOrFetchAppSetIdInfo(r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            com.google.android.gms.appset.AppSetIdInfo r6 = (com.google.android.gms.appset.AppSetIdInfo) r6     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L4b
            java.lang.String r6 = r6.getId()     // Catch: java.lang.Throwable -> L2a
            goto L4c
        L4b:
            r6 = r3
        L4c:
            java.lang.Object r6 = kotlin.Result.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L5b
        L51:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L5b:
            boolean r0 = kotlin.Result.i(r6)
            if (r0 == 0) goto L62
            goto L63
        L62:
            r3 = r6
        L63:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.getAppSetId(kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAppSetIdScope(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.C58221
            if (r0 == 0) goto L13
            r0 = r6
            org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetIdScope$1 r0 = (org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.C58221) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetIdScope$1 r0 = new org.bidon.sdk.databinders.user.impl.AppSetIdReceiver$getAppSetIdScope$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L2a
            goto L42
        L2a:
            r6 = move-exception
            goto L6f
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            kotlin.d.b(r6)
            kotlin.Result$Companion r6 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L2a
            r0.label = r4     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r6 = r5.getOrFetchAppSetIdInfo(r0)     // Catch: java.lang.Throwable -> L2a
            if (r6 != r1) goto L42
            return r1
        L42:
            com.google.android.gms.appset.AppSetIdInfo r6 = (com.google.android.gms.appset.AppSetIdInfo) r6     // Catch: java.lang.Throwable -> L2a
            if (r6 == 0) goto L4f
            int r6 = r6.getScope()     // Catch: java.lang.Throwable -> L2a
            java.lang.Integer r6 = kotlin.coroutines.jvm.internal.b.d(r6)     // Catch: java.lang.Throwable -> L2a
            goto L50
        L4f:
            r6 = r3
        L50:
            if (r6 != 0) goto L53
            goto L5d
        L53:
            int r0 = r6.intValue()     // Catch: java.lang.Throwable -> L2a
            r1 = 2
            if (r0 != r1) goto L5d
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
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r6 = kotlin.d.a(r6)
            java.lang.Object r6 = kotlin.Result.b(r6)
        L79:
            boolean r0 = kotlin.Result.i(r6)
            if (r0 == 0) goto L80
            goto L81
        L80:
            r3 = r6
        L81:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: org.bidon.sdk.databinders.user.impl.AppSetIdReceiver.getAppSetIdScope(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
