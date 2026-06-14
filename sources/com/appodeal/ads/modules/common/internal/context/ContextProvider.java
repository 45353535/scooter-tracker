package com.appodeal.ads.modules.common.internal.context;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\n\u0010\u000f\u001a\u0004\u0018\u00010\fH&J\u000e\u0010\u0010\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u000b\u001a\u00020\fX¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "", "resumedActivity", "Landroid/app/Activity;", "getResumedActivity", "()Landroid/app/Activity;", "activityFlow", "Lkotlinx/coroutines/flow/Flow;", "Lcom/appodeal/ads/modules/common/internal/context/ActivityProvider$State;", "getActivityFlow", "()Lkotlinx/coroutines/flow/Flow;", "applicationContext", "Landroid/content/Context;", "getApplicationContext", "()Landroid/content/Context;", "getApplicationContextOrNull", "awaitResumedActivity", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Synchronizer", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface ContextProvider {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/modules/common/internal/context/ContextProvider$Synchronizer;", "", "setApplicationContext", "", "applicationContext", "Landroid/content/Context;", "internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface Synchronizer {
        void setApplicationContext(Context applicationContext);
    }

    Object awaitResumedActivity(Continuation continuation);

    Flow getActivityFlow();

    Context getApplicationContext();

    Context getApplicationContextOrNull();

    Activity getResumedActivity();
}
