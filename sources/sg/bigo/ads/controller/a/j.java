package sg.bigo.ads.controller.a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected String f103300a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected String f103301b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f103302c;

    protected j(String str, @Nullable String str2, int i10) {
        this.f103300a = str;
        this.f103301b = str2;
        this.f103302c = i10;
    }

    @NonNull
    public final String a() {
        return this.f103300a;
    }

    @Nullable
    public final String b() {
        return this.f103301b;
    }

    public final boolean c() {
        return d.a(this.f103301b);
    }

    public final int d() {
        return this.f103302c;
    }

    @NonNull
    public String toString() {
        return super.toString();
    }
}
