package n2;

import android.text.method.PasswordTransformationMethod;
import android.util.Patterns;
import android.view.View;
import android.widget.TextView;
import kotlin.text.CharsKt;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes7.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f95099a = new d();

    private d() {
    }

    private final boolean a(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            String strReplace = new Regex("\\s").replace(f.k(textView), "");
            int length = strReplace.length();
            if (length >= 12 && length <= 19) {
                int i10 = 0;
                boolean z10 = false;
                for (int i11 = length - 1; -1 < i11; i11--) {
                    char cCharAt = strReplace.charAt(i11);
                    if (!Character.isDigit(cCharAt)) {
                        return false;
                    }
                    int iF = CharsKt.f(cCharAt);
                    if (z10 && (iF = iF * 2) > 9) {
                        iF = (iF % 10) + 1;
                    }
                    i10 += iF;
                    z10 = !z10;
                }
                if (i10 % 10 == 0) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean b(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 32) {
                return true;
            }
            String strK = f.k(textView);
            if (strK != null && strK.length() != 0) {
                return Patterns.EMAIL_ADDRESS.matcher(strK).matches();
            }
            return false;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean c(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            if (textView.getInputType() == 128) {
                return true;
            }
            return textView.getTransformationMethod() instanceof PasswordTransformationMethod;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean d(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 96;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean e(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 3;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    private final boolean f(TextView textView) {
        if (e3.a.d(this)) {
            return false;
        }
        try {
            return textView.getInputType() == 112;
        } catch (Throwable th2) {
            e3.a.b(th2, this);
            return false;
        }
    }

    public static final boolean g(View view) {
        if (e3.a.d(d.class)) {
            return false;
        }
        try {
            if (!(view instanceof TextView)) {
                return false;
            }
            d dVar = f95099a;
            if (dVar.c((TextView) view) || dVar.a((TextView) view) || dVar.d((TextView) view) || dVar.f((TextView) view) || dVar.e((TextView) view)) {
                return true;
            }
            return dVar.b((TextView) view);
        } catch (Throwable th2) {
            e3.a.b(th2, d.class);
            return false;
        }
    }
}
