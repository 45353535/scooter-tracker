package f1;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public abstract class xe {
    public static final h3 a(String adType, String location, b1.e eVar, ag eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        return new v3(adType, location, eVar, eventTracker);
    }

    public static final ag b() {
        return rd.f70996b.b().a();
    }
}
