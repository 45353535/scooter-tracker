package com.yandex.div.core;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.view2.Div2View;
import com.yandex.div.json.expressions.ExpressionResolver;
import k8.ea;
import k8.hx;
import k8.j1;
import k8.jk;
import k8.ra;
import k8.td;
import y6.d;

/* JADX INFO: loaded from: classes11.dex */
public interface Div2Logger {
    public static final Div2Logger STUB = new Div2Logger() { // from class: com.yandex.div.core.Div2Logger.1
        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logActiveTabTitleClick(Div2View div2View, ExpressionResolver expressionResolver, int i10, j1 j1Var) {
            d.a(this, div2View, expressionResolver, i10, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logBindingResult(Div2View div2View, ea eaVar, ea eaVar2, String str, String str2) {
            d.b(this, div2View, eaVar, eaVar2, str, str2);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var) {
            d.c(this, div2View, expressionResolver, view, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logDoubleClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var) {
            d.e(this, div2View, expressionResolver, view, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logFocusChanged(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, boolean z10) {
            d.g(this, div2View, expressionResolver, view, j1Var, z10);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logFrameCancelLimitExceeded(Div2View div2View, String str) {
            d.h(this, div2View, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logFrameCancelled(Div2View div2View, String str) {
            d.i(this, div2View, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logGalleryCompleteScroll(Div2View div2View, ExpressionResolver expressionResolver, td tdVar, int i10, int i11, String str) {
            d.j(this, div2View, expressionResolver, tdVar, i10, i11, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logGalleryScroll(Div2View div2View) {
            d.k(this, div2View);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logHoverChanged(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, boolean z10) {
            d.l(this, div2View, expressionResolver, view, j1Var, z10);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logImeEnter(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var) {
            d.m(this, div2View, expressionResolver, view, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logLongClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var) {
            d.n(this, div2View, expressionResolver, view, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logPagerChangePage(Div2View div2View, ExpressionResolver expressionResolver, jk jkVar, int i10, String str) {
            d.p(this, div2View, expressionResolver, jkVar, i10, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logPopupMenuItemClick(Div2View div2View, ExpressionResolver expressionResolver, int i10, String str, j1 j1Var) {
            d.q(this, div2View, expressionResolver, i10, str, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logPressChanged(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, boolean z10) {
            d.r(this, div2View, expressionResolver, view, j1Var, z10);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logSliderDrag(Div2View div2View, View view, Float f10) {
            d.s(this, div2View, view, f10);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logSwipedAway(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var) {
            d.t(this, div2View, expressionResolver, view, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logTabPageChanged(Div2View div2View, int i10) {
            d.u(this, div2View, i10);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logTabTitlesScroll(Div2View div2View) {
            d.v(this, div2View);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logTrigger(Div2View div2View, j1 j1Var) {
            d.w(this, div2View, j1Var);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logViewDisappeared(Div2View div2View, ExpressionResolver expressionResolver, View view, ra raVar) {
            d.x(this, div2View, expressionResolver, view, raVar);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logViewShown(Div2View div2View, ExpressionResolver expressionResolver, View view, hx hxVar) {
            d.z(this, div2View, expressionResolver, view, hxVar);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, String str) {
            d.d(this, div2View, expressionResolver, view, j1Var, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logDoubleClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, String str) {
            d.f(this, div2View, expressionResolver, view, j1Var, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logLongClick(Div2View div2View, ExpressionResolver expressionResolver, View view, j1 j1Var, String str) {
            d.o(this, div2View, expressionResolver, view, j1Var, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logViewDisappeared(Div2View div2View, ExpressionResolver expressionResolver, View view, ra raVar, String str) {
            d.y(this, div2View, expressionResolver, view, raVar, str);
        }

        @Override // com.yandex.div.core.Div2Logger
        public /* synthetic */ void logViewShown(Div2View div2View, ExpressionResolver expressionResolver, View view, hx hxVar, String str) {
            d.A(this, div2View, expressionResolver, view, hxVar, str);
        }
    };

    void logActiveTabTitleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i10, @NonNull j1 j1Var);

    void logBindingResult(@NonNull Div2View div2View, @Nullable ea eaVar, @Nullable ea eaVar2, @NonNull String str, @Nullable String str2);

    void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var);

    void logClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, @NonNull String str);

    void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var);

    void logDoubleClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, @NonNull String str);

    void logFocusChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, boolean z10);

    void logFrameCancelLimitExceeded(@NonNull Div2View div2View, @NonNull String str);

    void logFrameCancelled(@NonNull Div2View div2View, @NonNull String str);

    void logGalleryCompleteScroll(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull td tdVar, int i10, int i11, @NonNull String str);

    void logGalleryScroll(Div2View div2View);

    void logHoverChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, boolean z10);

    void logImeEnter(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var);

    void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var);

    void logLongClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, @NonNull String str);

    void logPagerChangePage(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull jk jkVar, int i10, @NonNull String str);

    void logPopupMenuItemClick(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, int i10, @Nullable String str, @NonNull j1 j1Var);

    void logPressChanged(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var, boolean z10);

    void logSliderDrag(Div2View div2View, View view, @Nullable Float f10);

    void logSwipedAway(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull j1 j1Var);

    void logTabPageChanged(Div2View div2View, int i10);

    void logTabTitlesScroll(Div2View div2View);

    void logTrigger(Div2View div2View, j1 j1Var);

    void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull ra raVar);

    void logViewDisappeared(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull ra raVar, @NonNull String str);

    void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull hx hxVar);

    void logViewShown(@NonNull Div2View div2View, @NonNull ExpressionResolver expressionResolver, @NonNull View view, @NonNull hx hxVar, @NonNull String str);
}
