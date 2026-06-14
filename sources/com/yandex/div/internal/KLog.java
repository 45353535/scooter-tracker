package com.yandex.div.internal;

import androidx.privacysandbox.ads.adservices.topics.a;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.taurusx.tax.y.z.w.s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.yandex.div.logging.Severity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/yandex/div/internal/KLog;", "", "<init>", "()V", "Lcom/yandex/div/logging/Severity;", "minLevel", "", "isAtLeast", "(Lcom/yandex/div/logging/Severity;)Z", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "", s.z.f67720z, PglCryptUtils.KEY_MESSAGE, "", "print", "(ILjava/lang/String;Ljava/lang/String;)V", "", "listeners", "Ljava/util/List;", "getListeners", "()Ljava/util/List;", "logging_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class KLog {

    @NotNull
    public static final KLog INSTANCE = new KLog();

    @NotNull
    private static final List<Object> listeners = new ArrayList();

    private KLog() {
    }

    public final boolean isAtLeast(@NotNull Severity minLevel) {
        return Log.isAtLeast(minLevel);
    }

    public final void print(int priority, @NotNull String tag, @NotNull String message) {
        android.util.Log.println(priority, tag, message);
        List<Object> list = listeners;
        synchronized (list) {
            Iterator<T> it = list.iterator();
            if (it.hasNext()) {
                a.a(it.next());
                throw null;
            }
            Unit unit = Unit.f93236a;
        }
    }
}
