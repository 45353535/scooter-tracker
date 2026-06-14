package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.V2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes8.dex */
public final class V2 extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final eg f41862a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V2(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f41862a = new a();
    }

    @NotNull
    public final eg getViewBinder() {
        return this.f41862a;
    }

    public static final class a implements eg {
        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b(V0 adTools, long j10) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(true, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(final V0 adTools, final long j10) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.d(new Runnable() { // from class: com.ironsource.dj
                @Override // java.lang.Runnable
                public final void run() {
                    V2.a.d(adTools, j10);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(V0 adTools, long j10) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(j10);
        }

        @Override // com.ironsource.eg
        public void a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams, @NotNull final V0 adTools) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            Intrinsics.checkNotNullParameter(adTools, "adTools");
            final View childAt = V2.this.getChildAt(0);
            final long jB = Ib.f41088s.d().g().b();
            if (jB <= 0) {
                V2.this.removeView(childAt);
                V2.this.addView(view, layoutParams);
                adTools.d(new Runnable() { // from class: com.ironsource.ej
                    @Override // java.lang.Runnable
                    public final void run() {
                        V2.a.a(adTools, jB);
                    }
                });
                return;
            }
            adTools.d(new Runnable() { // from class: com.ironsource.fj
                @Override // java.lang.Runnable
                public final void run() {
                    V2.a.b(adTools, jB);
                }
            });
            view.setAlpha(0.0f);
            V2.this.addView(view, layoutParams);
            if (childAt != null) {
                final V2 v22 = V2.this;
                childAt.animate().alpha(0.0f).setDuration(jB).withStartAction(new Runnable() { // from class: com.ironsource.gj
                    @Override // java.lang.Runnable
                    public final void run() {
                        V2.a.a(childAt);
                    }
                }).withEndAction(new Runnable() { // from class: com.ironsource.hj
                    @Override // java.lang.Runnable
                    public final void run() {
                        V2.a.a(v22, childAt, childAt);
                    }
                }).start();
            }
            view.animate().alpha(1.0f).setDuration(jB).withEndAction(new Runnable() { // from class: com.ironsource.ij
                @Override // java.lang.Runnable
                public final void run() {
                    V2.a.c(adTools, jB);
                }
            }).start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V0 adTools, long j10) {
            Intrinsics.checkNotNullParameter(adTools, "$adTools");
            adTools.e().h().a(false, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(View this_apply) {
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this_apply.setEnabled(false);
            this_apply.setClickable(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void a(V2 this$0, View view, View this_apply) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(this_apply, "$this_apply");
            this$0.removeView(view);
            this_apply.setEnabled(true);
            this_apply.setClickable(true);
        }
    }
}
