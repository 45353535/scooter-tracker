package com.appodeal.advertising;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15341r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Context f15342s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Context context, Continuation continuation) {
        super(2, continuation);
        this.f15342s = context;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new k(this.f15342s, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new k(this.f15342s, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15341r;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        Context context = this.f15342s;
        this.f15341r = 1;
        kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
        eVar.I();
        try {
            Task<AppSetIdInfo> appSetIdInfo = AppSet.getClient(context).getAppSetIdInfo();
            final i iVar = new i(eVar);
            Intrinsics.checkNotNull(appSetIdInfo.addOnSuccessListener(new OnSuccessListener(iVar) { // from class: com.appodeal.advertising.o

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f15355a;

                {
                    Intrinsics.checkNotNullParameter(iVar, "function");
                    this.f15355a = iVar;
                }

                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final /* synthetic */ void onSuccess(Object obj2) {
                    this.f15355a.a((AppSetIdInfo) obj2);
                    Unit unit = Unit.f93236a;
                }
            }).addOnFailureListener(new j(eVar)));
        } catch (Exception e10) {
            if (eVar.isActive()) {
                Log.e("AppSetIdInfoManager", "AppSetId wasn't received. Exception", e10);
                Result.Companion companion = Result.f93230c;
                eVar.resumeWith(Result.b(kotlin.d.a(e10)));
            }
        }
        Object objC = eVar.C();
        if (objC == pf.b.g()) {
            kotlin.coroutines.jvm.internal.g.c(this);
        }
        return objC == objG ? objG : objC;
    }
}
