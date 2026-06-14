package com.appodeal.ads.context;

import android.app.Activity;
import com.appodeal.ads.modules.common.internal.context.ActivityProvider;
import hg.c0;
import java.lang.ref.WeakReference;
import kotlin.Lazy;
import kotlin.jvm.functions.Function0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;

/* JADX INFO: loaded from: classes6.dex */
public final class i implements ActivityProvider {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f13193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableSharedFlow f13194b = c0.b(1, 0, null, 6, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MutableSharedFlow f13195c = c0.b(1, 0, null, 6, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Lazy f13196d = lf.i.a(new Function0() { // from class: com.appodeal.ads.context.h
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return i.a(this.f13192b);
        }
    });

    public static final g a(i iVar) {
        return new g(iVar);
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider
    public final Flow getActivityFlow() {
        return this.f13194b;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider
    public final Activity getResumedActivity() {
        WeakReference weakReference = this.f13193a;
        if (weakReference != null) {
            return (Activity) weakReference.get();
        }
        return null;
    }

    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider
    public final Flow getResumedActivityFlow() {
        return this.f13195c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0097, code lost:
    
        r1 = r5.get(r4);
        kotlin.jvm.internal.Intrinsics.checkNotNull(r1, "null cannot be cast to non-null type android.app.Activity");
        r2 = (android.app.Activity) r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    @Override // com.appodeal.ads.modules.common.internal.context.ActivityProvider
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void observe(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 229
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.context.i.observe(android.content.Context):void");
    }
}
