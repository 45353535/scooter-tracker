package io.sentry.util;

import io.sentry.ILogger;
import io.sentry.d2;
import io.sentry.g7;
import io.sentry.h1;
import java.io.BufferedWriter;
import java.io.ByteArrayOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Charset f84305a = Charset.forName("UTF-8");

    public static List a(AtomicIntegerArray atomicIntegerArray) {
        int length = atomicIntegerArray.length();
        ArrayList arrayList = new ArrayList(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
        }
        return arrayList;
    }

    public static byte[] b(h1 h1Var, ILogger iLogger, d2 d2Var) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(byteArrayOutputStream, f84305a));
                try {
                    h1Var.a(d2Var, bufferedWriter);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    bufferedWriter.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } finally {
                }
            } finally {
            }
        } catch (Throwable th2) {
            iLogger.a(g7.ERROR, "Could not serialize serializable", th2);
            return null;
        }
    }

    public static Map c(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
