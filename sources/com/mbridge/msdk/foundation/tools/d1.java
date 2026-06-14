package com.mbridge.msdk.foundation.tools;

import com.google.common.base.Ascii;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.SecureRandom;

/* JADX INFO: loaded from: classes10.dex */
class d1 {

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final char[] f48961a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final SecureRandom f48962b = new SecureRandom();
    }

    static int a(int[] iArr, int i10) {
        int length = (iArr.length >> 1) - 1;
        int i11 = 0;
        while (i11 <= length) {
            int i12 = (i11 + length) >>> 1;
            int i13 = iArr[i12 << 1];
            if (i13 < i10) {
                i11 = i12 + 1;
            } else {
                if (i13 <= i10) {
                    return i12;
                }
                length = i12 - 1;
            }
        }
        return length;
    }

    private static void b(File file) {
        File[] fileArrListFiles;
        if (file.isDirectory() && (fileArrListFiles = file.listFiles()) != null) {
            for (File file2 : fileArrListFiles) {
                b(file2);
            }
        }
        file.delete();
    }

    static byte[] c(File file) throws IOException {
        if (!file.isFile()) {
            return null;
        }
        long length = file.length();
        if ((length >> 32) == 0) {
            int i10 = (int) length;
            byte[] bArr = new byte[i10];
            a(file, bArr, i10);
            return bArr;
        }
        throw new IllegalArgumentException("file too large, path:" + file.getPath());
    }

    static boolean d(File file) throws IOException {
        if (file.isFile()) {
            return true;
        }
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            return (parentFile.isDirectory() || parentFile.mkdirs()) && file.createNewFile();
        }
        return false;
    }

    static void a(File file) {
        try {
            if (file.exists()) {
                b(file);
            }
        } catch (Exception unused) {
        }
    }

    static void a(File file, byte[] bArr, int i10) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        int i11 = 0;
        while (i11 < i10) {
            try {
                int i12 = randomAccessFile.read(bArr, i11, i10 - i11);
                if (i12 < 0) {
                    break;
                } else {
                    i11 += i12;
                }
            } finally {
                a(randomAccessFile);
            }
        }
    }

    static String b() {
        byte[] bArr = new byte[16];
        a.f48962b.nextBytes(bArr);
        char[] cArr = new char[32];
        for (int i10 = 0; i10 < 16; i10++) {
            byte b10 = bArr[i10];
            int i11 = i10 << 1;
            char[] cArr2 = a.f48961a;
            cArr[i11] = cArr2[(b10 >> 4) & 15];
            cArr[i11 + 1] = cArr2[b10 & Ascii.SI];
        }
        return new String(cArr);
    }

    static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception unused) {
            }
        }
    }

    static int a() {
        try {
            Class<?> cls = Class.forName("sun.misc.Unsafe");
            Field declaredField = cls.getDeclaredField("theUnsafe");
            declaredField.setAccessible(true);
            Method declaredMethod = cls.getDeclaredMethod("pageSize", null);
            declaredMethod.setAccessible(true);
            return ((Integer) declaredMethod.invoke(declaredField.get(null), null)).intValue();
        } catch (Throwable unused) {
            return 4096;
        }
    }

    static boolean a(File file, byte[] bArr) {
        try {
            File file2 = new File(file.getParent(), file.getName() + ".tmp");
            if (!d(file2)) {
                return false;
            }
            RandomAccessFile randomAccessFile = new RandomAccessFile(file2, "rw");
            try {
                randomAccessFile.setLength(bArr.length);
                randomAccessFile.write(bArr);
                a(randomAccessFile);
                if (!file.exists() || file.delete()) {
                    return file2.renameTo(file);
                }
            } catch (Throwable th2) {
                a(randomAccessFile);
                throw th2;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
