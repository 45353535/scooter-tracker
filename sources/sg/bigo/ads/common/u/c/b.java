package sg.bigo.ads.common.u.c;

import androidx.annotation.Nullable;
import androidx.webkit.ProxyConfig;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f102761a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f102762b = -1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102763c;

    private b() {
    }

    @Nullable
    public static b a(String str) {
        b bVar = null;
        if (q.a((CharSequence) str)) {
            return null;
        }
        int iIndexOf = str.indexOf(" ");
        int iIndexOf2 = str.indexOf(TokenBuilder.TOKEN_DELIMITER);
        int iIndexOf3 = str.indexOf("/");
        if (iIndexOf >= 0 && iIndexOf3 >= 0 && iIndexOf < iIndexOf3) {
            bVar = new b();
            if (iIndexOf2 > iIndexOf && iIndexOf2 < iIndexOf3) {
                try {
                    bVar.f102761a = Long.parseLong(str.substring(iIndexOf + 1, iIndexOf2));
                    bVar.f102763c = Long.parseLong(str.substring(iIndexOf2 + 1, iIndexOf3));
                } catch (Exception unused) {
                }
            }
            String strSubstring = str.substring(iIndexOf3 + 1);
            if (!ProxyConfig.MATCH_ALL_SCHEMES.equals(strSubstring)) {
                bVar.f102762b = Long.parseLong(strSubstring);
            }
        }
        return bVar;
    }
}
