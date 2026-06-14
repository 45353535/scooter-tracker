package yads;

import android.net.wifi.ScanResult;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class kb2 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return mf.a.d(Integer.valueOf(((ScanResult) obj2).level), Integer.valueOf(((ScanResult) obj).level));
    }
}
