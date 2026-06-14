package com.appodeal.ads.services;

import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.service.Purchasable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class q extends kotlin.coroutines.jvm.internal.k implements Function2 {
    public final /* synthetic */ Function0 A;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public List f14714r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public InAppPurchase f14715s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Collection f14716t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public Iterator f14717u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Purchasable f14718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14719w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final /* synthetic */ r f14720x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseValidateCallback f14721y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final /* synthetic */ InAppPurchase f14722z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r rVar, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, InAppPurchase inAppPurchase, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f14720x = rVar;
        this.f14721y = inAppPurchaseValidateCallback;
        this.f14722z = inAppPurchase;
        this.A = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new q(this.f14720x, this.f14721y, this.f14722z, this.A, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x003e, code lost:
    
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a3, code lost:
    
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a5, code lost:
    
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0186  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00a3 -> B:31:0x00a6). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.services.q.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
