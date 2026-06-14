package com.inmobi.media;

import android.net.Uri;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorSubscriber;
import j$.util.Objects;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes9.dex */
public final class Vi implements AppLovinCommunicatorSubscriber {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function2 f37916a;

    public Vi(Function2 function2) {
        this.f37916a = function2;
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public final String getCommunicatorId() {
        return "AdInfoInterceptor";
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public final void onMessageReceived(AppLovinCommunicatorMessage message) {
        Intrinsics.checkNotNullParameter(message, "message");
        Uri data = message.getData();
        message.getTopic();
        Objects.toString(data);
        Function2 function2 = this.f37916a;
        Bundle messageData = message.getMessageData();
        String topic = message.getTopic();
        Intrinsics.checkNotNullExpressionValue(topic, "getTopic(...)");
        function2.invoke(messageData, topic);
    }
}
