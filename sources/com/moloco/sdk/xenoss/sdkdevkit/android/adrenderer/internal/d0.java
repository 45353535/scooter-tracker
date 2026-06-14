package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class d0 extends WebView {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.v f55988b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        super(context.getApplicationContext());
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55988b = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.v();
    }

    @Override // android.webkit.WebView
    public void destroy() {
        ViewParent parent = getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(this);
        }
        removeAllViews();
        super.destroy();
    }

    @NotNull
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.v getHtmlCssFixer() {
        return this.f55988b;
    }
}
