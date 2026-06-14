package com.unity3d.services.ads.topics;

import android.annotation.SuppressLint;
import android.os.OutcomeReceiver;
import androidx.privacysandbox.ads.adservices.topics.a;
import b.b;
import b.c;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.webview.WebViewEventCategory;
import com.unity3d.services.core.webview.bridge.IEventSender;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u0003j\u0002`\u00040\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000e\u001a\u00020\n2\n\u0010\r\u001a\u00060\u0003j\u0002`\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/unity3d/services/ads/topics/TopicsReceiver;", "Landroid/os/OutcomeReceiver;", "Lb/b;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "eventSender", "<init>", "(Lcom/unity3d/services/core/webview/bridge/IEventSender;)V", "result", "", "onResult", "(Lb/b;)V", "error", "onError", "(Ljava/lang/Exception;)V", "Lb/c;", "topic", "Lorg/json/JSONObject;", "formatTopic", "(Lb/c;)Lorg/json/JSONObject;", "Lcom/unity3d/services/core/webview/bridge/IEventSender;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"NewApi", "MissingPermission"})
public final class TopicsReceiver implements OutcomeReceiver {

    @NotNull
    private final IEventSender eventSender;

    public TopicsReceiver(@NotNull IEventSender eventSender) {
        Intrinsics.checkNotNullParameter(eventSender, "eventSender");
        this.eventSender = eventSender;
    }

    @NotNull
    public final JSONObject formatTopic(@NotNull c topic) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        new JSONObject();
        throw null;
    }

    public /* bridge */ /* synthetic */ void onResult(Object obj) {
        a.a(obj);
        onResult((b) null);
    }

    public void onError(@NotNull Exception error) {
        Intrinsics.checkNotNullParameter(error, "error");
        DeviceLog.debug("GetTopics exception: " + error);
        this.eventSender.sendEvent(WebViewEventCategory.TOPICS, TopicsEvents.NOT_AVAILABLE, TopicsErrors.ERROR_EXCEPTION, error.toString());
    }

    public void onResult(@NotNull b result) {
        Intrinsics.checkNotNullParameter(result, "result");
        new JSONArray();
        throw null;
    }
}
