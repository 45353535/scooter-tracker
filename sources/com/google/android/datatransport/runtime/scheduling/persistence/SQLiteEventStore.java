package com.google.android.datatransport.runtime.scheduling.persistence;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.EncodedPayload;
import com.google.android.datatransport.runtime.EventInternal;
import com.google.android.datatransport.runtime.TransportContext;
import com.google.android.datatransport.runtime.firebase.transport.ClientMetrics;
import com.google.android.datatransport.runtime.firebase.transport.GlobalMetrics;
import com.google.android.datatransport.runtime.firebase.transport.LogEventDropped;
import com.google.android.datatransport.runtime.firebase.transport.LogSourceMetrics;
import com.google.android.datatransport.runtime.firebase.transport.StorageMetrics;
import com.google.android.datatransport.runtime.firebase.transport.TimeWindow;
import com.google.android.datatransport.runtime.logging.Logging;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import com.google.android.datatransport.runtime.synchronization.SynchronizationGuard;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
@WorkerThread
public class SQLiteEventStore implements EventStore, SynchronizationGuard, ClientHealthMetricsStore, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Encoding f24551g = Encoding.of("proto");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SchemaManager f24552b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Clock f24553c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Clock f24554d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final EventStoreConfig f24555e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final kf.a f24556f;

    interface Function<T, U> {
        U apply(T t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Metadata {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f24557a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final String f24558b;

        private Metadata(String str, String str2) {
            this.f24557a = str;
            this.f24558b = str2;
        }
    }

    interface Producer<T> {
        T produce();
    }

    SQLiteEventStore(Clock clock, Clock clock2, EventStoreConfig eventStoreConfig, SchemaManager schemaManager, kf.a aVar) {
        this.f24552b = schemaManager;
        this.f24553c = clock;
        this.f24554d = clock2;
        this.f24555e = eventStoreConfig;
        this.f24556f = aVar;
    }

    private GlobalMetrics B0() {
        return GlobalMetrics.newBuilder().setStorageMetrics(StorageMetrics.newBuilder().setCurrentCacheSizeBytes(z0()).setMaxCacheSizeBytes(EventStoreConfig.f24546a.f()).build()).build();
    }

    private long C0() {
        return A0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    private TimeWindow D0() {
        final long time = this.f24553c.getTime();
        return (TimeWindow) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.s
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.t0(time, (SQLiteDatabase) obj);
            }
        });
    }

    private Long E0(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))));
        if (transportContext.getExtras() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(transportContext.getExtras(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) Q0(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.k
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.U((Cursor) obj);
            }
        });
    }

    private boolean G0() {
        return C0() * getPageSize() >= this.f24555e.f();
    }

    private List H0(List list, Map map) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            PersistedEvent persistedEvent = (PersistedEvent) listIterator.next();
            if (map.containsKey(Long.valueOf(persistedEvent.getId()))) {
                EventInternal.Builder builder = persistedEvent.getEvent().toBuilder();
                for (Metadata metadata : (Set) map.get(Long.valueOf(persistedEvent.getId()))) {
                    builder.addMetadata(metadata.f24557a, metadata.f24558b);
                }
                listIterator.set(PersistedEvent.create(persistedEvent.getId(), persistedEvent.getTransportContext(), builder.build()));
            }
        }
        return list;
    }

    private List I0(SQLiteDatabase sQLiteDatabase, final TransportContext transportContext, int i10) {
        final ArrayList arrayList = new ArrayList();
        Long lE0 = E0(sQLiteDatabase, transportContext);
        if (lE0 == null) {
            return arrayList;
        }
        Q0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline", "product_id", "pseudonymous_id", "experiment_ids_clear_blob", "experiment_ids_encrypted_blob"}, "context_id = ?", new String[]{lE0.toString()}, null, null, null, String.valueOf(i10)), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.j
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.i0(this.f24597a, arrayList, transportContext, (Cursor) obj);
            }
        });
        return arrayList;
    }

    private Map J0(SQLiteDatabase sQLiteDatabase, List list) {
        final HashMap map = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i10 = 0; i10 < list.size(); i10++) {
            sb2.append(((PersistedEvent) list.get(i10)).getId());
            if (i10 < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        Q0(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.o
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.b0(map, (Cursor) obj);
            }
        });
        return map;
    }

    private static byte[] K0(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    private void L0(ClientMetrics.Builder builder, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            builder.addLogSourceMetrics(LogSourceMetrics.newBuilder().setLogSource((String) entry.getKey()).setLogEventDroppedList((List) entry.getValue()).build());
        }
    }

    public static /* synthetic */ Long M(SQLiteEventStore sQLiteEventStore, EventInternal eventInternal, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        if (sQLiteEventStore.G0()) {
            sQLiteEventStore.recordLogEventDropped(1L, LogEventDropped.Reason.CACHE_FULL, eventInternal.getTransportName());
            return -1L;
        }
        long jY0 = sQLiteEventStore.y0(sQLiteDatabase, transportContext);
        int iE = sQLiteEventStore.f24555e.e();
        byte[] bytes = eventInternal.getEncodedPayload().getBytes();
        boolean z10 = bytes.length <= iE;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(jY0));
        contentValues.put("transport_name", eventInternal.getTransportName());
        contentValues.put("timestamp_ms", Long.valueOf(eventInternal.getEventMillis()));
        contentValues.put("uptime_ms", Long.valueOf(eventInternal.getUptimeMillis()));
        contentValues.put("payload_encoding", eventInternal.getEncodedPayload().getEncoding().getName());
        contentValues.put("code", eventInternal.getCode());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z10));
        contentValues.put("payload", z10 ? bytes : new byte[0]);
        contentValues.put("product_id", eventInternal.getProductId());
        contentValues.put("pseudonymous_id", eventInternal.getPseudonymousId());
        contentValues.put("experiment_ids_clear_blob", eventInternal.getExperimentIdsClear());
        contentValues.put("experiment_ids_encrypted_blob", eventInternal.getExperimentIdsEncrypted());
        long jInsert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z10) {
            int iCeil = (int) Math.ceil(((double) bytes.length) / ((double) iE));
            for (int i10 = 1; i10 <= iCeil; i10++) {
                byte[] bArrCopyOfRange = Arrays.copyOfRange(bytes, (i10 - 1) * iE, Math.min(i10 * iE, bytes.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(jInsert));
                contentValues2.put("sequence_num", Integer.valueOf(i10));
                contentValues2.put("bytes", bArrCopyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : eventInternal.getMetadata().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(jInsert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(jInsert);
    }

    private byte[] M0(long j10) {
        return (byte[]) Q0(A0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j10)}, null, null, "sequence_num"), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.r
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.q((Cursor) obj);
            }
        });
    }

    private Object N0(Producer producer, Function function) {
        long time = this.f24554d.getTime();
        while (true) {
            try {
                return producer.produce();
            } catch (SQLiteDatabaseLockedException e10) {
                if (this.f24554d.getTime() >= ((long) this.f24555e.b()) + time) {
                    return function.apply(e10);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    private static Encoding O0(String str) {
        return str == null ? f24551g : Encoding.of(str);
    }

    private static String P0(Iterable iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(((PersistedEvent) it.next()).getId());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    static Object Q0(Cursor cursor, Function function) {
        try {
            return function.apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static /* synthetic */ Object R(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.beginTransaction();
        return null;
    }

    public static /* synthetic */ Long U(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    public static /* synthetic */ Object V(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    public static /* synthetic */ Object W(String str, LogEventDropped.Reason reason, long j10, SQLiteDatabase sQLiteDatabase) {
        if (((Boolean) Q0(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.m
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).getCount() > 0);
            }
        })).booleanValue()) {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j10 + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(reason.getNumber())});
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("log_source", str);
        contentValues.put("reason", Integer.valueOf(reason.getNumber()));
        contentValues.put("events_dropped_count", Long.valueOf(j10));
        sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        return null;
    }

    public static /* synthetic */ Object b0(Map map, Cursor cursor) {
        while (true) {
            if (!cursor.moveToNext()) {
                return null;
            }
            long j10 = cursor.getLong(0);
            Set hashSet = (Set) map.get(Long.valueOf(j10));
            if (hashSet == null) {
                hashSet = new HashSet();
                map.put(Long.valueOf(j10), hashSet);
            }
            hashSet.add(new Metadata(cursor.getString(1), cursor.getString(2)));
        }
    }

    public static /* synthetic */ TimeWindow c(long j10, Cursor cursor) {
        cursor.moveToNext();
        return TimeWindow.newBuilder().setStartMs(cursor.getLong(0)).setEndMs(j10).build();
    }

    public static /* synthetic */ List d(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        List listI0 = sQLiteEventStore.I0(sQLiteDatabase, transportContext, sQLiteEventStore.f24555e.d());
        for (Priority priority : Priority.values()) {
            if (priority != transportContext.getPriority()) {
                int iD = sQLiteEventStore.f24555e.d() - listI0.size();
                if (iD <= 0) {
                    break;
                }
                listI0.addAll(sQLiteEventStore.I0(sQLiteDatabase, transportContext.withPriority(priority), iD));
            }
        }
        return sQLiteEventStore.H0(listI0, sQLiteEventStore.J0(sQLiteDatabase, listI0));
    }

    public static /* synthetic */ List e(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(TransportContext.builder().setBackendName(cursor.getString(1)).setPriority(PriorityMapping.valueOf(cursor.getInt(2))).setExtras(K0(cursor.getString(3))).build());
        }
        return arrayList;
    }

    public static /* synthetic */ Integer e0(final SQLiteEventStore sQLiteEventStore, long j10, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        String[] strArr = {String.valueOf(j10)};
        Q0(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.q
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.m(this.f24607a, (Cursor) obj);
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    public static /* synthetic */ Object f(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    private long getPageSize() {
        return A0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    public static /* synthetic */ SQLiteDatabase h(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    public static /* synthetic */ Object i0(SQLiteEventStore sQLiteEventStore, List list, TransportContext transportContext, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            long j10 = cursor.getLong(0);
            boolean z10 = cursor.getInt(7) != 0;
            EventInternal.Builder uptimeMillis = EventInternal.builder().setTransportName(cursor.getString(1)).setEventMillis(cursor.getLong(2)).setUptimeMillis(cursor.getLong(3));
            if (z10) {
                uptimeMillis.setEncodedPayload(new EncodedPayload(O0(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                uptimeMillis.setEncodedPayload(new EncodedPayload(O0(cursor.getString(4)), sQLiteEventStore.M0(j10)));
            }
            if (!cursor.isNull(6)) {
                uptimeMillis.setCode(Integer.valueOf(cursor.getInt(6)));
            }
            if (!cursor.isNull(8)) {
                uptimeMillis.setProductId(Integer.valueOf(cursor.getInt(8)));
            }
            if (!cursor.isNull(9)) {
                uptimeMillis.setPseudonymousId(cursor.getString(9));
            }
            if (!cursor.isNull(10)) {
                uptimeMillis.setExperimentIdsClear(cursor.getBlob(10));
            }
            if (!cursor.isNull(11)) {
                uptimeMillis.setExperimentIdsEncrypted(cursor.getBlob(11));
            }
            list.add(PersistedEvent.create(j10, transportContext, uptimeMillis.build()));
        }
        return null;
    }

    public static /* synthetic */ Object m(SQLiteEventStore sQLiteEventStore, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            sQLiteEventStore.recordLogEventDropped(cursor.getInt(0), LogEventDropped.Reason.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    public static /* synthetic */ Object n(final SQLiteEventStore sQLiteEventStore, String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement(str).execute();
        Q0(sQLiteDatabase.rawQuery(str2, null), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.i
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.f(this.f24596a, (Cursor) obj);
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    public static /* synthetic */ Object n0(SQLiteEventStore sQLiteEventStore, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + sQLiteEventStore.f24553c.getTime()).execute();
        return null;
    }

    public static /* synthetic */ Boolean o(SQLiteEventStore sQLiteEventStore, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        Long lE0 = sQLiteEventStore.E0(sQLiteDatabase, transportContext);
        return lE0 == null ? Boolean.FALSE : (Boolean) Q0(sQLiteEventStore.A0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{lE0.toString()}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.h
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Cursor) obj).moveToNext());
            }
        });
    }

    public static /* synthetic */ Object p(long j10, TransportContext transportContext, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j10));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}) < 1) {
            contentValues.put("backend_name", transportContext.getBackendName());
            contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    public static /* synthetic */ byte[] q(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int length = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            length += blob.length;
        }
        byte[] bArr = new byte[length];
        int length2 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            byte[] bArr2 = (byte[]) arrayList.get(i10);
            System.arraycopy(bArr2, 0, bArr, length2, bArr2.length);
            length2 += bArr2.length;
        }
        return bArr;
    }

    public static /* synthetic */ ClientMetrics r0(final SQLiteEventStore sQLiteEventStore, String str, final Map map, final ClientMetrics.Builder builder, SQLiteDatabase sQLiteDatabase) {
        sQLiteEventStore.getClass();
        return (ClientMetrics) Q0(sQLiteDatabase.rawQuery(str, new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.n
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.w(this.f24603a, map, builder, (Cursor) obj);
            }
        });
    }

    public static /* synthetic */ List s(SQLiteDatabase sQLiteDatabase) {
        return (List) Q0(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.p
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.e((Cursor) obj);
            }
        });
    }

    public static /* synthetic */ Long s0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    public static /* synthetic */ TimeWindow t0(final long j10, SQLiteDatabase sQLiteDatabase) {
        return (TimeWindow) Q0(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.t
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.c(j10, (Cursor) obj);
            }
        });
    }

    private LogEventDropped.Reason u0(int i10) {
        LogEventDropped.Reason reason = LogEventDropped.Reason.REASON_UNKNOWN;
        if (i10 == reason.getNumber()) {
            return reason;
        }
        LogEventDropped.Reason reason2 = LogEventDropped.Reason.MESSAGE_TOO_OLD;
        if (i10 == reason2.getNumber()) {
            return reason2;
        }
        LogEventDropped.Reason reason3 = LogEventDropped.Reason.CACHE_FULL;
        if (i10 == reason3.getNumber()) {
            return reason3;
        }
        LogEventDropped.Reason reason4 = LogEventDropped.Reason.PAYLOAD_TOO_BIG;
        if (i10 == reason4.getNumber()) {
            return reason4;
        }
        LogEventDropped.Reason reason5 = LogEventDropped.Reason.MAX_RETRIES_REACHED;
        if (i10 == reason5.getNumber()) {
            return reason5;
        }
        LogEventDropped.Reason reason6 = LogEventDropped.Reason.INVALID_PAYLOD;
        if (i10 == reason6.getNumber()) {
            return reason6;
        }
        LogEventDropped.Reason reason7 = LogEventDropped.Reason.SERVER_ERROR;
        if (i10 == reason7.getNumber()) {
            return reason7;
        }
        Logging.d("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i10));
        return reason;
    }

    public static /* synthetic */ ClientMetrics w(SQLiteEventStore sQLiteEventStore, Map map, ClientMetrics.Builder builder, Cursor cursor) {
        sQLiteEventStore.getClass();
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            LogEventDropped.Reason reasonU0 = sQLiteEventStore.u0(cursor.getInt(1));
            long j10 = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(LogEventDropped.newBuilder().setReason(reasonU0).setEventsDroppedCount(j10).build());
        }
        sQLiteEventStore.L0(builder, map);
        return builder.setWindow(sQLiteEventStore.D0()).setGlobalMetrics(sQLiteEventStore.B0()).setAppNamespace((String) sQLiteEventStore.f24556f.get()).build();
    }

    private void x0(final SQLiteDatabase sQLiteDatabase) {
        N0(new Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.u
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final Object produce() {
                return SQLiteEventStore.R(sQLiteDatabase);
            }
        }, new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.v
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.V((Throwable) obj);
            }
        });
    }

    private long y0(SQLiteDatabase sQLiteDatabase, TransportContext transportContext) {
        Long lE0 = E0(sQLiteDatabase, transportContext);
        if (lE0 != null) {
            return lE0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", transportContext.getBackendName());
        contentValues.put(HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, Integer.valueOf(PriorityMapping.toInt(transportContext.getPriority())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (transportContext.getExtras() != null) {
            contentValues.put(HandleInvocationsFromAdViewer.KEY_EXTRAS, Base64.encodeToString(transportContext.getExtras(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    public static /* synthetic */ Object z(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.delete("events", null, new String[0]);
        sQLiteDatabase.delete("transport_contexts", null, new String[0]);
        return null;
    }

    SQLiteDatabase A0() {
        final SchemaManager schemaManager = this.f24552b;
        Objects.requireNonNull(schemaManager);
        return (SQLiteDatabase) N0(new Producer() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.y
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
            public final Object produce() {
                return schemaManager.getWritableDatabase();
            }
        }, new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.z
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.h((Throwable) obj);
            }
        });
    }

    Object F0(Function function) {
        SQLiteDatabase sQLiteDatabaseA0 = A0();
        sQLiteDatabaseA0.beginTransaction();
        try {
            Object objApply = function.apply(sQLiteDatabaseA0);
            sQLiteDatabaseA0.setTransactionSuccessful();
            return objApply;
        } finally {
            sQLiteDatabaseA0.endTransaction();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public int cleanUp() {
        final long time = this.f24553c.getTime() - this.f24555e.c();
        return ((Integer) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.d
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.e0(this.f24591a, time, (SQLiteDatabase) obj);
            }
        })).intValue();
    }

    @RestrictTo({RestrictTo.Scope.TESTS})
    public void clearDb() {
        F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.w
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.z((SQLiteDatabase) obj);
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f24552b.close();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public long getNextCallTime(TransportContext transportContext) {
        return ((Long) Q0(A0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{transportContext.getBackendName(), String.valueOf(PriorityMapping.toInt(transportContext.getPriority()))}), new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.g
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.s0((Cursor) obj);
            }
        })).longValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public boolean hasPendingEventsFor(final TransportContext transportContext) {
        return ((Boolean) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.o(this.f24588a, transportContext, (SQLiteDatabase) obj);
            }
        })).booleanValue();
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<TransportContext> loadActiveContexts() {
        return (Iterable) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.f
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.s((SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public Iterable<PersistedEvent> loadBatch(final TransportContext transportContext) {
        return (Iterable) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.x
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.d(this.f24611a, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public ClientMetrics loadClientMetrics() {
        final ClientMetrics.Builder builderNewBuilder = ClientMetrics.newBuilder();
        final HashMap map = new HashMap();
        final String str = "SELECT log_source, reason, events_dropped_count FROM log_event_dropped";
        return (ClientMetrics) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.r0(this.f24579a, str, map, builderNewBuilder, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    @Nullable
    public PersistedEvent persist(final TransportContext transportContext, final EventInternal eventInternal) {
        Logging.d("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", transportContext.getPriority(), eventInternal.getTransportName(), transportContext.getBackendName());
        long jLongValue = ((Long) F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.a0
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.M(this.f24583a, eventInternal, transportContext, (SQLiteDatabase) obj);
            }
        })).longValue();
        if (jLongValue < 1) {
            return null;
        }
        return PersistedEvent.create(jLongValue, transportContext, eventInternal);
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordFailure(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + P0(iterable);
            final String str2 = "SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name";
            F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.l
                @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
                public final Object apply(Object obj) {
                    return SQLiteEventStore.n(this.f24600a, str, str2, (SQLiteDatabase) obj);
                }
            });
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void recordLogEventDropped(final long j10, final LogEventDropped.Reason reason, final String str) {
        F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.e
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.W(str, reason, j10, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordNextCallTime(final TransportContext transportContext, final long j10) {
        F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.b
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.p(j10, transportContext, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.EventStore
    public void recordSuccess(Iterable<PersistedEvent> iterable) {
        if (iterable.iterator().hasNext()) {
            A0().compileStatement("DELETE FROM events WHERE _id in " + P0(iterable)).execute();
        }
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.ClientHealthMetricsStore
    public void resetClientMetrics() {
        F0(new Function() { // from class: com.google.android.datatransport.runtime.scheduling.persistence.c
            @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
            public final Object apply(Object obj) {
                return SQLiteEventStore.n0(this.f24590a, (SQLiteDatabase) obj);
            }
        });
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard
    public <T> T runCriticalSection(SynchronizationGuard.CriticalSection<T> criticalSection) {
        SQLiteDatabase sQLiteDatabaseA0 = A0();
        x0(sQLiteDatabaseA0);
        try {
            T tExecute = criticalSection.execute();
            sQLiteDatabaseA0.setTransactionSuccessful();
            return tExecute;
        } finally {
            sQLiteDatabaseA0.endTransaction();
        }
    }

    long z0() {
        return C0() * getPageSize();
    }
}
