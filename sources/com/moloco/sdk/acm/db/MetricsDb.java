package com.moloco.sdk.acm.db;

import android.content.Context;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
@TypeConverters({a.class})
@Database(entities = {b.class}, version = 1)
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b!\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/moloco/sdk/acm/db/MetricsDb;", "Landroidx/room/RoomDatabase;", "<init>", "()V", "Lcom/moloco/sdk/acm/db/d;", "g", "()Lcom/moloco/sdk/acm/db/d;", "a", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0})
public abstract class MetricsDb extends RoomDatabase {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile MetricsDb f53955b;

    /* JADX INFO: renamed from: com.moloco.sdk.acm.db.MetricsDb$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MetricsDb a(Context context) {
            try {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
                return (MetricsDb) Room.databaseBuilder(applicationContext, MetricsDb.class, "metrics-db").build();
            } catch (Exception e10) {
                throw new IllegalStateException("Database creation failed", e10);
            }
        }

        public final MetricsDb b(Context context) {
            MetricsDb metricsDbA;
            Intrinsics.checkNotNullParameter(context, "context");
            MetricsDb metricsDb = MetricsDb.f53955b;
            if (metricsDb != null) {
                return metricsDb;
            }
            synchronized (this) {
                metricsDbA = MetricsDb.f53955b;
                if (metricsDbA == null) {
                    metricsDbA = MetricsDb.INSTANCE.a(context);
                    MetricsDb.f53955b = metricsDbA;
                }
            }
            return metricsDbA;
        }

        public Companion() {
        }
    }

    public abstract d g();
}
