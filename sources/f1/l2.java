package f1;

import android.content.ContentResolver;
import android.content.Context;
import android.provider.Settings;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class l2 extends u1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ContentResolver f70291b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(Context context, ContentResolver contentResolver) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        this.f70291b = contentResolver;
    }

    public e1 b() {
        f6 f6Var = f6.f69801c;
        String str = null;
        try {
            boolean z10 = Settings.Secure.getInt(this.f70291b, CommonUrlParts.LIMIT_AD_TRACKING) != 0;
            String string = Settings.Secure.getString(this.f70291b, "advertising_id");
            if (z10 || Intrinsics.areEqual(string, "00000000-0000-0000-0000-000000000000") || a()) {
                f6Var = f6.f69803e;
            } else {
                f6Var = f6.f69802d;
                str = string;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return new e1(f6Var, str);
    }
}
