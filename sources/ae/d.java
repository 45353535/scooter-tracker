package ae;

/* JADX INFO: loaded from: classes3.dex */
public enum d {
    Female("F", 1),
    Male("M", 2),
    Omitted("O", 0);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f4262b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f4263c;

    d(String str, int i10) {
        this.f4262b = str;
        this.f4263c = i10;
    }

    public String g() {
        return this.f4262b;
    }
}
