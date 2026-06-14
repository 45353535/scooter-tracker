package androidx.work.impl.model;

import androidx.collection.ArrayMap;
import androidx.lifecycle.LiveData;
import androidx.room.RoomDatabase;
import androidx.room.RoomRawQuery;
import androidx.room.RoomSQLiteQuery;
import androidx.room.coroutines.FlowUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.RelationUtil;
import androidx.room.util.SQLiteStatementUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteStatement;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.Data;
import androidx.work.NetworkType;
import androidx.work.WorkInfo;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.NetworkRequestCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\f2\u0006\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016J*\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00160\u0014H\u0002J*\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0018\u0010\u0013\u001a\u0014\u0012\u0004\u0012\u00020\u0015\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00160\u0014H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl;", "Landroidx/work/impl/model/RawWorkInfoDao;", "__db", "Landroidx/room/RoomDatabase;", "<init>", "(Landroidx/room/RoomDatabase;)V", "getWorkInfoPojos", "", "Landroidx/work/impl/model/WorkSpec$WorkInfoPojo;", "query", "Landroidx/sqlite/db/SupportSQLiteQuery;", "getWorkInfoPojosLiveData", "Landroidx/lifecycle/LiveData;", "getWorkInfoPojosFlow", "Lkotlinx/coroutines/flow/Flow;", "__fetchRelationshipWorkTagAsjavaLangString", "", "_connection", "Landroidx/sqlite/SQLiteConnection;", "_map", "Landroidx/collection/ArrayMap;", "", "", "__fetchRelationshipWorkProgressAsandroidxWorkData", "Landroidx/work/Data;", com.taurusx.tax.f.y.f66058y, "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class RawWorkInfoDao_Impl implements RawWorkInfoDao {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final RoomDatabase __db;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/RawWorkInfoDao_Impl$Companion;", "", "<init>", "()V", "getRequiredConverters", "", "Lkotlin/reflect/KClass;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final List<KClass<?>> getRequiredConverters() {
            return CollectionsKt.emptyList();
        }

        private Companion() {
        }
    }

    public RawWorkInfoDao_Impl(@NotNull RoomDatabase __db) {
        Intrinsics.checkNotNullParameter(__db, "__db");
        this.__db = __db;
    }

    private final void __fetchRelationshipWorkProgressAsandroidxWorkData(final SQLiteConnection _connection, ArrayMap<String, List<Data>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.i
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(this.f5599b, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo4253bindText(i10, it.next());
            i10++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                List<Data> list = _map.get(sQLiteStatementPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(Data.INSTANCE.fromByteArray(sQLiteStatementPrepare.getBlob(0)));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit __fetchRelationshipWorkProgressAsandroidxWorkData$lambda$4(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(sQLiteConnection, _tmpMap);
        return Unit.f93236a;
    }

    private final void __fetchRelationshipWorkTagAsjavaLangString(final SQLiteConnection _connection, ArrayMap<String, List<String>> _map) {
        Set<String> setKeySet = _map.keySet();
        if (setKeySet.isEmpty()) {
            return;
        }
        if (_map.getSize() > 999) {
            RelationUtil.recursiveFetchArrayMap(_map, true, new Function1() { // from class: androidx.work.impl.model.m
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return RawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString$lambda$3(this.f5627b, _connection, (ArrayMap) obj);
                }
            });
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN (");
        StringUtil.appendPlaceholders(sb2, setKeySet.size());
        sb2.append(")");
        String string = sb2.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(string);
        Iterator<String> it = setKeySet.iterator();
        int i10 = 1;
        while (it.hasNext()) {
            sQLiteStatementPrepare.mo4253bindText(i10, it.next());
            i10++;
        }
        try {
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "work_spec_id");
            if (columnIndex == -1) {
                return;
            }
            while (sQLiteStatementPrepare.step()) {
                List<String> list = _map.get(sQLiteStatementPrepare.getText(columnIndex));
                if (list != null) {
                    list.add(sQLiteStatementPrepare.getText(0));
                }
            }
        } finally {
            sQLiteStatementPrepare.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit __fetchRelationshipWorkTagAsjavaLangString$lambda$3(RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection sQLiteConnection, ArrayMap _tmpMap) {
        Intrinsics.checkNotNullParameter(_tmpMap, "_tmpMap");
        rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(sQLiteConnection, _tmpMap);
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojos$lambda$0(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        ArrayMap<String, List<String>> arrayMap;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i25 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i26 = columnIndex11;
                String text = sQLiteStatementPrepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i24 = columnIndex10;
                } else {
                    i24 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i26;
                columnIndex10 = i24;
            }
            int i27 = columnIndex10;
            int i28 = columnIndex11;
            sQLiteStatementPrepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String text3 = sQLiteStatementPrepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                Data dataFromByteArray = Data.INSTANCE.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndex3));
                long j10 = columnIndex4 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex4);
                long j11 = columnIndex5 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex5);
                long j12 = columnIndex6 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex6);
                boolean z13 = false;
                int i29 = columnIndex7 == -1 ? 0 : (int) sQLiteStatementPrepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndex8));
                long j13 = columnIndex9 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex9);
                int i30 = i27;
                long j14 = i30 == -1 ? 0L : sQLiteStatementPrepare.getLong(i30);
                int i31 = i28;
                if (i31 == -1) {
                    arrayMap = arrayMap2;
                    i10 = 0;
                    i11 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i10 = (int) sQLiteStatementPrepare.getLong(i31);
                    i11 = -1;
                }
                int i32 = i25;
                if (i32 == i11) {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = 0;
                } else {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = (int) sQLiteStatementPrepare.getLong(i32);
                }
                int i33 = columnIndex13;
                long j15 = i33 == i11 ? 0L : sQLiteStatementPrepare.getLong(i33);
                int i34 = columnIndex14;
                if (i34 == i11) {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = 0;
                } else {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = (int) sQLiteStatementPrepare.getLong(i34);
                }
                int i35 = columnIndex15;
                if (i35 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i35));
                int i36 = columnIndex16;
                if (i36 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i36));
                int i37 = columnIndex17;
                if (i37 == i11) {
                    i18 = i35;
                    i19 = i33;
                    z10 = false;
                } else {
                    i18 = i35;
                    i19 = i33;
                    z10 = ((int) sQLiteStatementPrepare.getLong(i37)) != 0;
                }
                int i38 = columnIndex18;
                if (i38 == i11) {
                    i20 = i36;
                    i21 = i37;
                    z11 = false;
                } else {
                    i20 = i36;
                    i21 = i37;
                    z11 = ((int) sQLiteStatementPrepare.getLong(i38)) != 0;
                }
                int i39 = columnIndex19;
                if (i39 == i11) {
                    i22 = i38;
                    z12 = false;
                } else {
                    i22 = i38;
                    z12 = ((int) sQLiteStatementPrepare.getLong(i39)) != 0;
                }
                int i40 = columnIndex20;
                if (i40 == i11) {
                    i23 = i20;
                } else {
                    i23 = i20;
                    if (((int) sQLiteStatementPrepare.getLong(i40)) != 0) {
                        z13 = true;
                    }
                }
                int i41 = columnIndex21;
                boolean z14 = z13;
                long j16 = i41 == i11 ? 0L : sQLiteStatementPrepare.getLong(i41);
                int i42 = columnIndex22;
                long j17 = i42 == i11 ? 0L : sQLiteStatementPrepare.getLong(i42);
                int i43 = columnIndex23;
                if (i43 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i43)));
                columnIndex23 = i43;
                ArrayMap<String, List<String>> arrayMap4 = arrayMap;
                Object value = MapsKt.getValue(arrayMap4, sQLiteStatementPrepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, sQLiteStatementPrepare.getText(columnIndex));
                Intrinsics.checkNotNullExpressionValue(value2, str3);
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j10, j11, j12, constraints, i29, backoffPolicyIntToBackoffPolicy, j13, j14, i10, i14, j15, i17, list, (List) value2));
                str2 = str3;
                columnIndex21 = i41;
                columnIndex22 = i42;
                arrayMap2 = arrayMap4;
                columnIndex4 = i15;
                columnIndex5 = i16;
                i28 = i31;
                columnIndex14 = i34;
                columnIndex15 = i18;
                columnIndex17 = i21;
                columnIndex18 = i22;
                columnIndex13 = i19;
                columnIndex19 = i39;
                columnIndex2 = i12;
                i25 = i32;
                columnIndex16 = i23;
                columnIndex20 = i40;
                columnIndex3 = i13;
                i27 = i30;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojosFlow$lambda$2(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        ArrayMap<String, List<String>> arrayMap;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i25 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i26 = columnIndex11;
                String text = sQLiteStatementPrepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i24 = columnIndex10;
                } else {
                    i24 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i26;
                columnIndex10 = i24;
            }
            int i27 = columnIndex10;
            int i28 = columnIndex11;
            sQLiteStatementPrepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String text3 = sQLiteStatementPrepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                Data dataFromByteArray = Data.INSTANCE.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndex3));
                long j10 = columnIndex4 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex4);
                long j11 = columnIndex5 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex5);
                long j12 = columnIndex6 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex6);
                boolean z13 = false;
                int i29 = columnIndex7 == -1 ? 0 : (int) sQLiteStatementPrepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndex8));
                long j13 = columnIndex9 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex9);
                int i30 = i27;
                long j14 = i30 == -1 ? 0L : sQLiteStatementPrepare.getLong(i30);
                int i31 = i28;
                if (i31 == -1) {
                    arrayMap = arrayMap2;
                    i10 = 0;
                    i11 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i10 = (int) sQLiteStatementPrepare.getLong(i31);
                    i11 = -1;
                }
                int i32 = i25;
                if (i32 == i11) {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = 0;
                } else {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = (int) sQLiteStatementPrepare.getLong(i32);
                }
                int i33 = columnIndex13;
                long j15 = i33 == i11 ? 0L : sQLiteStatementPrepare.getLong(i33);
                int i34 = columnIndex14;
                if (i34 == i11) {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = 0;
                } else {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = (int) sQLiteStatementPrepare.getLong(i34);
                }
                int i35 = columnIndex15;
                if (i35 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i35));
                int i36 = columnIndex16;
                if (i36 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i36));
                int i37 = columnIndex17;
                if (i37 == i11) {
                    i18 = i35;
                    i19 = i33;
                    z10 = false;
                } else {
                    i18 = i35;
                    i19 = i33;
                    z10 = ((int) sQLiteStatementPrepare.getLong(i37)) != 0;
                }
                int i38 = columnIndex18;
                if (i38 == i11) {
                    i20 = i36;
                    i21 = i37;
                    z11 = false;
                } else {
                    i20 = i36;
                    i21 = i37;
                    z11 = ((int) sQLiteStatementPrepare.getLong(i38)) != 0;
                }
                int i39 = columnIndex19;
                if (i39 == i11) {
                    i22 = i38;
                    z12 = false;
                } else {
                    i22 = i38;
                    z12 = ((int) sQLiteStatementPrepare.getLong(i39)) != 0;
                }
                int i40 = columnIndex20;
                if (i40 == i11) {
                    i23 = i20;
                } else {
                    i23 = i20;
                    if (((int) sQLiteStatementPrepare.getLong(i40)) != 0) {
                        z13 = true;
                    }
                }
                int i41 = columnIndex21;
                boolean z14 = z13;
                long j16 = i41 == i11 ? 0L : sQLiteStatementPrepare.getLong(i41);
                int i42 = columnIndex22;
                long j17 = i42 == i11 ? 0L : sQLiteStatementPrepare.getLong(i42);
                int i43 = columnIndex23;
                if (i43 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i43)));
                columnIndex23 = i43;
                ArrayMap<String, List<String>> arrayMap4 = arrayMap;
                Object value = MapsKt.getValue(arrayMap4, sQLiteStatementPrepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, sQLiteStatementPrepare.getText(columnIndex));
                Intrinsics.checkNotNullExpressionValue(value2, str3);
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j10, j11, j12, constraints, i29, backoffPolicyIntToBackoffPolicy, j13, j14, i10, i14, j15, i17, list, (List) value2));
                str2 = str3;
                columnIndex21 = i41;
                columnIndex22 = i42;
                arrayMap2 = arrayMap4;
                columnIndex4 = i15;
                columnIndex5 = i16;
                i28 = i31;
                columnIndex14 = i34;
                columnIndex15 = i18;
                columnIndex17 = i21;
                columnIndex18 = i22;
                columnIndex13 = i19;
                columnIndex19 = i39;
                columnIndex2 = i12;
                i25 = i32;
                columnIndex16 = i23;
                columnIndex20 = i40;
                columnIndex3 = i13;
                i27 = i30;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getWorkInfoPojosLiveData$lambda$1(String str, RoomRawQuery roomRawQuery, RawWorkInfoDao_Impl rawWorkInfoDao_Impl, SQLiteConnection _connection) {
        ArrayMap<String, List<String>> arrayMap;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z10;
        int i20;
        int i21;
        boolean z11;
        int i22;
        boolean z12;
        int i23;
        int i24;
        Intrinsics.checkNotNullParameter(_connection, "_connection");
        SQLiteStatement sQLiteStatementPrepare = _connection.prepare(str);
        try {
            roomRawQuery.getBindingFunction().invoke(sQLiteStatementPrepare);
            int columnIndex = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "id");
            int columnIndex2 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "state");
            int columnIndex3 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "output");
            int columnIndex4 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "initial_delay");
            int columnIndex5 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "interval_duration");
            int columnIndex6 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "flex_duration");
            int columnIndex7 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "run_attempt_count");
            int columnIndex8 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_policy");
            int columnIndex9 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "backoff_delay_duration");
            int columnIndex10 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "last_enqueue_time");
            int columnIndex11 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "period_count");
            int columnIndex12 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "generation");
            String str2 = "getValue(...)";
            int columnIndex13 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "next_schedule_time_override");
            int columnIndex14 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "stop_reason");
            int columnIndex15 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_type");
            int columnIndex16 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "required_network_request");
            int columnIndex17 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_charging");
            int columnIndex18 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_device_idle");
            int columnIndex19 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_battery_not_low");
            int columnIndex20 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "requires_storage_not_low");
            int columnIndex21 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_content_update_delay");
            int columnIndex22 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "trigger_max_content_delay");
            int columnIndex23 = SQLiteStatementUtil.getColumnIndex(sQLiteStatementPrepare, "content_uri_triggers");
            ArrayMap<String, List<String>> arrayMap2 = new ArrayMap<>();
            int i25 = columnIndex12;
            ArrayMap<String, List<Data>> arrayMap3 = new ArrayMap<>();
            while (sQLiteStatementPrepare.step()) {
                int i26 = columnIndex11;
                String text = sQLiteStatementPrepare.getText(columnIndex);
                if (arrayMap2.containsKey(text)) {
                    i24 = columnIndex10;
                } else {
                    i24 = columnIndex10;
                    arrayMap2.put(text, new ArrayList());
                }
                String text2 = sQLiteStatementPrepare.getText(columnIndex);
                if (!arrayMap3.containsKey(text2)) {
                    arrayMap3.put(text2, new ArrayList());
                }
                columnIndex11 = i26;
                columnIndex10 = i24;
            }
            int i27 = columnIndex10;
            int i28 = columnIndex11;
            sQLiteStatementPrepare.reset();
            rawWorkInfoDao_Impl.__fetchRelationshipWorkTagAsjavaLangString(_connection, arrayMap2);
            rawWorkInfoDao_Impl.__fetchRelationshipWorkProgressAsandroidxWorkData(_connection, arrayMap3);
            ArrayList arrayList = new ArrayList();
            while (sQLiteStatementPrepare.step()) {
                if (columnIndex == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'id', found NULL value instead.");
                }
                String text3 = sQLiteStatementPrepare.getText(columnIndex);
                if (columnIndex2 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'state', found NULL value instead.");
                }
                WorkInfo.State stateIntToState = WorkTypeConverters.intToState((int) sQLiteStatementPrepare.getLong(columnIndex2));
                if (columnIndex3 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'output', found NULL value instead.");
                }
                Data dataFromByteArray = Data.INSTANCE.fromByteArray(sQLiteStatementPrepare.getBlob(columnIndex3));
                long j10 = columnIndex4 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex4);
                long j11 = columnIndex5 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex5);
                long j12 = columnIndex6 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex6);
                boolean z13 = false;
                int i29 = columnIndex7 == -1 ? 0 : (int) sQLiteStatementPrepare.getLong(columnIndex7);
                if (columnIndex8 == -1) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'backoff_policy', found NULL value instead.");
                }
                BackoffPolicy backoffPolicyIntToBackoffPolicy = WorkTypeConverters.intToBackoffPolicy((int) sQLiteStatementPrepare.getLong(columnIndex8));
                long j13 = columnIndex9 == -1 ? 0L : sQLiteStatementPrepare.getLong(columnIndex9);
                int i30 = i27;
                long j14 = i30 == -1 ? 0L : sQLiteStatementPrepare.getLong(i30);
                int i31 = i28;
                if (i31 == -1) {
                    arrayMap = arrayMap2;
                    i10 = 0;
                    i11 = -1;
                } else {
                    arrayMap = arrayMap2;
                    i10 = (int) sQLiteStatementPrepare.getLong(i31);
                    i11 = -1;
                }
                int i32 = i25;
                if (i32 == i11) {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = 0;
                } else {
                    i12 = columnIndex2;
                    i13 = columnIndex3;
                    i14 = (int) sQLiteStatementPrepare.getLong(i32);
                }
                int i33 = columnIndex13;
                long j15 = i33 == i11 ? 0L : sQLiteStatementPrepare.getLong(i33);
                int i34 = columnIndex14;
                if (i34 == i11) {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = 0;
                } else {
                    i15 = columnIndex4;
                    i16 = columnIndex5;
                    i17 = (int) sQLiteStatementPrepare.getLong(i34);
                }
                int i35 = columnIndex15;
                if (i35 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_type', found NULL value instead.");
                }
                NetworkType networkTypeIntToNetworkType = WorkTypeConverters.intToNetworkType((int) sQLiteStatementPrepare.getLong(i35));
                int i36 = columnIndex16;
                if (i36 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'required_network_request', found NULL value instead.");
                }
                NetworkRequestCompat networkRequest$work_runtime_release = WorkTypeConverters.toNetworkRequest$work_runtime_release(sQLiteStatementPrepare.getBlob(i36));
                int i37 = columnIndex17;
                if (i37 == i11) {
                    i18 = i35;
                    i19 = i33;
                    z10 = false;
                } else {
                    i18 = i35;
                    i19 = i33;
                    z10 = ((int) sQLiteStatementPrepare.getLong(i37)) != 0;
                }
                int i38 = columnIndex18;
                if (i38 == i11) {
                    i20 = i36;
                    i21 = i37;
                    z11 = false;
                } else {
                    i20 = i36;
                    i21 = i37;
                    z11 = ((int) sQLiteStatementPrepare.getLong(i38)) != 0;
                }
                int i39 = columnIndex19;
                if (i39 == i11) {
                    i22 = i38;
                    z12 = false;
                } else {
                    i22 = i38;
                    z12 = ((int) sQLiteStatementPrepare.getLong(i39)) != 0;
                }
                int i40 = columnIndex20;
                if (i40 == i11) {
                    i23 = i20;
                } else {
                    i23 = i20;
                    if (((int) sQLiteStatementPrepare.getLong(i40)) != 0) {
                        z13 = true;
                    }
                }
                int i41 = columnIndex21;
                boolean z14 = z13;
                long j16 = i41 == i11 ? 0L : sQLiteStatementPrepare.getLong(i41);
                int i42 = columnIndex22;
                long j17 = i42 == i11 ? 0L : sQLiteStatementPrepare.getLong(i42);
                int i43 = columnIndex23;
                if (i43 == i11) {
                    throw new IllegalStateException("Missing value for a NON-NULL column 'content_uri_triggers', found NULL value instead.");
                }
                Constraints constraints = new Constraints(networkRequest$work_runtime_release, networkTypeIntToNetworkType, z10, z11, z12, z14, j16, j17, WorkTypeConverters.byteArrayToSetOfTriggers(sQLiteStatementPrepare.getBlob(i43)));
                columnIndex23 = i43;
                ArrayMap<String, List<String>> arrayMap4 = arrayMap;
                Object value = MapsKt.getValue(arrayMap4, sQLiteStatementPrepare.getText(columnIndex));
                String str3 = str2;
                Intrinsics.checkNotNullExpressionValue(value, str3);
                List list = (List) value;
                Object value2 = MapsKt.getValue(arrayMap3, sQLiteStatementPrepare.getText(columnIndex));
                Intrinsics.checkNotNullExpressionValue(value2, str3);
                arrayList.add(new WorkSpec.WorkInfoPojo(text3, stateIntToState, dataFromByteArray, j10, j11, j12, constraints, i29, backoffPolicyIntToBackoffPolicy, j13, j14, i10, i14, j15, i17, list, (List) value2));
                str2 = str3;
                columnIndex21 = i41;
                columnIndex22 = i42;
                arrayMap2 = arrayMap4;
                columnIndex4 = i15;
                columnIndex5 = i16;
                i28 = i31;
                columnIndex14 = i34;
                columnIndex15 = i18;
                columnIndex17 = i21;
                columnIndex18 = i22;
                columnIndex13 = i19;
                columnIndex19 = i39;
                columnIndex2 = i12;
                i25 = i32;
                columnIndex16 = i23;
                columnIndex20 = i40;
                columnIndex3 = i13;
                i27 = i30;
            }
            sQLiteStatementPrepare.close();
            return arrayList;
        } catch (Throwable th2) {
            sQLiteStatementPrepare.close();
            throw th2;
        }
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    @NotNull
    public List<WorkSpec.WorkInfoPojo> getWorkInfoPojos(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return (List) DBUtil.performBlocking(this.__db, true, false, new Function1() { // from class: androidx.work.impl.model.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojos$lambda$0(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    @NotNull
    public Flow getWorkInfoPojosFlow(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return FlowUtil.createFlow(this.__db, false, new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, new Function1() { // from class: androidx.work.impl.model.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojosFlow$lambda$2(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        });
    }

    @Override // androidx.work.impl.model.RawWorkInfoDao
    @NotNull
    public LiveData<List<WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        final RoomRawQuery roomRawQuery = RoomSQLiteQuery.INSTANCE.copyFrom(query).toRoomRawQuery();
        final String sql = roomRawQuery.getSql();
        return this.__db.getInvalidationTracker().createLiveData(new String[]{"WorkTag", "WorkProgress", "WorkSpec"}, false, new Function1() { // from class: androidx.work.impl.model.l
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RawWorkInfoDao_Impl.getWorkInfoPojosLiveData$lambda$1(sql, roomRawQuery, this, (SQLiteConnection) obj);
            }
        });
    }
}
