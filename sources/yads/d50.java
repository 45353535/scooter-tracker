package yads;

import com.yandex.mobile.ads.R$style;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class d50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f109764a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109765b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f109766c;

    public d50(int i10, int i11, String str) {
        this.f109764a = str;
        this.f109765b = i10;
        this.f109766c = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d50)) {
            return false;
        }
        d50 d50Var = (d50) obj;
        return Intrinsics.areEqual(this.f109764a, d50Var.f109764a) && this.f109765b == d50Var.f109765b && this.f109766c == d50Var.f109766c;
    }

    public final int hashCode() {
        return this.f109766c + bb3.a(this.f109765b, this.f109764a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "DebugPanelColoredText(text=" + this.f109764a + ", color=" + this.f109765b + ", style=" + this.f109766c + ")";
    }

    public /* synthetic */ d50(String str, int i10) {
        this(i10, R$style.DebugPanelText_Body2, str);
    }
}
