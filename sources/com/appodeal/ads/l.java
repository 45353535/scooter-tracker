package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.analytics.models.Event;
import com.appodeal.ads.analytics.models.PublicApiEvent;
import com.appodeal.ads.analytics.models.SdkInternalEvent;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class l extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f13554r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13555s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ApdInitializationCallback f13556t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ m2 f13557u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f13558v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f13559w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ int f13560x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ApdInitializationCallback apdInitializationCallback, m2 m2Var, Context context, String str, int i10, Continuation continuation) {
        super(2, continuation);
        this.f13556t = apdInitializationCallback;
        this.f13557u = m2Var;
        this.f13558v = context;
        this.f13559w = str;
        this.f13560x = i10;
    }

    public static final Event i() {
        return PublicApiEvent.SdkApiInitialized.INSTANCE;
    }

    public static final Event j(long j10) {
        return new SdkInternalEvent.SdkInitializationFinished(j10);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new l(this.f13556t, this.f13557u, this.f13558v, this.f13559w, this.f13560x, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0063, code lost:
    
        if (r10 == r0) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f  */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.l.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
