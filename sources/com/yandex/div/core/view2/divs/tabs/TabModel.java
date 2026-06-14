package com.yandex.div.core.view2.divs.tabs;

import android.view.View;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.MBridgeConstans;
import k8.y0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/core/view2/divs/tabs/TabModel;", "", "", FirebaseAnalytics.Param.INDEX, "Lk8/y0;", "div", "Landroid/view/View;", MBridgeConstans.DYNAMIC_VIEW_KEY_VIEW, "<init>", "(ILk8/y0;Landroid/view/View;)V", "I", "getIndex", "()I", "Lk8/y0;", "getDiv", "()Lk8/y0;", "Landroid/view/View;", "getView", "()Landroid/view/View;", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class TabModel {

    @NotNull
    private final y0 div;
    private final int index;

    @NotNull
    private final View view;

    public TabModel(int i10, @NotNull y0 y0Var, @NotNull View view) {
        this.index = i10;
        this.div = y0Var;
        this.view = view;
    }

    @NotNull
    public final y0 getDiv() {
        return this.div;
    }

    public final int getIndex() {
        return this.index;
    }

    @NotNull
    public final View getView() {
        return this.view;
    }
}
