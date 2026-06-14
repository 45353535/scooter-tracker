package com.mobilefuse.sdk;

import android.app.Activity;
import com.mobilefuse.sdk.AppLifecycleHelper;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.TryKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/mobilefuse/sdk/exception/TryKt$runnableTry$1"}, k = 3, mv = {1, 4, 3})
public final class AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityDestroyed$$inlined$runnableTry$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Activity $activity$inlined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityDestroyed$$inlined$runnableTry$1(Activity activity) {
        super(0);
        this.$activity$inlined = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f93236a;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            AppLifecycleHelper.INSTANCE.callActivityObservers(new Function1<AppLifecycleHelper.ActivityLifecycleObserver, Unit>() { // from class: com.mobilefuse.sdk.AppLifecycleHelper$getActivityLifecycleCallbacks$1$onActivityDestroyed$$inlined$runnableTry$1$lambda$1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AppLifecycleHelper.ActivityLifecycleObserver activityLifecycleObserver) {
                    invoke2(activityLifecycleObserver);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AppLifecycleHelper.ActivityLifecycleObserver it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    it.onActivityDestroyed(this.this$0.$activity$inlined);
                }
            });
        } catch (Throwable th2) {
            int i10 = TryKt.WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new lf.m();
            }
        }
    }
}
