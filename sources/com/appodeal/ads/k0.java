package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.modules.common.internal.domain.ParsePriceUseCase;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class k0 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13527r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InAppPurchase f13528s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ InAppPurchaseValidateCallback f13529t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Context f13530u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(InAppPurchase inAppPurchase, InAppPurchaseValidateCallback inAppPurchaseValidateCallback, Context context, Continuation continuation) {
        super(2, continuation);
        this.f13528s = inAppPurchase;
        this.f13529t = inAppPurchaseValidateCallback;
        this.f13530u = context;
    }

    public static final Unit c(Context context, InAppPurchase inAppPurchase) {
        boolean z10 = h2.f13367a;
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        Double dInvoke = ((ParsePriceUseCase) h2.f13378l.getValue()).invoke(inAppPurchase.getPrice(), inAppPurchase.getCurrency());
        h2.l(applicationContext, dInvoke != null ? dInvoke.doubleValue() : 0.0d, inAppPurchase.getCurrency());
        return Unit.f93236a;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k0(this.f13528s, this.f13529t, this.f13530u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((k0) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f13527r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            boolean z10 = h2.f13367a;
            com.appodeal.ads.services.r rVar = (com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue();
            final InAppPurchase inAppPurchase = this.f13528s;
            InAppPurchaseValidateCallback inAppPurchaseValidateCallback = this.f13529t;
            final Context context = this.f13530u;
            Function0 function0 = new Function0() { // from class: com.appodeal.ads.j0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return k0.c(context, inAppPurchase);
                }
            };
            this.f13527r = 1;
            if (rVar.a(inAppPurchase, inAppPurchaseValidateCallback, function0, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        return Unit.f93236a;
    }
}
