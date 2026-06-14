package yads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.media3.common.C;
import java.util.Map;
import kotlin.Result;

/* JADX INFO: loaded from: classes4.dex */
public final class oe2 {
    public static Intent a(Context context, ne2 ne2Var) {
        String str = ne2Var.f113842b;
        String str2 = ne2Var.f113841a;
        String str3 = ne2Var.f113849i;
        Map map = ne2Var.f113843c;
        Integer num = ne2Var.f113844d;
        Intent intent = new Intent("android.intent.action.VIEW");
        if (str3 != null) {
            intent.setClassName(str2, str3);
        } else {
            intent.setData(Uri.parse(str));
            intent.setPackage(str2);
        }
        if (num == null || !(context instanceof Activity)) {
            intent.addFlags((num != null ? num.intValue() : 0) | C.ENCODING_PCM_24BIT_BIG_ENDIAN);
        } else {
            intent.addFlags(num.intValue());
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str4 = (String) entry.getKey();
                Object value = entry.getValue();
                if (value instanceof Boolean) {
                    intent.putExtra(str4, ((Boolean) value).booleanValue());
                } else if (value instanceof Integer) {
                    intent.putExtra(str4, ((Number) value).intValue());
                } else if (value instanceof String) {
                    intent.putExtra(str4, (String) value);
                } else if (value instanceof ep0) {
                    try {
                        Result.Companion companion = Result.f93230c;
                        Result.b(intent.putExtra(str4, ((ep0) value).getValue()));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.f93230c;
                        Result.b(kotlin.d.a(th2));
                    }
                }
            }
        }
        return intent;
    }
}
