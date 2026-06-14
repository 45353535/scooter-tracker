package yads;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class dc2 extends Exception implements oq {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f109878b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f109879c;

    static {
        new nq() { // from class: yads.b6
            @Override // yads.nq
            public final oq fromBundle(Bundle bundle) {
                return new dc2(bundle);
            }
        };
    }

    public dc2(Bundle bundle) {
        this(bundle.getString(a(2)), a(bundle), bundle.getInt(a(0), 1000), bundle.getLong(a(1), SystemClock.elapsedRealtime()));
    }

    public static Throwable a(Bundle bundle) {
        String string = bundle.getString(Integer.toString(3, 36));
        String string2 = bundle.getString(Integer.toString(4, 36));
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            Class<?> cls = Class.forName(string, true, dc2.class.getClassLoader());
            Throwable th2 = Throwable.class.isAssignableFrom(cls) ? (Throwable) cls.getConstructor(String.class).newInstance(string2) : null;
            return th2 == null ? new RemoteException(string2) : th2;
        } catch (Throwable unused) {
            return new RemoteException(string2);
        }
    }

    public dc2(String str, Throwable th2, int i10, long j10) {
        super(str, th2);
        this.f109878b = i10;
        this.f109879c = j10;
    }

    public static String a(int i10) {
        return Integer.toString(i10, 36);
    }
}
