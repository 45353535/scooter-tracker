package n9;

import java.util.HashSet;

/* JADX INFO: loaded from: classes12.dex */
public abstract class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final HashSet f95587a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f95588b = "media3.common";

    public static synchronized void a(String str) {
        if (f95587a.add(str)) {
            f95588b += ", " + str;
        }
    }

    public static synchronized String b() {
        return f95588b;
    }
}
