package sg.bigo.ads.core.f.a;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f104244a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104245b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f104246c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f104247d;

    public n(@NonNull String str) {
        this.f104247d = false;
        this.f104244a = true;
        this.f104245b = str;
    }

    public String toString() {
        return "{\"Content\":\"" + this.f104245b + "\"}";
    }

    public n(@NonNull String str, byte b10) {
        this(str);
        this.f104247d = true;
    }
}
