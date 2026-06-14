package com.startapp.sdk.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import java.util.LinkedHashSet;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes11.dex */
public final class dc extends k6 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dc(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.startapp.sdk.internal.k6
    public final Object a() {
        Locale locale;
        Configuration configuration;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Resources resources = this.f64817a.getResources();
        if (resources == null || (configuration = resources.getConfiguration()) == null) {
            locale = null;
        } else {
            locale = configuration.locale;
            if (Build.VERSION.SDK_INT >= 24) {
                LocaleList locales = configuration.getLocales();
                Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
                if (locales.size() > 0) {
                    int size = locales.size();
                    boolean z10 = true;
                    for (int i10 = 0; i10 < size; i10++) {
                        Locale locale2 = locales.get(i10);
                        if (locale2 != null) {
                            if (linkedHashSet.size() < 11) {
                                linkedHashSet.add(locale2);
                            }
                            if (z10) {
                                z10 = false;
                                locale = locale2;
                            }
                        }
                    }
                }
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Locale locale3 = Locale.getDefault(Locale.Category.DISPLAY);
            if (locale == null) {
                locale = locale3;
            }
            if (linkedHashSet.size() < 11) {
                Intrinsics.checkNotNull(locale3);
                linkedHashSet.add(locale3);
            }
        }
        Locale locale4 = Locale.getDefault();
        if (locale4 != null) {
            if (locale == null) {
                locale = locale4;
            }
            if (linkedHashSet.size() < 11) {
                linkedHashSet.add(locale4);
            }
        }
        if (locale == null) {
            locale = new Locale("en");
        }
        linkedHashSet.remove(locale);
        return new cc(locale, linkedHashSet);
    }

    @Override // com.startapp.sdk.internal.k6
    public final /* bridge */ /* synthetic */ Object c() {
        return cc.f64364d;
    }
}
