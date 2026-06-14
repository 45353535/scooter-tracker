package x4;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.format.DateFormat;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.ForegroundColorSpan;
import androidx.core.content.ContextCompat;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.ktwapps.speedometer.R;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l {
    public static BitmapDescriptor a(Context context, int i10) {
        Drawable drawable = ContextCompat.getDrawable(context, i10);
        if (drawable == null) {
            return null;
        }
        drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        drawable.draw(new Canvas(bitmapCreateBitmap));
        try {
            return BitmapDescriptorFactory.fromBitmap(bitmapCreateBitmap);
        } catch (Exception unused) {
            return null;
        }
    }

    public static String b(Context context, v4.b bVar) {
        return context.getResources().getString(R.string.duration) + ": " + j(bVar.c()) + IOUtils.LINE_SEPARATOR_UNIX + context.getResources().getString(R.string.distance) + ": " + i(context, bVar.b()) + IOUtils.LINE_SEPARATOR_UNIX + context.getResources().getString(R.string.maximum) + ": " + o(context, bVar.g()) + IOUtils.LINE_SEPARATOR_UNIX + context.getResources().getString(R.string.average) + ": " + o(context, bVar.a()) + IOUtils.LINE_SEPARATOR_UNIX + context.getResources().getString(R.string.from) + ": " + bVar.i() + IOUtils.LINE_SEPARATOR_UNIX + context.getResources().getString(R.string.to) + ": " + bVar.d() + IOUtils.LINE_SEPARATOR_UNIX;
    }

    public static int c(int i10, int i11) {
        return i10 < 15 ? R.drawable.ic_hud_battery_10 : i10 < 25 ? R.drawable.ic_hud_battery_20 : i10 < 40 ? R.drawable.ic_hud_battery_35 : i10 < 60 ? R.drawable.ic_hud_battery_50 : i10 < 75 ? R.drawable.ic_hud_battery_65 : i10 < 85 ? R.drawable.ic_hud_battery_80 : i10 < 95 ? R.drawable.ic_hud_battery_90 : R.drawable.ic_hud_battery_100;
    }

    private static String d(int i10) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i10 < 10 ? "0" : "");
        sb2.append(i10);
        return sb2.toString();
    }

    private static float e(int i10, float f10) {
        double d10;
        double d11;
        double d12;
        if (i10 == 1) {
            return f10 * 1000.0f;
        }
        if (i10 == 3) {
            d10 = f10;
            d11 = 3280.84d;
        } else {
            if (i10 != 4) {
                if (i10 != 5) {
                    return f10;
                }
                d12 = ((double) f10) / 1.60934d;
                return (float) d12;
            }
            d10 = f10;
            d11 = 1093.61d;
        }
        d12 = d10 * d11;
        return (float) d12;
    }

    public static String f(Context context, int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? context.getResources().getString(R.string.mile) : context.getResources().getString(R.string.yard) : context.getResources().getString(R.string.foot) : context.getResources().getString(R.string.kilometer) : context.getResources().getString(R.string.meter);
    }

    public static String g(Context context) {
        return String.format(Locale.getDefault(), "%.0f", Double.valueOf(Math.floor(e(x.n(context), x.m(context)))));
    }

    public static String h(long j10) {
        Date date = new Date();
        date.setTime(j10);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), "yyyy MMM dd"), Locale.getDefault()).format(date);
    }

    public static String i(Context context, float f10) {
        int iV = x.v(context);
        float fE = e(iV, f10);
        if (iV == 1) {
            return ((int) fE) + " " + context.getResources().getString(R.string.m);
        }
        if (iV == 3) {
            return ((int) fE) + " " + context.getResources().getString(R.string.ft);
        }
        if (iV == 4) {
            return ((int) fE) + " " + context.getResources().getString(R.string.yd);
        }
        if (iV != 5) {
            return new DecimalFormat("##.##").format(fE) + " " + context.getResources().getString(R.string.km);
        }
        return new DecimalFormat("##.##").format(fE) + " " + context.getResources().getString(R.string.mi);
    }

    public static String j(long j10) {
        int i10 = (int) (j10 / 1000);
        int i11 = i10 / 60;
        return d(i11 / 60) + StringUtils.PROCESS_POSTFIX_DELIMITER + d(i11 % 60) + StringUtils.PROCESS_POSTFIX_DELIMITER + d(i10 % 60);
    }

    public static String k(Context context) {
        return x.n(context) == 5 ? context.getResources().getString(R.string.mi) : context.getResources().getString(R.string.km);
    }

    public static String l(Context context) {
        int iP = x.p(context);
        return iP != 1 ? iP != 2 ? iP != 3 ? iP != 4 ? context.getString(R.string.setting_sound_off) : context.getString(R.string.setting_sound_4) : context.getString(R.string.setting_sound_3) : context.getString(R.string.setting_sound_2) : context.getString(R.string.setting_sound_1);
    }

    public static CharSequence m(Context context, float f10) {
        String strValueOf;
        String string;
        int iV = x.v(context);
        float fE = e(iV, f10);
        if (iV == 1) {
            strValueOf = String.valueOf((int) fE);
            string = context.getString(R.string.m);
        } else if (iV == 3) {
            strValueOf = String.valueOf((int) fE);
            string = context.getString(R.string.ft);
        } else if (iV == 4) {
            strValueOf = String.valueOf((int) fE);
            string = context.getString(R.string.yd);
        } else if (iV != 5) {
            strValueOf = new DecimalFormat("##.##").format(fE);
            string = context.getString(R.string.km);
        } else {
            strValueOf = new DecimalFormat("##.##").format(fE);
            string = context.getString(R.string.mi);
        }
        String str = strValueOf + " " + string;
        SpannableString spannableString = new SpannableString(str);
        int color = ContextCompat.getColor(context, R.color.colorSecondaryText);
        int dimension = (int) context.getResources().getDimension(R.dimen.history_large_text);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.history_small_text);
        spannableString.setSpan(new AbsoluteSizeSpan(dimension), 0, strValueOf.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(dimension2), strValueOf.length(), str.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(color), strValueOf.length(), str.length(), 33);
        return spannableString;
    }

    public static CharSequence n(Context context, float f10) {
        int iU = x.u(context);
        String strValueOf = String.valueOf(y(iU, f10));
        String str = strValueOf + " " + z(context, iU);
        SpannableString spannableString = new SpannableString(str);
        int color = ContextCompat.getColor(context, R.color.colorSecondaryText);
        int dimension = (int) context.getResources().getDimension(R.dimen.history_large_text);
        int dimension2 = (int) context.getResources().getDimension(R.dimen.history_small_text);
        spannableString.setSpan(new AbsoluteSizeSpan(dimension), 0, strValueOf.length(), 33);
        spannableString.setSpan(new AbsoluteSizeSpan(dimension2), strValueOf.length(), str.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(color), strValueOf.length(), str.length(), 33);
        return spannableString;
    }

    public static String o(Context context, float f10) {
        int iU = x.u(context);
        return y(iU, f10) + " " + z(context, iU);
    }

    public static String p(Context context) {
        int iS = x.s(context);
        if (iS == 0) {
            return context.getResources().getString(R.string.none);
        }
        return iS + " " + z(context, x.u(context));
    }

    public static String q(Context context, long j10) {
        Date date = new Date();
        date.setTime(j10);
        return new SimpleDateFormat(DateFormat.getBestDateTimePattern(Locale.getDefault(), DateFormat.is24HourFormat(context) ? "kk:mm" : "hh:mm aa"), Locale.getDefault()).format(date);
    }

    public static int r(int i10) {
        return i10 != 1 ? i10 != 2 ? i10 != 3 ? R.drawable.ic_gps_none : R.drawable.ic_gps_good : R.drawable.ic_gps_fair : R.drawable.ic_gps_bad;
    }

    public static String s(Context context) {
        StringBuilder sb2 = new StringBuilder(String.format(Locale.getDefault(), "%.1f", Float.valueOf(e(x.n(context), x.m(context)))));
        while (sb2.length() < 8) {
            sb2.insert(0, "0");
        }
        return sb2.toString();
    }

    public static String t(Context context, int i10) {
        return i10 == 2 ? context.getResources().getString(R.string.kilometer) : context.getResources().getString(R.string.mile);
    }

    public static String u(int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? "0 - 40" : "0 - 320" : "0 - 240" : "0 - 160" : "0 - 120" : "0 - 80";
    }

    public static int v(int i10, boolean z10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? i10 != 6 ? R.drawable.ic_speedometer_default_40 : R.drawable.ic_speedometer_default_320 : R.drawable.ic_speedometer_default_240 : R.drawable.ic_speedometer_default_160 : R.drawable.ic_speedometer_default_120 : R.drawable.ic_speedometer_default_80;
    }

    public static float w(int i10, float f10, int i11) {
        float fX = x(i10, f10);
        if (i11 == 1) {
            if (fX >= 40.0f) {
                return 240.0f;
            }
            return fX * 6.0f;
        }
        if (i11 == 2) {
            if (fX >= 80.0f) {
                return 240.0f;
            }
            return fX * 3.0f;
        }
        if (i11 == 3) {
            if (fX >= 120.0f) {
                return 240.0f;
            }
            return fX * 2.0f;
        }
        if (i11 == 4) {
            if (fX >= 160.0f) {
                return 240.0f;
            }
            return (float) (((double) fX) * 1.5d);
        }
        if (i11 == 5) {
            if (fX >= 240.0f) {
                return 240.0f;
            }
            return fX;
        }
        if (fX >= 320.0f) {
            return 240.0f;
        }
        return (float) (((double) fX) * 0.75d);
    }

    private static float x(int i10, float f10) {
        double d10;
        double d11;
        if (i10 == 2) {
            d10 = f10;
            d11 = 3.6d;
        } else if (i10 == 3) {
            d10 = f10;
            d11 = 2.2369d;
        } else {
            if (i10 != 4) {
                return f10;
            }
            d10 = f10;
            d11 = 1.944d;
        }
        return (float) (d10 * d11);
    }

    public static int y(int i10, float f10) {
        double d10;
        double d11;
        if (i10 == 2) {
            d10 = f10;
            d11 = 3.6d;
        } else if (i10 == 3) {
            d10 = f10;
            d11 = 2.2369d;
        } else {
            if (i10 != 4) {
                return (int) f10;
            }
            d10 = f10;
            d11 = 1.944d;
        }
        return (int) (d10 * d11);
    }

    public static String z(Context context, int i10) {
        return i10 != 2 ? i10 != 3 ? i10 != 4 ? context.getResources().getString(R.string.ms) : context.getResources().getString(R.string.knots) : context.getResources().getString(R.string.mph) : context.getResources().getString(R.string.kmh);
    }
}
