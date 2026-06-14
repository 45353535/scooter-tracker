package f1;

import android.content.Context;
import android.content.Intent;
import com.chartboost.sdk.view.CBImpressionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f70226a;

    public k1(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f70226a = context;
    }

    public final Intent a() {
        Intent intentAddFlags = new Intent(this.f70226a, (Class<?>) CBImpressionActivity.class).putExtra("isChartboost", true).addFlags(268435456);
        Intrinsics.checkNotNullExpressionValue(intentAddFlags, "addFlags(...)");
        return intentAddFlags;
    }

    public final void b(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        try {
            this.f70226a.startActivity(intent);
        } catch (Exception e10) {
            eg.i("Cannot start the activity", e10);
        }
    }
}
