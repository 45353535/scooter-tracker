package yads;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public final class b23 extends rw2 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final Pattern f108895o = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Pattern f108896p = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StringBuilder f108897m = new StringBuilder();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final ArrayList f108898n = new ArrayList();

    public static long a(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L;
        String strGroup2 = matcher.group(i10 + 2);
        strGroup2.getClass();
        long j11 = (Long.parseLong(strGroup2) * 60000) + j10;
        String strGroup3 = matcher.group(i10 + 3);
        strGroup3.getClass();
        long j12 = (Long.parseLong(strGroup3) * 1000) + j11;
        String strGroup4 = matcher.group(i10 + 4);
        if (strGroup4 != null) {
            j12 += Long.parseLong(strGroup4);
        }
        return j12 * 1000;
    }

    /* JADX WARN: Code restructure failed: missing block: B:151:0x027b, code lost:
    
        return new yads.c23((yads.a20[]) r2.toArray(new yads.a20[r4]), r3.a());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // yads.rw2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final yads.d23 a(byte[] r31, int r32, boolean r33) {
        /*
            Method dump skipped, instruction units count: 712
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: yads.b23.a(byte[], int, boolean):yads.d23");
    }
}
