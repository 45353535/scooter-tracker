package sg.bigo.ads.core.d.b;

import androidx.annotation.NonNull;
import com.ironsource.C4240b4;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes4.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map<String, String> f104039a = new ConcurrentHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f104040b;

    public d(@NonNull String str) {
        this.f104040b = str;
    }

    public final void a(String str, int i10) {
        this.f104039a.put(str, String.valueOf(i10));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("eventId = ");
        sb2.append(this.f104040b);
        sb2.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
        for (Map.Entry<String, String> entry : this.f104039a.entrySet()) {
            sb2.append(entry.getKey());
            sb2.append(C4240b4.j.f42668b);
            sb2.append(entry.getValue());
            sb2.append(StringUtils.COMMA);
        }
        return sb2.toString();
    }

    public final void a(String str, long j10) {
        this.f104039a.put(str, String.valueOf(j10));
    }

    public final void a(String str, String str2) {
        if (q.a((CharSequence) str) || q.a((CharSequence) str2)) {
            return;
        }
        this.f104039a.put(str, str2);
    }

    public final void a(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (entry.getKey() != null && entry.getValue() != null) {
                this.f104039a.put(entry.getKey(), entry.getValue());
            }
        }
    }
}
