package androidx.room;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.RestrictTo;
import androidx.room.RoomDatabase;
import androidx.room.migration.AutoMigrationSpec;
import androidx.room.util.MigrationUtil;
import androidx.sqlite.SQLiteDriver;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\b\u0016\u0018\u00002\u00020\u0001Bí\u0001\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b\u0012\u0006\u0010&\u001a\u00020\u000e\u0012\b\u0010'\u001a\u0004\u0018\u00010(\u0012\b\u0010)\u001a\u0004\u0018\u00010*¢\u0006\u0004\b+\u0010,Bk\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b+\u0010-B\u0083\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\u0004\b+\u0010/B\u0097\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b+\u00100B§\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f¢\u0006\u0004\b+\u00101B±\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b+\u00102B¿\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b¢\u0006\u0004\b+\u00103BÍ\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010.\u001a\u00020\u000e\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b¢\u0006\u0004\b+\u00104BÏ\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b¢\u0006\u0004\b+\u00105B×\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u000e\u0012\u0006\u0010\u0017\u001a\u00020\u000e\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001d\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f\u0012\b\u0010!\u001a\u0004\u0018\u00010\"\u0012\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b\u0012\f\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b\u0012\u0006\u0010&\u001a\u00020\u000e¢\u0006\u0004\b+\u00106J\u0010\u0010>\u001a\u00020\u000e2\u0006\u0010?\u001a\u00020\u001aH\u0017J\u0018\u0010E\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u001a2\u0006\u0010G\u001a\u00020\u001aH\u0016J\u0098\u0002\u0010H\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000e2\b\b\u0002\u0010\u0017\u001a\u00020\u000e2\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"2\u000e\b\u0002\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b2\b\b\u0002\u0010&\u001a\u00020\u000e2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010*H\u0007R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00108\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u00158\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010!\u001a\u0004\u0018\u00010\"8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020%0\u000b8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010'\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0012\u0010)\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010.\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u00109\u001a\u00020\u000eX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u001a\u0010@\u001a\u00020\u001aX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006I"}, d2 = {"Landroidx/room/DatabaseConfiguration;", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "name", "", "sqliteOpenHelperFactory", "Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;", "migrationContainer", "Landroidx/room/RoomDatabase$MigrationContainer;", "callbacks", "", "Landroidx/room/RoomDatabase$Callback;", "allowMainThreadQueries", "", "journalMode", "Landroidx/room/RoomDatabase$JournalMode;", "queryExecutor", "Ljava/util/concurrent/Executor;", "transactionExecutor", "multiInstanceInvalidationServiceIntent", "Landroid/content/Intent;", "requireMigration", "allowDestructiveMigrationOnDowngrade", "migrationNotRequiredFrom", "", "", "copyFromAssetPath", "copyFromFile", "Ljava/io/File;", "copyFromInputStream", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "prepackagedDatabaseCallback", "Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;", "typeConverters", "autoMigrationSpecs", "Landroidx/room/migration/AutoMigrationSpec;", "allowDestructiveMigrationForAllTables", "sqliteDriver", "Landroidx/sqlite/SQLiteDriver;", "queryCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "<init>", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;ZLandroidx/sqlite/SQLiteDriver;Lkotlin/coroutines/CoroutineContext;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;ZLjava/util/Set;)V", "multiInstanceInvalidation", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;ZZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;)V", "(Landroid/content/Context;Ljava/lang/String;Landroidx/sqlite/db/SupportSQLiteOpenHelper$Factory;Landroidx/room/RoomDatabase$MigrationContainer;Ljava/util/List;ZLandroidx/room/RoomDatabase$JournalMode;Ljava/util/concurrent/Executor;Ljava/util/concurrent/Executor;Landroid/content/Intent;ZZLjava/util/Set;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Landroidx/room/RoomDatabase$PrepackagedDatabaseCallback;Ljava/util/List;Ljava/util/List;Z)V", "getMigrationNotRequiredFrom$room_runtime", "()Ljava/util/Set;", "useTempTrackingTable", "getUseTempTrackingTable$room_runtime", "()Z", "setUseTempTrackingTable$room_runtime", "(Z)V", "isMigrationRequiredFrom", "version", "preparedStatementCacheSize", "getPreparedStatementCacheSize$room_runtime", "()I", "setPreparedStatementCacheSize$room_runtime", "(I)V", "isMigrationRequired", "fromVersion", "toVersion", MenuActionType.COPY, "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DatabaseConfiguration {
    public final boolean allowDestructiveMigrationForAllTables;
    public final boolean allowDestructiveMigrationOnDowngrade;
    public final boolean allowMainThreadQueries;

    @NotNull
    public final List<AutoMigrationSpec> autoMigrationSpecs;

    @Nullable
    public final List<RoomDatabase.Callback> callbacks;

    @NotNull
    public final Context context;

    @Nullable
    public final String copyFromAssetPath;

    @Nullable
    public final File copyFromFile;

    @Nullable
    public final Callable<InputStream> copyFromInputStream;

    @NotNull
    public final RoomDatabase.JournalMode journalMode;

    @NotNull
    public final RoomDatabase.MigrationContainer migrationContainer;

    @Nullable
    private final Set<Integer> migrationNotRequiredFrom;
    public final boolean multiInstanceInvalidation;

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @Nullable
    public final Intent multiInstanceInvalidationServiceIntent;

    @Nullable
    public final String name;

    @Nullable
    public final RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;
    private int preparedStatementCacheSize;

    @Nullable
    public final CoroutineContext queryCoroutineContext;

    @NotNull
    public final Executor queryExecutor;
    public final boolean requireMigration;

    @Nullable
    public final SQLiteDriver sqliteDriver;

    @Nullable
    public final SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    @NotNull
    public final Executor transactionExecutor;

    @NotNull
    public final List<Object> typeConverters;
    private boolean useTempTrackingTable;

    /* JADX WARN: Multi-variable type inference failed */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @Nullable SupportSQLiteOpenHelper.Factory factory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z13, @Nullable SQLiteDriver sQLiteDriver, @Nullable CoroutineContext coroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        this.context = context;
        this.name = str;
        this.sqliteOpenHelperFactory = factory;
        this.migrationContainer = migrationContainer;
        this.callbacks = list;
        this.allowMainThreadQueries = z10;
        this.journalMode = journalMode;
        this.queryExecutor = queryExecutor;
        this.transactionExecutor = transactionExecutor;
        this.multiInstanceInvalidationServiceIntent = intent;
        this.requireMigration = z11;
        this.allowDestructiveMigrationOnDowngrade = z12;
        this.migrationNotRequiredFrom = set;
        this.copyFromAssetPath = str2;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.prepackagedDatabaseCallback = prepackagedDatabaseCallback;
        this.typeConverters = typeConverters;
        this.autoMigrationSpecs = autoMigrationSpecs;
        this.allowDestructiveMigrationForAllTables = z13;
        this.sqliteDriver = sQLiteDriver;
        this.queryCoroutineContext = coroutineContext;
        this.multiInstanceInvalidation = intent != null;
        this.useTempTrackingTable = true;
        this.preparedStatementCacheSize = 25;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DatabaseConfiguration copy$default(DatabaseConfiguration databaseConfiguration, Context context, String str, SupportSQLiteOpenHelper.Factory factory, RoomDatabase.MigrationContainer migrationContainer, List list, boolean z10, RoomDatabase.JournalMode journalMode, Executor executor, Executor executor2, Intent intent, boolean z11, boolean z12, Set set, String str2, File file, Callable callable, RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, List list2, List list3, boolean z13, SQLiteDriver sQLiteDriver, CoroutineContext coroutineContext, int i10, Object obj) {
        CoroutineContext coroutineContext2;
        SQLiteDriver sQLiteDriver2;
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        Context context2 = (i10 & 1) != 0 ? databaseConfiguration.context : context;
        String str3 = (i10 & 2) != 0 ? databaseConfiguration.name : str;
        SupportSQLiteOpenHelper.Factory factory2 = (i10 & 4) != 0 ? databaseConfiguration.sqliteOpenHelperFactory : factory;
        RoomDatabase.MigrationContainer migrationContainer2 = (i10 & 8) != 0 ? databaseConfiguration.migrationContainer : migrationContainer;
        List list4 = (i10 & 16) != 0 ? databaseConfiguration.callbacks : list;
        boolean z14 = (i10 & 32) != 0 ? databaseConfiguration.allowMainThreadQueries : z10;
        RoomDatabase.JournalMode journalMode2 = (i10 & 64) != 0 ? databaseConfiguration.journalMode : journalMode;
        Executor executor3 = (i10 & 128) != 0 ? databaseConfiguration.queryExecutor : executor;
        Executor executor4 = (i10 & 256) != 0 ? databaseConfiguration.transactionExecutor : executor2;
        Intent intent2 = (i10 & 512) != 0 ? databaseConfiguration.multiInstanceInvalidationServiceIntent : intent;
        boolean z15 = (i10 & 1024) != 0 ? databaseConfiguration.requireMigration : z11;
        boolean z16 = (i10 & 2048) != 0 ? databaseConfiguration.allowDestructiveMigrationOnDowngrade : z12;
        Set set2 = (i10 & 4096) != 0 ? databaseConfiguration.migrationNotRequiredFrom : set;
        String str4 = (i10 & 8192) != 0 ? databaseConfiguration.copyFromAssetPath : str2;
        Context context3 = context2;
        File file2 = (i10 & 16384) != 0 ? databaseConfiguration.copyFromFile : file;
        Callable callable2 = (i10 & 32768) != 0 ? databaseConfiguration.copyFromInputStream : callable;
        RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback2 = (i10 & 65536) != 0 ? databaseConfiguration.prepackagedDatabaseCallback : prepackagedDatabaseCallback;
        List list5 = (i10 & 131072) != 0 ? databaseConfiguration.typeConverters : list2;
        List list6 = (i10 & 262144) != 0 ? databaseConfiguration.autoMigrationSpecs : list3;
        boolean z17 = (i10 & 524288) != 0 ? databaseConfiguration.allowDestructiveMigrationForAllTables : z13;
        SQLiteDriver sQLiteDriver3 = (i10 & 1048576) != 0 ? databaseConfiguration.sqliteDriver : sQLiteDriver;
        if ((i10 & 2097152) != 0) {
            sQLiteDriver2 = sQLiteDriver3;
            coroutineContext2 = databaseConfiguration.queryCoroutineContext;
        } else {
            coroutineContext2 = coroutineContext;
            sQLiteDriver2 = sQLiteDriver3;
        }
        return databaseConfiguration.copy(context3, str3, factory2, migrationContainer2, list4, z14, journalMode2, executor3, executor4, intent2, z15, z16, set2, str4, file2, callable2, prepackagedDatabaseCallback2, list5, list6, z17, sQLiteDriver2, coroutineContext2);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @NotNull
    public final DatabaseConfiguration copy(@NotNull Context context, @Nullable String name, @Nullable SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> callbacks, boolean allowMainThreadQueries, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent multiInstanceInvalidationServiceIntent, boolean requireMigration, boolean allowDestructiveMigrationOnDowngrade, @Nullable Set<Integer> migrationNotRequiredFrom, @Nullable String copyFromAssetPath, @Nullable File copyFromFile, @Nullable Callable<InputStream> copyFromInputStream, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean allowDestructiveMigrationForAllTables, @Nullable SQLiteDriver sqliteDriver, @Nullable CoroutineContext queryCoroutineContext) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
        DatabaseConfiguration databaseConfiguration = new DatabaseConfiguration(context, name, sqliteOpenHelperFactory, migrationContainer, callbacks, allowMainThreadQueries, journalMode, queryExecutor, transactionExecutor, multiInstanceInvalidationServiceIntent, requireMigration, allowDestructiveMigrationOnDowngrade, migrationNotRequiredFrom, copyFromAssetPath, copyFromFile, copyFromInputStream, prepackagedDatabaseCallback, typeConverters, autoMigrationSpecs, allowDestructiveMigrationForAllTables, sqliteDriver, queryCoroutineContext);
        databaseConfiguration.useTempTrackingTable = this.useTempTrackingTable;
        databaseConfiguration.preparedStatementCacheSize = this.preparedStatementCacheSize;
        return databaseConfiguration;
    }

    @Nullable
    public final Set<Integer> getMigrationNotRequiredFrom$room_runtime() {
        return this.migrationNotRequiredFrom;
    }

    /* JADX INFO: renamed from: getPreparedStatementCacheSize$room_runtime, reason: from getter */
    public final int getPreparedStatementCacheSize() {
        return this.preparedStatementCacheSize;
    }

    /* JADX INFO: renamed from: getUseTempTrackingTable$room_runtime, reason: from getter */
    public final boolean getUseTempTrackingTable() {
        return this.useTempTrackingTable;
    }

    public boolean isMigrationRequired(int fromVersion, int toVersion) {
        return MigrationUtil.isMigrationRequired(this, fromVersion, toVersion);
    }

    public boolean isMigrationRequiredFrom(int version) {
        return isMigrationRequired(version, version + 1);
    }

    public final void setPreparedStatementCacheSize$room_runtime(int i10) {
        this.preparedStatementCacheSize = i10;
    }

    public final void setUseTempTrackingTable$room_runtime(boolean z10) {
        this.useTempTrackingTable = z10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, boolean z11, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, queryExecutor, null, z11, false, set, null, null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, null, null, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, null, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, prepackagedDatabaseCallback, typeConverters, CollectionsKt.emptyList(), false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, boolean z11, boolean z12, boolean z13, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, z11 ? new Intent(context, (Class<?>) MultiInstanceInvalidationService.class) : null, z12, z13, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @SuppressLint({"LambdaLast"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, false, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@NotNull Context context, @Nullable String str, @NotNull SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory, @NotNull RoomDatabase.MigrationContainer migrationContainer, @Nullable List<? extends RoomDatabase.Callback> list, boolean z10, @NotNull RoomDatabase.JournalMode journalMode, @NotNull Executor queryExecutor, @NotNull Executor transactionExecutor, @Nullable Intent intent, boolean z11, boolean z12, @Nullable Set<Integer> set, @Nullable String str2, @Nullable File file, @Nullable Callable<InputStream> callable, @Nullable RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback, @NotNull List<? extends Object> typeConverters, @NotNull List<? extends AutoMigrationSpec> autoMigrationSpecs, boolean z13) {
        this(context, str, sqliteOpenHelperFactory, migrationContainer, list, z10, journalMode, queryExecutor, transactionExecutor, intent, z11, z12, set, str2, file, callable, null, typeConverters, autoMigrationSpecs, z13, null, null);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sqliteOpenHelperFactory, "sqliteOpenHelperFactory");
        Intrinsics.checkNotNullParameter(migrationContainer, "migrationContainer");
        Intrinsics.checkNotNullParameter(journalMode, "journalMode");
        Intrinsics.checkNotNullParameter(queryExecutor, "queryExecutor");
        Intrinsics.checkNotNullParameter(transactionExecutor, "transactionExecutor");
        Intrinsics.checkNotNullParameter(typeConverters, "typeConverters");
        Intrinsics.checkNotNullParameter(autoMigrationSpecs, "autoMigrationSpecs");
    }
}
