package com.mobilefuse.videoplayer;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Point;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import androidx.annotation.RequiresApi;
import com.mobilefuse.sdk.CloseConfigResponse;
import com.mobilefuse.sdk.DebuggingKt;
import com.mobilefuse.sdk.MuteChangedListener;
import com.mobilefuse.sdk.StabilityHelper;
import com.mobilefuse.sdk.Utils;
import com.mobilefuse.sdk.ad.AdSkipOffsetResolver;
import com.mobilefuse.sdk.assetsmanager.MobileFuseAssetManager;
import com.mobilefuse.sdk.concurrency.Schedulers;
import com.mobilefuse.sdk.concurrency.SchedulersKt;
import com.mobilefuse.sdk.exception.Either;
import com.mobilefuse.sdk.exception.ErrorResult;
import com.mobilefuse.sdk.exception.ExceptionHandlingStrategy;
import com.mobilefuse.sdk.exception.SuccessResult;
import com.mobilefuse.sdk.logging.HttpRequestTracker;
import com.mobilefuse.sdk.omid.VastOmidBridge;
import com.mobilefuse.sdk.rx.Flow;
import com.mobilefuse.sdk.rx.FlowCollector;
import com.mobilefuse.sdk.rx.FlowKt;
import com.mobilefuse.sdk.utils.WebViewUtils;
import com.mobilefuse.sdk.video.AdmClickInfo;
import com.mobilefuse.sdk.video.AdmClickInfoProvider;
import com.mobilefuse.sdk.video.ClickthroughBehaviour;
import com.mobilefuse.videoplayer.VideoDownloader;
import com.mobilefuse.videoplayer.VideoPlayer;
import com.mobilefuse.videoplayer.controller.ExternalFullscreenControlBridge;
import com.mobilefuse.videoplayer.controller.FullscreenChangedListener;
import com.mobilefuse.videoplayer.controller.FullscreenController;
import com.mobilefuse.videoplayer.controller.FullscreenControllerImpl;
import com.mobilefuse.videoplayer.controller.MuteController;
import com.mobilefuse.videoplayer.controller.MuteControllerImpl;
import com.mobilefuse.videoplayer.controller.PlaybackController;
import com.mobilefuse.videoplayer.endcard.EndCardListener;
import com.mobilefuse.videoplayer.endcard.EndCardPresenter;
import com.mobilefuse.videoplayer.endcard.scheduler.BaseEndCardScheduler;
import com.mobilefuse.videoplayer.endcard.scheduler.EndCardScheduler;
import com.mobilefuse.videoplayer.media.MediaPlayerState;
import com.mobilefuse.videoplayer.media.MobileFusePlayer;
import com.mobilefuse.videoplayer.media.ViewType;
import com.mobilefuse.videoplayer.model.AdAutoplay;
import com.mobilefuse.videoplayer.model.VastBaseResource;
import com.mobilefuse.videoplayer.model.VastClickThrough;
import com.mobilefuse.videoplayer.model.VastCompanion;
import com.mobilefuse.videoplayer.model.VastDataModelExtensionsKt;
import com.mobilefuse.videoplayer.model.VastError;
import com.mobilefuse.videoplayer.model.VastIcon;
import com.mobilefuse.videoplayer.model.VastMediaFile;
import com.mobilefuse.videoplayer.model.VastTime;
import com.mobilefuse.videoplayer.model.VastTrackingEventType;
import com.mobilefuse.videoplayer.model.VideoSource;
import com.mobilefuse.videoplayer.model.utils.StringEncodingAndFormattingKt;
import com.mobilefuse.videoplayer.network.NetworkUtils;
import com.mobilefuse.videoplayer.utils.MediaUtilsKt;
import com.mobilefuse.videoplayer.view.ViewCloseTrigger;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.g.n;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import lf.m;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ü\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0006\u008f\u0002\u0090\u0002\u0091\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006B\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tB!\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fB=\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0002\u0010\u0013J\u0014\u0010¸\u0001\u001a\u00030\u0082\u00012\b\u0010¹\u0001\u001a\u00030º\u0001H\u0002J\n\u0010»\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010¼\u0001\u001a\u00030\u0082\u0001H\u0002J\t\u0010½\u0001\u001a\u00020'H\u0002J\u001a\u0010¾\u0001\u001a\u00030\u0082\u00012\b\u0010¿\u0001\u001a\u00030©\u0001H\u0000¢\u0006\u0003\bÀ\u0001J\u0014\u0010Á\u0001\u001a\u00030\u0082\u00012\b\u0010Â\u0001\u001a\u00030\u009e\u0001H\u0002J\f\u0010Ã\u0001\u001a\u0005\u0018\u00010Ä\u0001H\u0002J\u001b\u0010Å\u0001\u001a\u00030\u0082\u00012\u000f\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0003J\b\u0010Ç\u0001\u001a\u00030\u0082\u0001J\n\u0010È\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010É\u0001\u001a\u00030\u0082\u0001H\u0002J\u0015\u0010Ê\u0001\u001a\u00030\u0082\u00012\b\u0010Ë\u0001\u001a\u00030Ì\u0001H\u0096\u0001J\u0007\u0010Í\u0001\u001a\u00020\u000eJ\n\u0010Î\u0001\u001a\u0005\u0018\u00010Ï\u0001J\n\u0010Ð\u0001\u001a\u0005\u0018\u00010Ï\u0001J\u0014\u0010Ñ\u0001\u001a\u00030\u0082\u00012\b\u0010Ò\u0001\u001a\u00030Ó\u0001H\u0002J\u001b\u0010Ô\u0001\u001a\u00030\u0082\u00012\u000f\u0010Æ\u0001\u001a\n\u0012\u0005\u0012\u00030\u0082\u00010\u0081\u0001H\u0002J\n\u0010Õ\u0001\u001a\u00020\u000eH\u0096\u0001J\u000f\u0010Ö\u0001\u001a\u00020\u000eH\u0000¢\u0006\u0003\b×\u0001J\u0007\u0010Ø\u0001\u001a\u00020\u000eJ\u001a\u0010Ù\u0001\u001a\u00030\u0082\u00012\b\u0010Ú\u0001\u001a\u00030©\u00012\u0006\u0010i\u001a\u00020jJ\b\u0010Û\u0001\u001a\u00030\u0082\u0001J\b\u0010Ü\u0001\u001a\u00030\u0082\u0001J\n\u0010Ý\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010Þ\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010ß\u0001\u001a\u00030\u0082\u0001H\u0014J\n\u0010à\u0001\u001a\u00030\u0082\u0001H\u0002J7\u0010á\u0001\u001a\u00030\u0082\u00012\u0007\u0010â\u0001\u001a\u00020\u000e2\u0007\u0010ã\u0001\u001a\u00020\u000b2\u0007\u0010ä\u0001\u001a\u00020\u000b2\u0007\u0010å\u0001\u001a\u00020\u000b2\u0007\u0010æ\u0001\u001a\u00020\u000bH\u0014J\u0015\u0010ç\u0001\u001a\u00030\u0082\u00012\t\u0010è\u0001\u001a\u0004\u0018\u00010=H\u0002J\n\u0010é\u0001\u001a\u00030\u0082\u0001H\u0002J!\u0010ê\u0001\u001a\u00030\u0082\u00012\u0007\u0010ë\u0001\u001a\u00020\u000e2\f\b\u0002\u0010ì\u0001\u001a\u0005\u0018\u00010í\u0001H\u0002J\u000b\u0010î\u0001\u001a\u00030\u0082\u0001H\u0096\u0001J\u000b\u0010ï\u0001\u001a\u00030\u0082\u0001H\u0096\u0001J\u0014\u0010ð\u0001\u001a\u00030\u0082\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0002J\n\u0010ó\u0001\u001a\u00030\u0082\u0001H\u0002J\u0013\u0010ô\u0001\u001a\u00030\u0082\u00012\u0007\u0010õ\u0001\u001a\u00020GH\u0002J\u001d\u0010ö\u0001\u001a\u00030\u0082\u00012\b\u0010÷\u0001\u001a\u00030ø\u00012\u0007\u0010ù\u0001\u001a\u00020\u000bH\u0014J\b\u0010ú\u0001\u001a\u00030\u0082\u0001J\u001e\u0010û\u0001\u001a\u00030\u0082\u00012\n\u0010ü\u0001\u001a\u0005\u0018\u00010£\u00012\b\u0010\u008c\u0001\u001a\u00030\u008d\u0001J\n\u0010ý\u0001\u001a\u00030\u0082\u0001H\u0002J\n\u0010þ\u0001\u001a\u00030\u0082\u0001H\u0002J\b\u0010ÿ\u0001\u001a\u00030\u0082\u0001J\u0014\u0010\u0080\u0002\u001a\u00030\u0082\u00012\b\u0010\u0081\u0002\u001a\u00030\u0082\u0002H\u0002J\u0013\u0010\u0083\u0002\u001a\u00030\u0082\u00012\u0006\u0010X\u001a\u00020\u000eH\u0096\u0001J\u000b\u0010\u0084\u0002\u001a\u00030\u0082\u0001H\u0096\u0001J\u000b\u0010\u0085\u0002\u001a\u00030\u0082\u0001H\u0096\u0001J\u0014\u0010\u0086\u0002\u001a\u00030\u0082\u00012\u0007\u0010\u0087\u0002\u001a\u00020\u000eH\u0096\u0001J\u0014\u0010\u0088\u0002\u001a\u00030\u0082\u00012\n\u0010\u0089\u0002\u001a\u0005\u0018\u00010\u008a\u0002J\u0014\u0010\u008b\u0002\u001a\u00030\u0082\u00012\b\u0010ñ\u0001\u001a\u00030ò\u0001H\u0002J\n\u0010\u008c\u0002\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u008d\u0002\u001a\u00030\u0082\u0001H\u0002J\n\u0010\u008e\u0002\u001a\u00030\u0082\u0001H\u0002R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020-X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001c\u00102\u001a\u0004\u0018\u000103X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0014\u00108\u001a\u000209X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0010\u0010<\u001a\u0004\u0018\u00010=X\u0082\u000e¢\u0006\u0002\n\u0000R\u0013\u0010>\u001a\u0004\u0018\u00010?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0011\u0010B\u001a\u00020C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0010\u0010F\u001a\u0004\u0018\u00010GX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010I\u001a\u0004\u0018\u00010H2\b\u0010\u0014\u001a\u0004\u0018\u00010H@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0018\u0010R\u001a\u00020\u000eX\u0096\u000f¢\u0006\f\u001a\u0004\bS\u0010#\"\u0004\bT\u0010%R\u001a\u0010U\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010)\"\u0004\bW\u0010+R\u0012\u0010X\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\bY\u0010#R\u0012\u0010Z\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b[\u0010#R\u001a\u0010\\\u001a\u0004\u0018\u00010]X\u0096\u000f¢\u0006\f\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010d\u001a\u00020\u000e8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\be\u0010#R\u0012\u0010f\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\bf\u0010#R\u000e\u0010g\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010i\u001a\u0004\u0018\u00010jX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010k\u001a\u00020\u0001X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\bl\u0010mR\u001a\u0010n\u001a\u00020oX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010u\u001a\u00020\u000b2\u0006\u0010t\u001a\u00020\u000b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bv\u0010w\"\u0004\bx\u0010yR\u001a\u0010z\u001a\u0004\u0018\u00010{X\u0096\u000f¢\u0006\f\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R)\u0010\u0080\u0001\u001a\f\u0012\u0005\u0012\u00030\u0082\u0001\u0018\u00010\u0081\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R\u000f\u0010\u0087\u0001\u001a\u00020CX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0088\u0001\u001a\u00030\u0089\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R \u0010\u008a\u0001\u001a\u00020C2\u0006\u0010\u0014\u001a\u00020C@BX\u0086\u000e¢\u0006\t\n\u0000\u001a\u0005\b\u008b\u0001\u0010ER\"\u0010\u008c\u0001\u001a\u0005\u0018\u00010\u008d\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001\"\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0018\u0010\u0092\u0001\u001a\u00030\u0093\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R\u0015\u0010\u0096\u0001\u001a\u00030\u0097\u0001¢\u0006\n\n\u0000\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0018\u0010\u009a\u0001\u001a\u00030\u009b\u0001X\u0080\u0004¢\u0006\n\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001R#\u0010\u009f\u0001\u001a\u00030\u009e\u00012\u0007\u0010\u0014\u001a\u00030\u009e\u0001@BX\u0086\u000e¢\u0006\n\n\u0000\u001a\u0006\b \u0001\u0010¡\u0001R\"\u0010¢\u0001\u001a\u0005\u0018\u00010£\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R\"\u0010¨\u0001\u001a\u0005\u0018\u00010©\u0001X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\bª\u0001\u0010«\u0001\"\u0006\b¬\u0001\u0010\u00ad\u0001R\u000f\u0010®\u0001\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001d\u0010¯\u0001\u001a\u00020\u000eX\u0086\u000e¢\u0006\u0010\n\u0000\u001a\u0005\b°\u0001\u0010#\"\u0005\b±\u0001\u0010%R\"\u0010²\u0001\u001a\u0005\u0018\u00010³\u0001X\u0080\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001¨\u0006\u0092\u0002"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer;", "Landroid/widget/FrameLayout;", "Lcom/mobilefuse/videoplayer/controller/FullscreenController;", "Lcom/mobilefuse/videoplayer/controller/MuteController;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "primary", "", "fullscreenController", "Lcom/mobilefuse/videoplayer/controller/FullscreenControllerImpl;", "muteController", "Lcom/mobilefuse/videoplayer/controller/MuteControllerImpl;", "(Landroid/content/Context;Landroid/util/AttributeSet;IZLcom/mobilefuse/videoplayer/controller/FullscreenControllerImpl;Lcom/mobilefuse/videoplayer/controller/MuteControllerImpl;)V", "<set-?>", "Lcom/mobilefuse/videoplayer/model/AdAutoplay;", "adAutoplay", "getAdAutoplay", "()Lcom/mobilefuse/videoplayer/model/AdAutoplay;", "setAdAutoplay$mobilefuse_video_player_release", "(Lcom/mobilefuse/videoplayer/model/AdAutoplay;)V", "admClickInfoProvider", "Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "getAdmClickInfoProvider", "()Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;", "setAdmClickInfoProvider", "(Lcom/mobilefuse/sdk/video/AdmClickInfoProvider;)V", "allowClickthroughWithoutTap", "getAllowClickthroughWithoutTap", "()Z", "setAllowClickthroughWithoutTap", "(Z)V", "blockSkipSeconds", "", "getBlockSkipSeconds", "()F", "setBlockSkipSeconds", "(F)V", "clickthroughBehaviour", "Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "getClickthroughBehaviour", "()Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;", "setClickthroughBehaviour", "(Lcom/mobilefuse/sdk/video/ClickthroughBehaviour;)V", "closeConfigResponse", "Lcom/mobilefuse/sdk/CloseConfigResponse;", "getCloseConfigResponse", "()Lcom/mobilefuse/sdk/CloseConfigResponse;", "setCloseConfigResponse", "(Lcom/mobilefuse/sdk/CloseConfigResponse;)V", "controller", "Lcom/mobilefuse/videoplayer/VideoPlayerController;", "getController$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/VideoPlayerController;", "currentMediaFile", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "currentMediaFileSizeDp", "Landroid/graphics/Point;", "getCurrentMediaFileSizeDp", "()Landroid/graphics/Point;", "currentPlaybackPositionMillis", "", "getCurrentPlaybackPositionMillis", "()J", "currentVideoSource", "Lcom/mobilefuse/videoplayer/model/VideoSource;", "Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "endCardPresenter", "getEndCardPresenter$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/endcard/EndCardPresenter;", "endCardScheduler", "Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "getEndCardScheduler", "()Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;", "setEndCardScheduler", "(Lcom/mobilefuse/videoplayer/endcard/scheduler/EndCardScheduler;)V", "enterFullscreenOnVideoTap", "getEnterFullscreenOnVideoTap", "setEnterFullscreenOnVideoTap", "forceSkipSeconds", "getForceSkipSeconds", "setForceSkipSeconds", "fullscreen", "getFullscreen", "fullscreenAllowed", "getFullscreenAllowed", "fullscreenChangedListener", "Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "getFullscreenChangedListener", "()Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;", "setFullscreenChangedListener", "(Lcom/mobilefuse/videoplayer/controller/FullscreenChangedListener;)V", "impressionReported", "initialized", "isDestroyed", "isDestroyed$mobilefuse_video_player_release", "isMuteAllowed", "layoutHeight", "layoutWidth", "loadListener", "Lcom/mobilefuse/videoplayer/VideoPlayer$LoadListener;", "mainContainer", "getMainContainer$mobilefuse_video_player_release", "()Landroid/widget/FrameLayout;", "mainContainerParams", "Landroid/view/ViewGroup$LayoutParams;", "getMainContainerParams$mobilefuse_video_player_release", "()Landroid/view/ViewGroup$LayoutParams;", "setMainContainerParams$mobilefuse_video_player_release", "(Landroid/view/ViewGroup$LayoutParams;)V", "value", "maxEndCardsToShow", "getMaxEndCardsToShow", "()I", "setMaxEndCardsToShow", "(I)V", "muteChangedListener", "Lcom/mobilefuse/sdk/MuteChangedListener;", "getMuteChangedListener", "()Lcom/mobilefuse/sdk/MuteChangedListener;", "setMuteChangedListener", "(Lcom/mobilefuse/sdk/MuteChangedListener;)V", "onVideoSkipButtonVisible", "Lkotlin/Function0;", "", "getOnVideoSkipButtonVisible", "()Lkotlin/jvm/functions/Function0;", "setOnVideoSkipButtonVisible", "(Lkotlin/jvm/functions/Function0;)V", "pausedVideoPosition", "playbackController", "Lcom/mobilefuse/videoplayer/controller/PlaybackController;", "playbackDurationMillis", "getPlaybackDurationMillis", "playbackListener", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "getPlaybackListener$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "setPlaybackListener$mobilefuse_video_player_release", "(Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;)V", "player", "Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "getPlayer$mobilefuse_video_player_release", "()Lcom/mobilefuse/videoplayer/media/MobileFusePlayer;", "playerCapabilities", "Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "getPlayerCapabilities", "()Lcom/mobilefuse/videoplayer/VideoPlayerCapabilities;", "playerHandler", "Landroid/os/Handler;", "getPlayerHandler$mobilefuse_video_player_release", "()Landroid/os/Handler;", "Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "playerState", "getPlayerState", "()Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "renderingActivity", "Landroid/app/Activity;", "getRenderingActivity$mobilefuse_video_player_release", "()Landroid/app/Activity;", "setRenderingActivity$mobilefuse_video_player_release", "(Landroid/app/Activity;)V", "uiAdm", "", "getUiAdm", "()Ljava/lang/String;", "setUiAdm", "(Ljava/lang/String;)V", "videoStarted", "videoStreamEnabled", "getVideoStreamEnabled", "setVideoStreamEnabled", "webView", "Landroid/webkit/WebView;", "getWebView$mobilefuse_video_player_release", "()Landroid/webkit/WebView;", "setWebView$mobilefuse_video_player_release", "(Landroid/webkit/WebView;)V", "addIcon", "icon", "Lcom/mobilefuse/videoplayer/model/VastIcon;", "addIcons", "addPlayerInstance", "calculateSkipOffset", "callJsBridgeCmd", "js", "callJsBridgeCmd$mobilefuse_video_player_release", "changePlayerState", "newPlayerState", "createAdmClickInfo", "Lcom/mobilefuse/sdk/video/AdmClickInfo;", "createWebView", "initializationListener", "destroy", "destroyEndCard", "destroyVideoPlayer", "enableExternalFullscreenControl", "bridge", "Lcom/mobilefuse/videoplayer/controller/ExternalFullscreenControlBridge;", "fillsEntireScreen", "getSizeInDp", "", "getSizeInPixels", "handleVastBridgeCall", "callUri", "Landroid/net/Uri;", "initializePlayer", "isMuted", "isPlayerVisible", "isPlayerVisible$mobilefuse_video_player_release", "isPlaying", "loadVast", "xml", "onActivityPause", "onActivityResume", "onAdCompleted", "onAttachedToWindow", "onDetachedFromWindow", "onEndCardError", "onLayout", "changed", "left", "top", "right", "bottom", "onMediaFileSelected", "mediaFile", "onPrepared", "onVastDataLoaded", "success", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "onVideoBecameInvisible", "onVideoBecameVisible", "onVideoCompleted", "closeTrigger", "Lcom/mobilefuse/videoplayer/view/ViewCloseTrigger;", "onVideoError", "onVideoFileCached", "videoSource", "onVisibilityChanged", "changedView", "Landroid/view/View;", "visibility", "pause", "play", "activity", "removePlayerUi", "reportAdImpression", "resume", "sendTrackingEvent", "eventType", "Lcom/mobilefuse/videoplayer/model/VastTrackingEventType;", "setFullscreen", "setFullscreenAllowed", "setMuteAllowed", "setMuted", "muted", "setOmidBridge", "omidBridge", "Lcom/mobilefuse/sdk/omid/VastOmidBridge;", "showEndCard", "skipVideo", "startVideoTimer", "stopVideoTimer", "LoadListener", "PlaybackListener", "PlayerState", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
public final class VideoPlayer extends FrameLayout implements FullscreenController, MuteController {

    @NotNull
    private AdAutoplay adAutoplay;

    @Nullable
    private AdmClickInfoProvider admClickInfoProvider;
    private boolean allowClickthroughWithoutTap;
    private float blockSkipSeconds;

    @NotNull
    private ClickthroughBehaviour clickthroughBehaviour;

    @Nullable
    private CloseConfigResponse closeConfigResponse;

    @NotNull
    private final VideoPlayerController controller;
    private VastMediaFile currentMediaFile;
    private VideoSource currentVideoSource;

    @Nullable
    private EndCardPresenter endCardPresenter;

    @NotNull
    private EndCardScheduler endCardScheduler;
    private float forceSkipSeconds;
    private final FullscreenControllerImpl fullscreenController;
    private boolean impressionReported;
    private boolean initialized;
    private int layoutHeight;
    private int layoutWidth;
    private LoadListener loadListener;

    @NotNull
    private final FrameLayout mainContainer;

    @NotNull
    private ViewGroup.LayoutParams mainContainerParams;
    private int maxEndCardsToShow;
    private final MuteControllerImpl muteController;

    @Nullable
    private Function0<Unit> onVideoSkipButtonVisible;
    private long pausedVideoPosition;
    private final PlaybackController playbackController;
    private long playbackDurationMillis;

    @Nullable
    private PlaybackListener playbackListener;

    @NotNull
    private final MobileFusePlayer player;

    @NotNull
    private final VideoPlayerCapabilities playerCapabilities;

    @NotNull
    private final Handler playerHandler;

    @NotNull
    private PlayerState playerState;

    @Nullable
    private Activity renderingActivity;

    @Nullable
    private String uiAdm;
    private boolean videoStarted;
    private boolean videoStreamEnabled;

    @Nullable
    private WebView webView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$LoadListener;", "", "onError", "", "error", "Lcom/mobilefuse/videoplayer/model/VastError;", "onVideoLoaded", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public interface LoadListener {
        void onError(@Nullable VastError error);

        void onVideoLoaded();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\u0004H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\f\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\b\u0010\u000f\u001a\u00020\u0004H\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0016¨\u0006\u0013"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$PlaybackListener;", "", "()V", "onAdCompleted", "", "onAdImpression", "onClicked", "url", "", "onEndCardError", "onVideoCompleted", "onVideoError", "onVideoFirstQuartile", "onVideoMidpoint", "onVideoPaused", "onVideoPlaying", "onVideoSkipped", "onVideoStarted", "onVideoThirdQuartile", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public static class PlaybackListener {
        public void onAdCompleted() {
        }

        public void onAdImpression() {
        }

        public void onClicked(@NotNull String url) {
            Intrinsics.checkNotNullParameter(url, "url");
        }

        public void onEndCardError() {
        }

        public void onVideoCompleted() {
        }

        public void onVideoError() {
        }

        public void onVideoFirstQuartile() {
        }

        public void onVideoMidpoint() {
        }

        public void onVideoPaused() {
        }

        public void onVideoPlaying() {
        }

        public void onVideoSkipped() {
        }

        public void onVideoStarted() {
        }

        public void onVideoThirdQuartile() {
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/mobilefuse/videoplayer/VideoPlayer$PlayerState;", "", "(Ljava/lang/String;I)V", "IDLE", "VIDEO_LOADING", "VIDEO_CACHED", "INITIALIZING", "PLAYING", "PAUSED", "END_CARD", "ERROR", "DESTROYED", "mobilefuse-video-player_release"}, k = 1, mv = {1, 4, 3})
    public enum PlayerState {
        IDLE,
        VIDEO_LOADING,
        VIDEO_CACHED,
        INITIALIZING,
        PLAYING,
        PAUSED,
        END_CARD,
        ERROR,
        DESTROYED
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 3})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[MediaPlayerState.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[MediaPlayerState.PLAYING.ordinal()] = 1;
            iArr[MediaPlayerState.PAUSED.ordinal()] = 2;
            iArr[MediaPlayerState.ERROR.ordinal()] = 3;
            int[] iArr2 = new int[PlayerState.values().length];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[PlayerState.ERROR.ordinal()] = 1;
            iArr2[PlayerState.PLAYING.ordinal()] = 2;
            iArr2[PlayerState.PAUSED.ordinal()] = 3;
        }
    }

    /* JADX INFO: renamed from: com.mobilefuse.videoplayer.VideoPlayer$onVastDataLoaded$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "p1", "Lcom/mobilefuse/videoplayer/model/VastMediaFile;", "invoke"}, k = 3, mv = {1, 4, 3})
    static final /* synthetic */ class C47072 extends y implements Function1<VastMediaFile, Unit> {
        C47072(VideoPlayer videoPlayer) {
            super(1, videoPlayer, VideoPlayer.class, "onMediaFileSelected", "onMediaFileSelected(Lcom/mobilefuse/videoplayer/model/VastMediaFile;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(VastMediaFile vastMediaFile) {
            invoke2(vastMediaFile);
            return Unit.f93236a;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable VastMediaFile vastMediaFile) {
            ((VideoPlayer) this.receiver).onMediaFileSelected(vastMediaFile);
        }
    }

    /* synthetic */ VideoPlayer(Context context, AttributeSet attributeSet, int i10, boolean z10, FullscreenControllerImpl fullscreenControllerImpl, MuteControllerImpl muteControllerImpl, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, attributeSet, i10, z10, (i11 & 16) != 0 ? new FullscreenControllerImpl() : fullscreenControllerImpl, (i11 & 32) != 0 ? new MuteControllerImpl() : muteControllerImpl);
    }

    private final void addIcon(VastIcon icon) {
        try {
            VastBaseResource resource = icon.getResource();
            if (resource != null && resource.getContent() != null) {
                String str = "IconResourceType." + icon.getResource().getResourceType().name();
                JSONObject jSONObject = new JSONObject();
                Integer width = icon.getWidth();
                if (width != null) {
                    jSONObject.put("width", width.intValue());
                }
                Integer height = icon.getHeight();
                if (height != null) {
                    jSONObject.put("height", height.intValue());
                }
                if (icon.getOffset() != null) {
                    jSONObject.put("offset", r2.getValueInFloatSeconds());
                }
                if (icon.getDuration() != null) {
                    jSONObject.put("duration", r2.getValueInFloatSeconds());
                }
                jSONObject.put("clickPayload", icon.getUid());
                jSONObject.put("viewPayload", icon.getUid());
                jSONObject.put(n.f66163g, icon.getResource().getContent());
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.addIcon(" + str + ", " + jSONObject + ");");
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void addIcons() {
        Iterator<VastIcon> it = this.controller.getIcons().iterator();
        while (it.hasNext()) {
            addIcon(it.next());
        }
    }

    private final void addPlayerInstance() {
        try {
            this.mainContainer.setBackgroundColor((int) 4278190080L);
            addView(this.mainContainer, this.mainContainerParams);
            this.mainContainer.addView(this.player, new ViewGroup.LayoutParams(-1, -1));
            this.player.setPlayerStateChangeListener(new Function1<MediaPlayerState, Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.addPlayerInstance.1
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(MediaPlayerState mediaPlayerState) {
                    invoke2(mediaPlayerState);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull MediaPlayerState state) {
                    Intrinsics.checkNotNullParameter(state, "state");
                    try {
                        int i10 = WhenMappings.$EnumSwitchMapping$0[state.ordinal()];
                        PlayerState playerState = i10 != 1 ? i10 != 2 ? i10 != 3 ? null : PlayerState.ERROR : PlayerState.PAUSED : PlayerState.PLAYING;
                        if (playerState != null) {
                            VideoPlayer.this.changePlayerState(playerState);
                        }
                    } catch (Throwable th2) {
                        StabilityHelper.logException(VideoPlayer.this, th2);
                    }
                }
            });
            this.player.setPlaybackCompletionListener(new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.addPlayerInstance.2
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
                    try {
                        VideoPlayer.this.onVideoCompleted(ViewCloseTrigger.AUTO_CLOSE);
                    } catch (Throwable th2) {
                        StabilityHelper.logException(VideoPlayer.this, th2);
                    }
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final float calculateSkipOffset() {
        VastTime adSkipOffset = this.controller.getAdSkipOffset();
        return AdSkipOffsetResolver.resolveAdSkipOffset(adSkipOffset != null ? Float.valueOf(adSkipOffset.getValueInFloatSeconds()) : null, this.forceSkipSeconds, this.blockSkipSeconds);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changePlayerState(PlayerState newPlayerState) {
        if (isDestroyed$mobilefuse_video_player_release() || this.playerState == newPlayerState) {
            return;
        }
        this.playerState = newPlayerState;
        DebuggingKt.logDebug$default(this, "changePlayerState [newState: " + newPlayerState + ']', null, 2, null);
        try {
            int i10 = WhenMappings.$EnumSwitchMapping$1[this.playerState.ordinal()];
            if (i10 == 1) {
                this.controller.sendErrorEvent(VastError.GENERAL_PLAYBACK_FAILURE);
                onVideoError();
                return;
            }
            if (i10 != 2) {
                if (i10 != 3) {
                    return;
                }
                PlaybackListener playbackListener = this.playbackListener;
                if (playbackListener != null) {
                    playbackListener.onVideoPaused();
                }
                this.controller.sendTrackingEvent(VastTrackingEventType.pause);
                return;
            }
            if (this.videoStarted) {
                this.controller.sendTrackingEvent(VastTrackingEventType.resume);
            } else {
                this.videoStarted = true;
                PlaybackListener playbackListener2 = this.playbackListener;
                if (playbackListener2 != null) {
                    playbackListener2.onVideoStarted();
                }
                this.controller.sendTrackingEvent(VastTrackingEventType.start);
                reportAdImpression();
            }
            PlaybackListener playbackListener3 = this.playbackListener;
            if (playbackListener3 != null) {
                playbackListener3.onVideoPlaying();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AdmClickInfo createAdmClickInfo() {
        return this.controller.getAdmClickInfo();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void createWebView(final Function0<Unit> initializationListener) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        final WebView webView = new WebView(getContext());
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "settings");
        settings.setJavaScriptEnabled(true);
        WebSettings settings2 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "settings");
        settings2.setAllowContentAccess(true);
        WebSettings settings3 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings3, "settings");
        settings3.setAllowFileAccess(true);
        WebSettings settings4 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings4, "settings");
        settings4.setAllowFileAccessFromFileURLs(true);
        WebSettings settings5 = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings5, "settings");
        settings5.setAllowUniversalAccessFromFileURLs(true);
        webView.setBackgroundColor(Color.argb(0, 255, 255, 255));
        webView.setLayerType(2, null);
        String str = this.uiAdm;
        if (str != null) {
            webView.loadDataWithBaseURL("file:///android_asset/mobilefuse/", str, "text/html", "UTF-8", null);
        } else {
            MobileFuseAssetManager mobileFuseAssetManager = MobileFuseAssetManager.INSTANCE;
            Context context = webView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            final Flow<String> specificAssetContentFlow = mobileFuseAssetManager.getSpecificAssetContentFlow("vast_controls.html", context);
            final Schedulers schedulers = Schedulers.MAIN;
            FlowKt.flow(new Function1<FlowCollector<? super String>, Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$runOn$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FlowCollector<? super String> flowCollector) {
                    invoke2(flowCollector);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final FlowCollector<? super String> flow) {
                    Intrinsics.checkNotNullParameter(flow, "$this$flow");
                    specificAssetContentFlow.collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$runOn$1.1
                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public final void emit(@NotNull final Either<? extends Throwable, ? extends T> value) {
                            Intrinsics.checkNotNullParameter(value, "value");
                            final FlowCollector flowCollector = flow;
                            SchedulersKt.runOnScheduler(schedulers, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$.inlined.runOn.1.1.1
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
                                    flowCollector.emit(value);
                                }
                            });
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitError(@NotNull Throwable error) {
                            Intrinsics.checkNotNullParameter(error, "error");
                            FlowCollector.DefaultImpls.emitError(this, error);
                        }

                        @Override // com.mobilefuse.sdk.rx.FlowCollector
                        public void emitSuccess(T t10) {
                            FlowCollector.DefaultImpls.emitSuccess(this, t10);
                        }
                    });
                }
            }).collect(new FlowCollector() { // from class: com.mobilefuse.videoplayer.VideoPlayer$$special$$inlined$collectResult$1
                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public final void emit(@NotNull Either<? extends Throwable, ? extends T> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    if (result instanceof SuccessResult) {
                        String str2 = (String) ((SuccessResult) result).getValue();
                        if (str2 != null) {
                            webView.loadDataWithBaseURL("https://sdk-webview.mobilefuse.com/vast/", str2, "text/html", "UTF-8", null);
                        } else {
                            DebuggingKt.logError$default(webView, "Can't render VideoPlayer, getSpecificAssetContentFlow returned null", null, 2, null);
                        }
                    }
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitError(@NotNull Throwable error) {
                    Intrinsics.checkNotNullParameter(error, "error");
                    FlowCollector.DefaultImpls.emitError(this, error);
                }

                @Override // com.mobilefuse.sdk.rx.FlowCollector
                public void emitSuccess(T t10) {
                    FlowCollector.DefaultImpls.emitSuccess(this, t10);
                }
            });
        }
        webView.setWebViewClient(new WebViewClient() { // from class: com.mobilefuse.videoplayer.VideoPlayer$createWebView$$inlined$apply$lambda$1
            @Override // android.webkit.WebViewClient
            public void onLoadResource(@Nullable WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    HttpRequestTracker.logHttpRequest(url);
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                super.onLoadResource(view, url);
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(@NotNull WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    initializationListener.invoke();
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                }
                super.onPageFinished(view, url);
            }

            @Override // android.webkit.WebViewClient
            public boolean onRenderProcessGone(@Nullable WebView view, @Nullable RenderProcessGoneDetail detail) {
                Log.w("Video Player", "WebView Render Process has gone.");
                if (view != this.getWebView()) {
                    return true;
                }
                ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    WebView webView2 = this.getWebView();
                    if (webView2 != null) {
                        ViewParent parent = webView2.getParent();
                        if (!(parent instanceof ViewGroup)) {
                            parent = null;
                        }
                        ViewGroup viewGroup = (ViewGroup) parent;
                        if (viewGroup != null) {
                            viewGroup.removeView(webView2);
                        }
                    }
                    this.getController().sendErrorEvent(VastError.GENERAL_PLAYBACK_FAILURE);
                    this.onVideoError();
                } catch (Throwable th2) {
                    int i10 = VideoPlayer$createWebView$1$3$onRenderProcessGone$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th2);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
                return true;
            }

            @Override // android.webkit.WebViewClient
            @RequiresApi(21)
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable WebResourceRequest request) {
                if (request == null) {
                    return null;
                }
                try {
                    return WebViewUtils.shouldInterceptRequest(webView.getContext(), request.getUrl());
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return super.shouldInterceptRequest(view, request);
                }
            }

            @Override // android.webkit.WebViewClient
            public boolean shouldOverrideUrlLoading(@NotNull WebView view, @NotNull String url) {
                Intrinsics.checkNotNullParameter(view, "view");
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    Uri parsed = Uri.parse(url);
                    Intrinsics.checkNotNullExpressionValue(parsed, "parsed");
                    if (!Intrinsics.areEqual(parsed.getScheme(), "vast")) {
                        return super.shouldOverrideUrlLoading(view, url);
                    }
                    this.handleVastBridgeCall(parsed);
                    return true;
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return true;
                }
            }

            @Override // android.webkit.WebViewClient
            @Nullable
            public WebResourceResponse shouldInterceptRequest(@Nullable WebView view, @Nullable String url) {
                try {
                    return WebViewUtils.shouldInterceptRequest(webView.getContext(), Uri.parse(url));
                } catch (Throwable th2) {
                    StabilityHelper.logException(this, th2);
                    return super.shouldInterceptRequest(view, url);
                }
            }
        });
        Unit unit = Unit.f93236a;
        this.webView = webView;
        this.mainContainer.addView(webView, 1);
    }

    private final void destroyEndCard() {
        try {
            EndCardPresenter endCardPresenter = this.endCardPresenter;
            if (endCardPresenter != null) {
                endCardPresenter.destroy();
            }
            this.endCardPresenter = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void destroyVideoPlayer() {
        final VideoSource videoSource;
        try {
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider != null) {
                admClickInfoProvider.destroyProducer(null);
            }
            this.admClickInfoProvider = null;
            setMuteChangedListener(null);
            removePlayerUi();
            this.player.destroy();
            ViewParent parent = this.player.getParent();
            if (parent != null) {
                ((ViewGroup) parent).removeView(this.player);
            }
            VideoSource videoSource2 = this.currentVideoSource;
            if (videoSource2 != null && !videoSource2.getVideoStreamEnabled() && (videoSource = this.currentVideoSource) != null) {
                SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$destroyVideoPlayer$$inlined$let$lambda$1
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
                        VideoCache videoCache = VideoCache.INSTANCE;
                        Context context = this.getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "context");
                        videoCache.deleteCachedFile(context, videoSource.getLocalFileCacheKey());
                    }
                }, 1, null);
            }
            this.currentVideoSource = null;
            this.currentMediaFile = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void handleVastBridgeCall(android.net.Uri r7) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mobilefuse.videoplayer.VideoPlayer.handleVastBridgeCall(android.net.Uri):void");
    }

    private final void initializePlayer(Function0<Unit> initializationListener) {
        try {
            if (this.initialized) {
                return;
            }
            this.initialized = true;
            createWebView(initializationListener);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAdCompleted() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.fullscreenController.executeFullscreenExit$mobilefuse_video_player_release();
            PlaybackListener playbackListener = this.playbackListener;
            if (playbackListener != null) {
                playbackListener.onAdCompleted();
            }
        } catch (Throwable th2) {
            int i10 = VideoPlayer$onAdCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEndCardError() {
        DebuggingKt.logDebug$default(this, "onEndCardError", null, 2, null);
        PlaybackListener playbackListener = this.playbackListener;
        if (playbackListener != null) {
            playbackListener.onEndCardError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaFileSelected(VastMediaFile mediaFile) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (mediaFile == null) {
                LoadListener loadListener = this.loadListener;
                if (loadListener != null) {
                    loadListener.onError(VastError.MEDIAFILE_NOT_FOUND);
                    return;
                }
                return;
            }
            this.currentMediaFile = mediaFile;
            String url = mediaFile.getUrl();
            if (url == null) {
                LoadListener loadListener2 = this.loadListener;
                if (loadListener2 != null) {
                    loadListener2.onError(VastError.MEDIAFILE_NOT_FOUND);
                    return;
                }
                return;
            }
            changePlayerState(PlayerState.VIDEO_LOADING);
            if (!this.videoStreamEnabled) {
                VideoDownloader videoDownloader = VideoDownloader.INSTANCE;
                Context context = getContext();
                Intrinsics.checkNotNullExpressionValue(context, "context");
                videoDownloader.cache(context, url, new VideoDownloader.Listener() { // from class: com.mobilefuse.videoplayer.VideoPlayer.onMediaFileSelected.2
                    @Override // com.mobilefuse.videoplayer.VideoDownloader.Listener
                    public void onComplete(@NotNull String requestedUrl, @NotNull VideoSource videoSource) {
                        Intrinsics.checkNotNullParameter(requestedUrl, "requestedUrl");
                        Intrinsics.checkNotNullParameter(videoSource, "videoSource");
                        try {
                            VideoPlayer.this.onVideoFileCached(videoSource);
                        } catch (Throwable th2) {
                            StabilityHelper.logException(this, th2);
                        }
                    }

                    @Override // com.mobilefuse.videoplayer.VideoDownloader.Listener
                    public void onError(@NotNull VastError error) {
                        Intrinsics.checkNotNullParameter(error, "error");
                        if (VideoPlayer.this.isDestroyed$mobilefuse_video_player_release()) {
                            return;
                        }
                        VideoPlayer.this.getController().sendErrorEvent(error);
                        LoadListener loadListener3 = VideoPlayer.this.loadListener;
                        if (loadListener3 != null) {
                            loadListener3.onError(error);
                        }
                    }
                });
                return;
            }
            this.currentVideoSource = new VideoSource(mediaFile.getUrl(), mediaFile.getUrl(), true);
            changePlayerState(PlayerState.VIDEO_CACHED);
            LoadListener loadListener3 = this.loadListener;
            if (loadListener3 != null) {
                loadListener3.onVideoLoaded();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPrepared() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            DebuggingKt.logDebug$default(this, "vast player ready", null, 2, null);
            if (getEnterFullscreenOnVideoTap()) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setEnterFullscreenOnVideoTap(true);");
            }
            VastTime adDuration = this.controller.getAdDuration();
            if (adDuration != null) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setVideoDuration(" + adDuration.getValueInSeconds() + ");");
            }
            float fCalculateSkipOffset = calculateSkipOffset();
            if (fCalculateSkipOffset != -1.0f) {
                callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setSkipTime(" + fCalculateSkipOffset + ");");
            }
            callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setCtaText(\"" + StringEncodingAndFormattingKt.encodeUriComponent("Learn More") + "\");");
            if (getIsMuteAllowed()) {
                this.muteController.enableMuteButton$mobilefuse_video_player_release();
            }
            if (getFullscreenAllowed()) {
                this.fullscreenController.enableFullscreenButton$mobilefuse_video_player_release();
            }
            addIcons();
            DebuggingKt.logDebug$default(this, "vast player playing", null, 2, null);
            this.playbackDurationMillis = this.player.getDuration();
            this.player.play();
            startVideoTimer();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVastDataLoaded(boolean success, VastError error) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            if (!success) {
                DebuggingKt.logError$default(this, "VAST xml tag can't be loaded or parsed", null, 2, null);
                LoadListener loadListener = this.loadListener;
                if (loadListener != null) {
                    loadListener.onError(error);
                    return;
                }
                return;
            }
            NetworkUtils networkUtils = NetworkUtils.INSTANCE;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            if (networkUtils.getNetworkType(context) == null) {
                DebuggingKt.logError$default(this, "Can't proceed with media file loading due to no active network connection.", null, 2, null);
                LoadListener loadListener2 = this.loadListener;
                if (loadListener2 != null) {
                    loadListener2.onError(VastError.MEDIAFILE_TIMEOUT);
                    return;
                }
                return;
            }
            VideoCache videoCache = VideoCache.INSTANCE;
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "context");
            videoCache.initialize(context2);
            Context context3 = getContext();
            Intrinsics.checkNotNullExpressionValue(context3, "context");
            this.controller.selectBestMediaFile(MediaUtilsKt.getScreenSizeAsPixels(context3), new C47072(this));
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    static /* synthetic */ void onVastDataLoaded$default(VideoPlayer videoPlayer, boolean z10, VastError vastError, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vastError = null;
        }
        videoPlayer.onVastDataLoaded(z10, vastError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoCompleted(ViewCloseTrigger closeTrigger) {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            DebuggingKt.logDebug$default(this, "onVideoCompleted", null, 2, null);
            AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
            if (admClickInfoProvider != null) {
                admClickInfoProvider.destroyProducer(this.controller.getAdmClickInfo());
            }
            this.admClickInfoProvider = null;
            stopVideoTimer();
            if (closeTrigger == ViewCloseTrigger.AUTO_CLOSE) {
                sendTrackingEvent(VastTrackingEventType.complete);
                PlaybackListener playbackListener = this.playbackListener;
                if (playbackListener != null) {
                    playbackListener.onVideoCompleted();
                }
            }
            showEndCard(closeTrigger);
        } catch (Throwable th2) {
            int i10 = VideoPlayer$onVideoCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoError() {
        DebuggingKt.logDebug$default(this, "onVideoError", null, 2, null);
        PlaybackListener playbackListener = this.playbackListener;
        if (playbackListener != null) {
            playbackListener.onVideoError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onVideoFileCached(VideoSource videoSource) {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.currentVideoSource = videoSource;
            changePlayerState(PlayerState.VIDEO_CACHED);
            LoadListener loadListener = this.loadListener;
            if (loadListener != null) {
                loadListener.onVideoLoaded();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void removePlayerUi() {
        try {
            stopVideoTimer();
            WebView webView = this.webView;
            if (webView != null) {
                if (webView.getParent() != null) {
                    ViewParent parent = webView.getParent();
                    if (parent == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
                    }
                    ((ViewGroup) parent).removeView(this.webView);
                }
                webView.stopLoading();
                webView.destroy();
                this.webView = null;
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void reportAdImpression() {
        if (this.impressionReported) {
            return;
        }
        this.impressionReported = true;
        this.controller.sendImpressionEvent$mobilefuse_video_player_release(new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.reportAdImpression.1
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
                PlaybackListener playbackListener = VideoPlayer.this.getPlaybackListener();
                if (playbackListener != null) {
                    playbackListener.onAdImpression();
                }
            }
        });
    }

    private final void sendTrackingEvent(VastTrackingEventType eventType) {
        this.controller.sendTrackingEvent(eventType);
    }

    private final void showEndCard(final ViewCloseTrigger closeTrigger) {
        Either errorResult;
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
        } catch (Throwable th2) {
            if (VideoPlayer$showEndCard$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            errorResult = new ErrorResult(th2);
        }
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        changePlayerState(PlayerState.END_CARD);
        destroyVideoPlayer();
        DebuggingKt.logDebug$default(this, "Show EndCard", null, 2, null);
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        List<VastCompanion> listSelectCompanionAds = this.controller.selectCompanionAds(MediaUtilsKt.getScreenSizeAsPixels(context));
        if (listSelectCompanionAds.isEmpty()) {
            onAdCompleted();
            return;
        }
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "context");
        EndCardPresenter endCardPresenter = new EndCardPresenter(this.mainContainer, context2, this.renderingActivity, this.endCardScheduler, listSelectCompanionAds, getFullscreen(), this.allowClickthroughWithoutTap, this.closeConfigResponse, new EndCardListener() { // from class: com.mobilefuse.videoplayer.VideoPlayer$showEndCard$$inlined$gracefullyHandleException$lambda$1
            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClicked(@NotNull VastCompanion companion, @Nullable VastClickThrough clickThrough) {
                String url;
                VideoPlayer.PlaybackListener playbackListener;
                Intrinsics.checkNotNullParameter(companion, "companion");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.this$0.getController().sendCompanionAdClickTrackingEvent(companion);
                    if (clickThrough != null) {
                        Context context3 = this.this$0.getContext();
                        Intrinsics.checkNotNullExpressionValue(context3, "context");
                        VastDataModelExtensionsKt.openUrl(clickThrough, context3, this.this$0.getController().getEventTracker(), null);
                    }
                    if (clickThrough == null || (url = clickThrough.getUrl()) == null || (playbackListener = this.this$0.getPlaybackListener()) == null) {
                        return;
                    }
                    playbackListener.onClicked(url);
                } catch (Throwable th3) {
                    int i10 = VideoPlayer$showEndCard$1$endCardPresenter$1$onClicked$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th3);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onClosed(@NotNull VastCompanion companion, @NotNull ViewCloseTrigger closeTrigger2) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(closeTrigger2, "closeTrigger");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onCompleted() {
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.this$0.onAdCompleted();
                } catch (Throwable th3) {
                    int i10 = VideoPlayer$showEndCard$1$endCardPresenter$1$onCompleted$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th3);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onError(@NotNull VastError error) {
                Intrinsics.checkNotNullParameter(error, "error");
                ExceptionHandlingStrategy exceptionHandlingStrategy2 = ExceptionHandlingStrategy.LogAndIgnore;
                try {
                    this.this$0.getController().sendErrorEvent(error);
                    this.this$0.onEndCardError();
                } catch (Throwable th3) {
                    int i10 = VideoPlayer$showEndCard$1$endCardPresenter$1$onError$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy2.ordinal()];
                    if (i10 == 1) {
                        StabilityHelper.logException("[Automatically caught]", th3);
                    } else if (i10 != 2) {
                        throw new m();
                    }
                }
            }

            @Override // com.mobilefuse.videoplayer.endcard.EndCardListener
            public void onTrackingEvent(@NotNull VastCompanion companion, @NotNull VastTrackingEventType eventType) {
                Intrinsics.checkNotNullParameter(companion, "companion");
                Intrinsics.checkNotNullParameter(eventType, "eventType");
                this.this$0.getController().sendCompanionAdTrackingEvent(companion, eventType);
            }
        });
        this.endCardPresenter = endCardPresenter;
        endCardPresenter.showNextEndCard(closeTrigger, new Function1<Boolean, Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$showEndCard$$inlined$gracefullyHandleException$lambda$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                invoke(bool.booleanValue());
                return Unit.f93236a;
            }

            public final void invoke(boolean z10) {
                if (z10) {
                    return;
                }
                this.this$0.getController().sendErrorEvent(VastError.UNABLE_TO_DISPLAY_REQUIRED_COMPANION);
            }
        });
        errorResult = new SuccessResult(Unit.f93236a);
        if (errorResult instanceof ErrorResult) {
            onEndCardError();
        } else {
            if (!(errorResult instanceof SuccessResult)) {
                throw new m();
            }
            ((SuccessResult) errorResult).getValue();
        }
    }

    private final void skipVideo() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.controller.onSkipped();
            pause();
            PlaybackListener playbackListener = this.playbackListener;
            if (playbackListener != null) {
                playbackListener.onVideoSkipped();
            }
            onVideoCompleted(ViewCloseTrigger.USER);
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    private final void startVideoTimer() {
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        this.playbackController.startUpdating(new Function2<Long, Long, Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.startVideoTimer.1
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Long l10, Long l11) {
                invoke(l10.longValue(), l11.longValue());
                return Unit.f93236a;
            }

            public final void invoke(long j10, long j11) {
                VideoPlayer.this.callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setVideoDuration(" + (j11 / 1000.0f) + ");");
                VideoPlayer.this.callJsBridgeCmd$mobilefuse_video_player_release("vast.bridge.setCurrentTime(" + (((float) j10) / 1000.0f) + ");");
            }
        });
    }

    private final void stopVideoTimer() {
        this.playbackController.stopUpdating();
    }

    public final void callJsBridgeCmd$mobilefuse_video_player_release(@NotNull final String js) {
        Intrinsics.checkNotNullParameter(js, "js");
        if (isDestroyed$mobilefuse_video_player_release() || this.webView == null) {
            return;
        }
        this.playerHandler.post(new Runnable() { // from class: com.mobilefuse.videoplayer.VideoPlayer$callJsBridgeCmd$1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    WebView webView = this.this$0.getWebView();
                    if (webView != null) {
                        webView.evaluateJavascript(js, null);
                    }
                } catch (Throwable th2) {
                    StabilityHelper.logException(this.this$0, th2);
                }
            }
        });
    }

    public final void destroy() {
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            changePlayerState(PlayerState.DESTROYED);
            destroyVideoPlayer();
            destroyEndCard();
            setFullscreenChangedListener(null);
            this.controller.destroy();
            this.renderingActivity = null;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void enableExternalFullscreenControl(@NotNull ExternalFullscreenControlBridge bridge) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        this.fullscreenController.enableExternalFullscreenControl(bridge);
    }

    public final boolean fillsEntireScreen() {
        View viewFindViewById;
        if (isDestroyed$mobilefuse_video_player_release()) {
            return false;
        }
        try {
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        if (getFullscreenAllowed()) {
            return getFullscreen();
        }
        View rootView = getRootView();
        return rootView != null && (viewFindViewById = rootView.findViewById(android.R.id.content)) != null && viewFindViewById.getWidth() == this.mainContainer.getWidth() && viewFindViewById.getHeight() == this.mainContainer.getHeight();
    }

    @NotNull
    public final AdAutoplay getAdAutoplay() {
        return this.adAutoplay;
    }

    @Nullable
    public final AdmClickInfoProvider getAdmClickInfoProvider() {
        return this.admClickInfoProvider;
    }

    public final boolean getAllowClickthroughWithoutTap() {
        return this.allowClickthroughWithoutTap;
    }

    public final float getBlockSkipSeconds() {
        return this.blockSkipSeconds;
    }

    @NotNull
    public final ClickthroughBehaviour getClickthroughBehaviour() {
        return this.clickthroughBehaviour;
    }

    @Nullable
    public final CloseConfigResponse getCloseConfigResponse() {
        return this.closeConfigResponse;
    }

    @NotNull
    /* JADX INFO: renamed from: getController$mobilefuse_video_player_release, reason: from getter */
    public final VideoPlayerController getController() {
        return this.controller;
    }

    @Nullable
    public final Point getCurrentMediaFileSizeDp() {
        Integer width;
        VastMediaFile vastMediaFile = this.currentMediaFile;
        if (vastMediaFile == null || (width = vastMediaFile.getWidth()) == null) {
            return null;
        }
        int iIntValue = width.intValue();
        Integer height = vastMediaFile.getHeight();
        if (height != null) {
            return new Point(iIntValue, height.intValue());
        }
        return null;
    }

    public final long getCurrentPlaybackPositionMillis() {
        try {
            PlayerState playerState = this.playerState;
            if (playerState == PlayerState.PLAYING || playerState == PlayerState.PAUSED) {
                return this.player.getCurrentPosition();
            }
            return -1L;
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
            return -1L;
        }
    }

    @Nullable
    /* JADX INFO: renamed from: getEndCardPresenter$mobilefuse_video_player_release, reason: from getter */
    public final EndCardPresenter getEndCardPresenter() {
        return this.endCardPresenter;
    }

    @NotNull
    public final EndCardScheduler getEndCardScheduler() {
        return this.endCardScheduler;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getEnterFullscreenOnVideoTap() {
        return this.fullscreenController.getEnterFullscreenOnVideoTap();
    }

    public final float getForceSkipSeconds() {
        return this.forceSkipSeconds;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreen() {
        return this.fullscreenController.getFullscreen();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public boolean getFullscreenAllowed() {
        return this.fullscreenController.getFullscreenAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    @Nullable
    public FullscreenChangedListener getFullscreenChangedListener() {
        return this.fullscreenController.getFullscreenChangedListener();
    }

    @NotNull
    /* JADX INFO: renamed from: getMainContainer$mobilefuse_video_player_release, reason: from getter */
    public final FrameLayout getMainContainer() {
        return this.mainContainer;
    }

    @NotNull
    /* JADX INFO: renamed from: getMainContainerParams$mobilefuse_video_player_release, reason: from getter */
    public final ViewGroup.LayoutParams getMainContainerParams() {
        return this.mainContainerParams;
    }

    public final int getMaxEndCardsToShow() {
        return this.maxEndCardsToShow;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    @Nullable
    public MuteChangedListener getMuteChangedListener() {
        return this.muteController.getMuteChangedListener();
    }

    @Nullable
    public final Function0<Unit> getOnVideoSkipButtonVisible() {
        return this.onVideoSkipButtonVisible;
    }

    public final long getPlaybackDurationMillis() {
        return this.playbackDurationMillis;
    }

    @Nullable
    /* JADX INFO: renamed from: getPlaybackListener$mobilefuse_video_player_release, reason: from getter */
    public final PlaybackListener getPlaybackListener() {
        return this.playbackListener;
    }

    @NotNull
    /* JADX INFO: renamed from: getPlayer$mobilefuse_video_player_release, reason: from getter */
    public final MobileFusePlayer getPlayer() {
        return this.player;
    }

    @NotNull
    public final VideoPlayerCapabilities getPlayerCapabilities() {
        return this.playerCapabilities;
    }

    @NotNull
    /* JADX INFO: renamed from: getPlayerHandler$mobilefuse_video_player_release, reason: from getter */
    public final Handler getPlayerHandler() {
        return this.playerHandler;
    }

    @NotNull
    public final PlayerState getPlayerState() {
        return this.playerState;
    }

    @Nullable
    /* JADX INFO: renamed from: getRenderingActivity$mobilefuse_video_player_release, reason: from getter */
    public final Activity getRenderingActivity() {
        return this.renderingActivity;
    }

    @Nullable
    public final int[] getSizeInDp() {
        int[] sizeInPixels = getSizeInPixels();
        if (sizeInPixels == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "context");
        MediaUtilsKt.convertFromPixelsToDp(context, sizeInPixels);
        return sizeInPixels;
    }

    @Nullable
    public final int[] getSizeInPixels() {
        if (this.player.isDestroyed()) {
            return null;
        }
        return new int[]{this.player.getWidth(), this.player.getHeight()};
    }

    @Nullable
    public final String getUiAdm() {
        return this.uiAdm;
    }

    public final boolean getVideoStreamEnabled() {
        return this.videoStreamEnabled;
    }

    @Nullable
    /* JADX INFO: renamed from: getWebView$mobilefuse_video_player_release, reason: from getter */
    public final WebView getWebView() {
        return this.webView;
    }

    public final boolean isDestroyed$mobilefuse_video_player_release() {
        return this.playerState == PlayerState.DESTROYED;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    /* JADX INFO: renamed from: isMuteAllowed */
    public boolean getIsMuteAllowed() {
        return this.muteController.getIsMuteAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public boolean isMuted() {
        return this.muteController.isMuted();
    }

    public final boolean isPlayerVisible$mobilefuse_video_player_release() {
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            return this.mainContainer.isShown();
        } catch (Throwable th2) {
            if (VideoPlayer$isPlayerVisible$$inlined$gracefullyHandleException$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$1[exceptionHandlingStrategy.ordinal()] == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            }
            return false;
        }
    }

    public final boolean isPlaying() {
        return this.playerState == PlayerState.PLAYING;
    }

    public final void loadVast(@NotNull final String xml, @NotNull final LoadListener loadListener) {
        Intrinsics.checkNotNullParameter(xml, "xml");
        Intrinsics.checkNotNullParameter(loadListener, "loadListener");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            this.loadListener = new LoadListener() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1
                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onError(@Nullable final VastError error) {
                    SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1.2
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
                            loadListener.onError(error);
                        }
                    }, 1, null);
                }

                @Override // com.mobilefuse.videoplayer.VideoPlayer.LoadListener
                public void onVideoLoaded() {
                    SchedulersKt.safelyRunOnMainThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$1.1
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
                            loadListener.onVideoLoaded();
                        }
                    }, 1, null);
                }
            };
            SchedulersKt.safelyRunOnBgThread$default(null, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$2

                /* JADX INFO: renamed from: com.mobilefuse.videoplayer.VideoPlayer$loadVast$$inlined$handleExceptions$lambda$2$1, reason: invalid class name */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "p1", "", "p2", "Lcom/mobilefuse/videoplayer/model/VastError;", "invoke", "com/mobilefuse/videoplayer/VideoPlayer$loadVast$1$2$1"}, k = 3, mv = {1, 4, 3})
                static final /* synthetic */ class AnonymousClass1 extends y implements Function2<Boolean, VastError, Unit> {
                    AnonymousClass1(VideoPlayer videoPlayer) {
                        super(2, videoPlayer, VideoPlayer.class, "onVastDataLoaded", "onVastDataLoaded(ZLcom/mobilefuse/videoplayer/model/VastError;)V", 0);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, VastError vastError) {
                        invoke(bool.booleanValue(), vastError);
                        return Unit.f93236a;
                    }

                    public final void invoke(boolean z10, @Nullable VastError vastError) {
                        ((VideoPlayer) this.receiver).onVastDataLoaded(z10, vastError);
                    }
                }

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
                    this.this$0.getController().loadVastTag(xml, new AnonymousClass1(this.this$0));
                }
            }, 1, null);
        } catch (Throwable th2) {
            int i10 = VideoPlayer$loadVast$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void onActivityPause() {
        pause();
    }

    public final void onActivityResume() {
        resume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        try {
            resume();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        try {
            pause();
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        if (!isDestroyed$mobilefuse_video_player_release() && changed) {
            try {
                this.layoutWidth = right - left;
                this.layoutHeight = bottom - top;
            } catch (Throwable th2) {
                StabilityHelper.logException(this, th2);
            }
        }
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameInvisible() {
        this.muteController.onVideoBecameInvisible();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void onVideoBecameVisible() {
        this.muteController.onVideoBecameVisible();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(@NotNull View changedView, int visibility) {
        Window window;
        Intrinsics.checkNotNullParameter(changedView, "changedView");
        ExceptionHandlingStrategy exceptionHandlingStrategy = ExceptionHandlingStrategy.LogAndIgnore;
        try {
            if (isDestroyed$mobilefuse_video_player_release()) {
                return;
            }
            if (isPlayerVisible$mobilefuse_video_player_release()) {
                this.player.onBecameVisible();
                this.muteController.onVideoBecameVisible();
            } else {
                Activity activity = this.renderingActivity;
                if (!Intrinsics.areEqual(changedView, (activity == null || (window = activity.getWindow()) == null) ? null : window.getDecorView())) {
                    this.muteController.onVideoBecameInvisible();
                    this.player.onBecameInvisible();
                }
            }
            super.onVisibilityChanged(changedView, visibility);
        } catch (Throwable th2) {
            int i10 = VideoPlayer$onVisibilityChanged$$inlined$handleExceptions$1$wm$TryKt$WhenMappings.$EnumSwitchMapping$0[exceptionHandlingStrategy.ordinal()];
            if (i10 == 1) {
                StabilityHelper.logException("[Automatically caught]", th2);
            } else if (i10 != 2) {
                throw new m();
            }
        }
    }

    public final void pause() {
        try {
            if (this.player.getCanPause()) {
                this.player.pause();
                this.pausedVideoPosition = this.player.getCurrentPosition();
                stopVideoTimer();
            }
        } catch (Exception e10) {
            StabilityHelper.logException(this, e10);
        }
    }

    public final void play(@Nullable Activity activity, @NotNull PlaybackListener playbackListener) {
        Intrinsics.checkNotNullParameter(playbackListener, "playbackListener");
        if (isDestroyed$mobilefuse_video_player_release()) {
            return;
        }
        try {
            this.renderingActivity = activity;
            final VideoSource videoSource = this.currentVideoSource;
            if (videoSource == null) {
                return;
            }
            if (this.playerState != PlayerState.VIDEO_CACHED) {
                DebuggingKt.logError$default(this, "Can't play video because is not cached.", null, 2, null);
                return;
            }
            this.playbackListener = playbackListener;
            this.controller.initOmid$mobilefuse_video_player_release();
            this.controller.callOmidLoadedEvent$mobilefuse_video_player_release();
            this.adAutoplay = this.muteController.getMuted() ? AdAutoplay.MUTED_AUTOPLAY : AdAutoplay.UNMUTED_AUTOPLAY;
            changePlayerState(PlayerState.INITIALIZING);
            initializePlayer(new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.play.1
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
                    VideoPlayer.this.getPlayer().prepare(videoSource, ViewType.SURFACE_VIEW, new Function0<Unit>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.play.1.1
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
                            if (VideoPlayer.this.isPlayerVisible$mobilefuse_video_player_release()) {
                                VideoPlayer.this.getPlayer().onBecameVisible();
                            }
                            DebuggingKt.logDebug$default(VideoPlayer.this, "on video player prepared", null, 2, null);
                            VideoPlayer.this.onPrepared();
                        }
                    });
                }
            });
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void resume() {
        try {
            if (this.player.getCanPlay() && Utils.isAttachedToWindow(this)) {
                this.player.play();
                startVideoTimer();
            }
        } catch (Throwable th2) {
            StabilityHelper.logException(this, th2);
        }
    }

    public final void setAdAutoplay$mobilefuse_video_player_release(@NotNull AdAutoplay adAutoplay) {
        Intrinsics.checkNotNullParameter(adAutoplay, "<set-?>");
        this.adAutoplay = adAutoplay;
    }

    public final void setAdmClickInfoProvider(@Nullable AdmClickInfoProvider admClickInfoProvider) {
        this.admClickInfoProvider = admClickInfoProvider;
    }

    public final void setAllowClickthroughWithoutTap(boolean z10) {
        this.allowClickthroughWithoutTap = z10;
    }

    public final void setBlockSkipSeconds(float f10) {
        this.blockSkipSeconds = f10;
    }

    public final void setClickthroughBehaviour(@NotNull ClickthroughBehaviour clickthroughBehaviour) {
        Intrinsics.checkNotNullParameter(clickthroughBehaviour, "<set-?>");
        this.clickthroughBehaviour = clickthroughBehaviour;
    }

    public final void setCloseConfigResponse(@Nullable CloseConfigResponse closeConfigResponse) {
        this.closeConfigResponse = closeConfigResponse;
    }

    public final void setEndCardScheduler(@NotNull EndCardScheduler endCardScheduler) {
        Intrinsics.checkNotNullParameter(endCardScheduler, "<set-?>");
        this.endCardScheduler = endCardScheduler;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setEnterFullscreenOnVideoTap(boolean z10) {
        this.fullscreenController.setEnterFullscreenOnVideoTap(z10);
    }

    public final void setForceSkipSeconds(float f10) {
        this.forceSkipSeconds = f10;
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreen(boolean fullscreen) {
        this.fullscreenController.setFullscreen(fullscreen);
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenAllowed() {
        this.fullscreenController.setFullscreenAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.FullscreenController
    public void setFullscreenChangedListener(@Nullable FullscreenChangedListener fullscreenChangedListener) {
        this.fullscreenController.setFullscreenChangedListener(fullscreenChangedListener);
    }

    public final void setMainContainerParams$mobilefuse_video_player_release(@NotNull ViewGroup.LayoutParams layoutParams) {
        Intrinsics.checkNotNullParameter(layoutParams, "<set-?>");
        this.mainContainerParams = layoutParams;
    }

    public final void setMaxEndCardsToShow(int i10) {
        if (this.maxEndCardsToShow < 0) {
            return;
        }
        this.maxEndCardsToShow = i10;
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteAllowed() {
        this.muteController.setMuteAllowed();
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuteChangedListener(@Nullable MuteChangedListener muteChangedListener) {
        this.muteController.setMuteChangedListener(muteChangedListener);
    }

    @Override // com.mobilefuse.videoplayer.controller.MuteController
    public void setMuted(boolean muted) {
        this.muteController.setMuted(muted);
    }

    public final void setOmidBridge(@Nullable VastOmidBridge omidBridge) {
        this.controller.setOmidBridge(omidBridge);
    }

    public final void setOnVideoSkipButtonVisible(@Nullable Function0<Unit> function0) {
        this.onVideoSkipButtonVisible = function0;
    }

    public final void setPlaybackListener$mobilefuse_video_player_release(@Nullable PlaybackListener playbackListener) {
        this.playbackListener = playbackListener;
    }

    public final void setRenderingActivity$mobilefuse_video_player_release(@Nullable Activity activity) {
        this.renderingActivity = activity;
    }

    public final void setUiAdm(@Nullable String str) {
        this.uiAdm = str;
    }

    public final void setVideoStreamEnabled(boolean z10) {
        this.videoStreamEnabled = z10;
    }

    public final void setWebView$mobilefuse_video_player_release(@Nullable WebView webView) {
        this.webView = webView;
    }

    private VideoPlayer(Context context, AttributeSet attributeSet, int i10, boolean z10, FullscreenControllerImpl fullscreenControllerImpl, MuteControllerImpl muteControllerImpl) {
        super(context, attributeSet, i10);
        this.fullscreenController = fullscreenControllerImpl;
        this.muteController = muteControllerImpl;
        this.playerHandler = new Handler(Looper.getMainLooper());
        this.layoutWidth = -1;
        this.layoutHeight = -1;
        this.player = new MobileFusePlayer(context);
        PlaybackController playbackController = new PlaybackController();
        this.playbackController = playbackController;
        this.mainContainer = new FrameLayout(context);
        this.mainContainerParams = new ViewGroup.LayoutParams(-1, -1);
        this.playbackDurationMillis = -1L;
        this.controller = new VideoPlayerController(context, this);
        this.playerState = PlayerState.IDLE;
        this.playerCapabilities = new VideoPlayerCapabilities();
        this.adAutoplay = AdAutoplay.UNMUTED_AUTOPLAY;
        this.forceSkipSeconds = -1.0f;
        this.blockSkipSeconds = -1.0f;
        this.maxEndCardsToShow = 1;
        this.endCardScheduler = new BaseEndCardScheduler();
        this.clickthroughBehaviour = ClickthroughBehaviour.CTA_AND_VIDEO;
        this.admClickInfoProvider = new AdmClickInfoProvider();
        playbackController.initialize(this);
        muteControllerImpl.initialize(this);
        fullscreenControllerImpl.initialize(this);
        addPlayerInstance();
        AdmClickInfoProvider admClickInfoProvider = this.admClickInfoProvider;
        if (admClickInfoProvider != null) {
            admClickInfoProvider.registerProducer(new Function0<AdmClickInfo>() { // from class: com.mobilefuse.videoplayer.VideoPlayer.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                @Nullable
                public final AdmClickInfo invoke() {
                    return VideoPlayer.this.createAdmClickInfo();
                }
            });
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context) {
        this(context, null, 0, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public VideoPlayer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, true, null, null, 48, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }
}
