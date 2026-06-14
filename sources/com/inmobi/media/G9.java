package com.inmobi.media;

import com.inmobi.unifiedId.InMobiUnifiedIdInterface;
import com.inmobi.unifiedId.InMobiUnifiedIdService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes9.dex */
public final class G9 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f36928a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InMobiUnifiedIdInterface f36929b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G9(InMobiUnifiedIdInterface inMobiUnifiedIdInterface, Continuation continuation) {
        super(2, continuation);
        this.f36929b = inMobiUnifiedIdInterface;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new G9(this.f36929b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new G9(this.f36929b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f36928a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            InMobiUnifiedIdInterface inMobiUnifiedIdInterface = this.f36929b;
            this.f36928a = 1;
            if (InMobiUnifiedIdService.fetchUnifiedIdsInternal$media_release(inMobiUnifiedIdInterface, this) == objG) {
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
