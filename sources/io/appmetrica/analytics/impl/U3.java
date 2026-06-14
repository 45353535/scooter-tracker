package io.appmetrica.analytics.impl;

import android.util.Base64;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes12.dex */
public final class U3 extends W5 {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public HashMap f76547q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C4973an f76548r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Ym f76549s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Ym f76550t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public C5134h3 f76551u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public C4973an f76552v;

    @VisibleForTesting
    public U3(@NonNull PublicLogger publicLogger) {
        this.f76547q = new HashMap();
        a(publicLogger);
    }

    public static W5 b(String str, String str2) {
        W5 w52 = new W5("", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = 5376;
        w52.a(str, str2);
        return w52;
    }

    public static W5 n() {
        W5 w52 = new W5("", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = 5632;
        return w52;
    }

    public static W5 o() {
        W5 w52 = new W5("", 0);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        w52.f76617d = 40961;
        return w52;
    }

    public final void a(String str, String str2, T3 t32) {
        if (StringUtils.equalsNullSafety(str, str2)) {
            this.f76547q.remove(t32);
        } else {
            this.f76547q.put(t32, Integer.valueOf(StringUtils.getUTF8Bytes(str).length - StringUtils.getUTF8Bytes(str2).length));
        }
        Iterator it = this.f76547q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f76620g = iIntValue;
    }

    @Override // io.appmetrica.analytics.impl.W5
    @NonNull
    public final void c(@Nullable String str) {
        C4973an c4973an = this.f76552v;
        c4973an.getClass();
        this.f76621h = c4973an.a(str);
    }

    public final String d(String str) {
        C4973an c4973an = this.f76548r;
        c4973an.getClass();
        String strA = c4973an.a(str);
        a(str, strA, T3.NAME);
        return strA;
    }

    public final String e(String str) {
        Ym ym = this.f76549s;
        ym.getClass();
        String strA = ym.a(str);
        a(str, strA, T3.VALUE);
        return strA;
    }

    public final U3 f(@NonNull String str) {
        Ym ym = this.f76550t;
        ym.getClass();
        String strA = ym.a(str);
        a(str, strA, T3.VALUE);
        this.f76615b = strA;
        return this;
    }

    @NonNull
    public final HashMap<T3, Integer> p() {
        return this.f76547q;
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setName(@Nullable String str) {
        this.f76614a = d(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    public final void setValue(@Nullable String str) {
        this.f76615b = e(str);
    }

    @Override // io.appmetrica.analytics.impl.W5, io.appmetrica.analytics.coreapi.internal.event.CounterReportApi
    @Nullable
    public final void setValueBytes(@Nullable byte[] bArr) {
        a(bArr);
    }

    public U3(String str, int i10, @NonNull PublicLogger publicLogger) {
        this("", str, i10, publicLogger);
    }

    public U3(String str, String str2, int i10, @NonNull PublicLogger publicLogger) {
        this(str, str2, i10, 0, publicLogger);
    }

    public U3(String str, String str2, int i10, int i11, @NonNull PublicLogger publicLogger) {
        this.f76547q = new HashMap();
        a(publicLogger);
        this.f76615b = e(str);
        this.f76614a = d(str2);
        setType(i10);
        setCustomType(i11);
    }

    public final U3 a(@NonNull HashMap<T3, Integer> map) {
        this.f76547q = map;
        return this;
    }

    public final void a(PublicLogger publicLogger) {
        this.f76548r = new C4973an(1000, "event name", publicLogger);
        this.f76549s = new Ym(245760, "event value", publicLogger);
        this.f76550t = new Ym(1024000, "event extended value", publicLogger);
        this.f76551u = new C5134h3(245760, "event value bytes", publicLogger);
        this.f76552v = new C4973an(200, "user profile id", publicLogger);
    }

    public U3(byte[] bArr, @Nullable String str, int i10, @NonNull PublicLogger publicLogger) {
        this.f76547q = new HashMap();
        a(publicLogger);
        a(bArr);
        this.f76614a = d(str);
        setType(i10);
    }

    public final void a(byte[] bArr) {
        C5134h3 c5134h3 = this.f76551u;
        c5134h3.getClass();
        byte[] bArrA = c5134h3.a(bArr);
        T3 t32 = T3.VALUE;
        if (bArr.length != bArrA.length) {
            this.f76547q.put(t32, Integer.valueOf(bArr.length - bArrA.length));
        } else {
            this.f76547q.remove(t32);
        }
        Iterator it = this.f76547q.values().iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Integer) it.next()).intValue();
        }
        this.f76620g = iIntValue;
        super.setValueBytes(bArrA);
    }

    public static W5 a(@NonNull C5232ko c5232ko) {
        W5 w5O = o();
        w5O.setValue(new String(Base64.encode(MessageNano.toByteArray(c5232ko), 0)));
        return w5O;
    }

    public static U3 a(PublicLogger publicLogger, Ti ti) {
        int length;
        U3 u32 = new U3(publicLogger);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        u32.f76617d = 40976;
        Ri ri = new Ri();
        ri.f76364b = ti.f76514a.currency.getCurrencyCode().getBytes();
        ri.f76368f = ti.f76514a.priceMicros;
        ri.f76365c = StringUtils.stringToBytesForProtobuf(new C4973an(200, "revenue productID", ti.f76518e).a(ti.f76514a.productID));
        ri.f76363a = ((Integer) WrapUtils.getOrDefault(ti.f76514a.quantity, 1)).intValue();
        Ym ym = ti.f76515b;
        String str = ti.f76514a.payload;
        ym.getClass();
        ri.f76366d = StringUtils.stringToBytesForProtobuf(ym.a(str));
        if (no.a(ti.f76514a.receipt)) {
            Mi mi = new Mi();
            String str2 = (String) ti.f76516c.a(ti.f76514a.receipt.data);
            length = !StringUtils.equalsNullSafety(ti.f76514a.receipt.data, str2) ? ti.f76514a.receipt.data.length() : 0;
            String str3 = (String) ti.f76517d.a(ti.f76514a.receipt.signature);
            mi.f76139a = StringUtils.stringToBytesForProtobuf(str2);
            mi.f76140b = StringUtils.stringToBytesForProtobuf(str3);
            ri.f76367e = mi;
        } else {
            length = 0;
        }
        Pair pair = new Pair(MessageNano.toByteArray(ri), Integer.valueOf(length));
        u32.f76615b = u32.e(new String(Base64.encode((byte[]) pair.first, 0)));
        u32.f76620g = ((Integer) pair.second).intValue();
        return u32;
    }

    public static U3 a(PublicLogger publicLogger, E e10) {
        U3 u32 = new U3(publicLogger);
        EnumC5168ib enumC5168ib = EnumC5168ib.EVENT_TYPE_UNDEFINED;
        u32.f76617d = 40977;
        kotlin.Pair pairA = e10.a();
        u32.f76615b = u32.e(new String(Base64.encode((byte[]) pairA.getFirst(), 0)));
        u32.f76620g = ((Integer) pairA.getSecond()).intValue();
        return u32;
    }
}
