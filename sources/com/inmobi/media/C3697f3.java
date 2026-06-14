package com.inmobi.media;

import android.os.Message;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.f3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3697f3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HandlerC3723g3 f38540b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3697f3(HandlerC3723g3 handlerC3723g3, Continuation continuation) {
        super(2, continuation);
        this.f38540b = handlerC3723g3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3697f3(this.f38540b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3697f3(this.f38540b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38539a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = (W2) C4121w3.f39817b.getValue();
            this.f38539a = 1;
            obj = w22.a(this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        if (((Boolean) obj).booleanValue()) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 1;
            return kotlin.coroutines.jvm.internal.b.a(this.f38540b.sendMessage(messageObtain));
        }
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        C4121w3.f39822g.set(false);
        return Unit.f93236a;
    }
}
