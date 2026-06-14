package io.appmetrica.analytics.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.DatabaseUtils;
import android.database.sqlite.SQLiteDatabase;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.ApiKeyUtils;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.db.DBUtils;
import io.appmetrica.analytics.coreutils.internal.io.GZIPCompressor;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import io.appmetrica.analytics.networktasks.internal.DefaultNetworkResponseHandler;
import io.appmetrica.analytics.networktasks.internal.FullUrlFormer;
import io.appmetrica.analytics.networktasks.internal.RequestBodyEncrypter;
import io.appmetrica.analytics.networktasks.internal.RequestDataHolder;
import io.appmetrica.analytics.networktasks.internal.ResponseDataHolder;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import io.appmetrica.analytics.networktasks.internal.SendingDataTaskHelper;
import io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask;
import io.appmetrica.analytics.protobuf.nano.CodedOutputByteBufferNano;
import io.appmetrica.analytics.protobuf.nano.MessageNano;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.zh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5600zh implements UnderlyingNetworkTask {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C5058e5 f78634a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f78635b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C5440t7 f78636c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C5368q9 f78637d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final S6 f78638e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public List f78639f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f78640g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f78641h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f78642i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public C5575yh f78643j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C5134h3 f78644k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PublicLogger f78645l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final zo f78646m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Ya f78647n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C5070eh f78648o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final FullUrlFormer f78649p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Fb f78650q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final RequestDataHolder f78651r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final ResponseDataHolder f78652s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final SendingDataTaskHelper f78653t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f78654u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f78655v;

    public C5600zh(@NonNull C5058e5 c5058e5, @NonNull C5070eh c5070eh, @NonNull Fb fb2, @NonNull FullUrlFormer<C5351ph> fullUrlFormer, @NonNull RequestDataHolder requestDataHolder, @NonNull ResponseDataHolder responseDataHolder, @NonNull RequestBodyEncrypter requestBodyEncrypter) {
        this(c5058e5, c5070eh, fb2, fullUrlFormer, requestDataHolder, responseDataHolder, c5058e5.i(), c5058e5.p(), c5058e5.u(), requestBodyEncrypter);
    }

    public final C5368q9 a(C5575yh c5575yh, List list, C5351ph c5351ph) {
        C5368q9 c5368q9 = new C5368q9();
        C5166i9 c5166i9 = new C5166i9();
        c5166i9.f77388a = WrapUtils.getOrDefaultIfEmpty(this.f78636c.f78263b, c5351ph.getUuid());
        c5166i9.f77389b = WrapUtils.getOrDefaultIfEmpty(this.f78636c.f78262a, c5351ph.getDeviceId());
        this.f78640g = CodedOutputByteBufferNano.computeMessageSize(4, c5166i9) + this.f78640g;
        c5368q9.f78054b = c5166i9;
        C5382qn c5382qnC = C5468ua.H.C();
        C5525wh c5525wh = new C5525wh(this, c5368q9);
        synchronized (c5382qnC) {
            c5382qnC.f78096a.a(c5525wh);
        }
        c5368q9.f78053a = (C5293n9[]) c5575yh.f78583a.toArray(new C5293n9[0]);
        c5368q9.f78055c = a(c5575yh.f78585c);
        c5368q9.f78057e = (String[]) list.toArray(new String[0]);
        Set set = c5351ph.f78003x;
        String[] strArr = (String[]) set.toArray(new String[0]);
        c5368q9.f78058f = new byte[strArr.length][];
        for (int i10 = 0; i10 < set.size(); i10++) {
            c5368q9.f78058f[i10] = StringUtils.getUTF8Bytes(strArr[i10]);
        }
        return c5368q9;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final String description() {
        return "ReportTask_" + ApiKeyUtils.createPartialApiKey(this.f78634a.f77063b.f76663b);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final FullUrlFormer<?> getFullUrlFormer() {
        return this.f78649p;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final RequestDataHolder getRequestDataHolder() {
        return this.f78651r;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @NonNull
    public final ResponseDataHolder getResponseDataHolder() {
        return this.f78652s;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final RetryPolicyConfig getRetryPolicyConfig() {
        return ((C5351ph) this.f78634a.f77072k.a()).getRetryPolicyConfig();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    @Nullable
    public final SSLSocketFactory getSslSocketFactory() {
        ((El) C5468ua.H.A()).getClass();
        return null;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onCreateTask() {
        Cursor cursorRawQuery;
        int iOptInt;
        S6 s62 = this.f78634a.f77066e;
        s62.getClass();
        ArrayList arrayList = new ArrayList();
        s62.f76394a.lock();
        try {
            SQLiteDatabase readableDatabase = s62.f76396c.getReadableDatabase();
            if (readableDatabase != null) {
                cursorRawQuery = readableDatabase.rawQuery(B5.f75573b, null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DatabaseUtils.cursorRowToContentValues(cursorRawQuery, contentValues);
                        arrayList.add(contentValues);
                    } catch (Throwable unused) {
                        try {
                            arrayList = new ArrayList();
                        } finally {
                            no.a(cursorRawQuery);
                            s62.f76394a.unlock();
                        }
                    }
                }
            } else {
                cursorRawQuery = null;
            }
        } catch (Throwable unused2) {
            cursorRawQuery = null;
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ContentValues contentValues2 = (ContentValues) arrayList.get(0);
        this.f78635b.clear();
        for (Map.Entry<String, Object> entry : contentValues2.valueSet()) {
            this.f78635b.put(entry.getKey(), entry.getValue().toString());
        }
        String asString = contentValues2.getAsString("report_request_parameters");
        if (TextUtils.isEmpty(asString)) {
            C5440t7 c5440t7 = new C5440t7();
            this.f78636c = c5440t7;
            this.f78648o.f77128c = c5440t7;
        } else {
            try {
                C5440t7 c5440t72 = new C5440t7(new C5270mb(asString));
                this.f78636c = c5440t72;
                this.f78648o.f77128c = c5440t72;
            } catch (Throwable unused3) {
                C5440t7 c5440t73 = new C5440t7();
                this.f78636c = c5440t73;
                this.f78648o.f77128c = c5440t73;
            }
        }
        C5351ph config = this.f78650q.getConfig();
        List list = config.f78002w;
        if (no.a((Collection) list)) {
            return false;
        }
        this.f78649p.setHosts(config.f77996q);
        if (!config.u() || no.a((Collection) this.f78649p.getAllHosts())) {
            this.f78655v = true;
            return false;
        }
        this.f78639f = null;
        C5575yh c5575yhA = a(config);
        this.f78643j = c5575yhA;
        if (c5575yhA.f78583a.isEmpty()) {
            return false;
        }
        zo zoVar = this.f78646m;
        synchronized (zoVar) {
            iOptInt = zoVar.f78664a.a().optInt("report_request_id", -1);
        }
        int i10 = iOptInt + 1;
        this.f78654u = i10;
        this.f78648o.f77130e = i10;
        C5368q9 c5368q9A = a(this.f78643j, list, config);
        this.f78637d = c5368q9A;
        this.f78639f = this.f78643j.f78584b;
        this.f78653t.prepareAndSetPostData(MessageNano.toByteArray(c5368q9A));
        return true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPerformRequest() {
        this.f78653t.onPerformRequest();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onPostRequestComplete(boolean z10) {
        String strA;
        if (z10) {
            a(false);
        } else if (this.f78652s.getResponseCode() == 400) {
            a(true);
        }
        if (z10) {
            for (int i10 = 0; i10 < this.f78643j.f78583a.size(); i10++) {
                for (C5243l9 c5243l9 : ((C5293n9) this.f78643j.f78583a.get(i10)).f77833c) {
                    if (c5243l9 != null && (strA = Vf.a(c5243l9)) != null) {
                        this.f78645l.info(strA, new Object[0]);
                    }
                }
            }
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final boolean onRequestComplete() {
        return this.f78653t.isResponseValid();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onRequestError(@Nullable Throwable th2) {
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onShouldNotExecute() {
        this.f78655v = true;
        this.f78634a.f77066e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onSuccessfulTaskFinished() {
        this.f78655v = true;
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskAdded() {
        ((C5388r5) this.f78634a.f77077p).f78121d.set(false);
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskFinished() {
        this.f78634a.f77066e.a();
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onTaskRemoved() {
        ((C5388r5) this.f78634a.f77077p).f78121d.set(true);
        if (this.f78655v) {
            ((C5388r5) this.f78634a.f77077p).f();
        }
    }

    @Override // io.appmetrica.analytics.networktasks.internal.UnderlyingNetworkTask
    public final void onUnsuccessfulTaskFinished() {
    }

    public C5600zh(C5058e5 c5058e5, C5070eh c5070eh, Fb fb2, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, S6 s62, PublicLogger publicLogger, zo zoVar, RequestBodyEncrypter requestBodyEncrypter) {
        this(c5058e5, publicLogger, s62, c5070eh, zoVar, fb2, new C5134h3(1024000, "event value in ReportTask", publicLogger), AbstractC5509w1.a(), fullUrlFormer, requestDataHolder, responseDataHolder, requestBodyEncrypter);
    }

    public C5600zh(C5058e5 c5058e5, PublicLogger publicLogger, S6 s62, C5070eh c5070eh, zo zoVar, Fb fb2, C5134h3 c5134h3, Vj vj, FullUrlFormer fullUrlFormer, RequestDataHolder requestDataHolder, ResponseDataHolder responseDataHolder, RequestBodyEncrypter requestBodyEncrypter) {
        this.f78635b = new LinkedHashMap();
        this.f78640g = 0;
        this.f78641h = 0;
        this.f78642i = -1;
        this.f78655v = false;
        this.f78653t = new SendingDataTaskHelper(requestBodyEncrypter, new GZIPCompressor(), requestDataHolder, responseDataHolder, new DefaultNetworkResponseHandler());
        this.f78648o = c5070eh;
        this.f78634a = c5058e5;
        this.f78638e = s62;
        this.f78645l = publicLogger;
        this.f78644k = c5134h3;
        this.f78646m = zoVar;
        this.f78650q = fb2;
        this.f78647n = vj;
        this.f78651r = requestDataHolder;
        this.f78652s = responseDataHolder;
        this.f78649p = fullUrlFormer;
    }

    public static C5088f9[] a(JSONObject jSONObject) {
        int length = jSONObject.length();
        if (length <= 0) {
            return null;
        }
        C5088f9[] c5088f9Arr = new C5088f9[length];
        Iterator<String> itKeys = jSONObject.keys();
        int i10 = 0;
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                C5088f9 c5088f9 = new C5088f9();
                c5088f9.f77153a = next;
                c5088f9.f77154b = jSONObject.getString(next);
                c5088f9Arr[i10] = c5088f9;
            } catch (Throwable unused) {
            }
            i10++;
        }
        return c5088f9Arr;
    }

    public final void a(boolean z10) {
        boolean z11;
        zo zoVar = this.f78646m;
        int i10 = this.f78654u;
        synchronized (zoVar) {
            Ao ao = zoVar.f78664a;
            ao.a(ao.a().put("report_request_id", i10));
        }
        C5293n9[] c5293n9Arr = this.f78637d.f78053a;
        int i11 = 0;
        while (i11 < c5293n9Arr.length) {
            try {
                C5293n9 c5293n9 = c5293n9Arr[i11];
                long jLongValue = ((Long) this.f78639f.get(i11)).longValue();
                EnumC4971al enumC4971al = (EnumC4971al) Uf.f76561b.get(c5293n9.f77832b.f77754c);
                if (enumC4971al == null) {
                    enumC4971al = EnumC4971al.FOREGROUND;
                }
                z11 = z10;
                try {
                    this.f78638e.a(jLongValue, enumC4971al.f76850a, c5293n9.f77833c.length, z11);
                    Uf.a(c5293n9);
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                z11 = z10;
            }
            i11++;
            z10 = z11;
        }
        S6 s62 = this.f78638e;
        long jA = this.f78634a.f77071j.a();
        s62.f76395b.lock();
        try {
            if (D5.f75654a.booleanValue()) {
                s62.d();
            }
            SQLiteDatabase writableDatabase = s62.f76396c.getWritableDatabase();
            if (writableDatabase != null) {
                writableDatabase.delete("sessions", B5.f75574c, new String[]{String.valueOf(jA)});
            }
        } catch (Throwable unused3) {
        }
        s62.f76395b.unlock();
    }

    @NonNull
    public final C5575yh a(@NonNull C5351ph c5351ph) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        JSONObject jSONObject = new JSONObject();
        ArrayList arrayList3 = new ArrayList();
        Cursor cursor = null;
        try {
            Cursor cursorA = a();
            if (cursorA != null) {
                JSONObject jSONObject2 = jSONObject;
                C5157i0 c5157i0 = null;
                while (cursorA.moveToNext() && this.f78641h < 100) {
                    try {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        A7 model = new B7(null, 1, null).toModel(contentValues);
                        Long l10 = model.f75497a;
                        if (l10 != null) {
                            C5590z7 c5590z7 = model.f75500d;
                            C5343p9 c5343p9A = Uf.a(c5590z7.f78606a, c5590z7.f78607b, c5590z7.f78608c);
                            String locale = c5351ph.getLocale();
                            EnumC4971al enumC4971al = model.f75498b;
                            C5268m9 c5268m9 = new C5268m9();
                            c5268m9.f77752a = c5343p9A;
                            c5268m9.f77753b = locale;
                            if (enumC4971al != null) {
                                Integer num = (Integer) Uf.f76560a.get(enumC4971al);
                                c5268m9.f77754c = num != null ? num.intValue() : 0;
                            }
                            int iComputeUInt64Size = this.f78640g + CodedOutputByteBufferNano.computeUInt64Size(1, Long.MAX_VALUE);
                            this.f78640g = iComputeUInt64Size;
                            int iComputeMessageSize = iComputeUInt64Size + CodedOutputByteBufferNano.computeMessageSize(2, c5268m9);
                            this.f78640g = iComputeMessageSize;
                            if (iComputeMessageSize >= 250880) {
                                break;
                            }
                            C5550xh c5550xhA = a(l10.longValue(), c5268m9, c5351ph, arrayList3, arrayList.size());
                            if (c5550xhA == null) {
                                continue;
                            } else {
                                if (c5157i0 == null) {
                                    c5157i0 = c5550xhA.f78559b;
                                } else if (!c5157i0.equals(c5550xhA.f78559b)) {
                                    break;
                                }
                                arrayList2.add(l10);
                                arrayList.add(c5550xhA.f78558a);
                                if (!TextUtils.isEmpty(c5550xhA.f78559b.f77362a)) {
                                    try {
                                        jSONObject2 = new JSONObject(c5550xhA.f78559b.f77362a);
                                    } catch (Throwable unused) {
                                    }
                                }
                                if (c5550xhA.f78560c) {
                                    break;
                                }
                            }
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        cursor = cursorA;
                        jSONObject = jSONObject2;
                        try {
                            arrayList3.add(th);
                        } finally {
                            no.a(cursor);
                        }
                    }
                }
                jSONObject = jSONObject2;
            }
            no.a(cursorA);
        } catch (Throwable th3) {
            th = th3;
        }
        Iterator it = arrayList3.iterator();
        while (it.hasNext()) {
            this.f78647n.reportError("protobuf_serialization_error", (Throwable) it.next());
        }
        return new C5575yh(arrayList, arrayList2, jSONObject);
    }

    public static C5157i0 a(ContentValues contentValues) {
        C5266m7 model = new C5291n7(null, 1, null).toModel(contentValues);
        return new C5157i0((String) WrapUtils.getOrDefault(model.f77744g.f77653g, ""), ((Long) WrapUtils.getOrDefault(model.f77744g.f77654h, 0L)).longValue());
    }

    public final C5550xh a(long j10, C5268m9 c5268m9, C5351ph c5351ph, ArrayList arrayList, int i10) {
        Cursor cursorA;
        boolean z10;
        C5243l9 c5243l9A;
        int iComputeMessageSize;
        C5088f9[] c5088f9ArrA;
        C4985b9 c4985b9;
        C5293n9 c5293n9 = new C5293n9();
        c5293n9.f77831a = j10;
        c5293n9.f77832b = c5268m9;
        EnumC4971al enumC4971al = (EnumC4971al) Uf.f76561b.get(c5268m9.f77754c);
        if (enumC4971al == null) {
            enumC4971al = EnumC4971al.FOREGROUND;
        }
        C5550xh c5550xh = null;
        try {
            cursorA = a(j10, enumC4971al);
            if (cursorA != null) {
                try {
                    ArrayList arrayList2 = new ArrayList();
                    C5157i0 c5157i0 = null;
                    while (cursorA.moveToNext() && this.f78641h < 100) {
                        ContentValues contentValues = new ContentValues();
                        DBUtils.cursorRowToContentValues(cursorA, contentValues);
                        try {
                            S8 s82 = new S8(contentValues);
                            EnumC5168ib enumC5168ib = s82.f76415h;
                            if (enumC5168ib != null) {
                                c4985b9 = (C4985b9) Uf.f76563d.get(enumC5168ib);
                            } else {
                                Map map = Uf.f76560a;
                                c4985b9 = null;
                            }
                            if (c4985b9 == null) {
                                c4985b9 = C4985b9.f76885i;
                            }
                            try {
                                c5243l9A = c4985b9.a(s82, c5351ph);
                            } catch (Throwable th2) {
                                th = th2;
                                arrayList.add(th);
                                c5243l9A = null;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        if (c5243l9A != null) {
                            C5157i0 c5157i0A = a(contentValues);
                            if (c5157i0 == null) {
                                if (this.f78642i < 0) {
                                    try {
                                        c5088f9ArrA = a(new JSONObject(c5157i0A.f77362a));
                                    } catch (Throwable unused) {
                                    }
                                    if (c5088f9ArrA != null) {
                                        iComputeMessageSize = 0;
                                        for (C5088f9 c5088f9 : c5088f9ArrA) {
                                            try {
                                                iComputeMessageSize += CodedOutputByteBufferNano.computeMessageSize(7, c5088f9);
                                            } catch (Throwable unused2) {
                                            }
                                        }
                                        this.f78642i = iComputeMessageSize;
                                        this.f78640g += iComputeMessageSize;
                                    }
                                    iComputeMessageSize = 0;
                                    this.f78642i = iComputeMessageSize;
                                    this.f78640g += iComputeMessageSize;
                                }
                                c5157i0 = c5157i0A;
                            } else if (!c5157i0.equals(c5157i0A)) {
                                z10 = true;
                                break;
                            }
                            C5134h3 c5134h3 = this.f78644k;
                            byte[] bArr = c5243l9A.f77678e;
                            c5134h3.getClass();
                            byte[] bArrA = c5134h3.a(bArr);
                            byte[] bArr2 = c5243l9A.f77678e;
                            if (bArr2 != bArrA) {
                                c5243l9A.f77682i = ((bArr2 == null ? 0 : bArr2.length) - (bArrA == null ? 0 : bArrA.length)) + c5243l9A.f77682i;
                                c5243l9A.f77678e = bArrA;
                            }
                            this.f78640g += CodedOutputByteBufferNano.computeMessageSize(3, c5243l9A);
                            if (arrayList2.isEmpty() && i10 == 0) {
                                if (this.f78640g >= 1048576) {
                                    break;
                                }
                            } else if (this.f78640g >= 250880) {
                                break;
                            }
                        }
                        arrayList2.add(c5243l9A);
                        this.f78641h++;
                    }
                    z10 = false;
                    if (arrayList2.size() > 0) {
                        c5293n9.f77833c = (C5243l9[]) arrayList2.toArray(new C5243l9[arrayList2.size()]);
                        c5550xh = new C5550xh(c5293n9, c5157i0, z10);
                    }
                } catch (Throwable th4) {
                    th = th4;
                    try {
                        arrayList.add(th);
                    } finally {
                        no.a(cursorA);
                    }
                }
            }
        } catch (Throwable th5) {
            th = th5;
            cursorA = null;
        }
        return c5550xh;
    }

    public final Cursor a() {
        SQLiteDatabase readableDatabase;
        S6 s62 = this.f78638e;
        LinkedHashMap linkedHashMap = this.f78635b;
        s62.f76394a.lock();
        try {
            readableDatabase = s62.f76396c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("sessions", null, S6.a(linkedHashMap), S6.a(new String[]{Long.toString(0L)}, linkedHashMap), null, null, "id ASC", null) : null;
        s62.f76394a.unlock();
        return cursorQuery;
    }

    public final Cursor a(long j10, EnumC4971al enumC4971al) {
        SQLiteDatabase readableDatabase;
        S6 s62 = this.f78638e;
        s62.f76394a.lock();
        try {
            readableDatabase = s62.f76396c.getReadableDatabase();
        } catch (Throwable unused) {
        }
        Cursor cursorQuery = readableDatabase != null ? readableDatabase.query("events", null, "session_id = ? AND session_type = ?", new String[]{Long.toString(j10), Integer.toString(enumC4971al.f76850a)}, null, null, "number_in_session ASC", null) : null;
        s62.f76394a.unlock();
        return cursorQuery;
    }
}
