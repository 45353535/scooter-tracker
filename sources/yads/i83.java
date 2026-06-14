package yads;

import android.content.Context;
import android.net.Uri;
import com.amazon.device.ads.DtbConstants;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class i83 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vt2 f111918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f111919b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i83(Context context) {
        this(context, ut2.a());
        Object obj = vt2.f117186j;
    }

    public final String a(String str) {
        hr2 hr2VarA = this.f111918a.a(this.f111919b);
        if (hr2VarA != null && !hr2VarA.d()) {
            return str;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        if (!StringsKt.a0(lowerCase, "http://", false, 2, null) && !StringsKt.a0(lowerCase, DtbConstants.HTTPS, false, 2, null)) {
            boolean z10 = lb1.f113032a;
            return str;
        }
        try {
            Uri uri = Uri.parse(str);
            return uri.buildUpon().appendQueryParameter("ctime", String.valueOf(z33.a())).build().toString();
        } catch (Exception unused) {
            boolean z11 = lb1.f113032a;
            return str;
        }
    }

    public i83(Context context, vt2 vt2Var) {
        this.f111918a = vt2Var;
        this.f111919b = context.getApplicationContext();
    }
}
