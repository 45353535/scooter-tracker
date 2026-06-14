package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap;

import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.CommonFunctionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.DeltaCounter;
import androidx.compose.runtime.external.kotlinx.collections.immutable.internal.MutabilityOwnership;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.ironsource.C4240b4;
import com.taurusx.tax.f.y;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;
import kotlin.ranges.g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b)\b\u0000\u0018\u0000 \u0090\u0001*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003:\u0004\u0090\u0001\u0091\u0001B1\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fB)\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\u0004\b\u000b\u0010\rJ\u001b\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u0018J3\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ;\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001f\u0010 J+\u0010!\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\b!\u0010\"J?\u0010%\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b%\u0010&J?\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\b)\u0010*J?\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J5\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JQ\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b5\u00106JK\u00107\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\b7\u00108JS\u00109\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00101\u001a\u00020\u00042\u0006\u00102\u001a\u00028\u00002\u0006\u00103\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b9\u0010:J]\u0010A\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010;\u001a\u00020\u00042\u0006\u0010<\u001a\u00028\u00002\u0006\u0010=\u001a\u00028\u00012\u0006\u0010>\u001a\u00020\u00042\u0006\u0010?\u001a\u00028\u00002\u0006\u0010@\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\b\u0010\u001e\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\bA\u0010BJ-\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bC\u0010.JA\u0010D\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bD\u0010EJ%\u0010G\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u0004H\u0002¢\u0006\u0004\bG\u0010HJ9\u0010I\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010F\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bK\u0010LJ\u0019\u0010M\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bM\u0010NJ-\u0010O\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bO\u0010PJ?\u0010Q\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bQ\u0010RJ%\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u0000H\u0002¢\u0006\u0004\bS\u0010TJ9\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010VJ-\u0010S\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u0001H\u0002¢\u0006\u0004\bS\u0010WJA\u0010U\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\bU\u0010RJ?\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010Z\u001a\u00020Y2\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\b[\u0010\\J[\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#H\u0002¢\u0006\u0004\b]\u0010^J\u000f\u0010_\u001a\u00020\u0004H\u0002¢\u0006\u0004\b_\u0010`J#\u0010a\u001a\u00020\u00132\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000H\u0002¢\u0006\u0004\ba\u0010bJW\u0010d\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0002¢\u0006\u0004\bd\u0010eJ_\u0010f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0012\u0010c\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0014\u0010(\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\tH\u0002¢\u0006\u0004\bf\u0010gJW\u0010l\u001a\u00020i26\u0010j\u001a2\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020i0h2\u0006\u0010k\u001a\u00020\u00042\u0006\u00104\u001a\u00020\u0004H\u0002¢\u0006\u0004\bl\u0010mJ\u000f\u0010o\u001a\u00020\u0004H\u0000¢\u0006\u0004\bn\u0010`J\u0017\u0010q\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bp\u0010\u0015J\u0017\u0010t\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\br\u0010sJ\u0017\u0010'\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0004H\u0000¢\u0006\u0004\bu\u0010sJ#\u0010w\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010'\u001a\u00020\u0004H\u0000¢\u0006\u0004\bv\u0010HJ%\u0010y\u001a\u00020\u00132\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\by\u0010zJ'\u0010{\u001a\u0004\u0018\u00018\u00012\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0004\b{\u0010|JQ\u0010}\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0012\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u00104\u001a\u00020\u00042\u0006\u0010Z\u001a\u00020Y2\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0004\b}\u0010~J<\u0010\u007f\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u000e2\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0005\b\u007f\u0010\u0080\u0001JP\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00002\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J6\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001JJ\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J>\u0010\u0083\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u0004¢\u0006\u0006\b\u0083\u0001\u0010\u0087\u0001JR\u0010\u0085\u0001\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00002\u0006\u0010x\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u001b\u001a\u00028\u00012\u0006\u00104\u001a\u00020\u00042\u0012\u0010$\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010#¢\u0006\u0006\b\u0085\u0001\u0010\u0082\u0001JI\u0010l\u001a\u00020i26\u0010j\u001a2\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0000\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020i0hH\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0017\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0005\u0010\u008a\u0001R\u0017\u0010\u0006\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0006\u0010\u008a\u0001R\u0017\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010\u008b\u0001R8\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u000f\u0010\u008c\u0001\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00078\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\b\b\u0010\u008d\u0001\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0092\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "", "dataMap", "nodeMap", "", "buffer", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "ownedBy", "<init>", "(II[Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)V", "(II[Ljava/lang/Object;)V", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asInsertResult", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "asUpdateResult", "positionMask", "", "hasNodeAt", "(I)Z", "keyIndex", "keyAtIndex", "(I)Ljava/lang/Object;", "valueAtKeyIndex", C4240b4.i.W, "value", "insertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "owner", "mutableInsertEntryAt", "(ILjava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "updateValueAtIndex", "(ILjava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;", "mutator", "mutableUpdateValueAtIndex", "(ILjava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "nodeIndex", "newNode", "updateNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableUpdateNodeAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeNodeAtIndex", "(II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemoveNodeAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "newKeyHash", "newKey", "newValue", "shift", "bufferMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)[Ljava/lang/Object;", "moveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableMoveEntryToNode", "(IIILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "keyHash1", "key1", "value1", "keyHash2", "key2", "value2", "makeNode", "(ILjava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "removeEntryAtIndex", "mutableRemoveEntryAtIndex", "(IILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "collisionRemoveEntryAtIndex", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemoveEntryAtIndex", "(ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionContainsKey", "(Ljava/lang/Object;)Z", "collisionGet", "(Ljava/lang/Object;)Ljava/lang/Object;", "collisionPut", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutableCollisionPut", "(Ljava/lang/Object;Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "collisionRemove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableCollisionRemove", "(Ljava/lang/Object;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "otherNode", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;", "intersectionCounter", "mutableCollisionPutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutablePutAllFromOtherNodeCell", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "calculateSize", "()I", "elementsIdentityEquals", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)Z", "targetNode", "replaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;II)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableReplaceNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;IILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "Lkotlin/Function5;", "", "visitor", "hash", "accept", "(Lkotlin/jvm/functions/Function5;II)V", "entryCount$runtime_release", "entryCount", "hasEntryAt$runtime_release", "hasEntryAt", "entryKeyIndex$runtime_release", "(I)I", "entryKeyIndex", "nodeIndex$runtime_release", "nodeAtIndex$runtime_release", "nodeAtIndex", "keyHash", "containsKey", "(ILjava/lang/Object;I)Z", "get", "(ILjava/lang/Object;I)Ljava/lang/Object;", "mutablePutAll", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/internal/DeltaCounter;Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "put", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "mutablePut", "(ILjava/lang/Object;Ljava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "remove", "(ILjava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "mutableRemove", "(ILjava/lang/Object;ILandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/PersistentHashMapBuilder;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "(ILjava/lang/Object;Ljava/lang/Object;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "accept$runtime_release", "(Lkotlin/jvm/functions/Function5;)V", "I", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/MutabilityOwnership;", "<set-?>", "[Ljava/lang/Object;", "getBuffer$runtime_release", "()[Ljava/lang/Object;", y.f66058y, "ModificationResult", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class TrieNode<K, V> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final TrieNode EMPTY = new TrieNode(0, 0, new Object[0]);

    @NotNull
    private Object[] buffer;
    private int dataMap;
    private int nodeMap;

    @Nullable
    private final MutabilityOwnership ownedBy;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$Companion;", "", "()V", "EMPTY", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "", "getEMPTY$runtime_release", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TrieNode getEMPTY$runtime_release() {
            return TrieNode.EMPTY;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B!\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJD\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00002*\u0010\u0010\u001a&\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0011H\u0086\bø\u0001\u0000R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0012"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode$ModificationResult;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "node", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "sizeDelta", "", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;I)V", "getNode", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;", "setNode", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableMap/TrieNode;)V", "getSizeDelta", "()I", "replaceNode", "operation", "Lkotlin/Function1;", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class ModificationResult<K, V> {

        @NotNull
        private TrieNode<K, V> node;
        private final int sizeDelta;

        public ModificationResult(@NotNull TrieNode<K, V> node, int i10) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.sizeDelta = i10;
        }

        @NotNull
        public final TrieNode<K, V> getNode() {
            return this.node;
        }

        public final int getSizeDelta() {
            return this.sizeDelta;
        }

        @NotNull
        public final ModificationResult<K, V> replaceNode(@NotNull Function1<? super TrieNode<K, V>, TrieNode<K, V>> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            setNode(operation.invoke(getNode()));
            return this;
        }

        public final void setNode(@NotNull TrieNode<K, V> trieNode) {
            Intrinsics.checkNotNullParameter(trieNode, "<set-?>");
            this.node = trieNode;
        }
    }

    public TrieNode(int i10, int i11, @NotNull Object[] buffer, @Nullable MutabilityOwnership mutabilityOwnership) {
        Intrinsics.checkNotNullParameter(buffer, "buffer");
        this.dataMap = i10;
        this.nodeMap = i11;
        this.ownedBy = mutabilityOwnership;
        this.buffer = buffer;
    }

    private final void accept(Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor, int hash, int shift) {
        visitor.invoke(this, Integer.valueOf(shift), Integer.valueOf(hash), Integer.valueOf(this.dataMap), Integer.valueOf(this.nodeMap));
        int i10 = this.nodeMap;
        while (i10 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i10);
            nodeAtIndex$runtime_release(nodeIndex$runtime_release(iLowestOneBit)).accept(visitor, (Integer.numberOfTrailingZeros(iLowestOneBit) << shift) + hash, shift + 5);
            i10 -= iLowestOneBit;
        }
    }

    private final ModificationResult<K, V> asInsertResult() {
        return new ModificationResult<>(this, 1);
    }

    private final ModificationResult<K, V> asUpdateResult() {
        return new ModificationResult<>(this, 0);
    }

    private final Object[] bufferMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        K kKeyAtIndex = keyAtIndex(keyIndex);
        return TrieNodeKt.replaceEntryWithNode(this.buffer, keyIndex, nodeIndex$runtime_release(positionMask) + 1, makeNode(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, valueAtKeyIndex(keyIndex), newKeyHash, newKey, newValue, shift + 5, owner));
    }

    private final int calculateSize() {
        if (this.nodeMap == 0) {
            return this.buffer.length / 2;
        }
        int iBitCount = Integer.bitCount(this.dataMap);
        int length = this.buffer.length;
        for (int i10 = iBitCount * 2; i10 < length; i10++) {
            iBitCount += nodeAtIndex$runtime_release(i10).calculateSize();
        }
        return iBitCount;
    }

    private final boolean collisionContainsKey(K key) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (!Intrinsics.areEqual(key, this.buffer[iE])) {
                if (iE != iF) {
                    iE += iG;
                }
            }
            return true;
        }
        return false;
    }

    private final V collisionGet(K key) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return null;
        }
        while (!Intrinsics.areEqual(key, keyAtIndex(iE))) {
            if (iE == iF) {
                return null;
            }
            iE += iG;
        }
        return valueAtKeyIndex(iE);
    }

    private final ModificationResult<K, V> collisionPut(K key, V value) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(iE))) {
                if (iE != iF) {
                    iE += iG;
                }
            }
            if (value == valueAtKeyIndex(iE)) {
                return null;
            }
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iE + 1] = value;
            return new TrieNode(0, 0, objArrCopyOf).asUpdateResult();
        }
        return new TrieNode(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value)).asInsertResult();
    }

    private final TrieNode<K, V> collisionRemove(K key) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(iE))) {
                if (iE != iF) {
                    iE += iG;
                }
            }
            return collisionRemoveEntryAtIndex(iE);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemoveEntryAtIndex(int i10) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(objArr, i10));
    }

    private final boolean elementsIdentityEquals(TrieNode<K, V> otherNode) {
        if (this == otherNode) {
            return true;
        }
        if (this.nodeMap != otherNode.nodeMap || this.dataMap != otherNode.dataMap) {
            return false;
        }
        int length = this.buffer.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (this.buffer[i10] != otherNode.buffer[i10]) {
                return false;
            }
        }
        return true;
    }

    private final boolean hasNodeAt(int positionMask) {
        return (positionMask & this.nodeMap) != 0;
    }

    private final TrieNode<K, V> insertEntryAt(int positionMask, K key, V value) {
        return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, entryKeyIndex$runtime_release(positionMask), key, value));
    }

    private final K keyAtIndex(int keyIndex) {
        return (K) this.buffer[keyIndex];
    }

    private final TrieNode<K, V> makeNode(int keyHash1, K key1, V value1, int keyHash2, K key2, V value2, int shift, MutabilityOwnership owner) {
        if (shift > 30) {
            return new TrieNode<>(0, 0, new Object[]{key1, value1, key2, value2}, owner);
        }
        int iIndexSegment = TrieNodeKt.indexSegment(keyHash1, shift);
        int iIndexSegment2 = TrieNodeKt.indexSegment(keyHash2, shift);
        if (iIndexSegment != iIndexSegment2) {
            return new TrieNode<>((1 << iIndexSegment) | (1 << iIndexSegment2), 0, iIndexSegment < iIndexSegment2 ? new Object[]{key1, value1, key2, value2} : new Object[]{key2, value2, key1, value1}, owner);
        }
        return new TrieNode<>(0, 1 << iIndexSegment, new Object[]{makeNode(keyHash1, key1, value1, keyHash2, key2, value2, shift + 5, owner)}, owner);
    }

    private final TrieNode<K, V> moveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift) {
        return new TrieNode<>(this.dataMap ^ positionMask, this.nodeMap | positionMask, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, null));
    }

    private final TrieNode<K, V> mutableCollisionPut(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(iE))) {
                if (iE != iF) {
                    iE += iG;
                }
            }
            mutator.setOperationResult$runtime_release(valueAtKeyIndex(iE));
            if (this.ownedBy == mutator.getOwnership()) {
                this.buffer[iE + 1] = value;
                return this;
            }
            mutator.setModCount$runtime_release(mutator.getModCount() + 1);
            Object[] objArr = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
            objArrCopyOf[iE + 1] = value;
            return new TrieNode<>(0, 0, objArrCopyOf, mutator.getOwnership());
        }
        mutator.setSize(mutator.size() + 1);
        return new TrieNode<>(0, 0, TrieNodeKt.insertEntryAtIndex(this.buffer, 0, key, value), mutator.getOwnership());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final TrieNode<K, V> mutableCollisionPutAll(TrieNode<K, V> otherNode, DeltaCounter intersectionCounter, MutabilityOwnership owner) {
        CommonFunctionsKt.m1260assert(this.nodeMap == 0);
        CommonFunctionsKt.m1260assert(this.dataMap == 0);
        CommonFunctionsKt.m1260assert(otherNode.nodeMap == 0);
        CommonFunctionsKt.m1260assert(otherNode.dataMap == 0);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + otherNode.buffer.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
        int length = this.buffer.length;
        d dVarT = g.t(g.v(0, otherNode.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (true) {
                if (collisionContainsKey(otherNode.buffer[iE])) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                } else {
                    Object[] objArr2 = otherNode.buffer;
                    objArrCopyOf[length] = objArr2[iE];
                    objArrCopyOf[length + 1] = objArr2[iE + 1];
                    length += 2;
                }
                if (iE == iF) {
                    break;
                }
                iE += iG;
            }
        }
        if (length == this.buffer.length) {
            return this;
        }
        if (length == otherNode.buffer.length) {
            return otherNode;
        }
        if (length == objArrCopyOf.length) {
            return new TrieNode<>(0, 0, objArrCopyOf, owner);
        }
        Object[] objArrCopyOf2 = Arrays.copyOf(objArrCopyOf, length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf2, "copyOf(this, newSize)");
        return new TrieNode<>(0, 0, objArrCopyOf2, owner);
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, PersistentHashMapBuilder<K, V> mutator) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (!Intrinsics.areEqual(key, keyAtIndex(iE))) {
                if (iE != iF) {
                    iE += iG;
                }
            }
            return mutableCollisionRemoveEntryAtIndex(iE, mutator);
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemoveEntryAtIndex(int i10, PersistentHashMapBuilder<K, V> mutator) {
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime_release(valueAtKeyIndex(i10));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode<>(0, 0, TrieNodeKt.removeEntryAtIndex(this.buffer, i10), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, i10);
        return this;
    }

    private final TrieNode<K, V> mutableInsertEntryAt(int positionMask, K key, V value, MutabilityOwnership owner) {
        int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(positionMask);
        if (this.ownedBy != owner) {
            return new TrieNode<>(positionMask | this.dataMap, this.nodeMap, TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, key, value), owner);
        }
        this.buffer = TrieNodeKt.insertEntryAtIndex(this.buffer, iEntryKeyIndex$runtime_release, key, value);
        this.dataMap = positionMask | this.dataMap;
        return this;
    }

    private final TrieNode<K, V> mutableMoveEntryToNode(int keyIndex, int positionMask, int newKeyHash, K newKey, V newValue, int shift, MutabilityOwnership owner) {
        if (this.ownedBy != owner) {
            return new TrieNode<>(this.dataMap ^ positionMask, positionMask | this.nodeMap, bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner), owner);
        }
        this.buffer = bufferMoveEntryToNode(keyIndex, positionMask, newKeyHash, newKey, newValue, shift, owner);
        this.dataMap ^= positionMask;
        this.nodeMap |= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutablePutAllFromOtherNodeCell(TrieNode<K, V> otherNode, int positionMask, int shift, DeltaCounter intersectionCounter, PersistentHashMapBuilder<K, V> mutator) {
        if (hasNodeAt(positionMask)) {
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(positionMask));
            if (otherNode.hasNodeAt(positionMask)) {
                return trieNodeNodeAtIndex$runtime_release.mutablePutAll(otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(positionMask)), shift + 5, intersectionCounter, mutator);
            }
            if (!otherNode.hasEntryAt$runtime_release(positionMask)) {
                return trieNodeNodeAtIndex$runtime_release;
            }
            int iEntryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release);
            V vValueAtKeyIndex = otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            int size = mutator.size();
            TrieNode<K, V> trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(kKeyAtIndex != null ? kKeyAtIndex.hashCode() : 0, kKeyAtIndex, vValueAtKeyIndex, shift + 5, mutator);
            if (mutator.size() == size) {
                intersectionCounter.setCount(intersectionCounter.getCount() + 1);
            }
            return trieNodeMutablePut;
        }
        if (!otherNode.hasNodeAt(positionMask)) {
            int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex2 = keyAtIndex(iEntryKeyIndex$runtime_release2);
            V vValueAtKeyIndex2 = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            int iEntryKeyIndex$runtime_release3 = otherNode.entryKeyIndex$runtime_release(positionMask);
            K kKeyAtIndex3 = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release3);
            return makeNode(kKeyAtIndex2 != null ? kKeyAtIndex2.hashCode() : 0, kKeyAtIndex2, vValueAtKeyIndex2, kKeyAtIndex3 != null ? kKeyAtIndex3.hashCode() : 0, kKeyAtIndex3, otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release3), shift + 5, mutator.getOwnership());
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release2 = otherNode.nodeAtIndex$runtime_release(otherNode.nodeIndex$runtime_release(positionMask));
        if (!hasEntryAt$runtime_release(positionMask)) {
            return trieNodeNodeAtIndex$runtime_release2;
        }
        int iEntryKeyIndex$runtime_release4 = entryKeyIndex$runtime_release(positionMask);
        K kKeyAtIndex4 = keyAtIndex(iEntryKeyIndex$runtime_release4);
        int i10 = shift + 5;
        if (!trieNodeNodeAtIndex$runtime_release2.containsKey(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, i10)) {
            return trieNodeNodeAtIndex$runtime_release2.mutablePut(kKeyAtIndex4 != null ? kKeyAtIndex4.hashCode() : 0, kKeyAtIndex4, valueAtKeyIndex(iEntryKeyIndex$runtime_release4), i10, mutator);
        }
        intersectionCounter.setCount(intersectionCounter.getCount() + 1);
        return trieNodeNodeAtIndex$runtime_release2;
    }

    private final TrieNode<K, V> mutableRemoveEntryAtIndex(int keyIndex, int positionMask, PersistentHashMapBuilder<K, V> mutator) {
        mutator.setSize(mutator.size() - 1);
        mutator.setOperationResult$runtime_release(valueAtKeyIndex(keyIndex));
        if (this.buffer.length == 2) {
            return null;
        }
        if (this.ownedBy != mutator.getOwnership()) {
            return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex), mutator.getOwnership());
        }
        this.buffer = TrieNodeKt.removeEntryAtIndex(this.buffer, keyIndex);
        this.dataMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableRemoveNodeAtIndex(int nodeIndex, int positionMask, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        if (this.ownedBy != owner) {
            return new TrieNode<>(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex), owner);
        }
        this.buffer = TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex);
        this.nodeMap ^= positionMask;
        return this;
    }

    private final TrieNode<K, V> mutableReplaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask, MutabilityOwnership owner) {
        return newNode == null ? mutableRemoveNodeAtIndex(nodeIndex, positionMask, owner) : (this.ownedBy == owner || targetNode != newNode) ? mutableUpdateNodeAtIndex(nodeIndex, newNode, owner) : this;
    }

    private final TrieNode<K, V> mutableUpdateNodeAtIndex(int nodeIndex, TrieNode<K, V> newNode, MutabilityOwnership owner) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1 && newNode.buffer.length == 2 && newNode.nodeMap == 0) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        if (this.ownedBy == owner) {
            objArr[nodeIndex] = newNode;
            return this;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[nodeIndex] = newNode;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, owner);
    }

    private final TrieNode<K, V> mutableUpdateValueAtIndex(int keyIndex, V value, PersistentHashMapBuilder<K, V> mutator) {
        if (this.ownedBy == mutator.getOwnership()) {
            this.buffer[keyIndex + 1] = value;
            return this;
        }
        mutator.setModCount$runtime_release(mutator.getModCount() + 1);
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf, mutator.getOwnership());
    }

    private final TrieNode<K, V> removeEntryAtIndex(int keyIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 2) {
            return null;
        }
        return new TrieNode<>(positionMask ^ this.dataMap, this.nodeMap, TrieNodeKt.removeEntryAtIndex(objArr, keyIndex));
    }

    private final TrieNode<K, V> removeNodeAtIndex(int nodeIndex, int positionMask) {
        Object[] objArr = this.buffer;
        if (objArr.length == 1) {
            return null;
        }
        return new TrieNode<>(this.dataMap, positionMask ^ this.nodeMap, TrieNodeKt.removeNodeAtIndex(objArr, nodeIndex));
    }

    private final TrieNode<K, V> replaceNode(TrieNode<K, V> targetNode, TrieNode<K, V> newNode, int nodeIndex, int positionMask) {
        return newNode == null ? removeNodeAtIndex(nodeIndex, positionMask) : targetNode != newNode ? updateNodeAtIndex(nodeIndex, positionMask, newNode) : this;
    }

    private final TrieNode<K, V> updateNodeAtIndex(int nodeIndex, int positionMask, TrieNode<K, V> newNode) {
        Object[] objArr = newNode.buffer;
        if (objArr.length != 2 || newNode.nodeMap != 0) {
            Object[] objArr2 = this.buffer;
            Object[] objArrCopyOf = Arrays.copyOf(objArr2, objArr2.length);
            Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, newSize)");
            objArrCopyOf[nodeIndex] = newNode;
            return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
        }
        if (this.buffer.length == 1) {
            newNode.dataMap = this.nodeMap;
            return newNode;
        }
        return new TrieNode<>(this.dataMap ^ positionMask, positionMask ^ this.nodeMap, TrieNodeKt.replaceNodeWithEntry(this.buffer, nodeIndex, entryKeyIndex$runtime_release(positionMask), objArr[0], objArr[1]));
    }

    private final TrieNode<K, V> updateValueAtIndex(int keyIndex, V value) {
        Object[] objArr = this.buffer;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(this, size)");
        objArrCopyOf[keyIndex + 1] = value;
        return new TrieNode<>(this.dataMap, this.nodeMap, objArrCopyOf);
    }

    private final V valueAtKeyIndex(int keyIndex) {
        return (V) this.buffer[keyIndex + 1];
    }

    public final void accept$runtime_release(@NotNull Function5<? super TrieNode<K, V>, ? super Integer, ? super Integer, ? super Integer, ? super Integer, Unit> visitor) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        accept(visitor, 0, 0);
    }

    public final boolean containsKey(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            return Intrinsics.areEqual(key, keyAtIndex(entryKeyIndex$runtime_release(iIndexSegment)));
        }
        if (!hasNodeAt(iIndexSegment)) {
            return false;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionContainsKey(key) : trieNodeNodeAtIndex$runtime_release.containsKey(keyHash, key, shift + 5);
    }

    public final int entryCount$runtime_release() {
        return Integer.bitCount(this.dataMap);
    }

    public final int entryKeyIndex$runtime_release(int positionMask) {
        return Integer.bitCount((positionMask - 1) & this.dataMap) * 2;
    }

    @Nullable
    public final V get(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release);
            }
            return null;
        }
        if (!hasNodeAt(iIndexSegment)) {
            return null;
        }
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(nodeIndex$runtime_release(iIndexSegment));
        return shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionGet(key) : trieNodeNodeAtIndex$runtime_release.get(keyHash, key, shift + 5);
    }

    @NotNull
    /* JADX INFO: renamed from: getBuffer$runtime_release, reason: from getter */
    public final Object[] getBuffer() {
        return this.buffer;
    }

    public final boolean hasEntryAt$runtime_release(int positionMask) {
        return (positionMask & this.dataMap) != 0;
    }

    @NotNull
    public final TrieNode<K, V> mutablePut(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        PersistentHashMapBuilder<K, V> persistentHashMapBuilder;
        TrieNode<K, V> trieNodeMutablePut;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                mutator.setOperationResult$runtime_release(valueAtKeyIndex(iEntryKeyIndex$runtime_release));
                return valueAtKeyIndex(iEntryKeyIndex$runtime_release) == value ? this : mutableUpdateValueAtIndex(iEntryKeyIndex$runtime_release, value, mutator);
            }
            mutator.setSize(mutator.size() + 1);
            return mutableMoveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift, mutator.getOwnership());
        }
        if (!hasNodeAt(iIndexSegment)) {
            mutator.setSize(mutator.size() + 1);
            return mutableInsertEntryAt(iIndexSegment, key, value, mutator.getOwnership());
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutableCollisionPut(key, value, mutator);
            persistentHashMapBuilder = mutator;
        } else {
            persistentHashMapBuilder = mutator;
            trieNodeMutablePut = trieNodeNodeAtIndex$runtime_release.mutablePut(keyHash, key, value, shift + 5, persistentHashMapBuilder);
        }
        return trieNodeNodeAtIndex$runtime_release == trieNodeMutablePut ? this : mutableUpdateNodeAtIndex(iNodeIndex$runtime_release, trieNodeMutablePut, persistentHashMapBuilder.getOwnership());
    }

    @NotNull
    public final TrieNode<K, V> mutablePutAll(@NotNull TrieNode<K, V> otherNode, int shift, @NotNull DeltaCounter intersectionCounter, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(otherNode, "otherNode");
        Intrinsics.checkNotNullParameter(intersectionCounter, "intersectionCounter");
        PersistentHashMapBuilder<K, V> mutator2 = mutator;
        Intrinsics.checkNotNullParameter(mutator2, "mutator");
        if (this == otherNode) {
            intersectionCounter.plusAssign(calculateSize());
            return this;
        }
        int i10 = shift;
        if (i10 > 30) {
            return mutableCollisionPutAll(otherNode, intersectionCounter, mutator2.getOwnership());
        }
        int i11 = this.nodeMap | otherNode.nodeMap;
        int i12 = this.dataMap;
        int i13 = otherNode.dataMap;
        int i14 = (i12 ^ i13) & (~i11);
        int i15 = i12 & i13;
        while (i15 != 0) {
            int iLowestOneBit = Integer.lowestOneBit(i15);
            if (Intrinsics.areEqual(keyAtIndex(entryKeyIndex$runtime_release(iLowestOneBit)), otherNode.keyAtIndex(otherNode.entryKeyIndex$runtime_release(iLowestOneBit)))) {
                i14 |= iLowestOneBit;
            } else {
                i11 |= iLowestOneBit;
            }
            i15 ^= iLowestOneBit;
        }
        if ((i11 & i14) != 0) {
            throw new IllegalStateException("Check failed.");
        }
        TrieNode<K, V> trieNode = (Intrinsics.areEqual(this.ownedBy, mutator2.getOwnership()) && this.dataMap == i14 && this.nodeMap == i11) ? this : new TrieNode<>(i14, i11, new Object[(Integer.bitCount(i14) * 2) + Integer.bitCount(i11)]);
        int i16 = 0;
        int i17 = i11;
        int i18 = 0;
        while (i17 != 0) {
            int iLowestOneBit2 = Integer.lowestOneBit(i17);
            trieNode.buffer[(r11.length - 1) - i18] = mutablePutAllFromOtherNodeCell(otherNode, iLowestOneBit2, i10, intersectionCounter, mutator2);
            i18++;
            i17 ^= iLowestOneBit2;
            i10 = shift;
            mutator2 = mutator;
        }
        while (i14 != 0) {
            int iLowestOneBit3 = Integer.lowestOneBit(i14);
            int i19 = i16 * 2;
            if (otherNode.hasEntryAt$runtime_release(iLowestOneBit3)) {
                int iEntryKeyIndex$runtime_release = otherNode.entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode.buffer[i19] = otherNode.keyAtIndex(iEntryKeyIndex$runtime_release);
                trieNode.buffer[i19 + 1] = otherNode.valueAtKeyIndex(iEntryKeyIndex$runtime_release);
                if (hasEntryAt$runtime_release(iLowestOneBit3)) {
                    intersectionCounter.setCount(intersectionCounter.getCount() + 1);
                }
            } else {
                int iEntryKeyIndex$runtime_release2 = entryKeyIndex$runtime_release(iLowestOneBit3);
                trieNode.buffer[i19] = keyAtIndex(iEntryKeyIndex$runtime_release2);
                trieNode.buffer[i19 + 1] = valueAtKeyIndex(iEntryKeyIndex$runtime_release2);
            }
            i16++;
            i14 ^= iLowestOneBit3;
        }
        return elementsIdentityEquals(trieNode) ? this : otherNode.elementsIdentityEquals(trieNode) ? otherNode : trieNode;
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, mutator);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, shift == 30 ? trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(key, mutator) : trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, shift + 5, mutator), iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
        }
        return this;
    }

    @NotNull
    public final TrieNode<K, V> nodeAtIndex$runtime_release(int nodeIndex) {
        Object obj = this.buffer[nodeIndex];
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode>");
        return (TrieNode) obj;
    }

    public final int nodeIndex$runtime_release(int positionMask) {
        return (this.buffer.length - 1) - Integer.bitCount((positionMask - 1) & this.nodeMap);
    }

    @Nullable
    public final ModificationResult<K, V> put(int keyHash, K key, V value, int shift) {
        ModificationResult<K, V> modificationResultPut;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (!Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return moveEntryToNode(iEntryKeyIndex$runtime_release, iIndexSegment, keyHash, key, value, shift).asInsertResult();
            }
            if (valueAtKeyIndex(iEntryKeyIndex$runtime_release) == value) {
                return null;
            }
            return updateValueAtIndex(iEntryKeyIndex$runtime_release, value).asUpdateResult();
        }
        if (!hasNodeAt(iIndexSegment)) {
            return insertEntryAt(iIndexSegment, key, value).asInsertResult();
        }
        int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
        TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
        if (shift == 30) {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.collisionPut(key, value);
            if (modificationResultPut == null) {
                return null;
            }
        } else {
            modificationResultPut = trieNodeNodeAtIndex$runtime_release.put(keyHash, key, value, shift + 5);
            if (modificationResultPut == null) {
                return null;
            }
        }
        modificationResultPut.setNode(updateNodeAtIndex(iNodeIndex$runtime_release, iIndexSegment, modificationResultPut.getNode()));
        return modificationResultPut;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, int shift) {
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            return replaceNode(trieNodeNodeAtIndex$runtime_release, shift == 30 ? trieNodeNodeAtIndex$runtime_release.collisionRemove(key) : trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, shift + 5), iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }

    private final TrieNode<K, V> collisionRemove(K key, V value) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (true) {
                if (!Intrinsics.areEqual(key, keyAtIndex(iE)) || !Intrinsics.areEqual(value, valueAtKeyIndex(iE))) {
                    if (iE == iF) {
                        break;
                    }
                    iE += iG;
                } else {
                    return collisionRemoveEntryAtIndex(iE);
                }
            }
        }
        return this;
    }

    private final TrieNode<K, V> mutableCollisionRemove(K key, V value, PersistentHashMapBuilder<K, V> mutator) {
        d dVarT = g.t(g.v(0, this.buffer.length), 2);
        int iE = dVarT.e();
        int iF = dVarT.f();
        int iG = dVarT.g();
        if ((iG > 0 && iE <= iF) || (iG < 0 && iF <= iE)) {
            while (true) {
                if (!Intrinsics.areEqual(key, keyAtIndex(iE)) || !Intrinsics.areEqual(value, valueAtKeyIndex(iE))) {
                    if (iE == iF) {
                        break;
                    }
                    iE += iG;
                } else {
                    return mutableCollisionRemoveEntryAtIndex(iE, mutator);
                }
            }
        }
        return this;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TrieNode(int i10, int i11, @NotNull Object[] buffer) {
        this(i10, i11, buffer, null);
        Intrinsics.checkNotNullParameter(buffer, "buffer");
    }

    @Nullable
    public final TrieNode<K, V> mutableRemove(int keyHash, K key, V value, int shift, @NotNull PersistentHashMapBuilder<K, V> mutator) {
        TrieNode<K, V> trieNodeMutableRemove;
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release)) && Intrinsics.areEqual(value, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return mutableRemoveEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment, mutator);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (shift == 30) {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableCollisionRemove(key, value, mutator);
            } else {
                trieNodeMutableRemove = trieNodeNodeAtIndex$runtime_release.mutableRemove(keyHash, key, value, shift + 5, mutator);
            }
            return mutableReplaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeMutableRemove, iNodeIndex$runtime_release, iIndexSegment, mutator.getOwnership());
        }
        return this;
    }

    @Nullable
    public final TrieNode<K, V> remove(int keyHash, K key, V value, int shift) {
        TrieNode<K, V> trieNodeRemove;
        int iIndexSegment = 1 << TrieNodeKt.indexSegment(keyHash, shift);
        if (hasEntryAt$runtime_release(iIndexSegment)) {
            int iEntryKeyIndex$runtime_release = entryKeyIndex$runtime_release(iIndexSegment);
            if (Intrinsics.areEqual(key, keyAtIndex(iEntryKeyIndex$runtime_release)) && Intrinsics.areEqual(value, valueAtKeyIndex(iEntryKeyIndex$runtime_release))) {
                return removeEntryAtIndex(iEntryKeyIndex$runtime_release, iIndexSegment);
            }
        } else if (hasNodeAt(iIndexSegment)) {
            int iNodeIndex$runtime_release = nodeIndex$runtime_release(iIndexSegment);
            TrieNode<K, V> trieNodeNodeAtIndex$runtime_release = nodeAtIndex$runtime_release(iNodeIndex$runtime_release);
            if (shift == 30) {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.collisionRemove(key, value);
            } else {
                trieNodeRemove = trieNodeNodeAtIndex$runtime_release.remove(keyHash, key, value, shift + 5);
            }
            return replaceNode(trieNodeNodeAtIndex$runtime_release, trieNodeRemove, iNodeIndex$runtime_release, iIndexSegment);
        }
        return this;
    }
}
