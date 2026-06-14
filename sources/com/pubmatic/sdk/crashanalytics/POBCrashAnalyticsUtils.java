package com.pubmatic.sdk.crashanalytics;

import android.content.Context;
import com.ironsource.V5;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import java.io.FileOutputStream;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import uf.i;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/pubmatic/sdk/crashanalytics/POBCrashAnalyticsUtils;", "", "<init>", "()V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", V5.c.f41892b, "readFromFile", "(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;", "crashData", "", "writeToFile", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "crashanalytics_release"}, k = 1, mv = {1, 7, 1})
public final class POBCrashAnalyticsUtils {

    @NotNull
    public static final POBCrashAnalyticsUtils INSTANCE = new POBCrashAnalyticsUtils();

    private POBCrashAnalyticsUtils() {
    }

    @Nullable
    public static final String readFromFile(@NotNull Context context, @NotNull String fileName) {
        Object objB;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        File file = new File(context.getFilesDir(), fileName);
        if (!file.exists()) {
            POBLog.debug("POBCrashAnalyticsUtils", fileName + " is not present in internal storage.", new Object[0]);
            return null;
        }
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(i.m(file, null, 1, null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        Throwable thG = Result.g(objB);
        if (thG != null) {
            POBLog.debug("POBCrashAnalyticsUtils", "Error reading " + fileName + ": " + thG.getMessage(), new Object[0]);
        }
        return (String) (Result.i(objB) ? null : objB);
    }

    public static final void writeToFile(@NotNull Context context, @NotNull String fileName, @NotNull String crashData) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(fileName, "fileName");
        Intrinsics.checkNotNullParameter(crashData, "crashData");
        try {
            FileOutputStream fileOutputStreamOpenFileOutput = context.openFileOutput(fileName, 0);
            try {
                byte[] bytes = crashData.getBytes(Charsets.UTF_8);
                Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
                fileOutputStreamOpenFileOutput.write(bytes);
                Unit unit = Unit.f93236a;
                uf.c.a(fileOutputStreamOpenFileOutput, null);
            } finally {
            }
        } catch (Exception e10) {
            POBLog.debug("POBCrashAnalyticsUtils", "Exception caught while writing crash data to " + fileName + ". Message -> " + e10.getMessage() + '.', new Object[0]);
        }
    }
}
