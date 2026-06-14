package com.inmobi.media;

import android.os.Message;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.u3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4071u3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f39633a;

    public C4071u3(Continuation continuation) {
        super(2, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C4071u3(continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C4071u3((Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f39633a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = (W2) C4121w3.f39817b.getValue();
            this.f39633a = 1;
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
        if (!((Boolean) obj).booleanValue()) {
            C4121w3 c4121w3 = C4121w3.f39816a;
            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
            C4121w3.f39822g.set(false);
            C4121w3.g();
            return Unit.f93236a;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        HandlerC3723g3 handlerC3723g3 = C4121w3.f39819d;
        if (handlerC3723g3 != null) {
            return kotlin.coroutines.jvm.internal.b.a(handlerC3723g3.sendMessage(messageObtain));
        }
        return null;
    }
}
