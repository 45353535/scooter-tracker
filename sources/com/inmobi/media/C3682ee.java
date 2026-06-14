package com.inmobi.media;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: renamed from: com.inmobi.media.ee, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3682ee implements FlowCollector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4057te f38516a;

    public C3682ee(CoroutineScope coroutineScope, C4057te c4057te) {
        this.f38516a = c4057te;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public final Object emit(Object obj, Continuation continuation) {
        AbstractC3603bc mediaEvent = (AbstractC3603bc) obj;
        Nc nc2 = this.f38516a.f39594b.f39674f;
        nc2.getClass();
        Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
        if (mediaEvent instanceof Em) {
            nc2.f37443a.f37364d = AbstractC3766hl.a(((Em) mediaEvent).f36813a);
        } else if (mediaEvent instanceof Xm) {
            nc2.f37443a.f37365e = ((Xm) mediaEvent).f38012a;
        }
        if (!(mediaEvent instanceof Xm)) {
            InterfaceC3878m9 interfaceC3878m9L = this.f38516a.l();
            if (interfaceC3878m9L != null) {
                ((C3903n9) interfaceC3878m9L).a("NativeRenderedState", "listenMediaEvents - processing media event: " + mediaEvent);
            }
            ((Sc) this.f38516a.f39594b.f39681m.getValue()).a(mediaEvent);
            C3912ni c3912ni = (C3912ni) this.f38516a.f39594b.f39682n.getValue();
            c3912ni.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            if (mediaEvent instanceof Rl) {
                c3912ni.f39110b.a((Rl) mediaEvent);
            }
            C3912ni c3912ni2 = (C3912ni) this.f38516a.f39594b.f39682n.getValue();
            c3912ni2.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "event");
            Ac ac2 = c3912ni2.f39111c.f36791c;
            if (mediaEvent instanceof C3842kn) {
                ac2.f();
            } else if (mediaEvent instanceof C3768hn) {
                ac2.i();
            } else if (mediaEvent instanceof Om) {
                ac2.b();
            } else if (mediaEvent instanceof Pl) {
                ac2.h();
            } else if (mediaEvent instanceof S1) {
                ac2.a(((S1) mediaEvent).f37682a);
            }
            C3912ni c3912ni3 = (C3912ni) this.f38516a.f39594b.f39682n.getValue();
            c3912ni3.getClass();
            Intrinsics.checkNotNullParameter(mediaEvent, "mediaEvent");
            if (mediaEvent instanceof Pl) {
                c3912ni3.f39109a.g();
            }
        }
        return Unit.f93236a;
    }
}
