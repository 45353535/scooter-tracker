package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.annotation.VisibleForTesting;
import androidx.compose.ui.platform.ComposeView;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import hg.l0;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public abstract class j extends FrameLayout implements s, l, k, t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CoroutineScope f58870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public n f58871c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f58872d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Lazy f58873e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final MutableStateFlow f58874f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Lazy f58875g;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58876r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f58877s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f58878t;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f58877s = z10;
            aVar.f58878t = z11;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58876r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f58877s && this.f58878t);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58879r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f58881t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l.a f58882u;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f58883r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f58884s;

            public a(Continuation continuation) {
                super(2, continuation);
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((a) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                a aVar = new a(continuation);
                aVar.f58884s = ((Boolean) obj).booleanValue();
                return aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f58883r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(this.f58884s);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, l.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f58881t = j10;
            this.f58882u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return j.this.new b(this.f58881t, this.f58882u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58879r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                j.this.getAdLoader().j(this.f58881t, this.f58882u);
                StateFlow stateFlowIsLoaded = j.this.isLoaded();
                a aVar = new a(null);
                this.f58879r = 1;
                if (hg.i.y(stateFlowIsLoaded, aVar, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            j.this.p();
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(Context context, CoroutineScope scope) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(scope, "scope");
        this.f58870b = scope;
        this.f58873e = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.m(this.f55871b);
            }
        });
        this.f58874f = l0.a(Boolean.FALSE);
        this.f58875g = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return j.k(this.f55872b);
            }
        });
    }

    @VisibleForTesting(otherwise = 4)
    public static /* synthetic */ void getAdView$annotations() {
    }

    public static final StateFlow k(j jVar) {
        return hg.i.T(hg.i.C(jVar.isLoaded(), jVar.f58874f, new a(null)), jVar.f58870b, hg.g0.f73226a.c(), Boolean.FALSE);
    }

    public static final StateFlow m(j jVar) {
        return jVar.getAdLoader().isLoaded();
    }

    public void destroy() {
        kotlinx.coroutines.i.f(this.f58870b, null, 1, null);
        setAdView(null);
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
    }

    @NotNull
    public abstract l getAdLoader();

    @Nullable
    public n getAdShowListener() {
        return this.f58871c;
    }

    @Nullable
    public final View getAdView() {
        return this.f58872d;
    }

    @Nullable
    public abstract /* synthetic */ r getCreativeType();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return (StateFlow) this.f58873e.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        eg.i.d(this.f58870b, null, null, new b(j10, aVar, null), 3, null);
    }

    public StateFlow l() {
        return (StateFlow) this.f58875g.getValue();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View changedView, int i10) {
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        super.onVisibilityChanged(changedView, i10);
        this.f58874f.setValue(Boolean.valueOf(i10 == 0));
    }

    public abstract void p();

    public void setAdShowListener(@Nullable n nVar) {
        this.f58871c = nVar;
    }

    public final void setAdView(@Nullable View view) {
        View view2 = this.f58872d;
        this.f58872d = view;
        removeAllViews();
        ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
        if (composeView != null) {
            composeView.disposeComposition();
        }
        if (view != null) {
            addView(view, new ViewGroup.LayoutParams(-1, -1));
        }
    }
}
