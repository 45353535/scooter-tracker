package jd;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes3.dex */
public abstract class l {
    public static Handler a() {
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return new Handler(looperMyLooper);
    }

    public static Integer b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(str));
        } catch (Exception unused) {
            return null;
        }
    }

    public static long c(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[1024];
        long j10 = 0;
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 <= 0) {
                return j10;
            }
            outputStream.write(bArr, 0, i10);
            j10 += (long) i10;
        }
    }
}
