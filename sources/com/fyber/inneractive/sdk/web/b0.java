package com.fyber.inneractive.sdk.web;

import com.fyber.inneractive.sdk.config.enums.Orientation;
import com.fyber.inneractive.sdk.ui.IAmraidWebViewController;

/* JADX INFO: loaded from: classes7.dex */
public interface b0 extends j1 {
    void a(IAmraidWebViewController.MraidVideoFailedToDisplayError mraidVideoFailedToDisplayError);

    void a(boolean z10, Orientation orientation);

    boolean a(String str);

    void b();

    void b(boolean z10);

    void c();

    void d();

    void onClose();
}
