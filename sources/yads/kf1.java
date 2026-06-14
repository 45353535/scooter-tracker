package yads;

import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class kf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final if1 f112700a = new if1();

    public final String a(Context context) {
        Object objB;
        String strA;
        try {
            Result.Companion companion = Result.f93230c;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService(CommonUrlParts.LOCALE);
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = com.google.android.gms.ads.internal.util.b.a(systemService).getApplicationLocales();
                if (applicationLocales.isEmpty()) {
                    Locale locale = context.getResources().getConfiguration().locale;
                    this.f112700a.getClass();
                    strA = if1.a(locale);
                } else {
                    if1 if1Var = this.f112700a;
                    Locale locale2 = applicationLocales.get(0);
                    if1Var.getClass();
                    strA = if1.a(locale2);
                }
            } else {
                Locale locale3 = context.getResources().getConfiguration().locale;
                this.f112700a.getClass();
                strA = if1.a(locale3);
            }
            objB = Result.b(strA);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (String) objB;
    }

    public final List b(Context context) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Build.VERSION.SDK_INT < 24) {
            if1 if1Var = this.f112700a;
            Locale locale = context.getResources().getConfiguration().locale;
            if1Var.getClass();
            objB = Result.b(CollectionsKt.listOf(if1.a(locale)));
            if (Result.i(objB)) {
                objB = null;
            }
            return (List) objB;
        }
        LocaleList locales = context.getResources().getConfiguration().getLocales();
        List listCreateListBuilder = CollectionsKt.createListBuilder();
        int size = locales.size();
        for (int i10 = 0; i10 < size; i10++) {
            if1 if1Var2 = this.f112700a;
            Locale locale2 = locales.get(i10);
            if1Var2.getClass();
            listCreateListBuilder.add(if1.a(locale2));
        }
        return CollectionsKt.build(listCreateListBuilder);
    }
}
