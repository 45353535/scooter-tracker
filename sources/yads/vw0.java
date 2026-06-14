package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.yandex.mobile.ads.common.AdActivity;

/* JADX INFO: loaded from: classes4.dex */
public final class vw0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final qr3 f117213a;

    public vw0(qr3 qr3Var) {
        this.f117213a = qr3Var;
    }

    public final Intent a(Context context, long j10) {
        this.f117213a.getClass();
        Intent intent = new Intent(context, (Class<?>) AdActivity.class);
        intent.putExtra("window_type", "window_type_fullscreen");
        intent.putExtra("data_identifier", j10);
        if (!(context instanceof Activity)) {
            intent.addFlags(402653184);
        }
        return intent;
    }
}
