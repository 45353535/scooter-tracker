package com.ironsource;

import android.os.Handler;
import android.os.Message;
import com.ironsource.sdk.utils.IronSourceStorageUtils;

/* JADX INFO: renamed from: com.ironsource.if, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
class Cif implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f43373a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final C4275d5 f43374b;

    Cif(C4275d5 c4275d5, Handler handler) {
        this.f43374b = c4275d5;
        this.f43373a = handler;
    }

    Z5 a(C4275d5 c4275d5, String str, long j10) {
        return new Z5(c4275d5, str, j10);
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        C4652z8 c4652z8 = new C4652z8(this.f43374b.b().getParent(), this.f43374b.b().getName());
        Message messageA = a();
        messageA.obj = c4652z8;
        String strA = a(c4652z8.getParent());
        if (strA == null) {
            messageA.what = 1020;
            this.f43373a.sendMessage(messageA);
        } else {
            C4292e5 c4292e5Call = a(new C4275d5(c4652z8, this.f43374b.e(), this.f43374b.a(), this.f43374b.c(), this.f43374b.f(), this.f43374b.d()), strA, 3L).call();
            messageA.what = c4292e5Call.b() == 200 ? 1016 : c4292e5Call.b();
            this.f43373a.sendMessage(messageA);
        }
    }

    Message a() {
        return new Message();
    }

    String a(String str) {
        return IronSourceStorageUtils.makeDir(str);
    }
}
