package com.google.android.material.color.utilities;

import androidx.annotation.RestrictTo;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;

/* JADX INFO: loaded from: classes9.dex */
@CheckReturnValue
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
@Deprecated
public class Scheme {
    private int A;
    private int B;
    private int C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f26162a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f26163b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f26164c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f26165d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f26166e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f26167f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f26168g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f26169h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f26170i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f26171j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f26172k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f26173l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f26174m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f26175n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f26176o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f26177p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f26178q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f26179r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f26180s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f26181t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private int f26182u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f26183v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f26184w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f26185x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private int f26186y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private int f26187z;

    public Scheme() {
    }

    private static Scheme a(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f26127a1.tone(80)).withOnPrimary(corePalette.f26127a1.tone(20)).withPrimaryContainer(corePalette.f26127a1.tone(30)).withOnPrimaryContainer(corePalette.f26127a1.tone(90)).withSecondary(corePalette.f26128a2.tone(80)).withOnSecondary(corePalette.f26128a2.tone(20)).withSecondaryContainer(corePalette.f26128a2.tone(30)).withOnSecondaryContainer(corePalette.f26128a2.tone(90)).withTertiary(corePalette.f26129a3.tone(80)).withOnTertiary(corePalette.f26129a3.tone(20)).withTertiaryContainer(corePalette.f26129a3.tone(30)).withOnTertiaryContainer(corePalette.f26129a3.tone(90)).withError(corePalette.error.tone(80)).withOnError(corePalette.error.tone(20)).withErrorContainer(corePalette.error.tone(30)).withOnErrorContainer(corePalette.error.tone(80)).withBackground(corePalette.f26130n1.tone(10)).withOnBackground(corePalette.f26130n1.tone(90)).withSurface(corePalette.f26130n1.tone(10)).withOnSurface(corePalette.f26130n1.tone(90)).withSurfaceVariant(corePalette.f26131n2.tone(30)).withOnSurfaceVariant(corePalette.f26131n2.tone(80)).withOutline(corePalette.f26131n2.tone(60)).withOutlineVariant(corePalette.f26131n2.tone(30)).withShadow(corePalette.f26130n1.tone(0)).withScrim(corePalette.f26130n1.tone(0)).withInverseSurface(corePalette.f26130n1.tone(90)).withInverseOnSurface(corePalette.f26130n1.tone(20)).withInversePrimary(corePalette.f26127a1.tone(40));
    }

    private static Scheme b(CorePalette corePalette) {
        return new Scheme().withPrimary(corePalette.f26127a1.tone(40)).withOnPrimary(corePalette.f26127a1.tone(100)).withPrimaryContainer(corePalette.f26127a1.tone(90)).withOnPrimaryContainer(corePalette.f26127a1.tone(10)).withSecondary(corePalette.f26128a2.tone(40)).withOnSecondary(corePalette.f26128a2.tone(100)).withSecondaryContainer(corePalette.f26128a2.tone(90)).withOnSecondaryContainer(corePalette.f26128a2.tone(10)).withTertiary(corePalette.f26129a3.tone(40)).withOnTertiary(corePalette.f26129a3.tone(100)).withTertiaryContainer(corePalette.f26129a3.tone(90)).withOnTertiaryContainer(corePalette.f26129a3.tone(10)).withError(corePalette.error.tone(40)).withOnError(corePalette.error.tone(100)).withErrorContainer(corePalette.error.tone(90)).withOnErrorContainer(corePalette.error.tone(10)).withBackground(corePalette.f26130n1.tone(99)).withOnBackground(corePalette.f26130n1.tone(10)).withSurface(corePalette.f26130n1.tone(99)).withOnSurface(corePalette.f26130n1.tone(10)).withSurfaceVariant(corePalette.f26131n2.tone(90)).withOnSurfaceVariant(corePalette.f26131n2.tone(30)).withOutline(corePalette.f26131n2.tone(50)).withOutlineVariant(corePalette.f26131n2.tone(80)).withShadow(corePalette.f26130n1.tone(0)).withScrim(corePalette.f26130n1.tone(0)).withInverseSurface(corePalette.f26130n1.tone(20)).withInverseOnSurface(corePalette.f26130n1.tone(95)).withInversePrimary(corePalette.f26127a1.tone(80));
    }

    public static Scheme dark(int i10) {
        return a(CorePalette.of(i10));
    }

    public static Scheme darkContent(int i10) {
        return a(CorePalette.contentOf(i10));
    }

    public static Scheme light(int i10) {
        return b(CorePalette.of(i10));
    }

    public static Scheme lightContent(int i10) {
        return b(CorePalette.contentOf(i10));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scheme)) {
            return false;
        }
        Scheme scheme = (Scheme) obj;
        return this.f26162a == scheme.f26162a && this.f26163b == scheme.f26163b && this.f26164c == scheme.f26164c && this.f26165d == scheme.f26165d && this.f26166e == scheme.f26166e && this.f26167f == scheme.f26167f && this.f26168g == scheme.f26168g && this.f26169h == scheme.f26169h && this.f26170i == scheme.f26170i && this.f26171j == scheme.f26171j && this.f26172k == scheme.f26172k && this.f26173l == scheme.f26173l && this.f26174m == scheme.f26174m && this.f26175n == scheme.f26175n && this.f26176o == scheme.f26176o && this.f26177p == scheme.f26177p && this.f26178q == scheme.f26178q && this.f26179r == scheme.f26179r && this.f26180s == scheme.f26180s && this.f26181t == scheme.f26181t && this.f26182u == scheme.f26182u && this.f26183v == scheme.f26183v && this.f26184w == scheme.f26184w && this.f26185x == scheme.f26185x && this.f26186y == scheme.f26186y && this.f26187z == scheme.f26187z && this.A == scheme.A && this.B == scheme.B && this.C == scheme.C;
    }

    public int getBackground() {
        return this.f26178q;
    }

    public int getError() {
        return this.f26174m;
    }

    public int getErrorContainer() {
        return this.f26176o;
    }

    public int getInverseOnSurface() {
        return this.B;
    }

    public int getInversePrimary() {
        return this.C;
    }

    public int getInverseSurface() {
        return this.A;
    }

    public int getOnBackground() {
        return this.f26179r;
    }

    public int getOnError() {
        return this.f26175n;
    }

    public int getOnErrorContainer() {
        return this.f26177p;
    }

    public int getOnPrimary() {
        return this.f26163b;
    }

    public int getOnPrimaryContainer() {
        return this.f26165d;
    }

    public int getOnSecondary() {
        return this.f26167f;
    }

    public int getOnSecondaryContainer() {
        return this.f26169h;
    }

    public int getOnSurface() {
        return this.f26181t;
    }

    public int getOnSurfaceVariant() {
        return this.f26183v;
    }

    public int getOnTertiary() {
        return this.f26171j;
    }

    public int getOnTertiaryContainer() {
        return this.f26173l;
    }

    public int getOutline() {
        return this.f26184w;
    }

    public int getOutlineVariant() {
        return this.f26185x;
    }

    public int getPrimary() {
        return this.f26162a;
    }

    public int getPrimaryContainer() {
        return this.f26164c;
    }

    public int getScrim() {
        return this.f26187z;
    }

    public int getSecondary() {
        return this.f26166e;
    }

    public int getSecondaryContainer() {
        return this.f26168g;
    }

    public int getShadow() {
        return this.f26186y;
    }

    public int getSurface() {
        return this.f26180s;
    }

    public int getSurfaceVariant() {
        return this.f26182u;
    }

    public int getTertiary() {
        return this.f26170i;
    }

    public int getTertiaryContainer() {
        return this.f26172k;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((System.identityHashCode(this) * 31) + this.f26162a) * 31) + this.f26163b) * 31) + this.f26164c) * 31) + this.f26165d) * 31) + this.f26166e) * 31) + this.f26167f) * 31) + this.f26168g) * 31) + this.f26169h) * 31) + this.f26170i) * 31) + this.f26171j) * 31) + this.f26172k) * 31) + this.f26173l) * 31) + this.f26174m) * 31) + this.f26175n) * 31) + this.f26176o) * 31) + this.f26177p) * 31) + this.f26178q) * 31) + this.f26179r) * 31) + this.f26180s) * 31) + this.f26181t) * 31) + this.f26182u) * 31) + this.f26183v) * 31) + this.f26184w) * 31) + this.f26185x) * 31) + this.f26186y) * 31) + this.f26187z) * 31) + this.A) * 31) + this.B) * 31) + this.C;
    }

    public void setBackground(int i10) {
        this.f26178q = i10;
    }

    public void setError(int i10) {
        this.f26174m = i10;
    }

    public void setErrorContainer(int i10) {
        this.f26176o = i10;
    }

    public void setInverseOnSurface(int i10) {
        this.B = i10;
    }

    public void setInversePrimary(int i10) {
        this.C = i10;
    }

    public void setInverseSurface(int i10) {
        this.A = i10;
    }

    public void setOnBackground(int i10) {
        this.f26179r = i10;
    }

    public void setOnError(int i10) {
        this.f26175n = i10;
    }

    public void setOnErrorContainer(int i10) {
        this.f26177p = i10;
    }

    public void setOnPrimary(int i10) {
        this.f26163b = i10;
    }

    public void setOnPrimaryContainer(int i10) {
        this.f26165d = i10;
    }

    public void setOnSecondary(int i10) {
        this.f26167f = i10;
    }

    public void setOnSecondaryContainer(int i10) {
        this.f26169h = i10;
    }

    public void setOnSurface(int i10) {
        this.f26181t = i10;
    }

    public void setOnSurfaceVariant(int i10) {
        this.f26183v = i10;
    }

    public void setOnTertiary(int i10) {
        this.f26171j = i10;
    }

    public void setOnTertiaryContainer(int i10) {
        this.f26173l = i10;
    }

    public void setOutline(int i10) {
        this.f26184w = i10;
    }

    public void setOutlineVariant(int i10) {
        this.f26185x = i10;
    }

    public void setPrimary(int i10) {
        this.f26162a = i10;
    }

    public void setPrimaryContainer(int i10) {
        this.f26164c = i10;
    }

    public void setScrim(int i10) {
        this.f26187z = i10;
    }

    public void setSecondary(int i10) {
        this.f26166e = i10;
    }

    public void setSecondaryContainer(int i10) {
        this.f26168g = i10;
    }

    public void setShadow(int i10) {
        this.f26186y = i10;
    }

    public void setSurface(int i10) {
        this.f26180s = i10;
    }

    public void setSurfaceVariant(int i10) {
        this.f26182u = i10;
    }

    public void setTertiary(int i10) {
        this.f26170i = i10;
    }

    public void setTertiaryContainer(int i10) {
        this.f26172k = i10;
    }

    public String toString() {
        return "Scheme{primary=" + this.f26162a + ", onPrimary=" + this.f26163b + ", primaryContainer=" + this.f26164c + ", onPrimaryContainer=" + this.f26165d + ", secondary=" + this.f26166e + ", onSecondary=" + this.f26167f + ", secondaryContainer=" + this.f26168g + ", onSecondaryContainer=" + this.f26169h + ", tertiary=" + this.f26170i + ", onTertiary=" + this.f26171j + ", tertiaryContainer=" + this.f26172k + ", onTertiaryContainer=" + this.f26173l + ", error=" + this.f26174m + ", onError=" + this.f26175n + ", errorContainer=" + this.f26176o + ", onErrorContainer=" + this.f26177p + ", background=" + this.f26178q + ", onBackground=" + this.f26179r + ", surface=" + this.f26180s + ", onSurface=" + this.f26181t + ", surfaceVariant=" + this.f26182u + ", onSurfaceVariant=" + this.f26183v + ", outline=" + this.f26184w + ", outlineVariant=" + this.f26185x + ", shadow=" + this.f26186y + ", scrim=" + this.f26187z + ", inverseSurface=" + this.A + ", inverseOnSurface=" + this.B + ", inversePrimary=" + this.C + '}';
    }

    @CanIgnoreReturnValue
    public Scheme withBackground(int i10) {
        this.f26178q = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withError(int i10) {
        this.f26174m = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withErrorContainer(int i10) {
        this.f26176o = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseOnSurface(int i10) {
        this.B = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInversePrimary(int i10) {
        this.C = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withInverseSurface(int i10) {
        this.A = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnBackground(int i10) {
        this.f26179r = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnError(int i10) {
        this.f26175n = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnErrorContainer(int i10) {
        this.f26177p = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimary(int i10) {
        this.f26163b = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnPrimaryContainer(int i10) {
        this.f26165d = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondary(int i10) {
        this.f26167f = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSecondaryContainer(int i10) {
        this.f26169h = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurface(int i10) {
        this.f26181t = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnSurfaceVariant(int i10) {
        this.f26183v = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiary(int i10) {
        this.f26171j = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOnTertiaryContainer(int i10) {
        this.f26173l = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutline(int i10) {
        this.f26184w = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withOutlineVariant(int i10) {
        this.f26185x = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimary(int i10) {
        this.f26162a = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withPrimaryContainer(int i10) {
        this.f26164c = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withScrim(int i10) {
        this.f26187z = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondary(int i10) {
        this.f26166e = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSecondaryContainer(int i10) {
        this.f26168g = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withShadow(int i10) {
        this.f26186y = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurface(int i10) {
        this.f26180s = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withSurfaceVariant(int i10) {
        this.f26182u = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiary(int i10) {
        this.f26170i = i10;
        return this;
    }

    @CanIgnoreReturnValue
    public Scheme withTertiaryContainer(int i10) {
        this.f26172k = i10;
        return this;
    }

    public Scheme(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, int i21, int i22, int i23, int i24, int i25, int i26, int i27, int i28, int i29, int i30, int i31, int i32, int i33, int i34, int i35, int i36, int i37, int i38) {
        this.f26162a = i10;
        this.f26163b = i11;
        this.f26164c = i12;
        this.f26165d = i13;
        this.f26166e = i14;
        this.f26167f = i15;
        this.f26168g = i16;
        this.f26169h = i17;
        this.f26170i = i18;
        this.f26171j = i19;
        this.f26172k = i20;
        this.f26173l = i21;
        this.f26174m = i22;
        this.f26175n = i23;
        this.f26176o = i24;
        this.f26177p = i25;
        this.f26178q = i26;
        this.f26179r = i27;
        this.f26180s = i28;
        this.f26181t = i29;
        this.f26182u = i30;
        this.f26183v = i31;
        this.f26184w = i32;
        this.f26185x = i33;
        this.f26186y = i34;
        this.f26187z = i35;
        this.A = i36;
        this.B = i37;
        this.C = i38;
    }
}
