package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdService;
import com.inmobi.unifiedId.InMobiUserDataModel;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class I9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f37058a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiUserDataModel f37059b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I9(InMobiUserDataModel inMobiUserDataModel, Continuation continuation) {
        super(2, continuation);
        this.f37059b = inMobiUserDataModel;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new I9(this.f37059b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new I9(this.f37059b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f37058a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            InMobiUserDataModel inMobiUserDataModel = this.f37059b;
            this.f37058a = 1;
            if (InMobiUnifiedIdService.a(inMobiUserDataModel, this) == objG) {
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
