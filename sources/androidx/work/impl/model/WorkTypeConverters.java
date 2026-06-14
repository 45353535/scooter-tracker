package androidx.work.impl.model;

import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import androidx.room.TypeConverter;
import androidx.work.BackoffPolicy;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OutOfQuotaPolicy;
import androidx.work.WorkInfo;
import androidx.work.impl.utils.NetworkRequest28;
import androidx.work.impl.utils.NetworkRequestCompat;
import androidx.work.impl.utils.NetworkRequestCompatKt;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\bÆ\u0002\u0018\u00002\u00020\u0001:\u0004#$%&B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u0014H\u0007J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u0005H\u0007J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0007J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u0017H\u0007J\u0015\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u0017H\u0001¢\u0006\u0002\b\u001fJ\u0015\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u001eH\u0001¢\u0006\u0002\b\"¨\u0006'"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters;", "", "<init>", "()V", "stateToInt", "", "state", "Landroidx/work/WorkInfo$State;", "intToState", "value", "backoffPolicyToInt", "backoffPolicy", "Landroidx/work/BackoffPolicy;", "intToBackoffPolicy", "networkTypeToInt", "networkType", "Landroidx/work/NetworkType;", "intToNetworkType", "outOfQuotaPolicyToInt", "policy", "Landroidx/work/OutOfQuotaPolicy;", "intToOutOfQuotaPolicy", "setOfTriggersToByteArray", "", "triggers", "", "Landroidx/work/Constraints$ContentUriTrigger;", "byteArrayToSetOfTriggers", "bytes", "toNetworkRequest", "Landroidx/work/impl/utils/NetworkRequestCompat;", "toNetworkRequest$work_runtime_release", "fromNetworkRequest", "requestCompat", "fromNetworkRequest$work_runtime_release", "StateIds", "BackoffPolicyIds", "NetworkTypeIds", "OutOfPolicyIds", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class WorkTypeConverters {

    @NotNull
    public static final WorkTypeConverters INSTANCE = new WorkTypeConverters();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$BackoffPolicyIds;", "", "<init>", "()V", "EXPONENTIAL", "", "LINEAR", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BackoffPolicyIds {
        public static final int EXPONENTIAL = 0;

        @NotNull
        public static final BackoffPolicyIds INSTANCE = new BackoffPolicyIds();
        public static final int LINEAR = 1;

        private BackoffPolicyIds() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$NetworkTypeIds;", "", "<init>", "()V", "NOT_REQUIRED", "", "CONNECTED", "UNMETERED", "NOT_ROAMING", "METERED", "TEMPORARILY_UNMETERED", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class NetworkTypeIds {
        public static final int CONNECTED = 1;

        @NotNull
        public static final NetworkTypeIds INSTANCE = new NetworkTypeIds();
        public static final int METERED = 4;
        public static final int NOT_REQUIRED = 0;
        public static final int NOT_ROAMING = 3;
        public static final int TEMPORARILY_UNMETERED = 5;
        public static final int UNMETERED = 2;

        private NetworkTypeIds() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$OutOfPolicyIds;", "", "<init>", "()V", "RUN_AS_NON_EXPEDITED_WORK_REQUEST", "", "DROP_WORK_REQUEST", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class OutOfPolicyIds {
        public static final int DROP_WORK_REQUEST = 1;

        @NotNull
        public static final OutOfPolicyIds INSTANCE = new OutOfPolicyIds();
        public static final int RUN_AS_NON_EXPEDITED_WORK_REQUEST = 0;

        private OutOfPolicyIds() {
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0086T¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/work/impl/model/WorkTypeConverters$StateIds;", "", "<init>", "()V", "ENQUEUED", "", "RUNNING", "SUCCEEDED", "FAILED", "BLOCKED", "CANCELLED", "COMPLETED_STATES", "", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class StateIds {
        public static final int BLOCKED = 4;
        public static final int CANCELLED = 5;

        @NotNull
        public static final String COMPLETED_STATES = "(2, 3, 5)";
        public static final int ENQUEUED = 0;
        public static final int FAILED = 3;

        @NotNull
        public static final StateIds INSTANCE = new StateIds();
        public static final int RUNNING = 1;
        public static final int SUCCEEDED = 2;

        private StateIds() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[WorkInfo.State.values().length];
            try {
                iArr[WorkInfo.State.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[WorkInfo.State.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[WorkInfo.State.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[WorkInfo.State.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[WorkInfo.State.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[WorkInfo.State.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[BackoffPolicy.values().length];
            try {
                iArr2[BackoffPolicy.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[BackoffPolicy.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[NetworkType.values().length];
            try {
                iArr3[NetworkType.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NetworkType.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr3[NetworkType.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr3[NetworkType.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr3[NetworkType.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[OutOfQuotaPolicy.values().length];
            try {
                iArr4[OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr4[OutOfQuotaPolicy.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    private WorkTypeConverters() {
    }

    @TypeConverter
    public static final int backoffPolicyToInt(@NotNull BackoffPolicy backoffPolicy) {
        Intrinsics.checkNotNullParameter(backoffPolicy, "backoffPolicy");
        int i10 = WhenMappings.$EnumSwitchMapping$1[backoffPolicy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new lf.m();
    }

    @TypeConverter
    @NotNull
    public static final Set<Constraints.ContentUriTrigger> byteArrayToSetOfTriggers(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (bytes.length == 0) {
            return linkedHashSet;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            try {
                ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
                try {
                    int i10 = objectInputStream.readInt();
                    for (int i11 = 0; i11 < i10; i11++) {
                        Uri uri = Uri.parse(objectInputStream.readUTF());
                        boolean z10 = objectInputStream.readBoolean();
                        Intrinsics.checkNotNull(uri);
                        linkedHashSet.add(new Constraints.ContentUriTrigger(uri, z10));
                    }
                    Unit unit = Unit.f93236a;
                    uf.c.a(objectInputStream, null);
                } finally {
                }
            } catch (IOException e10) {
                e10.printStackTrace();
            }
            Unit unit2 = Unit.f93236a;
            uf.c.a(byteArrayInputStream, null);
            return linkedHashSet;
        } finally {
        }
    }

    @TypeConverter
    @NotNull
    public static final byte[] fromNetworkRequest$work_runtime_release(@NotNull NetworkRequestCompat requestCompat) throws IOException {
        Intrinsics.checkNotNullParameter(requestCompat, "requestCompat");
        if (Build.VERSION.SDK_INT < 28) {
            return new byte[0];
        }
        NetworkRequest networkRequest = requestCompat.getNetworkRequest();
        if (networkRequest == null) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                int[] transportTypesCompat = NetworkRequestCompatKt.getTransportTypesCompat(networkRequest);
                int[] capabilitiesCompat = NetworkRequestCompatKt.getCapabilitiesCompat(networkRequest);
                objectOutputStream.writeInt(transportTypesCompat.length);
                for (int i10 : transportTypesCompat) {
                    objectOutputStream.writeInt(i10);
                }
                objectOutputStream.writeInt(capabilitiesCompat.length);
                for (int i11 : capabilitiesCompat) {
                    objectOutputStream.writeInt(i11);
                }
                Unit unit = Unit.f93236a;
                uf.c.a(objectOutputStream, null);
                uf.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @TypeConverter
    @NotNull
    public static final BackoffPolicy intToBackoffPolicy(int value) {
        if (value == 0) {
            return BackoffPolicy.EXPONENTIAL;
        }
        if (value == 1) {
            return BackoffPolicy.LINEAR;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to BackoffPolicy");
    }

    @TypeConverter
    @NotNull
    public static final NetworkType intToNetworkType(int value) {
        if (value == 0) {
            return NetworkType.NOT_REQUIRED;
        }
        if (value == 1) {
            return NetworkType.CONNECTED;
        }
        if (value == 2) {
            return NetworkType.UNMETERED;
        }
        if (value == 3) {
            return NetworkType.NOT_ROAMING;
        }
        if (value == 4) {
            return NetworkType.METERED;
        }
        if (Build.VERSION.SDK_INT >= 30 && value == 5) {
            return NetworkType.TEMPORARILY_UNMETERED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to NetworkType");
    }

    @TypeConverter
    @NotNull
    public static final OutOfQuotaPolicy intToOutOfQuotaPolicy(int value) {
        if (value == 0) {
            return OutOfQuotaPolicy.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return OutOfQuotaPolicy.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to OutOfQuotaPolicy");
    }

    @TypeConverter
    @NotNull
    public static final WorkInfo.State intToState(int value) {
        if (value == 0) {
            return WorkInfo.State.ENQUEUED;
        }
        if (value == 1) {
            return WorkInfo.State.RUNNING;
        }
        if (value == 2) {
            return WorkInfo.State.SUCCEEDED;
        }
        if (value == 3) {
            return WorkInfo.State.FAILED;
        }
        if (value == 4) {
            return WorkInfo.State.BLOCKED;
        }
        if (value == 5) {
            return WorkInfo.State.CANCELLED;
        }
        throw new IllegalArgumentException("Could not convert " + value + " to State");
    }

    @TypeConverter
    public static final int networkTypeToInt(@NotNull NetworkType networkType) {
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        int i10 = WhenMappings.$EnumSwitchMapping$2[networkType.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        if (i10 == 3) {
            return 2;
        }
        if (i10 == 4) {
            return 3;
        }
        if (i10 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == NetworkType.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @TypeConverter
    public static final int outOfQuotaPolicyToInt(@NotNull OutOfQuotaPolicy policy) {
        Intrinsics.checkNotNullParameter(policy, "policy");
        int i10 = WhenMappings.$EnumSwitchMapping$3[policy.ordinal()];
        if (i10 == 1) {
            return 0;
        }
        if (i10 == 2) {
            return 1;
        }
        throw new lf.m();
    }

    @TypeConverter
    @NotNull
    public static final byte[] setOfTriggersToByteArray(@NotNull Set<Constraints.ContentUriTrigger> triggers) throws IOException {
        Intrinsics.checkNotNullParameter(triggers, "triggers");
        if (triggers.isEmpty()) {
            return new byte[0];
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeInt(triggers.size());
                for (Constraints.ContentUriTrigger contentUriTrigger : triggers) {
                    objectOutputStream.writeUTF(contentUriTrigger.getUri().toString());
                    objectOutputStream.writeBoolean(contentUriTrigger.getIsTriggeredForDescendants());
                }
                Unit unit = Unit.f93236a;
                uf.c.a(objectOutputStream, null);
                uf.c.a(byteArrayOutputStream, null);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
                return byteArray;
            } finally {
            }
        } finally {
        }
    }

    @TypeConverter
    public static final int stateToInt(@NotNull WorkInfo.State state) {
        Intrinsics.checkNotNullParameter(state, "state");
        switch (WhenMappings.$EnumSwitchMapping$0[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new lf.m();
        }
    }

    @TypeConverter
    @NotNull
    public static final NetworkRequestCompat toNetworkRequest$work_runtime_release(@NotNull byte[] bytes) throws IOException {
        Intrinsics.checkNotNullParameter(bytes, "bytes");
        if (Build.VERSION.SDK_INT < 28 || bytes.length == 0) {
            return new NetworkRequestCompat(null);
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bytes);
        try {
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                int i10 = objectInputStream.readInt();
                int[] iArr = new int[i10];
                for (int i11 = 0; i11 < i10; i11++) {
                    iArr[i11] = objectInputStream.readInt();
                }
                int i12 = objectInputStream.readInt();
                int[] iArr2 = new int[i12];
                for (int i13 = 0; i13 < i12; i13++) {
                    iArr2[i13] = objectInputStream.readInt();
                }
                NetworkRequestCompat networkRequestCompatCreateNetworkRequestCompat$work_runtime_release = NetworkRequest28.INSTANCE.createNetworkRequestCompat$work_runtime_release(iArr2, iArr);
                uf.c.a(objectInputStream, null);
                uf.c.a(byteArrayInputStream, null);
                return networkRequestCompatCreateNetworkRequestCompat$work_runtime_release;
            } finally {
            }
        } finally {
        }
    }
}
