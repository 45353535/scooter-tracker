package com.ironsource.mediationsdk.metadata;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f44102a = "do_not_sell";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f44103b = "is_child_directed";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f44104c = "is_deviceid_optout";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f44105d = "google_family_self_certified_sdks";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f44106e = "iiqf";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44107f = "is_test_suite";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44108g = "true";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected static final String f44109h = "false";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f44110i = "google_water_mark";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f44111j = "enable";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final Set<String> f44112k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final Set<String> f44113l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final Set<String> f44114m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f44115n = 2048;

    static {
        HashSet hashSet = new HashSet(Arrays.asList("is_child_directed", f44104c, f44107f, f44105d, f44106e));
        f44112k = hashSet;
        f44113l = new HashSet(Arrays.asList(f44104c, f44105d, f44107f, f44106e));
        HashSet hashSet2 = new HashSet(hashSet);
        f44114m = hashSet2;
        hashSet2.add("do_not_sell");
    }
}
