package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@StabilityInferred(parameters = 1)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\b\u001a\u00020\tH\u0096@¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u0084\u0002"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/persistenttransport/UrlPostRequestWorker;", "Landroidx/work/CoroutineWorker;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "params", "Landroidx/work/WorkerParameters;", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "doWork", "Landroidx/work/ListenableWorker$Result;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "moloco-sdk_release", "url", ""}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class UrlPostRequestWorker extends CoroutineWorker {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ KProperty[] f58936b = {v0.i(new l0(UrlPostRequestWorker.class, "url", "<v#0>", 0))};

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f58937r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f58938s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58939t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f58941v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f58939t = obj;
            this.f58941v |= Integer.MIN_VALUE;
            return UrlPostRequestWorker.this.doWork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UrlPostRequestWorker(@NotNull Context context, @NotNull WorkerParameters params) {
        super(com.moloco.sdk.internal.android_context.b.a(context), params);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(params, "params");
    }

    public static final String b(Map map) {
        Intrinsics.checkNotNull(map);
        return (String) MapsKt.getOrImplicitDefaultNullable(map, f58936b[0].getName());
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    @Override // androidx.work.CoroutineWorker
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object doWork(kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.UrlPostRequestWorker.doWork(kotlin.coroutines.Continuation):java.lang.Object");
    }
}
