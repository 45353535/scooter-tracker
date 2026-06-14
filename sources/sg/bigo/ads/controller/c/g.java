package sg.bigo.ads.controller.c;

import android.graphics.Rect;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    private Rect f103442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f103443b = 2;

    public g(@NonNull JSONObject jSONObject) {
        String strOptString = jSONObject.optString("start_coordinate");
        String strOptString2 = jSONObject.optString("end_coordinate");
        if (TextUtils.isEmpty(strOptString) || TextUtils.isEmpty(strOptString2)) {
            return;
        }
        String[] strArrSplit = strOptString.split(StringUtils.COMMA);
        String[] strArrSplit2 = strOptString2.split(StringUtils.COMMA);
        if (strArrSplit.length == 2 && strArrSplit2.length == 2) {
            try {
                int i10 = (int) (Float.parseFloat(strArrSplit[0]) * 1000.0f);
                int i11 = (int) (Float.parseFloat(strArrSplit2[0]) * 1000.0f);
                int i12 = (int) (Float.parseFloat(strArrSplit[1]) * 1000.0f);
                int i13 = (int) (Float.parseFloat(strArrSplit2[1]) * 1000.0f);
                this.f103442a = new Rect(Math.min(i10, i11), Math.min(i12, i13), Math.max(i10, i11), Math.max(i12, i13));
            } catch (NumberFormatException unused) {
            }
        }
    }
}
