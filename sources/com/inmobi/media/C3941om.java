package com.inmobi.media;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.om, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3941om extends AbstractC3796j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f39215b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C3966pm f39216c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f39217d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3903n9 f39218e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f39219f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayList f39220g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public InterfaceC3680ec f39221h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public K3 f39222i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewGroup f39223j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3941om(Context context, CoroutineScope coroutineScope, C3966pm videoExperienceModel, MutableSharedFlow mediaEventFlow, C3903n9 c3903n9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(videoExperienceModel, "videoExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f39215b = coroutineScope;
        this.f39216c = videoExperienceModel;
        this.f39217d = mediaEventFlow;
        this.f39218e = c3903n9;
        this.f39219f = new ArrayList();
        this.f39220g = new ArrayList();
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0081, code lost:
    
        if (b(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3796j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.inmobi.media.C3613bm
            if (r0 == 0) goto L13
            r0 = r9
            com.inmobi.media.bm r0 = (com.inmobi.media.C3613bm) r0
            int r1 = r0.f38293d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f38293d = r1
            goto L18
        L13:
            com.inmobi.media.bm r0 = new com.inmobi.media.bm
            r0.<init>(r8, r9)
        L18:
            java.lang.Object r9 = r0.f38291b
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f38293d
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 == r5) goto L35
            if (r2 != r4) goto L2d
            kotlin.d.b(r9)
            goto L84
        L2d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L35:
            com.inmobi.media.om r2 = r0.f38290a
            kotlin.d.b(r9)
            goto L75
        L3b:
            kotlin.d.b(r9)
            com.inmobi.media.n9 r9 = r8.f39218e
            if (r9 == 0) goto L60
            com.inmobi.media.pm r2 = r8.f39216c
            java.util.ArrayList r2 = r2.f39304c
            int r2 = r2.size()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "load Called - mediaFiles count: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r2 = r6.toString()
            java.lang.String r6 = "VideoExperienceManager"
            r9.a(r6, r2)
        L60:
            eg.e1 r9 = eg.o0.c()
            com.inmobi.media.cm r2 = new com.inmobi.media.cm
            r2.<init>(r8, r3)
            r0.f38290a = r8
            r0.f38293d = r5
            java.lang.Object r9 = eg.g.g(r9, r2, r0)
            if (r9 != r1) goto L74
            goto L83
        L74:
            r2 = r8
        L75:
            com.inmobi.media.ec r9 = (com.inmobi.media.InterfaceC3680ec) r9
            r2.f39221h = r9
            r0.f38290a = r3
            r0.f38293d = r4
            java.lang.Object r9 = r8.b(r0)
            if (r9 != r1) goto L84
        L83:
            return r1
        L84:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3941om.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(kotlin.coroutines.jvm.internal.d r12) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C3941om.b(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final Object a(FrameLayout frameLayout, C3831kc c3831kc) {
        Object objG = eg.g.g(eg.o0.c(), new C3587am(this, frameLayout, null), c3831kc);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void a(MutableStateFlow windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
        Job jobD = eg.i.d(this.f39215b, null, null, new Yl(windowFlow, null, this), 3, null);
        ArrayList activeJobs = this.f39220g;
        Intrinsics.checkNotNullParameter(jobD, "<this>");
        Intrinsics.checkNotNullParameter(activeJobs, "activeJobs");
        activeJobs.add(jobD);
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void a() {
        C3903n9 c3903n9 = this.f39218e;
        if (c3903n9 != null) {
            c3903n9.a("VideoExperienceManager", "destroy");
        }
        b();
        InterfaceC3680ec interfaceC3680ec = this.f39221h;
        if (interfaceC3680ec != null) {
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
        }
        P4.a(this.f39220g);
        K3 k32 = this.f39222i;
        if (k32 != null) {
            k32.a();
        }
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void b() {
        P4.a(this.f39215b, new Zl(this, null));
        InterfaceC3680ec interfaceC3680ec = this.f39221h;
        if (interfaceC3680ec == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mediaPlayer");
            interfaceC3680ec = null;
        }
        Sd sd2 = (Sd) interfaceC3680ec;
        sd2.f37720j.c();
        C3967pn c3967pn = sd2.f37721k;
        Ij ij = c3967pn.f39317h;
        if (ij != null) {
            ij.b();
        }
        c3967pn.f39313d.set(false);
        C4134wg c4134wg = (C4134wg) c3967pn.f39318i.f37976d.getValue();
        c4134wg.f39857f.set(true);
        H6.a(c4134wg.f39856e);
        c4134wg.f39856e = null;
        P4.a(c3967pn.f39314e);
        P4.a(sd2.f37714d);
        P4.a(this.f39219f);
    }
}
