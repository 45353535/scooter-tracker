package com.yandex.div.core.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewGroupKt;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KAssert;
import com.yandex.div.internal.widget.DivLayoutParams;
import com.yandex.div.internal.widget.DivViewGroup;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v0;
import kotlin.properties.e;
import kotlin.ranges.d;
import kotlin.ranges.g;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import zf.a;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0007\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0017\b\u0010\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0014¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b \u0010!J7\u0010'\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u00072\u0006\u0010$\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u00072\u0006\u0010&\u001a\u00020\u0007H\u0014¢\u0006\u0004\b'\u0010(J\u000f\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00072\u0006\u0010,\u001a\u00020\u0007H\u0002¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b/\u0010\u001bJ\u0017\u00100\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b0\u0010\u001bJ\u001f\u00101\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b1\u00102J!\u00103\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\u00152\u0006\u00107\u001a\u00020\u0007H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\u00072\u0006\u0010:\u001a\u00020\u0007H\u0002¢\u0006\u0004\b;\u0010.J\u001f\u0010<\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b<\u0010!J'\u0010?\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bA\u0010BJ7\u0010E\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010C\u001a\u00020\u00152\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010FJ/\u0010G\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010HJ/\u0010I\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bI\u0010HJ\u001f\u0010J\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bJ\u0010!J\u001f\u0010K\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bK\u0010LJ/\u0010P\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010M\u001a\u00020\u00072\u0006\u0010N\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u0007H\u0002¢\u0006\u0004\bP\u0010\u0011J\u001f\u0010S\u001a\u00020\u00152\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\bS\u0010TJ'\u0010U\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bU\u0010VJ/\u0010Y\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0004\bY\u0010ZJ/\u0010[\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010O\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\b[\u0010\u0011J\u001f\u0010\\\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u00072\u0006\u0010R\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010^\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b^\u0010!J'\u0010_\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b_\u0010@J\u001f\u0010`\u001a\u00020\u00152\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b`\u0010BJ\u001f\u0010c\u001a\u00020\u00152\u0006\u0010a\u001a\u00020\u00072\u0006\u0010b\u001a\u00020\u0007H\u0002¢\u0006\u0004\bc\u0010TJ'\u0010d\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bd\u0010@J'\u0010e\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\be\u0010@J\u001f\u0010f\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\bf\u0010LJ\u0017\u0010h\u001a\u00020\u00072\u0006\u0010g\u001a\u00020\u0007H\u0002¢\u0006\u0004\bh\u0010.J'\u0010j\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010i\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bj\u0010VJ'\u0010k\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bk\u0010VJ'\u0010l\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010Q\u001a\u00020\u0007H\u0002¢\u0006\u0004\bl\u0010VJ'\u0010n\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010m\u001a\u00020\u0015H\u0002¢\u0006\u0004\bn\u0010oJ\u001f\u0010p\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002¢\u0006\u0004\bp\u0010LJ'\u0010r\u001a\u00020\u00072\u0006\u0010>\u001a\u00020=2\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u0007H\u0002¢\u0006\u0004\br\u0010sJ\u001f\u0010u\u001a\u00020\u000f2\u0006\u0010g\u001a\u00020\u00072\u0006\u0010t\u001a\u00020\u0007H\u0002¢\u0006\u0004\bu\u0010!J\u001f\u0010x\u001a\u00020\u00072\u0006\u0010v\u001a\u00020\u00072\u0006\u0010w\u001a\u00020\u0007H\u0002¢\u0006\u0004\bx\u0010]J\u0017\u0010y\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\by\u0010zJ/\u0010{\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b{\u0010\u0011J/\u0010|\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b|\u0010\u0011J7\u0010}\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020=2\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010q\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002¢\u0006\u0004\b}\u0010~J$\u0010\u0082\u0001\u001a\u00020\u007f2\u0007\u0010\u0080\u0001\u001a\u00020\u007f2\u0007\u0010\u0081\u0001\u001a\u00020\u0007H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\u0084\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0019\u0010\u0086\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0085\u0001R9\u0010\u008e\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00078F@FX\u0086\u008e\u0002¢\u0006\u001e\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\b\u008a\u0001\u0010\u001d\"\u0005\b\u008b\u0001\u0010\u0014R\u0019\u0010\u008f\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0085\u0001R\u0019\u0010\u0090\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0085\u0001R\u0019\u0010\u0091\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0085\u0001R\u0019\u0010\u0092\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0085\u0001R3\u0010\u0098\u0001\u001a\u00020\u007f2\u0007\u0010\u0087\u0001\u001a\u00020\u007f8V@VX\u0096\u008e\u0002¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010\u0089\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u0099\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u0085\u0001R\u0019\u0010\u009a\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010\u0085\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u0085\u0001R\u0019\u0010\u009c\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009c\u0001\u0010\u0085\u0001R\u0019\u0010\u009d\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u0085\u0001R\u0019\u0010\u009e\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u0085\u0001R\u0019\u0010\u009f\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009f\u0001\u0010\u0085\u0001R\u001c\u0010¡\u0001\u001a\u00070 \u0001R\u00020\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¡\u0001\u0010¢\u0001R\u0019\u0010£\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010\u0085\u0001R\u0019\u0010¤\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0001\u0010\u0085\u0001R8\u0010§\u0001\u001a\u0005\u0018\u00010¥\u00012\n\u0010¦\u0001\u001a\u0005\u0018\u00010¥\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0006\b©\u0001\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R9\u0010±\u0001\u001a\u00020\u00072\u0007\u0010\u0087\u0001\u001a\u00020\u00078F@FX\u0087\u008e\u0002¢\u0006\u001e\n\u0006\b\u00ad\u0001\u0010\u0089\u0001\u0012\u0006\b°\u0001\u0010\u008d\u0001\u001a\u0005\b®\u0001\u0010\u001d\"\u0005\b¯\u0001\u0010\u0014R\u001e\u0010³\u0001\u001a\t\u0012\u0004\u0012\u00020=0²\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b³\u0001\u0010´\u0001R\u001e\u0010¶\u0001\u001a\t\u0012\u0004\u0012\u00020=0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u0019\u0010¸\u0001\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¸\u0001\u0010\u0085\u0001R\u001e\u0010¹\u0001\u001a\t\u0012\u0004\u0012\u00020=0µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¹\u0001\u0010·\u0001R\u0019\u0010º\u0001\u001a\u00020\u007f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bº\u0001\u0010»\u0001R\u0016\u0010½\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¼\u0001\u0010\u001dR\u0016\u0010¿\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¾\u0001\u0010\u001dR\u001b\u0010Â\u0001\u001a\u00020\u0007*\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u001a\u0010W\u001a\u00020\u0007*\u00020=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010Á\u0001R\u0016\u0010Å\u0001\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÄ\u0001\u0010\u001dR\u0016\u0010Æ\u0001\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010\u0017R\u001b\u0010É\u0001\u001a\u00020\u007f*\u00020)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010È\u0001R\u001b\u0010Ë\u0001\u001a\u00020\u007f*\u00020)8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010È\u0001¨\u0006Ì\u0001"}, d2 = {"Lcom/yandex/div/core/widget/LinearContainerLayout;", "Lcom/yandex/div/internal/widget/DivViewGroup;", "Lcom/yandex/div/core/widget/AspectView;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "left", "top", "right", "bottom", "", "setDividerMargins", "(IIII)V", "px", "setItemSpacing", "(I)V", "", "shouldDelayChildPressedState", "()Z", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "getBaseline", "()I", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", CmcdData.Factory.STREAM_TYPE_LIVE, ApsMetricsDataMap.APSMETRICS_FIELD_TIMESTAMP, "r", "b", "onLayout", "(ZIIII)V", "Lcom/yandex/div/internal/widget/DivLayoutParams;", "generateDefaultLayoutParams", "()Lcom/yandex/div/internal/widget/DivLayoutParams;", CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "gapBeforeChild", "(I)I", "drawDividersVertical", "drawDividersHorizontal", "drawHorizontalDivider", "(Landroid/graphics/Canvas;I)V", "drawVerticalDivider", "(Landroid/graphics/Canvas;I)Lkotlin/Unit;", "drawDivider", "(Landroid/graphics/Canvas;IIII)Lkotlin/Unit;", "childIndex", "hasDividerBeforeChildAt", "(I)Z", FirebaseAnalytics.Param.INDEX, "getDividerOffsetBeforeChildAt", "measureVertical", "Landroid/view/View;", "child", "measureChildWithSignificantSizeVertical", "(Landroid/view/View;II)V", "hasSignificantHeight", "(Landroid/view/View;I)Z", "considerWidth", "considerHeight", "measureVerticalFirstTime", "(Landroid/view/View;IIZZ)V", "measureConstrainedHeightChildFirstTime", "(Landroid/view/View;IIZ)V", "measureMatchParentHeightChildFirstTime", "considerMatchParentChildrenInMaxWidth", "measureMatchParentWidthChild", "(Landroid/view/View;I)V", "heightSize", "heightSpec", "initialMaxWidth", "remeasureChildrenVerticalIfNeeded", "delta", "spec", "needRemeasureChildren", "(II)Z", "remeasureConstrainedHeightChildren", "(III)V", "maxWidth", "height", "remeasureChildVertical", "(Landroid/view/View;III)V", "remeasureMatchParentHeightChildren", "getFreeSpace", "(II)I", "measureHorizontal", "measureChildWithSignificantSizeHorizontal", "hasSignificantWidth", TypedValues.Custom.S_DIMENSION, "parentMeasureSpec", "hasSignificantDimension", "measureConstrainedWidthChildFirstTime", "measureMatchParentWidthChildFirstTime", "considerMatchParentChildMarginsInWidth", "measureSpec", "getWidthSizeAndState", "widthSize", "remeasureChildrenHorizontalIfNeeded", "remeasureConstrainedWidthChildren", "remeasureMatchParentWidthChildren", "measureChild", "considerMatchParentChildInMaxHeight", "(Landroid/view/View;IZ)V", "remeasureDynamicHeightChild", "width", "remeasureChildHorizontal", "(Landroid/view/View;II)I", "childSize", "updateMaxCrossSize", "current", "additional", "getMaxLength", "updateBaselineOffset", "(Landroid/view/View;)V", "layoutVertical", "layoutHorizontal", "setChildFrame", "(Landroid/view/View;IIII)V", "", "weight", "size", "getFixedWeight", "(FI)F", "maxBaselineAscent", "I", "maxBaselineDescent", "<set-?>", "orientation$delegate", "Lkotlin/properties/e;", "getOrientation", "setOrientation", "getOrientation$annotations", "()V", "orientation", "totalLength", "totalConstrainedLength", "totalMatchParentLength", "childMeasuredState", "aspectRatio$delegate", "getAspectRatio", "()F", "setAspectRatio", "(F)V", "aspectRatio", "dividerWidth", "dividerHeight", "dividerMarginTop", "dividerMarginBottom", "dividerMarginLeft", "dividerMarginRight", "itemSpacingPx", "Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "offsetsHolder", "Lcom/yandex/div/internal/widget/DivViewGroup$OffsetsHolder;", "firstVisibleChildIndex", "lastVisibleChildIndex", "Landroid/graphics/drawable/Drawable;", "value", "dividerDrawable", "Landroid/graphics/drawable/Drawable;", "getDividerDrawable", "()Landroid/graphics/drawable/Drawable;", "setDividerDrawable", "(Landroid/graphics/drawable/Drawable;)V", "showDividers$delegate", "getShowDividers", "setShowDividers", "getShowDividers$annotations", "showDividers", "", "constrainedChildren", "Ljava/util/List;", "", "skippedMatchParentChildren", "Ljava/util/Set;", "maxCrossSize", "crossMatchParentChildren", "totalWeight", "F", "getDividerHeightWithMargins", "dividerHeightWithMargins", "getDividerWidthWithMargins", "dividerWidthWithMargins", "getMaxHeight", "(Landroid/view/View;)I", "maxHeight", "getMaxWidth", "getVisibleChildCount", "visibleChildCount", "isVertical", "getFixedHorizontalWeight", "(Lcom/yandex/div/internal/widget/DivLayoutParams;)F", "fixedHorizontalWeight", "getFixedVerticalWeight", "fixedVerticalWeight", "div_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class LinearContainerLayout extends DivViewGroup implements AspectView {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {v0.f(new g0(LinearContainerLayout.class, "orientation", "getOrientation()I", 0)), v0.f(new g0(LinearContainerLayout.class, "aspectRatio", "getAspectRatio()F", 0)), v0.f(new g0(LinearContainerLayout.class, "showDividers", "getShowDividers()I", 0))};

    /* JADX INFO: renamed from: aspectRatio$delegate, reason: from kotlin metadata */
    @NotNull
    private final e aspectRatio;
    private int childMeasuredState;

    @NotNull
    private final List<View> constrainedChildren;

    @NotNull
    private final Set<View> crossMatchParentChildren;

    @Nullable
    private Drawable dividerDrawable;
    private int dividerHeight;
    private int dividerMarginBottom;
    private int dividerMarginLeft;
    private int dividerMarginRight;
    private int dividerMarginTop;
    private int dividerWidth;
    private int firstVisibleChildIndex;
    private int itemSpacingPx;
    private int lastVisibleChildIndex;
    private int maxBaselineAscent;
    private int maxBaselineDescent;
    private int maxCrossSize;

    @NotNull
    private final DivViewGroup.OffsetsHolder offsetsHolder;

    /* JADX INFO: renamed from: orientation$delegate, reason: from kotlin metadata */
    @NotNull
    private final e orientation;

    /* JADX INFO: renamed from: showDividers$delegate, reason: from kotlin metadata */
    @NotNull
    private final e showDividers;

    @NotNull
    private final Set<View> skippedMatchParentChildren;
    private int totalConstrainedLength;
    private int totalLength;
    private int totalMatchParentLength;
    private float totalWeight;

    public LinearContainerLayout(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        this.orientation = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.aspectRatio = AspectView.INSTANCE.aspectRatioProperty$div_release();
        this.offsetsHolder = new DivViewGroup.OffsetsHolder(this, 0.0f, 0.0f, 0, 7, null);
        this.firstVisibleChildIndex = -1;
        this.lastVisibleChildIndex = -1;
        this.showDividers = ViewsKt.dimensionAffecting$default(0, null, 2, null);
        this.constrainedChildren = new ArrayList();
        this.skippedMatchParentChildren = new LinkedHashSet();
        this.crossMatchParentChildren = new LinkedHashSet();
    }

    private final void considerMatchParentChildInMaxHeight(View child, int heightMeasureSpec, boolean measureChild) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (((ViewGroup.MarginLayoutParams) divLayoutParams).height != -1) {
            return;
        }
        if (measureChild) {
            this.maxCrossSize = Math.max(this.maxCrossSize, child.getMinimumHeight() + divLayoutParams.getVerticalMargins$div_release());
        } else {
            remeasureChildHorizontal(child, heightMeasureSpec, child.getMeasuredWidth());
            updateMaxCrossSize(heightMeasureSpec, child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final void considerMatchParentChildMarginsInWidth(View child, int widthMeasureSpec) {
        if (hasSignificantWidth(child, widthMeasureSpec)) {
            return;
        }
        int i10 = this.totalLength;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        this.totalLength = getMaxLength(i10, ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
    }

    private final void considerMatchParentChildrenInMaxWidth(int widthMeasureSpec, int heightMeasureSpec) {
        if (!ViewsKt.isExact(widthMeasureSpec)) {
            if (this.maxCrossSize != 0) {
                for (View view : this.crossMatchParentChildren) {
                    int i10 = this.maxCrossSize;
                    int minimumWidth = view.getMinimumWidth();
                    ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    this.maxCrossSize = Math.max(i10, minimumWidth + ((DivLayoutParams) layoutParams).getHorizontalMargins$div_release());
                }
            } else {
                for (View view2 : this.crossMatchParentChildren) {
                    int i11 = widthMeasureSpec;
                    measureVerticalFirstTime(view2, i11, heightMeasureSpec, true, false);
                    this.skippedMatchParentChildren.remove(view2);
                    widthMeasureSpec = i11;
                }
            }
        }
    }

    private final Unit drawDivider(Canvas canvas, int left, int top, int right, int bottom) {
        Drawable drawable = this.dividerDrawable;
        if (drawable == null) {
            return null;
        }
        float f10 = (left + right) / 2.0f;
        float f11 = (top + bottom) / 2.0f;
        float f12 = this.dividerWidth / 2.0f;
        float f13 = this.dividerHeight / 2.0f;
        drawable.setBounds(Math.max((int) (f10 - f12), left), Math.max((int) (f11 - f13), top), Math.min((int) (f10 + f12), right), Math.min((int) (f11 + f13), bottom));
        drawable.draw(canvas);
        return Unit.f93236a;
    }

    private final void drawDividersHorizontal(Canvas canvas) {
        int paddingLeft;
        int edgeDividerOffset;
        int width;
        int edgeDividerOffset2;
        int i10;
        int i11;
        boolean zIsLayoutRtl = com.yandex.div.core.util.ViewsKt.isLayoutRtl(this);
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i12)) {
                int dividerOffsetBeforeChildAt = getDividerOffsetBeforeChildAt(i12);
                if (zIsLayoutRtl) {
                    int right = childAt.getRight();
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i11 = right + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).rightMargin + this.dividerMarginLeft + dividerOffsetBeforeChildAt;
                } else {
                    int left = childAt.getLeft();
                    ViewGroup.LayoutParams layoutParams2 = childAt.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    i11 = (((left - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).leftMargin) - this.dividerWidth) - this.dividerMarginRight) - dividerOffsetBeforeChildAt;
                }
                drawVerticalDivider(canvas, i11);
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null || !zIsLayoutRtl) {
                if (childAt2 == null) {
                    width = ((getWidth() - getPaddingRight()) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else if (zIsLayoutRtl) {
                    int left2 = childAt2.getLeft();
                    ViewGroup.LayoutParams layoutParams3 = childAt2.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams3, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    width = ((left2 - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams3)).leftMargin) - this.dividerWidth) - this.dividerMarginRight;
                    edgeDividerOffset2 = this.offsetsHolder.getEdgeDividerOffset();
                } else {
                    int right2 = childAt2.getRight();
                    ViewGroup.LayoutParams layoutParams4 = childAt2.getLayoutParams();
                    Intrinsics.checkNotNull(layoutParams4, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                    paddingLeft = right2 + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams4)).rightMargin + this.dividerMarginLeft;
                    edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
                }
                i10 = width - edgeDividerOffset2;
                drawVerticalDivider(canvas, i10);
            }
            paddingLeft = getPaddingLeft() + this.dividerMarginLeft;
            edgeDividerOffset = this.offsetsHolder.getEdgeDividerOffset();
            i10 = paddingLeft + edgeDividerOffset;
            drawVerticalDivider(canvas, i10);
        }
    }

    private final void drawDividersVertical(Canvas canvas) {
        int height;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8 && hasDividerBeforeChildAt(i10)) {
                int top = childAt.getTop();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                drawHorizontalDivider(canvas, (((top - ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin) - this.dividerHeight) - this.dividerMarginBottom) - getDividerOffsetBeforeChildAt(i10));
            }
        }
        if (hasDividerBeforeChildAt(getChildCount())) {
            View childAt2 = getChildAt(getChildCount() - 1);
            if (childAt2 != null) {
                int bottom = childAt2.getBottom();
                ViewGroup.LayoutParams layoutParams2 = childAt2.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                height = bottom + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams2)).bottomMargin + this.dividerMarginTop + this.offsetsHolder.getEdgeDividerOffset();
            } else {
                height = (((getHeight() - getPaddingBottom()) - this.dividerHeight) - this.dividerMarginBottom) - this.offsetsHolder.getEdgeDividerOffset();
            }
            drawHorizontalDivider(canvas, height);
        }
    }

    private final void drawHorizontalDivider(Canvas canvas, int top) {
        drawDivider(canvas, getPaddingLeft() + this.dividerMarginLeft, top, (getWidth() - getPaddingRight()) - this.dividerMarginRight, top + this.dividerHeight);
    }

    private final Unit drawVerticalDivider(Canvas canvas, int left) {
        return drawDivider(canvas, left, getPaddingTop() + this.dividerMarginTop, left + this.dividerWidth, (getHeight() - getPaddingBottom()) - this.dividerMarginBottom);
    }

    private final int gapBeforeChild(int i10) {
        int dividerHeightWithMargins = isVertical() ? getDividerHeightWithMargins() : getDividerWidthWithMargins();
        if (hasDividerBeforeChildAt(i10)) {
            return dividerHeightWithMargins;
        }
        if (i10 == this.firstVisibleChildIndex) {
            return 0;
        }
        return this.itemSpacingPx;
    }

    private final int getDividerHeightWithMargins() {
        return this.dividerHeight + this.dividerMarginTop + this.dividerMarginBottom;
    }

    private final int getDividerOffsetBeforeChildAt(int index) {
        return index == this.firstVisibleChildIndex ? this.offsetsHolder.getEdgeDividerOffset() : (int) (this.offsetsHolder.getSpaceBetweenChildren() / 2);
    }

    private final int getDividerWidthWithMargins() {
        return this.dividerWidth + this.dividerMarginRight + this.dividerMarginLeft;
    }

    private final float getFixedHorizontalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getHorizontalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width);
    }

    private final float getFixedVerticalWeight(DivLayoutParams divLayoutParams) {
        return getFixedWeight(divLayoutParams.getVerticalWeight(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height);
    }

    private final float getFixedWeight(float weight, int size) {
        return weight > 0.0f ? weight : size == -1 ? 1.0f : 0.0f;
    }

    private final int getFreeSpace(int delta, int spec) {
        int i10;
        return (delta >= 0 || (i10 = this.totalMatchParentLength) <= 0) ? (delta < 0 || !ViewsKt.isExact(spec)) ? delta : delta + this.totalMatchParentLength : g.e(delta + i10, 0);
    }

    private final int getMaxHeight(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxHeight();
    }

    private final int getMaxLength(int current, int additional) {
        return Math.max(current, additional + current);
    }

    private final int getMaxWidth(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return ((DivLayoutParams) layoutParams).getMaxWidth();
    }

    public static /* synthetic */ void getOrientation$annotations() {
    }

    public static /* synthetic */ void getShowDividers$annotations() {
    }

    private final int getVisibleChildCount() {
        Iterator it = ViewGroupKt.getChildren(this).iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (!(((View) it.next()).getVisibility() == 8) && (i10 = i10 + 1) < 0) {
                CollectionsKt.throwCountOverflow();
            }
        }
        return i10;
    }

    private final int getWidthSizeAndState(int measureSpec) {
        return View.resolveSizeAndState(Math.max(getSuggestedMinimumWidth(), this.totalLength), measureSpec, this.childMeasuredState);
    }

    private final boolean hasDividerBeforeChildAt(int childIndex) {
        if (childIndex == this.firstVisibleChildIndex) {
            return (getShowDividers() & 1) != 0;
        }
        if (childIndex > this.lastVisibleChildIndex) {
            return (getShowDividers() & 4) != 0;
        }
        if ((getShowDividers() & 2) != 0) {
            for (int i10 = childIndex - 1; -1 < i10; i10--) {
                if (getChildAt(childIndex).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    private final boolean hasSignificantDimension(int dimension, int parentMeasureSpec) {
        return (dimension == -1 && ViewsKt.isExact(parentMeasureSpec)) ? false : true;
    }

    private final boolean hasSignificantHeight(View child, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height, heightMeasureSpec);
    }

    private final boolean hasSignificantWidth(View child, int widthMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return hasSignificantDimension(((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).width, widthMeasureSpec);
    }

    private final boolean isVertical() {
        return getOrientation() == 1;
    }

    private final void layoutHorizontal(int left, int top, int right, int bottom) {
        int i10;
        int i11;
        int baseline;
        int verticalPaddings$div_release = (bottom - top) - getVerticalPaddings$div_release();
        int layoutDirection = getLayoutDirection();
        float f10 = (right - left) - this.totalLength;
        float paddingLeft = getPaddingLeft();
        this.offsetsHolder.update(f10, GravityCompat.getAbsoluteGravity(getHorizontalGravity$div_release(), layoutDirection), getVisibleChildCount());
        float firstChildOffset = paddingLeft + this.offsetsHolder.getFirstChildOffset();
        d indices = com.yandex.div.core.util.ViewsKt.getIndices(this, 0, getChildCount());
        int iE = indices.e();
        int iF = indices.f();
        int iG = indices.g();
        if ((iG <= 0 || iE > iF) && (iG >= 0 || iF > iE)) {
            return;
        }
        while (true) {
            View childAt = getChildAt(iE);
            if (childAt != null && childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int verticalGravity = DivViewGroup.INSTANCE.toVerticalGravity(divLayoutParams.getGravity());
                if (verticalGravity < 0) {
                    verticalGravity = getVerticalGravity$div_release();
                }
                int paddingTop = getPaddingTop();
                if (verticalGravity == 16) {
                    i10 = (((verticalPaddings$div_release - measuredHeight) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin) / 2;
                } else if (verticalGravity != 48) {
                    if (verticalGravity != 80) {
                        i10 = 0;
                    } else {
                        i11 = verticalPaddings$div_release - measuredHeight;
                        baseline = ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin;
                        i10 = i11 - baseline;
                    }
                } else if (!divLayoutParams.getIsBaselineAligned() || ((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1 || childAt.getBaseline() == -1) {
                    i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                } else {
                    i11 = this.maxBaselineAscent;
                    baseline = childAt.getBaseline();
                    i10 = i11 - baseline;
                }
                float fGapBeforeChild = firstChildOffset + gapBeforeChild(com.yandex.div.core.util.ViewsKt.isLayoutRtl(this) ? iE + 1 : iE) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin;
                setChildFrame(childAt, a.d(fGapBeforeChild), paddingTop + i10, measuredWidth, measuredHeight);
                firstChildOffset = fGapBeforeChild + measuredWidth + ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin + this.offsetsHolder.getSpaceBetweenChildren();
            }
            if (iE == iF) {
                return;
            } else {
                iE += iG;
            }
        }
    }

    private final void layoutVertical(int left, int top, int right, int bottom) {
        int horizontalPaddings$div_release = (right - left) - getHorizontalPaddings$div_release();
        float f10 = (bottom - top) - this.totalLength;
        float paddingTop = getPaddingTop();
        this.offsetsHolder.update(f10, getVerticalGravity$div_release(), getVisibleChildCount());
        float firstChildOffset = paddingTop + this.offsetsHolder.getFirstChildOffset();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                int horizontalGravity = DivViewGroup.INSTANCE.toHorizontalGravity(divLayoutParams.getGravity());
                if (horizontalGravity < 0) {
                    horizontalGravity = getHorizontalGravity$div_release();
                }
                int layoutDirection = getLayoutDirection();
                int paddingLeft = getPaddingLeft();
                int absoluteGravity = GravityCompat.getAbsoluteGravity(horizontalGravity, layoutDirection);
                int i11 = absoluteGravity != 1 ? (absoluteGravity == 3 || absoluteGravity != 5) ? ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin : (horizontalPaddings$div_release - measuredWidth) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin : (((horizontalPaddings$div_release - measuredWidth) + ((ViewGroup.MarginLayoutParams) divLayoutParams).leftMargin) - ((ViewGroup.MarginLayoutParams) divLayoutParams).rightMargin) / 2;
                float fGapBeforeChild = firstChildOffset + gapBeforeChild(i10) + ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin;
                setChildFrame(childAt, paddingLeft + i11, a.d(fGapBeforeChild), measuredWidth, measuredHeight);
                firstChildOffset = fGapBeforeChild + measuredHeight + ((ViewGroup.MarginLayoutParams) divLayoutParams).bottomMargin + this.offsetsHolder.getSpaceBetweenChildren();
            }
        }
    }

    private final void measureChildWithSignificantSizeHorizontal(View child, int widthMeasureSpec, int heightMeasureSpec) {
        LinearContainerLayout linearContainerLayout;
        View view;
        int i10;
        if (hasSignificantWidth(child, widthMeasureSpec)) {
            ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int i11 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
            if (i11 == -3) {
                linearContainerLayout = this;
                view = child;
                i10 = heightMeasureSpec;
                measureConstrainedWidthChildFirstTime(view, widthMeasureSpec, i10);
            } else if (i11 != -1) {
                linearContainerLayout = this;
                view = child;
                i10 = heightMeasureSpec;
                linearContainerLayout.measureChildWithMargins(view, widthMeasureSpec, 0, i10, 0);
            } else {
                linearContainerLayout = this;
                view = child;
                i10 = heightMeasureSpec;
                measureMatchParentWidthChildFirstTime(view, widthMeasureSpec, i10);
            }
            linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view.getMeasuredState());
            updateMaxCrossSize(i10, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            updateBaselineOffset(view);
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
    }

    private final void measureChildWithSignificantSizeVertical(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        boolean zIsExact = ViewsKt.isExact(widthMeasureSpec);
        boolean zHasSignificantHeight = hasSignificantHeight(child, heightMeasureSpec);
        if (zIsExact ? zHasSignificantHeight : ((ViewGroup.MarginLayoutParams) divLayoutParams).width != -1) {
            measureVerticalFirstTime(child, widthMeasureSpec, heightMeasureSpec, true, true);
            return;
        }
        if (!zIsExact) {
            this.crossMatchParentChildren.add(child);
        }
        if (zHasSignificantHeight) {
            return;
        }
        this.skippedMatchParentChildren.add(child);
        int i10 = this.totalLength;
        ViewGroup.LayoutParams layoutParams2 = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams2, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        this.totalLength = getMaxLength(i10, ((DivLayoutParams) layoutParams2).getVerticalMargins$div_release());
    }

    private final void measureConstrainedHeightChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerHeight) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxHeight = divLayoutParams.getMaxHeight();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        divLayoutParams.setMaxHeight(Integer.MAX_VALUE);
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -3;
        divLayoutParams.setMaxHeight(maxHeight);
        if (considerHeight) {
            this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, child.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            if (this.constrainedChildren.contains(child)) {
                return;
            }
            this.constrainedChildren.add(child);
        }
    }

    private final void measureConstrainedWidthChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int maxWidth = divLayoutParams.getMaxWidth();
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        divLayoutParams.setMaxWidth(Integer.MAX_VALUE);
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
        divLayoutParams.setMaxWidth(maxWidth);
        this.totalConstrainedLength = getMaxLength(this.totalConstrainedLength, child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        this.constrainedChildren.add(child);
    }

    private final void measureHorizontal(int widthMeasureSpec, int heightMeasureSpec) {
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        boolean zIsExact = ViewsKt.isExact(widthMeasureSpec);
        if (getAspectRatio() != 0.0f) {
            heightMeasureSpec = zIsExact ? ViewsKt.makeExactSpec(a.d(View.MeasureSpec.getSize(widthMeasureSpec) / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        int size = View.MeasureSpec.getSize(heightMeasureSpec);
        boolean zIsExact2 = ViewsKt.isExact(heightMeasureSpec);
        int iE = g.e(zIsExact2 ? size : Math.max(getSuggestedMinimumHeight(), getVerticalPaddings$div_release()), 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i10);
                float f10 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f10 + getFixedHorizontalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeHorizontal(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        int childCount2 = getChildCount();
        for (int i11 = 0; i11 < childCount2; i11++) {
            View childAt2 = getChildAt(i11);
            if (childAt2.getVisibility() != 8) {
                considerMatchParentChildMarginsInWidth(childAt2, widthMeasureSpec);
            }
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerWidthWithMargins();
        }
        this.totalLength += getHorizontalPaddings$div_release();
        int widthSizeAndState = getWidthSizeAndState(widthMeasureSpec) & ViewCompat.MEASURED_SIZE_MASK;
        if (!zIsExact && getAspectRatio() != 0.0f) {
            size = a.d(widthSizeAndState / getAspectRatio());
            heightMeasureSpec = ViewsKt.makeExactSpec(size);
        }
        remeasureChildrenHorizontalIfNeeded(widthMeasureSpec, widthSizeAndState, heightMeasureSpec);
        if (!zIsExact2 && getAspectRatio() == 0.0f) {
            int childCount3 = getChildCount();
            for (int i12 = 0; i12 < childCount3; i12++) {
                View childAt3 = getChildAt(i12);
                if (childAt3.getVisibility() != 8) {
                    considerMatchParentChildInMaxHeight(childAt3, heightMeasureSpec, this.maxCrossSize == 0);
                }
            }
            this.maxCrossSize = Math.max(iE, this.maxCrossSize + getVerticalPaddings$div_release());
            int i13 = this.maxBaselineAscent;
            if (i13 != -1) {
                updateMaxCrossSize(heightMeasureSpec, i13 + this.maxBaselineDescent);
            }
            size = View.resolveSize(this.maxCrossSize, heightMeasureSpec);
        }
        int childCount4 = getChildCount();
        for (int i14 = 0; i14 < childCount4; i14++) {
            View childAt4 = getChildAt(i14);
            if (childAt4.getVisibility() != 8) {
                remeasureDynamicHeightChild(childAt4, ViewsKt.makeExactSpec(size));
            }
        }
        setMeasuredDimension(getWidthSizeAndState(widthMeasureSpec), View.resolveSizeAndState(size, heightMeasureSpec, this.childMeasuredState << 16));
    }

    private final void measureMatchParentHeightChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerHeight) {
        if (ViewsKt.isExact(heightMeasureSpec)) {
            measureChildWithMargins(child, widthMeasureSpec, 0, ViewsKt.makeExactSpec(0), 0);
            return;
        }
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -2;
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).height = -1;
        if (considerHeight) {
            this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, child.getMeasuredHeight());
        }
    }

    private final void measureMatchParentWidthChild(View child, int heightMeasureSpec) {
        if (hasSignificantHeight(child, heightMeasureSpec)) {
            measureVerticalFirstTime(child, ViewsKt.makeExactSpec(this.maxCrossSize + getHorizontalPaddings$div_release()), heightMeasureSpec, false, true);
            this.skippedMatchParentChildren.remove(child);
        }
    }

    private final void measureMatchParentWidthChildFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -2;
        measureChildWithMargins(child, widthMeasureSpec, 0, heightMeasureSpec, 0);
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -1;
        this.totalMatchParentLength = getMaxLength(this.totalMatchParentLength, child.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
    }

    private final void measureVertical(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        boolean z10 = View.MeasureSpec.getMode(widthMeasureSpec) == 1073741824;
        if (getAspectRatio() != 0.0f) {
            heightMeasureSpec = z10 ? ViewsKt.makeExactSpec(a.d(size / getAspectRatio())) : ViewsKt.makeExactSpec(0);
        }
        if (!z10) {
            size = Math.max(getSuggestedMinimumWidth(), getHorizontalPaddings$div_release());
        }
        int iE = g.e(size, 0);
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                this.totalLength += gapBeforeChild(i10);
                float f10 = this.totalWeight;
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                this.totalWeight = f10 + getFixedVerticalWeight((DivLayoutParams) layoutParams);
                measureChildWithSignificantSizeVertical(childAt, widthMeasureSpec, heightMeasureSpec);
            }
        }
        considerMatchParentChildrenInMaxWidth(widthMeasureSpec, heightMeasureSpec);
        Iterator<T> it = this.crossMatchParentChildren.iterator();
        while (it.hasNext()) {
            measureMatchParentWidthChild((View) it.next(), heightMeasureSpec);
        }
        if (this.totalLength > 0 && hasDividerBeforeChildAt(getChildCount())) {
            this.totalLength += getDividerHeightWithMargins();
        }
        this.totalLength += getVerticalPaddings$div_release();
        this.maxCrossSize = Math.max(iE, this.maxCrossSize + getHorizontalPaddings$div_release());
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (getAspectRatio() != 0.0f && !z10) {
            size2 = a.d((View.resolveSizeAndState(this.maxCrossSize, widthMeasureSpec, this.childMeasuredState) & ViewCompat.MEASURED_SIZE_MASK) / getAspectRatio());
            heightMeasureSpec = ViewsKt.makeExactSpec(size2);
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, size2, heightMeasureSpec, iE);
        } else if (getAspectRatio() != 0.0f || ViewsKt.isExact(heightMeasureSpec)) {
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, size2, heightMeasureSpec, iE);
        } else {
            remeasureChildrenVerticalIfNeeded(widthMeasureSpec, Math.max(this.totalLength, getSuggestedMinimumHeight()), heightMeasureSpec, iE);
            size2 = Math.max(this.totalLength, getSuggestedMinimumHeight());
        }
        setMeasuredDimension(View.resolveSizeAndState(this.maxCrossSize, widthMeasureSpec, this.childMeasuredState), View.resolveSizeAndState(size2, heightMeasureSpec, this.childMeasuredState << 16));
    }

    private final void measureVerticalFirstTime(View child, int widthMeasureSpec, int heightMeasureSpec, boolean considerWidth, boolean considerHeight) {
        LinearContainerLayout linearContainerLayout;
        View view;
        int i10;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i11 = ((ViewGroup.MarginLayoutParams) divLayoutParams).height;
        if (i11 == -3) {
            linearContainerLayout = this;
            view = child;
            i10 = widthMeasureSpec;
            measureConstrainedHeightChildFirstTime(view, i10, heightMeasureSpec, considerHeight);
        } else if (i11 != -1) {
            linearContainerLayout = this;
            view = child;
            i10 = widthMeasureSpec;
            linearContainerLayout.measureChildWithMargins(view, i10, 0, heightMeasureSpec, 0);
        } else {
            linearContainerLayout = this;
            view = child;
            i10 = widthMeasureSpec;
            measureMatchParentHeightChildFirstTime(view, i10, heightMeasureSpec, considerHeight);
        }
        linearContainerLayout.childMeasuredState = View.combineMeasuredStates(linearContainerLayout.childMeasuredState, view.getMeasuredState());
        if (considerWidth) {
            updateMaxCrossSize(i10, view.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
        }
        if (considerHeight) {
            linearContainerLayout.totalLength = getMaxLength(linearContainerLayout.totalLength, view.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
        }
    }

    private final boolean needRemeasureChildren(int delta, int spec) {
        if (!this.skippedMatchParentChildren.isEmpty()) {
            return true;
        }
        if (ViewsKt.isUnspecified(spec)) {
            return false;
        }
        return delta < 0 ? this.totalConstrainedLength > 0 || this.totalWeight > 0.0f : ViewsKt.isExact(spec) && delta > 0 && this.totalWeight > 0.0f;
    }

    private final int remeasureChildHorizontal(View child, int heightMeasureSpec, int width) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        child.measure(ViewsKt.makeExactSpec(width), DivViewGroup.INSTANCE.getChildMeasureSpec(heightMeasureSpec, divLayoutParams.getVerticalMargins$div_release() + getVerticalPaddings$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).height, child.getMinimumHeight(), divLayoutParams.getMaxHeight()));
        return View.combineMeasuredStates(this.childMeasuredState, child.getMeasuredState() & ViewCompat.MEASURED_STATE_MASK);
    }

    private final void remeasureChildVertical(View child, int widthMeasureSpec, int maxWidth, int height) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        int i10 = ((ViewGroup.MarginLayoutParams) divLayoutParams).width;
        if (i10 == -1) {
            if (maxWidth == 0) {
                ((ViewGroup.MarginLayoutParams) divLayoutParams).width = -3;
            } else {
                widthMeasureSpec = ViewsKt.makeExactSpec(maxWidth);
            }
        }
        int childMeasureSpec = DivViewGroup.INSTANCE.getChildMeasureSpec(widthMeasureSpec, getHorizontalPaddings$div_release() + divLayoutParams.getHorizontalMargins$div_release(), ((ViewGroup.MarginLayoutParams) divLayoutParams).width, child.getMinimumWidth(), divLayoutParams.getMaxWidth());
        ((ViewGroup.MarginLayoutParams) divLayoutParams).width = i10;
        child.measure(childMeasureSpec, ViewsKt.makeExactSpec(height));
        this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, child.getMeasuredState() & (-256));
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void remeasureChildrenHorizontalIfNeeded(int r4, int r5, int r6) {
        /*
            r3 = this;
            int r0 = r3.totalLength
            int r5 = r5 - r0
            java.util.List<android.view.View> r0 = r3.constrainedChildren
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L15
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            goto L2f
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            int r1 = r3.getMaxWidth(r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L19
            goto L35
        L2f:
            boolean r0 = r3.needRemeasureChildren(r5, r4)
            if (r0 == 0) goto L47
        L35:
            r0 = 0
            r3.totalLength = r0
            r3.remeasureConstrainedWidthChildren(r4, r6, r5)
            r3.remeasureMatchParentWidthChildren(r4, r6, r5)
            int r4 = r3.totalLength
            int r5 = r3.getHorizontalPaddings$div_release()
            int r4 = r4 + r5
            r3.totalLength = r4
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.LinearContainerLayout.remeasureChildrenHorizontalIfNeeded(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void remeasureChildrenVerticalIfNeeded(int r4, int r5, int r6, int r7) {
        /*
            r3 = this;
            int r0 = r3.totalLength
            int r5 = r5 - r0
            java.util.List<android.view.View> r0 = r3.constrainedChildren
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r1 = r0 instanceof java.util.Collection
            if (r1 == 0) goto L15
            r1 = r0
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L15
            goto L2f
        L15:
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r0.next()
            android.view.View r1 = (android.view.View) r1
            int r1 = r3.getMaxHeight(r1)
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L19
            goto L35
        L2f:
            boolean r0 = r3.needRemeasureChildren(r5, r6)
            if (r0 == 0) goto L47
        L35:
            r0 = 0
            r3.totalLength = r0
            r3.remeasureConstrainedHeightChildren(r4, r6, r5)
            r3.remeasureMatchParentHeightChildren(r4, r6, r7, r5)
            int r4 = r3.totalLength
            int r5 = r3.getVerticalPaddings$div_release()
            int r4 = r4 + r5
            r3.totalLength = r4
        L47:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.div.core.widget.LinearContainerLayout.remeasureChildrenVerticalIfNeeded(int, int, int, int):void");
    }

    private final void remeasureConstrainedHeightChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, heightMeasureSpec);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxHeight(view) != Integer.MAX_VALUE) {
                    remeasureChildVertical(view, widthMeasureSpec, this.maxCrossSize, Math.min(view.getMeasuredHeight(), getMaxHeight(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedHeightChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    View view2 = (View) t11;
                    View view3 = (View) t10;
                    return mf.a.d(Float.valueOf(view2.getMinimumHeight() / view2.getMeasuredHeight()), Float.valueOf(view3.getMinimumHeight() / view3.getMeasuredHeight()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredHeight = view2.getMeasuredHeight();
            int verticalMargins$div_release = divLayoutParams.getVerticalMargins$div_release() + measuredHeight;
            remeasureChildVertical(view2, widthMeasureSpec, this.maxCrossSize, g.j(g.e(a.d((verticalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredHeight, view2.getMinimumHeight()), divLayoutParams.getMaxHeight()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= verticalMargins$div_release;
            freeSpace -= view2.getMeasuredHeight() - measuredHeight;
        }
    }

    private final void remeasureConstrainedWidthChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, widthMeasureSpec);
        if (freeSpace >= 0) {
            for (View view : this.constrainedChildren) {
                if (getMaxWidth(view) != Integer.MAX_VALUE) {
                    remeasureChildHorizontal(view, heightMeasureSpec, Math.min(view.getMeasuredWidth(), getMaxWidth(view)));
                }
            }
            return;
        }
        List<View> list = this.constrainedChildren;
        if (list.size() > 1) {
            CollectionsKt.sortWith(list, new Comparator() { // from class: com.yandex.div.core.widget.LinearContainerLayout$remeasureConstrainedWidthChildren$$inlined$sortByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t10, T t11) {
                    View view2 = (View) t11;
                    View view3 = (View) t10;
                    return mf.a.d(Float.valueOf(view2.getMinimumWidth() / view2.getMeasuredWidth()), Float.valueOf(view3.getMinimumWidth() / view3.getMeasuredWidth()));
                }
            });
        }
        for (View view2 : this.constrainedChildren) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
            DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
            int measuredWidth = view2.getMeasuredWidth();
            int horizontalMargins$div_release = divLayoutParams.getHorizontalMargins$div_release() + measuredWidth;
            remeasureChildHorizontal(view2, heightMeasureSpec, g.j(g.e(a.d((horizontalMargins$div_release / this.totalConstrainedLength) * freeSpace) + measuredWidth, view2.getMinimumWidth()), divLayoutParams.getMaxWidth()));
            this.childMeasuredState = View.combineMeasuredStates(this.childMeasuredState, view2.getMeasuredState() & 16777216);
            this.totalConstrainedLength -= horizontalMargins$div_release;
            freeSpace -= view2.getMeasuredWidth() - measuredWidth;
        }
    }

    private final void remeasureDynamicHeightChild(View child, int heightMeasureSpec) {
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        int i10 = ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).height;
        if (i10 == -1 || i10 == -3) {
            remeasureChildHorizontal(child, heightMeasureSpec, child.getMeasuredWidth());
        }
    }

    private final void remeasureMatchParentHeightChildren(int widthMeasureSpec, int heightMeasureSpec, int initialMaxWidth, int delta) {
        int freeSpace = getFreeSpace(delta, heightMeasureSpec);
        float fixedVerticalWeight = this.totalWeight;
        int i10 = this.maxCrossSize;
        this.maxCrossSize = 0;
        int childCount = getChildCount();
        int i11 = freeSpace;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).height == -1) {
                    if (freeSpace > 0) {
                        int fixedVerticalWeight2 = (int) ((getFixedVerticalWeight(divLayoutParams) * i11) / fixedVerticalWeight);
                        fixedVerticalWeight -= getFixedVerticalWeight(divLayoutParams);
                        i11 -= fixedVerticalWeight2;
                        remeasureChildVertical(childAt, widthMeasureSpec, i10, fixedVerticalWeight2);
                    } else if (this.skippedMatchParentChildren.contains(childAt)) {
                        remeasureChildVertical(childAt, widthMeasureSpec, i10, Math.max(childAt.getMinimumHeight(), 0));
                    }
                }
                updateMaxCrossSize(widthMeasureSpec, childAt.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, childAt.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
            }
        }
        this.maxCrossSize = Math.max(initialMaxWidth, this.maxCrossSize + getHorizontalPaddings$div_release());
        KAssert kAssert = KAssert.INSTANCE;
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(this.maxCrossSize);
        if (Assert.isEnabled()) {
            Assert.assertEquals("Width of vertical container changed after remeasuring", numValueOf, numValueOf2);
        }
    }

    private final void remeasureMatchParentWidthChildren(int widthMeasureSpec, int heightMeasureSpec, int delta) {
        int freeSpace = getFreeSpace(delta, widthMeasureSpec);
        float fixedHorizontalWeight = this.totalWeight;
        this.maxCrossSize = 0;
        this.maxBaselineAscent = -1;
        this.maxBaselineDescent = -1;
        int childCount = getChildCount();
        int i10 = freeSpace;
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
                DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
                if (((ViewGroup.MarginLayoutParams) divLayoutParams).width == -1) {
                    if (freeSpace > 0) {
                        int fixedHorizontalWeight2 = (int) ((getFixedHorizontalWeight(divLayoutParams) * i10) / fixedHorizontalWeight);
                        fixedHorizontalWeight -= getFixedHorizontalWeight(divLayoutParams);
                        i10 -= fixedHorizontalWeight2;
                        remeasureChildHorizontal(childAt, heightMeasureSpec, fixedHorizontalWeight2);
                    } else {
                        remeasureChildHorizontal(childAt, heightMeasureSpec, Math.max(childAt.getMinimumWidth(), 0));
                    }
                }
                updateMaxCrossSize(heightMeasureSpec, childAt.getMeasuredHeight() + divLayoutParams.getVerticalMargins$div_release());
                this.totalLength = getMaxLength(this.totalLength, childAt.getMeasuredWidth() + divLayoutParams.getHorizontalMargins$div_release());
                updateBaselineOffset(childAt);
            }
        }
    }

    private final void setChildFrame(View child, int left, int top, int width, int height) {
        child.layout(left, top, width + left, height + top);
    }

    private final void updateBaselineOffset(View child) {
        int baseline;
        ViewGroup.LayoutParams layoutParams = child.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        DivLayoutParams divLayoutParams = (DivLayoutParams) layoutParams;
        if (divLayoutParams.getIsBaselineAligned() && (baseline = child.getBaseline()) != -1) {
            this.maxBaselineAscent = Math.max(this.maxBaselineAscent, ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin + baseline);
            this.maxBaselineDescent = Math.max(this.maxBaselineDescent, (child.getMeasuredHeight() - baseline) - ((ViewGroup.MarginLayoutParams) divLayoutParams).topMargin);
        }
    }

    private final void updateMaxCrossSize(int measureSpec, int childSize) {
        if (ViewsKt.isExact(measureSpec)) {
            return;
        }
        this.maxCrossSize = Math.max(this.maxCrossSize, childSize);
    }

    public float getAspectRatio() {
        return ((Number) this.aspectRatio.getValue(this, $$delegatedProperties[1])).floatValue();
    }

    @Override // android.view.View
    public int getBaseline() {
        if (!isVertical()) {
            int i10 = this.maxBaselineAscent;
            return i10 != -1 ? i10 + getPaddingTop() : super.getBaseline();
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return super.getBaseline();
        }
        int baseline = childAt.getBaseline();
        ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
        Intrinsics.checkNotNull(layoutParams, "null cannot be cast to non-null type com.yandex.div.internal.widget.DivLayoutParams");
        return baseline + ((ViewGroup.MarginLayoutParams) ((DivLayoutParams) layoutParams)).topMargin + getPaddingTop();
    }

    @Nullable
    public final Drawable getDividerDrawable() {
        return this.dividerDrawable;
    }

    public final int getOrientation() {
        return ((Number) this.orientation.getValue(this, $$delegatedProperties[0])).intValue();
    }

    public final int getShowDividers() {
        return ((Number) this.showDividers.getValue(this, $$delegatedProperties[2])).intValue();
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        if (this.dividerDrawable == null) {
            return;
        }
        if (isVertical()) {
            drawDividersVertical(canvas);
        } else {
            drawDividersHorizontal(canvas);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l10, int t10, int r10, int b10) {
        if (isVertical()) {
            layoutVertical(l10, t10, r10, b10);
        } else {
            layoutHorizontal(l10, t10, r10, b10);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i10;
        this.totalLength = 0;
        this.maxCrossSize = 0;
        this.totalConstrainedLength = 0;
        this.totalMatchParentLength = 0;
        this.totalWeight = 0.0f;
        this.childMeasuredState = 0;
        Iterator it = ViewGroupKt.getChildren(this).iterator();
        int i11 = 0;
        while (true) {
            i10 = -1;
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            Object next = it.next();
            if (i11 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!(((View) next).getVisibility() == 8)) {
                break;
            } else {
                i11++;
            }
        }
        this.firstVisibleChildIndex = i11;
        int i12 = 0;
        for (Object obj : ViewGroupKt.getChildren(this)) {
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if (!(((View) obj).getVisibility() == 8)) {
                i10 = i12;
            }
            i12++;
        }
        this.lastVisibleChildIndex = i10;
        if (isVertical()) {
            measureVertical(widthMeasureSpec, heightMeasureSpec);
        } else {
            measureHorizontal(widthMeasureSpec, heightMeasureSpec);
        }
        this.constrainedChildren.clear();
        this.crossMatchParentChildren.clear();
        this.skippedMatchParentChildren.clear();
    }

    @Override // com.yandex.div.core.widget.AspectView
    public void setAspectRatio(float f10) {
        this.aspectRatio.setValue(this, $$delegatedProperties[1], Float.valueOf(f10));
    }

    public final void setDividerDrawable(@Nullable Drawable drawable) {
        if (Intrinsics.areEqual(this.dividerDrawable, drawable)) {
            return;
        }
        this.dividerDrawable = drawable;
        this.dividerWidth = drawable != null ? drawable.getIntrinsicWidth() : 0;
        this.dividerHeight = drawable != null ? drawable.getIntrinsicHeight() : 0;
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public final void setDividerMargins(int left, int top, int right, int bottom) {
        this.dividerMarginLeft = left;
        this.dividerMarginRight = right;
        this.dividerMarginTop = top;
        this.dividerMarginBottom = bottom;
        requestLayout();
    }

    public final void setItemSpacing(int px) {
        if (this.itemSpacingPx != px) {
            this.itemSpacingPx = px;
            requestLayout();
        }
    }

    public final void setOrientation(int i10) {
        this.orientation.setValue(this, $$delegatedProperties[0], Integer.valueOf(i10));
    }

    public final void setShowDividers(int i10) {
        this.showDividers.setValue(this, $$delegatedProperties[2], Integer.valueOf(i10));
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.yandex.div.internal.widget.DivViewGroup, android.view.ViewGroup
    @NotNull
    public DivLayoutParams generateDefaultLayoutParams() {
        return isVertical() ? new DivLayoutParams(-1, -2) : new DivLayoutParams(-2, -2);
    }
}
