package io.appmetrica.analytics.network.impl;

import j$.util.DesugarCollections;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes12.dex */
public abstract class e {
    public static byte[] a(int i10, Function0 function0) {
        try {
            InputStream inputStream = (InputStream) function0.invoke();
            if (inputStream != null) {
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            byte[] bArr = new byte[8192];
                            int i11 = 0;
                            while (true) {
                                int i12 = inputStream.read(bArr);
                                if (-1 == i12 || i11 > i10) {
                                    break;
                                }
                                if (i12 > 0) {
                                    byteArrayOutputStream.write(bArr, 0, i12);
                                    i11 += i12;
                                }
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            uf.c.a(byteArrayOutputStream, null);
                            uf.c.a(inputStream, null);
                            return byteArray;
                        } finally {
                        }
                    } catch (Throwable unused) {
                        Unit unit = Unit.f93236a;
                        uf.c.a(byteArrayOutputStream, null);
                        uf.c.a(inputStream, null);
                        return new byte[0];
                    }
                } finally {
                }
            }
        } catch (Throwable unused2) {
        }
        return new byte[0];
    }

    public static final Map a(Map map) {
        return DesugarCollections.unmodifiableMap(new HashMap(map));
    }
}
