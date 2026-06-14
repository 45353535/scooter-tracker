package com.mobilefuse.sdk.utils;

import com.mobilefuse.sdk.AppLifecycleHelper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000%\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\b\u0004*\u0001\u0013\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003R0\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u00078\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/mobilefuse/sdk/utils/AppVisibilityObserver;", "", "<init>", "()V", "", "startActivityLifecycleObserving", "Lkotlin/Function1;", "", "onAppVisibilityChanged", "Lkotlin/jvm/functions/Function1;", "getOnAppVisibilityChanged", "()Lkotlin/jvm/functions/Function1;", "setOnAppVisibilityChanged", "(Lkotlin/jvm/functions/Function1;)V", "<set-?>", "appIsInForeground", "Z", "getAppIsInForeground", "()Z", "com/mobilefuse/sdk/utils/AppVisibilityObserver$activityLifecycleObserver$1", "activityLifecycleObserver", "Lcom/mobilefuse/sdk/utils/AppVisibilityObserver$activityLifecycleObserver$1;", "mobilefuse-sdk-common_release"}, k = 1, mv = {1, 4, 3})
public final class AppVisibilityObserver {

    @Nullable
    private Function1<? super Boolean, Unit> onAppVisibilityChanged;
    private boolean appIsInForeground = true;
    private final AppVisibilityObserver$activityLifecycleObserver$1 activityLifecycleObserver = new AppLifecycleHelper.ActivityLifecycleObserver() { // from class: com.mobilefuse.sdk.utils.AppVisibilityObserver$activityLifecycleObserver$1
        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInBackground() {
            this.this$0.appIsInForeground = false;
            Function1<Boolean, Unit> onAppVisibilityChanged = this.this$0.getOnAppVisibilityChanged();
            if (onAppVisibilityChanged != null) {
                onAppVisibilityChanged.invoke(Boolean.valueOf(this.this$0.getAppIsInForeground()));
            }
        }

        @Override // com.mobilefuse.sdk.AppLifecycleHelper.ActivityLifecycleObserver
        public void onApplicationInForeground() {
            this.this$0.appIsInForeground = true;
            Function1<Boolean, Unit> onAppVisibilityChanged = this.this$0.getOnAppVisibilityChanged();
            if (onAppVisibilityChanged != null) {
                onAppVisibilityChanged.invoke(Boolean.valueOf(this.this$0.getAppIsInForeground()));
            }
        }
    };

    public final boolean getAppIsInForeground() {
        return this.appIsInForeground;
    }

    @Nullable
    public final Function1<Boolean, Unit> getOnAppVisibilityChanged() {
        return this.onAppVisibilityChanged;
    }

    public final void setOnAppVisibilityChanged(@Nullable Function1<? super Boolean, Unit> function1) {
        this.onAppVisibilityChanged = function1;
    }

    public final void startActivityLifecycleObserving() {
        AppLifecycleHelper.addActivityLifecycleObserver(this.activityLifecycleObserver);
    }
}
