package yads;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
public abstract class eb1 extends RelativeLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c4 f110286a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final es2 f110287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ag1 f110288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final fg1 f110289d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final vt2 f110290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final cm f110291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final fb1 f110292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final ArrayList f110293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f110294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f110295j;

    public /* synthetic */ eb1(Context context, AttributeSet attributeSet, int i10, c4 c4Var, pr3 pr3Var) {
        ag1 ag1Var = new ag1();
        fg1 fg1Var = new fg1(context);
        v5 v5Var = new v5();
        bm bmVar = new bm(context, c4Var, pr3Var, v5Var);
        Object obj = vt2.f117186j;
        this(context, attributeSet, i10, c4Var, pr3Var, ag1Var, fg1Var, v5Var, bmVar, ut2.a());
    }

    private final fb1 a() {
        return ib1.a(this, this.f110291f);
    }

    protected abstract cm a(Context context, c4 c4Var, bm bmVar, v5 v5Var);

    public final void addVisibilityChangeListener(@NotNull ri3 ri3Var) {
        this.f110293h.add(ri3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final yads.uz c() {
        /*
            r4 = this;
            yads.fg1 r0 = r4.f110289d
            r0.a()
            yads.cm r0 = r4.f110291f
            yads.t9 r1 = r0.f115526v
            r2 = 0
            if (r1 == 0) goto L1c
            yads.zt0 r1 = r1.c()
            int r3 = r1.f118813b
            if (r3 != 0) goto L1a
            int r3 = r1.f118814c
            if (r3 == 0) goto L19
            goto L1a
        L19:
            r1 = r2
        L1a:
            if (r1 != 0) goto L22
        L1c:
            yads.c4 r0 = r0.f115507c
            yads.nx2 r0 = r0.f109197d
            yads.mx2 r1 = r0.f114071a
        L22:
            if (r1 == 0) goto L2a
            yads.uz r0 = new yads.uz
            r0.<init>(r1)
            return r0
        L2a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.eb1.c():yads.uz");
    }

    protected final String d() {
        this.f110289d.a();
        mm mmVar = this.f110291f.K;
        if (mmVar != null) {
            return mmVar.getAdInfo();
        }
        return null;
    }

    protected void destroy() {
        this.f110289d.a();
        this.f110288c.a();
        this.f110293h.clear();
        int i10 = rb.f115393b;
        if (rb.a((du) this.f110291f)) {
            return;
        }
        this.f110291f.d();
    }

    protected final ze3 e() {
        this.f110289d.a();
        return this.f110291f.E;
    }

    @NotNull
    public final c4 getAdConfiguration$mobileads_externalRelease() {
        return this.f110286a;
    }

    public final int getHeightMeasureSpec$mobileads_externalRelease() {
        return this.f110295j;
    }

    @NotNull
    public final es2 getSdkEnvironmentModule$mobileads_externalRelease() {
        return this.f110287b;
    }

    public final int getWidthMeasureSpec$mobileads_externalRelease() {
        return this.f110294i;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        getClass().toString();
        boolean z10 = lb1.f113032a;
        fb1 fb1Var = this.f110292g;
        getContext();
        fb1Var.onAttachedToWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onConfigurationChanged(android.content.res.Configuration r6) {
        /*
            r5 = this;
            super.onConfigurationChanged(r6)
            int r0 = yads.rb.f115393b
            yads.cm r0 = r5.f110291f
            boolean r0 = yads.rb.a(r0)
            if (r0 != 0) goto L41
            yads.cm r0 = r5.f110291f
            yads.t9 r1 = r0.f115526v
            if (r1 == 0) goto L18
            yads.zt0 r1 = r1.c()
            goto L19
        L18:
            r1 = 0
        L19:
            if (r1 == 0) goto L33
            yads.c4 r2 = r0.f115507c
            yads.nx2 r2 = r2.f109197d
            yads.mx2 r2 = r2.f114071a
            yads.t9 r3 = r0.f115526v
            if (r3 == 0) goto L33
            if (r2 == 0) goto L33
            android.content.Context r4 = r0.f115505a
            yads.em r0 = r0.F
            boolean r0 = yads.ox2.a(r4, r3, r1, r0, r2)
            if (r0 == 0) goto L33
            r0 = 0
            goto L3e
        L33:
            yads.c4 r0 = r5.f110286a
            yads.e9 r0 = r0.f109198e
            if (r0 == 0) goto L3c
            r5.a(r0)
        L3c:
            r0 = 8
        L3e:
            r5.setVisibility(r0)
        L41:
            j$.util.Objects.toString(r6)
            boolean r6 = yads.lb1.f113032a
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.eb1.onConfigurationChanged(android.content.res.Configuration):void");
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getClass().toString();
        boolean z10 = lb1.f113032a;
        fb1 fb1Var = this.f110292g;
        getContext();
        fb1Var.onDetachedFromWindow();
    }

    @Override // android.widget.RelativeLayout, android.view.View
    protected final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f110294i = i10;
        this.f110295j = i11;
    }

    @Override // android.view.View
    protected final void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (this.f110290e == null) {
            return;
        }
        Objects.toString(view);
        boolean z10 = lb1.f113032a;
        hr2 hr2VarA = this.f110290e.a(getContext());
        if (hr2VarA == null || !hr2VarA.g()) {
            a(i10);
        } else if (this == view) {
            a(i10);
        }
    }

    @Override // android.view.View
    protected final void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        getVisibility();
        boolean z10 = lb1.f113032a;
        a((i10 == 0 && getVisibility() == 0) ? 0 : 8);
    }

    public final void removeVisibilityChangeListener(@NotNull ri3 ri3Var) {
        this.f110293h.remove(ri3Var);
    }

    protected void setAdUnitId(String str) {
        this.f110289d.a();
        this.f110291f.f115507c.a(str);
    }

    protected final oz a(String str) {
        List listEmptyList;
        this.f110289d.a();
        uz uzVarC = c();
        ja jaVar = uzVarC != null ? new ja(uzVarC.f115879a.getWidth(), uzVarC.f115879a.getHeight()) : null;
        String strD = d();
        this.f110289d.a();
        mm mmVar = this.f110291f.K;
        if (mmVar == null || (listEmptyList = mmVar.b()) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        return new oz(str, jaVar, strD, listEmptyList);
    }

    protected final List b() {
        List listA;
        this.f110289d.a();
        mm mmVar = this.f110291f.K;
        return (mmVar == null || (listA = mmVar.a()) == null) ? CollectionsKt.emptyList() : listA;
    }

    public eb1(Context context, AttributeSet attributeSet, int i10, c4 c4Var, pr3 pr3Var, ag1 ag1Var, fg1 fg1Var, v5 v5Var, bm bmVar, vt2 vt2Var) {
        super(context, attributeSet, i10);
        this.f110286a = c4Var;
        this.f110287b = pr3Var;
        this.f110288c = ag1Var;
        this.f110289d = fg1Var;
        this.f110290e = vt2Var;
        this.f110293h = new ArrayList();
        fg1Var.a();
        cm cmVarA = a(context, c4Var, bmVar, v5Var);
        this.f110291f = cmVarA;
        bmVar.a(cmVarA.e());
        fb1 fb1VarA = a();
        this.f110292g = fb1VarA;
        fb1VarA.a(context, this);
    }

    protected final void a(final e9 e9Var) {
        this.f110289d.a();
        this.f110288c.a(new Runnable() { // from class: yads.h6
            @Override // java.lang.Runnable
            public final void run() {
                eb1.a(this.f111489b, e9Var);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(eb1 eb1Var, e9 e9Var) {
        eb1Var.f110291f.b(e9Var);
    }

    private final void a(int i10) {
        boolean z10 = lb1.f113032a;
        int i11 = rb.f115393b;
        if (rb.a((du) this.f110291f)) {
            return;
        }
        Iterator it = this.f110293h.iterator();
        while (it.hasNext()) {
            ((mk2) ((ri3) it.next())).p();
        }
    }

    protected final void a(tz tzVar) {
        this.f110289d.a();
        cm cmVar = this.f110291f;
        bm bmVar = cmVar.D;
        cmVar.f115525u = bmVar;
        bmVar.f109048c = tzVar;
        bmVar.f109047b.a(tzVar);
    }

    protected final void a(uz uzVar) {
        this.f110289d.a();
        this.f110291f.a(uzVar.f115879a);
    }
}
