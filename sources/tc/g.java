package tc;

import android.view.View;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f105060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f105061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f105062c;

    public g(float f10, float f11, float f12) {
        this.f105060a = f10;
        this.f105061b = f11;
        this.f105062c = f12;
    }

    public final float a() {
        return this.f105060a;
    }

    public final float b() {
        return this.f105061b;
    }

    public final float c() {
        return this.f105062c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f105060a, gVar.f105060a) == 0 && Float.compare(this.f105061b, gVar.f105061b) == 0 && Float.compare(this.f105062c, gVar.f105062c) == 0;
    }

    public int hashCode() {
        return (((Float.floatToIntBits(this.f105060a) * 31) + Float.floatToIntBits(this.f105061b)) * 31) + Float.floatToIntBits(this.f105062c);
    }

    public String toString() {
        return "AdAnimationValues(alpha=" + this.f105060a + ", translationX=" + this.f105061b + ", translationY=" + this.f105062c + ')';
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(View view) {
        this(view.getAlpha(), view.getTranslationX(), view.getTranslationY());
        Intrinsics.checkNotNullParameter(view, "view");
    }
}
