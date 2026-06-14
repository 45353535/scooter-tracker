package com.appodeal.ads.utils;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import eg.k0;
import java.util.EnumMap;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15024r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final /* synthetic */ AdType f15025s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final /* synthetic */ AdNetwork f15026t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Function0 f15027u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(AdType adType, AdNetwork adNetwork, Function0 function0, Continuation continuation) {
        super(2, continuation);
        this.f15025s = adType;
        this.f15026t = adNetwork;
        this.f15027u = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new j(this.f15025s, this.f15026t, this.f15027u, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f15024r;
        if (i10 == 0) {
            kotlin.d.b(obj);
            this.f15024r = 1;
            if (k0.a(3000L, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        EnumMap enumMap = k.f15028a;
        Log.log(k.a(this.f15025s, this.f15026t.getName()));
        k.f15028a.remove(this.f15025s);
        this.f15027u.invoke();
        return Unit.f93236a;
    }
}
