package yads;

import android.webkit.WebView;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class el3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xg2 f110419a;

    public el3(xg2 xg2Var) {
        this.f110419a = xg2Var;
    }

    public final void a() {
        String strA = this.f110419a.a();
        String strF1 = strA != null ? StringsKt.f1(strA, StringUtils.PROCESS_POSTFIX_DELIMITER, "") : null;
        if (strF1 == null || strF1.length() <= 0) {
            return;
        }
        try {
            WebView.setDataDirectorySuffix(strF1);
        } catch (Throwable unused) {
        }
    }
}
