package io.appmetrica.analytics.impl;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.adjust.sdk.Constants;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.yg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class ResultReceiverC5574yg extends ResultReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC5224kg f78582a;

    public ResultReceiverC5574yg(Handler handler, InterfaceC5224kg interfaceC5224kg) {
        super(handler);
        this.f78582a = interfaceC5224kg;
    }

    public static void a(ResultReceiver resultReceiver, C5424sg c5424sg) {
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putByteArray(Constants.REFERRER, c5424sg == null ? null : c5424sg.a());
            resultReceiver.send(1, bundle);
        }
    }

    @Override // android.os.ResultReceiver
    public final void onReceiveResult(int i10, Bundle bundle) {
        if (i10 == 1) {
            C5424sg c5424sg = null;
            try {
                byte[] byteArray = bundle.getByteArray(Constants.REFERRER);
                if (byteArray != null && byteArray.length != 0) {
                    c5424sg = new C5424sg(byteArray);
                }
            } catch (Throwable unused) {
            }
            this.f78582a.a(c5424sg);
        }
    }
}
