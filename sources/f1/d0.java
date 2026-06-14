package f1;

import java.io.File;

/* JADX INFO: loaded from: classes6.dex */
public class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final File f69554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f69555b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final File f69556c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final File f69557d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final File f69558e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f69559f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final File f69560g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final File f69561h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final File f69562i;

    public d0(File file) {
        File file2 = new File(file, ".chartboost");
        this.f69554a = file2;
        if (!file2.exists()) {
            file2.mkdirs();
        }
        this.f69555b = b(file2, "css");
        this.f69556c = b(file2, "html");
        this.f69557d = b(file2, "images");
        this.f69558e = b(file2, "js");
        this.f69559f = b(file2, "templates");
        this.f69560g = b(file2, "videos");
        this.f69561h = b(file2, "precache");
        this.f69562i = b(file2, "precache_queue");
    }

    public static File b(File file, String str) {
        File file2 = new File(file, str);
        if (!file2.exists()) {
            file2.mkdir();
        }
        return file2;
    }

    public File a() {
        return this.f69554a;
    }
}
