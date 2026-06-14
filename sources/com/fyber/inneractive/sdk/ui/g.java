package com.fyber.inneractive.sdk.ui;

import com.fyber.inneractive.sdk.web.m;

/* JADX INFO: loaded from: classes7.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ IAmraidWebViewController f23836a;

    public g(IAmraidWebViewController iAmraidWebViewController) {
        this.f23836a = iAmraidWebViewController;
    }

    @Override // java.lang.Runnable
    public final void run() {
        m mVar = this.f23836a.f23971b;
        if (mVar != null) {
            try {
                mVar.invalidate();
            } catch (Throwable unused) {
            }
        }
    }
}
