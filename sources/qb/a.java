package qb;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lb.e;
import lb.k;
import lb.s;
import lb.t;
import q9.d0;
import q9.l;
import q9.u;

/* JADX INFO: loaded from: classes12.dex */
public final class a implements t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Pattern f98951d = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f98952e = Pattern.compile("\\{\\\\.*?\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f98953a = new StringBuilder();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f98954b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final d0 f98955c = new d0();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private p9.a b(android.text.Spanned r17, java.lang.String r18) {
        /*
            Method dump skipped, instruction units count: 364
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: qb.a.b(android.text.Spanned, java.lang.String):p9.a");
    }

    private Charset c(d0 d0Var) {
        Charset charsetR = d0Var.R();
        return charsetR != null ? charsetR : StandardCharsets.UTF_8;
    }

    public static float d(int i10) {
        if (i10 == 0) {
            return 0.08f;
        }
        if (i10 == 1) {
            return 0.5f;
        }
        if (i10 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long e(Matcher matcher, int i10) {
        String strGroup = matcher.group(i10 + 1);
        long j10 = (strGroup != null ? Long.parseLong(strGroup) * 3600000 : 0L) + (Long.parseLong((String) q9.a.e(matcher.group(i10 + 2))) * 60000) + (Long.parseLong((String) q9.a.e(matcher.group(i10 + 3))) * 1000);
        String strGroup2 = matcher.group(i10 + 4);
        if (strGroup2 != null) {
            j10 += Long.parseLong(strGroup2);
        }
        return j10 * 1000;
    }

    private String f(String str, ArrayList arrayList) {
        String strTrim = str.trim();
        StringBuilder sb2 = new StringBuilder(strTrim);
        Matcher matcher = f98952e.matcher(strTrim);
        int i10 = 0;
        while (matcher.find()) {
            String strGroup = matcher.group();
            arrayList.add(strGroup);
            int iStart = matcher.start() - i10;
            int length = strGroup.length();
            sb2.replace(iStart, iStart + length, "");
            i10 += length;
        }
        return sb2.toString();
    }

    @Override // lb.t
    public void a(byte[] bArr, int i10, int i11, t.b bVar, l lVar) {
        long j10;
        String strT;
        String str;
        this.f98955c.U(bArr, i10 + i11);
        this.f98955c.W(i10);
        Charset charsetC = c(this.f98955c);
        long j11 = -9223372036854775807L;
        ArrayList arrayList = (bVar.f94121a == -9223372036854775807L || !bVar.f94122b) ? null : new ArrayList();
        while (true) {
            String strT2 = this.f98955c.t(charsetC);
            if (strT2 == null) {
                break;
            }
            if (strT2.length() != 0) {
                try {
                    Integer.parseInt(strT2);
                    strT = this.f98955c.t(charsetC);
                } catch (NumberFormatException unused) {
                    j10 = j11;
                    u.h("SubripParser", "Skipping invalid index: " + strT2);
                }
                if (strT == null) {
                    u.h("SubripParser", "Unexpected end");
                    break;
                }
                Matcher matcher = f98951d.matcher(strT);
                if (matcher.matches()) {
                    long jE = e(matcher, 1);
                    long jE2 = e(matcher, 6);
                    int i12 = 0;
                    this.f98953a.setLength(0);
                    this.f98954b.clear();
                    String strT3 = this.f98955c.t(charsetC);
                    while (!TextUtils.isEmpty(strT3)) {
                        if (this.f98953a.length() > 0) {
                            this.f98953a.append("<br>");
                        }
                        this.f98953a.append(f(strT3, this.f98954b));
                        strT3 = this.f98955c.t(charsetC);
                    }
                    Spanned spannedFromHtml = Html.fromHtml(this.f98953a.toString());
                    while (true) {
                        if (i12 >= this.f98954b.size()) {
                            str = null;
                            break;
                        }
                        str = (String) this.f98954b.get(i12);
                        if (str.matches("\\{\\\\an[1-9]\\}")) {
                            break;
                        } else {
                            i12++;
                        }
                    }
                    j10 = j11;
                    long j12 = bVar.f94121a;
                    if (j12 == j10 || jE >= j12) {
                        lVar.accept(new e(ImmutableList.of(b(spannedFromHtml, str)), jE, jE2 - jE));
                    } else if (arrayList != null) {
                        arrayList.add(new e(ImmutableList.of(b(spannedFromHtml, str)), jE, jE2 - jE));
                    }
                } else {
                    j10 = j11;
                    u.h("SubripParser", "Skipping invalid timing: " + strT);
                }
                j11 = j10;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                lVar.accept((e) it.next());
            }
        }
    }

    @Override // lb.t
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // lb.t
    public /* synthetic */ k parseToLegacySubtitle(byte[] bArr, int i10, int i11) {
        return s.a(this, bArr, i10, i11);
    }

    @Override // lb.t
    public /* synthetic */ void reset() {
        s.b(this);
    }
}
