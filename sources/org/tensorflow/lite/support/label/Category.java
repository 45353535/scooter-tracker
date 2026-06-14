package org.tensorflow.lite.support.label;

import j$.util.Objects;
import org.tensorflow.lite.annotations.UsedByReflection;

/* JADX INFO: loaded from: classes4.dex */
@UsedByReflection
public final class Category {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f97956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f97957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f97958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f97959d;

    @UsedByReflection
    public Category(String str, float f10) {
        this(str, "", f10, -1);
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f10, int i10) {
        return new Category(str, str2, f10, i10);
    }

    public String a() {
        return this.f97958c;
    }

    public int b() {
        return this.f97956a;
    }

    public String c() {
        return this.f97957b;
    }

    public float d() {
        return this.f97959d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof Category) {
            Category category = (Category) obj;
            if (category.c().equals(this.f97957b) && category.a().equals(this.f97958c) && Math.abs(category.d() - this.f97959d) < 1.0E-6f && category.b() == this.f97956a) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(this.f97957b, this.f97958c, Float.valueOf(this.f97959d), Integer.valueOf(this.f97956a));
    }

    public String toString() {
        return "<Category \"" + this.f97957b + "\" (displayName=" + this.f97958c + " score=" + this.f97959d + " index=" + this.f97956a + ")>";
    }

    private Category(String str, String str2, float f10, int i10) {
        this.f97957b = str;
        this.f97958c = str2;
        this.f97959d = f10;
        this.f97956a = i10;
    }

    @UsedByReflection
    public static Category create(String str, String str2, float f10) {
        return new Category(str, str2, f10, -1);
    }
}
