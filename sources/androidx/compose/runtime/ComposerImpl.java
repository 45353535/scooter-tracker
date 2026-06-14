package androidx.compose.runtime;

import androidx.compose.runtime.GroupKind;
import androidx.compose.runtime.collection.IdentityArrayMap;
import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.collection.IntMap;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.snapshots.ListUtilsKt;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.runtime.snapshots.SnapshotKt;
import androidx.compose.runtime.tooling.CompositionData;
import androidx.compose.runtime.tooling.InspectionTablesKt;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.mediation.MediationConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.D5;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.z;
import lf.g;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0011\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b7\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0000\u0018\u00002\u00020\u0001:\u0004ª\u0003«\u0003B\u0095\u0001\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012,\u0010\u0011\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b\u0012,\u0010\u0012\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b\u001d\u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0018J/\u0010(\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'H\u0002¢\u0006\u0004\b(\u0010)J7\u0010(\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\b(\u0010+J\u007f\u0010.\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'2&\u0010,\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'2&\u0010-\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'H\u0002¢\u0006\u0004\b.\u0010/JK\u00102\u001a\u00028\u0000\"\u0004\b\u0000\u001002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000%2&\u00101\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'H\u0002¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020\u000fH\u0002¢\u0006\u0004\b4\u0010\u0018J\u000f\u00105\u001a\u00020\u000fH\u0002¢\u0006\u0004\b5\u0010\u0018J!\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0004\b9\u0010:J9\u0010@\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010\u001f2\u0006\u0010=\u001a\u00020<2\b\u00108\u001a\u0004\u0018\u00010\u001fH\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b>\u0010?J!\u0010C\u001a\u00020\u000f2\u0006\u00107\u001a\u0002062\b\u0010B\u001a\u0004\u0018\u00010AH\u0002¢\u0006\u0004\bC\u0010DJ\u001f\u0010G\u001a\u00020\u000f2\u0006\u0010E\u001a\u00020\u001b2\u0006\u0010F\u001a\u000206H\u0002¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000f2\u0006\u00107\u001a\u000206H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u000fH\u0002¢\u0006\u0004\bK\u0010\u0018J\u0017\u0010M\u001a\u00020\u001b2\u0006\u0010L\u001a\u00020\u001bH\u0002¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010O\u001a\u00020\u001bH\u0002¢\u0006\u0004\bP\u0010QJ/\u0010U\u001a\u00020\u001b2\u0006\u0010R\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020\u001b2\u0006\u0010T\u001a\u00020\u001bH\u0002¢\u0006\u0004\bU\u0010VJ\u0017\u0010W\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\bW\u0010NJ\u001f\u0010Y\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020\u001bH\u0002¢\u0006\u0004\bY\u0010QJ\u000f\u0010Z\u001a\u00020\u000fH\u0002¢\u0006\u0004\bZ\u0010\u0018J'\u0010^\u001a\u00020\u000f2\u0006\u0010[\u001a\u00020\u001b2\u0006\u0010\\\u001a\u00020\u001b2\u0006\u0010]\u001a\u00020\u001bH\u0002¢\u0006\u0004\b^\u0010_J\u001f\u0010a\u001a\u00020\u000f2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010`\u001a\u00020\u001bH\u0002¢\u0006\u0004\ba\u0010QJ'\u0010c\u001a\u00020\u001b2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010S\u001a\u00020\u001b2\u0006\u0010b\u001a\u00020\u001bH\u0002¢\u0006\u0004\bc\u0010dJ\u001b\u0010f\u001a\u00020\u001b*\u00020e2\u0006\u0010*\u001a\u00020\u001bH\u0002¢\u0006\u0004\bf\u0010gJ\u000f\u0010h\u001a\u00020\u000fH\u0002¢\u0006\u0004\bh\u0010\u0018J\u000f\u0010i\u001a\u00020\u000fH\u0002¢\u0006\u0004\bi\u0010\u0018JY\u0010o\u001a\u00020\u000f2\u000e\u0010k\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0j2&\u0010l\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'2\b\u0010m\u001a\u0004\u0018\u00010\u001f2\u0006\u0010n\u001a\u000206H\u0002¢\u0006\u0004\bo\u0010pJ+\u0010u\u001a\u00020\u000f2\u001a\u0010t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020s\u0012\u0006\u0012\u0004\u0018\u00010s0r0qH\u0002¢\u0006\u0004\bu\u0010vJR\u0010{\u001a\u00028\u0000\"\u0004\b\u0000\u0010w2,\u0010x\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b2\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0082\b¢\u0006\u0004\b{\u0010|J,\u0010~\u001a\u00028\u0000\"\u0004\b\u0000\u0010w2\u0006\u0010}\u001a\u00020e2\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0082\b¢\u0006\u0004\b~\u0010\u007fJs\u0010\u0085\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010w2\u000b\b\u0002\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u00132\u000b\b\u0002\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010L\u001a\u0004\u0018\u00010\u001b2%\b\u0002\u0010\u0084\u0001\u001a\u001e\u0012\u001a\u0012\u0018\u0012\u0005\u0012\u00030\u0082\u0001\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0083\u00010r0q2\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001JH\u0010\u008a\u0001\u001a\u00020\u000f2\u001e\u0010\u0088\u0001\u001a\u0019\u0012\u0005\u0012\u00030\u0082\u0001\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0083\u00010\u0087\u00012\u0014\u0010k\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0018\u00010y¢\u0006\u0003\b\u0089\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J \u0010\u008c\u0001\u001a\u0004\u0018\u00010\u001f*\u00020e2\u0006\u0010L\u001a\u00020\u001bH\u0002¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u008e\u0001\u0010\u0018J\u0011\u0010\u008f\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u0018J;\u0010\u0091\u0001\u001a\u00020\u000f2'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J;\u0010\u0093\u0001\u001a\u00020\u000f2'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b\u0093\u0001\u0010\u0092\u0001J;\u0010\u0094\u0001\u001a\u00020\u000f2'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0092\u0001JF\u0010\u0096\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u0095\u0001\u001a\u0002062'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001J\u0011\u0010\u0098\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u0098\u0001\u0010\u0018J$\u0010\u009b\u0001\u001a\u00020\u000f2\u0010\u0010\u009a\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u0099\u0001H\u0002¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u0011\u0010\u009b\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b\u009b\u0001\u0010\u0018J\u001d\u0010\u009e\u0001\u001a\u00020\u000f2\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u0011\u0010 \u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b \u0001\u0010\u0018J\u001c\u0010¡\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u0095\u0001\u001a\u000206H\u0002¢\u0006\u0005\b¡\u0001\u0010JJ\u001c\u0010¤\u0001\u001a\u00020\u000f2\b\u0010£\u0001\u001a\u00030¢\u0001H\u0002¢\u0006\u0006\b¤\u0001\u0010¥\u0001J;\u0010¦\u0001\u001a\u00020\u000f2'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b¦\u0001\u0010\u0092\u0001J;\u0010§\u0001\u001a\u00020\u000f2'\u0010\u0090\u0001\u001a\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010H\u0002¢\u0006\u0006\b§\u0001\u0010\u0092\u0001J\u0011\u0010¨\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b¨\u0001\u0010\u0018J\u0011\u0010©\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b©\u0001\u0010\u0018J\u001a\u0010«\u0001\u001a\u00020\u000f2\u0007\u0010ª\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b«\u0001\u0010\u001eJ$\u0010®\u0001\u001a\u00020\u000f2\u0007\u0010¬\u0001\u001a\u00020s2\u0007\u0010\u00ad\u0001\u001a\u00020\rH\u0002¢\u0006\u0006\b®\u0001\u0010¯\u0001J\u0011\u0010°\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b°\u0001\u0010\u0018J\u001a\u0010²\u0001\u001a\u00020\u000f2\u0007\u0010±\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\b²\u0001\u0010\u001eJ\u0011\u0010³\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b³\u0001\u0010\u0018J\u0011\u0010´\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b´\u0001\u0010\u0018J\u0011\u0010µ\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\bµ\u0001\u0010\u0018J\u0011\u0010¶\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b¶\u0001\u0010\u0018J\u0011\u0010·\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b·\u0001\u0010\u0018J\"\u0010¹\u0001\u001a\u00020\u000f2\u0007\u0010¸\u0001\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020\u001bH\u0002¢\u0006\u0005\b¹\u0001\u0010QJ+\u0010º\u0001\u001a\u00020\u000f2\u0007\u0010\u0080\u0001\u001a\u00020\u001b2\u0007\u0010\u0081\u0001\u001a\u00020\u001b2\u0006\u0010X\u001a\u00020\u001bH\u0002¢\u0006\u0005\bº\u0001\u0010_J\u0011\u0010»\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0005\b»\u0001\u0010\u0018J/\u0010½\u0001\u001a\u00020\u000f2\u0007\u0010¼\u0001\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u00108\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\b½\u0001\u0010¾\u0001J\u001a\u0010À\u0001\u001a\u00020\u000f2\u0007\u0010¿\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\bÀ\u0001\u0010\u001eJ/\u0010Á\u0001\u001a\u00020\u000f2\u0007\u0010¼\u0001\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u00108\u001a\u0004\u0018\u00010\u001fH\u0002¢\u0006\u0006\bÁ\u0001\u0010¾\u0001J\u001a\u0010Â\u0001\u001a\u00020\u000f2\u0007\u0010¼\u0001\u001a\u00020\u001bH\u0002¢\u0006\u0005\bÂ\u0001\u0010\u001eJ\u0019\u0010Ã\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0005\bÃ\u0001\u0010\u001eJ\u0011\u0010Ä\u0001\u001a\u00020\u000fH\u0017¢\u0006\u0005\bÄ\u0001\u0010\u0018J\u0011\u0010Å\u0001\u001a\u00020\u000fH\u0017¢\u0006\u0005\bÅ\u0001\u0010\u0018J\u0011\u0010Æ\u0001\u001a\u00020\u000fH\u0017¢\u0006\u0005\bÆ\u0001\u0010\u0018J#\u0010Ç\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0005\bÇ\u0001\u0010!J\u0011\u0010È\u0001\u001a\u00020\u000fH\u0017¢\u0006\u0005\bÈ\u0001\u0010\u0018J\u0011\u0010Ê\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\bÉ\u0001\u0010\u0018J\u0011\u0010Ë\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bË\u0001\u0010\u0018J\u0011\u0010Í\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\bÌ\u0001\u0010\u0018J\u0012\u0010Ð\u0001\u001a\u000206H\u0000¢\u0006\u0006\bÎ\u0001\u0010Ï\u0001J\u0011\u0010Ñ\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÑ\u0001\u0010\u0018J\u0011\u0010Ò\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÒ\u0001\u0010\u0018J'\u0010Ô\u0001\u001a\u00020\u000f\"\u0004\b\u0000\u001002\r\u0010Ó\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0016¢\u0006\u0006\bÔ\u0001\u0010Õ\u0001J\u0011\u0010Ö\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÖ\u0001\u0010\u0018J\u0011\u0010×\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b×\u0001\u0010\u0018J#\u0010Ø\u0001\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0005\bØ\u0001\u0010!J\u0011\u0010Ù\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÙ\u0001\u0010\u0018J\u0011\u0010Ú\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÚ\u0001\u0010\u0018J\u0011\u0010Û\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\bÛ\u0001\u0010\u0018J\u001a\u0010Ý\u0001\u001a\u00020\u000f2\u0007\u0010Ü\u0001\u001a\u00020\u001bH\u0016¢\u0006\u0005\bÝ\u0001\u0010\u001eJC\u0010á\u0001\u001a\u00020\u000f\"\u0005\b\u0000\u0010Þ\u0001\"\u0004\b\u0001\u001002\u0007\u0010ß\u0001\u001a\u00028\u00002\u0019\u0010z\u001a\u0015\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u000f0à\u0001H\u0016¢\u0006\u0006\bá\u0001\u0010â\u0001J(\u0010å\u0001\u001a\u00020\u001f2\t\u0010ã\u0001\u001a\u0004\u0018\u00010\u001f2\t\u0010ä\u0001\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\bå\u0001\u0010æ\u0001J\u0014\u0010ç\u0001\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0006\bç\u0001\u0010è\u0001J\u001d\u0010é\u0001\u001a\u0002062\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\bé\u0001\u0010ê\u0001J\u001d\u0010ë\u0001\u001a\u0002062\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\bë\u0001\u0010ê\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030ì\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010í\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030î\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ï\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030ð\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ñ\u0001J\u001b\u0010é\u0001\u001a\u0002062\u0007\u0010ß\u0001\u001a\u000206H\u0017¢\u0006\u0006\bé\u0001\u0010ò\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030ó\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ô\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030õ\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ö\u0001J\u001c\u0010é\u0001\u001a\u0002062\b\u0010ß\u0001\u001a\u00030÷\u0001H\u0017¢\u0006\u0006\bé\u0001\u0010ø\u0001J\u001b\u0010é\u0001\u001a\u0002062\u0007\u0010ß\u0001\u001a\u00020\u001bH\u0017¢\u0006\u0006\bé\u0001\u0010ù\u0001J3\u0010û\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u001002\u0007\u0010ú\u0001\u001a\u0002062\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000yH\u0087\bø\u0001\u0002¢\u0006\u0006\bû\u0001\u0010ü\u0001J\u001d\u0010ý\u0001\u001a\u00020\u000f2\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0006\bý\u0001\u0010\u009f\u0001J\u001d\u0010þ\u0001\u001a\u00020\u000f2\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001fH\u0001¢\u0006\u0006\bþ\u0001\u0010\u009f\u0001J!\u0010\u0080\u0002\u001a\u00020\u000f2\r\u0010ÿ\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0yH\u0016¢\u0006\u0006\b\u0080\u0002\u0010Õ\u0001J)\u0010\u0083\u0002\u001a\u00020\u000f2\u0015\u0010\u0082\u0002\u001a\u0010\u0012\u000b\b\u0001\u0012\u0007\u0012\u0002\b\u00030\u0081\u00020\u0099\u0001H\u0017¢\u0006\u0006\b\u0083\u0002\u0010\u0084\u0002J\u0011\u0010\u0085\u0002\u001a\u00020\u000fH\u0017¢\u0006\u0005\b\u0085\u0002\u0010\u0018J&\u0010\u0086\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u001002\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000%H\u0017¢\u0006\u0006\b\u0086\u0002\u0010\u0087\u0002J\u0012\u0010\u0088\u0002\u001a\u00020\u0004H\u0016¢\u0006\u0006\b\u0088\u0002\u0010\u0089\u0002J&\u0010\u008d\u0002\u001a\u0002062\u0007\u00101\u001a\u00030\u0082\u00012\t\u0010\u008a\u0002\u001a\u0004\u0018\u00010\u001fH\u0000¢\u0006\u0006\b\u008b\u0002\u0010\u008c\u0002J\u0012\u0010\u0090\u0002\u001a\u00020\u001bH\u0000¢\u0006\u0006\b\u008e\u0002\u0010\u008f\u0002J\u0011\u0010\u0091\u0002\u001a\u00020\u000fH\u0017¢\u0006\u0005\b\u0091\u0002\u0010\u0018J\u0011\u0010\u0092\u0002\u001a\u00020\u000fH\u0017¢\u0006\u0005\b\u0092\u0002\u0010\u0018J\u001a\u0010\u0093\u0002\u001a\u00020\u000f2\u0007\u0010é\u0001\u001a\u000206H\u0017¢\u0006\u0005\b\u0093\u0002\u0010JJ\u001a\u0010\u0094\u0002\u001a\u00020\u00012\u0006\u0010\u001c\u001a\u00020\u001bH\u0017¢\u0006\u0006\b\u0094\u0002\u0010\u0095\u0002J\u0015\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0096\u0002H\u0017¢\u0006\u0006\b\u0097\u0002\u0010\u0098\u0002J)\u0010\u0099\u0002\u001a\u00020\u000f2\u000b\u0010ß\u0001\u001a\u0006\u0012\u0002\b\u00030j2\b\u0010m\u001a\u0004\u0018\u00010\u001fH\u0017¢\u0006\u0006\b\u0099\u0002\u0010\u009a\u0002J-\u0010\u009b\u0002\u001a\u00020\u000f2\u001a\u0010t\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020s\u0012\u0006\u0012\u0004\u0018\u00010s0r0qH\u0017¢\u0006\u0005\b\u009b\u0002\u0010vJ\u001c\u0010\u009d\u0002\u001a\u00020\u000f2\b\u0010\u009d\u0002\u001a\u00030\u009c\u0002H\u0017¢\u0006\u0006\b\u009d\u0002\u0010\u009e\u0002J$\u0010\u009f\u0002\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u009d\u0002\u001a\u00030\u009c\u0002H\u0017¢\u0006\u0006\b\u009f\u0002\u0010 \u0002J\u0011\u0010¡\u0002\u001a\u00020\u000fH\u0017¢\u0006\u0005\b¡\u0002\u0010\u0018J\u0011\u0010¢\u0002\u001a\u00020\u000fH\u0016¢\u0006\u0005\b¢\u0002\u0010\u0018JF\u0010¤\u0002\u001a\u00020\u000f2\u001e\u0010\u0088\u0001\u001a\u0019\u0012\u0005\u0012\u00030\u0082\u0001\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0083\u00010\u0087\u00012\u0012\u0010k\u001a\u000e\u0012\u0004\u0012\u00020\u000f0y¢\u0006\u0003\b\u0089\u0001H\u0000¢\u0006\u0006\b£\u0002\u0010\u008b\u0001J \u0010¦\u0002\u001a\u00020\u000f2\f\u0010z\u001a\b\u0012\u0004\u0012\u00020\u000f0yH\u0000¢\u0006\u0006\b¥\u0002\u0010Õ\u0001J2\u0010©\u0002\u001a\u0002062\u001e\u0010\u0088\u0001\u001a\u0019\u0012\u0005\u0012\u00030\u0082\u0001\u0012\r\u0012\u000b\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0083\u00010\u0087\u0001H\u0000¢\u0006\u0006\b§\u0002\u0010¨\u0002J\u0011\u0010«\u0002\u001a\u00020\u000fH\u0000¢\u0006\u0005\bª\u0002\u0010\u0018J\u0014\u0010¬\u0002\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b¬\u0002\u0010è\u0001J\u001d\u0010\u00ad\u0002\u001a\u00020\u000f2\t\u0010ß\u0001\u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0006\b\u00ad\u0002\u0010\u009f\u0001J\u001b\u0010¯\u0002\u001a\u00020\u000f2\u0007\u00101\u001a\u00030®\u0002H\u0016¢\u0006\u0006\b¯\u0002\u0010°\u0002R!\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0003\u0010±\u0002\u001a\u0006\b²\u0002\u0010³\u0002R\u0015\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0005\u0010´\u0002R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0007\u0010µ\u0002R\u001b\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\n\u0010¶\u0002R=\u0010\u0011\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0011\u0010·\u0002R=\u0010\u0012\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0012\u0010·\u0002R\u001d\u0010\u0014\u001a\u00020\u00138\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b\u0014\u0010¸\u0002\u001a\u0006\b¹\u0002\u0010º\u0002R \u0010¼\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010A0»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¼\u0002\u0010½\u0002R\u001b\u0010¾\u0002\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¾\u0002\u0010¿\u0002R\u0019\u0010¸\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010À\u0002R\u001a\u0010Â\u0002\u001a\u00030Á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÂ\u0002\u0010Ã\u0002R\u0019\u0010Ä\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0002\u0010À\u0002R\u001a\u0010Å\u0002\u001a\u00030Á\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0002\u0010Ã\u0002R\u001c\u0010Ç\u0002\u001a\u0005\u0018\u00010Æ\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÇ\u0002\u0010È\u0002R;\u0010Ë\u0002\u001a$\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u00010É\u0002j\u0011\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001b\u0018\u0001`Ê\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0002\u0010Ì\u0002R\u0019\u0010Ð\u0001\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Í\u0002R\u0019\u0010Î\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÎ\u0002\u0010Í\u0002R\u0019\u0010Ï\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÏ\u0002\u0010Í\u0002R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0005\u0012\u00030Ð\u00020\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010·\u0002R\u0018\u0010Ñ\u0002\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÑ\u0002\u0010Ã\u0002R9\u0010Ò\u0002\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÒ\u0002\u0010Ó\u0002R>\u0010Õ\u0002\u001a)\u0012$\u0012\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&0$j\u0002`'0Ô\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÕ\u0002\u0010Ö\u0002R\u0019\u0010×\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0002\u0010Í\u0002R\u0018\u0010Ø\u0002\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0002\u0010Ã\u0002R\u0019\u0010Ù\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0002\u0010Í\u0002R\u0019\u0010Ú\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÚ\u0002\u0010À\u0002R\u0019\u0010Û\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0002\u0010À\u0002R\u001a\u0010Ý\u0002\u001a\u00030Ü\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0002\u0010Þ\u0002R\u0019\u0010ß\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0002\u0010À\u0002R\u0019\u0010à\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bà\u0002\u0010Í\u0002R\u001f\u0010á\u0002\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bá\u0002\u0010½\u0002R*\u0010ã\u0002\u001a\u0002062\u0007\u0010â\u0002\u001a\u0002068\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bã\u0002\u0010Í\u0002\u001a\u0006\bä\u0002\u0010Ï\u0001R*\u0010å\u0002\u001a\u0002062\u0007\u0010â\u0002\u001a\u0002068\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bå\u0002\u0010Í\u0002\u001a\u0006\bæ\u0002\u0010Ï\u0001R\u0017\u0010}\u001a\u00020e8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b}\u0010ç\u0002R)\u0010è\u0002\u001a\u00020\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bè\u0002\u0010µ\u0002\u001a\u0006\bé\u0002\u0010ê\u0002\"\u0006\bë\u0002\u0010ì\u0002R\u0019\u0010í\u0002\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bí\u0002\u0010î\u0002R\u0019\u0010ï\u0002\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bï\u0002\u0010Í\u0002R=\u0010ð\u0002\u001a&\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0%\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0&\u0018\u00010$j\u0004\u0018\u0001`'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bð\u0002\u0010Ó\u0002RP\u0010ñ\u0002\u001a*\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u0010\u0018\u00010\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bñ\u0002\u0010·\u0002\u001a\u0006\bò\u0002\u0010ó\u0002\"\u0005\bô\u0002\u0010vR\u001a\u0010õ\u0002\u001a\u00030¢\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bõ\u0002\u0010ö\u0002R=\u0010÷\u0002\u001a(\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100\u000b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b÷\u0002\u0010·\u0002R/\u0010F\u001a\u0002062\u0007\u0010â\u0002\u001a\u0002068\u0016@RX\u0097\u000e¢\u0006\u0016\n\u0005\bF\u0010Í\u0002\u0012\u0005\bù\u0002\u0010\u0018\u001a\u0006\bø\u0002\u0010Ï\u0001R1\u0010ú\u0002\u001a\u00020\u001b2\u0007\u0010â\u0002\u001a\u00020\u001b8\u0016@RX\u0097\u000e¢\u0006\u0017\n\u0006\bú\u0002\u0010À\u0002\u0012\u0005\bü\u0002\u0010\u0018\u001a\u0006\bû\u0002\u0010\u008f\u0002R\u0019\u0010ý\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bý\u0002\u0010À\u0002R\"\u0010þ\u0002\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001f0»\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bþ\u0002\u0010½\u0002R\u0019\u0010ÿ\u0002\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0002\u0010À\u0002R\u0019\u0010\u0080\u0003\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0003\u0010Í\u0002R\u0019\u0010\u0081\u0003\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0081\u0003\u0010Í\u0002R\u0018\u0010\u0082\u0003\u001a\u00030Á\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0003\u0010Ã\u0002R>\u0010\u0083\u0003\u001a)\u0012$\u0012\"\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\fj\u0002`\u00100»\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0003\u0010½\u0002R\u0019\u0010\u0084\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0003\u0010À\u0002R\u0019\u0010\u0085\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0003\u0010À\u0002R\u0019\u0010\u0086\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0003\u0010À\u0002R\u0019\u0010\u0087\u0003\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0087\u0003\u0010À\u0002R\u001e\u0010\u008a\u0003\u001a\u0002068VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u0089\u0003\u0010\u0018\u001a\u0006\b\u0088\u0003\u0010Ï\u0001R\u001e\u0010\u008d\u0003\u001a\u0002068VX\u0097\u0004¢\u0006\u000f\u0012\u0005\b\u008c\u0003\u0010\u0018\u001a\u0006\b\u008b\u0003\u0010Ï\u0001R\u001d\u0010\u009d\u0001\u001a\u0004\u0018\u00010\u001f*\u00020e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0003\u0010\u008f\u0003R\u0017\u0010\u0091\u0003\u001a\u0002068@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0090\u0003\u0010Ï\u0001R\u0017\u0010\u0093\u0003\u001a\u0002068@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0092\u0003\u0010Ï\u0001R\u0018\u0010\u0097\u0003\u001a\u00030\u0094\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0095\u0003\u0010\u0096\u0003R\u0017\u0010\u0099\u0003\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0098\u0003\u0010\u008f\u0002R\u0018\u0010\u009d\u0003\u001a\u00030\u009a\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009b\u0003\u0010\u009c\u0003R\u0017\u0010\u009f\u0003\u001a\u00020\u001b8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009e\u0003\u0010\u008f\u0002R\u001a\u0010¢\u0003\u001a\u0005\u0018\u00010\u0082\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b \u0003\u0010¡\u0003R\u0014\u0010¤\u0003\u001a\u0002068F¢\u0006\b\u001a\u0006\b£\u0003\u0010Ï\u0001R\u001a\u0010§\u0003\u001a\u0005\u0018\u00010®\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¥\u0003\u0010¦\u0003R\u0019\u0010©\u0003\u001a\u0004\u0018\u00010\u001f8VX\u0096\u0004¢\u0006\b\u001a\u0006\b¨\u0003\u0010è\u0001\u0082\u0002\u0012\n\u0005\b¡\u001e0\u0001\n\u0002\b\u0019\n\u0005\b\u009920\u0001¨\u0006¬\u0003"}, d2 = {"Landroidx/compose/runtime/ComposerImpl;", "Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/Applier;", "applier", "Landroidx/compose/runtime/CompositionContext;", "parentContext", "Landroidx/compose/runtime/SlotTable;", "slotTable", "", "Landroidx/compose/runtime/RememberObserver;", "abandonSet", "", "Lkotlin/Function3;", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "", "Landroidx/compose/runtime/Change;", "changes", "lateChanges", "Landroidx/compose/runtime/ControlledComposition;", "composition", "<init>", "(Landroidx/compose/runtime/Applier;Landroidx/compose/runtime/CompositionContext;Landroidx/compose/runtime/SlotTable;Ljava/util/Set;Ljava/util/List;Ljava/util/List;Landroidx/compose/runtime/ControlledComposition;)V", "startRoot", "()V", "endRoot", "abortRoot", "", C4240b4.i.W, "startGroup", "(I)V", "", "dataKey", "(ILjava/lang/Object;)V", "endGroup", "skipGroup", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "currentCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "group", "(I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "parentScope", "currentProviders", "updateProviderMapGroup", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "T", "scope", "resolveCompositionLocal", "(Landroidx/compose/runtime/CompositionLocal;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)Ljava/lang/Object;", "ensureWriter", "createFreshInsertTable", "", "isNode", "data", "startReaderGroup", "(ZLjava/lang/Object;)V", "objectKey", "Landroidx/compose/runtime/GroupKind;", "kind", "start-BaiHCIY", "(ILjava/lang/Object;ILjava/lang/Object;)V", "start", "Landroidx/compose/runtime/Pending;", "newPending", "enterGroup", "(ZLandroidx/compose/runtime/Pending;)V", "expectedNodeCount", "inserting", "exitGroup", "(IZ)V", "end", "(Z)V", "recomposeToGroupEnd", FirebaseAnalytics.Param.INDEX, "insertedGroupVirtualIndex", "(I)I", "newCount", "updateNodeCountOverrides", "(II)V", "groupLocation", "recomposeGroup", "recomposeIndex", "nodeIndexOf", "(IIII)I", "updatedNodeCount", "count", "updateNodeCount", "clearUpdatedNodeCounts", "oldGroup", "newGroup", "commonRoot", "recordUpsAndDowns", "(III)V", "nearestCommonRoot", "doRecordDownsFor", "recomposeKey", "compoundKeyOf", "(III)I", "Landroidx/compose/runtime/SlotReader;", "groupCompoundKeyPart", "(Landroidx/compose/runtime/SlotReader;I)I", "skipReaderToGroupEnd", "addRecomposeScope", "Landroidx/compose/runtime/MovableContent;", "content", "locals", MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD, "force", "invokeMovableContentLambda", "(Landroidx/compose/runtime/MovableContent;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Ljava/lang/Object;Z)V", "", "Lkotlin/Pair;", "Landroidx/compose/runtime/MovableContentStateReference;", "references", "insertMovableContentGuarded", "(Ljava/util/List;)V", "R", "newChanges", "Lkotlin/Function0;", "block", "withChanges", "(Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "reader", "withReader", "(Landroidx/compose/runtime/SlotReader;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", TypedValues.TransitionType.S_FROM, TypedValues.TransitionType.S_TO, "Landroidx/compose/runtime/RecomposeScopeImpl;", "Landroidx/compose/runtime/collection/IdentityArraySet;", "invalidations", "recomposeMovableContent", "(Landroidx/compose/runtime/ControlledComposition;Landroidx/compose/runtime/ControlledComposition;Ljava/lang/Integer;Ljava/util/List;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "Landroidx/compose/runtime/collection/IdentityArrayMap;", "invalidationsRequested", "Landroidx/compose/runtime/Composable;", "doCompose", "(Landroidx/compose/runtime/collection/IdentityArrayMap;Lkotlin/jvm/functions/Function2;)V", "nodeAt", "(Landroidx/compose/runtime/SlotReader;I)Ljava/lang/Object;", "validateNodeExpected", "validateNodeNotExpected", "change", "record", "(Lkotlin/jvm/functions/Function3;)V", "recordApplierOperation", "recordSlotEditingOperation", "forParent", "recordSlotTableOperation", "(ZLkotlin/jvm/functions/Function3;)V", "realizeUps", "", "nodes", "realizeDowns", "([Ljava/lang/Object;)V", "node", "recordDown", "(Ljava/lang/Object;)V", "recordUp", "realizeOperationLocation", "Landroidx/compose/runtime/Anchor;", "anchor", "recordInsert", "(Landroidx/compose/runtime/Anchor;)V", "recordFixup", "recordInsertUpFixup", "registerInsertUpFixup", "recordDelete", "groupBeingRemoved", "reportFreeMovableContent", TypedValues.Custom.S_REFERENCE, "slots", "releaseMovableGroupAtCurrent", "(Landroidx/compose/runtime/MovableContentStateReference;Landroidx/compose/runtime/SlotWriter;)V", "reportAllMovableContent", "location", "recordReaderMoving", "recordSlotEditing", "recordEndGroup", "recordEndRoot", "finalizeCompose", "cleanUpCompose", "nodeIndex", "recordRemoveNode", "recordMoveNode", "realizeMovement", "groupKey", "updateCompoundKeyWhenWeEnterGroup", "(ILjava/lang/Object;Ljava/lang/Object;)V", "keyHash", "updateCompoundKeyWhenWeEnterGroupKeyHash", "updateCompoundKeyWhenWeExitGroup", "updateCompoundKeyWhenWeExitGroupKeyHash", "startReplaceableGroup", "endReplaceableGroup", "startDefaults", "endDefaults", "startMovableGroup", "endMovableGroup", "changesApplied$runtime_release", "changesApplied", "collectParameterInformation", "dispose$runtime_release", "dispose", "forceRecomposeScopes$runtime_release", "()Z", "forceRecomposeScopes", "startNode", "startReusableNode", "factory", "createNode", "(Lkotlin/jvm/functions/Function0;)V", "useNode", "endNode", "startReusableGroup", "endReusableGroup", "disableReusing", "enableReusing", "marker", "endToMarker", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "value", "Lkotlin/Function2;", "apply", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)V", "left", "right", "joinKey", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "nextSlot", "()Ljava/lang/Object;", "changed", "(Ljava/lang/Object;)Z", "changedInstance", "", "(C)Z", "", "(B)Z", "", "(S)Z", "(Z)Z", "", "(F)Z", "", "(J)Z", "", "(D)Z", "(I)Z", "invalid", Reporting.EventType.CACHE, "(ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "updateValue", "updateCachedValue", "effect", "recordSideEffect", "Landroidx/compose/runtime/ProvidedValue;", "values", "startProviders", "([Landroidx/compose/runtime/ProvidedValue;)V", "endProviders", "consume", "(Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "buildContext", "()Landroidx/compose/runtime/CompositionContext;", C4424m2.f43617p, "tryImminentInvalidation$runtime_release", "(Landroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)Z", "tryImminentInvalidation", "parentKey$runtime_release", "()I", "parentKey", "skipCurrentGroup", "skipToGroupEnd", "deactivateToEndGroup", "startRestartGroup", "(I)Landroidx/compose/runtime/Composer;", "Landroidx/compose/runtime/ScopeUpdateScope;", "endRestartGroup", "()Landroidx/compose/runtime/ScopeUpdateScope;", "insertMovableContent", "(Landroidx/compose/runtime/MovableContent;Ljava/lang/Object;)V", "insertMovableContentReferences", "", "sourceInformation", "(Ljava/lang/String;)V", "sourceInformationMarkerStart", "(ILjava/lang/String;)V", "sourceInformationMarkerEnd", "disableSourceInformation", "composeContent$runtime_release", "composeContent", "prepareCompose$runtime_release", "prepareCompose", "recompose$runtime_release", "(Landroidx/compose/runtime/collection/IdentityArrayMap;)Z", "recompose", "verifyConsistent$runtime_release", "verifyConsistent", "rememberedValue", "updateRememberedValue", "Landroidx/compose/runtime/RecomposeScope;", "recordUsed", "(Landroidx/compose/runtime/RecomposeScope;)V", "Landroidx/compose/runtime/Applier;", "getApplier", "()Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/CompositionContext;", "Landroidx/compose/runtime/SlotTable;", "Ljava/util/Set;", "Ljava/util/List;", "Landroidx/compose/runtime/ControlledComposition;", "getComposition", "()Landroidx/compose/runtime/ControlledComposition;", "Landroidx/compose/runtime/Stack;", "pendingStack", "Landroidx/compose/runtime/Stack;", "pending", "Landroidx/compose/runtime/Pending;", "I", "Landroidx/compose/runtime/IntStack;", "nodeIndexStack", "Landroidx/compose/runtime/IntStack;", "groupNodeCount", "groupNodeCountStack", "", "nodeCountOverrides", "[I", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "nodeCountVirtualOverrides", "Ljava/util/HashMap;", "Z", "forciblyRecompose", "nodeExpected", "Landroidx/compose/runtime/Invalidation;", "entersStack", "parentProvider", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/collection/IntMap;", "providerUpdates", "Landroidx/compose/runtime/collection/IntMap;", "providersInvalid", "providersInvalidStack", "reusing", "reusingGroup", "childrenComposing", "Landroidx/compose/runtime/snapshots/Snapshot;", "snapshot", "Landroidx/compose/runtime/snapshots/Snapshot;", "compositionToken", "sourceInformationEnabled", "invalidateStack", "<set-?>", "isComposing", "isComposing$runtime_release", "isDisposed", "isDisposed$runtime_release", "Landroidx/compose/runtime/SlotReader;", "insertTable", "getInsertTable$runtime_release", "()Landroidx/compose/runtime/SlotTable;", "setInsertTable$runtime_release", "(Landroidx/compose/runtime/SlotTable;)V", "writer", "Landroidx/compose/runtime/SlotWriter;", "writerHasAProvider", "providerCache", "deferredChanges", "getDeferredChanges$runtime_release", "()Ljava/util/List;", "setDeferredChanges$runtime_release", "insertAnchor", "Landroidx/compose/runtime/Anchor;", "insertFixups", "getInserting", "getInserting$annotations", "compoundKeyHash", "getCompoundKeyHash", "getCompoundKeyHash$annotations", "pendingUps", "downNodes", "writersReaderDelta", "startedGroup", "implicitRootStart", "startedGroups", "insertUpFixups", "previousRemove", "previousMoveFrom", "previousMoveTo", "previousCount", "getDefaultsInvalid", "getDefaultsInvalid$annotations", "defaultsInvalid", "getSkipping", "getSkipping$annotations", "skipping", "getNode", "(Landroidx/compose/runtime/SlotReader;)Ljava/lang/Object;", "getAreChildrenComposing$runtime_release", "areChildrenComposing", "getHasPendingChanges$runtime_release", "hasPendingChanges", "Lkotlin/coroutines/CoroutineContext;", "getApplyCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "applyCoroutineContext", "getCurrentMarker", "currentMarker", "Landroidx/compose/runtime/tooling/CompositionData;", "getCompositionData", "()Landroidx/compose/runtime/tooling/CompositionData;", "compositionData", "getChangeCount$runtime_release", "changeCount", "getCurrentRecomposeScope$runtime_release", "()Landroidx/compose/runtime/RecomposeScopeImpl;", "currentRecomposeScope", "getHasInvalidations", "hasInvalidations", "getRecomposeScope", "()Landroidx/compose/runtime/RecomposeScope;", "recomposeScope", "getRecomposeScopeIdentity", "recomposeScopeIdentity", "CompositionContextHolder", "CompositionContextImpl", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ComposerImpl implements Composer {

    @NotNull
    private final Set<RememberObserver> abandonSet;

    @NotNull
    private final Applier<?> applier;

    @NotNull
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes;
    private int childrenComposing;

    @NotNull
    private final ControlledComposition composition;
    private int compositionToken;
    private int compoundKeyHash;

    @Nullable
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> deferredChanges;

    @NotNull
    private Stack<Object> downNodes;

    @NotNull
    private final IntStack entersStack;
    private boolean forceRecomposeScopes;
    private boolean forciblyRecompose;
    private int groupNodeCount;

    @NotNull
    private IntStack groupNodeCountStack;
    private boolean implicitRootStart;

    @NotNull
    private Anchor insertAnchor;

    @NotNull
    private final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertFixups;

    @NotNull
    private SlotTable insertTable;

    @NotNull
    private final Stack<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> insertUpFixups;
    private boolean inserting;

    @NotNull
    private final Stack<RecomposeScopeImpl> invalidateStack;

    @NotNull
    private final List<Invalidation> invalidations;
    private boolean isComposing;
    private boolean isDisposed;

    @NotNull
    private List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges;

    @Nullable
    private int[] nodeCountOverrides;

    @Nullable
    private HashMap<Integer, Integer> nodeCountVirtualOverrides;
    private boolean nodeExpected;
    private int nodeIndex;

    @NotNull
    private IntStack nodeIndexStack;

    @NotNull
    private final CompositionContext parentContext;

    @NotNull
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentProvider;

    @Nullable
    private Pending pending;

    @NotNull
    private final Stack<Pending> pendingStack;
    private int pendingUps;
    private int previousCount;
    private int previousMoveFrom;
    private int previousMoveTo;
    private int previousRemove;

    @Nullable
    private PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> providerCache;

    @NotNull
    private final IntMap<PersistentMap<CompositionLocal<Object>, State<Object>>> providerUpdates;
    private boolean providersInvalid;

    @NotNull
    private final IntStack providersInvalidStack;

    @NotNull
    private SlotReader reader;
    private boolean reusing;
    private int reusingGroup;

    @NotNull
    private final SlotTable slotTable;

    @NotNull
    private Snapshot snapshot;
    private boolean sourceInformationEnabled;
    private boolean startedGroup;

    @NotNull
    private final IntStack startedGroups;

    @NotNull
    private SlotWriter writer;
    private boolean writerHasAProvider;
    private int writersReaderDelta;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\tH\u0016R\u0015\u0010\u0002\u001a\u00060\u0003R\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextHolder;", "Landroidx/compose/runtime/RememberObserver;", "ref", "Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/ComposerImpl;", "(Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;)V", "getRef", "()Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "onAbandoned", "", "onForgotten", "onRemembered", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class CompositionContextHolder implements RememberObserver {

        @NotNull
        private final CompositionContextImpl ref;

        public CompositionContextHolder(@NotNull CompositionContextImpl ref) {
            Intrinsics.checkNotNullParameter(ref, "ref");
            this.ref = ref;
        }

        @NotNull
        public final CompositionContextImpl getRef() {
            return this.ref;
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onAbandoned() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onForgotten() {
            this.ref.dispose();
        }

        @Override // androidx.compose.runtime.RememberObserver
        public void onRemembered() {
        }
    }

    @Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J*\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0011\u0010.\u001a\r\u0012\u0004\u0012\u00020+0/¢\u0006\u0002\b0H\u0010¢\u0006\u0004\b1\u00102J\u0015\u00103\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b6J\u0006\u00107\u001a\u00020+J\r\u00108\u001a\u00020+H\u0010¢\u0006\u0002\b9J-\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013H\u0010¢\u0006\u0002\b:J\u0015\u0010;\u001a\u00020+2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\b<J\u0015\u0010=\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\b>J\u0015\u0010?\u001a\u00020+2\u0006\u0010@\u001a\u00020AH\u0010¢\u0006\u0002\bBJ\u001d\u0010C\u001a\u00020+2\u0006\u00104\u001a\u0002052\u0006\u0010D\u001a\u00020EH\u0010¢\u0006\u0002\bFJ\u0017\u0010G\u001a\u0004\u0018\u00010E2\u0006\u00104\u001a\u000205H\u0010¢\u0006\u0002\bHJ\u001b\u0010I\u001a\u00020+2\f\u0010J\u001a\b\u0012\u0004\u0012\u00020\"0\nH\u0010¢\u0006\u0002\bKJ\u0015\u0010L\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bOJ\u0015\u0010P\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bQJ\r\u0010R\u001a\u00020+H\u0010¢\u0006\u0002\bSJ\u0015\u0010T\u001a\u00020+2\u0006\u0010M\u001a\u00020NH\u0010¢\u0006\u0002\bUJ\u0015\u0010V\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0010¢\u0006\u0002\bWJ.\u0010X\u001a\u00020+2&\u0010@\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u0013R\u0014\u0010\u0004\u001a\u00020\u0005X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rRk\u0010\u0014\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00132&\u0010\u000e\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00110\u00120\u000fj\u0002`\u00138B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0002\u001a\u00020\u0003X\u0090\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R(\u0010!\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\n\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\r\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u001e8PX\u0090\u0004¢\u0006\f\u0012\u0004\b'\u0010(\u001a\u0004\b)\u0010 ¨\u0006Y"}, d2 = {"Landroidx/compose/runtime/ComposerImpl$CompositionContextImpl;", "Landroidx/compose/runtime/CompositionContext;", "compoundHashKey", "", "collectingParameterInformation", "", "(Landroidx/compose/runtime/ComposerImpl;IZ)V", "getCollectingParameterInformation$runtime_release", "()Z", "composers", "", "Landroidx/compose/runtime/ComposerImpl;", "getComposers", "()Ljava/util/Set;", "<set-?>", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "compositionLocalScope", "getCompositionLocalScope", "()Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "setCompositionLocalScope", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;)V", "compositionLocalScope$delegate", "Landroidx/compose/runtime/MutableState;", "getCompoundHashKey$runtime_release", "()I", "effectCoroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getEffectCoroutineContext$runtime_release", "()Lkotlin/coroutines/CoroutineContext;", "inspectionTables", "Landroidx/compose/runtime/tooling/CompositionData;", "getInspectionTables", "setInspectionTables", "(Ljava/util/Set;)V", "recomposeCoroutineContext", "getRecomposeCoroutineContext$runtime_release$annotations", "()V", "getRecomposeCoroutineContext$runtime_release", "composeInitial", "", "composition", "Landroidx/compose/runtime/ControlledComposition;", "content", "Lkotlin/Function0;", "Landroidx/compose/runtime/Composable;", "composeInitial$runtime_release", "(Landroidx/compose/runtime/ControlledComposition;Lkotlin/jvm/functions/Function2;)V", "deletedMovableContent", TypedValues.Custom.S_REFERENCE, "Landroidx/compose/runtime/MovableContentStateReference;", "deletedMovableContent$runtime_release", "dispose", "doneComposing", "doneComposing$runtime_release", "getCompositionLocalScope$runtime_release", "insertMovableContent", "insertMovableContent$runtime_release", "invalidate", "invalidate$runtime_release", "invalidateScope", "scope", "Landroidx/compose/runtime/RecomposeScopeImpl;", "invalidateScope$runtime_release", "movableContentStateReleased", "data", "Landroidx/compose/runtime/MovableContentState;", "movableContentStateReleased$runtime_release", "movableContentStateResolve", "movableContentStateResolve$runtime_release", "recordInspectionTable", D5.Q, "recordInspectionTable$runtime_release", "registerComposer", "composer", "Landroidx/compose/runtime/Composer;", "registerComposer$runtime_release", "registerComposition", "registerComposition$runtime_release", "startComposing", "startComposing$runtime_release", "unregisterComposer", "unregisterComposer$runtime_release", "unregisterComposition", "unregisterComposition$runtime_release", "updateCompositionLocalScope", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private final class CompositionContextImpl extends CompositionContext {
        private final boolean collectingParameterInformation;

        @NotNull
        private final Set<ComposerImpl> composers = new LinkedHashSet();

        /* JADX INFO: renamed from: compositionLocalScope$delegate, reason: from kotlin metadata */
        @NotNull
        private final MutableState compositionLocalScope = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(ExtensionsKt.persistentHashMapOf(), null, 2, null);
        private final int compoundHashKey;

        @Nullable
        private Set<Set<CompositionData>> inspectionTables;

        public CompositionContextImpl(int i10, boolean z10) {
            this.compoundHashKey = i10;
            this.collectingParameterInformation = z10;
        }

        private final PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope() {
            return (PersistentMap) this.compositionLocalScope.getValue();
        }

        public static /* synthetic */ void getRecomposeCoroutineContext$runtime_release$annotations() {
        }

        private final void setCompositionLocalScope(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap) {
            this.compositionLocalScope.setValue(persistentMap);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @ComposableInferredTarget(scheme = "[0[0]]")
        public void composeInitial$runtime_release(@NotNull ControlledComposition composition, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            Intrinsics.checkNotNullParameter(content, "content");
            ComposerImpl.this.parentContext.composeInitial$runtime_release(composition, content);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void deletedMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.deletedMovableContent$runtime_release(reference);
        }

        public final void dispose() {
            if (this.composers.isEmpty()) {
                return;
            }
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                for (ComposerImpl composerImpl : this.composers) {
                    Iterator<Set<CompositionData>> it = set.iterator();
                    while (it.hasNext()) {
                        it.next().remove(composerImpl.slotTable);
                    }
                }
            }
            this.composers.clear();
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void doneComposing$runtime_release() {
            ComposerImpl composerImpl = ComposerImpl.this;
            composerImpl.childrenComposing--;
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCollectingParameterInformation$runtime_release, reason: from getter */
        public boolean getCollectingParameterInformation() {
            return this.collectingParameterInformation;
        }

        @NotNull
        public final Set<ComposerImpl> getComposers() {
            return this.composers;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public PersistentMap<CompositionLocal<Object>, State<Object>> getCompositionLocalScope$runtime_release() {
            return getCompositionLocalScope();
        }

        @Override // androidx.compose.runtime.CompositionContext
        /* JADX INFO: renamed from: getCompoundHashKey$runtime_release, reason: from getter */
        public int getCompoundHashKey() {
            return this.compoundHashKey;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        /* JADX INFO: renamed from: getEffectCoroutineContext$runtime_release */
        public CoroutineContext getEffectCoroutineContext() {
            return ComposerImpl.this.parentContext.getEffectCoroutineContext();
        }

        @Nullable
        public final Set<Set<CompositionData>> getInspectionTables() {
            return this.inspectionTables;
        }

        @Override // androidx.compose.runtime.CompositionContext
        @NotNull
        public CoroutineContext getRecomposeCoroutineContext$runtime_release() {
            return CompositionKt.getRecomposeCoroutineContext(ComposerImpl.this.getComposition());
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void insertMovableContent$runtime_release(@NotNull MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            ComposerImpl.this.parentContext.insertMovableContent$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidate$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.invalidate$runtime_release(ComposerImpl.this.getComposition());
            ComposerImpl.this.parentContext.invalidate$runtime_release(composition);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void invalidateScope$runtime_release(@NotNull RecomposeScopeImpl scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            ComposerImpl.this.parentContext.invalidateScope$runtime_release(scope);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void movableContentStateReleased$runtime_release(@NotNull MovableContentStateReference reference, @NotNull MovableContentState data) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            Intrinsics.checkNotNullParameter(data, "data");
            ComposerImpl.this.parentContext.movableContentStateReleased$runtime_release(reference, data);
        }

        @Override // androidx.compose.runtime.CompositionContext
        @Nullable
        public MovableContentState movableContentStateResolve$runtime_release(@NotNull MovableContentStateReference reference) {
            Intrinsics.checkNotNullParameter(reference, "reference");
            return ComposerImpl.this.parentContext.movableContentStateResolve$runtime_release(reference);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void recordInspectionTable$runtime_release(@NotNull Set<CompositionData> table) {
            Intrinsics.checkNotNullParameter(table, "table");
            Set hashSet = this.inspectionTables;
            if (hashSet == null) {
                hashSet = new HashSet();
                this.inspectionTables = hashSet;
            }
            hashSet.add(table);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposer$runtime_release(@NotNull Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            super.registerComposer$runtime_release((ComposerImpl) composer);
            this.composers.add(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void registerComposition$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.registerComposition$runtime_release(composition);
        }

        public final void setInspectionTables(@Nullable Set<Set<CompositionData>> set) {
            this.inspectionTables = set;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void startComposing$runtime_release() {
            ComposerImpl.this.childrenComposing++;
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposer$runtime_release(@NotNull Composer composer) {
            Intrinsics.checkNotNullParameter(composer, "composer");
            Set<Set<CompositionData>> set = this.inspectionTables;
            if (set != null) {
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    ((Set) it.next()).remove(((ComposerImpl) composer).slotTable);
                }
            }
            b1.a(this.composers).remove(composer);
        }

        @Override // androidx.compose.runtime.CompositionContext
        public void unregisterComposition$runtime_release(@NotNull ControlledComposition composition) {
            Intrinsics.checkNotNullParameter(composition, "composition");
            ComposerImpl.this.parentContext.unregisterComposition$runtime_release(composition);
        }

        public final void updateCompositionLocalScope(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            setCompositionLocalScope(scope);
        }
    }

    public ComposerImpl(@NotNull Applier<?> applier, @NotNull CompositionContext parentContext, @NotNull SlotTable slotTable, @NotNull Set<RememberObserver> abandonSet, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> changes, @NotNull List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> lateChanges, @NotNull ControlledComposition composition) {
        Intrinsics.checkNotNullParameter(applier, "applier");
        Intrinsics.checkNotNullParameter(parentContext, "parentContext");
        Intrinsics.checkNotNullParameter(slotTable, "slotTable");
        Intrinsics.checkNotNullParameter(abandonSet, "abandonSet");
        Intrinsics.checkNotNullParameter(changes, "changes");
        Intrinsics.checkNotNullParameter(lateChanges, "lateChanges");
        Intrinsics.checkNotNullParameter(composition, "composition");
        this.applier = applier;
        this.parentContext = parentContext;
        this.slotTable = slotTable;
        this.abandonSet = abandonSet;
        this.changes = changes;
        this.lateChanges = lateChanges;
        this.composition = composition;
        this.pendingStack = new Stack<>();
        this.nodeIndexStack = new IntStack();
        this.groupNodeCountStack = new IntStack();
        this.invalidations = new ArrayList();
        this.entersStack = new IntStack();
        this.parentProvider = ExtensionsKt.persistentHashMapOf();
        this.providerUpdates = new IntMap<>(0, 1, null);
        this.providersInvalidStack = new IntStack();
        this.reusingGroup = -1;
        this.snapshot = SnapshotKt.currentSnapshot();
        this.sourceInformationEnabled = true;
        this.invalidateStack = new Stack<>();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        slotReaderOpenReader.close();
        this.reader = slotReaderOpenReader;
        SlotTable slotTable2 = new SlotTable();
        this.insertTable = slotTable2;
        SlotWriter slotWriterOpenWriter = slotTable2.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
        SlotReader slotReaderOpenReader2 = this.insertTable.openReader();
        try {
            Anchor anchor = slotReaderOpenReader2.anchor(0);
            slotReaderOpenReader2.close();
            this.insertAnchor = anchor;
            this.insertFixups = new ArrayList();
            this.downNodes = new Stack<>();
            this.implicitRootStart = true;
            this.startedGroups = new IntStack();
            this.insertUpFixups = new Stack<>();
            this.previousRemove = -1;
            this.previousMoveFrom = -1;
            this.previousMoveTo = -1;
        } catch (Throwable th2) {
            slotReaderOpenReader2.close();
            throw th2;
        }
    }

    private final void abortRoot() {
        cleanUpCompose();
        this.pendingStack.clear();
        this.nodeIndexStack.clear();
        this.groupNodeCountStack.clear();
        this.entersStack.clear();
        this.providersInvalidStack.clear();
        this.providerUpdates.clear();
        if (!this.reader.getClosed()) {
            this.reader.close();
        }
        if (!this.writer.getClosed()) {
            this.writer.close();
        }
        createFreshInsertTable();
        this.compoundKeyHash = 0;
        this.childrenComposing = 0;
        this.nodeExpected = false;
        this.inserting = false;
        this.reusing = false;
        this.isComposing = false;
        this.forciblyRecompose = false;
    }

    private final void addRecomposeScope() {
        RecomposeScopeImpl recomposeScopeImpl;
        if (getInserting()) {
            ControlledComposition composition = getComposition();
            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            RecomposeScopeImpl recomposeScopeImpl2 = new RecomposeScopeImpl((CompositionImpl) composition);
            this.invalidateStack.push(recomposeScopeImpl2);
            updateValue(recomposeScopeImpl2);
            recomposeScopeImpl2.start(this.compositionToken);
            return;
        }
        Invalidation invalidationRemoveLocation = ComposerKt.removeLocation(this.invalidations, this.reader.getParent());
        Object next = this.reader.next();
        if (Intrinsics.areEqual(next, Composer.INSTANCE.getEmpty())) {
            ControlledComposition composition2 = getComposition();
            Intrinsics.checkNotNull(composition2, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
            recomposeScopeImpl = new RecomposeScopeImpl((CompositionImpl) composition2);
            updateValue(recomposeScopeImpl);
        } else {
            Intrinsics.checkNotNull(next, "null cannot be cast to non-null type androidx.compose.runtime.RecomposeScopeImpl");
            recomposeScopeImpl = (RecomposeScopeImpl) next;
        }
        recomposeScopeImpl.setRequiresRecompose(invalidationRemoveLocation != null);
        this.invalidateStack.push(recomposeScopeImpl);
        recomposeScopeImpl.start(this.compositionToken);
    }

    private final void cleanUpCompose() {
        this.pending = null;
        this.nodeIndex = 0;
        this.groupNodeCount = 0;
        this.writersReaderDelta = 0;
        this.compoundKeyHash = 0;
        this.nodeExpected = false;
        this.startedGroup = false;
        this.startedGroups.clear();
        this.invalidateStack.clear();
        clearUpdatedNodeCounts();
    }

    private final void clearUpdatedNodeCounts() {
        this.nodeCountOverrides = null;
        this.nodeCountVirtualOverrides = null;
    }

    private final int compoundKeyOf(int group, int recomposeGroup, int recomposeKey) {
        if (group == recomposeGroup) {
            return recomposeKey;
        }
        int iGroupCompoundKeyPart = groupCompoundKeyPart(this.reader, group);
        return iGroupCompoundKeyPart == 126665345 ? iGroupCompoundKeyPart : Integer.rotateLeft(compoundKeyOf(this.reader.parent(group), recomposeGroup, recomposeKey), 3) ^ iGroupCompoundKeyPart;
    }

    private final void createFreshInsertTable() {
        ComposerKt.runtimeCheck(this.writer.getClosed());
        SlotTable slotTable = new SlotTable();
        this.insertTable = slotTable;
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        slotWriterOpenWriter.close();
        this.writer = slotWriterOpenWriter;
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope() {
        PersistentMap persistentMap = this.providerCache;
        return persistentMap != null ? persistentMap : currentCompositionLocalScope(this.reader.getParent());
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r11 = r10.invalidations;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005f, code lost:
    
        if (r11.size() <= 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0061, code lost:
    
        kotlin.collections.CollectionsKt.sortWith(r11, new androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        r10.nodeIndex = 0;
        r10.isComposing = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        startRoot();
        r11 = nextSlot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0074, code lost:
    
        if (r11 == r12) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r12 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0078, code lost:
    
        r0 = r12;
        updateValue(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x007f, code lost:
    
        r11 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
    
        androidx.compose.runtime.SnapshotStateKt.observeDerivedStateRecalculations(new androidx.compose.runtime.ComposerImpl$doCompose$2$3(r10), new androidx.compose.runtime.ComposerImpl$doCompose$2$4(r10), new androidx.compose.runtime.ComposerImpl$doCompose$2$5(r12, r10, r11));
        endRoot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0096, code lost:
    
        r10.isComposing = false;
        r10.invalidations.clear();
        r11 = kotlin.Unit.f93236a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a0, code lost:
    
        r10.isComposing = false;
        r10.invalidations.clear();
        abortRoot();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00aa, code lost:
    
        throw r11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void doCompose(androidx.compose.runtime.collection.IdentityArrayMap<androidx.compose.runtime.RecomposeScopeImpl, androidx.compose.runtime.collection.IdentityArraySet<java.lang.Object>> r11, final kotlin.jvm.functions.Function2<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, kotlin.Unit> r12) {
        /*
            r10 = this;
            r0 = 1
            boolean r1 = r10.isComposing
            if (r1 != 0) goto Lb1
            java.lang.String r1 = "Compose:recompose"
            androidx.compose.runtime.Trace r2 = androidx.compose.runtime.Trace.INSTANCE
            java.lang.Object r1 = r2.beginSection(r1)
            androidx.compose.runtime.snapshots.Snapshot r2 = androidx.compose.runtime.snapshots.SnapshotKt.currentSnapshot()     // Catch: java.lang.Throwable -> L51
            r10.snapshot = r2     // Catch: java.lang.Throwable -> L51
            int r2 = r2.getId()     // Catch: java.lang.Throwable -> L51
            r10.compositionToken = r2     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.collection.IntMap<androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<java.lang.Object>, androidx.compose.runtime.State<java.lang.Object>>> r2 = r10.providerUpdates     // Catch: java.lang.Throwable -> L51
            r2.clear()     // Catch: java.lang.Throwable -> L51
            int r2 = r11.getSize()     // Catch: java.lang.Throwable -> L51
            r3 = 0
            r4 = r3
        L24:
            if (r4 >= r2) goto L59
            java.lang.Object[] r5 = r11.getKeys()     // Catch: java.lang.Throwable -> L51
            r5 = r5[r4]     // Catch: java.lang.Throwable -> L51
            java.lang.String r6 = "null cannot be cast to non-null type Key of androidx.compose.runtime.collection.IdentityArrayMap"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)     // Catch: java.lang.Throwable -> L51
            java.lang.Object[] r6 = r11.getValues()     // Catch: java.lang.Throwable -> L51
            r6 = r6[r4]     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.collection.IdentityArraySet r6 = (androidx.compose.runtime.collection.IdentityArraySet) r6     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.RecomposeScopeImpl r5 = (androidx.compose.runtime.RecomposeScopeImpl) r5     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.Anchor r7 = r5.getAnchor()     // Catch: java.lang.Throwable -> L51
            if (r7 == 0) goto L53
            int r7 = r7.getLocation()     // Catch: java.lang.Throwable -> L51
            java.util.List<androidx.compose.runtime.Invalidation> r8 = r10.invalidations     // Catch: java.lang.Throwable -> L51
            androidx.compose.runtime.Invalidation r9 = new androidx.compose.runtime.Invalidation     // Catch: java.lang.Throwable -> L51
            r9.<init>(r5, r7, r6)     // Catch: java.lang.Throwable -> L51
            r8.add(r9)     // Catch: java.lang.Throwable -> L51
            int r4 = r4 + r0
            goto L24
        L51:
            r11 = move-exception
            goto Lab
        L53:
            androidx.compose.runtime.Trace r11 = androidx.compose.runtime.Trace.INSTANCE
            r11.endSection(r1)
            return
        L59:
            java.util.List<androidx.compose.runtime.Invalidation> r11 = r10.invalidations     // Catch: java.lang.Throwable -> L51
            int r2 = r11.size()     // Catch: java.lang.Throwable -> L51
            if (r2 <= r0) goto L69
            androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1 r2 = new androidx.compose.runtime.ComposerImpl$doCompose$lambda$37$$inlined$sortBy$1     // Catch: java.lang.Throwable -> L51
            r2.<init>()     // Catch: java.lang.Throwable -> L51
            kotlin.collections.CollectionsKt.sortWith(r11, r2)     // Catch: java.lang.Throwable -> L51
        L69:
            r10.nodeIndex = r3     // Catch: java.lang.Throwable -> L51
            r10.isComposing = r0     // Catch: java.lang.Throwable -> L51
            r10.startRoot()     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r11 = r10.nextSlot()     // Catch: java.lang.Throwable -> L7f
            if (r11 == r12) goto L81
            if (r12 == 0) goto L81
            r0 = r12
            java.lang.Object r0 = (java.lang.Object) r0     // Catch: java.lang.Throwable -> L7f
            r10.updateValue(r12)     // Catch: java.lang.Throwable -> L7f
            goto L81
        L7f:
            r11 = move-exception
            goto La0
        L81:
            androidx.compose.runtime.ComposerImpl$doCompose$2$3 r0 = new androidx.compose.runtime.ComposerImpl$doCompose$2$3     // Catch: java.lang.Throwable -> L7f
            r0.<init>()     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.ComposerImpl$doCompose$2$4 r2 = new androidx.compose.runtime.ComposerImpl$doCompose$2$4     // Catch: java.lang.Throwable -> L7f
            r2.<init>()     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.ComposerImpl$doCompose$2$5 r4 = new androidx.compose.runtime.ComposerImpl$doCompose$2$5     // Catch: java.lang.Throwable -> L7f
            r4.<init>()     // Catch: java.lang.Throwable -> L7f
            androidx.compose.runtime.SnapshotStateKt.observeDerivedStateRecalculations(r0, r2, r4)     // Catch: java.lang.Throwable -> L7f
            r10.endRoot()     // Catch: java.lang.Throwable -> L7f
            r10.isComposing = r3     // Catch: java.lang.Throwable -> L51
            java.util.List<androidx.compose.runtime.Invalidation> r11 = r10.invalidations     // Catch: java.lang.Throwable -> L51
            r11.clear()     // Catch: java.lang.Throwable -> L51
            kotlin.Unit r11 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L51
            goto L53
        La0:
            r10.isComposing = r3     // Catch: java.lang.Throwable -> L51
            java.util.List<androidx.compose.runtime.Invalidation> r12 = r10.invalidations     // Catch: java.lang.Throwable -> L51
            r12.clear()     // Catch: java.lang.Throwable -> L51
            r10.abortRoot()     // Catch: java.lang.Throwable -> L51
            throw r11     // Catch: java.lang.Throwable -> L51
        Lab:
            androidx.compose.runtime.Trace r12 = androidx.compose.runtime.Trace.INSTANCE
            r12.endSection(r1)
            throw r11
        Lb1:
            java.lang.String r11 = "Reentrant composition is not supported"
            androidx.compose.runtime.ComposerKt.composeRuntimeError(r11)
            lf.g r11 = new lf.g
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl.doCompose(androidx.compose.runtime.collection.IdentityArrayMap, kotlin.jvm.functions.Function2):void");
    }

    private final void doRecordDownsFor(int group, int nearestCommonRoot) {
        if (group <= 0 || group == nearestCommonRoot) {
            return;
        }
        doRecordDownsFor(this.reader.parent(group), nearestCommonRoot);
        if (this.reader.isNode(group)) {
            recordDown(nodeAt(this.reader, group));
        }
    }

    private final void end(boolean isNode) {
        List<KeyInfo> list;
        if (getInserting()) {
            int parent = this.writer.getParent();
            updateCompoundKeyWhenWeExitGroup(this.writer.groupKey(parent), this.writer.groupObjectKey(parent), this.writer.groupAux(parent));
        } else {
            int parent2 = this.reader.getParent();
            updateCompoundKeyWhenWeExitGroup(this.reader.groupKey(parent2), this.reader.groupObjectKey(parent2), this.reader.groupAux(parent2));
        }
        int i10 = this.groupNodeCount;
        Pending pending = this.pending;
        int i11 = 0;
        if (pending != null && pending.getKeyInfos().size() > 0) {
            List<KeyInfo> keyInfos = pending.getKeyInfos();
            List<KeyInfo> used = pending.getUsed();
            Set setFastToSet = ListUtilsKt.fastToSet(used);
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size = used.size();
            int size2 = keyInfos.size();
            int i12 = 0;
            int i13 = 0;
            int iUpdatedNodeCountOf = 0;
            while (i12 < size2) {
                KeyInfo keyInfo = keyInfos.get(i12);
                if (setFastToSet.contains(keyInfo)) {
                    if (!linkedHashSet.contains(keyInfo)) {
                        if (i13 < size) {
                            KeyInfo keyInfo2 = used.get(i13);
                            if (keyInfo2 != keyInfo) {
                                int iNodePositionOf = pending.nodePositionOf(keyInfo2);
                                linkedHashSet.add(keyInfo2);
                                if (iNodePositionOf != iUpdatedNodeCountOf) {
                                    int iUpdatedNodeCountOf2 = pending.updatedNodeCountOf(keyInfo2);
                                    list = keyInfos;
                                    recordMoveNode(pending.getStartIndex() + iNodePositionOf, iUpdatedNodeCountOf + pending.getStartIndex(), iUpdatedNodeCountOf2);
                                    pending.registerMoveNode(iNodePositionOf, iUpdatedNodeCountOf, iUpdatedNodeCountOf2);
                                } else {
                                    list = keyInfos;
                                }
                            } else {
                                list = keyInfos;
                                i12++;
                            }
                            i13++;
                            iUpdatedNodeCountOf += pending.updatedNodeCountOf(keyInfo2);
                            keyInfos = list;
                        }
                    }
                    i11 = 0;
                } else {
                    recordRemoveNode(pending.nodePositionOf(keyInfo) + pending.getStartIndex(), keyInfo.getNodes());
                    pending.updateNodeCount(keyInfo.getLocation(), i11);
                    recordReaderMoving(keyInfo.getLocation());
                    this.reader.reposition(keyInfo.getLocation());
                    recordDelete();
                    this.reader.skipGroup();
                    ComposerKt.removeRange(this.invalidations, keyInfo.getLocation(), keyInfo.getLocation() + this.reader.groupSize(keyInfo.getLocation()));
                }
                i12++;
                i11 = 0;
            }
            realizeMovement();
            if (keyInfos.size() > 0) {
                recordReaderMoving(this.reader.getGroupEnd());
                this.reader.skipToGroupEnd();
            }
        }
        int i14 = this.nodeIndex;
        while (!this.reader.isGroupEnd()) {
            int current = this.reader.getCurrent();
            recordDelete();
            recordRemoveNode(i14, this.reader.skipGroup());
            ComposerKt.removeRange(this.invalidations, current, this.reader.getCurrent());
        }
        boolean inserting = getInserting();
        if (inserting) {
            if (isNode) {
                registerInsertUpFixup();
                i10 = 1;
            }
            this.reader.endEmpty();
            int parent3 = this.writer.getParent();
            this.writer.endGroup();
            if (!this.reader.getInEmpty()) {
                int iInsertedGroupVirtualIndex = insertedGroupVirtualIndex(parent3);
                this.writer.endInsert();
                this.writer.close();
                recordInsert(this.insertAnchor);
                this.inserting = false;
                if (!this.slotTable.isEmpty()) {
                    updateNodeCount(iInsertedGroupVirtualIndex, 0);
                    updateNodeCountOverrides(iInsertedGroupVirtualIndex, i10);
                }
            }
        } else {
            if (isNode) {
                recordUp();
            }
            recordEndGroup();
            int parent4 = this.reader.getParent();
            if (i10 != updatedNodeCount(parent4)) {
                updateNodeCountOverrides(parent4, i10);
            }
            if (isNode) {
                i10 = 1;
            }
            this.reader.endGroup();
            realizeMovement();
        }
        exitGroup(i10, inserting);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void endGroup() {
        end(false);
    }

    private final void endRoot() {
        endGroup();
        this.parentContext.doneComposing$runtime_release();
        endGroup();
        recordEndRoot();
        finalizeCompose();
        this.reader.close();
        this.forciblyRecompose = false;
    }

    private final void ensureWriter() {
        if (this.writer.getClosed()) {
            SlotWriter slotWriterOpenWriter = this.insertTable.openWriter();
            this.writer = slotWriterOpenWriter;
            slotWriterOpenWriter.skipToGroupEnd();
            this.writerHasAProvider = false;
            this.providerCache = null;
        }
    }

    private final void enterGroup(boolean isNode, Pending newPending) {
        this.pendingStack.push(this.pending);
        this.pending = newPending;
        this.nodeIndexStack.push(this.nodeIndex);
        if (isNode) {
            this.nodeIndex = 0;
        }
        this.groupNodeCountStack.push(this.groupNodeCount);
        this.groupNodeCount = 0;
    }

    private final void exitGroup(int expectedNodeCount, boolean inserting) {
        Pending pendingPop = this.pendingStack.pop();
        if (pendingPop != null && !inserting) {
            pendingPop.setGroupIndex(pendingPop.getGroupIndex() + 1);
        }
        this.pending = pendingPop;
        this.nodeIndex = this.nodeIndexStack.pop() + expectedNodeCount;
        this.groupNodeCount = this.groupNodeCountStack.pop() + expectedNodeCount;
    }

    private final void finalizeCompose() {
        realizeUps();
        if (!this.pendingStack.isEmpty()) {
            ComposerKt.composeRuntimeError("Start/end imbalance");
            throw new g();
        }
        if (this.startedGroups.isEmpty()) {
            cleanUpCompose();
        } else {
            ComposerKt.composeRuntimeError("Missed recording an endGroup()");
            throw new g();
        }
    }

    @InternalComposeApi
    public static /* synthetic */ void getCompoundKeyHash$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getDefaultsInvalid$annotations() {
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getInserting$annotations() {
    }

    private final Object getNode(SlotReader slotReader) {
        return slotReader.node(slotReader.getParent());
    }

    @ComposeCompilerApi
    public static /* synthetic */ void getSkipping$annotations() {
    }

    private final int groupCompoundKeyPart(SlotReader slotReader, int i10) {
        Object objGroupAux;
        if (!slotReader.hasObjectKey(i10)) {
            int iGroupKey = slotReader.groupKey(i10);
            return (iGroupKey != 207 || (objGroupAux = slotReader.groupAux(i10)) == null || Intrinsics.areEqual(objGroupAux, Composer.INSTANCE.getEmpty())) ? iGroupKey : objGroupAux.hashCode();
        }
        Object objGroupObjectKey = slotReader.groupObjectKey(i10);
        if (objGroupObjectKey != null) {
            return objGroupObjectKey instanceof Enum ? ((Enum) objGroupObjectKey).ordinal() : objGroupObjectKey instanceof MovableContent ? MovableContentKt.movableContentKey : objGroupObjectKey.hashCode();
        }
        return 0;
    }

    private final void insertMovableContentGuarded(List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        SlotTable slotTable;
        Anchor anchor;
        final SlotReader slotReaderOpenReader;
        List list;
        SlotTable slotTable2;
        List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list2 = this.lateChanges;
        List list3 = this.changes;
        try {
            this.changes = list2;
            record(ComposerKt.resetSlotsInstance);
            int size = references.size();
            int i10 = 0;
            int i11 = 0;
            while (i11 < size) {
                Pair<MovableContentStateReference, MovableContentStateReference> pair = references.get(i11);
                final MovableContentStateReference movableContentStateReferenceComponent1 = pair.component1();
                final MovableContentStateReference movableContentStateReferenceComponent2 = pair.component2();
                final Anchor anchor2 = movableContentStateReferenceComponent1.getAnchor();
                int iAnchorIndex = movableContentStateReferenceComponent1.getSlotTable().anchorIndex(anchor2);
                final t0 t0Var = new t0();
                realizeUps();
                record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slots, "slots");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        t0Var.f93331b = ComposerImpl.insertMovableContentGuarded$positionToInsert(slots, anchor2, applier);
                    }
                });
                if (movableContentStateReferenceComponent2 == null) {
                    if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.insertTable)) {
                        createFreshInsertTable();
                    }
                    slotReaderOpenReader = movableContentStateReferenceComponent1.getSlotTable().openReader();
                    try {
                        slotReaderOpenReader.reposition(iAnchorIndex);
                        this.writersReaderDelta = iAnchorIndex;
                        final ArrayList arrayList = new ArrayList();
                        recomposeMovableContent$default(this, null, null, null, null, new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                ComposerImpl composerImpl = this.this$0;
                                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list4 = arrayList;
                                SlotReader slotReader = slotReaderOpenReader;
                                MovableContentStateReference movableContentStateReference = movableContentStateReferenceComponent1;
                                List list5 = composerImpl.changes;
                                try {
                                    composerImpl.changes = list4;
                                    SlotReader slotReader2 = composerImpl.reader;
                                    int[] iArr = composerImpl.nodeCountOverrides;
                                    composerImpl.nodeCountOverrides = null;
                                    try {
                                        composerImpl.reader = slotReader;
                                        composerImpl.invokeMovableContentLambda(movableContentStateReference.getContent$runtime_release(), movableContentStateReference.getLocals$runtime_release(), movableContentStateReference.getParameter(), true);
                                        Unit unit = Unit.f93236a;
                                    } finally {
                                        composerImpl.reader = slotReader2;
                                        composerImpl.nodeCountOverrides = iArr;
                                    }
                                } finally {
                                    composerImpl.changes = list5;
                                }
                            }
                        }, 15, null);
                        if (!arrayList.isEmpty()) {
                            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$2$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(3);
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                    invoke2(applier, slotWriter, rememberManager);
                                    return Unit.f93236a;
                                }

                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                                    Intrinsics.checkNotNullParameter(applier, "applier");
                                    Intrinsics.checkNotNullParameter(slots, "slots");
                                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                    int i12 = t0Var.f93331b;
                                    if (i12 > 0) {
                                        applier = new OffsetApplier(applier, i12);
                                    }
                                    List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list4 = arrayList;
                                    int size2 = list4.size();
                                    for (int i13 = 0; i13 < size2; i13++) {
                                        list4.get(i13).invoke(applier, slots, rememberManager);
                                    }
                                }
                            });
                        }
                        Unit unit = Unit.f93236a;
                        slotReaderOpenReader.close();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                } else {
                    final MovableContentState movableContentStateMovableContentStateResolve$runtime_release = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2);
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null) {
                        slotTable = movableContentStateReferenceComponent2.getSlotTable();
                    }
                    if (movableContentStateMovableContentStateResolve$runtime_release == null || (slotTable2 = movableContentStateMovableContentStateResolve$runtime_release.getSlotTable()) == null || (anchor = slotTable2.anchor(i10)) == null) {
                        anchor = movableContentStateReferenceComponent2.getAnchor();
                    }
                    final List listCollectNodesFrom = ComposerKt.collectNodesFrom(slotTable, anchor);
                    if (!listCollectNodesFrom.isEmpty()) {
                        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$3
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "applier");
                                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                int i12 = t0Var.f93331b;
                                List<Object> list4 = listCollectNodesFrom;
                                int size2 = list4.size();
                                for (int i13 = 0; i13 < size2; i13++) {
                                    Object obj = list4.get(i13);
                                    int i14 = i12 + i13;
                                    applier.insertBottomUp(i14, obj);
                                    applier.insertTopDown(i14, obj);
                                }
                            }
                        });
                        if (Intrinsics.areEqual(movableContentStateReferenceComponent1.getSlotTable(), this.slotTable)) {
                            int iAnchorIndex2 = this.slotTable.anchorIndex(anchor2);
                            updateNodeCount(iAnchorIndex2, updatedNodeCount(iAnchorIndex2) + listCollectNodesFrom.size());
                        }
                    }
                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) throws Throwable {
                            invoke2(applier, slotWriter, rememberManager);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) throws Throwable {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            MovableContentState movableContentStateMovableContentStateResolve$runtime_release2 = movableContentStateMovableContentStateResolve$runtime_release;
                            if (movableContentStateMovableContentStateResolve$runtime_release2 == null && (movableContentStateMovableContentStateResolve$runtime_release2 = this.parentContext.movableContentStateResolve$runtime_release(movableContentStateReferenceComponent2)) == null) {
                                ComposerKt.composeRuntimeError("Could not resolve state for movable content");
                                throw new g();
                            }
                            List<Anchor> listMoveIntoGroupFrom = slots.moveIntoGroupFrom(1, movableContentStateMovableContentStateResolve$runtime_release2.getSlotTable(), 2);
                            if (listMoveIntoGroupFrom.isEmpty()) {
                                return;
                            }
                            ControlledComposition composition = movableContentStateReferenceComponent1.getComposition();
                            Intrinsics.checkNotNull(composition, "null cannot be cast to non-null type androidx.compose.runtime.CompositionImpl");
                            CompositionImpl compositionImpl = (CompositionImpl) composition;
                            int size2 = listMoveIntoGroupFrom.size();
                            for (int i12 = 0; i12 < size2; i12++) {
                                Object objSlot = slots.slot(listMoveIntoGroupFrom.get(i12), 0);
                                RecomposeScopeImpl recomposeScopeImpl = objSlot instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) objSlot : null;
                                if (recomposeScopeImpl != null) {
                                    recomposeScopeImpl.adoptedBy(compositionImpl);
                                }
                            }
                        }
                    });
                    slotReaderOpenReader = slotTable.openReader();
                    try {
                        SlotReader slotReader = this.reader;
                        int[] iArr = this.nodeCountOverrides;
                        this.nodeCountOverrides = null;
                        try {
                            this.reader = slotReaderOpenReader;
                            int iAnchorIndex3 = slotTable.anchorIndex(anchor);
                            slotReaderOpenReader.reposition(iAnchorIndex3);
                            this.writersReaderDelta = iAnchorIndex3;
                            final ArrayList arrayList2 = new ArrayList();
                            List list4 = this.changes;
                            try {
                                this.changes = arrayList2;
                                list = list4;
                            } catch (Throwable th3) {
                                th = th3;
                                list = list4;
                            }
                            try {
                                recomposeMovableContent(movableContentStateReferenceComponent2.getComposition(), movableContentStateReferenceComponent1.getComposition(), Integer.valueOf(slotReaderOpenReader.getCurrent()), movableContentStateReferenceComponent2.getInvalidations$runtime_release(), new Function0<Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$1$1
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    {
                                        super(0);
                                    }

                                    @Override // kotlin.jvm.functions.Function0
                                    public /* bridge */ /* synthetic */ Unit invoke() {
                                        invoke2();
                                        return Unit.f93236a;
                                    }

                                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                    public final void invoke2() {
                                        this.this$0.invokeMovableContentLambda(movableContentStateReferenceComponent1.getContent$runtime_release(), movableContentStateReferenceComponent1.getLocals$runtime_release(), movableContentStateReferenceComponent1.getParameter(), true);
                                    }
                                });
                                Unit unit2 = Unit.f93236a;
                                this.changes = list;
                                if (!arrayList2.isEmpty()) {
                                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$1$5$1$2
                                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                        {
                                            super(3);
                                        }

                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                            invoke2(applier, slotWriter, rememberManager);
                                            return Unit.f93236a;
                                        }

                                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                                            Intrinsics.checkNotNullParameter(applier, "applier");
                                            Intrinsics.checkNotNullParameter(slots, "slots");
                                            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                            int i12 = t0Var.f93331b;
                                            if (i12 > 0) {
                                                applier = new OffsetApplier(applier, i12);
                                            }
                                            List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list5 = arrayList2;
                                            int size2 = list5.size();
                                            for (int i13 = 0; i13 < size2; i13++) {
                                                list5.get(i13).invoke(applier, slots, rememberManager);
                                            }
                                        }
                                    });
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                this.changes = list;
                                throw th;
                            }
                        } finally {
                            this.reader = slotReader;
                            this.nodeCountOverrides = iArr;
                        }
                    } finally {
                        slotReaderOpenReader.close();
                    }
                }
                record(ComposerKt.skipToGroupEndInstance);
                i11++;
                i10 = 0;
            }
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$insertMovableContentGuarded$1$2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    ComposerImpl.insertMovableContentGuarded$positionToParentOf(slots, applier, 0);
                    slots.endGroup();
                }
            });
            this.writersReaderDelta = 0;
            Unit unit3 = Unit.f93236a;
            this.changes = list3;
        } catch (Throwable th5) {
            this.changes = list3;
            throw th5;
        }
    }

    private static final int insertMovableContentGuarded$currentNodeIndex(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.isNode(parent)) {
            parent = slotWriter.parent(parent);
        }
        int iGroupSize = parent + 1;
        int iNodeCount = 0;
        while (iGroupSize < currentGroup) {
            if (slotWriter.indexInGroup(currentGroup, iGroupSize)) {
                if (slotWriter.isNode(iGroupSize)) {
                    iNodeCount = 0;
                }
                iGroupSize++;
            } else {
                iNodeCount += slotWriter.isNode(iGroupSize) ? 1 : slotWriter.nodeCount(iGroupSize);
                iGroupSize += slotWriter.groupSize(iGroupSize);
            }
        }
        return iNodeCount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int insertMovableContentGuarded$positionToInsert(SlotWriter slotWriter, Anchor anchor, Applier<Object> applier) {
        int iAnchorIndex = slotWriter.anchorIndex(anchor);
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() < iAnchorIndex);
        insertMovableContentGuarded$positionToParentOf(slotWriter, applier, iAnchorIndex);
        int iInsertMovableContentGuarded$currentNodeIndex = insertMovableContentGuarded$currentNodeIndex(slotWriter);
        while (slotWriter.getCurrentGroup() < iAnchorIndex) {
            if (slotWriter.indexInCurrentGroup(iAnchorIndex)) {
                if (slotWriter.isNode()) {
                    applier.down(slotWriter.node(slotWriter.getCurrentGroup()));
                    iInsertMovableContentGuarded$currentNodeIndex = 0;
                }
                slotWriter.startGroup();
            } else {
                iInsertMovableContentGuarded$currentNodeIndex += slotWriter.skipGroup();
            }
        }
        ComposerKt.runtimeCheck(slotWriter.getCurrentGroup() == iAnchorIndex);
        return iInsertMovableContentGuarded$currentNodeIndex;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertMovableContentGuarded$positionToParentOf(SlotWriter slotWriter, Applier<Object> applier, int i10) {
        while (!slotWriter.indexInParent(i10)) {
            slotWriter.skipToGroupEnd();
            if (slotWriter.isNode(slotWriter.getParent())) {
                applier.up();
            }
            slotWriter.endGroup();
        }
    }

    private final int insertedGroupVirtualIndex(int index) {
        return (-2) - index;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void invokeMovableContentLambda(final MovableContent<Object> content, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> locals, final Object parameter, boolean force) {
        startMovableGroup(MovableContentKt.movableContentKey, content);
        changed(parameter);
        int compoundKeyHash = getCompoundKeyHash();
        try {
            this.compoundKeyHash = MovableContentKt.movableContentKey;
            boolean z10 = false;
            if (getInserting()) {
                SlotWriter.markGroup$default(this.writer, 0, 1, null);
            }
            if (!getInserting() && !Intrinsics.areEqual(this.reader.getGroupAux(), locals)) {
                z10 = true;
            }
            if (z10) {
                this.providerUpdates.set(this.reader.getCurrent(), locals);
            }
            m1226startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1236getGroupULZAiWs(), locals);
            if (!getInserting() || force) {
                boolean z11 = this.providersInvalid;
                this.providersInvalid = z10;
                ActualJvm_jvmKt.invokeComposable(this, ComposableLambdaKt.composableLambdaInstance(694380496, true, new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.f93236a;
                    }

                    @Composable
                    public final void invoke(@Nullable Composer composer, int i10) {
                        if ((i10 & 11) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(694380496, i10, -1, "androidx.compose.runtime.ComposerImpl.invokeMovableContentLambda.<anonymous> (Composer.kt:2967)");
                        }
                        content.getContent().invoke(parameter, composer, 8);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }));
                this.providersInvalid = z11;
            } else {
                this.writerHasAProvider = true;
                this.providerCache = null;
                SlotWriter slotWriter = this.writer;
                this.parentContext.insertMovableContent$runtime_release(new MovableContentStateReference(content, parameter, getComposition(), this.insertTable, slotWriter.anchor(slotWriter.parent(slotWriter.getParent())), CollectionsKt.emptyList(), currentCompositionLocalScope()));
            }
            endGroup();
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
        } catch (Throwable th2) {
            endGroup();
            this.compoundKeyHash = compoundKeyHash;
            endMovableGroup();
            throw th2;
        }
    }

    private final Object nodeAt(SlotReader slotReader, int i10) {
        return slotReader.node(i10);
    }

    private final int nodeIndexOf(int groupLocation, int group, int recomposeGroup, int recomposeIndex) {
        int iParent = this.reader.parent(group);
        while (iParent != recomposeGroup && !this.reader.isNode(iParent)) {
            iParent = this.reader.parent(iParent);
        }
        if (this.reader.isNode(iParent)) {
            recomposeIndex = 0;
        }
        if (iParent == group) {
            return recomposeIndex;
        }
        int iUpdatedNodeCount = (updatedNodeCount(iParent) - this.reader.nodeCount(group)) + recomposeIndex;
        loop1: while (recomposeIndex < iUpdatedNodeCount && iParent != groupLocation) {
            iParent++;
            while (iParent < groupLocation) {
                int iGroupSize = this.reader.groupSize(iParent) + iParent;
                if (groupLocation >= iGroupSize) {
                    recomposeIndex += updatedNodeCount(iParent);
                    iParent = iGroupSize;
                }
            }
            break loop1;
        }
        return recomposeIndex;
    }

    private final void realizeDowns(final Object[] nodes) {
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeDowns.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                int length = nodes.length;
                for (int i10 = 0; i10 < length; i10++) {
                    applier.down(nodes[i10]);
                }
            }
        });
    }

    private final void realizeMovement() {
        final int i10 = this.previousCount;
        this.previousCount = 0;
        if (i10 > 0) {
            final int i11 = this.previousRemove;
            if (i11 >= 0) {
                this.previousRemove = -1;
                recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(3);
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                        invoke2(applier, slotWriter, rememberManager);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                        Intrinsics.checkNotNullParameter(applier, "applier");
                        Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                        Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                        applier.remove(i11, i10);
                    }
                });
                return;
            }
            final int i12 = this.previousMoveFrom;
            this.previousMoveFrom = -1;
            final int i13 = this.previousMoveTo;
            this.previousMoveTo = -1;
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeMovement.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    applier.move(i12, i13, i10);
                }
            });
        }
    }

    private final void realizeOperationLocation(boolean forParent) {
        int parent = forParent ? this.reader.getParent() : this.reader.getCurrent();
        final int i10 = parent - this.writersReaderDelta;
        if (!(i10 >= 0)) {
            ComposerKt.composeRuntimeError("Tried to seek backward");
            throw new g();
        }
        if (i10 > 0) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeOperationLocation.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.advanceBy(i10);
                }
            });
            this.writersReaderDelta = parent;
        }
    }

    static /* synthetic */ void realizeOperationLocation$default(ComposerImpl composerImpl, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.realizeOperationLocation(z10);
    }

    private final void realizeUps() {
        final int i10 = this.pendingUps;
        if (i10 > 0) {
            this.pendingUps = 0;
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.realizeUps.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    int i11 = i10;
                    for (int i12 = 0; i12 < i11; i12++) {
                        applier.up();
                    }
                }
            });
        }
    }

    private final <R> R recomposeMovableContent(ControlledComposition from, ControlledComposition to, Integer index, List<Pair<RecomposeScopeImpl, IdentityArraySet<Object>>> invalidations, Function0<? extends R> block) {
        Function0<? extends R> function0;
        R rInvoke;
        boolean z10 = this.implicitRootStart;
        boolean z11 = this.isComposing;
        int i10 = this.nodeIndex;
        try {
            this.implicitRootStart = false;
            this.isComposing = true;
            this.nodeIndex = 0;
            int size = invalidations.size();
            for (int i11 = 0; i11 < size; i11++) {
                Pair<RecomposeScopeImpl, IdentityArraySet<Object>> pair = invalidations.get(i11);
                RecomposeScopeImpl recomposeScopeImplComponent1 = pair.component1();
                IdentityArraySet<Object> identityArraySetComponent2 = pair.component2();
                if (identityArraySetComponent2 != null) {
                    int size2 = identityArraySetComponent2.size();
                    for (int i12 = 0; i12 < size2; i12++) {
                        tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, identityArraySetComponent2.get(i12));
                    }
                } else {
                    tryImminentInvalidation$runtime_release(recomposeScopeImplComponent1, null);
                }
            }
            if (from != null) {
                function0 = block;
                rInvoke = (R) from.delegateInvalidations(to, index != null ? index.intValue() : -1, function0);
                if (rInvoke == null) {
                }
                this.implicitRootStart = z10;
                this.isComposing = z11;
                this.nodeIndex = i10;
                return rInvoke;
            }
            function0 = block;
            rInvoke = function0.invoke();
            this.implicitRootStart = z10;
            this.isComposing = z11;
            this.nodeIndex = i10;
            return rInvoke;
        } catch (Throwable th2) {
            this.implicitRootStart = z10;
            this.isComposing = z11;
            this.nodeIndex = i10;
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ Object recomposeMovableContent$default(ComposerImpl composerImpl, ControlledComposition controlledComposition, ControlledComposition controlledComposition2, Integer num, List list, Function0 function0, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            controlledComposition = null;
        }
        if ((i10 & 2) != 0) {
            controlledComposition2 = null;
        }
        if ((i10 & 4) != 0) {
            num = null;
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt.emptyList();
        }
        return composerImpl.recomposeMovableContent(controlledComposition, controlledComposition2, num, list, function0);
    }

    private final void recomposeToGroupEnd() {
        boolean z10 = this.isComposing;
        this.isComposing = true;
        int parent = this.reader.getParent();
        int iGroupSize = this.reader.groupSize(parent) + parent;
        int i10 = this.nodeIndex;
        int compoundKeyHash = getCompoundKeyHash();
        int i11 = this.groupNodeCount;
        Invalidation invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        boolean z11 = false;
        int i12 = parent;
        while (invalidationFirstInRange != null) {
            int location = invalidationFirstInRange.getLocation();
            ComposerKt.removeLocation(this.invalidations, location);
            if (invalidationFirstInRange.isInvalid()) {
                this.reader.reposition(location);
                int current = this.reader.getCurrent();
                recordUpsAndDowns(i12, current, parent);
                this.nodeIndex = nodeIndexOf(location, current, parent, i10);
                this.compoundKeyHash = compoundKeyOf(this.reader.parent(current), parent, compoundKeyHash);
                this.providerCache = null;
                invalidationFirstInRange.getScope().compose(this);
                this.providerCache = null;
                this.reader.restoreParent(parent);
                i12 = current;
                z11 = true;
            } else {
                this.invalidateStack.push(invalidationFirstInRange.getScope());
                invalidationFirstInRange.getScope().rereadTrackedInstances();
                this.invalidateStack.pop();
            }
            invalidationFirstInRange = ComposerKt.firstInRange(this.invalidations, this.reader.getCurrent(), iGroupSize);
        }
        if (z11) {
            recordUpsAndDowns(i12, parent, parent);
            this.reader.skipToGroupEnd();
            int iUpdatedNodeCount = updatedNodeCount(parent);
            this.nodeIndex = i10 + iUpdatedNodeCount;
            this.groupNodeCount = i11 + iUpdatedNodeCount;
        } else {
            skipReaderToGroupEnd();
        }
        this.compoundKeyHash = compoundKeyHash;
        this.isComposing = z10;
    }

    private final void record(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.changes.add(change);
    }

    private final void recordApplierOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeUps();
        realizeDowns();
        record(change);
    }

    private final void recordDelete() {
        reportFreeMovableContent(this.reader.getCurrent());
        recordSlotEditingOperation(ComposerKt.removeCurrentGroupInstance);
        this.writersReaderDelta += this.reader.getGroupSize();
    }

    private final void recordDown(Object node) {
        this.downNodes.push(node);
    }

    private final void recordEndGroup() {
        int parent = this.reader.getParent();
        if (!(this.startedGroups.peekOr(-1) <= parent)) {
            ComposerKt.composeRuntimeError("Missed recording an endGroup");
            throw new g();
        }
        if (this.startedGroups.peekOr(-1) == parent) {
            this.startedGroups.pop();
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
        }
    }

    private final void recordEndRoot() {
        if (this.startedGroup) {
            recordSlotTableOperation$default(this, false, ComposerKt.endGroupInstance, 1, null);
            this.startedGroup = false;
        }
    }

    private final void recordFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertFixups.add(change);
    }

    private final void recordInsert(final Anchor anchor) {
        if (this.insertFixups.isEmpty()) {
            final SlotTable slotTable = this.insertTable;
            recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.beginInsert();
                    SlotTable slotTable2 = slotTable;
                    slots.moveFrom(slotTable2, anchor.toIndexFor(slotTable2));
                    slots.endInsert();
                }
            });
            return;
        }
        final List mutableList = CollectionsKt.toMutableList((Collection) this.insertFixups);
        this.insertFixups.clear();
        realizeUps();
        realizeDowns();
        final SlotTable slotTable2 = this.insertTable;
        recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordInsert.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                SlotTable slotTable3 = slotTable2;
                List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list = mutableList;
                SlotWriter slotWriterOpenWriter = slotTable3.openWriter();
                try {
                    int size = list.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        list.get(i10).invoke(applier, slotWriterOpenWriter, rememberManager);
                    }
                    Unit unit = Unit.f93236a;
                    slotWriterOpenWriter.close();
                    slots.beginInsert();
                    SlotTable slotTable4 = slotTable2;
                    slots.moveFrom(slotTable4, anchor.toIndexFor(slotTable4));
                    slots.endInsert();
                } catch (Throwable th2) {
                    slotWriterOpenWriter.close();
                    throw th2;
                }
            }
        });
    }

    private final void recordInsertUpFixup(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        this.insertUpFixups.push(change);
    }

    private final void recordMoveNode(int from, int to, int count) {
        if (count > 0) {
            int i10 = this.previousCount;
            if (i10 > 0 && this.previousMoveFrom == from - i10 && this.previousMoveTo == to - i10) {
                this.previousCount = i10 + count;
                return;
            }
            realizeMovement();
            this.previousMoveFrom = from;
            this.previousMoveTo = to;
            this.previousCount = count;
        }
    }

    private final void recordReaderMoving(int location) {
        this.writersReaderDelta = location - (this.reader.getCurrent() - this.writersReaderDelta);
    }

    private final void recordRemoveNode(int nodeIndex, int count) {
        if (count > 0) {
            if (!(nodeIndex >= 0)) {
                ComposerKt.composeRuntimeError(("Invalid remove index " + nodeIndex).toString());
                throw new g();
            }
            if (this.previousRemove == nodeIndex) {
                this.previousCount += count;
                return;
            }
            realizeMovement();
            this.previousRemove = nodeIndex;
            this.previousCount = count;
        }
    }

    private final void recordSlotEditing() {
        SlotReader slotReader;
        int parent;
        if (this.reader.getGroupsSize() <= 0 || this.startedGroups.peekOr(-2) == (parent = (slotReader = this.reader).getParent())) {
            return;
        }
        if (!this.startedGroup && this.implicitRootStart) {
            recordSlotTableOperation$default(this, false, ComposerKt.startRootGroup, 1, null);
            this.startedGroup = true;
        }
        if (parent > 0) {
            final Anchor anchor = slotReader.anchor(parent);
            this.startedGroups.push(parent);
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSlotEditing.1
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.ensureStarted(anchor);
                }
            }, 1, null);
        }
    }

    private final void recordSlotEditingOperation(Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation$default(this, false, 1, null);
        recordSlotEditing();
        record(change);
    }

    private final void recordSlotTableOperation(boolean forParent, Function3<? super Applier<?>, ? super SlotWriter, ? super RememberManager, Unit> change) {
        realizeOperationLocation(forParent);
        record(change);
    }

    static /* synthetic */ void recordSlotTableOperation$default(ComposerImpl composerImpl, boolean z10, Function3 function3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        composerImpl.recordSlotTableOperation(z10, function3);
    }

    private final void recordUp() {
        if (this.downNodes.isNotEmpty()) {
            this.downNodes.pop();
        } else {
            this.pendingUps++;
        }
    }

    private final void recordUpsAndDowns(int oldGroup, int newGroup, int commonRoot) {
        SlotReader slotReader = this.reader;
        int iNearestCommonRootOf = ComposerKt.nearestCommonRootOf(slotReader, oldGroup, newGroup, commonRoot);
        while (oldGroup > 0 && oldGroup != iNearestCommonRootOf) {
            if (slotReader.isNode(oldGroup)) {
                recordUp();
            }
            oldGroup = slotReader.parent(oldGroup);
        }
        doRecordDownsFor(newGroup, iNearestCommonRootOf);
    }

    private final void registerInsertUpFixup() {
        this.insertFixups.add(this.insertUpFixups.pop());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void releaseMovableGroupAtCurrent(MovableContentStateReference reference, SlotWriter slots) {
        SlotTable slotTable = new SlotTable();
        SlotWriter slotWriterOpenWriter = slotTable.openWriter();
        try {
            slotWriterOpenWriter.beginInsert();
            slotWriterOpenWriter.startGroup(MovableContentKt.movableContentKey, reference.getContent$runtime_release());
            SlotWriter.markGroup$default(slotWriterOpenWriter, 0, 1, null);
            slotWriterOpenWriter.update(reference.getParameter());
            slots.moveTo(reference.getAnchor(), 1, slotWriterOpenWriter);
            slotWriterOpenWriter.skipGroup();
            slotWriterOpenWriter.endGroup();
            slotWriterOpenWriter.endInsert();
            Unit unit = Unit.f93236a;
            slotWriterOpenWriter.close();
            this.parentContext.movableContentStateReleased$runtime_release(reference, new MovableContentState(slotTable));
        } catch (Throwable th2) {
            slotWriterOpenWriter.close();
            throw th2;
        }
    }

    private final void reportAllMovableContent() {
        if (this.slotTable.containsMark()) {
            ArrayList arrayList = new ArrayList();
            this.deferredChanges = arrayList;
            SlotReader slotReaderOpenReader = this.slotTable.openReader();
            try {
                this.reader = slotReaderOpenReader;
                List list = this.changes;
                try {
                    this.changes = arrayList;
                    reportFreeMovableContent(0);
                    realizeUps();
                    if (this.startedGroup) {
                        record(ComposerKt.skipToGroupEndInstance);
                        recordEndRoot();
                    }
                    Unit unit = Unit.f93236a;
                    this.changes = list;
                } catch (Throwable th2) {
                    this.changes = list;
                    throw th2;
                }
            } finally {
                slotReaderOpenReader.close();
            }
        }
    }

    private final void reportFreeMovableContent(int groupBeingRemoved) {
        reportFreeMovableContent$reportGroup(this, groupBeingRemoved, false, 0);
        realizeMovement();
    }

    private static final int reportFreeMovableContent$reportGroup(final ComposerImpl composerImpl, int i10, boolean z10, int i11) {
        if (!composerImpl.reader.hasMark(i10)) {
            if (!composerImpl.reader.containsMark(i10)) {
                return composerImpl.reader.nodeCount(i10);
            }
            int iGroupSize = composerImpl.reader.groupSize(i10) + i10;
            int iGroupSize2 = i10 + 1;
            int iReportFreeMovableContent$reportGroup = 0;
            while (iGroupSize2 < iGroupSize) {
                boolean zIsNode = composerImpl.reader.isNode(iGroupSize2);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordDown(composerImpl.reader.node(iGroupSize2));
                }
                iReportFreeMovableContent$reportGroup += reportFreeMovableContent$reportGroup(composerImpl, iGroupSize2, zIsNode || z10, zIsNode ? 0 : i11 + iReportFreeMovableContent$reportGroup);
                if (zIsNode) {
                    composerImpl.realizeMovement();
                    composerImpl.recordUp();
                }
                iGroupSize2 += composerImpl.reader.groupSize(iGroupSize2);
            }
            return iReportFreeMovableContent$reportGroup;
        }
        int iGroupKey = composerImpl.reader.groupKey(i10);
        Object objGroupObjectKey = composerImpl.reader.groupObjectKey(i10);
        if (iGroupKey != 126665345 || !(objGroupObjectKey instanceof MovableContent)) {
            if (iGroupKey != 206 || !Intrinsics.areEqual(objGroupObjectKey, ComposerKt.getReference())) {
                return composerImpl.reader.nodeCount(i10);
            }
            Object objGroupGet = composerImpl.reader.groupGet(i10, 0);
            CompositionContextHolder compositionContextHolder = objGroupGet instanceof CompositionContextHolder ? (CompositionContextHolder) objGroupGet : null;
            if (compositionContextHolder != null) {
                Iterator<T> it = compositionContextHolder.getRef().getComposers().iterator();
                while (it.hasNext()) {
                    ((ComposerImpl) it.next()).reportAllMovableContent();
                }
            }
            return composerImpl.reader.nodeCount(i10);
        }
        MovableContent movableContent = (MovableContent) objGroupObjectKey;
        Object objGroupGet2 = composerImpl.reader.groupGet(i10, 0);
        Anchor anchor = composerImpl.reader.anchor(i10);
        List listFilterToRange = ComposerKt.filterToRange(composerImpl.invalidations, i10, composerImpl.reader.groupSize(i10) + i10);
        ArrayList arrayList = new ArrayList(listFilterToRange.size());
        int size = listFilterToRange.size();
        for (int i12 = 0; i12 < size; i12++) {
            Invalidation invalidation = (Invalidation) listFilterToRange.get(i12);
            arrayList.add(TuplesKt.to(invalidation.getScope(), invalidation.getInstances()));
        }
        final MovableContentStateReference movableContentStateReference = new MovableContentStateReference(movableContent, objGroupGet2, composerImpl.getComposition(), composerImpl.slotTable, anchor, arrayList, composerImpl.currentCompositionLocalScope(i10));
        composerImpl.parentContext.deletedMovableContent$runtime_release(movableContentStateReference);
        composerImpl.recordSlotEditing();
        composerImpl.record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$reportFreeMovableContent$reportGroup$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                this.this$0.releaseMovableGroupAtCurrent(movableContentStateReference, slots);
            }
        });
        if (!z10) {
            return composerImpl.reader.nodeCount(i10);
        }
        composerImpl.realizeMovement();
        composerImpl.realizeUps();
        composerImpl.realizeDowns();
        int iNodeCount = composerImpl.reader.isNode(i10) ? 1 : composerImpl.reader.nodeCount(i10);
        if (iNodeCount > 0) {
            composerImpl.recordRemoveNode(i11, iNodeCount);
        }
        return 0;
    }

    private final <T> T resolveCompositionLocal(CompositionLocal<T> key, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> scope) {
        return ComposerKt.contains(scope, key) ? (T) ComposerKt.getValueOf(scope, key) : key.getDefaultValueHolder$runtime_release().getValue();
    }

    private final void skipGroup() {
        this.groupNodeCount += this.reader.skipGroup();
    }

    private final void skipReaderToGroupEnd() {
        this.groupNodeCount = this.reader.getParentNodes();
        this.reader.skipToGroupEnd();
    }

    /* JADX INFO: renamed from: start-BaiHCIY, reason: not valid java name */
    private final void m1226startBaiHCIY(int key, Object objectKey, int kind, Object data) {
        Object empty = objectKey;
        validateNodeNotExpected();
        updateCompoundKeyWhenWeEnterGroup(key, objectKey, data);
        GroupKind.Companion companion = GroupKind.INSTANCE;
        boolean z10 = kind != companion.m1236getGroupULZAiWs();
        Pending pending = null;
        if (getInserting()) {
            this.reader.beginEmpty();
            int currentGroup = this.writer.getCurrentGroup();
            if (z10) {
                this.writer.startNode(key, Composer.INSTANCE.getEmpty());
            } else if (data != null) {
                SlotWriter slotWriter = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter.startData(key, empty, data);
            } else {
                SlotWriter slotWriter2 = this.writer;
                if (empty == null) {
                    empty = Composer.INSTANCE.getEmpty();
                }
                slotWriter2.startGroup(key, empty);
            }
            Pending pending2 = this.pending;
            if (pending2 != null) {
                KeyInfo keyInfo = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup), -1, 0);
                pending2.registerInsert(keyInfo, this.nodeIndex - pending2.getStartIndex());
                pending2.recordUsed(keyInfo);
            }
            enterGroup(z10, null);
            return;
        }
        boolean z11 = kind == companion.m1237getNodeULZAiWs() && this.reusing;
        if (this.pending == null) {
            int groupKey = this.reader.getGroupKey();
            if (!z11 && groupKey == key && Intrinsics.areEqual(objectKey, this.reader.getGroupObjectKey())) {
                startReaderGroup(z10, data);
            } else {
                this.pending = new Pending(this.reader.extractKeys(), this.nodeIndex);
            }
        }
        Pending pending3 = this.pending;
        if (pending3 != null) {
            KeyInfo next = pending3.getNext(key, objectKey);
            if (z11 || next == null) {
                this.reader.beginEmpty();
                this.inserting = true;
                this.providerCache = null;
                ensureWriter();
                this.writer.beginInsert();
                int currentGroup2 = this.writer.getCurrentGroup();
                if (z10) {
                    this.writer.startNode(key, Composer.INSTANCE.getEmpty());
                } else if (data != null) {
                    SlotWriter slotWriter3 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter3.startData(key, empty, data);
                } else {
                    SlotWriter slotWriter4 = this.writer;
                    if (empty == null) {
                        empty = Composer.INSTANCE.getEmpty();
                    }
                    slotWriter4.startGroup(key, empty);
                }
                this.insertAnchor = this.writer.anchor(currentGroup2);
                KeyInfo keyInfo2 = new KeyInfo(key, -1, insertedGroupVirtualIndex(currentGroup2), -1, 0);
                pending3.registerInsert(keyInfo2, this.nodeIndex - pending3.getStartIndex());
                pending3.recordUsed(keyInfo2);
                pending = new Pending(new ArrayList(), z10 ? 0 : this.nodeIndex);
            } else {
                pending3.recordUsed(next);
                int location = next.getLocation();
                this.nodeIndex = pending3.nodePositionOf(next) + pending3.getStartIndex();
                int iSlotPositionOf = pending3.slotPositionOf(next);
                final int groupIndex = iSlotPositionOf - pending3.getGroupIndex();
                pending3.registerMoveSlot(iSlotPositionOf, pending3.getGroupIndex());
                recordReaderMoving(location);
                this.reader.reposition(location);
                if (groupIndex > 0) {
                    recordSlotEditingOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$start$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter5, RememberManager rememberManager) {
                            invoke2(applier, slotWriter5, rememberManager);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slots, "slots");
                            Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                            slots.moveGroup(groupIndex);
                        }
                    });
                }
                startReaderGroup(z10, data);
            }
        }
        enterGroup(z10, pending);
    }

    private final void startGroup(int key) {
        m1226startBaiHCIY(key, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
    }

    private final void startReaderGroup(boolean isNode, final Object data) {
        if (isNode) {
            this.reader.startNode();
            return;
        }
        if (data != null && this.reader.getGroupAux() != data) {
            recordSlotTableOperation$default(this, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.startReaderGroup.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    slots.updateAux(data);
                }
            }, 1, null);
        }
        this.reader.startGroup();
    }

    private final void startRoot() {
        this.reader = this.slotTable.openReader();
        startGroup(100);
        this.parentContext.startComposing$runtime_release();
        this.parentProvider = this.parentContext.getCompositionLocalScope$runtime_release();
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = changed(this.parentProvider);
        this.providerCache = null;
        if (!this.forceRecomposeScopes) {
            this.forceRecomposeScopes = this.parentContext.getCollectingParameterInformation();
        }
        Set<CompositionData> set = (Set) resolveCompositionLocal(InspectionTablesKt.getLocalInspectionTables(), this.parentProvider);
        if (set != null) {
            set.add(this.slotTable);
            this.parentContext.recordInspectionTable$runtime_release(set);
        }
        startGroup(this.parentContext.getCompoundHashKey());
    }

    private final void updateCompoundKeyWhenWeEnterGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeEnterGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeEnterGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeEnterGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeEnterGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeEnterGroupKeyHash(int keyHash) {
        this.compoundKeyHash = keyHash ^ Integer.rotateLeft(getCompoundKeyHash(), 3);
    }

    private final void updateCompoundKeyWhenWeExitGroup(int groupKey, Object dataKey, Object data) {
        if (dataKey != null) {
            if (dataKey instanceof Enum) {
                updateCompoundKeyWhenWeExitGroupKeyHash(((Enum) dataKey).ordinal());
                return;
            } else {
                updateCompoundKeyWhenWeExitGroupKeyHash(dataKey.hashCode());
                return;
            }
        }
        if (data == null || groupKey != 207 || Intrinsics.areEqual(data, Composer.INSTANCE.getEmpty())) {
            updateCompoundKeyWhenWeExitGroupKeyHash(groupKey);
        } else {
            updateCompoundKeyWhenWeExitGroupKeyHash(data.hashCode());
        }
    }

    private final void updateCompoundKeyWhenWeExitGroupKeyHash(int groupKey) {
        this.compoundKeyHash = Integer.rotateRight(groupKey ^ getCompoundKeyHash(), 3);
    }

    private final void updateNodeCount(int group, int count) {
        if (updatedNodeCount(group) != count) {
            if (group < 0) {
                HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
                if (map == null) {
                    map = new HashMap<>();
                    this.nodeCountVirtualOverrides = map;
                }
                map.put(Integer.valueOf(group), Integer.valueOf(count));
                return;
            }
            int[] iArr = this.nodeCountOverrides;
            if (iArr == null) {
                int[] iArr2 = new int[this.reader.getGroupsSize()];
                ArraysKt.fill$default(iArr2, -1, 0, 0, 6, (Object) null);
                this.nodeCountOverrides = iArr2;
                iArr = iArr2;
            }
            iArr[group] = count;
        }
    }

    private final void updateNodeCountOverrides(int group, int newCount) {
        int iUpdatedNodeCount = updatedNodeCount(group);
        if (iUpdatedNodeCount != newCount) {
            int i10 = newCount - iUpdatedNodeCount;
            int size = this.pendingStack.getSize() - 1;
            while (group != -1) {
                int iUpdatedNodeCount2 = updatedNodeCount(group) + i10;
                updateNodeCount(group, iUpdatedNodeCount2);
                int i11 = size;
                while (true) {
                    if (-1 < i11) {
                        Pending pendingPeek = this.pendingStack.peek(i11);
                        if (pendingPeek != null && pendingPeek.updateNodeCount(group, iUpdatedNodeCount2)) {
                            size = i11 - 1;
                            break;
                        }
                        i11--;
                    } else {
                        break;
                    }
                }
                if (group < 0) {
                    group = this.reader.getParent();
                } else if (this.reader.isNode(group)) {
                    return;
                } else {
                    group = this.reader.parent(group);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final PersistentMap<CompositionLocal<Object>, State<Object>> updateProviderMapGroup(PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> parentScope, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> currentProviders) {
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = parentScope.builder();
        builder.putAll(currentProviders);
        PersistentMap persistentMapBuild = builder.build();
        startGroup(204, ComposerKt.getProviderMaps());
        changed(persistentMapBuild);
        changed(currentProviders);
        endGroup();
        return persistentMapBuild;
    }

    private final int updatedNodeCount(int group) {
        int i10;
        Integer num;
        if (group >= 0) {
            int[] iArr = this.nodeCountOverrides;
            return (iArr == null || (i10 = iArr[group]) < 0) ? this.reader.nodeCount(group) : i10;
        }
        HashMap<Integer, Integer> map = this.nodeCountVirtualOverrides;
        if (map == null || (num = map.get(Integer.valueOf(group))) == null) {
            return 0;
        }
        return num.intValue();
    }

    private final void validateNodeExpected() {
        if (this.nodeExpected) {
            this.nodeExpected = false;
        } else {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected was not expected");
            throw new g();
        }
    }

    private final void validateNodeNotExpected() {
        if (this.nodeExpected) {
            ComposerKt.composeRuntimeError("A call to createNode(), emitNode() or useNode() expected");
            throw new g();
        }
    }

    private final <R> R withChanges(List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> newChanges, Function0<? extends R> block) {
        List list = this.changes;
        try {
            this.changes = newChanges;
            return block.invoke();
        } finally {
            z.b(1);
            this.changes = list;
            z.a(1);
        }
    }

    private final <R> R withReader(SlotReader reader, Function0<? extends R> block) {
        SlotReader slotReader = this.reader;
        int[] iArr = this.nodeCountOverrides;
        this.nodeCountOverrides = null;
        try {
            this.reader = reader;
            return block.invoke();
        } finally {
            z.b(1);
            this.reader = slotReader;
            this.nodeCountOverrides = iArr;
            z.a(1);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public <V, T> void apply(final V value, @NotNull final Function2<? super T, ? super V, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        Function3<Applier<?>, SlotWriter, RememberManager, Unit> function3 = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$apply$operation$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.f93236a;
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
            /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
                jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r2v2 boolean
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
                */
            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@org.jetbrains.annotations.NotNull androidx.compose.runtime.Applier<?> r2, @org.jetbrains.annotations.NotNull androidx.compose.runtime.SlotWriter r3, @org.jetbrains.annotations.NotNull androidx.compose.runtime.RememberManager r4) {
                /*
                    r1 = this;
                    java.lang.String r0 = "applier"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
                    java.lang.String r0 = "<anonymous parameter 1>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
                    java.lang.String r3 = "<anonymous parameter 2>"
                    kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r3)
                    kotlin.jvm.functions.Function2<T, V, kotlin.Unit> r3 = r1
                    java.lang.Object r2 = r2.getCurrent()
                    V r4 = r2
                    r3.invoke(r2, r4)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ComposerImpl$apply$operation$1.invoke2(androidx.compose.runtime.Applier, androidx.compose.runtime.SlotWriter, androidx.compose.runtime.RememberManager):void");
            }
        };
        if (getInserting()) {
            recordFixup(function3);
        } else {
            recordApplierOperation(function3);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionContext buildContext() {
        startGroup(206, ComposerKt.getReference());
        if (getInserting()) {
            SlotWriter.markGroup$default(this.writer, 0, 1, null);
        }
        Object objNextSlot = nextSlot();
        CompositionContextHolder compositionContextHolder = objNextSlot instanceof CompositionContextHolder ? (CompositionContextHolder) objNextSlot : null;
        if (compositionContextHolder == null) {
            compositionContextHolder = new CompositionContextHolder(new CompositionContextImpl(getCompoundKeyHash(), this.forceRecomposeScopes));
            updateValue(compositionContextHolder);
        }
        compositionContextHolder.getRef().updateCompositionLocalScope(currentCompositionLocalScope());
        endGroup();
        return compositionContextHolder.getRef();
    }

    @ComposeCompilerApi
    public final <T> T cache(boolean invalid, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        T t10 = (T) nextSlot();
        if (t10 != Composer.INSTANCE.getEmpty() && !invalid) {
            return t10;
        }
        T tInvoke = block.invoke();
        updateValue(tInvoke);
        return tInvoke;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(@Nullable Object value) {
        if (Intrinsics.areEqual(nextSlot(), value)) {
            return false;
        }
        updateValue(value);
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changedInstance(@Nullable Object value) {
        if (nextSlot() == value) {
            return false;
        }
        updateValue(value);
        return true;
    }

    public final void changesApplied$runtime_release() {
        this.providerUpdates.clear();
    }

    @Override // androidx.compose.runtime.Composer
    public void collectParameterInformation() {
        this.forceRecomposeScopes = true;
    }

    public final void composeContent$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested, @NotNull Function2<? super Composer, ? super Integer, Unit> content) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        Intrinsics.checkNotNullParameter(content, "content");
        if (this.changes.isEmpty()) {
            doCompose(invalidationsRequested, content);
        } else {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called");
            throw new g();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public <T> T consume(@NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return (T) resolveCompositionLocal(key, currentCompositionLocalScope());
    }

    @Override // androidx.compose.runtime.Composer
    public <T> void createNode(@NotNull final Function0<? extends T> factory) {
        Intrinsics.checkNotNullParameter(factory, "factory");
        validateNodeExpected();
        if (!getInserting()) {
            ComposerKt.composeRuntimeError("createNode() can only be called when inserting");
            throw new g();
        }
        final int iPeek = this.nodeIndexStack.peek();
        SlotWriter slotWriter = this.writer;
        final Anchor anchor = slotWriter.anchor(slotWriter.getParent());
        this.groupNodeCount++;
        recordFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                Object objInvoke = factory.invoke();
                slots.updateNode(anchor, objInvoke);
                applier.insertTopDown(iPeek, objInvoke);
                applier.down(objInvoke);
            }
        });
        recordInsertUpFixup(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.createNode.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter2, RememberManager rememberManager) {
                invoke2(applier, slotWriter2, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "applier");
                Intrinsics.checkNotNullParameter(slots, "slots");
                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                Object objNode = slots.node(anchor);
                applier.up();
                applier.insertBottomUp(iPeek, objNode);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void deactivateToEndGroup(boolean changed) {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling dactivateToEndGroup");
            throw new g();
        }
        if (getInserting()) {
            return;
        }
        if (!changed) {
            skipReaderToGroupEnd();
            return;
        }
        int current = this.reader.getCurrent();
        int end = this.reader.getEnd();
        for (final int i10 = current; i10 < end; i10++) {
            if (this.reader.isNode(i10)) {
                final Object objNode = this.reader.node(i10);
                if (objNode instanceof ComposeNodeLifecycleCallback) {
                    record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(3);
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                            invoke2(applier, slotWriter, rememberManager);
                            return Unit.f93236a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                            Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                            Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                            Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                            rememberManager.deactivating((ComposeNodeLifecycleCallback) objNode);
                        }
                    });
                }
            }
            this.reader.forEachData$runtime_release(i10, new Function2<Integer, Object, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Integer num, Object obj) {
                    invoke(num.intValue(), obj);
                    return Unit.f93236a;
                }

                public final void invoke(final int i11, @Nullable final Object obj) {
                    if (obj instanceof RememberObserver) {
                        ComposerImpl.this.reader.reposition(i10);
                        ComposerImpl composerImpl = ComposerImpl.this;
                        final int i12 = i10;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                Intrinsics.checkNotNullParameter(slots, "slots");
                                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                                if (!Intrinsics.areEqual(obj, slots.slot(i12, i11))) {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync");
                                    throw new g();
                                }
                                rememberManager.forgetting((RememberObserver) obj);
                                slots.set(i11, Composer.INSTANCE.getEmpty());
                            }
                        }, 1, null);
                        return;
                    }
                    if (obj instanceof RecomposeScopeImpl) {
                        RecomposeScopeImpl recomposeScopeImpl = (RecomposeScopeImpl) obj;
                        CompositionImpl composition = recomposeScopeImpl.getComposition();
                        if (composition != null) {
                            composition.setPendingInvalidScopes$runtime_release(true);
                            recomposeScopeImpl.release();
                        }
                        ComposerImpl.this.reader.reposition(i10);
                        ComposerImpl composerImpl2 = ComposerImpl.this;
                        final int i13 = i10;
                        ComposerImpl.recordSlotTableOperation$default(composerImpl2, false, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.deactivateToEndGroup.3.2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(3);
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                                invoke2(applier, slotWriter, rememberManager);
                                return Unit.f93236a;
                            }

                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                                Intrinsics.checkNotNullParameter(slots, "slots");
                                Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                                if (Intrinsics.areEqual(obj, slots.slot(i13, i11))) {
                                    slots.set(i11, Composer.INSTANCE.getEmpty());
                                } else {
                                    ComposerKt.composeRuntimeError("Slot table is out of sync");
                                    throw new g();
                                }
                            }
                        }, 1, null);
                    }
                }
            });
        }
        ComposerKt.removeRange(this.invalidations, current, end);
        this.reader.reposition(current);
        this.reader.skipToGroupEnd();
    }

    @Override // androidx.compose.runtime.Composer
    public void disableReusing() {
        this.reusing = false;
    }

    @Override // androidx.compose.runtime.Composer
    public void disableSourceInformation() {
        this.sourceInformationEnabled = false;
    }

    public final void dispose$runtime_release() {
        Trace trace = Trace.INSTANCE;
        Object objBeginSection = trace.beginSection("Compose:Composer.dispose");
        try {
            this.parentContext.unregisterComposer$runtime_release(this);
            this.invalidateStack.clear();
            this.invalidations.clear();
            this.changes.clear();
            this.providerUpdates.clear();
            getApplier().clear();
            this.isDisposed = true;
            Unit unit = Unit.f93236a;
            trace.endSection(objBeginSection);
        } catch (Throwable th2) {
            Trace.INSTANCE.endSection(objBeginSection);
            throw th2;
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void enableReusing() {
        this.reusing = this.reusingGroup >= 0;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endDefaults() {
        endGroup();
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release == null || !currentRecomposeScope$runtime_release.getUsed()) {
            return;
        }
        currentRecomposeScope$runtime_release.setDefaultsInScope(true);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endMovableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    public void endNode() {
        end(true);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void endProviders() {
        endGroup();
        endGroup();
        this.providersInvalid = ComposerKt.asBool(this.providersInvalidStack.pop());
        this.providerCache = null;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void endReplaceableGroup() {
        endGroup();
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @Nullable
    public ScopeUpdateScope endRestartGroup() {
        Anchor anchor;
        final Function1<Composition, Unit> function1End;
        RecomposeScopeImpl recomposeScopeImpl = null;
        RecomposeScopeImpl recomposeScopeImplPop = this.invalidateStack.isNotEmpty() ? this.invalidateStack.pop() : null;
        if (recomposeScopeImplPop != null) {
            recomposeScopeImplPop.setRequiresRecompose(false);
        }
        if (recomposeScopeImplPop != null && (function1End = recomposeScopeImplPop.end(this.compositionToken)) != null) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl$endRestartGroup$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    function1End.invoke(this.getComposition());
                }
            });
        }
        if (recomposeScopeImplPop != null && !recomposeScopeImplPop.getSkipped$runtime_release() && (recomposeScopeImplPop.getUsed() || this.forceRecomposeScopes)) {
            if (recomposeScopeImplPop.getAnchor() == null) {
                if (getInserting()) {
                    SlotWriter slotWriter = this.writer;
                    anchor = slotWriter.anchor(slotWriter.getParent());
                } else {
                    SlotReader slotReader = this.reader;
                    anchor = slotReader.anchor(slotReader.getParent());
                }
                recomposeScopeImplPop.setAnchor(anchor);
            }
            recomposeScopeImplPop.setDefaultsInvalid(false);
            recomposeScopeImpl = recomposeScopeImplPop;
        }
        end(false);
        return recomposeScopeImpl;
    }

    @Override // androidx.compose.runtime.Composer
    public void endReusableGroup() {
        if (this.reusing && this.reader.getParent() == this.reusingGroup) {
            this.reusingGroup = -1;
            this.reusing = false;
        }
        end(false);
    }

    @Override // androidx.compose.runtime.Composer
    public void endToMarker(int marker) {
        if (marker < 0) {
            int i10 = -marker;
            SlotWriter slotWriter = this.writer;
            while (true) {
                int parent = slotWriter.getParent();
                if (parent <= i10) {
                    return;
                } else {
                    end(slotWriter.isNode(parent));
                }
            }
        } else {
            if (getInserting()) {
                SlotWriter slotWriter2 = this.writer;
                while (getInserting()) {
                    end(slotWriter2.isNode(slotWriter2.getParent()));
                }
            }
            SlotReader slotReader = this.reader;
            while (true) {
                int parent2 = slotReader.getParent();
                if (parent2 <= marker) {
                    return;
                } else {
                    end(slotReader.isNode(parent2));
                }
            }
        }
    }

    public final boolean forceRecomposeScopes$runtime_release() {
        if (this.forceRecomposeScopes) {
            return false;
        }
        this.forceRecomposeScopes = true;
        this.forciblyRecompose = true;
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public Applier<?> getApplier() {
        return this.applier;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CoroutineContext getApplyCoroutineContext() {
        return this.parentContext.getEffectCoroutineContext();
    }

    public final boolean getAreChildrenComposing$runtime_release() {
        return this.childrenComposing > 0;
    }

    public final int getChangeCount$runtime_release() {
        return this.changes.size();
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public ControlledComposition getComposition() {
        return this.composition;
    }

    @Override // androidx.compose.runtime.Composer
    @NotNull
    public CompositionData getCompositionData() {
        return this.slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCompoundKeyHash() {
        return this.compoundKeyHash;
    }

    @Override // androidx.compose.runtime.Composer
    public int getCurrentMarker() {
        return getInserting() ? -this.writer.getParent() : this.reader.getParent();
    }

    @Nullable
    public final RecomposeScopeImpl getCurrentRecomposeScope$runtime_release() {
        Stack<RecomposeScopeImpl> stack = this.invalidateStack;
        if (this.childrenComposing == 0 && stack.isNotEmpty()) {
            return stack.peek();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getDefaultsInvalid() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return this.providersInvalid || ((currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) != null && currentRecomposeScope$runtime_release.getDefaultsInvalid());
    }

    @Nullable
    public final List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> getDeferredChanges$runtime_release() {
        return this.deferredChanges;
    }

    public final boolean getHasInvalidations() {
        return !this.invalidations.isEmpty();
    }

    public final boolean getHasPendingChanges$runtime_release() {
        return !this.changes.isEmpty();
    }

    @NotNull
    /* JADX INFO: renamed from: getInsertTable$runtime_release, reason: from getter */
    public final SlotTable getInsertTable() {
        return this.insertTable;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getInserting() {
        return this.inserting;
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public RecomposeScope getRecomposeScope() {
        return getCurrentRecomposeScope$runtime_release();
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object getRecomposeScopeIdentity() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            return currentRecomposeScope$runtime_release.getAnchor();
        }
        return null;
    }

    @Override // androidx.compose.runtime.Composer
    public boolean getSkipping() {
        RecomposeScopeImpl currentRecomposeScope$runtime_release;
        return (getInserting() || this.reusing || this.providersInvalid || (currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release()) == null || currentRecomposeScope$runtime_release.getRequiresRecompose() || this.forciblyRecompose) ? false : true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContent(@NotNull MovableContent<?> value, @Nullable Object parameter) {
        Intrinsics.checkNotNullParameter(value, "value");
        invokeMovableContentLambda(value, currentCompositionLocalScope(), parameter, false);
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void insertMovableContentReferences(@NotNull List<Pair<MovableContentStateReference, MovableContentStateReference>> references) {
        Intrinsics.checkNotNullParameter(references, "references");
        try {
            insertMovableContentGuarded(references);
            cleanUpCompose();
        } catch (Throwable th2) {
            abortRoot();
            throw th2;
        }
    }

    /* JADX INFO: renamed from: isComposing$runtime_release, reason: from getter */
    public final boolean getIsComposing() {
        return this.isComposing;
    }

    /* JADX INFO: renamed from: isDisposed$runtime_release, reason: from getter */
    public final boolean getIsDisposed() {
        return this.isDisposed;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Object joinKey(@Nullable Object left, @Nullable Object right) {
        Object key = ComposerKt.getKey(this.reader.getGroupObjectKey(), left, right);
        return key == null ? new JoinedKey(left, right) : key;
    }

    @Nullable
    public final Object nextSlot() {
        if (!getInserting()) {
            return this.reusing ? Composer.INSTANCE.getEmpty() : this.reader.next();
        }
        validateNodeNotExpected();
        return Composer.INSTANCE.getEmpty();
    }

    public final int parentKey$runtime_release() {
        if (getInserting()) {
            SlotWriter slotWriter = this.writer;
            return slotWriter.groupKey(slotWriter.getParent());
        }
        SlotReader slotReader = this.reader;
        return slotReader.groupKey(slotReader.getParent());
    }

    public final void prepareCompose$runtime_release(@NotNull Function0<Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        if (this.isComposing) {
            ComposerKt.composeRuntimeError("Preparing a composition while composing is not supported");
            throw new g();
        }
        this.isComposing = true;
        try {
            block.invoke();
        } finally {
            this.isComposing = false;
        }
    }

    public final boolean recompose$runtime_release(@NotNull IdentityArrayMap<RecomposeScopeImpl, IdentityArraySet<Object>> invalidationsRequested) {
        Intrinsics.checkNotNullParameter(invalidationsRequested, "invalidationsRequested");
        if (!this.changes.isEmpty()) {
            ComposerKt.composeRuntimeError("Expected applyChanges() to have been called");
            throw new g();
        }
        if (!invalidationsRequested.isNotEmpty() && this.invalidations.isEmpty() && !this.forciblyRecompose) {
            return false;
        }
        doCompose(invalidationsRequested, null);
        return !this.changes.isEmpty();
    }

    @Override // androidx.compose.runtime.Composer
    public void recordSideEffect(@NotNull final Function0<Unit> effect) {
        Intrinsics.checkNotNullParameter(effect, "effect");
        record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.recordSideEffect.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                invoke2(applier, slotWriter, rememberManager);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                rememberManager.sideEffect(effect);
            }
        });
    }

    @Override // androidx.compose.runtime.Composer
    public void recordUsed(@NotNull RecomposeScope scope) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        RecomposeScopeImpl recomposeScopeImpl = scope instanceof RecomposeScopeImpl ? (RecomposeScopeImpl) scope : null;
        if (recomposeScopeImpl == null) {
            return;
        }
        recomposeScopeImpl.setUsed(true);
    }

    @Override // androidx.compose.runtime.Composer
    @Nullable
    public Object rememberedValue() {
        return nextSlot();
    }

    public final void setDeferredChanges$runtime_release(@Nullable List<Function3<Applier<?>, SlotWriter, RememberManager, Unit>> list) {
        this.deferredChanges = list;
    }

    public final void setInsertTable$runtime_release(@NotNull SlotTable slotTable) {
        Intrinsics.checkNotNullParameter(slotTable, "<set-?>");
        this.insertTable = slotTable;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipCurrentGroup() {
        if (this.invalidations.isEmpty()) {
            skipGroup();
            return;
        }
        SlotReader slotReader = this.reader;
        int groupKey = slotReader.getGroupKey();
        Object groupObjectKey = slotReader.getGroupObjectKey();
        Object groupAux = slotReader.getGroupAux();
        updateCompoundKeyWhenWeEnterGroup(groupKey, groupObjectKey, groupAux);
        startReaderGroup(slotReader.isNode(), null);
        recomposeToGroupEnd();
        slotReader.endGroup();
        updateCompoundKeyWhenWeExitGroup(groupKey, groupObjectKey, groupAux);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void skipToGroupEnd() {
        if (!(this.groupNodeCount == 0)) {
            ComposerKt.composeRuntimeError("No nodes can be emitted before calling skipAndEndGroup");
            throw new g();
        }
        RecomposeScopeImpl currentRecomposeScope$runtime_release = getCurrentRecomposeScope$runtime_release();
        if (currentRecomposeScope$runtime_release != null) {
            currentRecomposeScope$runtime_release.scopeSkipped();
        }
        if (this.invalidations.isEmpty()) {
            skipReaderToGroupEnd();
        } else {
            recomposeToGroupEnd();
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformation(@NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (getInserting() && this.sourceInformationEnabled) {
            this.writer.insertAux(sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerEnd() {
        if (this.sourceInformationEnabled) {
            end(false);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void sourceInformationMarkerStart(int key, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        if (this.sourceInformationEnabled) {
            m1226startBaiHCIY(key, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), sourceInformation);
        }
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startDefaults() {
        m1226startBaiHCIY(-127, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startMovableGroup(int key, @Nullable Object dataKey) {
        m1226startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    public void startNode() {
        m1226startBaiHCIY(125, null, GroupKind.INSTANCE.m1237getNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    @Override // androidx.compose.runtime.Composer
    @InternalComposeApi
    public void startProviders(@NotNull final ProvidedValue<?>[] values) {
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapUpdateProviderMapGroup;
        Intrinsics.checkNotNullParameter(values, "values");
        final PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCurrentCompositionLocalScope = currentCompositionLocalScope();
        startGroup(201, ComposerKt.getProvider());
        startGroup(203, ComposerKt.getProviderValues());
        PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap = (PersistentMap) ActualJvm_jvmKt.invokeComposableForResult(this, new Function2<Composer, Integer, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>>>() { // from class: androidx.compose.runtime.ComposerImpl$startProviders$currentProviders$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> invoke(Composer composer, Integer num) {
                return invoke(composer, num.intValue());
            }

            @Composable
            @NotNull
            public final PersistentMap<CompositionLocal<Object>, State<Object>> invoke(@Nullable Composer composer, int i10) {
                composer.startReplaceableGroup(935231726);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(935231726, i10, -1, "androidx.compose.runtime.ComposerImpl.startProviders.<anonymous> (Composer.kt:2002)");
                }
                PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapCompositionLocalMapOf = ComposerKt.compositionLocalMapOf(values, persistentMapCurrentCompositionLocalScope, composer, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                composer.endReplaceableGroup();
                return persistentMapCompositionLocalMapOf;
            }
        });
        endGroup();
        boolean z10 = false;
        if (getInserting()) {
            persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
            this.writerHasAProvider = true;
        } else {
            Object objGroupGet = this.reader.groupGet(0);
            Intrinsics.checkNotNull(objGroupGet, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = (PersistentMap) objGroupGet;
            Object objGroupGet2 = this.reader.groupGet(1);
            Intrinsics.checkNotNull(objGroupGet2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
            PersistentMap persistentMap3 = (PersistentMap) objGroupGet2;
            if (getSkipping() && Intrinsics.areEqual(persistentMap3, persistentMap)) {
                skipGroup();
                persistentMapUpdateProviderMapGroup = persistentMap2;
            } else {
                persistentMapUpdateProviderMapGroup = updateProviderMapGroup(persistentMapCurrentCompositionLocalScope, persistentMap);
                z10 = !Intrinsics.areEqual(persistentMapUpdateProviderMapGroup, persistentMap2);
            }
        }
        if (z10 && !getInserting()) {
            this.providerUpdates.set(this.reader.getCurrent(), persistentMapUpdateProviderMapGroup);
        }
        this.providersInvalidStack.push(ComposerKt.asInt(this.providersInvalid));
        this.providersInvalid = z10;
        this.providerCache = persistentMapUpdateProviderMapGroup;
        m1226startBaiHCIY(202, ComposerKt.getCompositionLocalMap(), GroupKind.INSTANCE.m1236getGroupULZAiWs(), persistentMapUpdateProviderMapGroup);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public void startReplaceableGroup(int key) {
        m1226startBaiHCIY(key, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    @NotNull
    public Composer startRestartGroup(int key) {
        m1226startBaiHCIY(key, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
        addRecomposeScope();
        return this;
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableGroup(int key, @Nullable Object dataKey) {
        if (this.reader.getGroupKey() == key && !Intrinsics.areEqual(this.reader.getGroupAux(), dataKey) && this.reusingGroup < 0) {
            this.reusingGroup = this.reader.getCurrent();
            this.reusing = true;
        }
        m1226startBaiHCIY(key, null, GroupKind.INSTANCE.m1236getGroupULZAiWs(), dataKey);
    }

    @Override // androidx.compose.runtime.Composer
    public void startReusableNode() {
        m1226startBaiHCIY(125, null, GroupKind.INSTANCE.m1238getReusableNodeULZAiWs(), null);
        this.nodeExpected = true;
    }

    public final boolean tryImminentInvalidation$runtime_release(@NotNull RecomposeScopeImpl scope, @Nullable Object instance) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Anchor anchor = scope.getAnchor();
        if (anchor == null) {
            return false;
        }
        int indexFor = anchor.toIndexFor(this.slotTable);
        if (!this.isComposing || indexFor < this.reader.getCurrent()) {
            return false;
        }
        ComposerKt.insertIfMissing(this.invalidations, indexFor, scope, instance);
        return true;
    }

    public final void updateCachedValue(@Nullable Object value) {
        updateValue(value);
    }

    @Override // androidx.compose.runtime.Composer
    public void updateRememberedValue(@Nullable Object value) {
        updateValue(value);
    }

    public final void updateValue(@Nullable final Object value) {
        if (!getInserting()) {
            final int groupSlotIndex = this.reader.getGroupSlotIndex() - 1;
            if (value instanceof RememberObserver) {
                this.abandonSet.add(value);
            }
            recordSlotTableOperation(true, new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slots, @NotNull RememberManager rememberManager) {
                    RecomposeScopeImpl recomposeScopeImpl;
                    CompositionImpl composition;
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slots, "slots");
                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                    Object obj = value;
                    if (obj instanceof RememberObserver) {
                        rememberManager.remembering((RememberObserver) obj);
                    }
                    Object obj2 = slots.set(groupSlotIndex, value);
                    if (obj2 instanceof RememberObserver) {
                        rememberManager.forgetting((RememberObserver) obj2);
                    } else {
                        if (!(obj2 instanceof RecomposeScopeImpl) || (composition = (recomposeScopeImpl = (RecomposeScopeImpl) obj2).getComposition()) == null) {
                            return;
                        }
                        recomposeScopeImpl.release();
                        composition.setPendingInvalidScopes$runtime_release(true);
                    }
                }
            });
            return;
        }
        this.writer.update(value);
        if (value instanceof RememberObserver) {
            record(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.updateValue.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(3);
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "<anonymous parameter 0>");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
                    rememberManager.remembering((RememberObserver) value);
                }
            });
            this.abandonSet.add(value);
        }
    }

    @Override // androidx.compose.runtime.Composer
    public void useNode() {
        validateNodeExpected();
        if (getInserting()) {
            ComposerKt.composeRuntimeError("useNode() called while inserting");
            throw new g();
        }
        Object node = getNode(this.reader);
        recordDown(node);
        if (this.reusing && (node instanceof ComposeNodeLifecycleCallback)) {
            recordApplierOperation(new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerImpl.useNode.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Applier<?> applier, SlotWriter slotWriter, RememberManager rememberManager) {
                    invoke2(applier, slotWriter, rememberManager);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull Applier<?> applier, @NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
                    Intrinsics.checkNotNullParameter(applier, "applier");
                    Intrinsics.checkNotNullParameter(slotWriter, "<anonymous parameter 1>");
                    Intrinsics.checkNotNullParameter(rememberManager, "<anonymous parameter 2>");
                    Object current = applier.getCurrent();
                    Intrinsics.checkNotNull(current, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
                    ((ComposeNodeLifecycleCallback) current).onReuse();
                }
            });
        }
    }

    public final void verifyConsistent$runtime_release() {
        this.insertTable.verifyWellFormed();
    }

    private final void realizeDowns() {
        if (this.downNodes.isNotEmpty()) {
            realizeDowns(this.downNodes.toArray());
            this.downNodes.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void startGroup(int key, Object dataKey) {
        m1226startBaiHCIY(key, dataKey, GroupKind.INSTANCE.m1236getGroupULZAiWs(), null);
    }

    private final PersistentMap<CompositionLocal<Object>, State<Object>> currentCompositionLocalScope(int group) {
        if (getInserting() && this.writerHasAProvider) {
            int parent = this.writer.getParent();
            while (parent > 0) {
                if (this.writer.groupKey(parent) == 202 && Intrinsics.areEqual(this.writer.groupObjectKey(parent), ComposerKt.getCompositionLocalMap())) {
                    Object objGroupAux = this.writer.groupAux(parent);
                    Intrinsics.checkNotNull(objGroupAux, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap = (PersistentMap) objGroupAux;
                    this.providerCache = persistentMap;
                    return persistentMap;
                }
                parent = this.writer.parent(parent);
            }
        }
        if (this.reader.getGroupsSize() > 0) {
            while (group > 0) {
                if (this.reader.groupKey(group) == 202 && Intrinsics.areEqual(this.reader.groupObjectKey(group), ComposerKt.getCompositionLocalMap())) {
                    PersistentMap<CompositionLocal<Object>, State<Object>> persistentMap2 = this.providerUpdates.get(group);
                    if (persistentMap2 == null) {
                        Object objGroupAux2 = this.reader.groupAux(group);
                        Intrinsics.checkNotNull(objGroupAux2, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap<androidx.compose.runtime.CompositionLocal<kotlin.Any?>, androidx.compose.runtime.State<kotlin.Any?>>{ androidx.compose.runtime.ComposerKt.CompositionLocalMap }");
                        persistentMap2 = (PersistentMap) objGroupAux2;
                    }
                    this.providerCache = persistentMap2;
                    return persistentMap2;
                }
                group = this.reader.parent(group);
            }
        }
        PersistentMap persistentMap3 = this.parentProvider;
        this.providerCache = persistentMap3;
        return persistentMap3;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(char value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Character) && value == ((Character) objNextSlot).charValue()) {
            return false;
        }
        updateValue(Character.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(byte value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Byte) && value == ((Number) objNextSlot).byteValue()) {
            return false;
        }
        updateValue(Byte.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(short value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Short) && value == ((Number) objNextSlot).shortValue()) {
            return false;
        }
        updateValue(Short.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(boolean value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Boolean) && value == ((Boolean) objNextSlot).booleanValue()) {
            return false;
        }
        updateValue(Boolean.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(float value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Float) && value == ((Number) objNextSlot).floatValue()) {
            return false;
        }
        updateValue(Float.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(long value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Long) && value == ((Number) objNextSlot).longValue()) {
            return false;
        }
        updateValue(Long.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(double value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Double) && value == ((Number) objNextSlot).doubleValue()) {
            return false;
        }
        updateValue(Double.valueOf(value));
        return true;
    }

    @Override // androidx.compose.runtime.Composer
    @ComposeCompilerApi
    public boolean changed(int value) {
        Object objNextSlot = nextSlot();
        if ((objNextSlot instanceof Integer) && value == ((Number) objNextSlot).intValue()) {
            return false;
        }
        updateValue(Integer.valueOf(value));
        return true;
    }
}
