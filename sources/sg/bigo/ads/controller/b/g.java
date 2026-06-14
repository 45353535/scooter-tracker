package sg.bigo.ads.controller.b;

import android.os.Parcel;
import androidx.annotation.NonNull;
import sg.bigo.ads.api.a.k;
import sg.bigo.ads.common.n;

/* JADX INFO: loaded from: classes4.dex */
public final class g implements k, sg.bigo.ads.common.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    boolean f103373a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    boolean f103374b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f103375c = 0;

    @Override // sg.bigo.ads.common.f
    public final void a(@NonNull Parcel parcel) {
        n.a(parcel, this.f103373a);
        n.a(parcel, this.f103374b);
        parcel.writeInt(this.f103375c);
    }

    @Override // sg.bigo.ads.common.f
    public final void b(@NonNull Parcel parcel) {
        this.f103373a = n.b(parcel, true);
        this.f103373a = n.b(parcel, false);
        this.f103375c = n.a(parcel, 0);
    }

    @Override // sg.bigo.ads.api.a.k
    public final int c() {
        return this.f103375c;
    }

    @NonNull
    public final String toString() {
        return "{isNativeVideoClickable=" + this.f103373a + ", isNativeVideoClickable=" + this.f103373a + ", clickTriggerType=" + this.f103375c + '}';
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean a() {
        return this.f103373a;
    }

    @Override // sg.bigo.ads.api.a.k
    public final boolean b() {
        return this.f103374b;
    }
}
