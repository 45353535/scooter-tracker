package sg.bigo.ads.a.a;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f100080a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static a f100081b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f100082a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        public final String f100083b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        public final String f100084c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public final String f100085d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public final String f100086e;

        public a(boolean z10, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.f100082a = z10;
            this.f100086e = str;
            this.f100085d = str2;
            this.f100084c = str3;
            this.f100083b = str4;
        }
    }

    @NonNull
    public static a a(Context context) {
        String string;
        String str;
        String str2;
        PackageInfo packageInfo;
        String strSubstring;
        String str3;
        String strValueOf;
        int iIndexOf;
        a aVar = f100081b;
        if (aVar != null) {
            return aVar;
        }
        boolean z10 = false;
        ResolveInfo resolveInfoResolveActivity = context.getPackageManager().resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse("http://www.example.com")), 0);
        String strConcat = null;
        String str4 = resolveInfoResolveActivity != null ? resolveInfoResolveActivity.activityInfo.packageName : null;
        try {
            packageInfo = context.getPackageManager().getPackageInfo("com.android.chrome", 0);
        } catch (PackageManager.NameNotFoundException e10) {
            e = e10;
        } catch (Exception e11) {
            e = e11;
        }
        if (packageInfo == null || !"com.android.chrome".equals(packageInfo.packageName)) {
            string = "No chrome pkg";
            str = string;
            str2 = strConcat;
            a aVar2 = new a(z10, f100080a, str2, str4, str);
            f100081b = aVar2;
            return aVar2;
        }
        f100080a = "com.android.chrome";
        String str5 = packageInfo.versionName;
        try {
            strSubstring = (TextUtils.isEmpty(str5) || (iIndexOf = str5.indexOf(".")) < 0) ? null : str5.substring(0, iIndexOf);
        } catch (PackageManager.NameNotFoundException e12) {
            e = e12;
            strConcat = str5;
            string = e.toString();
            str = string;
            str2 = strConcat;
        } catch (Exception e13) {
            e = e13;
            strConcat = str5;
            string = e.toString();
            str = string;
            str2 = strConcat;
        }
        if (TextUtils.isEmpty(strSubstring)) {
            str3 = "Invalid chrome version: ";
            strValueOf = String.valueOf(str5);
        } else {
            if (Integer.parseInt(strSubstring) >= 45) {
                z10 = true;
                str2 = str5;
                str = strConcat;
                a aVar22 = new a(z10, f100080a, str2, str4, str);
                f100081b = aVar22;
                return aVar22;
            }
            str3 = "Chrome version is low: ";
            strValueOf = String.valueOf(str5);
        }
        strConcat = str3.concat(strValueOf);
        str2 = str5;
        str = strConcat;
        a aVar222 = new a(z10, f100080a, str2, str4, str);
        f100081b = aVar222;
        return aVar222;
        string = e.toString();
        str = string;
        str2 = strConcat;
        a aVar2222 = new a(z10, f100080a, str2, str4, str);
        f100081b = aVar2222;
        return aVar2222;
    }
}
