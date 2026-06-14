package yads;

import java.util.HashSet;

/* JADX INFO: loaded from: classes4.dex */
public abstract class dn0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashSet f109984a = new HashSet();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f109985b = "goog.exo.core";

    public static synchronized void a(String str) {
        if (f109984a.add(str)) {
            f109985b += ", " + str;
        }
    }
}
