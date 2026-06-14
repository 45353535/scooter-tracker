package fe;

import java.util.TimeZone;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements c {
    @Override // fe.c
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    @Override // fe.c
    public String getTimeZoneId() {
        return TimeZone.getDefault().getID();
    }
}
