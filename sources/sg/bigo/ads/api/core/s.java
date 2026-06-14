package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class s implements sg.bigo.ads.api.a.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102224a = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(String.valueOf(this.f102224a));
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string)) {
                return;
            }
            String[] strArrSplit = string.split(StringUtils.COMMA);
            if (strArrSplit.length > 0) {
                this.f102224a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 0);
            }
        }
    }

    @Override // sg.bigo.ads.api.a.o
    public final void a(JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f102224a = jSONObject.optInt("ll_on", 0);
        }
    }
}
