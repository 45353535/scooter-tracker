package io.sentry;

import java.net.InetAddress;
import java.net.URI;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;

/* JADX INFO: loaded from: classes3.dex */
public final class a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c2 f82222a;

    public a2(int i10) {
        this.f82222a = new c2(i10);
    }

    private void b(n3 n3Var, ILogger iLogger, Collection collection) {
        n3Var.beginArray();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a(n3Var, iLogger, it.next());
        }
        n3Var.endArray();
    }

    private void c(n3 n3Var, ILogger iLogger, Date date) {
        try {
            n3Var.a(l.h(date));
        } catch (Exception e10) {
            iLogger.a(g7.ERROR, "Error when serializing Date", e10);
            n3Var.l();
        }
    }

    private void d(n3 n3Var, ILogger iLogger, Map map) {
        n3Var.beginObject();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                n3Var.e((String) obj);
                a(n3Var, iLogger, map.get(obj));
            }
        }
        n3Var.endObject();
    }

    private void e(n3 n3Var, ILogger iLogger, TimeZone timeZone) {
        try {
            n3Var.a(timeZone.getID());
        } catch (Exception e10) {
            iLogger.a(g7.ERROR, "Error when serializing TimeZone", e10);
            n3Var.l();
        }
    }

    public void a(n3 n3Var, ILogger iLogger, Object obj) {
        if (obj == null) {
            n3Var.l();
            return;
        }
        if (obj instanceof Character) {
            n3Var.a(Character.toString(((Character) obj).charValue()));
            return;
        }
        if (obj instanceof String) {
            n3Var.a((String) obj);
            return;
        }
        if (obj instanceof Boolean) {
            n3Var.d(((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof Number) {
            n3Var.i((Number) obj);
            return;
        }
        if (obj instanceof Date) {
            c(n3Var, iLogger, (Date) obj);
            return;
        }
        if (obj instanceof TimeZone) {
            e(n3Var, iLogger, (TimeZone) obj);
            return;
        }
        if (obj instanceof d2) {
            ((d2) obj).serialize(n3Var, iLogger);
            return;
        }
        if (obj instanceof Collection) {
            b(n3Var, iLogger, (Collection) obj);
            return;
        }
        if (obj.getClass().isArray()) {
            b(n3Var, iLogger, Arrays.asList((Object[]) obj));
            return;
        }
        if (obj instanceof Map) {
            d(n3Var, iLogger, (Map) obj);
            return;
        }
        if (obj instanceof Locale) {
            n3Var.a(obj.toString());
            return;
        }
        if (obj instanceof AtomicIntegerArray) {
            b(n3Var, iLogger, io.sentry.util.p.a((AtomicIntegerArray) obj));
            return;
        }
        if (obj instanceof AtomicBoolean) {
            n3Var.d(((AtomicBoolean) obj).get());
            return;
        }
        if (obj instanceof URI) {
            n3Var.a(obj.toString());
            return;
        }
        if (obj instanceof InetAddress) {
            n3Var.a(obj.toString());
            return;
        }
        if (obj instanceof UUID) {
            n3Var.a(obj.toString());
            return;
        }
        if (obj instanceof Currency) {
            n3Var.a(obj.toString());
            return;
        }
        if (obj instanceof Calendar) {
            d(n3Var, iLogger, io.sentry.util.p.c((Calendar) obj));
            return;
        }
        if (obj.getClass().isEnum()) {
            n3Var.a(obj.toString());
            return;
        }
        try {
            a(n3Var, iLogger, this.f82222a.d(obj, iLogger));
        } catch (Exception e10) {
            iLogger.a(g7.ERROR, "Failed serializing unknown object.", e10);
            n3Var.a("[OBJECT]");
        }
    }
}
