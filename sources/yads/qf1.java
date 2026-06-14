package yads;

import android.location.Location;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class qf1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final lf1 f114983a = new lf1();

    public final Location a(List list) {
        Iterator it = list.iterator();
        Location location = null;
        while (it.hasNext()) {
            Location location2 = (Location) it.next();
            this.f114983a.getClass();
            if (location != null) {
                long time = location2.getTime() - location.getTime();
                long j10 = lf1.f113083a;
                boolean z10 = time > j10;
                boolean z11 = time < (-j10);
                boolean z12 = time > 0;
                int accuracy = (int) (location2.getAccuracy() - location.getAccuracy());
                boolean z13 = accuracy > 0;
                boolean z14 = accuracy < 0;
                boolean z15 = ((long) accuracy) > 200;
                boolean zAreEqual = Intrinsics.areEqual(location2.getProvider(), location.getProvider());
                if (!z10 && (z11 || (!z14 && ((!z12 || z13) && (!z12 || z15 || !zAreEqual))))) {
                }
            }
            location = location2;
        }
        return location;
    }
}
