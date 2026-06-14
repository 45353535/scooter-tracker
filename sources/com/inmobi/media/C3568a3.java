package com.inmobi.media;

import android.os.Message;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: renamed from: com.inmobi.media.a3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3568a3 extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38142a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2 f38143b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ HandlerC3723g3 f38144c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AdConfig.ImaiConfig f38145d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3568a3(W2 w22, HandlerC3723g3 handlerC3723g3, AdConfig.ImaiConfig imaiConfig, Continuation continuation) {
        super(2, continuation);
        this.f38143b = w22;
        this.f38144c = handlerC3723g3;
        this.f38145d = imaiConfig;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3568a3(this.f38143b, this.f38144c, this.f38145d, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C3568a3) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.f38142a;
        if (i10 == 0) {
            kotlin.d.b(obj);
            W2 w22 = this.f38143b;
            this.f38142a = 1;
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
            C4121w3.f39822g.set(false);
            return Unit.f93236a;
        }
        Message messageObtain = Message.obtain();
        messageObtain.what = 1;
        return kotlin.coroutines.jvm.internal.b.a(this.f38144c.sendMessageDelayed(messageObtain, this.f38145d.getPingInterval() * 1000));
    }
}
