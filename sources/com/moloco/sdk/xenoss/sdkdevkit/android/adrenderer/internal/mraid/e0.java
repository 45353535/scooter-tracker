package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import eg.k0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class e0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final View f56394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f56395c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Job f56396d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final View.OnLayoutChangeListener f56397e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f56398f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final StateFlow f56399g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final b0 f56400h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f56401i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56402j;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final b0 f56403a;

        public a(b0 value) {
            Intrinsics.checkNotNullParameter(value, "value");
            this.f56403a = value;
        }

        public final b0 a() {
            return this.f56403a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56404r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f56406t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f56407u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f56408v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ int f56409w;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i10, int i11, int i12, int i13, Continuation continuation) {
            super(2, continuation);
            this.f56406t = i10;
            this.f56407u = i11;
            this.f56408v = i12;
            this.f56409w = i13;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e0.this.new b(this.f56406t, this.f56407u, this.f56408v, this.f56409w, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56404r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                this.f56404r = 1;
                if (k0.a(200L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            e0.this.y();
            e0.this.j(this.f56406t, this.f56407u, this.f56408v, this.f56409w);
            return Unit.f93236a;
        }
    }

    public e0(View view, Context context, CoroutineScope scope) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f56394b = view;
        this.f56395c = kotlinx.coroutines.i.j(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.d0
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                e0.p(this.f56393b, view2, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f56397e = onLayoutChangeListener;
        view.addOnLayoutChangeListener(onLayoutChangeListener);
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.FALSE);
        this.f56398f = mutableStateFlowA;
        this.f56399g = mutableStateFlowA;
        b0 b0Var = new b0(context);
        this.f56400h = b0Var;
        MutableStateFlow mutableStateFlowA2 = l0.a(new a(b0Var));
        this.f56401i = mutableStateFlowA2;
        this.f56402j = mutableStateFlowA2;
    }

    public static final void p(e0 e0Var, View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        Job job = e0Var.f56396d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        e0Var.f56396d = eg.i.d(e0Var.f56395c, null, null, e0Var.new b(i10, i11, i12, i13, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        Job job = this.f56396d;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f56394b.removeOnLayoutChangeListener(this.f56397e);
    }

    public final void j(int i10, int i11, int i12, int i13) {
        Rect rect = new Rect(i10, i11, i12, i13);
        int iWidth = rect.width();
        int iHeight = rect.height();
        b0 b0Var = this.f56400h;
        b0Var.b(i10, i11, iWidth, iHeight);
        b0Var.e(i10, i11, iWidth, iHeight);
        b0Var.f(i10, i11, iWidth, iHeight);
        b0Var.a(iWidth, iHeight);
        this.f56401i.setValue(new a(this.f56400h));
    }

    public final StateFlow s() {
        return this.f56402j;
    }

    public final StateFlow x() {
        return this.f56399g;
    }

    public final void y() {
        this.f56398f.setValue(Boolean.valueOf(this.f56394b.isShown()));
    }
}
