package yads;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class lx0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f113255c = Pattern.compile("^ [0-9a-fA-F]{8} ([0-9a-fA-F]{8}) ([0-9a-fA-F]{8})");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f113256a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f113257b = -1;

    public final void a(fr1 fr1Var) {
        int i10 = 0;
        while (true) {
            er1[] er1VarArr = fr1Var.f110835b;
            if (i10 >= er1VarArr.length) {
                return;
            }
            er1 er1Var = er1VarArr[i10];
            if (er1Var instanceof zw) {
                zw zwVar = (zw) er1Var;
                if ("iTunSMPB".equals(zwVar.f118853d) && a(zwVar.f118854e)) {
                    return;
                }
            } else if (er1Var instanceof kb1) {
                kb1 kb1Var = (kb1) er1Var;
                if ("com.apple.iTunes".equals(kb1Var.f112671c) && "iTunSMPB".equals(kb1Var.f112672d) && a(kb1Var.f112673e)) {
                    return;
                }
            } else {
                continue;
            }
            i10++;
        }
    }

    public final boolean a(String str) {
        Matcher matcher = f113255c.matcher(str);
        if (!matcher.find()) {
            return false;
        }
        try {
            String strGroup = matcher.group(1);
            int i10 = w83.f117341a;
            int i11 = Integer.parseInt(strGroup, 16);
            int i12 = Integer.parseInt(matcher.group(2), 16);
            if (i11 <= 0 && i12 <= 0) {
                return false;
            }
            this.f113256a = i11;
            this.f113257b = i12;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
