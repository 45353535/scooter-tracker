package com.inmobi.media;

import android.os.Handler;
import android.os.Looper;
import com.inmobi.media.C3773i3;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/* JADX INFO: renamed from: com.inmobi.media.i3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3773i3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3847l3 f38738a;

    public C3773i3(InterfaceC3847l3 mEventHandler) {
        Intrinsics.checkNotNullParameter(mEventHandler, "mEventHandler");
        this.f38738a = mEventHandler;
    }

    public static final Unit b(S2 s22) {
        C4121w3 c4121w3 = C4121w3.f39816a;
        Intrinsics.checkNotNullExpressionValue("w3", "access$getTAG$p(...)");
        String str = s22.f37685b;
        return Unit.f93236a;
    }

    public final void a(final S2 click) {
        Intrinsics.checkNotNullParameter(click, "click");
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: w3.f8
            @Override // java.lang.Runnable
            public final void run() {
                C3773i3.a(click, this);
            }
        });
    }

    public static final void a(final S2 s22, C3773i3 c3773i3) {
        Je je2 = new Je(s22.f37685b, C4121w3.a(s22), null, null, null, false, 60);
        int pingTimeout = C4121w3.c().getPingTimeout();
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        mo moVar = new mo(je2, new C3748h3(new AtomicBoolean(false), ref$ObjectRef, c3773i3, s22), pingTimeout * 1000, new Function0() { // from class: w3.g8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return C3773i3.b(s22);
            }
        });
        ref$ObjectRef.f93280b = moVar;
        moVar.b();
    }

    public static final void a(AtomicBoolean atomicBoolean, Ref$ObjectRef ref$ObjectRef, C3773i3 c3773i3, S2 s22, boolean z10) {
        if (atomicBoolean.compareAndSet(false, true)) {
            mo moVar = (mo) ref$ObjectRef.f93280b;
            if (moVar != null) {
                moVar.a();
            }
            if (z10) {
                c3773i3.f38738a.a(s22);
            } else {
                c3773i3.f38738a.a(s22, EnumC3571a6.f38154d);
            }
        }
    }
}
