package yads;

import com.startapp.simple.bloomfilter.codec.IOUtils;

/* JADX INFO: loaded from: classes4.dex */
public final class pt extends ot {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final char f114768b;

    public pt(char c10) {
        this.f114768b = c10;
    }

    @Override // yads.ot
    public final boolean a(char c10) {
        return c10 == this.f114768b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
        char c10 = this.f114768b;
        char[] cArr = new char[6];
        cArr[0] = IOUtils.DIR_SEPARATOR_WINDOWS;
        cArr[1] = 'u';
        cArr[2] = 0;
        cArr[3] = 0;
        cArr[4] = 0;
        cArr[5] = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            cArr[5 - i10] = "0123456789ABCDEF".charAt(c10 & 15);
            c10 = (char) (c10 >> 4);
        }
        sb2.append(String.copyValueOf(cArr));
        sb2.append("')");
        return sb2.toString();
    }
}
