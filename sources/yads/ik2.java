package yads;

import android.content.Context;
import com.amazon.device.ads.DtbConstants;

/* JADX INFO: loaded from: classes4.dex */
public final class ik2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final tf0 f112041a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f112042b;

    public /* synthetic */ ik2(Context context) {
        this(context, new tf0());
    }

    public final xj1 a() {
        return sf0.f115781d == this.f112041a.a(this.f112042b) ? new xj1(1920, 1080, 6800) : new xj1(854, DtbConstants.DEFAULT_PLAYER_HEIGHT, 1000);
    }

    public ik2(Context context, tf0 tf0Var) {
        this.f112041a = tf0Var;
        this.f112042b = context.getApplicationContext();
    }
}
