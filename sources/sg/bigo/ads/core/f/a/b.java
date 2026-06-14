package sg.bigo.ads.core.f.a;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f104204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final int f104205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f104206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    public final String f104207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f104208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f104209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f104210g;

    public b(int i10, int i11, int i12, int i13, @NonNull String str, @Nullable String str2, @Nullable String str3) {
        this.f104204a = i10;
        this.f104205b = i11;
        this.f104210g = i13;
        this.f104206c = str;
        this.f104209f = i12;
        this.f104207d = str2;
        this.f104208e = str3;
    }

    public final boolean a() {
        return TextUtils.equals(this.f104207d, "application/javascript");
    }
}
