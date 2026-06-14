package com.appodeal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import com.appodeal.ads.analytics.AppodealAnalytics;
import com.appodeal.ads.inapp.AppodealPurchaseListener;
import com.appodeal.ads.inapp.InAppPurchase;
import com.appodeal.ads.inapp.InAppPurchaseValidateCallback;
import com.appodeal.ads.initializing.ApdInitializationCallback;
import com.appodeal.ads.initializing.ApdInitializationError;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.network.IndexProvider;
import com.appodeal.ads.revenue.AdRevenueCallbacks;
import com.appodeal.ads.rewarded.Reward;
import com.appodeal.ads.storage.d0;
import com.appodeal.ads.utils.Log;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.D5;
import com.mobilefuse.sdk.MobileFuseNativeAdKt;
import com.my.target.common.menu.MenuActionType;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001J3\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0016\u0010\u0015J\u0019\u0010\u0019\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0019\u0010\u001c\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001bH\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010\u001f\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010\u001eH\u0007¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010\"\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010!H\u0007¢\u0006\u0004\b\"\u0010#J\u0019\u0010%\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010$H\u0007¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010'H\u0007¢\u0006\u0004\b(\u0010)J\u0019\u0010+\u001a\u00020\n2\b\u0010\u0018\u001a\u0004\u0018\u00010*H\u0007¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\n2\u0006\u0010.\u001a\u00020-H\u0007¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020-H\u0007¢\u0006\u0004\b1\u00102J)\u00106\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u00105\u001a\u00020\u0006H\u0007¢\u0006\u0004\b6\u00107J)\u00109\u001a\u00020\u00132\u0006\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u00020\n2\u0006\u00104\u001a\u0002032\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b;\u0010<J\u001f\u0010>\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010=\u001a\u00020\u0013H\u0007¢\u0006\u0004\b>\u0010?J\u001f\u0010A\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010@\u001a\u00020\u0013H\u0007¢\u0006\u0004\bA\u0010?J\u000f\u0010B\u001a\u00020\u0013H\u0007¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\n2\u0006\u0010D\u001a\u00020\u0013H\u0007¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bG\u0010\u0015J\u0017\u0010H\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0004\bH\u0010\u0015J!\u0010I\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0004\bI\u0010JJ\u0017\u0010L\u001a\u00020\n2\u0006\u0010K\u001a\u00020\u0006H\u0007¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020N2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\bO\u0010PJ\u0017\u0010R\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0013H\u0007¢\u0006\u0004\bR\u0010FJ\u000f\u0010S\u001a\u00020\u0013H\u0007¢\u0006\u0004\bS\u0010CJ\u0017\u0010T\u001a\u00020\n2\u0006\u0010Q\u001a\u00020\u0013H\u0007¢\u0006\u0004\bT\u0010FJ\u0017\u0010V\u001a\u00020\n2\u0006\u0010U\u001a\u00020\u0013H\u0007¢\u0006\u0004\bV\u0010FJ\u001f\u0010Y\u001a\u00020\n2\u0006\u0010W\u001a\u00020\u00062\u0006\u0010X\u001a\u00020\u0006H\u0007¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020\n2\u0006\u0010[\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\\\u0010FJ\u0017\u0010^\u001a\u00020\n2\u0006\u0010]\u001a\u00020\u0006H\u0007¢\u0006\u0004\b^\u0010MJ\u0017\u0010`\u001a\u00020_2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b`\u0010aJ'\u0010e\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u0004H\u0007¢\u0006\u0004\be\u0010fJ\u001f\u0010h\u001a\b\u0012\u0004\u0012\u00020\u00040g2\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bh\u0010iJ!\u0010k\u001a\u00020\n2\u0006\u0010j\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\bk\u0010lJ\u0017\u0010n\u001a\u00020\n2\u0006\u0010m\u001a\u00020\u0004H\u0007¢\u0006\u0004\bn\u0010\u000fJ\u0011\u0010o\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bo\u0010\u0011J\u000f\u0010p\u001a\u00020\u0004H\u0007¢\u0006\u0004\bp\u0010\u0011J\u0011\u0010q\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bq\u0010\u0011J\u0011\u0010r\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\br\u0010\u0011J\u0011\u0010s\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\bs\u0010\u0011J\u000f\u0010u\u001a\u00020tH\u0007¢\u0006\u0004\bu\u0010vJ\u000f\u0010x\u001a\u00020wH\u0007¢\u0006\u0004\bx\u0010yJ\u0017\u0010{\u001a\u00020\n2\u0006\u0010z\u001a\u00020\u0013H\u0007¢\u0006\u0004\b{\u0010FJ\u000f\u0010}\u001a\u00020|H\u0007¢\u0006\u0004\b}\u0010~J\u001a\u0010\u0080\u0001\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020|H\u0007¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J$\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0013H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J#\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u0084\u0001\u0010lJ$\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020bH\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0086\u0001J$\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0087\u0001J&\u0010\u0084\u0001\u001a\u00020\n2\u0007\u0010\u0082\u0001\u001a\u00020\u00042\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0006\b\u0084\u0001\u0010\u0088\u0001J \u0010\u008a\u0001\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010g2\u0006\u00105\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u008a\u0001\u0010iJ\u0012\u0010\u008b\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J#\u0010\u008d\u0001\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0005\b\u008d\u0001\u0010JJ\u001d\u0010\u008f\u0001\u001a\u00030\u008e\u00012\b\b\u0002\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J5\u0010\u0094\u0001\u001a\u00020\n2\t\u0010\u0091\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u00042\u000b\b\u0002\u0010\u0093\u0001\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u001a\u0010\u0096\u0001\u001a\u00020\n2\u0007\u0010\u0096\u0001\u001a\u00020\u0013H\u0007¢\u0006\u0005\b\u0096\u0001\u0010FJ\u001a\u0010\u0097\u0001\u001a\u00020\n2\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001d\u0010\u0099\u0001\u001a\u00020\n2\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001J\u0019\u0010\u009b\u0001\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u009b\u0001\u0010MJ$\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0004H\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u0087\u0001J#\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0005\b\u009d\u0001\u0010lJ$\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020bH\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u0086\u0001J$\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u00042\u0007\u0010\u0083\u0001\u001a\u00020\u0013H\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u0085\u0001J&\u0010\u009d\u0001\u001a\u00020\n2\u0007\u0010\u009c\u0001\u001a\u00020\u00042\t\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0006\b\u009d\u0001\u0010\u0088\u0001J\u001a\u0010\u009e\u0001\u001a\u00020b2\u0006\u0010\u0012\u001a\u00020\u0006H\u0007¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J$\u0010 \u0001\u001a\u00020b2\u0006\u0010\u0012\u001a\u00020\u00062\b\b\u0002\u00108\u001a\u00020\u0004H\u0007¢\u0006\u0006\b \u0001\u0010¡\u0001J@\u0010¦\u0001\u001a\u00020\n2\u0007\u0010¢\u0001\u001a\u00020\u00042\u0018\u0010¤\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010£\u00012\t\b\u0002\u0010¥\u0001\u001a\u00020\u0006H\u0007¢\u0006\u0006\b¦\u0001\u0010§\u0001J/\u0010«\u0001\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010©\u0001\u001a\u00030¨\u00012\t\u0010\t\u001a\u0005\u0018\u00010ª\u0001H\u0007¢\u0006\u0006\b«\u0001\u0010¬\u0001J\u001e\u0010¯\u0001\u001a\u00020\n2\n\u0010®\u0001\u001a\u0005\u0018\u00010\u00ad\u0001H\u0007¢\u0006\u0006\b¯\u0001\u0010°\u0001R\u0017\u0010±\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0017\u0010³\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b³\u0001\u0010²\u0001R\u0017\u0010´\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b´\u0001\u0010²\u0001R\u0017\u0010µ\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\bµ\u0001\u0010²\u0001R\u0017\u0010¶\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b¶\u0001\u0010²\u0001R\u0017\u0010·\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b·\u0001\u0010²\u0001R\u0017\u0010¸\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b¸\u0001\u0010²\u0001R\u0017\u0010¹\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b¹\u0001\u0010²\u0001R\u0017\u0010º\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\bº\u0001\u0010²\u0001R\u0017\u0010»\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b»\u0001\u0010²\u0001R\u0017\u0010¼\u0001\u001a\u00020\u00068\u0006X\u0086T¢\u0006\b\n\u0006\b¼\u0001\u0010²\u0001R\u0017\u0010½\u0001\u001a\u00020\u00068\u0000X\u0080T¢\u0006\b\n\u0006\b½\u0001\u0010²\u0001¨\u0006¾\u0001"}, d2 = {"Lcom/appodeal/ads/Appodeal;", "", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "", "appKey", "", "adTypes", "Lcom/appodeal/ads/initializing/ApdInitializationCallback;", "callback", "", MobileAdsBridgeBase.initializeMethodName, "(Landroid/content/Context;Ljava/lang/String;ILcom/appodeal/ads/initializing/ApdInitializationCallback;)V", D5.f40571r, "setBidonEndpoint", "(Ljava/lang/String;)V", "getBidonEndpoint", "()Ljava/lang/String;", "adType", "", "isInitialized", "(I)Z", "isAutoCacheEnabled", "Lcom/appodeal/ads/AppodealRequestCallbacks;", "callbacks", "setRequestCallbacks", "(Lcom/appodeal/ads/AppodealRequestCallbacks;)V", "Lcom/appodeal/ads/revenue/AdRevenueCallbacks;", "setAdRevenueCallbacks", "(Lcom/appodeal/ads/revenue/AdRevenueCallbacks;)V", "Lcom/appodeal/ads/InterstitialCallbacks;", "setInterstitialCallbacks", "(Lcom/appodeal/ads/InterstitialCallbacks;)V", "Lcom/appodeal/ads/RewardedVideoCallbacks;", "setRewardedVideoCallbacks", "(Lcom/appodeal/ads/RewardedVideoCallbacks;)V", "Lcom/appodeal/ads/BannerCallbacks;", "setBannerCallbacks", "(Lcom/appodeal/ads/BannerCallbacks;)V", "Lcom/appodeal/ads/MrecCallbacks;", "setMrecCallbacks", "(Lcom/appodeal/ads/MrecCallbacks;)V", "Lcom/appodeal/ads/NativeCallbacks;", "setNativeCallbacks", "(Lcom/appodeal/ads/NativeCallbacks;)V", "Lcom/appodeal/ads/NativeMediaViewContentType;", "contentType", "setPreferredNativeContentType", "(Lcom/appodeal/ads/NativeMediaViewContentType;)V", "getPreferredNativeContentType", "()Lcom/appodeal/ads/NativeMediaViewContentType;", "Landroid/app/Activity;", "activity", "count", Reporting.EventType.CACHE, "(Landroid/app/Activity;II)V", "placementName", C4424m2.f43623v, "(Landroid/app/Activity;ILjava/lang/String;)Z", MenuActionType.HIDE, "(Landroid/app/Activity;I)V", "autoCache", "setAutoCache", "(IZ)V", "triggerOnLoadedOnPrecache", "setTriggerOnLoadedOnPrecache", "isSharedAdsInstanceAcrossActivities", "()Z", "sharedAdsInstanceAcrossActivities", "setSharedAdsInstanceAcrossActivities", "(Z)V", "isLoaded", "isPrecache", "isPrecacheByPlacement", "(ILjava/lang/String;)Z", "bannerViewId", "setBannerViewId", "(I)V", "Lcom/appodeal/ads/BannerView;", "getBannerView", "(Landroid/content/Context;)Lcom/appodeal/ads/BannerView;", "enabled", "setSmartBanners", "isSmartBannersEnabled", "set728x90Banners", "animate", "setBannerAnimation", "leftBannerRotation", "rightBannerRotation", "setBannerRotation", "(II)V", "useSafeArea", "setUseSafeArea", "mrecViewId", "setMrecViewId", "Lcom/appodeal/ads/MrecView;", "getMrecView", "(Landroid/content/Context;)Lcom/appodeal/ads/MrecView;", "", "amount", "currency", "trackInAppPurchase", "(Landroid/content/Context;DLjava/lang/String;)V", "", "getNetworks", "(I)Ljava/util/List;", "network", "disableNetwork", "(Ljava/lang/String;I)V", "userId", "setUserId", "getUserId", "getVersion", "getFrameworkName", "getPluginVersion", "getEngineVersion", "", "getSegmentId", "()J", "Ljava/util/Date;", "getBuildDate", "()Ljava/util/Date;", "testMode", "setTesting", "Lcom/appodeal/ads/utils/Log$LogLevel;", "getLogLevel", "()Lcom/appodeal/ads/utils/Log$LogLevel;", "logLevel", "setLogLevel", "(Lcom/appodeal/ads/utils/Log$LogLevel;)V", "name", "value", "setCustomFilter", "(Ljava/lang/String;Z)V", "(Ljava/lang/String;D)V", "(Ljava/lang/String;Ljava/lang/String;)V", "(Ljava/lang/String;Ljava/lang/Object;)V", "Lcom/appodeal/ads/NativeAd;", "getNativeAds", "getAvailableNativeAdsCount", "()I", "canShow", "Lcom/appodeal/ads/rewarded/Reward;", "getReward", "(Ljava/lang/String;)Lcom/appodeal/ads/rewarded/Reward;", "frameworkName", "pluginVersion", "engineVersion", "setFramework", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "muteVideosIfCallsMuted", "startTestActivity", "(Landroid/app/Activity;)V", "setChildDirectedTreatment", "(Ljava/lang/Boolean;)V", "destroy", C4240b4.i.W, "setExtraData", "getPredictedEcpm", "(I)D", "getPredictedEcpmByPlacement", "(ILjava/lang/String;)D", C4240b4.i.f42633j0, "", "params", NotificationCompat.CATEGORY_SERVICE, "logEvent", "(Ljava/lang/String;Ljava/util/Map;I)V", "Lcom/appodeal/ads/inapp/InAppPurchase;", FirebaseAnalytics.Event.PURCHASE, "Lcom/appodeal/ads/inapp/InAppPurchaseValidateCallback;", "validateInAppPurchase", "(Landroid/content/Context;Lcom/appodeal/ads/inapp/InAppPurchase;Lcom/appodeal/ads/inapp/InAppPurchaseValidateCallback;)V", "Lcom/appodeal/ads/inapp/AppodealPurchaseListener;", "purchaseListener", "setPurchaseListener", "(Lcom/appodeal/ads/inapp/AppodealPurchaseListener;)V", "NONE", "I", "INTERSTITIAL", "BANNER", "BANNER_BOTTOM", "BANNER_TOP", "BANNER_LEFT", "BANNER_RIGHT", "BANNER_VIEW", "REWARDED_VIDEO", "MREC", MobileFuseNativeAdKt.AD_TYPE, "ALL", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class Appodeal {
    public static final int ALL = 4095;
    public static final int BANNER = 4;
    public static final int BANNER_BOTTOM = 8;
    public static final int BANNER_LEFT = 1024;
    public static final int BANNER_RIGHT = 2048;
    public static final int BANNER_TOP = 16;
    public static final int BANNER_VIEW = 64;

    @NotNull
    public static final Appodeal INSTANCE = new Appodeal();
    public static final int INTERSTITIAL = 3;
    public static final int MREC = 256;
    public static final int NATIVE = 512;
    public static final int NONE = 0;
    public static final int REWARDED_VIDEO = 128;

    public static final void cache(@NotNull Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        cache$default(activity, i10, 0, 4, null);
    }

    public static /* synthetic */ void cache$default(Activity activity, int i10, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            i11 = 1;
        }
        cache(activity, i10, i11);
    }

    public static final boolean canShow(int i10) {
        return canShow$default(i10, null, 2, null);
    }

    public static /* synthetic */ boolean canShow$default(int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "default";
        }
        return canShow(i10, str);
    }

    public static final void destroy(int adTypes) {
        boolean z10 = h2.f13367a;
        o2.F.a(null);
        Iterator it = f6.b(adTypes).iterator();
        while (it.hasNext()) {
            int i10 = Cif.f13437a[((AdType) it.next()).ordinal()];
            if (i10 == 1) {
                ee.d().b(ee.a());
            } else if (i10 == 2) {
                ve.c().b(ve.a());
            } else if (i10 == 3) {
                if (h6.f13390d == null) {
                    h6.f13390d = new q3();
                }
                h6.f13390d.b(h6.a());
            } else if (i10 == 4) {
                if (af.f12647e == null) {
                    af.f12647e = new q3();
                }
                af.f12647e.b(af.a());
            } else if (i10 != 5) {
                throw new lf.m();
            }
        }
    }

    public static final void disableNetwork(@NotNull String network) {
        Intrinsics.checkNotNullParameter(network, "network");
        disableNetwork$default(network, 0, 2, null);
    }

    public static /* synthetic */ void disableNetwork$default(String str, int i10, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            i10 = ALL;
        }
        disableNetwork(str, i10);
    }

    public static final int getAvailableNativeAdsCount() {
        boolean z10 = h2.f13367a;
        Log.log(LogConstants.KEY_SDK_PUBLIC, "Get", "available Native Ads count");
        return t1.e();
    }

    @NotNull
    public static final BannerView getBannerView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, "Get", "BannerView", Log.LogLevel.verbose);
        BannerView bannerView = new BannerView(context, null);
        ee.d().f11898e = -1;
        dd ddVarD = ee.d();
        ddVarD.getClass();
        ddVarD.f11897d = new WeakReference(bannerView);
        return bannerView;
    }

    @Nullable
    public static final String getBidonEndpoint() {
        boolean z10 = h2.f13367a;
        Log.log(LogConstants.KEY_SDK_PUBLIC, "Get", "Bidon self-host endpoint", Log.LogLevel.verbose);
        return ((com.appodeal.ads.bidon.c) ((com.appodeal.ads.bidon.b) com.appodeal.ads.bidon.e.f13152a.getValue())).f13151b.f13149a;
    }

    @NotNull
    public static final Date getBuildDate() {
        boolean z10 = h2.f13367a;
        return Constants.BUILD_DATE;
    }

    @Nullable
    public static final String getEngineVersion() {
        return h2.f13374h;
    }

    @Nullable
    public static final String getFrameworkName() {
        return h2.f13372f;
    }

    @NotNull
    public static final Log.LogLevel getLogLevel() {
        return h2.L();
    }

    @NotNull
    public static final MrecView getMrecView(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(context, "context");
        Log.log(LogConstants.KEY_SDK_PUBLIC, "Get", "MrecView", Log.LogLevel.verbose);
        MrecView mrecView = new MrecView(context, null);
        ve.c().f11898e = -1;
        ud udVarC = ve.c();
        udVarC.getClass();
        udVarC.f11897d = new WeakReference(mrecView);
        return mrecView;
    }

    @NotNull
    public static final List<NativeAd> getNativeAds(int count) {
        return new ArrayList(h2.f(count));
    }

    @NotNull
    public static final List<String> getNetworks() {
        return getNetworks$default(0, 1, null);
    }

    public static /* synthetic */ List getNetworks$default(int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = ALL;
        }
        return getNetworks(i10);
    }

    @Nullable
    public static final String getPluginVersion() {
        return h2.f13373g;
    }

    public static final double getPredictedEcpm(int adType) {
        boolean z10 = h2.f13367a;
        AdType adTypeC = f6.c(adType);
        int i10 = adTypeC == null ? -1 : Cif.f13437a[adTypeC.ordinal()];
        if (i10 == -1) {
            return 0.0d;
        }
        if (i10 == 1) {
            id idVarA = ee.a();
            Intrinsics.checkNotNullExpressionValue(idVarA, "getAdController(...)");
            return h2.y(idVarA);
        }
        if (i10 == 2) {
            be beVarA = ve.a();
            Intrinsics.checkNotNullExpressionValue(beVarA, "getAdController(...)");
            return h2.y(beVarA);
        }
        if (i10 == 3) {
            v5 v5VarA = h6.a();
            Intrinsics.checkNotNullExpressionValue(v5VarA, "getAdController(...)");
            return h2.y(v5VarA);
        }
        if (i10 != 4) {
            if (i10 == 5) {
                return 0.0d;
            }
            throw new lf.m();
        }
        se seVarA = af.a();
        Intrinsics.checkNotNullExpressionValue(seVarA, "getAdController(...)");
        return h2.y(seVarA);
    }

    public static final double getPredictedEcpmByPlacement(int i10) {
        return getPredictedEcpmByPlacement$default(i10, null, 2, null);
    }

    public static /* synthetic */ double getPredictedEcpmByPlacement$default(int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "default";
        }
        return getPredictedEcpmByPlacement(i10, str);
    }

    @NotNull
    public static final NativeMediaViewContentType getPreferredNativeContentType() {
        boolean z10 = h2.f13367a;
        NativeMediaViewContentType mediaViewContent = t1.f14852b;
        Intrinsics.checkNotNullExpressionValue(mediaViewContent, "mediaViewContent");
        return mediaViewContent;
    }

    @NotNull
    public static final Reward getReward() {
        return getReward$default(null, 1, null);
    }

    public static /* synthetic */ Reward getReward$default(String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = "default";
        }
        return getReward(str);
    }

    public static final long getSegmentId() {
        boolean z10 = h2.f13367a;
        return com.appodeal.ads.segments.s0.g().f14483a;
    }

    @Nullable
    public static final String getUserId() {
        boolean z10 = h2.f13367a;
        return o6.a().f14245a;
    }

    @NotNull
    public static final String getVersion() {
        boolean z10 = h2.f13367a;
        return Constants.SDK_VERSION;
    }

    public static final void hide(@NotNull Activity activity, int adTypes) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        h2.j(activity, adTypes);
    }

    public static final void initialize(@NotNull Context context, @NotNull String appKey, int i10) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        initialize$default(context, appKey, i10, null, 8, null);
    }

    public static /* synthetic */ void initialize$default(Context context, String str, int i10, ApdInitializationCallback apdInitializationCallback, int i11, Object obj) {
        if ((i11 & 8) != 0) {
            apdInitializationCallback = null;
        }
        initialize(context, str, i10, apdInitializationCallback);
    }

    public static final boolean isAutoCacheEnabled(int adType) {
        List list = (List) h2.f13375i.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), adType);
            if (l0VarA != null && l0VarA.f13572l) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isInitialized(int adType) {
        List list = (List) h2.f13375i.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), adType);
            if (l0VarA != null && l0VarA.f13570j) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isLoaded(int adTypes) {
        return h2.E(adTypes);
    }

    public static final boolean isPrecache(int adType) {
        te teVarA;
        List list = (List) h2.f13375i.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0 l0VarA = f6.a((l0) it.next(), adType);
            if (l0VarA != null && (teVarA = l0VarA.A()) != null && !teVarA.f14910v.get() && !teVarA.f14911w && teVarA.f14912x) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isPrecacheByPlacement(int i10) {
        return isPrecacheByPlacement$default(i10, null, 2, null);
    }

    public static /* synthetic */ boolean isPrecacheByPlacement$default(int i10, String str, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = "default";
        }
        return isPrecacheByPlacement(i10, str);
    }

    public static final boolean isSharedAdsInstanceAcrossActivities() {
        boolean z10 = h2.f13367a;
        return db.f13250l;
    }

    public static final boolean isSmartBannersEnabled() {
        boolean z10 = h2.f13367a;
        return ee.f13290b;
    }

    public static final void logEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        logEvent$default(eventName, map, 0, 4, null);
    }

    public static /* synthetic */ void logEvent$default(String str, Map map, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 15;
        }
        logEvent(str, map, i10);
    }

    public static final void muteVideosIfCallsMuted(boolean muteVideosIfCallsMuted) {
        h2.v(muteVideosIfCallsMuted);
    }

    public static final void set728x90Banners(boolean enabled) {
        h2.D(enabled);
    }

    public static final void setAdRevenueCallbacks(@Nullable AdRevenueCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14210c.a(null);
        h2.f13371e = callbacks;
    }

    public static final void setAutoCache(int adTypes, boolean autoCache) {
        h2.i(adTypes, autoCache);
    }

    public static final void setBannerAnimation(boolean animate) {
        h2.J(animate);
    }

    public static final void setBannerCallbacks(@Nullable BannerCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14213f.a(null);
        ee.f13289a.f14310a = callbacks;
    }

    public static final void setBannerRotation(int leftBannerRotation, int rightBannerRotation) {
        h2.h(leftBannerRotation, rightBannerRotation);
    }

    public static final void setBannerViewId(int bannerViewId) {
        h2.I(bannerViewId);
    }

    public static final void setBidonEndpoint(@NotNull String endpoint) {
        Intrinsics.checkNotNullParameter(endpoint, "endpoint");
        h2.q(endpoint);
    }

    public static final void setChildDirectedTreatment(@Nullable Boolean value) {
        boolean z10 = h2.f13367a;
        o2.E.a(String.valueOf(value));
        boolean zA = y3.a();
        y3.f15274b = value;
        if (zA != y3.a()) {
            db.g();
        }
    }

    public static final void setCustomFilter(@NotNull String name, boolean value) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNull(Boolean.valueOf(value), "null cannot be cast to non-null type kotlin.Any");
        h2.s(name, Boolean.valueOf(value));
    }

    public static final void setExtraData(@NotNull String key, @NotNull String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        h2.C(key, value);
    }

    public static final void setFramework(@Nullable String str, @Nullable String str2) {
        setFramework$default(str, str2, null, 4, null);
    }

    public static /* synthetic */ void setFramework$default(String str, String str2, String str3, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str3 = null;
        }
        setFramework(str, str2, str3);
    }

    public static final void setInterstitialCallbacks(@Nullable InterstitialCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14211d.a(null);
        h6.f13388b.f13642a = callbacks;
    }

    public static final void setLogLevel(@NotNull Log.LogLevel logLevel) {
        Intrinsics.checkNotNullParameter(logLevel, "logLevel");
        h2.p(logLevel);
    }

    public static final void setMrecCallbacks(@Nullable MrecCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14214g.a(null);
        ve.f15160a.f15323a = callbacks;
    }

    public static final void setMrecViewId(int mrecViewId) {
        h2.M(mrecViewId);
    }

    public static final void setNativeCallbacks(@Nullable NativeCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14215h.a(null);
        t1.f14851a.f13588a = callbacks;
    }

    public static final void setPreferredNativeContentType(@NotNull NativeMediaViewContentType contentType) {
        Intrinsics.checkNotNullParameter(contentType, "contentType");
        h2.n(contentType);
    }

    public static final void setPurchaseListener(@Nullable AppodealPurchaseListener purchaseListener) {
        boolean z10 = h2.f13367a;
        o2.K.a(null);
        ((com.appodeal.ads.services.r) com.appodeal.ads.services.v.f14778a.getValue()).f14727e = purchaseListener;
    }

    public static final void setRequestCallbacks(@Nullable AppodealRequestCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14209b.a(null);
        ((d9) h2.f13370d.getValue()).f13237b = callbacks;
    }

    public static final void setRewardedVideoCallbacks(@Nullable RewardedVideoCallbacks callbacks) {
        boolean z10 = h2.f13367a;
        o2.f14212e.a(null);
        af.f12643a.f13295a = callbacks;
    }

    public static final void setSharedAdsInstanceAcrossActivities(boolean sharedAdsInstanceAcrossActivities) {
        h2.N(sharedAdsInstanceAcrossActivities);
    }

    public static final void setSmartBanners(boolean enabled) {
        h2.P(enabled);
    }

    public static final void setTesting(boolean testMode) {
        h2.R(testMode);
    }

    public static final void setTriggerOnLoadedOnPrecache(int adTypes, boolean triggerOnLoadedOnPrecache) {
        h2.B(adTypes, triggerOnLoadedOnPrecache);
    }

    public static final void setUseSafeArea(boolean useSafeArea) {
        db.f13251m = useSafeArea;
    }

    public static final void setUserId(@NotNull String userId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(userId, "userId");
        o2.f14230w.a(null);
        o6.a().setUserId(userId);
    }

    public static final boolean show(@NotNull Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        return show$default(activity, i10, null, 4, null);
    }

    public static /* synthetic */ boolean show$default(Activity activity, int i10, String str, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str = "default";
        }
        return show(activity, i10, str);
    }

    public static final void startTestActivity(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(activity, "activity");
        o2.D.a(null);
        com.appodeal.ads.context.n nVar = com.appodeal.ads.context.n.f13203b;
        nVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        com.appodeal.ads.context.j jVar = nVar.f13204a;
        jVar.getClass();
        Intrinsics.checkNotNullParameter(activity, "activity");
        jVar.f13198b = new WeakReference(activity);
        activity.startActivity(new Intent(activity, (Class<?>) TestActivity.class));
    }

    public static final void trackInAppPurchase(@NotNull Context context, double amount, @NotNull String currency) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(currency, "currency");
        h2.l(context, amount, currency);
    }

    public static final void validateInAppPurchase(@NotNull Context context, @NotNull InAppPurchase purchase, @Nullable InAppPurchaseValidateCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(purchase, "purchase");
        h2.m(context, purchase, callback);
    }

    public static final void cache(@NotNull Activity activity, int adTypes, int count) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        h2.k(activity, adTypes, count);
    }

    public static final boolean canShow(int adTypes, @NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        return h2.w(adTypes, placementName);
    }

    public static final void disableNetwork(@NotNull String network, int adTypes) {
        Intrinsics.checkNotNullParameter(network, "network");
        h2.r(network, adTypes);
    }

    @NotNull
    public static final List<String> getNetworks(int adTypes) {
        boolean z10 = h2.f13367a;
        ArrayList arrayListB = f6.b(adTypes);
        ArrayList arrayList = new ArrayList();
        Iterator it = arrayListB.iterator();
        while (it.hasNext()) {
            Set setA = com.appodeal.ads.initializing.j.f13479b.f13480a.a((AdType) it.next());
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(setA, 10));
            Iterator it2 = setA.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((com.appodeal.ads.initializing.g) it2.next()).f13475a);
            }
            CollectionsKt.addAll(arrayList, arrayList2);
        }
        return new ArrayList(CollectionsKt.sorted(CollectionsKt.distinct(arrayList)));
    }

    public static final double getPredictedEcpmByPlacement(int adType, @NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        AdType adTypeC = f6.c(adType);
        int i10 = adTypeC == null ? -1 : Cif.f13437a[adTypeC.ordinal()];
        if (i10 == -1) {
            return 0.0d;
        }
        if (i10 == 1) {
            id idVarA = ee.a();
            Intrinsics.checkNotNullExpressionValue(idVarA, "getAdController(...)");
            return h2.a(idVarA, placementName);
        }
        if (i10 == 2) {
            be beVarA = ve.a();
            Intrinsics.checkNotNullExpressionValue(beVarA, "getAdController(...)");
            return h2.a(beVarA, placementName);
        }
        if (i10 == 3) {
            v5 v5VarA = h6.a();
            Intrinsics.checkNotNullExpressionValue(v5VarA, "getAdController(...)");
            return h2.a(v5VarA, placementName);
        }
        if (i10 != 4) {
            if (i10 == 5) {
                return 0.0d;
            }
            throw new lf.m();
        }
        se seVarA = af.a();
        Intrinsics.checkNotNullExpressionValue(seVarA, "getAdController(...)");
        return h2.a(seVarA, placementName);
    }

    @NotNull
    public static final Reward getReward(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        com.appodeal.ads.segments.o oVarA = com.appodeal.ads.segments.q.a(placementName);
        JSONObject jSONObjectOptJSONObject = oVarA.f14496c.optJSONObject("reward");
        double dOptDouble = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optDouble("amount", 0.0d) : 0.0d;
        JSONObject jSONObjectOptJSONObject2 = oVarA.f14496c.optJSONObject("reward");
        String strOptString = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("currency", "") : "";
        Intrinsics.checkNotNullExpressionValue(strOptString, "getRewardedVideoCurrency(...)");
        return new Reward(dOptDouble, strOptString);
    }

    public static final void initialize(@NotNull Context context, @NotNull String appKey, int adTypes, @Nullable ApdInitializationCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        boolean z10 = h2.f13367a;
        l4 initializer = new l4(new com.appodeal.ads.networking.usecases.b(), new n8(), new com.appodeal.ads.initializing.m(), new j5(), com.appodeal.ads.utils.tracker.b.f15130b, com.appodeal.ads.utils.session.r.f15109b, b9.f13136b, com.appodeal.ads.storage.e0.f14799b, d0.f14795b, AppodealAnalytics.INSTANCE, (v3) v3.f15139a.getValue(), (IndexProvider) com.appodeal.ads.networking.endpoint.b.f14099e.getValue());
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        Intrinsics.checkNotNullParameter(initializer, "initializer");
        Context applicationContext = context.getApplicationContext();
        ArrayList arrayList = new ArrayList();
        if (appKey.length() == 0) {
            String packageName = applicationContext.getPackageName();
            Intrinsics.checkNotNullExpressionValue(packageName, "getPackageName(...)");
            arrayList.add(new ApdInitializationError.Critical.AppKeyIsNullOrEmpty(packageName));
        }
        if (j2.w() < 21) {
            arrayList.add(ApdInitializationError.Critical.SdkVersionIsNotSupported.INSTANCE);
        }
        if (arrayList.isEmpty()) {
            com.appodeal.ads.context.u uVar = com.appodeal.ads.context.u.f13215b;
            Intrinsics.checkNotNull(applicationContext);
            uVar.getClass();
            Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
            uVar.f13216a.setApplicationContext(applicationContext);
            eg.i.d((CoroutineScope) h2.f13377k.getValue(), new eg.e0("ApdSdkCoreInitializeSdkCore"), null, new l(callback, initializer, applicationContext, appKey, adTypes, null), 2, null);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o2.f14208a.b(((ApdInitializationError.Critical) it.next()).getDescription());
        }
        if (callback != null) {
            callback.onInitializationFinished(arrayList);
        }
    }

    public static final boolean isPrecacheByPlacement(int adType, @NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        boolean z10 = h2.f13367a;
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        com.appodeal.ads.segments.o oVarA = com.appodeal.ads.segments.q.a(placementName);
        List<l0> list = (List) h2.f13375i.getValue();
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        for (l0 l0Var : list) {
            l0 l0VarA = f6.a(l0Var, adType);
            te teVarA = l0VarA != null ? l0VarA.A() : null;
            if (teVarA != null && !teVarA.f14910v.get() && !teVarA.f14911w && teVarA.f14912x) {
                boolean z11 = h2.f13367a;
                if (oVarA.d(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext(), l0Var.f13566f, teVarA)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final void logEvent(@NotNull String eventName, @Nullable Map<String, ? extends Object> params, int service) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        h2.u(eventName, params, service);
    }

    public static final void setCustomFilter(@NotNull String name, int value) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z10 = h2.f13367a;
        h2.s(name, Float.valueOf(value));
    }

    public static final void setExtraData(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = h2.f13367a;
        h2.C(key, Integer.valueOf(value));
    }

    public static final void setFramework(@Nullable String frameworkName, @Nullable String pluginVersion, @Nullable String engineVersion) {
        h2.t(frameworkName, pluginVersion, engineVersion);
    }

    public static final boolean show(@NotNull Activity activity, int adTypes, @NotNull String placementName) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        return h2.x(activity, adTypes, placementName);
    }

    public static final void setCustomFilter(@NotNull String name, double value) {
        Intrinsics.checkNotNullParameter(name, "name");
        boolean z10 = h2.f13367a;
        h2.s(name, Float.valueOf((float) value));
    }

    public static final void setExtraData(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = h2.f13367a;
        h2.C(key, Double.valueOf(value));
    }

    public static final void setCustomFilter(@NotNull String name, @NotNull String value) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        h2.s(name, value);
    }

    public static final void setExtraData(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        boolean z10 = h2.f13367a;
        h2.C(key, Boolean.valueOf(value));
    }

    public static final void setCustomFilter(@NotNull String name, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(name, "name");
        h2.s(name, value);
    }

    public static final void setExtraData(@NotNull String key, @Nullable Object value) {
        Intrinsics.checkNotNullParameter(key, "key");
        h2.C(key, value);
    }
}
