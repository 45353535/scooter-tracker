package com.google.firebase.logger;

import android.util.Log;
import androidx.annotation.VisibleForTesting;
import androidx.core.app.NotificationCompat;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.A1;
import com.mobilefuse.sdk.identity.EidRequestBuilder;
import com.taurusx.tax.f.y;
import com.taurusx.tax.y.z.w.s;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.a1;
import kotlin.text.StringsKt;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import qf.a;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0002\b\u001f\b&\u0018\u0000 +2\u00020\u0001:\u0004,-.+B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ=\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0012\b\u0002\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0016J;\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0017\u0010\u0016J;\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0014J#\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0018\u0010\u0016J;\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0014J#\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u0019\u0010\u0016J;\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u00022\u0016\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f\"\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u0014J#\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u0016J;\u0010\u001b\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\r\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00010\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH&¢\u0006\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*¨\u0006/"}, d2 = {"Lcom/google/firebase/logger/Logger;", "", "", s.z.f67720z, "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "args", "", "throwable", "", "a", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "verbose", "(Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", NotificationCompat.CATEGORY_MESSAGE, "(Ljava/lang/String;Ljava/lang/Throwable;)I", "debug", "info", "warn", "error", s.z.f67719y, "Ljava/lang/String;", "getTag", "()Ljava/lang/String;", "b", "Z", "getEnabled", "()Z", "setEnabled", "(Z)V", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "Lcom/google/firebase/logger/Logger$Level;", "getMinLevel", "()Lcom/google/firebase/logger/Logger$Level;", "setMinLevel", "(Lcom/google/firebase/logger/Logger$Level;)V", y.f66058y, "AndroidLogger", "FakeLogger", "Level", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class Logger {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ConcurrentHashMap f32931d = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String tag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean enabled;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Level minLevel;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ9\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00032\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00100\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/google/firebase/logger/Logger$AndroidLogger;", "Lcom/google/firebase/logger/Logger;", s.z.f67720z, "", "enabled", "", "minLevel", "Lcom/google/firebase/logger/Logger$Level;", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", s.z.f67719y, "", "level", "format", "args", "", "", "throwable", "", "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class AndroidLogger extends Logger {

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Level.values().length];
                try {
                    iArr[Level.VERBOSE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Level.DEBUG.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Level.INFO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Level.WARN.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[Level.ERROR.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AndroidLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            super(tag, z10, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            if (args.length != 0) {
                a1 a1Var = a1.f93282a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            }
            int i10 = WhenMappings.$EnumSwitchMapping$0[level.ordinal()];
            if (i10 == 1) {
                String tag = getTag();
                return throwable != null ? Log.v(tag, format, throwable) : Log.v(tag, format);
            }
            if (i10 == 2) {
                String tag2 = getTag();
                return throwable != null ? Log.d(tag2, format, throwable) : Log.d(tag2, format);
            }
            if (i10 == 3) {
                String tag3 = getTag();
                return throwable != null ? Log.i(tag3, format, throwable) : Log.i(tag3, format);
            }
            if (i10 == 4) {
                String tag4 = getTag();
                return throwable != null ? Log.w(tag4, format, throwable) : Log.w(tag4, format);
            }
            if (i10 != 5) {
                throw new m();
            }
            String tag5 = getTag();
            return throwable != null ? Log.e(tag5, format, throwable) : Log.e(tag5, format);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fR \u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/google/firebase/logger/Logger$Companion;", "", "<init>", "()V", "", s.z.f67720z, "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "Lcom/google/firebase/logger/Logger;", "getLogger", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)Lcom/google/firebase/logger/Logger;", "Lcom/google/firebase/logger/Logger$FakeLogger;", "setupFakeLogger", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)Lcom/google/firebase/logger/Logger$FakeLogger;", "j$/util/concurrent/ConcurrentHashMap", A1.f40166a, "Lj$/util/concurrent/ConcurrentHashMap;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ Logger getLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.INFO;
            }
            return companion.getLogger(str, z10, level);
        }

        public static /* synthetic */ FakeLogger setupFakeLogger$default(Companion companion, String str, boolean z10, Level level, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                z10 = true;
            }
            if ((i10 & 4) != 0) {
                level = Level.DEBUG;
            }
            return companion.setupFakeLogger(str, z10, level);
        }

        @NotNull
        public final Logger getLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            Object objPutIfAbsent;
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            ConcurrentHashMap concurrentHashMap = Logger.f32931d;
            Object androidLogger = concurrentHashMap.get(tag);
            if (androidLogger == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(tag, (androidLogger = new AndroidLogger(tag, enabled, minLevel)))) != null) {
                androidLogger = objPutIfAbsent;
            }
            Intrinsics.checkNotNullExpressionValue(androidLogger, "getOrPut(...)");
            return (Logger) androidLogger;
        }

        @VisibleForTesting
        @NotNull
        public final FakeLogger setupFakeLogger(@NotNull String tag, boolean enabled, @NotNull Level minLevel) {
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            FakeLogger fakeLogger = new FakeLogger(tag, enabled, minLevel);
            Logger.f32931d.put(tag, fakeLogger);
            return fakeLogger;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ;\u0010\u0011\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J;\u0010\u0014\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00022\u0010\u0010\u000e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\r0\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ#\u0010\u001e\u001a\u00020\u00042\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u001cH\u0007¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/google/firebase/logger/Logger$FakeLogger;", "Lcom/google/firebase/logger/Logger;", "", s.z.f67720z, "", "enabled", "Lcom/google/firebase/logger/Logger$Level;", "minLevel", "<init>", "(Ljava/lang/String;ZLcom/google/firebase/logger/Logger$Level;)V", "level", "format", "", "", "args", "", "throwable", ApsMetricsDataMap.APSMETRICS_FIELD_CUSTOM, "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/String;", "", s.z.f67719y, "(Lcom/google/firebase/logger/Logger$Level;Ljava/lang/String;[Ljava/lang/Object;Ljava/lang/Throwable;)I", "", "clearLogMessages", "()V", PglCryptUtils.KEY_MESSAGE, "hasLogMessage", "(Ljava/lang/String;)Z", "Lkotlin/Function1;", "predicate", "hasLogMessageThat", "(Lkotlin/jvm/functions/Function1;)Z", "", EidRequestBuilder.REQUEST_FIELD_EMAIL, "Ljava/util/List;", "record", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @VisibleForTesting
    public static final class FakeLogger extends Logger {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final List record;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FakeLogger(@NotNull String tag, boolean z10, @NotNull Level minLevel) {
            super(tag, z10, minLevel, null);
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(minLevel, "minLevel");
            this.record = new ArrayList();
        }

        private final String c(Level level, String format, Object[] args, Throwable throwable) {
            if (args.length != 0) {
                a1 a1Var = a1.f93282a;
                Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
                format = String.format(format, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            }
            if (throwable != null) {
                String str = level + ' ' + format + ' ' + Log.getStackTraceString(throwable);
                if (str != null) {
                    return str;
                }
            }
            return level + ' ' + format;
        }

        @VisibleForTesting
        public final void clearLogMessages() {
            this.record.clear();
        }

        @VisibleForTesting
        public final boolean hasLogMessage(@NotNull String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            List list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.g0((String) it.next(), message, false, 2, null)) {
                    return true;
                }
            }
            return false;
        }

        @VisibleForTesting
        public final boolean hasLogMessageThat(@NotNull Function1<? super String, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            List list = this.record;
            if ((list instanceof Collection) && list.isEmpty()) {
                return false;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (predicate.invoke(it.next()).booleanValue()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.firebase.logger.Logger
        public int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(format, "format");
            Intrinsics.checkNotNullParameter(args, "args");
            String strC = c(level, format, args, throwable);
            System.out.println((Object) ("Log: " + strC));
            this.record.add(strC);
            return strC.length();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/google/firebase/logger/Logger$Level;", "", "", HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, "<init>", "(Ljava/lang/String;II)V", "b", "I", "getPriority$com_google_firebase_firebase_common", "()I", "VERBOSE", "DEBUG", "INFO", "WARN", "ERROR", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Level {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ Level[] f32936c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f32937d;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int priority;
        public static final Level VERBOSE = new Level("VERBOSE", 0, 2);
        public static final Level DEBUG = new Level("DEBUG", 1, 3);
        public static final Level INFO = new Level("INFO", 2, 4);
        public static final Level WARN = new Level("WARN", 3, 5);
        public static final Level ERROR = new Level("ERROR", 4, 6);

        static {
            Level[] levelArrD = d();
            f32936c = levelArrD;
            f32937d = a.a(levelArrD);
        }

        private Level(String str, int i10, int i11) {
            this.priority = i11;
        }

        private static final /* synthetic */ Level[] d() {
            return new Level[]{VERBOSE, DEBUG, INFO, WARN, ERROR};
        }

        @NotNull
        public static EnumEntries getEntries() {
            return f32937d;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) f32936c.clone();
        }

        /* JADX INFO: renamed from: getPriority$com_google_firebase_firebase_common, reason: from getter */
        public final int getPriority() {
            return this.priority;
        }
    }

    public /* synthetic */ Logger(String str, boolean z10, Level level, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, z10, level);
    }

    private final int a(Level level, String format, Object[] args, Throwable throwable) {
        if (!this.enabled) {
            return 0;
        }
        if (this.minLevel.getPriority() <= level.getPriority() || Log.isLoggable(this.tag, level.getPriority())) {
            return log(level, format, args, throwable);
        }
        return 0;
    }

    static /* synthetic */ int b(Logger logger, Level level, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: logIfAble");
        }
        if ((i10 & 4) != 0) {
            objArr = new Object[0];
        }
        return logger.a(level, str, objArr, th2);
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.debug(str, objArr, th2);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.error(str, objArr, th2);
    }

    @NotNull
    public static final Logger getLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return INSTANCE.getLogger(str, z10, level);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.info(str, objArr, th2);
    }

    @VisibleForTesting
    @NotNull
    public static final FakeLogger setupFakeLogger(@NotNull String str, boolean z10, @NotNull Level level) {
        return INSTANCE.setupFakeLogger(str, z10, level);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.verbose(str, objArr, th2);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Object[] objArr, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 4) != 0) {
            th2 = null;
        }
        return logger.warn(str, objArr, th2);
    }

    public final int debug(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return debug$default(this, msg, null, 2, null);
    }

    public final int error(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return error$default(this, msg, null, 2, null);
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @NotNull
    public final Level getMinLevel() {
        return this.minLevel;
    }

    @NotNull
    public final String getTag() {
        return this.tag;
    }

    public final int info(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return info$default(this, msg, null, 2, null);
    }

    public abstract int log(@NotNull Level level, @NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable);

    public final void setEnabled(boolean z10) {
        this.enabled = z10;
    }

    public final void setMinLevel(@NotNull Level level) {
        Intrinsics.checkNotNullParameter(level, "<set-?>");
        this.minLevel = level;
    }

    public final int verbose(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return verbose$default(this, msg, null, 2, null);
    }

    public final int warn(@NotNull String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return warn$default(this, msg, null, 2, null);
    }

    private Logger(String str, boolean z10, Level level) {
        this.tag = str;
        this.enabled = z10;
        this.minLevel = level;
    }

    public static /* synthetic */ int debug$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: debug");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.debug(str, th2);
    }

    public static /* synthetic */ int error$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: error");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.error(str, th2);
    }

    public static /* synthetic */ int info$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: info");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.info(str, th2);
    }

    public static /* synthetic */ int verbose$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verbose");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.verbose(str, th2);
    }

    public static /* synthetic */ int warn$default(Logger logger, String str, Throwable th2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: warn");
        }
        if ((i10 & 2) != 0) {
            th2 = null;
        }
        return logger.warn(str, th2);
    }

    public final int debug(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return debug$default(this, format, args, null, 4, null);
    }

    public final int error(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return error$default(this, format, args, null, 4, null);
    }

    public final int info(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return info$default(this, format, args, null, 4, null);
    }

    public final int verbose(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return verbose$default(this, format, args, null, 4, null);
    }

    public final int warn(@NotNull String format, @NotNull Object... args) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return warn$default(this, format, args, null, 4, null);
    }

    public final int debug(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.DEBUG, format, args, throwable);
    }

    public final int error(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.ERROR, format, args, throwable);
    }

    public final int info(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.INFO, format, args, throwable);
    }

    public final int verbose(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.VERBOSE, format, args, throwable);
    }

    public final int warn(@NotNull String format, @NotNull Object[] args, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(format, "format");
        Intrinsics.checkNotNullParameter(args, "args");
        return a(Level.WARN, format, args, throwable);
    }

    public final int debug(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return b(this, Level.DEBUG, msg, null, throwable, 4, null);
    }

    public final int error(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return b(this, Level.ERROR, msg, null, throwable, 4, null);
    }

    public final int info(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return b(this, Level.INFO, msg, null, throwable, 4, null);
    }

    public final int verbose(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return b(this, Level.VERBOSE, msg, null, throwable, 4, null);
    }

    public final int warn(@NotNull String msg, @Nullable Throwable throwable) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        return b(this, Level.WARN, msg, null, throwable, 4, null);
    }
}
