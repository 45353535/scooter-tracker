package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import com.startapp.simple.bloomfilter.codec.IOUtils;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kotlin.Metadata;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H\u0007¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/coreutils/internal/network/UserAgent;", "", "", "sdkName", "versionName", "buildNumber", "getFor", "core-utils_release"}, k = 1, mv = {1, 6, 0})
public final class UserAgent {

    @NotNull
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    @NotNull
    public static final String getFor(@NotNull String sdkName, @NotNull String versionName, @NotNull String buildNumber) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(sdkName);
        sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
        sb2.append(versionName);
        sb2.append('.');
        sb2.append(buildNumber);
        sb2.append(" (");
        INSTANCE.getClass();
        String str = Build.MODEL;
        String str2 = Build.MANUFACTURER;
        if (!StringsKt.a0(str, str2, false, 2, null)) {
            str = str2 + ' ' + str;
        }
        sb2.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str));
        sb2.append("; Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(')');
        return sb2.toString();
    }
}
