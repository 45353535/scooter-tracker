package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;

/* JADX INFO: loaded from: classes12.dex */
public final class I6 extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H6 f75924a;

    public I6(Handler handler, H6 h62) {
        super(handler);
        this.f75924a = h62;
    }

    public static void a(ResultReceiver resultReceiver, C4954a4 c4954a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            c4954a4.b(bundle);
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.f75924a.a(i10, bundle);
    }

    public static void a(ResultReceiver resultReceiver, Nl nl, C4954a4 c4954a4) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putInt("startup_error_key_code", nl.f76181a);
            c4954a4.b(bundle);
            resultReceiver.send(2, bundle);
        }
    }
}
