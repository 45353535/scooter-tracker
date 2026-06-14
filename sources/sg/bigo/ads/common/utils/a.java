package sg.bigo.ads.common.utils;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.play.core.splitcompat.SplitCompat;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Context f102776a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f102777b = true;

    public static Drawable a(Context context, int i10) {
        if (context != null) {
            try {
                return d(context, i10);
            } catch (Exception unused) {
                a("Activity context getDrawable failed. the resId is " + Integer.toHexString(i10));
                try {
                    return d(b(context), i10);
                } catch (Exception unused2) {
                    a("Application context getDrawable failed. the resId is " + Integer.toHexString(i10));
                }
            }
        }
        return null;
    }

    public static int b(@NonNull Context context, int i10) {
        try {
            return e(context, i10);
        } catch (Exception unused) {
            a("Activity context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i10));
            try {
                return e(b(context), i10);
            } catch (Exception unused2) {
                a("Application context getDimensionPixelSize failed. the resId is " + Integer.toHexString(i10));
                return 0;
            }
        }
    }

    public static int c(@NonNull Context context, int i10) {
        try {
            return f(context, i10);
        } catch (Exception unused) {
            a("Activity context getColor failed. the resId is " + Integer.toHexString(i10));
            try {
                return f(b(context), i10);
            } catch (Exception unused2) {
                a("Application context getColor failed. the resId is " + Integer.toHexString(i10));
                return 0;
            }
        }
    }

    private static Drawable d(@NonNull Context context, @DrawableRes int i10) {
        try {
            return context.getResources().getDrawable(i10);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDrawable(i10);
        }
    }

    private static int e(@NonNull Context context, int i10) {
        try {
            return context.getResources().getDimensionPixelSize(i10);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getDimensionPixelSize(i10);
        }
    }

    private static int f(@NonNull Context context, int i10) {
        try {
            return context.getResources().getColor(i10);
        } catch (Exception unused) {
            c(context);
            return context.getResources().getColor(i10);
        }
    }

    public static View a(Context context, int i10, @Nullable ViewGroup viewGroup, boolean z10) {
        View viewB;
        if (context != null) {
            try {
                viewB = b(context, i10, viewGroup, z10);
            } catch (Exception unused) {
                a("Self context inflateView failed. the resId is " + Integer.toHexString(i10));
                viewB = null;
            }
        } else {
            viewB = null;
        }
        if (viewB != null) {
            return viewB;
        }
        try {
            return b(b(context), i10, viewGroup, z10);
        } catch (Exception unused2) {
            a("Application context inflateView failed. the resId is " + Integer.toHexString(i10));
            return viewB;
        }
    }

    private static Context b(@NonNull Context context) {
        a(context);
        Context context2 = f102776a;
        return context2 != null ? context2 : context.getApplicationContext();
    }

    private static void c(Context context) {
        try {
            SplitCompat.install(context);
        } catch (Throwable unused) {
            a("SplitCompact not found.");
        }
    }

    public static String a(@NonNull Context context, int i10, Locale locale) {
        CharSequence charSequenceB = b(context, i10, locale);
        if (charSequenceB != null) {
            return charSequenceB.toString();
        }
        return null;
    }

    private static View b(@NonNull Context context, int i10, ViewGroup viewGroup, boolean z10) {
        try {
            return LayoutInflater.from(context).inflate(i10, viewGroup, z10);
        } catch (Exception unused) {
            c(context);
            return LayoutInflater.from(context).inflate(i10, viewGroup, z10);
        }
    }

    public static String a(@NonNull Context context, int i10, Object... objArr) {
        try {
            return b(context, i10, objArr);
        } catch (Exception unused) {
            a("Activity context getString failed. the resId is " + Integer.toHexString(i10));
            try {
                return b(b(context), i10, objArr);
            } catch (Exception unused2) {
                a("Application context getString failed. the resId is " + Integer.toHexString(i10));
                return "";
            }
        }
    }

    public static CharSequence b(Context context, int i10, Locale locale) {
        Resources resources = context != null ? context.getResources() : null;
        if (resources == null) {
            return null;
        }
        Configuration configuration = new Configuration(resources.getConfiguration());
        configuration.setLocale(locale);
        return context.createConfigurationContext(configuration).getResources().getText(i10);
    }

    private static void a(Context context) {
        if (f102777b) {
            f102777b = false;
            try {
                Context applicationContext = context.getApplicationContext();
                f102776a = applicationContext.createPackageContext(applicationContext.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }

    private static String b(@NonNull Context context, int i10, Object... objArr) {
        if (objArr != null) {
            try {
                if (objArr.length > 0) {
                    return context.getString(i10, objArr);
                }
            } catch (Exception unused) {
                c(context);
                return (objArr == null || objArr.length <= 0) ? context.getString(i10) : context.getString(i10, objArr);
            }
        }
        return context.getString(i10);
    }

    private static void a(String str) {
        sg.bigo.ads.common.t.a.a(0, "BigoAAB", String.valueOf(str));
    }
}
