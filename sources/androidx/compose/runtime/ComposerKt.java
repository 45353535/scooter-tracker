package androidx.compose.runtime;

import androidx.compose.runtime.collection.IdentityArraySet;
import androidx.compose.runtime.external.kotlinx.collections.immutable.ExtensionsKt;
import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentMap;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import lf.g;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0087\u0001\u0010\t\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042.\u0010\b\u001a*\u0012 \u0012\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001aG\u0010\u000e\u001a\u00020\r\"\u0004\b\u0000\u0010\u000b*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001aG\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001ak\u0010\u0016\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u00042\u0012\u0010\u0014\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00130\u00122&\u0010\u0015\u001a\"\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000j\u0002`\u0004H\u0003¢\u0006\u0004\b\u0016\u0010\u0017\u001a8\u0010\u001d\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b*\u00020\u00182\u0006\u0010\u0019\u001a\u00020\r2\u0011\u0010\u001c\u001a\r\u0012\u0004\u0012\u00028\u00000\u001a¢\u0006\u0002\b\u001bH\u0087\bø\u0001\u0000¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001f\u0010!\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b!\u0010\"\u001a'\u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020#2\u0006\u0010!\u001a\u00020 H\u0007¢\u0006\u0004\b$\u0010%\u001a\u000f\u0010&\u001a\u00020\rH\u0007¢\u0006\u0004\b&\u0010'\u001a\u001f\u0010)\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020#2\u0006\u0010(\u001a\u00020 H\u0007¢\u0006\u0004\b)\u0010*\u001a/\u0010)\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020#2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#2\u0006\u0010(\u001a\u00020 H\u0007¢\u0006\u0004\b)\u0010-\u001a\u000f\u0010.\u001a\u00020\u0007H\u0007¢\u0006\u0004\b.\u0010/\u001a\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0018H\u0007¢\u0006\u0004\b0\u00101\u001a\u001b\u00105\u001a\u00020\u0007*\u0002022\u0006\u00104\u001a\u000203H\u0000¢\u0006\u0004\b5\u00106\u001aW\u0010=\u001a>\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010:j\b\u0012\u0004\u0012\u00028\u0001`;09j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010:j\b\u0012\u0004\u0012\u00028\u0001`;`<\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u00108H\u0002¢\u0006\u0004\b=\u0010>\u001aa\u0010@\u001a\u00020\r\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u00108*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:09j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010:j\b\u0012\u0004\u0012\u00028\u0001`;`<2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u0001H\u0002¢\u0006\u0004\b@\u0010A\u001ac\u0010B\u001a\u0004\u0018\u00010\u0007\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u00108*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:09j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010:j\b\u0012\u0004\u0012\u00028\u0001`;`<2\u0006\u0010\f\u001a\u00028\u00002\u0006\u0010?\u001a\u00028\u0001H\u0002¢\u0006\u0004\bB\u0010C\u001a[\u0010D\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0000\u00107\"\u0004\b\u0001\u00108*4\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010:09j\u001e\u0012\u0004\u0012\u00028\u0000\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010:j\b\u0012\u0004\u0012\u00028\u0001`;`<2\u0006\u0010\f\u001a\u00028\u0000H\u0002¢\u0006\u0004\bD\u0010E\u001a/\u0010H\u001a\u0004\u0018\u00010\u00022\b\u0010?\u001a\u0004\u0018\u00010\u00022\b\u0010F\u001a\u0004\u0018\u00010\u00022\b\u0010G\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\bH\u0010I\u001a!\u0010M\u001a\u00020#*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bM\u0010N\u001a!\u0010O\u001a\u00020#*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bO\u0010N\u001a3\u0010S\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020#2\u0006\u0010Q\u001a\u00020P2\b\u0010R\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\bS\u0010T\u001a+\u0010W\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020#H\u0002¢\u0006\u0004\bW\u0010X\u001a#\u0010Y\u001a\u0004\u0018\u00010K*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010L\u001a\u00020#H\u0002¢\u0006\u0004\bY\u0010Z\u001a)\u0010[\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020#H\u0002¢\u0006\u0004\b[\u0010\\\u001a/\u0010]\u001a\b\u0012\u0004\u0012\u00020K0J*\b\u0012\u0004\u0012\u00020K0J2\u0006\u0010U\u001a\u00020#2\u0006\u0010V\u001a\u00020#H\u0002¢\u0006\u0004\b]\u0010^\u001a\u0013\u0010_\u001a\u00020#*\u00020\rH\u0002¢\u0006\u0004\b_\u0010`\u001a\u0013\u0010a\u001a\u00020\r*\u00020#H\u0002¢\u0006\u0004\ba\u0010b\u001a#\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020f*\u00020c2\u0006\u0010e\u001a\u00020dH\u0002¢\u0006\u0004\bg\u0010h\u001a#\u0010l\u001a\u00020#*\u00020i2\u0006\u0010j\u001a\u00020#2\u0006\u0010k\u001a\u00020#H\u0002¢\u0006\u0004\bl\u0010m\u001a+\u0010q\u001a\u00020#*\u00020i2\u0006\u0010n\u001a\u00020#2\u0006\u0010o\u001a\u00020#2\u0006\u0010p\u001a\u00020#H\u0002¢\u0006\u0004\bq\u0010r\u001a)\u0010t\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\r2\f\u0010s\u001a\b\u0012\u0004\u0012\u00020\u00020\u001aH\u0080\bø\u0001\u0000¢\u0006\u0004\bt\u0010u\u001a\u0017\u0010t\u001a\u00020\u00072\u0006\u0010?\u001a\u00020\rH\u0000¢\u0006\u0004\bt\u0010v\u001a\u0017\u0010y\u001a\u00020x2\u0006\u0010w\u001a\u00020 H\u0000¢\u0006\u0004\by\u0010z\"\u001e\u0010|\u001a\u0004\u0018\u00010{8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b|\u0010}\u0012\u0004\b~\u0010/\"9\u0010\u0082\u0001\u001a$\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007fj\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001\"9\u0010\u0084\u0001\u001a$\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007fj\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001\"9\u0010\u0085\u0001\u001a$\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007fj\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001\"9\u0010\u0086\u0001\u001a$\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007fj\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0083\u0001\"9\u0010\u0087\u0001\u001a$\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007fj\u0003`\u0081\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0083\u0001\"\u0017\u0010\u0088\u0001\u001a\u00020#8\u0002X\u0082T¢\u0006\b\n\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0017\u0010\u008a\u0001\u001a\u00020#8\u0002X\u0082T¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u0089\u0001\"\u0017\u0010\u008b\u0001\u001a\u00020#8\u0002X\u0082T¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u0089\u0001\"\u001e\u0010\u008c\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b\u008c\u0001\u0010\u0089\u0001\u0012\u0005\b\u008d\u0001\u0010/\"&\u0010\u008e\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u008e\u0001\u0010\u008f\u0001\u0012\u0005\b\u0092\u0001\u0010/\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001\"\u001e\u0010\u0093\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b\u0093\u0001\u0010\u0089\u0001\u0012\u0005\b\u0094\u0001\u0010/\"&\u0010\u0095\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u0095\u0001\u0010\u008f\u0001\u0012\u0005\b\u0097\u0001\u0010/\u001a\u0006\b\u0096\u0001\u0010\u0091\u0001\"\u001e\u0010\u0098\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b\u0098\u0001\u0010\u0089\u0001\u0012\u0005\b\u0099\u0001\u0010/\"&\u0010\u009a\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u009a\u0001\u0010\u008f\u0001\u0012\u0005\b\u009c\u0001\u0010/\u001a\u0006\b\u009b\u0001\u0010\u0091\u0001\"\u001e\u0010\u009d\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b\u009d\u0001\u0010\u0089\u0001\u0012\u0005\b\u009e\u0001\u0010/\"&\u0010\u009f\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b\u009f\u0001\u0010\u008f\u0001\u0012\u0005\b¡\u0001\u0010/\u001a\u0006\b \u0001\u0010\u0091\u0001\"\u001e\u0010¢\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b¢\u0001\u0010\u0089\u0001\u0012\u0005\b£\u0001\u0010/\"&\u0010¤\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b¤\u0001\u0010\u008f\u0001\u0012\u0005\b¦\u0001\u0010/\u001a\u0006\b¥\u0001\u0010\u0091\u0001\"\u001e\u0010§\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b§\u0001\u0010\u0089\u0001\u0012\u0005\b¨\u0001\u0010/\"&\u0010©\u0001\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0017\n\u0006\b©\u0001\u0010\u008f\u0001\u0012\u0005\b«\u0001\u0010/\u001a\u0006\bª\u0001\u0010\u0091\u0001\"\u001e\u0010¬\u0001\u001a\u00020#8\u0000X\u0081T¢\u0006\u000f\n\u0006\b¬\u0001\u0010\u0089\u0001\u0012\u0005\b\u00ad\u0001\u0010/\"\u0017\u0010®\u0001\u001a\u00020#8\u0002X\u0082T¢\u0006\b\n\u0006\b®\u0001\u0010\u0089\u0001\"\u001c\u0010²\u0001\u001a\u00020\u0002*\u00030¯\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001*G\b\u0000\u0010³\u0001\"\u001f\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007f2\u001f\u0012\t\u0012\u0007\u0012\u0002\b\u00030\u0080\u0001\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\u00070\u007f*E\b\u0000\u0010´\u0001\"\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u00002\u001e\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00030\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006µ\u0001"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/CompositionLocal;", "", "Landroidx/compose/runtime/State;", "Landroidx/compose/runtime/CompositionLocalMap;", "Lkotlin/Function1;", "", "", "mutator", "mutate", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Lkotlin/jvm/functions/Function1;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "T", C4240b4.i.W, "", "contains", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Z", "getValueOf", "(Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/ProvidedValue;", "values", "parentScope", "compositionLocalMapOf", "([Landroidx/compose/runtime/ProvidedValue;Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentMap;", "Landroidx/compose/runtime/Composer;", "invalid", "Lkotlin/Function0;", "Landroidx/compose/runtime/DisallowComposableCalls;", "block", Reporting.EventType.CACHE, "(Landroidx/compose/runtime/Composer;ZLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "composer", "", "sourceInformation", "(Landroidx/compose/runtime/Composer;Ljava/lang/String;)V", "", "sourceInformationMarkerStart", "(Landroidx/compose/runtime/Composer;ILjava/lang/String;)V", "isTraceInProgress", "()Z", "info", "traceEventStart", "(ILjava/lang/String;)V", "dirty1", "dirty2", "(IIILjava/lang/String;)V", "traceEventEnd", "()V", "sourceInformationMarkerEnd", "(Landroidx/compose/runtime/Composer;)V", "Landroidx/compose/runtime/SlotWriter;", "Landroidx/compose/runtime/RememberManager;", "rememberManager", "removeCurrentGroup", "(Landroidx/compose/runtime/SlotWriter;Landroidx/compose/runtime/RememberManager;)V", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Ljava/util/HashMap;", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Lkotlin/collections/HashMap;", "multiMap", "()Ljava/util/HashMap;", "value", "put", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Z", "remove", "(Ljava/util/HashMap;Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Unit;", "pop", "(Ljava/util/HashMap;Ljava/lang/Object;)Ljava/lang/Object;", "left", "right", "getKey", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "", "Landroidx/compose/runtime/Invalidation;", "location", "findLocation", "(Ljava/util/List;I)I", "findInsertLocation", "Landroidx/compose/runtime/RecomposeScopeImpl;", "scope", C4424m2.f43617p, "insertIfMissing", "(Ljava/util/List;ILandroidx/compose/runtime/RecomposeScopeImpl;Ljava/lang/Object;)V", "start", "end", "firstInRange", "(Ljava/util/List;II)Landroidx/compose/runtime/Invalidation;", "removeLocation", "(Ljava/util/List;I)Landroidx/compose/runtime/Invalidation;", "removeRange", "(Ljava/util/List;II)V", "filterToRange", "(Ljava/util/List;II)Ljava/util/List;", "asInt", "(Z)I", "asBool", "(I)Z", "Landroidx/compose/runtime/SlotTable;", "Landroidx/compose/runtime/Anchor;", "anchor", "", "collectNodesFrom", "(Landroidx/compose/runtime/SlotTable;Landroidx/compose/runtime/Anchor;)Ljava/util/List;", "Landroidx/compose/runtime/SlotReader;", FirebaseAnalytics.Param.INDEX, "root", "distanceFrom", "(Landroidx/compose/runtime/SlotReader;II)I", "a", "b", "common", "nearestCommonRootOf", "(Landroidx/compose/runtime/SlotReader;III)I", "lazyMessage", "runtimeCheck", "(ZLkotlin/jvm/functions/Function0;)V", "(Z)V", PglCryptUtils.KEY_MESSAGE, "", "composeRuntimeError", "(Ljava/lang/String;)Ljava/lang/Void;", "Landroidx/compose/runtime/CompositionTracer;", "compositionTracer", "Landroidx/compose/runtime/CompositionTracer;", "getCompositionTracer$annotations", "Lkotlin/Function3;", "Landroidx/compose/runtime/Applier;", "Landroidx/compose/runtime/Change;", "removeCurrentGroupInstance", "Lkotlin/jvm/functions/Function3;", "skipToGroupEndInstance", "endGroupInstance", "startRootGroup", "resetSlotsInstance", "rootKey", "I", "nodeKey", "defaultsKey", "invocationKey", "getInvocationKey$annotations", "invocation", "Ljava/lang/Object;", "getInvocation", "()Ljava/lang/Object;", "getInvocation$annotations", "providerKey", "getProviderKey$annotations", IronSourceConstants.EVENTS_PROVIDER, "getProvider", "getProvider$annotations", "compositionLocalMapKey", "getCompositionLocalMapKey$annotations", "compositionLocalMap", "getCompositionLocalMap", "getCompositionLocalMap$annotations", "providerValuesKey", "getProviderValuesKey$annotations", "providerValues", "getProviderValues", "getProviderValues$annotations", "providerMapsKey", "getProviderMapsKey$annotations", "providerMaps", "getProviderMaps", "getProviderMaps$annotations", "referenceKey", "getReferenceKey$annotations", TypedValues.Custom.S_REFERENCE, "getReference", "getReference$annotations", "reuseKey", "getReuseKey$annotations", "invalidGroupLocation", "Landroidx/compose/runtime/KeyInfo;", "getJoinedKey", "(Landroidx/compose/runtime/KeyInfo;)Ljava/lang/Object;", "joinedKey", "Change", "CompositionLocalMap", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ComposerKt {
    public static final int compositionLocalMapKey = 202;

    @Nullable
    private static CompositionTracer compositionTracer = null;
    private static final int defaultsKey = -127;
    private static final int invalidGroupLocation = -2;
    public static final int invocationKey = 200;
    private static final int nodeKey = 125;
    public static final int providerKey = 201;
    public static final int providerMapsKey = 204;
    public static final int providerValuesKey = 203;
    public static final int referenceKey = 206;
    public static final int reuseKey = 207;
    private static final int rootKey = 100;

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> removeCurrentGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$removeCurrentGroupInstance$1
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
            ComposerKt.removeCurrentGroup(slots, rememberManager);
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> skipToGroupEndInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$skipToGroupEndInstance$1
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
            slots.skipToGroupEnd();
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> endGroupInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$endGroupInstance$1
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
            slots.endGroup();
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> startRootGroup = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$startRootGroup$1
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
            slots.ensureStarted(0);
        }
    };

    @NotNull
    private static final Function3<Applier<?>, SlotWriter, RememberManager, Unit> resetSlotsInstance = new Function3<Applier<?>, SlotWriter, RememberManager, Unit>() { // from class: androidx.compose.runtime.ComposerKt$resetSlotsInstance$1
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
            slots.reset();
        }
    };

    @NotNull
    private static final Object invocation = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);

    @NotNull
    private static final Object provider = new OpaqueKey(IronSourceConstants.EVENTS_PROVIDER);

    @NotNull
    private static final Object compositionLocalMap = new OpaqueKey("compositionLocalMap");

    @NotNull
    private static final Object providerValues = new OpaqueKey("providerValues");

    @NotNull
    private static final Object providerMaps = new OpaqueKey("providers");

    @NotNull
    private static final Object reference = new OpaqueKey(TypedValues.Custom.S_REFERENCE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean asBool(int i10) {
        return i10 != 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int asInt(boolean z10) {
        return z10 ? 1 : 0;
    }

    @ComposeCompilerApi
    public static final <T> T cache(@NotNull Composer composer, boolean z10, @NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(composer, "<this>");
        Intrinsics.checkNotNullParameter(block, "block");
        T t10 = (T) composer.rememberedValue();
        if (!z10 && t10 != Composer.INSTANCE.getEmpty()) {
            return t10;
        }
        T tInvoke = block.invoke();
        composer.updateRememberedValue(tInvoke);
        return tInvoke;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Object> collectNodesFrom(SlotTable slotTable, Anchor anchor) {
        ArrayList arrayList = new ArrayList();
        SlotReader slotReaderOpenReader = slotTable.openReader();
        try {
            collectNodesFrom$lambda$10$collectFromGroup(slotReaderOpenReader, arrayList, slotTable.anchorIndex(anchor));
            Unit unit = Unit.f93236a;
            return arrayList;
        } finally {
            slotReaderOpenReader.close();
        }
    }

    private static final void collectNodesFrom$lambda$10$collectFromGroup(SlotReader slotReader, List<Object> list, int i10) {
        if (slotReader.isNode(i10)) {
            list.add(slotReader.node(i10));
            return;
        }
        int iGroupSize = i10 + 1;
        int iGroupSize2 = i10 + slotReader.groupSize(i10);
        while (iGroupSize < iGroupSize2) {
            collectNodesFrom$lambda$10$collectFromGroup(slotReader, list, iGroupSize);
            iGroupSize += slotReader.groupSize(iGroupSize);
        }
    }

    @NotNull
    public static final Void composeRuntimeError(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        throw new ComposeRuntimeError("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + message + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> compositionLocalMapOf(ProvidedValue<?>[] providedValueArr, PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, Composer composer, int i10) {
        composer.startReplaceableGroup(721128344);
        if (isTraceInProgress()) {
            traceEventStart(721128344, i10, -1, "androidx.compose.runtime.compositionLocalMapOf (Composer.kt:319)");
        }
        PersistentMap.Builder builder = ExtensionsKt.persistentHashMapOf().builder();
        for (ProvidedValue<?> providedValue : providedValueArr) {
            composer.startReplaceableGroup(680853375);
            if (providedValue.getCanOverride() || !contains(persistentMap, providedValue.getCompositionLocal())) {
                CompositionLocal<?> compositionLocal = providedValue.getCompositionLocal();
                Intrinsics.checkNotNull(compositionLocal, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
                builder.put(compositionLocal, providedValue.getCompositionLocal().provided$runtime_release(providedValue.getValue(), composer, 8));
            }
            composer.endReplaceableGroup();
        }
        PersistentMap<CompositionLocal<Object>, State<Object>> persistentMapBuild = builder.build();
        if (isTraceInProgress()) {
            traceEventEnd();
        }
        composer.endReplaceableGroup();
        return persistentMapBuild;
    }

    public static final <T> boolean contains(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        return persistentMap.containsKey(key);
    }

    private static final int distanceFrom(SlotReader slotReader, int i10, int i11) {
        int i12 = 0;
        while (i10 > 0 && i10 != i11) {
            i10 = slotReader.parent(i10);
            i12++;
        }
        return i12;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<Invalidation> filterToRange(List<Invalidation> list, int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        for (int iFindInsertLocation = findInsertLocation(list, i10); iFindInsertLocation < list.size(); iFindInsertLocation++) {
            Invalidation invalidation = list.get(iFindInsertLocation);
            if (invalidation.getLocation() >= i11) {
                break;
            }
            arrayList.add(invalidation);
        }
        return arrayList;
    }

    private static final int findInsertLocation(List<Invalidation> list, int i10) {
        int iFindLocation = findLocation(list, i10);
        return iFindLocation < 0 ? -(iFindLocation + 1) : iFindLocation;
    }

    private static final int findLocation(List<Invalidation> list, int i10) {
        int size = list.size() - 1;
        int i11 = 0;
        while (i11 <= size) {
            int i12 = (i11 + size) >>> 1;
            int iCompare = Intrinsics.compare(list.get(i12).getLocation(), i10);
            if (iCompare < 0) {
                i11 = i12 + 1;
            } else {
                if (iCompare <= 0) {
                    return i12;
                }
                size = i12 - 1;
            }
        }
        return -(i11 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation firstInRange(List<Invalidation> list, int i10, int i11) {
        int iFindInsertLocation = findInsertLocation(list, i10);
        if (iFindInsertLocation >= list.size()) {
            return null;
        }
        Invalidation invalidation = list.get(iFindInsertLocation);
        if (invalidation.getLocation() < i11) {
            return invalidation;
        }
        return null;
    }

    @NotNull
    public static final Object getCompositionLocalMap() {
        return compositionLocalMap;
    }

    public static /* synthetic */ void getCompositionLocalMap$annotations() {
    }

    public static /* synthetic */ void getCompositionLocalMapKey$annotations() {
    }

    private static /* synthetic */ void getCompositionTracer$annotations() {
    }

    @NotNull
    public static final Object getInvocation() {
        return invocation;
    }

    public static /* synthetic */ void getInvocation$annotations() {
    }

    public static /* synthetic */ void getInvocationKey$annotations() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getJoinedKey(KeyInfo keyInfo) {
        return keyInfo.getObjectKey() != null ? new JoinedKey(Integer.valueOf(keyInfo.getKey()), keyInfo.getObjectKey()) : Integer.valueOf(keyInfo.getKey());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object getKey(Object obj, Object obj2, Object obj3) {
        JoinedKey joinedKey = obj instanceof JoinedKey ? (JoinedKey) obj : null;
        if (joinedKey == null) {
            return null;
        }
        if (Intrinsics.areEqual(joinedKey.getLeft(), obj2) && Intrinsics.areEqual(joinedKey.getRight(), obj3)) {
            return obj;
        }
        Object key = getKey(joinedKey.getLeft(), obj2, obj3);
        return key == null ? getKey(joinedKey.getRight(), obj2, obj3) : key;
    }

    @NotNull
    public static final Object getProvider() {
        return provider;
    }

    public static /* synthetic */ void getProvider$annotations() {
    }

    public static /* synthetic */ void getProviderKey$annotations() {
    }

    @NotNull
    public static final Object getProviderMaps() {
        return providerMaps;
    }

    public static /* synthetic */ void getProviderMaps$annotations() {
    }

    public static /* synthetic */ void getProviderMapsKey$annotations() {
    }

    @NotNull
    public static final Object getProviderValues() {
        return providerValues;
    }

    public static /* synthetic */ void getProviderValues$annotations() {
    }

    public static /* synthetic */ void getProviderValuesKey$annotations() {
    }

    @NotNull
    public static final Object getReference() {
        return reference;
    }

    public static /* synthetic */ void getReference$annotations() {
    }

    public static /* synthetic */ void getReferenceKey$annotations() {
    }

    public static /* synthetic */ void getReuseKey$annotations() {
    }

    public static final <T> T getValueOf(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull CompositionLocal<T> key) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(key, "key");
        State<? extends Object> state = persistentMap.get(key);
        if (state != null) {
            return (T) state.getValue();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void insertIfMissing(List<Invalidation> list, int i10, RecomposeScopeImpl recomposeScopeImpl, Object obj) {
        int iFindLocation = findLocation(list, i10);
        IdentityArraySet identityArraySet = null;
        if (iFindLocation < 0) {
            int i11 = -(iFindLocation + 1);
            if (obj != null) {
                identityArraySet = new IdentityArraySet();
                identityArraySet.add(obj);
            }
            list.add(i11, new Invalidation(recomposeScopeImpl, i10, identityArraySet));
            return;
        }
        if (obj == null) {
            list.get(iFindLocation).setInstances(null);
            return;
        }
        IdentityArraySet<Object> instances = list.get(iFindLocation).getInstances();
        if (instances != null) {
            instances.add(obj);
        }
    }

    @ComposeCompilerApi
    public static final boolean isTraceInProgress() {
        CompositionTracer compositionTracer2 = compositionTracer;
        return compositionTracer2 != null && compositionTracer2.isTraceInProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> HashMap<K, LinkedHashSet<V>> multiMap() {
        return new HashMap<>();
    }

    @NotNull
    public static final PersistentMap<CompositionLocal<Object>, State<Object>> mutate(@NotNull PersistentMap<CompositionLocal<Object>, ? extends State<? extends Object>> persistentMap, @NotNull Function1<? super Map<CompositionLocal<Object>, State<Object>>, Unit> mutator) {
        Intrinsics.checkNotNullParameter(persistentMap, "<this>");
        Intrinsics.checkNotNullParameter(mutator, "mutator");
        PersistentMap.Builder<CompositionLocal<Object>, ? extends State<? extends Object>> builder = persistentMap.builder();
        mutator.invoke(builder);
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int nearestCommonRootOf(SlotReader slotReader, int i10, int i11, int i12) {
        if (i10 != i11) {
            if (i10 == i12 || i11 == i12) {
                return i12;
            }
            if (slotReader.parent(i10) == i11) {
                return i11;
            }
            if (slotReader.parent(i11) != i10) {
                if (slotReader.parent(i10) == slotReader.parent(i11)) {
                    return slotReader.parent(i10);
                }
                int iDistanceFrom = distanceFrom(slotReader, i10, i12);
                int iDistanceFrom2 = distanceFrom(slotReader, i11, i12);
                int i13 = iDistanceFrom - iDistanceFrom2;
                for (int i14 = 0; i14 < i13; i14++) {
                    i10 = slotReader.parent(i10);
                }
                int i15 = iDistanceFrom2 - iDistanceFrom;
                for (int i16 = 0; i16 < i15; i16++) {
                    i11 = slotReader.parent(i11);
                }
                while (i10 != i11) {
                    i10 = slotReader.parent(i10);
                    i11 = slotReader.parent(i11);
                }
                return i10;
            }
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> V pop(HashMap<K, LinkedHashSet<V>> map, K k10) {
        V v10;
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null || (v10 = (V) CollectionsKt.firstOrNull(linkedHashSet)) == null) {
            return null;
        }
        remove(map, k10, v10);
        return v10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <K, V> boolean put(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            linkedHashSet = new LinkedHashSet<>();
            map.put(k10, linkedHashSet);
        }
        return linkedHashSet.add(v10);
    }

    private static final <K, V> Unit remove(HashMap<K, LinkedHashSet<V>> map, K k10, V v10) {
        LinkedHashSet<V> linkedHashSet = map.get(k10);
        if (linkedHashSet == null) {
            return null;
        }
        linkedHashSet.remove(v10);
        if (linkedHashSet.isEmpty()) {
            map.remove(k10);
        }
        return Unit.f93236a;
    }

    public static final void removeCurrentGroup(@NotNull SlotWriter slotWriter, @NotNull RememberManager rememberManager) {
        RecomposeScopeImpl recomposeScopeImpl;
        CompositionImpl composition;
        Intrinsics.checkNotNullParameter(slotWriter, "<this>");
        Intrinsics.checkNotNullParameter(rememberManager, "rememberManager");
        Iterator<Object> itGroupSlots = slotWriter.groupSlots();
        while (itGroupSlots.hasNext()) {
            Object next = itGroupSlots.next();
            if (next instanceof ComposeNodeLifecycleCallback) {
                rememberManager.releasing((ComposeNodeLifecycleCallback) next);
            }
            if (next instanceof RememberObserver) {
                rememberManager.forgetting((RememberObserver) next);
            }
            if ((next instanceof RecomposeScopeImpl) && (composition = (recomposeScopeImpl = (RecomposeScopeImpl) next).getComposition()) != null) {
                composition.setPendingInvalidScopes$runtime_release(true);
                recomposeScopeImpl.release();
            }
        }
        slotWriter.removeGroup();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Invalidation removeLocation(List<Invalidation> list, int i10) {
        int iFindLocation = findLocation(list, i10);
        if (iFindLocation >= 0) {
            return list.remove(iFindLocation);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void removeRange(List<Invalidation> list, int i10, int i11) {
        int iFindInsertLocation = findInsertLocation(list, i10);
        while (iFindInsertLocation < list.size() && list.get(iFindInsertLocation).getLocation() < i11) {
            list.remove(iFindInsertLocation);
        }
    }

    public static final void runtimeCheck(boolean z10, @NotNull Function0<? extends Object> lazyMessage) {
        Intrinsics.checkNotNullParameter(lazyMessage, "lazyMessage");
        if (z10) {
            return;
        }
        composeRuntimeError(lazyMessage.invoke().toString());
        throw new g();
    }

    @ComposeCompilerApi
    public static final void sourceInformation(@NotNull Composer composer, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformation(sourceInformation);
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerEnd(@NotNull Composer composer) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        composer.sourceInformationMarkerEnd();
    }

    @ComposeCompilerApi
    public static final void sourceInformationMarkerStart(@NotNull Composer composer, int i10, @NotNull String sourceInformation) {
        Intrinsics.checkNotNullParameter(composer, "composer");
        Intrinsics.checkNotNullParameter(sourceInformation, "sourceInformation");
        composer.sourceInformationMarkerStart(i10, sourceInformation);
    }

    @ComposeCompilerApi
    public static final void traceEventEnd() {
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventEnd();
        }
    }

    @ComposeCompilerApi
    public static final /* synthetic */ void traceEventStart(int i10, String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        traceEventStart(i10, -1, -1, info);
    }

    @ComposeCompilerApi
    public static final void traceEventStart(int i10, int i11, int i12, @NotNull String info) {
        Intrinsics.checkNotNullParameter(info, "info");
        CompositionTracer compositionTracer2 = compositionTracer;
        if (compositionTracer2 != null) {
            compositionTracer2.traceEventStart(i10, i11, i12, info);
        }
    }

    public static final void runtimeCheck(boolean z10) {
        if (z10) {
            return;
        }
        composeRuntimeError("Check failed");
        throw new g();
    }
}
