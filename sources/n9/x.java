package n9;

import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
public class x extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f95665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f95666c;

    protected x(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.f95665b = z10;
        this.f95666c = i10;
    }

    public static x a(String str, Throwable th2) {
        return new x(str, th2, true, 1);
    }

    public static x b(String str, Throwable th2) {
        return new x(str, th2, true, 0);
    }

    public static x c(String str, Throwable th2) {
        return new x(str, th2, true, 4);
    }

    public static x d(String str) {
        return new x(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        String str;
        String message = super.getMessage();
        StringBuilder sb2 = new StringBuilder();
        if (message != null) {
            str = message + " ";
        } else {
            str = "";
        }
        sb2.append(str);
        sb2.append("{contentIsMalformed=");
        sb2.append(this.f95665b);
        sb2.append(", dataType=");
        sb2.append(this.f95666c);
        sb2.append("}");
        return sb2.toString();
    }
}
