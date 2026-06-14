package f1;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f71006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f71007b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f71008c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final WindowInsetsCompat f71009d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Insets f71010e;

    public s(int i10, int i11, float f10, WindowInsetsCompat windowInsetsCompat, Insets insets) {
        this.f71006a = i10;
        this.f71007b = i11;
        this.f71008c = f10;
        this.f71009d = windowInsetsCompat;
        this.f71010e = insets;
    }

    public final Insets a() {
        return this.f71010e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return this.f71006a == sVar.f71006a && this.f71007b == sVar.f71007b && Float.compare(this.f71008c, sVar.f71008c) == 0 && Intrinsics.areEqual(this.f71009d, sVar.f71009d) && Intrinsics.areEqual(this.f71010e, sVar.f71010e);
    }

    public int hashCode() {
        int iFloatToIntBits = ((((this.f71006a * 31) + this.f71007b) * 31) + Float.floatToIntBits(this.f71008c)) * 31;
        WindowInsetsCompat windowInsetsCompat = this.f71009d;
        int iHashCode = (iFloatToIntBits + (windowInsetsCompat == null ? 0 : windowInsetsCompat.hashCode())) * 31;
        Insets insets = this.f71010e;
        return iHashCode + (insets != null ? insets.hashCode() : 0);
    }

    public String toString() {
        return "RenderingContainer(width=" + this.f71006a + ", height=" + this.f71007b + ", density=" + this.f71008c + ", windowInsets=" + this.f71009d + ", systemInsets=" + this.f71010e + ")";
    }

    public /* synthetic */ s(int i10, int i11, float f10, WindowInsetsCompat windowInsetsCompat, Insets insets, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, f10, (i12 & 8) != 0 ? null : windowInsetsCompat, (i12 & 16) != 0 ? null : insets);
    }
}
