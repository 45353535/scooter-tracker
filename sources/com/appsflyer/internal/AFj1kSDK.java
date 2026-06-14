package com.appsflyer.internal;

import android.content.Intent;
import android.os.Parcelable;
import com.appsflyer.AFLogger;
import java.util.ConcurrentModificationException;
import kotlin.Result;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v0;
import kotlin.reflect.KClass;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
public final class AFj1kSDK {

    @NotNull
    final Intent getCurrencyIso4217Code;

    public AFj1kSDK(@NotNull Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "");
        this.getCurrencyIso4217Code = intent;
    }

    private final <T> T AFAdRevenueData(Function0<? extends T> function0, String str, T t10, boolean z10) {
        Object objB;
        Object objB2;
        Object objAFAdRevenueData;
        synchronized (this.getCurrencyIso4217Code) {
            try {
                Result.Companion companion = Result.f93230c;
                objB = Result.b(function0.invoke());
            } finally {
            }
            KClass[] kClassArr = {v0.b(ConcurrentModificationException.class), v0.b(ArrayIndexOutOfBoundsException.class)};
            Throwable thG = Result.g(objB);
            if (thG != null) {
                try {
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB2 = Result.b(kotlin.d.a(th2));
                }
                if (!ArraysKt.contains(kClassArr, v0.b(thG.getClass()))) {
                    throw thG;
                }
                if (z10) {
                    objAFAdRevenueData = AFAdRevenueData(function0, str, t10, false);
                } else {
                    AFLogger.afErrorLog(str, thG, false, false);
                    objAFAdRevenueData = t10;
                }
                objB2 = Result.b(objAFAdRevenueData);
                objB = objB2;
            }
            Throwable thG2 = Result.g(objB);
            if (thG2 == null) {
                t10 = (T) objB;
            } else {
                AFLogger.afErrorLog(str, thG2, false, false);
            }
        }
        return t10;
    }

    @Nullable
    public final <T extends Parcelable> T H_(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (T) AFAdRevenueData(new Function0<T>() { // from class: com.appsflyer.internal.AFj1kSDK.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Incorrect return type in method signature: ()TT; */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: J_, reason: merged with bridge method [inline-methods] */
            public final Parcelable invoke() {
                return AFj1kSDK.this.getCurrencyIso4217Code.getParcelableExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    @Nullable
    public final Intent I_(@NotNull final String str, final long j10) {
        Intrinsics.checkNotNullParameter(str, "");
        return (Intent) AFAdRevenueData(new Function0<Intent>() { // from class: com.appsflyer.internal.AFj1kSDK.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: K_, reason: merged with bridge method [inline-methods] */
            public final Intent invoke() {
                return AFj1kSDK.this.getCurrencyIso4217Code.putExtra(str, j10);
            }
        }, "Error while trying to write " + str + " extra to intent", null, true);
    }

    @Nullable
    public final String getCurrencyIso4217Code(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        return (String) AFAdRevenueData(new Function0<String>() { // from class: com.appsflyer.internal.AFj1kSDK.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @Nullable
            /* JADX INFO: renamed from: getMediationNetwork, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return AFj1kSDK.this.getCurrencyIso4217Code.getStringExtra(str);
            }
        }, "Error while trying to read " + str + " extra from intent", null, true);
    }

    public final boolean getRevenue(@NotNull final String str) {
        Intrinsics.checkNotNullParameter(str, "");
        Boolean bool = (Boolean) AFAdRevenueData(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFj1kSDK.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: getMonetizationNetwork, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(AFj1kSDK.this.getCurrencyIso4217Code.hasExtra(str));
            }
        }, "Error while trying to check presence of " + str + " extra from intent", Boolean.TRUE, true);
        if (bool != null) {
            return bool.booleanValue();
        }
        return true;
    }
}
