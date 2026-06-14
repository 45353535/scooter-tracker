package sg.bigo.ads.api.core;

import android.os.Parcel;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class k implements sg.bigo.ads.api.a.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102203a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102204b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f102205c = 5;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f102203a + StringUtils.COMMA + this.f102204b + StringUtils.COMMA + this.f102205c);
    }

    @Override // sg.bigo.ads.api.a.g
    public final int b() {
        return this.f102204b;
    }

    @Override // sg.bigo.ads.api.a.g
    public final int c() {
        return this.f102205c;
    }

    @Override // sg.bigo.ads.api.a.g
    public final void a(@Nullable JSONObject jSONObject) {
        if (jSONObject != null) {
            this.f102203a = jSONObject.optInt("id_show_loading", 2);
            this.f102204b = jSONObject.optInt("loading_timeout", 3);
            this.f102205c = jSONObject.optInt("material_show_close_button", 5);
        }
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        String[] strArrSplit;
        if (parcel.dataAvail() > 0) {
            String string = parcel.readString();
            if (TextUtils.isEmpty(string) || (strArrSplit = string.split(StringUtils.COMMA)) == null || strArrSplit.length != 3) {
                return;
            }
            this.f102203a = sg.bigo.ads.common.utils.q.a(strArrSplit[0], 2);
            this.f102204b = sg.bigo.ads.common.utils.q.a(strArrSplit[1], 3);
            this.f102205c = sg.bigo.ads.common.utils.q.a(strArrSplit[2], 5);
        }
    }

    @Override // sg.bigo.ads.api.a.g
    public final boolean a() {
        return this.f102203a == 2;
    }
}
