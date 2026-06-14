package com.inmobi.media;

import android.os.Message;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.c3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3620c3 implements InterfaceC3847l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HandlerC3723g3 f38317a;

    public C3620c3(HandlerC3723g3 handlerC3723g3) {
        this.f38317a = handlerC3723g3;
    }

    @Override // com.inmobi.media.InterfaceC3847l3
    public final void a(S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        HandlerC3723g3 handlerC3723g3 = this.f38317a;
        Message messageObtain = Message.obtain();
        messageObtain.what = 4;
        messageObtain.obj = click;
        handlerC3723g3.sendMessage(messageObtain);
    }

    @Override // com.inmobi.media.InterfaceC3847l3
    public final void a(S2 click, EnumC3571a6 enumC3571a6) {
        EnumC3571a6 errorCode = EnumC3571a6.f38154d;
        Intrinsics.checkNotNullParameter(click, "click");
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = click.f37685b;
        C4121w3.b(click);
        this.f38317a.b(click);
    }
}
