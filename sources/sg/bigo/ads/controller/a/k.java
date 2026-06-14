package sg.bigo.ads.controller.a;

import android.os.Parcel;
import androidx.annotation.CallSuper;
import androidx.annotation.NonNull;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes4.dex */
public class k implements sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    String f103303a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f103304b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f103305c;

    public k() {
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void a(@NonNull Parcel parcel) {
        parcel.writeString(this.f103305c);
        parcel.writeString(this.f103303a);
        n.a(parcel, this.f103304b);
    }

    @Override // sg.bigo.ads.common.f
    @CallSuper
    public void b(@NonNull Parcel parcel) {
        this.f103305c = n.a(parcel, "");
        this.f103303a = n.a(parcel, "");
        this.f103304b = n.b(parcel, false);
    }

    @NonNull
    public String toString() {
        return super.toString();
    }

    public k(String str, String str2, boolean z10) {
        this.f103305c = str;
        this.f103303a = str2;
        this.f103304b = z10;
    }
}
