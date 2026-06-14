package com.appodeal.ads.regulator;

import android.app.Activity;
import com.appodeal.consent.ConsentForm;
import com.appodeal.consent.ConsentManagerError;
import com.appodeal.consent.OnConsentFormDismissedListener;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final class x extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14408r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ y f14409s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ ConsentForm f14410t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(y yVar, ConsentForm consentForm, Continuation continuation) {
        super(2, continuation);
        this.f14409s = yVar;
        this.f14410t = consentForm;
    }

    public static final void c(y yVar, ConsentManagerError consentManagerError) {
        if (consentManagerError == null) {
            yVar.b(a.f14344a);
        } else {
            yVar.b(new c(consentManagerError));
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new x(this.f14409s, this.f14410t, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new x(this.f14409s, this.f14410t, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f14408r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            com.appodeal.ads.context.o oVar = this.f14409s.f14411a;
            this.f14408r = 1;
            obj = oVar.f13206a.awaitResumedActivity(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        ConsentForm consentForm = this.f14410t;
        final y yVar = this.f14409s;
        consentForm.show((Activity) obj, new OnConsentFormDismissedListener() { // from class: com.appodeal.ads.regulator.w
            @Override // com.appodeal.consent.OnConsentFormDismissedListener
            public final void onConsentFormDismissed(ConsentManagerError consentManagerError) {
                x.c(yVar, consentManagerError);
            }
        });
        return Unit.f93236a;
    }
}
