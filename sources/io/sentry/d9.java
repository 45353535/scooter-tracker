package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public final class d9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Boolean f83412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Double f83413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Double f83414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Boolean f83415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Double f83416e;

    public d9(Boolean bool) {
        this(bool, null);
    }

    public Double a() {
        return this.f83416e;
    }

    public Boolean b() {
        return this.f83415d;
    }

    public Double c() {
        return this.f83414c;
    }

    public Double d() {
        return this.f83413b;
    }

    public Boolean e() {
        return this.f83412a;
    }

    public d9(Boolean bool, Double d10) {
        this(bool, d10, null, Boolean.FALSE, null);
    }

    public d9(Boolean bool, Double d10, Double d11) {
        this(bool, d10, d11, Boolean.FALSE, null);
    }

    public d9(Boolean bool, Double d10, Double d11, Boolean bool2, Double d12) {
        this.f83412a = bool;
        this.f83413b = d10;
        this.f83414c = d11;
        this.f83415d = Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
        this.f83416e = d12;
    }
}
