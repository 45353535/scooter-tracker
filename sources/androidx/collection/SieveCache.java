package androidx.collection;

import androidx.annotation.IntRange;
import androidx.collection.internal.ContainerHelpersKt;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.ironsource.C4240b4;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import lf.v;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u0001By\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u001a\b\u0002\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u0007\u0012\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t\u0012(\b\u0002\u0010\u000e\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0012J\u000f\u0010\u0015\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0018\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001a\u0010\u0012J\u0019\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010\u001d\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001d\u0010\u0012J\u0018\u0010\u001e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001e\u0010\u0012J\u0017\u0010 \u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00028\u0000H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u0004H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010(\u001a\u00020\r2\u0006\u0010'\u001a\u00020*H\u0002¢\u0006\u0004\b(\u0010+J\r\u0010,\u001a\u00020\f¢\u0006\u0004\b,\u0010-J\r\u0010.\u001a\u00020\f¢\u0006\u0004\b.\u0010-J\r\u0010/\u001a\u00020\f¢\u0006\u0004\b/\u0010-J\r\u00100\u001a\u00020\f¢\u0006\u0004\b0\u0010-J\u001a\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b1\u00102J \u00104\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0001H\u0086\n¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0001¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\r2\u001a\u0010:\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010908¢\u0006\u0004\b;\u0010<J'\u0010;\u001a\u00020\r2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001090=¢\u0006\u0004\b;\u0010>J'\u0010;\u001a\u00020\r2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001090?¢\u0006\u0004\b;\u0010@J!\u0010;\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010A¢\u0006\u0004\b;\u0010CJ!\u0010;\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010D¢\u0006\u0004\b;\u0010EJ!\u0010;\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000¢\u0006\u0004\b;\u0010FJ$\u0010H\u001a\u00020\r2\u0012\u0010G\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000109H\u0086\n¢\u0006\u0004\bH\u0010IJ,\u0010H\u001a\u00020\r2\u001a\u0010:\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010908H\u0086\n¢\u0006\u0004\bH\u0010<J*\u0010H\u001a\u00020\r2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001090=H\u0086\n¢\u0006\u0004\bH\u0010>J*\u0010H\u001a\u00020\r2\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001090?H\u0086\n¢\u0006\u0004\bH\u0010@J$\u0010H\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010AH\u0086\n¢\u0006\u0004\bH\u0010CJ$\u0010H\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010DH\u0086\n¢\u0006\u0004\bH\u0010EJ$\u0010H\u001a\u00020\r2\u0012\u0010B\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0086\n¢\u0006\u0004\bH\u0010FJ\u0017\u0010J\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\bJ\u00102J\u001d\u0010J\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u0001¢\u0006\u0004\bJ\u0010KJ'\u0010M\u001a\u00020\r2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u0007¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\n¢\u0006\u0004\bO\u0010PJ \u0010O\u001a\u00020\r2\u000e\u0010Q\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u000008H\u0086\n¢\u0006\u0004\bO\u0010RJ\u001e\u0010O\u001a\u00020\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000=H\u0086\n¢\u0006\u0004\bO\u0010>J\u001e\u0010O\u001a\u00020\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000?H\u0086\n¢\u0006\u0004\bO\u0010@J\u001e\u0010O\u001a\u00020\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000SH\u0086\n¢\u0006\u0004\bO\u0010TJ\u001e\u0010O\u001a\u00020\r2\f\u0010Q\u001a\b\u0012\u0004\u0012\u00028\u00000UH\u0086\n¢\u0006\u0004\bO\u0010VJ\r\u0010W\u001a\u00020\r¢\u0006\u0004\bW\u0010\u0016J\u0017\u0010X\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bX\u0010\u0012J\u0015\u0010Y\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\bY\u0010\u0012J-\u0010[\u001a\u00020\r2\u0018\u0010Z\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b[\u0010NJ'\u0010\\\u001a\u00020\r2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\r0\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]J'\u0010^\u001a\u00020\r2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\r0\tH\u0086\bø\u0001\u0000¢\u0006\u0004\b^\u0010]J-\u0010_\u001a\u00020\f2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b_\u0010`J-\u0010,\u001a\u00020\f2\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\b,\u0010`J\r\u0010a\u001a\u00020\u0004¢\u0006\u0004\ba\u0010\u0018J-\u0010a\u001a\u00020\u00042\u0018\u0010L\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\f0\u0007H\u0086\bø\u0001\u0000¢\u0006\u0004\ba\u0010bJ\u0018\u0010c\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bc\u0010dJ\u0015\u0010e\u001a\u00020\f2\u0006\u0010\u001f\u001a\u00028\u0000¢\u0006\u0004\be\u0010dJ\u0015\u0010f\u001a\u00020\f2\u0006\u00103\u001a\u00028\u0001¢\u0006\u0004\bf\u0010dJ\u000f\u0010h\u001a\u00020\rH\u0000¢\u0006\u0004\bg\u0010\u0016J\u000f\u0010j\u001a\u00020\rH\u0000¢\u0006\u0004\bi\u0010\u0016J\u0017\u0010m\u001a\u00020\r2\u0006\u0010k\u001a\u00020\u0004H\u0000¢\u0006\u0004\bl\u0010\u0012J'\u0010n\u001a\u00020\r2\u0012\u0010Z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\r0\tH\u0081\bø\u0001\u0000¢\u0006\u0004\bn\u0010]J\u000f\u0010o\u001a\u00020\u0004H\u0016¢\u0006\u0004\bo\u0010\u0018J\u001a\u0010q\u001a\u00020\f2\b\u0010p\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bq\u0010dJ\u000f\u0010s\u001a\u00020rH\u0016¢\u0006\u0004\bs\u0010tR&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00040\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010uR\"\u0010\n\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010vR4\u0010\u000e\u001a\"\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u0001\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010wR\u001c\u0010x\u001a\u00020&8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bx\u0010y\u0012\u0004\bz\u0010\u0016R$\u0010Q\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001088\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\bQ\u0010{\u0012\u0004\b|\u0010\u0016R$\u0010}\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001088\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b}\u0010{\u0012\u0004\b~\u0010\u0016R\u0016\u0010\u007f\u001a\u00020&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u007f\u0010yR\u0019\u0010\u0080\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0019\u0010\u0082\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0081\u0001R\u0019\u0010\u0083\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0081\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0081\u0001R\u0019\u0010\u0085\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0081\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0081\u0001R\u0019\u0010\u0087\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0081\u0001R\u0019\u0010\u0088\u0001\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0081\u0001R\u001c\u0010a\u001a\u00020\u00048FX\u0087\u0004¢\u0006\u000e\u0012\u0005\b\u008a\u0001\u0010\u0016\u001a\u0005\b\u0089\u0001\u0010\u0018R\u0013\u0010\u008c\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008b\u0001\u0010\u0018R\u0012\u0010\u0005\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010\u0018R\u0012\u0010\u0013\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010\u0018\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u008f\u0001"}, d2 = {"Landroidx/collection/SieveCache;", "", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "initialCapacity", "Lkotlin/Function2;", "sizeOf", "Lkotlin/Function1;", "createValueFromKey", "Lkotlin/Function4;", "", "", "onEntryRemoved", "<init>", "(IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function4;)V", "initializeStorage", "(I)V", "capacity", "initializeMetadata", "initializeGrowth", "()V", "findEvictionCandidate", "()I", FirebaseAnalytics.Param.INDEX, "moveNodeToHead", "removeValueAt", "(I)Ljava/lang/Object;", "removeNode", "markNodeVisited", C4240b4.i.W, "findKeyIndex", "(Ljava/lang/Object;)I", "findInsertIndex", "hash1", "findFirstAvailableSlot", "(I)I", "", "mapping", "fixupNodes", "([J)V", "", "([I)V", "any", "()Z", "none", "isEmpty", "isNotEmpty", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "value", "set", "(Ljava/lang/Object;Ljava/lang/Object;)V", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Lkotlin/Pair;", "pairs", "putAll", "([Lkotlin/Pair;)V", "", "(Ljava/lang/Iterable;)V", "Lkotlin/sequences/Sequence;", "(Lkotlin/sequences/Sequence;)V", "", TypedValues.TransitionType.S_FROM, "(Ljava/util/Map;)V", "Landroidx/collection/ScatterMap;", "(Landroidx/collection/ScatterMap;)V", "(Landroidx/collection/SieveCache;)V", "pair", "plusAssign", "(Lkotlin/Pair;)V", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "predicate", "removeIf", "(Lkotlin/jvm/functions/Function2;)V", "minusAssign", "(Ljava/lang/Object;)V", UserMetadata.KEYDATA_FILENAME, "([Ljava/lang/Object;)V", "Landroidx/collection/ScatterSet;", "(Landroidx/collection/ScatterSet;)V", "Landroidx/collection/ObjectList;", "(Landroidx/collection/ObjectList;)V", "evictAll", "resize", "trimToSize", "block", "forEach", "forEachKey", "(Lkotlin/jvm/functions/Function1;)V", "forEachValue", "all", "(Lkotlin/jvm/functions/Function2;)Z", "count", "(Lkotlin/jvm/functions/Function2;)I", "contains", "(Ljava/lang/Object;)Z", "containsKey", "containsValue", "adjustStorage$collection", "adjustStorage", "dropDeletes$collection", "dropDeletes", "newCapacity", "resizeStorage$collection", "resizeStorage", "forEachIndexed", "hashCode", "other", "equals", "", "toString", "()Ljava/lang/String;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function4;", "metadata", "[J", "getMetadata$annotations", "[Ljava/lang/Object;", "getKeys$annotations", "values", "getValues$annotations", "nodes", "_capacity", "I", "growthLimit", "_count", "_maxSize", "_size", "head", "tail", "hand", "getCount", "getCount$annotations", "getSize", "size", "getMaxSize", "getCapacity", "collection"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class SieveCache<K, V> {

    /* JADX INFO: renamed from: _capacity, reason: from kotlin metadata and from toString */
    private int capacity;

    /* JADX INFO: renamed from: _count, reason: from kotlin metadata and from toString */
    private int count;
    private int _maxSize;

    /* JADX INFO: renamed from: _size, reason: from kotlin metadata and from toString */
    private int size;

    @NotNull
    private final Function1<K, V> createValueFromKey;
    private int growthLimit;
    private int hand;
    private int head;

    @NotNull
    public Object[] keys;

    @NotNull
    public long[] metadata;

    @NotNull
    private long[] nodes;

    @NotNull
    private final Function4<K, V, V, Boolean, Unit> onEntryRemoved;

    @NotNull
    private final Function2<K, V, Integer> sizeOf;
    private int tail;

    @NotNull
    public Object[] values;

    /* JADX WARN: Multi-variable type inference failed */
    public SieveCache(@IntRange(from = 1, to = 2147483646) int i10, @IntRange(from = 0, to = 2147483646) int i11, @NotNull Function2<? super K, ? super V, Integer> sizeOf, @NotNull Function1<? super K, ? extends V> createValueFromKey, @NotNull Function4<? super K, ? super V, ? super V, ? super Boolean, Unit> onEntryRemoved) {
        Intrinsics.checkNotNullParameter(sizeOf, "sizeOf");
        Intrinsics.checkNotNullParameter(createValueFromKey, "createValueFromKey");
        Intrinsics.checkNotNullParameter(onEntryRemoved, "onEntryRemoved");
        this.sizeOf = sizeOf;
        this.createValueFromKey = createValueFromKey;
        this.onEntryRemoved = onEntryRemoved;
        this.metadata = ScatterMapKt.EmptyGroup;
        Object[] objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        this.keys = objArr;
        this.values = objArr;
        this.nodes = SieveCacheKt.getEmptyNodes();
        this.head = Integer.MAX_VALUE;
        this.tail = Integer.MAX_VALUE;
        this.hand = Integer.MAX_VALUE;
        if (!(i10 > 0)) {
            RuntimeHelpersKt.throwIllegalArgumentException("maxSize must be > 0");
        }
        this._maxSize = i10;
        initializeStorage(ScatterMapKt.unloadedCapacity(i11));
    }

    private final int findEvictionCandidate() {
        long[] jArr = this.nodes;
        int i10 = this.hand;
        if (i10 == Integer.MAX_VALUE) {
            i10 = this.tail;
        }
        while (i10 != Integer.MAX_VALUE) {
            long j10 = jArr[i10];
            if (((int) ((j10 >> 62) & 1)) == 0) {
                break;
            }
            int i11 = (int) (SieveCacheKt.NodeLinkMask & (j10 >> 31));
            jArr[i10] = 4611686018427387903L & j10;
            i10 = i11 != Integer.MAX_VALUE ? i11 : this.tail;
        }
        int i12 = (int) (SieveCacheKt.NodeLinkMask & (jArr[i10] >> 31));
        this.hand = i12 != Integer.MAX_VALUE ? i12 : Integer.MAX_VALUE;
        return i10;
    }

    private final int findFirstAvailableSlot(int hash1) {
        int i10 = this.capacity;
        int i11 = hash1 & i10;
        int i12 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j10 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j11 = j10 & ((~j10) << 7) & (-9187201950435737472L);
            if (j11 != 0) {
                return (i11 + (Long.numberOfTrailingZeros(j11) >> 3)) & i10;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
    }

    private final int findInsertIndex(K key) {
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i10 = iHashCode ^ (iHashCode << 16);
        int i11 = i10 >>> 7;
        int i12 = i10 & 127;
        int i13 = this.capacity;
        int i14 = i11 & i13;
        int i15 = 0;
        while (true) {
            long[] jArr = this.metadata;
            int i16 = i14 >> 3;
            int i17 = (i14 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = i12;
            int i18 = i12;
            long j12 = j10 ^ (j11 * ScatterMapKt.BitmaskLsb);
            for (long j13 = (~j12) & (j12 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j13 != 0; j13 &= j13 - 1) {
                int iNumberOfTrailingZeros = (i14 + (Long.numberOfTrailingZeros(j13) >> 3)) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j10) << 6) & j10 & (-9187201950435737472L)) != 0) {
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                if (this.growthLimit == 0 && ((this.metadata[iFindFirstAvailableSlot >> 3] >> ((iFindFirstAvailableSlot & 7) << 3)) & 255) != 254) {
                    adjustStorage$collection();
                    iFindFirstAvailableSlot = findFirstAvailableSlot(i11);
                }
                this.count++;
                int i19 = this.growthLimit;
                long[] jArr2 = this.metadata;
                int i20 = iFindFirstAvailableSlot >> 3;
                long j14 = jArr2[i20];
                int i21 = (iFindFirstAvailableSlot & 7) << 3;
                this.growthLimit = i19 - (((j14 >> i21) & 255) == 128 ? 1 : 0);
                int i22 = this.capacity;
                long j15 = ((~(255 << i21)) & j14) | (j11 << i21);
                jArr2[i20] = j15;
                jArr2[(((iFindFirstAvailableSlot - 7) & i22) + (i22 & 7)) >> 3] = j15;
                return ~iFindFirstAvailableSlot;
            }
            i15 += 8;
            i14 = (i14 + i15) & i13;
            i12 = i18;
        }
    }

    private final int findKeyIndex(K key) {
        int i10 = 0;
        int iHashCode = (key != null ? key.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
        int i11 = iHashCode ^ (iHashCode << 16);
        int i12 = i11 & 127;
        int i13 = this.capacity;
        int i14 = i11 >>> 7;
        while (true) {
            int i15 = i14 & i13;
            long[] jArr = this.metadata;
            int i16 = i15 >> 3;
            int i17 = (i15 & 7) << 3;
            long j10 = ((jArr[i16 + 1] << (64 - i17)) & ((-i17) >> 63)) | (jArr[i16] >>> i17);
            long j11 = (((long) i12) * ScatterMapKt.BitmaskLsb) ^ j10;
            for (long j12 = (~j11) & (j11 - ScatterMapKt.BitmaskLsb) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i15) & i13;
                if (Intrinsics.areEqual(this.keys[iNumberOfTrailingZeros], key)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j10 & ((~j10) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i10 += 8;
            i14 = i15 + i10;
        }
    }

    private final void fixupNodes(long[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (SieveCacheKt.NodeLinkMask & j10);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : (int) (mapping[i12] & 4294967295L)))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = (int) (4294967295L & mapping[i13]);
            }
            jArr[i10] = ((long) i11) | j11;
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = (int) (mapping[i14] & 4294967295L);
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = (int) (mapping[i15] & 4294967295L);
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = (int) (mapping[i16] & 4294967295L);
        }
    }

    public static /* synthetic */ void getCount$annotations() {
    }

    public static /* synthetic */ void getKeys$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public static /* synthetic */ void getValues$annotations() {
    }

    private final void initializeGrowth() {
        this.growthLimit = ScatterMapKt.loadedCapacity(this.capacity) - getCount();
    }

    private final void initializeMetadata(int capacity) {
        long[] jArr;
        if (capacity == 0) {
            jArr = ScatterMapKt.EmptyGroup;
        } else {
            long[] jArr2 = new long[((capacity + 15) & (-8)) >> 3];
            ArraysKt.fill$default(jArr2, -9187201950435737472L, 0, 0, 6, (Object) null);
            int i10 = capacity >> 3;
            long j10 = 255 << ((capacity & 7) << 3);
            jArr2[i10] = (jArr2[i10] & (~j10)) | j10;
            jArr = jArr2;
        }
        this.metadata = jArr;
        initializeGrowth();
    }

    private final void initializeStorage(int initialCapacity) {
        long[] emptyNodes;
        int iMax = initialCapacity > 0 ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0;
        this.capacity = iMax;
        initializeMetadata(iMax);
        this.keys = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        this.values = iMax == 0 ? ContainerHelpersKt.EMPTY_OBJECTS : new Object[iMax];
        if (iMax == 0) {
            emptyNodes = SieveCacheKt.getEmptyNodes();
        } else {
            long[] jArr = new long[iMax];
            ArraysKt.fill$default(jArr, 4611686018427387903L, 0, 0, 6, (Object) null);
            emptyNodes = jArr;
        }
        this.nodes = emptyNodes;
    }

    private final void markNodeVisited(int index) {
        long[] jArr = this.nodes;
        jArr[index] = (jArr[index] & 4611686018427387903L) | 4611686018427387904L;
    }

    private final void moveNodeToHead(int index) {
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[index] = (((long) i10) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = ((SieveCacheKt.NodeLinkMask & ((long) index)) << 31) | (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask);
        }
        this.head = index;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = index;
        }
    }

    private final void removeNode(int index) {
        long[] jArr = this.nodes;
        long j10 = jArr[index];
        int i10 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
        int i11 = (int) (j10 & SieveCacheKt.NodeLinkMask);
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i11) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i11;
        }
        if (i11 != Integer.MAX_VALUE) {
            jArr[i11] = ((SieveCacheKt.NodeLinkMask & ((long) i10)) << 31) | (jArr[i11] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i10;
        }
        if (this.hand == index) {
            this.hand = i10;
        }
        jArr[index] = 4611686018427387903L;
    }

    private final V removeValueAt(int index) {
        this.count--;
        long[] jArr = this.metadata;
        int i10 = this.capacity;
        int i11 = index >> 3;
        int i12 = (index & 7) << 3;
        long j10 = (jArr[i11] & (~(255 << i12))) | (254 << i12);
        jArr[i11] = j10;
        jArr[(((index - 7) & i10) + (i10 & 7)) >> 3] = j10;
        this.keys[index] = null;
        Object[] objArr = this.values;
        V v10 = (V) objArr[index];
        objArr[index] = null;
        long[] jArr2 = this.nodes;
        long j11 = jArr2[index];
        int i13 = (int) ((j11 >> 31) & SieveCacheKt.NodeLinkMask);
        int i14 = (int) (j11 & SieveCacheKt.NodeLinkMask);
        if (i13 != Integer.MAX_VALUE) {
            jArr2[i13] = (jArr2[i13] & SieveCacheKt.NodeMetaAndPreviousMask) | (((long) i14) & SieveCacheKt.NodeLinkMask);
        } else {
            this.head = i14;
        }
        if (i14 != Integer.MAX_VALUE) {
            jArr2[i14] = ((SieveCacheKt.NodeLinkMask & ((long) i13)) << 31) | (jArr2[i14] & SieveCacheKt.NodeMetaAndNextMask);
        } else {
            this.tail = i13;
        }
        if (this.hand == index) {
            this.hand = i13;
        }
        jArr2[index] = 4611686018427387903L;
        return v10;
    }

    public final void adjustStorage$collection() {
        if (this.capacity <= 8 || Long.compare(v.c(v.c(getCount()) * 32) ^ Long.MIN_VALUE, v.c(v.c(this.capacity) * 25) ^ Long.MIN_VALUE) > 0) {
            resizeStorage$collection(ScatterMapKt.nextCapacity(this.capacity));
        } else {
            dropDeletes$collection();
        }
    }

    public final boolean all(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!predicate.invoke(obj, obj2).booleanValue()) {
                            return false;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
    }

    public final boolean any() {
        return this.count != 0;
    }

    public final boolean contains(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return findKeyIndex(key) >= 0;
    }

    public final boolean containsKey(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return findKeyIndex(key) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean containsValue(@org.jetbrains.annotations.NotNull V r15) {
        /*
            r14 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r15, r0)
            java.lang.Object[] r0 = r14.values
            long[] r1 = r14.metadata
            int r2 = r1.length
            int r2 = r2 + (-2)
            r3 = 0
            if (r2 < 0) goto L52
            r4 = r3
        L10:
            r5 = r1[r4]
            long r7 = ~r5
            r9 = 7
            long r7 = r7 << r9
            long r7 = r7 & r5
            r9 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r7 = r7 & r9
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 == 0) goto L4d
            int r7 = r4 - r2
            int r7 = ~r7
            int r7 = r7 >>> 31
            r8 = 8
            int r7 = 8 - r7
            r9 = r3
        L2a:
            if (r9 >= r7) goto L4b
            r10 = 255(0xff, double:1.26E-321)
            long r10 = r10 & r5
            r12 = 128(0x80, double:6.3E-322)
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 >= 0) goto L47
            int r10 = r4 << 3
            int r10 = r10 + r9
            r10 = r0[r10]
            java.lang.String r11 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r10, r11)
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual(r15, r10)
            if (r10 == 0) goto L47
            r15 = 1
            return r15
        L47:
            long r5 = r5 >> r8
            int r9 = r9 + 1
            goto L2a
        L4b:
            if (r7 != r8) goto L52
        L4d:
            if (r4 == r2) goto L52
            int r4 = r4 + 1
            goto L10
        L52:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.containsValue(java.lang.Object):boolean");
    }

    public final int count() {
        return getSize();
    }

    public final void dropDeletes$collection() {
        int i10;
        Object[] objArr;
        long[] jArr = this.metadata;
        if (jArr == null) {
            return;
        }
        int i11 = this.capacity;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr2 = this.nodes;
        long[] jArr3 = new long[i11];
        long j10 = SieveCacheKt.InvalidMapping;
        int i12 = 0;
        ArraysKt.fill(jArr3, SieveCacheKt.InvalidMapping, 0, i11);
        int i13 = (i11 + 7) >> 3;
        for (int i14 = 0; i14 < i13; i14++) {
            long j11 = jArr[i14] & (-9187201950435737472L);
            jArr[i14] = (-72340172838076674L) & ((~j11) + (j11 >>> 7));
        }
        int lastIndex = ArraysKt.getLastIndex(jArr);
        int i15 = lastIndex - 1;
        jArr[i15] = (jArr[i15] & 72057594037927935L) | (-72057594037927936L);
        jArr[lastIndex] = jArr[0];
        int i16 = 0;
        while (i16 != i11) {
            int i17 = i16 >> 3;
            int i18 = (i16 & 7) << 3;
            long j12 = (jArr[i17] >> i18) & 255;
            if (j12 != 128 && j12 == 254) {
                Object obj = objArr2[i16];
                int iHashCode = (obj != null ? obj.hashCode() : i12) * ScatterMapKt.MurmurHashC1;
                int i19 = iHashCode ^ (iHashCode << 16);
                int i20 = i19 >>> 7;
                long j13 = j10;
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i20);
                int i21 = i20 & i11;
                if (((iFindFirstAvailableSlot - i21) & i11) / 8 == ((i16 - i21) & i11) / 8) {
                    int i22 = i12;
                    int i23 = i16;
                    jArr[i17] = (((long) (i19 & 127)) << i18) | ((~(255 << i18)) & jArr[i17]);
                    if (jArr3[i23] == j13) {
                        long j14 = i23;
                        jArr3[i23] = j14 | (j14 << 32);
                    }
                    jArr[jArr.length - 1] = jArr[i22];
                    i16 = i23 + 1;
                    j10 = j13;
                    i12 = i22;
                } else {
                    int i24 = i12;
                    int i25 = iFindFirstAvailableSlot >> 3;
                    long j15 = jArr[i25];
                    int i26 = (iFindFirstAvailableSlot & 7) << 3;
                    if (((j15 >> i26) & 255) == 128) {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i25] = (j15 & (~(255 << i26))) | (((long) (i19 & 127)) << i26);
                        jArr[i17] = (jArr[i17] & (~(255 << i18))) | (128 << i18);
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = null;
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = null;
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = 4611686018427387903L;
                        int i27 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i27 != Integer.MAX_VALUE) {
                            jArr3[i27] = (jArr3[i27] & (-4294967296L)) | ((long) iFindFirstAvailableSlot);
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (-4294967296L);
                        } else {
                            jArr3[i16] = (((long) Integer.MAX_VALUE) << 32) | ((long) iFindFirstAvailableSlot);
                        }
                        jArr3[iFindFirstAvailableSlot] = (((long) i16) << 32) | ((long) Integer.MAX_VALUE);
                    } else {
                        i10 = i11;
                        objArr = objArr2;
                        jArr[i25] = (((long) (i19 & 127)) << i26) | (j15 & (~(255 << i26)));
                        Object obj2 = objArr[iFindFirstAvailableSlot];
                        objArr[iFindFirstAvailableSlot] = objArr[i16];
                        objArr[i16] = obj2;
                        Object obj3 = objArr3[iFindFirstAvailableSlot];
                        objArr3[iFindFirstAvailableSlot] = objArr3[i16];
                        objArr3[i16] = obj3;
                        long j16 = jArr2[iFindFirstAvailableSlot];
                        jArr2[iFindFirstAvailableSlot] = jArr2[i16];
                        jArr2[i16] = j16;
                        int i28 = (int) ((jArr3[i16] >> 32) & 4294967295L);
                        if (i28 != Integer.MAX_VALUE) {
                            long j17 = iFindFirstAvailableSlot;
                            jArr3[i28] = (jArr3[i28] & (-4294967296L)) | j17;
                            jArr3[i16] = (jArr3[i16] & 4294967295L) | (j17 << 32);
                        } else {
                            long j18 = iFindFirstAvailableSlot;
                            jArr3[i16] = j18 | (j18 << 32);
                            i28 = i16;
                        }
                        jArr3[iFindFirstAvailableSlot] = (((long) i28) << 32) | ((long) i16);
                        i16--;
                    }
                    jArr[jArr.length - 1] = jArr[i24];
                    i16++;
                    i11 = i10;
                    j10 = j13;
                    i12 = i24;
                    objArr2 = objArr;
                }
            } else {
                i16++;
            }
        }
        initializeGrowth();
        fixupNodes(jArr3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean equals(@Nullable Object other) {
        boolean z10;
        boolean z11;
        boolean z12 = true;
        if (other == this) {
            return true;
        }
        if (!(other instanceof SieveCache)) {
            return false;
        }
        SieveCache sieveCache = (SieveCache) other;
        if (sieveCache.getSize() != getSize() || sieveCache.count != this.count) {
            return false;
        }
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                int i12 = 0;
                while (i12 < i11) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        z11 = z12;
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (!Intrinsics.areEqual(obj2, sieveCache.get(obj))) {
                            return false;
                        }
                    } else {
                        z11 = z12;
                    }
                    j10 >>= 8;
                    i12++;
                    z12 = z11;
                }
                z10 = z12;
                if (i11 != 8) {
                    return z10;
                }
            } else {
                z10 = z12;
            }
            if (i10 == length) {
                return z10;
            }
            i10++;
            z12 = z10;
        }
    }

    public final void evictAll() {
        trimToSize(-1);
    }

    public final void forEach(@NotNull Function2<? super K, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj, obj2);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachIndexed(@NotNull Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        block.invoke(Integer.valueOf((i10 << 3) + i12));
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachKey(@NotNull Function1<? super K, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.keys;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void forEachValue(@NotNull Function1<? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Object[] objArr = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        Object obj = objArr[(i10 << 3) + i12];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        block.invoke(obj);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    @Nullable
    public final V get(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex >= 0) {
            long[] jArr = this.nodes;
            jArr[iFindKeyIndex] = (jArr[iFindKeyIndex] & 4611686018427387903L) | 4611686018427387904L;
            return (V) this.values[iFindKeyIndex];
        }
        V vInvoke = this.createValueFromKey.invoke(key);
        if (vInvoke == null) {
            return null;
        }
        put(key, vInvoke);
        return vInvoke;
    }

    public final int getCapacity() {
        return this.capacity;
    }

    public final int getCount() {
        return this.count;
    }

    /* JADX INFO: renamed from: getMaxSize, reason: from getter */
    public final int get_maxSize() {
        return this._maxSize;
    }

    public final int getSize() {
        return this.size;
    }

    public int hashCode() {
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int iHashCode = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        iHashCode += obj2.hashCode() ^ obj.hashCode();
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return iHashCode;
                }
            }
            if (i10 == length) {
                return iHashCode;
            }
            i10++;
        }
    }

    public final boolean isEmpty() {
        return this.count == 0;
    }

    public final boolean isNotEmpty() {
        return this.count != 0;
    }

    public final void minusAssign(@NotNull K key) {
        Intrinsics.checkNotNullParameter(key, "key");
        remove(key);
    }

    public final boolean none() {
        return this.count == 0;
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V> pair) {
        Intrinsics.checkNotNullParameter(pair, "pair");
        put(pair.getFirst(), pair.getSecond());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Nullable
    public final V put(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iFindInsertIndex = findInsertIndex(key);
        if (iFindInsertIndex < 0) {
            iFindInsertIndex = ~iFindInsertIndex;
        }
        Object[] objArr = this.values;
        V v10 = (V) objArr[iFindInsertIndex];
        objArr[iFindInsertIndex] = value;
        this.keys[iFindInsertIndex] = key;
        int iIntValue = this.size + this.sizeOf.invoke(key, value).intValue();
        this.size = iIntValue;
        if (v10 != null) {
            this.size = iIntValue - ((Number) this.sizeOf.invoke(key, v10)).intValue();
            this.onEntryRemoved.invoke(key, v10, value, Boolean.FALSE);
            trimToSize(this._maxSize);
            return v10;
        }
        trimToSize(this._maxSize);
        long[] jArr = this.nodes;
        int i10 = this.head;
        jArr[iFindInsertIndex] = (((long) i10) & SieveCacheKt.NodeLinkMask) | 4611686016279904256L;
        if (i10 != Integer.MAX_VALUE) {
            jArr[i10] = (jArr[i10] & SieveCacheKt.NodeMetaAndNextMask) | ((SieveCacheKt.NodeLinkMask & ((long) iFindInsertIndex)) << 31);
        }
        this.head = iFindInsertIndex;
        if (this.tail == Integer.MAX_VALUE) {
            this.tail = iFindInsertIndex;
        }
        return v10;
    }

    public final void putAll(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    @Nullable
    public final V remove(@NotNull K key) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(key, "key");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return null;
        }
        this.size -= this.sizeOf.invoke(key, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return vRemoveValueAt;
    }

    public final void removeIf(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = this.keys[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = this.values[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            V vRemoveValueAt = removeValueAt(i13);
                            if (vRemoveValueAt == null) {
                                return;
                            }
                            this.size -= this.sizeOf.invoke((K) obj, vRemoveValueAt).intValue();
                            this.onEntryRemoved.invoke((K) obj, vRemoveValueAt, null, Boolean.FALSE);
                        } else {
                            continue;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void resize(@IntRange(from = 1, to = 2147483646) int maxSize) {
        this._maxSize = maxSize;
        trimToSize(maxSize);
    }

    public final void resizeStorage$collection(int newCapacity) {
        long[] jArr;
        Object[] objArr;
        long[] jArr2 = this.metadata;
        Object[] objArr2 = this.keys;
        Object[] objArr3 = this.values;
        long[] jArr3 = this.nodes;
        int i10 = this.capacity;
        int[] iArr = new int[i10];
        initializeStorage(newCapacity);
        long[] jArr4 = this.metadata;
        Object[] objArr4 = this.keys;
        Object[] objArr5 = this.values;
        long[] jArr5 = this.nodes;
        int i11 = this.capacity;
        int i12 = 0;
        while (i12 < i10) {
            if (((jArr2[i12 >> 3] >> ((i12 & 7) << 3)) & 255) < 128) {
                Object obj = objArr2[i12];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * ScatterMapKt.MurmurHashC1;
                int i13 = iHashCode ^ (iHashCode << 16);
                int iFindFirstAvailableSlot = findFirstAvailableSlot(i13 >>> 7);
                jArr = jArr2;
                objArr = objArr2;
                long j10 = i13 & 127;
                int i14 = iFindFirstAvailableSlot >> 3;
                int i15 = (iFindFirstAvailableSlot & 7) << 3;
                long j11 = (jArr4[i14] & (~(255 << i15))) | (j10 << i15);
                jArr4[i14] = j11;
                jArr4[(((iFindFirstAvailableSlot - 7) & i11) + (i11 & 7)) >> 3] = j11;
                objArr4[iFindFirstAvailableSlot] = obj;
                objArr5[iFindFirstAvailableSlot] = objArr3[i12];
                jArr5[iFindFirstAvailableSlot] = jArr3[i12];
                iArr[i12] = iFindFirstAvailableSlot;
            } else {
                jArr = jArr2;
                objArr = objArr2;
            }
            i12++;
            jArr2 = jArr;
            objArr2 = objArr;
        }
        fixupNodes(iArr);
    }

    public final void set(@NotNull K key, @NotNull V value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        put(key, value);
    }

    @NotNull
    public String toString() {
        return "SieveCache[maxSize=" + this._maxSize + ", size=" + this.size + ", capacity=" + this.capacity + ", count=" + this.count + ']';
    }

    public final void trimToSize(int maxSize) {
        int iFindEvictionCandidate;
        while (this.size > maxSize && getCount() != 0 && (iFindEvictionCandidate = findEvictionCandidate()) != Integer.MAX_VALUE) {
            Object obj = this.keys[iFindEvictionCandidate];
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
            V vRemoveValueAt = removeValueAt(iFindEvictionCandidate);
            if (vRemoveValueAt != null) {
                this.size -= this.sizeOf.invoke((K) obj, vRemoveValueAt).intValue();
                this.onEntryRemoved.invoke((K) obj, vRemoveValueAt, null, Boolean.TRUE);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean any(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, java.lang.Boolean> r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            java.lang.String r2 = "predicate"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r1, r2)
            java.lang.Object[] r2 = r0.keys
            java.lang.Object[] r3 = r0.values
            long[] r4 = r0.metadata
            int r5 = r4.length
            int r5 = r5 + (-2)
            r6 = 0
            if (r5 < 0) goto L65
            r7 = r6
        L16:
            r8 = r4[r7]
            long r10 = ~r8
            r12 = 7
            long r10 = r10 << r12
            long r10 = r10 & r8
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r10 = r10 & r12
            int r10 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r10 == 0) goto L60
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r11 = 8
            int r10 = 8 - r10
            r12 = r6
        L30:
            if (r12 >= r10) goto L5e
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r8
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L5a
            int r13 = r7 << 3
            int r13 = r13 + r12
            r14 = r2[r13]
            java.lang.String r15 = "null cannot be cast to non-null type K of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r14, r15)
            r13 = r3[r13]
            java.lang.String r15 = "null cannot be cast to non-null type V of androidx.collection.SieveCache"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r15)
            java.lang.Object r13 = r1.invoke(r14, r13)
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L5a
            r1 = 1
            return r1
        L5a:
            long r8 = r8 >> r11
            int r12 = r12 + 1
            goto L30
        L5e:
            if (r10 != r11) goto L65
        L60:
            if (r7 == r5) goto L65
            int r7 = r7 + 1
            goto L16
        L65:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.SieveCache.any(kotlin.jvm.functions.Function2):boolean");
    }

    public final int count(@NotNull Function2<? super K, ? super V, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Object[] objArr = this.keys;
        Object[] objArr2 = this.values;
        long[] jArr = this.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i10 = 0;
        int i11 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8 - ((~(i10 - length)) >>> 31);
                for (int i13 = 0; i13 < i12; i13++) {
                    if ((255 & j10) < 128) {
                        int i14 = (i10 << 3) + i13;
                        Object obj = objArr[i14];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i14];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        if (predicate.invoke(obj, obj2).booleanValue()) {
                            i11++;
                        }
                    }
                    j10 >>= 8;
                }
                if (i12 != 8) {
                    return i11;
                }
            }
            if (i10 == length) {
                return i11;
            }
            i10++;
        }
    }

    public final void minusAssign(@NotNull K[] keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (K k10 : keys) {
            remove(k10);
        }
    }

    public final void plusAssign(@NotNull Pair<? extends K, ? extends V>[] pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void putAll(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        for (Pair<? extends K, ? extends V> pair : pairs) {
            put(pair.component1(), pair.component2());
        }
    }

    public final void minusAssign(@NotNull Iterable<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator<? extends K> it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Iterable<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    public final void plusAssign(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        putAll(pairs);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull Sequence<? extends Pair<? extends K, ? extends V>> pairs) {
        Intrinsics.checkNotNullParameter(pairs, "pairs");
        Iterator it = pairs.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            put(pair.component1(), pair.component2());
        }
    }

    public final boolean remove(@NotNull K key, @NotNull V value) {
        V vRemoveValueAt;
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        int iFindKeyIndex = findKeyIndex(key);
        if (iFindKeyIndex < 0 || !Intrinsics.areEqual(this.values[iFindKeyIndex], value) || (vRemoveValueAt = removeValueAt(iFindKeyIndex)) == null) {
            return false;
        }
        this.size -= this.sizeOf.invoke(key, vRemoveValueAt).intValue();
        this.onEntryRemoved.invoke(key, vRemoveValueAt, null, Boolean.FALSE);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull Sequence<? extends K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Iterator it = keys.iterator();
        while (it.hasNext()) {
            remove(it.next());
        }
    }

    public final void plusAssign(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void plusAssign(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    public final void putAll(@NotNull Map<K, ? extends V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        for (Map.Entry<K, ? extends V> entry : from.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ScatterSet<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.elements;
        long[] jArr = keys.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        remove(objArr[(i10 << 3) + i12]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    public final void plusAssign(@NotNull SieveCache<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        putAll(from);
    }

    private final void fixupNodes(int[] mapping) {
        long[] jArr = this.nodes;
        int length = jArr.length;
        int i10 = 0;
        while (true) {
            int i11 = Integer.MAX_VALUE;
            if (i10 >= length) {
                break;
            }
            long j10 = jArr[i10];
            int i12 = (int) ((j10 >> 31) & SieveCacheKt.NodeLinkMask);
            int i13 = (int) (SieveCacheKt.NodeLinkMask & j10);
            long j11 = ((j10 & SieveCacheKt.NodeMetaMask) | ((long) (i12 == Integer.MAX_VALUE ? Integer.MAX_VALUE : mapping[i12]))) << 31;
            if (i13 != Integer.MAX_VALUE) {
                i11 = mapping[i13];
            }
            jArr[i10] = j11 | ((long) i11);
            i10++;
        }
        int i14 = this.head;
        if (i14 != Integer.MAX_VALUE) {
            this.head = mapping[i14];
        }
        int i15 = this.tail;
        if (i15 != Integer.MAX_VALUE) {
            this.tail = mapping[i15];
        }
        int i16 = this.hand;
        if (i16 != Integer.MAX_VALUE) {
            this.hand = mapping[i16];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull ScatterMap<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        put(objArr[i13], objArr2[i13]);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void minusAssign(@NotNull ObjectList<K> keys) {
        Intrinsics.checkNotNullParameter(keys, "keys");
        Object[] objArr = keys.content;
        int i10 = keys._size;
        for (int i11 = 0; i11 < i10; i11++) {
            remove(objArr[i11]);
        }
    }

    public /* synthetic */ SieveCache(int i10, int i11, Function2 function2, Function1 function1, Function4 function4, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, (i12 & 2) != 0 ? 6 : i11, (i12 & 4) != 0 ? new Function2<K, V, Integer>() { // from class: androidx.collection.SieveCache.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function2
            public final Integer invoke(K k10, V v10) {
                Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(v10, "<anonymous parameter 1>");
                return 1;
            }
        } : function2, (i12 & 8) != 0 ? new Function1() { // from class: androidx.collection.SieveCache.2
            @Override // kotlin.jvm.functions.Function1
            public final Void invoke(K it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return null;
            }
        } : function1, (i12 & 16) != 0 ? new Function4<K, V, V, Boolean, Unit>() { // from class: androidx.collection.SieveCache.3
            public final void invoke(K k10, V v10, V v11, boolean z10) {
                Intrinsics.checkNotNullParameter(k10, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(v10, "<anonymous parameter 1>");
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(Object obj, Object obj2, Object obj3, Boolean bool) {
                invoke(obj, obj2, obj3, bool.booleanValue());
                return Unit.f93236a;
            }
        } : function4);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void putAll(@NotNull SieveCache<K, V> from) {
        Intrinsics.checkNotNullParameter(from, "from");
        Object[] objArr = from.keys;
        Object[] objArr2 = from.values;
        long[] jArr = from.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i10 = 0;
        while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type K of androidx.collection.SieveCache");
                        Object obj2 = objArr2[i13];
                        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type V of androidx.collection.SieveCache");
                        put(obj, obj2);
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return;
                }
            }
            if (i10 == length) {
                return;
            } else {
                i10++;
            }
        }
    }
}
