package oa;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import n9.v;

/* JADX INFO: loaded from: classes12.dex */
public final class e0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f96527c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f96528a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f96529b = -1;

    private boolean b(String str) {
        Matcher matcher = f96527c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            int i10 = Integer.parseInt((String) q9.o0.i(matcher.group(1)), 16);
            int i11 = Integer.parseInt((String) q9.o0.i(matcher.group(2)), 16);
            if (i10 <= 0 && i11 <= 0) {
                return false;
            }
            this.f96528a = i10;
            this.f96529b = i11;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public boolean a() {
        return (this.f96528a == -1 || this.f96529b == -1) ? false : true;
    }

    public boolean c(n9.v vVar) {
        for (int i10 = 0; i10 < vVar.e(); i10++) {
            v.a aVarD = vVar.d(i10);
            if (aVarD instanceof cb.e) {
                cb.e eVar = (cb.e) aVarD;
                if ("iTunSMPB".equals(eVar.f6655c) && b(eVar.f6656d)) {
                    return true;
                }
            } else if (aVarD instanceof cb.k) {
                cb.k kVar = (cb.k) aVarD;
                if ("com.apple.iTunes".equals(kVar.f6668b) && "iTunSMPB".equals(kVar.f6669c) && b(kVar.f6670d)) {
                    return true;
                }
            } else {
                continue;
            }
        }
        return false;
    }
}
