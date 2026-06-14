package com.inmobi.media;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.inmobi.media.C4137wj;
import com.inmobi.media.ads.network.inmobiJson.model.Image;
import com.squareup.picasso.Picasso;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;

/* JADX INFO: renamed from: com.inmobi.media.wj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4137wj extends AbstractC3796j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f39866b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C4162xj f39867c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final MutableSharedFlow f39868d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C3903n9 f39869e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f39870f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Cj f39871g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4137wj(Context context, CoroutineScope coroutineScope, C4162xj staticExperienceModel, MutableSharedFlow mediaEventFlow, C3903n9 c3903n9) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(staticExperienceModel, "staticExperienceModel");
        Intrinsics.checkNotNullParameter(mediaEventFlow, "mediaEventFlow");
        this.f39866b = coroutineScope;
        this.f39867c = staticExperienceModel;
        this.f39868d = mediaEventFlow;
        this.f39869e = c3903n9;
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        this.f39870f = "Static-Image-" + string;
        int i10 = Cj.f36681b;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f39871g = new Cj(context);
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void a(MutableStateFlow windowFlow) {
        Intrinsics.checkNotNullParameter(windowFlow, "windowFlow");
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void b() {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.inmobi.media.AbstractC3796j2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.d r10) throws com.inmobi.media.C3655dc {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4137wj.a(kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final Object a(FrameLayout frameLayout, C3831kc c3831kc) {
        Object objG = eg.g.g(eg.o0.c(), new C3988qj(this, frameLayout, null), c3831kc);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    @Override // com.inmobi.media.AbstractC3796j2
    public final void a() {
        ViewParent parent = this.f39871g.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        Picasso picasso = Qf.f37593a;
        Qf.b(this.f38785a).cancelTag(this.f39870f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a8, code lost:
    
        if (eg.g.g(r11, r0, r7) == r8) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r14, android.widget.ImageView r15, kotlin.coroutines.jvm.internal.d r16) {
        /*
            r13 = this;
            r0 = r16
            boolean r1 = r0 instanceof com.inmobi.media.C4037sj
            if (r1 == 0) goto L16
            r1 = r0
            com.inmobi.media.sj r1 = (com.inmobi.media.C4037sj) r1
            int r3 = r1.f39554f
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r1.f39554f = r3
        L14:
            r7 = r1
            goto L1c
        L16:
            com.inmobi.media.sj r1 = new com.inmobi.media.sj
            r1.<init>(r13, r0)
            goto L14
        L1c:
            java.lang.Object r0 = r7.f39552d
            java.lang.Object r8 = pf.b.g()
            int r1 = r7.f39554f
            r9 = 2
            r3 = 1
            r10 = 0
            if (r1 == 0) goto L48
            if (r1 == r3) goto L3a
            if (r1 != r9) goto L32
            kotlin.d.b(r0)
            goto Lab
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.jvm.internal.Ref$BooleanRef r1 = r7.f39551c
            android.widget.ImageView r3 = r7.f39550b
            java.util.List r4 = r7.f39549a
            kotlin.d.b(r0)
            r12 = r3
            r3 = r1
            r1 = r4
            r4 = r12
            goto L8e
        L48:
            kotlin.d.b(r0)
            com.inmobi.media.n9 r0 = r13.f39869e
            if (r0 == 0) goto L6e
            int r1 = r14.size()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "loadImagesIntoImageView - attempting to load "
            r4.append(r5)
            r4.append(r1)
            java.lang.String r1 = " images"
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            java.lang.String r4 = "StaticExperienceManager"
            r0.a(r4, r1)
        L6e:
            kotlin.jvm.internal.Ref$BooleanRef r1 = new kotlin.jvm.internal.Ref$BooleanRef
            r1.<init>()
            eg.e1 r0 = eg.o0.c()
            com.inmobi.media.uj r4 = new com.inmobi.media.uj
            r4.<init>(r13, r10)
            r7.f39549a = r14
            r7.f39550b = r15
            r7.f39551c = r1
            r7.f39554f = r3
            java.lang.Object r0 = eg.g.g(r0, r4, r7)
            if (r0 != r8) goto L8b
            goto Laa
        L8b:
            r4 = r15
            r3 = r1
            r1 = r14
        L8e:
            r5 = r0
            android.graphics.Bitmap$Config r5 = (android.graphics.Bitmap.Config) r5
            kotlinx.coroutines.CoroutineDispatcher r11 = eg.o0.b()
            com.inmobi.media.tj r0 = new com.inmobi.media.tj
            r6 = 0
            r2 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r7.f39549a = r10
            r7.f39550b = r10
            r7.f39551c = r10
            r7.f39554f = r9
            java.lang.Object r0 = eg.g.g(r11, r0, r7)
            if (r0 != r8) goto Lab
        Laa:
            return r8
        Lab:
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.inmobi.media.C4137wj.a(java.util.List, android.widget.ImageView, kotlin.coroutines.jvm.internal.d):java.lang.Object");
    }

    public final void a(ImageView imageView, final Image image) {
        imageView.setOnClickListener(new View.OnClickListener() { // from class: w3.hc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C4137wj.a(this.f107087b, image, view);
            }
        });
    }

    public static final void a(C4137wj c4137wj, Image image, View view) {
        C3903n9 c3903n9 = c4137wj.f39869e;
        if (c3903n9 != null) {
            c3903n9.a("StaticExperienceManager", "Static Click Event");
        }
        eg.i.d(c4137wj.f39866b, null, null, new C4112vj(image, c4137wj, null), 3, null);
    }
}
