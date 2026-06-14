package com.fyber.inneractive.sdk.flow.storepromo.loader;

/* JADX INFO: loaded from: classes7.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f20904a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f20905b;

    public c(d dVar, String str) {
        this.f20905b = dVar;
        this.f20904a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        f fVar = this.f20905b.f20906a;
        String str = this.f20904a;
        com.fyber.inneractive.sdk.flow.storepromo.controller.webview.a aVar = fVar.f20909a;
        if (aVar != null) {
            try {
                aVar.loadDataWithBaseURL(null, str, "text/html", "UTF-8", null);
            } catch (Throwable th2) {
                if (fVar.f20913e != null) {
                    fVar.f20913e.a(com.fyber.inneractive.sdk.network.events.b.WEB_VIEW_CRASH_ERROR, "Unable to load data: " + th2.getMessage(), "");
                }
            }
        }
    }
}
