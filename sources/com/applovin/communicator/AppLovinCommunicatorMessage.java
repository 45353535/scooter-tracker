package com.applovin.communicator;

import android.os.Bundle;
import com.applovin.impl.communicator.CommunicatorMessageImpl;

/* JADX INFO: loaded from: classes5.dex */
public class AppLovinCommunicatorMessage extends CommunicatorMessageImpl {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f8179b = 0;

    public AppLovinCommunicatorMessage(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(bundle, str, appLovinCommunicatorPublisher);
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public Bundle getMessageData() {
        return this.data;
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public String getPublisherId() {
        AppLovinCommunicatorPublisher appLovinCommunicatorPublisher = this.publisherRef.get();
        return appLovinCommunicatorPublisher != null ? appLovinCommunicatorPublisher.getCommunicatorId() : "";
    }

    @Override // com.applovin.impl.communicator.CommunicatorMessageImpl
    public String getTopic() {
        return getAction();
    }
}
