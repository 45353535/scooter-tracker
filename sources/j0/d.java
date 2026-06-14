package j0;

import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f85440a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final char f85441b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f85442c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final double f85443d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f85444e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final String f85445f;

    public d(List list, char c10, double d10, double d11, String str, String str2) {
        this.f85440a = list;
        this.f85441b = c10;
        this.f85442c = d10;
        this.f85443d = d11;
        this.f85444e = str;
        this.f85445f = str2;
    }

    public static int c(char c10, String str, String str2) {
        return (((c10 * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    public List a() {
        return this.f85440a;
    }

    public double b() {
        return this.f85443d;
    }

    public int hashCode() {
        return c(this.f85441b, this.f85445f, this.f85444e);
    }
}
