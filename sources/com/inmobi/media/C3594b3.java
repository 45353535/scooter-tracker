package com.inmobi.media;

import android.os.Message;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.b3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3594b3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f38239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ S2 f38240c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ HandlerC3723g3 f38241d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3594b3(S2 s22, HandlerC3723g3 handlerC3723g3, Continuation continuation) {
        super(2, continuation);
        this.f38240c = s22;
        this.f38241d = handlerC3723g3;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        C3594b3 c3594b3 = new C3594b3(this.f38240c, this.f38241d, continuation);
        c3594b3.f38239b = obj;
        return c3594b3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3594b3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38238a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            CoroutineScope coroutineScope = (CoroutineScope) this.f38239b;
            C3822k3 c3822k3 = new C3822k3();
            S2 s22 = this.f38240c;
            this.f38239b = coroutineScope;
            this.f38238a = 1;
            obj = c3822k3.a(s22, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
        }
        if (((EnumC3571a6) obj) != null) {
            HandlerC3723g3 handlerC3723g3 = this.f38241d;
            S2 s23 = this.f38240c;
            int i11 = HandlerC3723g3.f38608a;
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            messageObtain.obj = s23;
            handlerC3723g3.sendMessage(messageObtain);
        } else {
            S2 s24 = this.f38240c;
            HandlerC3723g3 handlerC3723g32 = this.f38241d;
            C4121w3 c4121w3 = C4121w3.f39816a;
            Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
            String str = s24.f37685b;
            C4121w3.b(s24);
            int i12 = HandlerC3723g3.f38608a;
            handlerC3723g32.b(s24);
        }
        return Unit.f93236a;
    }
}
