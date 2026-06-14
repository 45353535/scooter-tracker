package io.appmetrica.analytics.modulesapi.internal.common;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4240b4;
import java.util.Map;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0000\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H&J\u001c\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bH&J\"\u0010\t\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u0005H&J\u001a\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0005H&J&\u0010\t\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u00052\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000eH&¨\u0006\u000f"}, d2 = {"Lio/appmetrica/analytics/modulesapi/internal/common/ModuleSelfReporter;", "", "reportError", "", "identifier", "", PglCryptUtils.KEY_MESSAGE, "error", "", "reportEvent", "type", "", C4240b4.i.f42633j0, "eventValue", "", "modules-api_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public interface ModuleSelfReporter {

    @Metadata(k = 3, mv = {1, 6, 0}, xi = 48)
    public static final class DefaultImpls {
        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, Throwable th2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i10 & 2) != 0) {
                th2 = null;
            }
            moduleSelfReporter.reportError(str, th2);
        }

        public static /* synthetic */ void reportError$default(ModuleSelfReporter moduleSelfReporter, String str, String str2, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: reportError");
            }
            if ((i10 & 2) != 0) {
                str2 = null;
            }
            moduleSelfReporter.reportError(str, str2);
        }
    }

    void reportError(@NotNull String identifier, @Nullable String message);

    void reportError(@NotNull String message, @Nullable Throwable error);

    void reportEvent(int type, @NotNull String eventName, @Nullable String eventValue);

    void reportEvent(@NotNull String eventName);

    void reportEvent(@NotNull String eventName, @Nullable String eventValue);

    void reportEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> eventValue);
}
