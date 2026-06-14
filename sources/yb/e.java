package yb;

import android.content.res.Resources;
import android.text.TextUtils;
import io.bidmachine.media3.ui.R$string;
import java.util.Locale;
import n9.w;
import q9.o0;

/* JADX INFO: loaded from: classes12.dex */
public class e implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f118901a;

    public e(Resources resources) {
        this.f118901a = (Resources) q9.a.e(resources);
    }

    private String b(io.bidmachine.media3.common.a aVar) {
        int i10 = aVar.E;
        return (i10 == -1 || i10 < 1) ? "" : i10 != 1 ? i10 != 2 ? (i10 == 6 || i10 == 7) ? this.f118901a.getString(R$string.B) : i10 != 8 ? this.f118901a.getString(R$string.A) : this.f118901a.getString(R$string.C) : this.f118901a.getString(R$string.f81519z) : this.f118901a.getString(R$string.f81510q);
    }

    private String c(io.bidmachine.media3.common.a aVar) {
        int i10 = aVar.f80556j;
        return i10 == -1 ? "" : this.f118901a.getString(R$string.f81509p, Float.valueOf(i10 / 1000000.0f));
    }

    private String d(io.bidmachine.media3.common.a aVar) {
        return TextUtils.isEmpty(aVar.f80548b) ? "" : aVar.f80548b;
    }

    private String e(io.bidmachine.media3.common.a aVar) {
        String strJ = j(f(aVar), h(aVar));
        return TextUtils.isEmpty(strJ) ? d(aVar) : strJ;
    }

    private String f(io.bidmachine.media3.common.a aVar) {
        String str = aVar.f80550d;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Locale.forLanguageTag(str);
        Locale localeY = o0.Y();
        String displayName = localeForLanguageTag.getDisplayName(localeY);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(localeY) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String g(io.bidmachine.media3.common.a aVar) {
        int i10 = aVar.f80568v;
        int i11 = aVar.f80569w;
        return (i10 == -1 || i11 == -1) ? "" : this.f118901a.getString(R$string.f81511r, Integer.valueOf(i10), Integer.valueOf(i11));
    }

    private String h(io.bidmachine.media3.common.a aVar) {
        String string = (aVar.f80552f & 2) != 0 ? this.f118901a.getString(R$string.f81512s) : "";
        if ((aVar.f80552f & 4) != 0) {
            string = j(string, this.f118901a.getString(R$string.f81515v));
        }
        if ((aVar.f80552f & 8) != 0) {
            string = j(string, this.f118901a.getString(R$string.f81514u));
        }
        return (aVar.f80552f & 1088) != 0 ? j(string, this.f118901a.getString(R$string.f81513t)) : string;
    }

    private static int i(io.bidmachine.media3.common.a aVar) {
        int iK = w.k(aVar.f80561o);
        if (iK != -1) {
            return iK;
        }
        if (w.n(aVar.f80557k) != null) {
            return 2;
        }
        if (w.c(aVar.f80557k) != null) {
            return 1;
        }
        if (aVar.f80568v == -1 && aVar.f80569w == -1) {
            return (aVar.E == -1 && aVar.F == -1) ? -1 : 1;
        }
        return 2;
    }

    private String j(String... strArr) {
        String string = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string = TextUtils.isEmpty(string) ? str : this.f118901a.getString(R$string.f81508o, string, str);
            }
        }
        return string;
    }

    @Override // yb.l
    public String a(io.bidmachine.media3.common.a aVar) {
        int i10 = i(aVar);
        String strJ = i10 == 2 ? j(h(aVar), g(aVar), c(aVar)) : i10 == 1 ? j(e(aVar), b(aVar), c(aVar)) : e(aVar);
        if (strJ.length() != 0) {
            return strJ;
        }
        String str = aVar.f80550d;
        return (str == null || str.trim().isEmpty()) ? this.f118901a.getString(R$string.D) : this.f118901a.getString(R$string.E, str);
    }
}
