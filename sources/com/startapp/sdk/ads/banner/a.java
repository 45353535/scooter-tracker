package com.startapp.sdk.ads.banner;

import android.os.Handler;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class a implements Handler.Callback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerBase f63679a;

    public a(BannerBase bannerBase) {
        this.f63679a = bannerBase;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 == 1 || i10 == 2) {
            this.f63679a.loadBannerImpl((String) message.obj);
        }
        return true;
    }
}
