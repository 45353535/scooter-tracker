package pd;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f98237a = new a(null);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public final boolean a(Context context, Uri uri) {
        Intent intentN;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(uri, "uri");
        try {
            intentN = o.n(uri, false);
            intentN.setPackage("com.android.vending");
            intentN.putExtra("overlay", true);
            intentN.putExtra("callerId", context.getPackageName());
        } catch (Throwable unused) {
        }
        if (intentN.resolveActivity(context.getPackageManager()) == null) {
            Unit unit = Unit.f93236a;
            return false;
        }
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intentN, 0);
        } else {
            context.startActivity(intentN);
        }
        return true;
    }
}
