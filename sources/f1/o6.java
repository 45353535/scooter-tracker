package f1;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Build;
import android.support.v4.media.session.PlaybackStateCompat;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PackageManager f70722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function0 f70723b;

    public static final class a extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final a f70724f = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final Intent invoke() {
            return new Intent("android.intent.action.VIEW");
        }
    }

    public o6(PackageManager packageManager, Function0 intentFactory) {
        Intrinsics.checkNotNullParameter(packageManager, "packageManager");
        Intrinsics.checkNotNullParameter(intentFactory, "intentFactory");
        this.f70722a = packageManager;
        this.f70723b = intentFactory;
    }

    public final Intent a(String str) {
        Intent intent = (Intent) this.f70723b.invoke();
        intent.addFlags(268435456);
        intent.setData(Uri.parse(str));
        return intent;
    }

    public final List b(Intent intent) {
        if (Build.VERSION.SDK_INT >= 33) {
            PackageManager.ResolveInfoFlags resolveInfoFlagsOf = PackageManager.ResolveInfoFlags.of(PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH);
            Intrinsics.checkNotNullExpressionValue(resolveInfoFlagsOf, "of(...)");
            return c(intent, resolveInfoFlagsOf);
        }
        List<ResolveInfo> listQueryIntentActivities = this.f70722a.queryIntentActivities(intent, 65536);
        Intrinsics.checkNotNull(listQueryIntentActivities);
        return listQueryIntentActivities;
    }

    public final List c(Intent intent, PackageManager.ResolveInfoFlags resolveInfoFlags) {
        List listQueryIntentActivities = this.f70722a.queryIntentActivities(intent, resolveInfoFlags);
        Intrinsics.checkNotNullExpressionValue(listQueryIntentActivities, "queryIntentActivities(...)");
        return listQueryIntentActivities;
    }

    public final boolean d(String str) {
        if (str != null && str.length() != 0) {
            try {
                return !b(a(str)).isEmpty();
            } catch (Exception e10) {
                eg.i("Cannot open URL", e10);
            }
        }
        return false;
    }

    public /* synthetic */ o6(PackageManager packageManager, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(packageManager, (i10 & 2) != 0 ? a.f70724f : function0);
    }
}
