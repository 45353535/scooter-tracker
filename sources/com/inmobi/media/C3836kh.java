package com.inmobi.media;

import com.inmobi.adquality.models.AdQualityResult;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: com.inmobi.media.kh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3836kh extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38888a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3861lh f38889b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3836kh(C3861lh c3861lh, Continuation continuation) {
        super(2, continuation);
        this.f38889b = c3861lh;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3836kh(this.f38889b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3836kh(this.f38889b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38888a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            H0 h02 = (H0) E0.f36762a.getValue();
            AdQualityResult adQualityResult = this.f38889b.f38984a;
            this.f38888a = 1;
            if (h02.a(adQualityResult, this) == objG) {
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
