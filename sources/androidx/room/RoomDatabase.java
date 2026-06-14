package androidx.room;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.os.CancellationSignal;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.CallSuper;
import androidx.annotation.IntRange;
import androidx.annotation.RestrictTo;
import androidx.annotation.WorkerThread;
import androidx.arch.core.executor.ArchTaskExecutor;
import androidx.exifinterface.media.ExifInterface;
import androidx.room.concurrent.CloseBarrier;
import androidx.room.coroutines.RunBlockingUninterruptible_androidKt;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.migration.Migration;
import androidx.room.support.AutoCloser;
import androidx.room.support.AutoClosingRoomOpenHelper;
import androidx.room.support.AutoClosingRoomOpenHelperFactory;
import androidx.room.support.PrePackagedCopyOpenHelper;
import androidx.room.support.PrePackagedCopyOpenHelperFactory;
import androidx.room.support.QueryInterceptorOpenHelperFactory;
import androidx.room.util.DBUtil;
import androidx.room.util.KClassUtil;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteConnection;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SimpleSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteQuery;
import androidx.sqlite.db.SupportSQLiteStatement;
import androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory;
import androidx.sqlite.driver.SupportSQLiteConnection;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import eg.m1;
import eg.w0;
import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 ¢\u00012\u00020\u0001:\u000e\u009c\u0001\u009d\u0001\u009e\u0001\u009f\u0001 \u0001¡\u0001¢\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010A\u001a\u0004\u0018\u0001HB\"\b\b\u0000\u0010B*\u00020\u00012\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0DH\u0017¢\u0006\u0002\u0010EJ%\u0010A\u001a\u0002HB\"\b\b\u0000\u0010B*\u00020\u00012\f\u0010C\u001a\b\u0012\u0004\u0012\u0002HB0<H\u0007¢\u0006\u0002\u0010FJ!\u0010G\u001a\u00020H2\n\u0010I\u001a\u0006\u0012\u0002\b\u00030<2\u0006\u0010J\u001a\u00020\u0001H\u0000¢\u0006\u0002\bKJ\u0010\u0010L\u001a\u00020H2\u0006\u0010\u0007\u001a\u00020\bH\u0017J\u0015\u0010M\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\bNJ*\u0010O\u001a\b\u0012\u0004\u0012\u00020P0/2\u001a\u0010Q\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020S0D\u0012\u0004\u0012\u00020S0RH\u0017J*\u0010T\u001a\b\u0012\u0004\u0012\u00020P0/2\u001a\u0010Q\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020S0<\u0012\u0004\u0012\u00020S0RH\u0017J&\u0010U\u001a\u0004\u0018\u0001HB\"\n\b\u0000\u0010B\u0018\u0001*\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0082\b¢\u0006\u0002\u0010VJ\u0010\u0010W\u001a\u00020\u001a2\u0006\u0010X\u001a\u00020\bH\u0015J\b\u0010Y\u001a\u00020ZH\u0015J\b\u0010[\u001a\u00020$H$J\b\u0010\\\u001a\u00020\nH\u0007J\b\u0010]\u001a\u00020\fH\u0007J\r\u0010^\u001a\u00020\fH\u0000¢\u0006\u0002\b_J\"\u0010`\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030D\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030D0/0RH\u0015J\"\u0010a\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030<\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0/0RH\u0015J\u0016\u0010e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020S0D0fH\u0017J\u0016\u0010g\u001a\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020S0<0fH\u0017J\b\u0010h\u001a\u00020HH'J)\u0010i\u001a\u00020H2\u0006\u0010j\u001a\u00020-2\u0012\u0010k\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0l\"\u00020\u000eH\u0005¢\u0006\u0002\u0010mJ\b\u0010q\u001a\u00020HH\u0016J\b\u0010r\u001a\u00020HH\u0002J\b\u0010u\u001a\u00020HH\u0017J\b\u0010v\u001a\u00020HH\u0017J@\u0010w\u001a\u0002Hx\"\u0004\b\u0000\u0010x2\u0006\u0010y\u001a\u00020-2\"\u0010z\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020|\u0012\n\u0012\b\u0012\u0004\u0012\u0002Hx0}\u0012\u0006\u0012\u0004\u0018\u00010\u00010{H\u0087@¢\u0006\u0002\u0010~J\b\u0010\u007f\u001a\u00020-H\u0007J.\u0010\u0080\u0001\u001a\u00030\u0081\u00012\u0007\u0010\u0080\u0001\u001a\u00020\u000e2\u0013\u0010\u0082\u0001\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0001\u0018\u00010lH\u0016¢\u0006\u0003\u0010\u0083\u0001J\"\u0010\u0080\u0001\u001a\u00030\u0081\u00012\b\u0010\u0080\u0001\u001a\u00030\u0084\u00012\f\b\u0002\u0010\u0085\u0001\u001a\u0005\u0018\u00010\u0086\u0001H\u0017J\u0013\u0010\u0087\u0001\u001a\u00030\u0088\u00012\u0007\u0010\u0089\u0001\u001a\u00020\u000eH\u0016J\t\u0010\u008a\u0001\u001a\u00020HH\u0017J\t\u0010\u008b\u0001\u001a\u00020HH\u0002J\t\u0010\u008c\u0001\u001a\u00020HH\u0017J\t\u0010\u008d\u0001\u001a\u00020HH\u0002J\t\u0010\u008e\u0001\u001a\u00020HH\u0017J\u0013\u0010\u008f\u0001\u001a\u00020H2\b\u0010\u0090\u0001\u001a\u00030\u0091\u0001H\u0016J(\u0010\u008f\u0001\u001a\u0003H\u0092\u0001\"\u0005\b\u0000\u0010\u0092\u00012\u000f\u0010\u0090\u0001\u001a\n\u0012\u0005\u0012\u0003H\u0092\u00010\u0093\u0001H\u0016¢\u0006\u0003\u0010\u0094\u0001J%\u0010\u008f\u0001\u001a\u0002HB\"\u0004\b\u0000\u0010B2\u000e\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u0002HB0\u0095\u0001H\u0002¢\u0006\u0003\u0010\u0096\u0001J\u0012\u0010\u0097\u0001\u001a\u00020H2\u0007\u0010\u0098\u0001\u001a\u00020\u0005H\u0015J\u0013\u0010\u0097\u0001\u001a\u00020H2\b\u0010\u0099\u0001\u001a\u00030\u009a\u0001H\u0005J\t\u0010\u009b\u0001\u001a\u00020-H\u0016R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0006\u0010\u0003R\u000e\u0010\u0007\u001a\u00020\bX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082.¢\u0006\u0002\n\u0000R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e8G¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\u00020\u00128VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0014R\u000e\u0010\u0018\u001a\u00020\u0012X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\u001d\u001a\u00020\u001e8G¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\"X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u00020$8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u000e\u0010'\u001a\u00020$X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010(\u001a\u00020)X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010.\u001a\n\u0012\u0004\u0012\u000200\u0018\u00010/8\u0004@\u0004X\u0085\u000e¢\u0006\b\n\u0000\u0012\u0004\b1\u0010\u0003R\u0010\u00102\u001a\u0004\u0018\u000103X\u0082\u000e¢\u0006\u0002\n\u0000R\u0019\u00104\u001a\b\u0012\u0004\u0012\u00020\f058G¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001e\u0010:\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030<\u0012\u0004\u0012\u00020\u00010;X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010=\u001a\u00020-X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00109\"\u0004\b?\u0010@R.\u0010b\u001a\u001c\u0012\b\u0012\u0006\u0012\u0002\b\u00030<\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030<0/0R8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bc\u0010dR\u0014\u0010n\u001a\u00020-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u00109R\u0014\u0010o\u001a\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bp\u00109R\u0014\u0010s\u001a\u00020-8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\bt\u00109¨\u0006£\u0001"}, d2 = {"Landroidx/room/RoomDatabase;", "", "<init>", "()V", "mDatabase", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "getMDatabase$annotations", "configuration", "Landroidx/room/DatabaseConfiguration;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "transactionContext", "Lkotlin/coroutines/CoroutineContext;", "path", "", "getPath", "()Ljava/lang/String;", "queryExecutor", "Ljava/util/concurrent/Executor;", "getQueryExecutor", "()Ljava/util/concurrent/Executor;", "internalQueryExecutor", "transactionExecutor", "getTransactionExecutor", "internalTransactionExecutor", "openHelper", "Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "getOpenHelper", "()Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "driver", "Landroidx/sqlite/SQLiteDriver;", "getDriver", "()Landroidx/sqlite/SQLiteDriver;", "connectionManager", "Landroidx/room/RoomConnectionManager;", "invalidationTracker", "Landroidx/room/InvalidationTracker;", "getInvalidationTracker", "()Landroidx/room/InvalidationTracker;", "internalTracker", "closeBarrier", "Landroidx/room/concurrent/CloseBarrier;", "getCloseBarrier$room_runtime", "()Landroidx/room/concurrent/CloseBarrier;", "allowMainThreadQueries", "", "mCallbacks", "", "Landroidx/room/RoomDatabase$Callback;", "getMCallbacks$annotations", "autoCloser", "Landroidx/room/support/AutoCloser;", "suspendingTransactionContext", "Ljava/lang/ThreadLocal;", "getSuspendingTransactionContext", "()Ljava/lang/ThreadLocal;", "isThreadInSuspendingTransaction", "()Z", "typeConverters", "", "Lkotlin/reflect/KClass;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime", "setUseTempTrackingTable$room_runtime", "(Z)V", "getTypeConverter", "T", "klass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Ljava/lang/Object;", "(Lkotlin/reflect/KClass;)Ljava/lang/Object;", "addTypeConverter", "", "kclass", "converter", "addTypeConverter$room_runtime", "init", "createConnectionManager", "createConnectionManager$room_runtime", "getAutoMigrations", "Landroidx/room/migration/Migration;", "autoMigrationSpecs", "", "Landroidx/room/migration/AutoMigrationSpec;", "createAutoMigrations", "unwrapOpenHelper", "(Landroidx/sqlite/db/SupportSQLiteOpenHelper;)Landroidx/sqlite/db/SupportSQLiteOpenHelper;", "createOpenHelper", "config", "createOpenDelegate", "Landroidx/room/RoomOpenDelegateMarker;", "createInvalidationTracker", "getCoroutineScope", "getQueryContext", "getTransactionContext", "getTransactionContext$room_runtime", "getRequiredTypeConverters", "getRequiredTypeConverterClasses", "requiredTypeConverterClassesMap", "getRequiredTypeConverterClassesMap$room_runtime", "()Ljava/util/Map;", "getRequiredAutoMigrationSpecs", "", "getRequiredAutoMigrationSpecClasses", "clearAllTables", "performClear", "hasForeignKeys", "tableNames", "", "(Z[Ljava/lang/String;)V", "isOpen", "isOpenInternal", "isOpenInternal$room_runtime", "close", "onClosed", "isMainThread", "isMainThread$room_runtime", "assertNotMainThread", "assertNotSuspendingTransaction", "useConnection", "R", "isReadOnly", "block", "Lkotlin/Function2;", "Landroidx/room/Transactor;", "Lkotlin/coroutines/Continuation;", "(ZLkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "inCompatibilityMode", "query", "Landroid/database/Cursor;", "args", "(Ljava/lang/String;[Ljava/lang/Object;)Landroid/database/Cursor;", "Landroidx/sqlite/db/SupportSQLiteQuery;", "signal", "Landroid/os/CancellationSignal;", "compileStatement", "Landroidx/sqlite/db/SupportSQLiteStatement;", "sql", "beginTransaction", "internalBeginTransaction", "endTransaction", "internalEndTransaction", "setTransactionSuccessful", "runInTransaction", "body", "Ljava/lang/Runnable;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/concurrent/Callable;", "(Ljava/util/concurrent/Callable;)Ljava/lang/Object;", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "internalInitInvalidationTracker", "db", "connection", "Landroidx/sqlite/SQLiteConnection;", "inTransaction", "JournalMode", "Builder", "MigrationContainer", "Callback", "PrepackagedDatabaseCallback", "QueryCallback", com.taurusx.tax.f.y.f66058y, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class RoomDatabase {

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @Nullable
    private AutoCloser autoCloser;
    private DatabaseConfiguration configuration;
    private RoomConnectionManager connectionManager;
    private CoroutineScope coroutineScope;
    private Executor internalQueryExecutor;
    private InvalidationTracker internalTracker;
    private Executor internalTransactionExecutor;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    protected List<? extends Callback> mCallbacks;

    @Nullable
    protected volatile SupportSQLiteDatabase mDatabase;
    private CoroutineContext transactionContext;

    @NotNull
    private final CloseBarrier closeBarrier = new CloseBarrier(new RoomDatabase$closeBarrier$1(this));

    @NotNull
    private final ThreadLocal<CoroutineContext> suspendingTransactionContext = new ThreadLocal<>();

    @NotNull
    private final Map<KClass<?>, Object> typeConverters = new LinkedHashMap();
    private boolean useTempTrackingTable = true;

    @Metadata(d1 = {"\u0000À\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0015\n\u0002\b\f\b\u0016\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B9\b\u0011\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rB)\b\u0010\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\u000fJ\u0016\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010@\u001a\u00020\u0007H\u0016J\u001e\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010@\u001a\u00020\u00072\u0006\u0010A\u001a\u00020\u0014H\u0017J\u0016\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u000207H\u0016J\u001e\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010C\u001a\u0002072\u0006\u0010A\u001a\u00020\u0014H\u0017J\u001c\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020:09H\u0017J$\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\f\u0010E\u001a\b\u0012\u0004\u0012\u00020:092\u0006\u0010A\u001a\u00020\u0014H\u0017J\u0018\u0010F\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u001fH\u0016J'\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0012\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00020J0I\"\u00020JH\u0016¢\u0006\u0002\u0010KJ\u0016\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010M\u001a\u000201H\u0016J\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010N\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010P\u001a\u00020\u0018H\u0016J\u0016\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010P\u001a\u00020\u0018H\u0016J\u000e\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0016\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010T\u001a\u00020%H\u0017J\u000e\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017J\u0014\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020!J\u000e\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0017J\u0014\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020!J\u001a\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\n\u0010Y\u001a\u00020Z\"\u00020.H\u0017J\"\u0010X\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010V\u001a\u00020!2\n\u0010Y\u001a\u00020Z\"\u00020.H\u0016J\u0016\u0010[\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010A\u001a\u00020\u0012H\u0016J\u001e\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010P\u001a\u00020\u0018H\u0016J\u001c\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u001a2\u0006\u0010\u0015\u001a\u00020\u0016J\u0016\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010^\u001a\u00020\u0003H\u0016J \u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\b\b\u0001\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0017J\u0014\u0010`\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010;\u001a\u00020<J\u0014\u0010a\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010\n\u001a\u00020\u001aJ\u0016\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u0006\u0010c\u001a\u00020!H\u0007J\r\u0010d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010eR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010$\u001a\u0004\u0018\u00010%X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020'X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010(\u001a\u0004\u0018\u00010)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u0002010\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00105\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u00106\u001a\u0004\u0018\u000107X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00108\u001a\n\u0012\u0004\u0012\u00020:\u0018\u000109X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010=\u001a\u0004\u0018\u00010\u001aX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020!X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006f"}, d2 = {"Landroidx/room/RoomDatabase$Builder;", "T", "Landroidx/room/RoomDatabase;", "", "klass", "Lkotlin/reflect/KClass;", "name", "", "factory", "Lkotlin/Function0;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "<init>", "(Lkotlin/reflect/KClass;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroid/content/Context;)V", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)V", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "queryCallback", "Landroidx/room/RoomDatabase$QueryCallback;", "queryCallbackExecutor", "Ljava/util/concurrent/Executor;", "queryCallbackCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "typeConverters", "queryExecutor", "transactionExecutor", "supportOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "allowMainThreadQueries", "", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "multiInstanceInvalidationIntent", "Landroid/content/Intent;", "autoCloseTimeout", "", "autoCloseTimeUnit", "Ljava/util/concurrent/TimeUnit;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "migrationsNotRequiredFrom", "", "", "migrationStartAndEndVersions", "autoMigrationSpecs", "Landroidx/room/migration/AutoMigrationSpec;", "requireMigration", "allowDestructiveMigrationOnDowngrade", "allowDestructiveMigrationForAllTables", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "driver", "Landroidx/sqlite/SQLiteDriver;", "queryCoroutineContext", "inMemoryTrackingTableMode", "createFromAsset", "databaseFilePath", "callback", "createFromFile", "databaseFile", "createFromInputStream", "inputStreamCallable", "openHelperFactory", "addMigrations", "migrations", "", "Landroidx/room/migration/Migration;", "([Landroidx/room/migration/Migration;)Landroidx/room/RoomDatabase$Builder;", "addAutoMigrationSpec", "autoMigrationSpec", "setJournalMode", "setQueryExecutor", "executor", "setTransactionExecutor", "enableMultiInstanceInvalidation", "setMultiInstanceInvalidationServiceIntent", "invalidationServiceIntent", "fallbackToDestructiveMigration", "dropAllTables", "fallbackToDestructiveMigrationOnDowngrade", "fallbackToDestructiveMigrationFrom", "startVersions", "", "addCallback", "setQueryCallback", "addTypeConverter", "typeConverter", "setAutoCloseTimeout", "setDriver", "setQueryCoroutineContext", "setInMemoryTrackingMode", "inMemory", "build", "()Landroidx/room/RoomDatabase;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class Builder<T extends RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;

        @Nullable
        private TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;

        @NotNull
        private final List<AutoMigrationSpec> autoMigrationSpecs;

        @NotNull
        private final List<Callback> callbacks;

        @NotNull
        private final Context context;

        @Nullable
        private String copyFromAssetPath;

        @Nullable
        private File copyFromFile;

        @Nullable
        private Callable<InputStream> copyFromInputStream;

        @Nullable
        private SQLiteDriver driver;

        @Nullable
        private final Function0<T> factory;
        private boolean inMemoryTrackingTableMode;

        @NotNull
        private JournalMode journalMode;

        @NotNull
        private final KClass<T> klass;

        @NotNull
        private final MigrationContainer migrationContainer;

        @NotNull
        private final Set<Integer> migrationStartAndEndVersions;

        @NotNull
        private Set<Integer> migrationsNotRequiredFrom;

        @Nullable
        private Intent multiInstanceInvalidationIntent;

        @Nullable
        private final String name;

        @Nullable
        private PrepackagedDatabaseCallback prepackagedDatabaseCallback;

        @Nullable
        private QueryCallback queryCallback;

        @Nullable
        private CoroutineContext queryCallbackCoroutineContext;

        @Nullable
        private Executor queryCallbackExecutor;

        @Nullable
        private CoroutineContext queryCoroutineContext;

        @Nullable
        private Executor queryExecutor;
        private boolean requireMigration;

        @Nullable
        private SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;

        @Nullable
        private Executor transactionExecutor;

        @NotNull
        private final List<Object> typeConverters;

        /* JADX WARN: Multi-variable type inference failed */
        public Builder(@NotNull KClass<T> klass, @Nullable String str, @Nullable Function0<? extends T> function0, @NotNull Context context) {
            Intrinsics.checkNotNullParameter(klass, "klass");
            Intrinsics.checkNotNullParameter(context, "context");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = klass;
            this.context = context;
            this.name = str;
            this.factory = function0;
        }

        @NotNull
        public Builder<T> addAutoMigrationSpec(@NotNull AutoMigrationSpec autoMigrationSpec) {
            Intrinsics.checkNotNullParameter(autoMigrationSpec, "autoMigrationSpec");
            this.autoMigrationSpecs.add(autoMigrationSpec);
            return this;
        }

        @NotNull
        public Builder<T> addCallback(@NotNull Callback callback) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.callbacks.add(callback);
            return this;
        }

        @NotNull
        public Builder<T> addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.startVersion));
                this.migrationStartAndEndVersions.add(Integer.valueOf(migration.endVersion));
            }
            this.migrationContainer.addMigrations((Migration[]) Arrays.copyOf(migrations, migrations.length));
            return this;
        }

        @NotNull
        public Builder<T> addTypeConverter(@NotNull Object typeConverter) {
            Intrinsics.checkNotNullParameter(typeConverter, "typeConverter");
            this.typeConverters.add(typeConverter);
            return this;
        }

        @NotNull
        public Builder<T> allowMainThreadQueries() {
            this.allowMainThreadQueries = true;
            return this;
        }

        @NotNull
        public T build() {
            SupportSQLiteOpenHelper.Factory queryInterceptorOpenHelperFactory;
            SupportSQLiteOpenHelper.Factory factory;
            T tInvoke;
            CoroutineContext coroutineContextB;
            Executor executor = this.queryExecutor;
            if (executor == null && this.transactionExecutor == null) {
                Executor iOThreadExecutor = ArchTaskExecutor.getIOThreadExecutor();
                this.transactionExecutor = iOThreadExecutor;
                this.queryExecutor = iOThreadExecutor;
            } else if (executor != null && this.transactionExecutor == null) {
                this.transactionExecutor = executor;
            } else if (executor == null) {
                this.queryExecutor = this.transactionExecutor;
            }
            RoomDatabaseKt.validateMigrationsNotRequired(this.migrationStartAndEndVersions, this.migrationsNotRequiredFrom);
            SQLiteDriver sQLiteDriver = this.driver;
            if (sQLiteDriver == null && this.supportOpenHelperFactory == null) {
                queryInterceptorOpenHelperFactory = new FrameworkSQLiteOpenHelperFactory();
            } else if (sQLiteDriver == null) {
                queryInterceptorOpenHelperFactory = this.supportOpenHelperFactory;
            } else {
                if (this.supportOpenHelperFactory != null) {
                    throw new IllegalArgumentException("A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory.");
                }
                queryInterceptorOpenHelperFactory = null;
            }
            boolean z10 = this.autoCloseTimeout > 0;
            boolean z11 = (this.copyFromAssetPath == null && this.copyFromFile == null && this.copyFromInputStream == null) ? false : true;
            boolean z12 = this.queryCallback != null;
            if (queryInterceptorOpenHelperFactory != null) {
                if (z10) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create auto-closing database for an in-memory database.");
                    }
                    long j10 = this.autoCloseTimeout;
                    TimeUnit timeUnit = this.autoCloseTimeUnit;
                    if (timeUnit == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new AutoClosingRoomOpenHelperFactory(queryInterceptorOpenHelperFactory, new AutoCloser(j10, timeUnit, null, 4, null));
                }
                if (z11) {
                    if (this.name == null) {
                        throw new IllegalArgumentException("Cannot create from asset or file for an in-memory database.");
                    }
                    String str = this.copyFromAssetPath;
                    int i10 = str == null ? 0 : 1;
                    File file = this.copyFromFile;
                    int i11 = file == null ? 0 : 1;
                    Callable<InputStream> callable = this.copyFromInputStream;
                    if (i10 + i11 + (callable != null ? 1 : 0) != 1) {
                        throw new IllegalArgumentException("More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations.");
                    }
                    queryInterceptorOpenHelperFactory = new PrePackagedCopyOpenHelperFactory(str, file, callable, queryInterceptorOpenHelperFactory);
                }
                if (z12) {
                    Executor executor2 = this.queryCallbackExecutor;
                    if ((executor2 == null || (coroutineContextB = w0.b(executor2)) == null) && (coroutineContextB = this.queryCallbackCoroutineContext) == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(coroutineContextB);
                    QueryCallback queryCallback = this.queryCallback;
                    if (queryCallback == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    queryInterceptorOpenHelperFactory = new QueryInterceptorOpenHelperFactory(queryInterceptorOpenHelperFactory, coroutineScopeA, queryCallback);
                }
                factory = queryInterceptorOpenHelperFactory;
            } else {
                factory = null;
            }
            if (factory == null) {
                if (z10) {
                    throw new IllegalArgumentException("Auto Closing Database is not supported when an SQLiteDriver is configured.");
                }
                if (z11) {
                    throw new IllegalArgumentException("Pre-Package Database is not supported when an SQLiteDriver is configured.");
                }
                if (z12) {
                    throw new IllegalArgumentException("Query Callback is not supported when an SQLiteDriver is configured.");
                }
            }
            Context context = this.context;
            String str2 = this.name;
            MigrationContainer migrationContainer = this.migrationContainer;
            List<Callback> list = this.callbacks;
            boolean z13 = this.allowMainThreadQueries;
            JournalMode journalModeResolve$room_runtime = this.journalMode.resolve$room_runtime(context);
            Executor executor3 = this.queryExecutor;
            if (executor3 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Executor executor4 = this.transactionExecutor;
            if (executor4 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, str2, factory, migrationContainer, list, z13, journalModeResolve$room_runtime, executor3, executor4, this.multiInstanceInvalidationIntent, this.requireMigration, this.allowDestructiveMigrationOnDowngrade, this.migrationsNotRequiredFrom, this.copyFromAssetPath, this.copyFromFile, this.copyFromInputStream, this.prepackagedDatabaseCallback, this.typeConverters, this.autoMigrationSpecs, this.allowDestructiveMigrationForAllTables, this.driver, this.queryCoroutineContext);
            databaseConfiguration.setUseTempTrackingTable$room_runtime(this.inMemoryTrackingTableMode);
            Function0<T> function0 = this.factory;
            if (function0 == null || (tInvoke = function0.invoke()) == null) {
                tInvoke = (T) KClassUtil.findAndInstantiateDatabaseImpl$default(xf.a.b(this.klass), null, 2, null);
            }
            tInvoke.init(databaseConfiguration);
            return tInvoke;
        }

        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @NotNull
        public Builder<T> enableMultiInstanceInvalidation() {
            this.multiInstanceInvalidationIntent = this.name != null ? new Intent(this.context, (Class<?>) MultiInstanceInvalidationService.class) : null;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigration() {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationFrom(@NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            return this;
        }

        @NotNull
        public Builder<T> openHelperFactory(@Nullable SupportSQLiteOpenHelper.Factory factory) {
            this.supportOpenHelperFactory = factory;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setAutoCloseTimeout(@IntRange(from = 0) long autoCloseTimeout, @NotNull TimeUnit autoCloseTimeUnit) {
            Intrinsics.checkNotNullParameter(autoCloseTimeUnit, "autoCloseTimeUnit");
            if (autoCloseTimeout < 0) {
                throw new IllegalArgumentException("autoCloseTimeout must be >= 0");
            }
            this.autoCloseTimeout = autoCloseTimeout;
            this.autoCloseTimeUnit = autoCloseTimeUnit;
            return this;
        }

        @NotNull
        public final Builder<T> setDriver(@NotNull SQLiteDriver driver) {
            Intrinsics.checkNotNullParameter(driver, "driver");
            this.driver = driver;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public final Builder<T> setInMemoryTrackingMode(boolean inMemory) {
            this.inMemoryTrackingTableMode = inMemory;
            return this;
        }

        @NotNull
        public Builder<T> setJournalMode(@NotNull JournalMode journalMode) {
            Intrinsics.checkNotNullParameter(journalMode, "journalMode");
            this.journalMode = journalMode;
            return this;
        }

        @ExperimentalRoomApi
        @NotNull
        public Builder<T> setMultiInstanceInvalidationServiceIntent(@NotNull Intent invalidationServiceIntent) {
            Intrinsics.checkNotNullParameter(invalidationServiceIntent, "invalidationServiceIntent");
            if (this.name == null) {
                invalidationServiceIntent = null;
            }
            this.multiInstanceInvalidationIntent = invalidationServiceIntent;
            return this;
        }

        @NotNull
        public Builder<T> setQueryCallback(@NotNull QueryCallback queryCallback, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = executor;
            this.queryCallbackCoroutineContext = null;
            return this;
        }

        @NotNull
        public final Builder<T> setQueryCoroutineContext(@NotNull CoroutineContext context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this.queryExecutor != null || this.transactionExecutor != null) {
                throw new IllegalArgumentException("This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext.");
            }
            if (context.get(kotlin.coroutines.d.M8) == null) {
                throw new IllegalArgumentException("It is required that the coroutine context contain a dispatcher.");
            }
            this.queryCoroutineContext = context;
            return this;
        }

        @NotNull
        public Builder<T> setQueryExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.queryExecutor = executor;
            return this;
        }

        @NotNull
        public Builder<T> setTransactionExecutor(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (this.queryCoroutineContext != null) {
                throw new IllegalArgumentException("This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext.");
            }
            this.transactionExecutor = executor;
            return this;
        }

        @SuppressLint({"BuilderSetStyle"})
        @NotNull
        public Builder<T> createFromAsset(@NotNull String databaseFilePath, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFilePath, "databaseFilePath");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromAssetPath = databaseFilePath;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @NotNull
        public Builder<T> createFromFile(@NotNull File databaseFile, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(databaseFile, "databaseFile");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromFile = databaseFile;
            return this;
        }

        @SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @NotNull
        public Builder<T> createFromInputStream(@NotNull Callable<InputStream> inputStreamCallable, @NotNull PrepackagedDatabaseCallback callback) {
            Intrinsics.checkNotNullParameter(inputStreamCallable, "inputStreamCallable");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.prepackagedDatabaseCallback = callback;
            this.copyFromInputStream = inputStreamCallable;
            return this;
        }

        @NotNull
        public final Builder<T> fallbackToDestructiveMigration(boolean dropAllTables) {
            this.requireMigration = false;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        @NotNull
        public Builder<T> fallbackToDestructiveMigrationFrom(boolean dropAllTables, @NotNull int... startVersions) {
            Intrinsics.checkNotNullParameter(startVersions, "startVersions");
            for (int i10 : startVersions) {
                this.migrationsNotRequiredFrom.add(Integer.valueOf(i10));
            }
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        @NotNull
        public final Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean dropAllTables) {
            this.requireMigration = true;
            this.allowDestructiveMigrationOnDowngrade = true;
            this.allowDestructiveMigrationForAllTables = dropAllTables;
            return this;
        }

        @NotNull
        public final Builder<T> setQueryCallback(@NotNull CoroutineContext context, @NotNull QueryCallback queryCallback) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(queryCallback, "queryCallback");
            this.queryCallback = queryCallback;
            this.queryCallbackExecutor = null;
            this.queryCallbackCoroutineContext = context;
            return this;
        }

        public Builder(@NotNull Context context, @NotNull Class<T> klass, @Nullable String str) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(klass, "klass");
            this.callbacks = new ArrayList();
            this.typeConverters = new ArrayList();
            this.journalMode = JournalMode.AUTOMATIC;
            this.autoCloseTimeout = -1L;
            this.migrationContainer = new MigrationContainer();
            this.migrationsNotRequiredFrom = new LinkedHashSet();
            this.migrationStartAndEndVersions = new LinkedHashSet();
            this.autoMigrationSpecs = new ArrayList();
            this.requireMigration = true;
            this.inMemoryTrackingTableMode = true;
            this.klass = xf.a.e(klass);
            this.context = context;
            this.name = str;
            this.factory = null;
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\f"}, d2 = {"Landroidx/room/RoomDatabase$Callback;", "", "<init>", "()V", "onCreate", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "connection", "Landroidx/sqlite/SQLiteConnection;", "onDestructiveMigration", "onOpen", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class Callback {
        public void onCreate(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onDestructiveMigration(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onOpen(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }

        public void onCreate(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onCreate(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onDestructiveMigration(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onDestructiveMigration(((SupportSQLiteConnection) connection).getDb());
            }
        }

        public void onOpen(@NotNull SQLiteConnection connection) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            if (connection instanceof SupportSQLiteConnection) {
                onOpen(((SupportSQLiteConnection) connection).getDb());
            }
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tH\u0000¢\u0006\u0002\b\nj\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u000b"}, d2 = {"Landroidx/room/RoomDatabase$JournalMode;", "", "<init>", "(Ljava/lang/String;I)V", "AUTOMATIC", "TRUNCATE", "WRITE_AHEAD_LOGGING", "resolve", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "resolve$room_runtime", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class JournalMode {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ JournalMode[] $VALUES;
        public static final JournalMode AUTOMATIC = new JournalMode("AUTOMATIC", 0);
        public static final JournalMode TRUNCATE = new JournalMode("TRUNCATE", 1);
        public static final JournalMode WRITE_AHEAD_LOGGING = new JournalMode("WRITE_AHEAD_LOGGING", 2);

        private static final /* synthetic */ JournalMode[] $values() {
            return new JournalMode[]{AUTOMATIC, TRUNCATE, WRITE_AHEAD_LOGGING};
        }

        static {
            JournalMode[] journalModeArr$values = $values();
            $VALUES = journalModeArr$values;
            $ENTRIES = qf.a.a(journalModeArr$values);
        }

        private JournalMode(String str, int i10) {
        }

        @NotNull
        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static JournalMode valueOf(String str) {
            return (JournalMode) Enum.valueOf(JournalMode.class, str);
        }

        public static JournalMode[] values() {
            return (JournalMode[]) $VALUES.clone();
        }

        @NotNull
        public final JournalMode resolve$room_runtime(@NotNull Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            if (this != AUTOMATIC) {
                return this;
            }
            Object systemService = context.getSystemService("activity");
            ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
            return (activityManager == null || activityManager.isLowRamDevice()) ? TRUNCATE : WRITE_AHEAD_LOGGING;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "", "<init>", "()V", "onOpenPrepackagedDatabase", "", "db", "Landroidx/sqlite/db/SupportSQLiteDatabase;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class PrepackagedDatabaseCallback {
        public void onOpenPrepackagedDatabase(@NotNull SupportSQLiteDatabase db2) {
            Intrinsics.checkNotNullParameter(db2, "db");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0007H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Landroidx/room/RoomDatabase$QueryCallback;", "", "onQuery", "", "sqlQuery", "", "bindArgs", "", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface QueryCallback {
        void onQuery(@NotNull String sqlQuery, @NotNull List<? extends Object> bindArgs);
    }

    /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabase$performClear$1", f = "RoomDatabase.android.kt", l = {531}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ boolean $hasForeignKeys;
        final /* synthetic */ String[] $tableNames;
        int label;

        /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabase$performClear$1$1", f = "RoomDatabase.android.kt", l = {532, 533, 535, 541, 542, 543}, m = "invokeSuspend")
        static final class C01161 extends kotlin.coroutines.jvm.internal.k implements Function2<Transactor, Continuation, Object> {
            final /* synthetic */ boolean $hasForeignKeys;
            final /* synthetic */ String[] $tableNames;
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ RoomDatabase this$0;

            /* JADX INFO: renamed from: androidx.room.RoomDatabase$performClear$1$1$1, reason: invalid class name and collision with other inner class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\n"}, d2 = {"<anonymous>", "", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
            @kotlin.coroutines.jvm.internal.e(c = "androidx.room.RoomDatabase$performClear$1$1$1", f = "RoomDatabase.android.kt", l = {537, 539}, m = "invokeSuspend")
            static final class C01171 extends kotlin.coroutines.jvm.internal.k implements Function2<TransactionScope<Unit>, Continuation, Object> {
                final /* synthetic */ boolean $hasForeignKeys;
                final /* synthetic */ String[] $tableNames;
                int I$0;
                int I$1;
                private /* synthetic */ Object L$0;
                Object L$1;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C01171(boolean z10, String[] strArr, Continuation continuation) {
                    super(2, continuation);
                    this.$hasForeignKeys = z10;
                    this.$tableNames = strArr;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    C01171 c01171 = new C01171(this.$hasForeignKeys, this.$tableNames, continuation);
                    c01171.L$0 = obj;
                    return c01171;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(TransactionScope<Unit> transactionScope, Continuation continuation) {
                    return ((C01171) create(transactionScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r1, "PRAGMA defer_foreign_keys = TRUE", r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:18:0x0077, code lost:
                
                    if (androidx.room.TransactorKt.execSQL(r6, r10, r9) == r0) goto L19;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:19:0x0079, code lost:
                
                    return r0;
                 */
                /* JADX WARN: Removed duplicated region for block: B:17:0x0051  */
                /* JADX WARN: Removed duplicated region for block: B:21:0x007c  */
                /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0077 -> B:20:0x007a). Please report as a decompilation issue!!! */
                @Override // kotlin.coroutines.jvm.internal.a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                    /*
                        r9 = this;
                        java.lang.Object r0 = pf.b.g()
                        int r1 = r9.label
                        r2 = 2
                        r3 = 1
                        if (r1 == 0) goto L2e
                        if (r1 == r3) goto L26
                        if (r1 != r2) goto L1e
                        int r1 = r9.I$1
                        int r4 = r9.I$0
                        java.lang.Object r5 = r9.L$1
                        java.lang.String[] r5 = (java.lang.String[]) r5
                        java.lang.Object r6 = r9.L$0
                        androidx.room.TransactionScope r6 = (androidx.room.TransactionScope) r6
                        kotlin.d.b(r10)
                        goto L7a
                    L1e:
                        java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r10.<init>(r0)
                        throw r10
                    L26:
                        java.lang.Object r1 = r9.L$0
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        kotlin.d.b(r10)
                        goto L47
                    L2e:
                        kotlin.d.b(r10)
                        java.lang.Object r10 = r9.L$0
                        r1 = r10
                        androidx.room.TransactionScope r1 = (androidx.room.TransactionScope) r1
                        boolean r10 = r9.$hasForeignKeys
                        if (r10 == 0) goto L47
                        r9.L$0 = r1
                        r9.label = r3
                        java.lang.String r10 = "PRAGMA defer_foreign_keys = TRUE"
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r1, r10, r9)
                        if (r10 != r0) goto L47
                        goto L79
                    L47:
                        java.lang.String[] r10 = r9.$tableNames
                        int r4 = r10.length
                        r5 = 0
                        r6 = r1
                        r1 = r4
                        r4 = r5
                        r5 = r10
                    L4f:
                        if (r4 >= r1) goto L7c
                        r10 = r5[r4]
                        java.lang.StringBuilder r7 = new java.lang.StringBuilder
                        r7.<init>()
                        java.lang.String r8 = "DELETE FROM `"
                        r7.append(r8)
                        r7.append(r10)
                        r10 = 96
                        r7.append(r10)
                        java.lang.String r10 = r7.toString()
                        r9.L$0 = r6
                        r9.L$1 = r5
                        r9.I$0 = r4
                        r9.I$1 = r1
                        r9.label = r2
                        java.lang.Object r10 = androidx.room.TransactorKt.execSQL(r6, r10, r9)
                        if (r10 != r0) goto L7a
                    L79:
                        return r0
                    L7a:
                        int r4 = r4 + r3
                        goto L4f
                    L7c:
                        kotlin.Unit r10 = kotlin.Unit.f93236a
                        return r10
                    */
                    throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01161.C01171.invokeSuspend(java.lang.Object):java.lang.Object");
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01161(RoomDatabase roomDatabase, boolean z10, String[] strArr, Continuation continuation) {
                super(2, continuation);
                this.this$0 = roomDatabase;
                this.$hasForeignKeys = z10;
                this.$tableNames = strArr;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C01161 c01161 = new C01161(this.this$0, this.$hasForeignKeys, this.$tableNames, continuation);
                c01161.L$0 = obj;
                return c01161;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Transactor transactor, Continuation continuation) {
                return ((C01161) create(transactor, continuation)).invokeSuspend(Unit.f93236a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:33:0x00b5, code lost:
            
                if (androidx.room.TransactorKt.execSQL(r1, "VACUUM", r7) != r0) goto L35;
             */
            /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
            /* JADX WARN: Removed duplicated region for block: B:21:0x0071 A[PHI: r1
  0x0071: PHI (r1v7 androidx.room.Transactor) = (r1v4 androidx.room.Transactor), (r1v4 androidx.room.Transactor), (r1v9 androidx.room.Transactor) binds: [B:17:0x005d, B:19:0x006e, B:10:0x0031] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0088 A[PHI: r1
  0x0088: PHI (r1v10 androidx.room.Transactor) = (r1v7 androidx.room.Transactor), (r1v12 androidx.room.Transactor) binds: [B:22:0x0085, B:9:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0094 A[PHI: r1 r8
  0x0094: PHI (r1v13 androidx.room.Transactor) = (r1v10 androidx.room.Transactor), (r1v15 androidx.room.Transactor) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]
  0x0094: PHI (r8v14 java.lang.Object) = (r8v13 java.lang.Object), (r8v0 java.lang.Object) binds: [B:25:0x0091, B:8:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
            /* JADX WARN: Removed duplicated region for block: B:29:0x009c  */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r8) {
                /*
                    Method dump skipped, instruction units count: 214
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.room.RoomDatabase.AnonymousClass1.C01161.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(boolean z10, String[] strArr, Continuation continuation) {
            super(2, continuation);
            this.$hasForeignKeys = z10;
            this.$tableNames = strArr;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return RoomDatabase.this.new AnonymousClass1(this.$hasForeignKeys, this.$tableNames, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                RoomConnectionManager roomConnectionManager = RoomDatabase.this.connectionManager;
                if (roomConnectionManager == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
                    roomConnectionManager = null;
                }
                C01161 c01161 = new C01161(RoomDatabase.this, this.$hasForeignKeys, this.$tableNames, null);
                this.label = 1;
                if (roomConnectionManager.useConnection(false, c01161, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SupportSQLiteOpenHelper createConnectionManager$lambda$2(RoomDatabase roomDatabase, DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        return roomDatabase.createOpenHelper(config);
    }

    protected static /* synthetic */ void getMCallbacks$annotations() {
    }

    protected static /* synthetic */ void getMDatabase$annotations() {
    }

    private final void internalBeginTransaction() {
        assertNotMainThread();
        SupportSQLiteDatabase writableDatabase = getOpenHelper().getWritableDatabase();
        if (!writableDatabase.inTransaction()) {
            getInvalidationTracker().syncBlocking$room_runtime();
        }
        if (writableDatabase.isWriteAheadLoggingEnabled()) {
            writableDatabase.beginTransactionNonExclusive();
        } else {
            writableDatabase.beginTransaction();
        }
    }

    private final void internalEndTransaction() {
        getOpenHelper().getWritableDatabase().endTransaction();
        if (inTransaction()) {
            return;
        }
        getInvalidationTracker().refreshVersionsAsync();
    }

    private final boolean isThreadInSuspendingTransaction() {
        CoroutineContext coroutineContext = this.suspendingTransactionContext.get();
        return (coroutineContext != null ? (TransactionElement) coroutineContext.get(TransactionElement.INSTANCE) : null) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClosed() {
        CoroutineScope coroutineScope = this.coroutineScope;
        RoomConnectionManager roomConnectionManager = null;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        kotlinx.coroutines.i.f(coroutineScope, null, 1, null);
        getInvalidationTracker().stop$room_runtime();
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
        } else {
            roomConnectionManager = roomConnectionManager2;
        }
        roomConnectionManager.close();
    }

    public static /* synthetic */ Cursor query$default(RoomDatabase roomDatabase, SupportSQLiteQuery supportSQLiteQuery, CancellationSignal cancellationSignal, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: query");
        }
        if ((i10 & 2) != 0) {
            cancellationSignal = null;
        }
        return roomDatabase.query(supportSQLiteQuery, cancellationSignal);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit runInTransaction$lambda$10(Runnable runnable) {
        runnable.run();
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object runInTransaction$lambda$12(Function0 function0, SQLiteConnection it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return function0.invoke();
    }

    private final /* synthetic */ <T extends SupportSQLiteOpenHelper> T unwrapOpenHelper(SupportSQLiteOpenHelper openHelper) {
        if (openHelper == null) {
            return null;
        }
        while (true) {
            Intrinsics.reifiedOperationMarker(3, "T");
            if (androidx.activity.s.a(openHelper)) {
                return (T) openHelper;
            }
            if (!(openHelper instanceof DelegatingOpenHelper)) {
                return null;
            }
            openHelper = (T) ((DelegatingOpenHelper) openHelper).getDelegate();
        }
    }

    public final void addTypeConverter$room_runtime(@NotNull KClass<?> kclass, @NotNull Object converter) {
        Intrinsics.checkNotNullParameter(kclass, "kclass");
        Intrinsics.checkNotNullParameter(converter, "converter");
        this.typeConverters.put(kclass, converter);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
        if (!this.allowMainThreadQueries && isMainThread$room_runtime()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotSuspendingTransaction() {
        if (inCompatibilityMode() && !inTransaction() && isThreadInSuspendingTransaction()) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public void beginTransaction() {
        assertNotMainThread();
        internalBeginTransaction();
    }

    @WorkerThread
    public abstract void clearAllTables();

    public void close() {
        this.closeBarrier.close$room_runtime();
    }

    @NotNull
    public SupportSQLiteStatement compileStatement(@NotNull String sql) {
        Intrinsics.checkNotNullParameter(sql, "sql");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().compileStatement(sql);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public List<Migration> createAutoMigrations(@NotNull Map<KClass<? extends AutoMigrationSpec>, ? extends AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        LinkedHashMap linkedHashMap = new LinkedHashMap(MapsKt.mapCapacity(autoMigrationSpecs.size()));
        Iterator<T> it = autoMigrationSpecs.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(xf.a.b((KClass) entry.getKey()), entry.getValue());
        }
        return getAutoMigrations(linkedHashMap);
    }

    @NotNull
    public final RoomConnectionManager createConnectionManager$room_runtime(@NotNull DatabaseConfiguration configuration) {
        RoomOpenDelegate roomOpenDelegate;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        try {
            RoomOpenDelegateMarker roomOpenDelegateMarkerCreateOpenDelegate = createOpenDelegate();
            Intrinsics.checkNotNull(roomOpenDelegateMarkerCreateOpenDelegate, "null cannot be cast to non-null type androidx.room.RoomOpenDelegate");
            roomOpenDelegate = (RoomOpenDelegate) roomOpenDelegateMarkerCreateOpenDelegate;
        } catch (lf.n unused) {
            roomOpenDelegate = null;
        }
        return roomOpenDelegate == null ? new RoomConnectionManager(configuration, (Function1<? super DatabaseConfiguration, ? extends SupportSQLiteOpenHelper>) new Function1() { // from class: androidx.room.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDatabase.createConnectionManager$lambda$2(this.f5408b, (DatabaseConfiguration) obj);
            }
        }, new RoomDatabase$createConnectionManager$2(this)) : new RoomConnectionManager(configuration, roomOpenDelegate, new RoomDatabase$createConnectionManager$3(this));
    }

    @NotNull
    protected abstract InvalidationTracker createInvalidationTracker();

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    protected RoomOpenDelegateMarker createOpenDelegate() {
        throw new lf.n(null, 1, null);
    }

    @NotNull
    protected SupportSQLiteOpenHelper createOpenHelper(@NotNull DatabaseConfiguration config) {
        Intrinsics.checkNotNullParameter(config, "config");
        throw new lf.n(null, 1, null);
    }

    public void endTransaction() {
        internalEndTransaction();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public List<Migration> getAutoMigrations(@NotNull Map<Class<? extends AutoMigrationSpec>, AutoMigrationSpec> autoMigrationSpecs) {
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        return CollectionsKt.emptyList();
    }

    @NotNull
    /* JADX INFO: renamed from: getCloseBarrier$room_runtime, reason: from getter */
    public final CloseBarrier getCloseBarrier() {
        return this.closeBarrier;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final CoroutineScope getCoroutineScope() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope != null) {
            return coroutineScope;
        }
        Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final SQLiteDriver getDriver() {
        DatabaseConfiguration databaseConfiguration = this.configuration;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configuration");
            databaseConfiguration = null;
        }
        SQLiteDriver sQLiteDriver = databaseConfiguration.sqliteDriver;
        if (sQLiteDriver != null) {
            return sQLiteDriver;
        }
        throw new IllegalStateException("No SQLiteDriver was configured with Room.");
    }

    @NotNull
    public InvalidationTracker getInvalidationTracker() {
        InvalidationTracker invalidationTracker = this.internalTracker;
        if (invalidationTracker != null) {
            return invalidationTracker;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTracker");
        return null;
    }

    @NotNull
    public SupportSQLiteOpenHelper getOpenHelper() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime = roomConnectionManager.getSupportOpenHelper();
        if (supportOpenHelper$room_runtime != null) {
            return supportOpenHelper$room_runtime;
        }
        throw new IllegalStateException("Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room.");
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final String getPath() {
        DatabaseConfiguration databaseConfiguration = this.configuration;
        DatabaseConfiguration databaseConfiguration2 = null;
        if (databaseConfiguration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configuration");
            databaseConfiguration = null;
        }
        String str = databaseConfiguration.name;
        if (str == null) {
            return null;
        }
        DatabaseConfiguration databaseConfiguration3 = this.configuration;
        if (databaseConfiguration3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("configuration");
        } else {
            databaseConfiguration2 = databaseConfiguration3;
        }
        return databaseConfiguration2.context.getDatabasePath(str).getPath();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final CoroutineContext getQueryContext() {
        CoroutineScope coroutineScope = this.coroutineScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            coroutineScope = null;
        }
        return coroutineScope.getCoroutineContext();
    }

    @NotNull
    public Executor getQueryExecutor() {
        Executor executor = this.internalQueryExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public Set<KClass<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
        Set<Class<? extends AutoMigrationSpec>> requiredAutoMigrationSpecs = getRequiredAutoMigrationSpecs();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(requiredAutoMigrationSpecs, 10));
        Iterator<T> it = requiredAutoMigrationSpecs.iterator();
        while (it.hasNext()) {
            arrayList.add(xf.a.e((Class) it.next()));
        }
        return CollectionsKt.toSet(arrayList);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public Set<Class<? extends AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
        return SetsKt.emptySet();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    protected Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClasses() {
        Set<Map.Entry<Class<?>, List<Class<?>>>> setEntrySet = getRequiredTypeConverters().entrySet();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.ranges.g.e(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(setEntrySet, 10)), 16));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Class cls = (Class) entry.getKey();
            List list = (List) entry.getValue();
            KClass kClassE = xf.a.e(cls);
            List list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList.add(xf.a.e((Class) it2.next()));
            }
            Pair pair = TuplesKt.to(kClassE, arrayList);
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        return linkedHashMap;
    }

    @NotNull
    public final Map<KClass<?>, List<KClass<?>>> getRequiredTypeConverterClassesMap$room_runtime() {
        return getRequiredTypeConverterClasses();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    protected Map<Class<?>, List<Class<?>>> getRequiredTypeConverters() {
        return MapsKt.emptyMap();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final ThreadLocal<CoroutineContext> getSuspendingTransactionContext() {
        return this.suspendingTransactionContext;
    }

    @NotNull
    public final CoroutineContext getTransactionContext$room_runtime() {
        CoroutineContext coroutineContext = this.transactionContext;
        if (coroutineContext != null) {
            return coroutineContext;
        }
        Intrinsics.throwUninitializedPropertyAccessException("transactionContext");
        return null;
    }

    @NotNull
    public Executor getTransactionExecutor() {
        Executor executor = this.internalTransactionExecutor;
        if (executor != null) {
            return executor;
        }
        Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
        return null;
    }

    @Nullable
    public <T> T getTypeConverter(@NotNull Class<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        return (T) this.typeConverters.get(xf.a.e(klass));
    }

    /* JADX INFO: renamed from: getUseTempTrackingTable$room_runtime, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean inCompatibilityMode() {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.getSupportOpenHelper() != null;
    }

    public boolean inTransaction() {
        return isOpenInternal$room_runtime() && getOpenHelper().getWritableDatabase().inTransaction();
    }

    @CallSuper
    public void init(@NotNull DatabaseConfiguration configuration) {
        CoroutineContext coroutineContext;
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.configuration = configuration;
        this.useTempTrackingTable = configuration.getUseTempTrackingTable();
        this.connectionManager = createConnectionManager$room_runtime(configuration);
        this.internalTracker = createInvalidationTracker();
        RoomDatabaseKt.validateAutoMigrations(this, configuration);
        RoomDatabaseKt.validateTypeConverters(this, configuration);
        CoroutineContext coroutineContext2 = configuration.queryCoroutineContext;
        CoroutineScope coroutineScope = null;
        if (coroutineContext2 != null) {
            CoroutineContext.Element element = coroutineContext2.get(kotlin.coroutines.d.M8);
            Intrinsics.checkNotNull(element, "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
            CoroutineDispatcher coroutineDispatcher = (CoroutineDispatcher) element;
            Executor executorA = w0.a(coroutineDispatcher);
            this.internalQueryExecutor = executorA;
            if (executorA == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executorA = null;
            }
            this.internalTransactionExecutor = new TransactionExecutor(executorA);
            this.coroutineScope = kotlinx.coroutines.i.a(configuration.queryCoroutineContext.plus(m1.a((Job) configuration.queryCoroutineContext.get(Job.N8))));
            if (inCompatibilityMode()) {
                CoroutineScope coroutineScope2 = this.coroutineScope;
                if (coroutineScope2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                    coroutineScope2 = null;
                }
                coroutineContext = coroutineScope2.getCoroutineContext().plus(coroutineDispatcher.limitedParallelism(1));
            } else {
                CoroutineScope coroutineScope3 = this.coroutineScope;
                if (coroutineScope3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                    coroutineScope3 = null;
                }
                coroutineContext = coroutineScope3.getCoroutineContext();
            }
            this.transactionContext = coroutineContext;
        } else {
            this.internalQueryExecutor = configuration.queryExecutor;
            this.internalTransactionExecutor = new TransactionExecutor(configuration.transactionExecutor);
            Executor executor = this.internalQueryExecutor;
            if (executor == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalQueryExecutor");
                executor = null;
            }
            CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(w0.b(executor).plus(m1.b(null, 1, null)));
            this.coroutineScope = coroutineScopeA;
            if (coroutineScopeA == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                coroutineScopeA = null;
            }
            CoroutineContext coroutineContext3 = coroutineScopeA.getCoroutineContext();
            Executor executor2 = this.internalTransactionExecutor;
            if (executor2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("internalTransactionExecutor");
                executor2 = null;
            }
            this.transactionContext = coroutineContext3.plus(w0.b(executor2));
        }
        this.allowMainThreadQueries = configuration.allowMainThreadQueries;
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime = roomConnectionManager.getSupportOpenHelper();
        if (supportOpenHelper$room_runtime != null) {
            while (!(supportOpenHelper$room_runtime instanceof PrePackagedCopyOpenHelper)) {
                if (!(supportOpenHelper$room_runtime instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime = null;
                    break;
                }
                supportOpenHelper$room_runtime = ((DelegatingOpenHelper) supportOpenHelper$room_runtime).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime = null;
            break;
        }
        PrePackagedCopyOpenHelper prePackagedCopyOpenHelper = (PrePackagedCopyOpenHelper) supportOpenHelper$room_runtime;
        if (prePackagedCopyOpenHelper != null) {
            prePackagedCopyOpenHelper.setDatabaseConfiguration(configuration);
        }
        RoomConnectionManager roomConnectionManager2 = this.connectionManager;
        if (roomConnectionManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager2 = null;
        }
        SupportSQLiteOpenHelper supportOpenHelper$room_runtime2 = roomConnectionManager2.getSupportOpenHelper();
        if (supportOpenHelper$room_runtime2 != null) {
            while (!(supportOpenHelper$room_runtime2 instanceof AutoClosingRoomOpenHelper)) {
                if (!(supportOpenHelper$room_runtime2 instanceof DelegatingOpenHelper)) {
                    supportOpenHelper$room_runtime2 = null;
                    break;
                }
                supportOpenHelper$room_runtime2 = ((DelegatingOpenHelper) supportOpenHelper$room_runtime2).getDelegate();
            }
        } else {
            supportOpenHelper$room_runtime2 = null;
            break;
        }
        AutoClosingRoomOpenHelper autoClosingRoomOpenHelper = (AutoClosingRoomOpenHelper) supportOpenHelper$room_runtime2;
        if (autoClosingRoomOpenHelper != null) {
            this.autoCloser = autoClosingRoomOpenHelper.getAutoCloser();
            AutoCloser autoCloser$room_runtime = autoClosingRoomOpenHelper.getAutoCloser();
            CoroutineScope coroutineScope4 = this.coroutineScope;
            if (coroutineScope4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
            } else {
                coroutineScope = coroutineScope4;
            }
            autoCloser$room_runtime.initCoroutineScope(coroutineScope);
            getInvalidationTracker().setAutoCloser$room_runtime(autoClosingRoomOpenHelper.getAutoCloser());
        }
        if (configuration.multiInstanceInvalidationServiceIntent != null) {
            if (configuration.name == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            getInvalidationTracker().initMultiInstanceInvalidation$room_runtime(configuration.context, configuration.name, configuration.multiInstanceInvalidationServiceIntent);
        }
    }

    protected void internalInitInvalidationTracker(@NotNull SupportSQLiteDatabase db2) {
        Intrinsics.checkNotNullParameter(db2, "db");
        internalInitInvalidationTracker(new SupportSQLiteConnection(db2));
    }

    public final boolean isMainThread$room_runtime() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }

    public boolean isOpen() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            return autoCloser.isActive();
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    public final boolean isOpenInternal$room_runtime() {
        AutoCloser autoCloser = this.autoCloser;
        if (autoCloser != null) {
            SupportSQLiteDatabase delegateDatabase$room_runtime = autoCloser.getDelegateDatabase();
            if (delegateDatabase$room_runtime != null) {
                return delegateDatabase$room_runtime.isOpen();
            }
            return false;
        }
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.isSupportDatabaseOpen();
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    protected final void performClear(boolean hasForeignKeys, @NotNull String... tableNames) {
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(new AnonymousClass1(hasForeignKeys, tableNames, null));
    }

    @NotNull
    public final Cursor query(@NotNull SupportSQLiteQuery query) {
        Intrinsics.checkNotNullParameter(query, "query");
        return query$default(this, query, null, 2, null);
    }

    public void runInTransaction(@NotNull final Runnable body) {
        Intrinsics.checkNotNullParameter(body, "body");
        runInTransaction(new Function0() { // from class: androidx.room.j
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RoomDatabase.runInTransaction$lambda$10(body);
            }
        });
    }

    public void setTransactionSuccessful() {
        getOpenHelper().getWritableDatabase().setTransactionSuccessful();
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @Nullable
    public final <R> Object useConnection(boolean z10, @NotNull Function2<? super Transactor, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        RoomConnectionManager roomConnectionManager = this.connectionManager;
        if (roomConnectionManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("connectionManager");
            roomConnectionManager = null;
        }
        return roomConnectionManager.useConnection(z10, function2, continuation);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @NotNull
    public final <T> T getTypeConverter(@NotNull KClass<T> klass) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        T t10 = (T) this.typeConverters.get(klass);
        Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter");
        return t10;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected final void internalInitInvalidationTracker(@NotNull SQLiteConnection connection) {
        Intrinsics.checkNotNullParameter(connection, "connection");
        getInvalidationTracker().internalInit$room_runtime(connection);
    }

    @NotNull
    public Cursor query(@NotNull String query, @Nullable Object[] args) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        return getOpenHelper().getWritableDatabase().query(new SimpleSQLiteQuery(query, args));
    }

    public <V> V runInTransaction(@NotNull final Callable<V> body) {
        Intrinsics.checkNotNullParameter(body, "body");
        return (V) runInTransaction(new Function0() { // from class: androidx.room.l
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return body.call();
            }
        });
    }

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\n2\u0012\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u000b\"\u00020\bH\u0016¢\u0006\u0002\u0010\fJ\u0016\u0010\t\u001a\u00020\n2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\b0\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\bH\u0007J \u0010\u0010\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00110\u0011H\u0016J \u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\r2\u0006\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u0006H\u0016J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0006J5\u0010\u0019\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001b\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001dJ5\u0010\u001e\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001b\u0018\u00010\u001a2\u0006\u0010\u001c\u001a\u00020\u0006H\u0000¢\u0006\u0002\b\u001fR&\u0010\u0004\u001a\u001a\u0012\u0004\u0012\u00020\u0006\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Landroidx/room/RoomDatabase$MigrationContainer;", "", "<init>", "()V", "migrations", "", "", "Ljava/util/TreeMap;", "Landroidx/room/migration/Migration;", "addMigrations", "", "", "([Landroidx/room/migration/Migration;)V", "", "addMigration", "migration", "getMigrations", "", "findMigrationPath", "start", "end", "contains", "", "startVersion", "endVersion", "getSortedNodes", "Lkotlin/Pair;", "", "migrationStart", "getSortedNodes$room_runtime", "getSortedDescendingNodes", "getSortedDescendingNodes$room_runtime", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class MigrationContainer {

        @NotNull
        private final Map<Integer, TreeMap<Integer, Migration>> migrations = new LinkedHashMap();

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final void addMigration(@NotNull Migration migration) {
            Intrinsics.checkNotNullParameter(migration, "migration");
            int i10 = migration.startVersion;
            int i11 = migration.endVersion;
            Map<Integer, TreeMap<Integer, Migration>> map = this.migrations;
            Integer numValueOf = Integer.valueOf(i10);
            TreeMap<Integer, Migration> treeMap = map.get(numValueOf);
            if (treeMap == null) {
                treeMap = new TreeMap<>();
                map.put(numValueOf, treeMap);
            }
            TreeMap<Integer, Migration> treeMap2 = treeMap;
            if (treeMap2.containsKey(Integer.valueOf(i11))) {
                Log.w(Room.LOG_TAG, "Overriding migration " + treeMap2.get(Integer.valueOf(i11)) + " with " + migration);
            }
            treeMap2.put(Integer.valueOf(i11), migration);
        }

        public void addMigrations(@NotNull List<? extends Migration> migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            Iterator<T> it = migrations.iterator();
            while (it.hasNext()) {
                addMigration((Migration) it.next());
            }
        }

        public final boolean contains(int startVersion, int endVersion) {
            return MigrationUtil.contains(this, startVersion, endVersion);
        }

        @Nullable
        public List<Migration> findMigrationPath(int start, int end) {
            return MigrationUtil.findMigrationPath(this, start, end);
        }

        @NotNull
        public Map<Integer, Map<Integer, Migration>> getMigrations() {
            return this.migrations;
        }

        @Nullable
        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedDescendingNodes$room_runtime(int migrationStart) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.descendingKeySet());
        }

        @Nullable
        public final Pair<Map<Integer, Migration>, Iterable<Integer>> getSortedNodes$room_runtime(int migrationStart) {
            TreeMap<Integer, Migration> treeMap = this.migrations.get(Integer.valueOf(migrationStart));
            if (treeMap == null) {
                return null;
            }
            return TuplesKt.to(treeMap, treeMap.keySet());
        }

        public void addMigrations(@NotNull Migration... migrations) {
            Intrinsics.checkNotNullParameter(migrations, "migrations");
            for (Migration migration : migrations) {
                addMigration(migration);
            }
        }
    }

    private final <T> T runInTransaction(final Function0<? extends T> body) {
        if (inCompatibilityMode()) {
            beginTransaction();
            try {
                T tInvoke = body.invoke();
                setTransactionSuccessful();
                return tInvoke;
            } finally {
                endTransaction();
            }
        }
        return (T) DBUtil.performBlocking(this, false, true, new Function1() { // from class: androidx.room.m
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RoomDatabase.runInTransaction$lambda$12(body, (SQLiteConnection) obj);
            }
        });
    }

    @NotNull
    public Cursor query(@NotNull SupportSQLiteQuery query, @Nullable CancellationSignal signal) {
        Intrinsics.checkNotNullParameter(query, "query");
        assertNotMainThread();
        assertNotSuspendingTransaction();
        if (signal != null) {
            return getOpenHelper().getWritableDatabase().query(query, signal);
        }
        return getOpenHelper().getWritableDatabase().query(query);
    }
}
