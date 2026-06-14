package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.webkit.WebView;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public interface m extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t {
    Object a(String str, Continuation continuation);

    void a(boolean z10);

    WebView c();

    void d(a0 a0Var);

    void f(b0 b0Var);

    void h(c0 c0Var);

    void j();

    void l(boolean z10, boolean z11, boolean z12, boolean z13, boolean z14);

    void o(w wVar, String str);

    SharedFlow v();

    StateFlow w();
}
