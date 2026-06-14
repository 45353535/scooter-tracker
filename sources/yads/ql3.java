package yads;

import android.text.TextUtils;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class ql3 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f115074f;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f115076h;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public float f115083o;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f115069a = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public String f115070b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Set f115071c = Collections.EMPTY_SET;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f115072d = "";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f115073e = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f115075g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f115077i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f115078j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f115079k = -1;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f115080l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f115081m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f115082n = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f115084p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f115085q = false;

    public final int a(String str, String str2, Set set, String str3) {
        if (this.f115069a.isEmpty() && this.f115070b.isEmpty() && this.f115071c.isEmpty() && this.f115072d.isEmpty()) {
            return TextUtils.isEmpty(str2) ? 1 : 0;
        }
        String str4 = this.f115069a;
        int i10 = !str4.isEmpty() ? str4.equals(str) ? 1073741824 : -1 : 0;
        String str5 = this.f115070b;
        if (!str5.isEmpty() && i10 != -1) {
            i10 = str5.equals(str2) ? i10 + 2 : -1;
        }
        String str6 = this.f115072d;
        if (!str6.isEmpty() && i10 != -1) {
            i10 = str6.equals(str3) ? i10 + 4 : -1;
        }
        if (i10 == -1 || !set.containsAll(this.f115071c)) {
            return 0;
        }
        return (this.f115071c.size() * 4) + i10;
    }
}
