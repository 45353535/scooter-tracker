package com.inmobi.media;

import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.mm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3891mm extends kotlin.coroutines.jvm.internal.k implements Function2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3941om f39053a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ K3 f39054b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3891mm(C3941om c3941om, K3 k32, Continuation continuation) {
        super(2, continuation);
        this.f39053a = c3941om;
        this.f39054b = k32;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new C3891mm(this.f39053a, this.f39054b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C3891mm(this.f39053a, this.f39054b, (Continuation) obj2).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws I3 {
        pf.b.g();
        kotlin.d.b(obj);
        C3903n9 c3903n9 = this.f39053a.f39218e;
        if (c3903n9 != null) {
            c3903n9.a("VideoExperienceManager", "Companion Ad Rendered");
        }
        ViewGroup viewGroup = this.f39053a.f39223j;
        ViewParent parent = viewGroup != null ? viewGroup.getParent() : null;
        FrameLayout parentView = parent instanceof FrameLayout ? (FrameLayout) parent : null;
        if (parentView != null) {
            parentView.removeAllViews();
        }
        C3941om c3941om = this.f39053a;
        c3941om.f39223j = null;
        InterfaceC3680ec interfaceC3680ec = c3941om.f39221h;
        if (interfaceC3680ec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC3680ec = null;
        }
        Sd sd2 = (Sd) interfaceC3680ec;
        C3903n9 c3903n92 = sd2.f37713c;
        if (c3903n92 != null) {
            c3903n92.a("NativeMediaPlayer", "destroy called");
        }
        sd2.f37715e = EnumC4034sg.f39539h;
        P4.a(sd2.f37714d);
        sd2.f37721k.b();
        C3579ae c3579ae = sd2.f37719i;
        c3579ae.f38204g.removeAllViews();
        c3579ae.f38203f.c();
        sd2.f37720j.c();
        sd2.f37717g.removeAllViews();
        sd2.f37718h.release();
        if (parentView == null) {
            return null;
        }
        K3 k32 = this.f39054b;
        k32.getClass();
        Intrinsics.checkNotNullParameter(parentView, "parentView");
        if (!Intrinsics.areEqual(k32.f37200i, L3.f37254a)) {
            P3 p32 = k32.f37200i;
            throw new I3(!Intrinsics.areEqual(p32, M3.f37339a) ? !Intrinsics.areEqual(p32, O3.f37472a) ? Intrinsics.areEqual(p32, N3.f37393a) ? "Companion ad failed to load" : "Companion ad view is not available" : "Companion ad is still loading" : "Companion ad has not started loading");
        }
        C3903n9 c3903n93 = k32.f37194c;
        if (c3903n93 != null) {
            c3903n93.a("CompanionAdManager", "renderCompanionView");
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        parentView.addView(k32.f37197f, layoutParams);
        k32.b();
        C3890ml c3890ml = k32.f37198g;
        if (c3890ml != null) {
            List listPlus = CollectionsKt.plus((Collection) c3890ml.f39051b, (Iterable) c3890ml.f39052c);
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : listPlus) {
                if (Intrinsics.areEqual(((C4107ve) obj2).f39775b, "creativeView")) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((C4107ve) it.next()).f39774a);
            }
            Map mapA = AbstractC3789ik.a(k32.f37193b.f37879a);
            Wj wj = Wj.f37959a;
            Wj.b("CompanionAdRendered", mapA, EnumC3585ak.f38215a);
            P4.a(k32.f37195d, k32.f37192a, new W3(arrayList2));
        }
        return Unit.f93236a;
    }
}
