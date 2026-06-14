package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final String f103294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f103295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f103296c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f103297d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f103298e;

    public h(@Nullable String str, boolean z10) {
        this(str, true, z10, 0, "success");
    }

    public static h a(@Nullable String str, boolean z10, int i10, String str2) {
        return new h(str, false, z10, i10, str2);
    }

    @NonNull
    public final String toString() {
        return super.toString();
    }

    public h(@Nullable String str, boolean z10, boolean z11, int i10, String str2) {
        this.f103294a = str;
        this.f103295b = z10;
        this.f103296c = z11;
        this.f103297d = i10;
        this.f103298e = str2;
    }
}
