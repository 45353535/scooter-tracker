package com.applovin.impl.communicator;

import android.content.Intent;
import android.os.Bundle;
import com.applovin.communicator.AppLovinCommunicatorMessage;
import com.applovin.communicator.AppLovinCommunicatorPublisher;
import java.lang.ref.WeakReference;
import java.util.UUID;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CommunicatorMessageImpl extends Intent {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f8526a;
    protected final Bundle data;
    protected final WeakReference<AppLovinCommunicatorPublisher> publisherRef;
    protected boolean sticky;

    public CommunicatorMessageImpl(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        super(str);
        this.f8526a = UUID.randomUUID().toString();
        this.publisherRef = new WeakReference<>(appLovinCommunicatorPublisher);
        this.data = bundle;
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher) {
        return create(bundle, str, appLovinCommunicatorPublisher, false);
    }

    public abstract Bundle getMessageData();

    public abstract String getPublisherId();

    public abstract String getTopic();

    public String getUniqueId() {
        return this.f8526a;
    }

    @Override // android.content.Intent
    public String toString() {
        return "AppLovinCommunicatorMessage{publisherId=" + getPublisherId() + ", topic=" + getTopic() + "', uniqueId='" + this.f8526a + "', data=" + this.data + ", sticky=" + this.sticky + '}';
    }

    public static AppLovinCommunicatorMessage create(Bundle bundle, String str, AppLovinCommunicatorPublisher appLovinCommunicatorPublisher, boolean z10) {
        AppLovinCommunicatorMessage appLovinCommunicatorMessage = new AppLovinCommunicatorMessage(bundle, str, appLovinCommunicatorPublisher);
        appLovinCommunicatorMessage.sticky = z10;
        return appLovinCommunicatorMessage;
    }
}
